package com.lachozag4.pisip.infraestructura.persistencia.mapeadores;

import com.lachozag4.pisip.dominio.entidades.Cliente;
import com.lachozag4.pisip.infraestructura.persistencia.jpa.ClienteJpa;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-19T12:26:59-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.43.0.v20250819-1513, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IClienteJpaMapperImpl implements IClienteJpaMapper {

    @Override
    public Cliente toDomain(ClienteJpa entity) {
        if ( entity == null ) {
            return null;
        }

        int idcliente = 0;
        String nombre = null;
        String cedula = null;
        String telefono = null;
        String direccion = null;
        String email = null;
        boolean estado = false;

        idcliente = entity.getIdcliente();
        nombre = entity.getNombre();
        cedula = entity.getCedula();
        telefono = entity.getTelefono();
        direccion = entity.getDireccion();
        email = entity.getEmail();
        estado = entity.isEstado();

        Cliente cliente = new Cliente( idcliente, nombre, cedula, telefono, direccion, email, estado );

        return cliente;
    }

    @Override
    public ClienteJpa toEntity(Cliente domain) {
        if ( domain == null ) {
            return null;
        }

        ClienteJpa clienteJpa = new ClienteJpa();

        clienteJpa.setCedula( domain.getCedula() );
        clienteJpa.setDireccion( domain.getDireccion() );
        clienteJpa.setEmail( domain.getEmail() );
        clienteJpa.setEstado( domain.getEstado() );
        clienteJpa.setIdcliente( domain.getIdcliente() );
        clienteJpa.setNombre( domain.getNombre() );
        clienteJpa.setTelefono( domain.getTelefono() );

        return clienteJpa;
    }
}
