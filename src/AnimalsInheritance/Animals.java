

package AnimalsInheritance;

public abstract class Animals{
    protected int serialNumber;
    protected String Gender;
    protected static int numberOfAnimals = 0;

    public Animals(int serialNumber, String Gender) {
        this.serialNumber = serialNumber;
        this.Gender = Gender;
        numberOfAnimals++;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getGender() {
        return Gender;
    }

    public static int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    
    
    public abstract double ticketPrice();

    @Override
    public String toString() {
        return "\n\nSerial Number=" + serialNumber + "\nGender=" + Gender;
    }
    
    
    
}
