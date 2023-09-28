package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Registrationdatum")
@Table(name = "registrationdata", schema = "public", indexes = {
        @Index(name = "registrationdata_email_key", columnList = "email", unique = true)
})
public class Registrationdatum {
    @Id
    @Column(name = "registrationdata_id", nullable = false)
    private Integer id;

    @Column(name = "email", length = 64)
    private String email;

    @Column(name = "token", length = 48)
    private String token;

    @Column(name = "expires")
    private Instant expires;

}