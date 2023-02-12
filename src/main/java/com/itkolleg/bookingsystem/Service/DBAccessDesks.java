package com.itkolleg.bookingsystem.Service;

import com.itkolleg.bookingsystem.Domains.Desk;
import com.itkolleg.bookingsystem.Exceptions.DeskDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.DeskNotFoundException;

import java.util.List;

public interface DBAccessDesks {
    public Desk addDesk(Desk desk);
    public List<Desk> getAllDesk();
    public Desk getDeskById(Long id) throws DeskNotFoundException;
    public Desk updateDeskById(Long id) throws DeskNotFoundException;
    public void deleteDeskById(Long id) throws DeskDeletionNotPossibleException;
}
