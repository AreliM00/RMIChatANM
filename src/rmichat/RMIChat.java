/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmichat;

import rmiservidor.Interfaz;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import vistas.VistaChat;
import vistas.vistaBienvenida;

/**
 *
 * @author arelm
 */
public class RMIChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
                   try {
            Registry registry = LocateRegistry.getRegistry("localhost", 6303);
            Interfaz chat = (Interfaz) registry.lookup("chatServer");  //obteniendo una referencia remota
            new vistaBienvenida(chat);  //pasar la referencia como parámetro
        } catch (Exception e) {
            e.printStackTrace();
    }
    }
}
