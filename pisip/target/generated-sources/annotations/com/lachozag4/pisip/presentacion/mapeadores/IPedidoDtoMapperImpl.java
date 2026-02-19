package com.lachozag4.pisip.presentacion.mapeadores;

import com.lachozag4.pisip.dominio.entidades.Pedido;
import com.lachozag4.pisip.presentacion.dto.response.PedidoResponseDTO;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-15T11:58:00-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IPedidoDtoMapperImpl implements IPedidoDtoMapper {

    @Autowired
    private IUsuarioDtoMapper iUsuarioDtoMapper;
    @Autowired
    private IMesaDtoMapper iMesaDtoMapper;
    @Autowired
    private IClienteDtoMapper iClienteDtoMapper;
    @Autowired
    private IPedidoDetalleDtoMapper iPedidoDetalleDtoMapper;

    @Override
    public PedidoResponseDTO toResponseDTO(Pedido pedido) {
        if ( pedido == null ) {
            return null;
        }

        PedidoResponseDTO pedidoResponseDTO = new PedidoResponseDTO();

        pedidoResponseDTO.setIdpedido( pedido.getIdpedido() );
        pedidoResponseDTO.setFecha( pedido.getFecha() );
        pedidoResponseDTO.setEstado( pedido.getEstado() );
        pedidoResponseDTO.setObservaciones( pedido.getObservaciones() );
        pedidoResponseDTO.setFkUsuario( iUsuarioDtoMapper.toResponseDTO( pedido.getFkUsuario() ) );
        pedidoResponseDTO.setFkMesa( iMesaDtoMapper.toResponseDTO( pedido.getFkMesa() ) );
        pedidoResponseDTO.setFkCliente( iClienteDtoMapper.toResponseDTO( pedido.getFkCliente() ) );
        pedidoResponseDTO.setDetalle( iPedidoDetalleDtoMapper.toResponseDTOList( pedido.getDetalles() ) );

        calcularTotales( pedido, pedidoResponseDTO );

        return pedidoResponseDTO;
    }
}
