

package AnimalHasA;

import SharkInterface.SharkInterface;


public class Shark implements SharkInterface{
    public String kind;

    public Shark(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "\nKind=" + kind;
    }

    @Override
    public int calcMeal() {
       if(kind.equalsIgnoreCase("white")){
            return 100;
       }else if(kind.equalsIgnoreCase("tiger")){
            return 75;
       }else if(kind.equalsIgnoreCase("Hammer")){
            return 125;
       }
            return 0;
    }
    
}
