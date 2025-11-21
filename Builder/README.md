# Kata: Builder

## Contexto
Estás desarrollando un sistema encargado de generar **reportes personalizados** que pueden incluir múltiples secciones opcionales: encabezado, tablas, gráficos, pie de página, metadatos, entre otros.  
Actualmente, la clase `Report` contiene toda la lógica de construcción y depende de constructores largos o varias sobrecargas que complican su uso y mantenimiento.

Esto genera varios problemas:

- Constructores telescópicos difíciles de leer y extender.
- Cada nuevo elemento opcional requiere modificar la clase base, rompiendo el principio **abierto/cerrado**.
- Duplicación de lógica al crear variantes de un mismo reporte.
- Poco control sobre el orden de inicialización y validación de los pasos.

En resumen: el código está **acoplado, es rígido y se vuelve propenso a errores** cuando aumenta la complejidad.

---

## El Patrón: Builder
El patrón **Builder** separa la construcción de un objeto complejo de su representación final.  
Esto permite **crear objetos paso a paso**, controlar el flujo de creación y evitar constructores enormes.

El Builder soluciona estos problemas al:

- Encapsular el proceso de construcción en una clase dedicada.
- Permitir agregar pasos opcionales sin modificar el producto final.
- Ofrecer una API fluida para armar configuraciones complejas.
- Facilitar la creación de múltiples variantes del mismo objeto sin romper su estructura interna.

### Beneficios del patrón
- **Legibilidad mejorada:** La creación se expresa como una secuencia clara de pasos (`builder.addHeader().addChart().build()`).
- **Bajo acoplamiento:** El producto y el proceso de construcción permanecen separados.
- **Extensibilidad:** Puedes crear nuevos builders sin alterar el producto.
- **Validación centralizada:** El método `build()` controla el estado final del objeto.
- **Consistencia:** Los pasos pueden seguir un orden impuesto cuando sea necesario.

---

## ¿Cuándo usar este patrón?
- Cuando un objeto requiere **muchos parámetros**, especialmente si muchos son opcionales.
- Cuando los constructores telescópicos se vuelven inmanejables.
- Cuando existen **diferentes variantes** del mismo objeto (p. ej., reporte simple, detallado, PDF, HTML).
- Cuando el proceso de construcción debe ser **flexible, controlado y reutilizable**.
- Cuando quieres desacoplar la creación del uso del objeto.

---

## Estructura típica
- **Product**: El objeto complejo a construir (`Report`).
- **Builder**: Define los pasos para construir el objeto.
- **ConcreteBuilder**: Implementa esos pasos y almacena el estado temporal.
- **Director (opcional)**: Organiza los pasos para construir configuraciones predefinidas.

---

## Challenge

Para poner en pr�ctica el patr�n Observer, consulta el [README del challenge](./challenge/) que contiene un ejercicio pr�ctico.
