package com.itkolleg.bookingsystem.Repos;

import com.itkolleg.bookingsystem.Domains.Desk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeskJPARepo extends JpaRepository<Desk, Long> {

}
