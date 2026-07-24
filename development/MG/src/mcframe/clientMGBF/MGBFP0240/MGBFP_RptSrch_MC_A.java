package mcframe.clientMGBF.MGBFP0240;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
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
import mcframe.clientMGBF.MGBFP0240.MGBFP_RptSrch_MC.MG_MGBFL0240_Srch01Caller;

/**
 * 画面"MGBFP_RptSrch"パネルクラスです。<p>
 *
 * 原価レポートを照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBFP_RptSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MGBF";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBFP0240";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_calc_grp_cd_Label = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_grp_nm = null;
	public mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H Cnd_calc_no_p_PPanel;
	public MCTextComboBox Cnd_calc_no;	// [Cnd]の[calc_no_p.calc_no]を[Cnd_calc_no]としてエイリアス定義。
	public MCTextField Cnd_rmrks;	// [Cnd]の[calc_no_p.rmrks]を[Cnd_rmrks]としてエイリアス定義。
	/**
	 * First month of the term 対象期間先頭年月.<p>
	 *
	 */
	public MCDateField Cnd_st_ym = null;
	public MCLabel Cnd_rpt_ptn_cd_Label = null;
	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_rpt_ptn_cd = null;
	/**
	 * Report pattern name レポートパタン名.<p>
	 *
	 */
	public MCTextField Cnd_rpt_ptn_nm = null;
	public MCLabel Cnd_rpt_key_cd_Label = null;
	/**
	 * Report key cd. レポートキーＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_rpt_key_cd = null;
	/**
	 * Report key name レポートキー名.<p>
	 *
	 */
	public MCTextField Cnd_rpt_key_nm = null;
	/**
	 * Report key type レポートキー区分.<p>
	 *
	 */
	public MCTextField Cnd_rpt_key_typ = null;
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
	public MCLabel Cnd_ym_Label = null;
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDateField Cnd_ym = null;
	/**
	 * Term 期.<p>
	 *
	 */
	public MCDateField Cnd_term = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [DispDtl]ブロック関連のField定義
	public MCPanel DispDtlPanel = null;
	public MCScrollPane DispDtlScrollPane = null;
	public MCTable2<mcframe.clientMGBF.MGBFP0240.DispDtlR> DispDtlTable = null;
	// [DispDtl]ブロックの項目のField定義
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_rpt_seq = null;
	/**
	 * Report type レポート対象区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_rpt_tgt_typ = null;
	/**
	 * Report key type レポートキー区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_rpt_key_typ = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_grp_cd = null;
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_no = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_wg_cd = null;
	/**
	 * Report row cd. レポート行ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_rpt_row_cd = null;
	/**
	 * Prefix 接頭語.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_rpt_pre_word = null;
	/**
	 * Report row name レポート行名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_rpt_row_nm = null;
	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_fg_r = null;
	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_fg_g = null;
	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_fg_b = null;
	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_bg_r = null;
	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_bg_g = null;
	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_bg_b = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_asst_typ = null;
	/**
	 * Allocation account group cd. 1 配賦科目グループＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_alc_ac_grp_cd1 = null;
	/**
	 * Allocation account group cd. 2 配賦科目グループＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_alc_ac_grp_cd2 = null;
	/**
	 * Allocation account group cd. 3 配賦科目グループＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_alc_ac_grp_cd3 = null;
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_alc_ac_cd = null;
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_ac_slip_typ = null;
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_ac_rsn_cd = null;
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_itm_jnl_cd2 = null;
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_itm_grp_cd1 = null;
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_itm_grp_cd2 = null;
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_itm_grp_cd3 = null;
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_itm_grp_cd4 = null;
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_itm_grp_cd5 = null;
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_itm_grp_cd6 = null;
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_itm_grp_cd7 = null;
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_itm_grp_cd8 = null;
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_itm_grp_cd9 = null;
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_itm_grp_cd10 = null;
	/**
	 * Cost GR/GI type 原価入出庫区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_cost_io_typ = null;
	/**
	 * Quantity unit type 数量単位区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_qty_unit_typ = null;
	/**
	 * Column 項目.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_rpt_row_view = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_ttl = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, REF};
	
	/** [MG_MGBFL0240_Srch01]のCallerの作成 */
	protected MGBFP_RptSrch_MC.MG_MGBFL0240_Srch01Caller createMG_MGBFL0240_Srch01() {
		MGBFP_RptSrch_MC.MG_MGBFL0240_Srch01Caller<MGBFP_RptSrch, MG_MGBFL0240_Srch01Bridge>
		caller = ((MGBFP_RptSrch_MC)this).new MG_MGBFL0240_Srch01Caller<MGBFP_RptSrch, MG_MGBFL0240_Srch01Bridge>(
					(MGBFP_RptSrch)this, new MG_MGBFL0240_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBFL0240_Srch01]の呼び出し */
	protected void callMG_MGBFL0240_Srch01() {
		MCCaller caller = createMG_MGBFL0240_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBF.MGBFP0240.CndR aCndR;
	/** [DispDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0240.DispDtlR> aDispDtlL;
	/** [Key]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0240.KeyR> aKeyL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBF.MGBFP0240.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0240.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0240.CndR createCndR() {
		return mcframe.clientMGBF.MGBFP0240.CndR.create();
	}

	/**
	 * コピーによってaDispDtlLを設定します。
	 *
	 * aDispDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DispDtlL
	 */
	public void setDispDtlL(MCList<mcframe.clientMGBF.MGBFP0240.DispDtlR> aList) {
		if (getDispDtlL() != aList) {
			getDispDtlL().setAll(aList);
		}
	}

	/**
	 * [DispDtl]ブロックのコンテナaDispDtlLを返します。
	 *
	 * @return DispDtlL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0240.DispDtlR> getDispDtlL() {
		return aDispDtlL;
	}

	/**
	 * aDispDtlRを作成します。
	 *
	 * @return DispDtlR
	 */
	public mcframe.clientMGBF.MGBFP0240.DispDtlR createDispDtlR() {
		return mcframe.clientMGBF.MGBFP0240.DispDtlR.create();
	}

	/**
	 * aDispDtlLを作成します。
	 *
	 * @return DispDtlL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0240.DispDtlR> createDispDtlL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0240.DispDtlR.class);
	}

	/**
	 * DispDtlTableを初期化します。
	 */
	protected void createDispDtlTable(){
		if(DispDtlTable == null){
			DispDtlTable = beansFactory.createTable2("DispDtl.table");
		}
	}

	/**
	 * コピーによってaKeyLを設定します。
	 *
	 * aKeyLのインスタンスは変更されません。
	 *
	 * @param dataset KeyL
	 */
	public void setKeyL(MCList<mcframe.clientMGBF.MGBFP0240.KeyR> aList) {
		if (getKeyL() != aList) {
			getKeyL().setAll(aList);
		}
	}

	/**
	 * [Key]ブロックのコンテナaKeyLを返します。
	 *
	 * @return KeyL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0240.KeyR> getKeyL() {
		return aKeyL;
	}

	/**
	 * aKeyRを作成します。
	 *
	 * @return KeyR
	 */
	public mcframe.clientMGBF.MGBFP0240.KeyR createKeyR() {
		return mcframe.clientMGBF.MGBFP0240.KeyR.create();
	}

	/**
	 * aKeyLを作成します。
	 *
	 * @return KeyL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0240.KeyR> createKeyL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0240.KeyR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDispDtlL())) ret.add(getDispDtlL());
		if(!MCCollectionUtil.contains(ret, getKeyL())) ret.add(getKeyL());
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
		if(aCnt == getDispDtlL()) return "DispDtl";
		if(aCnt == getKeyL()) return "Key";
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
		if(bId.equals("DispDtl")) return getDispDtlL();
		if(bId.equals("Key")) return getKeyL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(TopPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(DispDtlPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_RptSrch_MC_A() {
		aCndR = createCndR();
		aDispDtlL = createDispDtlL();
		aKeyL = createKeyL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBFP_RptSrch_MC_A(String name) {
		aCndR = createCndR();
		aDispDtlL = createDispDtlL();
		createDispDtlTable();
		DispDtlTable.setRowName(name);
		aKeyL = createKeyL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBFP_RptSrch_MC.jbCreateTop((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.jbCreateCnd((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.jbCreateCtrl((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.jbCreateDispDtl((MGBFP_RptSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBFP_RptSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBFP_RptSrch p) {
		p.Cnd_calc_no_p_PPanel = mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.create(p.getCndR().calc_no_p());
		p.Cnd_calc_no_p_PPanel.setName("Cnd.calc_no_p");
		p.Cnd_calc_no = p.Cnd_calc_no_p_PPanel.CalcNo_calc_no;
		p.Cnd_calc_no.addAliasName("Cnd.calc_no", p);
		p.Cnd_rmrks = p.Cnd_calc_no_p_PPanel.CalcNo_rmrks;
		p.Cnd_rmrks.addAliasName("Cnd.rmrks", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBFP_RptSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [DispDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispDtl(MGBFP_RptSrch p) {
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

	
	/** [Cnd_calc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_calc_grp_cd_p = null;

	/**
	 * [Cnd_calc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_grp_cd_ListPutter() {
		if (Cnd_calc_grp_cd_p == null) {
			Cnd_calc_grp_cd_p = createCnd_calc_grp_cd_ListPutter(Cnd_calc_grp_cd, "calc_grp_cd", "calc_grp_nm");

		}
		return Cnd_calc_grp_cd_p;
	}
	
	
	/** [Cnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の定義 */
	private MCListPutter Cnd_calc_no_p_PPanel_CalcNo_calc_no_p = null;

	/**
	 * [Cnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter() {
		if (Cnd_calc_no_p_PPanel_CalcNo_calc_no_p == null) {
			Cnd_calc_no_p_PPanel_CalcNo_calc_no_p = createCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter(Cnd_calc_no_p_PPanel.CalcNo_calc_no, "calc_no", "rmrks","ym","st_ym","term");
		}
		return Cnd_calc_no_p_PPanel_CalcNo_calc_no_p;
	}
	
	
	/** [Cnd_rpt_ptn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rpt_ptn_cd_p = null;

	/**
	 * [Cnd_rpt_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rpt_ptn_cd_ListPutter() {
		if (Cnd_rpt_ptn_cd_p == null) {
			Cnd_rpt_ptn_cd_p = createCnd_rpt_ptn_cd_ListPutter(Cnd_rpt_ptn_cd, "rpt_ptn_cd", "rpt_ptn_nm");

		}
		return Cnd_rpt_ptn_cd_p;
	}
	
	
	/** [Cnd_rpt_key_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rpt_key_cd_p = null;

	/**
	 * [Cnd_rpt_key_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rpt_key_cd_ListPutter() {
		if (Cnd_rpt_key_cd_p == null) {
			Cnd_rpt_key_cd_p = createCnd_rpt_key_cd_ListPutter(Cnd_rpt_key_cd, "rpt_key_cd", "rpt_key_nm","rpt_key_typ");

		}
		return Cnd_rpt_key_cd_p;
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_RptSrch create(){
		MGBFP_RptSrch p = new MGBFP_RptSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_RptSrch create(String name){
		MGBFP_RptSrch p = new MGBFP_RptSrch(name);
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
		MGBFP_RptSrch_MC.jbfInitTop((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.jbfInitCnd((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.jbfInitCtrl((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.jbfInitDispDtl((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.jbInitTop((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.jbInitCnd((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.jbInitCtrl((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.jbInitDispDtl((MGBFP_RptSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBFP_RptSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBFP_RptSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
		p.Cnd_st_ym = p.beansFactory.createDateField("Cnd.st_ym");
		p.Cnd_rpt_ptn_cd_Label = p.beansFactory.createLabel("Cnd.rpt_ptn_cd_Label");
		p.Cnd_rpt_ptn_cd = p.beansFactory.createTextComboBox("Cnd.rpt_ptn_cd");
		p.Cnd_rpt_ptn_cd.setLabel(p.Cnd_rpt_ptn_cd_Label);
		p.Cnd_rpt_ptn_nm = p.beansFactory.createTextField("Cnd.rpt_ptn_nm");
		p.Cnd_rpt_key_cd_Label = p.beansFactory.createLabel("Cnd.rpt_key_cd_Label");
		p.Cnd_rpt_key_cd = p.beansFactory.createTextComboBox("Cnd.rpt_key_cd");
		p.Cnd_rpt_key_cd.setLabel(p.Cnd_rpt_key_cd_Label);
		p.Cnd_rpt_key_nm = p.beansFactory.createTextField("Cnd.rpt_key_nm");
		p.Cnd_rpt_key_typ = p.beansFactory.createTextField("Cnd.rpt_key_typ");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_ym_Label = p.beansFactory.createLabel("Cnd.ym_Label");
		p.Cnd_ym = p.beansFactory.createDateField("Cnd.ym");
		p.Cnd_ym.setLabel(p.Cnd_ym_Label);
		p.Cnd_term = p.beansFactory.createDateField("Cnd.term");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBFP_RptSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [DispDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispDtl(MGBFP_RptSrch p) {
		// ブロック関連の初期化
		p.DispDtlPanel = p.beansFactory.createPanel("DispDtl");
		p.DispDtlScrollPane = p.beansFactory.createScrollPane("DispDtl.scroll");
		p.createDispDtlTable();
		// ブロックの項目の初期化
		p.columnDispDtl_rpt_seq = p.beansFactory.createTableColumn("DispDtl.rpt_seq", MCColumnType.NUMBER);
		p.columnDispDtl_rpt_tgt_typ = p.beansFactory.createTableColumn("DispDtl.rpt_tgt_typ", MCColumnType.TEXT);
		p.columnDispDtl_rpt_key_typ = p.beansFactory.createTableColumn("DispDtl.rpt_key_typ", MCColumnType.TEXT);
		p.columnDispDtl_calc_grp_cd = p.beansFactory.createTableColumn("DispDtl.calc_grp_cd", MCColumnType.TEXT);
		p.columnDispDtl_calc_no = p.beansFactory.createTableColumn("DispDtl.calc_no", MCColumnType.TEXT);
		p.columnDispDtl_wg_cd = p.beansFactory.createTableColumn("DispDtl.wg_cd", MCColumnType.TEXT);
		p.columnDispDtl_rpt_row_cd = p.beansFactory.createTableColumn("DispDtl.rpt_row_cd", MCColumnType.TEXT);
		p.columnDispDtl_rpt_pre_word = p.beansFactory.createTableColumn("DispDtl.rpt_pre_word", MCColumnType.TEXT);
		p.columnDispDtl_rpt_row_nm = p.beansFactory.createTableColumn("DispDtl.rpt_row_nm", MCColumnType.TEXT);
		p.columnDispDtl_fg_r = p.beansFactory.createTableColumn("DispDtl.fg_r", MCColumnType.NUMBER);
		p.columnDispDtl_fg_g = p.beansFactory.createTableColumn("DispDtl.fg_g", MCColumnType.NUMBER);
		p.columnDispDtl_fg_b = p.beansFactory.createTableColumn("DispDtl.fg_b", MCColumnType.NUMBER);
		p.columnDispDtl_bg_r = p.beansFactory.createTableColumn("DispDtl.bg_r", MCColumnType.NUMBER);
		p.columnDispDtl_bg_g = p.beansFactory.createTableColumn("DispDtl.bg_g", MCColumnType.NUMBER);
		p.columnDispDtl_bg_b = p.beansFactory.createTableColumn("DispDtl.bg_b", MCColumnType.NUMBER);
		p.columnDispDtl_asst_typ = p.beansFactory.createTableColumn("DispDtl.asst_typ", MCColumnType.TEXT);
		p.columnDispDtl_alc_ac_grp_cd1 = p.beansFactory.createTableColumn("DispDtl.alc_ac_grp_cd1", MCColumnType.TEXT);
		p.columnDispDtl_alc_ac_grp_cd2 = p.beansFactory.createTableColumn("DispDtl.alc_ac_grp_cd2", MCColumnType.TEXT);
		p.columnDispDtl_alc_ac_grp_cd3 = p.beansFactory.createTableColumn("DispDtl.alc_ac_grp_cd3", MCColumnType.TEXT);
		p.columnDispDtl_alc_ac_cd = p.beansFactory.createTableColumn("DispDtl.alc_ac_cd", MCColumnType.TEXT);
		p.columnDispDtl_ac_slip_typ = p.beansFactory.createTableColumn("DispDtl.ac_slip_typ", MCColumnType.TEXT);
		p.columnDispDtl_ac_rsn_cd = p.beansFactory.createTableColumn("DispDtl.ac_rsn_cd", MCColumnType.TEXT);
		p.columnDispDtl_itm_jnl_cd2 = p.beansFactory.createTableColumn("DispDtl.itm_jnl_cd2", MCColumnType.TEXT);
		p.columnDispDtl_itm_grp_cd1 = p.beansFactory.createTableColumn("DispDtl.itm_grp_cd1", MCColumnType.TEXT);
		p.columnDispDtl_itm_grp_cd2 = p.beansFactory.createTableColumn("DispDtl.itm_grp_cd2", MCColumnType.TEXT);
		p.columnDispDtl_itm_grp_cd3 = p.beansFactory.createTableColumn("DispDtl.itm_grp_cd3", MCColumnType.TEXT);
		p.columnDispDtl_itm_grp_cd4 = p.beansFactory.createTableColumn("DispDtl.itm_grp_cd4", MCColumnType.TEXT);
		p.columnDispDtl_itm_grp_cd5 = p.beansFactory.createTableColumn("DispDtl.itm_grp_cd5", MCColumnType.TEXT);
		p.columnDispDtl_itm_grp_cd6 = p.beansFactory.createTableColumn("DispDtl.itm_grp_cd6", MCColumnType.TEXT);
		p.columnDispDtl_itm_grp_cd7 = p.beansFactory.createTableColumn("DispDtl.itm_grp_cd7", MCColumnType.TEXT);
		p.columnDispDtl_itm_grp_cd8 = p.beansFactory.createTableColumn("DispDtl.itm_grp_cd8", MCColumnType.TEXT);
		p.columnDispDtl_itm_grp_cd9 = p.beansFactory.createTableColumn("DispDtl.itm_grp_cd9", MCColumnType.TEXT);
		p.columnDispDtl_itm_grp_cd10 = p.beansFactory.createTableColumn("DispDtl.itm_grp_cd10", MCColumnType.TEXT);
		p.columnDispDtl_cost_io_typ = p.beansFactory.createTableColumn("DispDtl.cost_io_typ", MCColumnType.TEXT);
		p.columnDispDtl_qty_unit_typ = p.beansFactory.createTableColumn("DispDtl.qty_unit_typ", MCColumnType.TEXT);
		p.columnDispDtl_rpt_row_view = p.beansFactory.createTableColumn("DispDtl.rpt_row_view", MCColumnType.TEXT);
		p.columnDispDtl_ttl = p.beansFactory.createTableColumn("DispDtl.ttl", MCColumnType.NUMBER);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBFP_RptSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.DispDtlPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.CndPanel, null);
		p.TopPanel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBFP_RptSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0240.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0240.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_no_p_PPanel.setNextBeans(p.Cnd_st_ym);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setLinkBeans(p.Cnd_rmrks,p.Cnd_ym,p.Cnd_st_ym,p.Cnd_term);
		p.CndPanel.add(p.Cnd_st_ym);
		p.Cnd_st_ym.setNextBeans(p.Cnd_rpt_ptn_cd);
		p.Cnd_st_ym.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0240.CndR.st_ym_META);
		p.Cnd_st_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_rpt_ptn_cd.setListType(MCListType.FREE);
		p.Cnd_rpt_ptn_cd.setLinkBeans(p.Cnd_rpt_ptn_nm);
		p.CndPanel.add(p.Cnd_rpt_ptn_cd_Label);
		p.CndPanel.add(p.Cnd_rpt_ptn_cd);
		p.Cnd_rpt_ptn_cd.setNextBeans(p.Cnd_rpt_ptn_nm);
		p.Cnd_rpt_ptn_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0240.CndR.rpt_ptn_cd_META);
		p.CndPanel.add(p.Cnd_rpt_ptn_nm);
		p.Cnd_rpt_ptn_nm.setNextBeans(p.Cnd_rpt_key_cd);
		p.Cnd_rpt_ptn_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0240.CndR.rpt_ptn_nm_META);
		p.Cnd_rpt_key_cd.setListType(MCListType.FREE);
		p.Cnd_rpt_key_cd.setLinkBeans(p.Cnd_rpt_key_nm,p.Cnd_rpt_key_typ);
		p.CndPanel.add(p.Cnd_rpt_key_cd_Label);
		p.CndPanel.add(p.Cnd_rpt_key_cd);
		p.Cnd_rpt_key_cd.setNextBeans(p.Cnd_rpt_key_nm);
		p.Cnd_rpt_key_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0240.CndR.rpt_key_cd_META);
		p.CndPanel.add(p.Cnd_rpt_key_nm);
		p.Cnd_rpt_key_nm.setNextBeans(p.Cnd_rpt_key_typ);
		p.Cnd_rpt_key_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0240.CndR.rpt_key_nm_META);
		p.CndPanel.add(p.Cnd_rpt_key_typ);
		p.Cnd_rpt_key_typ.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_rpt_key_typ.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0240.CndR.rpt_key_typ_META);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0240.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_ym);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0240.CndR.wg_nm_META);
		p.CndPanel.add(p.Cnd_ym_Label);
		p.CndPanel.add(p.Cnd_ym);
		p.Cnd_ym.setNextBeans(p.Cnd_term);
		p.Cnd_ym.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0240.CndR.ym_META);
		p.Cnd_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_term);
		p.Cnd_term.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0240.CndR.term_META);
		p.Cnd_term.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBFP_RptSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [DispDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDispDtl(MGBFP_RptSrch p) {
		// ブロック関連の初期化
		p.add(p.DispDtlPanel);
		p.DispDtlPanel.add(p.DispDtlScrollPane);
		p.DispDtlPanel.setLastBeans(p.DispDtlTable);
		p.DispDtlScrollPane.setViewportView(p.DispDtlTable);
		p.DispDtlTable.setList(p.getDispDtlL());
		p.DispDtlTable.setStatusColumnVisible(false);
		p.DispDtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		Ctrl_ctrl_PPanel.expandInit();
		Ctrl_ctrl_PPanel.setDefaultDividerLocation();
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MGBFP_RptSrch_MC.mcInitTop((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.mcInitCnd((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.mcInitCtrl((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.mcInitDispDtl((MGBFP_RptSrch)this);

		// [SRCH]ステータスのモードの設定
		MGBFP_RptSrch_MC.statusInitSRCH_Top((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.statusInitSRCH_Cnd((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.statusInitSRCH_Ctrl((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.statusInitSRCH_DispDtl((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.statusInitSRCH_Key((MGBFP_RptSrch)this);

		// [REF]ステータスのモードの設定
		MGBFP_RptSrch_MC.statusInitREF_Top((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.statusInitREF_Cnd((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.statusInitREF_Ctrl((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.statusInitREF_DispDtl((MGBFP_RptSrch)this);
		MGBFP_RptSrch_MC.statusInitREF_Key((MGBFP_RptSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBFP_RptSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBFP_RptSrch p) {
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_st_ym.setListListener(p);
		p.Cnd_st_ym.addAllListener(p);
		p.Cnd_rpt_ptn_cd.setListListener(p);
		p.Cnd_rpt_ptn_cd.addAllListener(p);
		p.Cnd_rpt_ptn_nm.setListListener(p);
		p.Cnd_rpt_ptn_nm.addAllListener(p);
		p.Cnd_rpt_key_cd.setListListener(p);
		p.Cnd_rpt_key_cd.addAllListener(p);
		p.Cnd_rpt_key_nm.setListListener(p);
		p.Cnd_rpt_key_nm.addAllListener(p);
		p.Cnd_rpt_key_typ.setListListener(p);
		p.Cnd_rpt_key_typ.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_ym.setListListener(p);
		p.Cnd_ym.addAllListener(p);
		p.Cnd_term.setListListener(p);
		p.Cnd_term.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBFP_RptSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [DispDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispDtl(MGBFP_RptSrch p) {
		p.DispDtlTable.addAllListener(p);
		p.columnDispDtl_rpt_seq.addAllListener(p);
		p.columnDispDtl_rpt_seq.setListListener(p);
		p.columnDispDtl_rpt_tgt_typ.addAllListener(p);
		p.columnDispDtl_rpt_tgt_typ.setListListener(p);
		p.columnDispDtl_rpt_key_typ.addAllListener(p);
		p.columnDispDtl_rpt_key_typ.setListListener(p);
		p.columnDispDtl_calc_grp_cd.addAllListener(p);
		p.columnDispDtl_calc_grp_cd.setListListener(p);
		p.columnDispDtl_calc_no.addAllListener(p);
		p.columnDispDtl_calc_no.setListListener(p);
		p.columnDispDtl_wg_cd.addAllListener(p);
		p.columnDispDtl_wg_cd.setListListener(p);
		p.columnDispDtl_rpt_row_cd.addAllListener(p);
		p.columnDispDtl_rpt_row_cd.setListListener(p);
		p.columnDispDtl_rpt_pre_word.addAllListener(p);
		p.columnDispDtl_rpt_pre_word.setListListener(p);
		p.columnDispDtl_rpt_row_nm.addAllListener(p);
		p.columnDispDtl_rpt_row_nm.setListListener(p);
		p.columnDispDtl_fg_r.addAllListener(p);
		p.columnDispDtl_fg_r.setListListener(p);
		p.columnDispDtl_fg_g.addAllListener(p);
		p.columnDispDtl_fg_g.setListListener(p);
		p.columnDispDtl_fg_b.addAllListener(p);
		p.columnDispDtl_fg_b.setListListener(p);
		p.columnDispDtl_bg_r.addAllListener(p);
		p.columnDispDtl_bg_r.setListListener(p);
		p.columnDispDtl_bg_g.addAllListener(p);
		p.columnDispDtl_bg_g.setListListener(p);
		p.columnDispDtl_bg_b.addAllListener(p);
		p.columnDispDtl_bg_b.setListListener(p);
		p.columnDispDtl_asst_typ.addAllListener(p);
		p.columnDispDtl_asst_typ.setListListener(p);
		p.columnDispDtl_alc_ac_grp_cd1.addAllListener(p);
		p.columnDispDtl_alc_ac_grp_cd1.setListListener(p);
		p.columnDispDtl_alc_ac_grp_cd2.addAllListener(p);
		p.columnDispDtl_alc_ac_grp_cd2.setListListener(p);
		p.columnDispDtl_alc_ac_grp_cd3.addAllListener(p);
		p.columnDispDtl_alc_ac_grp_cd3.setListListener(p);
		p.columnDispDtl_alc_ac_cd.addAllListener(p);
		p.columnDispDtl_alc_ac_cd.setListListener(p);
		p.columnDispDtl_ac_slip_typ.addAllListener(p);
		p.columnDispDtl_ac_slip_typ.setListListener(p);
		p.columnDispDtl_ac_rsn_cd.addAllListener(p);
		p.columnDispDtl_ac_rsn_cd.setListListener(p);
		p.columnDispDtl_itm_jnl_cd2.addAllListener(p);
		p.columnDispDtl_itm_jnl_cd2.setListListener(p);
		p.columnDispDtl_itm_grp_cd1.addAllListener(p);
		p.columnDispDtl_itm_grp_cd1.setListListener(p);
		p.columnDispDtl_itm_grp_cd2.addAllListener(p);
		p.columnDispDtl_itm_grp_cd2.setListListener(p);
		p.columnDispDtl_itm_grp_cd3.addAllListener(p);
		p.columnDispDtl_itm_grp_cd3.setListListener(p);
		p.columnDispDtl_itm_grp_cd4.addAllListener(p);
		p.columnDispDtl_itm_grp_cd4.setListListener(p);
		p.columnDispDtl_itm_grp_cd5.addAllListener(p);
		p.columnDispDtl_itm_grp_cd5.setListListener(p);
		p.columnDispDtl_itm_grp_cd6.addAllListener(p);
		p.columnDispDtl_itm_grp_cd6.setListListener(p);
		p.columnDispDtl_itm_grp_cd7.addAllListener(p);
		p.columnDispDtl_itm_grp_cd7.setListListener(p);
		p.columnDispDtl_itm_grp_cd8.addAllListener(p);
		p.columnDispDtl_itm_grp_cd8.setListListener(p);
		p.columnDispDtl_itm_grp_cd9.addAllListener(p);
		p.columnDispDtl_itm_grp_cd9.setListListener(p);
		p.columnDispDtl_itm_grp_cd10.addAllListener(p);
		p.columnDispDtl_itm_grp_cd10.setListListener(p);
		p.columnDispDtl_cost_io_typ.addAllListener(p);
		p.columnDispDtl_cost_io_typ.setListListener(p);
		p.columnDispDtl_qty_unit_typ.addAllListener(p);
		p.columnDispDtl_qty_unit_typ.setListListener(p);
		p.columnDispDtl_rpt_row_view.addAllListener(p);
		p.columnDispDtl_rpt_row_view.setListListener(p);
		p.columnDispDtl_ttl.addAllListener(p);
		p.columnDispDtl_ttl.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBFP_RptSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBFP_RptSrch p){
		p.Cnd_calc_grp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(SRCH, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_st_ym.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_rpt_ptn_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_rpt_key_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rpt_key_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_term.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBFP_RptSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[DispDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DispDtl(MGBFP_RptSrch p){
		p.columnDispDtl_rpt_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_rpt_tgt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_rpt_key_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_calc_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_calc_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_wg_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_rpt_row_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_rpt_pre_word.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_rpt_row_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_fg_r.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_fg_g.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_fg_b.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_bg_r.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_bg_g.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_bg_b.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_asst_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_alc_ac_grp_cd1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_alc_ac_grp_cd2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_alc_ac_grp_cd3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_alc_ac_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_ac_slip_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_ac_rsn_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_itm_jnl_cd2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd4.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd5.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd6.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd7.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd8.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd9.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd10.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_cost_io_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_qty_unit_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_rpt_row_view.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_ttl.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Key]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Key(MGBFP_RptSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBFP_RptSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBFP_RptSrch p){
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(REF, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_st_ym.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_rpt_ptn_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_rpt_key_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rpt_key_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_term.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBFP_RptSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[DispDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_DispDtl(MGBFP_RptSrch p){
		p.columnDispDtl_rpt_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_rpt_tgt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_rpt_key_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_calc_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_calc_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_wg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_rpt_row_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_rpt_pre_word.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_rpt_row_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_fg_r.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_fg_g.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_fg_b.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_bg_r.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_bg_g.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_bg_b.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_asst_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_alc_ac_grp_cd1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_alc_ac_grp_cd2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_alc_ac_grp_cd3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_alc_ac_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_ac_slip_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_ac_rsn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_itm_jnl_cd2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd4.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd5.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd6.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd7.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd8.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd9.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_itm_grp_cd10.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_cost_io_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_qty_unit_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_rpt_row_view.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_ttl.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Key]ブロックのモードの設定
	 */
	protected static void statusInitREF_Key(MGBFP_RptSrch p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MGBFP_RptSrch_MC.setTableConfigDispDtl((MGBFP_RptSrch)this);
	}

	/**
	 * [DispDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDispDtl(MGBFP_RptSrch p) {
		p.columnDispDtl_rpt_seq.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.rpt_seq_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_rpt_seq);
		p.columnDispDtl_rpt_tgt_typ.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.rpt_tgt_typ_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_rpt_tgt_typ);
		p.columnDispDtl_rpt_key_typ.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.rpt_key_typ_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_rpt_key_typ);
		p.columnDispDtl_calc_grp_cd.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.calc_grp_cd_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_grp_cd);
		p.columnDispDtl_calc_no.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.calc_no_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_no);
		p.columnDispDtl_wg_cd.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.wg_cd_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_wg_cd);
		p.columnDispDtl_rpt_row_cd.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.rpt_row_cd_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_rpt_row_cd);
		p.columnDispDtl_rpt_pre_word.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.rpt_pre_word_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_rpt_pre_word);
		p.columnDispDtl_rpt_row_nm.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.rpt_row_nm_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_rpt_row_nm);
		p.columnDispDtl_fg_r.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.fg_r_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_fg_r);
		p.columnDispDtl_fg_g.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.fg_g_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_fg_g);
		p.columnDispDtl_fg_b.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.fg_b_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_fg_b);
		p.columnDispDtl_bg_r.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.bg_r_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_bg_r);
		p.columnDispDtl_bg_g.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.bg_g_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_bg_g);
		p.columnDispDtl_bg_b.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.bg_b_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_bg_b);
		p.columnDispDtl_asst_typ.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.asst_typ_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_asst_typ);
		p.columnDispDtl_alc_ac_grp_cd1.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.alc_ac_grp_cd1_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_alc_ac_grp_cd1);
		p.columnDispDtl_alc_ac_grp_cd2.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.alc_ac_grp_cd2_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_alc_ac_grp_cd2);
		p.columnDispDtl_alc_ac_grp_cd3.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.alc_ac_grp_cd3_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_alc_ac_grp_cd3);
		p.columnDispDtl_alc_ac_cd.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.alc_ac_cd_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_alc_ac_cd);
		p.columnDispDtl_ac_slip_typ.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.ac_slip_typ_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_ac_slip_typ);
		p.columnDispDtl_ac_rsn_cd.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.ac_rsn_cd_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_ac_rsn_cd);
		p.columnDispDtl_itm_jnl_cd2.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.itm_jnl_cd2_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_itm_jnl_cd2);
		p.columnDispDtl_itm_grp_cd1.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.itm_grp_cd1_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_itm_grp_cd1);
		p.columnDispDtl_itm_grp_cd2.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.itm_grp_cd2_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_itm_grp_cd2);
		p.columnDispDtl_itm_grp_cd3.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.itm_grp_cd3_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_itm_grp_cd3);
		p.columnDispDtl_itm_grp_cd4.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.itm_grp_cd4_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_itm_grp_cd4);
		p.columnDispDtl_itm_grp_cd5.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.itm_grp_cd5_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_itm_grp_cd5);
		p.columnDispDtl_itm_grp_cd6.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.itm_grp_cd6_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_itm_grp_cd6);
		p.columnDispDtl_itm_grp_cd7.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.itm_grp_cd7_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_itm_grp_cd7);
		p.columnDispDtl_itm_grp_cd8.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.itm_grp_cd8_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_itm_grp_cd8);
		p.columnDispDtl_itm_grp_cd9.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.itm_grp_cd9_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_itm_grp_cd9);
		p.columnDispDtl_itm_grp_cd10.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.itm_grp_cd10_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_itm_grp_cd10);
		p.columnDispDtl_cost_io_typ.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.cost_io_typ_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_cost_io_typ);
		p.columnDispDtl_qty_unit_typ.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.qty_unit_typ_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_qty_unit_typ);
		p.columnDispDtl_rpt_row_view.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.rpt_row_view_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_rpt_row_view);
		p.columnDispDtl_ttl.setMeta(mcframe.clientMGBF.MGBFP0240.DispDtlR.ttl_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_ttl);
		// スクロール固定カラムの指定
		p.DispDtlTable.setUnscrollColumn(p.columnDispDtl_ttl);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_grp_cd.getListConfig().setPutter(getCnd_calc_grp_cd_ListPutter());
		Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_no_p_PPanel.CalcNo_calc_no.getListConfig().setPutter(getCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter());
		Cnd_rpt_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rpt_ptn_cd.getListConfig().setPutter(getCnd_rpt_ptn_cd_ListPutter());
		Cnd_rpt_key_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rpt_key_cd.getListConfig().setPutter(getCnd_rpt_key_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCHStatus() {
		status = SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Cnd_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostCalcGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.CalcNo");
		return lp;
	}

	/**
	 * [Cnd_rpt_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rpt_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RptPtnInCalcRptPtn");
		return lp;
	}
	 
	/**
	 * [Cnd_rpt_key_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rpt_key_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RptKeyWithTypInCalcRptPtn");
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == Cnd_calc_no_p_PPanel.CalcNo_calc_no) return getCnd_calc_no_p_PPanel_CalcNo_calc_no(row, info);
		if(combo == Cnd_rpt_ptn_cd) return getCnd_rpt_ptn_cd(row, info);
		if(combo == Cnd_rpt_key_cd) return getCnd_rpt_key_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

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
		if (vc == DispDtlTable) return doDispDtl_VC(info);
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_st_ym) return doCnd_st_ym_VC(info);
		if (vc == Cnd_rpt_ptn_cd) return doCnd_rpt_ptn_cd_VC(info);
		if (vc == Cnd_rpt_ptn_nm) return doCnd_rpt_ptn_nm_VC(info);
		if (vc == Cnd_rpt_key_cd) return doCnd_rpt_key_cd_VC(info);
		if (vc == Cnd_rpt_key_nm) return doCnd_rpt_key_nm_VC(info);
		if (vc == Cnd_rpt_key_typ) return doCnd_rpt_key_typ_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_ym) return doCnd_ym_VC(info);
		if (vc == Cnd_term) return doCnd_term_VC(info);
		if (vc == columnDispDtl_rpt_seq) return doDispDtl_rpt_seq_VC(info);
		if (vc == columnDispDtl_rpt_tgt_typ) return doDispDtl_rpt_tgt_typ_VC(info);
		if (vc == columnDispDtl_rpt_key_typ) return doDispDtl_rpt_key_typ_VC(info);
		if (vc == columnDispDtl_calc_grp_cd) return doDispDtl_calc_grp_cd_VC(info);
		if (vc == columnDispDtl_calc_no) return doDispDtl_calc_no_VC(info);
		if (vc == columnDispDtl_wg_cd) return doDispDtl_wg_cd_VC(info);
		if (vc == columnDispDtl_rpt_row_cd) return doDispDtl_rpt_row_cd_VC(info);
		if (vc == columnDispDtl_rpt_pre_word) return doDispDtl_rpt_pre_word_VC(info);
		if (vc == columnDispDtl_rpt_row_nm) return doDispDtl_rpt_row_nm_VC(info);
		if (vc == columnDispDtl_fg_r) return doDispDtl_fg_r_VC(info);
		if (vc == columnDispDtl_fg_g) return doDispDtl_fg_g_VC(info);
		if (vc == columnDispDtl_fg_b) return doDispDtl_fg_b_VC(info);
		if (vc == columnDispDtl_bg_r) return doDispDtl_bg_r_VC(info);
		if (vc == columnDispDtl_bg_g) return doDispDtl_bg_g_VC(info);
		if (vc == columnDispDtl_bg_b) return doDispDtl_bg_b_VC(info);
		if (vc == columnDispDtl_asst_typ) return doDispDtl_asst_typ_VC(info);
		if (vc == columnDispDtl_alc_ac_grp_cd1) return doDispDtl_alc_ac_grp_cd1_VC(info);
		if (vc == columnDispDtl_alc_ac_grp_cd2) return doDispDtl_alc_ac_grp_cd2_VC(info);
		if (vc == columnDispDtl_alc_ac_grp_cd3) return doDispDtl_alc_ac_grp_cd3_VC(info);
		if (vc == columnDispDtl_alc_ac_cd) return doDispDtl_alc_ac_cd_VC(info);
		if (vc == columnDispDtl_ac_slip_typ) return doDispDtl_ac_slip_typ_VC(info);
		if (vc == columnDispDtl_ac_rsn_cd) return doDispDtl_ac_rsn_cd_VC(info);
		if (vc == columnDispDtl_itm_jnl_cd2) return doDispDtl_itm_jnl_cd2_VC(info);
		if (vc == columnDispDtl_itm_grp_cd1) return doDispDtl_itm_grp_cd1_VC(info);
		if (vc == columnDispDtl_itm_grp_cd2) return doDispDtl_itm_grp_cd2_VC(info);
		if (vc == columnDispDtl_itm_grp_cd3) return doDispDtl_itm_grp_cd3_VC(info);
		if (vc == columnDispDtl_itm_grp_cd4) return doDispDtl_itm_grp_cd4_VC(info);
		if (vc == columnDispDtl_itm_grp_cd5) return doDispDtl_itm_grp_cd5_VC(info);
		if (vc == columnDispDtl_itm_grp_cd6) return doDispDtl_itm_grp_cd6_VC(info);
		if (vc == columnDispDtl_itm_grp_cd7) return doDispDtl_itm_grp_cd7_VC(info);
		if (vc == columnDispDtl_itm_grp_cd8) return doDispDtl_itm_grp_cd8_VC(info);
		if (vc == columnDispDtl_itm_grp_cd9) return doDispDtl_itm_grp_cd9_VC(info);
		if (vc == columnDispDtl_itm_grp_cd10) return doDispDtl_itm_grp_cd10_VC(info);
		if (vc == columnDispDtl_cost_io_typ) return doDispDtl_cost_io_typ_VC(info);
		if (vc == columnDispDtl_qty_unit_typ) return doDispDtl_qty_unit_typ_VC(info);
		if (vc == columnDispDtl_rpt_row_view) return doDispDtl_rpt_row_view_VC(info);
		if (vc == columnDispDtl_ttl) return doDispDtl_ttl_VC(info);
		return true;
	}

	/**
	 * [DispDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[st_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_st_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_key_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_key_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_key_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_key_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_key_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_key_typ_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[term]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_term_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[rpt_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_rpt_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[rpt_tgt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_rpt_tgt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[rpt_key_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_rpt_key_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[rpt_row_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_rpt_row_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[rpt_pre_word]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_rpt_pre_word_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[rpt_row_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_rpt_row_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[fg_r]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_fg_r_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[fg_g]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_fg_g_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[fg_b]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_fg_b_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[bg_r]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_bg_r_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[bg_g]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_bg_g_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[bg_b]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_bg_b_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[alc_ac_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_alc_ac_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[alc_ac_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_alc_ac_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[alc_ac_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_alc_ac_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[alc_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_alc_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[ac_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_ac_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[ac_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_ac_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[itm_jnl_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_itm_jnl_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_itm_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_itm_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_itm_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_itm_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_itm_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_itm_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_itm_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_itm_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_itm_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_itm_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[cost_io_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_cost_io_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[qty_unit_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_qty_unit_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[rpt_row_view]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_rpt_row_view_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[ttl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_ttl_VC(MCEventInfo info){
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
		if (nc == DispDtlTable) doDispDtl_NC(info);
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Cnd_st_ym) doCnd_st_ym_NC(info);
		else if (nc == Cnd_rpt_ptn_cd) doCnd_rpt_ptn_cd_NC(info);
		else if (nc == Cnd_rpt_ptn_nm) doCnd_rpt_ptn_nm_NC(info);
		else if (nc == Cnd_rpt_key_cd) doCnd_rpt_key_cd_NC(info);
		else if (nc == Cnd_rpt_key_nm) doCnd_rpt_key_nm_NC(info);
		else if (nc == Cnd_rpt_key_typ) doCnd_rpt_key_typ_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_ym) doCnd_ym_NC(info);
		else if (nc == Cnd_term) doCnd_term_NC(info);
		else if (nc == columnDispDtl_rpt_seq) doDispDtl_rpt_seq_NC(info);
		else if (nc == columnDispDtl_rpt_tgt_typ) doDispDtl_rpt_tgt_typ_NC(info);
		else if (nc == columnDispDtl_rpt_key_typ) doDispDtl_rpt_key_typ_NC(info);
		else if (nc == columnDispDtl_calc_grp_cd) doDispDtl_calc_grp_cd_NC(info);
		else if (nc == columnDispDtl_calc_no) doDispDtl_calc_no_NC(info);
		else if (nc == columnDispDtl_wg_cd) doDispDtl_wg_cd_NC(info);
		else if (nc == columnDispDtl_rpt_row_cd) doDispDtl_rpt_row_cd_NC(info);
		else if (nc == columnDispDtl_rpt_pre_word) doDispDtl_rpt_pre_word_NC(info);
		else if (nc == columnDispDtl_rpt_row_nm) doDispDtl_rpt_row_nm_NC(info);
		else if (nc == columnDispDtl_fg_r) doDispDtl_fg_r_NC(info);
		else if (nc == columnDispDtl_fg_g) doDispDtl_fg_g_NC(info);
		else if (nc == columnDispDtl_fg_b) doDispDtl_fg_b_NC(info);
		else if (nc == columnDispDtl_bg_r) doDispDtl_bg_r_NC(info);
		else if (nc == columnDispDtl_bg_g) doDispDtl_bg_g_NC(info);
		else if (nc == columnDispDtl_bg_b) doDispDtl_bg_b_NC(info);
		else if (nc == columnDispDtl_asst_typ) doDispDtl_asst_typ_NC(info);
		else if (nc == columnDispDtl_alc_ac_grp_cd1) doDispDtl_alc_ac_grp_cd1_NC(info);
		else if (nc == columnDispDtl_alc_ac_grp_cd2) doDispDtl_alc_ac_grp_cd2_NC(info);
		else if (nc == columnDispDtl_alc_ac_grp_cd3) doDispDtl_alc_ac_grp_cd3_NC(info);
		else if (nc == columnDispDtl_alc_ac_cd) doDispDtl_alc_ac_cd_NC(info);
		else if (nc == columnDispDtl_ac_slip_typ) doDispDtl_ac_slip_typ_NC(info);
		else if (nc == columnDispDtl_ac_rsn_cd) doDispDtl_ac_rsn_cd_NC(info);
		else if (nc == columnDispDtl_itm_jnl_cd2) doDispDtl_itm_jnl_cd2_NC(info);
		else if (nc == columnDispDtl_itm_grp_cd1) doDispDtl_itm_grp_cd1_NC(info);
		else if (nc == columnDispDtl_itm_grp_cd2) doDispDtl_itm_grp_cd2_NC(info);
		else if (nc == columnDispDtl_itm_grp_cd3) doDispDtl_itm_grp_cd3_NC(info);
		else if (nc == columnDispDtl_itm_grp_cd4) doDispDtl_itm_grp_cd4_NC(info);
		else if (nc == columnDispDtl_itm_grp_cd5) doDispDtl_itm_grp_cd5_NC(info);
		else if (nc == columnDispDtl_itm_grp_cd6) doDispDtl_itm_grp_cd6_NC(info);
		else if (nc == columnDispDtl_itm_grp_cd7) doDispDtl_itm_grp_cd7_NC(info);
		else if (nc == columnDispDtl_itm_grp_cd8) doDispDtl_itm_grp_cd8_NC(info);
		else if (nc == columnDispDtl_itm_grp_cd9) doDispDtl_itm_grp_cd9_NC(info);
		else if (nc == columnDispDtl_itm_grp_cd10) doDispDtl_itm_grp_cd10_NC(info);
		else if (nc == columnDispDtl_cost_io_typ) doDispDtl_cost_io_typ_NC(info);
		else if (nc == columnDispDtl_qty_unit_typ) doDispDtl_qty_unit_typ_NC(info);
		else if (nc == columnDispDtl_rpt_row_view) doDispDtl_rpt_row_view_NC(info);
		else if (nc == columnDispDtl_ttl) doDispDtl_ttl_NC(info);
	}

	/**
	 * [DispDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_typ_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[term]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_term_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_seq_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_tgt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_tgt_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_key_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_key_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_no_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_row_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_row_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_pre_word]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_pre_word_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_row_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_row_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[fg_r]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_fg_r_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[fg_g]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_fg_g_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[fg_b]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_fg_b_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bg_r]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bg_r_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bg_g]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bg_g_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bg_b]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bg_b_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ac_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ac_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ac_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ac_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_jnl_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_jnl_cd2_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[cost_io_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_cost_io_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[qty_unit_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_qty_unit_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_row_view]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_row_view_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ttl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ttl_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DispDtlTable) doDispDtl_NE(info);
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Cnd_st_ym) doCnd_st_ym_NE(info);
		else if (ne == Cnd_rpt_ptn_cd) doCnd_rpt_ptn_cd_NE(info);
		else if (ne == Cnd_rpt_ptn_nm) doCnd_rpt_ptn_nm_NE(info);
		else if (ne == Cnd_rpt_key_cd) doCnd_rpt_key_cd_NE(info);
		else if (ne == Cnd_rpt_key_nm) doCnd_rpt_key_nm_NE(info);
		else if (ne == Cnd_rpt_key_typ) doCnd_rpt_key_typ_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_ym) doCnd_ym_NE(info);
		else if (ne == Cnd_term) doCnd_term_NE(info);
		else if (ne == columnDispDtl_rpt_seq) doDispDtl_rpt_seq_NE(info);
		else if (ne == columnDispDtl_rpt_tgt_typ) doDispDtl_rpt_tgt_typ_NE(info);
		else if (ne == columnDispDtl_rpt_key_typ) doDispDtl_rpt_key_typ_NE(info);
		else if (ne == columnDispDtl_calc_grp_cd) doDispDtl_calc_grp_cd_NE(info);
		else if (ne == columnDispDtl_calc_no) doDispDtl_calc_no_NE(info);
		else if (ne == columnDispDtl_wg_cd) doDispDtl_wg_cd_NE(info);
		else if (ne == columnDispDtl_rpt_row_cd) doDispDtl_rpt_row_cd_NE(info);
		else if (ne == columnDispDtl_rpt_pre_word) doDispDtl_rpt_pre_word_NE(info);
		else if (ne == columnDispDtl_rpt_row_nm) doDispDtl_rpt_row_nm_NE(info);
		else if (ne == columnDispDtl_fg_r) doDispDtl_fg_r_NE(info);
		else if (ne == columnDispDtl_fg_g) doDispDtl_fg_g_NE(info);
		else if (ne == columnDispDtl_fg_b) doDispDtl_fg_b_NE(info);
		else if (ne == columnDispDtl_bg_r) doDispDtl_bg_r_NE(info);
		else if (ne == columnDispDtl_bg_g) doDispDtl_bg_g_NE(info);
		else if (ne == columnDispDtl_bg_b) doDispDtl_bg_b_NE(info);
		else if (ne == columnDispDtl_asst_typ) doDispDtl_asst_typ_NE(info);
		else if (ne == columnDispDtl_alc_ac_grp_cd1) doDispDtl_alc_ac_grp_cd1_NE(info);
		else if (ne == columnDispDtl_alc_ac_grp_cd2) doDispDtl_alc_ac_grp_cd2_NE(info);
		else if (ne == columnDispDtl_alc_ac_grp_cd3) doDispDtl_alc_ac_grp_cd3_NE(info);
		else if (ne == columnDispDtl_alc_ac_cd) doDispDtl_alc_ac_cd_NE(info);
		else if (ne == columnDispDtl_ac_slip_typ) doDispDtl_ac_slip_typ_NE(info);
		else if (ne == columnDispDtl_ac_rsn_cd) doDispDtl_ac_rsn_cd_NE(info);
		else if (ne == columnDispDtl_itm_jnl_cd2) doDispDtl_itm_jnl_cd2_NE(info);
		else if (ne == columnDispDtl_itm_grp_cd1) doDispDtl_itm_grp_cd1_NE(info);
		else if (ne == columnDispDtl_itm_grp_cd2) doDispDtl_itm_grp_cd2_NE(info);
		else if (ne == columnDispDtl_itm_grp_cd3) doDispDtl_itm_grp_cd3_NE(info);
		else if (ne == columnDispDtl_itm_grp_cd4) doDispDtl_itm_grp_cd4_NE(info);
		else if (ne == columnDispDtl_itm_grp_cd5) doDispDtl_itm_grp_cd5_NE(info);
		else if (ne == columnDispDtl_itm_grp_cd6) doDispDtl_itm_grp_cd6_NE(info);
		else if (ne == columnDispDtl_itm_grp_cd7) doDispDtl_itm_grp_cd7_NE(info);
		else if (ne == columnDispDtl_itm_grp_cd8) doDispDtl_itm_grp_cd8_NE(info);
		else if (ne == columnDispDtl_itm_grp_cd9) doDispDtl_itm_grp_cd9_NE(info);
		else if (ne == columnDispDtl_itm_grp_cd10) doDispDtl_itm_grp_cd10_NE(info);
		else if (ne == columnDispDtl_cost_io_typ) doDispDtl_cost_io_typ_NE(info);
		else if (ne == columnDispDtl_qty_unit_typ) doDispDtl_qty_unit_typ_NE(info);
		else if (ne == columnDispDtl_rpt_row_view) doDispDtl_rpt_row_view_NE(info);
		else if (ne == columnDispDtl_ttl) doDispDtl_ttl_NE(info);
	}

	/**
	 * [DispDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_typ_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[term]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_term_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_seq_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_tgt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_tgt_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_key_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_key_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_no_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_row_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_row_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_pre_word]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_pre_word_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_row_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_row_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[fg_r]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_fg_r_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[fg_g]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_fg_g_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[fg_b]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_fg_b_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bg_r]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bg_r_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bg_g]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bg_g_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bg_b]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bg_b_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ac_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ac_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ac_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ac_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_jnl_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_jnl_cd2_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[cost_io_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_cost_io_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[qty_unit_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_qty_unit_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_row_view]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_row_view_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ttl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ttl_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DispDtlTable) doDispDtl_NX(info);
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Cnd_st_ym) doCnd_st_ym_NX(info);
		else if (nx == Cnd_rpt_ptn_cd) doCnd_rpt_ptn_cd_NX(info);
		else if (nx == Cnd_rpt_ptn_nm) doCnd_rpt_ptn_nm_NX(info);
		else if (nx == Cnd_rpt_key_cd) doCnd_rpt_key_cd_NX(info);
		else if (nx == Cnd_rpt_key_nm) doCnd_rpt_key_nm_NX(info);
		else if (nx == Cnd_rpt_key_typ) doCnd_rpt_key_typ_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_ym) doCnd_ym_NX(info);
		else if (nx == Cnd_term) doCnd_term_NX(info);
		else if (nx == columnDispDtl_rpt_seq) doDispDtl_rpt_seq_NX(info);
		else if (nx == columnDispDtl_rpt_tgt_typ) doDispDtl_rpt_tgt_typ_NX(info);
		else if (nx == columnDispDtl_rpt_key_typ) doDispDtl_rpt_key_typ_NX(info);
		else if (nx == columnDispDtl_calc_grp_cd) doDispDtl_calc_grp_cd_NX(info);
		else if (nx == columnDispDtl_calc_no) doDispDtl_calc_no_NX(info);
		else if (nx == columnDispDtl_wg_cd) doDispDtl_wg_cd_NX(info);
		else if (nx == columnDispDtl_rpt_row_cd) doDispDtl_rpt_row_cd_NX(info);
		else if (nx == columnDispDtl_rpt_pre_word) doDispDtl_rpt_pre_word_NX(info);
		else if (nx == columnDispDtl_rpt_row_nm) doDispDtl_rpt_row_nm_NX(info);
		else if (nx == columnDispDtl_fg_r) doDispDtl_fg_r_NX(info);
		else if (nx == columnDispDtl_fg_g) doDispDtl_fg_g_NX(info);
		else if (nx == columnDispDtl_fg_b) doDispDtl_fg_b_NX(info);
		else if (nx == columnDispDtl_bg_r) doDispDtl_bg_r_NX(info);
		else if (nx == columnDispDtl_bg_g) doDispDtl_bg_g_NX(info);
		else if (nx == columnDispDtl_bg_b) doDispDtl_bg_b_NX(info);
		else if (nx == columnDispDtl_asst_typ) doDispDtl_asst_typ_NX(info);
		else if (nx == columnDispDtl_alc_ac_grp_cd1) doDispDtl_alc_ac_grp_cd1_NX(info);
		else if (nx == columnDispDtl_alc_ac_grp_cd2) doDispDtl_alc_ac_grp_cd2_NX(info);
		else if (nx == columnDispDtl_alc_ac_grp_cd3) doDispDtl_alc_ac_grp_cd3_NX(info);
		else if (nx == columnDispDtl_alc_ac_cd) doDispDtl_alc_ac_cd_NX(info);
		else if (nx == columnDispDtl_ac_slip_typ) doDispDtl_ac_slip_typ_NX(info);
		else if (nx == columnDispDtl_ac_rsn_cd) doDispDtl_ac_rsn_cd_NX(info);
		else if (nx == columnDispDtl_itm_jnl_cd2) doDispDtl_itm_jnl_cd2_NX(info);
		else if (nx == columnDispDtl_itm_grp_cd1) doDispDtl_itm_grp_cd1_NX(info);
		else if (nx == columnDispDtl_itm_grp_cd2) doDispDtl_itm_grp_cd2_NX(info);
		else if (nx == columnDispDtl_itm_grp_cd3) doDispDtl_itm_grp_cd3_NX(info);
		else if (nx == columnDispDtl_itm_grp_cd4) doDispDtl_itm_grp_cd4_NX(info);
		else if (nx == columnDispDtl_itm_grp_cd5) doDispDtl_itm_grp_cd5_NX(info);
		else if (nx == columnDispDtl_itm_grp_cd6) doDispDtl_itm_grp_cd6_NX(info);
		else if (nx == columnDispDtl_itm_grp_cd7) doDispDtl_itm_grp_cd7_NX(info);
		else if (nx == columnDispDtl_itm_grp_cd8) doDispDtl_itm_grp_cd8_NX(info);
		else if (nx == columnDispDtl_itm_grp_cd9) doDispDtl_itm_grp_cd9_NX(info);
		else if (nx == columnDispDtl_itm_grp_cd10) doDispDtl_itm_grp_cd10_NX(info);
		else if (nx == columnDispDtl_cost_io_typ) doDispDtl_cost_io_typ_NX(info);
		else if (nx == columnDispDtl_qty_unit_typ) doDispDtl_qty_unit_typ_NX(info);
		else if (nx == columnDispDtl_rpt_row_view) doDispDtl_rpt_row_view_NX(info);
		else if (nx == columnDispDtl_ttl) doDispDtl_ttl_NX(info);
	}

	/**
	 * [DispDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_typ_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[term]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_term_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_seq_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_tgt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_tgt_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_key_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_key_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_no_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_row_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_row_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_pre_word]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_pre_word_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_row_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_row_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[fg_r]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_fg_r_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[fg_g]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_fg_g_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[fg_b]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_fg_b_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bg_r]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bg_r_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bg_g]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bg_g_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bg_b]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bg_b_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ac_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ac_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ac_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ac_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_jnl_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_jnl_cd2_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[cost_io_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_cost_io_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[qty_unit_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_qty_unit_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_row_view]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_row_view_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ttl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ttl_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_LC(info);
		else if (lc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_LC(info);
		else if (lc == Cnd_st_ym) doCnd_st_ym_LC(info);
		else if (lc == Cnd_rpt_ptn_cd) doCnd_rpt_ptn_cd_LC(info);
		else if (lc == Cnd_rpt_ptn_nm) doCnd_rpt_ptn_nm_LC(info);
		else if (lc == Cnd_rpt_key_cd) doCnd_rpt_key_cd_LC(info);
		else if (lc == Cnd_rpt_key_nm) doCnd_rpt_key_nm_LC(info);
		else if (lc == Cnd_rpt_key_typ) doCnd_rpt_key_typ_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_ym) doCnd_ym_LC(info);
		else if (lc == Cnd_term) doCnd_term_LC(info);
		else if (lc == columnDispDtl_rpt_seq) doDispDtl_rpt_seq_LC(info);
		else if (lc == columnDispDtl_rpt_tgt_typ) doDispDtl_rpt_tgt_typ_LC(info);
		else if (lc == columnDispDtl_rpt_key_typ) doDispDtl_rpt_key_typ_LC(info);
		else if (lc == columnDispDtl_calc_grp_cd) doDispDtl_calc_grp_cd_LC(info);
		else if (lc == columnDispDtl_calc_no) doDispDtl_calc_no_LC(info);
		else if (lc == columnDispDtl_wg_cd) doDispDtl_wg_cd_LC(info);
		else if (lc == columnDispDtl_rpt_row_cd) doDispDtl_rpt_row_cd_LC(info);
		else if (lc == columnDispDtl_rpt_pre_word) doDispDtl_rpt_pre_word_LC(info);
		else if (lc == columnDispDtl_rpt_row_nm) doDispDtl_rpt_row_nm_LC(info);
		else if (lc == columnDispDtl_fg_r) doDispDtl_fg_r_LC(info);
		else if (lc == columnDispDtl_fg_g) doDispDtl_fg_g_LC(info);
		else if (lc == columnDispDtl_fg_b) doDispDtl_fg_b_LC(info);
		else if (lc == columnDispDtl_bg_r) doDispDtl_bg_r_LC(info);
		else if (lc == columnDispDtl_bg_g) doDispDtl_bg_g_LC(info);
		else if (lc == columnDispDtl_bg_b) doDispDtl_bg_b_LC(info);
		else if (lc == columnDispDtl_asst_typ) doDispDtl_asst_typ_LC(info);
		else if (lc == columnDispDtl_alc_ac_grp_cd1) doDispDtl_alc_ac_grp_cd1_LC(info);
		else if (lc == columnDispDtl_alc_ac_grp_cd2) doDispDtl_alc_ac_grp_cd2_LC(info);
		else if (lc == columnDispDtl_alc_ac_grp_cd3) doDispDtl_alc_ac_grp_cd3_LC(info);
		else if (lc == columnDispDtl_alc_ac_cd) doDispDtl_alc_ac_cd_LC(info);
		else if (lc == columnDispDtl_ac_slip_typ) doDispDtl_ac_slip_typ_LC(info);
		else if (lc == columnDispDtl_ac_rsn_cd) doDispDtl_ac_rsn_cd_LC(info);
		else if (lc == columnDispDtl_itm_jnl_cd2) doDispDtl_itm_jnl_cd2_LC(info);
		else if (lc == columnDispDtl_itm_grp_cd1) doDispDtl_itm_grp_cd1_LC(info);
		else if (lc == columnDispDtl_itm_grp_cd2) doDispDtl_itm_grp_cd2_LC(info);
		else if (lc == columnDispDtl_itm_grp_cd3) doDispDtl_itm_grp_cd3_LC(info);
		else if (lc == columnDispDtl_itm_grp_cd4) doDispDtl_itm_grp_cd4_LC(info);
		else if (lc == columnDispDtl_itm_grp_cd5) doDispDtl_itm_grp_cd5_LC(info);
		else if (lc == columnDispDtl_itm_grp_cd6) doDispDtl_itm_grp_cd6_LC(info);
		else if (lc == columnDispDtl_itm_grp_cd7) doDispDtl_itm_grp_cd7_LC(info);
		else if (lc == columnDispDtl_itm_grp_cd8) doDispDtl_itm_grp_cd8_LC(info);
		else if (lc == columnDispDtl_itm_grp_cd9) doDispDtl_itm_grp_cd9_LC(info);
		else if (lc == columnDispDtl_itm_grp_cd10) doDispDtl_itm_grp_cd10_LC(info);
		else if (lc == columnDispDtl_cost_io_typ) doDispDtl_cost_io_typ_LC(info);
		else if (lc == columnDispDtl_qty_unit_typ) doDispDtl_qty_unit_typ_LC(info);
		else if (lc == columnDispDtl_rpt_row_view) doDispDtl_rpt_row_view_LC(info);
		else if (lc == columnDispDtl_ttl) doDispDtl_ttl_LC(info);
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_typ_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[term]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_term_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_seq_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_tgt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_tgt_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_key_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_key_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_no_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_row_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_row_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_pre_word]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_pre_word_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_row_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_row_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[fg_r]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_fg_r_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[fg_g]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_fg_g_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[fg_b]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_fg_b_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bg_r]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bg_r_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bg_g]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bg_g_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bg_b]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bg_b_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ac_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ac_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ac_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ac_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_jnl_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_jnl_cd2_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[cost_io_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_cost_io_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[qty_unit_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_qty_unit_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_row_view]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_row_view_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ttl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ttl_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_no_p_PPanel_CalcNo_calc_no]の作成メソッド
	 */
	public MCList getCnd_calc_no_p_PPanel_CalcNo_calc_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getCalcNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rpt_ptn_cd]の作成メソッド
	 */
	public MCList getCnd_rpt_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRptPtnInCalcRptPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rpt_key_cd]の作成メソッド
	 */
	public MCList getCnd_rpt_key_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRptKeyWithTypInCalcRptPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBFL0240.Srch01")) {
			return new MG_MGBFL0240_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBFL0240_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0240_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBFL0240_Srch01;

		/** コンストラクタ */
		protected MG_MGBFL0240_Srch01Bridge() {
			p_MG_MGBFL0240_Srch01 = new MCParam(PDef.MG_MGBFL0240_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBFL0240_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBF.MGBFP0240.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0240.DispDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0240.KeyR.class));

			p_MG_MGBFL0240_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBFL0240_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBFL0240_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBFL0240_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBFL0240_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBF.MGBFP0240.CndR up0() {
			return (mcframe.clientMGBF.MGBFP0240.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBF.MGBFP0240.DispDtlR> down0() {
			return (MCList<mcframe.clientMGBF.MGBFP0240.DispDtlR>)down(0);
		}
		protected MCList<mcframe.clientMGBF.MGBFP0240.KeyR> down1() {
			return (MCList<mcframe.clientMGBF.MGBFP0240.KeyR>)down(1);
		}

		protected void setupDownParam() {
			p_MG_MGBFL0240_Srch01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0240.DispDtlR.class));
			p_MG_MGBFL0240_Srch01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0240.KeyR.class));
		}
		protected MCParam param() {
			return p_MG_MGBFL0240_Srch01;
		}

		protected void show() {
			setDispDtlL((MCList<mcframe.clientMGBF.MGBFP0240.DispDtlR>)p_MG_MGBFL0240_Srch01.getContainerParam().getDownBlock(0));
			setKeyL((MCList<mcframe.clientMGBF.MGBFP0240.KeyR>)p_MG_MGBFL0240_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getDispDtlL().clear();
			getKeyL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDispDtlL());
			result.add(getKeyL());
			return result;
		}
	}
}