import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
    
    JColorChooser colorChooser = new JColorChooser();    
    JButton button = new JButton("Select Color");
    JLabel label = new JLabel("This is the text you are going to change the color of");

    MyFrame(String title){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setFont(new Font("Times New Roman", Font.ITALIC, 50));

        button.addActionListener(this);
        
        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            Color color = JColorChooser.showDialog(null, "Select a color for foreground", Color.black);
            Color color2 = JColorChooser.showDialog(null, "Select a color for background", Color.white);

            label.setForeground(color);
            label.setBackground(color2);
        }
    }    
}
