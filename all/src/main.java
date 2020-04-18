public class main {
    public static void main(String[] args) {
        Account myAccount = new Account();
        Account yourAccount = new Account();

        myAccount.setNewAccount("Dima", "Arhangelsk", 24.04);
        yourAccount.setNewAccount("yura", "Arhangelsk", 23.04);
        myAccount.getNewAccount();
        yourAccount.getNewAccount();
        myAccount.setName("");
    }

}
