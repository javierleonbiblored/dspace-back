package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Embeddable
public class Community2collectionId implements Serializable {
    private static final long serialVersionUID = 5933010077456723357L;
    @Column(name = "collection_id", nullable = false)
    private UUID collectionId;

    @Column(name = "community_id", nullable = false)
    private UUID communityId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Community2collectionId entity = (Community2collectionId) o;
        return Objects.equals(this.communityId, entity.communityId) &&
                Objects.equals(this.collectionId, entity.collectionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(communityId, collectionId);
    }

}