<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")};

<@REV.REV_IMPORT/>
//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
${CB("CUSTOM_IMPORT")?trim}
//FMCB CUSTOM_IMPORT END

/**
 * "${S("CLASS")}"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
<@REV.REV_ANNOTATION/>
abstract public class ${S("CLASS")}_${S("CLASS_SUFFIX")} extends ${S("CLASS")}_${S("CLASS_SUFFIX")}_A{
//FMCB CUSTOM_METHOD START
${CB("CUSTOM_METHOD")}
<#if !INC_LINE_IN_CB("protected " + S("CLASS") + "_" + S("CLASS_SUFFIX") + "()", "CUSTOM_METHOD")>
	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected ${S("CLASS")}_${S("CLASS_SUFFIX")}() {
		super();
	}
</#if>
}