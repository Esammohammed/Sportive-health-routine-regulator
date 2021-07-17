
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author essam
 */
public class readwrite {
      static void read_member_data(){
          try {
      File myObj = new File("member data.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        
      int current_employee = Integer.valueOf(data);
       data = myReader.nextLine();
       int size_of_emp_empid = Integer.valueOf(data);
          for (int i = 0; i < size_of_emp_empid; i++) {
           
             String name=  myReader.nextLine();
              String gender =myReader.nextLine();
              int age =Integer.valueOf(myReader.nextLine());
               String type =myReader.nextLine();
              double height =Double.parseDouble(myReader.nextLine());
              double weight =Double.parseDouble(myReader.nextLine());
              int memberid=Integer.valueOf(myReader.nextLine());
               member mem = new member ( memberid ,weight ,height ,type,name, age, gender );
              admin.admin_empid.get(current_employee).employee_empid.put(mem.getMemberid(), mem);
              admin.admin_empid.get(current_employee).mem_id.add(mem.getMemberid());
             
             
            
             
              myReader.nextLine();
          }
           //System.out.println( admin.admin_empid.get(current_employee).employee_empid.size());
     
      }
               
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      }
      static void read_employee_data(){
          try {
      File myObj = new File("employee data.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
       employee emp = new employee();
       emp.employee_id= Integer.valueOf(data);
       data = myReader.nextLine();
       emp.age= Integer.valueOf(data);
       data = myReader.nextLine();
       emp.name= data;
       data = myReader.nextLine();
       emp.gender= data;
       admin.admin_empid.put(emp.employee_id, emp);
        admin.employee_id.add(emp.employee_id);
       myReader.nextLine();
      }
             
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      }
      static void write_employee_data(){
         try{    
           FileWriter fw=new FileWriter("employee data.txt");    
         for (int i = 0; i < admin.admin_empid.size(); i++) {
             employee emp  = admin.admin_empid.get(admin.employee_id.get(i));
         fw.append(emp.employee_id+"\n");
            fw.append(emp.age+"\n");
         fw.append(emp.name+"\n");
          fw.append(emp.gender+"\n");
       
          
          fw.append("-----------------------------\n");
      }
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success..."); 
    }
      static void write_member_data(){
            
              try{   
                 FileWriter fw=new FileWriter("member data.txt"); 
                        
         for (int i = 0; i < admin.admin_empid.size(); i++) {
            
             employee current_emp =admin.admin_empid.get(admin.employee_id.get(i));
               fw.append(Integer.toString (current_emp.employee_id)+"\n");
               fw.append(Integer.toString (current_emp.employee_empid.size())+"\n");
             for (int j = 0; j < current_emp.employee_empid.size(); j++) {
                  member mem  = current_emp.employee_empid.get(current_emp.mem_id.get(i));
          fw.append(mem.name+"\n");
          fw.append(mem.gender+"\n");
          fw.append(mem.age+"\n");
          fw.append(mem.gettype()+"\n");
          fw.append(mem.getheight()+"\n");
          fw.append(mem.getWeight()+"\n");
          fw.append(mem.getMemberid()+"\n");
          fw.append("-------------------\n");
          
       
              
         
               
                              }
          

                    }
               fw.close();
              }catch(Exception e){System.out.println(e);}    
         
      }
      
}
