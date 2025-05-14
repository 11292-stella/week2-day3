package Esercizi;

import java.time.LocalDate;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {


        Product p1 = new Product(1L,"Biscotti","Books",100.5);
        Product p2 = new Product(2L,"cereali","Boys",3.0);
        Product p3 = new Product(2L,"Formaggio","Books",101.4);
        Product p4 = new Product(4L,"Pizza","Boys",5.5);
        Product p5 = new Product(5L,"Maccheroni al Formaggio","Baby",5.5);
        Product p6 = new Product(6L,"Panino","Baby",200.4);

        List<Product> prodotti = List.of(p1,p2,p3,p4,p5,p6);

        Custumer c1 = new Custumer(1L,"Mario",20);
        Custumer c2 = new Custumer(2L,"Luigi",32);
        Custumer c3 = new Custumer(3L,"Yoshi",44);
        Custumer c4 = new Custumer(4L,"Yoda",20);
        Custumer c5 = new Custumer(5L,"Zelda",3);
        Custumer c6 = new Custumer(6L,"Topo",20);


        Order o1 = new Order(1L, "spedito", LocalDate.of(2021, 2, 15), LocalDate.of(2021, 2, 20), List.of(p1, p2), c1);
        Order o2 = new Order(2L, "consegnato", LocalDate.of(2021, 3, 10), LocalDate.of(2021, 3, 15), List.of(p5, p6), c2);
        Order o3 = new Order(3L, "in attesa", LocalDate.of(2021, 1, 5), LocalDate.of(2021, 1, 10), List.of(p3), c3);
        Order o4 = new Order(3L, "in attesa", LocalDate.of(2021, 1, 5), LocalDate.of(2021, 1, 10), List.of(p2), c4);
        Order o5 = new Order(3L, "consegnato", LocalDate.of(2021, 1, 5), LocalDate.of(2021, 1, 10), List.of(p1, p6), c5);
        Order o6 = new Order(3L, "in attesa", LocalDate.of(2021, 1, 5), LocalDate.of(2021, 1, 10), List.of(p3,p5), c6);
        List<Order> ordini = List.of(o1, o2, o3,o4,o5,o6);


        //Esercizio1 filtrare i prodotti della categoria Books con prezzo >100
       List<Product> allBooks = prodotti.stream().filter(product -> product.getCategory().equals("Books")).filter(product -> product.getPrice() > 100).toList();
        System.out.println("Prodotti books con prezzo > 100: ");
        allBooks.forEach(System.out ::println);
        System.out.println("--------------------------------------");

        //Esercizio 2 ottenere una lista di ordini che appartengono alla categoria "baby

        List<Order> ordiniConBaby = ordini.stream().filter(order -> order.getProducts().stream().anyMatch(product -> product.getCategory().equals("Baby"))).toList();
        ordiniConBaby.forEach(System.out ::println);
        System.out.println("--------------------------------------");
        //esercizio 3 ottenere una lista di prodotti che appartengono alla categoria Boys
        //modifica il prezzo di questi prodotti applicando il 10% di sconto e raccogli i risultati in una nuova lista

        List<Product> allBoys = prodotti.stream().filter(product -> product.getCategory().equals("Boys")).map(product -> new Product(product.getId(), product.getName(), product.getCategory(), product.getPrice()*9)).toList();
        allBoys.forEach(System.out ::println);










    }
}
