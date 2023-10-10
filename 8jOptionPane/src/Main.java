import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // JOptionPane = pop up a standard dialog box that prompts users for a value or informs them of something.

        /* 
        JOptionPane.showMessageDialog(null, "This is some useless info.",
        "this is a title", JOptionPane.PLAIN_MESSAGE);
    
        JOptionPane.showMessageDialog(null, "There is an 'i' icon on the left now",
        "this is an info title", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "really? a question mark?",
        "this is a question title", JOptionPane.QUESTION_MESSAGE);
        
        
        for(int i=0;i<10;i++){
            JOptionPane.showMessageDialog(null, "Your computer has a VIRUS!!!",
         "this is a warning title", JOptionPane.WARNING_MESSAGE);
        } 
        

        JOptionPane.showMessageDialog(null, "We have a red frightening X sign now!",
        "this is an error title", JOptionPane.ERROR_MESSAGE);


        int answer = JOptionPane.showConfirmDialog(null, "now, say my name!", "i am the cook, i am the man who killed Gus Fring", JOptionPane.YES_OPTION);
        if(answer == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "You are god damn right!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Say my f*cking name!");
        }

        String name = JOptionPane.showInputDialog("say my name");
        if(name.equals("Heisenberg")){
            JOptionPane.showMessageDialog(null, "You are god damn right!");
        }
        else{
            System.out.println(name);
        }
*/
        
        ImageIcon darthVader = new ImageIcon("darthVader.jpeg");
        String[] responses = {"No you cannot","Yeah you can", "This is where my creativity ran out"};

        JOptionPane.showOptionDialog(
        null, 
        "You can add icons,answers etc. now", 
        "this is the title i guess",
         JOptionPane.YES_NO_CANCEL_OPTION, 
         JOptionPane.INFORMATION_MESSAGE, 
         darthVader,
         responses, 
         0);

    
    }
}