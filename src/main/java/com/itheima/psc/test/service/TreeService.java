/**
 * Copyright Dingxuan. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.itheima.psc.test.service;

import com.itheima.psc.test.entity.RegionBeanTree;
import com.itheima.psc.test.entity.TestTree;
import com.itheima.psc.utils.TreeToolUtils;
import com.itheima.psc.utils.TreeUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述
 *
 * @author panshicheng
 * @date 2019/4/24
 * @company Dingxuan
 */
@Service
public class TreeService {

    public List<RegionBeanTree> getRegionTrees(){
        RegionBeanTree beanTree1 = new RegionBeanTree();
        beanTree1.setCode("540000");
        beanTree1.setLabel("西藏省");
        beanTree1.setPid("100000"); //最高节点
        RegionBeanTree beanTree2 = new RegionBeanTree();
        beanTree2.setCode("540100");
        beanTree2.setLabel("拉萨市");
        beanTree2.setPid("540000");
        RegionBeanTree beanTree3 = new RegionBeanTree();
        beanTree3.setCode("540300");
        beanTree3.setLabel("昌都市");
        beanTree3.setPid("540000");
        RegionBeanTree beanTree4 = new RegionBeanTree();
        beanTree4.setCode("540121");
        beanTree4.setLabel("林周县");
        beanTree4.setPid("540100");
        RegionBeanTree beanTree5 = new RegionBeanTree();
        beanTree5.setCode("540121206");
        beanTree5.setLabel("阿朗乡");
        beanTree5.setPid("540121");
        RegionBeanTree beanTree6 = new RegionBeanTree();
        beanTree6.setCode("440000");
        beanTree6.setLabel("阿朗乡");
        beanTree6.setPid("100000");
        List<RegionBeanTree> rootList = new ArrayList<>();
        rootList.add(beanTree1);
        List<RegionBeanTree> bodyList = new ArrayList<>();
        bodyList.add(beanTree1);
        bodyList.add(beanTree2);
        bodyList.add(beanTree3);
        bodyList.add(beanTree4);
        bodyList.add(beanTree5);
        TreeToolUtils utils =  new TreeToolUtils(rootList,bodyList);
        List<RegionBeanTree> result =  utils.getTree();
        return result;
    }

    public void getTestTree(){
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
    }

}
