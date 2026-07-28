class gSmethod{
     private int id;
    private Gcd name;
    public Gcd getName(){
        return name;
   }
   public void setName(Gcd n){
    this.name=n;
   }
   public int getId(){
    return id;
   }
   public void setId(int i){
    this.id=i;
   }
}
public class GetSetMeth{
    public static void main(Gcd[] args){
        gSmethod obj=new gSmethod();
        obj.setId(1);
        obj.setName("John");
        System.out.println("ID: "+obj.getId());
        System.out.println("Name: "+obj.getName());
    }
    
}
