public class DoPayrollTypeF {
    public static void main(String[] args) {
        FullTImeEmployee ftEmployee = new FullTImeEmployee();
        ftEmployee.setName("Барри");
        ftEmployee.setJobTitle("Директор");
        ftEmployee.setWeeklySalary(5000.00);
        ftEmployee.setBenefitDeduction(500.00);
        ftEmployee.cutCheck(ftEmployee.findPaymentAmount());
        System.out.println();

        PartTimeEmployee ptEmployee = new PartTimeEmployee();
        ptEmployee.setName("Крис");
        ptEmployee.setJobTitle("Программист");
        ptEmployee.setHourlyRate(7.53);
        ptEmployee.cutCheck(ptEmployee.findPaymentAmount(50));

        System.out.println();
        PartTimeWIthOver ptoEmployee = new PartTimeWIthOver();
        ptoEmployee.setName("Стив");
        ptoEmployee.setJobTitle("Водитель");
        ptoEmployee.setHourlyRate(7.53);
        ptoEmployee.cutCheck(ptoEmployee.findPaymentAmount(10));
    }
}
