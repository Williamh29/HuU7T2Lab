import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class AnotherRunner {
    public static void main(String[] args) {
        Car car1 = new Car("bob", 9000);
        Car car2 = new Car("nemo", 1000);
        Car car3 = new Car("ben", 10000);
        Car[] carsArray = {car1, car2, car3};
        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(carsArray));
        System.out.println(carList);
    }

}
