public abstract class Shape {
    private String color;

    public Shape(String color){
        this.color=color;
    }

    public String getcolor(){
        return color;
    }
    public abstract  double findarea();//abstract method
    
}
