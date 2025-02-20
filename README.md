# Componentes y conectores - Parte I.

es una demostración de la inyección de dependencias y la inversión de control utilizando el framework Spring. La estructura del proyecto sigue el patrón estándar de un proyecto Maven con una configuración de Spring.

## Estructura del Proyecto
springdemo: Contiene las clases principales de la aplicación.
SpellChecker: Interfaz que define el método checkSpell.
EnglishSpellChecker: Implementación de SpellChecker para el idioma inglés.
SpanishSpellChecker: Implementación de SpellChecker para el idioma español.
GrammarChecker: Clase que utiliza un SpellChecker para revisar la gramática.
ui/Main: Clase principal que carga el contexto de Spring y utiliza GrammarChecker

# Ejecución
```
git clone https://github.com/Pau993/TallerARSW03.git
cd TallerARSW03
git checkout main
mvn clean compile
```
## Funcionamiento

* Configuración de Spring: El archivo applicationContext.xml configura el escaneo de componentes en el paquete edu.eci.arsw. Esto permite que Spring detecte y registre automáticamente los beans anotados con @Service y @Autowired.

* Inyección de Dependencias: GrammarChecker tiene una dependencia de SpellChecker, que se inyecta mediante el método setSpellChecker.
EnglishSpellChecker y SpanishSpellChecker son implementaciones de SpellChecker. EnglishSpellChecker está marcado como @Primary, lo que significa que será la implementación predeterminada a menos que se especifique lo contrario.
* Ejecución de la Aplicación: La clase Main carga el contexto de Spring desde applicationContext.xml.
Obtiene un bean de GrammarChecker y llama al método check con un texto de ejemplo.
El resultado se imprime en la consola.


## Autores ✒️
**Paula Natalia Paez Vega* **Manuel Felipe Barrera Barrera* - *Initial work* - [Paulinguis993](https://github.com/Paulinguis993)

## Licencia 📄

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
