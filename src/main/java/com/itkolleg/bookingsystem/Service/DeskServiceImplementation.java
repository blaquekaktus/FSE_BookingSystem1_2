package com.itkolleg.bookingsystem.Service;

import com.itkolleg.bookingsystem.Domains.Desk;
import com.itkolleg.bookingsystem.Exceptions.DeskDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.DeskNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeskServiceImplementation implements DeskService{

    private DBAccessDesks dbAccessDesks;

    public DeskServiceImplementation(DBAccessDesks dbAccessDesks){
        this.dbAccessDesks=dbAccessDesks;
    }

    /**
     * Adds a desk entity to the database.
     * Returns the added desk.
     * @param desk
     * @return desk
     */
    @Override
    public Desk addDesk(Desk desk) {
        return this.dbAccessDesks.addDesk(desk);
    }

    /**
     * @return
     */
    @Override
    public List<Desk> getAllDesk() {
        return this.dbAccessDesks.getAllDesk();
    }

    /**
     * @param id
     * @return
     * @throws DeskNotFoundException
     */
    @Override
    public Desk getDeskById(Long id) throws DeskNotFoundException {
        return this.dbAccessDesks.getDeskById(id);
    }

    /**
     * @param id
     * @return
     * @throws DeskNotFoundException
     */
    @Override
    public Desk updateDeskById(Long id) throws DeskNotFoundException {
        return this.dbAccessDesks.updateDeskById(id);
    }

    /**
     * @param id
     * @throws DeskDeletionNotPossibleException
     */
    @Override
    public void deleteDeskById(Long id) throws DeskDeletionNotPossibleException {
        this.dbAccessDesks.deleteDeskById(id);
    }
}
