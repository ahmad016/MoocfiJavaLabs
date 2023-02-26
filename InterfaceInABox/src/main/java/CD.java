public class CD implements Packable{
    private String artist, name;
    private int pubYear;
    private double weight;

    public CD(String artist, String name, int pubYear){
        this.artist = artist;
        this.name = name;
        this.pubYear = pubYear;
        
        weight = 0.1;
    }

    public double weight(){
        return weight;
    }

    public String toString(){
        return artist + ": " + name + " (" + pubYear + ")";
    }
}
