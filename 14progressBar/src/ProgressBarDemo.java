import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ProgressBarDemo implements ChangeListener{
    
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,500);

    ProgressBarDemo(String title){

        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true); // adds percentage
        bar.setBackground(Color.black);
        bar.setForeground(Color.red);
        bar.setFont(new Font("Arials",Font.BOLD,25));

        frame.add(bar);

        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setTitle(title);
        frame.setVisible(true);

        fill();
    }

    public void fill(){
        for(int i=500;i>0;i--){
            bar.setValue(i);
            try{
                Thread.sleep(15); // speed of bar increasing or decreasing
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        bar.setString("Done! :)");
    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }    
}
