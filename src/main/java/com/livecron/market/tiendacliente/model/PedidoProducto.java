/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

import com.livecron.market.generics.ModelBase;
import com.livecron.market.tiendacliente.dto.PedidoProductoDto;

@Getter
@Setter
@Entity
public class PedidoProducto extends ModelBase<PedidoProductoDto> {

}
