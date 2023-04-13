package com.myorg;

import software.amazon.awscdk.App;

public final class CdkSandboxApp {
    public static void main(final String[] args) {
        App app = new App();

        new CdkSandboxStack(app, "CdkSandboxStack");

        app.synth();
    }
}
