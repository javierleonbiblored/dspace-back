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
@Entity(name = "Bitstream")
@Table(name = "bitstream", schema = "public", indexes = {
        @Index(name = "bitstream_id_idx", columnList = "bitstream_id"),
        @Index(name = "bit_bitstream_fk_idx", columnList = "bitstream_format_id")
})
public class Bitstream {
    @Id
    @Column(name = "uuid", nullable = false)
    private UUID id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "uuid", nullable = false)
    private Dspaceobject dspaceobject;

    @Column(name = "bitstream_id")
    private Integer bitstreamId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bitstream_format_id")
    private Bitstreamformatregistry bitstreamFormat;

    @Column(name = "checksum", length = 64)
    private String checksum;

    @Column(name = "checksum_algorithm", length = 32)
    private String checksumAlgorithm;

    @Column(name = "internal_id", length = 256)
    private String internalId;

    @Column(name = "deleted")
    private Boolean deleted;

    @Column(name = "store_number")
    private Integer storeNumber;

    @Column(name = "sequence_id")
    private Integer sequenceId;

    @Column(name = "size_bytes")
    private Long sizeBytes;

}