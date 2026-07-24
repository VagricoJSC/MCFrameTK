package mcframe.clientMGBF.MGBFP0410;

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
import mcframe.clientMGBF.MGBFP0410.MGBFP_RptCmp_MC.MG_MGBFL0410_Srch01Caller;

/**
 * 画面"MGBFP_RptCmp"パネルクラスです。<p>
 *
 * 原価レポートの比較を照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBFP_RptCmp_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBFP0410";

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
	public MCLabel Cnd_cmp_ptn_cd_Label = null;
	/**
	 * Comparison pattern cd. 比較パタンＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_cmp_ptn_cd = null;
	/**
	 * Comparison pattern name 比較パタン名.<p>
	 *
	 */
	public MCTextField Cnd_cmp_ptn_nm = null;
	public MCLabel Cnd_rpt_ptn_cd_Label = null;
	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_rpt_ptn_cd = null;
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
	public MCTextField Cnd_rpt_key_cd = null;
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
	public MCColumnGroupTable<mcframe.clientMGBF.MGBFP0410.DispDtlR> DispDtlTable = null;
	// [DispDtl]ブロックの項目のField定義
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
	
	/** [MG_MGBFL0410_Srch01]のCallerの作成 */
	protected MGBFP_RptCmp_MC.MG_MGBFL0410_Srch01Caller createMG_MGBFL0410_Srch01() {
		MGBFP_RptCmp_MC.MG_MGBFL0410_Srch01Caller<MGBFP_RptCmp, MG_MGBFL0410_Srch01Bridge>
		caller = ((MGBFP_RptCmp_MC)this).new MG_MGBFL0410_Srch01Caller<MGBFP_RptCmp, MG_MGBFL0410_Srch01Bridge>(
					(MGBFP_RptCmp)this, new MG_MGBFL0410_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBFL0410_Srch01]の呼び出し */
	protected void callMG_MGBFL0410_Srch01() {
		MCCaller caller = createMG_MGBFL0410_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBF.MGBFP0410.CndR aCndR;
	/** [DispDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0410.DispDtlR> aDispDtlL;
	/** [Key]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0410.KeyR> aKeyL;
	/** [Mstr]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0410.MstrR> aMstrL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBF.MGBFP0410.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0410.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0410.CndR createCndR() {
		return mcframe.clientMGBF.MGBFP0410.CndR.create();
	}

	/**
	 * コピーによってaDispDtlLを設定します。
	 *
	 * aDispDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DispDtlL
	 */
	public void setDispDtlL(MCList<mcframe.clientMGBF.MGBFP0410.DispDtlR> aList) {
		if (getDispDtlL() != aList) {
			getDispDtlL().setAll(aList);
		}
	}

	/**
	 * [DispDtl]ブロックのコンテナaDispDtlLを返します。
	 *
	 * @return DispDtlL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0410.DispDtlR> getDispDtlL() {
		return aDispDtlL;
	}

	/**
	 * aDispDtlRを作成します。
	 *
	 * @return DispDtlR
	 */
	public mcframe.clientMGBF.MGBFP0410.DispDtlR createDispDtlR() {
		return mcframe.clientMGBF.MGBFP0410.DispDtlR.create();
	}

	/**
	 * aDispDtlLを作成します。
	 *
	 * @return DispDtlL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0410.DispDtlR> createDispDtlL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0410.DispDtlR.class);
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
	public void setKeyL(MCList<mcframe.clientMGBF.MGBFP0410.KeyR> aList) {
		if (getKeyL() != aList) {
			getKeyL().setAll(aList);
		}
	}

	/**
	 * [Key]ブロックのコンテナaKeyLを返します。
	 *
	 * @return KeyL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0410.KeyR> getKeyL() {
		return aKeyL;
	}

	/**
	 * aKeyRを作成します。
	 *
	 * @return KeyR
	 */
	public mcframe.clientMGBF.MGBFP0410.KeyR createKeyR() {
		return mcframe.clientMGBF.MGBFP0410.KeyR.create();
	}

	/**
	 * aKeyLを作成します。
	 *
	 * @return KeyL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0410.KeyR> createKeyL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0410.KeyR.class);
	}

	/**
	 * コピーによってaMstrLを設定します。
	 *
	 * aMstrLのインスタンスは変更されません。
	 *
	 * @param dataset MstrL
	 */
	public void setMstrL(MCList<mcframe.clientMGBF.MGBFP0410.MstrR> aList) {
		if (getMstrL() != aList) {
			getMstrL().setAll(aList);
		}
	}

	/**
	 * [Mstr]ブロックのコンテナaMstrLを返します。
	 *
	 * @return MstrL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0410.MstrR> getMstrL() {
		return aMstrL;
	}

	/**
	 * aMstrRを作成します。
	 *
	 * @return MstrR
	 */
	public mcframe.clientMGBF.MGBFP0410.MstrR createMstrR() {
		return mcframe.clientMGBF.MGBFP0410.MstrR.create();
	}

	/**
	 * aMstrLを作成します。
	 *
	 * @return MstrL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0410.MstrR> createMstrL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0410.MstrR.class);
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
		if(!MCCollectionUtil.contains(ret, getMstrL())) ret.add(getMstrL());
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
		if(aCnt == getMstrL()) return "Mstr";
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
		if(bId.equals("Mstr")) return getMstrL();
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
	public MGBFP_RptCmp_MC_A() {
		aCndR = createCndR();
		aDispDtlL = createDispDtlL();
		aKeyL = createKeyL();
		aMstrL = createMstrL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBFP_RptCmp_MC_A(String name) {
		aCndR = createCndR();
		aDispDtlL = createDispDtlL();
		createDispDtlTable();
		DispDtlTable.setRowName(name);
		aKeyL = createKeyL();
		aMstrL = createMstrL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBFP_RptCmp_MC.jbCreateTop((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.jbCreateCnd((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.jbCreateCtrl((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.jbCreateDispDtl((MGBFP_RptCmp)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBFP_RptCmp p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBFP_RptCmp p) {
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
	protected static void jbCreateCtrl(MGBFP_RptCmp p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [DispDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispDtl(MGBFP_RptCmp p) {
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

	
	/** [Cnd_cmp_ptn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cmp_ptn_cd_p = null;

	/**
	 * [Cnd_cmp_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cmp_ptn_cd_ListPutter() {
		if (Cnd_cmp_ptn_cd_p == null) {
			Cnd_cmp_ptn_cd_p = createCnd_cmp_ptn_cd_ListPutter(Cnd_cmp_ptn_cd, "cmp_ptn_cd", "cmp_ptn_nm","rpt_ptn_cd","rpt_key_cd","rpt_ptn_nm","rpt_key_nm","rpt_key_typ");

		}
		return Cnd_cmp_ptn_cd_p;
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
	public static MGBFP_RptCmp create(){
		MGBFP_RptCmp p = new MGBFP_RptCmp();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_RptCmp create(String name){
		MGBFP_RptCmp p = new MGBFP_RptCmp(name);
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
		MGBFP_RptCmp_MC.jbfInitTop((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.jbfInitCnd((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.jbfInitCtrl((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.jbfInitDispDtl((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.jbInitTop((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.jbInitCnd((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.jbInitCtrl((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.jbInitDispDtl((MGBFP_RptCmp)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBFP_RptCmp p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBFP_RptCmp p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_cmp_ptn_cd_Label = p.beansFactory.createLabel("Cnd.cmp_ptn_cd_Label");
		p.Cnd_cmp_ptn_cd = p.beansFactory.createTextComboBox("Cnd.cmp_ptn_cd");
		p.Cnd_cmp_ptn_cd.setLabel(p.Cnd_cmp_ptn_cd_Label);
		p.Cnd_cmp_ptn_nm = p.beansFactory.createTextField("Cnd.cmp_ptn_nm");
		p.Cnd_rpt_ptn_cd_Label = p.beansFactory.createLabel("Cnd.rpt_ptn_cd_Label");
		p.Cnd_rpt_ptn_cd = p.beansFactory.createTextField("Cnd.rpt_ptn_cd");
		p.Cnd_rpt_ptn_cd.setLabel(p.Cnd_rpt_ptn_cd_Label);
		p.Cnd_rpt_ptn_nm = p.beansFactory.createTextField("Cnd.rpt_ptn_nm");
		p.Cnd_rpt_key_cd_Label = p.beansFactory.createLabel("Cnd.rpt_key_cd_Label");
		p.Cnd_rpt_key_cd = p.beansFactory.createTextField("Cnd.rpt_key_cd");
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
	protected static void jbfInitCtrl(MGBFP_RptCmp p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [DispDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispDtl(MGBFP_RptCmp p) {
		// ブロック関連の初期化
		p.DispDtlPanel = p.beansFactory.createPanel("DispDtl");
		p.DispDtlScrollPane = p.beansFactory.createScrollPane("DispDtl.scroll");
		p.createDispDtlTable();
		// ブロックの項目の初期化
		p.columnDispDtl_rpt_seq = p.beansFactory.createTableColumn("DispDtl.rpt_seq", MCColumnType.NUMBER);
		p.columnDispDtl_fg_r = p.beansFactory.createTableColumn("DispDtl.fg_r", MCColumnType.NUMBER);
		p.columnDispDtl_fg_g = p.beansFactory.createTableColumn("DispDtl.fg_g", MCColumnType.NUMBER);
		p.columnDispDtl_fg_b = p.beansFactory.createTableColumn("DispDtl.fg_b", MCColumnType.NUMBER);
		p.columnDispDtl_bg_r = p.beansFactory.createTableColumn("DispDtl.bg_r", MCColumnType.NUMBER);
		p.columnDispDtl_bg_g = p.beansFactory.createTableColumn("DispDtl.bg_g", MCColumnType.NUMBER);
		p.columnDispDtl_bg_b = p.beansFactory.createTableColumn("DispDtl.bg_b", MCColumnType.NUMBER);
		p.columnDispDtl_qty_unit_typ = p.beansFactory.createTableColumn("DispDtl.qty_unit_typ", MCColumnType.TEXT);
		p.columnDispDtl_rpt_row_view = p.beansFactory.createTableColumn("DispDtl.rpt_row_view", MCColumnType.TEXT);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBFP_RptCmp p) {
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
	protected static void jbInitCnd(MGBFP_RptCmp p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Cnd_cmp_ptn_cd.setListType(MCListType.STRICT);
		p.Cnd_cmp_ptn_cd.setLinkBeans(p.Cnd_cmp_ptn_nm,p.Cnd_rpt_ptn_cd,p.Cnd_rpt_key_cd,p.Cnd_rpt_ptn_nm,p.Cnd_rpt_key_nm,p.Cnd_rpt_key_typ);
		p.CndPanel.add(p.Cnd_cmp_ptn_cd_Label);
		p.CndPanel.add(p.Cnd_cmp_ptn_cd);
		p.CndPanel.setLastBeans(p.Cnd_cmp_ptn_cd);
		p.Cnd_cmp_ptn_cd.setNextBeans(p.Cnd_cmp_ptn_nm);
		p.Cnd_cmp_ptn_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0410.CndR.cmp_ptn_cd_META);
		p.CndPanel.add(p.Cnd_cmp_ptn_nm);
		p.Cnd_cmp_ptn_nm.setNextBeans(p.Cnd_rpt_ptn_cd);
		p.Cnd_cmp_ptn_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0410.CndR.cmp_ptn_nm_META);
		p.CndPanel.add(p.Cnd_rpt_ptn_cd_Label);
		p.CndPanel.add(p.Cnd_rpt_ptn_cd);
		p.Cnd_rpt_ptn_cd.setNextBeans(p.Cnd_rpt_ptn_nm);
		p.Cnd_rpt_ptn_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0410.CndR.rpt_ptn_cd_META);
		p.CndPanel.add(p.Cnd_rpt_ptn_nm);
		p.Cnd_rpt_ptn_nm.setNextBeans(p.Cnd_rpt_key_cd);
		p.Cnd_rpt_ptn_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0410.CndR.rpt_ptn_nm_META);
		p.CndPanel.add(p.Cnd_rpt_key_cd_Label);
		p.CndPanel.add(p.Cnd_rpt_key_cd);
		p.Cnd_rpt_key_cd.setNextBeans(p.Cnd_rpt_key_nm);
		p.Cnd_rpt_key_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0410.CndR.rpt_key_cd_META);
		p.CndPanel.add(p.Cnd_rpt_key_nm);
		p.Cnd_rpt_key_nm.setNextBeans(p.Cnd_rpt_key_typ);
		p.Cnd_rpt_key_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0410.CndR.rpt_key_nm_META);
		p.CndPanel.add(p.Cnd_rpt_key_typ);
		p.Cnd_rpt_key_typ.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_rpt_key_typ.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0410.CndR.rpt_key_typ_META);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0410.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_mng_dpt_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0410.CndR.wg_nm_META);
		p.Cnd_mng_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mng_dpt_cd, true);
		p.Cnd_mng_dpt_cd.setLinkBeans(p.Cnd_mng_dpt_nm);
		p.CndPanel.add(p.Cnd_mng_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_mng_dpt_cd);
		p.Cnd_mng_dpt_cd.setNextBeans(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0410.CndR.mng_dpt_cd_META);
		p.CndPanel.add(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_mng_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0410.CndR.mng_dpt_nm_META);
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
		p.Cnd_itm_jnl_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0410.CndR.itm_jnl_cd_META);
		p.CndPanel.add(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_nm.setNextBeans(p.Cnd_itm_grp_cd);
		p.Cnd_itm_jnl_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0410.CndR.itm_jnl_nm_META);
		p.setPluralValueEnable(p.Cnd_itm_jnl_nm, true);
		p.Cnd_itm_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd, true);
		p.Cnd_itm_grp_cd.setLinkBeans(p.Cnd_itm_grp_nm,p.Cnd_itm_grp_typ);
		p.CndPanel.add(p.Cnd_itm_grp_cd_Label);
		p.CndPanel.add(p.Cnd_itm_grp_cd);
		p.Cnd_itm_grp_cd.setNextBeans(p.Cnd_itm_grp_nm);
		p.Cnd_itm_grp_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0410.CndR.itm_grp_cd_META);
		p.CndPanel.add(p.Cnd_itm_grp_nm);
		p.Cnd_itm_grp_nm.setNextBeans(p.Cnd_itm_grp_typ);
		p.Cnd_itm_grp_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0410.CndR.itm_grp_nm_META);
		p.CndPanel.add(p.Cnd_itm_grp_typ);
		p.Cnd_itm_grp_typ.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0410.CndR.itm_grp_typ_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBFP_RptCmp p) {
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
	protected static void jbInitDispDtl(MGBFP_RptCmp p) {
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
		MGBFP_RptCmp_MC.mcInitTop((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.mcInitCnd((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.mcInitCtrl((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.mcInitDispDtl((MGBFP_RptCmp)this);

		// [SRCH]ステータスのモードの設定
		MGBFP_RptCmp_MC.statusInitSRCH_Top((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.statusInitSRCH_Cnd((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.statusInitSRCH_Ctrl((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.statusInitSRCH_DispDtl((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.statusInitSRCH_Key((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.statusInitSRCH_Mstr((MGBFP_RptCmp)this);

		// [REF]ステータスのモードの設定
		MGBFP_RptCmp_MC.statusInitREF_Top((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.statusInitREF_Cnd((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.statusInitREF_Ctrl((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.statusInitREF_DispDtl((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.statusInitREF_Key((MGBFP_RptCmp)this);
		MGBFP_RptCmp_MC.statusInitREF_Mstr((MGBFP_RptCmp)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBFP_RptCmp p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBFP_RptCmp p) {
		p.Cnd_cmp_ptn_cd.setListListener(p);
		p.Cnd_cmp_ptn_cd.addAllListener(p);
		p.Cnd_cmp_ptn_nm.setListListener(p);
		p.Cnd_cmp_ptn_nm.addAllListener(p);
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
	protected static void mcInitCtrl(MGBFP_RptCmp p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [DispDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispDtl(MGBFP_RptCmp p) {
		p.DispDtlTable.addAllListener(p);
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
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBFP_RptCmp p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBFP_RptCmp p){
		p.Cnd_cmp_ptn_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cmp_ptn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_rpt_ptn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_rpt_ptn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_rpt_key_cd.putMode(p, SRCH, MCMode.READ_ONLY);
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
	protected static void statusInitSRCH_Ctrl(MGBFP_RptCmp p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[DispDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DispDtl(MGBFP_RptCmp p){
		p.columnDispDtl_rpt_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_fg_r.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_fg_g.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_fg_b.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_bg_r.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_bg_g.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_bg_b.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_qty_unit_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispDtl_rpt_row_view.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Key]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Key(MGBFP_RptCmp p){

	}

	/**
	 * [SRCH]ステータスの[Mstr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Mstr(MGBFP_RptCmp p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBFP_RptCmp p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBFP_RptCmp p){
		p.Cnd_cmp_ptn_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cmp_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_rpt_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_rpt_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_rpt_key_cd.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_Ctrl(MGBFP_RptCmp p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[DispDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_DispDtl(MGBFP_RptCmp p){
		p.columnDispDtl_rpt_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_fg_r.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_fg_g.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_fg_b.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_bg_r.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_bg_g.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_bg_b.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_qty_unit_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_rpt_row_view.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Key]ブロックのモードの設定
	 */
	protected static void statusInitREF_Key(MGBFP_RptCmp p){

	}

	/**
	 * [REF]ステータスの[Mstr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mstr(MGBFP_RptCmp p){

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
		MGBFP_RptCmp_MC.setTableConfigDispDtl((MGBFP_RptCmp)this);
	}

	/**
	 * [DispDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDispDtl(MGBFP_RptCmp p) {
		p.columnDispDtl_rpt_seq.setMeta(mcframe.clientMGBF.MGBFP0410.DispDtlR.rpt_seq_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_rpt_seq);
		p.columnDispDtl_fg_r.setMeta(mcframe.clientMGBF.MGBFP0410.DispDtlR.fg_r_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_fg_r);
		p.columnDispDtl_fg_g.setMeta(mcframe.clientMGBF.MGBFP0410.DispDtlR.fg_g_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_fg_g);
		p.columnDispDtl_fg_b.setMeta(mcframe.clientMGBF.MGBFP0410.DispDtlR.fg_b_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_fg_b);
		p.columnDispDtl_bg_r.setMeta(mcframe.clientMGBF.MGBFP0410.DispDtlR.bg_r_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_bg_r);
		p.columnDispDtl_bg_g.setMeta(mcframe.clientMGBF.MGBFP0410.DispDtlR.bg_g_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_bg_g);
		p.columnDispDtl_bg_b.setMeta(mcframe.clientMGBF.MGBFP0410.DispDtlR.bg_b_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_bg_b);
		p.columnDispDtl_qty_unit_typ.setMeta(mcframe.clientMGBF.MGBFP0410.DispDtlR.qty_unit_typ_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_qty_unit_typ);
		p.columnDispDtl_rpt_row_view.setMeta(mcframe.clientMGBF.MGBFP0410.DispDtlR.rpt_row_view_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_rpt_row_view);
		// スクロール固定カラムの指定
		p.DispDtlTable.setUnscrollColumn(p.columnDispDtl_rpt_row_view);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_cmp_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cmp_ptn_cd.getListConfig().setPutter(getCnd_cmp_ptn_cd_ListPutter());
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
	 * [Cnd_cmp_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cmp_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.CostCmpPtn");
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
		if(combo == Cnd_cmp_ptn_cd) return getCnd_cmp_ptn_cd(row, info);
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
		if (vc == Cnd_cmp_ptn_cd) return doCnd_cmp_ptn_cd_VC(info);
		if (vc == Cnd_cmp_ptn_nm) return doCnd_cmp_ptn_nm_VC(info);
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
		if (vc == columnDispDtl_rpt_seq) return doDispDtl_rpt_seq_VC(info);
		if (vc == columnDispDtl_fg_r) return doDispDtl_fg_r_VC(info);
		if (vc == columnDispDtl_fg_g) return doDispDtl_fg_g_VC(info);
		if (vc == columnDispDtl_fg_b) return doDispDtl_fg_b_VC(info);
		if (vc == columnDispDtl_bg_r) return doDispDtl_bg_r_VC(info);
		if (vc == columnDispDtl_bg_g) return doDispDtl_bg_g_VC(info);
		if (vc == columnDispDtl_bg_b) return doDispDtl_bg_b_VC(info);
		if (vc == columnDispDtl_qty_unit_typ) return doDispDtl_qty_unit_typ_VC(info);
		if (vc == columnDispDtl_rpt_row_view) return doDispDtl_rpt_row_view_VC(info);
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
	 * [Cnd]パネルの[cmp_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cmp_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cmp_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cmp_ptn_nm_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == DispDtlTable) doDispDtl_NC(info);
		else if (nc == Cnd_cmp_ptn_cd) doCnd_cmp_ptn_cd_NC(info);
		else if (nc == Cnd_cmp_ptn_nm) doCnd_cmp_ptn_nm_NC(info);
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
		else if (nc == columnDispDtl_rpt_seq) doDispDtl_rpt_seq_NC(info);
		else if (nc == columnDispDtl_fg_r) doDispDtl_fg_r_NC(info);
		else if (nc == columnDispDtl_fg_g) doDispDtl_fg_g_NC(info);
		else if (nc == columnDispDtl_fg_b) doDispDtl_fg_b_NC(info);
		else if (nc == columnDispDtl_bg_r) doDispDtl_bg_r_NC(info);
		else if (nc == columnDispDtl_bg_g) doDispDtl_bg_g_NC(info);
		else if (nc == columnDispDtl_bg_b) doDispDtl_bg_b_NC(info);
		else if (nc == columnDispDtl_qty_unit_typ) doDispDtl_qty_unit_typ_NC(info);
		else if (nc == columnDispDtl_rpt_row_view) doDispDtl_rpt_row_view_NC(info);
	}

	/**
	 * [DispDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmp_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmp_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmp_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmp_ptn_nm_NC(MCEventInfo info){
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
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DispDtlTable) doDispDtl_NE(info);
		else if (ne == Cnd_cmp_ptn_cd) doCnd_cmp_ptn_cd_NE(info);
		else if (ne == Cnd_cmp_ptn_nm) doCnd_cmp_ptn_nm_NE(info);
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
		else if (ne == columnDispDtl_rpt_seq) doDispDtl_rpt_seq_NE(info);
		else if (ne == columnDispDtl_fg_r) doDispDtl_fg_r_NE(info);
		else if (ne == columnDispDtl_fg_g) doDispDtl_fg_g_NE(info);
		else if (ne == columnDispDtl_fg_b) doDispDtl_fg_b_NE(info);
		else if (ne == columnDispDtl_bg_r) doDispDtl_bg_r_NE(info);
		else if (ne == columnDispDtl_bg_g) doDispDtl_bg_g_NE(info);
		else if (ne == columnDispDtl_bg_b) doDispDtl_bg_b_NE(info);
		else if (ne == columnDispDtl_qty_unit_typ) doDispDtl_qty_unit_typ_NE(info);
		else if (ne == columnDispDtl_rpt_row_view) doDispDtl_rpt_row_view_NE(info);
	}

	/**
	 * [DispDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmp_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmp_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmp_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmp_ptn_nm_NE(MCEventInfo info){
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
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DispDtlTable) doDispDtl_NX(info);
		else if (nx == Cnd_cmp_ptn_cd) doCnd_cmp_ptn_cd_NX(info);
		else if (nx == Cnd_cmp_ptn_nm) doCnd_cmp_ptn_nm_NX(info);
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
		else if (nx == columnDispDtl_rpt_seq) doDispDtl_rpt_seq_NX(info);
		else if (nx == columnDispDtl_fg_r) doDispDtl_fg_r_NX(info);
		else if (nx == columnDispDtl_fg_g) doDispDtl_fg_g_NX(info);
		else if (nx == columnDispDtl_fg_b) doDispDtl_fg_b_NX(info);
		else if (nx == columnDispDtl_bg_r) doDispDtl_bg_r_NX(info);
		else if (nx == columnDispDtl_bg_g) doDispDtl_bg_g_NX(info);
		else if (nx == columnDispDtl_bg_b) doDispDtl_bg_b_NX(info);
		else if (nx == columnDispDtl_qty_unit_typ) doDispDtl_qty_unit_typ_NX(info);
		else if (nx == columnDispDtl_rpt_row_view) doDispDtl_rpt_row_view_NX(info);
	}

	/**
	 * [DispDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmp_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmp_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmp_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmp_ptn_nm_NX(MCEventInfo info){
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
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_cmp_ptn_cd) doCnd_cmp_ptn_cd_LC(info);
		else if (lc == Cnd_cmp_ptn_nm) doCnd_cmp_ptn_nm_LC(info);
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
		else if (lc == columnDispDtl_rpt_seq) doDispDtl_rpt_seq_LC(info);
		else if (lc == columnDispDtl_fg_r) doDispDtl_fg_r_LC(info);
		else if (lc == columnDispDtl_fg_g) doDispDtl_fg_g_LC(info);
		else if (lc == columnDispDtl_fg_b) doDispDtl_fg_b_LC(info);
		else if (lc == columnDispDtl_bg_r) doDispDtl_bg_r_LC(info);
		else if (lc == columnDispDtl_bg_g) doDispDtl_bg_g_LC(info);
		else if (lc == columnDispDtl_bg_b) doDispDtl_bg_b_LC(info);
		else if (lc == columnDispDtl_qty_unit_typ) doDispDtl_qty_unit_typ_LC(info);
		else if (lc == columnDispDtl_rpt_row_view) doDispDtl_rpt_row_view_LC(info);
	}

	/**
	 * [Cnd]パネルの[cmp_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmp_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmp_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmp_ptn_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_cmp_ptn_cd]の作成メソッド
	 */
	public MCList getCnd_cmp_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getCostCmpPtn(row, info);
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
		if (id.equals("MG.MGBFL0410.Srch01")) {
			return new MG_MGBFL0410_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBFL0410_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0410_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBFL0410_Srch01;

		/** コンストラクタ */
		protected MG_MGBFL0410_Srch01Bridge() {
			p_MG_MGBFL0410_Srch01 = new MCParam(PDef.MG_MGBFL0410_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBFL0410_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBF.MGBFP0410.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0410.DispDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0410.KeyR.class));
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0410.MstrR.class));

			p_MG_MGBFL0410_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBFL0410_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBFL0410_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBFL0410_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBFL0410_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBF.MGBFP0410.CndR up0() {
			return (mcframe.clientMGBF.MGBFP0410.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBF.MGBFP0410.DispDtlR> down0() {
			return (MCList<mcframe.clientMGBF.MGBFP0410.DispDtlR>)down(0);
		}
		protected MCList<mcframe.clientMGBF.MGBFP0410.KeyR> down1() {
			return (MCList<mcframe.clientMGBF.MGBFP0410.KeyR>)down(1);
		}
		protected MCList<mcframe.clientMGBF.MGBFP0410.MstrR> down2() {
			return (MCList<mcframe.clientMGBF.MGBFP0410.MstrR>)down(2);
		}

		protected void setupDownParam() {
			p_MG_MGBFL0410_Srch01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0410.DispDtlR.class));
			p_MG_MGBFL0410_Srch01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0410.KeyR.class));
			p_MG_MGBFL0410_Srch01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0410.MstrR.class));
		}
		protected MCParam param() {
			return p_MG_MGBFL0410_Srch01;
		}

		protected void show() {
			setDispDtlL((MCList<mcframe.clientMGBF.MGBFP0410.DispDtlR>)p_MG_MGBFL0410_Srch01.getContainerParam().getDownBlock(0));
			setKeyL((MCList<mcframe.clientMGBF.MGBFP0410.KeyR>)p_MG_MGBFL0410_Srch01.getContainerParam().getDownBlock(1));
			setMstrL((MCList<mcframe.clientMGBF.MGBFP0410.MstrR>)p_MG_MGBFL0410_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getDispDtlL().clear();
			getKeyL().clear();
			getMstrL().clear();
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
			result.add(getMstrL());
			return result;
		}
	}
}