/**
 * Represents an Animal with various biological and tracking attributes.
 * All attributes are private, and access is provided via public getter and setter methods.
 *
 * NOTE: Dates (birthdate and arrivalDate) are stored as String in ISO 8601 format (YYYY-MM-DD).
 */
public class Animal {

    // --- Attributes (Private) ---
    private String animalID;
    private String birthdate; // Stored as ISO 8601 date string (e.g., "2025-09-30")
    private String color;
    private int weight; // Weight in a consistent unit (e.g., kilograms or pounds)
    private String origin;
    private String arrivalDate; // Stored as ISO 8601 date string
    private String name;
    private String aniSound; // The sound the animal makes
    private String sex; // Gender of the animal
    private int numOfAnimals; // Total number of animals (perhaps for a species count or group size)

    // --- Getters and Setters (Public) ---

    public String getAnimalID() {
        return animalID;
    }

    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAniSound() {
        return aniSound;
    }

    public void setAniSound(String aniSound) {
        this.aniSound = aniSound;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getNumOfAnimals() {
        return numOfAnimals;
    }

    public void setNumOfAnimals(int numOfAnimals) {
        this.numOfAnimals = numOfAnimals;
    }
}
