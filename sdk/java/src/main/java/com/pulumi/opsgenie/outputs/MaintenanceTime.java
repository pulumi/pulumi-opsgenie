// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MaintenanceTime {
    /**
     * @return This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00).
     * 
     */
    private @Nullable String endDate;
    /**
     * @return This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00).
     * 
     */
    private @Nullable String startDate;
    /**
     * @return The type of the entity that maintenance will be applied. It can be either integration or policy.
     * 
     */
    private String type;

    private MaintenanceTime() {}
    /**
     * @return This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00).
     * 
     */
    public Optional<String> endDate() {
        return Optional.ofNullable(this.endDate);
    }
    /**
     * @return This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00).
     * 
     */
    public Optional<String> startDate() {
        return Optional.ofNullable(this.startDate);
    }
    /**
     * @return The type of the entity that maintenance will be applied. It can be either integration or policy.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceTime defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String endDate;
        private @Nullable String startDate;
        private String type;
        public Builder() {}
        public Builder(MaintenanceTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.startDate = defaults.startDate;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder endDate(@Nullable String endDate) {
            this.endDate = endDate;
            return this;
        }
        @CustomType.Setter
        public Builder startDate(@Nullable String startDate) {
            this.startDate = startDate;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public MaintenanceTime build() {
            final var _resultValue = new MaintenanceTime();
            _resultValue.endDate = endDate;
            _resultValue.startDate = startDate;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
