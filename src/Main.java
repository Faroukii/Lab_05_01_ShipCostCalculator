public class Main{
    public static void main(String[] args) {
        //Prompt the user to enter the price of the package
        System.out.print("Enter the price of the package: ");
        int itemPrice = 99;
        double shippingFee = .02;
        double shippingCost = itemPrice * shippingFee;
        double actualShippingCost = shippingCost + itemPrice;
        //Calculate cost of shipping

        if (itemPrice >= 100) {

            System.out.println("The shipping cost is free. ");
        } else {
            if (itemPrice < 100);

            System.out.println("Your total cost is: " + actualShippingCost);
        }
    }
}


