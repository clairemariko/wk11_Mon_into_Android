package example.codeclan.com.hellofrog;

/**
 * Created by user on 25/04/2016.
 */
public class Amphibian {
    private String mName;
    private String mSpecies;
    private String mGreeting;

    public Amphibian(String name, String species, String greeting) {
        mName = name;
        mSpecies = species;
        mGreeting = greeting;

    }


    public String getName(){
        return mName;
    }


    public void setName(String newName){
        mName =newName;
    }

    public String getSpecies(){
        return mSpecies;
    }

    public void setSpecies(String newSpecies){
        mSpecies = newSpecies;
    }

    public String getGreeting(){
        return mGreeting;
    }

    public void setGreeting(String newGreeting){
        mGreeting = newGreeting;
    }





}
