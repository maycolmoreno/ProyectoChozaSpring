package com.lachozag4.pisip.infraestructura.persistencia.mapeadores;

import com.lachozag4.pisip.dominio.entidades.Cliente;
import com.lachozag4.pisip.infraestructura.persistencia.jpa.ClienteJpa;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;


@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-14T23:15:42-0500",
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
        String identificacion = null;
        String nombre = null;
        String direccion = null;
        String telefono = null;
        String email = null;

        idcliente = entity.getIdcliente();
        identificacion = entity.getIdentificacion();
        nombre = entity.getNombre();
        direccion = entity.getDireccion();
        telefono = entity.getTelefono();
        email = entity.getEmail();

        Cliente cliente = new Cliente( idcliente, identificacion, nombre, direccion, telefono, email );

        return cliente;
    }

    @Override
    public ClienteJpa toEntity(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteJpa clienteJpa = new ClienteJpa();

        clienteJpa.setDireccion( cliente.getDireccion() );
        clienteJpa.setEmail( cliente.getEmail() );
        clienteJpa.setIdcliente( cliente.getIdcliente() );
        clienteJpa.setIdentificacion( cliente.getIdentificacion() );
        clienteJpa.setNombre( cliente.getNombre() );
        clienteJpa.setTelefono( cliente.getTelefono() );

        return clienteJpa;
    }
}
