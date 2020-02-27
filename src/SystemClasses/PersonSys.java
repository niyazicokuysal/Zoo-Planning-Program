

package SystemClasses;


import PersonInheritance.Admin;
import PersonInheritance.Janitor;
import PersonInheritance.Visitor;
import PersonInheritance.Person;
import java.util.ArrayList;
import java.util.TreeSet;


public class PersonSys {
    
    public static ArrayList<Person> personArr = new ArrayList();
    
    public static TreeSet<Person> personSet = new TreeSet();
    
    public static void listToSet(){
        for (int i = 0; i < personArr.size(); i++) {
            personSet.add(personArr.get(i));
        }
    }
 
    public static String display(){
        
        String res = "";
        
        for(int i  = 0; i < personArr.size() ; i++){
            res += personArr.get(i).toString();
        }
        
        return res;
    }
    
    public static void addPerson(String type, String name, String surname, int day, int age, String pos){
         
        int id;
        id = (int) Math.floor(Math.random() * 9999);
        
        if(type.equalsIgnoreCase("Admin")){
                 
            id += 10000;
            Admin ad = new Admin(name, surname, id, pos);
            personArr.add(ad);
        
        }else if(type.equalsIgnoreCase("Janitor")){
                    
            id += 20000;
            Janitor jt = new Janitor(name, surname, id, day);
            personArr.add(jt);
                    
   
        }else if(type.equalsIgnoreCase("Visitor")){
            
            id += 30000;
            Visitor vs = new Visitor(name, surname, id, age);
            personArr.add(vs);
            
        }     
    }
    
    
    public static boolean deleteVisitor(int id){
        
        for (int i = 0; i < personArr.size(); i++) {
            if(personArr.get(i).getId() == id && personArr.get(i) instanceof Visitor){
                
                personArr.remove(i);
                return true;
            }
        }
        
        return false;
    }
    
    public static Person searchPerson(int id){
        
        for (int i = 0; i < personArr.size(); i++) {
            if (personArr.get(i).getId() == id) {
                return personArr.get(i);
                
            }
        }
    
        return null;
    }
 
    public static boolean isAdmin(int id){
        
        for (int i = 0; i < personArr.size(); i++) {
            if (personArr.get(i).getId() == id && personArr.get(i) instanceof Admin) {
                return true;
                
            }
        }
    
        return false;
    }
   
    
    public static double makeDiscount(int id){
        if(searchPerson(id) instanceof Visitor){
            
            Visitor temp = (Visitor) searchPerson(id);
            return temp.ticketDiscount(temp.age, AnimalsSys.getTicketPrice());
        
        
        }
        
        return AnimalsSys.getTicketPrice();
    }
    
    public static double giveSalary(int id){
        if(searchPerson(id) instanceof Janitor){
            
            Janitor temp = (Janitor) searchPerson(id);
            return temp.calcSalary(temp.workDay, AnimalsSys.getTotalNumber());
        
        
        }
        
        return 0;
    }
    
    
    
  
}
