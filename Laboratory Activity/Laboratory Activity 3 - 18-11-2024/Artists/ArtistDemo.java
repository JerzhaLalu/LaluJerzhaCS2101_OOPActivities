public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Charlie Puth", 37, "American", "Singer");
        artist.displayInfo();

        System.out.println("");

        Painter painter = new Painter("Claude Monet", 86, "French", "Painter", Medium.OIL);
        painter.displayInfo();

        System.out.println("");

        Singer singer = new Singer("Naeyon Im", 29, "Korean", "Singer", Genre.POP);
        singer.displayInfo();

        System.out.println("");

        Writer writer = new Writer("William Shakespeare", 52, "English", "Writer", WritingStyle.DRAMA);
        writer.displayInfo();

        System.out.println("");

        Dancer dancer = new Dancer("Lee Bada", 29, "Korean", "Dancer", DanceStyle.HIPHOP);
        dancer.displayInfo();

    }
}


