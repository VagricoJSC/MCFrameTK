package mcframe.clientMGBF.MGBFP0400;

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
import mcframe.clientMGBF.MGBFP0400.MGBFP_MlyRptSrch_MC.MG_MGBFL0400_Srch01Caller;

/**
 * 画面"MGBFP_MlyRptSrch"パネルクラスです。<p>
 *
 * 月別原価レポートを照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBFP_MlyRptSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBFP0400";

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
	/**
	 * Max. calculation months 最大計算月数.<p>
	 *
	 */
	public MCNumberField Cnd_max_mons = null;
	public MCLabel Cnd_ym_fr_Label = null;
	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ym_fr = null;
	public MCLabel Cnd_ym_to_Label = null;
	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ym_to = null;
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
	public MCLabel Cnd_mng_dpt_cd_Label = null;
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_mng_dpt_cd = null;
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public MCTextField Cnd_mng_dpt_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_itm_jnl_cd_Label = null;
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCTextField Cnd_itm_jnl_nm = null;
	public MCLabel Cnd_itm_grp_cd_Label = null;
	/**
	 * Item classification cd. 品目分類ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd = null;
	/**
	 * Item classification name 品目分類名.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm = null;
	/**
	 * Item classification type 品目分類区分.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_typ = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [DispDtl]ブロック関連のField定義
	public MCPanel DispDtlPanel = null;
	public MCScrollPane DispDtlScrollPane = null;
	public MCColumnGroupTable<mcframe.clientMGBF.MGBFP0400.DispDtlR> DispDtlTable = null;
	// [DispDtl]ブロックの項目のField定義
	/**
	 * Report type レポート対象区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_rpt_tgt_typ = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_rpt_seq = null;
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
	
	/** [MG_MGBFL0400_Srch01]のCallerの作成 */
	protected MGBFP_MlyRptSrch_MC.MG_MGBFL0400_Srch01Caller createMG_MGBFL0400_Srch01() {
		MGBFP_MlyRptSrch_MC.MG_MGBFL0400_Srch01Caller<MGBFP_MlyRptSrch, MG_MGBFL0400_Srch01Bridge>
		caller = ((MGBFP_MlyRptSrch_MC)this).new MG_MGBFL0400_Srch01Caller<MGBFP_MlyRptSrch, MG_MGBFL0400_Srch01Bridge>(
					(MGBFP_MlyRptSrch)this, new MG_MGBFL0400_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBFL0400_Srch01]の呼び出し */
	protected void callMG_MGBFL0400_Srch01() {
		MCCaller caller = createMG_MGBFL0400_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBF.MGBFP0400.CndR aCndR;
	/** [DispDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0400.DispDtlR> aDispDtlL;
	/** [Key]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0400.KeyR> aKeyL;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMGBF.MGBFP0400.HdrR aHdrR;
	/** [CalcNo]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0400.CalcNoR> aCalcNoL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBF.MGBFP0400.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0400.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0400.CndR createCndR() {
		return mcframe.clientMGBF.MGBFP0400.CndR.create();
	}

	/**
	 * コピーによってaDispDtlLを設定します。
	 *
	 * aDispDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DispDtlL
	 */
	public void setDispDtlL(MCList<mcframe.clientMGBF.MGBFP0400.DispDtlR> aList) {
		if (getDispDtlL() != aList) {
			getDispDtlL().setAll(aList);
		}
	}

	/**
	 * [DispDtl]ブロックのコンテナaDispDtlLを返します。
	 *
	 * @return DispDtlL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0400.DispDtlR> getDispDtlL() {
		return aDispDtlL;
	}

	/**
	 * aDispDtlRを作成します。
	 *
	 * @return DispDtlR
	 */
	public mcframe.clientMGBF.MGBFP0400.DispDtlR createDispDtlR() {
		return mcframe.clientMGBF.MGBFP0400.DispDtlR.create();
	}

	/**
	 * aDispDtlLを作成します。
	 *
	 * @return DispDtlL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0400.DispDtlR> createDispDtlL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0400.DispDtlR.class);
	}

	/**
	 * DispDtlTableを初期化します。
	 */
	protected void createDispDtlTable(){
		if(DispDtlTable == null){
			DispDtlTable = beansFactory.createColumnGroupTable("DispDtl.table");
		}
	}

	/**
	 * コピーによってaKeyLを設定します。
	 *
	 * aKeyLのインスタンスは変更されません。
	 *
	 * @param dataset KeyL
	 */
	public void setKeyL(MCList<mcframe.clientMGBF.MGBFP0400.KeyR> aList) {
		if (getKeyL() != aList) {
			getKeyL().setAll(aList);
		}
	}

	/**
	 * [Key]ブロックのコンテナaKeyLを返します。
	 *
	 * @return KeyL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0400.KeyR> getKeyL() {
		return aKeyL;
	}

	/**
	 * aKeyRを作成します。
	 *
	 * @return KeyR
	 */
	public mcframe.clientMGBF.MGBFP0400.KeyR createKeyR() {
		return mcframe.clientMGBF.MGBFP0400.KeyR.create();
	}

	/**
	 * aKeyLを作成します。
	 *
	 * @return KeyL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0400.KeyR> createKeyL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0400.KeyR.class);
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMGBF.MGBFP0400.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMGBF.MGBFP0400.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMGBF.MGBFP0400.HdrR createHdrR() {
		return mcframe.clientMGBF.MGBFP0400.HdrR.create();
	}

	/**
	 * コピーによってaCalcNoLを設定します。
	 *
	 * aCalcNoLのインスタンスは変更されません。
	 *
	 * @param dataset CalcNoL
	 */
	public void setCalcNoL(MCList<mcframe.clientMGBF.MGBFP0400.CalcNoR> aList) {
		if (getCalcNoL() != aList) {
			getCalcNoL().setAll(aList);
		}
	}

	/**
	 * [CalcNo]ブロックのコンテナaCalcNoLを返します。
	 *
	 * @return CalcNoL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0400.CalcNoR> getCalcNoL() {
		return aCalcNoL;
	}

	/**
	 * aCalcNoRを作成します。
	 *
	 * @return CalcNoR
	 */
	public mcframe.clientMGBF.MGBFP0400.CalcNoR createCalcNoR() {
		return mcframe.clientMGBF.MGBFP0400.CalcNoR.create();
	}

	/**
	 * aCalcNoLを作成します。
	 *
	 * @return CalcNoL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0400.CalcNoR> createCalcNoL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0400.CalcNoR.class);
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
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getCalcNoL())) ret.add(getCalcNoL());
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
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getCalcNoL()) return "CalcNo";
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
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("CalcNo")) return getCalcNoL();
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
	public MGBFP_MlyRptSrch_MC_A() {
		aCndR = createCndR();
		aDispDtlL = createDispDtlL();
		aKeyL = createKeyL();
		aHdrR = createHdrR();
		aCalcNoL = createCalcNoL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBFP_MlyRptSrch_MC_A(String name) {
		aCndR = createCndR();
		aDispDtlL = createDispDtlL();
		createDispDtlTable();
		DispDtlTable.setRowName(name);
		aKeyL = createKeyL();
		aHdrR = createHdrR();
		aCalcNoL = createCalcNoL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBFP_MlyRptSrch_MC.jbCreateTop((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.jbCreateCnd((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.jbCreateCtrl((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.jbCreateDispDtl((MGBFP_MlyRptSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBFP_MlyRptSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBFP_MlyRptSrch p) {
		p.Cnd_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().itm_p());
		p.Cnd_itm_p_PPanel.setName("Cnd.itm_p");
		p.Cnd_itm_cd = p.Cnd_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_itm_cd.addAliasName("Cnd.itm_cd", p);
		p.Cnd_itm_sub1 = p.Cnd_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_itm_sub1.addAliasName("Cnd.itm_sub1", p);
		p.Cnd_itm_sub2 = p.Cnd_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_itm_sub2.addAliasName("Cnd.itm_sub2", p);
		p.Cnd_itm_sub3 = p.Cnd_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_itm_sub3.addAliasName("Cnd.itm_sub3", p);
		p.Cnd_itm_nm = p.Cnd_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_itm_nm.addAliasName("Cnd.itm_nm", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBFP_MlyRptSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [DispDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispDtl(MGBFP_MlyRptSrch p) {
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
			Cnd_calc_grp_cd_p = createCnd_calc_grp_cd_ListPutter(Cnd_calc_grp_cd, "calc_grp_cd", "calc_grp_nm","max_mons");

		}
		return Cnd_calc_grp_cd_p;
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
	
	
	/** [Cnd_mng_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mng_dpt_cd_p = null;

	/**
	 * [Cnd_mng_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mng_dpt_cd_ListPutter() {
		if (Cnd_mng_dpt_cd_p == null) {
			Cnd_mng_dpt_cd_p = createCnd_mng_dpt_cd_ListPutter(Cnd_mng_dpt_cd, "mng_dpt_cd", "mng_dpt_nm");

		}
		return Cnd_mng_dpt_cd_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_cd_p = createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_itm_p_PPanel.Itm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub1_p = createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub2_p = createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub3_p = createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub3, "itm_sub3", "itm_nm");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Cnd_itm_jnl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_jnl_cd_p = null;

	/**
	 * [Cnd_itm_jnl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_jnl_cd_ListPutter() {
		if (Cnd_itm_jnl_cd_p == null) {
			Cnd_itm_jnl_cd_p = createCnd_itm_jnl_cd_ListPutter(Cnd_itm_jnl_cd, "itm_jnl_cd", "itm_jnl_nm");

		}
		return Cnd_itm_jnl_cd_p;
	}
	
	
	/** [Cnd_itm_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd_p = null;

	/**
	 * [Cnd_itm_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd_ListPutter() {
		if (Cnd_itm_grp_cd_p == null) {
			Cnd_itm_grp_cd_p = createCnd_itm_grp_cd_ListPutter(Cnd_itm_grp_cd, "itm_grp_cd", "itm_grp_nm","itm_grp_typ");

		}
		return Cnd_itm_grp_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_MlyRptSrch create(){
		MGBFP_MlyRptSrch p = new MGBFP_MlyRptSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_MlyRptSrch create(String name){
		MGBFP_MlyRptSrch p = new MGBFP_MlyRptSrch(name);
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
		MGBFP_MlyRptSrch_MC.jbfInitTop((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.jbfInitCnd((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.jbfInitCtrl((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.jbfInitDispDtl((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.jbInitTop((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.jbInitCnd((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.jbInitCtrl((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.jbInitDispDtl((MGBFP_MlyRptSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBFP_MlyRptSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBFP_MlyRptSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
		p.Cnd_max_mons = p.beansFactory.createNumberField("Cnd.max_mons");
		p.Cnd_ym_fr_Label = p.beansFactory.createLabel("Cnd.ym_fr_Label");
		p.Cnd_ym_fr = p.beansFactory.createDateField("Cnd.ym_fr");
		p.Cnd_ym_fr.setLabel(p.Cnd_ym_fr_Label);
		p.Cnd_ym_to_Label = p.beansFactory.createLabel("Cnd.ym_to_Label");
		p.Cnd_ym_to = p.beansFactory.createDateField("Cnd.ym_to");
		p.Cnd_ym_to.setLabel(p.Cnd_ym_to_Label);
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
		p.Cnd_mng_dpt_cd_Label = p.beansFactory.createLabel("Cnd.mng_dpt_cd_Label");
		p.Cnd_mng_dpt_cd = p.beansFactory.createTextComboBox("Cnd.mng_dpt_cd");
		p.Cnd_mng_dpt_cd.setLabel(p.Cnd_mng_dpt_cd_Label);
		p.Cnd_mng_dpt_nm = p.beansFactory.createTextField("Cnd.mng_dpt_nm");
		p.Cnd_itm_jnl_cd_Label = p.beansFactory.createLabel("Cnd.itm_jnl_cd_Label");
		p.Cnd_itm_jnl_cd = p.beansFactory.createTextComboBox("Cnd.itm_jnl_cd");
		p.Cnd_itm_jnl_cd.setLabel(p.Cnd_itm_jnl_cd_Label);
		p.Cnd_itm_jnl_nm = p.beansFactory.createTextField("Cnd.itm_jnl_nm");
		p.Cnd_itm_grp_cd_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd_Label");
		p.Cnd_itm_grp_cd = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd");
		p.Cnd_itm_grp_cd.setLabel(p.Cnd_itm_grp_cd_Label);
		p.Cnd_itm_grp_nm = p.beansFactory.createTextField("Cnd.itm_grp_nm");
		p.Cnd_itm_grp_typ = p.beansFactory.createTextField("Cnd.itm_grp_typ");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBFP_MlyRptSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [DispDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispDtl(MGBFP_MlyRptSrch p) {
		// ブロック関連の初期化
		p.DispDtlPanel = p.beansFactory.createPanel("DispDtl");
		p.DispDtlScrollPane = p.beansFactory.createScrollPane("DispDtl.scroll");
		p.createDispDtlTable();
		// ブロックの項目の初期化
		p.columnDispDtl_rpt_tgt_typ = p.beansFactory.createTableColumn("DispDtl.rpt_tgt_typ", MCColumnType.TEXT);
		p.columnDispDtl_rpt_seq = p.beansFactory.createTableColumn("DispDtl.rpt_seq", MCColumnType.NUMBER);
		p.columnDispDtl_fg_r = p.beansFactory.createTableColumn("DispDtl.fg_r", MCColumnType.NUMBER);
		p.columnDispDtl_fg_g = p.beansFactory.createTableColumn("DispDtl.fg_g", MCColumnType.NUMBER);
		p.columnDispDtl_fg_b = p.beansFactory.createTableColumn("DispDtl.fg_b", MCColumnType.NUMBER);
		p.columnDispDtl_bg_r = p.beansFactory.createTableColumn("DispDtl.bg_r", MCColumnType.NUMBER);
		p.columnDispDtl_bg_g = p.beansFactory.createTableColumn("DispDtl.bg_g", MCColumnType.NUMBER);
		p.columnDispDtl_bg_b = p.beansFactory.createTableColumn("DispDtl.bg_b", MCColumnType.NUMBER);
		p.columnDispDtl_qty_unit_typ = p.beansFactory.createTableColumn("DispDtl.qty_unit_typ", MCColumnType.TEXT);
		p.columnDispDtl_rpt_row_view = p.beansFactory.createTableColumn("DispDtl.rpt_row_view", MCColumnType.TEXT);
		p.columnDispDtl_ttl = p.beansFactory.createTableColumn("DispDtl.ttl", MCColumnType.NUMBER);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBFP_MlyRptSrch p) {
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
	protected static void jbInitCnd(MGBFP_MlyRptSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm,p.Cnd_max_mons);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0400.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_max_mons);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0400.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_max_mons);
		p.Cnd_max_mons.setNextBeans(p.Cnd_ym_fr);
		p.Cnd_max_mons.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0400.CndR.max_mons_META);
		p.CndPanel.add(p.Cnd_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ym_fr);
		p.Cnd_ym_fr.setNextBeans(p.Cnd_ym_to);
		p.Cnd_ym_fr.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0400.CndR.ym_fr_META);
		p.Cnd_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ym_to_Label);
		p.CndPanel.add(p.Cnd_ym_to);
		p.Cnd_ym_to.setNextBeans(p.Cnd_rpt_ptn_cd);
		p.Cnd_ym_to.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0400.CndR.ym_to_META);
		p.Cnd_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_rpt_ptn_cd.setListType(MCListType.FREE);
		p.Cnd_rpt_ptn_cd.setLinkBeans(p.Cnd_rpt_ptn_nm);
		p.CndPanel.add(p.Cnd_rpt_ptn_cd_Label);
		p.CndPanel.add(p.Cnd_rpt_ptn_cd);
		p.Cnd_rpt_ptn_cd.setNextBeans(p.Cnd_rpt_ptn_nm);
		p.Cnd_rpt_ptn_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0400.CndR.rpt_ptn_cd_META);
		p.CndPanel.add(p.Cnd_rpt_ptn_nm);
		p.Cnd_rpt_ptn_nm.setNextBeans(p.Cnd_rpt_key_cd);
		p.Cnd_rpt_ptn_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0400.CndR.rpt_ptn_nm_META);
		p.Cnd_rpt_key_cd.setListType(MCListType.FREE);
		p.Cnd_rpt_key_cd.setLinkBeans(p.Cnd_rpt_key_nm,p.Cnd_rpt_key_typ);
		p.CndPanel.add(p.Cnd_rpt_key_cd_Label);
		p.CndPanel.add(p.Cnd_rpt_key_cd);
		p.Cnd_rpt_key_cd.setNextBeans(p.Cnd_rpt_key_nm);
		p.Cnd_rpt_key_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0400.CndR.rpt_key_cd_META);
		p.CndPanel.add(p.Cnd_rpt_key_nm);
		p.Cnd_rpt_key_nm.setNextBeans(p.Cnd_rpt_key_typ);
		p.Cnd_rpt_key_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0400.CndR.rpt_key_nm_META);
		p.CndPanel.add(p.Cnd_rpt_key_typ);
		p.Cnd_rpt_key_typ.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_rpt_key_typ.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0400.CndR.rpt_key_typ_META);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0400.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_mng_dpt_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0400.CndR.wg_nm_META);
		p.Cnd_mng_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mng_dpt_cd, true);
		p.Cnd_mng_dpt_cd.setLinkBeans(p.Cnd_mng_dpt_nm);
		p.CndPanel.add(p.Cnd_mng_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_mng_dpt_cd);
		p.Cnd_mng_dpt_cd.setNextBeans(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0400.CndR.mng_dpt_cd_META);
		p.CndPanel.add(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_mng_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0400.CndR.mng_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_mng_dpt_nm, true);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub3, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_nm, true);
		p.Cnd_itm_jnl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_jnl_cd, true);
		p.Cnd_itm_jnl_cd.setLinkBeans(p.Cnd_itm_jnl_nm);
		p.CndPanel.add(p.Cnd_itm_jnl_cd_Label);
		p.CndPanel.add(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setNextBeans(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0400.CndR.itm_jnl_cd_META);
		p.CndPanel.add(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_nm.setNextBeans(p.Cnd_itm_grp_cd);
		p.Cnd_itm_jnl_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0400.CndR.itm_jnl_nm_META);
		p.setPluralValueEnable(p.Cnd_itm_jnl_nm, true);
		p.Cnd_itm_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd, true);
		p.Cnd_itm_grp_cd.setLinkBeans(p.Cnd_itm_grp_nm,p.Cnd_itm_grp_typ);
		p.CndPanel.add(p.Cnd_itm_grp_cd_Label);
		p.CndPanel.add(p.Cnd_itm_grp_cd);
		p.Cnd_itm_grp_cd.setNextBeans(p.Cnd_itm_grp_nm);
		p.Cnd_itm_grp_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0400.CndR.itm_grp_cd_META);
		p.CndPanel.add(p.Cnd_itm_grp_nm);
		p.Cnd_itm_grp_nm.setNextBeans(p.Cnd_itm_grp_typ);
		p.Cnd_itm_grp_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0400.CndR.itm_grp_nm_META);
		p.CndPanel.add(p.Cnd_itm_grp_typ);
		p.Cnd_itm_grp_typ.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0400.CndR.itm_grp_typ_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBFP_MlyRptSrch p) {
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
	protected static void jbInitDispDtl(MGBFP_MlyRptSrch p) {
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
		MGBFP_MlyRptSrch_MC.mcInitTop((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.mcInitCnd((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.mcInitCtrl((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.mcInitDispDtl((MGBFP_MlyRptSrch)this);

		// [SRCH]ステータスのモードの設定
		MGBFP_MlyRptSrch_MC.statusInitSRCH_Top((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.statusInitSRCH_Cnd((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.statusInitSRCH_Ctrl((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.statusInitSRCH_DispDtl((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.statusInitSRCH_Key((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.statusInitSRCH_Hdr((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.statusInitSRCH_CalcNo((MGBFP_MlyRptSrch)this);

		// [REF]ステータスのモードの設定
		MGBFP_MlyRptSrch_MC.statusInitREF_Top((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.statusInitREF_Cnd((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.statusInitREF_Ctrl((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.statusInitREF_DispDtl((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.statusInitREF_Key((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.statusInitREF_Hdr((MGBFP_MlyRptSrch)this);
		MGBFP_MlyRptSrch_MC.statusInitREF_CalcNo((MGBFP_MlyRptSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBFP_MlyRptSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBFP_MlyRptSrch p) {
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_max_mons.setListListener(p);
		p.Cnd_max_mons.addAllListener(p);
		p.Cnd_ym_fr.setListListener(p);
		p.Cnd_ym_fr.addAllListener(p);
		p.Cnd_ym_to.setListListener(p);
		p.Cnd_ym_to.addAllListener(p);
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
		p.Cnd_mng_dpt_cd.setListListener(p);
		p.Cnd_mng_dpt_cd.addAllListener(p);
		p.Cnd_mng_dpt_nm.setListListener(p);
		p.Cnd_mng_dpt_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_jnl_cd.setListListener(p);
		p.Cnd_itm_jnl_cd.addAllListener(p);
		p.Cnd_itm_jnl_nm.setListListener(p);
		p.Cnd_itm_jnl_nm.addAllListener(p);
		p.Cnd_itm_grp_cd.setListListener(p);
		p.Cnd_itm_grp_cd.addAllListener(p);
		p.Cnd_itm_grp_nm.setListListener(p);
		p.Cnd_itm_grp_nm.addAllListener(p);
		p.Cnd_itm_grp_typ.setListListener(p);
		p.Cnd_itm_grp_typ.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBFP_MlyRptSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [DispDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispDtl(MGBFP_MlyRptSrch p) {
		p.DispDtlTable.addAllListener(p);
		p.columnDispDtl_rpt_tgt_typ.addAllListener(p);
		p.columnDispDtl_rpt_tgt_typ.setListListener(p);
		p.columnDispDtl_rpt_seq.addAllListener(p);
		p.columnDispDtl_rpt_seq.setListListener(p);
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
	protected static void statusInitSRCH_Top(MGBFP_MlyRptSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBFP_MlyRptSrch p){
		p.Cnd_calc_grp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_max_mons.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_ym_fr.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ym_to.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_rpt_key_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rpt_key_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_mng_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_jnl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_typ.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBFP_MlyRptSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[DispDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DispDtl(MGBFP_MlyRptSrch p){
		p.columnDispDtl_rpt_tgt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_rpt_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_fg_r.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_fg_g.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_fg_b.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_bg_r.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_bg_g.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_bg_b.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_qty_unit_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_rpt_row_view.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_ttl.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Key]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Key(MGBFP_MlyRptSrch p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MGBFP_MlyRptSrch p){

	}

	/**
	 * [SRCH]ステータスの[CalcNo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_CalcNo(MGBFP_MlyRptSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBFP_MlyRptSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBFP_MlyRptSrch p){
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_max_mons.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_ym_fr.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ym_to.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_rpt_key_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rpt_key_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_mng_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_jnl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_typ.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBFP_MlyRptSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[DispDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_DispDtl(MGBFP_MlyRptSrch p){
		p.columnDispDtl_rpt_tgt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_rpt_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_fg_r.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_fg_g.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_fg_b.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_bg_r.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_bg_g.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_bg_b.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_qty_unit_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_rpt_row_view.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_ttl.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Key]ブロックのモードの設定
	 */
	protected static void statusInitREF_Key(MGBFP_MlyRptSrch p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MGBFP_MlyRptSrch p){

	}

	/**
	 * [REF]ステータスの[CalcNo]ブロックのモードの設定
	 */
	protected static void statusInitREF_CalcNo(MGBFP_MlyRptSrch p){

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
		MGBFP_MlyRptSrch_MC.setTableConfigDispDtl((MGBFP_MlyRptSrch)this);
	}

	/**
	 * [DispDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDispDtl(MGBFP_MlyRptSrch p) {
		p.columnDispDtl_rpt_tgt_typ.setMeta(mcframe.clientMGBF.MGBFP0400.DispDtlR.rpt_tgt_typ_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_rpt_tgt_typ);
		p.columnDispDtl_rpt_seq.setMeta(mcframe.clientMGBF.MGBFP0400.DispDtlR.rpt_seq_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_rpt_seq);
		p.columnDispDtl_fg_r.setMeta(mcframe.clientMGBF.MGBFP0400.DispDtlR.fg_r_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_fg_r);
		p.columnDispDtl_fg_g.setMeta(mcframe.clientMGBF.MGBFP0400.DispDtlR.fg_g_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_fg_g);
		p.columnDispDtl_fg_b.setMeta(mcframe.clientMGBF.MGBFP0400.DispDtlR.fg_b_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_fg_b);
		p.columnDispDtl_bg_r.setMeta(mcframe.clientMGBF.MGBFP0400.DispDtlR.bg_r_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_bg_r);
		p.columnDispDtl_bg_g.setMeta(mcframe.clientMGBF.MGBFP0400.DispDtlR.bg_g_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_bg_g);
		p.columnDispDtl_bg_b.setMeta(mcframe.clientMGBF.MGBFP0400.DispDtlR.bg_b_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_bg_b);
		p.columnDispDtl_qty_unit_typ.setMeta(mcframe.clientMGBF.MGBFP0400.DispDtlR.qty_unit_typ_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_qty_unit_typ);
		p.columnDispDtl_rpt_row_view.setMeta(mcframe.clientMGBF.MGBFP0400.DispDtlR.rpt_row_view_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_rpt_row_view);
		p.columnDispDtl_ttl.setMeta(mcframe.clientMGBF.MGBFP0400.DispDtlR.ttl_META);
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
		Cnd_rpt_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rpt_ptn_cd.getListConfig().setPutter(getCnd_rpt_ptn_cd_ListPutter());
		Cnd_rpt_key_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rpt_key_cd.getListConfig().setPutter(getCnd_rpt_key_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_mng_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mng_dpt_cd.getListConfig().setPutter(getCnd_mng_dpt_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_jnl_cd.getListConfig().setPutter(getCnd_itm_jnl_cd_ListPutter());
		Cnd_itm_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd.getListConfig().setPutter(getCnd_itm_grp_cd_ListPutter());
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
	 * [Cnd_mng_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mng_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.CostDptInRptKeyConf");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Cnd_itm_jnl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_jnl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.ItmJnlInRptKeyConf");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.ItmGrpInRptKeyConf");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == Cnd_rpt_ptn_cd) return getCnd_rpt_ptn_cd(row, info);
		if(combo == Cnd_rpt_key_cd) return getCnd_rpt_key_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_mng_dpt_cd) return getCnd_mng_dpt_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_itm_jnl_cd) return getCnd_itm_jnl_cd(row, info);
		if(combo == Cnd_itm_grp_cd) return getCnd_itm_grp_cd(row, info);
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
		if (vc == Cnd_max_mons) return doCnd_max_mons_VC(info);
		if (vc == Cnd_ym_fr) return doCnd_ym_fr_VC(info);
		if (vc == Cnd_ym_to) return doCnd_ym_to_VC(info);
		if (vc == Cnd_rpt_ptn_cd) return doCnd_rpt_ptn_cd_VC(info);
		if (vc == Cnd_rpt_ptn_nm) return doCnd_rpt_ptn_nm_VC(info);
		if (vc == Cnd_rpt_key_cd) return doCnd_rpt_key_cd_VC(info);
		if (vc == Cnd_rpt_key_nm) return doCnd_rpt_key_nm_VC(info);
		if (vc == Cnd_rpt_key_typ) return doCnd_rpt_key_typ_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_mng_dpt_cd) return doCnd_mng_dpt_cd_VC(info);
		if (vc == Cnd_mng_dpt_nm) return doCnd_mng_dpt_nm_VC(info);
		if (vc == Cnd_itm_jnl_cd) return doCnd_itm_jnl_cd_VC(info);
		if (vc == Cnd_itm_jnl_nm) return doCnd_itm_jnl_nm_VC(info);
		if (vc == Cnd_itm_grp_cd) return doCnd_itm_grp_cd_VC(info);
		if (vc == Cnd_itm_grp_nm) return doCnd_itm_grp_nm_VC(info);
		if (vc == Cnd_itm_grp_typ) return doCnd_itm_grp_typ_VC(info);
		if (vc == columnDispDtl_rpt_tgt_typ) return doDispDtl_rpt_tgt_typ_VC(info);
		if (vc == columnDispDtl_rpt_seq) return doDispDtl_rpt_seq_VC(info);
		if (vc == columnDispDtl_fg_r) return doDispDtl_fg_r_VC(info);
		if (vc == columnDispDtl_fg_g) return doDispDtl_fg_g_VC(info);
		if (vc == columnDispDtl_fg_b) return doDispDtl_fg_b_VC(info);
		if (vc == columnDispDtl_bg_r) return doDispDtl_bg_r_VC(info);
		if (vc == columnDispDtl_bg_g) return doDispDtl_bg_g_VC(info);
		if (vc == columnDispDtl_bg_b) return doDispDtl_bg_b_VC(info);
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
	 * [Cnd]パネルの[max_mons]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_max_mons_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[mng_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mng_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mng_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mng_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_typ_VC(MCEventInfo info){
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
	 * [DispDtl]パネルの[rpt_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_rpt_seq_VC(MCEventInfo info){
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
		else if (nc == Cnd_max_mons) doCnd_max_mons_NC(info);
		else if (nc == Cnd_ym_fr) doCnd_ym_fr_NC(info);
		else if (nc == Cnd_ym_to) doCnd_ym_to_NC(info);
		else if (nc == Cnd_rpt_ptn_cd) doCnd_rpt_ptn_cd_NC(info);
		else if (nc == Cnd_rpt_ptn_nm) doCnd_rpt_ptn_nm_NC(info);
		else if (nc == Cnd_rpt_key_cd) doCnd_rpt_key_cd_NC(info);
		else if (nc == Cnd_rpt_key_nm) doCnd_rpt_key_nm_NC(info);
		else if (nc == Cnd_rpt_key_typ) doCnd_rpt_key_typ_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NC(info);
		else if (nc == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NC(info);
		else if (nc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NC(info);
		else if (nc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NC(info);
		else if (nc == Cnd_itm_grp_cd) doCnd_itm_grp_cd_NC(info);
		else if (nc == Cnd_itm_grp_nm) doCnd_itm_grp_nm_NC(info);
		else if (nc == Cnd_itm_grp_typ) doCnd_itm_grp_typ_NC(info);
		else if (nc == columnDispDtl_rpt_tgt_typ) doDispDtl_rpt_tgt_typ_NC(info);
		else if (nc == columnDispDtl_rpt_seq) doDispDtl_rpt_seq_NC(info);
		else if (nc == columnDispDtl_fg_r) doDispDtl_fg_r_NC(info);
		else if (nc == columnDispDtl_fg_g) doDispDtl_fg_g_NC(info);
		else if (nc == columnDispDtl_fg_b) doDispDtl_fg_b_NC(info);
		else if (nc == columnDispDtl_bg_r) doDispDtl_bg_r_NC(info);
		else if (nc == columnDispDtl_bg_g) doDispDtl_bg_g_NC(info);
		else if (nc == columnDispDtl_bg_b) doDispDtl_bg_b_NC(info);
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
	 * [Cnd]パネルの[max_mons]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_mons_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[mng_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mng_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_tgt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_tgt_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_seq_NC(MCEventInfo info){
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
		else if (ne == Cnd_max_mons) doCnd_max_mons_NE(info);
		else if (ne == Cnd_ym_fr) doCnd_ym_fr_NE(info);
		else if (ne == Cnd_ym_to) doCnd_ym_to_NE(info);
		else if (ne == Cnd_rpt_ptn_cd) doCnd_rpt_ptn_cd_NE(info);
		else if (ne == Cnd_rpt_ptn_nm) doCnd_rpt_ptn_nm_NE(info);
		else if (ne == Cnd_rpt_key_cd) doCnd_rpt_key_cd_NE(info);
		else if (ne == Cnd_rpt_key_nm) doCnd_rpt_key_nm_NE(info);
		else if (ne == Cnd_rpt_key_typ) doCnd_rpt_key_typ_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NE(info);
		else if (ne == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NE(info);
		else if (ne == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NE(info);
		else if (ne == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NE(info);
		else if (ne == Cnd_itm_grp_cd) doCnd_itm_grp_cd_NE(info);
		else if (ne == Cnd_itm_grp_nm) doCnd_itm_grp_nm_NE(info);
		else if (ne == Cnd_itm_grp_typ) doCnd_itm_grp_typ_NE(info);
		else if (ne == columnDispDtl_rpt_tgt_typ) doDispDtl_rpt_tgt_typ_NE(info);
		else if (ne == columnDispDtl_rpt_seq) doDispDtl_rpt_seq_NE(info);
		else if (ne == columnDispDtl_fg_r) doDispDtl_fg_r_NE(info);
		else if (ne == columnDispDtl_fg_g) doDispDtl_fg_g_NE(info);
		else if (ne == columnDispDtl_fg_b) doDispDtl_fg_b_NE(info);
		else if (ne == columnDispDtl_bg_r) doDispDtl_bg_r_NE(info);
		else if (ne == columnDispDtl_bg_g) doDispDtl_bg_g_NE(info);
		else if (ne == columnDispDtl_bg_b) doDispDtl_bg_b_NE(info);
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
	 * [Cnd]パネルの[max_mons]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_mons_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[mng_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mng_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_tgt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_tgt_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_seq_NE(MCEventInfo info){
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
		else if (nx == Cnd_max_mons) doCnd_max_mons_NX(info);
		else if (nx == Cnd_ym_fr) doCnd_ym_fr_NX(info);
		else if (nx == Cnd_ym_to) doCnd_ym_to_NX(info);
		else if (nx == Cnd_rpt_ptn_cd) doCnd_rpt_ptn_cd_NX(info);
		else if (nx == Cnd_rpt_ptn_nm) doCnd_rpt_ptn_nm_NX(info);
		else if (nx == Cnd_rpt_key_cd) doCnd_rpt_key_cd_NX(info);
		else if (nx == Cnd_rpt_key_nm) doCnd_rpt_key_nm_NX(info);
		else if (nx == Cnd_rpt_key_typ) doCnd_rpt_key_typ_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NX(info);
		else if (nx == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NX(info);
		else if (nx == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NX(info);
		else if (nx == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NX(info);
		else if (nx == Cnd_itm_grp_cd) doCnd_itm_grp_cd_NX(info);
		else if (nx == Cnd_itm_grp_nm) doCnd_itm_grp_nm_NX(info);
		else if (nx == Cnd_itm_grp_typ) doCnd_itm_grp_typ_NX(info);
		else if (nx == columnDispDtl_rpt_tgt_typ) doDispDtl_rpt_tgt_typ_NX(info);
		else if (nx == columnDispDtl_rpt_seq) doDispDtl_rpt_seq_NX(info);
		else if (nx == columnDispDtl_fg_r) doDispDtl_fg_r_NX(info);
		else if (nx == columnDispDtl_fg_g) doDispDtl_fg_g_NX(info);
		else if (nx == columnDispDtl_fg_b) doDispDtl_fg_b_NX(info);
		else if (nx == columnDispDtl_bg_r) doDispDtl_bg_r_NX(info);
		else if (nx == columnDispDtl_bg_g) doDispDtl_bg_g_NX(info);
		else if (nx == columnDispDtl_bg_b) doDispDtl_bg_b_NX(info);
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
	 * [Cnd]パネルの[max_mons]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_mons_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[mng_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mng_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_tgt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_tgt_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_seq_NX(MCEventInfo info){
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
		else if (lc == Cnd_max_mons) doCnd_max_mons_LC(info);
		else if (lc == Cnd_ym_fr) doCnd_ym_fr_LC(info);
		else if (lc == Cnd_ym_to) doCnd_ym_to_LC(info);
		else if (lc == Cnd_rpt_ptn_cd) doCnd_rpt_ptn_cd_LC(info);
		else if (lc == Cnd_rpt_ptn_nm) doCnd_rpt_ptn_nm_LC(info);
		else if (lc == Cnd_rpt_key_cd) doCnd_rpt_key_cd_LC(info);
		else if (lc == Cnd_rpt_key_nm) doCnd_rpt_key_nm_LC(info);
		else if (lc == Cnd_rpt_key_typ) doCnd_rpt_key_typ_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_LC(info);
		else if (lc == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_LC(info);
		else if (lc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_LC(info);
		else if (lc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_LC(info);
		else if (lc == Cnd_itm_grp_cd) doCnd_itm_grp_cd_LC(info);
		else if (lc == Cnd_itm_grp_nm) doCnd_itm_grp_nm_LC(info);
		else if (lc == Cnd_itm_grp_typ) doCnd_itm_grp_typ_LC(info);
		else if (lc == columnDispDtl_rpt_tgt_typ) doDispDtl_rpt_tgt_typ_LC(info);
		else if (lc == columnDispDtl_rpt_seq) doDispDtl_rpt_seq_LC(info);
		else if (lc == columnDispDtl_fg_r) doDispDtl_fg_r_LC(info);
		else if (lc == columnDispDtl_fg_g) doDispDtl_fg_g_LC(info);
		else if (lc == columnDispDtl_fg_b) doDispDtl_fg_b_LC(info);
		else if (lc == columnDispDtl_bg_r) doDispDtl_bg_r_LC(info);
		else if (lc == columnDispDtl_bg_g) doDispDtl_bg_g_LC(info);
		else if (lc == columnDispDtl_bg_b) doDispDtl_bg_b_LC(info);
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
	 * [Cnd]パネルの[max_mons]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_mons_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[mng_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mng_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_tgt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_tgt_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[rpt_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_rpt_seq_LC(MCEventInfo info){
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

	/**
	 * コンボ／リストのリスト[Cnd_mng_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_mng_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getCostDptInRptKeyConf(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_jnl_cd]の作成メソッド
	 */
	public MCList getCnd_itm_jnl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getItmJnlInRptKeyConf(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getItmGrpInRptKeyConf(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBFL0400.Srch01")) {
			return new MG_MGBFL0400_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBFL0400_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0400_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBFL0400_Srch01;

		/** コンストラクタ */
		protected MG_MGBFL0400_Srch01Bridge() {
			p_MG_MGBFL0400_Srch01 = new MCParam(PDef.MG_MGBFL0400_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBFL0400_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBF.MGBFP0400.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0400.DispDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0400.KeyR.class));
			param.addDownBlock(mcframe.clientMGBF.MGBFP0400.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0400.CalcNoR.class));

			p_MG_MGBFL0400_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBFL0400_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBFL0400_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBFL0400_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBFL0400_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBF.MGBFP0400.CndR up0() {
			return (mcframe.clientMGBF.MGBFP0400.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBF.MGBFP0400.DispDtlR> down0() {
			return (MCList<mcframe.clientMGBF.MGBFP0400.DispDtlR>)down(0);
		}
		protected MCList<mcframe.clientMGBF.MGBFP0400.KeyR> down1() {
			return (MCList<mcframe.clientMGBF.MGBFP0400.KeyR>)down(1);
		}
		protected mcframe.clientMGBF.MGBFP0400.HdrR down2() {
			return (mcframe.clientMGBF.MGBFP0400.HdrR)down(2);
		}
		protected MCList<mcframe.clientMGBF.MGBFP0400.CalcNoR> down3() {
			return (MCList<mcframe.clientMGBF.MGBFP0400.CalcNoR>)down(3);
		}

		protected void setupDownParam() {
			p_MG_MGBFL0400_Srch01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0400.DispDtlR.class));
			p_MG_MGBFL0400_Srch01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0400.KeyR.class));
			p_MG_MGBFL0400_Srch01.addDownBlock(mcframe.clientMGBF.MGBFP0400.HdrR.create());
			p_MG_MGBFL0400_Srch01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0400.CalcNoR.class));
		}
		protected MCParam param() {
			return p_MG_MGBFL0400_Srch01;
		}

		protected void show() {
			setDispDtlL((MCList<mcframe.clientMGBF.MGBFP0400.DispDtlR>)p_MG_MGBFL0400_Srch01.getContainerParam().getDownBlock(0));
			setKeyL((MCList<mcframe.clientMGBF.MGBFP0400.KeyR>)p_MG_MGBFL0400_Srch01.getContainerParam().getDownBlock(1));
			setHdrR((mcframe.clientMGBF.MGBFP0400.HdrR)p_MG_MGBFL0400_Srch01.getContainerParam().getDownBlock(2));
			setCalcNoL((MCList<mcframe.clientMGBF.MGBFP0400.CalcNoR>)p_MG_MGBFL0400_Srch01.getContainerParam().getDownBlock(3));
		}

		protected void clear() {
			getDispDtlL().clear();
			getKeyL().clear();
			getHdrR().clear();
			getCalcNoL().clear();
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
			result.add(getHdrR());
			result.add(getCalcNoL());
			return result;
		}
	}
}