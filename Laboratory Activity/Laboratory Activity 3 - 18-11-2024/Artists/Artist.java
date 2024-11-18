public class Artist {
    String artistName;
    int age;
    String nationality;
    String specialty;

    public Artist(String artistName, int age, String nationality, String specialty) {
        this.artistName = artistName;
        this.age = age;
        this.nationality = nationality;
        this.specialty = specialty;
    }

    public void displayInfo() {
        System.out.println("Artist Name: " + artistName);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + specialty);
    }

}