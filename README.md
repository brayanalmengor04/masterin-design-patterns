# Masterin Design Patterns

Este repositorio está dedicado a la práctica de patrones de diseño en Java. Los patrones de diseño son soluciones elegantes a problemas comunes en el desarrollo de software. Aquí implementamos y explicamos de manera sencilla algunos de los patrones más utilizados.

## Patrones implementados

### 1. Singleton
**Propósito:** Asegurar que una clase solo tenga una única instancia y proporcionar un punto global de acceso a ella.

**Uso práctico:** Es ideal cuando necesitas un solo objeto para coordinar acciones a lo largo del sistema, como una conexión a una base de datos o un manejador de configuraciones.

### 2. Factory Method
**Propósito:** Proporcionar una interfaz para crear objetos en una superclase, mientras permite que las subclases alteren el tipo de objetos que se crean.

**Uso práctico:** Útil cuando el proceso de creación de objetos es complejo o cuando las clases concretas de los objetos creados no son conocidas por adelantado. Por ejemplo, en una fábrica de vehículos donde no sabes qué tipo de vehículo crear hasta el tiempo de ejecución.

### 3. Observer
**Propósito:** Definir una relación uno a muchos entre objetos de manera que, cuando uno cambie de estado, todos sus dependientes sean notificados y actualizados automáticamente.

**Uso práctico:** Se utiliza en sistemas de suscripción y notificación, como en sistemas de eventos o cuando se desea que varios objetos reaccionen a los cambios de estado de otro objeto, como una interfaz gráfica que necesita actualizarse al cambiar los datos.

### 4. Strategy
**Propósito:** Definir una familia de algoritmos, encapsular cada uno y hacerlos intercambiables. Permite que el algoritmo varíe independientemente del cliente que lo use.

**Uso práctico:** Este patrón es muy útil cuando tienes varias maneras de realizar una tarea, y quieres cambiar dinámicamente cuál se usa, por ejemplo, distintas estrategias de ordenamiento de datos o métodos de pago en una tienda en línea.

### 5. Decorator
**Propósito:** Permitir que se agreguen responsabilidades adicionales a un objeto de manera dinámica, sin alterar el código de la clase de los objetos.

**Uso práctico:** Usado cuando necesitas agregar características o comportamientos adicionales a objetos individuales sin cambiar la estructura del objeto original, como añadir funcionalidades a elementos de una interfaz gráfica o extender comportamientos de clases sin usar herencia.

---

## ¿Por qué estos patrones?
Estos patrones de diseño son algunos de los más comunes y aplicables en una gran variedad de situaciones de desarrollo. Implementarlos te permitirá escribir código más limpio, escalable y fácil de mantener.

---

## Cómo utilizar este repositorio
1. Clona el repositorio en tu máquina local.
2. Explora los ejemplos de cada patrón en sus respectivos directorios.
3. Cada ejemplo viene con una breve descripción de su propósito y escenarios donde puede aplicarse.
4. Puedes utilizar estos patrones como base para resolver problemas comunes en tus proyectos de software.

---

## Contribuir
Si deseas contribuir al repositorio, puedes hacerlo mediante un fork, crear una nueva rama, realizar tus cambios y enviar un pull request. Todas las contribuciones son bienvenidas.

---

## Licencia
Este proyecto está licenciado bajo la [MIT License](LICENSE).
