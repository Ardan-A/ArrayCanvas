import java.awt.*;
public class BufferStrategyNode extends Canvas implements ACNode{

    BufferStrategyNode(){
        this.setParent((ACanvas)super.getParent());
        this.runThis();
    }
    
    
    
    @Override
    public void runThis() {
        
    }

    @Override
    public void setType() {
        type = "BufferStrategy";        
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setParent() {
        parent = (ACanvas)this.getParent();
    }
    @Override 
    public ACanvas getParent(){
        return parent;
    }
    
}
