import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame{
    private JPanel panelMain;
    private JTextField text_field;
    private JLabel label_field;
    private JButton button_send;
    private JLabel label_output;
    private static ImageIcon icon = new ImageIcon("C:\\Users\\lukek\\Pictures\\Other\\palindromecheckericon.png");

    public App(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelMain);
        this.pack();
        this.setSize(400,400);

        button_send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label_output.setText(palindromeChecker.check(text_field.getText()));
                if(label_output.getText().contains("ERROR")){
                    label_output.setForeground(Color.red);
                }
                else{
                    label_output.setForeground(Color.black);
                }
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new App("Palindrome Checker");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setIconImage(icon.getImage());
    }
}
