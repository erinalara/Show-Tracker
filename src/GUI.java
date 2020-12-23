import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI implements ActionListener{

    private int count = 0;
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton showAnime;
    private JButton showDrama;
    private JButton addAnime;
    private JButton addDrama;
    private JButton back = new JButton("Return");

    public GUI() {
        frame = new JFrame();
        showAnime = new JButton("Show Anime");
        showDrama = new JButton("Show Dramas");
        addAnime = new JButton("Add Anime");
        addDrama = new JButton("Add Dramas");

        showAnime.addActionListener(this);
        showDrama.addActionListener(this);
        addAnime.addActionListener(this);
        addDrama.addActionListener(this);



        label = new JLabel("Erina Lara. 12/22/2020.");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
        panel.setLayout(new GridLayout(0,1));
        panel.add(addAnime);
        panel.add(addDrama);
        panel.add(showAnime);
        panel.add(showDrama);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Anime/Drama Log");
        frame.pack();
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == showAnime) {

            frame.setVisible(false);
            frame = new JFrame();

            label = new JLabel("Watched Anime List: ");


            panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
            panel.setLayout(new GridLayout(0, 1));

            panel.add(label);

            back.addActionListener(this);
            panel.add(back);

            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Anime/Drama Log");
            frame.pack();
            frame.setVisible(true);
        }

        else if (e.getSource() == showDrama) {
            frame.setVisible(false);
            frame = new JFrame();

            label = new JLabel("Watched Drama List: ");

            panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
            panel.setLayout(new GridLayout(0, 1));

            panel.add(label);

            back.addActionListener(this);
            panel.add(back);

            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Anime/Drama Log");
            frame.pack();
            frame.setVisible(true);
        }

        else if (e.getSource() == addAnime) {
            frame.setVisible(false);
            frame = new JFrame();

            label = new JLabel("Add Anime");

            panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
            panel.setLayout(new GridLayout(0, 1));

            panel.add(label);

            back.addActionListener(this);
            panel.add(back);

            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Anime/Drama Log");
            frame.pack();
            frame.setVisible(true);
        }

        else if (e.getSource() == addDrama) {
            frame.setVisible(false);
            frame = new JFrame();

            label = new JLabel("Add Drama");

            panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
            panel.setLayout(new GridLayout(0, 1));

            panel.add(label);

            back.addActionListener(this);
            panel.add(back);

            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Anime/Drama Log");
            frame.pack();
            frame.setVisible(true);
        }

        else if (e.getSource() == back) {
            frame.setVisible(false);
            new GUI();
        }
    }
}
