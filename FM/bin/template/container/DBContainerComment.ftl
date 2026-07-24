 * <table border=1 cellspacing=0 cellpadding=2 >
 *  <caption>[テーブル]</caption>
 * 	<tr>
 *  	<td bgcolor="#cccccc">テーブル名</td>
 *  	<td>${S(S("BLOCK_ID") + "_TABLE")}</td>
 *  </tr>
 * 	<tr>
 *  	<td bgcolor="#cccccc">テーブル別名</td>
 *  	<td>${S(S("BLOCK_ID") + "_TABLE_ALIAS")}</td>
 *  </tr>
 * </table>
<#if A(S("BLOCK_ID") + "_ITEM_IDS")?size!=0>
 * <table border=1 cellspacing=0 cellpadding=2 >
 *  <caption>[列定義]</caption>
 * 	<tr bgcolor="#cccccc">
 *  	<th>区分</th>
 *  	<th>項目名</th>
 *  	<th>型</th>
 *  	<th>桁</th>
 *  	<th>Null</th>
 *  	<th>別名/参照先</th>
 *  	<th>INNERROW</th>
 *  	<th>日本語</th>
 *  </tr>
<#list A(S("BLOCK_ID") + "_ITEM_IDS") as anItemId>
 *  <tr>
 *  	<td>${S(S("BLOCK_ID") + "_" + anItemId + "_LEVEL")}</td>
<#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="RI">
 *  	<td>${S(S("BLOCK_ID") + "_" + anItemId + "_ALIAS")}</td>
<#else>
 *  	<td>${anItemId}</td>
</#if>
 *  	<td>${S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")}</td>
<#if S(S("BLOCK_ID") + "_" + anItemId + "_LEVEL")=="I">
 *  	<td><br></td>
<#else>
 *  	<td><#if B(S("BLOCK_ID") + "_" + anItemId + "_IS_SHARE_META")><@VALUE v=S(S("BLOCK_ID") + "_" + anItemId + "_SHARE_META_DIGIT")/><#else><@VALUE v=S(S("BLOCK_ID") + "_" + anItemId + "_DIGIT")/></#if></td>
</#if>
 *  	<td><@VALUE v=S(S("BLOCK_ID") + "_" + anItemId + "_NULLABLE")/></td>
<#if S(S("BLOCK_ID") + "_" + anItemId + "_LEVEL")=="J">
 *  	<td>${S(S("BLOCK_ID") + "_" + anItemId + "_TABLE_ALIAS")}<#if S(S("BLOCK_ID") + "_" + anItemId + "_TABLE_ALIAS")!=""&&S(S("BLOCK_ID") + "_" + anItemId + "_ID")!="">.</#if>${S(S("BLOCK_ID") + "_" + anItemId + "_ALIAS")}</td>
<#else>
 *  	<td><#if anItemId==S(S("BLOCK_ID") + "_" + anItemId + "_ALIAS")><br><#else>${S(S("BLOCK_ID") + "_" + anItemId + "_ALIAS")}</#if></td>
</#if>
<#if S(S("BLOCK_ID") + "_" + anItemId + "_LEVEL")=="I">
 *  	<td><#if S(S("BLOCK_ID") + "_" + anItemId + "_DIGIT")==""><br><#else>${S(S("BLOCK_ID") + "_" + anItemId + "_DIGIT")}</#if></td>
<#else>
 *  	<td><#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="RI">${S(S("BLOCK_ID") + "_" + anItemId + "_ID")}<#else><br></#if></td>
</#if>
 *  	<td><@VALUE v=S(S("BLOCK_ID") + "_" + anItemId + "_MESSAGE")/></td>
 *  </tr>
</#list>
 * </table>
</#if>
<#if A(S("BLOCK_ID") + "_FOREIGN_IDS")?size!=0>
 * <BR>
 * <table border=1 cellspacing=0 cellpadding=2 >
 *  <caption>[外部参照]</caption>
 * 	<tr bgcolor="#cccccc">
 *  	<th>参照先テーブル</th>
 *  	<th>別名</th>
 *  	<th>参照元項目名</th>
 *  	<th>参照先項目名</th>
 *  </tr>
<#list A(S("BLOCK_ID") + "_FOREIGN_IDS") as aFId>
<#assign F_KEYS = S(S("BLOCK_ID") + "_" + aFId + "_F_F_KEY")?split(",")>
<#assign i=0>
<#list F_KEYS as f_key>
 *  <tr>
 *  	<td>${S(S("BLOCK_ID") + "_" + aFId + "_F_NAME")}</td>
 *  	<td>${S(S("BLOCK_ID") + "_" + aFId + "_F_MESSAGE")}</td>
 *  	<td>${f_key}</td>
 *  	<td>${S(S("BLOCK_ID") + "_" + aFId + "_F_LABEL_" + i)}</td>
 *  </tr>
<#assign i=i+1>
</#list></#list>
 * </table>
</#if>
<#macro VALUE v><#if v==""><br><#else>${v}</#if></#macro>