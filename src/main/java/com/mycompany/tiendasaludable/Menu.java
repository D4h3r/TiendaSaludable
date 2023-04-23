/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
/**
 *
 * @author DAHER
 */

package com.mycompany.tiendasaludable;

import java.util.Scanner;

public class Menu {

    private TiendaSaludable tiendaSaludable;
    private Scanner scanner;

    public Menu(TiendaSaludable tiendaSaludable) {
        this.tiendaSaludable = tiendaSaludable;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("Menú principal:");
            System.out.println("1. Gestionar clientes");
            System.out.println("2. Gestionar productos");
            System.out.println("3. Gestionar ventas");
            System.out.println("4. Gestionar dietas");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Lógica para gestionar clientes
                    int opcionClientes;
                    do {
                        System.out.println("Menú de clientes:");
                        System.out.println("1. Mostrar clientes");
                        System.out.println("2. Agregar cliente");
                        System.out.println("3. Actualizar cliente");
                        System.out.println("4. Eliminar cliente");
                        System.out.println("5. Regresar al menú principal");
                        System.out.print("Ingrese la opción deseada: ");
                        opcionClientes = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcionClientes) {
                            case 1:
                                tiendaSaludable.mostrarClientes();
                                break;
                            case 2:
                                tiendaSaludable.agregarCliente();
                                break;
                            case 3:
                                tiendaSaludable.actualizarCliente();
                                break;
                            case 4:
                                tiendaSaludable.eliminarCliente();
                                break;
                            case 5:
                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Opción inválida. Intente de nuevo.");
                        }
                    } while (opcionClientes != 5);
                    break;
                case 2:
                    // Lógica para gestionar productos
                    int opcionProductos;
                    do {
                        System.out.println("Menú de productos:");
                        System.out.println("1. Mostrar productos");
                        System.out.println("2. Agregar producto");
                        System.out.println("3. Actualizar producto");
                        System.out.println("4. Eliminar producto");
                        System.out.println("5. Regresar al menú principal");
                        System.out.print("Ingrese la opción deseada: ");
                        opcionProductos = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcionProductos) {
                            case 1:
                                tiendaSaludable.mostrarProductos();
                                break;
                            case 2:
                                tiendaSaludable.agregarProducto();
                                break;
                            case 3:
                                tiendaSaludable.actualizarProducto();
                                break;
                            case 4:
                                tiendaSaludable.eliminarProducto();
                                break;
                            case 5:
                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Opción inválida. Intente de nuevo.");
                        }
                    } while (opcionProductos != 5);
                    break;
                case 3:
                    // Lógica para gestionar ventas
                    int opcionVentas;
                    do {
                        System.out.println("Menú de ventas:");
                        System.out.println("1. Mostrar ventas");
                        System.out.println("2. Agregar venta");
                        System.out.println("3. Actualizar venta");
                        System.out.println("4. Eliminar venta");
                        System.out.println("5. Regresar al menú principal");
                        System.out.print("Ingrese la opción deseada: ");
                        opcionVentas = scanner.nextInt();
                        scanner.nextLine();

                    switch (opcionVentas) {
                        case 1:
                            tiendaSaludable.mostrarVentas();
                            break;
                        case 2:
                            tiendaSaludable.agregarVenta();
                            break;
                        case 3:
                            tiendaSaludable.actualizarVenta();
                            break;
                        case 4:
                            tiendaSaludable.eliminarVenta();
                            break;
                        case 5:
                            System.out.println("Regresando al menú principal...");
                            break;
                        default:
                            System.out.println("Opción inválida. Intente de nuevo.");
                    }
                } while (opcionVentas != 5);
                break;
            case 4:
                // Lógica para gestionar dietas
                int opcionDietas;
                do {
                    System.out.println("Menú de dietas:");
                    System.out.println("1. Mostrar dietas");
                    System.out.println("2. Agregar dieta");
                    System.out.println("3. Actualizar dieta");
                    System.out.println("4. Eliminar dieta");
                    System.out.println("5. Regresar al menú principal");
                    System.out.print("Ingrese la opción deseada: ");
                    opcionDietas = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcionDietas) {
                        case 1:
                            tiendaSaludable.mostrarDietas();
                            break;
                        case 2:
                            tiendaSaludable.agregarDieta();
                            break;
                        case 3:
                            tiendaSaludable.actualizarDieta();
                            break;
                        case 4:
                            tiendaSaludable.eliminarDieta();
                            break;
                        case 5:
                            System.out.println("Regresando al menú principal...");
                            break;
                        default:
                            System.out.println("Opción inválida. Intente de nuevo.");
                    }
                } while (opcionDietas != 5);
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }
}
                        



