package com.streamtask.dao;

import java.util.ArrayList;
import java.util.List;

import com.streamtask.model.Car;

public class CarDao {
	
	public List<Car> getCarDetails(){
		List<Car> ls =new ArrayList<Car>();
		
		
		ls.add(new Car(1, "Honda", "City", "4 Wheel", "black", "V12",5000000L));
		ls.add(new Car(2, "Chevrolet", "Cruz", "2 Wheel", "red", "V10",400000L));
		ls.add(new Car(3, "Suzuki", "Ritz", "2 Wheel", "white", "V8",450000L));
		ls.add(new Car(4, "Suzuki", "Swift", "2 Wheel", "grey", "V8", 340000L));
		ls.add(new Car(5, "Hyundai", "i20", "4 Wheel", "white", "V11", 350000L));
		ls.add(new Car(6, "volkswagen", "polo", "4 Wheel", "blue", "V10",360000L));
		
		return ls;
	}

}
