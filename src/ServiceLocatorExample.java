public class ServiceLocatorExample {
    public static class ServiceLocator {
        private static ServiceLocator serviceLocator = new ServiceLocator();
        public static ServiceLocator getInstance() {
            return serviceLocator;
        }
        private IEngine engine;

        private ServiceLocator() {
        }

        public IEngine getEngine() {
            return engine;
        }

        public void setEngine(IEngine engine) {
            this.engine = engine;
        }
    }

    public static class Car implements ICar {
        private final IEngine engine = ServiceLocator.getInstance().getEngine();

        @Override
        public void start() {
            engine.start();
        }
    }

    public static void main(String[] args) {
        ServiceLocator.getInstance().setEngine(new Gas());
        Car gasCar = new Car();
        gasCar.start();

        ServiceLocator.getInstance().setEngine(new Electric());
        Car electricCar = new Car();
        electricCar.start();
    }
}
