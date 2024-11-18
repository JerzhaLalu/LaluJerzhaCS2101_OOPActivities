public class Dancer extends Artist{
    enum DanceStyle{
        BALLET, HIPHOP, JAZZ, CONTEMPORARY;
    }

    private DanceStyle danceStyle;

    public Dancer(String artistName, int age, String nationality, String specialty, DanceStyle danceStyle){
        super(artistName, age, nationality, specialty); 
        this.danceStyle = danceStyle;
    }

    public void displayInfo() {
        System.out.println("Dancer's Info");
        super.displayInfo(); 
        System.out.println("Dance Style: " + danceStyle);
    }
}


