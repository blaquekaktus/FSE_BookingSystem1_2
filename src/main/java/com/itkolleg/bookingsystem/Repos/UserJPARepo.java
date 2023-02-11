package com.itkolleg.bookingsystem.Repos;

import com.itkolleg.bookingsystem.Domains.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPARepo extends JpaRepository <User, Long>{
}
