package com.baibin.leetcode.bfs.binary_tree_level_order_traversal_ii;

import com.baibin.leetcode.tree.serialize_and_deserialize_binary_tree.Codec;
import org.junit.jupiter.api.Test;

public class SolutionTests {

    @Test
    public void testCase1() {
        Codec codec = new Codec();
        var root = codec.deserialize("3,9,X,X,20,15,X,X,7,X,X");
        Solution s = new Solution();
        var actual = s.levelOrderBottom(root);
        System.out.println(actual);
    }
}
