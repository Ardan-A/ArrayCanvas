import java.awt.*;
import java.util.Iterator;
import javax.swing.*;
public class ACanvas extends JPanel {
    private Containable container;
    ACanvas(){
        super();
        this.setVisible(true);
        this.setLayout(null);
        container = new Containable();
    }
    ACanvas(Containable c){
        super();
        this.setVisible(true);
        this.setLayout(null);
        container = c;
    }
    public void paint(){
        Iterator<Component> it = container.getList().iterator();
        while(it.hasNext()){this.add(it.next());}
    }
    public void add(Canvas c){
        container.add(c);
    }
    public void add(ACanvas c){
        container.add(c);
    }
}