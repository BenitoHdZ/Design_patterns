# Patrón Decorator

## Contexto del problema
Tienes una aplicación que genera reportes (PDF, CSV, HTML). El código se repite al agregar nuevas funcionalidades (ej. compresión, cifrado).  
Necesitamos una forma flexible de extender el comportamiento de objetos sin modificar su código base.

## Explicación del patrón
El patrón **Decorator** permite añadir responsabilidades a los objetos dinámicamente envolviéndolos dentro de otros objetos.  
Cada decorador implementa la misma interfaz que el objeto que decora, delegando y extendiendo su comportamiento.

## Cuándo usar este patrón
- Cuando necesites agregar funcionalidades dinámicamente.
- Cuando no quieras usar herencia para extender comportamiento.
- Cuando desees combinar comportamientos en tiempo de ejecución.

## Beneficios y principios SOLID aplicados
- **Open/Closed Principle:** puedes extender funcionalidad sin modificar código existente.
- **Single Responsibility Principle:** cada decorador maneja una única funcionalidad adicional.
- Alta **flexibilidad** en la composición de objetos.

## Referencias externas
- [Refactoring Guru - Decorator](https://refactoring.guru/es/design-patterns/decorator)
- [Java Design Patterns - Decorator](https://java-design-patterns.com/patterns/decorator/)
