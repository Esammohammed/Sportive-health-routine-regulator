
import javax.accessibility.AccessibleContext;
import javax.swing.JRootPane;


public class member extends person {
    
      int memberid ;
      double weight, height ;
      String type ;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setRootPane(JRootPane rootPane) {
        this.rootPane = rootPane;
    }

    public void setRootPaneCheckingEnabled(boolean rootPaneCheckingEnabled) {
        this.rootPaneCheckingEnabled = rootPaneCheckingEnabled;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }

   
    public member(int memberid, double weight, double height, String type, String name, int age, String gender) {
        super(name, age, gender);
        this.memberid = memberid;
        this.weight = weight;
        this.height = height;
        this.type = type;
    }

    public member() {
    }

   
    
    public void setType(String Type) {
        this.type = Type;
    }

    public String gettype() {
        return type;
    }
    public int getMemberid() {
        return memberid;
    }

    public double getWeight() {
        return weight;
    }

    public double getheight() {
        return height;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    
}
