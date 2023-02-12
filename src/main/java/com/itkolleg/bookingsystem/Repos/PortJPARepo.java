package com.itkolleg.bookingsystem.Repos;

import com.itkolleg.bookingsystem.Domains.Port;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortJPARepo extends JpaRepository<Port, Long> {
}
