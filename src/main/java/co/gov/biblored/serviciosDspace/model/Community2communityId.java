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
public class Community2communityId implements Serializable {
    private static final long serialVersionUID = 310545303666995626L;
    @Column(name = "parent_comm_id", nullable = false)
    private UUID parentCommId;

    @Column(name = "child_comm_id", nullable = false)
    private UUID childCommId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Community2communityId entity = (Community2communityId) o;
        return Objects.equals(this.childCommId, entity.childCommId) &&
                Objects.equals(this.parentCommId, entity.parentCommId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(childCommId, parentCommId);
    }

}