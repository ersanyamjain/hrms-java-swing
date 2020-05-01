/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;
import java.io.File;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import static java.nio.file.StandardCopyOption.*;
import java.util.Date;
import java.sql.Timestamp;

/**
 *
 * @author Sam
 */

public class DBO {
    Connection con;
ResultSet rs;
PreparedStatement pstmt;
ArrayList alst,alst1,alst2;


public ArrayList getUname() throws SQLException
{
    
    alst=new ArrayList();
           int i=0;
           String name="where UserID=1";
           con=DBC.getConnection();
           pstmt=con.prepareStatement("Select * from Auth "+name);
           rs=pstmt.executeQuery();
           while(rs.next())
           {
               alst.add(rs.getString("Username"));
               
           }
               return alst;
}

public ArrayList getPwd() throws SQLException
{
    
    alst=new ArrayList();
           int i=0;
           String name="where UserID=1";
           con=DBC.getConnection();
           pstmt=con.prepareStatement("Select * from Auth "+name);
           rs=pstmt.executeQuery();
           while(rs.next())
           {
               alst.add(rs.getString("Password"));
               
           }
               return alst;
}

public String changePw(String pwd) throws Exception
{
    
    con=DBC.getConnection();
    
    pstmt=con.prepareStatement("Update Auth set Password='"+pwd+"' where UserID=1");
    int i1=pstmt.executeUpdate();
    if(i1==1)
    {
        return "yes";
        
    }
    else
    {
        return "no";
    }
} 
 
  
 
public String backupDB(String p) throws Exception
{
    
 Date date=new Date();
String path=p+"\\HR_DB_Backup_"+System.currentTimeMillis()+".accdb"; 
//System.nanoTime()
 //new Timestamp(date.getYear())+new Timestamp(date.getMonth())+new Timestamp(date.getDate())+new Timestamp(date.getHours())+new Timestamp(date.getMinutes())+new Timestamp(date.getSeconds())+       
    File src= new File("D:\\HRMS Files\\HRDB.accdb");
  File dest= new File(path);
  
    String pth=Files.copy(src.toPath(), dest.toPath(), REPLACE_EXISTING).toString(); 
    return pth;

   
} 

public String restoreDB(String path) throws Exception
{
            
    File src= new File(path);
  File dest= new File("D:\\HRMS Files\\HRDB.accdb");
  
    Files.copy(src.toPath(), dest.toPath(), REPLACE_EXISTING); 
    return "yes";

} 

public String editDept(String dept,String ndept) throws Exception
{
    
    con=DBC.getConnection();
       
    pstmt=con.prepareStatement("Update Department set [Dept Name]='"+ndept+"' where [Dept Name]='"+dept+"'");
    int i1=pstmt.executeUpdate();
    if(i1==1)
    {
        return "yes";
        
    }
    else
    {
        return "no";
    }
} 

public String deleteDept(String dept) throws Exception
{
    
    con=DBC.getConnection();
    String deptname=dept;
    
    pstmt=con.prepareStatement("Delete from Department where [Dept Name]='"+dept+"'");
    int i1=pstmt.executeUpdate();
    if(i1==1)
    {
        return "yes";
        
    }
    else
    {
        return "no";
    }
} 
 public ArrayList searchDept(String name) throws Exception
       {
           alst=new ArrayList();
           int i=0;
           con=DBC.getConnection();
           pstmt=con.prepareStatement("Select * from Department "+name);
           rs=pstmt.executeQuery();
           while(rs.next())
           {
               alst.add(rs.getString("Dept Name"));
               
           }
               return alst;
               
       }
public String insertDept(String dept) throws Exception
{
    
    con=DBC.getConnection();
    String deptname=dept;
    pstmt=con.prepareStatement("Insert into Department([Dept Name]) values('"+deptname+"')");
    int i1=pstmt.executeUpdate();
    if(i1==1)
    {
        return "yes";
        
    }
    else
    {
        return "no";
    }
} 

