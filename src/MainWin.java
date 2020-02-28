import javax.swing.*;

public class MainWin extends JFrame {
    private JPanel MainWin;
    private JButton sendButton;
    private JLabel senderLabel;
    private JTextField senderTextField;
    private JLabel recipientLabel;
    private JTextField recipientTextField;
    private JTextField messageTextField;
    public int entryPort;
    public int outputPort;


    public MainWin(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(MainWin);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new MainWin("Servicio de Mensajeria");
        frame.setVisible(true);
    }
}
