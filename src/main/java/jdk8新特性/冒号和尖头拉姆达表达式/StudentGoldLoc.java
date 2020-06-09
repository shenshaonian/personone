package jdk8新特性.冒号和尖头拉姆达表达式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: 范子祺
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentGoldLoc {
    /**
     * 金币
     */
    private Long gold;

//    public StudentGoldLoc(Long gold) {
//        this.gold = gold;
//    }
}
