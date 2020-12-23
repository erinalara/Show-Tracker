import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class GUI implements ActionListener{

    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton showAnime;
    private JButton showDrama;
    private JButton addAnime;
    private JButton addDrama;
    private JButton submitAnime;
    private JButton submitDrama;
    private JButton back = new JButton("Return");
    private JComboBox<String> list = new JComboBox();
    private JComboBox<String> list2 = new JComboBox();
    private JTextField title;
    private JTextField year;

    private ArrayList<Anime> animelist = readAnime();
    private ArrayList<Drama> dramalist = readDrama();

    private String memAddress = FilePath.getMemAddress();





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

    private void addAnimeUI() {
        frame.setVisible(false);

        frame = new JFrame();


        label = new JLabel("Title: ");
        JLabel l2 = new JLabel("Genre: ");
        JLabel l3 = new JLabel("Year: ");
        JLabel spacer = new JLabel("");
        submitAnime = new JButton("Submit");

        JTextField title = new JTextField();
        JTextField year = new JTextField();
        submitAnime.addActionListener(this);

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
        panel.add(submitAnime);

        back.addActionListener(this);
        panel.add(back);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Add Anime");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void addDramaUI() {
        frame.setVisible(false);

        frame = new JFrame();


        label = new JLabel("Title: ");
        JLabel l2 = new JLabel("Genre: ");
        JLabel l3 = new JLabel("Year: ");
        JLabel l4 = new JLabel("Language: ");
        JLabel spacer = new JLabel("");
        submitDrama = new JButton("Submit");

        JTextField title = new JTextField();
        JTextField year = new JTextField();
        submitDrama.addActionListener(this);

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
        panel.add(submitDrama);

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
            addAnimeUI();
        }

        else if (e.getSource() == addDrama) {
            addDramaUI();
        }

        else if (e.getSource() == submitAnime) {
            String t = title.getText();
            int y = Integer.parseInt(year.getText());
            String genre = (String) list.getSelectedItem();
            Anime add = new Anime(t,genre,y);
            animelist.add(add);
            writeAnime(animelist);


        }

        else if (e.getSource() == submitDrama) {
            String t = title.getText();
            int y = Integer.parseInt(year.getText());
            String genre = (String) list.getSelectedItem();
            String l = (String) list2.getSelectedItem();
            Drama add = new Drama(t,genre,l,y);
            dramalist.add(add);
            writeDrama(dramalist);
        }

        else if (e.getSource() == back) {
            frame.setVisible(false);
            new GUI();
        }
    }

    public static ArrayList<Anime> readAnime() {

        String memAddress = FilePath.getMemAddress();

        ArrayList<Anime> animelist = new ArrayList<>();

        try {

            Scanner read = new Scanner(new File(memAddress + "animelist.txt"));

            do {

                String line = read.nextLine();

                String[] tokens = line.split(";");

                animelist.add(new Anime(tokens[0], tokens[1], Integer.parseInt(tokens[2])));
            } while (read.hasNext());
        }
        catch (FileNotFoundException fnf) {

            System.out.println("File not found");

        }

        return animelist;
    }

    public static void writeAnime(ArrayList<Anime> animelist) {

        String memAddress = FilePath.getMemAddress();

        try {

            PrintWriter write = new PrintWriter(memAddress + "animelist.txt");

            for (Anime i : animelist) {
                write.println(i.getName() + ";" + i.getGenre() +";" + i.getYear());
            }

            write.close();

        } catch (FileNotFoundException fnf) {

            System.out.println("File not found");

        }
    }

    public static ArrayList<Drama> readDrama() {

        String memAddress = FilePath.getMemAddress();

        ArrayList<Drama> dramalist = new ArrayList<>();

        try {

            Scanner read = new Scanner(new File(memAddress + "dramalist.txt"));

            do {

                String line = read.nextLine();

                String[] tokens = line.split(";");

                dramalist.add(new Drama(tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3])));
            } while (read.hasNext());
        }
        catch (FileNotFoundException fnf) {

            System.out.println("File not found");

        }

        return dramalist;
    }

    public static void writeDrama(ArrayList<Drama> dramalist) {

        String memAddress = FilePath.getMemAddress();

        try {

            PrintWriter write = new PrintWriter(memAddress + "dramalist.txt");

            for (Drama i : dramalist) {
                write.println(i.getName() + ";" + i.getGenre() +";" + i.getLanguage() + ";" + i.getYear());
            }

            write.close();

        } catch (FileNotFoundException fnf) {

            System.out.println("File not found");

        }
    }



    // Main
    public static void main (String[] args) {

        String memAddress = FilePath.getMemAddress();
        new GUI();
    }
}
