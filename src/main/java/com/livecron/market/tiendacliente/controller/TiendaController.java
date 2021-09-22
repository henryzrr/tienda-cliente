/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.controller;

import com.livecron.market.generics.GenericController;
import lombok.RequiredArgsConstructor;
import com.livecron.market.tiendacliente.model.Tienda;
import com.livecron.market.tiendacliente.dto.TiendaDto;
import com.livecron.market.tiendacliente.service.TiendaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/tiendas")
public class TiendaController extends GenericController<Tienda, TiendaDto> {
    private final TiendaService service;

    @Override
    protected TiendaService getService() {
        return service;
    }

}
