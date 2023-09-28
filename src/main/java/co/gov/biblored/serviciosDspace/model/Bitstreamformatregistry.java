package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Bitstreamformatregistry")
@Table(name = "bitstreamformatregistry", schema = "public", indexes = {
        @Index(name = "bitstreamformatregistry_short_description_key", columnList = "short_description", unique = true)
})
public class Bitstreamformatregistry {
    @Id
    @Column(name = "bitstream_format_id", nullable = false)
    private Integer id;

    @Column(name = "mimetype", length = 256)
    private String mimetype;

    @Column(name = "short_description", length = 128)
    private String shortDescription;

    @Column(name = "description", length = Integer.MAX_VALUE)
    private String description;

    @Column(name = "support_level")
    private Integer supportLevel;

    @Column(name = "internal")
    private Boolean internal;

}