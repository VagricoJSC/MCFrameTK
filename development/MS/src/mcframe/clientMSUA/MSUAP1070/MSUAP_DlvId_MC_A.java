package mcframe.clientMSUA.MSUAP1070;

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

/**
 * 画面"MSUAP_DlvId"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUAP_DlvId_MC_A extends mcframe.clientMAUD.MAUDP0020.MAUDP_ISPanel{
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
	public static final String SUBMODULE_ID = "MSUA";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSUAP1070";

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
	public MCLabel Cnd_dlv_id_typ_Label = null;
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_id_typ = null;
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public MCTextField Cnd_dlv_id_typ_nm = null;
	public MCLabel Cnd_base_dt_Label = null;
	/**
	 * Base date 基準日.<p>
	 *
	 */
	public MCDateField Cnd_base_dt = null;
	public MCLabel Cnd_dlv_id_cd_Label = null;
	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_id_cd = null;
	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public MCTextField Cnd_dlv_id_nm = null;
	public MCLabel Cnd_dlv_id_alt_nm1_Label = null;
	/**
	 * Delivery destination identification alias name 1 納品先識別別名１.<p>
	 *
	 */
	public MCTextField Cnd_dlv_id_alt_nm1 = null;
	public MCLabel Cnd_dlv_id_alt_nm2_Label = null;
	/**
	 * Delivery destination identification alias name 2 納品先識別別名２.<p>
	 *
	 */
	public MCTextField Cnd_dlv_id_alt_nm2 = null;
	public MCLabel Cnd_dlv_id_alt_nm3_Label = null;
	/**
	 * Delivery destination identification alias name 3 納品先識別別名３.<p>
	 *
	 */
	public MCTextField Cnd_dlv_id_alt_nm3 = null;
	public MCLabel Cnd_dlv_id_alt_nm4_Label = null;
	/**
	 * Delivery destination identification alias name 4 納品先識別別名４.<p>
	 *
	 */
	public MCTextField Cnd_dlv_id_alt_nm4 = null;
	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public MCButtonGroup Cnd_match_typ_Group = null;
	public MCRadioButton Cnd_match_typ_0 = null;
	public MCRadioButton Cnd_match_typ_1 = null;
	public MCRadioButton Cnd_match_typ_2 = null;
	public MCRadioButton Cnd_match_typ_3 = null;
	// [SrchBtn]ブロック関連のField定義
	public MCPanel SrchBtnPanel = null;
	// [SrchBtn]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [RsltWrk]ブロック関連のField定義
	public MCPanel RsltWrkPanel = null;
	// [RsltWrk]ブロックの項目のField定義
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSUA.MSUAP1070.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_cd = null;
	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_nm = null;
	/**
	 * Delivery destination identification alias name 1 納品先識別別名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_alt_nm1 = null;
	/**
	 * Delivery destination identification alias name 2 納品先識別別名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_alt_nm2 = null;
	/**
	 * Delivery destination identification alias name 3 納品先識別別名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_alt_nm3 = null;
	/**
	 * Delivery destination identification alias name 4 納品先識別別名４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_alt_nm4 = null;
	/**
	 * Miscellaneous delivery destination flg. 納品先諸口ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_sundry_flg = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_site_nm = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lg_grp_nm = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_nm = null;
	/**
	 * For rack/line flg. 棚・ライン対象ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_str_ln_tgt_flg = null;
	// [RsltHdr]ブロック関連のField定義
	public MCPanel RsltHdrPanel = null;
	// [RsltHdr]ブロックの項目のField定義
	public MCLabel RsltHdr_dlv_id_cd_Label = null;
	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public MCTextField RsltHdr_dlv_id_cd = null;
	public MCLabel RsltHdr_dlv_id_nm_Label = null;
	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public MCTextField RsltHdr_dlv_id_nm = null;
	/**
	 * Miscellaneous delivery destination flg. 納品先諸口ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox RsltHdr_dlv_sundry_flg = null;
	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public MCCheckBox RsltHdr_pri_prnt_flg = null;
	public MCLabel RsltHdr_zip_cd_Label = null;
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public MCTextField RsltHdr_zip_cd = null;
	public MCLabel RsltHdr_addr1_Label = null;
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public MCTextField RsltHdr_addr1 = null;
	public MCLabel RsltHdr_addr2_Label = null;
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public MCTextField RsltHdr_addr2 = null;
	public MCLabel RsltHdr_addr3_Label = null;
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public MCTextField RsltHdr_addr3 = null;
	public MCLabel RsltHdr_addr4_Label = null;
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public MCTextField RsltHdr_addr4 = null;
	public MCLabel RsltHdr_tel_Label = null;
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public MCTextField RsltHdr_tel = null;
	public MCLabel RsltHdr_fax_Label = null;
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public MCTextField RsltHdr_fax = null;
	public MCLabel RsltHdr_cntry_cd_Label = null;
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public MCTextField RsltHdr_cntry_cd = null;
	public MCLabel RsltHdr_cntry_nm_Label = null;
	/**
	 * Country name 国名.<p>
	 *
	 */
	public MCTextField RsltHdr_cntry_nm = null;
	public MCLabel RsltHdr_dlv_cntct_dpt_Label = null;
	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public MCTextField RsltHdr_dlv_cntct_dpt = null;
	public MCLabel RsltHdr_dlv_cntct_psn_Label = null;
	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public MCTextField RsltHdr_dlv_cntct_psn = null;
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
	 * Accept 決定する.<p>
	 *
	 */
	public MCButton Btn_accept = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSUA.MSUAP1070.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSUA.MSUAP1070.RsltR> aRsltL;
	/** [RsltHdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSUA.MSUAP1070.RsltHdrR aRsltHdrR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSUA.MSUAP1070.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSUA.MSUAP1070.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSUA.MSUAP1070.CndR createCndR() {
		return mcframe.clientMSUA.MSUAP1070.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSUA.MSUAP1070.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSUA.MSUAP1070.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSUA.MSUAP1070.RsltR createRsltR() {
		return mcframe.clientMSUA.MSUAP1070.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSUA.MSUAP1070.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSUA.MSUAP1070.RsltR.class);
	}

	/**
	 * RsltTableを初期化します。
	 */
	protected void createRsltTable(){
		if(RsltTable == null){
			RsltTable = beansFactory.createTable2("Rslt.table");
		}
	}

	/**
	 * 項目コピーによってaRsltHdrRを設定します。
	 *
	 * aRsltHdrRのインスタンスは変更されません。
	 *
	 * @param row RsltHdrR
	 */
	public void setRsltHdrR(mcframe.clientMSUA.MSUAP1070.RsltHdrR row) {
		if (row != null) {
			MCRow.copyall(getRsltHdrR(), row);
		}
	}

	/**
	 * [RsltHdr]ブロックのコンテナaRsltHdrRを返します。
	 *
	 * @return RsltHdrR
	 */
	public mcframe.clientMSUA.MSUAP1070.RsltHdrR getRsltHdrR() {
		return aRsltHdrR;
	}

	/**
	 * aRsltHdrRを作成します。
	 *
	 * @return RsltHdrR
	 */
	public mcframe.clientMSUA.MSUAP1070.RsltHdrR createRsltHdrR() {
		return mcframe.clientMSUA.MSUAP1070.RsltHdrR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
		if(!MCCollectionUtil.contains(ret, getRsltHdrR())) ret.add(getRsltHdrR());
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
		if(aCnt == getRsltL()) return "Rslt";
		if(aCnt == getRsltHdrR()) return "RsltHdr";
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
		if(bId.equals("Rslt")) return getRsltL();
		if(bId.equals("RsltHdr")) return getRsltHdrR();
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
		ret.add(SrchBtnPanel);
		ret.add(CtrlPanel);
		ret.add(RsltWrkPanel);
		ret.add(RsltPanel);
		ret.add(RsltHdrPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUAP_DlvId_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aRsltHdrR = createRsltHdrR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSUAP_DlvId_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aRsltHdrR = createRsltHdrR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSUAP_DlvId_MC.jbCreateTop((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbCreateCnd((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbCreateSrchBtn((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbCreateCtrl((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbCreateRsltWrk((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbCreateRslt((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbCreateRsltHdr((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbCreateBtn((MSUAP_DlvId)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSUAP_DlvId p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSUAP_DlvId p) {
	}

	/**
	 * [SrchBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn(MSUAP_DlvId p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSUAP_DlvId p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RsltWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRsltWrk(MSUAP_DlvId p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSUAP_DlvId p) {
	}

	/**
	 * [RsltHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRsltHdr(MSUAP_DlvId p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSUAP_DlvId p) {
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

	
	/** [Cnd_dlv_id_typ_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_id_typ_p = null;

	/**
	 * [Cnd_dlv_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_id_typ_ListPutter() {
		if (Cnd_dlv_id_typ_p == null) {
			Cnd_dlv_id_typ_p = createCnd_dlv_id_typ_ListPutter(Cnd_dlv_id_typ, "dlv_id_typ", "dlv_id_typ_nm");

		}
		return Cnd_dlv_id_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUAP_DlvId create(){
		MSUAP_DlvId p = new MSUAP_DlvId();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUAP_DlvId create(String name){
		MSUAP_DlvId p = new MSUAP_DlvId(name);
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
		MSUAP_DlvId_MC.jbfInitTop((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbfInitCnd((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbfInitSrchBtn((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbfInitCtrl((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbfInitRsltWrk((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbfInitRslt((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbfInitRsltHdr((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbfInitBtn((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbInitTop((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbInitCnd((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbInitSrchBtn((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbInitCtrl((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbInitRsltWrk((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbInitRslt((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbInitRsltHdr((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.jbInitBtn((MSUAP_DlvId)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSUAP_DlvId p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSUAP_DlvId p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_dlv_id_typ_Label = p.beansFactory.createLabel("Cnd.dlv_id_typ_Label");
		p.Cnd_dlv_id_typ = p.beansFactory.createTextComboBox("Cnd.dlv_id_typ");
		p.Cnd_dlv_id_typ.setLabel(p.Cnd_dlv_id_typ_Label);
		p.Cnd_dlv_id_typ_nm = p.beansFactory.createTextField("Cnd.dlv_id_typ_nm");
		p.Cnd_base_dt_Label = p.beansFactory.createLabel("Cnd.base_dt_Label");
		p.Cnd_base_dt = p.beansFactory.createDateField("Cnd.base_dt");
		p.Cnd_base_dt.setLabel(p.Cnd_base_dt_Label);
		p.Cnd_dlv_id_cd_Label = p.beansFactory.createLabel("Cnd.dlv_id_cd_Label");
		p.Cnd_dlv_id_cd = p.beansFactory.createTextField("Cnd.dlv_id_cd");
		p.Cnd_dlv_id_cd.setLabel(p.Cnd_dlv_id_cd_Label);
		p.Cnd_dlv_id_nm = p.beansFactory.createTextField("Cnd.dlv_id_nm");
		p.Cnd_dlv_id_alt_nm1_Label = p.beansFactory.createLabel("Cnd.dlv_id_alt_nm1_Label");
		p.Cnd_dlv_id_alt_nm1 = p.beansFactory.createTextField("Cnd.dlv_id_alt_nm1");
		p.Cnd_dlv_id_alt_nm1.setLabel(p.Cnd_dlv_id_alt_nm1_Label);
		p.Cnd_dlv_id_alt_nm2_Label = p.beansFactory.createLabel("Cnd.dlv_id_alt_nm2_Label");
		p.Cnd_dlv_id_alt_nm2 = p.beansFactory.createTextField("Cnd.dlv_id_alt_nm2");
		p.Cnd_dlv_id_alt_nm2.setLabel(p.Cnd_dlv_id_alt_nm2_Label);
		p.Cnd_dlv_id_alt_nm3_Label = p.beansFactory.createLabel("Cnd.dlv_id_alt_nm3_Label");
		p.Cnd_dlv_id_alt_nm3 = p.beansFactory.createTextField("Cnd.dlv_id_alt_nm3");
		p.Cnd_dlv_id_alt_nm3.setLabel(p.Cnd_dlv_id_alt_nm3_Label);
		p.Cnd_dlv_id_alt_nm4_Label = p.beansFactory.createLabel("Cnd.dlv_id_alt_nm4_Label");
		p.Cnd_dlv_id_alt_nm4 = p.beansFactory.createTextField("Cnd.dlv_id_alt_nm4");
		p.Cnd_dlv_id_alt_nm4.setLabel(p.Cnd_dlv_id_alt_nm4_Label);
		p.Cnd_match_typ_Group = p.beansFactory.createButtonGroup("Cnd.match_typ");
		p.Cnd_match_typ_0 = p.beansFactory.createRadioButton("Cnd.match_typ_0");
		p.Cnd_match_typ_1 = p.beansFactory.createRadioButton("Cnd.match_typ_1");
		p.Cnd_match_typ_2 = p.beansFactory.createRadioButton("Cnd.match_typ_2");
		p.Cnd_match_typ_3 = p.beansFactory.createRadioButton("Cnd.match_typ_3");
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn(MSUAP_DlvId p) {
		// ブロック関連の初期化
		p.SrchBtnPanel = p.beansFactory.createPanel("SrchBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSUAP_DlvId p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RsltWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRsltWrk(MSUAP_DlvId p) {
		// ブロック関連の初期化
		p.RsltWrkPanel = p.beansFactory.createPanel("RsltWrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSUAP_DlvId p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_dlv_id_cd = p.beansFactory.createTableColumn("Rslt.dlv_id_cd", MCColumnType.TEXT);
		p.columnRslt_dlv_id_nm = p.beansFactory.createTableColumn("Rslt.dlv_id_nm", MCColumnType.TEXT);
		p.columnRslt_dlv_id_alt_nm1 = p.beansFactory.createTableColumn("Rslt.dlv_id_alt_nm1", MCColumnType.TEXT);
		p.columnRslt_dlv_id_alt_nm2 = p.beansFactory.createTableColumn("Rslt.dlv_id_alt_nm2", MCColumnType.TEXT);
		p.columnRslt_dlv_id_alt_nm3 = p.beansFactory.createTableColumn("Rslt.dlv_id_alt_nm3", MCColumnType.TEXT);
		p.columnRslt_dlv_id_alt_nm4 = p.beansFactory.createTableColumn("Rslt.dlv_id_alt_nm4", MCColumnType.TEXT);
		p.columnRslt_dlv_sundry_flg = p.beansFactory.createTableColumn("Rslt.dlv_sundry_flg", MCColumnType.CHECK);
		p.columnRslt_site_cd = p.beansFactory.createTableColumn("Rslt.site_cd", MCColumnType.TEXT);
		p.columnRslt_site_nm = p.beansFactory.createTableColumn("Rslt.site_nm", MCColumnType.TEXT);
		p.columnRslt_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_str_ln_tgt_flg = p.beansFactory.createTableColumn("Rslt.str_ln_tgt_flg", MCColumnType.CHECK);
	}

	/**
	 * [RsltHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRsltHdr(MSUAP_DlvId p) {
		// ブロック関連の初期化
		p.RsltHdrPanel = p.beansFactory.createPanel("RsltHdr");
		// ブロックの項目の初期化
		p.RsltHdr_dlv_id_cd_Label = p.beansFactory.createLabel("RsltHdr.dlv_id_cd_Label");
		p.RsltHdr_dlv_id_cd = p.beansFactory.createTextField("RsltHdr.dlv_id_cd");
		p.RsltHdr_dlv_id_cd.setLabel(p.RsltHdr_dlv_id_cd_Label);
		p.RsltHdr_dlv_id_nm_Label = p.beansFactory.createLabel("RsltHdr.dlv_id_nm_Label");
		p.RsltHdr_dlv_id_nm = p.beansFactory.createTextField("RsltHdr.dlv_id_nm");
		p.RsltHdr_dlv_id_nm.setLabel(p.RsltHdr_dlv_id_nm_Label);
		p.RsltHdr_dlv_sundry_flg = p.beansFactory.createCheckBox("RsltHdr.dlv_sundry_flg");
		p.RsltHdr_pri_prnt_flg = p.beansFactory.createCheckBox("RsltHdr.pri_prnt_flg");
		p.RsltHdr_zip_cd_Label = p.beansFactory.createLabel("RsltHdr.zip_cd_Label");
		p.RsltHdr_zip_cd = p.beansFactory.createTextField("RsltHdr.zip_cd");
		p.RsltHdr_zip_cd.setLabel(p.RsltHdr_zip_cd_Label);
		p.RsltHdr_addr1_Label = p.beansFactory.createLabel("RsltHdr.addr1_Label");
		p.RsltHdr_addr1 = p.beansFactory.createTextField("RsltHdr.addr1");
		p.RsltHdr_addr1.setLabel(p.RsltHdr_addr1_Label);
		p.RsltHdr_addr2_Label = p.beansFactory.createLabel("RsltHdr.addr2_Label");
		p.RsltHdr_addr2 = p.beansFactory.createTextField("RsltHdr.addr2");
		p.RsltHdr_addr2.setLabel(p.RsltHdr_addr2_Label);
		p.RsltHdr_addr3_Label = p.beansFactory.createLabel("RsltHdr.addr3_Label");
		p.RsltHdr_addr3 = p.beansFactory.createTextField("RsltHdr.addr3");
		p.RsltHdr_addr3.setLabel(p.RsltHdr_addr3_Label);
		p.RsltHdr_addr4_Label = p.beansFactory.createLabel("RsltHdr.addr4_Label");
		p.RsltHdr_addr4 = p.beansFactory.createTextField("RsltHdr.addr4");
		p.RsltHdr_addr4.setLabel(p.RsltHdr_addr4_Label);
		p.RsltHdr_tel_Label = p.beansFactory.createLabel("RsltHdr.tel_Label");
		p.RsltHdr_tel = p.beansFactory.createTextField("RsltHdr.tel");
		p.RsltHdr_tel.setLabel(p.RsltHdr_tel_Label);
		p.RsltHdr_fax_Label = p.beansFactory.createLabel("RsltHdr.fax_Label");
		p.RsltHdr_fax = p.beansFactory.createTextField("RsltHdr.fax");
		p.RsltHdr_fax.setLabel(p.RsltHdr_fax_Label);
		p.RsltHdr_cntry_cd_Label = p.beansFactory.createLabel("RsltHdr.cntry_cd_Label");
		p.RsltHdr_cntry_cd = p.beansFactory.createTextField("RsltHdr.cntry_cd");
		p.RsltHdr_cntry_cd.setLabel(p.RsltHdr_cntry_cd_Label);
		p.RsltHdr_cntry_nm_Label = p.beansFactory.createLabel("RsltHdr.cntry_nm_Label");
		p.RsltHdr_cntry_nm = p.beansFactory.createTextField("RsltHdr.cntry_nm");
		p.RsltHdr_cntry_nm.setLabel(p.RsltHdr_cntry_nm_Label);
		p.RsltHdr_dlv_cntct_dpt_Label = p.beansFactory.createLabel("RsltHdr.dlv_cntct_dpt_Label");
		p.RsltHdr_dlv_cntct_dpt = p.beansFactory.createTextField("RsltHdr.dlv_cntct_dpt");
		p.RsltHdr_dlv_cntct_dpt.setLabel(p.RsltHdr_dlv_cntct_dpt_Label);
		p.RsltHdr_dlv_cntct_psn_Label = p.beansFactory.createLabel("RsltHdr.dlv_cntct_psn_Label");
		p.RsltHdr_dlv_cntct_psn = p.beansFactory.createTextField("RsltHdr.dlv_cntct_psn");
		p.RsltHdr_dlv_cntct_psn.setLabel(p.RsltHdr_dlv_cntct_psn_Label);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSUAP_DlvId p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_accept = p.beansFactory.createButton("Btn.accept", "upd");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSUAP_DlvId p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltWrkPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.CndPanel, null);
		p.TopPanel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.SrchBtnPanel);
		p.TopPanel.add(p.SrchBtnPanel, null);
		p.SrchBtnPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSUAP_DlvId p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Cnd_dlv_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_id_typ, true);
		p.Cnd_dlv_id_typ.setLinkBeans(p.Cnd_dlv_id_typ_nm);
		p.CndPanel.add(p.Cnd_dlv_id_typ_Label);
		p.CndPanel.add(p.Cnd_dlv_id_typ);
		p.CndPanel.setLastBeans(p.Cnd_dlv_id_typ);
		p.Cnd_dlv_id_typ.setNextBeans(p.Cnd_dlv_id_typ_nm);
		p.Cnd_dlv_id_typ.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1070.CndR.dlv_id_typ_META);
		p.CndPanel.add(p.Cnd_dlv_id_typ_nm);
		p.Cnd_dlv_id_typ_nm.setNextBeans(p.Cnd_base_dt);
		p.Cnd_dlv_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1070.CndR.dlv_id_typ_nm_META);
		p.CndPanel.add(p.Cnd_base_dt_Label);
		p.CndPanel.add(p.Cnd_base_dt);
		p.Cnd_base_dt.setNextBeans(p.Cnd_dlv_id_cd);
		p.Cnd_base_dt.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1070.CndR.base_dt_META);
		p.Cnd_base_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dlv_id_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_id_cd);
		p.Cnd_dlv_id_cd.setNextBeans(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1070.CndR.dlv_id_cd_META);
		p.setPluralValueEnable(p.Cnd_dlv_id_cd, true);
		p.CndPanel.add(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_nm.setNextBeans(p.Cnd_dlv_id_alt_nm1);
		p.Cnd_dlv_id_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1070.CndR.dlv_id_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_id_nm, true);
		p.CndPanel.add(p.Cnd_dlv_id_alt_nm1_Label);
		p.CndPanel.add(p.Cnd_dlv_id_alt_nm1);
		p.Cnd_dlv_id_alt_nm1.setNextBeans(p.Cnd_dlv_id_alt_nm2);
		p.Cnd_dlv_id_alt_nm1.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1070.CndR.dlv_id_alt_nm1_META);
		p.setPluralValueEnable(p.Cnd_dlv_id_alt_nm1, true);
		p.CndPanel.add(p.Cnd_dlv_id_alt_nm2_Label);
		p.CndPanel.add(p.Cnd_dlv_id_alt_nm2);
		p.Cnd_dlv_id_alt_nm2.setNextBeans(p.Cnd_dlv_id_alt_nm3);
		p.Cnd_dlv_id_alt_nm2.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1070.CndR.dlv_id_alt_nm2_META);
		p.setPluralValueEnable(p.Cnd_dlv_id_alt_nm2, true);
		p.CndPanel.add(p.Cnd_dlv_id_alt_nm3_Label);
		p.CndPanel.add(p.Cnd_dlv_id_alt_nm3);
		p.Cnd_dlv_id_alt_nm3.setNextBeans(p.Cnd_dlv_id_alt_nm4);
		p.Cnd_dlv_id_alt_nm3.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1070.CndR.dlv_id_alt_nm3_META);
		p.setPluralValueEnable(p.Cnd_dlv_id_alt_nm3, true);
		p.CndPanel.add(p.Cnd_dlv_id_alt_nm4_Label);
		p.CndPanel.add(p.Cnd_dlv_id_alt_nm4);
		p.Cnd_dlv_id_alt_nm4.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1070.CndR.dlv_id_alt_nm4_META);
		p.setPluralValueEnable(p.Cnd_dlv_id_alt_nm4, true);
		p.SrchBtnPanel.setLastBeans(p.Cnd_match_typ_Group);
		p.Cnd_match_typ_Group.setFirstBeans(p.Cnd_match_typ_0);
		p.Cnd_match_typ_0.setActionCommand("0");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_0);
		p.SrchBtnPanel.add(p.Cnd_match_typ_0);
		p.Cnd_match_typ_0.setNextBeans(p.Cnd_match_typ_1);
		p.Cnd_match_typ_1.setActionCommand("1");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_1);
		p.SrchBtnPanel.add(p.Cnd_match_typ_1);
		p.Cnd_match_typ_1.setNextBeans(p.Cnd_match_typ_2);
		p.Cnd_match_typ_2.setActionCommand("2");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_2);
		p.SrchBtnPanel.add(p.Cnd_match_typ_2);
		p.Cnd_match_typ_2.setNextBeans(p.Cnd_match_typ_3);
		p.Cnd_match_typ_3.setActionCommand("3");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_3);
		p.SrchBtnPanel.add(p.Cnd_match_typ_3);
		p.Cnd_match_typ_Group.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1070.CndR.match_typ_META);
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn(MSUAP_DlvId p) {
		// ブロック関連の初期化
		p.SrchBtnPanel.setLayoutPosition("SEC");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSUAP_DlvId p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SEE");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [RsltWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRsltWrk(MSUAP_DlvId p) {
		// ブロック関連の初期化
		p.add(p.RsltWrkPanel);
		p.RsltWrkPanel.setNextBeans(p.BtnPanel);
		p.RsltWrkPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.RsltWrkPanel.add(p.RsltPanel, null);
		p.RsltWrkPanel.setLastBeans(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.RsltHdrPanel);
		p.RsltWrkPanel.add(p.RsltHdrPanel, null);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSUAP_DlvId p) {
		// ブロック関連の初期化
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setValueCheck(false);
		p.RsltPanel.setLayoutPosition("CTC");
		// ブロックの項目の初期化
	}

	/**
	 * [RsltHdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRsltHdr(MSUAP_DlvId p) {
		// ブロック関連の初期化
		p.RsltHdrPanel.setValueCheck(false);
		p.RsltHdrPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
		p.RsltHdrPanel.add(p.RsltHdr_dlv_id_cd_Label);
		p.RsltHdrPanel.add(p.RsltHdr_dlv_id_cd);
		p.RsltHdrPanel.setLastBeans(p.RsltHdr_dlv_id_cd);
		p.RsltHdr_dlv_id_cd.setNextBeans(p.RsltHdr_dlv_id_nm);
		p.RsltHdr_dlv_id_cd.setRow(p.getRsltHdrR(), mcframe.clientMSUA.MSUAP1070.RsltHdrR.dlv_id_cd_META);
		p.RsltHdrPanel.add(p.RsltHdr_dlv_id_nm_Label);
		p.RsltHdrPanel.add(p.RsltHdr_dlv_id_nm);
		p.RsltHdr_dlv_id_nm.setNextBeans(p.RsltHdr_dlv_sundry_flg);
		p.RsltHdr_dlv_id_nm.setRow(p.getRsltHdrR(), mcframe.clientMSUA.MSUAP1070.RsltHdrR.dlv_id_nm_META);
		p.RsltHdrPanel.add(p.RsltHdr_dlv_sundry_flg);
		p.RsltHdr_dlv_sundry_flg.setNextBeans(p.RsltHdr_pri_prnt_flg);
		p.RsltHdr_dlv_sundry_flg.setRow(p.getRsltHdrR(), mcframe.clientMSUA.MSUAP1070.RsltHdrR.dlv_sundry_flg_META);
		p.RsltHdrPanel.add(p.RsltHdr_pri_prnt_flg);
		p.RsltHdr_pri_prnt_flg.setNextBeans(p.RsltHdr_zip_cd);
		p.RsltHdr_pri_prnt_flg.setRow(p.getRsltHdrR(), mcframe.clientMSUA.MSUAP1070.RsltHdrR.pri_prnt_flg_META);
		p.RsltHdrPanel.add(p.RsltHdr_zip_cd_Label);
		p.RsltHdrPanel.add(p.RsltHdr_zip_cd);
		p.RsltHdr_zip_cd.setNextBeans(p.RsltHdr_addr1);
		p.RsltHdr_zip_cd.setRow(p.getRsltHdrR(), mcframe.clientMSUA.MSUAP1070.RsltHdrR.zip_cd_META);
		p.RsltHdrPanel.add(p.RsltHdr_addr1_Label);
		p.RsltHdrPanel.add(p.RsltHdr_addr1);
		p.RsltHdr_addr1.setNextBeans(p.RsltHdr_addr2);
		p.RsltHdr_addr1.setRow(p.getRsltHdrR(), mcframe.clientMSUA.MSUAP1070.RsltHdrR.addr1_META);
		p.RsltHdrPanel.add(p.RsltHdr_addr2_Label);
		p.RsltHdrPanel.add(p.RsltHdr_addr2);
		p.RsltHdr_addr2.setNextBeans(p.RsltHdr_addr3);
		p.RsltHdr_addr2.setRow(p.getRsltHdrR(), mcframe.clientMSUA.MSUAP1070.RsltHdrR.addr2_META);
		p.RsltHdrPanel.add(p.RsltHdr_addr3_Label);
		p.RsltHdrPanel.add(p.RsltHdr_addr3);
		p.RsltHdr_addr3.setNextBeans(p.RsltHdr_addr4);
		p.RsltHdr_addr3.setRow(p.getRsltHdrR(), mcframe.clientMSUA.MSUAP1070.RsltHdrR.addr3_META);
		p.RsltHdrPanel.add(p.RsltHdr_addr4_Label);
		p.RsltHdrPanel.add(p.RsltHdr_addr4);
		p.RsltHdr_addr4.setNextBeans(p.RsltHdr_tel);
		p.RsltHdr_addr4.setRow(p.getRsltHdrR(), mcframe.clientMSUA.MSUAP1070.RsltHdrR.addr4_META);
		p.RsltHdrPanel.add(p.RsltHdr_tel_Label);
		p.RsltHdrPanel.add(p.RsltHdr_tel);
		p.RsltHdr_tel.setNextBeans(p.RsltHdr_fax);
		p.RsltHdr_tel.setRow(p.getRsltHdrR(), mcframe.clientMSUA.MSUAP1070.RsltHdrR.tel_META);
		p.RsltHdrPanel.add(p.RsltHdr_fax_Label);
		p.RsltHdrPanel.add(p.RsltHdr_fax);
		p.RsltHdr_fax.setNextBeans(p.RsltHdr_cntry_cd);
		p.RsltHdr_fax.setRow(p.getRsltHdrR(), mcframe.clientMSUA.MSUAP1070.RsltHdrR.fax_META);
		p.RsltHdrPanel.add(p.RsltHdr_cntry_cd_Label);
		p.RsltHdrPanel.add(p.RsltHdr_cntry_cd);
		p.RsltHdr_cntry_cd.setNextBeans(p.RsltHdr_cntry_nm);
		p.RsltHdr_cntry_cd.setRow(p.getRsltHdrR(), mcframe.clientMSUA.MSUAP1070.RsltHdrR.cntry_cd_META);
		p.RsltHdrPanel.add(p.RsltHdr_cntry_nm_Label);
		p.RsltHdrPanel.add(p.RsltHdr_cntry_nm);
		p.RsltHdr_cntry_nm.setNextBeans(p.RsltHdr_dlv_cntct_dpt);
		p.RsltHdr_cntry_nm.setRow(p.getRsltHdrR(), mcframe.clientMSUA.MSUAP1070.RsltHdrR.cntry_nm_META);
		p.RsltHdrPanel.add(p.RsltHdr_dlv_cntct_dpt_Label);
		p.RsltHdrPanel.add(p.RsltHdr_dlv_cntct_dpt);
		p.RsltHdr_dlv_cntct_dpt.setNextBeans(p.RsltHdr_dlv_cntct_psn);
		p.RsltHdr_dlv_cntct_dpt.setRow(p.getRsltHdrR(), mcframe.clientMSUA.MSUAP1070.RsltHdrR.dlv_cntct_dpt_META);
		p.RsltHdrPanel.add(p.RsltHdr_dlv_cntct_psn_Label);
		p.RsltHdrPanel.add(p.RsltHdr_dlv_cntct_psn);
		p.RsltHdr_dlv_cntct_psn.setRow(p.getRsltHdrR(), mcframe.clientMSUA.MSUAP1070.RsltHdrR.dlv_cntct_psn_META);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSUAP_DlvId p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_accept);
		p.Btn_accept.setIcon("REGISTER");
		p.Btn_accept.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_accept);
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
		MSUAP_DlvId_MC.mcInitTop((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.mcInitCnd((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.mcInitSrchBtn((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.mcInitCtrl((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.mcInitRsltWrk((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.mcInitRslt((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.mcInitRsltHdr((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.mcInitBtn((MSUAP_DlvId)this);

		// [SRCH]ステータスのモードの設定
		MSUAP_DlvId_MC.statusInitSRCH_Top((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.statusInitSRCH_Cnd((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.statusInitSRCH_SrchBtn((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.statusInitSRCH_Ctrl((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.statusInitSRCH_RsltWrk((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.statusInitSRCH_Rslt((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.statusInitSRCH_RsltHdr((MSUAP_DlvId)this);
		MSUAP_DlvId_MC.statusInitSRCH_Btn((MSUAP_DlvId)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSUAP_DlvId p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSUAP_DlvId p) {
		p.Cnd_dlv_id_typ.setListListener(p);
		p.Cnd_dlv_id_typ.addAllListener(p);
		p.Cnd_dlv_id_typ_nm.setListListener(p);
		p.Cnd_dlv_id_typ_nm.addAllListener(p);
		p.Cnd_base_dt.setListListener(p);
		p.Cnd_base_dt.addAllListener(p);
		p.Cnd_dlv_id_cd.setListListener(p);
		p.Cnd_dlv_id_cd.addAllListener(p);
		p.Cnd_dlv_id_nm.setListListener(p);
		p.Cnd_dlv_id_nm.addAllListener(p);
		p.Cnd_dlv_id_alt_nm1.setListListener(p);
		p.Cnd_dlv_id_alt_nm1.addAllListener(p);
		p.Cnd_dlv_id_alt_nm2.setListListener(p);
		p.Cnd_dlv_id_alt_nm2.addAllListener(p);
		p.Cnd_dlv_id_alt_nm3.setListListener(p);
		p.Cnd_dlv_id_alt_nm3.addAllListener(p);
		p.Cnd_dlv_id_alt_nm4.setListListener(p);
		p.Cnd_dlv_id_alt_nm4.addAllListener(p);
		p.Cnd_match_typ_Group.addAllListener(p);
		p.Cnd_match_typ_0.addAllListener(p);
		p.Cnd_match_typ_1.addAllListener(p);
		p.Cnd_match_typ_2.addAllListener(p);
		p.Cnd_match_typ_3.addAllListener(p);
	}

	/**
	 *  [SrchBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn(MSUAP_DlvId p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSUAP_DlvId p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RsltWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRsltWrk(MSUAP_DlvId p) {
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSUAP_DlvId p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_dlv_id_cd.addAllListener(p);
		p.columnRslt_dlv_id_cd.setListListener(p);
		p.columnRslt_dlv_id_nm.addAllListener(p);
		p.columnRslt_dlv_id_nm.setListListener(p);
		p.columnRslt_dlv_id_alt_nm1.addAllListener(p);
		p.columnRslt_dlv_id_alt_nm1.setListListener(p);
		p.columnRslt_dlv_id_alt_nm2.addAllListener(p);
		p.columnRslt_dlv_id_alt_nm2.setListListener(p);
		p.columnRslt_dlv_id_alt_nm3.addAllListener(p);
		p.columnRslt_dlv_id_alt_nm3.setListListener(p);
		p.columnRslt_dlv_id_alt_nm4.addAllListener(p);
		p.columnRslt_dlv_id_alt_nm4.setListListener(p);
		p.columnRslt_dlv_sundry_flg.addAllListener(p);
		p.columnRslt_site_cd.addAllListener(p);
		p.columnRslt_site_cd.setListListener(p);
		p.columnRslt_site_nm.addAllListener(p);
		p.columnRslt_site_nm.setListListener(p);
		p.columnRslt_lg_grp_cd.addAllListener(p);
		p.columnRslt_lg_grp_cd.setListListener(p);
		p.columnRslt_lg_grp_nm.addAllListener(p);
		p.columnRslt_lg_grp_nm.setListListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_str_ln_tgt_flg.addAllListener(p);
	}

	/**
	 *  [RsltHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRsltHdr(MSUAP_DlvId p) {
		p.RsltHdr_dlv_id_cd.setListListener(p);
		p.RsltHdr_dlv_id_cd.addAllListener(p);
		p.RsltHdr_dlv_id_nm.setListListener(p);
		p.RsltHdr_dlv_id_nm.addAllListener(p);
		p.RsltHdr_dlv_sundry_flg.addAllListener(p);
		p.RsltHdr_pri_prnt_flg.addAllListener(p);
		p.RsltHdr_zip_cd.setListListener(p);
		p.RsltHdr_zip_cd.addAllListener(p);
		p.RsltHdr_addr1.setListListener(p);
		p.RsltHdr_addr1.addAllListener(p);
		p.RsltHdr_addr2.setListListener(p);
		p.RsltHdr_addr2.addAllListener(p);
		p.RsltHdr_addr3.setListListener(p);
		p.RsltHdr_addr3.addAllListener(p);
		p.RsltHdr_addr4.setListListener(p);
		p.RsltHdr_addr4.addAllListener(p);
		p.RsltHdr_tel.setListListener(p);
		p.RsltHdr_tel.addAllListener(p);
		p.RsltHdr_fax.setListListener(p);
		p.RsltHdr_fax.addAllListener(p);
		p.RsltHdr_cntry_cd.setListListener(p);
		p.RsltHdr_cntry_cd.addAllListener(p);
		p.RsltHdr_cntry_nm.setListListener(p);
		p.RsltHdr_cntry_nm.addAllListener(p);
		p.RsltHdr_dlv_cntct_dpt.setListListener(p);
		p.RsltHdr_dlv_cntct_dpt.addAllListener(p);
		p.RsltHdr_dlv_cntct_psn.setListListener(p);
		p.RsltHdr_dlv_cntct_psn.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSUAP_DlvId p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_accept.addAllListener(p);
		p.Btn_accept.setAPMethodName("doBtn_accept");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSUAP_DlvId p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSUAP_DlvId p){
		p.Cnd_dlv_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_dlv_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_base_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_id_alt_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_id_alt_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_id_alt_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_id_alt_nm4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_match_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchBtn(MSUAP_DlvId p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSUAP_DlvId p){

	}

	/**
	 * [SRCH]ステータスの[RsltWrk]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltWrk(MSUAP_DlvId p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSUAP_DlvId p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnRslt_dlv_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_alt_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_alt_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_alt_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_alt_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_sundry_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[RsltHdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltHdr(MSUAP_DlvId p){
		p.RsltHdr_dlv_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_dlv_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_dlv_sundry_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_pri_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_zip_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_addr1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_addr2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_addr3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_addr4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_tel.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_fax.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_cntry_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_cntry_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_dlv_cntct_dpt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_dlv_cntct_psn.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSUAP_DlvId p){
		p.Btn_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_accept.putMode(p, SRCH, MCMode.ENABLE);

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
		MSUAP_DlvId_MC.setTableConfigRslt((MSUAP_DlvId)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSUAP_DlvId p) {
		p.columnRslt_check.setMeta(mcframe.clientMSUA.MSUAP1070.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_dlv_id_cd.setMeta(mcframe.clientMSUA.MSUAP1070.RsltR.dlv_id_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_cd);
		p.columnRslt_dlv_id_nm.setMeta(mcframe.clientMSUA.MSUAP1070.RsltR.dlv_id_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_nm);
		p.columnRslt_dlv_id_alt_nm1.setMeta(mcframe.clientMSUA.MSUAP1070.RsltR.dlv_id_alt_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_alt_nm1);
		p.columnRslt_dlv_id_alt_nm2.setMeta(mcframe.clientMSUA.MSUAP1070.RsltR.dlv_id_alt_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_alt_nm2);
		p.columnRslt_dlv_id_alt_nm3.setMeta(mcframe.clientMSUA.MSUAP1070.RsltR.dlv_id_alt_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_alt_nm3);
		p.columnRslt_dlv_id_alt_nm4.setMeta(mcframe.clientMSUA.MSUAP1070.RsltR.dlv_id_alt_nm4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_alt_nm4);
		p.columnRslt_dlv_sundry_flg.setMeta(mcframe.clientMSUA.MSUAP1070.RsltR.dlv_sundry_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_sundry_flg);
		p.columnRslt_site_cd.setMeta(mcframe.clientMSUA.MSUAP1070.RsltR.site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_cd);
		p.columnRslt_site_nm.setMeta(mcframe.clientMSUA.MSUAP1070.RsltR.site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_nm);
		p.columnRslt_lg_grp_cd.setMeta(mcframe.clientMSUA.MSUAP1070.RsltR.lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lg_grp_cd);
		p.columnRslt_lg_grp_nm.setMeta(mcframe.clientMSUA.MSUAP1070.RsltR.lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lg_grp_nm);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSUA.MSUAP1070.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMSUA.MSUAP1070.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.columnRslt_str_ln_tgt_flg.setMeta(mcframe.clientMSUA.MSUAP1070.RsltR.str_ln_tgt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_tgt_flg);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_dlv_id_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_dlv_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_id_typ.getListConfig().setPutter(getCnd_dlv_id_typ_ListPutter());
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
	}

	/**
	 * この画面のステータスを返します。
	 *
	 * @return ステータス
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * [Cnd_dlv_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.DlvIdTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_dlv_id_typ) return getCnd_dlv_id_typ(row, info);
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
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_accept) doBtn_accept(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[accept]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_accept(MCEventInfo info);

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
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_dlv_id_typ) return doCnd_dlv_id_typ_VC(info);
		if (vc == Cnd_dlv_id_typ_nm) return doCnd_dlv_id_typ_nm_VC(info);
		if (vc == Cnd_base_dt) return doCnd_base_dt_VC(info);
		if (vc == Cnd_dlv_id_cd) return doCnd_dlv_id_cd_VC(info);
		if (vc == Cnd_dlv_id_nm) return doCnd_dlv_id_nm_VC(info);
		if (vc == Cnd_dlv_id_alt_nm1) return doCnd_dlv_id_alt_nm1_VC(info);
		if (vc == Cnd_dlv_id_alt_nm2) return doCnd_dlv_id_alt_nm2_VC(info);
		if (vc == Cnd_dlv_id_alt_nm3) return doCnd_dlv_id_alt_nm3_VC(info);
		if (vc == Cnd_dlv_id_alt_nm4) return doCnd_dlv_id_alt_nm4_VC(info);
		if (vc == Cnd_match_typ_Group) return doCnd_match_typ_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_dlv_id_cd) return doRslt_dlv_id_cd_VC(info);
		if (vc == columnRslt_dlv_id_nm) return doRslt_dlv_id_nm_VC(info);
		if (vc == columnRslt_dlv_id_alt_nm1) return doRslt_dlv_id_alt_nm1_VC(info);
		if (vc == columnRslt_dlv_id_alt_nm2) return doRslt_dlv_id_alt_nm2_VC(info);
		if (vc == columnRslt_dlv_id_alt_nm3) return doRslt_dlv_id_alt_nm3_VC(info);
		if (vc == columnRslt_dlv_id_alt_nm4) return doRslt_dlv_id_alt_nm4_VC(info);
		if (vc == columnRslt_dlv_sundry_flg) return doRslt_dlv_sundry_flg_VC(info);
		if (vc == columnRslt_site_cd) return doRslt_site_cd_VC(info);
		if (vc == columnRslt_site_nm) return doRslt_site_nm_VC(info);
		if (vc == columnRslt_lg_grp_cd) return doRslt_lg_grp_cd_VC(info);
		if (vc == columnRslt_lg_grp_nm) return doRslt_lg_grp_nm_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_str_ln_tgt_flg) return doRslt_str_ln_tgt_flg_VC(info);
		if (vc == RsltHdr_dlv_id_cd) return doRsltHdr_dlv_id_cd_VC(info);
		if (vc == RsltHdr_dlv_id_nm) return doRsltHdr_dlv_id_nm_VC(info);
		if (vc == RsltHdr_dlv_sundry_flg) return doRsltHdr_dlv_sundry_flg_VC(info);
		if (vc == RsltHdr_pri_prnt_flg) return doRsltHdr_pri_prnt_flg_VC(info);
		if (vc == RsltHdr_zip_cd) return doRsltHdr_zip_cd_VC(info);
		if (vc == RsltHdr_addr1) return doRsltHdr_addr1_VC(info);
		if (vc == RsltHdr_addr2) return doRsltHdr_addr2_VC(info);
		if (vc == RsltHdr_addr3) return doRsltHdr_addr3_VC(info);
		if (vc == RsltHdr_addr4) return doRsltHdr_addr4_VC(info);
		if (vc == RsltHdr_tel) return doRsltHdr_tel_VC(info);
		if (vc == RsltHdr_fax) return doRsltHdr_fax_VC(info);
		if (vc == RsltHdr_cntry_cd) return doRsltHdr_cntry_cd_VC(info);
		if (vc == RsltHdr_cntry_nm) return doRsltHdr_cntry_nm_VC(info);
		if (vc == RsltHdr_dlv_cntct_dpt) return doRsltHdr_dlv_cntct_dpt_VC(info);
		if (vc == RsltHdr_dlv_cntct_psn) return doRsltHdr_dlv_cntct_psn_VC(info);
		return true;
	}

	/**
	 * [Rslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[base_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_base_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_alt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[match_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_match_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_alt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_sundry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_sundry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[dlv_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_dlv_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[dlv_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_dlv_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[dlv_sundry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_dlv_sundry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[pri_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_pri_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[fax]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_fax_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_dlv_cntct_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_dlv_cntct_psn_VC(MCEventInfo info){
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
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_dlv_id_typ) doCnd_dlv_id_typ_NC(info);
		else if (nc == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_NC(info);
		else if (nc == Cnd_base_dt) doCnd_base_dt_NC(info);
		else if (nc == Cnd_dlv_id_cd) doCnd_dlv_id_cd_NC(info);
		else if (nc == Cnd_dlv_id_nm) doCnd_dlv_id_nm_NC(info);
		else if (nc == Cnd_dlv_id_alt_nm1) doCnd_dlv_id_alt_nm1_NC(info);
		else if (nc == Cnd_dlv_id_alt_nm2) doCnd_dlv_id_alt_nm2_NC(info);
		else if (nc == Cnd_dlv_id_alt_nm3) doCnd_dlv_id_alt_nm3_NC(info);
		else if (nc == Cnd_dlv_id_alt_nm4) doCnd_dlv_id_alt_nm4_NC(info);
		else if (nc == Cnd_match_typ_Group) doCnd_match_typ_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_NC(info);
		else if (nc == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_NC(info);
		else if (nc == columnRslt_dlv_id_alt_nm1) doRslt_dlv_id_alt_nm1_NC(info);
		else if (nc == columnRslt_dlv_id_alt_nm2) doRslt_dlv_id_alt_nm2_NC(info);
		else if (nc == columnRslt_dlv_id_alt_nm3) doRslt_dlv_id_alt_nm3_NC(info);
		else if (nc == columnRslt_dlv_id_alt_nm4) doRslt_dlv_id_alt_nm4_NC(info);
		else if (nc == columnRslt_dlv_sundry_flg) doRslt_dlv_sundry_flg_NC(info);
		else if (nc == columnRslt_site_cd) doRslt_site_cd_NC(info);
		else if (nc == columnRslt_site_nm) doRslt_site_nm_NC(info);
		else if (nc == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NC(info);
		else if (nc == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_str_ln_tgt_flg) doRslt_str_ln_tgt_flg_NC(info);
		else if (nc == RsltHdr_dlv_id_cd) doRsltHdr_dlv_id_cd_NC(info);
		else if (nc == RsltHdr_dlv_id_nm) doRsltHdr_dlv_id_nm_NC(info);
		else if (nc == RsltHdr_dlv_sundry_flg) doRsltHdr_dlv_sundry_flg_NC(info);
		else if (nc == RsltHdr_pri_prnt_flg) doRsltHdr_pri_prnt_flg_NC(info);
		else if (nc == RsltHdr_zip_cd) doRsltHdr_zip_cd_NC(info);
		else if (nc == RsltHdr_addr1) doRsltHdr_addr1_NC(info);
		else if (nc == RsltHdr_addr2) doRsltHdr_addr2_NC(info);
		else if (nc == RsltHdr_addr3) doRsltHdr_addr3_NC(info);
		else if (nc == RsltHdr_addr4) doRsltHdr_addr4_NC(info);
		else if (nc == RsltHdr_tel) doRsltHdr_tel_NC(info);
		else if (nc == RsltHdr_fax) doRsltHdr_fax_NC(info);
		else if (nc == RsltHdr_cntry_cd) doRsltHdr_cntry_cd_NC(info);
		else if (nc == RsltHdr_cntry_nm) doRsltHdr_cntry_nm_NC(info);
		else if (nc == RsltHdr_dlv_cntct_dpt) doRsltHdr_dlv_cntct_dpt_NC(info);
		else if (nc == RsltHdr_dlv_cntct_psn) doRsltHdr_dlv_cntct_psn_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[match_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_match_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_sundry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_sundry_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_sundry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_sundry_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[pri_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_pri_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr1_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr2_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr3_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr4_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_tel_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[fax]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_fax_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_cntct_dpt_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_cntct_psn_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_dlv_id_typ) doCnd_dlv_id_typ_NE(info);
		else if (ne == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_NE(info);
		else if (ne == Cnd_base_dt) doCnd_base_dt_NE(info);
		else if (ne == Cnd_dlv_id_cd) doCnd_dlv_id_cd_NE(info);
		else if (ne == Cnd_dlv_id_nm) doCnd_dlv_id_nm_NE(info);
		else if (ne == Cnd_dlv_id_alt_nm1) doCnd_dlv_id_alt_nm1_NE(info);
		else if (ne == Cnd_dlv_id_alt_nm2) doCnd_dlv_id_alt_nm2_NE(info);
		else if (ne == Cnd_dlv_id_alt_nm3) doCnd_dlv_id_alt_nm3_NE(info);
		else if (ne == Cnd_dlv_id_alt_nm4) doCnd_dlv_id_alt_nm4_NE(info);
		else if (ne == Cnd_match_typ_Group) doCnd_match_typ_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_NE(info);
		else if (ne == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_NE(info);
		else if (ne == columnRslt_dlv_id_alt_nm1) doRslt_dlv_id_alt_nm1_NE(info);
		else if (ne == columnRslt_dlv_id_alt_nm2) doRslt_dlv_id_alt_nm2_NE(info);
		else if (ne == columnRslt_dlv_id_alt_nm3) doRslt_dlv_id_alt_nm3_NE(info);
		else if (ne == columnRslt_dlv_id_alt_nm4) doRslt_dlv_id_alt_nm4_NE(info);
		else if (ne == columnRslt_dlv_sundry_flg) doRslt_dlv_sundry_flg_NE(info);
		else if (ne == columnRslt_site_cd) doRslt_site_cd_NE(info);
		else if (ne == columnRslt_site_nm) doRslt_site_nm_NE(info);
		else if (ne == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NE(info);
		else if (ne == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_str_ln_tgt_flg) doRslt_str_ln_tgt_flg_NE(info);
		else if (ne == RsltHdr_dlv_id_cd) doRsltHdr_dlv_id_cd_NE(info);
		else if (ne == RsltHdr_dlv_id_nm) doRsltHdr_dlv_id_nm_NE(info);
		else if (ne == RsltHdr_dlv_sundry_flg) doRsltHdr_dlv_sundry_flg_NE(info);
		else if (ne == RsltHdr_pri_prnt_flg) doRsltHdr_pri_prnt_flg_NE(info);
		else if (ne == RsltHdr_zip_cd) doRsltHdr_zip_cd_NE(info);
		else if (ne == RsltHdr_addr1) doRsltHdr_addr1_NE(info);
		else if (ne == RsltHdr_addr2) doRsltHdr_addr2_NE(info);
		else if (ne == RsltHdr_addr3) doRsltHdr_addr3_NE(info);
		else if (ne == RsltHdr_addr4) doRsltHdr_addr4_NE(info);
		else if (ne == RsltHdr_tel) doRsltHdr_tel_NE(info);
		else if (ne == RsltHdr_fax) doRsltHdr_fax_NE(info);
		else if (ne == RsltHdr_cntry_cd) doRsltHdr_cntry_cd_NE(info);
		else if (ne == RsltHdr_cntry_nm) doRsltHdr_cntry_nm_NE(info);
		else if (ne == RsltHdr_dlv_cntct_dpt) doRsltHdr_dlv_cntct_dpt_NE(info);
		else if (ne == RsltHdr_dlv_cntct_psn) doRsltHdr_dlv_cntct_psn_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[match_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_match_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_sundry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_sundry_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_sundry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_sundry_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[pri_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_pri_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr1_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr2_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr3_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr4_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_tel_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[fax]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_fax_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_cntct_dpt_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_cntct_psn_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_dlv_id_typ) doCnd_dlv_id_typ_NX(info);
		else if (nx == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_NX(info);
		else if (nx == Cnd_base_dt) doCnd_base_dt_NX(info);
		else if (nx == Cnd_dlv_id_cd) doCnd_dlv_id_cd_NX(info);
		else if (nx == Cnd_dlv_id_nm) doCnd_dlv_id_nm_NX(info);
		else if (nx == Cnd_dlv_id_alt_nm1) doCnd_dlv_id_alt_nm1_NX(info);
		else if (nx == Cnd_dlv_id_alt_nm2) doCnd_dlv_id_alt_nm2_NX(info);
		else if (nx == Cnd_dlv_id_alt_nm3) doCnd_dlv_id_alt_nm3_NX(info);
		else if (nx == Cnd_dlv_id_alt_nm4) doCnd_dlv_id_alt_nm4_NX(info);
		else if (nx == Cnd_match_typ_Group) doCnd_match_typ_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_NX(info);
		else if (nx == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_NX(info);
		else if (nx == columnRslt_dlv_id_alt_nm1) doRslt_dlv_id_alt_nm1_NX(info);
		else if (nx == columnRslt_dlv_id_alt_nm2) doRslt_dlv_id_alt_nm2_NX(info);
		else if (nx == columnRslt_dlv_id_alt_nm3) doRslt_dlv_id_alt_nm3_NX(info);
		else if (nx == columnRslt_dlv_id_alt_nm4) doRslt_dlv_id_alt_nm4_NX(info);
		else if (nx == columnRslt_dlv_sundry_flg) doRslt_dlv_sundry_flg_NX(info);
		else if (nx == columnRslt_site_cd) doRslt_site_cd_NX(info);
		else if (nx == columnRslt_site_nm) doRslt_site_nm_NX(info);
		else if (nx == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NX(info);
		else if (nx == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_str_ln_tgt_flg) doRslt_str_ln_tgt_flg_NX(info);
		else if (nx == RsltHdr_dlv_id_cd) doRsltHdr_dlv_id_cd_NX(info);
		else if (nx == RsltHdr_dlv_id_nm) doRsltHdr_dlv_id_nm_NX(info);
		else if (nx == RsltHdr_dlv_sundry_flg) doRsltHdr_dlv_sundry_flg_NX(info);
		else if (nx == RsltHdr_pri_prnt_flg) doRsltHdr_pri_prnt_flg_NX(info);
		else if (nx == RsltHdr_zip_cd) doRsltHdr_zip_cd_NX(info);
		else if (nx == RsltHdr_addr1) doRsltHdr_addr1_NX(info);
		else if (nx == RsltHdr_addr2) doRsltHdr_addr2_NX(info);
		else if (nx == RsltHdr_addr3) doRsltHdr_addr3_NX(info);
		else if (nx == RsltHdr_addr4) doRsltHdr_addr4_NX(info);
		else if (nx == RsltHdr_tel) doRsltHdr_tel_NX(info);
		else if (nx == RsltHdr_fax) doRsltHdr_fax_NX(info);
		else if (nx == RsltHdr_cntry_cd) doRsltHdr_cntry_cd_NX(info);
		else if (nx == RsltHdr_cntry_nm) doRsltHdr_cntry_nm_NX(info);
		else if (nx == RsltHdr_dlv_cntct_dpt) doRsltHdr_dlv_cntct_dpt_NX(info);
		else if (nx == RsltHdr_dlv_cntct_psn) doRsltHdr_dlv_cntct_psn_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[match_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_match_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_sundry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_sundry_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_sundry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_sundry_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[pri_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_pri_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr1_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr2_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr3_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr4_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_tel_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[fax]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_fax_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_cntct_dpt_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_cntct_psn_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_dlv_id_typ) doCnd_dlv_id_typ_LC(info);
		else if (lc == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_LC(info);
		else if (lc == Cnd_base_dt) doCnd_base_dt_LC(info);
		else if (lc == Cnd_dlv_id_cd) doCnd_dlv_id_cd_LC(info);
		else if (lc == Cnd_dlv_id_nm) doCnd_dlv_id_nm_LC(info);
		else if (lc == Cnd_dlv_id_alt_nm1) doCnd_dlv_id_alt_nm1_LC(info);
		else if (lc == Cnd_dlv_id_alt_nm2) doCnd_dlv_id_alt_nm2_LC(info);
		else if (lc == Cnd_dlv_id_alt_nm3) doCnd_dlv_id_alt_nm3_LC(info);
		else if (lc == Cnd_dlv_id_alt_nm4) doCnd_dlv_id_alt_nm4_LC(info);
		else if (lc == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_LC(info);
		else if (lc == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_LC(info);
		else if (lc == columnRslt_dlv_id_alt_nm1) doRslt_dlv_id_alt_nm1_LC(info);
		else if (lc == columnRslt_dlv_id_alt_nm2) doRslt_dlv_id_alt_nm2_LC(info);
		else if (lc == columnRslt_dlv_id_alt_nm3) doRslt_dlv_id_alt_nm3_LC(info);
		else if (lc == columnRslt_dlv_id_alt_nm4) doRslt_dlv_id_alt_nm4_LC(info);
		else if (lc == columnRslt_site_cd) doRslt_site_cd_LC(info);
		else if (lc == columnRslt_site_nm) doRslt_site_nm_LC(info);
		else if (lc == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_LC(info);
		else if (lc == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == RsltHdr_dlv_id_cd) doRsltHdr_dlv_id_cd_LC(info);
		else if (lc == RsltHdr_dlv_id_nm) doRsltHdr_dlv_id_nm_LC(info);
		else if (lc == RsltHdr_zip_cd) doRsltHdr_zip_cd_LC(info);
		else if (lc == RsltHdr_addr1) doRsltHdr_addr1_LC(info);
		else if (lc == RsltHdr_addr2) doRsltHdr_addr2_LC(info);
		else if (lc == RsltHdr_addr3) doRsltHdr_addr3_LC(info);
		else if (lc == RsltHdr_addr4) doRsltHdr_addr4_LC(info);
		else if (lc == RsltHdr_tel) doRsltHdr_tel_LC(info);
		else if (lc == RsltHdr_fax) doRsltHdr_fax_LC(info);
		else if (lc == RsltHdr_cntry_cd) doRsltHdr_cntry_cd_LC(info);
		else if (lc == RsltHdr_cntry_nm) doRsltHdr_cntry_nm_LC(info);
		else if (lc == RsltHdr_dlv_cntct_dpt) doRsltHdr_dlv_cntct_dpt_LC(info);
		else if (lc == RsltHdr_dlv_cntct_psn) doRsltHdr_dlv_cntct_psn_LC(info);
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_dt_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr1_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr2_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr3_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr4_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_tel_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[fax]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_fax_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_cntct_dpt_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_cntct_psn_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_id_typ]の作成メソッド
	 */
	public MCList getCnd_dlv_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getDlvIdTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}