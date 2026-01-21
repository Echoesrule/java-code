public class Student implements Register,Sit211 {
    String name;
    int age;
    public Student (String name,int age){
            this.name=name;
            this.age=age;
    }
 @Override
 public void unitRegistration(){
    System.out.println("Name:"+name+"Age:"+age+"Is registering units");
}
@Override
public void working(){
    System.out.println(name+"Is working on");

}
public static void main (String[] args){
    Student s=new Student("John", 20);
    
    s.unitRegistration();
    s.working();
}
}
