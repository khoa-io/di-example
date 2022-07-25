public class Electric implements IEngine {
    private void powerOn() {
        System.out.println("Electric.powerOn()");
    }
    @Override
    public void start() {
        powerOn();
        System.out.println("Electric.start()");
    }
}