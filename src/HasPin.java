public class HasPin implements ATMState{
    ATMMaschine maschine;

    public HasPin(ATMMaschine theM){
        maschine = theM;
    }

    @Override
    public void insertCard() {
        System.out.println("i dont want another card");
    }

    @Override
    public void ejectCard() {
        System.out.println("card is ejected, good bye");
        maschine.setATMState(maschine.getNoCardState());
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("already entered");
    }

    @Override
    public void requestCash(int amount) {
        if(maschine.cash >= amount){
            maschine.setCash(maschine.cash - amount);
            System.out.println(amount+ " dollars is ejected");

            if (maschine.cash <= 0){
                maschine.setATMState(maschine.getNoCashState());
                System.out.println("ATM out of money");
            }
        }else{
            System.out.println("insufficient amount of money");
            System.out.println("card ejected!");
            maschine.setATMState(maschine.getNoCardState());
        }

    }
}
