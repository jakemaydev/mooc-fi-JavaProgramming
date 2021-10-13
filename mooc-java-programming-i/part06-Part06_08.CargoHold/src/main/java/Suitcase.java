import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
    }

    public void addItem(Item i){
        if(totalWeight() < maxWeight && (i.getWeight() <= maxWeight - totalWeight())){
            items.add(i);
        }
    }

    public int totalWeight(){
        int totalWeight = 0;

        for(Item i : items){
            totalWeight += i.getWeight();
        }

        return totalWeight;
    }

    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        
        int heaviest = items.get(0).getWeight();
        Item heavy = items.get(0);

        for(Item i : items){
            if(i.getWeight() > heaviest){
                heaviest = i.getWeight();
                heavy = i;
            }
        }

        return heavy;
    }

    public void printItems(){
        for(Item i : items)
            System.out.println(i);
    }

    public String toString(){
        if(this.items.isEmpty()){
            return "no items (0 kg)";
        } else if (items.size() == 1){
            return "1 item  " + "(" + totalWeight() + " kg)";
        } else {
            return items.size() + " items (" + totalWeight() + " kg)";
        }
    }
}
