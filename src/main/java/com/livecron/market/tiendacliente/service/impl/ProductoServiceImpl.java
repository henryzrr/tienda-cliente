/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.livecron.market.generics.GenericServiceImpl;
import com.livecron.market.generics.GenericRepository;
import com.livecron.market.tiendacliente.model.Producto;
import com.livecron.market.tiendacliente.service.ProductoService;
import com.livecron.market.tiendacliente.repository.ProductoRepository;

@Service
@RequiredArgsConstructor
public class ProductoServiceImpl extends GenericServiceImpl<Producto> implements ProductoService {
    private final ProductoRepository repository;

    @Override
    protected GenericRepository<Producto> getRepository() {
        return repository;
    }

}
