public class Employee {
    private String name;
    private String jobTitle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void cutCheck(double amountPaid){
        System.out.printf("Выплатить служающему %s ", name);
        System.out.printf("(%s) ***$", jobTitle);
        System.out.printf("%,.2f\n", amountPaid);
    }
}
