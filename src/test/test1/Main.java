package test.test1;

public class Main {

    public static void main(String[] args) {

        Car car = new Car.Builder().color( "red" ).power( 1000 ).build();
        System.out.println(car);

    }
}
