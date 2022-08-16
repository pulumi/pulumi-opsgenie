// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.opsgenie.inputs.GetEscalationRepeat;
import com.pulumi.opsgenie.inputs.GetEscalationRule;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEscalationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEscalationPlainArgs Empty = new GetEscalationPlainArgs();

    /**
     * Escalation Description
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Escalation Description
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the escalation.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the escalation.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * If owner team exist the id of the team is exported
     * 
     */
    @Import(name="ownerTeamId")
    private @Nullable String ownerTeamId;

    /**
     * @return If owner team exist the id of the team is exported
     * 
     */
    public Optional<String> ownerTeamId() {
        return Optional.ofNullable(this.ownerTeamId);
    }

    /**
     * Escalation repeat preferences
     * 
     */
    @Import(name="repeats")
    private @Nullable List<GetEscalationRepeat> repeats;

    /**
     * @return Escalation repeat preferences
     * 
     */
    public Optional<List<GetEscalationRepeat>> repeats() {
        return Optional.ofNullable(this.repeats);
    }

    /**
     * Escalation rules
     * 
     */
    @Import(name="rules")
    private @Nullable List<GetEscalationRule> rules;

    /**
     * @return Escalation rules
     * 
     */
    public Optional<List<GetEscalationRule>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private GetEscalationPlainArgs() {}

    private GetEscalationPlainArgs(GetEscalationPlainArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.ownerTeamId = $.ownerTeamId;
        this.repeats = $.repeats;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEscalationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEscalationPlainArgs $;

        public Builder() {
            $ = new GetEscalationPlainArgs();
        }

        public Builder(GetEscalationPlainArgs defaults) {
            $ = new GetEscalationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Escalation Description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param name Name of the escalation.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param ownerTeamId If owner team exist the id of the team is exported
         * 
         * @return builder
         * 
         */
        public Builder ownerTeamId(@Nullable String ownerTeamId) {
            $.ownerTeamId = ownerTeamId;
            return this;
        }

        /**
         * @param repeats Escalation repeat preferences
         * 
         * @return builder
         * 
         */
        public Builder repeats(@Nullable List<GetEscalationRepeat> repeats) {
            $.repeats = repeats;
            return this;
        }

        /**
         * @param repeats Escalation repeat preferences
         * 
         * @return builder
         * 
         */
        public Builder repeats(GetEscalationRepeat... repeats) {
            return repeats(List.of(repeats));
        }

        /**
         * @param rules Escalation rules
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable List<GetEscalationRule> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Escalation rules
         * 
         * @return builder
         * 
         */
        public Builder rules(GetEscalationRule... rules) {
            return rules(List.of(rules));
        }

        public GetEscalationPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
