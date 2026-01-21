public class App {
    public static void main(String[] args){
        Student myStudent=new Student("John","Doe",20,2.3,false);
        System.out.println(myStudent.FirstName);
        System.out.println(myStudent.LastName);
        System.out.println(myStudent.Age);
        System.out.println(myStudent.gpa);
        System.out.println(myStudent.onProbation);

        Student myStudent2=new Student("Mike","Sonko",40,2.3,false);
        System.out.println(myStudent2.FirstName);
        System.out.println(myStudent2.LastName);
        System.out.println(myStudent2.Age);
        System.out.println(myStudent2.gpa);
        System.out.println(myStudent2.onProbation);
    }
}
