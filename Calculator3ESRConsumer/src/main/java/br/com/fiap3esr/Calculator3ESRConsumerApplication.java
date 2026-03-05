package br.com.fiap3esr;

import br.com.fiap3esr.stubclasses.Operation;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class Calculator3ESRConsumerApplication {
    public static void main(String[] args) throws MalformedURLException {
        final String WSDL = "http://localhost:8080/calculadora/soma?wsdl";
        final String TARGET = "http://service.fiap3esr.com.br/";
        final String NAME = "SumService";

        URL url = new URL(WSDL);
        QName qName = new QName(TARGET, NAME);
        Service service = Service.create(url, qName);

        Operation soma = service.getPort(Operation.class);

        double num1 = 10;
        double num2 = 23;
        double resultado = soma.calculate(num1,num2);

        System.out.println(soma.showResult(num1,num2,resultado));
    }
}
