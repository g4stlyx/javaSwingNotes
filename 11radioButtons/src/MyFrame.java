import javax.swing.ButtonGroup;
//import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JRadioButton pizzaButton = new JRadioButton("pizza");
    JRadioButton hamburgerButton = new JRadioButton("hamburger");
    JRadioButton hotdogButton = new JRadioButton("hotdog");
    ButtonGroup group = new ButtonGroup();

    //ImageIcon pizzaIcon = new ImageIcon("pizza.png");

    MyFrame(){}

    MyFrame(String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        //pizzaButton.setIcon(pizzaIcon);

        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);

        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzaButton){
            System.out.println("You ordered a pizza!");
        }
        else if(e.getSource()==hamburgerButton){
            System.out.println("You ordered a hamburger!");
        }
        else{
            System.out.println("You ordered a hotdog!");
        }
    }
    
}
