package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Doi")
@Table(name = "doi", schema = "public", indexes = {
        @Index(name = "doi_doi_key", columnList = "doi", unique = true),
        @Index(name = "doi_doi_idx", columnList = "doi"),
        @Index(name = "doi_resource_id_and_type_idx", columnList = "resource_type_id, resource_id"),
        @Index(name = "doi_object", columnList = "dspace_object")
})
public class Doi {
    @Id
    @Column(name = "doi_id", nullable = false)
    private Integer id;

    @Column(name = "doi", length = 256)
    private String doi;

    @Column(name = "resource_type_id")
    private Integer resourceTypeId;

    @Column(name = "resource_id")
    private Integer resourceId;

    @Column(name = "status")
    private Integer status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dspace_object")
    private Dspaceobject dspaceObject;

}