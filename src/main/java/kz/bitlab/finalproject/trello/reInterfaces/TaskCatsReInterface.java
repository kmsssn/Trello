package kz.bitlab.finalproject.trello.reInterfaces;

import kz.bitlab.finalproject.trello.classes.TaskCats;

public interface TaskCatsReInterface {
    TaskCats addTaskCat(TaskCats taskCats);

    void updTaskCat(TaskCats taskCats);
    TaskCats getCatById(Long id);
    void deleteCatById(Long id);
}
