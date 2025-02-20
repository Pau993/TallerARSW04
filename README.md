## Escuela Colombiana de Ingeniería

## Arquitecturas de Software

# Componentes y conectores - Parte I.

La aplicación permite crear, guardar y recuperar planos, y está diseñada con una arquitectura que separa el modelo de datos, la persistencia y los servicios. Las pruebas unitarias aseguran que la funcionalidad de persistencia se comporte según lo esperado.

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


3.

4. 

5. 
