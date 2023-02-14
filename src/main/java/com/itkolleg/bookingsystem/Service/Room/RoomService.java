package com.itkolleg.bookingsystem.Service.Room;

import com.itkolleg.bookingsystem.Domains.Desk;
import com.itkolleg.bookingsystem.Domains.Room;
import com.itkolleg.bookingsystem.Exceptions.DeskExeceptions.DeskNotFoundException;
import com.itkolleg.bookingsystem.Exceptions.RoomExceptions.RoomDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.RoomExceptions.RoomNotFoundException;

import java.util.List;

public interface RoomService {

        public Desk addRoom(Room room);
        public List<Room> getAllRoom();
        public Room getRoomById(Long id) throws DeskNotFoundException;
        public Desk updateRoomById(Long id) throws RoomNotFoundException;
        public void deleteRoomById(Long id) throws RoomDeletionNotPossibleException;

}
