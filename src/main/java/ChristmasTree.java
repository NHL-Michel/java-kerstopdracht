import Interfaces.PriceLabel;
import Enums.State;

import java.util.List;

public abstract class ChristmasTree implements PriceLabel {
    protected int length;
    protected ChristmasLight christmasLight;
    protected List<ChristmasBall> christMasBalls;
    protected float price;
    protected String description;


    public ChristmasTree(int length, float price, String description) {
        this.length = length;
        this.price = price;
        this.description = description;
    }

    /**
     *
     * @return the total price, including the christmas lights, the christmas tree price and the price of all the christmas balls.
     */
    public float getTotalPrice(){
        float totalPrice = 0;
        totalPrice += christmasLight.getPrice();
        totalPrice += this.getPrice();
        for (ChristmasBall christMasBall : christMasBalls) {
            totalPrice += christMasBall.getPrice();
        }
        return totalPrice;
    }

    public void turnOnLights(){
        this.christmasLight.setState(State.OFF);
    }

    public void turnOffLights(){
        this.christmasLight.setState(State.OFF);
    }

    // start setters/getters
    public float getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public ChristmasLight getChristmasLight() {
        return this.christmasLight;
    }

    public void setChristmasLight(ChristmasLight christmasLight) {
        this.christmasLight = christmasLight;
    }
}
