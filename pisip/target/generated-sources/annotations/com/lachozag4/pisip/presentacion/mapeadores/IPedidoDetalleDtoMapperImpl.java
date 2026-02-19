package com.lachozag4.pisip.presentacion.mapeadores;

import com.lachozag4.pisip.dominio.entidades.PedidoDetalle;
import com.lachozag4.pisip.presentacion.dto.response.PedidoDetalleResponseDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-19T12:26:59-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.43.0.v20250819-1513, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IPedidoDetalleDtoMapperImpl implements IPedidoDetalleDtoMapper {

    @Autowired
    private IProductoDtoMapper iProductoDtoMapper;

    @Override
    public PedidoDetalleResponseDTO toResponseDTO(PedidoDetalle d) {
        if ( d == null ) {
            return null;
        }

        PedidoDetalleResponseDTO pedidoDetalleResponseDTO = new PedidoDetalleResponseDTO();

        pedidoDetalleResponseDTO.setIdpedidodetalle( d.getIdpedidodetalle() );
        pedidoDetalleResponseDTO.setFkProducto( iProductoDtoMapper.toResponseDTO( d.getFkProducto() ) );
        pedidoDetalleResponseDTO.setCantidad( d.getCantidad() );
        pedidoDetalleResponseDTO.setPrecioUnitario( d.getPrecioUnitario() );

        pedidoDetalleResponseDTO.setSubtotal( d.getCantidad() * d.getPrecioUnitario() );

        calcularSubtotal( d, pedidoDetalleResponseDTO );

        return pedidoDetalleResponseDTO;
    }

    @Override
    public List<PedidoDetalleResponseDTO> toResponseDTOList(List<PedidoDetalle> detalles) {
        if ( detalles == null ) {
            return null;
        }

        List<PedidoDetalleResponseDTO> list = new ArrayList<PedidoDetalleResponseDTO>( detalles.size() );
        for ( PedidoDetalle pedidoDetalle : detalles ) {
            list.add( toResponseDTO( pedidoDetalle ) );
        }

        return list;
    }
}
