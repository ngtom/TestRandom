public class NoCard implements ATMState{
    ATMMaschine maschine;

    public NoCard(ATMMaschine theM){
        maschine = theM;
    }

    @Override
    public void insertCard() {
        System.out.println("please enter your PIN");
        maschine.setATMState(maschine.getYesCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("enter a card first");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("enter a card first");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("enter a card first");
    }
}
