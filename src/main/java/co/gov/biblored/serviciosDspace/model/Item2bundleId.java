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
public class Item2bundleId implements Serializable {
    private static final long serialVersionUID = 3232659359338510437L;
    @Column(name = "bundle_id", nullable = false)
    private UUID bundleId;

    @Column(name = "item_id", nullable = false)
    private UUID itemId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Item2bundleId entity = (Item2bundleId) o;
        return Objects.equals(this.itemId, entity.itemId) &&
                Objects.equals(this.bundleId, entity.bundleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, bundleId);
    }

}