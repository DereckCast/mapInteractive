package service;

import java.util.List;

public interface IDAO {
    //QUERY ALL
    <T> List<T> getAll(String nameQuery, Class<T> clazz);
    //INSERT
     <T> void insert(T entity);
    //UPDATE
    <T> T update(T entity);

    <T> void remove(T entity);
    <T> List<T> get(String namedQuery, Class<T> clazz,Object...param);



}
