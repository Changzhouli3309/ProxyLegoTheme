import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Server {
    private int port;
    private String address;
}
