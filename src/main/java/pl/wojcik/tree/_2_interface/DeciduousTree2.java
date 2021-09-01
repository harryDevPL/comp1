package pl.wojcik.tree._2_interface;

import lombok.Data;
import lombok.EqualsAndHashCode;
import pl.wojcik.tree._3_Utils.TreeType;

import java.util.UUID;

@Data
@EqualsAndHashCode
public class DeciduousTree2 implements Tree {

    private final TreeType treeType;
    private final String name;
    private long high;
    private long width;
    private long trunkDiameter;
    private long branches;
    private long leavesNumber;

    public DeciduousTree2() {
        this.treeType = TreeType.DECIDUOUS;
        this.name = treeType + UUID.randomUUID().toString();
        this.trunkDiameter = 1;
        this.high = 30;
        this.width = 8;
        this.branches = 3;
        this.leavesNumber = 12;
    }

    @Override
    public void grow() {
        this.trunkDiameter += 6;
        this.high += 14;
        this.width += 14;
        this.branches += 4;
        this.leavesNumber += 160;
    }

    @Override
    public boolean shedLeavesForTheWinter() {
        return true;
    }

    @Override
    public void waveInTheWind() {
        System.out.println(treeType + " " + this.name + " tree leaves are waving in the wind ... Size of the tree:"
                + "[" + this.getHigh() + "/" + this.getWidth() + "]");
    }

    public void dropAllLeavesBeforeWinter() {
        this.leavesNumber = 0;
    }
}
