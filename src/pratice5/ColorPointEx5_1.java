package pratice5;

class Point5_1 {
    private int x, y;

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint5_1()
    {
        System.out.println("(" + x + "," + y +")");
    }
}
class  ColorPoint extends Point5_1{
    private String color;
    public void setColor(String color)
    {
        this.color = color;
    }
    public  void showColorPoint5_1()
    {
        System.out.print(color);
        showPoint5_1();
    }
}

public class ColorPointEx5_1 {
    public static void main(String [] args) {
        Point5_1 p = new Point5_1(); // Point 객체 생성
        p.set(1, 2); // Point 클래스의 set() 호출
        p.showPoint5_1();
        ColorPoint cp = new ColorPoint(); // ColorPoint 객체
        cp.set(3, 4); // Point의 set() 호출
        cp.setColor("red"); // ColorPoint의 setColor() 호출
        cp.showColorPoint5_1(); // 컬러와 좌표 출력
    }

}
