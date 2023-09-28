package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "HarvestedItem")
@Table(name = "harvested_item", schema = "public", indexes = {
        @Index(name = "harvested_item_item", columnList = "item_id")
})
public class HarvestedItem {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "last_harvested")
    private OffsetDateTime lastHarvested;

    @Column(name = "oai_id", length = Integer.MAX_VALUE)
    private String oaiId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

}