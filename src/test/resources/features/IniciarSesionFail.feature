#language:es
@IniciarSesion
Característica: Funcionalidad de Iniciar Sesion


  Esquema del escenario:  Inicio de sesion fallido - con parametros

    Dado  en la pagina principal al ingresar

    Cuando inicio sesion con los valores <nombreUsuario> y <passwordUsuario>

    Entonces no ingrese correctamente mi usuario "Invalid username or password."

    Ejemplos:
      | nombreUsuario  | passwordUsuario |
      | "SheldonCooper" | "123456789"    |