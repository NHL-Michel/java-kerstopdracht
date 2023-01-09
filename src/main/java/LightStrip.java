import Enums.ChristmasLightColor;

public class LightStrip {
    private RgbLed[] rgbLeds;
    public final int lengthInMeter = 1;
    public final int MAXRGBLED = 10;

    public LightStrip() {
        this.setRgbLeds();
    }

    public void update(ChristmasLightColor christmasLightColor){
        for (RgbLed rgbLed : rgbLeds) {
            rgbLed.update(christmasLightColor);
        }
    }


    // start setters/getters
    public void setRgbLeds() {
        this.rgbLeds = new RgbLed[MAXRGBLED];
        for (int i = 0; i < MAXRGBLED; i++){
            this.rgbLeds[i] = new RgbLed();
        }
    }


    public int getLengthInMeter() {
        return this.lengthInMeter;
    }
}
