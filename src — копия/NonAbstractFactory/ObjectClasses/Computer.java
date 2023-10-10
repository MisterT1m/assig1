package NonAbstractFactory.ObjectClasses;

// Abstract class representing a generic computer
public abstract class Computer {

    // Abstract methods to get the RAM size, HDD size, and CPU information of the computer
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    // Override the toString() method to provide a formatted string representation of the computer
    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}
