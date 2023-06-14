package kz.bitlab.finalproject.trello.impls;

import kz.bitlab.finalproject.trello.classes.TaskCats;
import kz.bitlab.finalproject.trello.reInterfaces.TaskCatsReInterface;
import kz.bitlab.finalproject.trello.repos.TaskCatsRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskCatsImplementation implements TaskCatsReInterface {

    @Autowired
    private TaskCatsRepos taskCatsRepos;

    public List<TaskCats> getAllCats(){
        return taskCatsRepos.findAll();
    }
    @Override
    public TaskCats addTaskCat(TaskCats taskCats) {
        return taskCatsRepos.save(taskCats);
    }

    @Override
    public void updTaskCat(TaskCats taskCats) {
        taskCatsRepos.save(taskCats);
    }

    @Override
    public TaskCats getCatById(Long id) {
        return taskCatsRepos.findAllById(id);
    }

    @Override
    public void deleteCatById(Long id) {
        taskCatsRepos.deleteById(id);
    }

}
