package org.example.test.container;

import org.testcontainers.containers.MSSQLServerContainer;

public class TestMSSQLServerContainer extends MSSQLServerContainer<TestMSSQLServerContainer> {

    private static TestMSSQLServerContainer container;

    private TestMSSQLServerContainer() {
        super("mcr.microsoft.com/mssql/server:2017-CU12");
    }

    public static TestMSSQLServerContainer getInstance() {
        if (container == null) {
            container = new TestMSSQLServerContainer().acceptLicense();
            container.start();
        }
        return container;
    }

    @Override
    public void start() {
        super.start();
        System.setProperty("DB_URL", container.getJdbcUrl());
        System.setProperty("DB_USERNAME", container.getUsername());
        System.setProperty("DB_PASSWORD", container.getPassword());
    }

    @Override
    public void stop() {
        //do nothing, JVM handles shut down
    }
}
