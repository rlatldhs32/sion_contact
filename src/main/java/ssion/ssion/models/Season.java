package ssion.ssion.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Table(name = "season")
public class Season {
    private Integer seasonId;
    private String seasonName;
    private String seasonStart;
    private String seasonEnd;
    private Double isCurrent;
}