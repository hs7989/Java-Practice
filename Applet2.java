
       import java.applet.Applet;
       import java.awt.*; 
       import java.awt.event.*; 

    public class Applet2 extends Applet
    { 
        Button b1 , b2;
        TextField t;

        public void init()
        {
           setLayout(null);

           b1 = new Button("Click");
           b1.setBounds(50,50,100,60);
           add(b1);

           t = new TextField(); 
           t.setBounds(200,50,200,60);
           add(t);

           b2 = new Button("Clear");
           b2.setBounds(450,50,100,60);
           add(b2);

           b1.addActionListener(new Abc(t));
           b2.addActionListener(new Xyz(t));         

        }       
    }

     class Abc implements ActionListener
     {
         TextField t; 
 
         public Abc(TextField t)
         {
            this.t = t;
         }
         public void actionPerformed(ActionEvent e)
         {
              t.setText(" Hello ");
         }
     } 
    
     class Xyz implements ActionListener
     {
         TextField t; 
 
         public Xyz(TextField t)
         {
            this.t = t;
         }
         public void actionPerformed(ActionEvent e)
         {
              t.setText("");
         }
     } 

   // <applet code="Applet2.class" height="500" width="700"> </applet>
