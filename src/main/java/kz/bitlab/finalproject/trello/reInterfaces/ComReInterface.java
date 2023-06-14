package kz.bitlab.finalproject.trello.reInterfaces;

import kz.bitlab.finalproject.trello.classes.Coms;

public interface ComReInterface {
    Coms addCom(Coms coms);
    Coms getCom(Long id);
    Coms getComsById(Long id);
    void deleteCom(Long id);
}
