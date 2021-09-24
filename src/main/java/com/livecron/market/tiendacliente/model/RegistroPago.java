/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.livecron.market.generics.ModelBase;
import com.livecron.market.tiendacliente.dto.RegistroPagoDto;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class RegistroPago extends ModelBase<RegistroPagoDto> {
    private BigDecimal montoPago;
    private String idTransaccionBancaria;

    @OneToOne
    @JoinColumn
    private Pedido pedido;
}
