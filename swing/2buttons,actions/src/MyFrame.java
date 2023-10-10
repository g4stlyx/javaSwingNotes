import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    
    MyFrame(){
        
        ImageIcon icon = new ImageIcon("darthVader.jpeg");

        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton(); // create a button
        button.setBounds(100,100,250,100);
        button.addActionListener(this);
        button.setText("I am obviously a button.");
        button.setFocusable(false);
        // button.setIcon(icon);
        // button.setHorizontalTextPosition(JButton.CENTER);
        // button.setVerticalTextPosition(JButton.BOTTOM);
        button.setForeground(Color.cyan);
        button.setBackground(Color.darkGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        // button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.setIconImage(icon.getImage());
        this.add(label);    
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Button clicked!");
            // button.setEnabled(false); // if you want button to be disabled after clicking

            label.setVisible(true);
        }
    }
}
