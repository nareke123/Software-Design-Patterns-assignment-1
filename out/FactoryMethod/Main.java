public class Main {
    public static void main(String[] args) {
        DeliveryFactory trucks = new TruckDeliveryFactory();
        DeliveryFactory ships = new ShipDeliveryFactor();
        DeliveryFactory drones = new DroneDeliveryFactor();

        trucks.startDelivery();
        ships.startDelivery();
        drones.startDelivery();
    }
}
