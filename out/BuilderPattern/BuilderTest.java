public class BuilderTest {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .setNumRooms(5)
                .setHasGarage(false)
                .setNumFloors(2)
                .setHasPool(true)
                .build();

        System.out.println(house);
    }
}
