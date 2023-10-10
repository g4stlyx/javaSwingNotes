import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.ImageIcon;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label = new JLabel();
    ImageIcon rocket;
    ImageIcon darthVader;
    ImageIcon mick;
    ImageIcon diCaprio;

    MyFrame(String title) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setTitle(title);

        label.addMouseListener(this);

        rocket = new ImageIcon("rocket.png");
        darthVader = new ImageIcon("darthVader.jpeg");
        mick = new ImageIcon("mick_slipknot.jpeg");
        diCaprio = new ImageIcon("diCaprioDrinking.jpeg");
       
        label.setIcon(darthVader);
        this.add(label);

        this.setLayout(new FlowLayout());
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // pressed + released
        System.out.println("You clicked the mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("You pressed the mouse");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("You released the mouse");
        label.setIcon(rocket);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You entered the component");
        label.setIcon(diCaprio);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You exited the component");
        label.setIcon(mick);
    }


}
