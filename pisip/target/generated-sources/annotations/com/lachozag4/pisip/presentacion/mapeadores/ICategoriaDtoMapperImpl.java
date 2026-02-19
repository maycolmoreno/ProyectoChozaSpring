package com.lachozag4.pisip.presentacion.mapeadores;

import com.lachozag4.pisip.dominio.entidades.Categoria;
import com.lachozag4.pisip.presentacion.dto.request.CategoriaRequestDTO;
import com.lachozag4.pisip.presentacion.dto.response.CategoriaResponseDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-19T12:26:59-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.43.0.v20250819-1513, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class ICategoriaDtoMapperImpl implements ICategoriaDtoMapper {

    @Override
    public Categoria toDomain(CategoriaRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        int idcategoria = 0;
        String nombre = null;
        String descripcion = null;
        boolean estado = false;

        idcategoria = dto.getIdcategoria();
        nombre = dto.getNombre();
        descripcion = dto.getDescripcion();
        estado = dto.isEstado();

        Categoria categoria = new Categoria( idcategoria, nombre, descripcion, estado );

        return categoria;
    }

    @Override
    public CategoriaResponseDTO toResponseDTO(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaResponseDTO categoriaResponseDTO = new CategoriaResponseDTO();

        categoriaResponseDTO.setDescripcion( categoria.getDescripcion() );
        categoriaResponseDTO.setEstado( categoria.getEstado() );
        categoriaResponseDTO.setIdcategoria( categoria.getIdcategoria() );
        categoriaResponseDTO.setNombre( categoria.getNombre() );

        return categoriaResponseDTO;
    }
}
