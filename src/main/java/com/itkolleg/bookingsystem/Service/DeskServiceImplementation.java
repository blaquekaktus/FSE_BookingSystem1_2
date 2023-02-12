package com.itkolleg.bookingsystem.Service;

import com.itkolleg.bookingsystem.Domains.Desk;
import com.itkolleg.bookingsystem.Exceptions.DeskDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.DeskNotFoundException;

import java.util.List;

public class DeskServiceImplementation implements DeskService{

    private DBAccessDesks dbAccessDesks;

    public DeskServiceImplementation(DBAccessDesks dbAccessDesks){
        this.dbAccessDesks=dbAccessDesks;
    }

    /**
     * @param desk
     * @return
     */
    @Override
    public Desk addDesk(Desk desk) {

        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Desk> getAllDesk() {
        return null;
    }

    /**
     * @param id
     * @return
     * @throws DeskNotFoundException
     */
    @Override
    public Desk getDeskById(Long id) throws DeskNotFoundException {
        return null;
    }

    /**
     * @param id
     * @return
     * @throws DeskNotFoundException
     */
    @Override
    public Desk updateDeskById(Long id) throws DeskNotFoundException {
        return null;
    }

    /**
     * @param id
     * @throws DeskDeletionNotPossibleException
     */
    @Override
    public void deleteDeskById(Long id) throws DeskDeletionNotPossibleException {

    }
}
