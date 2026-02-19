package com.lachozag4.pisip.infraestructura.persistencia.mapeadores;

import com.lachozag4.pisip.dominio.entidades.Cliente;
import com.lachozag4.pisip.dominio.entidades.Cuenta;
import com.lachozag4.pisip.dominio.entidades.Mesa;
import com.lachozag4.pisip.dominio.entidades.Pedido;
import com.lachozag4.pisip.dominio.entidades.PedidoDetalle;
import com.lachozag4.pisip.dominio.entidades.Usuario;
import com.lachozag4.pisip.infraestructura.persistencia.jpa.ClienteJpa;
import com.lachozag4.pisip.infraestructura.persistencia.jpa.MesaJpa;
import com.lachozag4.pisip.infraestructura.persistencia.jpa.PedidoJpa;
import com.lachozag4.pisip.infraestructura.persistencia.jpa.UsuarioJpa;
import java.time.LocalDateTime;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-15T11:58:00-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IPedidoJpaMapperImpl implements IPedidoJpaMapper {

    @Autowired
    private IPedidoDetalleJpaMapper iPedidoDetalleJpaMapper;
    @Autowired
    private ICuentaJpaMapper iCuentaJpaMapper;

    @Override
    public Pedido toDomain(PedidoJpa entity) {
        if ( entity == null ) {
            return null;
        }

        Usuario fkUsuario = null;
        Mesa fkMesa = null;
        Cliente fkCliente = null;
        Cuenta fkCuenta = null;
        List<PedidoDetalle> detalles = null;
        int idpedido = 0;
        LocalDateTime fecha = null;
        String estado = null;
        String observaciones = null;

        fkUsuario = usuarioJpaToUsuario( entity.getFkUsuario() );
        fkMesa = mesaJpaToMesa( entity.getFkMesa() );
        fkCliente = clienteJpaToCliente( entity.getFkCliente() );
        fkCuenta = iCuentaJpaMapper.toDomain( entity.getFkCuenta() );
        detalles = iPedidoDetalleJpaMapper.toDomainList( entity.getDetalles() );
        idpedido = entity.getIdpedido();
        fecha = entity.getFecha();
        estado = entity.getEstado();
        observaciones = entity.getObservaciones();

        Pedido pedido = new Pedido( idpedido, fecha, estado, observaciones, fkUsuario, fkMesa, fkCliente, fkCuenta, detalles );

        return pedido;
    }

    @Override
    public PedidoJpa toEntity(Pedido domain) {
        if ( domain == null ) {
            return null;
        }

        PedidoJpa pedidoJpa = new PedidoJpa();

        pedidoJpa.setEstado( domain.getEstado() );
        pedidoJpa.setFecha( domain.getFecha() );
        pedidoJpa.setFkCliente( clienteToClienteJpa( domain.getFkCliente() ) );
        pedidoJpa.setFkCuenta( iCuentaJpaMapper.toEntity( domain.getFkCuenta() ) );
        pedidoJpa.setFkMesa( mesaToMesaJpa( domain.getFkMesa() ) );
        pedidoJpa.setFkUsuario( usuarioToUsuarioJpa( domain.getFkUsuario() ) );
        pedidoJpa.setIdpedido( domain.getIdpedido() );
        pedidoJpa.setObservaciones( domain.getObservaciones() );

        establecerRelacionBidireccional( domain, pedidoJpa );

        return pedidoJpa;
    }

    protected Usuario usuarioJpaToUsuario(UsuarioJpa usuarioJpa) {
        if ( usuarioJpa == null ) {
            return null;
        }

        int idusuario = 0;
        String username = null;
        String password = null;
        String nombreCompleto = null;
        String rol = null;
        boolean estado = false;
        boolean requiereCambioPassword = false;

        idusuario = usuarioJpa.getIdusuario();
        username = usuarioJpa.getUsername();
        password = usuarioJpa.getPassword();
        nombreCompleto = usuarioJpa.getNombreCompleto();
        rol = usuarioJpa.getRol();
        estado = usuarioJpa.isEstado();
        requiereCambioPassword = usuarioJpa.isRequiereCambioPassword();

        Usuario usuario = new Usuario( idusuario, username, password, nombreCompleto, rol, estado, requiereCambioPassword );

        return usuario;
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

    protected UsuarioJpa usuarioToUsuarioJpa(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioJpa usuarioJpa = new UsuarioJpa();

        usuarioJpa.setEstado( usuario.getEstado() );
        usuarioJpa.setIdusuario( usuario.getIdusuario() );
        usuarioJpa.setNombreCompleto( usuario.getNombreCompleto() );
        usuarioJpa.setPassword( usuario.getPassword() );
        usuarioJpa.setRequiereCambioPassword( usuario.isRequiereCambioPassword() );
        usuarioJpa.setRol( usuario.getRol() );
        usuarioJpa.setUsername( usuario.getUsername() );

        return usuarioJpa;
    }
}
