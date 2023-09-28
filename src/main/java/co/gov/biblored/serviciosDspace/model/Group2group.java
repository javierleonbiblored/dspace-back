package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Group2group")
@Table(name = "group2group", schema = "public", indexes = {
        @Index(name = "group2group_parent", columnList = "parent_id"),
        @Index(name = "group2group_child", columnList = "child_id")
})
public class Group2group {
    @EmbeddedId
    private Group2groupId id;

    @MapsId("parentId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "parent_id", nullable = false)
    private Epersongroup parent;

    @MapsId("childId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "child_id", nullable = false)
    private Epersongroup child;

}