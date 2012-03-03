/**
 * Copyright 2011 multibit.org
 *
 * Licensed under the MIT license (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://opensource.org/licenses/mit-license.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.multibit.viewsystem.swing.view.components;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

import org.multibit.controller.MultiBitController;
import org.multibit.viewsystem.swing.ColorAndFontConstants;

public class MultiBitTitleLabel extends JLabel {

    private static final long serialVersionUID = -3434455262992702604L;

    public MultiBitTitleLabel(String labelText, int alignment, MultiBitController controller) {
        super(labelText, alignment);
        setFont(FontSizer.INSTANCE.getAdjustedDefaultFont());
    }

    public MultiBitTitleLabel(String labelText, MultiBitController controller) {
        super(labelText);
        setFont(FontSizer.INSTANCE.getAdjustedDefaultFontWithDelta(ColorAndFontConstants.MULTIBIT_LARGE_FONT_INCREASE));
        setBorder(BorderFactory.createEmptyBorder(ColorAndFontConstants.MULTIBIT_LARGE_FONT_INCREASE, 0, 0, 0));
        setHorizontalTextPosition(JLabel.LEFT);
    }
}
