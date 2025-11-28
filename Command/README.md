# Patrón Command

## Contexto
Un editor necesita ejecutar y deshacer comandos (copiar, pegar, cortar).

## Explicación
El patrón **Command** encapsula una solicitud como un objeto, permitiendo deshacer, colas, etc.

## Cuándo usar
- Para implementar deshacer/rehacer.
- Para separar invocadores de ejecutores.

## Beneficios
- **Single Responsibility Principle.**
- Facilita la extensión de nuevos comandos.
