

package AnimalHasA;


public class Piranha {
    public String nutrition;

    public Piranha(String nutrition) {
        this.nutrition = nutrition;
    }

    @Override
    public String toString() {
        return "\nNutrition=" + nutrition;
    }
}
