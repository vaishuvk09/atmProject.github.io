package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

 
public class Deposite extends JFrame implements ActionListener{
            JLabel text; 
         JTextField amount;
         JButton deposite, back;
         String pin;
    
    Deposite(String pin){
        this.pin = pin;

        
        setLayout(null);
        
        
        
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));  
      Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT );
      ImageIcon i3 = new ImageIcon(i2);
      JLabel image = new JLabel(i3);
      image.setBounds(0,0,900,900);
      add(image);
      
      text = new JLabel("Enter the Amount");
      text.setForeground(Color.WHITE);
      text.setFont(new Font("System",Font.BOLD,22));
      text.setBounds(250,300,300,30);
      image.add(text);
      
      amount = new JTextField();
      amount.setFont(new Font("Raleway", Font.BOLD,25));
      amount.setBounds(200,350,250,30);
     image.add(amount);
      
      
      deposite = new JButton("Deposite");
      deposite.setBounds(400,490,100,28);
      deposite.addActionListener(this);
      image.add(deposite);
      
      
      
      back = new JButton("Back");
      back.setBounds(400,530,100,25);
      back.addActionListener(this);
      image.add(back);
      
      
      
      
       setSize(900,900);
       setLocation(250,0);
       setUndecorated(true);
      setVisible(true);
     
        
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== deposite){
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the Amount");
            }else{
                try{
                Conn c = new Conn();
                String query = "insert into bank values('"+pin+"', '"+date+"', 'deposite', '"+number+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+number+" amount Deposited Successfully");
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }catch(Exception e){
                    System.out.println(e);
                    }
            }
            
        }else if (ae.getSource()==back){
        setVisible(false);
        
        new Transactions(pin).setVisible(true);
        
    }
        
    }
    
    
    
    
    public static void main(String args[]){
        new Deposite("");
    }
    
}
