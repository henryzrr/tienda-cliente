/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.controller;

import com.livecron.market.generics.GenericController;
import lombok.RequiredArgsConstructor;
import com.livecron.market.tiendacliente.model.Pedido;
import com.livecron.market.tiendacliente.dto.PedidoDto;
import com.livecron.market.tiendacliente.service.PedidoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class PedidoController extends GenericController<Pedido, PedidoDto> {
    private final PedidoService service;

    @Override
    protected PedidoService getService() {
        return service;
    }

}
