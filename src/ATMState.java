public interface ATMState {
    //functionalities of ATM
    void insertCard();
    void ejectCard();
    void insertPin (int pin);
    void requestCash(int amount);
}
