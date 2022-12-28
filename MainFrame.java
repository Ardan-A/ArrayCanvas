import java.util.Iterator;
import java.awt.*;
import javax.swing.*;
public class MainFrame extends JWindow{
    private Containable container;
    MainFrame(){
        super();
        this.setVisible(true);
        this.setSize(800, 800);
        // this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        container = new Containable();
    }
    MainFrame(Containable c){
        super();
        this.setSize(800, 800);
        // this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        container = c;
        this.paint();
    }
    public void paint(){
        Iterator<Canvas> it = container.getList().iterator();
        this.add(it.next());
        this.repaint();
    }
    public void add(JComponent c){
        Canvas l = new Canvas();
        l.paint(c.getGraphics());
        container.add(l);
    }
    public void add(Graphics g){
        Canvas c = new Canvas();
        c.paint(g);
        container.add(c);
    }
    public void update(){
        MainFrame m = new MainFrame(container);
    }

}
