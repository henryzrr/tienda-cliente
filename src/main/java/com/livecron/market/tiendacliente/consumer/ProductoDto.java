/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.tiendacliente.consumer;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductoDto {
    private ItemDto item;
    private String codigo;

}
