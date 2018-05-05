package app;

//   javac -d . *
//   java app.Main 

public class Main{

    public static void main(String[] args) {
        Painter painter = new Painter();

        painter.prepareEasel();
        painter.cleanBrushes();
        painter.setPaintStyle(new ModernPaintStyle());
        painter.paint();
        painter.setPaintStyle(new ClassyPaintStyle());
        painter.paint();
    }
}