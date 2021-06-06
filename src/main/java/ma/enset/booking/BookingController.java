package ma.enset.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {
    @Autowired
    private HotelBookingRepository hotelBookingRepository;
    @GetMapping(path = "/hotels")
    public List<HotelBooking> list(){
        return hotelBookingRepository.findAll();
    }
}
