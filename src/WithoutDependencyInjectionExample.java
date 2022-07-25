public class WithoutDependencyInjectionExample {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        gasCar.start();

        ElectricCar electricCar = new ElectricCar();
        electricCar.start();
    }

    public static class GasCar implements ICar {
        private final IEngine engine = new Gas();

        @Override
        public void start() {
            engine.start();
            System.out.println("GasCar.start()");
        }
    }

    public static class ElectricCar implements ICar {
        private final IEngine engine = new Electric();

        @Override
        public void start() {
            System.out.println("ElectricCar.start()");
            engine.start();
        }
    }
}
