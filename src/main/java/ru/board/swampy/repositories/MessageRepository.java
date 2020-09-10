package ru.board.swampy.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.board.swampy.entities.Message;

public interface MessageRepository extends CrudRepository<Message, Integer> {

}
