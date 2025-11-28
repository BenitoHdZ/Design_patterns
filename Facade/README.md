
# Patrón Facade

## Contexto del problema
Un sistema de video requiere múltiples pasos complejos para inicializar, cargar y reproducir.  
Los clientes no deberían conocer los detalles internos.

## Explicación
El patrón **Facade** proporciona una interfaz unificada que simplifica la interacción con un subsistema complejo.

## Cuándo usar
- Cuando quieras ocultar complejidad interna.
- Cuando haya muchos subsistemas que interactúan.

## Beneficios y SOLID
- **Single Responsibility Principle:** la fachada centraliza interacciones.
- **Dependency Inversion:** los clientes dependen de una interfaz simplificada.

## Referencias
- [Refactoring Guru - Facade](https://refactoring.guru/es/design-patterns/facade)
