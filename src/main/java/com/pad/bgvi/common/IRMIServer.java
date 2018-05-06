package com.pad.bgvi.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRMIServer extends Remote {
	
	public void startServer() throws RemoteException;
	
	public void restartServer() throws RemoteException;
	
	public void stopServer() throws RemoteException;
}
