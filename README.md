## Practica de interface

Aqui se presentara la primera intefaz de practica del tercer semetre de la universidad de guayaquil.

## Imagen de ejemplo del Proyecto

![image](https://github.com/Julianaguayo/Programaci-n/assets/169215282/4fe0bb52-a929-4875-b441-7f50f83a370e)

## Textfield
Se creo un text fiel en el diseño del proyecto , en este código crea un TextField, establece su posición vertical (top) y horizontal (left) dentro del AnchorPane, y luego lo agrega al AnchorPane para que sea visible en la interfaz de usuario..

##   ListView
Aqui se crea un ListView y se agrega al AnchorPane. Aquí está el fragmento relevante:
Este código crea un ListView vacío y establece su posición dentro del AnchorPane. En este caso, se posiciona en la parte superior izquierda (20.0 desde la parte superior y 220.0 desde la izquierda). Luego, el ListView se agrega al AnchorPane para que sea visible en la interfaz de usuario.
## Metodo label
En el método agregarLabels, se llaman varias veces al método agregarLabel para agregar etiquetas al AnchorPane. Cada llamada especifica el texto y la posición de una etiqueta diferente.

## Agregar el label
El método agregarLabel crea un objeto Label con el texto proporcionado y luego establece la posición superior e izquierda del Label en el AnchorPane utilizando los métodos estáticos setTopAnchor y setLeftAnchor de la clase AnchorPane. Finalmente, agrega el Label al AnchorPane llamando al método getChildren().add(label) del AnchorPane.

## Metodos usadors

agregarImagen(AnchorPane root, String imagenURL, double top, double left): 
Este método agrega imágenes al AnchorPane utilizando una URL de imagen. Las imágenes se escalan para ajustarse a un tamaño específico y se posicionan utilizando las coordenadas proporcionadas.

agregarLabel(AnchorPane root, String texto, double top, double left): 
Este método agrega una etiqueta específica al AnchorPane con el texto dado y las posiciones dadas.


