enum WritingStyle{
    FICTION, 
    NONFICTION, 
    POETRY, 
    DRAMA;
}

public class Writer extends Artist{
    
    private WritingStyle writingStyle;

    public Writer(String artistName, int age, String nationality, String specialty, WritingStyle writingStyle){
        super(artistName, age, nationality, specialty); 
        this.writingStyle = writingStyle;
    }

    public WritingStyle getwritingStyle() {
        return writingStyle;
    }

    public void setwritingStyle(WritingStyle writingStyle) {
        this.writingStyle = writingStyle;
    }

    public void displayInfo() {
        System.out.println("== Writer Info== ");
        super.displayInfo(); 
        System.out.println("Writing Style: " + writingStyle);
    }
}


