package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Fileextension")
@Table(name = "fileextension", schema = "public", indexes = {
        @Index(name = "fe_bitstream_fk_idx", columnList = "bitstream_format_id")
})
public class Fileextension {
    @Id
    @Column(name = "file_extension_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bitstream_format_id")
    private Bitstreamformatregistry bitstreamFormat;

    @Column(name = "extension", length = 16)
    private String extension;

}