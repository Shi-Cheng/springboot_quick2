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

package com.itheima.psc.base.response;

/**
 * 类描述
 *
 * @author panshicheng
 * @date 2019/4/24
 * @company Dingxuan
 */
public class ResultMessage {

    private Boolean success;
    private String code;
    private String message;
    private Object data;
    private Integer dataCount;
    private Long totalCount;
    private Integer totalPage;

    public static ResultMessage newSuccessResult(String message) {
        ResultMessage resultMessage = new ResultMessage();
        resultMessage.setCode("1");
        resultMessage.setSuccess(true);
        resultMessage.setMessage(message);
        return resultMessage;
    }

    public static ResultMessage newFailureResult(String message) {
        ResultMessage resultMessage = new ResultMessage();
        resultMessage.setCode("-1");
        resultMessage.setSuccess(false);
        resultMessage.setMessage(message);
        return resultMessage;
    }

    public static ResultMessage newSuccessResult() {
        return newSuccessResult("");
    }

    public static ResultMessage newFailureResult() {
        return newFailureResult("");
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getDataCount() {
        return dataCount;
    }

    public void setDataCount(Integer dataCount) {
        this.dataCount = dataCount;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }


}
