package Transport;

import Driver.Driver;

public class Bus<D extends Driver>  extends Transport implements Competing {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void doStartMove() {
        super.doStartMove();
    }

    @Override
    public void doFinishMove() {
        super.doFinishMove();
    }

    @Override
    public void doPitStop() {
        super.doPitStop();
    }

    @Override
    public void FindBestCircleTime(double timeCircle1, double timeCircle2) {
        super.FindBestCircleTime(timeCircle1, timeCircle2);
    }

    @Override
    public void findMaximumSpeed(int speedCircle1, int speedCircle2) {
        super.findMaximumSpeed(speedCircle1, speedCircle2);
    }
}
