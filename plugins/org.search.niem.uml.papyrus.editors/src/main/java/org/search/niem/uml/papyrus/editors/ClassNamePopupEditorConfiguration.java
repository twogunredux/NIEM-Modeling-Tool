/*
 * This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   SEARCH Group, Incorporated - initial API and implementation
 *
 */
package org.search.niem.uml.papyrus.editors;

import org.eclipse.uml2.uml.UMLPackage;

public class ClassNamePopupEditorConfiguration extends ClassifierNamePopupEditorConfiguration {
    public ClassNamePopupEditorConfiguration() {
        super(UMLPackage.Literals.CLASS);
    }
}