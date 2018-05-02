package jdbc_PR;

import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


          int menu = 0;
          while(menu !=5){
              System.out.print("\n1.Añadir Usuario");
              System.out.print("\n2.Ver Usuarios");
              System.out.print("\n3.Eliminar Usuario");
              System.out.print("\n4.Buscar Usuarios por id");
              System.out.print("\n5.Salir");
              System.out.print("\nElige opcion: ");
              menu = scanner.nextInt();

              switch (menu){
                  case 1: validar();
                    break;
                  case 2: geUsers();
                    break;
                  case 3: eliminarUser();
                    break;
                  case 4: getById();
                    break;
                  case 5: System.out.println("salir");
                    break;

              }
          }



    }


    public static void validar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nuevo nombre de Usuario: ");
        String username = scanner.next();
        System.out.print("Nueva contraseña: ");
        String pass = scanner.next();
        System.out.print("Nuevo Email: ");
        String email = scanner.next();
        User user = new User(username, pass, email);
        ControllerUser controller = new ControllerUser();
        controller.registrar(user);
        controller.actualizar(user);

    }

    public static void geUsers(){
        ControllerUser controller = new ControllerUser();
        controller.verUsers();

        }


    public static void  getById(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Buscar Usuario por id: ");
        Integer id  = Integer.valueOf(scanner.next());
        ControllerUser controller = new ControllerUser();
        controller.verUsersById(id);
    }

    public static void eliminarUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID usuario a eliminar: ");
        Integer id  = Integer.valueOf(scanner.next());
        ControllerUser controller = new ControllerUser();
        controller.eliminar(id);

        }


}
