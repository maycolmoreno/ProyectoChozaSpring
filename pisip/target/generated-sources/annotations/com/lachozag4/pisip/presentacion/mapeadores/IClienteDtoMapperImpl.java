package com.lachozag4.pisip.presentacion.mapeadores;

import com.lachozag4.pisip.dominio.entidades.Cliente;
import com.lachozag4.pisip.presentacion.dto.request.ClienteRequestDTO;
import com.lachozag4.pisip.presentacion.dto.response.ClienteResponseDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-19T12:26:59-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.43.0.v20250819-1513, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IClienteDtoMapperImpl implements IClienteDtoMapper {

    @Override
    public Cliente toDomain(ClienteRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        String nombre = null;
        String cedula = null;
        String telefono = null;
        String direccion = null;
        String email = null;
        boolean estado = false;

        nombre = dto.getNombre();
        cedula = dto.getCedula();
        telefono = dto.getTelefono();
        direccion = dto.getDireccion();
        email = dto.getEmail();
        estado = dto.isEstado();

        int idcliente = 0;

        Cliente cliente = new Cliente( idcliente, nombre, cedula, telefono, direccion, email, estado );

        return cliente;
    }

    @Override
    public ClienteResponseDTO toResponseDTO(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteResponseDTO clienteResponseDTO = new ClienteResponseDTO();

        clienteResponseDTO.setIdcliente( cliente.getIdcliente() );
        clienteResponseDTO.setCedula( cliente.getCedula() );
        clienteResponseDTO.setDireccion( cliente.getDireccion() );
        clienteResponseDTO.setEmail( cliente.getEmail() );
        clienteResponseDTO.setEstado( cliente.getEstado() );
        clienteResponseDTO.setNombre( cliente.getNombre() );
        clienteResponseDTO.setTelefono( cliente.getTelefono() );

        return clienteResponseDTO;
    }
}