       public String insertEmp(int srno,int fcid,String left,String frdate,String name,String title,String fname,String mname,String lname,String dob,String doj,String sex,String fthrname,String mthrname,String address,String city,String state,String pstlcode,String religion,String caste,String mobile,String email,String panno,String adhcardno,String desig,String rank,String prgrm,String course,String appt,String salmode,String doctrt,String pgd,String ugd,String othqual,String spec,double tchexp,double rschexp,String payscale,String paystype,int basicsal,int gradepaydp,int dap,int dar,int hrar,int ta,int othall,int grosssal,String bank,String bbranch,String ifsccode,String bankacno,String appttype,String appltrno,String handi,String onleave,String lvtype,String olf,String olu) throws SQLException
{
    
    con=DBC.getConnection();
   
    pstmt=con.prepareStatement("Insert into Empmaster values("+srno+",'"+fcid+"','"+left+"','"+frdate+"','"+name+"','"+title+"','"+fname+"','"+mname+"','"+lname+"','"+dob+"','"+doj+"','"+sex+"','"+fthrname+"','"+mthrname+"','"+address+"','"+city+"','"+state+"','"+pstlcode+"','"+religion+"','"+caste+"','"+mobile+"','"+email+"','"+panno+"','"+adhcardno+"','"+desig+"','"+rank+"','"+prgrm+"','"+course+"','"+appt+"','"+salmode+"','"+doctrt+"','"+pgd+"','"+ugd+"','"+othqual+"','"+spec+"','"+tchexp+"','"+rschexp+"','"+payscale+"','"+paystype+"','"+basicsal+"','"+gradepaydp+"','"+dap+"','"+dar+"','"+hrar+"','"+ta+"','"+othall+"','"+grosssal+"','"+bank+"','"+bbranch+"','"+ifsccode+"','"+bankacno+"','"+appttype+"','"+appltrno+"','"+handi+"','"+onleave+"','"+lvtype+"','"+olf+"','"+olu+"')");
     
    int i1=0;
    try{
    i1=pstmt.executeUpdate();
    
    }
    catch(SQLException e)
    {
        
    }
    
    if(i1==1)
    {
        return "yes";
        
    }
    else
    {
        return "no";
    }
} 
       
       public String updateEmp(int fid,int srno,int fcid,String left,String frdate,String name,String title,String fname,String mname,String lname,String dob,String doj,String sex,String fthrname,String mthrname,String address,String city,String state,String pstlcode,String religion,String caste,String mobile,String email,String panno,String adhcardno,String desig,String rank,String prgrm,String course,String appt,String salmode,String doctrt,String pgd,String ugd,String othqual,String spec,double tchexp,double rschexp,String payscale,String paystype,int basicsal,int gradepaydp,int dap,int dar,int hrar,int ta,int othall,int grosssal,String bank,String bbranch,String ifsccode,String bankacno,String appttype,String appltrno,String handi,String onleave,String lvtype,String olf,String olu) throws Exception
{
    
    con=DBC.getConnection();
    
   pstmt=con.prepareStatement("Update Empmaster set [Sr No]="+srno+",[Faculty College ID]="+fcid+",[Left the Institute]='"+left+"',[Faculty Relieved Date]='"+frdate+"',[Full Name]='"+name+"',[Title]='"+title+"',[First Name]='"+fname+"',[Middle Name]='"+mname+"',[Last Name]='"+lname+"',[Date of Birth]='"+dob+"',[Date of Joining]='"+doj+"',[Sex]='"+sex+"',[Father's Name]='"+fthrname+"',[Mother's Name]='"+mthrname+"',[Address]='"+address+"',[City]='"+city+"',[State]='"+state+"',[Postal Code]='"+pstlcode+"',[Religion]='"+religion+"',[Caste]='"+caste+"',[Mobile]='"+mobile+"',[Email]='"+email+"',[PAN No]='"+panno+"',[Aadhar Card No]='"+adhcardno+"',[Designation]='"+desig+"',[Rank]='"+rank+"',[Programme]='"+prgrm+"',[Course]='"+course+"',[Appointment]='"+appt+"',[Salary Mode]='"+salmode+"',[Doctorate]='"+doctrt+"',[PG Degree]='"+pgd+"',[UG Degree]='"+ugd+"',[Other Qualification]='"+othqual+"',[Specialization]='"+spec+"',[Teaching Exp]="+tchexp+",[Research Exp]="+rschexp+",[Pay Scale]='"+payscale+"',[Pay Scale Type]='"+paystype+"',[Basic Salary]="+basicsal+",[Grade Pay/DP]="+gradepaydp+",[DA]="+dap+",[DA Rs]="+dar+",[HRA]="+hrar+",[TA]="+ta+",[Other Allowances]="+othall+",[Gross Pay/Month]="+grosssal+",[Bank Name]='"+bank+"',[Bank Branch Name]='"+bbranch+"',[IFSC Code]='"+ifsccode+"',[Bank A/C No]='"+bankacno+"',[Appointment Type]='"+appttype+"',[Approval Letter No]='"+appltrno+"',[Physically Handicapped]='"+handi+"',[Faculty on Leave]='"+onleave+"',[Type of Leave]='"+lvtype+"',[On Leave From]='"+olf+"',[On Leave Upto]='"+olu+"' where [Faculty College ID]="+fid);
  
        
    
    int i1=pstmt.executeUpdate();
    
    if(i1==1)
    {
        return "yes";
        
    }
    else
    {
        return "no";
    }
} 
       
