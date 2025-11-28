# Patrón Chain of Responsibility

## Contexto
Validar una solicitud (por ejemplo, autenticación) donde múltiples validadores pueden aplicarse secuencialmente.

## Explicación
Cada manejador decide si procesa la solicitud o la pasa al siguiente.

## Cuándo usar
- Cuando varias etapas deben manejar una petición.
- Cuando se quiere desacoplar emisores y receptores.

## Beneficios
- **Open/Closed Principle:** puedes agregar nuevos manejadores sin modificar los existentes.
- Promueve bajo acoplamiento.

## Referencias
- [Refactoring Guru - Chain of Responsibility](https://refactoring.guru/es/design-patterns/chain-of-responsibility)
