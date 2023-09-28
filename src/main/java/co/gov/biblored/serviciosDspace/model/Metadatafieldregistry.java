package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Metadatafieldregistry")
@Table(name = "metadatafieldregistry", schema = "public", indexes = {
        @Index(name = "metadatafield_schema_idx", columnList = "metadata_schema_id"),
        @Index(name = "metadatafieldregistry_idx_element_qualifier", columnList = "element, qualifier")
})
public class Metadatafieldregistry {
    @Id
    @Column(name = "metadata_field_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "metadata_schema_id", nullable = false)
    private Metadataschemaregistry metadataSchema;

    @Column(name = "element", length = 64)
    private String element;

    @Column(name = "qualifier", length = 64)
    private String qualifier;

    @Column(name = "scope_note", length = Integer.MAX_VALUE)
    private String scopeNote;

}