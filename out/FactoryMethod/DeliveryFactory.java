abstract class DeliveryFactory {
    abstract Transport createTransport();

    public void startDelivery(){
        Transport transport = createTransport();
        transport.deliver();
    }


}
