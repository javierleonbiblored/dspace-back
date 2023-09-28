package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "OrcidQueue")
@Table(name = "orcid_queue", schema = "public", indexes = {
        @Index(name = "orcid_queue_owner_id_index", columnList = "owner_id")
})
public class OrcidQueue {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "owner_id", nullable = false)
    private Item owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "entity_id")
    private Item entity;

    @Column(name = "attempts")
    private Integer attempts;

    @Column(name = "put_code")
    private String putCode;

    @Column(name = "record_type")
    private String recordType;

    @Column(name = "description")
    private String description;

    @Column(name = "operation")
    private String operation;

    @Column(name = "metadata", length = Integer.MAX_VALUE)
    private String metadata;

}