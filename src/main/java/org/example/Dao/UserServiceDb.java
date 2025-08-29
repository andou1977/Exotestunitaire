package org.example.Dao;

public class UserServiceDb {

    private UserRepository repository;

    public UserServiceDb(UserRepository repository) {
        this.repository = repository;
    }

    public String getUserName(Long id) {
        User user = repository.findUserById(id);
        return user != null ? user.getName() : "Unknown";
    }
}
