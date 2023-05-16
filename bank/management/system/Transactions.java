package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Transactions extends JFrame implements ActionListener{
    JLabel text;
    JButton deposite, withdrawl,fastcash, ministatement, changepin, balanceinquiry, exit;
    String pin;
    Transactions(String pin){
        this.pin = pin;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
         text = new JLabel(" PLEASE SELECT YOUR TRANSACTION");
        text.setFont(new Font("System", Font.BOLD,16));
        text.setForeground(Color.WHITE);
        text.setBounds(170,300,400,25);
        image.add(text);
        
        
         deposite =  new JButton ("Deposite");
         deposite.setBounds(170,414,130,25);
         deposite.addActionListener(this);
         image.add(deposite);
         
         withdrawl = new JButton("Withdrawl");
         withdrawl.setBounds(380,414,130,25);
         withdrawl.addActionListener(this);
         image.add(withdrawl);
         
         
         fastcash = new JButton("Fast Cash");
         fastcash.setBounds(170,450,130,25);
         fastcash.addActionListener(this);
         image.add(fastcash);
         
         
          ministatement = new JButton("Mini Statement ");
         ministatement.setBounds(380,450,130,25);
         ministatement.addActionListener(this);
         image.add(ministatement);
         
         
          changepin = new JButton("PIN Change ");
         changepin.setBounds(170,490,130,25);
         changepin.addActionListener(this);
         image.add(changepin);
         
         balanceinquiry= new JButton("Balance Inquiry");
         balanceinquiry.setBounds(380,490,130,25);
         balanceinquiry.addActionListener(this);
         image.add(balanceinquiry);
         
           exit= new JButton("Exit");
         exit.setBounds(380,525,130,25);
         exit.addActionListener(this);
         image.add(exit);
         
         
         
        
        
        setSize(900,900);
        setLocation(250,0);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
            System.exit(0);
        }else if(ae.getSource()==deposite){
        setVisible(false);
        new Deposite(pin).setVisible(true);
        
    }else if(ae.getSource()== withdrawl){
        setVisible(false);
        new Withdrawl(pin).setVisible(true);
    }else if(ae.getSource()==fastcash){
        setVisible(false);
        new FastCash(pin).setVisible(true);
    }else if(ae.getSource()==changepin){
        setVisible(false);
        new PinChange(pin).setVisible(true);
       
    }else if(ae.getSource()==balanceinquiry){
        setVisible(false);
        new BalanceInquiry(pin).setVisible(true);
    }else if(ae.getSource()==ministatement){
        new MiniStatement(pin).setVisible(true);
    }
        
        
    }
    
    
    
    
    
    
    public static void main(String args[]){
        new Transactions("");
    }
    
}
