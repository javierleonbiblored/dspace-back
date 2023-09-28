package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Item2bundle")
@Table(name = "item2bundle", schema = "public", indexes = {
        @Index(name = "item2bundle_bundle", columnList = "bundle_id"),
        @Index(name = "item2bundle_item", columnList = "item_id")
})
public class Item2bundle {
    @EmbeddedId
    private Item2bundleId id;

    @MapsId("bundleId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "bundle_id", nullable = false)
    private Bundle bundle;

    @MapsId("itemId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;

}