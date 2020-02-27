

package AnimalsInheritance;

import AnimalHasA.Chimp;
import AnimalHasA.Elephant;
import java.util.ArrayList;


public class Mammal extends Animals{
    
    private int age;
    private ArrayList<Chimp> chimpList = new ArrayList();
    private ArrayList<Elephant> elephantList = new ArrayList();
    
    public Mammal(int serialNumber, String Gender, int age, ArrayList<Chimp> chimpList, ArrayList<Elephant> elephantList) {
        super(serialNumber, Gender);
        this.age = age;
        this.chimpList = chimpList;
        this.elephantList = elephantList;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Chimp> getChimpList() {
        return chimpList;
    }

    public ArrayList<Elephant> getElephantList() {
        return elephantList;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getGender() {
        return Gender;
    }
    
    
    @Override
    public double ticketPrice() {
        double chimp1 = chimpList.size() * 3;
        double elephant1 = elephantList.size() * 10;
        
        return chimp1 + elephant1;
    }

    @Override
    public String toString() {
        return "\n\nMammal Section" + super.toString() + "\nage=" + age + "\nName of Chimps'=" + chimpList + "\n\nWeight of Elephants'=" + elephantList;
    }
    
    
    
    
}
