package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;





public class PinChange extends JFrame implements ActionListener{
       JLabel text, pintext, rpintext;
        JPasswordField npin, rnpin ;
        JButton change, back;
        String pin;
    PinChange(String pin){
        this.pin= pin;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        text = new JLabel("Change Your PIN");
        text.setBounds(250,300,180,30);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD,22));
        image.add(text);
        
        
        pintext = new JLabel("New PIN: ");
        pintext.setBounds(170,350,150,25);
        pintext.setFont(new Font("Raleway",Font.BOLD,16));
        pintext.setForeground(Color.WHITE);
        image.add(pintext);
        
         npin = new JPasswordField();
         npin.setBounds(320,350,180,25);
         npin.setFont(new Font("Raleway",Font.BOLD,18));
         image.add(npin);
         
        rpintext = new JLabel("Re-Enter New PIN: ");
        rpintext.setBounds(170,400,150,25);
        rpintext.setFont(new Font("Raleway",Font.BOLD,16));
        rpintext.setForeground(Color.WHITE);
        image.add(rpintext);
        
         rnpin = new JPasswordField();
         rnpin.setBounds(320,400,180,25);
         rnpin.setFont(new Font("Raleway",Font.BOLD,20));
         image.add(rnpin);
         
         
         change = new JButton("Change");
         change.setFont(new Font("Raleway", Font.BOLD,20));
         change.setBackground(Color.WHITE);
         change.setForeground(Color.black);
         change.setBounds(400,490,120,30);
         change.addActionListener(this);
         image.add(change);
         
         back = new JButton("Back");
         back.setFont(new Font("Raleway", Font.BOLD,20));
         back.setBackground(Color.WHITE);
         back.setForeground(Color.black);
         back.setBounds(400,520,120,30);
         back.addActionListener(this);
         image.add(back);
         
        
        
                 
                 
        setSize(900,900);
        setLocation(250,0);
        setUndecorated(true);
        setVisible(true);
    }
        public void actionPerformed(ActionEvent ae){
           if(ae.getSource()==change){
            try{
               String pinn = npin.getText();
               String rpin = rnpin.getText();
               if(!pinn.equals(rpin)){
                   JOptionPane.showMessageDialog(null,"Enterded PIN does not match");
                   return;
               }
                if(pinn.equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter PIN");
                    return;
                }
                if(rpin.equals("")){
                    JOptionPane.showMessageDialog(null,"Please re-enter new PIN");
                }
                
                
                Conn c= new Conn();
                String query1= "update bank set pin= '"+rpin+"' where pin= '"+pin+"'";  
                String query2="update login set pin='"+rpin+"' where pin= '"+pin+"'";
                String query3= "update signupthree set pin='"+rpin+"' where pin= '"+pin+"'";
                
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                c.s.executeUpdate(query3);
                JOptionPane.showMessageDialog(null,"PIN has been change Successfully");
                
                setVisible(false);
                new Transactions(rpin);setVisible(true);
            
           }catch(Exception e){
               System.out.println(e);
           }                   
           }else {
            setVisible(false);
            new Transactions(pin).setVisible(true);
        }
        
    
        }
    
   
    
    
    
    
    public static void main(String args[]){
        new PinChange("").setVisible(true);
        
    } 
}
