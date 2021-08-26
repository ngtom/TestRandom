public class TestATMMaschine {
    public static void main(String[] args) {
        ATMMaschine machine = new ATMMaschine();

        machine.insertCard();
        machine.ejectCard();
        machine.insertCard();
        machine.insertPin(12345);
        machine.requestCash(200);
        machine.insertCard();
        machine.insertPin(12345);
    }
}
