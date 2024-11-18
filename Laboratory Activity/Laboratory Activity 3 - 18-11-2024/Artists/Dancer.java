enum DanceStyle {
    POP,
    ROCK,
    CLASSICAL,
    JAZZ,
    HIPHOP
}

public class Dancer extends Artist {
    private DanceStyle danceStyle;

    public Dancer(String name, int age, String nationality, String specialty, DanceStyle danceStyle) {
        super(name, age, nationality, specialty);
        this.danceStyle = danceStyle;
    }

    public DanceStyle getdanceStyle() {
        return danceStyle;
    }

    public void setdanceStyle(DanceStyle danceStyle) {
        this.danceStyle = danceStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("== Dancer Info ==");
        super.displayInfo();
        System.out.println("Dance Style: " + danceStyle);
    }
}
