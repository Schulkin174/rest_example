package rest_example.service;

import rest_example.model.Client;
import java.util.List;

public interface ClientService {
    void create(Client client); // Создаем нового клиента
    List<Client> readAll(); // возвращаем список всех имеющихся клиентов
    Client read(int id); // возвращаем клиента по его ID

    /*
      Обновляем клиента с заданным ID, в соответствии с переданным клиентом
      @param client - клиент в соответсвии с которым нужно обновить данные
      @param id - id клиента которого нужно обновить
      @return - true если данные были обновлены, иначе false
     */
    boolean update(Client client, int id);

    /*
      Удаляем клиента с заданным ID
      @param id - id клиента, которого нужно удалить
      @return - true если клиент был удален, иначе false
     */
    boolean delete(int id);
}