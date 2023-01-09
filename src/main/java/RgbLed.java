import Enums.ChristmasLightColor;
import Enums.DiodeColor;
import Enums.State;

public class RgbLed {
    private Diode[] diodes;

    public RgbLed() {
        this.setDiodes();
    }

    public void update(ChristmasLightColor christmasLightColor){
        switch (christmasLightColor){
            case WHITE -> this.turnOnAllDiodes();
            case RED -> this.turnOnRedDiodes();
            case PURPLE -> this.turnOnRedBlueDiodes();
        }
    }

    private void turnOnAllDiodes(){
        for (Diode diode : diodes) {
            diode.setDiodeState(State.ON);
        }
    }

    private void turnOffAllDiodes(){
        for (Diode diode : diodes) {
            diode.setDiodeState(State.OFF);
        }
    }

    private void turnOnRedDiodes(){
        for (Diode diode : diodes) {
            if (diode.getDiodeColor() == DiodeColor.RED){
                diode.setDiodeState(State.ON);
            } else {
                diode.setDiodeState(State.OFF);
            }
        }
    }

    private void turnOnRedBlueDiodes(){
        for (Diode diode : diodes) {
            DiodeColor color = diode.getDiodeColor();
            if (color == DiodeColor.RED || color == DiodeColor.BLUE){
                diode.setDiodeState(State.ON);
            } else {
                diode.setDiodeState(State.OFF);
            }
        }
    }

    // start setters/getters
    public void setDiodes() {
        this.diodes = new Diode[3];
        this.diodes[0] = new Diode(DiodeColor.RED);
        this.diodes[1] = new Diode(DiodeColor.GREEN);
        this.diodes[2] = new Diode(DiodeColor.BLUE);
    }
}
