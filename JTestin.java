import java.awt.*;
public class JTestin{
  public static void main(String[] args){
    MainFrame m = new MainFrame();
    Canvas l = new Canvas();
    l.setBackground(Color.black);    
    l.setVisible(true);
    Graphics g = l.getGraphics();
    g.create(1,1,1,1);
    g.setColor(Color.black);
    g.fillRect(10, 10, 100, 100);
    m.add(g);
    m.update();
  }
}


