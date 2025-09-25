package work04;

import week04_work02.Bus;
import week04_work02.Taxi;
import week04_work02.Vehicle;

public class InstanceofExample {
	 public static void main(String[] args) {
		
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		 
		ride(taxi);
		System.out.println();
		ride(bus);
		}
	 public static void ride(Vehicle vehicle) {
		 if(vehicle instanceof Bus bus) {
			 bus.checkFare();
			 }
		 vehicle.run();
		 }
	}
