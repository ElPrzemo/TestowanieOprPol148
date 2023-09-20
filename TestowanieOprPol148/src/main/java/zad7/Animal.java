package zad7;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Animal {
    private Long id;
    private String type;
    private String name;
}
