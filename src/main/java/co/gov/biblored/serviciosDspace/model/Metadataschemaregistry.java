package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Metadataschemaregistry")
@Table(name = "metadataschemaregistry", schema = "public", indexes = {
        @Index(name = "metadataschemaregistry_namespace_key", columnList = "namespace", unique = true),
        @Index(name = "metadataschemaregistry_unique_idx_short_id", columnList = "short_id", unique = true)
})
public class Metadataschemaregistry {
    @Id
    @Column(name = "metadata_schema_id", nullable = false)
    private Integer id;

    @Column(name = "namespace", length = 256)
    private String namespace;

    @Column(name = "short_id", length = 32)
    private String shortId;

}