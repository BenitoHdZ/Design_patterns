# Patrón Strategy

## Contexto del problema
Una aplicación de pago soporta distintos métodos (tarjeta, PayPal, criptomonedas). Cada cálculo de comisión difiere, y el código se vuelve difícil de mantener.

## Explicación
El patrón **Strategy** define una familia de algoritmos, los encapsula y los hace intercambiables en tiempo de ejecución.

## Cuándo usar
- Cuando tienes múltiples variantes de un algoritmo.
- Cuando deseas reemplazar condicionales por polimorfismo.

## Beneficios y SOLID
- **Open/Closed Principle:** nuevos algoritmos sin modificar código existente.
- **Dependency Inversion:** el contexto depende de una abstracción, no de una implementación.

## Referencias
- [Refactoring Guru - Strategy](https://refactoring.guru/es/design-patterns/strategy)
