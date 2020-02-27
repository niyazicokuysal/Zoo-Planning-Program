

package AnimalHasA;


public class Snake {
    public String venom;

    public Snake(String venom) {
        this.venom = venom;
    }

    @Override
    public String toString() {
        return "\nVenom=" + venom;
    }
    
}
