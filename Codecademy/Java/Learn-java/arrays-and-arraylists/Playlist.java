/**
 * A class to demonstrate the modification of a playlist using ArrayList.
*/

import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        // Original Playlist
        desertIslandPlaylist.add("Learn Java first");
        desertIslandPlaylist.add("Learn Object-Oriented Programming (OOP)");
        desertIslandPlaylist.add("Coding Challenges");
        desertIslandPlaylist.add("Build Java Applications");
        desertIslandPlaylist.add("Learn Java Libraries and Frameworks");

        System.out.println("Original Playlist:");
        System.out.println(desertIslandPlaylist);
        
        // Modified Playlist
        int indexA = desertIslandPlaylist.indexOf("Build Java Applications");
        int indexB = desertIslandPlaylist.indexOf("Learn Java Libraries and Frameworks");

        String tempA = desertIslandPlaylist.get(indexA);

        desertIslandPlaylist.set(indexA, desertIslandPlaylist.get(indexB));
        desertIslandPlaylist.set(indexB, tempA);

        System.out.println("Modified Playlist:");
        System.out.println(desertIslandPlaylist);

    }
}

/* 
Output:
Original Playlist:
[Learn Java first, Learn Object-Oriented Programming (OOP), Coding Challenges, Build Java Applications, Learn Java Libraries and Frameworks]
Modified Playlist:
[Learn Java first, Learn Object-Oriented Programming (OOP), Coding Challenges, Learn Java Libraries and Frameworks, Build Java Applications]
*/