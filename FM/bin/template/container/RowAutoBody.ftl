<#import "/container/Container.ftl" as CCON>
<#import "/macro/RevAnnotation.ftl" as REV>
<#import "/container/FMRowAutoCustomize.ftl" as FMD>
<#import "/dml/DmlAutoBody.ftl" as DML_AB>
<#setting number_format="computer">
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")};

<#include F("FTL.ROW.IMPORT")>
<#if B("IS_DAO")&&!FMCONST_B("DB.DBC_GENE_630")>

<@DML_AB.DML_IMPORT/>
</#if>

/**
 * ブロック"${S("BLOCK_ID")}"コンテナRowクラスです。<p>
 *
<#list S(S("BLOCK_ID") + "_MEMO")?split("\n") as lToken>
 * ${lToken}<br>
</#list>
 *
<#if S(S("BLOCK_ID") + "_GENE_MODE_LAYER")=="1">
<#if B("IS_DAO")><#include F("FTL.ROW.DBC_COMMENT")/><#else><#include F("FTL.ROW.C_COMMENT")/></#if>
 *
 * <br>
</#if>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
<#if B(S("BLOCK_ID") + "_IS_GENE_LIST")>
 * <br>
 * @see ${S("PACKAGE")}.${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<#if S(S("BLOCK_ID") + "_GENE_MODE_LAYER")!="1">_<@CCON.C_SUF/>_A</#if>
</#if>
 */
