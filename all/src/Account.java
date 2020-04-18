public class Account {
    private String name;
    private String address;
    private double balance;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name){
        if (!name.equals("")){
            this.name=name;
        }else System.out.println("Ошибка! Вы забыли задать имя!");
    }

    public void setNewAccount(String name, String address, double balance){
        this.name=name;
        this.address=address;
        this.balance=balance;
    }
    public void getNewAccount(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(balance);
    }
}

