package com.itkolleg.bookingsystem.Service;

import com.itkolleg.bookingsystem.Domains.User;
import com.itkolleg.bookingsystem.Exceptions.UserDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.UserNotFoundException;

import java.util.List;

public interface UserService {
    User addUser(User user);
    List<User> getAllUsers();

    User getUserById(Long id) throws UserNotFoundException;

    User updateUserById(Long id) throws UserNotFoundException;

    void deleteUserById(Long id) throws UserDeletionNotPossibleException;
}