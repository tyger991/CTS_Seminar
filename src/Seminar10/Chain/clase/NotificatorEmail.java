package Seminar10.Chain.clase;

public class NotificatorEmail extends Notificator {
    @Override
    public void trimiteNotificator(Client client, String text) {
        if(client.getEmail()!=null){
            System.out.println("Trimitere email catre clientul " + client.getNume() + " mesajul " + text);
        }
        else {
            if(super.getNotificator()!=null){
                super.getNotificator().trimiteNotificator(client, text);
            }
            else{
                System.out.println("Domnule manager, nu avem date de contact pentru clientul " + client.getNume());
            }
        }
    }
}
