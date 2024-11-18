public class Painter extends Artist{
    enum Medium{
        OIL, WATERCOLOR, ACRYLIC, PENCIL, CHARCOAL;
    }

    private Medium medium;

    public Painter(String artistName, int age, String nationality, String specialty, Medium medium){
        super(artistName, age, nationality, specialty); 
        this.medium = medium;
    }

    public void displayInfo() {
        System.out.println("Painter's Info");
        super.displayInfo(); 
        System.out.println("Medium: " + medium);
    }
}


