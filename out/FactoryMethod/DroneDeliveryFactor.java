public class DroneDeliveryFactor extends DeliveryFactory{
    @Override
    Transport createTransport() {
        return new Drone();
    }
}
