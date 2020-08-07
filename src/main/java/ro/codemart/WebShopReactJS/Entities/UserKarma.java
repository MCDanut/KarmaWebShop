package ro.codemart.WebShopReactJS.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserKarma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    String fullName;
    String email;
    String password;
    String phoneNumber;
    UserRole role;

}
