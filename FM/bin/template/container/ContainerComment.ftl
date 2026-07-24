<#if A(S("BLOCK_ID") + "_ITEM_IDS")?size!=0>
 * <table border=1 cellspacing=0 cellpadding=2 >
 *  <caption>[項目定義]</caption>
 * 	<tr bgcolor="#cccccc">
 *  	<th>alias</th>
 *  	<th>項目名</th>
 *  	<th>フルネーム</th>
 *  	<th>型</th>
 *  	<th>桁</th>
 *  	<th>INNERROW/COLUMNPATH</th>
 *  </tr>
<#assign rNum=0>
<#list A(S("BLOCK_ID") + "_CONTAINER_ITEM_IDS") as anItemId>
	<#if !(S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="RI"&&S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS")=="")>
		<#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="RI">
 *  <tr bgcolor="Silver">
 *  	<td>*</td>
 *  	<td>${S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS")}</td>
		<#else>
 *  <tr <#if rNum%2==0>bgcolor="Moccasin"</#if>>
 *  	<td><br></td>
 *  	<td>${anItemId}</td>
		</#if>
		<#if S(S("BLOCK_ID") + "_" + anItemId + "_NAME")!="">
 *  	<td>${S(S("BLOCK_ID") + "_" + anItemId + "_NAME")}</td>
		<#else>
 *  	<td><br></td>
		</#if>
		<#if B(S("BLOCK_ID") + "_${anItemId}_IS_SHARE_META")>
 *  	<td><@TYPE type=S(S("BLOCK_ID") + "_${anItemId}_TYPE")/></td>
 *  	<td>[{@link ${S(S("BLOCK_ID") + "_${anItemId}_SHARE_META_CLASS")}#${S(S("BLOCK_ID") + "_${anItemId}_SHARE_META_ID")} ${S(S("BLOCK_ID") + "_${anItemId}_SHARE_META_ID")}}]</td>
 *  	<td><br></td>
		<#elseif S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="R">
 *  	<td><@TYPE type=S(S("BLOCK_ID") + "_${anItemId}_TYPE")/></td>
 *  	<td><br></td>
 *  	<td>{@link ${S(S("BLOCK_ID") + "_${anItemId}_ROW_CLASS")}}</td>
		<#else>
 *  	<td><@TYPE type=S(S("BLOCK_ID") + "_${anItemId}_TYPE")/></td>
 *  	<td><#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="RI"><br><#else>${S(S("BLOCK_ID") + "_${anItemId}__LENGTH")}<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="N"&&S(S("BLOCK_ID") + "_${anItemId}__DECIMAL")!="">,${S(S("BLOCK_ID") + "_${anItemId}__DECIMAL")}</#if></#if></td>
 *  	<td><#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="RI">${S(S("BLOCK_ID") + "_${anItemId}_ID")}<#else><br></#if></td>
		</#if>
 *  </tr>
<#assign rNum=rNum+1>
	</#if>
</#list>
 * </table>
</#if>
<#macro TYPE type>
<#if type=="C"||type=="CC"||type=="CLB">String</#if><#rt>
<#if type=="N">Number</#if><#rt>
<#if type=="D">Date</#if><#rt>
<#if type=="TS">Timestamp</#if><#rt>
<#if type=="F">Boolean</#if><#rt>
<#if type=="R">InnerRow</#if><#rt>
<#if type=="RI">RowItem</#if><#rt>
</#macro>