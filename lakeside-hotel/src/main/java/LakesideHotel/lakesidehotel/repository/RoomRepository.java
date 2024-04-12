package LakesideHotel.lakesidehotel.repository;

import LakesideHotel.lakesidehotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
