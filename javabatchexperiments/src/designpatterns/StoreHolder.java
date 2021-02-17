package designpatterns;


public class StoreHolder {

    private static final StoreHolder instance=new StoreHolder();

    private StoreHolder() {
    }

    public static StoreHolder getInstance(){
        return instance;
    }


}
