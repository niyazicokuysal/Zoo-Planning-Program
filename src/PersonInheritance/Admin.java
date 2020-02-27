

package PersonInheritance;


public class Admin extends Person {
    public String position;

    public Admin(String name, String surname, int id, String position) {
        super(name, surname, id);
        this.position = position;
    }

    @Override
    public String toString() {
        return "\n\nAdmin\n" + super.toString() + "\nPosition=" + position;
    }
    
    @Override
    public int compareTo(Person o) {
       return id - o.id;
    }
}
