package vue.palette;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulaire extends JFrame  {
    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
   private JPanel panel;
    private JPanel panel_1 ;
    private JPanel panel_2 ;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JLabel lblNewLabel_5;
    private JLabel lblNewLabel_6;
    private JLabel lblNewLabel_7;
    private JLabel lblNewLabel_8;
    private JLabel lblNewLabel_9;
    private JLabel lblNewLabel_10;
    private JLabel lblNewLabel_11;
    private JLabel lblNewLabel_12;
    private JLabel lblNewLabel_13;

    private JButton btnNewButton_2 ;
    private JButton btnNewButton_1 ;
    private JButton btnNewButton ;


   void init() {

         panel = new JPanel();
        panel.setLayout(null);
         panel_1 = new JPanel();
        panel_1.setBackground(new Color(192, 192, 192));
        panel_1.setBounds(0, 0, 487, 64);
        panel.add(panel_1);
        panel_1.setLayout(null);

         lblNewLabel = new JLabel("Formulaire");
        lblNewLabel.setBounds(194, 20, 90, 21);
        panel_1.add(lblNewLabel);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));

         panel_2 = new JPanel();
        panel_2.setBackground(new Color(192, 192, 192));
        panel_2.setBounds(0, 553, 487, 59);
        panel.add(panel_2);
        panel_2.setLayout(null);

        btnNewButton_2 = new JButton("New button");
        btnNewButton_2.setBounds(64, 10, 85, 21);
        panel_2.add(btnNewButton_2);

        btnNewButton_1 = new JButton("New button");
        btnNewButton_1.setBounds(187, 10, 85, 21);
        panel_2.add(btnNewButton_1);

        btnNewButton = new JButton("New button");
        btnNewButton.setBounds(316, 10, 85, 21);
        panel_2.add(btnNewButton);

         lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(Formulaire.class.getResource("/img/prenom.png")));
        lblNewLabel_2.setBounds(36, 151, 45, 27);
        panel.add(lblNewLabel_2);

         lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon(Formulaire.class.getResource("/img/mail.png")));
        lblNewLabel_3.setBounds(36, 194, 56, 32);
        panel.add(lblNewLabel_3);

         lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon(Formulaire.class.getResource("/img/user.png")));
        lblNewLabel_4.setBounds(36, 242, 30, 39);
        panel.add(lblNewLabel_4);

         lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setIcon(new ImageIcon(Formulaire.class.getResource("/img/telephone-call.png")));
        lblNewLabel_5.setBounds(36, 303, 45, 21);
        panel.add(lblNewLabel_5);

        textField = new JTextField();
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        textField.setBounds(113, 254, 127, 21);
        panel.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(113, 299, 127, 21);
        panel.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(113, 90, 130, 19);
        panel.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(113, 151, 127, 19);
        panel.add(textField_3);
        textField_3.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setBounds(110, 207, 130, 19);
        panel.add(textField_4);
        textField_4.setColumns(10);

        textField_5 = new JTextField();
        textField_5.setBounds(113, 344, 127, 19);
        panel.add(textField_5);
        textField_5.setColumns(10);

        textField_6 = new JTextField();
        textField_6.setBounds(113, 381, 127, 19);
        panel.add(textField_6);
        textField_6.setColumns(10);

        textField_7 = new JTextField();
        textField_7.setBounds(112, 411, 128, 19);
        panel.add(textField_7);
        textField_7.setColumns(10);

         lblNewLabel_6 = new JLabel("");
        lblNewLabel_6.setIcon(new ImageIcon(Formulaire.class.getResource("/img/id-card.png")));
        lblNewLabel_6.setBounds(36, 350, 45, 13);
        panel.add(lblNewLabel_6);

         lblNewLabel_7 = new JLabel("");
        lblNewLabel_7.setIcon(new ImageIcon(Formulaire.class.getResource("/img/company.png")));
        lblNewLabel_7.setBounds(25, 384, 45, 13);
        panel.add(lblNewLabel_7);

         lblNewLabel_8 = new JLabel("");
        lblNewLabel_8.setIcon(new ImageIcon(Formulaire.class.getResource("/img/password.png")));
        lblNewLabel_8.setBounds(25, 414, 45, 27);
        panel.add(lblNewLabel_8);

        textField_8 = new JTextField();
        textField_8.setBounds(122, 448, 96, 19);
        panel.add(textField_8);
        textField_8.setColumns(10);

        textField_9 = new JTextField();
        textField_9.setBounds(113, 477, 96, 19);
        panel.add(textField_9);
        textField_9.setColumns(10);

        textField_10 = new JTextField();
        textField_10.setBounds(113, 506, 96, 19);
        panel.add(textField_10);
        textField_10.setColumns(10);

         lblNewLabel_9 = new JLabel("");
        lblNewLabel_9.setIcon(new ImageIcon(Formulaire.class.getResource("/img/password.png")));
        lblNewLabel_9.setBounds(36, 451, 45, 27);
        panel.add(lblNewLabel_9);

         lblNewLabel_10 = new JLabel("");
        lblNewLabel_10.setIcon(new ImageIcon(Formulaire.class.getResource("/img/sex.png")));
        lblNewLabel_10.setBounds(36, 509, 45, 21);
        panel.add(lblNewLabel_10);

         lblNewLabel_11 = new JLabel("");
        lblNewLabel_11.setIcon(new ImageIcon(Formulaire.class.getResource("/img/biometrics.png")));
        lblNewLabel_11.setBounds(36, 82, 45, 27);
        panel.add(lblNewLabel_11);


    }
    public Formulaire(){
       init();
       this.setVisible(true);
        this.setBounds(100, 100, 450, 640);
        this.setResizable(true);
        this.getContentPane().add(panel, BorderLayout.CENTER);

        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}

