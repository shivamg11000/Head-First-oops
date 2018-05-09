package app;

public class OldPaintStyle implements PaintStyle{
    public String getStyle(){
        return "OldPaintStyle";
    }

    public void paint(){
        System.out.println("Painting " + getStyle() + " way!...");
    }
}