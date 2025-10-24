package me.dio.dio_desafio_projeto_bootcamp_gft_modulo4.domain.repository;

import me.dio.dio_desafio_projeto_bootcamp_gft_modulo4.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String number);

    boolean existsByCardNumber(String number);
}
