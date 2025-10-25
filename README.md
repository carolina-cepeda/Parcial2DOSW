# Parcial2DOSW
___
* Carolina Cepeda Valencia
#  Proyecto de Suscripción de Usuarios

Este proyecto implementa un flujo básico para registrar un **usuario nuevo**, crear su **suscripción** y generar un **pago inicial**.

##  Estructura del Proyecto

El proyecto sigue el patrón **Controller - Service - Repository** con DTOs basados en `record`.

## End points
POST /api/usuarios/suscribirse

Descripción:Registra un nuevo usuario, genera su suscripción y crea un pago con fecha de inicio = fecha actual y fecha de fin = un mes después


## Tests
* Debe hacerse una hppy path para cuando se crea el usuario con exito y poder observar su fecha de proximo pago y debe hacerse
error de falta de información en la request hecha para suscribirse.