package kz.bitlab.finalproject.trello.services;


import kz.bitlab.finalproject.trello.classes.Folders;
import kz.bitlab.finalproject.trello.classes.TaskCats;
import kz.bitlab.finalproject.trello.impls.TaskCatsImplementation;
import kz.bitlab.finalproject.trello.repos.FolderRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskCatService {
    @Autowired
    private TaskCatsImplementation taskCatsImplementation;
    @Autowired
    private FolderRepos folderRepos;

    public void assignCategory(Long folderId, Long catId){
        Folders folders = folderRepos.findAllById(folderId);
        TaskCats taskCats = taskCatsImplementation.getCatById(catId);
        if(folders.getCategories() != null && folders.getCategories().size() > 0){
            if(!folders.getCategories().contains(taskCats)){
                folders.getCategories().add(taskCats);
            }
        }
        else{
            List<TaskCats> taskCatsList = new ArrayList<>();
            taskCatsList.add(taskCats);
            folders.setCategories(taskCatsList);
        }
        folderRepos.save(folders);
    }
    public void unassignCategory(Long folderId, Long catId){
        Folders folders = folderRepos.findAllById(folderId);
        TaskCats taskCats = taskCatsImplementation.getCatById(catId);
        if(folders.getCategories() != null && folders.getCategories().size() > 0){
            folders.getCategories().remove(taskCats);
        }
        folderRepos.save(folders);
    }
    public List<TaskCats> getListOfCategories(){
        return taskCatsImplementation.getAllCats();
    }
    public void addCategory(TaskCats taskCats){
        taskCatsImplementation.addTaskCat(taskCats);
    }

    public void deleteCategoryById(Long id){
        taskCatsImplementation.deleteCatById(id);
    }
}
