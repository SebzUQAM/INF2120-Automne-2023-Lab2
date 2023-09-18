package exercice2_1;

public class exSigleton {
    private static exSigleton instance;
    private exSigleton(){

    }

    public static exSigleton getInstance(){
        if(instance == null)
            instance = new exSigleton();
        return instance;
    }

    public int lumiere(){
        return 100;
    }
}
