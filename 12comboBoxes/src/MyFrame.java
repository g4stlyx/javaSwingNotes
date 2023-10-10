import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
//import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JComboBox comboBox;

    MyFrame(){}
    MyFrame(String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"};
        comboBox = new JComboBox(animals);

        // comboBox.setEditable(true);
        // System.out.println(comboBox.getItemCount());
        comboBox.addItem("horse");
        comboBox.insertItemAt("pig", 0);
        comboBox.setSelectedIndex(0);
        comboBox.removeItem("cat");
        comboBox.removeItemAt(1);
        // comboBox.removeAllItems();


        comboBox.addActionListener(this);

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
            System.out.print(comboBox.getSelectedItem()+" ");
            System.out.println(comboBox.getSelectedIndex());
        }
    }
    
}
