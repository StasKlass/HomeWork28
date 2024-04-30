package org.example;

import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.List;

public class ArtGallery {
   private List<ArtWork> artWorks = new ArrayList<>();

   public ArtGallery() {

   }

   public List<ArtWork> getArtWorks() {
      return artWorks;
   }

   public void setArtWorks(List<ArtWork> artWorks) {
      this.artWorks = artWorks;
   }

   public ArtGallery(List<ArtWork> artWorks) {
      this.artWorks = artWorks;
   }

   public void addArtwork(ArtWork artWork){
      artWorks.add(artWork);
   }
   public void displayAllArtworks(){
      System.out.println("Все работы в галерее:");
      for (ArtWork artWork : artWorks){
         artWork.displayInfo();
         System.out.println();
      }
   }
}

