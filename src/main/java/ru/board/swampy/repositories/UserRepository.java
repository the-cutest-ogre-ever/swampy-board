package ru.board.swampy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.board.swampy.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
