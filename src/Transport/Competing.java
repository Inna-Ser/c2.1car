package Transport;

public interface Competing {
    public static final String START_MOVE = "начал движение";
    public static final String FINISH_MOVE = "закончил движение";
    public static final String PIT_STOP = "поменял резину";
    public static final String MAKE_DIAGNOSTICS = "провел диагностику";
    public static final String FIX_THE_VEHICLE = "починил машину";

    void doPitStop();
    public void toDoDiagnostic();
    public void toFixTheVehicle();

    void findBestCircleTime(double timeCircle1, double timeCircle2);

    void findMaximumSpeed(int speedCircle1, int speedCircle2);

}