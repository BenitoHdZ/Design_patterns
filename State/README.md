# Patrón State

## Contexto del problema
Un reproductor de música cambia su comportamiento según su estado (Reproduciendo, Pausado, Detenido).

## Explicación
El patrón **State** permite que un objeto cambie su comportamiento cuando su estado interno cambia.

## Cuándo usar
- Cuando un objeto tiene comportamientos diferentes según su estado.
- Para eliminar múltiples condicionales basados en estado.

## Beneficios y SOLID
- **Single Responsibility Principle:** cada estado maneja un comportamiento.
- **Open/Closed Principle:** agregar nuevos estados sin modificar código base.

## Referencias
- [Refactoring Guru - State](https://refactoring.guru/es/design-patterns/state)
