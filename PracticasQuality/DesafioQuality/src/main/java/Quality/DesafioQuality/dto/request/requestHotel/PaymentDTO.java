package Quality.DesafioQuality.dto.request.requestHotel;

public class PaymentDTO {
    private String type;
    private Integer number;
    private Integer dues;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getDues() {
        return dues;
    }

    public void setDues(Integer dues) {
        this.dues = dues;
    }
}
