package org.example.Banque;

public interface BanqueClientService {
    double getSolde(String clientId);
    void debiter(String clientId, double montant);
}
