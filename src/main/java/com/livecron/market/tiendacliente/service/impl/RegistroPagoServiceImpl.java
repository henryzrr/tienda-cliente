/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.livecron.market.generics.GenericServiceImpl;
import com.livecron.market.generics.GenericRepository;
import com.livecron.market.tiendacliente.model.RegistroPago;
import com.livecron.market.tiendacliente.service.RegistroPagoService;
import com.livecron.market.tiendacliente.repository.RegistroPagoRepository;

@Service
@RequiredArgsConstructor
public class RegistroPagoServiceImpl extends GenericServiceImpl<RegistroPago> implements RegistroPagoService {
    private final RegistroPagoRepository repository;

    @Override
    protected GenericRepository<RegistroPago> getRepository() {
        return repository;
    }

}
