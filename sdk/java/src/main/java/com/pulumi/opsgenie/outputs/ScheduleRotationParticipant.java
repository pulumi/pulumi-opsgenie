// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScheduleRotationParticipant {
    /**
     * @return The id of the responder.
     * 
     */
    private @Nullable String id;
    /**
     * @return The responder type.
     * 
     */
    private String type;

    private ScheduleRotationParticipant() {}
    /**
     * @return The id of the responder.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The responder type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleRotationParticipant defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private String type;
        public Builder() {}
        public Builder(ScheduleRotationParticipant defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ScheduleRotationParticipant build() {
            final var o = new ScheduleRotationParticipant();
            o.id = id;
            o.type = type;
            return o;
        }
    }
}