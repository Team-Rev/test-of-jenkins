package ci.cd.jenkins.model.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Jenkins {
    private String name;
    private String id;
    private String pw;
}
