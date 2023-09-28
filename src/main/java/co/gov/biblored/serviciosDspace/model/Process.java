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
@Entity(name = "Process")
@Table(name = "process", schema = "public", indexes = {
        @Index(name = "process_user_id_idx", columnList = "user_id"),
        @Index(name = "process_start_time_idx", columnList = "start_time"),
        @Index(name = "process_name_idx", columnList = "script"),
        @Index(name = "process_status_idx", columnList = "status")
})
public class Process {
    @Id
    @Column(name = "process_id", nullable = false)
    private Integer id;

    @Column(name = "user_id", nullable = false)
    private UUID userId;

    @Column(name = "start_time")
    private Instant startTime;

    @Column(name = "finished_time")
    private Instant finishedTime;

    @Column(name = "creation_time", nullable = false)
    private Instant creationTime;

    @Column(name = "script", nullable = false, length = 256)
    private String script;

    @Column(name = "status", length = 32)
    private String status;

    @Column(name = "parameters", length = 512)
    private String parameters;

}