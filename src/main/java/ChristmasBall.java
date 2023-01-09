import Interfaces.PriceLabel;
import Enums.ChristmasBallColor;
import Exception.ChristmasBallException;

public class ChristmasBall implements PriceLabel {
    private int diameterInCm;
    private ChristmasBallColor christmasBallColor;
    private float price;
    private String description;


    public ChristmasBall(int diameterInCm, ChristmasBallColor christmasBallColor, String description) throws ChristmasBallException {
        this.setDiameterInCm(diameterInCm);
        this.christmasBallColor = christmasBallColor;
        this.setPrice();
        this.description = description;
    }

    // start setters/getters
    public int getDiameterInCm() {
        return this.diameterInCm;
    }

    public void setDiameterInCm(int diameterInCm) throws ChristmasBallException {
        if (diameterInCm > 30){
            throw new ChristmasBallException(String.format("The christmasballs diameter is to big! This is %d and the max is 30!", diameterInCm));
        }
        this.diameterInCm = diameterInCm;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice() {
        switch (this.christmasBallColor){
            case BLUE -> {
                this.price = 1;
            }
            case RED -> {
                this.price = 1.10f;
            }
            case GOLD -> {
                this.price = 1.50f;
            }
            case WHITE -> {
                this.price = 0.80f;
            }
        }
    }

    public ChristmasBallColor getChristmasBallColor() {
        return this.christmasBallColor;
    }

    public void setChristmasBallColor(ChristmasBallColor christmasBallColor) {
        this.christmasBallColor = christmasBallColor;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    // end setters/getters
}
