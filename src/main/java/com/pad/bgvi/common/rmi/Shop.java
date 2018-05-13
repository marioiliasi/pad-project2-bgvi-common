package com.pad.bgvi.common.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.pad.bgvi.common.model.Article;

public interface Shop extends Remote {
    List<Article> getArticles() throws RemoteException;
    
    void buyArticles(List<Article> articles) throws RemoteException;
}