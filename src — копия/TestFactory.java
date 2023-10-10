import NonAbstractFactory.ObjectClasses.Computer;
import NonAbstractFactory.ComputerFactory;

public class TestFactory {

    public static void main(String[] args) {
        // Create PC and Server objects using the ComputerFactory
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");

        // Print the configurations of the created objects
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }
}
