
package com.intellij.plugin.foundation5;

/**
 * @author Rémy Laurent
 */

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;
import org.jetbrains.annotations.Nullable;

public class Foundation5TemplatesProvider implements DefaultLiveTemplatesProvider {
    @Override
    public String[] getDefaultLiveTemplateFiles() {
        return new String[]{
                "liveTemplates/Foundation5",
        };
    }

    @Nullable
    @Override
    public String[] getHiddenLiveTemplateFiles() {
        return null;
    }
}
