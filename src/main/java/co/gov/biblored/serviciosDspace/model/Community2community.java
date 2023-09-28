package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Community2community")
@Table(name = "community2community", schema = "public", indexes = {
        @Index(name = "community2community_parent", columnList = "parent_comm_id"),
        @Index(name = "community2community_child", columnList = "child_comm_id")
})
public class Community2community {
    @EmbeddedId
    private Community2communityId id;

    @MapsId("parentCommId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "parent_comm_id", nullable = false)
    private Community parentComm;

    @MapsId("childCommId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "child_comm_id", nullable = false)
    private Community childComm;

}