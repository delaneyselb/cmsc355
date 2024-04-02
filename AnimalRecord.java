public class AnimalRecord {
    private String animalName;
    private String breedSpecies;
    private String ownerContactInformation;
    private int locationRoomNumber;
    private String animalBirthDate; // Changed to String to accommodate the MMDDYYYY format
    private String allergies;
    private String currentMedications;
    private String medicalHistory;

    // Constructor
    public AnimalRecord(String animalName, String breedSpecies, String ownerContactInformation,
            int locationRoomNumber, String animalBirthDate, String allergies,
            String currentMedications, String medicalHistory) {
        this.animalName = animalName;
        this.breedSpecies = breedSpecies;
        this.ownerContactInformation = ownerContactInformation;
        this.locationRoomNumber = locationRoomNumber;
        this.animalBirthDate = animalBirthDate;
        this.allergies = allergies;
        this.currentMedications = currentMedications;
        this.medicalHistory = medicalHistory;
    }

    // Getters
    public String getAnimalName() {
        return animalName;
    }

    public String getBreedSpecies() {
        return breedSpecies;
    }

    public String getOwnerContactInformation() {
        return ownerContactInformation;
    }

    public int getLocationRoomNumber() {
        return locationRoomNumber;
    }

    public String getAnimalBirthDate() {
        return animalBirthDate;
    }

    public String getAllergies() {
        return allergies;
    }

    public String getCurrentMedications() {
        return currentMedications;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    // Setters
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setBreedSpecies(String breedSpecies) {
        this.breedSpecies = breedSpecies;
    }

    public void setOwnerContactInformation(String ownerContactInformation) {
        this.ownerContactInformation = ownerContactInformation;
    }

    public void setLocationRoomNumber(int locationRoomNumber) {
        this.locationRoomNumber = locationRoomNumber;
    }

    public void setAnimalBirthDate(String animalBirthDate) {
        this.animalBirthDate = animalBirthDate;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public void setCurrentMedications(String currentMedications) {
        this.currentMedications = currentMedications;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    // toString method
    @Override
    public String toString() {
        return "Animal Records:\n" +
                "\tAnimal Name: " + animalName + "\n" +
                "\tBreed/Species: " + breedSpecies + "\n" +
                "\tOwner Contact Information: " + ownerContactInformation + "\n" +
                "\tLocation/RoomNumber: " + locationRoomNumber + "\n" +
                "\tAnimal Birth Date: " + animalBirthDate + "\n" +
                "\tAllergies: " + allergies + "\n" +
                "\tCurrent Medications: " + currentMedications + "\n" +
                "\tMedical History: " + medicalHistory + "\n";
    }
}
