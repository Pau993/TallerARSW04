# Componentes y conectores - Parte I.

es una demostración de la inyección de dependencias y la inversión de control utilizando el framework Spring. La estructura del proyecto sigue el patrón estándar de un proyecto Maven con una configuración de Spring.

## Estructura del Proyecto
springdemo: Contiene las clases principales de la aplicación.
SpellChecker: Interfaz que define el método checkSpell.
EnglishSpellChecker: Implementación de SpellChecker para el idioma inglés.
SpanishSpellChecker: Implementación de SpellChecker para el idioma español.
GrammarChecker: Clase que utiliza un SpellChecker para revisar la gramática.
ui/Main: Clase principal que carga el contexto de Spring y utiliza GrammarChecker



## Autores ✒️
**Paula Natalia Paez Vega* **Manuel Felipe Barrera Barrera* - *Initial work* - [Paulinguis993](https://github.com/Paulinguis993)

## Licencia 📄

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
