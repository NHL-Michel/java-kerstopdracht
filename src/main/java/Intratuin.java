import Interfaces.PriceLabel;

import java.util.ArrayList;

public class Intratuin {
    private ArrayList<PriceLabel> products;

    public Intratuin() {
        this.products = new ArrayList<>();
    }

    public void addProduct(PriceLabel product) {
        this.products.add(product);
    }

    public Boolean removeProduct(PriceLabel product){
        return products.removeIf(element -> element.equals(product));
    }

    private void getStockInfo() {
        System.out.println("---- Intratuin Stock ----");
        for (PriceLabel product : products) {
            if (product instanceof ChristmasTree tree) {
                if (tree.getChristmasLight() != null) {
                    System.out.printf("A %s with %s - $%f", tree.getDescription(), tree.getChristmasLight().getDescription(), tree.getTotalPrice());
                }
            } else {
                System.out.printf("%s - $%s%n", product.getDescription(), product.getPrice());
            }
        }
    }

    private void turnOnChristmasTrees() {
        for (PriceLabel product : products) {
            if (product instanceof ChristmasTree tree) {
                tree.turnOnLights();
            }
        }
    }
}
