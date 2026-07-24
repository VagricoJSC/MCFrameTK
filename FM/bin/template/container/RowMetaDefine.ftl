<#if B(S("BLOCK_ID") + "_${anItemId}_IS_SHARE_META")>
	public static final MCMeta ${anItemId}_META = createCommonMeta($${anItemId}, ${S(S("BLOCK_ID") + "_${anItemId}_SHARE_META_CLASS")}.${S(S("BLOCK_ID") + "_${anItemId}_SHARE_META_ID")});<#rt>
<#else>
	public static final MCMeta ${anItemId}_META = create<#rt>
<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="C">String</#if><#rt>
<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="CLB">String</#if><#rt>
<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="CC">CryptString</#if><#rt>
<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="N">Number</#if><#rt>
<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="D">Date</#if><#rt>
<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="TS">Timestamp</#if><#rt>
<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="F">Boolean</#if><#rt>
<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="R">InnerRow</#if><#rt>
<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="B">Binary</#if><#rt>
Meta($${anItemId}<#rt>
<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="R">, ${S(S("BLOCK_ID") + "_${anItemId}_ROW_CLASS")}.class</#if><#rt>
<#if (S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="C"||S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="CLB"||S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="CC")&&S(S("BLOCK_ID") + "_${anItemId}__LENGTH")!="">, ${S(S("BLOCK_ID") + "_${anItemId}__LENGTH")}</#if><#rt>
<#if (S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="N")&&S(S("BLOCK_ID") + "_${anItemId}__LENGTH")!="">, ${S(S("BLOCK_ID") + "_${anItemId}__LENGTH")}, ${S(S("BLOCK_ID") + "_${anItemId}__DECIMAL")}, <#if B(S("BLOCK_ID") + "_${anItemId}__MINUS")>true<#else>false</#if></#if><#rt>
);</#if>
