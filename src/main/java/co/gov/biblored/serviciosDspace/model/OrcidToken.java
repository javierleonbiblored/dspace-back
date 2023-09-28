package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "OrcidToken")
@Table(name = "orcid_token", schema = "public", indexes = {
        @Index(name = "orcid_token_eperson_id_key", columnList = "eperson_id", unique = true)
})
public class OrcidToken {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "eperson_id", nullable = false)
    private Eperson eperson;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_item_id")
    private Item profileItem;

    @Column(name = "access_token", nullable = false, length = 100)
    private String accessToken;

}