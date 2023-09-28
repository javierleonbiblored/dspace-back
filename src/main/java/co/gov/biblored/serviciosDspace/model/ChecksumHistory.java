package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "ChecksumHistory")
@Table(name = "checksum_history", schema = "public", indexes = {
        @Index(name = "ch_result_fk_idx", columnList = "result"),
        @Index(name = "checksum_history_bitstream", columnList = "bitstream_id")
})
public class ChecksumHistory {
    @Id
    @Column(name = "check_id", nullable = false)
    private Long id;

    @Column(name = "process_start_date")
    private Instant processStartDate;

    @Column(name = "process_end_date")
    private Instant processEndDate;

    @Column(name = "checksum_expected", length = Integer.MAX_VALUE)
    private String checksumExpected;

    @Column(name = "checksum_calculated", length = Integer.MAX_VALUE)
    private String checksumCalculated;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "result")
    private ChecksumResult result;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bitstream_id")
    private Bitstream bitstream;

}