package main;

import java.util.Scanner;

import factory.AbstractFactory;
import factory.FactoryProvider;
import vo.Animal;
import vo.TypeAnimalFactory;
import vo.TiposDeAnimal;



public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		AbstractFactory vertebradosFactory = FactoryProvider.getFactory(TypeAnimalFactory.VERTEBRADO);
		AbstractFactory invertebradosFactory = FactoryProvider.getFactory(TypeAnimalFactory.INVERTEBRADO);
		
		System.out.println("***ANIMAIS***");
		System.out.println("1 - Vertebrados");
		System.out.println("2 - Invertebrados");
		System.out.println("Digite sua opção:");
		
		int option = scanner.nextInt();
		
		if (option == 1) {
			Animal elephant = vertebradosFactory.getAnimal(TiposDeAnimal.Elephant);
			elephant.eat();
			
			Animal shark = vertebradosFactory.getAnimal(TiposDeAnimal.SHARK);
			shark.eat();

		} else if (option == 2) {
			Animal bee = invertebradosFactory.getAnimal(TiposDeAnimal.BEE);
			bee.eat();
			
			Animal ant = invertebradosFactory.getAnimal(TiposDeAnimal.ANT);
			ant.eat();
		}
		
		scanner.close();
	}
}
