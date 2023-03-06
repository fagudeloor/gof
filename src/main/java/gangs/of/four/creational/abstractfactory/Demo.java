package gangs.of.four.creational.abstractfactory;

public class Demo {

    public static void main(String[] args) {
        GUIBuilder builder = new GUIBuilder();

        AbstractWidgetFactory widgetFactory = null;

        String platform = "MACOSX";

        if (platform.equals("MACOSX")){
            widgetFactory = new MacOSWidgetFactory();
        } else {
            widgetFactory = new MacOSWidgetFactory();
        }

        builder.buildWindow(widgetFactory);
    }
}
