package Session16_Hash._Homeweork;

import java.util.Objects;

public class Song {
    // Create a Song class with title, artist, and length fields.
   private  String title;
   private  String artist;
   private int lenght;

   // Constructorul

    public Song(String title, String artist, int lenght) {
        this.title = title;
        this.artist = artist;
        this.lenght = lenght;
    }

    //Implement the equals() method to check only the title and artist fields.

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return lenght == song.lenght && Objects.equals(title, song.title) && Objects.equals(artist, song.artist);
    }
// Implement the hashCode() method to use the title and artist fields to calculate the hash code.
    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }
}
// clasa main pentru printare

class SongTest{
    public static void main(String[] args){
        Song s1 =  new Song("la vie e belle", "Andreea Bocelli", 165);
        Song s2 =  new Song("Amore", "Pavarotti", 220);

        System.out.println("s1.equals(s2)" + s1.equals(s2));
        System.out.println("Hashcode.s1" + s1.hashCode());
        System.out.println("Hashcode.s2" + s2.hashCode());
        System.out.println("Hash codes are equals?" + (s1.hashCode() == s2.hashCode()));
    }
}