interface Callable {
    void call();
}

interface Textable {
    void sendSms(String msg);
}

abstract class Phone implements Callable, Textable {
    String phoneNumber;

    public void displayNo() {
        System.out.println("phone number: " + phoneNumber);
    }
}

class Iphone extends Phone {
    @Override public void call() { System.out.println("iphone calling ..."); }

    @Override public void sendSms(String msg) {
        System.out.println("iPhone sending: " + msg);
    }
}

class Samsung extends Phone {
    @Override public void call() { System.out.println("Samsung calling ..."); }

    @Override public void sendSms(String msg) {
        System.out.println("Samsung sending: " + msg);
    }
}