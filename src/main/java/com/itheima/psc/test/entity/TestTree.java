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

package com.itheima.psc.test.entity;

import java.util.List;

/**
 * 类描述
 *
 * @author panshicheng
 * @date 2019/4/24
 * @company Dingxuan
 */
public class TestTree {
    private String id;
    private String name;
    private String pid;
    private List<TestTree> testTrees;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public List<TestTree> getTestTrees() {
        return testTrees;
    }

    public void setTestTrees(List<TestTree> testTrees) {
        this.testTrees = testTrees;
    }
}
