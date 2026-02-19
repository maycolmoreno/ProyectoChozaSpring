package com.lachozag4.pisip.presentacion.mapeadores;

import com.lachozag4.pisip.dominio.entidades.Mesa;
import com.lachozag4.pisip.presentacion.dto.request.MesaRequestDTO;
import com.lachozag4.pisip.presentacion.dto.response.MesaResponseDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-19T12:26:59-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.43.0.v20250819-1513, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IMesaDtoMapperImpl implements IMesaDtoMapper {

    @Override
    public Mesa toDomain(MesaRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        int numero = 0;
        int capacidad = 0;
        boolean estado = false;

        numero = dto.getNumero();
        capacidad = dto.getCapacidad();
        estado = dto.isEstado();

        int idmesa = 0;

        Mesa mesa = new Mesa( idmesa, numero, capacidad, estado );

        return mesa;
    }

    @Override
    public MesaResponseDTO toResponseDTO(Mesa mesa) {
        if ( mesa == null ) {
            return null;
        }

        MesaResponseDTO mesaResponseDTO = new MesaResponseDTO();

        mesaResponseDTO.setIdmesa( mesa.getIdmesa() );
        mesaResponseDTO.setCapacidad( mesa.getCapacidad() );
        mesaResponseDTO.setEstado( mesa.getEstado() );
        mesaResponseDTO.setNumero( mesa.getNumero() );

        return mesaResponseDTO;
    }
}
