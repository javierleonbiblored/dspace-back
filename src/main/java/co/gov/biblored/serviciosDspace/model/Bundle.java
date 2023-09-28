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
@Entity(name = "Bundle")
@Table(name = "bundle", schema = "public", indexes = {
        @Index(name = "bundle_id_idx", columnList = "bundle_id"),
        @Index(name = "bundle_primary", columnList = "primary_bitstream_id")
})
public class Bundle {
    @Id
    @Column(name = "uuid", nullable = false)
    private UUID id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "uuid", nullable = false)
    private Dspaceobject dspaceobject;

    @Column(name = "bundle_id")
    private Integer bundleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "primary_bitstream_id")
    private Bitstream primaryBitstream;

}