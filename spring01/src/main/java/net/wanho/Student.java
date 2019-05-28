package net.wanho;

import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Integer id;
    private String name;
    private Integer age;
    private Score score2;
    private List<Score> scores;
    private Set<Score> scoreSet;
    private Map<Integer, Score> scoreMap;
    private Properties p;


}
