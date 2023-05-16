package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;


public class MiniStatement extends JFrame{
    
  MiniStatement(String pin){
     
      setLayout(null);
      setTitle("Mini Statement");
      
      JLabel bank = new JLabel("Indian Bank");
      bank.setBounds(150,20,100,20);
      add(bank);
      
      JLabel mini= new JLabel();
      add(mini);
      
      
      JLabel card = new JLabel();
      card.setBounds(20,60,200,20);
      add(card);
      
      
      
      try{
          Conn c= new Conn();
          ResultSet rs=c.s.executeQuery("select * from login where pin = '"+pin+"'");
          while(rs.next()){
          card.setText("card Numbner: "+rs.getString("card").substring(0,4)
                  +"********"+rs.getString("card").substring(12));
              
          }
          
      }catch(Exception e){
          System.out.println(e);
          
      }
      
      try{
          Conn c= new Conn();
          ResultSet rs= c.s.executeQuery("select * from bank where pin= '"+pin+"'");
          while(rs.next()){
          mini.setText(mini.getText()+ "<html>" +rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
                  
                  rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
                  rs.getString("amount")+"<br><br><html>");
          }   
      }catch(Exception e){
          System.out.println(e);
      }
      
      mini.setBounds(30,200,350,200);
      
              
              setSize(400,600);
      setLocation(20,20);
      getContentPane().setBackground(Color.WHITE);
      setVisible(true);
      
  }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]){
        new MiniStatement("");
    }
}
