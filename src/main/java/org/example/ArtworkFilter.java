package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArtworkFilter {
    public List<ArtWork> filterType(String type , List<ArtWork> artWorks){
        List<ArtWork> filterArtworks = new ArrayList<>();
        for (ArtWork artWork : artWorks){
            if (artWork instanceof Painting && type.equalsIgnoreCase("painting")){
                filterArtworks.add(artWork);
            } else if (artWork instanceof  Sculpture && type.equalsIgnoreCase("sculpture")){
                filterArtworks.add(artWork);
            }
        }
        return filterArtworks;
    }
}
