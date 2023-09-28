package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Collection")
@Table(name = "collection", schema = "public", indexes = {
        @Index(name = "collection_id_idx", columnList = "collection_id"),
        @Index(name = "collection_submitter", columnList = "submitter"),
        @Index(name = "collection_template", columnList = "template_item_id"),
        @Index(name = "collection_bitstream", columnList = "logo_bitstream_id")
})
public class Collection {
    @Id
    @Column(name = "uuid", nullable = false)
    private UUID id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "uuid", nullable = false)
    private Dspaceobject dspaceobject;

    @Column(name = "collection_id")
    private Integer collectionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "submitter")
    private Epersongroup submitter;

    @Column(name = "template_item_id")
    private UUID templateItemId;

    @Column(name = "logo_bitstream_id")
    private UUID logoBitstreamId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admin")
    private Epersongroup admin;

}