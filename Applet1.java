

        import java.applet.Applet;
        import java.awt.*; 

    public class Applet1 extends Applet 
    {
        public void paint(Graphics g)
        {
             g.drawString("Hello" , 100,100);
             g.drawOval(100,100,50,50);
        }    
    }

  // <applet code="Applet1.class" height="500" width="500"> </applet>