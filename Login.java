import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {
    final private Font mainFont = new Font("Century Gothic", Font.BOLD, 18);

    JLabel lbUserName, lbPassword;
    JTextField tfUserName;
    JPasswordField jpPassword;
    JButton btnLogin, btnClear;

    public Login() {
        lbUserName = new JLabel("User Name:");
        lbUserName.setFont(mainFont);

        lbPassword = new JLabel("Password:");
        lbPassword.setFont(mainFont);

        tfUserName = new JTextField();
        tfUserName.setFont(mainFont);

        jpPassword = new JPasswordField();
        jpPassword.setFont(mainFont);

        btnLogin = new JButton("Login");
        btnLogin.setFont(mainFont);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = tfUserName.getText();
                String password = new String(jpPassword.getPassword());

                if (userName.equals("Admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(rootPane, "Login Successfully...");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Login Failed!!!");
                }
            }
        });

        btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfUserName.setText("");
                jpPassword.setText("");
            }
        });

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.add(lbUserName);
        formPanel.add(tfUserName);
        formPanel.add(lbPassword);
        formPanel.add(jpPassword);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPanel.add(btnLogin);
        buttonPanel.add(btnClear);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(15, 15, 15, 15));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        this.add(mainPanel);

        setTitle("Login Form");
        setSize(500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(200, 100));
        setVisible(true);
    }

    public static void main(String[] args) {
        Login main = new Login();
    }
}
