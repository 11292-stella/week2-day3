package Esercizi;

import java.util.List;

public class AppMain {

    public static void main(String[] args) {


        Product p1 = new Product(1L,"Biscotti","Books",100.5);
        Product p2 = new Product(2L,"cereali","Boys",3.0);
        Product p3 = new Product(2L,"Formaggio","Books",101.4);
        Product p4 = new Product(4L,"Pizza","Boys",5.5);
        Product p5 = new Product(5L,"Maccheroni al Formaggio","Baby",5.5);
        Product p6 = new Product(5L,"Panino","Baby",200.4);

        List<Product> prodotti = List.of(p1,p2,p3,p4,p5,p6);

        //Esercizio1 filtrare i prodotti della categoria Books con prezzo >100
       List<Product> allBooks = prodotti.stream().filter(product -> product.getCategory().equals("Books")).filter(product -> product.getPrice() > 100).toList();
        System.out.println("Prodotti books con prezzo > 100: ");
        allBooks.forEach(System.out ::println);










    }
}
