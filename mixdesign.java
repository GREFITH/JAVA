import java.applet.*;
import java.awt.*;
public class mixdesign extends Applet {
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawString("Welcome",50,50);
        g.drawRect(50,40,50,10);
        g.drawLine(50,10,90,60);
    }
    
}
/*
 <applet code="mixdesign.class" width=300 height=300></applet>
 */

