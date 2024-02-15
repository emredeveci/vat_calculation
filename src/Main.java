
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variables needed for this code
        //VAT stands for 'value added tax'
        double price, priceWithVat, vatRate = 0, vat;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the price: ");
        price = input.nextDouble();

        if ( price > 0 && price <= 1000) {
            vatRate = 0.18;
        } else if ( price > 1000) {
            vatRate = 0.08;
        }

        priceWithVat = price + (price * vatRate);
        vat = price * vatRate;

        System.out.println("Price without \"value added tax\" is: " + price);
        System.out.println("Price with \"value added tax\" is: " + priceWithVat);
        System.out.println("Value added tax is " + vat);
        System.out.println("Value added tax rate is " + vatRate);
    }
}