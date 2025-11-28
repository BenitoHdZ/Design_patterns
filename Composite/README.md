# Patrón Composite

## Contexto del problema
Deseas representar una jerarquía de objetos (por ejemplo, archivos y carpetas).  
Necesitas tratar tanto objetos individuales como grupos de objetos de la misma manera.

## Explicación
El patrón **Composite** compone objetos en estructuras de árbol. Permite que el cliente trate de manera uniforme objetos individuales y compuestos.

## Cuándo usar
- Para representar jerarquías de objetos.
- Cuando quieras aplicar operaciones de forma uniforme en toda la estructura.

## Beneficios y SOLID
- **Open/Closed Principle:** se pueden agregar nuevos tipos de componentes.
- **Liskov Substitution Principle:** hojas y compuestos se tratan igual.
- Facilita operaciones recursivas.

## Referencias
- [Refactoring Guru - Composite](https://refactoring.guru/es/design-patterns/composite)
