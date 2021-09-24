package com.livecron.market.tiendacliente.consumer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestProductoConnector {

    public void getProductos() {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "http://localhost:8080/productos";
//        ResponseEntity<ProductoDto> response
//                = restTemplate.getForEntity(fooResourceUrl , ProductoDto.class);
//        System.out.println(response);

        ResponseEntity<String> response
                    = restTemplate.getForEntity(fooResourceUrl, String.class);
        System.out.println(response);
    }

}
