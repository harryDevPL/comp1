package pl.wojcik.tree._2_interface;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<Tree> listOfTrees = new ArrayList<>();

        ConiferTree2 coniferTree = new ConiferTree2();
        coniferTree.grow();
        coniferTree.grow();
        coniferTree.grow();
        listOfTrees.add(coniferTree);

        DeciduousTree2 deciduousTree = new DeciduousTree2();
        deciduousTree.grow();
        listOfTrees.add(deciduousTree);

        // WINTER IS COMING ...
        deciduousTree.dropAllLeavesBeforeWinter();

        for (Tree listOfTree : listOfTrees) {
            listOfTree.waveInTheWind();
        }
    }
}
