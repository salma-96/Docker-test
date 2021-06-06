package ma.enset.booking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SpringBootApplication
public class BookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookingApplication.class, args);
    }
   @Bean
    CommandLineRunner start(HotelBookingRepository hotelBookingRepository){
        return args -> {
            hotelBookingRepository.save(new HotelBooking(null,"xxx","djdkj",4));

        };
   };
}

 @Entity
@Data @NoArgsConstructor @AllArgsConstructor
class HotelBooking{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     String name;
     String adress;
    double rating;
 }
 interface HotelBookingRepository extends JpaRepository<HotelBooking,Long>{
 }