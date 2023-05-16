package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;


public class FastCash extends JFrame implements ActionListener{
    
     JLabel text;
    JButton hundred, five,thousand, twothousand, fivethousand, tenthousand, back;
    String pin;
    FastCash(String pin){
        this.pin = pin;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
         text = new JLabel(" PLEASE SELECT AMOUNT");
        text.setFont(new Font("System", Font.BOLD,16));
        text.setForeground(Color.WHITE);
        text.setBounds(230,300,400,25);
        image.add(text);
        
        
         hundred =  new JButton ("Rs 100");
         hundred.setBounds(170,414,130,28);
         hundred.addActionListener(this);
         image.add(hundred);
         
         five = new JButton("Rs 500");
         five.setBounds(380,414,130,28);
         five.addActionListener(this);
         image.add(five);
         
         
         thousand = new JButton("Rs 1000");
         thousand.setBounds(170,450,130,30);
         thousand.addActionListener(this);
         image.add(thousand);
         
         
          twothousand = new JButton("Rs 2000");
         twothousand.setBounds(380,450,130,30);
         twothousand.addActionListener(this);
         image.add(twothousand);
         
         
          fivethousand = new JButton("Rs 5000");
         fivethousand.setBounds(170,490,130,28);
         fivethousand.addActionListener(this);
         image.add(fivethousand);
         
         tenthousand= new JButton("Rs 10000");
         tenthousand.setBounds(380,490,130,28);
         tenthousand.addActionListener(this);
         image.add(tenthousand);
         
         back= new JButton("Back");
         back.setBounds(380,525,130,25);
         back.addActionListener(this);
         image.add(back);
         
         
         
        
        
        setSize(900,900);
        setLocation(250,0);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
            new Transactions(pin).setVisible(true);
        }else {
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn c = new Conn();
            try {
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance = 0;
                while(rs.next()){
                    if(rs.getString ("type").equals("deposite")){
                        balance +=Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                
            if(ae.getSource() != back && balance < Integer.parseInt(amount)){
                        JOptionPane.showMessageDialog(null, "Insufficiant Balance");
                        return;
                    }
                    Date date = new Date();
                    String query = "insert into bank values('"+pin+"', '"+date+"', 'withdrawl', '"+amount+"')";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Rs "+amount+ " Debited Successfully");
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                
                    
            }catch(Exception e){
                System.out.println(e);
            }
       
        
        
    }
        
       
        
    }
    
    
    
    
    
    
    public static void main(String args[]){
        new FastCash("");

    }
    
    
}
