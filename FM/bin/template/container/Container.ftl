<#-- row_autoのsuffixはこのマクロを使用せず独自生成となっているので注意。 -->
<#macro C_SUF>
<#if S("CLASS_SUFFIX")!="">${S("CLASS_SUFFIX")}<#else>${S(S("BLOCK_ID") + "_CLASS_SUFFIX")}</#if><#if S(S("BLOCK_ID") + "_GENE_MODE_LAYER")=="2">_A</#if><#rt>
</#macro>
