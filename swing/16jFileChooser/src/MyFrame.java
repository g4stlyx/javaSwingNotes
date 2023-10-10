import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
    
    JFileChooser fileChooser = new JFileChooser();    
    JButton button = new JButton("Select File");

    MyFrame(String title){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        
        button.addActionListener(this);

        this.add(button);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){

            fileChooser.setCurrentDirectory(new File(".")); // sets current directory

            //int response = fileChooser.showOpenDialog(null); // select file to open
            int response = fileChooser.showSaveDialog(null); // select file to save

            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath()); // get selected file
                System.out.println(file);
            }
        }
    }    
}
