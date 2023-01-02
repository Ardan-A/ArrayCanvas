import java.awt.*;
import java.util.*;
import javax.swing.*;
public class ACanvas extends JPanel {
    private Containable container;
    private boolean isControllerCanvas;
    private Object params;
    
    
    /**Default Contstructor for the ACanvas Class
     * Handles the creation of a completely new ACanvas
     */
    public ACanvas(){
        super();
        this.setLayout(null);
        this.setVisible(true);
        container = new Containable();
    }

    /**Convienience Constructor for creating ACanvases quickly
     * Parameters follow .setBounds order with an added Color parameter at the end
     */
    public ACanvas(int x, int y, int width, int hieght, Color c){
        super();
        this.setBounds(x,y,width,hieght);
        this.setBackground(c);
        this.setLayout(null);
        this.setVisible(true);
        container = new Containable();
       
    }

    /**Constructor for creating an ACanvas based on another ACanvas
     * Purely for creating a new version of a previosly used ACanvas in order to completely refresh it
     */
    public ACanvas(Containable c){
        super();
        this.setLayout(null);
        this.setVisible(true);
        container = c;
    }
    
    public Containable getContainable(){
        return container;
    }

    public boolean getIsController(){
        return this.isControllerCanvas;
    }
    public void paint(){
        Iterator<Component> it = container.getList().iterator();
        while(it.hasNext()){super.add(it.next());}
        this.repaint();
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
    
    public void configureBufferStrategy(){
        //TODO
    }
    
}