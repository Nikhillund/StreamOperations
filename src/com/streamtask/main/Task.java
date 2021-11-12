package com.streamtask.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.streamtask.dao.CarDao;
import com.streamtask.model.Car;



public class Task {
	
	
	
	static void findById() {
		CarDao cd =new CarDao();
		List<Car> ls =cd.getCarDetails();
		
		 ls.stream().filter(i -> i.getCarId()==1).collect(Collectors.toList()).forEach(System.out::println);
	}
	
	static void findByName(String name) {
		CarDao cd =new CarDao();
		List<Car> ls =cd.getCarDetails();
		
		 ls.stream().filter(i -> i.getName().equals(name)).collect(Collectors.toList()).forEach(System.out::println);
	}
	static void findCheapestCar() {
		CarDao cd =new CarDao();
		List<Car> ls =cd.getCarDetails();
		
		System.out.println(ls.stream().collect(Collectors.summarizingLong(Car::getPrice)).getMin());
	}
	private static void printNumber(List<Integer> ls) {
		
		ls.stream().forEach(System.out::println);
		
	}
	private static void findEvenNumber(List<Integer> ls) {
			List<Integer> collect = ls.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(collect);
	}

	private static void findExpensiveCar() {
		CarDao cd =new CarDao();
		List<Car> ls =cd.getCarDetails();
		
		System.out.println(ls.stream().collect(Collectors.summarizingLong(Car::getPrice)).getMax());
		
	}
	private static void findSumofCarPrice() {
		// TODO Auto-generated method stub
		CarDao cd =new CarDao();
		List<Car> ls =cd.getCarDetails();
		
		System.out.println(ls.stream().collect(Collectors.summarizingLong(Car::getPrice)).getSum());
	
	}
	private static void findAverageCarPrice() {
		// TODO Auto-generated method stub
		CarDao cd =new CarDao();
		List<Car> ls =cd.getCarDetails();
		
		System.out.println(ls.stream().collect(Collectors.summarizingLong(Car::getPrice)).getAverage());
	
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls =new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			ls.add(i);
		}
		printNumber( ls);
		
		findEvenNumber(ls);
		
		findById();
		findByName("Ritz");
		findCheapestCar();
		findExpensiveCar();
		findSumofCarPrice();
		findAverageCarPrice();
		findNumberofCars();
		findByBrand("Suzuki");
		findAllBrands();
		findAllCars();
		findByColor("white");
		countByColor("red");
		countByVariant("2 Wheel");

	}

	private static void countByVariant(String variant) {
		// TODO Auto-generated method stub
		CarDao cd =new CarDao();
		List<Car> ls =cd.getCarDetails();
		System.out.println(ls.stream().filter(i->i.getVariant().equals(variant)).count()+" cars with variant "+variant);
	}

	private static void countByColor(String color) {
		// TODO Auto-generated method stub
		CarDao cd =new CarDao();
		List<Car> ls =cd.getCarDetails();
		System.out.println(ls.stream().filter(i->i.getColour().equals(color)).count()+" cars with color "+ color);
	}

	private static void findByColor(String color) {
		// TODO Auto-generated method stub
		CarDao cd =new CarDao();
		List<Car> ls =cd.getCarDetails();
		ls.stream().filter(i -> i.getColour().equals(color)).collect(Collectors.toList()).forEach(System.out::println);;
	}

	private static void findAllCars() {
		// TODO Auto-generated method stub
		CarDao cd =new CarDao();
		List<Car> ls =cd.getCarDetails();
		ls.stream().map(i -> i.getBrand()+" "+i.getName()).collect(Collectors.toList()).forEach(System.out::println);
	}

	private static void findAllBrands() {
		// TODO Auto-generated method stub
		CarDao cd =new CarDao();
		List<Car> ls =cd.getCarDetails();
		ls.stream().map(i-> i.getBrand()).distinct().forEach(System.out::println);
		
	}

	private static void findNumberofCars() {
		// TODO Auto-generated method stub
		CarDao cd =new CarDao();
		List<Car> ls =cd.getCarDetails();
		
		System.out.println(ls.stream().collect(Collectors.summarizingLong(Car::getCarId)).getCount());
	
	}
	
	private static void findByBrand(String brand) {
		CarDao cd =new CarDao();
		List<Car> ls =cd.getCarDetails();
		
		ls.stream().filter(i -> i.getBrand().equals(brand)).collect(Collectors.toList()).forEach(System.out::println);
	}

	


}
