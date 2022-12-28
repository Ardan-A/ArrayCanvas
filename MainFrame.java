import java.util.Iterator;
import java.awt.*;
import javax.swing.*;
public class MainFrame extends JFrame{
    private Containable container;
    MainFrame(){
        super();
        this.setVisible(true);
        this.setSize(800, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        container = new Containable();
    }
    MainFrame(Containable c){
        super();
        this.setSize(800, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        container = c;
        this.paint();
    }
    public void paint(){
        Iterator<Graphics> it = container.getList().iterator();
        this.paint(it.next());
        this.repaint();
    }
    public void add(JComponent c){
        container.add(c.getGraphics());
    }
    public void add(Graphics g){
        container.add(g);
    }
    public void update(){
        MainFrame m = new MainFrame(container);
        this.setContentPane(m.getContentPane());
    }

}
