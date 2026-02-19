package com.lachozag4.pisip.infraestructura.persistencia.mapeadores;

import com.lachozag4.pisip.dominio.entidades.Categoria;
import com.lachozag4.pisip.dominio.entidades.Producto;
import com.lachozag4.pisip.infraestructura.persistencia.jpa.ProductoJpa;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-15T11:58:00-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IProductoJpaMapperImpl implements IProductoJpaMapper {

    @Autowired
    private ICategoriaJpaMapper iCategoriaJpaMapper;

    @Override
    public Producto toDomain(ProductoJpa entity) {
        if ( entity == null ) {
            return null;
        }

        Categoria fkCategoria = null;
        int idproducto = 0;
        String nombre = null;
        double precio = 0.0d;
        int stockActual = 0;
        String descripcion = null;
        String imagenUrl = null;
        boolean estado = false;

        fkCategoria = iCategoriaJpaMapper.toDomain( entity.getFkCategoriaId() );
        idproducto = entity.getIdproducto();
        nombre = entity.getNombre();
        precio = entity.getPrecio();
        stockActual = entity.getStockActual();
        descripcion = entity.getDescripcion();
        imagenUrl = entity.getImagenUrl();
        estado = entity.isEstado();

        Producto producto = new Producto( idproducto, nombre, precio, stockActual, descripcion, imagenUrl, estado, fkCategoria );

        return producto;
    }

    @Override
    public ProductoJpa toEntity(Producto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoJpa productoJpa = new ProductoJpa();

        productoJpa.setFkCategoriaId( iCategoriaJpaMapper.toEntity( producto.getFkCategoria() ) );
        productoJpa.setDescripcion( producto.getDescripcion() );
        productoJpa.setEstado( producto.getEstado() );
        productoJpa.setIdproducto( producto.getIdproducto() );
        productoJpa.setImagenUrl( producto.getImagenUrl() );
        productoJpa.setNombre( producto.getNombre() );
        productoJpa.setPrecio( producto.getPrecio() );
        productoJpa.setStockActual( producto.getStockActual() );

        return productoJpa;
    }
}
