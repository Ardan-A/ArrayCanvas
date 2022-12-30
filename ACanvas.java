import java.awt.*;
import java.util.Iterator;
public class ACanvas extends Canvas{
    private Containable container;
    ACanvas(){
        super();
        this.setVisible(true);
        container = new Containable();
    }
    ACanvas(Containable c){
        super();
        this.setVisible(true);
        container = c;
    }
    public void paint(){
        Iterator<ACanvas> it = container.getList().iterator();
        this.paint(it.next().getGraphics());
    }

    public void add(Canvas c){
        container.add((ACanvas)c);
    }
    public void add(ACanvas c){
        container.add(c);
    }
}