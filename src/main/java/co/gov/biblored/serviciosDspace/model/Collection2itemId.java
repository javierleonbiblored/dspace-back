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
public class Collection2itemId implements Serializable {
    private static final long serialVersionUID = 1759546943448708298L;
    @Column(name = "collection_id", nullable = false)
    private UUID collectionId;

    @Column(name = "item_id", nullable = false)
    private UUID itemId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Collection2itemId entity = (Collection2itemId) o;
        return Objects.equals(this.itemId, entity.itemId) &&
                Objects.equals(this.collectionId, entity.collectionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, collectionId);
    }

}