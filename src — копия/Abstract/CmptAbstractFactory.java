package Abstract;

import NonAbstractFactory.ObjectClasses.Computer;

// Factory class for creating Computer objects based on an IComputerAbstractFactory
public class CmptAbstractFactory {

    // Static method for getting a Computer object from a given IComputerAbstractFactory
    public static Computer getComputer(IComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
