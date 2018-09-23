package com.joske.training.utils;

import com.joske.training.Forest;
import com.joske.training.HuffmanLeaf;
import com.joske.training.HuffmanNode;
import com.joske.training.HuffmanTree;
import java.util.Map;
import java.util.Queue;

public class HuffmanTreeBuilder {

  private String stringToBuild;

  public HuffmanTreeBuilder(String stringToBuild) {
    this.stringToBuild = stringToBuild;
  }

  public HuffmanTree buildTree() {
    Map<Character, Integer> charOccurrences =
        StringUtil.countCharOccurences(stringToBuild);
    Forest forest = createForest(charOccurrences);
    processForest(forest);

    return forest.getSmallestTree();
  }

  private  Forest createForest(Map<Character, Integer> charOccurrences) {
    Forest forest = new Forest();

    for (char key : charOccurrences.keySet()) {
      int value = charOccurrences.get(key);
      if (charOccurred(value)) {
        forest.addLeaf(new HuffmanLeaf(value, key));
      }
    }

    return forest;
  }

  private  boolean charOccurred(int occurrencyValue) {
    return occurrencyValue > 0;
  }

  private  void processForest(Forest forest) {
    Queue<HuffmanTree> trees = forest.getTrees();
    while (trees.size() > 1) {
      HuffmanTree firstLeastTree = trees.poll();
      HuffmanTree secondLeastTree = trees.poll();

      trees.offer(new HuffmanNode(firstLeastTree, secondLeastTree));
    }
  }
}
