import java.util.ArrayList;
import java.util.List;


public class Hero {
    private String mName;
    private int mAge;
    private String mPower;
    private String mWeakness;
    private static List<Hero> instances = new ArrayList<Hero>();
    private int mId;


    public Hero(String name,int age,String power,String weakness){
        mName =name;
        mAge = age;
        mPower = power;
        mWeakness = weakness;
        instances.add(this);
        mId = instances.size();
    }

    //method for getting hero name
    public String getName(){
        return mName;
    }

    // method for getting hero age
    public   int getAge(){
        return mAge;
    }

    // method for getting hero power
    public String getPower(){
        return mPower;
    }


    //Method for getting hero Weakness
    public String getWeakness(){
        return mWeakness;
    }

    //Method to return all heros in the list
    public static List<Hero> all() {
        return instances;
    }

    //Method to clear heros from ArrayList

    public static void clear() {
        instances.clear();
    }

    // method  for instantiating with Id
    public int getId() {
        return mId;
    }

    // method to find a specific ID
    public static Hero find(int id){

        return instances.get(id - 1);
    }







}

