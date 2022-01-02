package by.gbyzzz.task03classes.beans;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bouquet{
    private List<Flowers> flowers = new ArrayList<>();
    private List<Accessories> accessories = new ArrayList<>();
    private BigDecimal totalPrice = BigDecimal.ZERO;

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void add(Flowers flowers){
        this.flowers.add(flowers);
        totalPrice = totalPrice.add(flowers.getPrice());
    }
    public void add(Accessories accessories){
        this.accessories.add(accessories);
        totalPrice = totalPrice.add(accessories.getPrice());
    }

    public List<Flowers> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flowers> flowers) {
        this.flowers = flowers;
    }

    @Override
    public String toString() {
        String bouquetString = new String();
        for(Flowers flower : flowers)
            bouquetString += flower.toString();
        for(Accessories accessory : accessories)
            bouquetString += accessory.toString();
        return "Bouquet{" +
                "bouquet=" + bouquetString + "\n" +
                "total price:" + totalPrice + '}';
    }
}

