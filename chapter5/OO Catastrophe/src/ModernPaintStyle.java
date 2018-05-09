package app;

public class ModernPaintStyle implements PaintStyle{
    public String getStyle(){
        return "ModernPaintStyle";
    }

    public void paint(){
        System.out.println("Painting " + getStyle() + " way!...");
    }
}