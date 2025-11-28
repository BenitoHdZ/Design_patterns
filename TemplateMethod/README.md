# Patrón Template Method

## Contexto
Tienes varios tipos de reportes, pero todos siguen pasos similares con pequeñas variaciones.

## Explicación
Define el esqueleto de un algoritmo en una superclase, dejando que las subclases redefinan pasos específicos.

## Cuándo usar
- Cuando varios algoritmos comparten estructura común.
- Cuando deseas mantener orden en el flujo del algoritmo.

## Beneficios
- **Open/Closed Principle**
- **Inversión de control:** pasos definidos por subclases.
