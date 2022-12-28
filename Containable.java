import java.util.LinkedList;
import java.awt.*;
public class Containable {
   LinkedList<Graphics> list;
   Containable (){
    list = new LinkedList<Graphics>();
   }
   Containable (LinkedList<Graphics> l){
    list = l;
   }
   public void add(Graphics g){
    list.add(g);
   }
   public LinkedList<Graphics> getList(){
    return list; 
   }
}
