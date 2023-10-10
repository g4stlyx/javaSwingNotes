import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.ImageIcon;

public class MyFrame extends JFrame {

    DragPanel dragPanel = new DragPanel();

    MyFrame(String title) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setTitle(title);
       
        this.add(dragPanel);
        this.setVisible(true);
    }



}
