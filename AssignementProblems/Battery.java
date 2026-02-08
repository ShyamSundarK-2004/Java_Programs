package april.AssignementProblems;

public class Battery {
	String type;
	int batteryCapacity;

	Battery(String type, int batteryCapacity) {
		this.type = type;
		this.batteryCapacity = batteryCapacity;
	}

	void batteryDetails() {
		System.out.println("Battery Type: " + type);
		System.out.println("Battery Capacity: " + batteryCapacity + "mAh");
	}
}
