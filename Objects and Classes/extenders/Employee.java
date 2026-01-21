package extenders;

public class Employee {
    String adress;
    String name;

    public Employee(String adress,String name){
        this.name=name;
        this.adress=adress;
    }
    //accessor
    public String getName(){
        return name;
    }
    public String getAdress(){
        return adress;
    }
    //muttator
    public void setName(String name){
        this.name=name;
    }
    public void setAdress(String adress){
        this.adress=adress;
    }
    public String toString(){
        return "[Name:"+name+"Adress:"+adress+"]";
    }
}
