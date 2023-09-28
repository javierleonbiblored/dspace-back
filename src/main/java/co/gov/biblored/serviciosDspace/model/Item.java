package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Item")
@Table(name = "item", schema = "public", indexes = {
        @Index(name = "item_id_idx", columnList = "item_id"),
        @Index(name = "item_submitter", columnList = "submitter_id"),
        @Index(name = "item_collection", columnList = "owning_collection")
})
public class Item {
    @Id
    @Column(name = "uuid", nullable = false)
    private UUID id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "uuid", nullable = false)
    private Dspaceobject dspaceobject;

    @Column(name = "item_id")
    private Integer itemId;

    @Column(name = "in_archive")
    private Boolean inArchive;

    @Column(name = "withdrawn")
    private Boolean withdrawn;

    @Column(name = "last_modified")
    private OffsetDateTime lastModified;

    @Column(name = "discoverable")
    private Boolean discoverable;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "submitter_id")
    private Eperson submitter;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owning_collection")
    private Collection owningCollection;

}