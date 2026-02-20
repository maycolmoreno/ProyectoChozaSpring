# ProyectoChozaSpring

Este repositorio contiene el código fuente de un sistema de gestión para el restaurante "La Choza". El proyecto está desarrollado en Java utilizando el framework Spring Boot.


## Estructura del Proyecto

- **consumochoza/**: Módulo principal de la aplicación, contiene la lógica de negocio, controladores, vistas y recursos estáticos.
- **pisip/**: API desarrollada siguiendo los principios de arquitectura limpia y hexagonal. Este módulo está organizado en capas bien definidas:
   - **Dominio**: Entidades, repositorios y servicios centrales del negocio.
   - **Aplicación**: Casos de uso, servicios de aplicación y lógica de orquestación.
   - **Infraestructura**: Adaptadores de persistencia, configuración, seguridad y acceso a datos.
   - **Presentación**: Controladores REST, DTOs, mapeadores y manejo de excepciones.
  
   Los módulos principales de `pisip` son:
   - `dominio/`: Entidades y lógica de negocio.
   - `aplicacion/`: Casos de uso y servicios de aplicación.
   - `infraestructura/`: Persistencia, seguridad y configuración.
   - `presentacion/`: Controladores, DTOs y mapeadores para la API REST.
  
   Esta estructura permite una alta mantenibilidad, escalabilidad y separación de responsabilidades.

## Tecnologías Utilizadas

- Java
- Spring Boot
- Maven
- Thymeleaf (para plantillas HTML)
- HTML, CSS, JavaScript

## Configuración y Ejecución

1. Clona el repositorio:
   ```bash
   git clone <https://github.com/maycolmoreno/ProyectoChozaSpring.git>
   ```
2. Ingresa al directorio del proyecto:
   Api= pisip
   Front= consumochoza
   
   
3. Ejecuta la aplicación con Spring Tools for Eclipse
Version: 4.32.2.RELEASE


## Estructura de Carpetas Relevantes

- `src/main/java/com/choza/` — Código fuente Java
- `src/main/resources/static/` — Archivos estáticos (CSS, JS, imágenes)
- `src/main/resources/templates/` — Plantillas HTML
- `src/main/resources/application.properties` — Configuración de la aplicación

## Autor
-Maycol Ronald Moreno Suquilanda


