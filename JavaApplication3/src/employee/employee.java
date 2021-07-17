
import java.util.ArrayList;
import java.util.HashMap;


public class employee extends person  {
    public int employee_id ;
      ArrayList<Integer>mem_id = new ArrayList <>() ;
          HashMap<Integer,member>employee_empid= new HashMap <>();

    public employee() {
  
    }

    
        

    public employee( int employee_id , String name, int age, String gender) {
        super(name, age, gender);
        this.employee_id=employee_id ;
        mem_id = new ArrayList <>();
        employee_empid= new HashMap <>();
    }
  
    
//    void add_member ( int memberid, double weight, double height, String type, String name, int age, String gender){
//        member mem = new member (memberid ,weight , height , type,name,age,gender);
//        employee_empid.put(memberid , mem);
//    }
//    void remove_employee ( int id ){
//          employee_empid.remove(id);
//    }
//    member search_employee (int id ){
//        return employee_empid.get(id);
//    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
   
    
}
