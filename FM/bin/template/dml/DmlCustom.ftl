<#import "/container/Container.ftl" as CCON>
<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")};

<@REV.REV_IMPORT/>
//FMCB IMPORT START
${CB("IMPORT")}
//FMCB IMPORT END

/**
 * DBコンテナ(DML)クラスです。
 * 実装仕様書から自動生成されるクラスです。
 */
<@REV.REV_ANNOTATION/>
abstract public class ${S("BLOCK_ID")}_DML_<@CCON.C_SUF/> extends ${S("BLOCK_ID")}_DML_<@CCON.C_SUF/>_A {

//FMCB CUSTOM_METHOD START
${CB("CUSTOM_METHOD")}
<#-- eclipseのformatterにより、コンストラクタ引数部で改行されてしまう場合にも対応。-->
<#if !INC_LINE_IN_CB("public " + S("BLOCK_ID") + "_DML_" + (S("CLASS_SUFFIX")!="")?string(S("CLASS_SUFFIX"), (S(S("BLOCK_ID") + "_CLASS_SUFFIX"))) + "(String", "CUSTOM_METHOD")
	&& !INC_LINE_IN_CB("public " + S("BLOCK_ID") + "_DML_" + (S("CLASS_SUFFIX")!="")?string(S("CLASS_SUFFIX"), (S(S("BLOCK_ID") + "_CLASS_SUFFIX"))) + "(", "CUSTOM_METHOD")>
	/**
	 * コンストラクタ
	 */
	public ${S("BLOCK_ID")}_DML_<@CCON.C_SUF/>(String name, String[][] rowAlias) {
		super(name, rowAlias);
	}
</#if>
}