/**
 * The `Droid` class represents a virtual droid with a name and battery level. 
 * It can perform tasks, report its battery level, and transfer energy to another droid.
 */

public class Droid {
    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    public void energyReport() {
        System.out.println(name + "'s battery level is: " + batteryLevel);
    }

    public void energyTransfer(Droid otherDroid, int amount) {
        if (batteryLevel >= amount) {
            batteryLevel -= amount;
            otherDroid.batteryLevel += amount;
            System.out.println(name + " transferred " + amount + " battery level to " + otherDroid.name);
        } else {
            System.out.println(name + " does not have enough battery to transfer.");
        }
    }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        Droid javie = new Droid("Javie");

        // Codey block
        System.out.println(codey);
        codey.performTask("learning Java");
        codey.energyReport();

        // Javie block
        System.out.println(javie);
        javie.performTask("compiling");
        javie.energyReport();

        // Transfer
        codey.energyTransfer(javie, 10);
        codey.energyReport();
        javie.energyReport();
    }
}

/* Output:
Hello, I'm the droid: Codey
Codey is performing task: learning Java
Codey's battery level is: 90
Hello, I'm the droid: Javie
Javie is performing task: compiling
Javie's battery level is: 90
Codey transferred 10 battery level to Javie
Codey's battery level is: 80
Javie's battery level is: 100
*/