package lesson160504;

import java.util.Optional;

public class Person {
	
	private Optional<Car> car = Optional.empty();

	public Optional<Car> getCar() {
		return car;
	}

	public Car getRealCar() {
		return car.orElse(null);
	}
	
	public void setCar(Car car) {
		this.car = Optional.of(car);
	}

}
