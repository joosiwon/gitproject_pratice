package chap10;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Focus10_4 extends JFrame
{
    JLabel label;
    String text = "Love Java";
    Focus10_4(){
        setTitle("Left 키로 문자열 바꾸기 예제");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label= new JLabel("Love Java");
        label.addKeyListener(new MyKeyAdapter());
        label.setSize(200,50);
        add(label);
        setSize(400,200);
        setVisible(true);
        label.requestFocus();

    }
    public static void main(String[] args)
    {
        new Focus10_4();
    }
    class MyKeyAdapter extends KeyAdapter{
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) { // 입력받은 코드가
                case KeyEvent.VK_LEFT: //<Left> 키 일때
                    label.setText(text); // text 한칸씩 앞으로 당김
                    text = text.substring(1)+text.substring(0, 1);
                    break;
                default:
                    break;
            }
        }
    }

}