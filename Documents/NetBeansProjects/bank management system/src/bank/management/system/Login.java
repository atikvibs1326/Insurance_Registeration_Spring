package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//to create the desktop application we use swing to develop fastly
// we are using inheritance here by extending our class Login to Jframe for
//for using Jframe we need to import javax.swing we are not using javat.util.whatever
//why because Swing is  coming from java extended package  thats why we use javax .*; because we want to use all the java swing therefore

//we are making use of interface by implementing ActionListener inteface for using that we need to import java.awt.event to perform
//actions on the buttons or whatever also we need to overeride an abstract method down given actionEvent 
public class Login extends JFrame implements ActionListener{
     
    //gloabal variable declaration to use them all over not only in the 
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    //Login() is the constructor
    Login(){
        //setTitle set the title name for the Jrame
        setTitle("ATM");
        setLayout(null);
        //Why null because we are using our layout which is defined by using the setbounds 
        
        //to insert the image we need to use the Imageicon class for that we need to create object of the ImageIcon Class
        //in imageicon()parameter we use a ClassLoader class to get the source of our img
        //also we are using .getSystemResource which will go the actual location and fetch you image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));  
        //we cannot directly post the image on the Jframe we need to take variable and store that image to that variable
       
        //to use the image class we need to import awt
        //image i2 object is taking the i1 image by using the getimage()function and 
        //we are scaling the image to 100,100 and scaling the image to default 
        Image i2= i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        //Jlabel is like a variable
        //also we have scaled the i1 using the Image i2 variable but we cannot directly add image i2 to the label 
        //so we need to store image i2 into the ImageIcon varibel that is our third variable i3
        JLabel label= new JLabel(i3); 
        //setBound()function used to locate the positon and it is a custom layout of Text or img on the Jframe but it will still not work
        //beacuse we have to set layout for the Jrame but in our case we have set the image postion manuallu that is custom
        //so what we need to do is we have set the Layout to null which will allow our setBounds to place the image
       // also 70 is from the left side from the frame remember 10,from right and 100:length 100:width
        label.setBounds(70,10,100,100);
       //to add jlabel on the Jframe ,or any other compinent to the frame we use the add()funciton
        add(label);
        JLabel text =new JLabel ("WELCOME TO ATM");
        //to set and change the Font and fontsize we need to use the setfont() "Osward":font family Font.bold:style 38:size
        //remember we are creating new object inside text.setFont() function
        text.setFont(new Font("Osward",Font.BOLD,38));
        //remember we are using customLayout therfore using setbounds is necessary to place components on the frame
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        //for Card
        JLabel cardNo = new JLabel("Card No:");
        cardNo.setFont(new Font("Railway",Font.BOLD,28));
        cardNo.setBounds(120,150,150,30);
        add(cardNo);
        //inputbox for cardno
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font ("Arial",Font.BOLD,14));
        add(cardTextField);
       
        //for Pin
        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Railway",Font.BOLD,28));
        pin.setBounds(120,220,250,30);
        add(pin);
        //input for pin
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font ("Arial",Font.BOLD,14));
        add(pinTextField);
        
        //Button for login
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        //for background color of button and setforeground for textcolor on the button
        login.setBackground(Color.black);
        login.setForeground(Color.WHITE);
        //we are calling a function addActionListerner on the login button so that we get know  
        // every time the button  is clicked 
        login.addActionListener(this);
        add(login);
        
        //Button for Clear
        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        //Button for signup
        signup = new JButton("SIGN-UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
      
        
        //getcontentpane() is used to select all the Frame and setBackground is to set the background color
        getContentPane().setBackground(Color.cyan);
        
        
        //setsize sets the length and breadth of the Jframe
        setSize(800,480);
        //setvisible should be set to true because bydefault the frame is hidden
        setVisible(true); 
        //setLocation defines the opening location of the Jframe where 
        //320:Left and 200:Top
        setLocation(320,200);
        }
    //actionperforemend is used to get the action from above and perform something on that
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            //to clear the textfiled
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(ae.getSource() == login){
        
        }else if(ae.getSource() == signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    
    public static void main(String args[]) {
        //creating an object of our login
        new Login();
    }
}
