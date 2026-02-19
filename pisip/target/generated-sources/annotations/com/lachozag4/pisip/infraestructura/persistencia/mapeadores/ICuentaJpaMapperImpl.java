package com.lachozag4.pisip.infraestructura.persistencia.mapeadores;

import com.lachozag4.pisip.dominio.entidades.Cliente;
import com.lachozag4.pisip.dominio.entidades.Cuenta;
import com.lachozag4.pisip.dominio.entidades.Mesa;
import com.lachozag4.pisip.infraestructura.persistencia.jpa.ClienteJpa;
import com.lachozag4.pisip.infraestructura.persistencia.jpa.CuentaJpa;
import com.lachozag4.pisip.infraestructura.persistencia.jpa.MesaJpa;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-15T11:58:00-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class ICuentaJpaMapperImpl implements ICuentaJpaMapper {

    @Override
    public Cuenta toDomain(CuentaJpa entity) {
        if ( entity == null ) {
            return null;
        }

        Mesa fkMesa = null;
        Cliente fkCliente = null;
        int idcuenta = 0;
        LocalDateTime fechaApertura = null;
        LocalDateTime fechaCierre = null;
        String estado = null;
        double total = 0.0d;

        fkMesa = mesaJpaToMesa( entity.getFkMesa() );
        fkCliente = clienteJpaToCliente( entity.getFkCliente() );
        idcuenta = entity.getIdcuenta();
        fechaApertura = entity.getFechaApertura();
        fechaCierre = entity.getFechaCierre();
        estado = entity.getEstado();
        total = entity.getTotal();

        Cuenta cuenta = new Cuenta( idcuenta, fechaApertura, fechaCierre, estado, total, fkMesa, fkCliente );

        return cuenta;
    }

    @Override
    public CuentaJpa toEntity(Cuenta domain) {
        if ( domain == null ) {
            return null;
        }

        CuentaJpa cuentaJpa = new CuentaJpa();

        cuentaJpa.setEstado( domain.getEstado() );
        cuentaJpa.setFechaApertura( domain.getFechaApertura() );
        cuentaJpa.setFechaCierre( domain.getFechaCierre() );
        cuentaJpa.setFkCliente( clienteToClienteJpa( domain.getFkCliente() ) );
        cuentaJpa.setFkMesa( mesaToMesaJpa( domain.getFkMesa() ) );
        cuentaJpa.setIdcuenta( domain.getIdcuenta() );
        cuentaJpa.setTotal( domain.getTotal() );

        return cuentaJpa;
    }

    protected Mesa mesaJpaToMesa(MesaJpa mesaJpa) {
        if ( mesaJpa == null ) {
            return null;
        }

        int idmesa = 0;
        int numero = 0;
        int capacidad = 0;
        boolean estado = false;

        idmesa = mesaJpa.getIdmesa();
        numero = mesaJpa.getNumero();
        capacidad = mesaJpa.getCapacidad();
        estado = mesaJpa.isEstado();

        Mesa mesa = new Mesa( idmesa, numero, capacidad, estado );

        return mesa;
    }

    protected Cliente clienteJpaToCliente(ClienteJpa clienteJpa) {
        if ( clienteJpa == null ) {
            return null;
        }

        int idcliente = 0;
        String nombre = null;
        String cedula = null;
        String telefono = null;
        String direccion = null;
        String email = null;
        boolean estado = false;

        idcliente = clienteJpa.getIdcliente();
        nombre = clienteJpa.getNombre();
        cedula = clienteJpa.getCedula();
        telefono = clienteJpa.getTelefono();
        direccion = clienteJpa.getDireccion();
        email = clienteJpa.getEmail();
        estado = clienteJpa.isEstado();

        Cliente cliente = new Cliente( idcliente, nombre, cedula, telefono, direccion, email, estado );

        return cliente;
    }

    protected ClienteJpa clienteToClienteJpa(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteJpa clienteJpa = new ClienteJpa();

        clienteJpa.setCedula( cliente.getCedula() );
        clienteJpa.setDireccion( cliente.getDireccion() );
        clienteJpa.setEmail( cliente.getEmail() );
        clienteJpa.setEstado( cliente.getEstado() );
        clienteJpa.setIdcliente( cliente.getIdcliente() );
        clienteJpa.setNombre( cliente.getNombre() );
        clienteJpa.setTelefono( cliente.getTelefono() );

        return clienteJpa;
    }

    protected MesaJpa mesaToMesaJpa(Mesa mesa) {
        if ( mesa == null ) {
            return null;
        }

        MesaJpa mesaJpa = new MesaJpa();

        mesaJpa.setCapacidad( mesa.getCapacidad() );
        mesaJpa.setEstado( mesa.getEstado() );
        mesaJpa.setIdmesa( mesa.getIdmesa() );
        mesaJpa.setNumero( mesa.getNumero() );

        return mesaJpa;
    }
}
