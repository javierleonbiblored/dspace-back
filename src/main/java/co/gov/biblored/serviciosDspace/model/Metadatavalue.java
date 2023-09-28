package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Metadatavalue")
@Table(name = "metadatavalue", schema = "public", indexes = {
        @Index(name = "metadatavalue_field_object", columnList = "metadata_field_id, dspace_object_id"),
        @Index(name = "metadatavalue_field_fk_idx", columnList = "metadata_field_id"),
        @Index(name = "metadatavalue_object", columnList = "dspace_object_id")
})
public class Metadatavalue implements Serializable {
    @Id
    @Column(name = "metadata_value_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "metadata_field_id")
    private Metadatafieldregistry metadataField;

    @Column(name = "text_value", length = Integer.MAX_VALUE)
    private String textValue;

    @Column(name = "text_lang", length = 24)
    private String textLang;

    @Column(name = "place")
    private Integer place;

    @Column(name = "authority", length = 100)
    private String authority;

    @Column(name = "confidence")
    private Integer confidence;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "dspace_object_id")
    private Dspaceobject dspaceObject;

}