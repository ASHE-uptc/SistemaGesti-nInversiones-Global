package co.edu.uptc.view;

import co.edu.uptc.control.MenuController;

/**
 * Punto de entrada de la aplicación de consola.
 */
public class Main {

    /**
     * Inicializa la vista y el controlador principal y arranca el menú.
     *
     * @param args argumentos de línea de comandos (no usados)
     */
    public static void main(String[] args) {
        // 1. Instanciamos unicamente la Vista
        ConsoleView view = new ConsoleView();

        // 2. Instanciamos SOLO el controlador principal del menu
        MenuController menuController = new MenuController(view);
        
        // 3. Arrancamos
        menuController.runStartMenu();
    }
}