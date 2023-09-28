package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Systemwidealert")
@Table(name = "systemwidealert", schema = "public")
public class Systemwidealert {
    @Id
    @Column(name = "alert_id", nullable = false)
    private Integer id;

    @Column(name = "message", length = 512)
    private String message;

    @Column(name = "allow_sessions", length = 64)
    private String allowSessions;

    @Column(name = "countdown_to")
    private Instant countdownTo;

    @Column(name = "active")
    private Boolean active;

}