public class Main {
    public static void main(String[] args) {
        double purchasePrice = 49.99;
        double taxRate = 0.05;
        double salesTax = purchasePrice * taxRate;

        System.out.println("The price of the item is: $" + purchasePrice);
        System.out.println("The sales tax at a rate of 5% is: $" + salesTax);
    }
}