package mcframe.clientMGBB.MGBBP0400;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.text.*;
import mcframe.clientCore.beans.list.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.param.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonCore.meta.MCMeta;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.beans.popup.MCTextPopupMenuItem;
import mcframe.clientCore.beans.text.MCInputMethodType;
import mcframe.clientMGBB.MGBBP0400.MGBBP_ActItmCopyReg_MC.MG_MGBBL0400_Ins01Caller;

/**
 * 画面"MGBBP_ActItmCopyReg"パネルクラスです。<p>
 *
 * 原価実績品目情報をコピーする。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBBP_ActItmCopyReg_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBBP0400";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_act_calc_ctg_cd_Label = null;
	/**
	 * Calculation category cd. (Copy from) コピー元計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_act_calc_ctg_cd = null;
	/**
	 * Calculation category name (Copy from) コピー元計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Cnd_act_calc_ctg_nm = null;
	public MCLabel Cnd_wg_cd_Label = null;
	/**
	 * Copy source WG cd. コピー元ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_cd = null;
	/**
	 * Copy source WG cd. name コピー元ワーキンググループＣＤ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
	public MCLabel Cnd_ym_fr_Label = null;
	/**
	 * Date FROM (Copy from) コピー元年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ym_fr = null;
	public MCLabel Cnd_ym_to_Label = null;
	/**
	 * Date TO (Copy from) コピー元年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ym_to = null;
	public MCLabel Cnd_calc_ctg_cd_Label = null;
	/**
	 * Calculation category cd. (Copy to) コピー先計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_ctg_cd = null;
	/**
	 * Calculation category name (Copy to) コピー先計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_ctg_nm = null;
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H Cnd_term_p_PPanel;
	public MCDateComboBox Cnd_term;	// [Cnd]の[term_p.term]を[Cnd_term]としてエイリアス定義。
	public MCLabel Cnd_ptn_set_typ_Label = null;
	/**
	 * BOM/Operation pattern setting type (Copy to) コピー先構成/工程パタン設定区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ptn_set_typ = null;
	/**
	 * BOM/Operation pattern setting type name (Copy to) コピー先構成/工程パタン設定区分名.<p>
	 *
	 */
	public MCTextField Cnd_ptn_set_typ_nm = null;
	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_flg = null;
	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public MCCheckBox Cnd_dtl_flg = null;
	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public MCCheckBox Cnd_oper_flg = null;
	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public MCCheckBox Cnd_bom_flg = null;
	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public MCCheckBox Cnd_wk_flg = null;
	/**
	 * Cost item purchase unit price 原価品目購買単価.<p>
	 *
	 */
	public MCCheckBox Cnd_purc_flg = null;
	/**
	 * Cost item subcontracting unit price 原価品目加工単価.<p>
	 *
	 */
	public MCCheckBox Cnd_proc_flg = null;
	/**
	 * Cost item supply unit price 原価品目支給単価.<p>
	 *
	 */
	public MCCheckBox Cnd_prov_flg = null;
	/**
	 * Cost item sales unit price 原価品目販売単価.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_flg = null;
	// [To]ブロック関連のField定義
	public MCPanel ToPanel = null;
	public MCTitledBorder ToTitledBorder = null;
	// [To]ブロックの項目のField定義
	// [Tgt]ブロック関連のField定義
	public MCPanel TgtPanel = null;
	public MCTitledBorder TgtTitledBorder = null;
	// [Tgt]ブロックの項目のField定義
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Btn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Btn_deselect_all = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Cost item info. entry 原価品目情報登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0500 = null;
	/**
	 * Cost item details entry 原価品目詳細登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0510 = null;
	/**
	 * Cost item operation entry 原価品目工程登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0560 = null;
	/**
	 * Cost BOM list entry 原価ＢＯＭ一覧登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0530 = null;
	/**
	 * Cost item man-hour entry 原価品目工数登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0580 = null;
	/**
	 * Cost item purchase unit price entry 原価品目購買単価登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0600 = null;
	/**
	 * Cost item subcontracting unit price entry 原価品目加工単価登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0660 = null;
	/**
	 * Cost item supply unit price entry 原価品目支給単価登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0610 = null;
	/**
	 * Cost item sales unit price info. 原価品目販売単価登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0590 = null;
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX};
	
	/** [MG_MGBBL0400_Ins01]のCallerの作成 */
	protected MGBBP_ActItmCopyReg_MC.MG_MGBBL0400_Ins01Caller createMG_MGBBL0400_Ins01() {
		MGBBP_ActItmCopyReg_MC.MG_MGBBL0400_Ins01Caller<MGBBP_ActItmCopyReg, MG_MGBBL0400_Ins01Bridge>
		caller = ((MGBBP_ActItmCopyReg_MC)this).new MG_MGBBL0400_Ins01Caller<MGBBP_ActItmCopyReg, MG_MGBBL0400_Ins01Bridge>(
					(MGBBP_ActItmCopyReg)this, new MG_MGBBL0400_Ins01Bridge());
		return caller;
	}
	/** [MG_MGBBL0400_Ins01]の呼び出し */
	protected void callMG_MGBBL0400_Ins01() {
		MCCaller caller = createMG_MGBBL0400_Ins01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBB.MGBBP0400.CndR aCndR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBB.MGBBP0400.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBB.MGBBP0400.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBB.MGBBP0400.CndR createCndR() {
		return mcframe.clientMGBB.MGBBP0400.CndR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		return ret;
	}

	/**
	 * コンテナに対応したブロックのIDを返します。
	 *
	 * 引数のコンテナに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return ブロックID
	 */
	public String getBlockId(MCContainer aCnt){
		if(aCnt == null) return null;
		if(aCnt == getCndR()) return "Cnd";
		return super.getBlockId(aCnt);
	}

	/**
	 * ブロックIDに対応したコンテナを返します。
	 *
	 * 引数のブロックIDに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return コンテナ
	 */
	public MCContainer getContainer(String bId){
		if(bId == null) return null;
		if(bId.equals("Cnd")) return getCndR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(CndPanel);
		ret.add(ToPanel);
		ret.add(TgtPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_ActItmCopyReg_MC_A() {
		aCndR = createCndR();

	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBBP_ActItmCopyReg_MC.jbCreateCnd((MGBBP_ActItmCopyReg)this);
		MGBBP_ActItmCopyReg_MC.jbCreateTo((MGBBP_ActItmCopyReg)this);
		MGBBP_ActItmCopyReg_MC.jbCreateTgt((MGBBP_ActItmCopyReg)this);
		MGBBP_ActItmCopyReg_MC.jbCreateBtn((MGBBP_ActItmCopyReg)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBBP_ActItmCopyReg p) {
		p.Cnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getCndR().term_p());
		p.Cnd_term_p_PPanel.setName("Cnd.term_p");
		p.Cnd_term = p.Cnd_term_p_PPanel.Term_term;
		p.Cnd_term.addAliasName("Cnd.term", p);
	}

	/**
	 * [To]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTo(MGBBP_ActItmCopyReg p) {
	}

	/**
	 * [Tgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTgt(MGBBP_ActItmCopyReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBBP_ActItmCopyReg p) {
	}

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

	
	/** [Cnd_act_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_act_calc_ctg_cd_p = null;

	/**
	 * [Cnd_act_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_act_calc_ctg_cd_ListPutter() {
		if (Cnd_act_calc_ctg_cd_p == null) {
			Cnd_act_calc_ctg_cd_p = createCnd_act_calc_ctg_cd_ListPutter(Cnd_act_calc_ctg_cd, "act_calc_ctg_cd", "act_calc_ctg_nm");

		}
		return Cnd_act_calc_ctg_cd_p;
	}
	
	
	/** [Cnd_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_wg_cd_p = null;

	/**
	 * [Cnd_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wg_cd_ListPutter() {
		if (Cnd_wg_cd_p == null) {
			Cnd_wg_cd_p = createCnd_wg_cd_ListPutter(Cnd_wg_cd, "wg_cd", "wg_nm");

		}
		return Cnd_wg_cd_p;
	}
	
	
	/** [Cnd_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_calc_ctg_cd_p = null;

	/**
	 * [Cnd_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_ctg_cd_ListPutter() {
		if (Cnd_calc_ctg_cd_p == null) {
			Cnd_calc_ctg_cd_p = createCnd_calc_ctg_cd_ListPutter(Cnd_calc_ctg_cd, "calc_ctg_cd", "calc_ctg_nm");

		}
		return Cnd_calc_ctg_cd_p;
	}
	
	
	/** [Cnd_ptn_set_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ptn_set_typ_p = null;

	/**
	 * [Cnd_ptn_set_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ptn_set_typ_ListPutter() {
		if (Cnd_ptn_set_typ_p == null) {
			Cnd_ptn_set_typ_p = createCnd_ptn_set_typ_ListPutter(Cnd_ptn_set_typ, "ptn_set_typ", "ptn_set_typ_nm");

		}
		return Cnd_ptn_set_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBBP_ActItmCopyReg create(){
		MGBBP_ActItmCopyReg p = new MGBBP_ActItmCopyReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}


	/**
	 * 画面部品初期設定
	 */
	protected void jbInit() {
		super.jbInit();
		MGBBP_ActItmCopyReg_MC.jbfInitCnd((MGBBP_ActItmCopyReg)this);
		MGBBP_ActItmCopyReg_MC.jbfInitTo((MGBBP_ActItmCopyReg)this);
		MGBBP_ActItmCopyReg_MC.jbfInitTgt((MGBBP_ActItmCopyReg)this);
		MGBBP_ActItmCopyReg_MC.jbfInitBtn((MGBBP_ActItmCopyReg)this);
		MGBBP_ActItmCopyReg_MC.jbInitCnd((MGBBP_ActItmCopyReg)this);
		MGBBP_ActItmCopyReg_MC.jbInitTo((MGBBP_ActItmCopyReg)this);
		MGBBP_ActItmCopyReg_MC.jbInitTgt((MGBBP_ActItmCopyReg)this);
		MGBBP_ActItmCopyReg_MC.jbInitBtn((MGBBP_ActItmCopyReg)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBBP_ActItmCopyReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_act_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.act_calc_ctg_cd_Label");
		p.Cnd_act_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.act_calc_ctg_cd");
		p.Cnd_act_calc_ctg_cd.setLabel(p.Cnd_act_calc_ctg_cd_Label);
		p.Cnd_act_calc_ctg_nm = p.beansFactory.createTextField("Cnd.act_calc_ctg_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_ym_fr_Label = p.beansFactory.createLabel("Cnd.ym_fr_Label");
		p.Cnd_ym_fr = p.beansFactory.createDateField("Cnd.ym_fr");
		p.Cnd_ym_fr.setLabel(p.Cnd_ym_fr_Label);
		p.Cnd_ym_to_Label = p.beansFactory.createLabel("Cnd.ym_to_Label");
		p.Cnd_ym_to = p.beansFactory.createDateField("Cnd.ym_to");
		p.Cnd_ym_to.setLabel(p.Cnd_ym_to_Label);
		p.Cnd_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.calc_ctg_cd_Label");
		p.Cnd_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.calc_ctg_cd");
		p.Cnd_calc_ctg_cd.setLabel(p.Cnd_calc_ctg_cd_Label);
		p.Cnd_calc_ctg_nm = p.beansFactory.createTextField("Cnd.calc_ctg_nm");
		p.Cnd_ptn_set_typ_Label = p.beansFactory.createLabel("Cnd.ptn_set_typ_Label");
		p.Cnd_ptn_set_typ = p.beansFactory.createTextComboBox("Cnd.ptn_set_typ");
		p.Cnd_ptn_set_typ.setLabel(p.Cnd_ptn_set_typ_Label);
		p.Cnd_ptn_set_typ_nm = p.beansFactory.createTextField("Cnd.ptn_set_typ_nm");
		p.Cnd_itm_flg = p.beansFactory.createCheckBox("Cnd.itm_flg");
		p.Cnd_dtl_flg = p.beansFactory.createCheckBox("Cnd.dtl_flg");
		p.Cnd_oper_flg = p.beansFactory.createCheckBox("Cnd.oper_flg");
		p.Cnd_bom_flg = p.beansFactory.createCheckBox("Cnd.bom_flg");
		p.Cnd_wk_flg = p.beansFactory.createCheckBox("Cnd.wk_flg");
		p.Cnd_purc_flg = p.beansFactory.createCheckBox("Cnd.purc_flg");
		p.Cnd_proc_flg = p.beansFactory.createCheckBox("Cnd.proc_flg");
		p.Cnd_prov_flg = p.beansFactory.createCheckBox("Cnd.prov_flg");
		p.Cnd_sls_flg = p.beansFactory.createCheckBox("Cnd.sls_flg");
	}

	/**
	 * [To]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTo(MGBBP_ActItmCopyReg p) {
		// ブロック関連の初期化
		p.ToPanel = p.beansFactory.createPanel("To");
		p.ToTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTgt(MGBBP_ActItmCopyReg p) {
		// ブロック関連の初期化
		p.TgtPanel = p.beansFactory.createPanel("Tgt");
		p.TgtTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBBP_ActItmCopyReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_open_MGBDP0500 = p.beansFactory.createButton("Btn.open_MGBDP0500", "open");
		p.Btn_open_MGBDP0510 = p.beansFactory.createButton("Btn.open_MGBDP0510", "open");
		p.Btn_open_MGBDP0560 = p.beansFactory.createButton("Btn.open_MGBDP0560", "open");
		p.Btn_open_MGBDP0530 = p.beansFactory.createButton("Btn.open_MGBDP0530", "open");
		p.Btn_open_MGBDP0580 = p.beansFactory.createButton("Btn.open_MGBDP0580", "open");
		p.Btn_open_MGBDP0600 = p.beansFactory.createButton("Btn.open_MGBDP0600", "open");
		p.Btn_open_MGBDP0660 = p.beansFactory.createButton("Btn.open_MGBDP0660", "open");
		p.Btn_open_MGBDP0610 = p.beansFactory.createButton("Btn.open_MGBDP0610", "open");
		p.Btn_open_MGBDP0590 = p.beansFactory.createButton("Btn.open_MGBDP0590", "open");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBBP_ActItmCopyReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.ToPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Cnd_act_calc_ctg_cd.setListType(MCListType.STRICT);
		p.setPluralValueEnable(p.Cnd_act_calc_ctg_cd, true);
		p.Cnd_act_calc_ctg_cd.setLinkBeans(p.Cnd_act_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_act_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_act_calc_ctg_cd);
		p.CndPanel.setLastBeans(p.Cnd_act_calc_ctg_cd);
		p.Cnd_act_calc_ctg_cd.setNextBeans(p.Cnd_act_calc_ctg_nm);
		p.Cnd_act_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0400.CndR.act_calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_act_calc_ctg_nm);
		p.Cnd_act_calc_ctg_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_act_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0400.CndR.act_calc_ctg_nm_META);
		p.Cnd_wg_cd.setListType(MCListType.STRICT);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0400.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_ym_fr);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0400.CndR.wg_nm_META);
		p.CndPanel.add(p.Cnd_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ym_fr);
		p.Cnd_ym_fr.setNextBeans(p.Cnd_ym_to);
		p.Cnd_ym_fr.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0400.CndR.ym_fr_META);
		p.Cnd_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ym_to_Label);
		p.CndPanel.add(p.Cnd_ym_to);
		p.Cnd_ym_to.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0400.CndR.ym_to_META);
		p.Cnd_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_calc_ctg_cd.setListType(MCListType.STRICT);
		p.Cnd_calc_ctg_cd.setLinkBeans(p.Cnd_calc_ctg_nm);
		p.ToPanel.add(p.Cnd_calc_ctg_cd_Label);
		p.ToPanel.add(p.Cnd_calc_ctg_cd);
		p.ToPanel.setLastBeans(p.Cnd_calc_ctg_cd);
		p.Cnd_calc_ctg_cd.setNextBeans(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0400.CndR.calc_ctg_cd_META);
		p.ToPanel.add(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_nm.setNextBeans(p.Cnd_term_p_PPanel);
		p.Cnd_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0400.CndR.calc_ctg_nm_META);
		p.ToPanel.add(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_ptn_set_typ);
		p.Cnd_ptn_set_typ.setListType(MCListType.STRICT);
		p.Cnd_ptn_set_typ.setLinkBeans(p.Cnd_ptn_set_typ_nm);
		p.ToPanel.add(p.Cnd_ptn_set_typ_Label);
		p.ToPanel.add(p.Cnd_ptn_set_typ);
		p.Cnd_ptn_set_typ.setNextBeans(p.Cnd_ptn_set_typ_nm);
		p.Cnd_ptn_set_typ.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0400.CndR.ptn_set_typ_META);
		p.ToPanel.add(p.Cnd_ptn_set_typ_nm);
		p.Cnd_ptn_set_typ_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0400.CndR.ptn_set_typ_nm_META);
		p.TgtPanel.add(p.Cnd_itm_flg);
		p.TgtPanel.setLastBeans(p.Cnd_itm_flg);
		p.Cnd_itm_flg.setNextBeans(p.Cnd_dtl_flg);
		p.Cnd_itm_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0400.CndR.itm_flg_META);
		p.TgtPanel.add(p.Cnd_dtl_flg);
		p.Cnd_dtl_flg.setNextBeans(p.Cnd_oper_flg);
		p.Cnd_dtl_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0400.CndR.dtl_flg_META);
		p.TgtPanel.add(p.Cnd_oper_flg);
		p.Cnd_oper_flg.setNextBeans(p.Cnd_bom_flg);
		p.Cnd_oper_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0400.CndR.oper_flg_META);
		p.TgtPanel.add(p.Cnd_bom_flg);
		p.Cnd_bom_flg.setNextBeans(p.Cnd_wk_flg);
		p.Cnd_bom_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0400.CndR.bom_flg_META);
		p.TgtPanel.add(p.Cnd_wk_flg);
		p.Cnd_wk_flg.setNextBeans(p.Cnd_purc_flg);
		p.Cnd_wk_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0400.CndR.wk_flg_META);
		p.TgtPanel.add(p.Cnd_purc_flg);
		p.Cnd_purc_flg.setNextBeans(p.Cnd_proc_flg);
		p.Cnd_purc_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0400.CndR.purc_flg_META);
		p.TgtPanel.add(p.Cnd_proc_flg);
		p.Cnd_proc_flg.setNextBeans(p.Cnd_prov_flg);
		p.Cnd_proc_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0400.CndR.proc_flg_META);
		p.TgtPanel.add(p.Cnd_prov_flg);
		p.Cnd_prov_flg.setNextBeans(p.Cnd_sls_flg);
		p.Cnd_prov_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0400.CndR.prov_flg_META);
		p.TgtPanel.add(p.Cnd_sls_flg);
		p.Cnd_sls_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0400.CndR.sls_flg_META);
	}

	/**
	 * [To]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTo(MGBBP_ActItmCopyReg p) {
		// ブロック関連の初期化
		p.ToPanel.setBorder(p.ToTitledBorder);
		p.add(p.ToPanel);
		p.ToPanel.setNextBeans(p.TgtPanel);
		p.ToPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Tgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTgt(MGBBP_ActItmCopyReg p) {
		// ブロック関連の初期化
		p.TgtPanel.setBorder(p.TgtTitledBorder);
		p.add(p.TgtPanel);
		p.TgtPanel.setNextBeans(p.BtnPanel);
		p.TgtPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBBP_ActItmCopyReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_open_MGBDP0500);
		p.Btn_open_MGBDP0500.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MGBDP0500);
		p.Btn_open_MGBDP0500.setNextBeans(p.Btn_open_MGBDP0510);
		p.Btn_open_MGBDP0510.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MGBDP0510);
		p.Btn_open_MGBDP0510.setNextBeans(p.Btn_open_MGBDP0560);
		p.Btn_open_MGBDP0560.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MGBDP0560);
		p.Btn_open_MGBDP0560.setNextBeans(p.Btn_open_MGBDP0530);
		p.Btn_open_MGBDP0530.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_open_MGBDP0530);
		p.Btn_open_MGBDP0530.setNextBeans(p.Btn_open_MGBDP0580);
		p.Btn_open_MGBDP0580.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_open_MGBDP0580);
		p.Btn_open_MGBDP0580.setNextBeans(p.Btn_open_MGBDP0600);
		p.Btn_open_MGBDP0600.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_open_MGBDP0600);
		p.Btn_open_MGBDP0600.setNextBeans(p.Btn_open_MGBDP0660);
		p.Btn_open_MGBDP0660.setFunctionKey(MCFunctionKey.F15);
		p.BtnPanel.add(p.Btn_open_MGBDP0660);
		p.Btn_open_MGBDP0660.setNextBeans(p.Btn_open_MGBDP0610);
		p.Btn_open_MGBDP0610.setFunctionKey(MCFunctionKey.F16);
		p.BtnPanel.add(p.Btn_open_MGBDP0610);
		p.Btn_open_MGBDP0610.setNextBeans(p.Btn_open_MGBDP0590);
		p.Btn_open_MGBDP0590.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_open_MGBDP0590);
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MGBBP_ActItmCopyReg_MC.mcInitCnd((MGBBP_ActItmCopyReg)this);
		MGBBP_ActItmCopyReg_MC.mcInitTo((MGBBP_ActItmCopyReg)this);
		MGBBP_ActItmCopyReg_MC.mcInitTgt((MGBBP_ActItmCopyReg)this);
		MGBBP_ActItmCopyReg_MC.mcInitBtn((MGBBP_ActItmCopyReg)this);

		// [UPD]ステータスのモードの設定
		MGBBP_ActItmCopyReg_MC.statusInitUPD_Cnd((MGBBP_ActItmCopyReg)this);
		MGBBP_ActItmCopyReg_MC.statusInitUPD_To((MGBBP_ActItmCopyReg)this);
		MGBBP_ActItmCopyReg_MC.statusInitUPD_Tgt((MGBBP_ActItmCopyReg)this);
		MGBBP_ActItmCopyReg_MC.statusInitUPD_Btn((MGBBP_ActItmCopyReg)this);

		// [FIX]ステータスのモードの設定
		MGBBP_ActItmCopyReg_MC.statusInitFIX_Cnd((MGBBP_ActItmCopyReg)this);
		MGBBP_ActItmCopyReg_MC.statusInitFIX_To((MGBBP_ActItmCopyReg)this);
		MGBBP_ActItmCopyReg_MC.statusInitFIX_Tgt((MGBBP_ActItmCopyReg)this);
		MGBBP_ActItmCopyReg_MC.statusInitFIX_Btn((MGBBP_ActItmCopyReg)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBBP_ActItmCopyReg p) {
		p.Cnd_act_calc_ctg_cd.setListListener(p);
		p.Cnd_act_calc_ctg_cd.addAllListener(p);
		p.Cnd_act_calc_ctg_nm.setListListener(p);
		p.Cnd_act_calc_ctg_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_ym_fr.setListListener(p);
		p.Cnd_ym_fr.addAllListener(p);
		p.Cnd_ym_to.setListListener(p);
		p.Cnd_ym_to.addAllListener(p);
		p.Cnd_calc_ctg_cd.setListListener(p);
		p.Cnd_calc_ctg_cd.addAllListener(p);
		p.Cnd_calc_ctg_nm.setListListener(p);
		p.Cnd_calc_ctg_nm.addAllListener(p);
		p.Cnd_ptn_set_typ.setListListener(p);
		p.Cnd_ptn_set_typ.addAllListener(p);
		p.Cnd_ptn_set_typ_nm.setListListener(p);
		p.Cnd_ptn_set_typ_nm.addAllListener(p);
		p.Cnd_itm_flg.addAllListener(p);
		p.Cnd_dtl_flg.addAllListener(p);
		p.Cnd_oper_flg.addAllListener(p);
		p.Cnd_bom_flg.addAllListener(p);
		p.Cnd_wk_flg.addAllListener(p);
		p.Cnd_purc_flg.addAllListener(p);
		p.Cnd_proc_flg.addAllListener(p);
		p.Cnd_prov_flg.addAllListener(p);
		p.Cnd_sls_flg.addAllListener(p);
	}

	/**
	 *  [To]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTo(MGBBP_ActItmCopyReg p) {
	}

	/**
	 *  [Tgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTgt(MGBBP_ActItmCopyReg p) {
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBBP_ActItmCopyReg p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_open_MGBDP0500.addAllListener(p);
		p.Btn_open_MGBDP0500.setAPMethodName("doBtn_open_MGBDP0500");
		p.Btn_open_MGBDP0510.addAllListener(p);
		p.Btn_open_MGBDP0510.setAPMethodName("doBtn_open_MGBDP0510");
		p.Btn_open_MGBDP0560.addAllListener(p);
		p.Btn_open_MGBDP0560.setAPMethodName("doBtn_open_MGBDP0560");
		p.Btn_open_MGBDP0530.addAllListener(p);
		p.Btn_open_MGBDP0530.setAPMethodName("doBtn_open_MGBDP0530");
		p.Btn_open_MGBDP0580.addAllListener(p);
		p.Btn_open_MGBDP0580.setAPMethodName("doBtn_open_MGBDP0580");
		p.Btn_open_MGBDP0600.addAllListener(p);
		p.Btn_open_MGBDP0600.setAPMethodName("doBtn_open_MGBDP0600");
		p.Btn_open_MGBDP0660.addAllListener(p);
		p.Btn_open_MGBDP0660.setAPMethodName("doBtn_open_MGBDP0660");
		p.Btn_open_MGBDP0610.addAllListener(p);
		p.Btn_open_MGBDP0610.setAPMethodName("doBtn_open_MGBDP0610");
		p.Btn_open_MGBDP0590.addAllListener(p);
		p.Btn_open_MGBDP0590.setAPMethodName("doBtn_open_MGBDP0590");
	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MGBBP_ActItmCopyReg p){
		p.Cnd_act_calc_ctg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_act_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ym_fr.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ym_to.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_ptn_set_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ptn_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_itm_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_dtl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_oper_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_bom_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_wk_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_proc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_prov_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sls_flg.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[To]ブロックのモードの設定
	 */
	protected static void statusInitUPD_To(MGBBP_ActItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tgt(MGBBP_ActItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MGBBP_ActItmCopyReg p){
		p.Btn_select_all.putMode(p, UPD, MCMode.REQUIRED);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.REQUIRED);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBDP0500.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBDP0510.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBDP0560.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBDP0530.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBDP0580.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBDP0600.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBDP0660.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBDP0610.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBDP0590.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MGBBP_ActItmCopyReg p){
		p.Cnd_act_calc_ctg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_act_calc_ctg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_ym_fr.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_ym_to.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Cnd_ptn_set_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_ptn_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_itm_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_dtl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_oper_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_bom_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_wk_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_purc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_proc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_prov_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_sls_flg.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[To]ブロックのモードの設定
	 */
	protected static void statusInitFIX_To(MGBBP_ActItmCopyReg p){

	}

	/**
	 * [FIX]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tgt(MGBBP_ActItmCopyReg p){

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MGBBP_ActItmCopyReg p){
		p.Btn_select_all.putMode(p, FIX, MCMode.READ_ONLY);
		p.Btn_deselect_all.putMode(p, FIX, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_open_MGBDP0500.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MGBDP0510.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MGBDP0560.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MGBDP0530.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MGBDP0580.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MGBDP0600.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MGBDP0660.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MGBDP0610.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MGBDP0590.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return UPD;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_act_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_act_calc_ctg_cd.getListConfig().setPutter(getCnd_act_calc_ctg_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_ctg_cd.getListConfig().setPutter(getCnd_calc_ctg_cd_ListPutter());
		Cnd_ptn_set_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ptn_set_typ.getListConfig().setPutter(getCnd_ptn_set_typ_ListPutter());
	}

	/**
	 * この画面を[UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPDStatus() {
		status = UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIXStatus() {
		status = FIX;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
		}
	}

	/**
	 * [Cnd_act_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_act_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [Cnd_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [Cnd_ptn_set_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ptn_set_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.PtnSetTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_act_calc_ctg_cd) return getCnd_act_calc_ctg_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_calc_ctg_cd) return getCnd_calc_ctg_cd(row, info);
		if(combo == Cnd_ptn_set_typ) return getCnd_ptn_set_typ(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_open_MGBDP0500) doBtn_open_MGBDP0500(info);
		else if (ap == Btn_open_MGBDP0510) doBtn_open_MGBDP0510(info);
		else if (ap == Btn_open_MGBDP0560) doBtn_open_MGBDP0560(info);
		else if (ap == Btn_open_MGBDP0530) doBtn_open_MGBDP0530(info);
		else if (ap == Btn_open_MGBDP0580) doBtn_open_MGBDP0580(info);
		else if (ap == Btn_open_MGBDP0600) doBtn_open_MGBDP0600(info);
		else if (ap == Btn_open_MGBDP0660) doBtn_open_MGBDP0660(info);
		else if (ap == Btn_open_MGBDP0610) doBtn_open_MGBDP0610(info);
		else if (ap == Btn_open_MGBDP0590) doBtn_open_MGBDP0590(info);
	}

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0500]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0500(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0510]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0510(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0560]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0560(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0530]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0530(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0580]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0580(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0600]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0600(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0660]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0660(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0610]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0610(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0590]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0590(MCEventInfo info);

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
		if (vc == Cnd_act_calc_ctg_cd) return doCnd_act_calc_ctg_cd_VC(info);
		if (vc == Cnd_act_calc_ctg_nm) return doCnd_act_calc_ctg_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_ym_fr) return doCnd_ym_fr_VC(info);
		if (vc == Cnd_ym_to) return doCnd_ym_to_VC(info);
		if (vc == Cnd_calc_ctg_cd) return doCnd_calc_ctg_cd_VC(info);
		if (vc == Cnd_calc_ctg_nm) return doCnd_calc_ctg_nm_VC(info);
		if (vc == Cnd_ptn_set_typ) return doCnd_ptn_set_typ_VC(info);
		if (vc == Cnd_ptn_set_typ_nm) return doCnd_ptn_set_typ_nm_VC(info);
		if (vc == Cnd_itm_flg) return doCnd_itm_flg_VC(info);
		if (vc == Cnd_dtl_flg) return doCnd_dtl_flg_VC(info);
		if (vc == Cnd_oper_flg) return doCnd_oper_flg_VC(info);
		if (vc == Cnd_bom_flg) return doCnd_bom_flg_VC(info);
		if (vc == Cnd_wk_flg) return doCnd_wk_flg_VC(info);
		if (vc == Cnd_purc_flg) return doCnd_purc_flg_VC(info);
		if (vc == Cnd_proc_flg) return doCnd_proc_flg_VC(info);
		if (vc == Cnd_prov_flg) return doCnd_prov_flg_VC(info);
		if (vc == Cnd_sls_flg) return doCnd_sls_flg_VC(info);
		return true;
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ptn_set_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ptn_set_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ptn_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ptn_set_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dtl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dtl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bom_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bom_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[proc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_proc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_NC(info);
		else if (nc == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_ym_fr) doCnd_ym_fr_NC(info);
		else if (nc == Cnd_ym_to) doCnd_ym_to_NC(info);
		else if (nc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NC(info);
		else if (nc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NC(info);
		else if (nc == Cnd_ptn_set_typ) doCnd_ptn_set_typ_NC(info);
		else if (nc == Cnd_ptn_set_typ_nm) doCnd_ptn_set_typ_nm_NC(info);
		else if (nc == Cnd_itm_flg) doCnd_itm_flg_NC(info);
		else if (nc == Cnd_dtl_flg) doCnd_dtl_flg_NC(info);
		else if (nc == Cnd_oper_flg) doCnd_oper_flg_NC(info);
		else if (nc == Cnd_bom_flg) doCnd_bom_flg_NC(info);
		else if (nc == Cnd_wk_flg) doCnd_wk_flg_NC(info);
		else if (nc == Cnd_purc_flg) doCnd_purc_flg_NC(info);
		else if (nc == Cnd_proc_flg) doCnd_proc_flg_NC(info);
		else if (nc == Cnd_prov_flg) doCnd_prov_flg_NC(info);
		else if (nc == Cnd_sls_flg) doCnd_sls_flg_NC(info);
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ptn_set_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ptn_set_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ptn_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ptn_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_NE(info);
		else if (ne == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_ym_fr) doCnd_ym_fr_NE(info);
		else if (ne == Cnd_ym_to) doCnd_ym_to_NE(info);
		else if (ne == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NE(info);
		else if (ne == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NE(info);
		else if (ne == Cnd_ptn_set_typ) doCnd_ptn_set_typ_NE(info);
		else if (ne == Cnd_ptn_set_typ_nm) doCnd_ptn_set_typ_nm_NE(info);
		else if (ne == Cnd_itm_flg) doCnd_itm_flg_NE(info);
		else if (ne == Cnd_dtl_flg) doCnd_dtl_flg_NE(info);
		else if (ne == Cnd_oper_flg) doCnd_oper_flg_NE(info);
		else if (ne == Cnd_bom_flg) doCnd_bom_flg_NE(info);
		else if (ne == Cnd_wk_flg) doCnd_wk_flg_NE(info);
		else if (ne == Cnd_purc_flg) doCnd_purc_flg_NE(info);
		else if (ne == Cnd_proc_flg) doCnd_proc_flg_NE(info);
		else if (ne == Cnd_prov_flg) doCnd_prov_flg_NE(info);
		else if (ne == Cnd_sls_flg) doCnd_sls_flg_NE(info);
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ptn_set_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ptn_set_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ptn_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ptn_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_NX(info);
		else if (nx == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_ym_fr) doCnd_ym_fr_NX(info);
		else if (nx == Cnd_ym_to) doCnd_ym_to_NX(info);
		else if (nx == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NX(info);
		else if (nx == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NX(info);
		else if (nx == Cnd_ptn_set_typ) doCnd_ptn_set_typ_NX(info);
		else if (nx == Cnd_ptn_set_typ_nm) doCnd_ptn_set_typ_nm_NX(info);
		else if (nx == Cnd_itm_flg) doCnd_itm_flg_NX(info);
		else if (nx == Cnd_dtl_flg) doCnd_dtl_flg_NX(info);
		else if (nx == Cnd_oper_flg) doCnd_oper_flg_NX(info);
		else if (nx == Cnd_bom_flg) doCnd_bom_flg_NX(info);
		else if (nx == Cnd_wk_flg) doCnd_wk_flg_NX(info);
		else if (nx == Cnd_purc_flg) doCnd_purc_flg_NX(info);
		else if (nx == Cnd_proc_flg) doCnd_proc_flg_NX(info);
		else if (nx == Cnd_prov_flg) doCnd_prov_flg_NX(info);
		else if (nx == Cnd_sls_flg) doCnd_sls_flg_NX(info);
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ptn_set_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ptn_set_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ptn_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ptn_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_LC(info);
		else if (lc == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_ym_fr) doCnd_ym_fr_LC(info);
		else if (lc == Cnd_ym_to) doCnd_ym_to_LC(info);
		else if (lc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_LC(info);
		else if (lc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_LC(info);
		else if (lc == Cnd_ptn_set_typ) doCnd_ptn_set_typ_LC(info);
		else if (lc == Cnd_ptn_set_typ_nm) doCnd_ptn_set_typ_nm_LC(info);
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ptn_set_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ptn_set_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ptn_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ptn_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_act_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_act_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ptn_set_typ]の作成メソッド
	 */
	public MCList getCnd_ptn_set_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getPtnSetTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBBL0400.Ins01")) {
			return new MG_MGBBL0400_Ins01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBBL0400_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0400_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0400_Ins01;

		/** コンストラクタ */
		protected MG_MGBBL0400_Ins01Bridge() {
			p_MG_MGBBL0400_Ins01 = new MCParam(PDef.MG_MGBBL0400_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0400_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBB.MGBBP0400.CndR.create());
			// Down

			p_MG_MGBBL0400_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0400_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0400_Ins01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0400_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0400_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBB.MGBBP0400.CndR up0() {
			return (mcframe.clientMGBB.MGBBP0400.CndR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBBL0400_Ins01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}