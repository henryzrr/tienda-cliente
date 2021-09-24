/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.dto;

import lombok.Getter;
import lombok.Setter;
import com.livecron.market.tiendacliente.model.Producto;
import com.livecron.market.generics.DtoBase;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductoDto extends DtoBase<Producto> {
    private String nombre;
    private String codigo;
    private String descripcion;
    private BigDecimal precioUnitario;

    private Long idTienda;
}
