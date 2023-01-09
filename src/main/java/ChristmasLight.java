import Interfaces.PriceLabel;
import Enums.ChristmasLightColor;
import Enums.State;

import java.util.ArrayList;

public class ChristmasLight implements PriceLabel {
    private int lengthInMeter;
    private ChristmasLightColor christmasLightColor;
    private ArrayList<LightStrip> lightStrips;

    private float price;
    private String description;

    private State state;

    public ChristmasLight(int lengthInMeter, ChristmasLightColor christmasLightColor, String description) {
        this.setLengthInMeter(lengthInMeter);
        this.christmasLightColor = christmasLightColor;
        this.addLightStrips(this.lengthInMeter);
        this.state = State.OFF;
        this.setPrice();
        this.description = description;
    }

    public void update(){
        if (this.state == State.OFF){
            return;
        }

        for (LightStrip lightStrip : lightStrips) {
            lightStrip.update(christmasLightColor);
        }
    }
    private void updatePriceByLength(float lengthInMeter){
        for (int i = 0; i < this.lengthInMeter; i++){
            this.price += lengthInMeter * 100;
        }
    }

    // start setters/getters
    public int getLengthInMeter() {
        return this.lengthInMeter;
    }

    public void setLengthInMeter(int lengthInMeter) {
        if (lengthInMeter == 1 || lengthInMeter == 5 || lengthInMeter == 10 || lengthInMeter == 30) {
            this.lengthInMeter = lengthInMeter;
        }
    }

    public ChristmasLightColor getChristmasLightColor() {
        return this.christmasLightColor;
    }

    public void setChristmasLightColor(ChristmasLightColor christmasLightColor) {
        this.christmasLightColor = christmasLightColor;
    }

    public ArrayList<LightStrip> getLightStrips() {
        return this.lightStrips;
    }

    public void addLightStrips(int lengthInMeter) {
        for (int i = 0; i < lengthInMeter; i++){
            this.lightStrips.add(new LightStrip());
        }
    }

    public void setPrice(){
        switch (this.christmasLightColor){
            case WHITE -> {
                this.price = 5;
                this.updatePriceByLength(0.03f);
            }
            case RED -> {
                this.price = 8;
                this.updatePriceByLength(0.05f);
            }
            case PURPLE -> {
                this.price = 9.50f;
                this.updatePriceByLength(0.08f);
            }
        }
    }

    public float getPrice(){
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    // end setters/getters
}
