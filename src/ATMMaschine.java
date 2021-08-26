public class ATMMaschine {

    ATMState currState;

    // camposition of the states
    ATMState hasCard;
    ATMState noCard;
    ATMState hasPin;
    ATMState noCash;

    int cash = 2000;
    boolean correctPinEntered = false;

    public ATMMaschine (){
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasPin = new HasPin(this);
        noCash = new NoCash(this);
        currState = noCard;

        if(cash < 0){
            currState = noCash;
        }
    }

    public void insertCard(){
        currState.insertCard();
    }
    public void ejectCard(){
        currState.ejectCard();
    }
    public void insertPin(int k){
        currState.insertPin(k);
    }
    public void requestCash(int amt){
        currState.requestCash(amt);
    }

    // setter methods
    public void setATMState(ATMState incState){
        currState = incState;
    }

    public void setCash (int incCash){
        cash = incCash;
    }

    // getter methods
    public ATMState getYesCardState(){
        return hasCard;
    }
    public ATMState getNoCardState(){
        return noCard;
    }
    public ATMState getYesPinState(){
        return hasPin;
    }
    public ATMState getNoCashState(){
        return noCash;
    }

}
