package com.livecron.market.tiendacliente;

import com.livecron.market.tiendacliente.consumer.RestProductoConnector;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TiendaClienteApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TiendaClienteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        RestProductoConnector restProductoConnector = new RestProductoConnector();
        restProductoConnector.getProductos();
    }
}
