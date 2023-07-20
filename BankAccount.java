package Section7;

public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){

    }
    public BankAccount(int accountNumber,double accountBalance,String customerName,String email,String phoneNumber){
        this.setAccountNumber(accountNumber);
        this.setAccountBalance(accountBalance);
        this.setCustomerName(customerName);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void depositing(double money){
        this.accountBalance=this.accountBalance+money;
    }
    public void withdrawn(double money){
        if(this.accountBalance-money>=0){
            this.accountBalance=this.accountBalance-money;
        }else{
            System.out.println("Negative money amount!");
        }
    }
}
