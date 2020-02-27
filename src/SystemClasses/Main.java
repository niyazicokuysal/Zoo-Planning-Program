/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import GUI.PersonFrame;
import static SystemClasses.AnimalsSys.animalArr;
import java.util.ArrayList;

/**
 *
 * @author niyazi
 */
public class Main {
     
    public static void main(String args[]) {
        
        PersonSys.addPerson("Admin", "Niyazi", "Cokuysal", 0, 0, "Acounting");
        PersonSys.addPerson("Admin", "FuatCan", "Akdag", 0, 0, "Managment");
        PersonSys.addPerson("Admin", "Leyla", "Sezer", 0, 0, "IT");
        PersonSys.addPerson("Janitor", "Murat", "Muratoğlu", 10, 0, "");
        PersonSys.addPerson("Janitor", "Zeynep", "Zeynepol", 14, 0, "");
        PersonSys.addPerson("Visitor", "Ali", "Veli", 0, 16, "");
        PersonSys.addPerson("Visitor", "Bilin", "Neyaptı", 0, 40, "");
        PersonSys.addPerson("Visitor", "Abdullah", "Atalar", 0, 60, "");
        PersonSys.addPerson("Visitor", "Kardelen", "Ayşe", 0, 10, "");
        
        Chimp ch1 = new Chimp("Jack");
        Chimp ch2 = new Chimp("Jessey");
        Chimp ch3 = new Chimp("Jonnie");
        Chimp ch4 = new Chimp("Abbey");
        Chimp ch5 = new Chimp("Chief");
        
        ArrayList<Chimp> chr = new ArrayList();
        chr.add(ch5);
        chr.add(ch4);
        chr.add(ch3);
        chr.add(ch2);
        chr.add(ch1);
        
        Elephant el1 = new Elephant(5000);
        Elephant el2 = new Elephant(4000);
        Elephant el3 = new Elephant(3000);
        Elephant el4 = new Elephant(5500);
        Elephant el5 = new Elephant(4500);
        
        ArrayList<Elephant> elr = new ArrayList();
        
        elr.add(el5);
        elr.add(el4);
        elr.add(el3);
        elr.add(el2);
        elr.add(el1);
        
        Mammal tempM1 = new Mammal(34567, "Male", 14, chr, elr);
        Mammal tempM2 = new Mammal(56783, "Female", 20, chr, elr);
        Mammal tempM3 = new Mammal(10902, "Male", 7, chr, elr);
        
        animalArr.add(tempM1);
        animalArr.add(tempM2);
        animalArr.add(tempM3);
        
        Snake sk1 = new Snake("Deadly");
        Snake sk2 = new Snake("None");
        Snake sk3 = new Snake("Medium");
        Snake sk4 = new Snake("Medium");
        Snake sk5 = new Snake("None");
        
        ArrayList<Snake> skr = new ArrayList();
        
        skr.add(sk5);
        skr.add(sk4);
        skr.add(sk3);
        skr.add(sk2);
        skr.add(sk1);
        
        Crocodile cr1 = new Crocodile("River");
        Crocodile cr2 = new Crocodile("Lake");
        Crocodile cr3 = new Crocodile("River");
        Crocodile cr4 = new Crocodile("Lake");
        Crocodile cr5 = new Crocodile("Lake");
        
        ArrayList<Crocodile> crr = new ArrayList();
        
        crr.add(cr5);
        crr.add(cr4);
        crr.add(cr3);
        crr.add(cr2);
        crr.add(cr1);
        
        Reptile tempR1 = new Reptile(21342, "Male", 2.3, skr, crr);
        Reptile tempR2 = new Reptile(56700, "Male", 1.3, skr, crr);
        
        animalArr.add(tempR1);
        animalArr.add(tempR2);
        
        Piranha pr1 = new Piranha("Meat");
        Piranha pr2 = new Piranha("Meat");
        Piranha pr3 = new Piranha("Meat");
        Piranha pr4 = new Piranha("Meat");
        Piranha pr5 = new Piranha("Veg");
        
        ArrayList<Piranha> prr = new ArrayList();
        
        prr.add(pr1);
        prr.add(pr2);
        prr.add(pr3);
        prr.add(pr4);
        prr.add(pr5);
        
        Shark sh1 = new Shark("Mediterrian");
        Shark sh2 = new Shark("Atlas");
        Shark sh3 = new Shark("Atlas");
        Shark sh4 = new Shark("Mediterrian");
        Shark sh5 = new Shark("Mediterrian");
        
        ArrayList<Shark> shr = new ArrayList();
        
        shr.add(sh1);
        shr.add(sh2);
        shr.add(sh3);
        shr.add(sh4);
        shr.add(sh5);
        
        Fish tempF1 = new Fish(45100, "Female", "Grey", prr, shr);
        
        animalArr.add(tempF1);
        
        PersonFrame pf = new PersonFrame();
        pf.setVisible(true);
    }
}