<#if FMCONST_B("FTL.SUPPRESSWARNINGS")>
@SuppressWarnings({"all"})
</#if>
<@REV.REV_ANNOTATION/>
${CLASS_MODIFIER}class ${CLASS_NAME}<@FMD.CLASS_G_DEC lay="A"/> extends ${SUPER_CLASS_NAME}<@FMD.S_CLASS_G_DEC lay="A"/> {
<#if B("IS_DAO")&&!FMCONST_B("DB.DBC_GENE_630")>

<@DML_AB.DML_FIELD/>
</#if>

<#list A(S("BLOCK_ID") + "_CONTAINER_ITEM_IDS") as anItemId>
<#if !B(S("BLOCK_ID") + "_" + anItemId + "_IS_OVERRIDE")>
<@M_COMMENT lItemId=anItemId/>
	public static final String $${anItemId} = "${anItemId}";
</#if>
</#list>

<#if B("IS_DAO")><#--DBContainerの場合-->
<#list  A(S("BLOCK_ID") + "_ITEM_IDS") as anItemId>
	<#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE") == "RI"&&S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS") != "">
<@M_COMMENT lItemId=anItemId/>
	public static final String $${S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS") } = ${S(S("BLOCK_ID") + "_" + S(S("BLOCK_ID") + "_" + anItemId + "_DEPEND_ITEM_ID") + "_ROW_CLASS")}.createColumnPath($${S(S("BLOCK_ID") + "_" + anItemId + "_DEPEND_ITEM_ID")}, "${S(S("BLOCK_ID") + "_" + anItemId + "_DEPEND_TER_PATH")}");
<#assign LAST_ALIAS=S(S("BLOCK_ID") + "_" + anItemId + "_ALIAS")>
	</#if>
</#list>
<#else><#--DBContainerではない場合-->
<#list  A(S("BLOCK_ID") + "_ITEM_IDS") as anItemId>
	<#if S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS") != "">
	public static final String $${S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS") } = $${S(S("BLOCK_ID") + "_" + anItemId + "_DEPEND_ITEM_ID")} + ".${S(S("BLOCK_ID") + "_" + anItemId + "_DEPEND_TER_PATH")}";
<#assign LAST_ALIAS=S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS")>
	</#if>
</#list>
</#if>

<#if B("IS_DAO")><#--DBContainerの場合-->
<#list A(S("BLOCK_ID") + "_ITEM_IDS") as anItemId>
<#if !B(S("BLOCK_ID") + "_" + anItemId + "_IS_OVERRIDE")>
<#assign tarLev = ["K","C","Z","J"]>
<#if tarLev?seq_contains(S(S("BLOCK_ID") + "_" + anItemId + "_LEVEL"))>
<@M_COMMENT lItemId=anItemId/>
<#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="RI"&&S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS") != "">
	public static final String C_${S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS")} = "<@TAB_ALI bId=S("BLOCK_ID") iId=anItemId/>.${S(S("BLOCK_ID") + "_" + anItemId + "_ALIAS")}";
<#else>
	public static final String C_${anItemId} = "<@TAB_ALI bId=S("BLOCK_ID") iId=anItemId/>.${S(S("BLOCK_ID") + "_" + anItemId + "_ALIAS")}";
</#if>
</#if>
</#if>
</#list>

</#if>
<#list A(S("BLOCK_ID") + "_CONTAINER_ITEM_IDS") as anItemId>
<#if !B(S("BLOCK_ID") + "_" + anItemId + "_IS_OVERRIDE")>
<#include F("FTL.ROW.META_DEFINE")/>
</#if>
</#list>

	protected static final ConstMetaList<${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R> constMetas = new ConstMetaList<${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R>(
		<#if B(S("BLOCK_ID") + "_SUPER_IS_BLANKET")>MCConstRow<#else>${S(S("BLOCK_ID") + "_SUPER_ROW_CLASS")}</#if>.constMetas,
		new MCMeta[]{
			<#list A(S("BLOCK_ID") + "_CONTAINER_ITEM_IDS") as anItemId>
<#if !B(S("BLOCK_ID") + "_" + anItemId + "_IS_OVERRIDE")>
			${anItemId}_META<#if anItemId_has_next>,</#if>
</#if>
			</#list>
		},
<#if B("IS_DAO")><#--DBContainerの場合-->
		new String[][]{
			{
<#list  A(S("BLOCK_ID") + "_ITEM_IDS") as anItemId>
	<#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE") == "RI"&&S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS") != "">
				"${S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS") }"<#if LAST_ALIAS!=S(S("BLOCK_ID") + "_" + anItemId + "_ALIAS")>,</#if>
	</#if>
</#list>
			},
			{
<#list  A(S("BLOCK_ID") + "_ITEM_IDS") as anItemId>
	<#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE") == "RI"&&S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS") != "">
				$${S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS") }<#if LAST_ALIAS!=S(S("BLOCK_ID") + "_" + anItemId + "_ALIAS")>,</#if>
	</#if>
</#list>
			}
		}
<#else><#--DBContainerではない場合-->
		new String[][]{
			{
<#list  A(S("BLOCK_ID") + "_ITEM_IDS") as anItemId>
	<#if S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS") != ""&&B(S("BLOCK_ID") + "_" + anItemId + "_FACT_CONTAINER_ITEM")>
				"${S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS") }"<#if LAST_ALIAS!=S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS")>,</#if>
	</#if>
</#list>
			},
			{
<#list  A(S("BLOCK_ID") + "_ITEM_IDS") as anItemId>
	<#if S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS") != ""&&B(S("BLOCK_ID") + "_" + anItemId + "_FACT_CONTAINER_ITEM")>
				$${S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS") }<#if LAST_ALIAS!=S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS")>,</#if>
	</#if>
</#list>
			}
		}
</#if>
	);

<#if S("SORD")=="SCR">
	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		<#if S(S("BLOCK_ID") + "_SUPER_ROW_CLASS")!=""&&S(S("BLOCK_ID") + "_SUPER_ROW_CLASS")!="MCConstRow"&&B(S("BLOCK_ID") + "_SUPER_HAS_EXTMAP")>${S(S("BLOCK_ID") + "_SUPER_ROW_CLASS")}.KEYS<#else>null</#if>,
		new String[]{
<#assign keyList = keys()?word_list>
<#list keyList as anItemId>
			$${S(S("BLOCK_ID") + "_" + anItemId + "_DEPEND_ITEM_ID")}<#if S(S("BLOCK_ID") + "_" + anItemId + "_DEPEND_TER_PATH")!=""> + ".${S(S("BLOCK_ID") + "_" + anItemId + "_DEPEND_TER_PATH")}"</#if><#if anItemId_has_next>,</#if>	// ${anItemId}
</#list>
		}
	);

</#if>
<#if S("SORD")=="SCR"||S("SORD")=="OPE">
<#list A("KEY_IDS") as aKey>
	/** 項目属性情報のグループ[${aKey}]のキー定数 */
	public static final String $$${aKey} = "${aKey}";
</#list>

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		<#if S(S("BLOCK_ID") + "_SUPER_ROW_CLASS")!=""&&S(S("BLOCK_ID") + "_SUPER_ROW_CLASS")!="MCConstRow"&&B(S("BLOCK_ID") + "_SUPER_HAS_EXTMAP")>${S(S("BLOCK_ID") + "_SUPER_ROW_CLASS")}.EXTMAP<#else>null</#if><#if A("KEY_IDS")?size!=0>,</#if>
<#list A("KEY_IDS") as aKey>
		new MCExtMap.Entry($$${aKey}, new MCExtList(
			new String[][]{
	<#assign extList = keys2(aKey)?word_list>
	<#list extList as anItemId>
				{$${S(S("BLOCK_ID") + "_" + anItemId + "_DEPEND_ITEM_ID")}<#if S(S("BLOCK_ID") + "_" + anItemId + "_DEPEND_TER_PATH")!=""> + ".${S(S("BLOCK_ID") + "_" + anItemId + "_DEPEND_TER_PATH")}"</#if>, "${S(S("BLOCK_ID") + "_" + anItemId + "_KEY_" + aKey)?replace("\"","\\\"")?replace("\n","\\n")}"}<#if anItemId_has_next>,</#if>	// ${anItemId}
	</#list>
			}
		))<#if aKey_has_next>,</#if>
</#list>
	);

</#if>
	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

<#if S("SORD")=="SCR">
	/**
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

</#if>
<#if S("SORD")=="SCR"||S("SORD")=="OPE">
	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

<#-- getKeys(String aGroup) は、画面側だけ前Ver.から存在しているため、-->
<#-- 互換性維持のため、画面側(SCR)では従来仕様、サーバ側(OPE)では新仕様 で -->
<#-- 自動生成を行っている。-->
	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public <#if S("SORD")=="SCR">MCKeyList<#else>List<String></#if> getKeys(String aGroup){
		if(aGroup == null) return null;
<#if S("SORD")=="SCR">
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
<#else>
		return EXTMAP.getKeyList(aGroup);
</#if>
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

</#if>
	/**
	 * コンストラクタです。
	 */
	protected ${CLASS_NAME}(ConstMetaList<? extends ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R clone() {
		return (${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R createInstance() {
		return (${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R getValues(String... names) {
		return (${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R) super.getValues(names);
	}

<#if S("SORD")!="SCR">
	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}
</#if>

<#assign delta=0>
<#list A(S("BLOCK_ID") + "_CONTAINER_ITEM_IDS") as anItemId>
<#if !B(S("BLOCK_ID") + "_" + anItemId + "_IS_OVERRIDE")>
	<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="R">

<@M_COMMENT lItemId=anItemId/>
	public ${S(S("BLOCK_ID") + "_${anItemId}_ROW_CLASS")} ${anItemId}(){
		return (${S(S("BLOCK_ID") + "_${anItemId}_ROW_CLASS")}) getConstInnerRow(offset + ${delta}, $${anItemId});
	}
	
<@M_COMMENT lItemId=anItemId/>
	public void ${anItemId}(${S(S("BLOCK_ID") + "_${anItemId}_ROW_CLASS")} row){
		setConstInnerRow(offset + ${delta}, $${anItemId}, row);
	}

	<#else><#-- INNER ROWではない項目の場合 -->

<@M_COMMENT lItemId=anItemId/>
	public ${S(S("BLOCK_ID") + "_${anItemId}_CLASS")} ${anItemId}() {
		return getConst<#include F("FTL.ROW.ACCESSOR_TYPE")>(offset + ${delta}, $${anItemId});
	}

<@M_COMMENT lItemId=anItemId/>
	public void ${anItemId}(${S(S("BLOCK_ID") + "_${anItemId}_CLASS")} value) {
		setConst<#include F("FTL.ROW.ACCESSOR_TYPE")>(offset + ${delta}, $${anItemId}, value);
	}
		<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="N">

<@M_COMMENT lItemId=anItemId/>
	public void ${anItemId}(int value) {
		setConst<#include F("FTL.ROW.ACCESSOR_TYPE")>(offset + ${delta}, $${anItemId}, value);
	}

<@M_COMMENT lItemId=anItemId/>
	public void ${anItemId}(long value) {
		setConst<#include F("FTL.ROW.ACCESSOR_TYPE")>(offset + ${delta}, $${anItemId}, value);
	}

<@M_COMMENT lItemId=anItemId/>
	public void ${anItemId}(float value) {
		setConst<#include F("FTL.ROW.ACCESSOR_TYPE")>(offset + ${delta}, $${anItemId}, value);
	}

<@M_COMMENT lItemId=anItemId/>
	public void ${anItemId}(double value) {
		setConst<#include F("FTL.ROW.ACCESSOR_TYPE")>(offset + ${delta}, $${anItemId}, value);
	}
		</#if>

	</#if>
<#assign delta = delta + 1>
</#if>
</#list>

<#comment>データ型メソッド用 ハッシュリスト</#comment>
<#assign tmls = [
	{ "name":"String",   "data":"String" },
	{ "name":"Number",   "data":"MCNumber" },
	{ "name":"Date",     "data":"MCDate" },
	{ "name":"Timestamp","data":"MCTimestamp" },
	{ "name":"Boolean",  "data":"boolean" },
	{ "name":"Binary",   "data":"MCBinary" }
]>
<#comment>Number用 データ型</#comment>
<#assign numls = [ "int", "long", "float", "double" ]>
<#comment>Rowに含まれるデータクラス</#comment>
<#assign dataclassList = dataclasses()?word_list>
<#comment>データ型毎メソッド出力</#comment>
<#list tmls as tmi>
<#if dataclassList?seq_contains(tmi.data)>
	public ${tmi.data} get${tmi.name}(String name) {
	<#list A(S("BLOCK_ID") + "_CONTAINER_ITEM_IDS") as anItemId>
	<#if !B(S("BLOCK_ID") + "_" + anItemId + "_IS_OVERRIDE")>
	<#if S(S("BLOCK_ID") + "_${anItemId}_CLASS") == tmi.data>
		if ($${anItemId}.equalsIgnoreCase(name)) {
			return ${anItemId}();
		}
	</#if>
	</#if>
	</#list>
		return super.get${tmi.name}(name);
	}
</#if>
</#list>

<#list tmls as tmi>
<#if dataclassList?seq_contains(tmi.data)>
	public ${tmi.data} get${tmi.name}NE(String name) {
	<#list A(S("BLOCK_ID") + "_CONTAINER_ITEM_IDS") as anItemId>
	<#if !B(S("BLOCK_ID") + "_" + anItemId + "_IS_OVERRIDE")>
	<#if S(S("BLOCK_ID") + "_${anItemId}_CLASS") == tmi.data>
		if ($${anItemId}.equalsIgnoreCase(name)) {
			return ${anItemId}();
		}
	</#if>
	</#if>
	</#list>
		return super.get${tmi.name}NE(name);
	}
</#if>
</#list>

<#list tmls as tmi>
<#if dataclassList?seq_contains(tmi.data)>
	public void set${tmi.name}(String name, ${tmi.data} value) {
	<#list A(S("BLOCK_ID") + "_CONTAINER_ITEM_IDS") as anItemId>
	<#if !B(S("BLOCK_ID") + "_" + anItemId + "_IS_OVERRIDE")>
	<#if S(S("BLOCK_ID") + "_${anItemId}_CLASS") == tmi.data>
		if ($${anItemId}.equalsIgnoreCase(name)) {
			${anItemId}(value);
			return;
		}
	</#if>
	</#if>
	</#list>
		super.set${tmi.name}(name, value);
	}
<#if tmi.name == "Number">
<#list numls as numi>
	public void set${tmi.name}(String name, ${numi} value) {
	<#list A(S("BLOCK_ID") + "_CONTAINER_ITEM_IDS") as anItemId>
	<#if !B(S("BLOCK_ID") + "_" + anItemId + "_IS_OVERRIDE")>
	<#if S(S("BLOCK_ID") + "_${anItemId}_CLASS") == tmi.data>
		if ($${anItemId}.equalsIgnoreCase(name)) {
			${anItemId}(value);
			return;
		}
	</#if>
	</#if>
	</#list>
		super.set${tmi.name}(name, value);
	}
</#list>
</#if>
</#if>
</#list>

<#list tmls as tmi>
<#if dataclassList?seq_contains(tmi.data)>
	public void set${tmi.name}NE(String name, ${tmi.data} value) {
	<#list A(S("BLOCK_ID") + "_CONTAINER_ITEM_IDS") as anItemId>
	<#if !B(S("BLOCK_ID") + "_" + anItemId + "_IS_OVERRIDE")>
	<#if S(S("BLOCK_ID") + "_${anItemId}_CLASS") == tmi.data>
		if ($${anItemId}.equalsIgnoreCase(name)) {
			${anItemId}(value);
			return;
		}
	</#if>
	</#if>
	</#list>
		super.set${tmi.name}NE(name, value);
	}
<#if tmi.name == "Number">
<#list numls as numi>
	public void set${tmi.name}NE(String name, ${numi} value) {
	<#list A(S("BLOCK_ID") + "_CONTAINER_ITEM_IDS") as anItemId>
	<#if !B(S("BLOCK_ID") + "_" + anItemId + "_IS_OVERRIDE")>
	<#if S(S("BLOCK_ID") + "_${anItemId}_CLASS") == tmi.data>
		if ($${anItemId}.equalsIgnoreCase(name)) {
			${anItemId}(value);
			return;
		}
	</#if>
	</#if>
	</#list>
		super.set${tmi.name}NE(name, value);
	}
</#list>
</#if>
</#if>
</#list>

<#comment>Rowに含まれるデータ型</#comment>
<#assign datatypeList = datatypes()?word_list>
<#if datatypeList?seq_contains("R")>
	public MCRow getInnerRow(String name) {
	<#list A(S("BLOCK_ID") + "_CONTAINER_ITEM_IDS") as anItemId>
	<#if !B(S("BLOCK_ID") + "_" + anItemId + "_IS_OVERRIDE")>
	<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE") == "R">
		if ($${anItemId}.equalsIgnoreCase(name)) {
			return ${anItemId}();
		}
	</#if>
	</#if>
	</#list>
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
	<#list A(S("BLOCK_ID") + "_CONTAINER_ITEM_IDS") as anItemId>
	<#if !B(S("BLOCK_ID") + "_" + anItemId + "_IS_OVERRIDE")>
	<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE") == "R">
		if ($${anItemId}.equalsIgnoreCase(name)) {
			${anItemId}(
				((MCContainerMeta) ${anItemId}_META).castInnerRow(${S(S("BLOCK_ID") + "_${anItemId}_ROW_CLASS")}.class, value)
			);
			return;
		}
	</#if>
	</#if>
	</#list>
		super.setInnerRow(name, value);
	}
</#if>

<#comment>エイリアスメソッド</#comment>
<#list A(S("BLOCK_ID") + "_ITEM_IDS") as anItemId>
<#if S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS") != "">
<#if !B(S("BLOCK_ID") + "_" + anItemId + "_IS_OVERRIDE")>
	<#if S(S("BLOCK_ID") + "_${anItemId}_FACT_TYPE")=="R">
<@M_COMMENT lItemId=anItemId/>
	public ${S(S("BLOCK_ID") + "_${anItemId}_ROW_CLASS")} ${S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS")}(){
		return ${S(S("BLOCK_ID") + "_" + anItemId + "_ACCESSOR")}();
	}
	
<@M_COMMENT lItemId=anItemId/>
	public void ${S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS")}(${S(S("BLOCK_ID") + "_${anItemId}_ROW_CLASS")} row){
		${S(S("BLOCK_ID") + "_" + anItemId + "_ACCESSOR")}(row);
	}

	<#elseif S(S("BLOCK_ID") + "_${anItemId}_FACT_TYPE")!=""><#-- INNER ROWではない項目の場合 -->

<@M_COMMENT lItemId=anItemId/>
	public ${S(S("BLOCK_ID") + "_${anItemId}_CLASS")} ${S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS")}() {
		return ${S(S("BLOCK_ID") + "_" + anItemId + "_ACCESSOR")}();
	}

<@M_COMMENT lItemId=anItemId/>
	public void ${S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS")}(${S(S("BLOCK_ID") + "_${anItemId}_CLASS")} value) {
		${S(S("BLOCK_ID") + "_" + anItemId + "_ACCESSOR")}(value);
	}
		<#if S(S("BLOCK_ID") + "_${anItemId}_FACT_TYPE")=="N">

<@M_COMMENT lItemId=anItemId/>
	public void ${S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS")}(int value) {
		${S(S("BLOCK_ID") + "_" + anItemId + "_ACCESSOR")}(value);
	}

<@M_COMMENT lItemId=anItemId/>
	public void ${S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS")}(long value) {
		${S(S("BLOCK_ID") + "_" + anItemId + "_ACCESSOR")}(value);
	}

<@M_COMMENT lItemId=anItemId/>
	public void ${S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS")}(float value) {
		${S(S("BLOCK_ID") + "_" + anItemId + "_ACCESSOR")}(value);
	}

<@M_COMMENT lItemId=anItemId/>
	public void ${S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS")}(double value) {
		${S(S("BLOCK_ID") + "_" + anItemId + "_ACCESSOR")}(value);
	}
		</#if>
	</#if>
</#if>
</#if>
</#list>
<#if B("IS_DAO")>

<#include F("FTL.ROW.AUTO_DAO")/>
</#if>

<#macro M_COMMENT lItemId>
<#if S(S("BLOCK_ID") + "_${lItemId}_NAME")!=""||S(S("BLOCK_ID") + "_${lItemId}_MESSAGE_CTL")==""||S(S("BLOCK_ID") + "_${lItemId}_MEMO")!="">
	/**
	 * ${S(S("BLOCK_ID") + "_${lItemId}_NAME")} ${S(S("BLOCK_ID") + "_${lItemId}_MESSAGE")}.<p>
	 *
<#if S(S("BLOCK_ID") + "_${lItemId}_MEMO")!="">
<#list S(S("BLOCK_ID") + "_${lItemId}_MEMO")?split("\n") as lToken>
	 * ${lToken}<#if lToken_has_next><br></#if>
</#list></#if>
	 */
</#if>
</#macro>

<#macro TAB_ALI bId iId>
<#if S(bId + "_" + iId + "_LEVEL")=="J">
${S(bId + "_" + iId + "_TABLE_ALIAS")}<#rt>
<#else>
${S(bId + "_TABLE_ALIAS")}<#rt>
</#if>
</#macro>

<#function keys>
<#assign kList="">
<#list A(S("BLOCK_ID") + "_ITEM_IDS") as anItemId>
<#if B(S("BLOCK_ID") + "_${anItemId}_IS_KEY")><#assign kList = kList + " " + anItemId></#if>
</#list>
<#return kList>
</#function>

<#function keys2 group>
<#assign kList="">
<#list A(S("BLOCK_ID") + "_ITEM_IDS") as anItemId>
<#if S(S("BLOCK_ID") + "_${anItemId}_KEY_${group}")!=""><#assign kList = kList + " " + anItemId></#if>
</#list>
<#return kList>
</#function>

<#comment>Rowに含まれるデータ型クラスリスト</#comment>
<#function dataclasses>
<#assign cList="">
<#list A(S("BLOCK_ID") + "_CONTAINER_ITEM_IDS") as anItemId>
<#assign cList = cList + " " + S(S("BLOCK_ID") + "_${anItemId}_CLASS")>
</#list>
<#return cList>
</#function>

<#comment>Rowに含まれるデータ型リスト</#comment>
<#function datatypes>
<#assign tList="">
<#list A(S("BLOCK_ID") + "_CONTAINER_ITEM_IDS") as anItemId>
<#assign tList = tList + " " + S(S("BLOCK_ID") + "_${anItemId}_TYPE")>
</#list>
<#return tList>
</#function>