<#import "/macro/ClassDef.ftl" as CDEF>
<#import "/macro/Panel.ftl" as PANEL>

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
<#list A("BLOCK_IDS") as aBlockId><#if B("${aBlockId}_HAS_PANEL")>
		${S("CLASS")}_${S("CLASS_SUFFIX")}.jbCreate${aBlockId}((${S("CLASS")})this);
</#if></#list>
	}
<#list A("BLOCK_IDS") as aBlockId><#if B("${aBlockId}_HAS_PANEL")>

	/**
	 * [${aBlockId}]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreate${aBlockId}(${S("CLASS")} p) {
<#list A("${aBlockId}_ITEM_IDS") as anItemId><#if !B(aBlockId + "_" + anItemId + "_IS_GUI_OVERRIDE")>
	<#if S("${aBlockId}_COMPONENT")="N"&&S("${aBlockId}_${anItemId}_COMPONENT")="SC">
		<#if S("${aBlockId}_${anItemId}_TYPE")!="R">
		p.${aBlockId}_${anItemId}_PPanel = ${S("${aBlockId}_${anItemId}_EMBSCR_CLASS")}.create();
		<#else>
		p.${aBlockId}_${anItemId}_PPanel = ${S("${aBlockId}_${anItemId}_EMBSCR_CLASS")}.create(p.get${aBlockId}${S("${aBlockId}_CODE_S")}().${anItemId}());
		</#if>
		p.${aBlockId}_${anItemId}_PPanel.setName("${aBlockId}.${anItemId}");
	</#if>
	<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))&&S("${aBlockId}_${anItemId}_COMPONENT")="CM">
		p.${aBlockId}_${anItemId}_PPanel = ${S("${aBlockId}_${anItemId}_EMBTBL_CLASS")}.create(${S(aBlockId + "_FACT_ID")}R.$${anItemId});
		p.${aBlockId}_${anItemId}_PPanel.setName("${aBlockId}.${anItemId}");
	</#if>
	<#if B("${aBlockId}_${anItemId}_IS_CI_TYPE")&&S("${aBlockId}_${anItemId}_CP_ALIAS")!="">
		p.<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))><#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="CG">cg<#elseif S("${aBlockId}_${anItemId}_FACT_COMPONENT")!="CM">column</#if></#if>${aBlockId}_${S("${aBlockId}_${anItemId}_CP_ALIAS")}<#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="R">_Group<#elseif S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="SC"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="CM">_PPanel</#if> = p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")};
		p.<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))><#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="CG">cg<#elseif S("${aBlockId}_${anItemId}_FACT_COMPONENT")!="CM">column</#if></#if>${aBlockId}_${S("${aBlockId}_${anItemId}_CP_ALIAS")}<#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="R">_Group<#elseif S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="SC"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="CM">_PPanel</#if>.addAliasName("${aBlockId}.${S("${aBlockId}_${anItemId}_CP_ALIAS")}", p);
	</#if>
</#if></#list>
	}
</#if></#list>

	/**
	 * この画面のステータスのSet集合を返します。
	 * 
	 * @return ステータスのSet
	 */
	@Override
	public Set<String> getStatusSet(){
		Set<String> sSet = super.getStatusSet();
		for(String aStr : statusArray) sSet.add(aStr);
		return sSet;
	}

