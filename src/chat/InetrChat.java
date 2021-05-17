/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
/**
 *
 * @author arelm
 */
public interface InetrChat extends Remote{
    // declarando métodos para llamar de forma remota
    public boolean iniciarses(String nomUsu) throws RemoteException;
    public void cerrarses(String nomUsu) throws RemoteException;
    public void enviarmens(Mensaje mensaje) throws RemoteException;
    public List<Mensaje> getTodosMens() throws RemoteException;
    public List<String> getTodosUsu() throws RemoteException;
}
