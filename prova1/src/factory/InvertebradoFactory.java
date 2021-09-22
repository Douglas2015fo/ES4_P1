package factory;

import vo.Animal;
import vo.TiposDeAnimal;
import vo.Elephant;
import vo.Shark;

public class InvertebradoFactory implements AbstractFactory {

	@Override
	public Animal getAnimal(TiposDeAnimal animal) {
		if(animal.equals(TiposDeAnimal.ANT)) {
			return new Elephant();
		} else if(animal.equals(TiposDeAnimal.BEE)) {
			return new Shark();
		} else {
			return null;
		}
	}

}
