package kz.bitlab.finalproject.trello.repos;

import kz.bitlab.finalproject.trello.classes.Folders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface FolderRepos extends JpaRepository<Folders, Long> {
    Folders findAllById(Long id);

    void deleteById(Long id);
    Optional<Folders> findById(Long id);
}
