package bg.softuni.pathfinder.service;

import bg.softuni.pathfinder.model.User;

public interface UserService {
    User getLoggedUser();

    boolean isUniqueUsername (String value);

    boolean isUniqueEmail (String value);
}
