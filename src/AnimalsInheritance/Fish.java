

package AnimalsInheritance;

import AnimalHasA.Piranha;
import AnimalHasA.Shark;
import java.util.ArrayList;


public class Fish extends Animals{

    private String color;
    private ArrayList<Piranha> piranhaList = new ArrayList();
    private ArrayList<Shark> sharkList = new ArrayList();

    public Fish(int serialNumber, String Gender, String color, ArrayList<Piranha> pirhanaList,  ArrayList<Shark> sharkList){
        super(serialNumber, Gender);
        this.color = color;
        this.piranhaList = pirhanaList;
        this.sharkList = sharkList;
    }

    public String getColor() {
        return color;
    }

    public ArrayList<Piranha> getPirhanaList() {
        return piranhaList;
    }

    public ArrayList<Shark> getSharkList() {
        return sharkList;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getGender() {
        return Gender;
    }
    
    
    
    
    @Override
    public double ticketPrice() {
        double piranha1 = piranhaList.size() * 3;
        double shark1 = sharkList.size() * 7;
        
        
        return piranha1 + shark1;
    }

    @Override
    public String toString() {
        return "\n\nFish Section" + super.toString() + "\ncolor=" + color + "\nNutrition Type of Piranhas'=" + piranhaList + "\n\nOrigin of Sharks'=" + sharkList;
    }
    
    
    
}
