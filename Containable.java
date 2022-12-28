import java.util.LinkedList;
import java.awt.*;
public class Containable {
   LinkedList<Canvas> list;
   Containable (){
    list = new LinkedList<Canvas>();
   }
   Containable (LinkedList<Canvas> l){
    list = l;
   }
   public void add(Canvas c){
    list.add(c);
   }
   public LinkedList<Canvas> getList(){
    return list; 
   }
}
