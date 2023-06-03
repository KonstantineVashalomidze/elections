package election;

public class Generate {
    private static Generate instance;
    private static int lastGeneratedPId = 3300107;

    private Generate(){

    }



    public static int pId(){
        if (lastGeneratedPId == 3300107){
            return lastGeneratedPId;
        } else {
            return ++lastGeneratedPId;
        }
    }


    public static Generate getInstance(){
        if (instance == null){
            instance = new Generate();
        }

        return instance;
    }


}
