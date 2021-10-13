public class Song {
    private String name;
    private int length;

    public Song(String songName, int songLength){
        name = songName;
        length = songLength;
    }

    public String name(){
        return name;
    }

    public int length(){
        return length;
    }
}
