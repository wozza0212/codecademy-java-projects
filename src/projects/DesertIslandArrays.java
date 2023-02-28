package projects;

import java.util.ArrayList;

public class DesertIslandArrays {
    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<>();
        desertIslandPlaylist.add("One Love");
        desertIslandPlaylist.add("Who let the dog's out");
        desertIslandPlaylist.add("We jammin");
        desertIslandPlaylist.add("New York");
        desertIslandPlaylist.add("Blah Blah Blah");
        desertIslandPlaylist.add("Cant think of any more songs!");

        System.out.println(desertIslandPlaylist.size());
        System.out.println(desertIslandPlaylist);

        desertIslandPlaylist.remove(5);
        desertIslandPlaylist.remove(4);

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        String tempA = desertIslandPlaylist.get(2);
        String tempB = desertIslandPlaylist.get(0);
        desertIslandPlaylist.set(0, tempA);
        desertIslandPlaylist.set(2, tempB);

        System.out.println(desertIslandPlaylist);

        //Swap it back
        String tempC = desertIslandPlaylist.get(2);
        desertIslandPlaylist.set(0, desertIslandPlaylist.get(2));
        desertIslandPlaylist.set(2, tempC);

        System.out.println(desertIslandPlaylist);


    }
}
