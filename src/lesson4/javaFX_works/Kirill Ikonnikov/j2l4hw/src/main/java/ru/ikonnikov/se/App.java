package ru.ikonnikov.se;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        new Chat();
    }
}

        class Chat extends JFrame{
            public Chat () throws HeadlessException {
                setTitle("Chat");
                 setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                 setBounds(400, 400, 500, 500);
                 JPanel bottomPanel = new JPanel();
                 JPanel centerPanel = new JPanel();

                 centerPanel.setBackground(Color.gray);
                 bottomPanel.setBackground(Color.darkGray);

                 bottomPanel.setPreferredSize(new Dimension(20,60));
                 add(bottomPanel, BorderLayout.SOUTH);
                 add(centerPanel, BorderLayout.CENTER);
                 bottomPanel.setLayout(new FlowLayout());
                 centerPanel.setLayout(new BorderLayout());

                JButton kn = new JButton("Send");

                final JTextArea jta = new JTextArea();
                JScrollPane jsp = new JScrollPane(jta);
                centerPanel.add(jsp, BorderLayout.CENTER);

                final JTextField jtf = new JTextField();
                jtf.setPreferredSize(new Dimension(300, 28));

                jta.setEditable(false);

                kn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jta.append(jtf.getText() + "\n");
                        jtf.setText("");
                        jtf.grabFocus();
                    }
                });

                bottomPanel.add(jtf);
                bottomPanel.add(kn);



                 setVisible(true);

            }
        }
