 class Person {
    private String firstname;
    private String lastname;
    private int id;

    public Person (String firstname,String lastname,int id){
        this.firstname=firstname;
        this.lastname=lastname;
        this.id=id;
    }
   public String getfirstname(){
        return firstname;
    }
    public String getlastname(){
        return lastname;
    }
    public int getId(){
        return id;
    }

    //setters
    public void setName(String name){
        firstname=name;
        lastname=name;
    }
   public  void setId(int id){
        this.id=id;
    }  
}
//Employee class

     class Employee extends Person{
        //adding salary to person class through inheritance
        private double salary;
        //constructor
        public Employee(String firstname,String lastname,int id,double salary){
            super(firstname,lastname,id);
            this.salary=salary;
        }
        public double getSalary(){
            return salary;
        }
        @Override
        public String toString(){
            return "Employee[name=" + getfirstname() + " " + getlastname() + ",id=" + getId() + ",salary=" + salary + "]";
        }
    }

//main class
    public class ItsMain{
        public static void main(String[] args){
            Employee emp=new Employee("John","Doe",101,55000.0);
            System.out.println(emp.toString());
        }
    }

