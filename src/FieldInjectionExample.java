public class FieldInjectionExample {
    public static void main(String[] args) {
        Car gasCar = new Car();
        gasCar.setEngine(new Gas());
        gasCar.start();

        Car electricCar = new Car();
        electricCar.setEngine(new Electric());
        electricCar.start();
    }
    private static class Car implements ICar {
        private IEngine mEngine;

        void setEngine(IEngine engine) {
            mEngine = engine;
        }

        @Override
        public void start() {
            System.out.println("Car.start()");
            mEngine.start();
        }
    }
}