       public String deleteEmp(int fci) throws Exception
{
    
    con=DBC.getConnection();
    
    pstmt=con.prepareStatement("Delete from Empmaster where [Faculty College ID]="+fci);
    int i1=pstmt.executeUpdate();
    if(i1==1)
    {
        return "yes";
        
    }
    else
    {
        return "no";
    }
} 
    
       public ArrayList empSelect(String sql) throws Exception
       {
           
           alst2=new ArrayList();
           int i=0;
           con=DBC.getConnection();
            pstmt=con.prepareStatement("Select * from Empmaster "+sql);
           rs=pstmt.executeQuery();
       
           while(rs.next())
           {
               alst2.add(rs.getInt("Sr No"));
    alst2.add(rs.getInt("Faculty College ID"));
     alst2.add(rs.getString("Left the Institute"));
     alst2.add(rs.getString("Faculty Relieved Date"));
        alst2.add(rs.getString("Full Name"));
        alst2.add(rs.getString("Title"));
        alst2.add(rs.getString("First Name"));
       alst2.add(rs.getString("Middle Name"));
        alst2.add(rs.getString("Last Name"));
     alst2.add(rs.getString("Date Of Birth"));
     alst2.add(rs.getString("Date Of Joining"));
        alst2.add(rs.getString("Sex"));
        alst2.add(rs.getString("Father's Name"));
        alst2.add(rs.getString("Mother's Name"));
        alst2.add(rs.getString("Address"));
        alst2.add(rs.getString("City"));
        alst2.add(rs.getString("State"));
        alst2.add(rs.getString("Postal Code"));
        alst2.add(rs.getString("Religion"));
        alst2.add(rs.getString("Caste"));
        alst2.add(rs.getString("Mobile"));
        alst2.add(rs.getString("Email"));
        alst2.add(rs.getString("PAN No"));
        alst2.add(rs.getString("AAdhar Card No"));
        alst2.add(rs.getString("Designation"));
        alst2.add(rs.getString("Rank"));
        alst2.add(rs.getString("Programme"));
        alst2.add(rs.getString("Course"));
        alst2.add(rs.getString("Appointment"));
        alst2.add(rs.getString("Salary Mode"));
        alst2.add(rs.getString("Doctorate"));
        alst2.add(rs.getString("PG Degree"));
        alst2.add(rs.getString("UG Degree"));
        alst2.add(rs.getString("Other Qualification"));
        alst2.add(rs.getString("Specialization"));
        alst2.add(rs.getDouble("Teaching Exp"));
        alst2.add(rs.getDouble("Research Exp"));
        alst2.add(rs.getString("Pay Scale"));
        alst2.add(rs.getString("Pay Scale Type"));
        alst2.add(rs.getInt("Basic Salary"));
alst2.add(rs.getInt("Grade Pay/DP"));
alst2.add(rs.getInt("DA"));
alst2.add(rs.getInt("DA Rs"));
alst2.add(rs.getInt("HRA"));
alst2.add(rs.getInt("TA"));
alst2.add(rs.getInt("Other Allowances"));
alst2.add(rs.getInt("Gross Pay/Month"));
       alst2.add(rs.getString("Bank Name"));
       alst2.add(rs.getString("Bank Branch Name"));
       alst2.add(rs.getString("IFSC Code"));
       alst2.add(rs.getString("Bank A/C No"));
       alst2.add(rs.getString("Appointment Type"));
       alst2.add(rs.getString("Approval Letter No"));
       alst2.add(rs.getString("Physically Handicapped"));
       alst2.add(rs.getString("Faculty On Leave"));    
       alst2.add(rs.getString("Type Of Leave"));
    alst2.add(rs.getString("On Leave From"));
      alst2.add(rs.getString("On Leave Upto"));

           }
        
         return alst2;
               
       }
       
       public ArrayList searchEmp(String name) throws Exception
       {
           alst=new ArrayList();
           int i=0;
           con=DBC.getConnection();
           
           pstmt=con.prepareStatement("Select * from Empmaster "+name);
           
           rs=pstmt.executeQuery();
          
           while(rs.next())
           { 
            
               alst.add(rs.getInt("Faculty College ID"));
               
           }
               return alst;
               
       }

               
   


public static void main(String args[]) throws Exception
{
    DBO a=new DBO();
 
}

}
