package Quality.DesafioQuality.repository.impl;

import Quality.DesafioQuality.dto.request.HotelRoomDTO;
import Quality.DesafioQuality.repository.IHotelRoomDAO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Repository
public class HotelRoomDAOImpl implements IHotelRoomDAO {
    private static final String FILE_NAME = "classpath:hotels.json";

    @Override
    public List<HotelRoomDTO> loadFile() {
        List<HotelRoomDTO> list = null;

        try {
            File file = ResourceUtils.getFile(FILE_NAME);

            ObjectMapper objectMapper = new ObjectMapper();
            TypeReference<List<HotelRoomDTO>> typeReference = new TypeReference<>() {
            };

            list = objectMapper.readValue(file, typeReference);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
