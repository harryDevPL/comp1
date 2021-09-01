package pl.wojcik.tree._2_interface;

import lombok.Data;
import lombok.EqualsAndHashCode;
import pl.wojcik.tree._3_Utils.TreeType;

import java.util.UUID;

@Data
@EqualsAndHashCode
public class ConiferTree2 implements Tree {

    private final TreeType treeType;
    private final String name;
    private long high;
    private long width;
    private long trunkDiameter;
    private long branches;
    private long needleNumber;

    public ConiferTree2() {
        this.treeType = TreeType.CONIFEROUS;
        this.name = treeType + UUID.randomUUID().toString();
        this.trunkDiameter = 2;
        this.high = 60;
        this.width = 10;
        this.branches = 1;
        this.needleNumber = 4;
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

    @Override
    public void waveInTheWind() {
        System.out.println(treeType + " " + this.name + " tree leaves are waving in the wind ... Size of the tree:"
                + "[" + this.getHigh() + "/" + this.getWidth() + "]");
    }
}
