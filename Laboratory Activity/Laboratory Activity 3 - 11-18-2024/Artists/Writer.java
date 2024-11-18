public class Writer extends Artist{
    enum WritingStyle{
        FICTION, NONFICTION, POETRY, DRAMA;
    }

    private WritingStyle writingStyle;

    public Writer(String artistName, int age, String nationality, String specialty, WritingStyle writingStyle){
        super(artistName, age, nationality, specialty); 
        this.writingStyle = writingStyle;
    }

    public void displayInfo() {
        System.out.println("Writer's Info");
        super.displayInfo(); 
        System.out.println("Writing Style: " + writingStyle);
    }
}


