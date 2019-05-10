package pl.mirek.validator;

public class Validator {

    private Validator() {
    }

    public static Validator getInstance(){
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Validator INSTANCE = new Validator ();
    }

    public boolean isIsbnCorrect (String isbn){
        if(isbn.length() != 13){
            return false;
        }
        return true;
    }

}
