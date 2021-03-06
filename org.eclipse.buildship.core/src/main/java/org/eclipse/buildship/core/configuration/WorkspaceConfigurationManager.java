/*
 * Copyright (c) 2016 the original author or authors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.eclipse.buildship.core.configuration;

/**
 * Manages preferences that are the same for all Gradle projects in the workspace.
 *
 * @author Stefan Oehme
 *
 */
public interface WorkspaceConfigurationManager {

    /**
     * Loads the workspace configuration from the Eclipse preference store.
     *
     * @return the configuration, never null
     */
    WorkspaceConfiguration loadWorkspaceConfiguration();

    /**
     * Writes the given configuration to the Eclipse preference store.
     *
     * @param config the configuration, must not be null
     */
    void saveWorkspaceConfiguration(WorkspaceConfiguration config);
}
