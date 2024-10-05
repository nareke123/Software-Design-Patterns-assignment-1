public class SuperMegaTest {
    public static void main(String[] args) {
        Product originalProduct = new Product("laptop", 1213244124);
        Product cloneProduct = originalProduct.clone();

        cloneProduct.setPrice(87234658);

        System.out.println("original pr:" + originalProduct);
        System.out.println("copy pr:" + cloneProduct);
    }
}
