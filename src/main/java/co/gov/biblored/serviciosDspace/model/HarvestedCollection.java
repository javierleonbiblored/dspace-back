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
@Entity(name = "HarvestedCollection")
@Table(name = "harvested_collection", schema = "public", indexes = {
        @Index(name = "harvested_collection_collection", columnList = "collection_id")
})
public class HarvestedCollection {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "harvest_type")
    private Integer harvestType;

    @Column(name = "oai_source", length = Integer.MAX_VALUE)
    private String oaiSource;

    @Column(name = "oai_set_id", length = Integer.MAX_VALUE)
    private String oaiSetId;

    @Column(name = "harvest_message", length = Integer.MAX_VALUE)
    private String harvestMessage;

    @Column(name = "metadata_config_id", length = Integer.MAX_VALUE)
    private String metadataConfigId;

    @Column(name = "harvest_status")
    private Integer harvestStatus;

    @Column(name = "harvest_start_time")
    private OffsetDateTime harvestStartTime;

    @Column(name = "last_harvested")
    private OffsetDateTime lastHarvested;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "collection_id")
    private Collection collection;

}