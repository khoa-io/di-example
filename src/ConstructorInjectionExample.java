public class ConstructorInjectionExample {
    public static void main(String[] args) {
        Car gasCar = new Car(new Gas());
        gasCar.start();

        Car electricCar = new Car(new Electric());
        electricCar.start();
    }

    private static class Car implements ICar {
        private final IEngine mEngine;

        public Car(IEngine engine) {
            mEngine = engine;
        }

        @Override
        public void start() {
            System.out.println("Car.start()");
            mEngine.start();
        }
    }
}
