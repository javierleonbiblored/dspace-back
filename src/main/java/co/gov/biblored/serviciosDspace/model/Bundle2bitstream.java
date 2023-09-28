package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Bundle2bitstream")
@Table(name = "bundle2bitstream", schema = "public", indexes = {
        @Index(name = "bundle2bitstream_bundle", columnList = "bundle_id"),
        @Index(name = "bundle2bitstream_bitstream", columnList = "bitstream_id")
})
public class Bundle2bitstream {
    @EmbeddedId
    private Bundle2bitstreamId id;

    @MapsId("bundleId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "bundle_id", nullable = false)
    private Bundle bundle;

    @MapsId("bitstreamId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "bitstream_id", nullable = false)
    private Bitstream bitstream;

    @Column(name = "bitstream_order_legacy")
    private Integer bitstreamOrderLegacy;

}