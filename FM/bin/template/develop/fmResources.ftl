package mcframe.fm.notice;

/**
 * FrameManager開発過程の暫定メッセージリソースstaticクラス
 * 
 * @author f-inoue  / Modifier：$Author: f-inoue $
 * @version   $Date:: 2007-12-12 16:38:5#$
 * @since     6.0.0
 */
public class ${S("CLASS")} <#if S("SUPER_CLASS")!="">extends ${S("SUPER_CLASS")}</#if> {
<#list A("BLOCK_IDS") as aBlockId>
	// ${S("${aBlockId}_ID")} --- ${S("${aBlockId}_MEMO")}
<#list A("${aBlockId}_ITEM_IDS") as anItemId>
<#if S("${aBlockId}_${anItemId}_BODY")?split("\n")?size=1>
	/** [${S("${aBlockId}_${anItemId}_LV")}] ${S("${aBlockId}_${anItemId}_BODY")} */
<#else>
	/**
	 * [${S("${aBlockId}_${anItemId}_LV")}]
<#list S("${aBlockId}_${anItemId}_BODY")?split("\n") as lToken>
	 * ${lToken}<#if lToken_has_next><br></#if>
</#list>
	 */
</#if>
	public static String ${S("${aBlockId}_ID")}${S("${aBlockId}_${anItemId}_ID")} = "${S("${aBlockId}_ID")}${S("${aBlockId}_${anItemId}_ID")}";

</#list>
</#list>
}
