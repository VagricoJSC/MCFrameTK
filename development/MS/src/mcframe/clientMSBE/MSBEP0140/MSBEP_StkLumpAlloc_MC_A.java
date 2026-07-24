package mcframe.clientMSBE.MSBEP0140;

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
import mcframe.clientMSBE.MSBEP0140.MSBEP_StkLumpAlloc_MC.MS_MSBEL0140_Upd01Caller;

/**
 * 画面"MSBEP_StkLumpAlloc"パネルクラスです。<p>
 *
 * 受注の出荷予定に対して在庫・入庫予定を一括で引当します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_StkLumpAlloc_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBEP0140";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Term]ブロック関連のField定義
	public MCPanel TermPanel = null;
	public MCTitledBorder TermTitledBorder = null;
	// [Term]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_ship_schd_dt_p_PPanel;
	public MCDateField Cnd_ship_schd_dt_fr;	// [Cnd]の[ship_schd_dt_p.ymd_fr]を[Cnd_ship_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_hm_fr;	// [Cnd]の[ship_schd_dt_p.hm_fr]を[Cnd_ship_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_dt_to;	// [Cnd]の[ship_schd_dt_p.ymd_to]を[Cnd_ship_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_hm_to;	// [Cnd]の[ship_schd_dt_p.hm_to]を[Cnd_ship_schd_hm_to]としてエイリアス定義。
	/**
	 * Sort by scheduled shipping date and time 出荷予定日時順.<p>
	 *
	 */
	public MCCheckBox Cnd_ship_schd_tm_prio_flg = null;
	public MCLabel Cnd_alloc_scope_typ_Label = null;
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_alloc_scope_typ = null;
	/**
	 * Allocation range type name 引当範囲区分名.<p>
	 *
	 */
	public MCTextField Cnd_alloc_scope_typ_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_ship_loc_cd_Label = null;
	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ship_loc_cd = null;
	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public MCTextField Cnd_ship_loc_nm = null;
	public MCLabel Cnd_ship_lg_grp_cd_Label = null;
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_lg_grp_cd = null;
	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_ship_lg_grp_nm = null;
	public MCLabel Cnd_alloc_grp_cd_Label = null;
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_alloc_grp_cd = null;
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_alloc_grp_nm = null;
	public MCLabel Cnd_cst_slct_typ_Label = null;
	/**
	 * Customer extraction type 得意先抽出区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_slct_typ = null;
	/**
	 * Customer extraction type name 得意先抽出区分名.<p>
	 *
	 */
	public MCTextField Cnd_cst_slct_typ_nm = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCTitledBorder DtlTitledBorder = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP0140.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_nm = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btn_rcopy = null;
	public mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H Btn_menu_move_p_PPanel;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD};
	
	/** [MS_MSBEL0140_Upd01]のCallerの作成 */
	protected MSBEP_StkLumpAlloc_MC.MS_MSBEL0140_Upd01Caller createMS_MSBEL0140_Upd01() {
		MSBEP_StkLumpAlloc_MC.MS_MSBEL0140_Upd01Caller<MSBEP_StkLumpAlloc, MS_MSBEL0140_Upd01Bridge>
		caller = ((MSBEP_StkLumpAlloc_MC)this).new MS_MSBEL0140_Upd01Caller<MSBEP_StkLumpAlloc, MS_MSBEL0140_Upd01Bridge>(
					(MSBEP_StkLumpAlloc)this, new MS_MSBEL0140_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBEL0140_Upd01]の呼び出し */
	protected void callMS_MSBEL0140_Upd01() {
		MCCaller caller = createMS_MSBEL0140_Upd01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP0140.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP0140.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP0140.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP0140.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP0140.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP0140.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBE.MSBEP0140.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0140.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBE.MSBEP0140.DtlR createDtlR() {
		return mcframe.clientMSBE.MSBEP0140.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0140.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBE.MSBEP0140.DtlR.class);
	}

	/**
	 * DtlTableを初期化します。
	 */
	protected void createDtlTable(){
		if(DtlTable == null){
			DtlTable = beansFactory.createTable2("Dtl.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
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
		if(aCnt == getDtlL()) return "Dtl";
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
		if(bId.equals("Dtl")) return getDtlL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(TermPanel);
		ret.add(CndPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_StkLumpAlloc_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_StkLumpAlloc_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBEP_StkLumpAlloc_MC.jbCreateTerm((MSBEP_StkLumpAlloc)this);
		MSBEP_StkLumpAlloc_MC.jbCreateCnd((MSBEP_StkLumpAlloc)this);
		MSBEP_StkLumpAlloc_MC.jbCreateDtl((MSBEP_StkLumpAlloc)this);
		MSBEP_StkLumpAlloc_MC.jbCreateBtn((MSBEP_StkLumpAlloc)this);
	}

	/**
	 * [Term]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTerm(MSBEP_StkLumpAlloc p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_StkLumpAlloc p) {
		p.Cnd_ship_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().ship_schd_dt_p());
		p.Cnd_ship_schd_dt_p_PPanel.setName("Cnd.ship_schd_dt_p");
		p.Cnd_ship_schd_dt_fr = p.Cnd_ship_schd_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_ship_schd_dt_fr.addAliasName("Cnd.ship_schd_dt_fr", p);
		p.Cnd_ship_schd_hm_fr = p.Cnd_ship_schd_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_ship_schd_hm_fr.addAliasName("Cnd.ship_schd_hm_fr", p);
		p.Cnd_ship_schd_dt_to = p.Cnd_ship_schd_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_ship_schd_dt_to.addAliasName("Cnd.ship_schd_dt_to", p);
		p.Cnd_ship_schd_hm_to = p.Cnd_ship_schd_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_ship_schd_hm_to.addAliasName("Cnd.ship_schd_hm_to", p);
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
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBEP_StkLumpAlloc p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_StkLumpAlloc p) {
		p.Btn_menu_move_p_PPanel = mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.create();
		p.Btn_menu_move_p_PPanel.setName("Btn.menu_move_p");
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

	
	/** [Cnd_alloc_scope_typ_ListPutter]の定義 */
	private MCListPutter Cnd_alloc_scope_typ_p = null;

	/**
	 * [Cnd_alloc_scope_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alloc_scope_typ_ListPutter() {
		if (Cnd_alloc_scope_typ_p == null) {
			Cnd_alloc_scope_typ_p = createCnd_alloc_scope_typ_ListPutter(Cnd_alloc_scope_typ, "alloc_scope_typ", "alloc_scope_typ_nm");

		}
		return Cnd_alloc_scope_typ_p;
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
	
	
	/** [Cnd_ship_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_loc_cd_p = null;

	/**
	 * [Cnd_ship_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_loc_cd_ListPutter() {
		if (Cnd_ship_loc_cd_p == null) {
			Cnd_ship_loc_cd_p = createCnd_ship_loc_cd_ListPutter(Cnd_ship_loc_cd, "ship_loc_cd", "ship_loc_nm");

		}
		return Cnd_ship_loc_cd_p;
	}
	
	
	/** [Cnd_ship_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_lg_grp_cd_p = null;

	/**
	 * [Cnd_ship_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_lg_grp_cd_ListPutter() {
		if (Cnd_ship_lg_grp_cd_p == null) {
			Cnd_ship_lg_grp_cd_p = createCnd_ship_lg_grp_cd_ListPutter(Cnd_ship_lg_grp_cd, "ship_lg_grp_cd", "ship_lg_grp_nm");

		}
		return Cnd_ship_lg_grp_cd_p;
	}
	
	
	/** [Cnd_alloc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_alloc_grp_cd_p = null;

	/**
	 * [Cnd_alloc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alloc_grp_cd_ListPutter() {
		if (Cnd_alloc_grp_cd_p == null) {
			Cnd_alloc_grp_cd_p = createCnd_alloc_grp_cd_ListPutter(Cnd_alloc_grp_cd, "alloc_grp_cd", "alloc_grp_nm");

		}
		return Cnd_alloc_grp_cd_p;
	}
	
	
	/** [Cnd_cst_slct_typ_ListPutter]の定義 */
	private MCListPutter Cnd_cst_slct_typ_p = null;

	/**
	 * [Cnd_cst_slct_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_slct_typ_ListPutter() {
		if (Cnd_cst_slct_typ_p == null) {
			Cnd_cst_slct_typ_p = createCnd_cst_slct_typ_ListPutter(Cnd_cst_slct_typ, "cst_slct_typ", "cst_slct_typ_nm");

		}
		return Cnd_cst_slct_typ_p;
	}
	
	
	/** [Dtl_cst_cd_ListPutter]の定義 */
	private MCListPutter Dtl_cst_cd_p = null;

	/**
	 * [Dtl_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cst_cd_ListPutter() {
		if (Dtl_cst_cd_p == null) {
			Dtl_cst_cd_p = createDtl_cst_cd_ListPutter(columnDtl_cst_cd, "cst_cd", "cst_nm");

		}
		return Dtl_cst_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_StkLumpAlloc create(){
		MSBEP_StkLumpAlloc p = new MSBEP_StkLumpAlloc();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_StkLumpAlloc create(String name){
		MSBEP_StkLumpAlloc p = new MSBEP_StkLumpAlloc(name);
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
		MSBEP_StkLumpAlloc_MC.jbfInitTerm((MSBEP_StkLumpAlloc)this);
		MSBEP_StkLumpAlloc_MC.jbfInitCnd((MSBEP_StkLumpAlloc)this);
		MSBEP_StkLumpAlloc_MC.jbfInitDtl((MSBEP_StkLumpAlloc)this);
		MSBEP_StkLumpAlloc_MC.jbfInitBtn((MSBEP_StkLumpAlloc)this);
		MSBEP_StkLumpAlloc_MC.jbInitTerm((MSBEP_StkLumpAlloc)this);
		MSBEP_StkLumpAlloc_MC.jbInitCnd((MSBEP_StkLumpAlloc)this);
		MSBEP_StkLumpAlloc_MC.jbInitDtl((MSBEP_StkLumpAlloc)this);
		MSBEP_StkLumpAlloc_MC.jbInitBtn((MSBEP_StkLumpAlloc)this);
	}

	/**
	 * [Term]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTerm(MSBEP_StkLumpAlloc p) {
		// ブロック関連の初期化
		p.TermPanel = p.beansFactory.createPanel("Term");
		p.TermTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_StkLumpAlloc p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ship_schd_tm_prio_flg = p.beansFactory.createCheckBox("Cnd.ship_schd_tm_prio_flg");
		p.Cnd_alloc_scope_typ_Label = p.beansFactory.createLabel("Cnd.alloc_scope_typ_Label");
		p.Cnd_alloc_scope_typ = p.beansFactory.createTextComboBox("Cnd.alloc_scope_typ");
		p.Cnd_alloc_scope_typ.setLabel(p.Cnd_alloc_scope_typ_Label);
		p.Cnd_alloc_scope_typ_nm = p.beansFactory.createTextField("Cnd.alloc_scope_typ_nm");
		p.Cnd_ship_loc_cd_Label = p.beansFactory.createLabel("Cnd.ship_loc_cd_Label");
		p.Cnd_ship_loc_cd = p.beansFactory.createTextField("Cnd.ship_loc_cd");
		p.Cnd_ship_loc_cd.setLabel(p.Cnd_ship_loc_cd_Label);
		p.Cnd_ship_loc_nm = p.beansFactory.createTextField("Cnd.ship_loc_nm");
		p.Cnd_ship_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.ship_lg_grp_cd_Label");
		p.Cnd_ship_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.ship_lg_grp_cd");
		p.Cnd_ship_lg_grp_cd.setLabel(p.Cnd_ship_lg_grp_cd_Label);
		p.Cnd_ship_lg_grp_nm = p.beansFactory.createTextField("Cnd.ship_lg_grp_nm");
		p.Cnd_alloc_grp_cd_Label = p.beansFactory.createLabel("Cnd.alloc_grp_cd_Label");
		p.Cnd_alloc_grp_cd = p.beansFactory.createTextComboBox("Cnd.alloc_grp_cd");
		p.Cnd_alloc_grp_cd.setLabel(p.Cnd_alloc_grp_cd_Label);
		p.Cnd_alloc_grp_nm = p.beansFactory.createTextField("Cnd.alloc_grp_nm");
		p.Cnd_cst_slct_typ_Label = p.beansFactory.createLabel("Cnd.cst_slct_typ_Label");
		p.Cnd_cst_slct_typ = p.beansFactory.createTextComboBox("Cnd.cst_slct_typ");
		p.Cnd_cst_slct_typ.setLabel(p.Cnd_cst_slct_typ_Label);
		p.Cnd_cst_slct_typ_nm = p.beansFactory.createTextField("Cnd.cst_slct_typ_nm");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBEP_StkLumpAlloc p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlTitledBorder = p.beansFactory.createTitledBorder();
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_cst_cd = p.beansFactory.createTableColumn("Dtl.cst_cd", MCColumnType.TEXT);
		p.columnDtl_cst_nm = p.beansFactory.createTableColumn("Dtl.cst_nm", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_StkLumpAlloc p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [Term]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTerm(MSBEP_StkLumpAlloc p) {
		// ブロック関連の初期化
		p.TermPanel.setBorder(p.TermTitledBorder);
		p.add(p.TermPanel);
		p.setLastBeans(p.TermPanel);
		p.TermPanel.setNextBeans(p.CndPanel);
		p.TermPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TermPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_StkLumpAlloc p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.DtlPanel);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("CT");
		// ブロックの項目の初期化
		p.TermPanel.add(p.Cnd_ship_schd_dt_p_PPanel);
		p.TermPanel.setLastBeans(p.Cnd_ship_schd_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_ship_schd_tm_prio_flg);
		p.CndPanel.setLastBeans(p.Cnd_ship_schd_tm_prio_flg);
		p.Cnd_ship_schd_tm_prio_flg.setNextBeans(p.Cnd_alloc_scope_typ);
		p.Cnd_ship_schd_tm_prio_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0140.CndR.ship_schd_tm_prio_flg_META);
		p.Cnd_alloc_scope_typ.setListType(MCListType.STRICT);
		p.Cnd_alloc_scope_typ.setLinkBeans(p.Cnd_alloc_scope_typ_nm);
		p.CndPanel.add(p.Cnd_alloc_scope_typ_Label);
		p.CndPanel.add(p.Cnd_alloc_scope_typ);
		p.Cnd_alloc_scope_typ.setNextBeans(p.Cnd_alloc_scope_typ_nm);
		p.Cnd_alloc_scope_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0140.CndR.alloc_scope_typ_META);
		p.CndPanel.add(p.Cnd_alloc_scope_typ_nm);
		p.Cnd_alloc_scope_typ_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_alloc_scope_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0140.CndR.alloc_scope_typ_nm_META);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_ship_loc_cd);
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
		p.CndPanel.add(p.Cnd_ship_loc_cd_Label);
		p.CndPanel.add(p.Cnd_ship_loc_cd);
		p.Cnd_ship_loc_cd.setNextBeans(p.Cnd_ship_loc_nm);
		p.Cnd_ship_loc_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0140.CndR.ship_loc_cd_META);
		p.Cnd_ship_loc_cd.addLinkBeans(p.Cnd_ship_loc_nm);
		p.Cnd_ship_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_loc_cd, true);
		p.CndPanel.add(p.Cnd_ship_loc_nm);
		p.Cnd_ship_loc_nm.setNextBeans(p.Cnd_ship_lg_grp_cd);
		p.Cnd_ship_loc_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0140.CndR.ship_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_loc_nm, true);
		p.Cnd_ship_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_lg_grp_cd, true);
		p.Cnd_ship_lg_grp_cd.setLinkBeans(p.Cnd_ship_lg_grp_nm);
		p.CndPanel.add(p.Cnd_ship_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_ship_lg_grp_cd);
		p.Cnd_ship_lg_grp_cd.setNextBeans(p.Cnd_ship_lg_grp_nm);
		p.Cnd_ship_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0140.CndR.ship_lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_ship_lg_grp_nm);
		p.Cnd_ship_lg_grp_nm.setNextBeans(p.Cnd_alloc_grp_cd);
		p.Cnd_ship_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0140.CndR.ship_lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_lg_grp_nm, true);
		p.Cnd_alloc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alloc_grp_cd, true);
		p.Cnd_alloc_grp_cd.setLinkBeans(p.Cnd_alloc_grp_nm);
		p.CndPanel.add(p.Cnd_alloc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_alloc_grp_cd);
		p.Cnd_alloc_grp_cd.setNextBeans(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0140.CndR.alloc_grp_cd_META);
		p.CndPanel.add(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_nm.setNextBeans(p.Cnd_cst_slct_typ);
		p.Cnd_alloc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0140.CndR.alloc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_alloc_grp_nm, true);
		p.Cnd_cst_slct_typ.setListType(MCListType.STRICT);
		p.Cnd_cst_slct_typ.setLinkBeans(p.Cnd_cst_slct_typ_nm);
		p.CndPanel.add(p.Cnd_cst_slct_typ_Label);
		p.CndPanel.add(p.Cnd_cst_slct_typ);
		p.Cnd_cst_slct_typ.setNextBeans(p.Cnd_cst_slct_typ_nm);
		p.Cnd_cst_slct_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0140.CndR.cst_slct_typ_META);
		p.CndPanel.add(p.Cnd_cst_slct_typ_nm);
		p.Cnd_cst_slct_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0140.CndR.cst_slct_typ_nm_META);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBEP_StkLumpAlloc p) {
		// ブロック関連の初期化
		p.DtlPanel.setBorder(p.DtlTitledBorder);
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBEP_StkLumpAlloc p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_radd.setIcon("INSERT_RECORD");
		p.Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_radd);
		p.BtnPanel.setLastBeans(p.Btn_radd);
		p.Btn_radd.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_menu_move_p_PPanel);
		p.BtnPanel.add(p.Btn_menu_move_p_PPanel);
		p.Btn_menu_move_p_PPanel.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
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
		MSBEP_StkLumpAlloc_MC.mcInitTerm((MSBEP_StkLumpAlloc)this);
		MSBEP_StkLumpAlloc_MC.mcInitCnd((MSBEP_StkLumpAlloc)this);
		MSBEP_StkLumpAlloc_MC.mcInitDtl((MSBEP_StkLumpAlloc)this);
		MSBEP_StkLumpAlloc_MC.mcInitBtn((MSBEP_StkLumpAlloc)this);

		// [UPD]ステータスのモードの設定
		MSBEP_StkLumpAlloc_MC.statusInitUPD_Term((MSBEP_StkLumpAlloc)this);
		MSBEP_StkLumpAlloc_MC.statusInitUPD_Cnd((MSBEP_StkLumpAlloc)this);
		MSBEP_StkLumpAlloc_MC.statusInitUPD_Dtl((MSBEP_StkLumpAlloc)this);
		MSBEP_StkLumpAlloc_MC.statusInitUPD_Btn((MSBEP_StkLumpAlloc)this);

	}

	/**
	 *  [Term]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTerm(MSBEP_StkLumpAlloc p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_StkLumpAlloc p) {
		p.Cnd_ship_schd_tm_prio_flg.addAllListener(p);
		p.Cnd_alloc_scope_typ.setListListener(p);
		p.Cnd_alloc_scope_typ.addAllListener(p);
		p.Cnd_alloc_scope_typ_nm.setListListener(p);
		p.Cnd_alloc_scope_typ_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_ship_loc_cd.setListListener(p);
		p.Cnd_ship_loc_cd.addAllListener(p);
		p.Cnd_ship_loc_nm.setListListener(p);
		p.Cnd_ship_loc_nm.addAllListener(p);
		p.Cnd_ship_lg_grp_cd.setListListener(p);
		p.Cnd_ship_lg_grp_cd.addAllListener(p);
		p.Cnd_ship_lg_grp_nm.setListListener(p);
		p.Cnd_ship_lg_grp_nm.addAllListener(p);
		p.Cnd_alloc_grp_cd.setListListener(p);
		p.Cnd_alloc_grp_cd.addAllListener(p);
		p.Cnd_alloc_grp_nm.setListListener(p);
		p.Cnd_alloc_grp_nm.addAllListener(p);
		p.Cnd_cst_slct_typ.setListListener(p);
		p.Cnd_cst_slct_typ.addAllListener(p);
		p.Cnd_cst_slct_typ_nm.setListListener(p);
		p.Cnd_cst_slct_typ_nm.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBEP_StkLumpAlloc p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_cst_cd.addAllListener(p);
		p.columnDtl_cst_cd.setListListener(p);
		p.columnDtl_cst_nm.addAllListener(p);
		p.columnDtl_cst_nm.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_StkLumpAlloc p) {
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [UPD]ステータスの[Term]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Term(MSBEP_StkLumpAlloc p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBEP_StkLumpAlloc p){
		p.Cnd_ship_schd_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_schd_dt_p_PPanel.YmdHmFrTo_ymd_to.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ship_schd_tm_prio_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_alloc_scope_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_alloc_scope_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ship_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_slct_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_slct_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBEP_StkLumpAlloc p){
		p.columnDtl_cst_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBEP_StkLumpAlloc p){
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);

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
		MSBEP_StkLumpAlloc_MC.setTableConfigDtl((MSBEP_StkLumpAlloc)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBEP_StkLumpAlloc p) {
		p.columnDtl_cst_cd.setMeta(mcframe.clientMSBE.MSBEP0140.DtlR.cst_cd_META);
		p.columnDtl_cst_cd.setListType(MCListType.STRICT);
		p.columnDtl_cst_cd.addLinkBeans(p.columnDtl_cst_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_cd);
		p.columnDtl_cst_nm.setMeta(mcframe.clientMSBE.MSBEP0140.DtlR.cst_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_nm);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_alloc_scope_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alloc_scope_typ.getListConfig().setPutter(getCnd_alloc_scope_typ_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_ship_loc_cd.getListConfig().setPutter(getCnd_ship_loc_cd_ListPutter());
		Cnd_ship_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_lg_grp_cd.getListConfig().setPutter(getCnd_ship_lg_grp_cd_ListPutter());
		Cnd_alloc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alloc_grp_cd.getListConfig().setPutter(getCnd_alloc_grp_cd_ListPutter());
		Cnd_cst_slct_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_slct_typ.getListConfig().setPutter(getCnd_cst_slct_typ_ListPutter());
		columnDtl_cst_cd.getListConfig().setPutter(getDtl_cst_cd_ListPutter());
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (UPD.equals(status)) {
			setUPDStatus();
		}
	}

	/**
	 * [Cnd_alloc_scope_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alloc_scope_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AllocScopeTyp");
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
	 * [Cnd_ship_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_ship_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_alloc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alloc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AllocGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_slct_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_slct_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.CstSlctTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_alloc_scope_typ) return getCnd_alloc_scope_typ(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_ship_loc_cd) return getCnd_ship_loc_cd(row, info);
		if(combo == Cnd_ship_lg_grp_cd) return getCnd_ship_lg_grp_cd(row, info);
		if(combo == Cnd_alloc_grp_cd) return getCnd_alloc_grp_cd(row, info);
		if(combo == Cnd_cst_slct_typ) return getCnd_cst_slct_typ(row, info);
		if(combo == columnDtl_cst_cd) return getDtl_cst_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [Btn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_radd(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

	/**
	 * [Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ship_schd_tm_prio_flg) return doCnd_ship_schd_tm_prio_flg_VC(info);
		if (vc == Cnd_alloc_scope_typ) return doCnd_alloc_scope_typ_VC(info);
		if (vc == Cnd_alloc_scope_typ_nm) return doCnd_alloc_scope_typ_nm_VC(info);
		if (vc == Cnd_ship_loc_cd) return doCnd_ship_loc_cd_VC(info);
		if (vc == Cnd_ship_loc_nm) return doCnd_ship_loc_nm_VC(info);
		if (vc == Cnd_ship_lg_grp_cd) return doCnd_ship_lg_grp_cd_VC(info);
		if (vc == Cnd_ship_lg_grp_nm) return doCnd_ship_lg_grp_nm_VC(info);
		if (vc == Cnd_alloc_grp_cd) return doCnd_alloc_grp_cd_VC(info);
		if (vc == Cnd_alloc_grp_nm) return doCnd_alloc_grp_nm_VC(info);
		if (vc == Cnd_cst_slct_typ) return doCnd_cst_slct_typ_VC(info);
		if (vc == Cnd_cst_slct_typ_nm) return doCnd_cst_slct_typ_nm_VC(info);
		if (vc == columnDtl_cst_cd) return doDtl_cst_cd_VC(info);
		if (vc == columnDtl_cst_nm) return doDtl_cst_nm_VC(info);
		return true;
	}

	/**
	 * [Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_schd_tm_prio_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_schd_tm_prio_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_scope_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_scope_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alloc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_slct_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_slct_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_slct_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_slct_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_nm_VC(MCEventInfo info){
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
		if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ship_schd_tm_prio_flg) doCnd_ship_schd_tm_prio_flg_NC(info);
		else if (nc == Cnd_alloc_scope_typ) doCnd_alloc_scope_typ_NC(info);
		else if (nc == Cnd_alloc_scope_typ_nm) doCnd_alloc_scope_typ_nm_NC(info);
		else if (nc == Cnd_ship_loc_cd) doCnd_ship_loc_cd_NC(info);
		else if (nc == Cnd_ship_loc_nm) doCnd_ship_loc_nm_NC(info);
		else if (nc == Cnd_ship_lg_grp_cd) doCnd_ship_lg_grp_cd_NC(info);
		else if (nc == Cnd_ship_lg_grp_nm) doCnd_ship_lg_grp_nm_NC(info);
		else if (nc == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NC(info);
		else if (nc == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NC(info);
		else if (nc == Cnd_cst_slct_typ) doCnd_cst_slct_typ_NC(info);
		else if (nc == Cnd_cst_slct_typ_nm) doCnd_cst_slct_typ_nm_NC(info);
		else if (nc == columnDtl_cst_cd) doDtl_cst_cd_NC(info);
		else if (nc == columnDtl_cst_nm) doDtl_cst_nm_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_schd_tm_prio_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_schd_tm_prio_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_scope_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_scope_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_slct_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_slct_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_slct_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_slct_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ship_schd_tm_prio_flg) doCnd_ship_schd_tm_prio_flg_NE(info);
		else if (ne == Cnd_alloc_scope_typ) doCnd_alloc_scope_typ_NE(info);
		else if (ne == Cnd_alloc_scope_typ_nm) doCnd_alloc_scope_typ_nm_NE(info);
		else if (ne == Cnd_ship_loc_cd) doCnd_ship_loc_cd_NE(info);
		else if (ne == Cnd_ship_loc_nm) doCnd_ship_loc_nm_NE(info);
		else if (ne == Cnd_ship_lg_grp_cd) doCnd_ship_lg_grp_cd_NE(info);
		else if (ne == Cnd_ship_lg_grp_nm) doCnd_ship_lg_grp_nm_NE(info);
		else if (ne == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NE(info);
		else if (ne == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NE(info);
		else if (ne == Cnd_cst_slct_typ) doCnd_cst_slct_typ_NE(info);
		else if (ne == Cnd_cst_slct_typ_nm) doCnd_cst_slct_typ_nm_NE(info);
		else if (ne == columnDtl_cst_cd) doDtl_cst_cd_NE(info);
		else if (ne == columnDtl_cst_nm) doDtl_cst_nm_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_schd_tm_prio_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_schd_tm_prio_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_scope_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_scope_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_slct_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_slct_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_slct_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_slct_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ship_schd_tm_prio_flg) doCnd_ship_schd_tm_prio_flg_NX(info);
		else if (nx == Cnd_alloc_scope_typ) doCnd_alloc_scope_typ_NX(info);
		else if (nx == Cnd_alloc_scope_typ_nm) doCnd_alloc_scope_typ_nm_NX(info);
		else if (nx == Cnd_ship_loc_cd) doCnd_ship_loc_cd_NX(info);
		else if (nx == Cnd_ship_loc_nm) doCnd_ship_loc_nm_NX(info);
		else if (nx == Cnd_ship_lg_grp_cd) doCnd_ship_lg_grp_cd_NX(info);
		else if (nx == Cnd_ship_lg_grp_nm) doCnd_ship_lg_grp_nm_NX(info);
		else if (nx == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NX(info);
		else if (nx == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NX(info);
		else if (nx == Cnd_cst_slct_typ) doCnd_cst_slct_typ_NX(info);
		else if (nx == Cnd_cst_slct_typ_nm) doCnd_cst_slct_typ_nm_NX(info);
		else if (nx == columnDtl_cst_cd) doDtl_cst_cd_NX(info);
		else if (nx == columnDtl_cst_nm) doDtl_cst_nm_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_schd_tm_prio_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_schd_tm_prio_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_scope_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_scope_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_slct_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_slct_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_slct_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_slct_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_alloc_scope_typ) doCnd_alloc_scope_typ_LC(info);
		else if (lc == Cnd_alloc_scope_typ_nm) doCnd_alloc_scope_typ_nm_LC(info);
		else if (lc == Cnd_ship_loc_cd) doCnd_ship_loc_cd_LC(info);
		else if (lc == Cnd_ship_loc_nm) doCnd_ship_loc_nm_LC(info);
		else if (lc == Cnd_ship_lg_grp_cd) doCnd_ship_lg_grp_cd_LC(info);
		else if (lc == Cnd_ship_lg_grp_nm) doCnd_ship_lg_grp_nm_LC(info);
		else if (lc == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_LC(info);
		else if (lc == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_LC(info);
		else if (lc == Cnd_cst_slct_typ) doCnd_cst_slct_typ_LC(info);
		else if (lc == Cnd_cst_slct_typ_nm) doCnd_cst_slct_typ_nm_LC(info);
		else if (lc == columnDtl_cst_cd) doDtl_cst_cd_LC(info);
		else if (lc == columnDtl_cst_nm) doDtl_cst_nm_LC(info);
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_scope_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_scope_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_slct_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_slct_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_slct_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_slct_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_alloc_scope_typ]の作成メソッド
	 */
	public MCList getCnd_alloc_scope_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAllocScopeTyp(row, info);
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
	 * コンボ／リストのリスト[Cnd_ship_loc_cd]の作成メソッド
	 */
	public MCList getCnd_ship_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_ship_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alloc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_alloc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAllocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_slct_typ]の作成メソッド
	 */
	public MCList getCnd_cst_slct_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getCstSlctTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cst_cd]の作成メソッド
	 */
	public MCList getDtl_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL0140.Upd01")) {
			return new MS_MSBEL0140_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL0140_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0140_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL0140_Upd01;

		/** コンストラクタ */
		protected MS_MSBEL0140_Upd01Bridge() {
			p_MS_MSBEL0140_Upd01 = new MCParam(PDef.MS_MSBEL0140_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL0140_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP0140.CndR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP0140.DtlR.class));
			// Down

			p_MS_MSBEL0140_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL0140_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL0140_Upd01.addUpBlock(getCndR());
			p_MS_MSBEL0140_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL0140_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL0140_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP0140.CndR up0() {
			return (mcframe.clientMSBE.MSBEP0140.CndR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP0140.DtlR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP0140.DtlR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBEL0140_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}