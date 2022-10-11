package Quality.DesafioQuality.dto.response.responseHotel;

import Quality.DesafioQuality.dto.request.requestHotel.HotelDTO;

import java.util.List;

public class ResponseHotelDTO {
    private List<HotelDTO> hotels;

    public ResponseHotelDTO(){}

    public List<HotelDTO> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelDTO> hotels) {
        this.hotels = hotels;
    }
}
