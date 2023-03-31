// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSchedulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchedulePlainArgs Empty = new GetSchedulePlainArgs();

    /**
     * Timezone of schedule. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones - Default: `America/New_York`.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Timezone of schedule. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones - Default: `America/New_York`.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Enable/disable state of schedule
     * 
     */
    @Import(name="enabled")
    private @Nullable Boolean enabled;

    /**
     * @return Enable/disable state of schedule
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Name of the schedule.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the schedule.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Owner team id of the schedule.
     * 
     */
    @Import(name="ownerTeamId")
    private @Nullable String ownerTeamId;

    /**
     * @return Owner team id of the schedule.
     * 
     */
    public Optional<String> ownerTeamId() {
        return Optional.ofNullable(this.ownerTeamId);
    }

    /**
     * The description of schedule.
     * 
     */
    @Import(name="timezone")
    private @Nullable String timezone;

    /**
     * @return The description of schedule.
     * 
     */
    public Optional<String> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    private GetSchedulePlainArgs() {}

    private GetSchedulePlainArgs(GetSchedulePlainArgs $) {
        this.description = $.description;
        this.enabled = $.enabled;
        this.name = $.name;
        this.ownerTeamId = $.ownerTeamId;
        this.timezone = $.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchedulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchedulePlainArgs $;

        public Builder() {
            $ = new GetSchedulePlainArgs();
        }

        public Builder(GetSchedulePlainArgs defaults) {
            $ = new GetSchedulePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Timezone of schedule. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones - Default: `America/New_York`.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param enabled Enable/disable state of schedule
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param name Name of the schedule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param ownerTeamId Owner team id of the schedule.
         * 
         * @return builder
         * 
         */
        public Builder ownerTeamId(@Nullable String ownerTeamId) {
            $.ownerTeamId = ownerTeamId;
            return this;
        }

        /**
         * @param timezone The description of schedule.
         * 
         * @return builder
         * 
         */
        public Builder timezone(@Nullable String timezone) {
            $.timezone = timezone;
            return this;
        }

        public GetSchedulePlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}