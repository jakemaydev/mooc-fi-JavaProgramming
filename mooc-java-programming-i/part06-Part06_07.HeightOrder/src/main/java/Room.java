import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;

    public Room(){
        this.people = new ArrayList<>();
    }

    public void add(Person p){
        people.add(p);
    }

    public Person shortest(){
        if(people.isEmpty()){
            return null;
        }

        int height = people.get(0).getHeight();
        Person shortest = people.get(0);

        for(Person p : people){
            if(p.getHeight() < height){
                height = p.getHeight();
                shortest = p;
            }
        }
        return shortest;
    }

    public Person take(){
        if(people.isEmpty()){
            return null;
        }

        Person s = shortest();
        people.remove(s);

        return s; 
    }

    public boolean isEmpty(){
        return people.isEmpty();
    }

    public ArrayList<Person> getPersons(){
        return people;
    }
}
