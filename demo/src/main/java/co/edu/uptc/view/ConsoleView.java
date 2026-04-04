package co.edu.uptc.view;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;
    private ResourceBundle messages;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
        // Cargamos español por defecto al iniciar
        loadLanguage(Locale.of("es"));
    }

    // Método para cargar o cambiar el idioma
    public void loadLanguage(Locale locale) {
        // Busca los archivos en la carpeta i18n/messages_...
        this.messages = ResourceBundle.getBundle("i18n/messages", locale);
    }

    // Método para imprimir el menú
    public void showMainMenu() {
        System.out.println("\n" + messages.getString("menu.title"));
        System.out.println(messages.getString("menu.option.1"));
        System.out.println(messages.getString("menu.option.2"));
        System.out.println(messages.getString("menu.option.3"));
        System.out.println(messages.getString("menu.option.4"));
        System.out.println(messages.getString("menu.option.5"));
        System.out.println(messages.getString("menu.option.0"));
    }

    // Método para leer la opción del usuario
    public int readOption() {
        System.out.print(messages.getString("msg.input.select") + " ");
        while (!scanner.hasNextInt()) {
            System.out.println(messages.getString("msg.error.invalid"));
            scanner.next(); // Limpiar el buffer
            System.out.print(messages.getString("msg.input.select") + " ");
        }
        return scanner.nextInt();
    }
    
    // Método para mostrar mensajes generales
    public void showMessage(String key) {
        System.out.println(messages.getString(key));
    }
}
