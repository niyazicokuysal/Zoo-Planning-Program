

package PersonInheritance;


public class Visitor extends Person {
    public int age;

    public Visitor(String name, String surname, int id, int age) {
        super(name, surname, id);
        this.age = age;
    }
    
    
    public double ticketDiscount(int age, double price){ // will take getTicketPrice from AnimalsSys
        if(age <= 15){
            price = price * 20 / 100;
            return price;
        
        }else 
            return price;
        
    }

    @Override
    public String toString() {
        return "\n\nVisitor\n" + super.toString() + "\nAge=" + age;
    }

    @Override
    public int compareTo(Person o) {
       return id - o.id;
    }
    
    
}
