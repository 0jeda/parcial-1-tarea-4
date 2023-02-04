package House.rooms;

import House.furniture.BedSize;

public class BedRoom {
    BedSize bedSize;
   private boolean tv;
   private int height;
   private int width;
   private String color;

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public BedSize getBedSize() {
        return bedSize;
    }

    public void setBedSize(BedSize bedSize) {
        this.bedSize = bedSize;
    }
}
