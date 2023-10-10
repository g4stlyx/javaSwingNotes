import javax.swing.*;

public class MyFrame extends JFrame{
        
    MyFrame(){
        // JFrame = a GUI window to add components to

        this.setTitle("JFrame Tutorial");
        // exit when X is clicked, default = HIDE_ON_CLOSE, DO_NOTHING_ON_CLOSE is an option (a troll one i guess)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); // prevent from being resized
        this.setSize(500,500); // x,y
        this.setVisible(true);

        /*
         ImageIcon image = new ImageIcon("mick_slipknot6.jpg"); // create an imageIcon
         this.setIconImage(image.getImage()); // set the imageIcon
        */

        // this.getContentPane().setBackground(new Color(0x123456)); // change color of background

    }
}
