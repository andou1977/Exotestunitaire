package org.example.Facture2;

public class FactureService {
    private final ClientRepository clientRepository;

    public FactureService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public double calculerRemise(String clientId) {
        Client client = clientRepository.findById(clientId);
        if (client == null) {
            throw new IllegalArgumentException("Client introuvable");
        }
        return client.isFidele() ? 0.1 : 0.0;
    }
}
