package chap10;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseDragging10_2 extends JFrame{
    JPanel contentPane = new JPanel();
    MouseDragging10_2(){
        setTitle("드래깅동안 YELLO");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(contentPane);
        contentPane.setBackground(Color.GREEN);
        // JPanel에 MouseMotionListener 추가
        contentPane.addMouseMotionListener(new MyMouseMotionAdapter());
        // JPanel에 MouseListener 추가
        contentPane.addMouseListener(new MyMouseAdapter2());
        setSize(400,200);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new MouseDragging10_2();
    }

    class MyMouseMotionAdapter extends MouseMotionAdapter
    {
        public void mouseDragged(MouseEvent e)
        {
            // 마우스가 드래그되는 동안
            contentPane.setBackground(Color.YELLOW);
        }
    }
    //MouseAdapter를 상속 받는 MyMouseAdapter2 클래스
    class MyMouseAdapter2 extends MouseAdapter
    {
        public void mouseReleased(MouseEvent e)
        {
            // 눌러진 마우스 버튼이 떼어질 때
            contentPane.setBackground(Color.GREEN);
        }
    }
}