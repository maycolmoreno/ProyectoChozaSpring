package com.lachozag4.pisip.presentacion.mapeadores;

import com.lachozag4.pisip.dominio.entidades.Cuenta;
import com.lachozag4.pisip.presentacion.dto.response.CuentaResponseDTO;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-15T11:58:00-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class ICuentaDtoMapperImpl implements ICuentaDtoMapper {

    @Autowired
    private IMesaDtoMapper iMesaDtoMapper;
    @Autowired
    private IClienteDtoMapper iClienteDtoMapper;

    @Override
    public CuentaResponseDTO toResponseDTO(Cuenta cuenta) {
        if ( cuenta == null ) {
            return null;
        }

        CuentaResponseDTO cuentaResponseDTO = new CuentaResponseDTO();

        cuentaResponseDTO.setIdcuenta( cuenta.getIdcuenta() );
        cuentaResponseDTO.setFechaApertura( cuenta.getFechaApertura() );
        cuentaResponseDTO.setFechaCierre( cuenta.getFechaCierre() );
        cuentaResponseDTO.setEstado( cuenta.getEstado() );
        cuentaResponseDTO.setTotal( cuenta.getTotal() );
        cuentaResponseDTO.setFkMesa( iMesaDtoMapper.toResponseDTO( cuenta.getFkMesa() ) );
        cuentaResponseDTO.setFkCliente( iClienteDtoMapper.toResponseDTO( cuenta.getFkCliente() ) );

        return cuentaResponseDTO;
    }
}
