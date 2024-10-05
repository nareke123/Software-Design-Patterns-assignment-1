public class Test {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        log1.log("Spange bob square pants");
        log2.log("Patrick and MrKrabs");

        System.out.println(log1 == log2);
    }
}
