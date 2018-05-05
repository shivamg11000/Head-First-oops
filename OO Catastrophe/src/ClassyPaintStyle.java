package app;

public class ClassyPaintStyle implements PaintStyle{
    public String getStyle(){
        return "ClassyPaintStyle";
    }

    public void paint(){
        System.out.println("Painting " + getStyle() + " way!...");
    }
}