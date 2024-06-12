package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString

public class StudentDTO {

    String firstName;
    String lastName;
    String email;
    String phone;
    String birthday;
    String subject;
    String hobbies;
    String address;
    String state;
    String city;
    String gender;
    String subjects;




}
