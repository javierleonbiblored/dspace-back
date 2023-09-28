package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Epersongroup2eperson")
@Table(name = "epersongroup2eperson", schema = "public", indexes = {
        @Index(name = "epersongroup2eperson_group", columnList = "eperson_group_id"),
        @Index(name = "epersongroup2eperson_person", columnList = "eperson_id")
})
public class Epersongroup2eperson {
    @EmbeddedId
    private Epersongroup2epersonId id;

    @MapsId("epersonGroupId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "eperson_group_id", nullable = false)
    private Epersongroup epersonGroup;

    @MapsId("epersonId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "eperson_id", nullable = false)
    private Eperson eperson;

}