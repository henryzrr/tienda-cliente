/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.dto;

import lombok.Getter;
import lombok.Setter;
import com.livecron.market.tiendacliente.model.Pedido;
import com.livecron.market.generics.DtoBase;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class PedidoDto extends DtoBase<Pedido> {
    private LocalDate fechaPedido;
    private RegistroPagoDto registroPago;
    private List<Long> idPedidoProductos;
}
