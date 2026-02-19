package com.lachozag4.pisip.infraestructura.persistencia.mapeadores;

import com.lachozag4.pisip.dominio.entidades.Categoria;
import com.lachozag4.pisip.infraestructura.persistencia.jpa.CategoriaJpa;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-19T12:27:00-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.43.0.v20250819-1513, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class ICategoriaJpaMapperImpl implements ICategoriaJpaMapper {

    @Override
    public Categoria toDomain(CategoriaJpa entity) {
        if ( entity == null ) {
            return null;
        }

        int idcategoria = 0;
        String nombre = null;
        String descripcion = null;
        boolean estado = false;

        idcategoria = entity.getIdcategoria();
        nombre = entity.getNombre();
        descripcion = entity.getDescripcion();
        estado = entity.isEstado();

        Categoria categoria = new Categoria( idcategoria, nombre, descripcion, estado );

        return categoria;
    }

    @Override
    public CategoriaJpa toEntity(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaJpa categoriaJpa = new CategoriaJpa();

        categoriaJpa.setDescripcion( categoria.getDescripcion() );
        categoriaJpa.setEstado( categoria.getEstado() );
        categoriaJpa.setIdcategoria( categoria.getIdcategoria() );
        categoriaJpa.setNombre( categoria.getNombre() );

        return categoriaJpa;
    }
}
