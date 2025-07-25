package org.example.Facture;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  {
    Client findById(String clientId);
}
