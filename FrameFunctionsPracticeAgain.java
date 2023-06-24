import javax.swing.*;
import java.awt.Color;

public class FrameFunctionsPracticeAgain extends JFrame{
    FrameFunctionsPracticeAgain(){
        JFrame f = new JFrame("Learning JFrame...");
        this.setVisible(true); // if this value is true than the dialog box will be visible to us.
        this.setSize(400, 400);
        this.setDefaultCloseOperation(1); // if this value is 0 then the dialog box cannot be closed.
        this.setResizable(false); // if this value is false that means we cannot change the size of our dialog box.

        ImageIcon I = new ImageIcon("work.jpg"); // creating a image icon class so that we can change the imahge icon of our dialog box.
        this.setIconImage(I.getImage()); // here we are getting the image in out dialog box's top.
        this.getContentPane().setBackground(new Color(122,34,55));
    }
}
