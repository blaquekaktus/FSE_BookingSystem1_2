package com.itkolleg.bookingsystem.Repos;

import com.itkolleg.bookingsystem.Domains.User;
import com.itkolleg.bookingsystem.Exceptions.UserDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.UserNotFoundException;
import com.itkolleg.bookingsystem.Service.DBAccessUsers;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DBAccessUsersJPAH2 implements DBAccessUsers {

    UserJPARepo userRepo;

    public DBAccessUsersJPAH2(UserJPARepo userRepo){
        this.userRepo = userRepo;
    }

    /**
     * @param user
     * @return
     */
    @Override
    public User addUser(User user) {
        this.userRepo.save(user);
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<User> getAllUsers() {
        return this.userRepo.findAll();
    }

    /**
     * @param id
     * @return
     * @throws UserNotFoundException
     */
    @Override
    public User getUserById(Long id) throws UserNotFoundException {
        Optional<User>userOptional = userRepo.findById(id);
        if(userOptional.isPresent()){
            //public T get()
            //If a value is present, returns the value, otherwise throws NoSuchElementException.
            return userOptional.get();
        }else{
            throw new UserNotFoundException();
        }

    }

    /**
     * @param id
     * @return
     * @throws UserNotFoundException
     */
    @Override
    public User updateUserById(Long id) throws UserNotFoundException {
        return null;
    }

    /**
     * @param id
     * @throws UserDeletionNotPossibleException
     */
    @Override
    public void deleteUserById(Long id) throws UserDeletionNotPossibleException {
        try{
            this.userRepo.deleteById(id);
        } catch(Exception e){
            System.out.println(e.getCause() + e.getClass().getName());
            throw new UserDeletionNotPossibleException("User could not be deleted! \n Possible causes: User has current Bookings!");
        }
    }
}
