<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("SERVER_PACKAGE")};

<@REV.REV_IMPORT/>
//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
${CB("CUSTOM_IMPORT")?trim}
//FMCB CUSTOM_IMPORT END

/**
 * 画面クエリ"${S("SERVER_CLASS")}"のロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
<@REV.REV_ANNOTATION/>
abstract public class ${S("SERVER_CLASS")}_${S("CLASS_SUFFIX")} extends ${S("SERVER_CLASS")}_${S("CLASS_SUFFIX")}_A{
	//FMCB CUSTOM START
${CB("CUSTOM")}
	//FMCB CUSTOM END
}