package app;

import webservice.NotarialWebService;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] argv) {
        System.out.println("Lancement du serveur web");
        Endpoint.publish("http://localhost:8080/ws/NotarialWebService",
                new NotarialWebService());
    }

}
