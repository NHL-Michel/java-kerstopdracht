import Enums.DiodeColor;
import Enums.State;

public class Diode {
    private DiodeColor diodeColor;
    private State state;

    public Diode(DiodeColor diodeColor) {
        this.diodeColor = diodeColor;
        this.state = State.OFF;
    }

    public DiodeColor getDiodeColor() {
        return this.diodeColor;
    }

    public Boolean getDiodeState() {
        return this.state == State.ON ? true : false;
    }

    public void setDiodeState(State state) {
        this.state = state;
    }
}
