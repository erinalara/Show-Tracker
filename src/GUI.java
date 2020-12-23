import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;

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
    private JComboBox list = new JComboBox();
    private JComboBox list2 = new JComboBox();



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

        String[] genres = {"Action", "Comedy", "Romance", "Slice of Life", "Thriller"};
        list = new JComboBox(genres);

        String[] languages = {"English", "Japanese", "Korean", "Taiwanese"};
        list2 = new JComboBox(languages);




        label = new JLabel("Erina Lara. 12/22/2020.");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(80, 100, 80, 100));
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
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

    private void addAnime() {
        frame.setVisible(false);

        frame = new JFrame();


        label = new JLabel("Title: ");
        JLabel l2 = new JLabel("Genre: ");
        JLabel l3 = new JLabel("Year: ");
        JLabel spacer = new JLabel("");
        JButton submit = new JButton("Submit");

        JTextField title = new JTextField();
        JTextField year = new JTextField();
        submit.addActionListener(this);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setLayout(new GridLayout(0,1));
        panel.setPreferredSize(new Dimension(350,320));

        panel.add(label);
        panel.add(title);
        panel.add(l2);
        panel.add(list);
        panel.add(l3);
        panel.add(year);
        panel.add(spacer);
        panel.add(submit);

        back.addActionListener(this);
        panel.add(back);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Add Anime");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void addDrama() {
        frame.setVisible(false);

        frame = new JFrame();


        label = new JLabel("Title: ");
        JLabel l2 = new JLabel("Genre: ");
        JLabel l3 = new JLabel("Year: ");
        JLabel l4 = new JLabel("Language: ");
        JLabel spacer = new JLabel("");
        JButton submit = new JButton("Submit");

        JTextField title = new JTextField();
        JTextField year = new JTextField();
        submit.addActionListener(this);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setLayout(new GridLayout(0,1));
        panel.setPreferredSize(new Dimension(350,380));

        panel.add(label);
        panel.add(title);
        panel.add(l2);
        panel.add(list);
        panel.add(l3);
        panel.add(year);
        panel.add(l4);
        panel.add(list2);
        panel.add(spacer);
        panel.add(submit);

        back.addActionListener(this);
        panel.add(back);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Add Drama");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == showAnime) {

            frame.setVisible(false);
            frame = new JFrame();

            label = new JLabel("Watched Anime List: ");


            panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(80, 100, 80, 100));
            panel.setLayout(new GridLayout(0, 1));

            panel.add(label);

            back.addActionListener(this);
            panel.add(back);

            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Anime/Drama Log");
            frame.pack();
            frame.setLocationRelativeTo(null);

            frame.setVisible(true);
        }

        else if (e.getSource() == showDrama) {
            frame.setVisible(false);
            frame = new JFrame();

            label = new JLabel("Watched Drama List: ");

            panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(80, 100, 80, 100));
            panel.setLayout(new GridLayout(0, 1));

            panel.add(label);

            back.addActionListener(this);
            panel.add(back);

            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Anime/Drama Log");
            frame.pack();
            frame.setLocationRelativeTo(null);

            frame.setVisible(true);
        }

        else if (e.getSource() == addAnime) {
            addAnime();
        }

        else if (e.getSource() == addDrama) {
            addDrama();
        }

        else if (e.getSource() == back) {
            frame.setVisible(false);
            new GUI();
        }
    }
}
