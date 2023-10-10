import javax.swing.*;

public class MyFrame extends JFrame{

    MyPanel panel;

    MyFrame() {

        panel = new MyPanel();
        
        this.setTitle("2D Animations Playground");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        this.setResizable(false);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
