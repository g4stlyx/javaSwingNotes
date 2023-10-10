import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JButton button = new JButton("Submit");
    JCheckBox checkbox = new JCheckBox();
    ImageIcon imageNotSelected = new ImageIcon("darthVader.jpeg");
    ImageIcon imageSelected = new ImageIcon("diCaprioDrinking.jpg");

    MyFrame(){}

    MyFrame(String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.addActionListener(this);

        checkbox.setText("I'm not a robot");
        checkbox.setFocusable(false);
        checkbox.setFont(new Font("Consolas", Font.PLAIN, 25));
        checkbox.setIcon(imageNotSelected);
        checkbox.setSelectedIcon(imageSelected);

        this.add(button);
        this.add(checkbox);

        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(checkbox.isSelected());
        }
    }
    
}
