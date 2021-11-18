package practice10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AnonymousClassListener10_3 extends JFrame
{
    public AnonymousClassListener10_3()
    {
        setTitle("Action 이벤트 리스너 작성");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        c.add(btn);
        btn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("Action"))
                    b.setText("액션");
                else
                    b.setText("Action");
                setTitle(b.getText()); // AnonymousClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
            }
        });
        setSize(350, 150);
        setVisible(true);
    }
    public static void main(String [] args)
    {
        new AnonymousClassListener10_3();
    }
}