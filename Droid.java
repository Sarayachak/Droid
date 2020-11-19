public class Droid{
  // Instance field for battery level
  int batteryLevel;
  // Instance field for the droid's name
  String name;

  // Prints out a more informative string about the droid's identity
  public String toString(){
    return "Hello, I'm the droid : " + name;
  }
  // Constructor method for the droid class
  public Droid(String droidName){
    // The value of the droidName parameter is assigned to the name instance field
    name = droidName;
    // A droid's battery level is 100 by default
    batteryLevel = 100;

  }
  // Method for droid to perform tasks that takes in a task as a parameter
  public void performTask(String task){
    System.out.println(name + " is performing the following task : " + task);
    // Performing tasks is tiring! The battery level diminishes whenever a task is performed
    batteryLevel = batteryLevel - 10;
  }

  // Method that prints out our droid's current battery level
  public void energyReport(){
    System.out.println(name + "s battery level is : " + batteryLevel);
  }

  // Method that allows us to recharge our bots batteries
  public void rechargeBattery(){
    batteryLevel = 100;
    System.out.println(name + "s batteries are fully recharged");
  }

  public static void main(String[] args){
    Droid sarayabot = new Droid("Sarayabot");
    System.out.println(sarayabot);
    // Our new droid, Sarayabot, is performing tasks!
    sarayabot.performTask("coding");
    sarayabot.performTask("cooking dinner");
    sarayabot.performTask("gaming");
    // Let's check out Sarayabot's current battery level
    sarayabot.energyReport();
    // We should probably recharge Sarayabot's batteries
    sarayabot.rechargeBattery();
    // Let's double check Sarayabots energy level after recharging
    sarayabot.energyReport();
  }
}
