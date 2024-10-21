public class Subscriber implements Observer {

    private String name;
    private Subject channel = new Channel();



    public Subscriber(String name) {
        this.name = name;
    }



    @Override
    public void update(){
        System.out.println("Hi "+name +" Video upload started");
    }


    @Override
    public void subscribeChannel(Subject ch){
        channel = ch;
        
    }

}
