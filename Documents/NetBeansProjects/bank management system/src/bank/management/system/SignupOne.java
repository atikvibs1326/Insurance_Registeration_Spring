package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
//import toedter.calendar.JDateChooser;
import java.awt.event.*;

/**
 *
 * @author 91915
 */
public class SignupOne extends JFrame implements ActionListener {

    Long random;
    JTextField nameTextField, fnameTextField, addressTextField, emailTextField, pinTextField, cityTextField, stateTextField, dobTextField;

    JButton next;
    JRadioButton male, female, other, married, unmarried;
    //JDateChooser dateChooser;

    SignupOne() {
        setLayout(null);
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);

//Form no:
        JLabel formno = new JLabel("APPLICATION FORM No:" + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 28));
        formno.setBounds(200, 20, 600, 40);
        add(formno);
//PAge1        
        JLabel personalDetails = new JLabel("Page:1 Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);

//name
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 22));
        name.setBounds(100, 140, 100, 30);
        add(name);
        //textfield
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

//father's nmae      
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 22));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        //textfield
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);

//DateofBirth
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Railway", Font.BOLD, 22));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        //importing the 
//        dateChooser = new JDateChooser();
//        dateChooser.setBounds(300, 240, 400, 30);
//        dateChooser.setForeground(new Color(105, 105, 105, 105));
//        add(dateChooser);

//Gender
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Railway", Font.BOLD, 22));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

//email
        JLabel email = new JLabel("E-Mail Address:");
        email.setFont(new Font("Railway", Font.BOLD, 22));
        email.setBounds(100, 340, 200, 30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);

//martial
        JLabel martial = new JLabel("Martial Status:");
        martial.setFont(new Font("Railway", Font.BOLD, 22));
        martial.setBounds(100, 390, 200, 30);
        add(martial);

        married = new JRadioButton("married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        ButtonGroup martialgroup = new ButtonGroup();
        martialgroup.add(married);
        martialgroup.add(unmarried);

//address
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 22));
        address.setBounds(100, 440, 200, 30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);

//City
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Railway", Font.BOLD, 22));
        city.setBounds(100, 490, 200, 30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);
//state
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 22));
        state.setBounds(100, 540, 200, 30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);

//Pincode
        JLabel pincode = new JLabel("PinCode:");
        pincode.setFont(new Font("Railway", Font.BOLD, 22));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        pinTextField.setBounds(300, 590, 400, 30);
        add(pinTextField);

//button
        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 16));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.cyan);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;//long
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
       // String dob =((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }
        String email = emailTextField.getText();
        String martial = null;
        if (married.isSelected()) {
            martial = "Married";
        } else if (unmarried.isSelected()) {
            martial = "Unmarried";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();

        try {
            if (email.isBlank()) {
                JOptionPane.showMessageDialog(null, "Insufficient Data");
//            } else if (dob == null) {
//                JOptionPane.showMessageDialog(null, "Please select a valid date of birth.");
            }else if (name.isBlank()) {
                JOptionPane.showMessageDialog(null, "Father's name is Required!");
            } else if (fname.isBlank()) {
                JOptionPane.showMessageDialog(null, "Father's name is Required!");
            } else if (!email.matches("^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$")) {
                JOptionPane.showMessageDialog(this, "Please enter a valid email address", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (pin.length() != 6 || !pin.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Please enter a valid 6-digit PIN code", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                Conn c = new Conn();
      //          String query = "insert into signup values('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + martial + "','" + address + "','" + city + "','" + pin + "','" + state + "')";
               // c.s.executeUpdate(query);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new SignupOne();
    }

}
