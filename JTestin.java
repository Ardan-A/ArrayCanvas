import java.awt.*;
public class JTestin{
  public static void main(String[] args){
    MainFrame m = new MainFrame();
    ACanvas arrayCanvas = new ACanvas();
    ACanvas a = new ACanvas();
    a.setBackground(Color.red);
    a.setBounds(100,100,200,200);
    arrayCanvas.setSize(200,200);
    arrayCanvas.setBackground(Color.BLACK);
    m.setLayout(null);
    m.add(arrayCanvas);
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    arrayCanvas.setSize(500,500);
    arrayCanvas.add(a);
    arrayCanvas.paint();
  }
}


