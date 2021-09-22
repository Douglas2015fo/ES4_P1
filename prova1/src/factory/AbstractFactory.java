package factory;

import vo.Animal;
import vo.TiposDeAnimal;

public interface AbstractFactory {
	Animal getAnimal(TiposDeAnimal animalType);
}
