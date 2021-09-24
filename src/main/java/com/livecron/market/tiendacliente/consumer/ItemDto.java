/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.consumer;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ItemDto{
    private BigDecimal precioUnitario;
    private String codigo;
    private String descripcion;
    private Integer numeroElementos;
}
