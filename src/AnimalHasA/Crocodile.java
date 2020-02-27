

package AnimalHasA;


public class Crocodile {
    public String origin;

    public Crocodile(String origin) {
        this.origin = origin;
    }
    

    @Override
    public String toString() {
        return "\nOrigin=" + origin;
    }
    
}
