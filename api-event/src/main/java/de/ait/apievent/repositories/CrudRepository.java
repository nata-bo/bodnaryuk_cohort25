package de.ait.apievent.repositories;

import de.ait.apievent.dto.EventDto;

import java.util.List;

public interface CrudRepository <T> {
    List<T> findAll();

    void save(T model);

    void update(T model);
}
