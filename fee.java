import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
public class fee extends Frame {
  
    JLabel l0, l1, l2, l3, l4,
        l5, l6, l7, l8,
        l9, l10, l11, l12, l13,
        l14, l15, l16;
  
    JTextField tf1, tf2, tf3,
        tf4, tf5, tf6,
        tf7, tf8, tf9,
        tf10;
  
    JTextArea area2, area1;
  
    JRadioButton rb3,
        rb5, rb6,
        rb7;
  
    JFileChooser f1;
    fee()
    {
        l0 = new JLabel("Welcome to Dwarkadas J. Sanghvi College of Engineering");
        l0.setBounds(600, 50, 400, 50);

        l1 = new JLabel("Fee Structure");
        l1.setBounds(600, 150, 250, 20);
  
        l2 = new JLabel(
            "Name of the Student:");
        l2.setBounds(50, 150, 250, 20);
  
        tf1 = new JTextField();
        tf1.setBounds(250, 150, 250, 20);
  
        l3 = new JLabel(
            "Name of the Father:");
        l3.setBounds(50, 200, 250, 20);
  
        tf2 = new JTextField();
        tf2.setBounds(250, 200, 250, 20);
  
        l4 = new JLabel("Roll Number:");
        l4.setBounds(50, 250, 250, 20);
  
        tf3 = new JTextField();
        tf3.setBounds(250, 250, 250, 20);
  
        l5 = new JLabel("Email ID:");
        l5.setBounds(50, 300, 250, 20);
  
        tf4 = new JTextField();
        tf4.setBounds(250, 300, 250, 20);
  
        l6 = new JLabel("Contact Number:");
        l6.setBounds(50, 350, 250, 20);
  
        tf5 = new JTextField();
        tf5.setBounds(250, 350, 250, 20);
  
        l7 = new JLabel("Address:");
        l7.setBounds(50, 400, 250, 20);
  
        area1 = new JTextArea();
        area1.setBounds(250, 400, 250, 90);
  
        l9 = new JLabel("Gender:");
        l9.setBounds(50, 500, 250, 20);
  
        JRadioButton r5
            = new JRadioButton(" Male");
        JRadioButton r6
            = new JRadioButton(" Female");
  
        r5.setBounds(250, 500, 100, 30);
        r6.setBounds(350, 500, 100, 30);
  
        ButtonGroup bg = new ButtonGroup();
        bg.add(r5);
        bg.add(r6);
  
        l10 = new JLabel("Nationality:");
        l10.setBounds(50, 550, 250, 20);
  
        tf6 = new JTextField();
        tf6.setBounds(250, 550, 250, 20);
  
        l11 = new JLabel(
            "Year of passing 10th");
        l11.setBounds(50, 600, 250, 20);
  
        String language[]
            = { "2019", "2018", "2017" };
  
        final JComboBox cb1
            = new JComboBox(language);
  
        cb1.setBounds(250, 600, 90, 20);
  
        l12 = new JLabel(
            "Year of passing 12th");
        l12.setBounds(50, 650, 250, 20);
  
        String languagess[]
            = { "2022", "2021", "2020" };
  
        l13 = new JLabel(
            "Percentage in 10th:");
        l13.setBounds(50, 700, 250, 20);
  
        tf7 = new JTextField();
        tf7.setBounds(250, 700, 250, 20);
  
        l14 = new JLabel("Percentage in 12th:");
        l14.setBounds(50, 750, 250, 20);
  
        tf8 = new JTextField();
        tf8.setBounds(250, 750, 250, 20);
  
  
        final JComboBox cb2
            = new JComboBox(languagess);
  
        cb2.setBounds(250, 650, 90, 20);
        l8 = new JLabel(
            "Courses available here are:");
        l8.setBounds(800, 150, 250, 20);
  
        rb3 = new JRadioButton("HOSTEL");
        rb3.setBounds(600, 200, 100, 30);
  
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(rb3);

        l15 = new JLabel(
            "Select your selected course:");
        l15.setBounds(600, 270, 250, 20);

        l16 = new JLabel(
            "Hostel Type:");
        l16.setBounds(800, 270, 250, 20);
  
        String languages[]
            = { "CSE", "ECE", "EEE",
                "CIVIL", "MECH" };
        final JComboBox cb
            = new JComboBox(languages);
        cb.setBounds(800, 200, 90, 20);
  
        final JLabel label
            = new JLabel();
        label.setBounds(600, 430, 600, 30);
        JButton b = new JButton("Show");
        b.setBounds(1000, 300, 80, 30);
  
        final DefaultListModel<String> li1
            = new DefaultListModel<>();
  
        li1.addElement("CSE(2, 50, 000)");
        li1.addElement("ECE(2, 50, 000)");
        li1.addElement("EEE(2, 50, 000)");
        li1.addElement("MECH(2, 50, 000)");
        li1.addElement("CIVIL(2, 50, 000)");
  
        final JList<String> list1
            = new JList<>(li1);
  
        list1.setBounds(600, 300, 125, 125);
  
        DefaultListModel<String> li2
            = new DefaultListModel<>();
  
        li2.addElement(
            "2 SHARE(1, 50, 000)");
        li2.addElement(
            "3 SHARE(1, 40, 000)");
        li2.addElement(
            "4 SHARE(1, 20, 000)");
  
        final JList<String> list2
            = new JList<>(li2);
        list2.setBounds(
            800, 300, 125, 125);
  
        JButton Receipt
            = new JButton("Generate Receipt");
        Receipt.setBounds(600, 490, 150, 30);
        JButton b2 = new JButton("Reset");
        b2.setBounds(750, 490, 150, 30);
  
        area2 = new JTextArea();
        area2.setBounds(600, 540, 450, 240);
  
        
        add(l0);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        add(l11);
        add(l12);
        add(l13);
        add(l14);
        add(l15);
        add(l16);
        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        add(tf5);
        add(tf6);
        add(tf7);
        add(tf8);
        add(area1);
        add(area2);
        add(rb3);
        add(r5);
        add(r6);
        add(cb);
        add(cb1);
        add(cb2);
        add(list1);
        add(list2);
        add(b);
        add(label);
        add(Receipt);
        add(b2);
  
        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                String data = "";
                if (list1.getSelectedIndex() != -1) {
                    data = "You had selected the Group:"
                           + list1.getSelectedValue();
                    label.setText(data);
                }
                if (list2.getSelectedIndex() != -1) {
                    data += " and Hostel with the "
                            + "facility of: "+ list2.getSelectedValue();
                            label.setText(data);
                }
                
            }
        });
        b2.addActionListener(
            new ActionListener() {
                public void actionPerformed(
                    ActionEvent e)
                {
                    area2.setText("");
                    area1.setText(" ");
                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    tf4.setText("");
                    tf5.setText("");
                    tf6.setText(" ");
                    tf7.setText(" ");
                    tf8.setText(" ");
                    bg.clearSelection();
                    r5.setSelected(false);
                    bg.clearSelection();
                    r6.setSelected(false);
                    bg2.clearSelection();
                    rb3.setSelected(false);
                    list1.clearSelection();
                    list2.clearSelection();
                    label.setText(" ");
                }
            });
  
        Receipt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
  
                area2.setText(
                    "--------------------------------"
                    + "-----------FEE RECEIPT----"
                    + "--------------------------"
                    + "--------------------------"
                    + "-------------------\n");
  
                area2.setText(area2.getText()
                              + "Student Name: "
                              + tf1.getText()
                              + "\n");
                area2.setText(area2.getText()
                              + "Father's Name: "
                              + tf2.getText()
                              + "\n");
                area2.setText(area2.getText()
                              + "RollNumber: "
                              + tf3.getText()
                              + "\n");
                area2.setText(area2.getText()
                              + "Email ID: "
                              + tf4.getText()
                              + "\n");
                area2.setText(area2.getText()
                              + "Contact Number: "
                              + tf5.getText()
                              + "\n");
                area2.setText(area2.getText()
                              + "Wants to take: "
                              + cb.getSelectedItem()
                                    .toString()
                              + "\n");
  
                if (rb3.isSelected()) {
                    area2.setText(area2.getText()
                                  + "Wants to Live in a "
                                  + "Hostel\n");
                }
                area2.setText(area2.getText()
                              + "Had chosen: "
                              + list1.getSelectedValue()
                                    .toString()
                              + "\n");
                area2.setText(area2.getText()
                              + "Had chosen: "
                              + list2.getSelectedValue()
                                    .toString()
                              + "\n");
  
                int index2 = list2.getSelectedIndex();
                if (index2 == 0) {
                    area2.setText(area2.getText()
                                  
                                  + "Total amount to be "
                                  + "paid is 4 Lakhs   \n");
                }
  
                if (index2 == 1) {
                    area2.setText(area2.getText()
                                  
                                  + "Total amount to be paid "
                                  + "is 3.9 Lakhs   \n");
                }
  
                if (index2 == 2) {
                    area2.setText(area2.getText()
                                  
                                  + "Total amount to be paid "
                                  + "is 3.7 Lakhs   \n");
                }
  
                if (e.getSource() == Receipt) {
                    try {
                        FileWriter fw
                            = new FileWriter(
                                "java.txt", true);
                        fw.write(area2.getText());
                        fw.close();
                    }
                    catch (Exception ae) {
                        System.out.println(ae);
                    }
                }
  
                JOptionPane.showMessageDialog(
                    area2, "DATA SAVED SUCCESSFULLY");
            };
        });
        addWindowListener(
            new WindowAdapter() {
                public void windowClosing(
                    WindowEvent we)
                {
                    System.exit(0);
                }
            });
        setSize(1000, 1000);
        setLayout(null);
        setVisible(true);
        setBackground(Color.pink);
    }
    public static void main(String[] args)
    {
        new fee();
    }
}