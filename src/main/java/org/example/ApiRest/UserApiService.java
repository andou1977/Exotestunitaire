package org.example.ApiRest;

public class UserApiService {
    private ApiClient apiClient;

    public UserApiService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public String fetchUser(String userId) {
        return apiClient.getUserData(userId);
    }
}
