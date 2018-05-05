package app;

public class Painter{
    private PaintStyle paintStyle;

    public Painter() {
        this.paintStyle = null;
    }

    public void prepareEasel() {
        System.out.println("\nPreparing the Easel");
        System.out.println("Easel Prepared\n");
    }

    public void cleanBrushes() {
        System.out.println("\nCleaning the brushes");
        System.out.println("brushes cleaned\n");
    }

    public void setPaintStyle(PaintStyle paintStyle) {
        this.paintStyle = paintStyle;
    }

    public void paint() {
        if (paintStyle == null){
            System.out.println(".....Set paint style first.....");
            return;
        }
        paintStyle.paint();    
    }
}