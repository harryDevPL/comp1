package pl.wojcik.tree._1_abstract_class;

import lombok.Data;
import lombok.EqualsAndHashCode;
import pl.wojcik.tree._3_Utils.TreeType;

import java.util.UUID;

// drzewo lisciaste
@Data
@EqualsAndHashCode(callSuper = false)
public class DeciduousTree extends TreeAbstraction {

    private final TreeType treeType;
    private final String name;
    private long high;
    private long width;
    private long trunkDiameter;
    private long branches;
    private long leavesNumber;

    public DeciduousTree() {
        this.treeType = TreeType.DECIDUOUS;
        this.name = treeType + UUID.randomUUID().toString();
        this.trunkDiameter = 5;
        this.high = 100;
        this.width = 20;
    }

    @Override
    public void grow() {
        this.trunkDiameter = trunkDiameter + 5;
        this.high += 15;
        this.width += 15;
        this.branches += 15;
        this.leavesNumber += 15;
    }

    @Override
    public boolean shedLeavesForTheWinter() {
        return true;
    }

    public void dropAllLeavesBeforeWinter() {
        this.leavesNumber = 0;
    }
}
