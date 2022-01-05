package by.gbyzzz.task03classes.beans;

import java.math.BigDecimal;
import java.util.List;

/**
 * This class describes a bouquet.
 * @author Anton Pinchuk
 *
 */

public class Bouquet extends AllGoods {
    private BigDecimal totalPrice = BigDecimal.ZERO;

    public void add(Flowers flower){
        super.flowers.add(flower);
        totalPrice = totalPrice.add(flower.getPrice());
    }
    public void add(Accessories accessory){
        super.accessories.add(accessory);
        totalPrice = totalPrice.add(accessory.getPrice());
    }
    public void setName(String name){
        super.setName(name);
    }

    public List<Flowers> getFlowers() {
        return super.flowers;
    }

    public List<Accessories> getAccessories() {
        return super.accessories;
    }


    public void setFlowers(List<Flowers> flowers) {
        super.flowers = flowers;
    }
    public void setAccessories(List<Accessories> accessories) {
        super.accessories = accessories;
    }

    public void setTotalPrice() {
        for(Flowers flower : super.flowers){
            totalPrice = totalPrice.add(flower.getPrice());
        }
        for(Accessories accessory : super.accessories){
            totalPrice = totalPrice.add(accessory.getPrice());
        }
    }

    @Override
    public String toString() {
        String bouquetString = new String();
        for(Flowers flower : super.flowers)
            bouquetString += flower.toString();
        for(Accessories accessory : super.accessories)
            bouquetString += accessory.toString();
        return "Bouquet{" + "name: " + super.name + ",\n"
                + "bouquet:" + bouquetString + "\n"
                + "total price:" + totalPrice + '}';
    }
}

