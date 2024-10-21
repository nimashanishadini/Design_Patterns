interface Runner{
    void run();
}



class Sprinters implements Runner{

    public void run(){
        System.out.println("We are running faster.");
    }
    public void start(){
        System.out.println("Starting point.");
    }

    
    
}

class RoadRunner implements Runner{

    public void run(){
        System.out.println("We are running slow than sprinters.");
    }

    public void breath(){
        System.out.println("Breathing is one of the most important things here.");
    }
}



class Athlete {
    Sprinters spr = new Sprinters();
    RoadRunner rr = new RoadRunner();

    public void RoadRunner(){
        rr.breath();
        rr.run();
    }

    public void Sprinters(){
        spr.run();
        spr.start();
    }

}

public class FacadeImplement {

    public static void main(String[] args) {


        Athlete alt = new Athlete();
        alt.RoadRunner();
        
      

    }

}
