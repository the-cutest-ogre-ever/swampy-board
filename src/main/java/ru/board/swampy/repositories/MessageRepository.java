package ru.board.swampy.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.board.swampy.entities.Message;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Integer> {

    List<Message> findByTag(String tag);
}
