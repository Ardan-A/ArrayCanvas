import java.awt.*;
import java.util.Iterator;
import javax.swing.*;
public class ACanvas extends JPanel {
    private Containable container;
    private boolean isControllerCanvas;
    public ACanvas(){
        super();
        this.setLayout(null);
        this.setVisible(true);
        container = new Containable();
        if (isControllerCanvas){

        }
    }
    public ACanvas(int x, int y, int width, int hieght, Color c){
        super();
        this.setBounds(x,y,width,hieght);
        this.setBackground(c);
        this.setLayout(null);
        this.setVisible(true);
        container = new Containable();
       
    }
    public ACanvas(Containable c){
        super();
        this.setLayout(null);
        this.setVisible(true);
        container = c;
    }
    public void paint(){
        this.setVisible(false);
        Iterator<Component> it = container.getList().iterator();
        while(it.hasNext()){super.add(it.next());}
        this.repaint();
        this.setVisible(true);
    }
    public void add(Canvas c){
        c.setIgnoreRepaint(false);
        container.add(c);
    }
    public void add(ACanvas c){
        container.add(c);
    }
    public void flatten(){
        this.paint();
        container = new Containable();
    }
    public Containable getContainable(){
        return container;
    }
    public void configureBufferStrategy(){
        this.createBufferStrategy(2);
    }
    public boolean getIsController(){
        return this.isControllerCanvas;
    }
}