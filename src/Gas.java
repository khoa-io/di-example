public class Gas implements IEngine {
    private void ignite() {
        System.out.println("Gas.ignite()");
    }
    @Override
    public void start() {
        ignite();
        System.out.println("Gas.start()");
    }
}
