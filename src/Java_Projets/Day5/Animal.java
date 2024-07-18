package Java_Projets.Day5;

public class Animal {
    //Animal Information
    private String animalName;
    private String animalAge;
    private String animalDateOfBirth;

  /*  public Animal(String animalName, String animalAge, String animalDateOfBirth) {
        //this.animalName = animalName;
        setAnimalName(animalName);
        //this.animalAge = animalAge;
        setAnimalAge(animalAge);
        //this.animalDateOfBirth = animalDateOfBirth;
        setAnimalDateOfBirth(animalDateOfBirth);
    }*/

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    private String getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(String animalAge) {
        this.animalAge = animalAge;
    }

    private String getAnimalDateOfBirth() {
        return animalDateOfBirth;
    }

    public void setAnimalDateOfBirth(String animalDateOfBirth) {
        this.animalDateOfBirth = animalDateOfBirth;
    }

    public void run() {
        System.out.println("the animal name is " + animalName + ", the age is " + getAnimalAge() + " and the date of birth is" + getAnimalDateOfBirth());
    }

}