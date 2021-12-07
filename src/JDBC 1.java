/*
Develop a jdbc program containing main method, which should instantiate a class called DAOClass, which should contain methods called insert, delete, modify and display. Description of what each of these methods are expected to do is given below. Necessary details required for executing these methods, are passed from command line argument. For e.g. If the name of the class containing the main method is JDBCCalls, then if you want to insert a record, you will execute this class as java JDBCCalls 1 101 “Ajit” “IV” “20-Nov-2001” 4000
Where 1 is the option for inserting the record and all other details are the values for the columns in each row of the student table. The structure of student table is given below. Similarly, for deleting a record, you have to execute the code as 
java JDBCCalls 2 101
where 2 is the option for deleting a record and 101 is the rollno of the student, whose record has to be deleted.
For modifying a record, you will use
java JDBCCalls 3 101 4500, where 3 is the option for modifying a record and the 4500 is the new fee which needs to replace the old fee value.
For Displaying records, if the main class is executed as follows 
java JDBCCalls 4 101
it should display only one record, that of the student with roll no. 101. 4 option is for displaying the record. 
If the main class is executed as
java JDBCCalls 4 (without specifying the rollno.), it means that details of all the students should be displayed.
*/

import java.util.Scanner;
import java.sql.*;
public class StuTest { }

// Kindly concentrate on sql commands

 class JDBCcalls {
   public  Connection con=null;
   public PreparedStatement ps = null;
    JDBCcalls() throws SQLException {
      // kindly change the url as per your system
      con = DriverManager.getConnection("jdbc:mysql://localhost:3308/Studatabase", "root", "");
    }

    public  void insert(String a,String b,String c,String d,String e) throws SQLException {
      int a1 = Integer.parseInt(a);
      int e1 = Integer.parseInt(e);
      String str = "insert into stu values(" + a1 + ",'" + b + "','" + c + "','" + d + "'," + e1 + ")";
      System.out.println(str);

      ps = con.prepareStatement(str);
      ps.executeUpdate();
    }

    public void delete(String a) throws SQLException
    {
      Integer a1=Integer.parseInt(a);
      String str1 = "delete from stu where rollno="+a;
      System.out.println(str1);
      ps=con.prepareStatement(str1);
      ps.executeUpdate();
    }
    public void modify(String a, String e) throws SQLException
    {
      int a1= Integer.parseInt(a);
      int e1=Integer.parseInt(e);
      String str2 = "update stu set fee="+e1+" where rollno ="+ a1;
      System.out.println(str2);
      PreparedStatement ps=con.prepareStatement(str2);
      ps.executeUpdate();
    }

    public void display(String a) throws SQLException {
      Integer a1 = Integer.parseInt(a);
      Statement s = con.createStatement();
      ResultSet rs = s.executeQuery("SELECT * FROM stu where rollno =" + a1);
      while (rs.next()) {
        System.out.println(rs.getInt(1));
        System.out.println(rs.getString(2));
        System.out.println(rs.getString(3));
        System.out.println(rs.getString(4));
        System.out.println(rs.getInt(5));

      }
    }
  public static void main(String[] args) throws ClassNotFoundException, SQLException
  {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Scanner sc = new Scanner(System.in);
    //DAO d=new DAO();
    System.out.println("--------------------------------------------------------------------------------------------------------------------");
    System.out.println("Press 1. Inserting the record and all other details are the values for the columns in each row of the student table");
    System.out.println("Press 2. Deleting a record and 101 is the roll no of the student, whose record has to be deleted.");
    System.out.println("Press 3. Modifying a record and the 4500 is the new fee which needs to replace the old fee value");
    System.out.println("Press 4. Displaying the record");
    System.out.println("Press 0. For exit the program");
    System.out.println("--------------------------------------------------------------------------------------------------------------------");
    JDBCcalls d = new JDBCcalls();

    // Switch with -> not supported in java 12
    // so i changed it inot normal representation
    switch (args[0])
    {
      case "0":
        break;
      case "1":
        d.insert(args[1],args[2],args[3],args[4],args[5]);
        System.out.println("record Inserted");
      break;
      case "2":
        d.delete(args[1]);
        System.out.println("record Deleted");
      break;
      case "3":
          d.modify(args[1],args[2]);
      break;
      case "4":
        d.display(args[1]);
      break;
      default:
        System.out.println("enter choice again");
    }
  }
}
