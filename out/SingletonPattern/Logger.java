//Паттерн "Singleton" (Одиночка) гарантирует, что у класса будет только один экземпляр, и предоставляет к нему глобальную точку доступа. Этот паттерн полезен, когда нужен только один объект для управления ресурсами или данными в приложении, например, для работы с базой данных, настройками конфигурации или логированием.
public class Logger {
    private static Logger instance;

    private Logger() {

    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log entry: " + message);
    }
}



