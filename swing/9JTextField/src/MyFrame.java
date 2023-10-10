import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JButton button = new JButton("Submit");
    JTextField textField = new JTextField();

    MyFrame(){}

    MyFrame(String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(420,420);
        this.setLayout(new FlowLayout());

        button.addActionListener(this);

        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.PLAIN,20));
        textField.setForeground(Color.red);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.red);
        //textField.setText("default text");
        // textField.setEditable(false);


        this.add(textField);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(textField.getText());
            textField.setEditable(false);
            button.setEnabled(false);
        }
    }
    
}
