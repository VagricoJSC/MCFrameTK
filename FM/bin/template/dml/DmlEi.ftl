<#import "/container/Container.ftl" as CCON>
<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")};

import mcframe.commonCore.annotation.EI;
<@REV.REV_IMPORT/>
<#if CB("IMPORT")!="">
//FMCB IMPORT START
${CB("IMPORT")}
//FMCB IMPORT END
</#if>

/**
 * ブロック"${S("BLOCK_ID")}" DBコンテナ(DML)クラスです。<p>
 *
 * <br>
<#include F("FTL.ROW.DBC_COMMENT")/>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
<@REV.REV_ANNOTATION/>
@EI
public class ${S("BLOCK_ID")}_DML extends ${S("BLOCK_ID")}_DML_<@CCON.C_SUF/> <#if B("HAS_IMPLEMENTS_DESCRIPTION")>implements ${S("IMPLEMENTS_DESCRIPTION")} </#if>{

	/**
	 * コンストラクタ
	 */
	public ${S("BLOCK_ID")}_DML(String name, String[][] rowAlias) {
		super(name, rowAlias);
	}
<#if CB("CUSTOM")!="">
//FMCB CUSTOM START
${CB("CUSTOM")}
//FMCB CUSTOM END
</#if>}