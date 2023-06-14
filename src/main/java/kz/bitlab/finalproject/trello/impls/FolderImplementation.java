package kz.bitlab.finalproject.trello.impls;

import kz.bitlab.finalproject.trello.classes.Folders;
import kz.bitlab.finalproject.trello.reInterfaces.FolderReInterface;
import kz.bitlab.finalproject.trello.repos.FolderRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FolderImplementation implements FolderReInterface {

    @Autowired
    private FolderRepos repository;
    @Autowired
    private TaskCatsImplementation taskCatsImplementation;
    @Autowired
    private TaskImplementation taskImplementation;
    @Override
    public List<Folders> findAll() {
        return repository.findAll();
    }

    @Override
    public Folders getFolder(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void addFolder(Folders folders) {
        repository.save(folders);
    }
    @Override
    public void deleteFolderById(Long id) {
        repository.deleteById(id);
    }
    public void updFolder(Folders folders){
        repository.save(folders);
    }
}
