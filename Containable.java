import java.util.LinkedList;
import java.util.ListIterator;
import java.awt.*;
public class Containable {
   LinkedList<Canvas> cList;
   LinkedList<ACanvas> pList;
   LinkedList<Component> oList; 
   Containable (){
    cList = new LinkedList<Canvas>();
    pList = new LinkedList<ACanvas>();
    oList = new LinkedList<Component>();
   }
   Containable (LinkedList<Canvas> l){
    cList = l;
    pList = new LinkedList<ACanvas>();
    oList = new LinkedList<Component>();
   }
   public void add(Canvas c){
    cList.add(c);
   }
   public void add(ACanvas c){
      pList.add(c);
   }
   public void finalize(){
      ListIterator<ACanvas> p = pList.listIterator(pList.size());
      ListIterator<Canvas> c = cList.listIterator(cList.size());
      while (p.hasPrevious()){oList.add(p.previous());}
      while (c.hasPrevious()){oList.add(c.previous());}
   }
   public LinkedList<Component> getList(){
      this.finalize();
      return oList; 
   }
   
}
