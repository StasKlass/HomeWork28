package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArtGallery gallery = new ArtGallery();
        gallery.addArtwork(new Painting("oil" ,"77×53" , "Leonardo da Vinci" ));
        gallery.addArtwork(new Painting("oil" , "50×100" , "Van Gogh"));
        gallery.addArtwork(new Sculpture("Bronze" , 255.5 , "EIGH9IE"));
        gallery.addArtwork(new Sculpture("Clay" , 723.34 , "823ugfr"));
        gallery.displayAllArtworks();
        ArtworkFilter filter = new ArtworkFilter();
        List<ArtWork> paintings = filter.filterType("painting" , gallery.getArtWorks());
       for (ArtWork painting : paintings){
           painting.displayInfo();
           System.out.println();
       }
    }
}
