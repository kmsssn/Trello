package kz.bitlab.finalproject.trello.repos;


import kz.bitlab.finalproject.trello.classes.TaskCats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface TaskCatsRepos extends JpaRepository<TaskCats,Long> {

    TaskCats findAllById(Long id);
}
