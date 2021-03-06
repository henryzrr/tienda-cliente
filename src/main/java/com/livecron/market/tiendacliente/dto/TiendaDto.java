/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.dto;

import lombok.Getter;
import lombok.Setter;
import com.livecron.market.tiendacliente.model.Tienda;
import com.livecron.market.generics.DtoBase;


@Getter
@Setter
public class TiendaDto extends DtoBase<Tienda> {
    private String nombre;
    private String codigo;
    private String telefono;
    private String direccion;
}
