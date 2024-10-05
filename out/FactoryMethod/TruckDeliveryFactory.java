public class TruckDeliveryFactory extends DeliveryFactory{
    @Override
    Transport createTransport() {
        return new Truck();

    }
}


