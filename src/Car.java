public class Car {

    private String password;

    Car() {
        this.password = "password1234";
    }


    public void turnEngineOn(CarKey key) {
        System.out.println("Bilen er tændt");
        if (key.equals(password)) {
            System.out.println("Bilen er tændt");

        } else {
            System.out.println("Bilen kan ikke tænde, forkert nøgle");
        }

    }
}


