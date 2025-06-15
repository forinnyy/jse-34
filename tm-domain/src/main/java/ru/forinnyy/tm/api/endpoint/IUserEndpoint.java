package ru.forinnyy.tm.api.endpoint;

import lombok.NonNull;
import ru.forinnyy.tm.dto.request.*;
import ru.forinnyy.tm.dto.response.*;

public interface IUserEndpoint extends IEndpoint {

    @NonNull
    UserLockResponse lockUser(@NonNull UserLockRequest request);

    @NonNull
    UserUnlockResponse unlockUser(@NonNull UserUnlockRequest request);

    @NonNull
    UserRemoveResponse removeUser(@NonNull UserRemoveRequest request);

    @NonNull
    UserRegistryResponse registryUser(@NonNull UserRegistryRequest request);

    @NonNull
    UserChangePasswordResponse changeUserPassword(@NonNull UserChangePasswordRequest request);

    @NonNull
    UserUpdateProfileResponse updateUserProfile(@NonNull UserUpdateProfileRequest request);

}
