package com.itkolleg.bookingsystem.Repos;

import com.itkolleg.bookingsystem.Domains.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserJPARepo extends JpaRepository <User, Long>{

    /**
     * @param name
     * @return
     */
    //explore use of this method more
    List<User> findAllByFnameOrLnameContains(String name);

    User findUserByFnameOrLnameContaining(String name);

    User findByNickContains(String nick);
}
