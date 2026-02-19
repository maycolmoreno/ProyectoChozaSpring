package com.lachozag4.pisip.presentacion.mapeadores;

import com.lachozag4.pisip.dominio.entidades.Usuario;
import com.lachozag4.pisip.presentacion.dto.request.UsuarioRequestDTO;
import com.lachozag4.pisip.presentacion.dto.response.UsuarioResponseDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-15T11:57:59-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IUsuarioDtoMapperImpl implements IUsuarioDtoMapper {

    @Override
    public Usuario toDomain(UsuarioRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        int idusuario = 0;
        String username = null;
        String password = null;
        String nombreCompleto = null;
        String rol = null;
        boolean estado = false;
        boolean requiereCambioPassword = false;

        idusuario = dto.getIdusuario();
        username = dto.getUsername();
        password = dto.getPassword();
        nombreCompleto = dto.getNombreCompleto();
        rol = dto.getRol();
        estado = dto.isEstado();
        requiereCambioPassword = dto.isRequiereCambioPassword();

        Usuario usuario = new Usuario( idusuario, username, password, nombreCompleto, rol, estado, requiereCambioPassword );

        return usuario;
    }

    @Override
    public UsuarioResponseDTO toResponseDTO(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioResponseDTO usuarioResponseDTO = new UsuarioResponseDTO();

        usuarioResponseDTO.setEstado( usuario.getEstado() );
        usuarioResponseDTO.setIdusuario( usuario.getIdusuario() );
        usuarioResponseDTO.setNombreCompleto( usuario.getNombreCompleto() );
        usuarioResponseDTO.setRequiereCambioPassword( usuario.isRequiereCambioPassword() );
        usuarioResponseDTO.setRol( usuario.getRol() );
        usuarioResponseDTO.setUsername( usuario.getUsername() );

        return usuarioResponseDTO;
    }
}
