package rest_example.service;

import org.springframework.stereotype.Service;
import rest_example.model.Client;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service // аннотация @Service говорит спрингу, что данный класс является сервисом
public class ClientServiceImpl implements ClientService {

    // Хранилище клиентов
    private static final Map<Integer, Client> clientRepositoryMap = new HashMap<>();

    // Переменная для генерации ID клиента (AtomicInteger)
    private static final AtomicInteger clientIdHolder = new AtomicInteger();

    @Override
    public void create(Client client) {
        final int clientId = clientIdHolder.incrementAndGet();
        client.setId(clientId);
        clientRepositoryMap.put(clientId, client);
    }

    @Override
    public List<Client> readAll() {
        return new ArrayList<>(clientRepositoryMap.values());
    }

    @Override
    public Client read(int id) {
        return clientRepositoryMap.get(id);
    }

    @Override
    public boolean update(Client client, int id) {
        if (clientRepositoryMap.containsKey(id)) {
            client.setId(id);
            clientRepositoryMap.put(id, client);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int id) {
        return clientRepositoryMap.remove(id) != null;
    }
}