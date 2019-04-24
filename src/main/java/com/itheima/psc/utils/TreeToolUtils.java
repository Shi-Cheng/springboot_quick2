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

package com.itheima.psc.utils;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.itheima.psc.test.entity.RegionBeanTree;

import java.util.List;
import java.util.Map;

/**
 * 类描述
 *
 * @author panshicheng
 * @date 2019/4/24
 * @company Dingxuan
 */
public class TreeToolUtils {

    private List<RegionBeanTree> rootList; //根节点对象存放到这里

    private List<RegionBeanTree> bodyList; //其他节点存放到这里，可以包含根节点

    public TreeToolUtils(List<RegionBeanTree> rootList, List<RegionBeanTree> bodyList) {
        this.rootList = rootList;
        this.bodyList = bodyList;
    }

    public List<RegionBeanTree> getTree(){   //调用的方法入口
        if(bodyList != null && !bodyList.isEmpty()){
            //声明一个map，用来过滤已操作过的数据
            Map<String,String> map = Maps.newHashMapWithExpectedSize(bodyList.size());
            rootList.forEach(beanTree -> getChild(beanTree,map));
            return rootList;
        }
        return null;
    }

    public void getChild(RegionBeanTree beanTree,Map<String,String> map){
        List<RegionBeanTree> childList = Lists.newArrayList();
        bodyList.stream()
                .filter(c -> !map.containsKey(c.getCode()))
                .filter(c ->c.getPid().equals(beanTree.getCode()))
                .forEach(c ->{
                    map.put(c.getCode(),c.getPid());
                    getChild(c,map);
                    childList.add(c);
                });
        beanTree.setChildren(childList);
    }

}
