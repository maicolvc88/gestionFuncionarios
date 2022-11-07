package com.mycompany.gestionfuncionarios;

import com.mycompany.gestionfuncionarios.controller.FuncionarioController;
import com.mycompany.gestionfuncionarios.domain.Funcionario;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class GestionFuncionarios {

    public static void crear(FuncionarioController funcionarioController) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite el nombre");
            String nombre = sc.nextLine();
            System.out.println("El nombre es : " + nombre);
            System.out.println("------------------------");

            System.out.println("Digite el apellido");
            String apellido = sc.nextLine();
            System.out.println("El apellido es : " + apellido);
            System.out.println("------------------------");

            System.out.println("Digite el tipo de identificacion");
            String tipo_identificacion = sc.nextLine();
            System.out.println("El tipo de identificacion es : " + tipo_identificacion);
            System.out.println("------------------------");

            System.out.println("Digite el la direccion");
            String direccion = sc.nextLine();
            System.out.println("La direccion es : " + direccion);
            System.out.println("------------------------");

            System.out.println("Digite el sexo");
            String sexo = sc.nextLine();
            System.out.println("El sexo es : " + sexo);
            System.out.println("------------------------");

            System.out.println("Digite la fecha de nacimiento");
            String f_nacimiento = sc.nextLine();
            System.out.println("La fecha de nacimiento es : " + f_nacimiento);
            System.out.println("------------------------");

            System.out.println("Digite el telefono");
            int tel = sc.nextInt();
            System.out.println("El telefono es : " + tel);
            System.out.println("------------------------");

            System.out.println("Digite el numero de documento");
            int num_documento = sc.nextInt();
            System.out.println("El numero de documento es : " + num_documento);
            System.out.println("------------------------");

            System.out.println("Digite el nivel educativo");
            String nivel_educativo = sc.nextLine();
            System.out.println("El nivel educativo es : " + nivel_educativo);
            System.out.println("------------------------");

            Funcionario funcionario = new Funcionario();
            funcionario.setNombre(nombre);
            funcionario.setApellido(apellido);
            funcionario.setTipo_identificacion(tipo_identificacion);
            funcionario.setDireccion(direccion);
            funcionario.setSexo(sexo);
            funcionario.setF_nacimiento(f_nacimiento);
            funcionario.setTel(tel);
            funcionario.setNum_documento(num_documento);
            funcionario.setNivel_educativo(nivel_educativo);
            funcionarioController.crear(funcionario);
            System.out.println("El funcionario se ha creado con exito");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void obtenerFuncionarios(FuncionarioController funcionarioController) {
        try {
            List<Funcionario> funcionarios = funcionarioController.obtenerFuncionarios();
            if (funcionarios.isEmpty()) {
                System.out.println("No hay datos");
            } else {
                funcionarios.forEach(funcionario -> {
                    System.out.println("Id funcionario: " + funcionario.getId_funcionario());
                    System.out.println("Nombre: " + funcionario.getNombre());
                    System.out.println("Apellido: " + funcionario.getApellido());
                    System.out.println("Tipo de identificacion: " + funcionario.getTipo_identificacion());
                    System.out.println("Numero de documento: " + funcionario.getNum_documento());
                    System.out.println("Direccion: " + funcionario.getDireccion());
                    System.out.println("Fecha de nacimiento: " + funcionario.getF_nacimiento());
                    System.out.println("Sexo: " + funcionario.getSexo());
                    System.out.println("Telefono: " + funcionario.getTel());
                    System.out.println("Nivel educativo: " + funcionario.getNivel_educativo());
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("");
                });
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void obtenerFuncionario(FuncionarioController funcionarioController) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite el Id del funcionario: ");
            int id_funcionario = sc.nextInt();
            System.out.println("Id funcionario: " + id_funcionario);
            System.out.println("-------------------------");

            Funcionario funcionario = funcionarioController.obtenerFuncionario(id_funcionario);
            System.out.println("Listar funcionario= " + funcionario);
            System.out.println("-------------------------");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void editFuncionario(FuncionarioController funcionarioController) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite el Id del funcionario ");
            int id_funcionario = sc.nextInt();
            sc.nextLine();
            System.out.println("Id es : " + id_funcionario);
            Funcionario funcionarioExits = funcionarioController.obtenerFuncionario(id_funcionario);
            if (funcionarioExits == null) {
                System.out.println("No existe el funcionario");
                return;
            }

            System.out.println("Digite el nombre");
            String nombre = sc.nextLine();
            System.out.println("El nombre es : " + nombre);
            System.out.println("------------------------");

            System.out.println("Digite el apellido");
            String apellido = sc.nextLine();
            System.out.println("El apellido es : " + apellido);
            System.out.println("------------------------");

            System.out.println("Digite el tipo de identificacion");
            String tipo_identificacion = sc.nextLine();
            System.out.println("El tipo de identificacion es : " + tipo_identificacion);
            System.out.println("------------------------");

            System.out.println("Digite el la direccion");
            String direccion = sc.nextLine();
            System.out.println("La direccion es : " + direccion);
            System.out.println("------------------------");

            System.out.println("Digite el sexo");
            String sexo = sc.nextLine();
            System.out.println("El sexo es : " + sexo);
            System.out.println("------------------------");

            System.out.println("Digite la fecha de nacimiento");
            String f_nacimiento = sc.nextLine();
            System.out.println("La fecha de nacimiento es : " + f_nacimiento);
            System.out.println("------------------------");

            System.out.println("Digite el telefono");
            int tel = sc.nextInt();
            System.out.println("El telefono es : " + tel);
            System.out.println("------------------------");

            System.out.println("Digite el numero de documento");
            int num_documento = sc.nextInt();
            System.out.println("El numero de documento es : " + num_documento);
            System.out.println("------------------------");

            System.out.println("Digite el nivel educativo");
            String nivel_educativo = sc.nextLine();
            System.out.println("El nivel educativo es : " + nivel_educativo);
            System.out.println("------------------------");

            Funcionario funcionario = new Funcionario();
            funcionario.setNombre(nombre);
            funcionario.setApellido(apellido);
            funcionario.setTipo_identificacion(tipo_identificacion);
            funcionario.setDireccion(direccion);
            funcionario.setSexo(sexo);
            funcionario.setF_nacimiento(f_nacimiento);
            funcionario.setTel(tel);
            funcionario.setNum_documento(num_documento);
            funcionario.setNivel_educativo(nivel_educativo);
            funcionarioController.actualizarFuncionario(id_funcionario, funcionario);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void eliminarFuncionario(FuncionarioController funcionarioController) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite el ID del funcionario: ");
            int id_funcionario = sc.nextInt();
            System.out.println("El id del funcionario es: " + id_funcionario);
            Funcionario funcionarioExists = funcionarioController.obtenerFuncionario(id_funcionario);
            if (funcionarioExists == null) {
                System.out.println("No existe el funcionario");
                return;
            }

            funcionarioController.eliminarFuncionario(id_funcionario);
            System.out.println("Funcionario eliminado");
            obtenerFuncionarios(funcionarioController);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FuncionarioController funcionarioController = new FuncionarioController();
        //crear(funcionarioController);
        //obtenerFuncionarios(funcionarioController);
        //obtenerFuncionario(funcionarioController);
        //editFuncionario(funcionarioController);
        //eliminarFuncionario(funcionarioController);

        int opcion = -1;
        Scanner scanner = new Scanner(System.in);
        while (opcion != 0) {
            System.out.println("--------------------------");
            System.out.println("Elige una opción");
            System.out.println("--------------------------");

            System.out.println("1. Listar Funcionarios ");
            System.out.println("2. Crear funcionario");
            System.out.println("3. listar funcionarios por Id");
            System.out.println("4. Editar funcionario");
            System.out.println("5. eliminar funcionario");

            System.out.println("--------------------------");

            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 0:
                    System.out.println("Ha salido de la aplicación");
                    break;
                case 1:
                    obtenerFuncionarios(funcionarioController);
                    break;
                case 2:
                    crear(funcionarioController);
                    break;
                case 3:
                    obtenerFuncionario(funcionarioController);
                    break;
                case 4:
                    editFuncionario(funcionarioController);
                    break;
                case 5:
                    eliminarFuncionario(funcionarioController);
                    break;

            }
        }

    }
}