<#list A("BLOCK_IDS") as aBlockId>
<#list A("${aBlockId}_ITEM_IDS") as anItemId>
<#if S("${aBlockId}_COMPONENT")="N"||PANEL.isTable(S("${aBlockId}_COMPONENT"))>
    <#if !(B("${aBlockId}_${anItemId}_IS_LISTPUTTER_OVERRIDE")&&A("${aBlockId}_${anItemId}_EVENT_OUTS")?size==0)>
	<#if B("${aBlockId}_${anItemId}_IS_COMBO_TYPE")||S("${aBlockId}_${anItemId}_COMPONENT")=="SF"||S("${aBlockId}_${anItemId}_COMPONENT")=="SFA"||S("${aBlockId}_${anItemId}_COMPONENT")=="FF"||S("${aBlockId}_${anItemId}_COMPONENT")=="FFA">
	
	/** [${aBlockId}_${anItemId}_ListPutter]の定義 */
	private MCListPutter ${aBlockId}_${anItemId}_p = null;

	/**
	 * [${aBlockId}_${anItemId}_ListPutter]の取得
	 */
	protected MCListPutter get${aBlockId}_${anItemId}_ListPutter() {
		if (${aBlockId}_${anItemId}_p == null) {
			${aBlockId}_${anItemId}_p = create${aBlockId}_${anItemId}_ListPutter(<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>column</#if>${aBlockId}_${anItemId}, "${anItemId}"<#if A("${aBlockId}_${anItemId}_EVENT_OUTS")?size!=0>, <#list A("${aBlockId}_${anItemId}_EVENT_OUTS") as aDEST>"${aDEST}"<#if aDEST_has_next>,</#if></#list></#if>);

		}
		return ${aBlockId}_${anItemId}_p;
	}
	
	<#else>
		<#if B("${aBlockId}_${anItemId}_IS_FACT_COMBO_TYPE")||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="SF"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="SFA"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="FF"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="FFA">
		<#if A("${aBlockId}_${anItemId}_EVENT_OUTS")?size!=0>
<#assign lp_name=S("${aBlockId}_${anItemId}_CMP_ACCESSOR")?replace(".","_")>
	
	/** [${lp_name}_ListPutter]の定義 */
	private MCListPutter ${lp_name}_p = null;

	/**
	 * [${lp_name}_ListPutter]の取得
	 */
	protected MCListPutter get${lp_name}_ListPutter() {
		if (${lp_name}_p == null) {
			${lp_name}_p = create${lp_name}_ListPutter(${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}, "<#if S("${aBlockId}_${anItemId}_CP_ALIAS")!="">${S("${aBlockId}_${anItemId}_CP_ALIAS")}<#else>${anItemId}</#if>"<#if A("${aBlockId}_${anItemId}_EVENT_OUTS")?size!=0>, <#list A("${aBlockId}_${anItemId}_EVENT_OUTS") as aDEST>"${aDEST}"<#if aDEST_has_next>,</#if></#list></#if>);
		}
		return ${lp_name}_p;
	}
	
		</#if>
		</#if>
	</#if>
    </#if>
</#if>
</#list>
</#list>

<#if S("MODIFIER")!="abstract">
<#if B("IS_ONE_ROW_SCS")>
<#assign one_row_block=S("ONE_ROW_SCS")>
	/**
	 * この画面を埋め込み画面として作成します。
	 */	
	public static ${S("CLASS")} create(<@CDEF.CONT_DEF body=one_row_block/> row){
		${S("CLASS")} p = new ${S("CLASS")}(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

</#if>
	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static ${S("CLASS")} create(){
		${S("CLASS")} p = new ${S("CLASS")}();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

<#if B("HAS_LIST")>
	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static ${S("CLASS")} create(String name){
		${S("CLASS")} p = new ${S("CLASS")}(name);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}
</#if>
</#if>

	/**
	 * 画面部品初期設定
	 */
	protected void jbInit() {
<@TRIMLINE>
		super.jbInit();
<#-- GUI部品インスタンス初期化遅延 ***** -->
<#list A("BLOCK_IDS") as aBlockId><#if B("${aBlockId}_HAS_PANEL")>
		${S("CLASS")}_${S("CLASS_SUFFIX")}.jbfInit${aBlockId}((${S("CLASS")})this);
</#if></#list>
<#-- ***** GUI部品インスタンス初期化遅延 -->
<#list A("BLOCK_IDS") as aBlockId><#if B("${aBlockId}_HAS_PANEL")>
		${S("CLASS")}_${S("CLASS_SUFFIX")}.jbInit${aBlockId}((${S("CLASS")})this);
</#if></#list>
</@TRIMLINE>
	}
<#list A("BLOCK_IDS") as aBlockId><#if B("${aBlockId}_HAS_PANEL")>

	/**
	 * [${aBlockId}]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInit${aBlockId}(${S("CLASS")} p) {
<@TRIMLINE>
		// ブロック関連の初期化
<#include F("FTL.SCREEN.AUTO_PANEL_FIELD_JBINIT")/>
		// ブロックの項目の初期化
<#include F("FTL.SCREEN.AUTO_BEAN_FIELD_JBINIT")/>
</@TRIMLINE>
	}
<#if S("${aBlockId}_OPT1_DragAndDrop")="true">

	protected static MCTree64Delegate get${aBlockId}Delegate() {
		return new mcframe.clientCore.beans.tree.MCTree64DefaultDelegate();
	}
</#if>
</#if></#list>
<#list A("BLOCK_IDS") as aBlockId><#if B("${aBlockId}_HAS_PANEL")>

	/**
	 * [${aBlockId}]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInit${aBlockId}(${S("CLASS")} p) {
<@TRIMLINE>
		// ブロック関連の初期化
<#include F("FTL.SCREEN.AUTO_PANEL_JBINIT")/>
		// ブロックの項目の初期化
<#list A("${aBlockId}_ITEM_IDS") as anItemId>
<#include F("FTL.SCREEN.AUTO_BEAN_JBINIT")/>
</#list>
</@TRIMLINE>
	}
</#if></#list>
<#if S("MCLAYOUT")!="">

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "${S("MCLAYOUT")}";
	}
</#if>
<#if B("USE_EXPAND_AND_CONTRACT_PANEL")>

	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		Ctrl_ctrl_PPanel.expandInit();
		Ctrl_ctrl_PPanel.setDefaultDividerLocation();
	}
</#if>

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
<@TRIMLINE>
		super.mcInit();
<#list A("BLOCK_IDS") as aBlockId><#if B("${aBlockId}_HAS_PANEL")>
		${S("CLASS")}_${S("CLASS_SUFFIX")}.mcInit${aBlockId}((${S("CLASS")})this);
</#if></#list>
</@TRIMLINE>

<#list A("MODE_IDS") as aMode>
<@TRIMLINE>
		// [${aMode}]ステータスのモードの設定
<#list A("BLOCK_IDS") as aBlockId>
		${S("CLASS")}_${S("CLASS_SUFFIX")}.statusInit${aMode?replace("_","__")}_${aBlockId?replace("_","__")}((${S("CLASS")})this);
</#list>
</@TRIMLINE>

</#list>
	}
<#list A("BLOCK_IDS") as aBlockId><#if B("${aBlockId}_HAS_PANEL")>

	/**
	 *  [${aBlockId}]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInit${aBlockId}(${S("CLASS")} p) {
<@TRIMLINE>
<#include F("FTL.SCREEN.AUTO_PANEL_MCINIT")/>
<#list A("${aBlockId}_ITEM_IDS") as anItemId>
	<#if B("${aBlockId}_${anItemId}_HAS_BEAN")>
<#include F("FTL.SCREEN.AUTO_BEAN_MCINIT")/>
	</#if>
<#if B("EXPAND_AND_CONTRACT_${aBlockId}_CPANEL")>
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
</#if>
</#list>
</@TRIMLINE>
	}
</#if></#list>

<#list A("MODE_IDS") as aMode><#list A("BLOCK_IDS") as aBlockId>
	/**
	 * [${aMode}]ステータスの[${aBlockId}]ブロックのモードの設定
	 */
	protected static void statusInit${aMode?replace("_","__")}_${aBlockId?replace("_","__")}(${S("CLASS")} p){
<#include F("FTL.SCREEN.AUTO_MODE_INIT")/>
	}

</#list></#list>
<#if S("INITIAL_MODE")!="">
	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return ${S("INITIAL_MODE")};
	}

</#if>
	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
<#list A("BLOCK_IDS") as aBlockId>
	<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))||S("${aBlockId}_COMPONENT")="TRE">
		${S("CLASS")}_${S("CLASS_SUFFIX")}.setTableConfig${aBlockId}((${S("CLASS")})this);
	</#if>
</#list>
	}
<#list A("BLOCK_IDS") as aBlockId>
	<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))||S("${aBlockId}_COMPONENT")="TRE">

	/**
	 * [${aBlockId}]ブロックの<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>Table<#else>Tree</#if>の設定
	 */
	protected static void setTableConfig${aBlockId}(${S("CLASS")} p) {
	<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>
<#include F("FTL.SCREEN.AUTO_TABLE_CONFIG")/>
	<#elseif S("${aBlockId}_COMPONENT")="TRE">
		p.${aBlockId}Tree.setKeyColumnName("${S("${aBlockId}_PARENT_NODE_ITEM")}", "${S("${aBlockId}_SELF_NODE_ITEM")}", "${S("${aBlockId}_LABEL_NODE_ITEM")}");
	</#if>
	}
