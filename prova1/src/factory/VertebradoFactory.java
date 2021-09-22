package factory;

import vo.Animal;
import vo.TiposDeAnimal;
import vo.Elephant;
import vo.Shark;

public class VertebradoFactory implements AbstractFactory {

	@Override
	public Animal getAnimal(TiposDeAnimal animal) {
		
		if(animal.equals(TiposDeAnimal.Elephant)) {
			return new Elephant();
		} else if(animal.equals(TiposDeAnimal.SHARK)) {
			return new Shark();
		} else {
			return null;
		}
	}

}
