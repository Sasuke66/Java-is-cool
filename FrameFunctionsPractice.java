import javax.swing.*;
import java.awt.Color;

public class FrameFunctionsPractice{
    public static void main(String[] args){
        JFrame f = new JFrame("Learning JFrame...");
        f.setVisible(true); // if this value is true than the dialog box will be visible to us.
        f.setSize(400, 400);
        f.setDefaultCloseOperation(1); // if this value is 0 then the dialog box cannot be closed.
        f.setResizable(false); // if this value is false that means we cannot change the size of our dialog box.

        ImageIcon I = new ImageIcon("work.jpg"); // creating a image icon class so that we can change the imahge icon of our dialog box.
        f.setIconImage(I.getImage()); // here we are getting the image in out dialog box's top.
        f.getContentPane().setBackground(new Color(122,34,55));
    }
}