package extenders;

public class Student extends Employee {
    String course;
    int year;
    double fee;

    public Student(String name,String adress,String course,int year,double fee){
        super(adress, name);
        this.course=course;
        this.year=year;
        this.fee=fee;
    }
}
