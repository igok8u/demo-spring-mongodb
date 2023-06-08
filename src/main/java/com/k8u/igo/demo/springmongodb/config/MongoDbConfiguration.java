package com.k8u.igo.demo.springmongodb.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration
public class MongoDbConfiguration extends AbstractMongoClientConfiguration {
    public final static String DB_NAME = "mongodb_demo_db";
    private static final String MONGODB_CONNECTION_STRING = "mongodb://localhost:27017";

    @Override
    protected String getDatabaseName() {
        return DB_NAME;
    }

    @Override
    public MongoClient mongoClient() {
        return MongoClients.create(MONGODB_CONNECTION_STRING);
    }
}
