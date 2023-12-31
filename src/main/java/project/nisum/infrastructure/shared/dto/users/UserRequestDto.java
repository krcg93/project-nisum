package project.nisum.infrastructure.shared.dto.users;

import java.io.Serializable;
import java.util.List;

public class UserRequestDto implements Serializable {

    private String name;
    private String email;
    private String password;
    private List<PhonesInformationDto> phones;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<PhonesInformationDto> getPhones() {
        return phones;
    }

    public void setPhones(List<PhonesInformationDto> phones) {
        this.phones = phones;
    }
}
