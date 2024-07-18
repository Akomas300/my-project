package Java_Projets.Day6;

public class Animal {
    private String animalName;
    private int animalAge;
    private String animalSong;

    public Animal(String animalName, int animalAge, String animalSong) {
        this.animalName = animalName;
        this.animalAge = animalAge;
        this.animalSong = animalSong;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public String getAnimalSong() {
        return animalSong;
    }

    public void setAnimalSong(String animalSong) {
        this.animalSong = animalSong;
    }

    public void printMessage() {
        System.out.println("the animal name is " + animalName + "his age is " + animalAge + " and the song is " + animalSong);
    }
}
