# Patrón Proxy

## Contexto del problema
Tienes un sistema que carga imágenes desde una red remota. Las imágenes son pesadas y no siempre se necesitan inmediatamente.

## Explicación
El patrón **Proxy** actúa como un sustituto o intermediario de otro objeto. Controla el acceso a ese objeto, permitiendo carga diferida, control de acceso o registro de llamadas.

## Cuándo usar
- Cuando un objeto es costoso de crear.
- Cuando quieras agregar control de acceso, logs o caché.
- Cuando desees diferir la carga de recursos.

## Beneficios y SOLID
- **Single Responsibility Principle:** el proxy maneja acceso, el objeto real su propia lógica.
- **Open/Closed Principle:** puedes agregar comportamiento sin modificar el objeto real.

## Referencias
- [Refactoring Guru - Proxy](https://refactoring.guru/es/design-patterns/proxy)
