import java.util.ArrayList;
import java.util.List;


public class Squad {
    private String mName;
    private int mSize;
    private String mCause;
    private static List<Squad> instances = new ArrayList<Squad>();
    private int mId;
    private List<Hero> mHeroes;


    public Squad(String name, int size,String cause){
        mName = name;
        mSize = size;
        mCause = cause;
        instances.add(this);
        mId = instances.size();
        mHeroes = new ArrayList<>();
    }

    //Method for getting Squad name
    public String getName(){
        return mName;
    }

    //Method for getting Squad size
    public int getSize() {
        return mSize;
    }

    //Method for getting Squad cause
    public String getCause(){
        return mCause;
    }

    //Method to return all Squad in the list
    public static List<Squad> all() {
        return instances;
    }

    //Method to clear Squad from ArrayList
    public static void clear(){
        instances.clear();
    }

    // method  for instantiating with Id
    public  int getId(){
        return mId;
    }
    //Method for finding specific ID
    public static Squad find(int id){

        return instances.get(id - 1);

    }
    //Method to add heros to our Squads Array
    public void addHero(Hero hero){

        mHeroes.add(hero);


    }
    public List<Hero>getHeroes(){
        return mHeroes;
    }
    public static boolean heroAlreadyExists(Hero newHero) {
        boolean exists = false;
        for(Squad squad: instances){
            for(Hero hero: squad.getHeroes()){
                if (hero.getName().equals(newHero.getName())) {
                    exists = true;
                }
            }
        }
        return exists;
    }

}
