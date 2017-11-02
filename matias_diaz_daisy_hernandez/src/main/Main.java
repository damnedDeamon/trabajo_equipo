package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gato = 0, raton = 0;
        String fila, columna;
        String fila_gato, columna_gato;
        String fila_raton, columna_raton;
        String fila_m1, columna_m1;
        String fila_m2, columna_m2;
        String[] posicion_p;
        String[] posicion_g;
        String[] posicion_r;
        String coordenada_m1;
        String[] posicion_m1;
        String coordenada_m2;
        String[] posicion_m2;
        String coordenada_g;
        String coordenada_p;
        String coordenada_r;
        int MAXIMO = 20;
        int mueble = 0;
        int fil_m1 = 0;
        int fil_m2 = 0;
        int colum_m1 = 0;
        int colum_m2 = 0;
        int fil = 0;
        int colum = 0;
        int PORCENTAJE_RATONES = 25;
        int PORCENTAJE_GATOS = 10;
        int op = 0;
        int area = 0;
        int PORCENTAJE_G = 0;
        int fil_g = 0;
        int fil_r = 0;
        int colum_g = 0;
        int colum_r = 0;
        String[][] mObj = new String[fil][colum];

        System.out.println("--------------------------------------");
        System.out.println("   Bienvenido al creador de planos");
        System.out.println("--------------------------------------");
        System.out.println("Reglas: Todo lo que sea coordenada");
        System.out.println("se debe ingresar separado por una, ");
        System.out.println("coma EJ: 3,2");
        System.out.println("");
        while (true) {

            try {
                System.out.print("Ingrese alta y ancho de la pieza: ");

                coordenada_p = scan.nextLine();

                posicion_p = coordenada_p.split(",");
                fila = posicion_p[0];
                columna = posicion_p[1];

                fil = Integer.parseInt(fila);
                colum = Integer.parseInt(columna);
                if (fil > MAXIMO && colum > MAXIMO) {
                    System.err.println("No puede superar el maximo de 20,20");
                }
                
                if (fil <= 0 && colum <= 0) {
                    System.err.println("¡Iingrese solo numeros positivos!");
                }
            } catch (Exception e) {
                System.err.println("¡Opcion incorrecta!");
            }
            if (fil > 0 && colum > 0 && fil <= MAXIMO && colum <= MAXIMO) {
                break;
            }
        }
        if (colum > 0 && fil > 0) {
            mObj = new String[fil][colum];

            for (int r = 0; r < mObj.length; r++) {
                for (int j = 0; j < mObj[r].length; j++) {
                    mObj[r][j] = " -";
                }

            }
        }

        // ciclo para la fila de numeros
        System.out.print("f/c ");
        for (int f = 0; f < mObj[0].length; f++) {

            // if dejar de poner 0
            if (f >= 10) {
                System.out.print(f + "  ");
            } else {
                System.out.print(0);
                System.out.print(f + "  ");
            }
        }
        System.out.println(); // enter

        // ciclo para las filas de numeros
        for (int f = 0; f < mObj.length; f++) {

            // if dejar de poner 0 y mostrar la columna de numeros
            if (f >= 10) {
                System.out.print(f);
            } else {
                System.out.print(0);
                System.out.print(f);
            }
            // ciclo para las filas de numeros
            for (int c = 0; c < mObj[f].length; c++) {
                System.out.print(" " + mObj[f][c] + " ");
            }
            System.out.println(); // enter
        }

        area = fil * colum;
        PORCENTAJE_G = (area * PORCENTAJE_GATOS) / 100;

        System.out.println("Solo puede ingresar " + PORCENTAJE_G + " gato como maximo");
        while (true) {
            try {
                System.out.print("n° de gatos: ");
                gato = Integer.parseInt(scan.nextLine());

                if (gato <= PORCENTAJE_G && gato >= 0) {
                    break;
                } else {
                    System.err.println("No puede ingresar mas gatos de lo pedido");
                }

                if (gato < 0) {
                    System.err.println("¡No puede colocar numeros negativos!");
                }

            } catch (Exception e) {
                System.err.println("¡Opcion incorrecta!");
            }
        }

        for (int i = 1; i <= gato; i++) {
            if (gato >= 1) {

                System.out.println("---------------");
                System.out.println("GATO N° " + i);
                System.out.println("---------------");
                while (true) {

                    try {
                        System.out.print("Ingrese fila y columna: ");
                        coordenada_g = scan.nextLine();
                        posicion_g = coordenada_g.split(",");

                        fila_gato = posicion_g[0];
                        columna_gato = posicion_g[1];

                        fil_g = Integer.parseInt(fila_gato);
                        colum_g = Integer.parseInt(columna_gato);
                        if (fil_g >= 0 && colum_g >= 0) {
                            break;
                        }else
                            System.err.println("No puede superar la pieza");
                        
                    } catch (Exception e) {
                        System.err.println("¡Opcion incorrecta!");

                    }

                }

                System.out.print("f/c ");
                for (int f = 0; f < mObj[0].length; f++) {

                    // if dejar de poner 0
                    if (f >= 10) {
                        System.out.print(f + "  ");
                    } else {
                        System.out.print(0);
                        System.out.print(f + "  ");
                    }
                }
                System.out.println(); // enter // enter

                // ciclo para las filas de numeros
                for (int f = 0; f < mObj.length; f++) {

                    // if dejar de poner 0 y mostrar la columna de numeros
                    if (f >= 10) {
                        System.out.print(f);
                    } else {
                        System.out.print(0);
                        System.out.print(f);
                    }
                    // ciclo para las filas de numeros
                    for (int c = 0; c < mObj[f].length; c++) {
                        if (f == fil_g && c == colum_g) {
                            mObj[f][c] = " G";
                        }
                        System.out.print(" " + mObj[f][c] + " ");
                    }
                    System.out.println(); // enter
                }
            }

        }

        int PORCENTAJE_R = (area * PORCENTAJE_RATONES) / 100;
        System.out.println("--------------------------------------------");
        System.out.println("Solo puede ingresar " + PORCENTAJE_R + " ratones como maximo");
        while (true) {
            try {
                System.out.print("n° de ratones: ");
                raton = Integer.parseInt(scan.nextLine());
                if (raton <= PORCENTAJE_R && raton >= 0) {
                    break;

                } else {
                    System.err.println("¡No puede colocar numeros negativos!");
                }

                if (raton > PORCENTAJE_R) {
                    System.err.println("No puede ingresar mas ratones de lo pedido");
                }
            } catch (Exception e) {
                System.err.println("¡Opcion incorrecta!");
            }
        }

        for (int j = 1; j <= raton; j++) {
            if (raton >= 1) {
                System.out.println("---------------");
                System.out.println("RATON N° " + j);
                System.out.println("---------------");

                while (true) {
                    try {
                        System.out.print("Ingrese fila y columna: ");
                        coordenada_r = scan.nextLine();
                        posicion_r = coordenada_r.split(",");

                        fila_raton = posicion_r[0];
                        columna_raton = posicion_r[1];

                        fil_r = Integer.parseInt(fila_raton);
                        colum_r = Integer.parseInt(columna_raton);

                        if (fil_r >= 0 && colum_r >= 0) {
                            break;
                        }
                    } catch (Exception e) {
                        System.err.println("¡Opcion incorrecta!");
                    }
                }

                System.out.print("f/c ");
                for (int f = 0; f < mObj[0].length; f++) {

                    // if dejar de poner 0
                    if (f >= 10) {
                        System.out.print(f + "  ");
                    } else {
                        System.out.print(0);
                        System.out.print(f + "  ");
                    }
                }
                System.out.println(); // enter // enter

                // ciclo para las filas de numeros
                for (int f = 0; f < mObj.length; f++) {

                    // if dejar de poner 0 y mostrar la columna de numeros
                    if (f >= 10) {
                        System.out.print(f);
                    } else {
                        System.out.print(0);
                        System.out.print(f);
                    }
                    // ciclo para las filas de numeros
                    for (int c = 0; c < mObj[f].length; c++) {
                        if (f == fil_r && c == colum_r) {
                            mObj[f][c] = " R";
                        }
                        System.out.print(" " + mObj[f][c] + " ");
                    }
                    System.out.println(); // enter
                }
            }
        }

        while (true) {
            try {
                System.out.println("n° de muebles: ");
                mueble = Integer.parseInt(scan.nextLine());
                if (mueble >= 0) {
                    break;
                } else if (mueble < 0) {
                    System.err.println("¡No puede colocar numeros negativos!");
                }
            } catch (Exception e) {
                System.err.println("¡Opcion incorrecta!");
            }
        }

        if (mueble > 0) {

            for (int k = 1; k <= mueble; k++) {
                if (mueble >= 1) {
                    System.out.println("---------------");
                    System.out.println("MUEBLE N° " + k);
                    System.out.println("---------------");
                    System.out.println("Posicion N° 1");
                    System.out.println("---------------");
                    while (true) {
                        try {
                            System.out.print("Ingrese fila y columna: ");
                            coordenada_m1 = scan.nextLine();
                            posicion_m1 = coordenada_m1.split(",");

                            fila_m1 = posicion_m1[0];
                            columna_m1 = posicion_m1[1];

                            fil_m1 = Integer.parseInt(fila_m1);
                            colum_m1 = Integer.parseInt(columna_m1);

                            if (fil_m1 >= 0 && colum_m1 >= 0) {
                                break;
                            }
                        } catch (Exception e) {
                            System.err.println("¡Opcion incorrecta!");
                        }
                    }

                    // ciclo para la fila de numeros
                    System.out.print("f/c ");
                    for (int f = 0; f < mObj[0].length; f++) {

                        // if dejar de poner 0
                        if (f >= 10) {
                            System.out.print(f + "  ");
                        } else {
                            System.out.print(0);
                            System.out.print(f + "  ");
                        }
                    }
                    System.out.println(); // enter

                    // ciclo para las filas de numeros
                    for (int f = 0; f < mObj.length; f++) {

                        // if dejar de poner 0 y mostrar la columna de numeros
                        if (f >= 10) {
                            System.out.print(f);
                        } else {
                            System.out.print(0);
                            System.out.print(f);
                        }
                        // ciclo para las filas de numeros
                        for (int c = 0; c < mObj[f].length; c++) {
                            if (f == fil_m1 && c == colum_m1) {
                                mObj[f][c] = " x";
                            }
                            System.out.print(" " + mObj[f][c] + " ");
                        }
                        System.out.println(); // enter

                    }

                }

                System.out.println("---------------");
                System.out.println("Posicion N° 2");
                System.out.println("---------------");
                while (true) {
                    try {
                        System.out.print("Ingrese fila y columna: ");
                        coordenada_m2 = scan.nextLine();
                        posicion_m2 = coordenada_m2.split(",");

                        fila_m2 = posicion_m2[0];
                        columna_m2 = posicion_m2[1];

                        fil_m2 = Integer.parseInt(fila_m2);
                        colum_m2 = Integer.parseInt(columna_m2);

                        if (fil_m2 >= 0 && colum_m2 >= 0) {
                            break;
                        }
                    } catch (Exception e) {
                        System.err.println("¡Opcion incorrecta!");
                    }

                }

                // ciclo para la fila de numeros
                System.out.print("f/c ");
                for (int f = 0; f < mObj[0].length; f++) {

                    // if dejar de poner 0
                    if (f >= 10) {
                        System.out.print(f + "  ");
                    } else {
                        System.out.print(0);
                        System.out.print(f + "  ");
                    }
                }
                System.out.println(); // enter

                // ciclo para las filas de numeros
                for (int f = 0; f < mObj.length; f++) {

                    // if dejar de poner 0 y mostrar la columna de numeros
                    if (f >= 10) {
                        System.out.print(f);
                    } else {
                        System.out.print(0);
                        System.out.print(f);
                    }
                    // ciclo para las filas de numeros
                    for (int c = 0; c < mObj[f].length; c++) {
                        if (f == fil_m2 && c == colum_m2) {
                            mObj[f][c] = " x";
                        }
                        System.out.print(" " + mObj[f][c] + " ");
                    }
                    System.out.println(); // enter

                }

                while (true) {
                    try {

                        System.out.println("Proceder?");
                        System.out.println("1.- SI");
                        System.out.println("2.- NO");
                        System.out.print("OP: ");
                        op = Integer.parseInt(scan.nextLine());
                        if (op < 0) {
                            System.err.println("¡Iingrese solo numeros positivos!");
                        } else if (op == 0) {
                            System.err.println("¡debe ingresar 1 ó 2! ");
                        } else if (op > 0) {
                            break;
                        }

                    } catch (Exception e) {
                        System.err.println("¡Opcion incorrecta!");
                    }
                }
                if (op == 1) {
                    // ciclo para la fila de numeros
                    System.out.print("f/c ");
                    for (int f = 0; f < mObj.length; f++) {

                        // if dejar de poner 0
                        if (f >= 10) {
                            System.out.print(f + "  ");
                        } else {
                            System.out.print(0);
                            System.out.print(f + "  ");
                        }
                    }
                    System.out.println(); // enter

                    // ciclo para las filas de numeros
                    for (int f = 0; f < mObj.length; f++) {

                        // if dejar de poner 0 y mostrar la columna de numeros
                        if (f >= 10) {
                            System.out.print(f);
                        } else {
                            System.out.print(0);
                            System.out.print(f);
                        }
                        // ciclo para las filas de numeros
                        for (int c = 0; c < mObj[f].length; c++) {

                            for (int fi = 0; fi < mObj.length; fi++) {

                                if (c >= colum_m1 && c <= colum_m2 && fi >= fil_m1 && fi <= fil_m2) {
                                    mObj[fi][c] = " M";
                                }
                            }

                            System.out.print(" " + mObj[f][c] + " ");
                        }
                        System.out.println(); // enter
                    }
                } else if (op == 2) {
                    // ciclo para la fila de numeros
                    System.out.print("f/c ");
                    for (int f = 0; f < mObj.length; f++) {

                        // if dejar de poner 0
                        if (f >= 10) {
                            System.out.print(f + "  ");
                        } else {
                            System.out.print(0);
                            System.out.print(f + "  ");
                        }
                    }
                    System.out.println(); // enter

                    // ciclo para las filas de numeros
                    for (int f = 0; f < mObj.length; f++) {

                        // if dejar de poner 0 y mostrar la columna de numeros
                        if (f >= 10) {
                            System.out.print(f);
                        } else {
                            System.out.print(0);
                            System.out.print(f);
                        }
                        // ciclo para las filas de numeros
                        for (int c = 0; c < mObj[f].length; c++) {

                            for (int fi = 0; fi < mObj.length; fi++) {

                                if (c >= colum_m1 && c <= colum_m2 && fi >= fil_m1 && fi <= fil_m2) {
                                    mObj[fi][c] = " -";
                                }
                            }

                            System.out.print(" " + mObj[f][c] + " ");
                        }
                        System.out.println(); // enter
                    }
                }

            }
        }
    }

}
