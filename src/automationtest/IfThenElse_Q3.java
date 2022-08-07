package automationtest;

public class IfThenElse_Q3 {
    private int age;
    private String Name;

    public void setName (String Name){this.Name= Name;}

    public void setAge(int age){
        if (age <= 18 ){
            this.age = age;
        }else {
            this.age = 0;
        }
    }
    public boolean isTeen () {
        if (age <= 18) {
            return true;
        }
        return false;
    }
    public int Name() {
        return age;
    }

    public static void main(String[] args) {
        IfThenElse_Q3 Q4= new IfThenElse_Q3();
        Q4.Name("age ");
        System.out.println("teen= " + Q4.isTeen());
        Q4.setAge(18);
    }
    public String Name(String age) {
        if (Name.isEmpty()) {
            return " ";
        }
        return age;
    }
}
