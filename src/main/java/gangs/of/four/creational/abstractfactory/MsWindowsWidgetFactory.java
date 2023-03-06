package gangs.of.four.creational.abstractfactory;

public class MsWindowsWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow() {
        return new MSWindow();
    }

    @Override
    public Scroll createScroll() {
        return new MSScroll();
    }

    @Override
    public Button[] createNavigationButtons() {
        Button[] buttons = {
                new MSButton("close window"),
                new MSButton("expand window"),
                new MSButton("collapse window"),
                new MSButton("back"),
        };

        return buttons;
    }
}
