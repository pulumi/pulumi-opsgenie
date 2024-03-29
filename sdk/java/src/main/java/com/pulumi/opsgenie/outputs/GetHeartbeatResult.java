// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHeartbeatResult {
    /**
     * @return Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is &#34;HeartbeatName is expired&#34;.
     * 
     */
    private @Nullable String alertMessage;
    /**
     * @return Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
     * 
     */
    private @Nullable String alertPriority;
    /**
     * @return Specifies the alert tags for heartbeat expiration alert.
     * 
     */
    private @Nullable List<String> alertTags;
    /**
     * @return An optional description of the heartbeat
     * 
     */
    private @Nullable String description;
    /**
     * @return Enable/disable heartbeat monitoring.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Specifies how often a heartbeat message should be expected.
     * 
     */
    private @Nullable Integer interval;
    /**
     * @return Interval specified as minutes, hours or days.
     * 
     */
    private @Nullable String intervalUnit;
    private String name;
    /**
     * @return Owner team of the heartbeat.
     * 
     */
    private @Nullable String ownerTeamId;

    private GetHeartbeatResult() {}
    /**
     * @return Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is &#34;HeartbeatName is expired&#34;.
     * 
     */
    public Optional<String> alertMessage() {
        return Optional.ofNullable(this.alertMessage);
    }
    /**
     * @return Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
     * 
     */
    public Optional<String> alertPriority() {
        return Optional.ofNullable(this.alertPriority);
    }
    /**
     * @return Specifies the alert tags for heartbeat expiration alert.
     * 
     */
    public List<String> alertTags() {
        return this.alertTags == null ? List.of() : this.alertTags;
    }
    /**
     * @return An optional description of the heartbeat
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Enable/disable heartbeat monitoring.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Specifies how often a heartbeat message should be expected.
     * 
     */
    public Optional<Integer> interval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * @return Interval specified as minutes, hours or days.
     * 
     */
    public Optional<String> intervalUnit() {
        return Optional.ofNullable(this.intervalUnit);
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Owner team of the heartbeat.
     * 
     */
    public Optional<String> ownerTeamId() {
        return Optional.ofNullable(this.ownerTeamId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHeartbeatResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String alertMessage;
        private @Nullable String alertPriority;
        private @Nullable List<String> alertTags;
        private @Nullable String description;
        private @Nullable Boolean enabled;
        private String id;
        private @Nullable Integer interval;
        private @Nullable String intervalUnit;
        private String name;
        private @Nullable String ownerTeamId;
        public Builder() {}
        public Builder(GetHeartbeatResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertMessage = defaults.alertMessage;
    	      this.alertPriority = defaults.alertPriority;
    	      this.alertTags = defaults.alertTags;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.interval = defaults.interval;
    	      this.intervalUnit = defaults.intervalUnit;
    	      this.name = defaults.name;
    	      this.ownerTeamId = defaults.ownerTeamId;
        }

        @CustomType.Setter
        public Builder alertMessage(@Nullable String alertMessage) {

            this.alertMessage = alertMessage;
            return this;
        }
        @CustomType.Setter
        public Builder alertPriority(@Nullable String alertPriority) {

            this.alertPriority = alertPriority;
            return this;
        }
        @CustomType.Setter
        public Builder alertTags(@Nullable List<String> alertTags) {

            this.alertTags = alertTags;
            return this;
        }
        public Builder alertTags(String... alertTags) {
            return alertTags(List.of(alertTags));
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetHeartbeatResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder interval(@Nullable Integer interval) {

            this.interval = interval;
            return this;
        }
        @CustomType.Setter
        public Builder intervalUnit(@Nullable String intervalUnit) {

            this.intervalUnit = intervalUnit;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetHeartbeatResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder ownerTeamId(@Nullable String ownerTeamId) {

            this.ownerTeamId = ownerTeamId;
            return this;
        }
        public GetHeartbeatResult build() {
            final var _resultValue = new GetHeartbeatResult();
            _resultValue.alertMessage = alertMessage;
            _resultValue.alertPriority = alertPriority;
            _resultValue.alertTags = alertTags;
            _resultValue.description = description;
            _resultValue.enabled = enabled;
            _resultValue.id = id;
            _resultValue.interval = interval;
            _resultValue.intervalUnit = intervalUnit;
            _resultValue.name = name;
            _resultValue.ownerTeamId = ownerTeamId;
            return _resultValue;
        }
    }
}
