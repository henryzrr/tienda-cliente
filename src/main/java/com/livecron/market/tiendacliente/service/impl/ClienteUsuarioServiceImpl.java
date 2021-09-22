/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.livecron.market.generics.GenericServiceImpl;
import com.livecron.market.generics.GenericRepository;
import com.livecron.market.tiendacliente.model.ClienteUsuario;
import com.livecron.market.tiendacliente.service.ClienteUsuarioService;
import com.livecron.market.tiendacliente.repository.ClienteUsuarioRepository;

@Service
@RequiredArgsConstructor
public class ClienteUsuarioServiceImpl extends GenericServiceImpl<ClienteUsuario> implements ClienteUsuarioService {
    private final ClienteUsuarioRepository repository;

    @Override
    protected GenericRepository<ClienteUsuario> getRepository() {
        return repository;
    }

}
