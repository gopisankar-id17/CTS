interface Notifier {
    void send(String msg);
}

class EmailNotifier implements Notifier {
    public void send(String msg) {
        System.out.println("Email: " + msg);
    }
}

abstract class NotifierDecorator implements Notifier {
    protected Notifier notifier;

    NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }
}

class SMSNotifierDecorator extends NotifierDecorator {

    SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String msg) {
        notifier.send(msg);
        System.out.println("SMS: " + msg);
    }
}

public class DecoratorTest {
    public static void main(String[] args) {
        Notifier n = new SMSNotifierDecorator(new EmailNotifier());
        n.send("Hello");
    }
}