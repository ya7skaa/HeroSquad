import java.util.ArrayList;
import java.util.List;


public class Squad {
    private String mName;
    private int mSize;
    private String mCause;
    private static List<Squad> instances = new ArrayList<Squad>();


    public Squad(String name, int size,String cause){
        mName = name;
        mSize = size;
        mCause = cause;
        instances.add(this);
    }
    public String getName(){
        return mName;
    }
    public int getSize() {
        return mSize;
    }
    public String getCause(){
        return mCause;
    }
    public static List<Squad> all() {
        return instances;
    }
    public static void clear(){
        instances.clear();
    }

}
