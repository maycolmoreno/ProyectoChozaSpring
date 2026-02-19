package com.lachozag4.pisip.infraestructura.persistencia.mapeadores;

import com.lachozag4.pisip.dominio.entidades.Usuario;
import com.lachozag4.pisip.infraestructura.persistencia.jpa.UsuarioJpa;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-19T12:26:59-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.43.0.v20250819-1513, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IUsuarioJpaMapperImpl implements IUsuarioJpaMapper {

    @Override
    public Usuario toDomain(UsuarioJpa entity) {
        if ( entity == null ) {
            return null;
        }

        int idusuario = 0;
        String username = null;
        String password = null;
        String nombreCompleto = null;
        String rol = null;
        boolean estado = false;
        boolean requiereCambioPassword = false;

        idusuario = entity.getIdusuario();
        username = entity.getUsername();
        password = entity.getPassword();
        nombreCompleto = entity.getNombreCompleto();
        rol = entity.getRol();
        estado = entity.isEstado();
        requiereCambioPassword = entity.isRequiereCambioPassword();

        Usuario usuario = new Usuario( idusuario, username, password, nombreCompleto, rol, estado, requiereCambioPassword );

        return usuario;
    }

    @Override
    public UsuarioJpa toEntity(Usuario usuario) {
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
