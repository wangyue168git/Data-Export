/**
 * Copyright 2020 Webank.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.webank.blockchain.data.export.db.repository;

import cn.hutool.db.DaoTemplate;
import cn.hutool.db.Entity;
import com.webank.blockchain.data.export.common.entity.ExportConstant;
import com.webank.blockchain.data.export.db.entity.DeployedAccountInfo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.sql.SQLException;

/**
 * @author wesleywang
 * @Description:
 * @date 2020/10/26
 */
@Slf4j
@AllArgsConstructor
public class DeployedAccountInfoRepository {

    private DaoTemplate deployedAccountInfoDao;

    public void save(DeployedAccountInfo deployedAccountInfo) {
        try {
            deployedAccountInfoDao.addForGeneratedKey(Entity.parse(deployedAccountInfo,true,true));
        } catch (SQLException e) {
            log.error(" DeployedAccountInfoRepository save failed ", e);
        }

    }
}