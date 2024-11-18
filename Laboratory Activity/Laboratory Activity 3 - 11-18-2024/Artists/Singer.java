public class Singer extends Artist{
    String genre;

    public Singer(String artistName, int age, String nationality, String specialty, String genre){
        super(artistName, age, nationality, specialty); 
        this.genre = genre;
    }

    public void displayInfo() {
        System.out.println("Singer's Info");
        super.displayInfo(); 
        System.out.println("Genre: " + genre);
    }
}


