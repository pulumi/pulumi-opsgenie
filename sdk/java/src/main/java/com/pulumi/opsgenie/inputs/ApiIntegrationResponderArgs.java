// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiIntegrationResponderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiIntegrationResponderArgs Empty = new ApiIntegrationResponderArgs();

    /**
     * The id of the responder.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The id of the responder.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The responder type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The responder type.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ApiIntegrationResponderArgs() {}

    private ApiIntegrationResponderArgs(ApiIntegrationResponderArgs $) {
        this.id = $.id;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiIntegrationResponderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiIntegrationResponderArgs $;

        public Builder() {
            $ = new ApiIntegrationResponderArgs();
        }

        public Builder(ApiIntegrationResponderArgs defaults) {
            $ = new ApiIntegrationResponderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The id of the responder.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The id of the responder.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param type The responder type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The responder type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ApiIntegrationResponderArgs build() {
            return $;
        }
    }

}