

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MainFrame extends JFrame implements ActionListener {

    private final int ACCOUNT_ID;

    private final JPanel HEADER_PANEL;
    private final JPanel CONTENT_PANEL;

    private final int HORIZONTAL_DISPLACEMENT;
    private final int VERTICAL_DISPLACEMENT;
    private final int WIDTH;
    private final int HEIGHT;

    public MainFrame(int accountID) {

        super("Cryptofolio");

        ACCOUNT_ID = accountID;

        // Initializing constants and variables
        HEADER_PANEL = new JPanel(new GridBagLayout());
        CONTENT_PANEL = new JPanel(new GridBagLayout());

        HORIZONTAL_DISPLACEMENT = 0;
        VERTICAL_DISPLACEMENT = 0;
        WIDTH = 1540;
        HEIGHT = 830;

        this.setBounds(HORIZONTAL_DISPLACEMENT, VERTICAL_DISPLACEMENT, WIDTH, HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setResizable(false);

        this.add(HEADER_PANEL, BorderLayout.NORTH);
        this.add(CONTENT_PANEL, BorderLayout.CENTER);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object buttonPressed = e.getSource();
    }

}