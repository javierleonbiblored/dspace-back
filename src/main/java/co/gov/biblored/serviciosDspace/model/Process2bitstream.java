package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Process2bitstream")
@Table(name = "process2bitstream", schema = "public")
public class Process2bitstream {
    @EmbeddedId
    private Process2bitstreamId id;

    @MapsId("processId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "process_id", nullable = false)
    private Process process;

    @MapsId("bitstreamId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "bitstream_id", nullable = false)
    private Bitstream bitstream;

}