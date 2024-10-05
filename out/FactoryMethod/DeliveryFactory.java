//Паттерн "Factory Method" используется для создания объектов, позволяя подклассам решать, какой именно класс инстанцировать. Это позволяет избежать жесткой привязки к конкретным классам и сделать код более гибким.

abstract class DeliveryFactory {
    abstract Transport createTransport();

    public void startDelivery(){
        Transport transport = createTransport();
        transport.deliver();
    }


}
