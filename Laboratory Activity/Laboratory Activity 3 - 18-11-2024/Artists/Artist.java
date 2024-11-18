public class Artist {
    private String name;
    private int age;
    private String nationality;
    private String specialty;

    public Artist(String name, int age, String nationality, String specialty) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }
    
    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void displayInfo() {
        System.out.println("Artist Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + specialty);
    }

}