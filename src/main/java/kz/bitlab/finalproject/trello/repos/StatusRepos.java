package kz.bitlab.finalproject.trello.repos;

import kz.bitlab.finalproject.trello.classes.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepos extends JpaRepository<Status,Long> {
}
