package org.lc.lucene;

import org.lc.core.ISegmenter;
import org.lc.core.LcPinyinSearchSegmenter;

public class LcPinyinSearchTokenizer extends AbstractLcPinyinTokenizer {
    private final LcPinyinSearchSegmenter searchSegmenter;

    public LcPinyinSearchTokenizer(int analysisSetting) {
        this.searchSegmenter = new LcPinyinSearchSegmenter(input, analysisSetting);
    }

    @Override
    protected ISegmenter getSegmenter() {
        return searchSegmenter;
    }
}
