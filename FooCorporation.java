public class FooCorporation {

    public static void main(String[] args) {

        totalPay(7.50, 35);
        totalPay(8.20, 47);
        totalPay(10.0, 73);
    }

    public static void totalPay(double basePay, double hoursWorked) {
        double minimumWage = 8.0;
        double maxWorkingHours = 60;
        double regularWorkHours = 40;
        double conversionFactor = 1.5;

        if (basePay < minimumWage) {
            System.out.println("Base pay cannot be less than $" + minimumWage);
        } else if (hoursWorked > maxWorkingHours) {
            System.out.println(
                    "You exceeded the maximum allowable work hour by " + (hoursWorked - regularWorkHours) + " hours");
        } else if ((basePay >= minimumWage) && (hoursWorked > 0 && hoursWorked <= regularWorkHours)) {
            double totalSalary = basePay * hoursWorked;
            System.out.println("Your total salary is " + "$" + totalSalary);
        } else if ((basePay >= minimumWage) && (hoursWorked > regularWorkHours && hoursWorked <= maxWorkingHours)) {
            double overTimePay = ((hoursWorked - regularWorkHours) * basePay) * conversionFactor;
            double totalSalary = (basePay * regularWorkHours) + overTimePay;
            System.out.println("Your total salary is " + "$" + totalSalary);
        }
    }
}
