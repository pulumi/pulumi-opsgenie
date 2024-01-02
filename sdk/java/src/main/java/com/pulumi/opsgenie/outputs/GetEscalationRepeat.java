// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEscalationRepeat {
    private @Nullable Boolean closeAlertAfterAll;
    private @Nullable Integer count;
    private @Nullable Boolean resetRecipientStates;
    private @Nullable Integer waitInterval;

    private GetEscalationRepeat() {}
    public Optional<Boolean> closeAlertAfterAll() {
        return Optional.ofNullable(this.closeAlertAfterAll);
    }
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    public Optional<Boolean> resetRecipientStates() {
        return Optional.ofNullable(this.resetRecipientStates);
    }
    public Optional<Integer> waitInterval() {
        return Optional.ofNullable(this.waitInterval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEscalationRepeat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean closeAlertAfterAll;
        private @Nullable Integer count;
        private @Nullable Boolean resetRecipientStates;
        private @Nullable Integer waitInterval;
        public Builder() {}
        public Builder(GetEscalationRepeat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.closeAlertAfterAll = defaults.closeAlertAfterAll;
    	      this.count = defaults.count;
    	      this.resetRecipientStates = defaults.resetRecipientStates;
    	      this.waitInterval = defaults.waitInterval;
        }

        @CustomType.Setter
        public Builder closeAlertAfterAll(@Nullable Boolean closeAlertAfterAll) {

            this.closeAlertAfterAll = closeAlertAfterAll;
            return this;
        }
        @CustomType.Setter
        public Builder count(@Nullable Integer count) {

            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder resetRecipientStates(@Nullable Boolean resetRecipientStates) {

            this.resetRecipientStates = resetRecipientStates;
            return this;
        }
        @CustomType.Setter
        public Builder waitInterval(@Nullable Integer waitInterval) {

            this.waitInterval = waitInterval;
            return this;
        }
        public GetEscalationRepeat build() {
            final var _resultValue = new GetEscalationRepeat();
            _resultValue.closeAlertAfterAll = closeAlertAfterAll;
            _resultValue.count = count;
            _resultValue.resetRecipientStates = resetRecipientStates;
            _resultValue.waitInterval = waitInterval;
            return _resultValue;
        }
    }
}
