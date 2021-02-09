/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolTableColumns;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.synapse.v2020_12_01.TableSchemaSqlPoolWorkspaceSqlPoolColumn;

class SqlPoolTableColumnsImpl extends WrapperImpl<SqlPoolTableColumnsInner> implements SqlPoolTableColumns {
    private final SynapseManager manager;

    SqlPoolTableColumnsImpl(SynapseManager manager) {
        super(manager.inner().sqlPoolTableColumns());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    private TableSchemaSqlPoolWorkspaceSqlPoolColumnImpl wrapModel(SqlPoolColumnInner inner) {
        return  new TableSchemaSqlPoolWorkspaceSqlPoolColumnImpl(inner, manager());
    }

    @Override
    public Observable<TableSchemaSqlPoolWorkspaceSqlPoolColumn> listByTableNameAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName, final String tableName) {
        SqlPoolTableColumnsInner client = this.inner();
        return client.listByTableNameAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName)
        .flatMapIterable(new Func1<Page<SqlPoolColumnInner>, Iterable<SqlPoolColumnInner>>() {
            @Override
            public Iterable<SqlPoolColumnInner> call(Page<SqlPoolColumnInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SqlPoolColumnInner, TableSchemaSqlPoolWorkspaceSqlPoolColumn>() {
            @Override
            public TableSchemaSqlPoolWorkspaceSqlPoolColumn call(SqlPoolColumnInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
