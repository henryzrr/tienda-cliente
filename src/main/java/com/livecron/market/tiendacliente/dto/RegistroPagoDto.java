/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.dto;

import com.livecron.market.tiendacliente.model.Pedido;
import lombok.Getter;
import lombok.Setter;
import com.livecron.market.tiendacliente.model.RegistroPago;
import com.livecron.market.generics.DtoBase;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Getter
@Setter
public class RegistroPagoDto extends DtoBase<RegistroPago> {
    private BigDecimal montoPago;
    private String idTransaccionBancaria;
    private PedidoDto pedido;
}
