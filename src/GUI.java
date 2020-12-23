import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI implements ActionListener{

    private int count = 0;
    private JFrame frame;
    private JPanel panel;
    private JLabel label;

    public GUI() {
        frame = new JFrame();
        JButton anime_menu = new JButton("Anime");
        JButton drama_menu = new JButton("Dramas");
        anime_menu.addActionListener(this);

        label = new JLabel("Clicked");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(anime_menu);
        panel.add(drama_menu);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Anime/Drama Log");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Clicked: " + count);
    }
}
