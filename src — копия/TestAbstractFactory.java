import NonAbstractFactory.ObjectClasses.Computer;
import Abstract.CmptAbstractFactory;
import Abstract.ServerFactoryI;
import Abstract.PCFactoryI;

public class TestAbstractFactory {

    public static void main(String[] args) {
        // Call the test method to demonstrate the abstract factory pattern
        testAbstractFactory();
    }

    // Method to demonstrate the abstract factory pattern
    private static void testAbstractFactory() {
        // Create a PC object using the PCFactoryI factory
        Computer pc = CmptAbstractFactory.getComputer(new PCFactoryI("2 GB", "500 GB", "2.4 GHz"));

        // Create a Server object using the ServerFactoryI factory
        Computer server = CmptAbstractFactory.getComputer(new ServerFactoryI("16 GB", "1 TB", "2.9 GHz"));

        // Print the configurations of the created objects
        System.out.println("AbstractFactory NonAbstractFactory.ObjectClasses.PC Config::" + pc);
        System.out.println("AbstractFactory NonAbstractFactory.ObjectClasses.Server Config::" + server);
    }
}
