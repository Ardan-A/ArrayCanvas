import javax.swing.*;
import java.awt.image.*;
import java.awt.*;
public class Controller extends JWindow{
    BufferStrategy bs;
    ACanvas ac;
    Controller(ACanvas ac){
        super();
        this.ac = ac;
        this.setLayout(null);
        this.setBounds(this.ac.getBounds());
        super.add(ac);
    }
    public BufferStrategy setupBufferStrategy(int frames){
        this.createBufferStrategy(frames);
        this.bs = this.getBufferStrategy();
        return bs;
    }
    @Override
    public Component add(Component comp){
        return comp;
    }
}
