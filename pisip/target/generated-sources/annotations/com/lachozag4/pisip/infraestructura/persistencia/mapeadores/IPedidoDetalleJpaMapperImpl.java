package com.lachozag4.pisip.infraestructura.persistencia.mapeadores;

import com.lachozag4.pisip.dominio.entidades.Pedido;
import com.lachozag4.pisip.dominio.entidades.PedidoDetalle;
import com.lachozag4.pisip.dominio.entidades.Producto;
import com.lachozag4.pisip.infraestructura.persistencia.jpa.PedidoDetalleJpa;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-15T11:57:59-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IPedidoDetalleJpaMapperImpl implements IPedidoDetalleJpaMapper {

    @Autowired
    private IProductoJpaMapper iProductoJpaMapper;

    @Override
    public PedidoDetalle toDomain(PedidoDetalleJpa entity) {
        if ( entity == null ) {
            return null;
        }

        Producto fkProducto = null;
        int idpedidodetalle = 0;
        int cantidad = 0;
        double precioUnitario = 0.0d;

        fkProducto = iProductoJpaMapper.toDomain( entity.getFkProducto() );
        idpedidodetalle = entity.getIdpedidodetalle();
        cantidad = entity.getCantidad();
        precioUnitario = entity.getPrecioUnitario();

        Pedido fkPedido = null;

        PedidoDetalle pedidoDetalle = new PedidoDetalle( idpedidodetalle, fkProducto, fkPedido, cantidad, precioUnitario );

        return pedidoDetalle;
    }

    @Override
    public PedidoDetalleJpa toEntity(PedidoDetalle domain) {
        if ( domain == null ) {
            return null;
        }

        PedidoDetalleJpa pedidoDetalleJpa = new PedidoDetalleJpa();

        pedidoDetalleJpa.setCantidad( domain.getCantidad() );
        pedidoDetalleJpa.setFkProducto( iProductoJpaMapper.toEntity( domain.getFkProducto() ) );
        pedidoDetalleJpa.setIdpedidodetalle( domain.getIdpedidodetalle() );
        pedidoDetalleJpa.setPrecioUnitario( domain.getPrecioUnitario() );

        return pedidoDetalleJpa;
    }

    @Override
    public List<PedidoDetalle> toDomainList(List<PedidoDetalleJpa> detalles) {
        if ( detalles == null ) {
            return null;
        }

        List<PedidoDetalle> list = new ArrayList<PedidoDetalle>( detalles.size() );
        for ( PedidoDetalleJpa pedidoDetalleJpa : detalles ) {
            list.add( toDomain( pedidoDetalleJpa ) );
        }

        return list;
    }

    @Override
    public List<PedidoDetalleJpa> toEntityList(List<PedidoDetalle> detalles) {
        if ( detalles == null ) {
            return null;
        }

        List<PedidoDetalleJpa> list = new ArrayList<PedidoDetalleJpa>( detalles.size() );
        for ( PedidoDetalle pedidoDetalle : detalles ) {
            list.add( toEntity( pedidoDetalle ) );
        }

        return list;
    }
}
