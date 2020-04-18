public class FullTImeEmployee extends Employee {
    private double weeklySalary;
    private double benefitDeduction;

//    public FullTImeEmployee(double weeklySalary){
//        this.weeklySalary=weeklySalary;
//    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public double getBenefitDeduction() {
        return benefitDeduction;
    }

    public void setBenefitDeduction(double benefitDeduction) {
        this.benefitDeduction = benefitDeduction;
    }
    public double findPaymentAmount(){
        return weeklySalary-benefitDeduction;
    }
}
