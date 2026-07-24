<#macro B_SWING_SUF comp>
<#if comp=="N">Panel</#if><#rt>
<#if isTable(comp)>Table</#if><#rt>
<#if comp=="TRE">Tree</#if><#rt>
<#if comp=="TAB">Tab</#if><#rt>
<#if comp=="GNT">GChart</#if><#rt>
</#macro>

<#macro I_SWING_FIELD nbean>
<#if B("${nbean}_IS_CI_TYPE")>${S("${nbean}_CMP_ACCESSOR")}<#rt>
<#elseif S("${nbean}_COMPONENT")=="SC">${nbean}_PPanel<#rt>
<#elseif S("${nbean}_COMPONENT")=="LP">${S("${nbean}_KEY")}Panel<#rt>
<#elseif S("${nbean}_COMPONENT")=="R">${nbean}_Group<#rt>
<#else>${nbean}</#if><#rt>
</#macro>

<#function isTable c>
<#return c=="TBL"||c=="CGT"||c=="TBL2"||c=="LYT">
</#function>

<#macro IME_CODE i>
<#if i=="ON">MCInputMethodType.ON_WHEN_FOCUSED<#rt>
<#elseif i=="OFF">MCInputMethodType.OFF_WHEN_FOCUSED<#rt>
<#elseif i=="FX_OFF">MCInputMethodType.OFF<#rt>
<#elseif i=="NONE">MCInputMethodType.NONE<#rt>
</#if>
</#macro>