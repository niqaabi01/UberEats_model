import java.util.ArrayList;

public class Restaurant{

    //instance variables
    private String Name;
    private String Location;

    //constructor
    Restaurant(String name, String location){
        this.Name = name;
        this.Location = location;
       
    
    }

    //Methods
    //getters and Setters

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    
}