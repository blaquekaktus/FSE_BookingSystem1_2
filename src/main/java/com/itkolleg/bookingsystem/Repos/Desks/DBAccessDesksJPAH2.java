package com.itkolleg.bookingsystem.Repos.Desks;

import com.itkolleg.bookingsystem.Domains.Desk;
import com.itkolleg.bookingsystem.Exceptions.DeskExeceptions.DeskDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.DeskExeceptions.DeskNotFoundException;
import com.itkolleg.bookingsystem.Service.Desks.DBAccessDesks;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DBAccessDesksJPAH2 implements DBAccessDesks {

    DeskJPARepo deskRepo;

    public DBAccessDesksJPAH2(DeskJPARepo deskRepo){
        this.deskRepo=deskRepo;
    }

    /**
     * @param desk
     * @return
     */
    @Override
    public Desk addDesk(Desk desk) {
        this.deskRepo.save(desk);
        return null;
    }


    /**
     * @return
     */
    @Override
    public List<Desk> getAllDesks() {
        return this.deskRepo.findAll();
    }

    /**
     * @param id
     * @return
     * @throws DeskNotFoundException
     */
    @Override
    public Desk getDeskById(Long id) throws DeskNotFoundException {
        Optional<Desk>deskOptional = deskRepo.findById(id);
        if(deskOptional.isPresent()) {
            return deskOptional.get();
        }else{
            throw new DeskNotFoundException();
        }
    }

    /**
     * @param id
     * @return
     * @throws DeskNotFoundException
     */
    @Override
    public Desk updateDeskById(Long id) throws DeskNotFoundException {
        Optional<Desk> deskOptional = deskRepo.findById(id);
        if (deskOptional.isPresent()) {
            //TO DO: implement Method
            return deskOptional.get();
        } else {
            throw new DeskNotFoundException();
        }
    }

    /**
     * @param id
     * @throws DeskDeletionNotPossibleException
     */
    @Override
    public void deleteDeskById(Long id) throws DeskDeletionNotPossibleException {
        try{
            this.deskRepo.deleteById(id);
        }catch(Exception e){
            System.out.println(e.getCause() + e.getClass().getName());
            throw new DeskDeletionNotPossibleException("Desk could not be deleted! \n Possible causes: Current Bookings exists for this Desk!");
        }
    }
}
