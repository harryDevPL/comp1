package pl.wojcik.tree._1_abstract_class;

import lombok.Data;
import lombok.EqualsAndHashCode;
import pl.wojcik.tree._3_Utils.TreeType;

@Data
@EqualsAndHashCode
public abstract class TreeAbstraction {

    private TreeType treeType;
    private long high;
    private long width;
    private long trunkDiameter;
    private long branches;

    abstract void grow();
    abstract boolean shedLeavesForTheWinter();

    void waveInTheWind(TreeType treeType) {
        System.out.println(treeType.toString().toUpperCase() + ": leaves waves in the wind ...");
    }
}

