package factory;

import vo.TypeAnimalFactory;

public class FactoryProvider {
	public static AbstractFactory getFactory(TypeAnimalFactory factoryType) {
		if(factoryType == TypeAnimalFactory.INVERTEBRADO) {
			return new InvertebradoFactory();
		} else if (factoryType == TypeAnimalFactory.VERTEBRADO) {
			return new VertebradoFactory();
		} else {
			return null;
		}
	}
}
