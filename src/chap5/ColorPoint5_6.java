package chap5;
class Point
{
    private int x, y;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y) { this.x =x; this.y = y; }
}

public class ColorPoint5_6 extends Point
{
    private String color;
    public ColorPoint5_6() {
        super(0, 0);
        this.color = "BLACK";
    }
    public ColorPoint5_6(int x, int y) {
        super(x, y);
        this.color = "BLACK";
    }
    public void setXY(int x, int y) {
        move(x, y);
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        String tmp = color+"색의 ("+getX()+","+getY()+") 점";
        return tmp;
    }
    public static void main(String[] args)
    {
    ColorPoint5_6 zeroPoint = new ColorPoint5_6(); // (0,0) 위치의 BLACK 색 점
    System.out.println(zeroPoint.toString() + "입니다.");
    ColorPoint5_6 cp = new ColorPoint5_6(10, 10); // (10,10) 위치의 BLACK 색 점
    cp.setXY(5,5);
    cp.setColor("RED");
    System.out.println(cp.toString()+"입니다.");
}
}
