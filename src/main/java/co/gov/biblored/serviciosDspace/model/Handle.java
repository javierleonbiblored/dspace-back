package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Handle")
@Table(name = "handle", schema = "public", indexes = {
        @Index(name = "handle_handle_key", columnList = "handle", unique = true),
        @Index(name = "handle_handle_idx", columnList = "handle"),
        @Index(name = "handle_resource_id_and_type_idx", columnList = "resource_type_id, resource_legacy_id"),
        @Index(name = "handle_object", columnList = "resource_id")
})
public class Handle {
    @Id
    @Column(name = "handle_id", nullable = false)
    private Integer id;

    @Column(name = "handle", length = 256)
    private String handle;

    @Column(name = "resource_type_id")
    private Integer resourceTypeId;

    @Column(name = "resource_legacy_id")
    private Integer resourceLegacyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resource_id")
    private Dspaceobject resource;

}