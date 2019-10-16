package lab2.ex2;

interface Chargeble {
    public void charge();
}

public class Charger {
    public void charge(Chargeble c) {
        c.charge();
    }
}