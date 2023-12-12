// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetUserResult {
    /**
     * @return The Full Name of the User.
     * 
     */
    private @Nullable String fullName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
     * 
     */
    private @Nullable String locale;
    /**
     * @return The Role assigned to the User. Either a built-in such as &#39;Owner&#39;, &#39;Admin&#39; or &#39;User&#39; - or the name of a custom role.
     * 
     */
    private @Nullable String role;
    /**
     * @return Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
     * 
     */
    private @Nullable String timezone;
    private String username;

    private GetUserResult() {}
    /**
     * @return The Full Name of the User.
     * 
     */
    public Optional<String> fullName() {
        return Optional.ofNullable(this.fullName);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
     * 
     */
    public Optional<String> locale() {
        return Optional.ofNullable(this.locale);
    }
    /**
     * @return The Role assigned to the User. Either a built-in such as &#39;Owner&#39;, &#39;Admin&#39; or &#39;User&#39; - or the name of a custom role.
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }
    /**
     * @return Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
     * 
     */
    public Optional<String> timezone() {
        return Optional.ofNullable(this.timezone);
    }
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fullName;
        private String id;
        private @Nullable String locale;
        private @Nullable String role;
        private @Nullable String timezone;
        private String username;
        public Builder() {}
        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullName = defaults.fullName;
    	      this.id = defaults.id;
    	      this.locale = defaults.locale;
    	      this.role = defaults.role;
    	      this.timezone = defaults.timezone;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder fullName(@Nullable String fullName) {
            this.fullName = fullName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder locale(@Nullable String locale) {
            this.locale = locale;
            return this;
        }
        @CustomType.Setter
        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }
        @CustomType.Setter
        public Builder timezone(@Nullable String timezone) {
            this.timezone = timezone;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public GetUserResult build() {
            final var _resultValue = new GetUserResult();
            _resultValue.fullName = fullName;
            _resultValue.id = id;
            _resultValue.locale = locale;
            _resultValue.role = role;
            _resultValue.timezone = timezone;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
