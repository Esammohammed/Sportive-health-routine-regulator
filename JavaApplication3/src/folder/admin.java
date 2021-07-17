
import java.util.ArrayList;
import java.util.HashMap;


public class admin extends person{
     static  HashMap<Integer,employee>admin_empid= new HashMap <>();
     static  ArrayList<Integer>employee_id = new ArrayList <>();
    public admin(String name, int age, String gender) {
        super(name, age, gender);
    }
    
//    void add_employee ( int id ,String name ,int age ,String gender){
//        employee emp = new employee (id ,name , age , gender);
//        admin_empid.put(id , emp);
//    }
//    void remove_employee ( int id ,String name ,int age ,String gender){
//          admin_empid.remove(id);
//    }
//    employee search_employee (int id ,String name ,int age ,String gender ){
//        return admin_empid.get(id);
//    }
    }
