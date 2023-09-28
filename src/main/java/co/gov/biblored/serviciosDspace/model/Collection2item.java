package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Collection2item")
@Table(name = "collection2item", schema = "public", indexes = {
        @Index(name = "collecion2item_collection", columnList = "collection_id"),
        @Index(name = "collecion2item_item", columnList = "item_id")
})
public class Collection2item {
    @EmbeddedId
    private Collection2itemId id;

    @MapsId("collectionId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "collection_id", nullable = false)
    private Collection collection;

    @MapsId("itemId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;

}