package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Community2collection")
@Table(name = "community2collection", schema = "public", indexes = {
        @Index(name = "community2collection_collection", columnList = "collection_id"),
        @Index(name = "community2collection_community", columnList = "community_id")
})
public class Community2collection {
    @EmbeddedId
    private Community2collectionId id;

    @MapsId("collectionId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "collection_id", nullable = false)
    private Collection collection;

    @MapsId("communityId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "community_id", nullable = false)
    private Community community;

}