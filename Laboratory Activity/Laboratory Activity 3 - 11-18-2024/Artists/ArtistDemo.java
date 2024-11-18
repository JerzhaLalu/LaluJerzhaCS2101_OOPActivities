public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Charlie Puth", 37, "American", "Singer");
        artist.displayInfo();

        System.out.println("");

        Painter painter = new Painter("Claude Monet", 86, "French", "Painter", Painter.Medium.OIL);
        painter.displayInfo();

        System.out.println("");

        Singer singer = new Singer("Naeyon", 37, "American", "Singer", "Pop");
        singer.displayInfo();

        System.out.println("");

        Writer writer = new Writer("William Shakespeare", 52, "English", "Writer", Writer.WritingStyle.DRAMA);
        writer.displayInfo();

        System.out.println("");

        Dancer dancer = new Dancer("Lee Bada", 29, "Korean", "Dancer", Dancer.DanceStyle.HIPHOP);
        dancer.displayInfo();

    }
}


