/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.livecron.market.generics.GenericServiceImpl;
import com.livecron.market.generics.GenericRepository;
import com.livecron.market.tiendacliente.model.Pedido;
import com.livecron.market.tiendacliente.service.PedidoService;
import com.livecron.market.tiendacliente.repository.PedidoRepository;

@Service
@RequiredArgsConstructor
public class PedidoServiceImpl extends GenericServiceImpl<Pedido> implements PedidoService {
    private final PedidoRepository repository;

    @Override
    protected GenericRepository<Pedido> getRepository() {
        return repository;
    }

}
