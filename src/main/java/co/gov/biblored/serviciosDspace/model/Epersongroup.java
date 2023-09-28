package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Epersongroup")
@Table(name = "epersongroup", schema = "public", indexes = {
        @Index(name = "epersongroup_unique_idx_name", columnList = "name", unique = true),
        @Index(name = "eperson_group_id_idx", columnList = "eperson_group_id")
})
public class Epersongroup {
    @Id
    @Column(name = "uuid", nullable = false)
    private UUID id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "uuid", nullable = false)
    private Dspaceobject dspaceobject;

    @Column(name = "eperson_group_id")
    private Integer epersonGroupId;

    @Column(name = "permanent")
    private Boolean permanent;

    @Column(name = "name", length = 250)
    private String name;

}