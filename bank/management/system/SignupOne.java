package bank.management.system;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


 
public class SignupOne extends JFrame implements ActionListener {
    long random;
     JTextField nameTextField, emailTextField,addressTextField,cityTextField,stateTextField,pinTextField,phoneTextField;
     JLabel formno,personalDetails,name,dob,gender,email,marritalStatus,address,city,state,pin,page,phone;
     JRadioButton male,female,other,married,single,others;
      JButton next;
      JDateChooser dateChooser;
     
    SignupOne(){
          setLayout(null);
    Random ran = new Random();
     random = Math.abs((ran.nextLong() % 9000L)+ 1000L);
    
     formno = new JLabel("APPLICATION FORM NO. "+random);
    formno.setFont(new Font("Raleway", Font.BOLD,30));
    formno.setBounds(150,20,600,30);
    add(formno);
    
     personalDetails = new JLabel("Personal Details");
    personalDetails.setFont(new Font("Raleway", Font.BOLD,25));
    personalDetails.setBounds(250,80,200,20);
    add(personalDetails);
    
       name = new JLabel("Name :");
    name.setFont(new Font("Raleway",Font.BOLD,15));
    name.setBounds(100,120,150,20);
    add(name);
    
     nameTextField = new JTextField();
    nameTextField.setFont(new Font("Raleway",Font.BOLD,13));
    nameTextField.setBounds(300,120,400,20);
    add(nameTextField);
    
     dob = new JLabel("DOB :");
    dob.setFont(new Font("Raleway", Font.BOLD,15));
    dob.setBounds(100,160,150,20);
    add(dob);
    
    
     dateChooser = new JDateChooser();
    dateChooser.setBounds(300,160,150,20);
    add(dateChooser);
    
     gender= new JLabel("Gender :");
    gender.setFont(new Font("Raleway", Font.BOLD,15));
    gender.setBounds(100,200,150,20);
    add(gender);
    
    
     male = new JRadioButton("Male");
    male.setBackground(Color.WHITE);
    male.setForeground(Color.black);
    male.setBounds(300,200,60,30);
    add(male);
    
    
     female = new JRadioButton("Female");
    female.setBackground(Color.WHITE);
    female.setForeground(Color.black);
    female.setBounds(430,200,90,30);
    add(female);
    
    
     other= new JRadioButton("Others");
    other.setBackground(Color.WHITE);
    other.setForeground(Color.black);
    other.setBounds(590,200,90,30);
    add(other);
    
    ButtonGroup genderGroup = new ButtonGroup();
    genderGroup.add(male);
    genderGroup.add(female);
    genderGroup.add(other);
    
    
     email= new JLabel("Email Address :");
    email.setFont(new Font("Raleway",Font.BOLD,15));
    email.setBounds(100,240,150,20);
    add(email);
    
     emailTextField = new JTextField();
    emailTextField.setFont(new Font("Raleway",Font.BOLD,13));
    emailTextField.setBounds(300,240,400,20);
    add(emailTextField);
    
     marritalStatus = new JLabel("Marrital Status :");
    marritalStatus.setFont(new Font("Raleway",Font.BOLD,15));
    marritalStatus.setBounds(100,280,150,20);
    add(marritalStatus);
    
     married= new JRadioButton("Married");
    married.setBackground(Color.WHITE);
    married.setForeground(Color.black);
    married.setBounds(300,280,90,30);
    add(married);
    
      single= new JRadioButton("Single");
    single.setBackground(Color.WHITE);
    single.setForeground(Color.black);
    single.setBounds(450,280,90,30);
    add(single);
    
     others = new JRadioButton("Others");
    others.setBackground(Color.WHITE);
    others.setForeground(Color.black);
    others.setBounds(610,280,100,30);
    add(others);
    
    ButtonGroup marritalStatusGroup = new ButtonGroup();
    marritalStatusGroup.add(married);
    marritalStatusGroup.add(single);
    marritalStatusGroup.add(others);
    
    
    
    
     address = new JLabel("Address: ");
    address.setFont(new Font("Raleway", Font.BOLD,15));
    address.setBounds(100,320,150,20);
    add(address);
    
     addressTextField = new JTextField();
    addressTextField.setFont(new Font("Raleway", Font.BOLD,13));
    addressTextField.setBounds(300,320,400,20);
    add(addressTextField);
    
    
     city = new JLabel("City: ");
    city.setFont(new Font("Raleway", Font.BOLD,15));
    city.setBounds(100,360,150,20);
    add(city);
    
     cityTextField = new JTextField();
    cityTextField.setFont(new Font("Raleway", Font.BOLD,13));
    cityTextField.setBounds(300,360,400,20);
    add(cityTextField);
    
    
     state = new JLabel("State: ");
    state.setFont(new Font("Raleway", Font.BOLD,15));
    state.setBounds(100,400,150,20);
    add(state);
    
     stateTextField = new JTextField();
    stateTextField.setFont(new  Font("Raleway",Font.BOLD, 13));
    stateTextField.setBounds(300,400,400,20);
    add(stateTextField);
    
     pin = new JLabel("Pin Code: ");
    pin.setFont(new Font("Raleway", Font.BOLD,15));
    pin.setBounds(100,440,150,20);
    add(pin);
    
     pinTextField = new JTextField();
    pinTextField.setFont(new Font("Raleway",Font.BOLD,13));
    pinTextField.setBounds(300,440,400,20);
    add(pinTextField);
    
    
     phone = new JLabel("Mob NO :");
    phone.setFont(new Font("Raleway",Font.BOLD,15));
    phone.setBounds(100,480,150,20);
    add(phone);
    
     phoneTextField = new JTextField();
    phoneTextField.setFont(new Font("Raleway",Font.BOLD,13));
    phoneTextField.setBounds(300,480,400,20);
    add(phoneTextField);
    
    
     page = new JLabel("Page 1");
    page.setFont(new Font("Raleway",Font.BOLD,13));
    page.setBounds(750,10,100,20);
    add(page);
    
    
     next = new JButton("Next");
    next.setBackground(Color.black);
    next.setForeground(Color.WHITE);
    next.setBounds(700,550,100,30);
    next.addActionListener(this);
    add(next);
    
    
        getContentPane().setBackground(Color.WHITE);
        setSize(850,700);
        setLocation(350,20);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
       String formno=""+random;
       String name=nameTextField.getText();
       String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
       String gender = null;
       if(male.isSelected()){
           gender= "Male";
       }else if(female.isSelected()){
           gender = "Female";
       }else if (other.isSelected()){
           gender = "Other";
       }
    String email= emailTextField.getText();
    String marritalStatus=null;
    if(married.isSelected()){
        marritalStatus = "married";
        
    }else if(single.isSelected()){
        marritalStatus = "Single";
    }else if(others.isSelected()){
        marritalStatus= "others";
    }
    String address = addressTextField.getText();
    String city = cityTextField.getText();
    String state= stateTextField.getText();
    String pin = pinTextField.getText();
    String phone = phoneTextField.getText();
    
    
    
    try{
        if(email.equals("")){
            JOptionPane.showMessageDialog(null,"Email is Required");
        }else {
            Conn c= new Conn();
            String query = "insert into signup values('"+formno+"','"+name+"', "
                    + "'"+dob+"','"+gender+"','"+email+"','"+marritalStatus+"',"
                    + "'"+address+"','"+city+"','"+state+"','"+pin+"','"+phone+"')";
            c.s.executeUpdate(query);
            
             setVisible(false);
            new SignupTwo(formno).setVisible(true);
        }
    }catch(Exception e){
        System.out.println(e);
    }
        
}
    public static void main(String args[]){
        new SignupOne();
        
    }
    
}
