package Seminar10.Chain;

import Seminar10.Chain.clase.Client;
import Seminar10.Chain.clase.NotificatorEmail;
import Seminar10.Chain.clase.NotificatorSMS;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Ion", null, null);
        Client client2 = new Client("Ion", "0785290893", null);
        Client client3 = new Client("Bon", null, "bogiu456@gmail.com");

        NotificatorSMS notificatorSMS = new NotificatorSMS();
        NotificatorEmail notificatorEmail = new NotificatorEmail();
        notificatorSMS.setNotificator(notificatorEmail);
        notificatorSMS.trimiteNotificator(client2, "Mesaj1");
    }
}
