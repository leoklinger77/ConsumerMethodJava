package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// decrease the price by 10 percent
		double factor = 1.1;
		Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice() * factor);
		};

		list.forEach(cons);

		list.forEach(System.out::println);

	}

}
