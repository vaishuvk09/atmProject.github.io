package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class SignupTwo extends JFrame implements ActionListener  {
    JLabel additionalDetails,sreligion, scategory, sincome, seducation, sOccupation, pan,adhar, seniorcitizen, existingaccount, page;
    JTextField panTextField, adharTextField;    
    JRadioButton yes,no, eyes, eno;
    JComboBox religion, category, income, education, occupation;
    String formno;
    
    
    SignupTwo(String formno){
     this.formno = formno;
     setLayout(null);
     setTitle("NEW ACCOUNT APPLICATION Form - PAGE 2");
     
      additionalDetails = new JLabel("Additional Details");
     additionalDetails.setFont(new Font ("Raleway",Font.BOLD,30));
     additionalDetails.setBounds(200,20,500,25);
     add(additionalDetails);
     
      sreligion= new JLabel("Religion :");
     sreligion.setFont(new Font("Raleway",Font.BOLD,15));
     sreligion.setBounds(50,80,150,30);
     add(sreligion);
     
     
     String valReligion[] ={"null","Hindu", "Muslim", "Buddhist", "Christian","Sikh","others"};
     religion = new JComboBox(valReligion);
     religion.setFont(new Font("Raleway",Font.BOLD,13));
     religion.setBackground(Color.WHITE);
     religion.setBounds(150,80,400,25);
     add(religion);
     
     
     scategory = new JLabel("Category :");
     scategory.setFont(new Font("Raleway", Font.BOLD,15));
     scategory.setBounds(50,130,150,30);
     add(scategory);
     
     String valCategory[]={"null","General","OBC", "SC", "ST", "NT","Others"};
     category = new JComboBox(valCategory);
     category.setFont(new Font("Raleway",Font.BOLD,13));
     category.setBackground(Color.WHITE);
     category.setBounds(150,130,400,30);
     add(category);
     
     
     sincome = new JLabel("Income: ");
     sincome.setFont(new Font("Raleway",Font.BOLD,15));
     sincome.setBounds(50,180,150,30);
     add(sincome);
     
     
     String valIncome[] = {"Null","< 150,000","<2,50,000", "<500000","upto 1000000"};
     income = new JComboBox(valIncome);
     income.setFont(new Font("Raleway",Font.BOLD,13));
     income.setBackground(Color.WHITE);
     income.setBounds(150,180,400,30);
     add(income);
     
     
     seducation = new JLabel("Education : ");
     seducation.setFont(new Font("Raleway", Font.BOLD,15));
     seducation.setBounds(50,230,150,30);
     add(seducation);
     
     
     String valEducation []={"null","SSC", "HSC", "Graduate", "Post Graduate", "DR","Others"}; 
     education = new JComboBox(valEducation);
     education.setFont(new Font("Raleway",Font.BOLD,13));
     education.setBackground(Color.WHITE);
     education.setBounds(150,230,400,30);
     add(education);
     
     sOccupation = new JLabel("Occupation :");
     sOccupation.setFont(new Font("Raleway", Font.BOLD, 15));
     sOccupation.setBounds(50,280,150,30);
     add(sOccupation);
     
     
     String valOccupation[] = {"null","Salaried", "Self- Employee","Gov. Servant", "House-wife","Student", "Bussiness","Retired","others"};
     occupation = new JComboBox(valOccupation);
     occupation.setFont(new Font("Raleway",Font.BOLD,13));
     occupation.setBackground (Color.WHITE);
     occupation.setBounds(150,280,400,30);
     add(occupation);
     
     
     pan = new JLabel("PAN Number: ");
     pan.setFont(new Font("Raleway", Font.BOLD, 15));
     pan.setBounds(50,330,130,30);
     add(pan);
     
     panTextField= new JTextField();
     panTextField.setFont(new Font("Raleway", Font.BOLD,13));
     panTextField.setBounds(150,330,400,30);
     add(panTextField);
     
     
     
     adhar= new JLabel("Aadhar Number: ");
     adhar.setFont(new Font("Raleway", Font.BOLD, 15));
     adhar.setBounds(50,380,130,30);
     add(adhar);
     
     
     adharTextField = new JTextField();
     adharTextField.setFont(new Font("Raleway",Font.BOLD,13));
     adharTextField.setBounds(170,380,380,30);
     add(adharTextField);
     
     seniorcitizen = new JLabel("Senionr Citizen: ");
     seniorcitizen.setFont(new Font("Raleway",Font.BOLD,15));
     seniorcitizen.setBounds(50,430,150,30);
     add(seniorcitizen);
     
      yes = new JRadioButton("yes");
     yes.setBackground(Color.WHITE);
     yes.setForeground(Color.black);
     yes.setBounds(250, 430, 150, 30);
     add(yes);
     
     no= new JRadioButton("No");
     no.setBackground(Color.WHITE);
     no.setForeground(Color.black);
     no.setBounds(400,430,150,30);
     add(no);
     
     ButtonGroup SeniorGroup = new ButtonGroup();
     SeniorGroup.add(yes);
     SeniorGroup.add(no);
     
     
     
     
     
     existingaccount =new JLabel("Existing Account: ");
     existingaccount.setFont(new Font("Raleway", Font.BOLD,15));
     existingaccount.setBounds(50,480,150,30);
     add(existingaccount);
     
     eyes = new JRadioButton("yes");
     eyes.setBackground(Color.WHITE);
     eyes.setForeground(Color.black);
     eyes.setBounds(250, 480, 150, 30);
     add(eyes);
     
     eno= new JRadioButton("No");
     eno.setBackground(Color.WHITE);
     eno.setForeground(Color.black);
     eno.setBounds(400,480,150,30);
     add(eno);
     
     ButtonGroup accGroup = new ButtonGroup();
     accGroup.add(eyes);
     accGroup.add(eno);
     
     page =new JLabel("Page 2");
     page.setFont(new Font("Raleway", Font.BOLD,13));
     page.setBounds(550,10,60,30);
     add(page);
     
     JButton next = new JButton("Next");
     next.setBackground(Color.black);
     next.setForeground(Color.WHITE);
     next.setFont(new Font("Raleway",Font.BOLD,13));
     next.setBounds(500,550,90,30);
     next.addActionListener(this);
     add(next);
     
     
     
     getContentPane().setBackground(Color.WHITE);
     setSize(650,700);
     setLocation(300,50);
     setVisible(true);
        
    }
 
 
 
 
 public void actionPerformed(ActionEvent ae){
     
     String sreligion = (String)religion.getSelectedItem();
     String scategory = (String)category.getSelectedItem();
     String sincome = (String)income.getSelectedItem();
     String seducation= (String)education.getSelectedItem();
     String soccupation = (String)occupation.getSelectedItem();
     String pan  = panTextField.getText();
     String adhar = adharTextField.getText();
     
     String seniorcitizen = null;
     if(yes.isSelected()){
         seniorcitizen= "Yes";
     }else if(no.isSelected()){
         seniorcitizen = "No";
     }
     
     String existingaccount =null;
     if(eyes.isSelected()){
       existingaccount= "yes";  
     }else if(eno.isSelected()){
         existingaccount= "No";
     }
     
     
     
       try{
            Conn c= new Conn();
            String query = "insert into signuptwo values('"+formno+"','"+sreligion+"', "
                    + "'"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"',"
                    + "'"+pan+"','"+adhar+"','"+seniorcitizen+"','"+existingaccount+"')";
            c.s.executeUpdate(query);
            
           setVisible(false);
           new SignupThree(formno).setVisible(true);
           
        
    }catch(Exception e){
        System.out.println(e);
    }
        
     
     
     
 }
 
 
 
 
 public static void main(String args[]){
     new SignupTwo("");
         
     
 }

   
   

    
}
