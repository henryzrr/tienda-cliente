/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

import com.livecron.market.generics.ModelBase;
import com.livecron.market.tiendacliente.dto.RegistroPagoDto;

@Getter
@Setter
@Entity
public class RegistroPago extends ModelBase<RegistroPagoDto> {

}
