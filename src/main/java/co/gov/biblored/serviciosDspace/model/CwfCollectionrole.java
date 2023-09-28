package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "CwfCollectionrole")
@Table(name = "cwf_collectionrole", schema = "public")
public class CwfCollectionrole {
    @Id
    @Column(name = "collectionrole_id", nullable = false)
    private Integer id;

    @Column(name = "role_id", length = Integer.MAX_VALUE)
    private String roleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "collection_id")
    private Collection collection;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private Epersongroup group;

}