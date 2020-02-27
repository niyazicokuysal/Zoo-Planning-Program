

package SystemClasses;

import AnimalHasA.Chimp;
import AnimalHasA.Crocodile;
import AnimalHasA.Elephant;
import AnimalHasA.Piranha;
import AnimalHasA.Shark;
import AnimalHasA.Snake;
import AnimalsInheritance.Animals;
import AnimalsInheritance.Fish;
import AnimalsInheritance.Mammal;
import AnimalsInheritance.Reptile;
import java.util.ArrayList;


public class AnimalsSys {
    public static ArrayList<Animals> animalArr = new ArrayList();
    
    
    public static double getTicketPrice(){
        double temp = 0;
        
        for (int i = 0; i < animalArr.size(); i++) {
           temp += animalArr.get(i).ticketPrice();
        }
        
        return temp;
    }
    
    
    public static boolean addMammal(int age, String gender, ArrayList<Chimp> arrc, ArrayList<Elephant> arre){

        int id;
        id = (int) Math.floor(Math.random() * 99999);
  
        Mammal tempM = new Mammal(id, gender, age, arrc, arre);
                
        animalArr.add(tempM);
                
        return true;     
    }    
    
    
    public static boolean addReptile(String gender, double lenght, ArrayList<Crocodile> arrc, ArrayList<Snake> arrs){

        int id;
        id = (int) Math.floor(Math.random() * 99999);
  
        Reptile tempR = new Reptile(id, gender, lenght, arrs, arrc);
        
        animalArr.add(tempR);
                
        return true;     
    }   
     
      
    public static boolean addFish(String color, String gender, ArrayList<Piranha> arrp, ArrayList<Shark> arrs){

        int id;
        id = (int) Math.floor(Math.random() * 99999);

        Fish tempF = new Fish(id, gender, color, arrp, arrs);
        
        animalArr.add(tempF);
                
        return true;     
    }   
                
    public static int getMammalNumber(){
        
        Mammal temp;
        int num = 0;
        
        for (int i = 0; i < animalArr.size(); i++) {
            if (animalArr.get(i) instanceof Mammal) {
                temp = (Mammal) animalArr.get(i);
                num += temp.getChimpList().size();
                num += temp.getElephantList().size();
            }
        }
        return num;
    }
    
    public static int getReptileNumber(){
        
        Reptile temp;
        int num = 0;
        
        for (int i = 0; i < animalArr.size(); i++) {
            if (animalArr.get(i) instanceof Reptile) {
                temp = (Reptile) animalArr.get(i);
                num += temp.getCrocodileList().size();
                num += temp.getSnakeList().size();
            }
        }
        return num;
    }
        
    public static int getFishNumber(){
        
        Fish temp;
        int num = 0;
        
        for (int i = 0; i < animalArr.size(); i++) {
            if (animalArr.get(i) instanceof Fish) {
                temp = (Fish) animalArr.get(i);
                num += temp.getPirhanaList().size();
                num += temp.getSharkList().size();
            }
        }
        return num;
    }
    
    public static String display(){
        String res = "";
        
        for (int i = 0; i < animalArr.size(); i++) {
            res += animalArr.get(i).toString();
        }
    
        return res;
    }
    
    public static String searchSection(int id){

        for (int i = 0; i < animalArr.size(); i++) {
            if (animalArr.get(i).getSerialNumber() == id) {
                return animalArr.get(i).toString();
                
            }
        }
    
        return "no";
    }
    
    public static boolean deleteSection(int id){
        for (int i = 0; i < animalArr.size(); i++) {
            if (animalArr.get(i).getSerialNumber() == id) {
                animalArr.remove(i);
                return true;
            }
        }
    
        return false;
    }
    
    public static int getTotalNumber(){
        int temp = 0;
        temp += getMammalNumber();
        temp += getReptileNumber();
        temp += getFishNumber();
        
    
        return temp;
    }
}
