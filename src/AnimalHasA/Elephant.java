

package AnimalHasA;


public class Elephant {
    public double weight;

    public Elephant(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nWeight=" + weight;
    }
    
}
