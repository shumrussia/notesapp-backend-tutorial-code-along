package ru.azatnuriakhmetov.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.azatnuriakhmetov.springboot.entity.Note;

@Repository
public interface NotesRepository extends JpaRepository<Note, Long> {

}
