

package AnimalHasA;


public class Chimp {
    public String name;

    public Chimp(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nName=" + name;
    }
}
