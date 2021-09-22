/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.controller;

import com.livecron.market.generics.GenericController;
import lombok.RequiredArgsConstructor;
import com.livecron.market.tiendacliente.model.ClienteUsuario;
import com.livecron.market.tiendacliente.dto.ClienteUsuarioDto;
import com.livecron.market.tiendacliente.service.ClienteUsuarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/clienteusuarios")
public class ClienteUsuarioController extends GenericController<ClienteUsuario, ClienteUsuarioDto> {
    private final ClienteUsuarioService service;

    @Override
    protected ClienteUsuarioService getService() {
        return service;
    }

}
