/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.livecron.market.generics.ModelBase;
import com.livecron.market.tiendacliente.dto.ProductoDto;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class Producto extends ModelBase<ProductoDto> {
    private String nombre;
    private String codigo;
    private String descripcion;
    private BigDecimal precioUnitario;

    @ManyToOne
    @JoinColumn
    private Tienda tienda;
}
