public class Passenger {

        private String name;
        private int contactInfo;
        private int Id;

        public Passenger(String name,int contactInfo, int id){
                this.name = name;
                this.contactInfo = contactInfo;
                this.Id = id;
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











}
