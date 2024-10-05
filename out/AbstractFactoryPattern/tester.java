//Паттерн "Abstract Factory" — это паттерн проектирования, который предоставляет интерфейс для создания семейств взаимосвязанных или взаимозависимых объектов, не специфицируя их конкретные классы. В отличие от Factory Method, Abstract Factory создает не один объект, а семейство объектов, которые могут работать вместе и иметь общие свойства.
public class tester {
    public static void main(String[] args) {
        Factory windFactory = new WindowsFactory();
        Factory macFactory = new MacFactory();

        Button windButton = windFactory.createButton();
        Window windWindow = windFactory.createWindow();
        Button macButton = macFactory.createButton();
        Window macWindow = macFactory.createWindow();

        windButton.click();
        windWindow.open();
        macButton.click();
        macWindow.open();
    }

}
