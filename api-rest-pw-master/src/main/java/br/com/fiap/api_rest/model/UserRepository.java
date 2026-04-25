package br.com.fiap.api_rest.model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.UUID;

public interface UserRepository extends JpaRepository<Usuario, UUID> {
    UserDetails findByLogin(String login);
}
