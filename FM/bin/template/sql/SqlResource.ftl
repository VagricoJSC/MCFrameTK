<#if S("PACKAGE")!="">package ${S("PACKAGE")};</#if>

/**
 * SQLリソースクラスです。<p>
 */
public class ${S("CLASS")} {

<#list A(S("BLOCK_ID") + "_ITEM_IDS") as recId>
	/**
	 *
<#list A(S("BLOCK_ID") + "_" + recId + "_BODY_H_TOKENS") as aToken>
	 * ${aToken}
</#list>
	 *
	 * @ID ${recId}
	 * @since ${S(S("BLOCK_ID") + "_" + recId + "_DATE")}
	 * @author ${S(S("BLOCK_ID") + "_" + recId + "_REGISTER")}
	 * @memo
<#list A(S("BLOCK_ID") + "_" + recId + "_MEMO_TOKENS") as aToken>
	 *    ${aToken}
</#list>
	 */
	public static final String ${S(S("BLOCK_ID") + "_" + recId + "_FIELD_ID")} =
	<#list A(S("BLOCK_ID") + "_" + recId + "_BODY_TOKENS") as aToken>
		"${aToken}" <#if aToken_has_next>+<#else>;</#if>
</#list>
</#list>
}