package com.lachozag4.pisip.infraestructura.persistencia.mapeadores;

import com.lachozag4.pisip.dominio.entidades.Mesa;
import com.lachozag4.pisip.infraestructura.persistencia.jpa.MesaJpa;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-15T11:58:00-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IMesaJpaMapperImpl implements IMesaJpaMapper {

    @Override
    public Mesa toDomain(MesaJpa mesaJpa) {
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

    @Override
    public MesaJpa toEntity(Mesa mesa) {
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
