public class WindowsFactory implements  Factory{
    @Override
    public Button createButton() {
        return new WindowdButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }


}
