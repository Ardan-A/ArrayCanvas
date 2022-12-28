import java.awt.*;
public class JTestin{
  public static void main(String[] args){
    MainFrame m = new MainFrame();
    Canvas l = new Canvas();
    Graphics g = m.getGraphics();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    g.create(1,1,1,1);
    g.setColor(Color.black);
    g.fillRect(10, 10, 100, 100);
    m.add(g);
    m.update();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    m = new MainFrame();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    l.paint(g);
    m.add(l);
    m.update();
  }
}


