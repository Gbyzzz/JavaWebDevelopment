package by.gbyzzz.task03classes.beans;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bouquet{
    private List<Flowers> flowers = new ArrayList<>();
    private BigDecimal totalPrice = BigDecimal.valueOf(0);

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void add(Flowers flowers){
        this.flowers.add(flowers);
        this.totalPrice.add(flowers.getPrice());
    }

    public List<Flowers> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flowers> flowers) {
        this.flowers = flowers;
    }

    @Override
    public String toString() {
        String flowersString = new String();
        for(Flowers flower : flowers)
            flowersString += flower.toString() + "\n";
        return "Bouquet{" +
                "bouquet=" + flowersString +
                "total price:" + totalPrice + '}';
    }
}

