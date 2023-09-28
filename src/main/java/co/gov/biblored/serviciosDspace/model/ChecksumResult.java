package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "ChecksumResult")
@Table(name = "checksum_results", schema = "public")
public class ChecksumResult {
    @Id
    @Column(name = "result_code", nullable = false, length = Integer.MAX_VALUE)
    private String resultCode;

    @Column(name = "result_description", length = Integer.MAX_VALUE)
    private String resultDescription;

}