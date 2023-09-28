package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Relationship")
@Table(name = "relationship", schema = "public", indexes = {
        @Index(name = "u_constraint", columnList = "left_id, type_id, right_id", unique = true),
        @Index(name = "relationship_by_left_id_idx", columnList = "left_id"),
        @Index(name = "relationship_by_right_id_idx", columnList = "right_id")
})
public class Relationship {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "left_id", nullable = false)
    private Item left;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "type_id", nullable = false)
    private RelationshipType type;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "right_id", nullable = false)
    private Item right;

    @Column(name = "left_place")
    private Integer leftPlace;

    @Column(name = "right_place")
    private Integer rightPlace;

    @Column(name = "leftward_value", length = Integer.MAX_VALUE)
    private String leftwardValue;

    @Column(name = "rightward_value", length = Integer.MAX_VALUE)
    private String rightwardValue;

    @Column(name = "latest_version_status", nullable = false)
    private Integer latestVersionStatus;

}