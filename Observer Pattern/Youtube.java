public class Youtube {

    public static void main(String[] args) {
        

        Subject myChannel = new Channel();

        Subscriber s1 = new Subscriber("samal");
        Subscriber s2 = new Subscriber("sanduni");
        Subscriber s3 = new Subscriber("amila");


        myChannel.subscribe(s1);
        myChannel.subscribe(s2);
        myChannel.subscribe(s3);

        myChannel.unsubscribe(s3);

       

        s1.subscribeChannel(myChannel);
        s2.subscribeChannel(myChannel);
        s3.subscribeChannel(myChannel);


    



       myChannel.upload("Learning design patterns.");

    }

}
