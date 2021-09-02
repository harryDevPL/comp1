package pl.wojcik.tree._1_abstract_class;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.wojcik.tree._3_Utils.TreeType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        List<TreeAbstraction> listOfTrees = new ArrayList<>();
        int random = ThreadLocalRandom.current().nextInt(1, 100);
        for (int i = 0; i < random; i++) {
            DeciduousTree deciduousTree = new DeciduousTree();
            listOfTrees.add(deciduousTree);
            growFewTimes(deciduousTree);
            ConiferousTree coniferousTree = new ConiferousTree();
            listOfTrees.add(coniferousTree);
            growFewTimes(coniferousTree);
        }

        listOfTrees.sort(Comparator.comparing(TreeAbstraction::getTreeType)
                .thenComparing(TreeAbstraction::getHigh)
                .thenComparing(TreeAbstraction::getTrunkDiameter));
        listOfTrees.forEach(e -> logger.info(e.toString()));

        long coniferousTreeNumber = listOfTrees.stream()
                .filter(tree -> tree.getTreeType().equals(TreeType.CONIFEROUS))
                .count();
        System.out.println(("Coniferous trees number: " + coniferousTreeNumber));

        long deciduousTreeNumber = listOfTrees.stream()
                .filter(tree -> tree.getTreeType().equals(TreeType.DECIDUOUS))
                .count();
        System.out.println(("Deciduous trees number: " + deciduousTreeNumber));
    }

    private static void growFewTimes(TreeAbstraction tree) {
        int random = ThreadLocalRandom.current().nextInt(1, 40);
        for (int i = 0; i < random; i++) {
            tree.grow();
        }
    }
}
