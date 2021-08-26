public class HasCard implements ATMState{
    ATMMaschine maschine;

    public HasCard(ATMMaschine theM){
        maschine = theM;
    }

    @Override
    public void insertCard() {
        System.out.println("You cant enter more that 1 card!");
    }

    @Override
    public void ejectCard() {
        maschine.setATMState(maschine.getNoCardState());
        System.out.println("Your card is ejected, thank you");
    }

    @Override
    public void insertPin(int pin) {
        if(pin == 12345){
            System.out.println("Corret pin, welcome to ATM Maschine!");
            maschine.correctPinEntered = true;
            maschine.setATMState(maschine.getYesPinState());
        }else{
            System.out.println("wrong PIN");
            maschine.correctPinEntered = false;
            System.out.println("card ejected");
            maschine.setATMState(maschine.getNoCardState());
        }

    }

    @Override
    public void requestCash(int amount) {
        System.out.println("please enter your PIN");
    }
}
