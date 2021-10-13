public class Film {
    private String name;
    private int ageRating;

    public Film(String filmName, int rating){
        name = filmName;
        ageRating = rating;
    }

    public String name(){
        return name;
    }

    public int ageRating(){
        return ageRating;
    }
}
