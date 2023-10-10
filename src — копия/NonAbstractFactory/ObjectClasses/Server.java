package NonAbstractFactory.ObjectClasses;

// Concrete class representing a PC computer, extends Computer
public class PC extends Computer {

    private String ram; // RAM size
    private String hdd; // HDD size
    private String cpu; // CPU information

    // Constructor to initialize the PC's specifications
    public PC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // Implementation of the getRAM method to return the PC's RAM size
    @Override
    public String getRAM() {
        return this.ram;
    }

    // Implementation of the getHDD method to return the PC's HDD size
    @Override
    public String getHDD() {
        return this.hdd;
    }

    // Implementation of the getCPU method to return the PC's CPU information
    @Override
    public String getCPU() {
        return this.cpu;
    }
}
