package me.dio.domain.repository;

import me.dio.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
<<<<<<< HEAD
}
=======
}
>>>>>>> 83b83bf4719d137d0b58b6b53871cdb2017d8498
