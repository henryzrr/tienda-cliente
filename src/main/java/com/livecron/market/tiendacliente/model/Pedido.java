/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.livecron.market.generics.ModelBase;
import com.livecron.market.tiendacliente.dto.PedidoDto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
public class Pedido extends ModelBase<PedidoDto> {
    private LocalDate fechaPedido;

    @OneToOne
    private RegistroPago registroPago;

    @OneToMany(mappedBy = "pedido")
    private List<PedidoProducto> pedidoProductos;

}