</#if></#list>

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
<#list A("BLOCK_IDS") as aBlockId>
<#list A("${aBlockId}_ITEM_IDS") as anItemId>
<#if !B("${aBlockId}_${anItemId}_IS_LISTPUTTER_OVERRIDE")>
<#if S("${aBlockId}_COMPONENT")="N">
		<#if B("${aBlockId}_${anItemId}_IS_COMBO_TYPE")>
		${aBlockId}_${anItemId}.setListVisibleColumn(MCListLogic.getViewColumnName());
		${aBlockId}_${anItemId}.getListConfig().setPutter(get${aBlockId}_${anItemId}_ListPutter());
		<#else>
			<#if B("${aBlockId}_${anItemId}_IS_FACT_COMBO_TYPE")>
			<#if A("${aBlockId}_${anItemId}_EVENT_OUTS")?size!=0>
<#assign lp_name=S("${aBlockId}_${anItemId}_CMP_ACCESSOR")?replace(".","_")>
		${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setListVisibleColumn(MCListLogic.getViewColumnName());
		${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.getListConfig().setPutter(get${lp_name}_ListPutter());
			</#if>
			</#if>
		</#if>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")=="SF"||S("${aBlockId}_${anItemId}_COMPONENT")=="SFA"||S("${aBlockId}_${anItemId}_COMPONENT")=="FF"||S("${aBlockId}_${anItemId}_COMPONENT")=="FFA">
		${aBlockId}_${anItemId}.getListConfig().setPutter(get${aBlockId}_${anItemId}_ListPutter());
		<#else>
			<#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="SF"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="SFA"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="FF"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="FFA">
			<#if A("${aBlockId}_${anItemId}_EVENT_OUTS")?size!=0>
<#assign lp_name=S("${aBlockId}_${anItemId}_CMP_ACCESSOR")?replace(".","_")>
		${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.getListConfig().setPutter(get${lp_name}_ListPutter());
			</#if>
			</#if>
		</#if>
</#if>
<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>
		<#if B("${aBlockId}_${anItemId}_IS_COMBO_TYPE")>
		column${aBlockId}_${anItemId}.setListVisibleColumn(MCListLogic.getViewColumnName());
		column${aBlockId}_${anItemId}.getListConfig().setPutter(get${aBlockId}_${anItemId}_ListPutter());
		<#else>
			<#if B("${aBlockId}_${anItemId}_IS_FACT_COMBO_TYPE")>
			<#if A("${aBlockId}_${anItemId}_EVENT_OUTS")?size!=0>
<#assign lp_name=S("${aBlockId}_${anItemId}_CMP_ACCESSOR")?replace(".","_")>
		${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setListVisibleColumn(MCListLogic.getViewColumnName());
		${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.getListConfig().setPutter(get${lp_name}_ListPutter());
			</#if>
			</#if>
		</#if>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")=="SF"||S("${aBlockId}_${anItemId}_COMPONENT")=="SFA"||S("${aBlockId}_${anItemId}_COMPONENT")=="FF"||S("${aBlockId}_${anItemId}_COMPONENT")=="FFA">
		column${aBlockId}_${anItemId}.getListConfig().setPutter(get${aBlockId}_${anItemId}_ListPutter());
		<#else>
			<#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="SF"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="SFA"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="FF"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="FFA">
			<#if A("${aBlockId}_${anItemId}_EVENT_OUTS")?size!=0>
<#assign lp_name=S("${aBlockId}_${anItemId}_CMP_ACCESSOR")?replace(".","_")>
		${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.getListConfig().setPutter(get${lp_name}_ListPutter());
			</#if>
			</#if>
		</#if>
</#if>
</#if>
</#list>
</#list>
	}

<#list A("MODE_IDS") as aMode>
<#if !B(aMode + "_IS_MODE_OVERRIDE")>
<#include F("FTL.SCREEN.AUTO_MODE_CLASS")/></#if></#list>

	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		<#assign i=0>
		<#list A("MODE_IDS") as aModeId>
			<#if !B(aModeId + "_IS_MODE_OVERRIDE")>
		<#if i!=0>else </#if>if (${aModeId}.equals(status)) {
			set${aModeId}Status();
		}
		<#assign i=i+1>
			</#if>
		</#list>
	}
<#if !B("STATUS_IS_DEFINED")>

	/**
	 * この画面のステータスを返します。
	 *
	 * @return ステータス
	 */
	public String getStatus() {
		return status;
	}
</#if>

<#list A("BLOCK_IDS") as aBlockId>
<#list A("${aBlockId}_ITEM_IDS") as anItemId>
	<#if B("${aBlockId}_${anItemId}_IS_COMBO_TYPE")||S("${aBlockId}_${anItemId}_COMPONENT")=="SF"||S("${aBlockId}_${anItemId}_COMPONENT")=="SFA"||S("${aBlockId}_${anItemId}_COMPONENT")=="FF"||S("${aBlockId}_${anItemId}_COMPONENT")=="FFA">
	/**
	 * [${aBlockId}_${anItemId}_ListPutter]の作成
	 */
	protected MCListPutter create${aBlockId}_${anItemId}_ListPutter(MCLinkBeans compo, String... columns) {
<#if B("${aBlockId}_${anItemId}_IS_LISTPUTTER_OVERRIDE")>
		MCListPutter lp = super.create${aBlockId}_${anItemId}_ListPutter(compo, columns);
<#else>
		MCListPutter lp = new MCListPutter(compo, columns);
</#if>
<#assign llid=S("${aBlockId}_${anItemId}_RAW_METHOD_TARGET")>
		lp.setListLogicId("${llid}");
		return lp;
	}
	 
	<#else>
		<#if B("${aBlockId}_${anItemId}_IS_FACT_COMBO_TYPE")||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="SF"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="SFA"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="FF"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="FFA">
		<#if A("${aBlockId}_${anItemId}_EVENT_OUTS")?size!=0>
<#assign lp_name=S("${aBlockId}_${anItemId}_CMP_ACCESSOR")?replace(".","_")>
	/**
	 * [${lp_name}_ListPutter]の作成
	 */
	protected MCListPutter create${lp_name}_ListPutter(MCLinkBeans compo, String... columns) {
<#if B("${aBlockId}_${anItemId}_IS_LISTPUTTER_OVERRIDE")>
		MCListPutter lp = super.create${lp_name}_ListPutter(compo, columns);
<#else>
		MCListPutter lp = new MCListPutter(compo, columns);
</#if>
<#assign llid=S("${aBlockId}_${anItemId}_RAW_METHOD_TARGET")>
		lp.setListLogicId("${llid}");
		return lp;
	}

		</#if>
		</#if>
	</#if>
</#list>
</#list>

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
<#list A("CONTAINER_BLOCK_IDS") as aBlockId>
	<#if S("${aBlockId}_COMPONENT")!="$">
		<#list A("${aBlockId}_ITEM_IDS") as anItemId>
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
			<#if B("${aBlockId}_${anItemId}_IS_COMBO_TYPE")||S("${aBlockId}_${anItemId}_COMPONENT")=="SF"||S("${aBlockId}_${anItemId}_COMPONENT")=="SFA"||S("${aBlockId}_${anItemId}_COMPONENT")=="FF"||S("${aBlockId}_${anItemId}_COMPONENT")=="FFA">
		if(combo == <#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>column</#if>${aBlockId}_${anItemId}) return get${aBlockId}_${anItemId}(row, info);
			<#else>
				<#if B("${aBlockId}_${anItemId}_IS_FACT_COMBO_TYPE")||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="SF"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="SFA"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="FF"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="FFA">
				<#if S("${aBlockId}_${anItemId}_EVENT_CLASS")!="">
<#assign lp_name=S("${aBlockId}_${anItemId}_CMP_ACCESSOR")?replace(".","_")>
		if(combo == ${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}) return get${lp_name}(row, info);
				</#if>
				</#if>
			</#if>
</#if>
		</#list>
	</#if>
</#list>
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
<#assign i=0>
<#list A("BLOCK_IDS") as aBlockId>
	<#if S("${aBlockId}_COMPONENT")!="$">
		<#list A("${aBlockId}_ITEM_IDS") as anItemId>
<#if !B("${aBlockId}_${anItemId}_IS_OVERRIDE")>
			<#if B("${aBlockId}_${anItemId}_IS_BUTTON_TYPE")||B("${aBlockId}_${anItemId}_IS_BC_TYPE")||B("${aBlockId}_${anItemId}_IS_PB_TYPE")>
		<#if i!=0>else </#if>if (ap == <#if B("${aBlockId}_${anItemId}_IS_BC_TYPE")>column</#if>${aBlockId}_${anItemId}) do${aBlockId}_${anItemId}(info);
<#assign i=i+1>
			<#elseif B("EXPAND_AND_CONTRACT_${aBlockId}_CPANEL")>
		<#if i!=0>else </#if>if (ap == ${aBlockId}_${anItemId}_PPanel.Ope_srch) do${aBlockId}_${anItemId}_Ope_srch(info);
<#assign i=i+1>
			</#if>
</#if>
		</#list>
	</#if>
</#list>
	}

<#list A("BLOCK_IDS") as aBlockId>
	<#if S("${aBlockId}_COMPONENT")!="$">
		<#list A("${aBlockId}_ITEM_IDS") as anItemId>
<#if !B("${aBlockId}_${anItemId}_IS_OVERRIDE")>
			<#if B("${aBlockId}_${anItemId}_IS_BUTTON_TYPE")||B("${aBlockId}_${anItemId}_IS_BC_TYPE")||B("${aBlockId}_${anItemId}_IS_PB_TYPE")>
	/**
	 * [${aBlockId}]パネルの[${anItemId}]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void do${aBlockId}_${anItemId}(MCEventInfo info);

			<#elseif B("EXPAND_AND_CONTRACT_${aBlockId}_CPANEL")>
	/**
	 * [${aBlockId}]パネルの[${anItemId}_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void do${aBlockId}_${anItemId}_Ope_srch(MCEventInfo info);

			</#if>
</#if>
		</#list>
	</#if>
</#list>
	/**
	 * ValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param vc イベント対象のGUI部品
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (!super.doVCEvent(vc, info)) {
			return false;
		}
<#list A("BLOCK_IDS") as aBlockId>
<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))||S("${aBlockId}_COMPONENT")="TRE"||S("${aBlockId}_COMPONENT")="TAB">
	<#if !B("${aBlockId}_IS_OVERRIDE")>
		if (vc == ${aBlockId}<@PANEL.B_SWING_SUF comp=S("${aBlockId}_COMPONENT")/>) return do${aBlockId}_VC(info);
	</#if>
</#if>
</#list>
<#list A("CONTAINER_BLOCK_IDS") as aBlockId>
	<#if S("${aBlockId}_COMPONENT")!="$">
		<#list A("${aBlockId}_CONTAINER_ITEM_IDS") as anItemId>
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
			<#if B("${aBlockId}_${anItemId}_IS_VCNC_COMPONENT")>
		if (vc == <#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>column</#if>${aBlockId}_${anItemId}<#if S("${aBlockId}_${anItemId}_COMPONENT")="R">_Group</#if>) return do${aBlockId}_${anItemId}_VC(info);
			</#if>
</#if>
		</#list>
	</#if>
</#list>
		return true;
	}

<#list A("BLOCK_IDS") as aBlockId>
	<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))||S("${aBlockId}_COMPONENT")="TRE"||S("${aBlockId}_COMPONENT")="TAB">
		<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
	/**
	 * [${aBlockId}]<@PANEL.B_SWING_SUF comp=S("${aBlockId}_COMPONENT")/>の<#rt>
<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>選択行</#if><#rt>
<#if S("${aBlockId}_COMPONENT")="TRE">選択ノード</#if><#rt>
<#if S("${aBlockId}_COMPONENT")="TAB">選択Tab</#if><#rt>
が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean do${aBlockId}_VC(MCEventInfo info){
		return true;
	}

		</#if>
	</#if>
</#list>
<#list A("CONTAINER_BLOCK_IDS") as aBlockId>
	<#if S("${aBlockId}_COMPONENT")!="$">
		<#list A("${aBlockId}_CONTAINER_ITEM_IDS") as anItemId>
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
			<#if B("${aBlockId}_${anItemId}_IS_VCNC_COMPONENT")>
	/**
	 * [${aBlockId}]パネルの[${anItemId}]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean do${aBlockId}_${anItemId}_VC(MCEventInfo info){
		return true;
	}

			</#if>
</#if>
		</#list>
	</#if>
</#list>
	/**
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
<#assign i=0>
<#list A("BLOCK_IDS") as aBlockId>
<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))||S("${aBlockId}_COMPONENT")="TRE"||S("${aBlockId}_COMPONENT")="TAB">
		<#if i!=0>else </#if>if (nc == ${aBlockId}<@PANEL.B_SWING_SUF comp=S("${aBlockId}_COMPONENT")/>) do${aBlockId}_NC(info);
<#assign i=i+1></#if>
</#if>
</#list>
<#list A("CONTAINER_BLOCK_IDS") as aBlockId>
	<#if S("${aBlockId}_COMPONENT")!="$">
		<#list A("${aBlockId}_CONTAINER_ITEM_IDS") as anItemId>
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
			<#if B("${aBlockId}_${anItemId}_IS_VCNC_COMPONENT")>
		<#if i!=0>else </#if>if (nc == <#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>column</#if>${aBlockId}_${anItemId}<#if S("${aBlockId}_${anItemId}_COMPONENT")="R">_Group</#if>) do${aBlockId}_${anItemId}_NC(info);
<#assign i=i+1>
			</#if>
</#if>
		</#list>
	</#if>
</#list>
	}

<#list A("BLOCK_IDS") as aBlockId>
<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))||S("${aBlockId}_COMPONENT")="TRE"||S("${aBlockId}_COMPONENT")="TAB">
	/**
	 * [${aBlockId}]<@PANEL.B_SWING_SUF comp=S("${aBlockId}_COMPONENT")/>の<#rt>
<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>選択行</#if><#rt>
<#if S("${aBlockId}_COMPONENT")="TRE">選択ノード</#if><#rt>
<#if S("${aBlockId}_COMPONENT")="TAB">選択Tab</#if><#rt>
が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void do${aBlockId}_NC(MCEventInfo info){
	}

</#if>
</#if>
</#list>
<#list A("CONTAINER_BLOCK_IDS") as aBlockId>
	<#if S("${aBlockId}_COMPONENT")!="$">
		<#list A("${aBlockId}_CONTAINER_ITEM_IDS") as anItemId>
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
			<#if B("${aBlockId}_${anItemId}_IS_VCNC_COMPONENT")>
	/**
	 * [${aBlockId}]パネルの[${anItemId}]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void do${aBlockId}_${anItemId}_NC(MCEventInfo info){
	}

			</#if>
</#if>
		</#list>
	</#if>
</#list>
	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
<#assign i=0>
<#list A("BLOCK_IDS") as aBlockId>
<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))||S("${aBlockId}_COMPONENT")="TRE"||S("${aBlockId}_COMPONENT")="TAB">
		<#if i!=0>else </#if>if (ne == ${aBlockId}<@PANEL.B_SWING_SUF comp=S("${aBlockId}_COMPONENT")/>) do${aBlockId}_NE(info);
<#assign i=i+1></#if>
</#if>
</#list>
<#list A("CONTAINER_BLOCK_IDS") as aBlockId>
	<#if S("${aBlockId}_COMPONENT")!="$">
		<#list A("${aBlockId}_CONTAINER_ITEM_IDS") as anItemId>
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
			<#if B("${aBlockId}_${anItemId}_IS_NENX_COMPONENT")>
		<#if i!=0>else </#if>if (ne == <#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>column</#if>${aBlockId}_${anItemId}<#if S("${aBlockId}_${anItemId}_COMPONENT")="R">_Group</#if>) do${aBlockId}_${anItemId}_NE(info);
<#assign i=i+1>
			</#if>
</#if>
		</#list>
	</#if>
</#list>
	}

<#list A("BLOCK_IDS") as aBlockId>
<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))||S("${aBlockId}_COMPONENT")="TRE"||S("${aBlockId}_COMPONENT")="TAB">
	/**
	 * [${aBlockId}]<@PANEL.B_SWING_SUF comp=S("${aBlockId}_COMPONENT")/>のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void do${aBlockId}_NE(MCEventInfo info){
	}

</#if>
</#if>
</#list>
<#list A("CONTAINER_BLOCK_IDS") as aBlockId>
	<#if S("${aBlockId}_COMPONENT")!="$">
		<#list A("${aBlockId}_CONTAINER_ITEM_IDS") as anItemId>
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
			<#if B("${aBlockId}_${anItemId}_IS_NENX_COMPONENT")>
	/**
	 * [${aBlockId}]パネルの[${anItemId}]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void do${aBlockId}_${anItemId}_NE(MCEventInfo info){
	}

			</#if>
</#if>
		</#list>
	</#if>
</#list>
	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
<#assign i=0>
<#list A("BLOCK_IDS") as aBlockId>
<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))||S("${aBlockId}_COMPONENT")="TRE"||S("${aBlockId}_COMPONENT")="TAB">
		<#if i!=0>else </#if>if (nx == ${aBlockId}<@PANEL.B_SWING_SUF comp=S("${aBlockId}_COMPONENT")/>) do${aBlockId}_NX(info);
<#assign i=i+1></#if>
</#if>
</#list>
<#list A("CONTAINER_BLOCK_IDS") as aBlockId>
	<#if S("${aBlockId}_COMPONENT")!="$">
		<#list A("${aBlockId}_CONTAINER_ITEM_IDS") as anItemId>
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
			<#if B("${aBlockId}_${anItemId}_IS_NENX_COMPONENT")>
		<#if i!=0>else </#if>if (nx == <#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>column</#if>${aBlockId}_${anItemId}<#if S("${aBlockId}_${anItemId}_COMPONENT")="R">_Group</#if>) do${aBlockId}_${anItemId}_NX(info);
<#assign i=i+1>
			</#if>
</#if>
		</#list>
	</#if>
</#list>
	}

<#list A("BLOCK_IDS") as aBlockId>
<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))||S("${aBlockId}_COMPONENT")="TRE"||S("${aBlockId}_COMPONENT")="TAB">
	/**
	 * [${aBlockId}]<@PANEL.B_SWING_SUF comp=S("${aBlockId}_COMPONENT")/>のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void do${aBlockId}_NX(MCEventInfo info){
	}

</#if>
</#if>
</#list>
<#list A("CONTAINER_BLOCK_IDS") as aBlockId>
	<#if S("${aBlockId}_COMPONENT")!="$">
		<#list A("${aBlockId}_CONTAINER_ITEM_IDS") as anItemId>
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
			<#if B("${aBlockId}_${anItemId}_IS_NENX_COMPONENT")>
	/**
	 * [${aBlockId}]パネルの[${anItemId}]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void do${aBlockId}_${anItemId}_NX(MCEventInfo info){
	}

			</#if>
</#if>
		</#list>
	</#if>
</#list>
	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
<#assign i=0>
<#list A("CONTAINER_BLOCK_IDS") as aBlockId>
	<#if S("${aBlockId}_COMPONENT")!="$">
		<#list A("${aBlockId}_CONTAINER_ITEM_IDS") as anItemId>
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
			<#if B("${aBlockId}_${anItemId}_IS_LC_COMPONENT")>
		<#if i!=0>else </#if>if (lc == <#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>column</#if>${aBlockId}_${anItemId}<#if S("${aBlockId}_${anItemId}_COMPONENT")="R">_Group</#if>) do${aBlockId}_${anItemId}_LC(info);
<#assign i=i+1>
			</#if>
</#if>
		</#list>
	</#if>
</#list>
	}

<#list A("CONTAINER_BLOCK_IDS") as aBlockId>
	<#if S("${aBlockId}_COMPONENT")!="$">
		<#list A("${aBlockId}_CONTAINER_ITEM_IDS") as anItemId>
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
			<#if B("${aBlockId}_${anItemId}_IS_LC_COMPONENT")>
	/**
	 * [${aBlockId}]パネルの[${anItemId}]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void do${aBlockId}_${anItemId}_LC(MCEventInfo info){
	}

			</#if>
</#if>
		</#list>
	</#if>
</#list>
<#list A("CONTAINER_BLOCK_IDS") as aBlockId>
	<#if S("${aBlockId}_COMPONENT")!="$">
		<#list A("${aBlockId}_ITEM_IDS") as anItemId>
<#if !(B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")&&S("${aBlockId}_${anItemId}_EVENT_CLASS")=="")>
			<#if B("${aBlockId}_${anItemId}_IS_COMBO_TYPE")||S("${aBlockId}_${anItemId}_COMPONENT")=="SF"||S("${aBlockId}_${anItemId}_COMPONENT")=="SFA"||S("${aBlockId}_${anItemId}_COMPONENT")=="FF"||S("${aBlockId}_${anItemId}_COMPONENT")=="FFA">
	/**
	 * コンボ／リストのリスト[<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>column</#if>${aBlockId}_${anItemId}]の作成メソッド
	 */
	public MCList get${aBlockId}_${anItemId}(MCRow row, MCEventInfo info){
<#if S("${aBlockId}_${anItemId}_EVENT_CLASS")!="">
		return ((${S("${aBlockId}_${anItemId}_EVENT_CLASS")})MCListLogic.create("${S("${aBlockId}_${anItemId}_EVENT_CLASS")}", this)).${S("${aBlockId}_${anItemId}_EVENT_METHOD")}(row, info);
<#else>
		return null;
</#if>
	}

			<#else>
					<#if B("${aBlockId}_${anItemId}_IS_FACT_COMBO_TYPE")||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="SF"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="SFA"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="FF"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="FFA">
					<#if S("${aBlockId}_${anItemId}_EVENT_CLASS")!="">
<#assign lp_name=S("${aBlockId}_${anItemId}_CMP_ACCESSOR")?replace(".","_")>
	/**
	 * コンボ／リストのリスト[${lp_name}]の作成メソッド
	 */
	public MCList get${lp_name}(MCRow row, MCEventInfo info){
		return ((${S("${aBlockId}_${anItemId}_EVENT_CLASS")})MCListLogic.create("${S("${aBlockId}_${anItemId}_EVENT_CLASS")}", this)).${S("${aBlockId}_${anItemId}_EVENT_METHOD")}(row, info);
	}

					</#if>
					</#if>
			</#if>
</#if>
		</#list>
	</#if>
</#list>
	@Override
	public MCCallerPanelBridge createBridge(String id) {
<#list A("TELEGRAM_IDS") as aTelId>
		if (id.equals("${aTelId}")) {
			return new ${aTelId?replace(".","_")}Bridge();
		}
</#list>
		return super.createBridge(id);
	}
<#list A("TELEGRAM_IDS") as aTelId>
<#include F("FTL.SCREEN.AUTO_PROC_CLASS")/>
</#list>