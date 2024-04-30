package org.example;

public class Painting implements ArtWork {
    private String paintType;
    private String imageSize;
    private String creator;


    public Painting(String paintType, String imageSize, String creator) {
        this.paintType = paintType;
        this.imageSize = imageSize;
        this.creator = creator;
    }


    public String getPaintType() {
        return paintType;
    }

    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }

    public String getImageSize() {
        return imageSize;
    }

    public void setImageSize(String imageSize) {
        this.imageSize = imageSize;
    }

    public void displayInfo() {
        System.out.println("Painting info:");
        System.out.println("Paint Type:" + paintType);
        System.out.println("Image Size:" + imageSize);
        System.out.println("Creator:" +  creator);
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}


