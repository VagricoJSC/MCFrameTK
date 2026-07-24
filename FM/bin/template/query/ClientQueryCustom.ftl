<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("CLIENT_PACKAGE")};

<@REV.REV_IMPORT/>
//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
${CB("CUSTOM_IMPORT")}
//FMCB CUSTOM_IMPORT END

/**
 * 画面"${S("CLIENT_CLASS")}"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
<@REV.REV_ANNOTATION/>
abstract public class ${S("CLIENT_CLASS")}_${S("CLASS_SUFFIX")} extends ${S("CLIENT_CLASS")}_${S("CLASS_SUFFIX")}_A <#if B("HAS_IMPLEMENTS_DESCRIPTION")>implements ${S("IMPLEMENTS_DESCRIPTION")} </#if>{

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
${CB("CUSTOM_FIELD")}
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public ${S("CLIENT_CLASS")}_${S("CLASS_SUFFIX")}() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START
${CB("CUSTOM_CONSTRUCTOR")}
		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//クエリメソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
${CB("CUSTOM_METHOD")}
}