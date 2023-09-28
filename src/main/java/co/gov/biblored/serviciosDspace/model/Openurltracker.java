package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Openurltracker")
@Table(name = "openurltracker", schema = "public")
public class Openurltracker {
    @Id
    @Column(name = "tracker_id", nullable = false)
    private Integer id;

    @Column(name = "tracker_url", length = 1000)
    private String trackerUrl;

    @Column(name = "uploaddate")
    private LocalDate uploaddate;

}