package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Eperson")
@Table(name = "eperson", schema = "public", indexes = {
        @Index(name = "eperson_email_key", columnList = "email", unique = true),
        @Index(name = "eperson_netid_key", columnList = "netid", unique = true),
        @Index(name = "eperson_id_idx", columnList = "eperson_id"),
        @Index(name = "eperson_email_idx", columnList = "email")
})
public class Eperson {
    @Id
    @Column(name = "uuid", nullable = false)
    private UUID id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "uuid", nullable = false)
    private Dspaceobject dspaceobject;

    @Column(name = "eperson_id")
    private Integer epersonId;

    @Column(name = "email", length = 64)
    private String email;

    @Column(name = "password", length = 128)
    private String password;

    @Column(name = "can_log_in")
    private Boolean canLogIn;

    @Column(name = "require_certificate")
    private Boolean requireCertificate;

    @Column(name = "self_registered")
    private Boolean selfRegistered;

    @Column(name = "last_active")
    private Instant lastActive;

    @Column(name = "sub_frequency")
    private Integer subFrequency;

    @Column(name = "netid", length = 64)
    private String netid;

    @Column(name = "salt", length = 32)
    private String salt;

    @Column(name = "digest_algorithm", length = 16)
    private String digestAlgorithm;

    @Column(name = "session_salt", length = 32)
    private String sessionSalt;

}