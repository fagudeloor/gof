package gangs.of.four.creational.abstractfactory;

public class GUIBuilder {

    public void buildWindow(AbstractWidgetFactory widgetFactory){
        Window window = widgetFactory.createWindow();
        window.seTitle("New Window");
        widgetFactory.createScroll();
        widgetFactory.createNavigationButtons();
    }

}
