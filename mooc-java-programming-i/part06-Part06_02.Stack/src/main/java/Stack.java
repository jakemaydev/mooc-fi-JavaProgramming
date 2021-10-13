import java.util.ArrayList;

public class Stack {
    private ArrayList<String> s;

    public Stack(){
        this.s = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return this.s.isEmpty();
    }

    public void add(String value){
        s.add(value);
    }

    public ArrayList<String> values(){
        return s;
    }

    public String take(){
        String top = this.s.get(s.size() - 1);

        this.s.remove(top);

        return top;
    }
}
