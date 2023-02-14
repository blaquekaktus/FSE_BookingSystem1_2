package com.itkolleg.bookingsystem.Service.Desks;

import com.itkolleg.bookingsystem.Domains.Desk;
import com.itkolleg.bookingsystem.Exceptions.DeskExeceptions.DeskDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.DeskExeceptions.DeskNotFoundException;

import java.util.List;


public interface DBAccessDesks {
    Desk addDesk(Desk desk);

    List<Desk>getAllDesks();

    Desk getDeskById(Long id) throws DeskNotFoundException;

    Desk updateDeskById(Long id) throws DeskNotFoundException;

    void deleteDeskById(Long id) throws DeskDeletionNotPossibleException;
}
