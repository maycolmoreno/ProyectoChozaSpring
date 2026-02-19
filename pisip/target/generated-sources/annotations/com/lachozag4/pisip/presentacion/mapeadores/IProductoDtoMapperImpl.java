package com.lachozag4.pisip.presentacion.mapeadores;

import com.lachozag4.pisip.dominio.entidades.Categoria;
import com.lachozag4.pisip.dominio.entidades.Producto;
import com.lachozag4.pisip.presentacion.dto.response.ProductoResponseDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-19T12:26:59-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.43.0.v20250819-1513, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IProductoDtoMapperImpl implements IProductoDtoMapper {

    @Override
    public ProductoResponseDTO toResponseDTO(Producto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoResponseDTO productoResponseDTO = new ProductoResponseDTO();

        productoResponseDTO.setCategoriaId( productoFkCategoriaIdcategoria( producto ) );
        productoResponseDTO.setDescripcion( producto.getDescripcion() );
        productoResponseDTO.setEstado( producto.getEstado() );
        productoResponseDTO.setIdproducto( producto.getIdproducto() );
        productoResponseDTO.setImagenUrl( producto.getImagenUrl() );
        productoResponseDTO.setNombre( producto.getNombre() );
        productoResponseDTO.setPrecio( producto.getPrecio() );
        productoResponseDTO.setStockActual( producto.getStockActual() );

        return productoResponseDTO;
    }

    private int productoFkCategoriaIdcategoria(Producto producto) {
        Categoria fkCategoria = producto.getFkCategoria();
        if ( fkCategoria == null ) {
            return 0;
        }
        return fkCategoria.getIdcategoria();
    }
}
