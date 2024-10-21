public class FactoryMain {

     public void getInstance(){

     }
    

    public static void main(String[] args) {

      OSFactory osf = new OSFactory();
        OS obj = osf.getInstance("");
        obj.specializes();


        
        
    }
}
