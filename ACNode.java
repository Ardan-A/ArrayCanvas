public interface ACNode {
    static String type = "";
    static ACanvas parent = new ACanvas(); 
    
    public void runThis();
    public void setType();
    public String getType();
    public void setParent();
    public ACanvas getParent();
}
