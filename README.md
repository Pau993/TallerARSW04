## Escuela Colombiana de Ingeniería

## Arquitecturas de Software

# Componentes y conectores - Parte I.

## Descripción de la Aplicación

La aplicación permite crear, guardar y recuperar planos, y está diseñada con una arquitectura que separa el modelo de datos, la persistencia y los servicios. Las pruebas unitarias aseguran que la funcionalidad de persistencia se comporte según lo esperado.

### Instalación 📦

Realice los siguientes pasos para clonar el proyecto en su máquina local.

```
git clone https://github.com/Pau993/TallerARSW04.git
cd TallerARSW04
git checkout main
mvn clean compile
```

## Como abrir los proyectos

En la rama Parte_1 encontramos el proyecto BluePrints y en el Main encontramos GrammarChecker

https://github.com/user-attachments/assets/da91f1ef-c262-4949-bd10-a76ecd8c4d99


Modelo de Clases

![](img/ClassDiagram1.png)

1. Configure la aplicación para que funcione bajo un esquema de inyección de dependencias, tal como se muestra en el diagrama anterior.


	Lo anterior requiere:

	* Agregar las dependencias de Spring.
	* Agregar la configuración de Spring.
	* Configurar la aplicación -mediante anotaciones- para que el esquema de persistencia sea inyectado al momento de ser creado el bean 'BlueprintServices'.

![image](https://github.com/user-attachments/assets/11f44903-9ab4-4293-800b-26e5ff9f0bb2)
![image](https://github.com/user-attachments/assets/3d0c15b5-04eb-415b-8d50-86601901757f)


2. Para completar las operaciones getBlueprint() y getBlueprintsByAuthor() en la clase BlueprintsServices, primero implementamos estos métodos en la capa de persistencia (InMemoryBlueprintPersistence).

![image](https://github.com/user-attachments/assets/b632e163-9d60-45e6-8eb2-8ffb07c5ad65)

Luego, agregaremos las pruebas correspondientes en InMemoryPersistenceTest para asegurarnos de que estas funcionalidades funcionen correctamente.

![image](https://github.com/user-attachments/assets/61b0dc27-e5fd-422a-b252-2a344c5481f8)

3. Para la creacion del programa mediante sprint, se genera el BlueprintApp, con todas las funcionalidades solicitadas:

![image](https://github.com/user-attachments/assets/c07469e7-f3f5-4232-bff3-a85fb4579dac)

Asi se pueden registrar planos, consultar planos, registrar especificos.

4. Para el filtrado se generan clases que reduzcan el tamaño de los planos, que quiten los datos redundantes o submuestreen.

![image](https://github.com/user-attachments/assets/88ef5cc0-1567-4801-ba01-2e204923072d)

![image](https://github.com/user-attachments/assets/e72449b4-3c95-4d6c-b6bf-e16b9a9e0bbd)

5. Se realizaron los test respectivos para las clases:

![image](https://github.com/user-attachments/assets/c60bfe86-01a3-4ada-9376-f86ae99bf6f8)

![image](https://github.com/user-attachments/assets/4803314d-a3f9-4ff0-b52e-1f1d2c569d93)


## Autores ✒️
**Paula Natalia Paez Vega* **Manuel Felipe Barrera Barrera* - *Initial work* - [Paulinguis993](https://github.com/Paulinguis993)

## Licencia 📄

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
