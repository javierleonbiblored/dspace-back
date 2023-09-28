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
public class Epersongroup2epersonId implements Serializable {
    private static final long serialVersionUID = -8011811236373058530L;
    @Column(name = "eperson_group_id", nullable = false)
    private UUID epersonGroupId;

    @Column(name = "eperson_id", nullable = false)
    private UUID epersonId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Epersongroup2epersonId entity = (Epersongroup2epersonId) o;
        return Objects.equals(this.epersonGroupId, entity.epersonGroupId) &&
                Objects.equals(this.epersonId, entity.epersonId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(epersonGroupId, epersonId);
    }

}