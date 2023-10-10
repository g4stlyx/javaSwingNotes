import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame{

    MyPanel panel;

    MyFrame() {

        panel = new MyPanel();
        
        this.setTitle("Key Binding Playground");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }
}
