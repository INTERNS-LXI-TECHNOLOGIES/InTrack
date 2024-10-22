/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Reward;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RewardControllerApi
 */
@Disabled
public class RewardControllerApiTest {

    private final RewardControllerApi api = new RewardControllerApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRewardsTest() throws ApiException {
        Reward reward = null;
        api.createRewards(reward);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRewardsTest() throws ApiException {
        Long id = null;
        api.deleteRewards(id);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRewardbyNamesTest() throws ApiException {
        String name = null;
        Reward response = api.getRewardbyNames(name);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRewardsTest() throws ApiException {
        List<Reward> response = api.getRewards();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRewardsTest() throws ApiException {
        Long id = null;
        Reward reward = null;
        api.updateRewards(id, reward);
        // TODO: test validations
    }

}
