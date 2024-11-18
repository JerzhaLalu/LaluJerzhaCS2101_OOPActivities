enum Medium{
    OIL, 
    WATERCOLOR, 
    ACRYLIC, 
    PENCIL, 
    CHARCOAL;
}

public class Painter extends Artist{
    
    private Medium medium;

    public Painter(String artistName, int age, String nationality, String specialty, Medium medium){
        super(artistName, age, nationality, specialty); 
        this.medium = medium;
    }

    public Medium getMedium() {
        return medium;
    }

    public void set(Medium medium) {
        this.medium = medium;
    }

    public void displayInfo() {
        System.out.println("== Painter Info == ");
        super.displayInfo(); 
        System.out.println("Medium: " + medium);
    }
}


