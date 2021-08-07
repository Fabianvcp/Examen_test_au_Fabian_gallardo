#language:es
Característica: Realizar la compra de una mascota con Tarjeta.


  Escenario: Compra de un mascota con exito
    Dado en el logeo
    Cuando iniciar sesion con los datos "testserenity" y "123456"
    Cuando Entonces ingrese correctamente mi usuario "Welcome"
    Cuando Ir al carrito
    Cuando Verificamos si el carro esta vacio "Your cart is empty."
    Cuando en el buscador el valor "fish"
    Cuando seleccionar mascota para la compra
    Cuando Verificamos si el precio es de "Sub Total: $5.29"
    Cuando llenamos el formulario de compra "MasterCard", "5151741914248443"
    Cuando Se visualiza el mensaje "Please confirm the information below and then press continue...".
    Entonces hacemos click en continue
