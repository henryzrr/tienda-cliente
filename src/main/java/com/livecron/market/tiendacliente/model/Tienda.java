/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.livecron.market.generics.ModelBase;
import com.livecron.market.tiendacliente.dto.TiendaDto;

import java.util.Set;

@Getter
@Setter
@Entity
public class Tienda extends ModelBase<TiendaDto> {
    private String nombre;
    private String codigo;
    private String telefono;
    private String direccion;

    @OneToMany(mappedBy = "tienda")
    private Set<Producto> productos;
}
