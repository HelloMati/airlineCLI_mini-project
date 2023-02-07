package Class;

import java.util.ArrayList;

public class Passenger {
   private String name;
   private String contactInfo;
   private int Id;
   private ArrayList<Flight> flights;


    public Passenger(String name, String contactInfo, int id) {
        this.name = name;
        this.contactInfo = contactInfo;
        Id = id;
    }

    public int getId(){
                return Id;
        }
   public String getName(){
                return name;
        }
   public void setId(int id) {
                this.Id = id;
        }
}



