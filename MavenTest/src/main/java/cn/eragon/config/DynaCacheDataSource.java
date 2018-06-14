package cn.eragon.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态加载数据源
 */
public class DynaCacheDataSource extends AbstractRoutingDataSource {
    protected Object determineCurrentLookupKey() {
        return null;
    }
}
