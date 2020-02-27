

package PersonInheritance;


public class Janitor extends Person {
    public int workDay;

    public Janitor(String name, String surname, int id, int workDay) {
        super(name, surname, id);
        this.workDay = workDay;
    }
    
    public double calcSalary(int workDay, int animalNum){
        double salary = animalNum * 4 * workDay;
        return salary;
    }

    @Override
    public String toString() {
        return "\n\nJanitor\n" + super.toString() + "\nWork Day=" + workDay;
    }

    @Override
    public int compareTo(Person o) {
       return id - o.id;
    }
    
}
