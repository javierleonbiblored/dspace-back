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
@Entity(name = "Community")
@Table(name = "community", schema = "public", indexes = {
        @Index(name = "community_id_idx", columnList = "community_id"),
        @Index(name = "community_admin", columnList = "admin"),
        @Index(name = "community_bitstream", columnList = "logo_bitstream_id")
})
public class Community {
    @Id
    @Column(name = "uuid", nullable = false)
    private UUID id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "uuid", nullable = false)
    private Dspaceobject dspaceobject;

    @Column(name = "community_id")
    private Integer communityId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admin")
    private Epersongroup admin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "logo_bitstream_id")
    private Bitstream logoBitstream;

}