

package AnimalsInheritance;

import AnimalHasA.Crocodile;
import AnimalHasA.Snake;
import java.util.ArrayList;


public class Reptile extends Animals{

    private double lenght;
    private ArrayList<Snake> snakeList = new ArrayList();
    private ArrayList<Crocodile> crocodileList = new ArrayList();

    public Reptile(int serialNumber, String Gender, double lenght, ArrayList<Snake> snakeList, ArrayList<Crocodile> crocodileList) {
        super(serialNumber, Gender);
        this.lenght = lenght;
        this.snakeList = snakeList;
        this.crocodileList = crocodileList;
    }

    public double getLenght() {
        return lenght;
    }

    public ArrayList<Snake> getSnakeList() {
        return snakeList;
    }

    public ArrayList<Crocodile> getCrocodileList() {
        return crocodileList;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getGender() {
        return Gender;
    }
    
    
    @Override
    public double ticketPrice() {
        double snake1 = snakeList.size() * 5;
        double crocodile1 = crocodileList.size() * 10;
        
        
        return snake1 + crocodile1;    }

    @Override
    public String toString() {
        return "\n\nReptile Seciton" + super.toString() + "\nLenght=" + lenght + "\nVenom type of Snakes'=" + snakeList + "\n\nOrigins of Crocodiles'=" + crocodileList;
    }
    
    
    
}
