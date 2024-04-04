package product.ser;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ProductDeserializer {

public static void main(String[] args) {
    String filePath = args[0];
    
    try (FileInputStream fileInputStream = new FileInputStream(filePath);
         ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
        Product product = (Product) objectInputStream.readObject();

        System.out.println("Code: " + product.getCode());
        System.out.println("Name: " + product.getName());
        System.out.println("Type: " + product.getType());
        System.out.println("Is Discount: " + product.isDiscount());
        System.out.println("Ingredients: ");
        for (String ingredient : product.getIngredients()) {
            System.out.println(ingredient);
        }
        System.out.println("Price: " + product.getPrice());
    } catch (Exception e) {
    }
}
}