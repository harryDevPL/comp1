package pl.wojcik.tree._1_abstract_class;

import lombok.Data;
import lombok.EqualsAndHashCode;
import pl.wojcik.tree._3_Utils.TreeType;

import java.util.UUID;

// drzewo iglaste
@Data
@EqualsAndHashCode(callSuper = false)
public class ConiferousTree extends TreeAbstraction {

    private final TreeType treeType;
    private final String name;
    private long high;
    private long width;
    private long trunkDiameter;
    private long branches;
    private long needleNumber;

    public ConiferousTree() {
        this.treeType = TreeType.CONIFEROUS;
        this.name = treeType + UUID.randomUUID().toString();
        this.trunkDiameter = 4;
        this.high = 120;
        this.width = 15;
        this.branches = 2;
        this.needleNumber = 5;
    }

    @Override
    public void grow() {
        this.trunkDiameter += 5;
        this.high += 20;
        this.width += 10;
        this.branches += 5;
        this.needleNumber += 50;
    }

    @Override
    public boolean shedLeavesForTheWinter() {
        return false;
    }
}