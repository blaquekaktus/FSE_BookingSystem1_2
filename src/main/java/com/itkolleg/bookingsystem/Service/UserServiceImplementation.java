package com.itkolleg.bookingsystem.Service;

import com.itkolleg.bookingsystem.Domains.User;
import com.itkolleg.bookingsystem.Exceptions.UserDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.UserNotFoundException;

import java.util.List;

public class UserServiceImplementation implements UserService{

    private DBAccessUsers dbAccessUsers;

    /**
     * @param dbAccessUsers
     */
    public UserServiceImplementation(DBAccessUsers dbAccessUsers){
        this.dbAccessUsers = dbAccessUsers;
    }
    /**
     * @param user
     * @return
     */
    @Override
    public User addUser(User user) {
        return this.dbAccessUsers.addUser(user);
    }

    /**
     * @return
     */
    @Override
    public List<User> getAllUsers() {
        return this.dbAccessUsers.getAllUsers();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public User getUserById(Long id) throws UserNotFoundException{
        return this.dbAccessUsers.getUserById(id);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public User updateUserById(Long id) throws UserNotFoundException {
        return this.dbAccessUsers.updateUserById(id);
    }

    /**
     * @param id
     */
    @Override
    public void deleteUserById(Long id) throws UserDeletionNotPossibleException {
       this.dbAccessUsers.deleteUserById(id);
    }
}
