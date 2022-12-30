import java.util.LinkedList;
public class Containable {
   LinkedList<ACanvas> list;
   Containable (){
    list = new LinkedList<ACanvas>();
   }
   Containable (LinkedList<ACanvas> l){
    list = l;
   }
   public void add(ACanvas c){
    list.add(c);
   }
   public LinkedList<ACanvas> getList(){
    return list; 
   }
}
