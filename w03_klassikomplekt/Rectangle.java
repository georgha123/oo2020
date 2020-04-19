public class Rectangle {
    int x, y;
    public Rectangle(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getArea(){
        return x*y;
    }

    public int getPerimeter(){
        return 2*(x+y);
    }

}