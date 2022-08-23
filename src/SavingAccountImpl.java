public class SavingAccountImpl
{
    public static void main(String[] args) {
        SavingAccount savingAccount =new SavingAccount();
        savingAccount.setAccountNumber(123456789);
        savingAccount.setAccountHolderName("Abhishek");
        savingAccount.setAccountOpeningDate("12-1-1991");
        savingAccount.setAccountStatus("active");
        savingAccount.setInterestRate(7.2);
        savingAccount.setAvailableBalance(5000);
        savingAccount.setModeOfOperation("self");
        savingAccount.setInternetBanking("yes");
        savingAccount.setMobileBanking("yes");

        System.out.println("Account Holder Name = "+savingAccount.getAccountHolderName());
        System.out.println("Account Number      = "+savingAccount.getAccountNumber());
        System.out.println("AccountOpening date = "+savingAccount.getAccountOpeningDate());
        System.out.println("Account status      = "+savingAccount.getAccountStatus());
        System.out.println("Interest Rate       = "+savingAccount.getInterestRate());
        System.out.println("Available Balance   = "+savingAccount.getAvailableBalance());
        System.out.println("Internet Banking    = "+savingAccount.getInternetBanking());
        System.out.println("Mobile Banking      = "+savingAccount.getMobileBanking());
        System.out.println("Operation Mode      = "+savingAccount.getModeOfOperation());
        System.out.println("Credit Balance      = "+savingAccount.creditBalance(2000));
        System.out.println("debit Balance       = "+savingAccount.debitBalance(1000));
        System.out.println("Check Balance       = "+savingAccount.retrieveBalance());


    }
}
