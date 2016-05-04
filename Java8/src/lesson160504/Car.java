package lesson160504;

import java.util.Optional;

public class Car {
	private Optional<Insurance> insurance = Optional.empty();

	public Optional<Insurance> getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = Optional.of(insurance);
	}

	public void tune() {
		System.out.println("tuned");
	}

}
