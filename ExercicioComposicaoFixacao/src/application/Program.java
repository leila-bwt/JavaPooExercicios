package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;


public class Program {
    public static void main(String[] args) throws ParseException {

        /*Product p = new Product("TV", 1000);
        OrderItem oi1 = new OrderItem(1, 1000, p);
        System.out.println(oi1.getProduct().getName());*/
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        //Client cli = new Client("Maria", "maria@gmail.com", sdf.parse("20/10/1995"));

        System.out.print("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY)");
        Date bithDate = sdf.parse(sc.next());

        Client client = new Client(name, email, bithDate);
        // instancía o cliente com os dados que serão digitados.

        System.out.print("Enter order data:  ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        // valueOf converte o String digitado pelo cliente para o valor correspondente do orderStatus

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order?  ");
        int N = sc.nextInt();
        for (int i=1; i<=N; i++){
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();

            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.println("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem it = new OrderItem(quantity, productPrice, product);

            order.addItem(it);
        }
        System.out.println();
        System.out.println(order);

        sc.close();
    }
}