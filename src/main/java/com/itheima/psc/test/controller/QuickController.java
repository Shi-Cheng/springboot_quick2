package com.itheima.psc.test.controller;

import com.itheima.psc.base.response.ResultMessage;
import com.itheima.psc.test.entity.RegionBeanTree;
import com.itheima.psc.test.entity.TestTree;
import com.itheima.psc.test.service.TreeService;
import com.itheima.psc.utils.TreeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tree")
public class QuickController {

    @Autowired
    private TreeService treeService;

    @RequestMapping(value = "/quick2",method = RequestMethod.GET)
    public String quick(){
        return "springBoot !!!";
    }
    @RequestMapping(value = "/beanTree",method = RequestMethod.GET)
    public ResultMessage beanTree(){
        List<RegionBeanTree> regionTrees = treeService.getRegionTrees();
        if (regionTrees == null){
            return ResultMessage.newFailureResult("fail");
        }
        RegionBeanTree regionBeanTree = regionTrees.get(0);
        ResultMessage resultMessage = ResultMessage.newSuccessResult("success");
        resultMessage.setData(regionBeanTree);
        return resultMessage;
    }
    @RequestMapping(value = "/testTree",method = RequestMethod.GET)
    public ResultMessage testTree(){
        TestTree testTree = new TestTree();
        testTree.setId("1001");
        testTree.setName("潍坊市");
        testTree.setPid("1000");
        TestTree testTree1 = new TestTree();
        testTree1.setId("1002");
        testTree1.setName("青岛市");
        testTree1.setPid("1000");
        TestTree testTree2 = new TestTree();
        testTree2.setId("1001001");
        testTree2.setName("高新区");
        testTree2.setPid("1001");
        TestTree testTree3 = new TestTree();
        testTree3.setId("1002001");
        testTree3.setName("四方区");
        testTree3.setPid("1002");
        TestTree testTree4 = new TestTree();
        testTree4.setId("1000");
        testTree4.setName("山东省");
        testTree4.setPid("0");
        TestTree testTree5 = new TestTree();
        testTree5.setId("1001001001");
        testTree5.setName("清池街办");
        testTree5.setPid("1001001");
        List<TestTree> testTreeList = new ArrayList<>();
        testTreeList.add(testTree);
        testTreeList.add(testTree1);
        testTreeList.add(testTree2);
        testTreeList.add(testTree3);
        testTreeList.add(testTree4);
        testTreeList.add(testTree5);
        TreeUtils.createTree(testTreeList,testTree4,"id","pid","testTrees");
        System.out.println(testTree4); //通过上边的createTree方法，根节点，即testTree4就是最全的最后的树结构。

        ResultMessage resultMessage = ResultMessage.newSuccessResult("success");
        resultMessage.setData(testTree4);
        return resultMessage;

    }
}
