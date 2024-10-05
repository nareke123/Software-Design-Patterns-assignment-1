public class ShipDeliveryFactor extends DeliveryFactory{
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
