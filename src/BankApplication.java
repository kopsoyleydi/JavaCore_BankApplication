import java.util.ArrayList;

public class BankApplication {
    public String name;
        public ArrayList<Account> accounts = new ArrayList<>();
        public void addAccount(Account a){
            accounts.add(a);
        }
        public void removeAccount(int i){
            accounts.remove(i);
        }
        public Account getmaxAccount() {
            Account max = accounts.get(0);
            for (int s = 0; s < accounts.size(); s++) {
                if(accounts.get(s).getBalance() > max.getBalance()){
                    max = accounts.get(s);
                }
            }
            return max;
        }
        public double getAvarage(){
           double avar = 0;
           for(int i = 0;i<accounts.size();i++){
               avar += accounts.get(i).getBalance();
           }
           avar = avar / accounts.size();
           return avar;
        }
    public double getSum(){
        double sum = 0;
        for(int i = 0;i<accounts.size();i++){
            sum += accounts.get(i).getBalance();
        }
        return sum;
    }
    public int getUser(){
            return accounts.size();
    }
    @Override
    public String toString() {
        return "BankApplication{" +
                "accounts=" + accounts +
                '}';
    }
}
