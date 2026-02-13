package ArrayListOOP;

public class CartTest {

    public static void main(String[] args) {

        Cart cart1 = new Cart();

        System.out.println(cart1);

        cart1.addItem(1007);
        cart1.addItem(1035);

        System.out.println(cart1);


        System.out.println("Number of items in the cart: " + cart1.amountOfItemsInCart());


        System.out.println(cart1.getItem(1));


        cart1.setItem(0, 2057);
        System.out.println(cart1);

        cart1.removeItem(1);
        System.out.println(cart1);

        System.out.println("Index of 2057 in cart array: " + cart1.getIndex(2057));

    }

}
