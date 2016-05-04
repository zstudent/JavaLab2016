package lesson160504;

import java.util.Optional;

public class Example {

	// static String getCarInsurance(Person person) {
	// if (person != null) {
	// Car car = person.getCar();
	// if (car != null) {
	// Insurance ins = car.getInsurance();
	// if (ins != null) {
	// String insName = ins.getName();
	// if (insName != null) {
	// return insName;
	// }
	// }
	// }
	// }
	// return "Unknown";
	// }

	// static String getCarInsurance(Person person) {
	// Optional<Car> car = person.getCar();
	// Optional<Insurance> insurance = car.flatMap(Car::getInsurance);
	// Optional<String> name = insurance.map(Insurance::getName);
	// return name.orElse("Unknown");
	// }

	static String getCarInsurance(Person person) {
		return Optional.ofNullable(person).flatMap(Person::getCar)
				.flatMap(Car::getInsurance).map(Insurance::getName)
				.orElseGet(() -> "Hello" + " World!");
	}

	public static void main(String[] args) {

		Person person = new Person();
		String insName = getCarInsurance(person);
		
		person.setCar(new Car());
		
		person.getCar().ifPresent(car -> {
			car.tune();
		});
		
	}

}
