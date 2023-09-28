package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "RelationshipType")
@Table(name = "relationship_type", schema = "public", indexes = {
        @Index(name = "u_relationship_type_constraint", columnList = "left_type, right_type, leftward_type, rightward_type", unique = true),
        @Index(name = "relationship_type_by_left_type_idx", columnList = "left_type"),
        @Index(name = "relationship_type_by_right_type_idx", columnList = "right_type"),
        @Index(name = "relationship_type_by_left_label_idx", columnList = "leftward_type"),
        @Index(name = "relationship_type_by_right_label_idx", columnList = "rightward_type")
})
public class RelationshipType {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "left_type", nullable = false)
    private EntityType leftType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "right_type", nullable = false)
    private EntityType rightType;

    @Column(name = "leftward_type", nullable = false, length = 32)
    private String leftwardType;

    @Column(name = "rightward_type", nullable = false, length = 32)
    private String rightwardType;

    @Column(name = "left_min_cardinality")
    private Integer leftMinCardinality;

    @Column(name = "left_max_cardinality")
    private Integer leftMaxCardinality;

    @Column(name = "right_min_cardinality")
    private Integer rightMinCardinality;

    @Column(name = "right_max_cardinality")
    private Integer rightMaxCardinality;

    @Column(name = "copy_to_left", nullable = false)
    private Boolean copyToLeft = false;

    @Column(name = "copy_to_right", nullable = false)
    private Boolean copyToRight = false;

    @Column(name = "tilted")
    private Integer tilted;

}