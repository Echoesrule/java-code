
public class Main {
   public static void main(String[] args) {
       System.out.println("\n----------------------------------------------------------------------------------");
         System.out.println("CIRCLE");
       System.out.println("----------------------------------------------------------------------------------");
       Circle c=new Circle(5.0,"blue");
       System.out.printf("The radius is= %.2f\n The area is=%.2f\n The color of the circle is=%s\n",c.getRadius(),c.getArea(),c.getColor());

                                //EMPLOYEE CLASS//
       System.out.println("\n----------------------------------------------------------------------------------");
        System.out.println("EMPLOYEE");
       System.out.println("----------------------------------------------------------------------------------");

        Employee n=new Employee(10, "Emmanuel", "Kemboi", 999);
        System.out.printf("The id is:%d\nFirsname is:%s\nLastname is:%s\nSalary is:$%d\nName is:%s\nAnnual salary is:$%d\n",n.getId(),n.getFirstname(),n.getLastname(),n.getSalary(),n.getName(),n.getAnnualsalary());
        System.out.println(n.toString());
     
        System.out.printf("The raised salary is:$%d\n",n.toRaiseSalary(10));

                                //INVOICE ITEM//
        System.out.println("\n----------------------------------------------------------------------------------");
        System.out.println("INVOICE ITEM");
        System.out.println("\n----------------------------------------------------------------------------------");

        InvoiceItem item=new InvoiceItem("001","Laptop",2,750.0);
        System.out.printf("Item ID:%s\nDescription:%s\nQuantity:%d\nUnit Price:$%.2f\nTotal Price:$%.2f\n",item.getID(),item.getDesc(),item.getQuantity(),item.getUnitprice(),item.getTotal());

   }
}

      
   class Circle{
     double radius;
     String color;
    
    //constructor for circle
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
   public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }
   }

    //Employee class
    class Employee{
        int id;
        String Firstname;
        String Lastname;
        String Name;
        int Salary;


        //constructor
        public Employee(int id,String Firstname,String Lastname,int Salary){
            this.id=id;
            this.Firstname=Firstname;
            this.Lastname=Lastname;
            this.Salary=Salary;
        }
        public  int getId(){
            return id;
        }

        public String getFirstname(){
            return Firstname;
        }
        public String getLastname(){
            return Lastname;
        }
        public String getName(){
            Name=Firstname+" "+Lastname;
            return Name;
        }
        public  int getSalary(){
            return Salary;
        }
        public void setSalary(int Salary){
            this.Salary=Salary;
        }
        public int getAnnualsalary(){
            return Salary*12;
        }
        public int toRaiseSalary(int Percentage){
          Salary=Salary+(int)(Salary*Percentage/100.0);
          return Salary;
        }

        @Override
        public String toString(){
          return "Employee[id=" + id + ",name=" + getName() + ",salary=" + Salary + "]";
        }
    }

        //InvoiceItem class
        class InvoiceItem{
            String iD;
            String desc;
            int quantity;
            double unitprice;

            public InvoiceItem(String iD,String desc,int quantity,double unitprice){
                this.iD=iD;
                this.desc=desc;
                this.quantity=quantity;
                this.unitprice=unitprice;
            }
            public String getID(){
                return iD;
            }
            public String getDesc(){
                return desc;
            }
            public int getQuantity(){
                return quantity;
            }
            public double getUnitprice(){
                return unitprice;
            }

            public void setQuantity(int quantity){
                this.quantity=quantity;
            }
            public void setUnitprice(double unitprice){
                this.unitprice=unitprice;
            }
            public double getTotal(){
                return quantity*unitprice;
            }
        }
    
    


