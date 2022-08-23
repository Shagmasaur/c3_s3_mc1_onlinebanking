public class SavingAccount
{

    private String accountHolderName;
    private int     accountNumber;
    private String  accountOpeningDate;
    private String  accountStatus;
    private int     availableBalance;
    private String  internetBanking;
    private String  mobileBanking;
    private double  interestRate;
    private String  modeOfOperation;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public int getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(int availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getInternetBanking() {
        return internetBanking;
    }

    public void setInternetBanking(String internetBanking) {
        this.internetBanking = internetBanking;
    }

    public String getMobileBanking() {
        return mobileBanking;
    }

    public void setMobileBanking(String mobileBanking) {
        this.mobileBanking = mobileBanking;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }
    public int debitBalance(int amount){
        availableBalance=availableBalance-amount;
        return availableBalance;

    }
    public int creditBalance(int amount){
        availableBalance= availableBalance + amount;
        return availableBalance;

    }
    public int retrieveBalance(){
        return getAvailableBalance();
    }

}
