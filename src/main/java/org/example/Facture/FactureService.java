package org.example.Facture;

public class FactureService {

    private final ClientRepository clientRepository;

    public FactureService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public double calculerRemise(String clientId) {
        Client client = clientRepository.findById(clientId);
        if (client.isFidele()) {
            return 0.1;
        }
        return 0.0;
    }
}
