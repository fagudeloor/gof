package gangs.of.four.creational.abstractfactory;


public interface AbstractWidgetFactory {

    public Window createWindow();
    public Scroll createScroll();
    public Button[] createNavigationButtons();


}
