package House.rooms;

public class Kitchen {
    //ATRIBUTOS
    private boolean stove;
    private boolean sink;
    private boolean refrigerator;
    private boolean oven;
    private int windows;
    private int width;
    private int height;
    private String color;

    //GETTERS Y SETTERS
    public boolean isStove(){
        return stove;
    }
    public void setStove(boolean stove) {
        this.stove = stove;
    }

    public boolean isSink() {
        return sink;
    }
    public void setSink(boolean sink) {
        this.sink = sink;
    }

    public boolean isOven() {
        return oven;
    }
    public void setOven(boolean oven) {
        this.oven = oven;
    }

    public boolean isRefrigerator() {
        return refrigerator;
    }
    public void setRefrigerator(boolean refrigerator) {
        this.refrigerator = refrigerator;
    }

    public int getWindows() {
        return windows;
    }
    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
