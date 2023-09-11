package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author 91915
 */
public class SignupTwo extends JFrame implements ActionListener {
    
    long random;
    JTextField panTextField, adharTextField;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, occupation, income, education;
    String formno;

    SignupTwo(String formno) {
        this.formno=formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM-PAGE 2");

//PAge1        
        JLabel additionalDetails = new JLabel("Page:2 Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

//name
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 22));
        name.setBounds(100, 140, 100, 30);
        add(name);

        String valreligion[] = {"Hindu", "Muslim", "Christian,Sikh", "Other"};
        JComboBox religion = new JComboBox(valreligion);
        religion.setBounds(300, 140, 400, 30);
        add(religion);

//father's nmae      
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 22));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        String valcategory[] = {"Open", "Genral", "OBC", "ST", "SC", "Other"};
        JComboBox category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        add(category);

//DateofBirth
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Railway", Font.BOLD, 22));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        String valincome[] = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000"};
        JComboBox income = new JComboBox(valincome);
        income.setBounds(300, 190, 400, 30);
        add(income); 

//Gender
        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Railway", Font.BOLD, 22));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Railway", Font.BOLD, 22));
        email.setBounds(100, 315, 200, 30);
        add(email);

        String eduval[] = {"Non-Graduation", "Graduate", "Post-Graduate", "Doctrate", "Others"};
        JComboBox education = new JComboBox(eduval);
        education.setBounds(300, 305, 400, 30);
        add(education);
//martial
        JLabel martial = new JLabel("Occupation:");
        martial.setFont(new Font("Railway", Font.BOLD, 22));
        martial.setBounds(100, 390, 200, 30);
        add(martial);

        String occup[] = {"Salaried", "Self-Employeed", "Bussiness", "Student", "Retired", "Others"};
        JComboBox occupation = new JComboBox(occup);
        occupation.setBounds(300, 390, 400, 30);
        add(occupation);

//address
        JLabel pan = new JLabel("Pan No:");
        pan.setFont(new Font("Raleway", Font.BOLD, 22));
        pan.setBounds(100, 440, 200, 30);
        add(pan);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);

//City
        JLabel adhar = new JLabel("Adhaar No:");
        adhar.setFont(new Font("Railway", Font.BOLD, 22));
        adhar.setBounds(100, 490, 200, 30);
        add(adhar);

        adharTextField = new JTextField();
        adharTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        adharTextField.setBounds(300, 490, 400, 30);
        add(adharTextField);
//state
        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway", Font.BOLD, 22));
        state.setBounds(100, 540, 200, 30);
        add(state);

        syes = new JRadioButton("YES");
        syes.setBounds(300, 390, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 390, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup martialgroup = new ButtonGroup();
        martialgroup.add(syes);
        martialgroup.add(sno);

//Pincode
        JLabel pincode = new JLabel("Existing Customer:");
        pincode.setFont(new Font("Railway", Font.BOLD, 22));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

          eyes = new JRadioButton("YES");
        eyes.setBounds(300, 390, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 390, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup emartialgroup = new ButtonGroup();
       emartialgroup.add(eyes);
        emartialgroup.add(eno);


//button
        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 16));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;//long
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if (syes.isSelected()) {
            seniorcitizen = "YES";
        } else if (sno.isSelected()) {
            seniorcitizen = "NO";
        }

        String existingacc = null;
        if (eyes.isSelected()) {
            existingacc = "YES";
        } else if (eno.isSelected()) {
            existingacc = "NO";
        }
        String pan = panTextField.getText();
        String adhar = adharTextField.getText();
        

        try{
            
            setVisible(false);
            new SignupTwo(formno).setVisible(true);
        
        }catch(Exception e){
            System.out.println( e);
        }
    }

    public static void main(String args[]) {
        new SignupTwo("");
    }

}
