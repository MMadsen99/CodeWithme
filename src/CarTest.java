public class CarTest {
    public static void main(String[] args) {
        testSuite();
    }

    private  static void  testSuite() {
        System.out.println("Testsuiten kører");
        testStartCar();
        CarKey key = new CarKey("password1234");
    }

    private static void testStartCar() {
        Car car1 = new Car();
        CarKey key = new CarKey("password1234");
        car1.turnEngineOn(key);



    }


}
