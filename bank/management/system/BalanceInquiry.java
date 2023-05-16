package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class BalanceInquiry extends JFrame implements ActionListener{
    String pin;
    BalanceInquiry(String pin){
        this.pin = pin;
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
                 Conn c = new Conn();
         int balance = 0;
            try {
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pin+"'");
                
                while(rs.next()){
                    if(rs.getString ("type").equals("deposite")){
                        balance +=Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
            }catch(Exception e){
                System.out.println(e);
            }   
        
        JLabel text= new JLabel("Your Account Balance is: "+ balance);
        text.setFont(new Font("Raleway",Font.BOLD,15));
        text.setBounds(200,350,250,25);
        text.setForeground(Color.WHITE);
        image.add(text);
        
        JButton back = new JButton("Back");
        back.setFont(new Font("Raleway", Font.BOLD,16));
        back.setBackground(Color.WHITE);
        back.setForeground(Color.black);
        back.setBounds(410,520,100,30);
        back.addActionListener(this);
        image.add(back);
        
 
        
        
        
        
        
        
        setSize(900,900);
        setLocation(250,0);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transactions(pin).setVisible(true);
    
    }
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]){
       new BalanceInquiry("").setVisible(true);
        
    }
}
