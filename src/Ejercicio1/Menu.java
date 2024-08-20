package Ejercicio1;

import javax.swing.*;

public class Menu {
    public void desplegarMenu(){
        int num1 = 0;
        Persona persona = new Persona();
        Cliente cliente = new Cliente();
        SolicitudCredito solicitudCredito = new SolicitudCredito();
        CreditoHipotecario creditoHipotecario = new CreditoHipotecario();
        Propiedad propiedad = new Propiedad();
        Credito credito = new Credito();



        while (num1 < 1){
            int desicion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero respectivo para realizar una accion: \n1. Persona \n2. Cliente \n3. Solicitud de credito \n4.Propiedad \n5. Estado del credito \n6.Salir \nEstado del credito: " + credito.getEstado()));

            switch (desicion){
                case 1:
                    System.out.println("Persona: ");
                    String nombre = JOptionPane.showInputDialog(null,"Nombre: ");
                    persona.setNombre(nombre);
                    cliente.setNombre(nombre);
                    System.out.println("Nombre = " + persona.getNombre());


                    int id = Integer.parseInt(JOptionPane.showInputDialog(null,"Id: "));
                    persona.setId(id);
                    System.out.println("Id = " + persona.getId());

                    String direccion = JOptionPane.showInputDialog(null,"Direccion:  ");
                    persona.setDireccion(direccion);
                    System.out.println("Direccion = " + persona.getDireccion());

                    break;

                case 2:
                    System.out.println("\nCliente: ");
                    System.out.println("Nombre: " + cliente.getNombre());
                    int ingresos = Integer.parseInt(JOptionPane.showInputDialog(null,"Registre sus ingresos: "));
                    cliente.setIngresos(ingresos);
                    System.out.println("Ingresos = " + cliente.getIngresos());

                    int num = 0;
                    while (num < 1){
                        String dato = JOptionPane.showInputDialog(null,"Ingrese informacion acerca de su historial crediticio (minimo 3 datos), ejemplo (carro,casa,electrodomesticos): ");
                            cliente.llenarHistorialCrediticio(dato);


                            if (cliente.getHistorialCrediticio().size() == 3){
                                num = num + 1;
                                System.out.println("Historial crediticio = " + cliente.getHistorialCrediticio());

                            }

                        }
                    break;

                case 3:
                    System.out.println("\nSolicitud de credito: ");
                    String decision1 = JOptionPane.showInputDialog(null,"Escriba el tipo de credito que solicita (personal o hipotecario):  ");
                    String minusculaDecision1 = decision1.toLowerCase();
                    solicitudCredito.setTipoCredito(decision1);
                    System.out.println("Tipo de credito = " + minusculaDecision1);

                    if (minusculaDecision1.equals("personal")){
                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el monto deseado: "));
                        solicitudCredito.setMonto(cantidad);
                        System.out.println("Monto = " + solicitudCredito.getMonto());

                        int tiempo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el plazo deseado para el credito en meses: "));
                        solicitudCredito.setPlazo(tiempo);
                        System.out.println("tiempo = " + solicitudCredito.getPlazo() + " meses");

                        int intereses = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese una tasa de interes que crea adecuada: "));
                        solicitudCredito.setTasaInteres(intereses);
                        System.out.println("Intereses = " + intereses + "%");
                    }
                    else if (minusculaDecision1.equals("hipotecario")){
                        int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de la propiedad: "));
                        creditoHipotecario.setPropiedad(valor);
                        System.out.println("Propiedad = " + creditoHipotecario.getPropiedad());
                    }
                    break;

                case 4:
                    System.out.println("\nPropiedad: ");
                    String ubicacion = JOptionPane.showInputDialog(null,"Ingrese la direccion de la propiedad: ");
                    propiedad.setDireccion(ubicacion);
                    System.out.println("Direccion = " + propiedad.getDireccion());

                    int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de la propiedad: "));
                    propiedad.setValor(valor);
                    System.out.println("Valor = " + valor);
                    break;

                case 5:
                    int desicionCredito = Integer.parseInt(JOptionPane.showInputDialog(null,"Determinar el estado del credito: \n1. Aprobar \n2. Rechazar"));
                    if (desicionCredito == 1){
                        credito.aprobar();
                    }
                    else if (desicionCredito == 2){
                       credito.rechazar();
                    }
                    else credito.setEstado(" ");

                    break;


                case 6:
                    num1 += 1;

            }

            }

        }

    }

