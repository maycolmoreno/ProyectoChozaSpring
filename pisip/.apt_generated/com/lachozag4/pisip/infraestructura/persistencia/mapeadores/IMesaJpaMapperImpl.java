package com.lachozag4.pisip.infraestructura.persistencia.mapeadores;

import com.lachozag4.pisip.dominio.entidades.Mesa;
import com.lachozag4.pisip.infraestructura.persistencia.jpa.MesaJpa;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-14T23:15:41-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.43.0.v20250819-1513, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IMesaJpaMapperImpl implements IMesaJpaMapper {

    @Override
    public Mesa toDomain(MesaJpa entity) {
        if ( entity == null ) {
            return null;
        }

        int idmesa = 0;
        Integer numero = null;
        Integer capacidad = null;
        boolean estado = false;
        String ubicacion = null;

        idmesa = entity.getIdmesa();
        numero = entity.getNumero();
        capacidad = entity.getCapacidad();
        estado = entity.isEstado();
        ubicacion = entity.getUbicacion();

        Mesa mesa = new Mesa( idmesa, numero, capacidad, estado, ubicacion );

        return mesa;
    }

    @Override
    public MesaJpa toEntity(Mesa mesa) {
        if ( mesa == null ) {
            return null;
        }

        MesaJpa mesaJpa = new MesaJpa();

        mesaJpa.setCapacidad( mesa.getCapacidad() );
        mesaJpa.setEstado( mesa.isEstado() );
        mesaJpa.setIdmesa( mesa.getIdmesa() );
        mesaJpa.setNumero( mesa.getNumero() );
        mesaJpa.setUbicacion( mesa.getUbicacion() );

        return mesaJpa;
    }
}
