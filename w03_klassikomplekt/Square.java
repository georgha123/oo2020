public class Square {
    private int x;

    public Square(int ux){
        this.x = ux;
    }

    public int getArea(){
        return  x*x;
    }

    public int getPerimeter(){
        return x*4;
    }
}
