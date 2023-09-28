package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "OrcidHistory")
@Table(name = "orcid_history", schema = "public", indexes = {
        @Index(name = "orcid_history_owner_id_index", columnList = "owner_id")
})
public class OrcidHistory {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "owner_id", nullable = false)
    private Item owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "entity_id")
    private Item entity;

    @Column(name = "put_code")
    private String putCode;

    @Column(name = "timestamp_last_attempt")
    private Instant timestampLastAttempt;

    @Column(name = "response_message", length = Integer.MAX_VALUE)
    private String responseMessage;

    @Column(name = "status")
    private Integer status;

    @Column(name = "metadata", length = Integer.MAX_VALUE)
    private String metadata;

    @Column(name = "operation")
    private String operation;

    @Column(name = "record_type")
    private String recordType;

    @Column(name = "description")
    private String description;

}