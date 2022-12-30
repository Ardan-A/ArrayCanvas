import java.awt.*;
public class JTestin{
  public static void main(String[] args){
    MainFrame m = new MainFrame();
    ACanvas arrayCanvas = new ACanvas();
    Canvas a = new Canvas();
    a.setBackground(Color.red);
    a.setBounds(100,100,200,200);
    ACanvas b = new ACanvas();
    b.setBackground(Color.blue);
    b.setBounds(150, 150, 25, 25);
    arrayCanvas.setSize(200,200);
    arrayCanvas.setBackground(Color.BLACK);
    m.setLayout(null);
    m.add(arrayCanvas);
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    arrayCanvas.setSize(500,500);
    arrayCanvas.add(b);
    arrayCanvas.add(a);
    arrayCanvas.paint();
  }
}


