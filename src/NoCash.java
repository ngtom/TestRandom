public class NoCash implements ATMState{
    ATMMaschine maschine;

    public NoCash(ATMMaschine theM){
        maschine = theM;
    }
    @Override
    public void insertCard() {
        System.out.println("ATM out of cash!, card ejected");
        maschine.setATMState(maschine.getNoCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("ATM out of cash");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("ATM out of cash");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("ATM out of cash");
    }
}
