package com.lachozag4.pisip.infraestructura.persistencia.mapeadores;

import com.lachozag4.pisip.dominio.entidades.PedidoDetalle;
import com.lachozag4.pisip.infraestructura.persistencia.jpa.PedidoDetalleJpa;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-14T23:15:41-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.43.0.v20250819-1513, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IPedidoDetalleJpaMapperImpl implements IPedidoDetalleJpaMapper {

    @Override
    public PedidoDetalle toDomain(PedidoDetalleJpa entity) {
        if ( entity == null ) {
            return null;
        }

        int idpedidodetalle = 0;
        Integer cantidad = null;

        idpedidodetalle = entity.getIdpedidodetalle();
        cantidad = entity.getCantidad();

        PedidoDetalle pedidoDetalle = new PedidoDetalle( idpedidodetalle, cantidad );

        return pedidoDetalle;
    }

    @Override
    public PedidoDetalleJpa toEntity(PedidoDetalle pedidoDetalle) {
        if ( pedidoDetalle == null ) {
            return null;
        }

        PedidoDetalleJpa pedidoDetalleJpa = new PedidoDetalleJpa();

        pedidoDetalleJpa.setCantidad( pedidoDetalle.getCantidad() );
        pedidoDetalleJpa.setIdpedidodetalle( pedidoDetalle.getIdpedidodetalle() );

        return pedidoDetalleJpa;
    }
}
