public class Rect extends Shape{
    private int width;
    private int height;

    public Rect (int width,int height,String color){
        super(color);
        this.height=height;
        this.width=width;
    }
    @Override
    public double findarea(){
        return height*width;
    }
}


