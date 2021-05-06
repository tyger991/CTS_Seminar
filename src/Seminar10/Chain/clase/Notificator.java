package Seminar10.Chain.clase;

public abstract class Notificator {
    private Notificator notificator;

    public abstract void trimiteNotificator(Client client, String text);

    public Notificator getNotificator() {
        return notificator;
    }

    public void setNotificator(Notificator notificator) {
        this.notificator = notificator;
    }
}
