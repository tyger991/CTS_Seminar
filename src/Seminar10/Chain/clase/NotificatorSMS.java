package Seminar10.Chain.clase;

public class NotificatorSMS extends Notificator {

    @Override
    public void trimiteNotificator(Client client, String text) {
        if(client.getNrTelefon()!=null) {
            System.out.println("Trimitere SMS catre " + client.getNume() + " mesaj: " + text);
        }
        else {
            if (super.getNotificator() != null) {
                super.getNotificator().trimiteNotificator(client, text);
            }
            else
                {
                    System.out.println("Domnule Manager, nu avem date contact pentru clientul " + client.getNume());

            }

        }

    }
}
