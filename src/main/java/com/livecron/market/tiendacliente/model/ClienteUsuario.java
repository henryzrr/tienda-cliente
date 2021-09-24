/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

import com.livecron.market.generics.ModelBase;
import com.livecron.market.tiendacliente.dto.ClienteUsuarioDto;

@Getter
@Setter
@Entity
public class ClienteUsuario extends ModelBase<ClienteUsuarioDto> {
    private String nombre;
    private String email;
    private String telefono;
    private String ci;
}
