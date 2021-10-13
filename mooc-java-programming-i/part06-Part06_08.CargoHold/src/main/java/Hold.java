import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (!suitcase.equals(null)) {
            if (totalWeight() < maxWeight && (suitcase.totalWeight() <= maxWeight - totalWeight())) {
                suitcases.add(suitcase);
            }
        }
    }

    public int totalWeight() {
        int total = 0;

        for (Suitcase suitcase : suitcases) {
            total += suitcase.totalWeight();
        }

        return total;
    }

    public void printItems(){
        for(Suitcase s : suitcases){
            s.printItems();
        }
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
}
