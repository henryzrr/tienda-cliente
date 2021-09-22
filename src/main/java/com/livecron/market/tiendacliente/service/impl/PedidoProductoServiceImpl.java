/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.livecron.market.generics.GenericServiceImpl;
import com.livecron.market.generics.GenericRepository;
import com.livecron.market.tiendacliente.model.PedidoProducto;
import com.livecron.market.tiendacliente.service.PedidoProductoService;
import com.livecron.market.tiendacliente.repository.PedidoProductoRepository;

@Service
@RequiredArgsConstructor
public class PedidoProductoServiceImpl extends GenericServiceImpl<PedidoProducto> implements PedidoProductoService {
    private final PedidoProductoRepository repository;

    @Override
    protected GenericRepository<PedidoProducto> getRepository() {
        return repository;
    }

}
