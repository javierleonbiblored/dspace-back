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
public class Process2groupId implements Serializable {
    private static final long serialVersionUID = -7379735395062633034L;
    @Column(name = "process_id", nullable = false)
    private Integer processId;

    @Column(name = "group_id", nullable = false)
    private UUID groupId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Process2groupId entity = (Process2groupId) o;
        return Objects.equals(this.processId, entity.processId) &&
                Objects.equals(this.groupId, entity.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processId, groupId);
    }

}