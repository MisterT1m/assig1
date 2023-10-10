package Abstract;

import NonAbstractFactory.ObjectClasses.Computer;

// Interface representing an abstract factory for creating Computer objects
public interface IComputerAbstractFactory {

    // Method for creating a Computer object, to be implemented by concrete factory classes
    public Computer createComputer();
}
