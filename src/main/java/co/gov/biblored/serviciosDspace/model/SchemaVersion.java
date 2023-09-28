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
@Entity(name = "SchemaVersion")
@Table(name = "schema_version", schema = "public", indexes = {
        @Index(name = "schema_version_s_idx", columnList = "success")
})
public class SchemaVersion {
    @Id
    @Column(name = "installed_rank", nullable = false)
    private Integer id;

    @Column(name = "version", length = 50)
    private String version;

    @Column(name = "description", nullable = false, length = 200)
    private String description;

    @Column(name = "type", nullable = false, length = 20)
    private String type;

    @Column(name = "script", nullable = false, length = 1000)
    private String script;

    @Column(name = "checksum")
    private Integer checksum;

    @Column(name = "installed_by", nullable = false, length = 100)
    private String installedBy;

    @Column(name = "installed_on", nullable = false)
    private Instant installedOn;

    @Column(name = "execution_time", nullable = false)
    private Integer executionTime;

    @Column(name = "success", nullable = false)
    private Boolean success = false;

}