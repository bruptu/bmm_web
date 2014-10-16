/* 
INTERFACE QUE VAI SER IMPLEMENTADA PARA TODAS 
CLASSES QUE VAI ACESSAR O BANCO DE DADOS
*/
package br.com.bmm.model.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;



/*INTERFACE DAO QUE VAI RECEBER COMO T GENERICO ,*/
public interface InterfaceDAO<T> {
    
/* DESCREVER METODOS*/
    void save (T entity);
    void update (T entity);
    void remove (T entity);
    void merge (T entity);
 /*METODOS BASICOS PARA EFETUAR O CRUID */
    
   // Recuperar um objeto
    T getEntity(Serializable id);
    T getEntityByDetachedCriteria(DetachedCriteria criteria );
    List<T> getEntities();    
    List<T> getListByDetachedCriteria(DetachedCriteria criteria );
}
