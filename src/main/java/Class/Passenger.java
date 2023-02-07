package Class;

import java.util.ArrayList;
import java.util.UUID;

public class Passenger {
   private String name;
   private String email;
   private UUID id;
   private ArrayList<Flight> flights;


    public Passenger(String name, String email, UUID uuid) {
        this.name = name;
        this.email = email;
        this.id = UUID.randomUUID();
    }

   public String getName(){
                return name;
        }
   public UUID getId(){
        return id;
    }
   public void setId(UUID id) {
                this.id = id;
        }
}



