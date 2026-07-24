<#import "/macro/ClassDef.ftl" as CDEF>
<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("I_PACKAGE")};

import mcframe.commonCore.container.*;
import mcframe.serverCore.logic.*;
<@REV.REV_IMPORT/>

/**
 * ${S("METHOD")}オペレーションのインターフェースクラス.<p>
 *
<#list S("MEMO")?split("\n") as lToken>
 * ${lToken}<br>
</#list>
 */
<@REV.REV_ANNOTATION/>
public interface If${S("CLASS")}_${S("METHOD")} extends ${S("EXTENDS_INTERFACE")} {

	public static final String DEFAULT_MODULE_ID = "${S("MODULE_ID")}";
	public static final String DEFAULT_LOGIC_ID = "${S("ID")}";
	public static final String DEFAULT_OPERATION_ID = "${S("METHOD_ID")}";

	public MCContainer up(int i);

	public MCContainer down(int i);

	//-------------------------外部 I/F--------------------------
<#assign TEL_UP_BS=A("TELEGRAM_UP_L_BLOCK_IDS")>
<#list TEL_UP_BS as aBlockId>
<#assign telItemList = telItems("UP",aBlockId_index)?word_list>
	/**
	 * 上り電文の第${aBlockId_index}ブロックのデータを格納するコンテナを取得します。<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 *  <caption>[上り第${aBlockId_index}ブロック項目]</caption>
	 * 	<tr bgcolor="#cccccc">
	 *  	<th>必須</th>
	 *  	<th>項目名</th>
	 *  </tr>
<#list A(aBlockId + "_ITEM_IDS") as anItemId>
<#if telItemList?seq_contains(anItemId)>
	<#if B("TELEGRAM_UP_${aBlockId_index}_${anItemId}_IS_REQUIRED")>
	 * 	<tr bgcolor="#ffccff">
	 * 		<td>*</td>
	<#else>
	 * 	<tr>
	 * 		<td><br></td>
	</#if>
	 * 		<td>${anItemId}</td>
	 * 	</tr>
</#if>
</#list>
	 * </table>
	 *
	 * @see <@CDEF.CONT_CLASS_NAME body0=aBlockId/>
	 */
	public <@CDEF.CONT_DEF body=aBlockId/> up${aBlockId_index}();
</#list>

<#assign TEL_DOWN_BS=A("TELEGRAM_DOWN_L_BLOCK_IDS")>
<#list TEL_DOWN_BS as aBlockId>
<#assign telItemList = telItems("DOWN",aBlockId_index)?word_list>
	/**
	 * 下り電文の第${aBlockId_index}ブロックのデータを格納するコンテナを取得します。<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 *  <caption>[下り第${aBlockId_index}ブロック項目]</caption>
	 * 	<tr bgcolor="#cccccc">
	 *  	<th>必須</th>
	 *  	<th>項目名</th>
	 *  </tr>
<#list A(aBlockId + "_ITEM_IDS") as anItemId>
<#if telItemList?seq_contains(anItemId)>
	<#if B("TELEGRAM_DOWN_${aBlockId_index}_${anItemId}_IS_REQUIRED")>
	 * 	<tr bgcolor="#ffccff">
	 * 		<td>*</td>
	<#else>
	 * 	<tr>
	 * 		<td><br></td>
	</#if>
	 * 		<td>${anItemId}</td>
	 * 	</tr>
</#if>
</#list>
	 * </table>
	 *
	 * @see <@CDEF.CONT_CLASS_NAME body0=aBlockId/>
	 */
	public <@CDEF.CONT_DEF body=aBlockId/> down${aBlockId_index}();
</#list>
}

<#function telItems UD bId>
<#assign tList="">
<#list A("TELEGRAM_${UD}_${bId}_ITEM_IDS") as anItemId>
<#assign tList = tList + " " + anItemId>
</#list>
<#return tList>
</#function>