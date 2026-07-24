package mcframe.clientMGBD.MGBDP0400;

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
import mcframe.clientMGBD.MGBDP0400.MGBDP_CostItmInfoCopy_MC.MG_MGBDL0400_Ins01Caller;
import mcframe.clientMGBD.MGBDP0400.MGBDP_CostItmInfoCopy_MC.MG_MGBDL0400_Del01Caller;

/**
 * 画面"MGBDP_CostItmInfoCopy"パネルクラスです。<p>
 *
 * 実績ＩＦデータを計画データにコピーします。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDP_CostItmInfoCopy_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MGBD";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBDP0400";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [ScreenOpe]ブロック関連のField定義
	public MCPanel ScreenOpePanel = null;
	public MCTitledBorder ScreenOpeTitledBorder = null;
	// [ScreenOpe]ブロックの項目のField定義
	// [RegTarget]ブロック関連のField定義
	public MCPanel RegTargetPanel = null;
	public MCTitledBorder RegTargetTitledBorder = null;
	// [RegTarget]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * INS,Import; DEL,Delete work table INS,取り込む;DEL,ワークテーブルを削除する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCLabel Cnd_calc_ctg_cd_Label = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_ctg_nm = null;
	public MCLabel Cnd_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
	public mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H Cnd_term_p_PPanel;
	public MCDateComboBox Cnd_term_fr;	// [Cnd]の[term_p.term_fr]を[Cnd_term_fr]としてエイリアス定義。
	public MCDateComboBox Cnd_term_to;	// [Cnd]の[term_p.term_to]を[Cnd_term_to]としてエイリアス定義。
	public MCLabel Cnd_dt_Label = null;
	/**
	 * Date 対象日.<p>
	 *
	 */
	public MCDateField Cnd_dt = null;
	/**
	 * Include import 取込処理も行う.<p>
	 *
	 */
	public MCCheckBox Cnd_lump_flg = null;
	/**
	 * Common 共通.<p>
	 *
	 */
	public MCCheckBox Cnd_cmn_flg = null;
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public MCCheckBox Cnd_wg_flg = null;
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
	public MCLabel Cnd_sls_upri_imp_typ_Label = null;
	/**
	 * Sales unit price import type 販売単価取込区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_sls_upri_imp_typ = null;
	/**
	 * Sales unit price import type name 販売単価取込区分名.<p>
	 *
	 */
	public MCTextField Cnd_sls_upri_imp_typ_nm = null;
	/**
	 * Search (Common) 検索する（共通）.<p>
	 *
	 */
	public MCButton Cnd_srch_cmn = null;
	/**
	 * Search (WG) 検索する（ワーキンググループ）.<p>
	 *
	 */
	public MCButton Cnd_srch_wg = null;
	// [Tgt]ブロック関連のField定義
	public MCPanel TgtPanel = null;
	public MCTitledBorder TgtTitledBorder = null;
	// [Tgt]ブロックの項目のField定義
	// [SlsCnd]ブロック関連のField定義
	public MCPanel SlsCndPanel = null;
	public MCTitledBorder SlsCndTitledBorder = null;
	// [SlsCnd]ブロックの項目のField定義
	// [NorthBtn]ブロック関連のField定義
	public MCPanel NorthBtnPanel = null;
	// [NorthBtn]ブロックの項目のField定義
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
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
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
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INS, DEL};
	
	/** [MG_MGBDL0400_Ins01]のCallerの作成 */
	protected MGBDP_CostItmInfoCopy_MC.MG_MGBDL0400_Ins01Caller createMG_MGBDL0400_Ins01() {
		MGBDP_CostItmInfoCopy_MC.MG_MGBDL0400_Ins01Caller<MGBDP_CostItmInfoCopy, MG_MGBDL0400_Ins01Bridge>
		caller = ((MGBDP_CostItmInfoCopy_MC)this).new MG_MGBDL0400_Ins01Caller<MGBDP_CostItmInfoCopy, MG_MGBDL0400_Ins01Bridge>(
					(MGBDP_CostItmInfoCopy)this, new MG_MGBDL0400_Ins01Bridge());
		return caller;
	}
	/** [MG_MGBDL0400_Ins01]の呼び出し */
	protected void callMG_MGBDL0400_Ins01() {
		MCCaller caller = createMG_MGBDL0400_Ins01();
		caller.exec();
	}
	/** [MG_MGBDL0400_Del01]のCallerの作成 */
	protected MGBDP_CostItmInfoCopy_MC.MG_MGBDL0400_Del01Caller createMG_MGBDL0400_Del01() {
		MGBDP_CostItmInfoCopy_MC.MG_MGBDL0400_Del01Caller<MGBDP_CostItmInfoCopy, MG_MGBDL0400_Del01Bridge>
		caller = ((MGBDP_CostItmInfoCopy_MC)this).new MG_MGBDL0400_Del01Caller<MGBDP_CostItmInfoCopy, MG_MGBDL0400_Del01Bridge>(
					(MGBDP_CostItmInfoCopy)this, new MG_MGBDL0400_Del01Bridge());
		return caller;
	}
	/** [MG_MGBDL0400_Del01]の呼び出し */
	protected void callMG_MGBDL0400_Del01() {
		MCCaller caller = createMG_MGBDL0400_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0400.CndR aCndR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBD.MGBDP0400.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0400.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0400.CndR createCndR() {
		return mcframe.clientMGBD.MGBDP0400.CndR.create();
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
		ret.add(ScreenOpePanel);
		ret.add(RegTargetPanel);
		ret.add(CndPanel);
		ret.add(TgtPanel);
		ret.add(SlsCndPanel);
		ret.add(NorthBtnPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_CostItmInfoCopy_MC_A() {
		aCndR = createCndR();

	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBDP_CostItmInfoCopy_MC.jbCreateScreenOpe((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbCreateRegTarget((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbCreateCnd((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbCreateTgt((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbCreateSlsCnd((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbCreateNorthBtn((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbCreateBtn((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbCreateEastBtn((MGBDP_CostItmInfoCopy)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBDP_CostItmInfoCopy p) {
	}

	/**
	 * [RegTarget]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRegTarget(MGBDP_CostItmInfoCopy p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBDP_CostItmInfoCopy p) {
		p.Cnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.create(p.getCndR().term_p());
		p.Cnd_term_p_PPanel.setName("Cnd.term_p");
		p.Cnd_term_fr = p.Cnd_term_p_PPanel.Term_term_fr;
		p.Cnd_term_fr.addAliasName("Cnd.term_fr", p);
		p.Cnd_term_to = p.Cnd_term_p_PPanel.Term_term_to;
		p.Cnd_term_to.addAliasName("Cnd.term_to", p);
	}

	/**
	 * [Tgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTgt(MGBDP_CostItmInfoCopy p) {
	}

	/**
	 * [SlsCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSlsCnd(MGBDP_CostItmInfoCopy p) {
	}

	/**
	 * [NorthBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateNorthBtn(MGBDP_CostItmInfoCopy p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBDP_CostItmInfoCopy p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MGBDP_CostItmInfoCopy p) {
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
	
	
	/** [Cnd_sls_upri_imp_typ_ListPutter]の定義 */
	private MCListPutter Cnd_sls_upri_imp_typ_p = null;

	/**
	 * [Cnd_sls_upri_imp_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_upri_imp_typ_ListPutter() {
		if (Cnd_sls_upri_imp_typ_p == null) {
			Cnd_sls_upri_imp_typ_p = createCnd_sls_upri_imp_typ_ListPutter(Cnd_sls_upri_imp_typ, "sls_upri_imp_typ", "sls_upri_imp_typ_nm");

		}
		return Cnd_sls_upri_imp_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_CostItmInfoCopy create(){
		MGBDP_CostItmInfoCopy p = new MGBDP_CostItmInfoCopy();
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
		MGBDP_CostItmInfoCopy_MC.jbfInitScreenOpe((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbfInitRegTarget((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbfInitCnd((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbfInitTgt((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbfInitSlsCnd((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbfInitNorthBtn((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbfInitBtn((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbfInitEastBtn((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbInitScreenOpe((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbInitRegTarget((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbInitCnd((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbInitTgt((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbInitSlsCnd((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbInitNorthBtn((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbInitBtn((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.jbInitEastBtn((MGBDP_CostItmInfoCopy)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBDP_CostItmInfoCopy p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRegTarget(MGBDP_CostItmInfoCopy p) {
		// ブロック関連の初期化
		p.RegTargetPanel = p.beansFactory.createPanel("RegTarget");
		p.RegTargetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBDP_CostItmInfoCopy p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.calc_ctg_cd_Label");
		p.Cnd_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.calc_ctg_cd");
		p.Cnd_calc_ctg_cd.setLabel(p.Cnd_calc_ctg_cd_Label);
		p.Cnd_calc_ctg_nm = p.beansFactory.createTextField("Cnd.calc_ctg_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_dt_Label = p.beansFactory.createLabel("Cnd.dt_Label");
		p.Cnd_dt = p.beansFactory.createDateField("Cnd.dt");
		p.Cnd_dt.setLabel(p.Cnd_dt_Label);
		p.Cnd_lump_flg = p.beansFactory.createCheckBox("Cnd.lump_flg");
		p.Cnd_cmn_flg = p.beansFactory.createCheckBox("Cnd.cmn_flg");
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_dtl_flg = p.beansFactory.createCheckBox("Cnd.dtl_flg");
		p.Cnd_oper_flg = p.beansFactory.createCheckBox("Cnd.oper_flg");
		p.Cnd_bom_flg = p.beansFactory.createCheckBox("Cnd.bom_flg");
		p.Cnd_wk_flg = p.beansFactory.createCheckBox("Cnd.wk_flg");
		p.Cnd_purc_flg = p.beansFactory.createCheckBox("Cnd.purc_flg");
		p.Cnd_proc_flg = p.beansFactory.createCheckBox("Cnd.proc_flg");
		p.Cnd_prov_flg = p.beansFactory.createCheckBox("Cnd.prov_flg");
		p.Cnd_sls_flg = p.beansFactory.createCheckBox("Cnd.sls_flg");
		p.Cnd_sls_upri_imp_typ_Label = p.beansFactory.createLabel("Cnd.sls_upri_imp_typ_Label");
		p.Cnd_sls_upri_imp_typ = p.beansFactory.createTextComboBox("Cnd.sls_upri_imp_typ");
		p.Cnd_sls_upri_imp_typ.setLabel(p.Cnd_sls_upri_imp_typ_Label);
		p.Cnd_sls_upri_imp_typ_nm = p.beansFactory.createTextField("Cnd.sls_upri_imp_typ_nm");
		p.Cnd_srch_cmn = p.beansFactory.createButton("Cnd.srch_cmn");
		p.Cnd_srch_wg = p.beansFactory.createButton("Cnd.srch_wg");
	}

	/**
	 * [Tgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTgt(MGBDP_CostItmInfoCopy p) {
		// ブロック関連の初期化
		p.TgtPanel = p.beansFactory.createPanel("Tgt");
		p.TgtTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SlsCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSlsCnd(MGBDP_CostItmInfoCopy p) {
		// ブロック関連の初期化
		p.SlsCndPanel = p.beansFactory.createPanel("SlsCnd");
		p.SlsCndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [NorthBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitNorthBtn(MGBDP_CostItmInfoCopy p) {
		// ブロック関連の初期化
		p.NorthBtnPanel = p.beansFactory.createPanel("NorthBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBDP_CostItmInfoCopy p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
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
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MGBDP_CostItmInfoCopy p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBDP_CostItmInfoCopy p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.RegTargetPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRegTarget(MGBDP_CostItmInfoCopy p) {
		// ブロック関連の初期化
		p.RegTargetPanel.setBorder(p.RegTargetTitledBorder);
		p.add(p.RegTargetPanel);
		p.RegTargetPanel.setNextBeans(p.CndPanel);
		p.RegTargetPanel.setValueCheck(false);
		p.RegTargetPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RegTargetPanel.setLayoutPosition("NWXN");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBDP_CostItmInfoCopy p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.TgtPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("CNW");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS);
		p.ScreenOpePanel.add(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0400.CndR.ope_META);
		p.Cnd_calc_ctg_cd.setListType(MCListType.STRICT);
		p.Cnd_calc_ctg_cd.setLinkBeans(p.Cnd_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_calc_ctg_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_ctg_cd);
		p.Cnd_calc_ctg_cd.setNextBeans(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0400.CndR.calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0400.CndR.calc_ctg_nm_META);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0400.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_term_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0400.CndR.wg_nm_META);
		p.CndPanel.add(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_dt);
		p.CndPanel.add(p.Cnd_dt_Label);
		p.CndPanel.add(p.Cnd_dt);
		p.Cnd_dt.setNextBeans(p.Cnd_lump_flg);
		p.Cnd_dt.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0400.CndR.dt_META);
		p.Cnd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_lump_flg);
		p.Cnd_lump_flg.setNextBeans(p.Cnd_srch_cmn);
		p.Cnd_lump_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0400.CndR.lump_flg_META);
		p.RegTargetPanel.add(p.Cnd_cmn_flg);
		p.RegTargetPanel.setLastBeans(p.Cnd_cmn_flg);
		p.Cnd_cmn_flg.setNextBeans(p.Cnd_wg_flg);
		p.Cnd_cmn_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0400.CndR.cmn_flg_META);
		p.RegTargetPanel.add(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0400.CndR.wg_flg_META);
		p.TgtPanel.add(p.Cnd_dtl_flg);
		p.TgtPanel.setLastBeans(p.Cnd_dtl_flg);
		p.Cnd_dtl_flg.setNextBeans(p.Cnd_oper_flg);
		p.Cnd_dtl_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0400.CndR.dtl_flg_META);
		p.TgtPanel.add(p.Cnd_oper_flg);
		p.Cnd_oper_flg.setNextBeans(p.Cnd_bom_flg);
		p.Cnd_oper_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0400.CndR.oper_flg_META);
		p.TgtPanel.add(p.Cnd_bom_flg);
		p.Cnd_bom_flg.setNextBeans(p.Cnd_wk_flg);
		p.Cnd_bom_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0400.CndR.bom_flg_META);
		p.TgtPanel.add(p.Cnd_wk_flg);
		p.Cnd_wk_flg.setNextBeans(p.Cnd_purc_flg);
		p.Cnd_wk_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0400.CndR.wk_flg_META);
		p.TgtPanel.add(p.Cnd_purc_flg);
		p.Cnd_purc_flg.setNextBeans(p.Cnd_proc_flg);
		p.Cnd_purc_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0400.CndR.purc_flg_META);
		p.TgtPanel.add(p.Cnd_proc_flg);
		p.Cnd_proc_flg.setNextBeans(p.Cnd_prov_flg);
		p.Cnd_proc_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0400.CndR.proc_flg_META);
		p.TgtPanel.add(p.Cnd_prov_flg);
		p.Cnd_prov_flg.setNextBeans(p.Cnd_sls_flg);
		p.Cnd_prov_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0400.CndR.prov_flg_META);
		p.TgtPanel.add(p.Cnd_sls_flg);
		p.Cnd_sls_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0400.CndR.sls_flg_META);
		p.Cnd_sls_upri_imp_typ.setListType(MCListType.STRICT);
		p.Cnd_sls_upri_imp_typ.setLinkBeans(p.Cnd_sls_upri_imp_typ_nm);
		p.SlsCndPanel.add(p.Cnd_sls_upri_imp_typ_Label);
		p.SlsCndPanel.add(p.Cnd_sls_upri_imp_typ);
		p.SlsCndPanel.setLastBeans(p.Cnd_sls_upri_imp_typ);
		p.Cnd_sls_upri_imp_typ.setNextBeans(p.Cnd_sls_upri_imp_typ_nm);
		p.Cnd_sls_upri_imp_typ.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0400.CndR.sls_upri_imp_typ_META);
		p.SlsCndPanel.add(p.Cnd_sls_upri_imp_typ_nm);
		p.Cnd_sls_upri_imp_typ_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0400.CndR.sls_upri_imp_typ_nm_META);
		p.Cnd_srch_cmn.setIcon("SEARCH");
		p.CndPanel.add(p.Cnd_srch_cmn);
		p.Cnd_srch_cmn.setNextBeans(p.Cnd_srch_wg);
		p.Cnd_srch_wg.setIcon("SEARCH");
		p.CndPanel.add(p.Cnd_srch_wg);
	}

	/**
	 * [Tgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTgt(MGBDP_CostItmInfoCopy p) {
		// ブロック関連の初期化
		p.TgtPanel.setBorder(p.TgtTitledBorder);
		p.add(p.TgtPanel);
		p.TgtPanel.setNextBeans(p.SlsCndPanel);
		p.TgtPanel.setValueCheck(false);
		p.TgtPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TgtPanel.setLayoutPosition("CNW");
		// ブロックの項目の初期化
	}

	/**
	 * [SlsCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSlsCnd(MGBDP_CostItmInfoCopy p) {
		// ブロック関連の初期化
		p.SlsCndPanel.setBorder(p.SlsCndTitledBorder);
		p.add(p.SlsCndPanel);
		p.SlsCndPanel.setNextBeans(p.NorthBtnPanel);
		p.SlsCndPanel.setValueCheck(false);
		p.SlsCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SlsCndPanel.setLayoutPosition("CNW");
		// ブロックの項目の初期化
	}

	/**
	 * [NorthBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitNorthBtn(MGBDP_CostItmInfoCopy p) {
		// ブロック関連の初期化
		p.add(p.NorthBtnPanel);
		p.NorthBtnPanel.setNextBeans(p.BtnPanel);
		p.NorthBtnPanel.setLayoutPosition("CCN");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBDP_CostItmInfoCopy p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("CCW");
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
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
		p.Btn_open_MGBDP0510.setFunctionKey(MCFunctionKey.F3);
		p.NorthBtnPanel.setLastBeans(p.Btn_open_MGBDP0510);
		p.NorthBtnPanel.add(p.Btn_open_MGBDP0510);
		p.Btn_open_MGBDP0510.setNextBeans(p.Btn_open_MGBDP0560);
		p.Btn_open_MGBDP0560.setFunctionKey(MCFunctionKey.F4);
		p.NorthBtnPanel.add(p.Btn_open_MGBDP0560);
		p.Btn_open_MGBDP0560.setNextBeans(p.Btn_open_MGBDP0530);
		p.Btn_open_MGBDP0530.setFunctionKey(MCFunctionKey.F5);
		p.NorthBtnPanel.add(p.Btn_open_MGBDP0530);
		p.Btn_open_MGBDP0530.setNextBeans(p.Btn_open_MGBDP0580);
		p.Btn_open_MGBDP0580.setFunctionKey(MCFunctionKey.F6);
		p.NorthBtnPanel.add(p.Btn_open_MGBDP0580);
		p.Btn_open_MGBDP0580.setNextBeans(p.Btn_open_MGBDP0600);
		p.Btn_open_MGBDP0600.setFunctionKey(MCFunctionKey.F7);
		p.NorthBtnPanel.add(p.Btn_open_MGBDP0600);
		p.Btn_open_MGBDP0600.setNextBeans(p.Btn_open_MGBDP0660);
		p.Btn_open_MGBDP0660.setFunctionKey(MCFunctionKey.F8);
		p.NorthBtnPanel.add(p.Btn_open_MGBDP0660);
		p.Btn_open_MGBDP0660.setNextBeans(p.Btn_open_MGBDP0610);
		p.Btn_open_MGBDP0610.setFunctionKey(MCFunctionKey.F15);
		p.NorthBtnPanel.add(p.Btn_open_MGBDP0610);
		p.Btn_open_MGBDP0610.setNextBeans(p.Btn_open_MGBDP0590);
		p.Btn_open_MGBDP0590.setFunctionKey(MCFunctionKey.F16);
		p.NorthBtnPanel.add(p.Btn_open_MGBDP0590);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MGBDP_CostItmInfoCopy p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("CCE");
		// ブロックの項目の初期化
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
		MGBDP_CostItmInfoCopy_MC.mcInitScreenOpe((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.mcInitRegTarget((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.mcInitCnd((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.mcInitTgt((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.mcInitSlsCnd((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.mcInitNorthBtn((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.mcInitBtn((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.mcInitEastBtn((MGBDP_CostItmInfoCopy)this);

		// [INS]ステータスのモードの設定
		MGBDP_CostItmInfoCopy_MC.statusInitINS_ScreenOpe((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.statusInitINS_RegTarget((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.statusInitINS_Cnd((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.statusInitINS_Tgt((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.statusInitINS_SlsCnd((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.statusInitINS_NorthBtn((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.statusInitINS_Btn((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.statusInitINS_EastBtn((MGBDP_CostItmInfoCopy)this);

		// [DEL]ステータスのモードの設定
		MGBDP_CostItmInfoCopy_MC.statusInitDEL_ScreenOpe((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.statusInitDEL_RegTarget((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.statusInitDEL_Cnd((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.statusInitDEL_Tgt((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.statusInitDEL_SlsCnd((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.statusInitDEL_NorthBtn((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.statusInitDEL_Btn((MGBDP_CostItmInfoCopy)this);
		MGBDP_CostItmInfoCopy_MC.statusInitDEL_EastBtn((MGBDP_CostItmInfoCopy)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBDP_CostItmInfoCopy p) {
	}

	/**
	 *  [RegTarget]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRegTarget(MGBDP_CostItmInfoCopy p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBDP_CostItmInfoCopy p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_calc_ctg_cd.setListListener(p);
		p.Cnd_calc_ctg_cd.addAllListener(p);
		p.Cnd_calc_ctg_nm.setListListener(p);
		p.Cnd_calc_ctg_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_dt.setListListener(p);
		p.Cnd_dt.addAllListener(p);
		p.Cnd_lump_flg.addAllListener(p);
		p.Cnd_cmn_flg.addAllListener(p);
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_dtl_flg.addAllListener(p);
		p.Cnd_oper_flg.addAllListener(p);
		p.Cnd_bom_flg.addAllListener(p);
		p.Cnd_wk_flg.addAllListener(p);
		p.Cnd_purc_flg.addAllListener(p);
		p.Cnd_proc_flg.addAllListener(p);
		p.Cnd_prov_flg.addAllListener(p);
		p.Cnd_sls_flg.addAllListener(p);
		p.Cnd_sls_upri_imp_typ.setListListener(p);
		p.Cnd_sls_upri_imp_typ.addAllListener(p);
		p.Cnd_sls_upri_imp_typ_nm.setListListener(p);
		p.Cnd_sls_upri_imp_typ_nm.addAllListener(p);
		p.Cnd_srch_cmn.addAllListener(p);
		p.Cnd_srch_cmn.setAPMethodName("doCnd_srch_cmn");
		p.Cnd_srch_wg.addAllListener(p);
		p.Cnd_srch_wg.setAPMethodName("doCnd_srch_wg");
	}

	/**
	 *  [Tgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTgt(MGBDP_CostItmInfoCopy p) {
	}

	/**
	 *  [SlsCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSlsCnd(MGBDP_CostItmInfoCopy p) {
	}

	/**
	 *  [NorthBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitNorthBtn(MGBDP_CostItmInfoCopy p) {
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBDP_CostItmInfoCopy p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
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
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MGBDP_CostItmInfoCopy p) {
	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MGBDP_CostItmInfoCopy p){

	}

	/**
	 * [INS]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitINS_RegTarget(MGBDP_CostItmInfoCopy p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MGBDP_CostItmInfoCopy p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.REQUIRED);
		p.Cnd_term_p_PPanel.Term_term_to.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dt.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_lump_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_cmn_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_dtl_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_oper_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_bom_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_wk_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_proc_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_prov_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_sls_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_sls_upri_imp_typ.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sls_upri_imp_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tgt(MGBDP_CostItmInfoCopy p){

	}

	/**
	 * [INS]ステータスの[SlsCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_SlsCnd(MGBDP_CostItmInfoCopy p){

	}

	/**
	 * [INS]ステータスの[NorthBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_NorthBtn(MGBDP_CostItmInfoCopy p){

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MGBDP_CostItmInfoCopy p){
		p.Btn_select_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.ENABLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MGBDP0510.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MGBDP0560.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MGBDP0530.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MGBDP0580.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MGBDP0600.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MGBDP0660.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MGBDP0610.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MGBDP0590.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MGBDP_CostItmInfoCopy p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MGBDP_CostItmInfoCopy p){

	}

	/**
	 * [DEL]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RegTarget(MGBDP_CostItmInfoCopy p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MGBDP_CostItmInfoCopy p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.REQUIRED);
		p.Cnd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_lump_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_cmn_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_dtl_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_oper_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_bom_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_wk_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_proc_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_prov_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_sls_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_sls_upri_imp_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_sls_upri_imp_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tgt(MGBDP_CostItmInfoCopy p){

	}

	/**
	 * [DEL]ステータスの[SlsCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SlsCnd(MGBDP_CostItmInfoCopy p){

	}

	/**
	 * [DEL]ステータスの[NorthBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_NorthBtn(MGBDP_CostItmInfoCopy p){

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MGBDP_CostItmInfoCopy p){
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBDP0510.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBDP0560.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBDP0530.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBDP0580.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBDP0600.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBDP0660.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBDP0610.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBDP0590.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MGBDP_CostItmInfoCopy p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return INS;
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
		Cnd_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_ctg_cd.getListConfig().setPutter(getCnd_calc_ctg_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_sls_upri_imp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sls_upri_imp_typ.getListConfig().setPutter(getCnd_sls_upri_imp_typ_ListPutter());
	}

	/**
	 * この画面を[INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSStatus() {
		status = INS;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (INS.equals(status)) {
			setINSStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
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
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [Cnd_sls_upri_imp_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_upri_imp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsUpriImpTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_ctg_cd) return getCnd_calc_ctg_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_sls_upri_imp_typ) return getCnd_sls_upri_imp_typ(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch_cmn) doCnd_srch_cmn(info);
		else if (ap == Cnd_srch_wg) doCnd_srch_wg(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
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
	 * [Cnd]パネルの[srch_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_cmn(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_wg(MCEventInfo info);

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
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_calc_ctg_cd) return doCnd_calc_ctg_cd_VC(info);
		if (vc == Cnd_calc_ctg_nm) return doCnd_calc_ctg_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_dt) return doCnd_dt_VC(info);
		if (vc == Cnd_lump_flg) return doCnd_lump_flg_VC(info);
		if (vc == Cnd_cmn_flg) return doCnd_cmn_flg_VC(info);
		if (vc == Cnd_wg_flg) return doCnd_wg_flg_VC(info);
		if (vc == Cnd_dtl_flg) return doCnd_dtl_flg_VC(info);
		if (vc == Cnd_oper_flg) return doCnd_oper_flg_VC(info);
		if (vc == Cnd_bom_flg) return doCnd_bom_flg_VC(info);
		if (vc == Cnd_wk_flg) return doCnd_wk_flg_VC(info);
		if (vc == Cnd_purc_flg) return doCnd_purc_flg_VC(info);
		if (vc == Cnd_proc_flg) return doCnd_proc_flg_VC(info);
		if (vc == Cnd_prov_flg) return doCnd_prov_flg_VC(info);
		if (vc == Cnd_sls_flg) return doCnd_sls_flg_VC(info);
		if (vc == Cnd_sls_upri_imp_typ) return doCnd_sls_upri_imp_typ_VC(info);
		if (vc == Cnd_sls_upri_imp_typ_nm) return doCnd_sls_upri_imp_typ_nm_VC(info);
		return true;
	}

	/**
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lump_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lump_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cmn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cmn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_upri_imp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_upri_imp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_upri_imp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_upri_imp_typ_nm_VC(MCEventInfo info){
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
		if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NC(info);
		else if (nc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_dt) doCnd_dt_NC(info);
		else if (nc == Cnd_lump_flg) doCnd_lump_flg_NC(info);
		else if (nc == Cnd_cmn_flg) doCnd_cmn_flg_NC(info);
		else if (nc == Cnd_wg_flg) doCnd_wg_flg_NC(info);
		else if (nc == Cnd_dtl_flg) doCnd_dtl_flg_NC(info);
		else if (nc == Cnd_oper_flg) doCnd_oper_flg_NC(info);
		else if (nc == Cnd_bom_flg) doCnd_bom_flg_NC(info);
		else if (nc == Cnd_wk_flg) doCnd_wk_flg_NC(info);
		else if (nc == Cnd_purc_flg) doCnd_purc_flg_NC(info);
		else if (nc == Cnd_proc_flg) doCnd_proc_flg_NC(info);
		else if (nc == Cnd_prov_flg) doCnd_prov_flg_NC(info);
		else if (nc == Cnd_sls_flg) doCnd_sls_flg_NC(info);
		else if (nc == Cnd_sls_upri_imp_typ) doCnd_sls_upri_imp_typ_NC(info);
		else if (nc == Cnd_sls_upri_imp_typ_nm) doCnd_sls_upri_imp_typ_nm_NC(info);
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lump_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lump_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_upri_imp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_upri_imp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_upri_imp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_upri_imp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NE(info);
		else if (ne == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_dt) doCnd_dt_NE(info);
		else if (ne == Cnd_lump_flg) doCnd_lump_flg_NE(info);
		else if (ne == Cnd_cmn_flg) doCnd_cmn_flg_NE(info);
		else if (ne == Cnd_wg_flg) doCnd_wg_flg_NE(info);
		else if (ne == Cnd_dtl_flg) doCnd_dtl_flg_NE(info);
		else if (ne == Cnd_oper_flg) doCnd_oper_flg_NE(info);
		else if (ne == Cnd_bom_flg) doCnd_bom_flg_NE(info);
		else if (ne == Cnd_wk_flg) doCnd_wk_flg_NE(info);
		else if (ne == Cnd_purc_flg) doCnd_purc_flg_NE(info);
		else if (ne == Cnd_proc_flg) doCnd_proc_flg_NE(info);
		else if (ne == Cnd_prov_flg) doCnd_prov_flg_NE(info);
		else if (ne == Cnd_sls_flg) doCnd_sls_flg_NE(info);
		else if (ne == Cnd_sls_upri_imp_typ) doCnd_sls_upri_imp_typ_NE(info);
		else if (ne == Cnd_sls_upri_imp_typ_nm) doCnd_sls_upri_imp_typ_nm_NE(info);
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lump_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lump_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_upri_imp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_upri_imp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_upri_imp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_upri_imp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NX(info);
		else if (nx == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_dt) doCnd_dt_NX(info);
		else if (nx == Cnd_lump_flg) doCnd_lump_flg_NX(info);
		else if (nx == Cnd_cmn_flg) doCnd_cmn_flg_NX(info);
		else if (nx == Cnd_wg_flg) doCnd_wg_flg_NX(info);
		else if (nx == Cnd_dtl_flg) doCnd_dtl_flg_NX(info);
		else if (nx == Cnd_oper_flg) doCnd_oper_flg_NX(info);
		else if (nx == Cnd_bom_flg) doCnd_bom_flg_NX(info);
		else if (nx == Cnd_wk_flg) doCnd_wk_flg_NX(info);
		else if (nx == Cnd_purc_flg) doCnd_purc_flg_NX(info);
		else if (nx == Cnd_proc_flg) doCnd_proc_flg_NX(info);
		else if (nx == Cnd_prov_flg) doCnd_prov_flg_NX(info);
		else if (nx == Cnd_sls_flg) doCnd_sls_flg_NX(info);
		else if (nx == Cnd_sls_upri_imp_typ) doCnd_sls_upri_imp_typ_NX(info);
		else if (nx == Cnd_sls_upri_imp_typ_nm) doCnd_sls_upri_imp_typ_nm_NX(info);
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lump_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lump_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_upri_imp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_upri_imp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_upri_imp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_upri_imp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_LC(info);
		else if (lc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_dt) doCnd_dt_LC(info);
		else if (lc == Cnd_sls_upri_imp_typ) doCnd_sls_upri_imp_typ_LC(info);
		else if (lc == Cnd_sls_upri_imp_typ_nm) doCnd_sls_upri_imp_typ_nm_LC(info);
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
	 * [Cnd]パネルの[dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_upri_imp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_upri_imp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_upri_imp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_upri_imp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sls_upri_imp_typ]の作成メソッド
	 */
	public MCList getCnd_sls_upri_imp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsUpriImpTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBDL0400.Ins01")) {
			return new MG_MGBDL0400_Ins01Bridge();
		}
		if (id.equals("MG.MGBDL0400.Del01")) {
			return new MG_MGBDL0400_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBDL0400_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0400_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0400_Ins01;

		/** コンストラクタ */
		protected MG_MGBDL0400_Ins01Bridge() {
			p_MG_MGBDL0400_Ins01 = new MCParam(PDef.MG_MGBDL0400_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0400_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0400.CndR.create());
			// Down

			p_MG_MGBDL0400_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0400_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0400_Ins01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0400_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0400_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0400.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0400.CndR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBDL0400_Ins01;
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
	/**
	 * [MG_MGBDL0400_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0400_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0400_Del01;

		/** コンストラクタ */
		protected MG_MGBDL0400_Del01Bridge() {
			p_MG_MGBDL0400_Del01 = new MCParam(PDef.MG_MGBDL0400_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0400_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0400.CndR.create());
			// Down

			p_MG_MGBDL0400_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0400_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0400_Del01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0400_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0400_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0400.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0400.CndR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBDL0400_Del01;
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