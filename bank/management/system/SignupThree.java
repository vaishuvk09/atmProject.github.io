package bank.management.system;
import javax.swing.*;
import java. awt.*;
import java.awt.event.*;
import java.util.*;


public class SignupThree extends JFrame implements ActionListener {
    JLabel accounttype, l1, card, number, pnumber, pin, details, pdetails,services, page;
    JRadioButton r1, r2,r3, r4;
    JCheckBox c1,c2, c3, c4, c5,c6,c7;
    JButton submit, cancel;
    String formno;
    
    SignupThree(String formno){
        this.formno = formno;
        setLayout(null);
        
        l1=  new JLabel ("Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD,30));
        l1.setBounds(250,20,400,30);
        add(l1);
        
        
        accounttype=  new JLabel ("Account Type");
        accounttype.setFont(new Font("Raleway", Font.BOLD,20));
        accounttype.setBounds(100,100,150,30);
        add(accounttype);
        
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,150,200,25);
        add(r1);
        
        
        r2 = new JRadioButton("Fixed Deposite Account");
        r2.setFont(new Font("Raleway", Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(400,150,250,25);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,190,200,25);
        add(r3);
        
        r4 = new JRadioButton("Reccuring Deposite Account");
        r4.setFont(new Font("Raleway", Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(400,190,250,25);
        add(r4);
        
        ButtonGroup groupaccounts = new ButtonGroup();
        groupaccounts.add(r1);
        groupaccounts.add(r2);
        groupaccounts.add(r3);
        groupaccounts.add(r4);
        
        
        card =new JLabel("Card Number");
        card.setFont(new Font("Raleway", Font.BOLD,20));
        card.setBounds(100,250,150,25);
        add(card);
        
        details =new JLabel("16 digits ATM card numbers");
        details.setFont(new Font("Raleway", Font.BOLD,12));
        details.setBounds(100,270,250,20);
        add(details);

        
        number =new JLabel("XXX-XXXX-XXXX-5062");
        number.setFont(new Font("Raleway", Font.BOLD,20));
        number.setBounds(400,250,250,25);
        add(number);
        
        
         pin =new JLabel("Pin :");
        pin.setFont(new Font("Raleway", Font.BOLD,20));
        pin.setBounds(100,300,150,25);
        add(pin);

        
        pnumber =new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD,20));
        pnumber.setBounds(400,300,250,25);
        add(pnumber);
        
        pdetails =new JLabel("4 digits password");
        pdetails.setFont(new Font("Raleway", Font.BOLD,12));
        pdetails.setBounds(100,320,250,20);
        add(pdetails);
        
        services =new JLabel("Services Required");
        services.setFont(new Font("Raleway", Font.BOLD,20));
        services.setBounds(100,360,250,30);
        add(services);
        
        
        c1 = new JCheckBox ("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 18));
        c1.setBounds(100,400,200,25);
        add(c1);
        
        
        c2 = new JCheckBox ("Internate Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 18));
        c2.setBounds(350,400,200,25);
        add(c2);
        
        c3 = new JCheckBox ("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 18));
        c3.setBounds(100,435,200,25);
        add(c3);
        
        c4 = new JCheckBox ("Email & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 18));
        c4.setBounds(350,435,200,25);
        add(c4);
        
        c5 = new JCheckBox ("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 18));
        c5.setBounds(100,470,200,25);
        add(c5);
        
        c6 = new JCheckBox ("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 18));
        c6.setBounds(350,470,200,25);
        add(c6);
        
        c7 = new JCheckBox ("I hereby declared that above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 13));
        c7.setBounds(100,530, 600,20);
        add(c7);
        
        page = new JLabel("Page3");
        page.setFont(new Font("Raleway",Font.BOLD,10));
        page.setBounds(700,10,60,20);
        add(page);
        
        
        submit = new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.WHITE);
        submit.setBounds(500,590,90,25);
        submit.addActionListener(this);
        add(submit);
        
         cancel = new JButton("Cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(600,590,90,25);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(800,700);
        setLocation(350,20);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accounttype = null;
            if(r1.isSelected()){
               accounttype= "Saving Account"; 
            }else if(r2.isSelected()){
                accounttype= "Fixed Deposite Account";
            }else if(r3.isSelected()){
                accounttype= "Current Account";
            }else if(r4.isSelected()){
                accounttype= "Reccuring Deposite Account";
            }
            
            Random random = new Random();
            String card= ""+Math.abs((random.nextLong() %90000000L)+8086589600000000L);
            String pin= ""+Math.abs((random.nextLong()%8000L)+1000L);
                                     
           String services = "";
            if(c1.isSelected()){
                services=services +" ATM CARD";
            }else if(c2.isSelected()){
                services= services+ " Internet Banking";
            }else if (c3.isSelected()){
                services = services + " Mobile Banking";
            }else if(c4.isSelected()){
                services = services + " Emails & SMS Alerts";
            }else if (c5.isSelected()){
                services = services+ " Cheque Book";
            }else if(c6.isSelected()){
                services = services+ " E-Statement";
            }
 
        try{
            if(accounttype.equals("")){
                
            JOptionPane.showMessageDialog(null,"Account Type is Required");
            
        }else {
            Conn c= new Conn();
            String query1 = "insert into signupthree values('"+formno+"', '"+accounttype+"', '"+card+"', '"+pin+"', '"+services+"')";
            String query2 = "insert into login values('"+formno+"', '"+card+"', '"+pin+"')";
           c.s.executeUpdate(query1);
           c.s.executeUpdate(query2);
           
           JOptionPane.showMessageDialog(null,"card Number: "+card+ "\n  Pin Number: "+ pin);
           
              
            setVisible(false);
            new Transactions(pin).setVisible(true);
            }
    }catch(Exception e){
        System.out.println(e);
    }
    
    }else if(ae.getSource()==cancel){
            setVisible(false);
            new Login().setVisible(true);
        
    }
}
   
  public static void main(String args[]){
        new SignupThree("");
    }
    
}
