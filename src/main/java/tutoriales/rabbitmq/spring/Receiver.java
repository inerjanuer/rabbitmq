package tutoriales.rabbitmq.spring;

public class Receiver {

    public static final String RECEIVE_QUEUE = "receiveMessage";

    public void receiveMessage(String message) {
        System.out.println("Ha recibido un mensaje: " + message);
    }



}
