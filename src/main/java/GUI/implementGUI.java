package GUI;

import javax.swing.*;

public class implementGUI {
    protected JFrame mainFrame = new JFrame();
    protected JPanel mainPanel = new JPanel();
    public implementGUI()
    {
            mainFrame.setSize(700,700);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setVisible(true);
            mainFrame.setLocationRelativeTo(null);
            mainFrame.add(mainPanel);
            mainPanel.setLayout(null);

    }
}
