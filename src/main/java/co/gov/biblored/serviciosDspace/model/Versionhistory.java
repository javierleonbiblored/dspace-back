package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Versionhistory")
@Table(name = "versionhistory", schema = "public")
public class Versionhistory {
    @Id
    @Column(name = "versionhistory_id", nullable = false)
    private Integer id;

    //TODO [JPA Buddy] generate columns from DB
}