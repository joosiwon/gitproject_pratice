package chap5;

public class PositivePoint5_8 extends Point
{
    public PositivePoint5_8() {
        super(0, 0);
    }
    public PositivePoint5_8(int x, int y) {
        super(x,y);
        if(x<0 || y<0) {
            super.move(0,0);
        }
    }
    protected void move(int x, int y) {
        if(x>0 && y>0) {
            super.move(x, y);
        }
    }
    public String toString() {
        String tmp = "("+getX()+","+getY()+")의 점";
        return tmp;
    }
    public static void main(String[] args)
    {
        PositivePoint5_8 p = new PositivePoint5_8();
        p.move(10, 10);
        System.out.println(p.toString()+"입니다.");
        p.move(-5,5); // 객체 p는 음수 공간으로 이동되지 않음
        System.out.println(p.toString()+"입니다.");
        PositivePoint5_8 p2 = new PositivePoint5_8(-10, -10);
        System.out.println(p2.toString()+"입니다.");
    }
}
