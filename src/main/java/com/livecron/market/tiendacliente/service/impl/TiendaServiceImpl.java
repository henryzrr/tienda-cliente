/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.livecron.market.generics.GenericServiceImpl;
import com.livecron.market.generics.GenericRepository;
import com.livecron.market.tiendacliente.model.Tienda;
import com.livecron.market.tiendacliente.service.TiendaService;
import com.livecron.market.tiendacliente.repository.TiendaRepository;

@Service
@RequiredArgsConstructor
public class TiendaServiceImpl extends GenericServiceImpl<Tienda> implements TiendaService {
    private final TiendaRepository repository;

    @Override
    protected GenericRepository<Tienda> getRepository() {
        return repository;
    }

}
