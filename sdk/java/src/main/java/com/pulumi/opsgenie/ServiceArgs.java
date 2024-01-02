// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * Description field of the service that is generally used to provide a detailed information about the service.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description field of the service that is generally used to provide a detailed information about the service.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the service. This field must not be longer than 100 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the service. This field must not be longer than 100 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Tags for the service, with a maximum of 20 tags per service.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags for the service, with a maximum of 20 tags per service.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Team id of the service. This field must not be longer than 512 characters.
     * 
     */
    @Import(name="teamId", required=true)
    private Output<String> teamId;

    /**
     * @return Team id of the service. This field must not be longer than 512 characters.
     * 
     */
    public Output<String> teamId() {
        return this.teamId;
    }

    private ServiceArgs() {}

    private ServiceArgs(ServiceArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.tags = $.tags;
        this.teamId = $.teamId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceArgs $;

        public Builder() {
            $ = new ServiceArgs();
        }

        public Builder(ServiceArgs defaults) {
            $ = new ServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description field of the service that is generally used to provide a detailed information about the service.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description field of the service that is generally used to provide a detailed information about the service.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the service. This field must not be longer than 100 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the service. This field must not be longer than 100 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags Tags for the service, with a maximum of 20 tags per service.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags for the service, with a maximum of 20 tags per service.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags for the service, with a maximum of 20 tags per service.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param teamId Team id of the service. This field must not be longer than 512 characters.
         * 
         * @return builder
         * 
         */
        public Builder teamId(Output<String> teamId) {
            $.teamId = teamId;
            return this;
        }

        /**
         * @param teamId Team id of the service. This field must not be longer than 512 characters.
         * 
         * @return builder
         * 
         */
        public Builder teamId(String teamId) {
            return teamId(Output.of(teamId));
        }

        public ServiceArgs build() {
            if ($.teamId == null) {
                throw new MissingRequiredPropertyException("ServiceArgs", "teamId");
            }
            return $;
        }
    }

}
