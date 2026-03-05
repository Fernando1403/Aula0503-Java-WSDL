package br.com.fiap3esr;

import br.com.fiap3esr.service.Division;
import br.com.fiap3esr.service.Multiplication;
import br.com.fiap3esr.service.Subtraction;
import br.com.fiap3esr.service.Sum;
import jakarta.xml.ws.Endpoint;

public class Calculator3ESRApplication {
    public static void main(String[] args) {
        System.out.println("Publicando webservices...");
        Endpoint.publish("http://localhost:8080/calculadora/soma", new Sum());
        Endpoint.publish("http://localhost:8080/calculadora/subtraction", new Subtraction());
        Endpoint.publish("http://localhost:8080/calculadora/multiplication", new Multiplication());
        Endpoint.publish("http://localhost:8080/calculadora/division", new Division());
        System.out.println("WebServices publicados com sucesso!");
    }
}
