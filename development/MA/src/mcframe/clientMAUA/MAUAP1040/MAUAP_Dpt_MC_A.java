package mcframe.clientMAUA.MAUAP1040;

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
 * 画面"MAUAP_Dpt"パネルクラスです。<p>
 *
 * 部門の検索を行う<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUAP_Dpt_MC_A extends mcframe.clientMAUD.MAUDP0020.MAUDP_ISPanel{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MAUA";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MAUAP1040";

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
	public MCLabel Cnd_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_nm = null;
	public MCLabel Cnd_dt_Label = null;
	/**
	 * Application date 適用日.<p>
	 *
	 */
	public MCDateField Cnd_dt = null;
	/**
	 * DAC (Search) flg. ＤＡＣ（検索）ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_rd_flg = null;
	/**
	 * DAC (Update) flg. ＤＡＣ（更新）ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_wr_flg = null;
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
	public MCLabel Cnd_dpt_lvl_cd_Label = null;
	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_dpt_lvl_cd = null;
	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_lvl_nm = null;
	public MCLabel Cnd_up_lv_dpt_cd_Label = null;
	/**
	 * Upper dept. cd. 上位部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_up_lv_dpt_cd = null;
	/**
	 * Upper dept. name 上位部門名.<p>
	 *
	 */
	public MCTextField Cnd_up_lv_dpt_nm = null;
	public MCLabel Cnd_new_dpt_cd_Label = null;
	/**
	 * New dept. cd. 新部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_new_dpt_cd = null;
	/**
	 * AR dept. flg. 債権部門ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_ar_dpt_flg = null;
	/**
	 * AP dept. flg. 債務部門ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_ap_dpt_flg = null;
	/**
	 * Sales dept. flg. 営業部門ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_dpt_flg = null;
	/**
	 * Purchasing dept. flg. 購買部門ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_purc_dpt_flg = null;
	/**
	 * Asset management dept. flg. 資産管理部門ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_asst_dpt_flg = null;
	/**
	 * Shipping dept. flg. 出荷部門ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_ship_dpt_flg = null;
	/**
	 * Receipt dept. flg. 入荷部門ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_arr_dpt_flg = null;
	/**
	 * Mfg. dept. flg. 製造部門ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_mfg_dpt_flg = null;
	/**
	 * Inspection dept. flg. 検査部門ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_insp_dpt_flg = null;
	/**
	 * Charged dept. flg. 負担部門ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_bd_dpt_flg = null;
	/**
	 * Demand and supply dept. flg. 需給部門ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_sd_dpt_flg = null;
	/**
	 * Non business dept. flg. 業務対象外部門ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_non_biz_dpt_flg = null;
	public MCLabel Cnd_memo1_Label = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCTextField Cnd_memo1 = null;
	public MCLabel Cnd_memo2_Label = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCTextField Cnd_memo2 = null;
	public MCLabel Cnd_memo3_Label = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCTextField Cnd_memo3 = null;
	public MCLabel Cnd_dpt_is_srch_typ_nm_Label = null;
	/**
	 * Search type 検索区分.<p>
	 *
	 */
	public MCTextField Cnd_dpt_is_srch_typ_nm = null;
	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public MCButtonGroup Cnd_match_typ_Group = null;
	public MCRadioButton Cnd_match_typ_0 = null;
	public MCRadioButton Cnd_match_typ_1 = null;
	public MCRadioButton Cnd_match_typ_2 = null;
	public MCRadioButton Cnd_match_typ_3 = null;
	// [SrchBtn1]ブロック関連のField定義
	public MCPanel SrchBtn1Panel = null;
	// [SrchBtn1]ブロックの項目のField定義
	// [SrchBtn2]ブロック関連のField定義
	public MCPanel SrchBtn2Panel = null;
	// [SrchBtn2]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMAUA.MAUAP1040.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_nm = null;
	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_lvl_cd = null;
	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_lvl_nm = null;
	/**
	 * Upper dept. cd. 上位部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_up_lv_dpt_cd = null;
	/**
	 * Upper dept. name 上位部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_up_lv_dpt_nm = null;
	/**
	 * New dept. cd. 新部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_new_dpt_cd = null;
	/**
	 * AR dept. flg. 債権部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_dpt_flg = null;
	/**
	 * AP dept. flg. 債務部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_dpt_flg = null;
	/**
	 * Sales dept. flg. 営業部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_dpt_flg = null;
	/**
	 * Purchasing dept. flg. 購買部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_dpt_flg = null;
	/**
	 * Asset management dept. flg. 資産管理部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asst_dpt_flg = null;
	/**
	 * Shipping dept. flg. 出荷部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_dpt_flg = null;
	/**
	 * Receipt dept. flg. 入荷部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_dpt_flg = null;
	/**
	 * Mfg. dept. flg. 製造部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_dpt_flg = null;
	/**
	 * Inspection dept. flg. 検査部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_dpt_flg = null;
	/**
	 * Charged dept. flg. 負担部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_dpt_flg = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo3 = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
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
	private final mcframe.clientMAUA.MAUAP1040.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUA.MAUAP1040.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMAUA.MAUAP1040.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMAUA.MAUAP1040.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMAUA.MAUAP1040.CndR createCndR() {
		return mcframe.clientMAUA.MAUAP1040.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMAUA.MAUAP1040.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMAUA.MAUAP1040.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMAUA.MAUAP1040.RsltR createRsltR() {
		return mcframe.clientMAUA.MAUAP1040.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMAUA.MAUAP1040.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMAUA.MAUAP1040.RsltR.class);
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
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
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
		ret.add(SrchBtn1Panel);
		ret.add(SrchBtn2Panel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUAP_Dpt_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUAP_Dpt_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUAP_Dpt_MC.jbCreateTop((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.jbCreateCnd((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.jbCreateSrchBtn1((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.jbCreateSrchBtn2((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.jbCreateCtrl((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.jbCreateRslt((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.jbCreateBtn((MAUAP_Dpt)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MAUAP_Dpt p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MAUAP_Dpt p) {
	}

	/**
	 * [SrchBtn1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn1(MAUAP_Dpt p) {
	}

	/**
	 * [SrchBtn2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn2(MAUAP_Dpt p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MAUAP_Dpt p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MAUAP_Dpt p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MAUAP_Dpt p) {
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
	
	
	/** [Cnd_dpt_lvl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dpt_lvl_cd_p = null;

	/**
	 * [Cnd_dpt_lvl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dpt_lvl_cd_ListPutter() {
		if (Cnd_dpt_lvl_cd_p == null) {
			Cnd_dpt_lvl_cd_p = createCnd_dpt_lvl_cd_ListPutter(Cnd_dpt_lvl_cd, "dpt_lvl_cd", "dpt_lvl_nm");

		}
		return Cnd_dpt_lvl_cd_p;
	}
	
	
	/** [Cnd_up_lv_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_up_lv_dpt_cd_p = null;

	/**
	 * [Cnd_up_lv_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_up_lv_dpt_cd_ListPutter() {
		if (Cnd_up_lv_dpt_cd_p == null) {
			Cnd_up_lv_dpt_cd_p = createCnd_up_lv_dpt_cd_ListPutter(Cnd_up_lv_dpt_cd, "up_lv_dpt_cd", "up_lv_dpt_nm");

		}
		return Cnd_up_lv_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUAP_Dpt create(){
		MAUAP_Dpt p = new MAUAP_Dpt();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUAP_Dpt create(String name){
		MAUAP_Dpt p = new MAUAP_Dpt(name);
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
		MAUAP_Dpt_MC.jbfInitTop((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.jbfInitCnd((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.jbfInitSrchBtn1((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.jbfInitSrchBtn2((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.jbfInitCtrl((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.jbfInitRslt((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.jbfInitBtn((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.jbInitTop((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.jbInitCnd((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.jbInitSrchBtn1((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.jbInitSrchBtn2((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.jbInitCtrl((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.jbInitRslt((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.jbInitBtn((MAUAP_Dpt)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MAUAP_Dpt p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MAUAP_Dpt p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.dpt_cd_Label");
		p.Cnd_dpt_cd = p.beansFactory.createTextField("Cnd.dpt_cd");
		p.Cnd_dpt_cd.setLabel(p.Cnd_dpt_cd_Label);
		p.Cnd_dpt_nm = p.beansFactory.createTextField("Cnd.dpt_nm");
		p.Cnd_dt_Label = p.beansFactory.createLabel("Cnd.dt_Label");
		p.Cnd_dt = p.beansFactory.createDateField("Cnd.dt");
		p.Cnd_dt.setLabel(p.Cnd_dt_Label);
		p.Cnd_rd_flg = p.beansFactory.createCheckBox("Cnd.rd_flg");
		p.Cnd_wr_flg = p.beansFactory.createCheckBox("Cnd.wr_flg");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_dpt_lvl_cd_Label = p.beansFactory.createLabel("Cnd.dpt_lvl_cd_Label");
		p.Cnd_dpt_lvl_cd = p.beansFactory.createTextComboBox("Cnd.dpt_lvl_cd");
		p.Cnd_dpt_lvl_cd.setLabel(p.Cnd_dpt_lvl_cd_Label);
		p.Cnd_dpt_lvl_nm = p.beansFactory.createTextField("Cnd.dpt_lvl_nm");
		p.Cnd_up_lv_dpt_cd_Label = p.beansFactory.createLabel("Cnd.up_lv_dpt_cd_Label");
		p.Cnd_up_lv_dpt_cd = p.beansFactory.createTextComboBox("Cnd.up_lv_dpt_cd");
		p.Cnd_up_lv_dpt_cd.setLabel(p.Cnd_up_lv_dpt_cd_Label);
		p.Cnd_up_lv_dpt_nm = p.beansFactory.createTextField("Cnd.up_lv_dpt_nm");
		p.Cnd_new_dpt_cd_Label = p.beansFactory.createLabel("Cnd.new_dpt_cd_Label");
		p.Cnd_new_dpt_cd = p.beansFactory.createTextField("Cnd.new_dpt_cd");
		p.Cnd_new_dpt_cd.setLabel(p.Cnd_new_dpt_cd_Label);
		p.Cnd_ar_dpt_flg = p.beansFactory.createCheckBox("Cnd.ar_dpt_flg");
		p.Cnd_ap_dpt_flg = p.beansFactory.createCheckBox("Cnd.ap_dpt_flg");
		p.Cnd_sls_dpt_flg = p.beansFactory.createCheckBox("Cnd.sls_dpt_flg");
		p.Cnd_purc_dpt_flg = p.beansFactory.createCheckBox("Cnd.purc_dpt_flg");
		p.Cnd_asst_dpt_flg = p.beansFactory.createCheckBox("Cnd.asst_dpt_flg");
		p.Cnd_ship_dpt_flg = p.beansFactory.createCheckBox("Cnd.ship_dpt_flg");
		p.Cnd_arr_dpt_flg = p.beansFactory.createCheckBox("Cnd.arr_dpt_flg");
		p.Cnd_mfg_dpt_flg = p.beansFactory.createCheckBox("Cnd.mfg_dpt_flg");
		p.Cnd_insp_dpt_flg = p.beansFactory.createCheckBox("Cnd.insp_dpt_flg");
		p.Cnd_bd_dpt_flg = p.beansFactory.createCheckBox("Cnd.bd_dpt_flg");
		p.Cnd_sd_dpt_flg = p.beansFactory.createCheckBox("Cnd.sd_dpt_flg");
		p.Cnd_non_biz_dpt_flg = p.beansFactory.createCheckBox("Cnd.non_biz_dpt_flg");
		p.Cnd_memo1_Label = p.beansFactory.createLabel("Cnd.memo1_Label");
		p.Cnd_memo1 = p.beansFactory.createTextField("Cnd.memo1");
		p.Cnd_memo1.setLabel(p.Cnd_memo1_Label);
		p.Cnd_memo2_Label = p.beansFactory.createLabel("Cnd.memo2_Label");
		p.Cnd_memo2 = p.beansFactory.createTextField("Cnd.memo2");
		p.Cnd_memo2.setLabel(p.Cnd_memo2_Label);
		p.Cnd_memo3_Label = p.beansFactory.createLabel("Cnd.memo3_Label");
		p.Cnd_memo3 = p.beansFactory.createTextField("Cnd.memo3");
		p.Cnd_memo3.setLabel(p.Cnd_memo3_Label);
		p.Cnd_dpt_is_srch_typ_nm_Label = p.beansFactory.createLabel("Cnd.dpt_is_srch_typ_nm_Label");
		p.Cnd_dpt_is_srch_typ_nm = p.beansFactory.createTextField("Cnd.dpt_is_srch_typ_nm");
		p.Cnd_dpt_is_srch_typ_nm.setLabel(p.Cnd_dpt_is_srch_typ_nm_Label);
		p.Cnd_match_typ_Group = p.beansFactory.createButtonGroup("Cnd.match_typ");
		p.Cnd_match_typ_0 = p.beansFactory.createRadioButton("Cnd.match_typ_0");
		p.Cnd_match_typ_1 = p.beansFactory.createRadioButton("Cnd.match_typ_1");
		p.Cnd_match_typ_2 = p.beansFactory.createRadioButton("Cnd.match_typ_2");
		p.Cnd_match_typ_3 = p.beansFactory.createRadioButton("Cnd.match_typ_3");
	}

	/**
	 * [SrchBtn1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn1(MAUAP_Dpt p) {
		// ブロック関連の初期化
		p.SrchBtn1Panel = p.beansFactory.createPanel("SrchBtn1");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchBtn2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn2(MAUAP_Dpt p) {
		// ブロック関連の初期化
		p.SrchBtn2Panel = p.beansFactory.createPanel("SrchBtn2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MAUAP_Dpt p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MAUAP_Dpt p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_dpt_cd = p.beansFactory.createTableColumn("Rslt.dpt_cd", MCColumnType.TEXT);
		p.columnRslt_dpt_nm = p.beansFactory.createTableColumn("Rslt.dpt_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_dpt_lvl_cd = p.beansFactory.createTableColumn("Rslt.dpt_lvl_cd", MCColumnType.TEXT);
		p.columnRslt_dpt_lvl_nm = p.beansFactory.createTableColumn("Rslt.dpt_lvl_nm", MCColumnType.TEXT);
		p.columnRslt_up_lv_dpt_cd = p.beansFactory.createTableColumn("Rslt.up_lv_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_up_lv_dpt_nm = p.beansFactory.createTableColumn("Rslt.up_lv_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_new_dpt_cd = p.beansFactory.createTableColumn("Rslt.new_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_ar_dpt_flg = p.beansFactory.createTableColumn("Rslt.ar_dpt_flg", MCColumnType.CHECK);
		p.columnRslt_ap_dpt_flg = p.beansFactory.createTableColumn("Rslt.ap_dpt_flg", MCColumnType.CHECK);
		p.columnRslt_sls_dpt_flg = p.beansFactory.createTableColumn("Rslt.sls_dpt_flg", MCColumnType.CHECK);
		p.columnRslt_purc_dpt_flg = p.beansFactory.createTableColumn("Rslt.purc_dpt_flg", MCColumnType.CHECK);
		p.columnRslt_asst_dpt_flg = p.beansFactory.createTableColumn("Rslt.asst_dpt_flg", MCColumnType.CHECK);
		p.columnRslt_ship_dpt_flg = p.beansFactory.createTableColumn("Rslt.ship_dpt_flg", MCColumnType.CHECK);
		p.columnRslt_arr_dpt_flg = p.beansFactory.createTableColumn("Rslt.arr_dpt_flg", MCColumnType.CHECK);
		p.columnRslt_mfg_dpt_flg = p.beansFactory.createTableColumn("Rslt.mfg_dpt_flg", MCColumnType.CHECK);
		p.columnRslt_insp_dpt_flg = p.beansFactory.createTableColumn("Rslt.insp_dpt_flg", MCColumnType.CHECK);
		p.columnRslt_bd_dpt_flg = p.beansFactory.createTableColumn("Rslt.bd_dpt_flg", MCColumnType.CHECK);
		p.columnRslt_memo1 = p.beansFactory.createTableColumn("Rslt.memo1", MCColumnType.TEXT);
		p.columnRslt_memo2 = p.beansFactory.createTableColumn("Rslt.memo2", MCColumnType.TEXT);
		p.columnRslt_memo3 = p.beansFactory.createTableColumn("Rslt.memo3", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MAUAP_Dpt p) {
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
	protected static void jbInitTop(MAUAP_Dpt p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.CndPanel, null);
		p.TopPanel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.SrchBtn1Panel);
		p.TopPanel.add(p.SrchBtn1Panel, null);
		p.SrchBtn1Panel.setNextBeans(p.SrchBtn2Panel);
		p.TopPanel.add(p.SrchBtn2Panel, null);
		p.SrchBtn2Panel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MAUAP_Dpt p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_cd);
		p.CndPanel.setLastBeans(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.dpt_cd_META);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.CndPanel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_dt);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
		p.CndPanel.add(p.Cnd_dt_Label);
		p.CndPanel.add(p.Cnd_dt);
		p.Cnd_dt.setNextBeans(p.Cnd_rd_flg);
		p.Cnd_dt.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.dt_META);
		p.Cnd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rd_flg);
		p.Cnd_rd_flg.setNextBeans(p.Cnd_wr_flg);
		p.Cnd_rd_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.rd_flg_META);
		p.CndPanel.add(p.Cnd_wr_flg);
		p.Cnd_wr_flg.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_wr_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.wr_flg_META);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_dpt_lvl_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_dpt_lvl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_lvl_cd, true);
		p.Cnd_dpt_lvl_cd.setLinkBeans(p.Cnd_dpt_lvl_nm);
		p.CndPanel.add(p.Cnd_dpt_lvl_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_lvl_cd);
		p.Cnd_dpt_lvl_cd.setNextBeans(p.Cnd_dpt_lvl_nm);
		p.Cnd_dpt_lvl_cd.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.dpt_lvl_cd_META);
		p.CndPanel.add(p.Cnd_dpt_lvl_nm);
		p.Cnd_dpt_lvl_nm.setNextBeans(p.Cnd_up_lv_dpt_cd);
		p.Cnd_dpt_lvl_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.dpt_lvl_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_lvl_nm, true);
		p.Cnd_up_lv_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_up_lv_dpt_cd, true);
		p.Cnd_up_lv_dpt_cd.setLinkBeans(p.Cnd_up_lv_dpt_nm);
		p.CndPanel.add(p.Cnd_up_lv_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_up_lv_dpt_cd);
		p.Cnd_up_lv_dpt_cd.setNextBeans(p.Cnd_up_lv_dpt_nm);
		p.Cnd_up_lv_dpt_cd.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.up_lv_dpt_cd_META);
		p.CndPanel.add(p.Cnd_up_lv_dpt_nm);
		p.Cnd_up_lv_dpt_nm.setNextBeans(p.Cnd_new_dpt_cd);
		p.Cnd_up_lv_dpt_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.up_lv_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_up_lv_dpt_nm, true);
		p.CndPanel.add(p.Cnd_new_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_new_dpt_cd);
		p.Cnd_new_dpt_cd.setNextBeans(p.Cnd_ar_dpt_flg);
		p.Cnd_new_dpt_cd.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.new_dpt_cd_META);
		p.setPluralValueEnable(p.Cnd_new_dpt_cd, true);
		p.CndPanel.add(p.Cnd_ar_dpt_flg);
		p.Cnd_ar_dpt_flg.setNextBeans(p.Cnd_ap_dpt_flg);
		p.Cnd_ar_dpt_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.ar_dpt_flg_META);
		p.CndPanel.add(p.Cnd_ap_dpt_flg);
		p.Cnd_ap_dpt_flg.setNextBeans(p.Cnd_sls_dpt_flg);
		p.Cnd_ap_dpt_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.ap_dpt_flg_META);
		p.CndPanel.add(p.Cnd_sls_dpt_flg);
		p.Cnd_sls_dpt_flg.setNextBeans(p.Cnd_purc_dpt_flg);
		p.Cnd_sls_dpt_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.sls_dpt_flg_META);
		p.CndPanel.add(p.Cnd_purc_dpt_flg);
		p.Cnd_purc_dpt_flg.setNextBeans(p.Cnd_asst_dpt_flg);
		p.Cnd_purc_dpt_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.purc_dpt_flg_META);
		p.CndPanel.add(p.Cnd_asst_dpt_flg);
		p.Cnd_asst_dpt_flg.setNextBeans(p.Cnd_ship_dpt_flg);
		p.Cnd_asst_dpt_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.asst_dpt_flg_META);
		p.CndPanel.add(p.Cnd_ship_dpt_flg);
		p.Cnd_ship_dpt_flg.setNextBeans(p.Cnd_arr_dpt_flg);
		p.Cnd_ship_dpt_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.ship_dpt_flg_META);
		p.CndPanel.add(p.Cnd_arr_dpt_flg);
		p.Cnd_arr_dpt_flg.setNextBeans(p.Cnd_mfg_dpt_flg);
		p.Cnd_arr_dpt_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.arr_dpt_flg_META);
		p.CndPanel.add(p.Cnd_mfg_dpt_flg);
		p.Cnd_mfg_dpt_flg.setNextBeans(p.Cnd_insp_dpt_flg);
		p.Cnd_mfg_dpt_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.mfg_dpt_flg_META);
		p.CndPanel.add(p.Cnd_insp_dpt_flg);
		p.Cnd_insp_dpt_flg.setNextBeans(p.Cnd_bd_dpt_flg);
		p.Cnd_insp_dpt_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.insp_dpt_flg_META);
		p.CndPanel.add(p.Cnd_bd_dpt_flg);
		p.Cnd_bd_dpt_flg.setNextBeans(p.Cnd_sd_dpt_flg);
		p.Cnd_bd_dpt_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.bd_dpt_flg_META);
		p.CndPanel.add(p.Cnd_sd_dpt_flg);
		p.Cnd_sd_dpt_flg.setNextBeans(p.Cnd_non_biz_dpt_flg);
		p.Cnd_sd_dpt_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.sd_dpt_flg_META);
		p.CndPanel.add(p.Cnd_non_biz_dpt_flg);
		p.Cnd_non_biz_dpt_flg.setNextBeans(p.Cnd_memo1);
		p.Cnd_non_biz_dpt_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.non_biz_dpt_flg_META);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.SrchBtn1Panel.add(p.Cnd_dpt_is_srch_typ_nm_Label);
		p.SrchBtn1Panel.add(p.Cnd_dpt_is_srch_typ_nm);
		p.SrchBtn1Panel.setLastBeans(p.Cnd_dpt_is_srch_typ_nm);
		p.Cnd_dpt_is_srch_typ_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.dpt_is_srch_typ_nm_META);
		p.SrchBtn2Panel.setLastBeans(p.Cnd_match_typ_Group);
		p.Cnd_match_typ_Group.setFirstBeans(p.Cnd_match_typ_0);
		p.Cnd_match_typ_0.setActionCommand("0");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_0);
		p.SrchBtn2Panel.add(p.Cnd_match_typ_0);
		p.Cnd_match_typ_0.setNextBeans(p.Cnd_match_typ_1);
		p.Cnd_match_typ_1.setActionCommand("1");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_1);
		p.SrchBtn2Panel.add(p.Cnd_match_typ_1);
		p.Cnd_match_typ_1.setNextBeans(p.Cnd_match_typ_2);
		p.Cnd_match_typ_2.setActionCommand("2");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_2);
		p.SrchBtn2Panel.add(p.Cnd_match_typ_2);
		p.Cnd_match_typ_2.setNextBeans(p.Cnd_match_typ_3);
		p.Cnd_match_typ_3.setActionCommand("3");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_3);
		p.SrchBtn2Panel.add(p.Cnd_match_typ_3);
		p.Cnd_match_typ_Group.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1040.CndR.match_typ_META);
	}

	/**
	 * [SrchBtn1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn1(MAUAP_Dpt p) {
		// ブロック関連の初期化
		p.SrchBtn1Panel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchBtn2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn2(MAUAP_Dpt p) {
		// ブロック関連の初期化
		p.SrchBtn2Panel.setLayoutPosition("SEC");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MAUAP_Dpt p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SEE");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MAUAP_Dpt p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setValueCheck(false);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MAUAP_Dpt p) {
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
		MAUAP_Dpt_MC.mcInitTop((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.mcInitCnd((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.mcInitSrchBtn1((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.mcInitSrchBtn2((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.mcInitCtrl((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.mcInitRslt((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.mcInitBtn((MAUAP_Dpt)this);

		// [SRCH]ステータスのモードの設定
		MAUAP_Dpt_MC.statusInitSRCH_Top((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.statusInitSRCH_Cnd((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.statusInitSRCH_SrchBtn1((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.statusInitSRCH_SrchBtn2((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.statusInitSRCH_Ctrl((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.statusInitSRCH_Rslt((MAUAP_Dpt)this);
		MAUAP_Dpt_MC.statusInitSRCH_Btn((MAUAP_Dpt)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MAUAP_Dpt p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MAUAP_Dpt p) {
		p.Cnd_dpt_cd.setListListener(p);
		p.Cnd_dpt_cd.addAllListener(p);
		p.Cnd_dpt_nm.setListListener(p);
		p.Cnd_dpt_nm.addAllListener(p);
		p.Cnd_dt.setListListener(p);
		p.Cnd_dt.addAllListener(p);
		p.Cnd_rd_flg.addAllListener(p);
		p.Cnd_wr_flg.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_dpt_lvl_cd.setListListener(p);
		p.Cnd_dpt_lvl_cd.addAllListener(p);
		p.Cnd_dpt_lvl_nm.setListListener(p);
		p.Cnd_dpt_lvl_nm.addAllListener(p);
		p.Cnd_up_lv_dpt_cd.setListListener(p);
		p.Cnd_up_lv_dpt_cd.addAllListener(p);
		p.Cnd_up_lv_dpt_nm.setListListener(p);
		p.Cnd_up_lv_dpt_nm.addAllListener(p);
		p.Cnd_new_dpt_cd.setListListener(p);
		p.Cnd_new_dpt_cd.addAllListener(p);
		p.Cnd_ar_dpt_flg.addAllListener(p);
		p.Cnd_ap_dpt_flg.addAllListener(p);
		p.Cnd_sls_dpt_flg.addAllListener(p);
		p.Cnd_purc_dpt_flg.addAllListener(p);
		p.Cnd_asst_dpt_flg.addAllListener(p);
		p.Cnd_ship_dpt_flg.addAllListener(p);
		p.Cnd_arr_dpt_flg.addAllListener(p);
		p.Cnd_mfg_dpt_flg.addAllListener(p);
		p.Cnd_insp_dpt_flg.addAllListener(p);
		p.Cnd_bd_dpt_flg.addAllListener(p);
		p.Cnd_sd_dpt_flg.addAllListener(p);
		p.Cnd_non_biz_dpt_flg.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_dpt_is_srch_typ_nm.setListListener(p);
		p.Cnd_dpt_is_srch_typ_nm.addAllListener(p);
		p.Cnd_match_typ_Group.addAllListener(p);
		p.Cnd_match_typ_0.addAllListener(p);
		p.Cnd_match_typ_1.addAllListener(p);
		p.Cnd_match_typ_2.addAllListener(p);
		p.Cnd_match_typ_3.addAllListener(p);
	}

	/**
	 *  [SrchBtn1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn1(MAUAP_Dpt p) {
	}

	/**
	 *  [SrchBtn2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn2(MAUAP_Dpt p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MAUAP_Dpt p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MAUAP_Dpt p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_dpt_cd.addAllListener(p);
		p.columnRslt_dpt_cd.setListListener(p);
		p.columnRslt_dpt_nm.addAllListener(p);
		p.columnRslt_dpt_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_dpt_lvl_cd.addAllListener(p);
		p.columnRslt_dpt_lvl_cd.setListListener(p);
		p.columnRslt_dpt_lvl_nm.addAllListener(p);
		p.columnRslt_dpt_lvl_nm.setListListener(p);
		p.columnRslt_up_lv_dpt_cd.addAllListener(p);
		p.columnRslt_up_lv_dpt_cd.setListListener(p);
		p.columnRslt_up_lv_dpt_nm.addAllListener(p);
		p.columnRslt_up_lv_dpt_nm.setListListener(p);
		p.columnRslt_new_dpt_cd.addAllListener(p);
		p.columnRslt_new_dpt_cd.setListListener(p);
		p.columnRslt_ar_dpt_flg.addAllListener(p);
		p.columnRslt_ap_dpt_flg.addAllListener(p);
		p.columnRslt_sls_dpt_flg.addAllListener(p);
		p.columnRslt_purc_dpt_flg.addAllListener(p);
		p.columnRslt_asst_dpt_flg.addAllListener(p);
		p.columnRslt_ship_dpt_flg.addAllListener(p);
		p.columnRslt_arr_dpt_flg.addAllListener(p);
		p.columnRslt_mfg_dpt_flg.addAllListener(p);
		p.columnRslt_insp_dpt_flg.addAllListener(p);
		p.columnRslt_bd_dpt_flg.addAllListener(p);
		p.columnRslt_memo1.addAllListener(p);
		p.columnRslt_memo1.setListListener(p);
		p.columnRslt_memo2.addAllListener(p);
		p.columnRslt_memo2.setListListener(p);
		p.columnRslt_memo3.addAllListener(p);
		p.columnRslt_memo3.setListListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MAUAP_Dpt p) {
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
	protected static void statusInitSRCH_Top(MAUAP_Dpt p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MAUAP_Dpt p){
		p.Cnd_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dt.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rd_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_wr_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_lvl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_lvl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_up_lv_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_up_lv_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_new_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ar_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ap_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sls_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_purc_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_asst_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ship_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_arr_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_mfg_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_insp_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bd_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sd_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_non_biz_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_memo1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_is_srch_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_match_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[SrchBtn1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchBtn1(MAUAP_Dpt p){

	}

	/**
	 * [SRCH]ステータスの[SrchBtn2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchBtn2(MAUAP_Dpt p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MAUAP_Dpt p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MAUAP_Dpt p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnRslt_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dpt_lvl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dpt_lvl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_up_lv_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_up_lv_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_new_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_asst_dpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_dpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_arr_dpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_dpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_insp_dpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MAUAP_Dpt p){
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
		MAUAP_Dpt_MC.setTableConfigRslt((MAUAP_Dpt)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MAUAP_Dpt p) {
		p.columnRslt_check.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_dpt_cd.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_cd);
		p.columnRslt_dpt_nm.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_dpt_lvl_cd.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.dpt_lvl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_lvl_cd);
		p.columnRslt_dpt_lvl_nm.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.dpt_lvl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_lvl_nm);
		p.columnRslt_up_lv_dpt_cd.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.up_lv_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_up_lv_dpt_cd);
		p.columnRslt_up_lv_dpt_nm.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.up_lv_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_up_lv_dpt_nm);
		p.columnRslt_new_dpt_cd.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.new_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_new_dpt_cd);
		p.columnRslt_ar_dpt_flg.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.ar_dpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_dpt_flg);
		p.columnRslt_ap_dpt_flg.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.ap_dpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_dpt_flg);
		p.columnRslt_sls_dpt_flg.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.sls_dpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_dpt_flg);
		p.columnRslt_purc_dpt_flg.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.purc_dpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_dpt_flg);
		p.columnRslt_asst_dpt_flg.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.asst_dpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asst_dpt_flg);
		p.columnRslt_ship_dpt_flg.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.ship_dpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_dpt_flg);
		p.columnRslt_arr_dpt_flg.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.arr_dpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_dpt_flg);
		p.columnRslt_mfg_dpt_flg.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.mfg_dpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_dpt_flg);
		p.columnRslt_insp_dpt_flg.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.insp_dpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_dpt_flg);
		p.columnRslt_bd_dpt_flg.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.bd_dpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_dpt_flg);
		p.columnRslt_memo1.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.memo1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo1);
		p.columnRslt_memo2.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.memo2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo2);
		p.columnRslt_memo3.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.memo3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo3);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMAUA.MAUAP1040.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_dpt_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_dpt_lvl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dpt_lvl_cd.getListConfig().setPutter(getCnd_dpt_lvl_cd_ListPutter());
		Cnd_up_lv_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_up_lv_dpt_cd.getListConfig().setPutter(getCnd_up_lv_dpt_cd_ListPutter());
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
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Cnd_dpt_lvl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_lvl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DptLvl");
		return lp;
	}
	 
	/**
	 * [Cnd_up_lv_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_up_lv_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_dpt_lvl_cd) return getCnd_dpt_lvl_cd(row, info);
		if(combo == Cnd_up_lv_dpt_cd) return getCnd_up_lv_dpt_cd(row, info);
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
		if (vc == Cnd_dpt_cd) return doCnd_dpt_cd_VC(info);
		if (vc == Cnd_dpt_nm) return doCnd_dpt_nm_VC(info);
		if (vc == Cnd_dt) return doCnd_dt_VC(info);
		if (vc == Cnd_rd_flg) return doCnd_rd_flg_VC(info);
		if (vc == Cnd_wr_flg) return doCnd_wr_flg_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_dpt_lvl_cd) return doCnd_dpt_lvl_cd_VC(info);
		if (vc == Cnd_dpt_lvl_nm) return doCnd_dpt_lvl_nm_VC(info);
		if (vc == Cnd_up_lv_dpt_cd) return doCnd_up_lv_dpt_cd_VC(info);
		if (vc == Cnd_up_lv_dpt_nm) return doCnd_up_lv_dpt_nm_VC(info);
		if (vc == Cnd_new_dpt_cd) return doCnd_new_dpt_cd_VC(info);
		if (vc == Cnd_ar_dpt_flg) return doCnd_ar_dpt_flg_VC(info);
		if (vc == Cnd_ap_dpt_flg) return doCnd_ap_dpt_flg_VC(info);
		if (vc == Cnd_sls_dpt_flg) return doCnd_sls_dpt_flg_VC(info);
		if (vc == Cnd_purc_dpt_flg) return doCnd_purc_dpt_flg_VC(info);
		if (vc == Cnd_asst_dpt_flg) return doCnd_asst_dpt_flg_VC(info);
		if (vc == Cnd_ship_dpt_flg) return doCnd_ship_dpt_flg_VC(info);
		if (vc == Cnd_arr_dpt_flg) return doCnd_arr_dpt_flg_VC(info);
		if (vc == Cnd_mfg_dpt_flg) return doCnd_mfg_dpt_flg_VC(info);
		if (vc == Cnd_insp_dpt_flg) return doCnd_insp_dpt_flg_VC(info);
		if (vc == Cnd_bd_dpt_flg) return doCnd_bd_dpt_flg_VC(info);
		if (vc == Cnd_sd_dpt_flg) return doCnd_sd_dpt_flg_VC(info);
		if (vc == Cnd_non_biz_dpt_flg) return doCnd_non_biz_dpt_flg_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_dpt_is_srch_typ_nm) return doCnd_dpt_is_srch_typ_nm_VC(info);
		if (vc == Cnd_match_typ_Group) return doCnd_match_typ_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_dpt_cd) return doRslt_dpt_cd_VC(info);
		if (vc == columnRslt_dpt_nm) return doRslt_dpt_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_dpt_lvl_cd) return doRslt_dpt_lvl_cd_VC(info);
		if (vc == columnRslt_dpt_lvl_nm) return doRslt_dpt_lvl_nm_VC(info);
		if (vc == columnRslt_up_lv_dpt_cd) return doRslt_up_lv_dpt_cd_VC(info);
		if (vc == columnRslt_up_lv_dpt_nm) return doRslt_up_lv_dpt_nm_VC(info);
		if (vc == columnRslt_new_dpt_cd) return doRslt_new_dpt_cd_VC(info);
		if (vc == columnRslt_ar_dpt_flg) return doRslt_ar_dpt_flg_VC(info);
		if (vc == columnRslt_ap_dpt_flg) return doRslt_ap_dpt_flg_VC(info);
		if (vc == columnRslt_sls_dpt_flg) return doRslt_sls_dpt_flg_VC(info);
		if (vc == columnRslt_purc_dpt_flg) return doRslt_purc_dpt_flg_VC(info);
		if (vc == columnRslt_asst_dpt_flg) return doRslt_asst_dpt_flg_VC(info);
		if (vc == columnRslt_ship_dpt_flg) return doRslt_ship_dpt_flg_VC(info);
		if (vc == columnRslt_arr_dpt_flg) return doRslt_arr_dpt_flg_VC(info);
		if (vc == columnRslt_mfg_dpt_flg) return doRslt_mfg_dpt_flg_VC(info);
		if (vc == columnRslt_insp_dpt_flg) return doRslt_insp_dpt_flg_VC(info);
		if (vc == columnRslt_bd_dpt_flg) return doRslt_bd_dpt_flg_VC(info);
		if (vc == columnRslt_memo1) return doRslt_memo1_VC(info);
		if (vc == columnRslt_memo2) return doRslt_memo2_VC(info);
		if (vc == columnRslt_memo3) return doRslt_memo3_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
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
	 * [Cnd]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wr_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dpt_lvl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_lvl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_lvl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[up_lv_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_up_lv_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[up_lv_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_up_lv_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[new_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_new_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ar_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asst_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asst_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[arr_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_arr_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bd_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bd_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sd_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sd_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[non_biz_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_non_biz_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_is_srch_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_is_srch_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_lvl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_lvl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_lvl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_lvl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[up_lv_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_up_lv_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[up_lv_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_up_lv_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[new_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_new_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ar_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asst_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asst_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arr_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arr_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_ts_VC(MCEventInfo info){
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
		else if (nc == Cnd_dpt_cd) doCnd_dpt_cd_NC(info);
		else if (nc == Cnd_dpt_nm) doCnd_dpt_nm_NC(info);
		else if (nc == Cnd_dt) doCnd_dt_NC(info);
		else if (nc == Cnd_rd_flg) doCnd_rd_flg_NC(info);
		else if (nc == Cnd_wr_flg) doCnd_wr_flg_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_dpt_lvl_cd) doCnd_dpt_lvl_cd_NC(info);
		else if (nc == Cnd_dpt_lvl_nm) doCnd_dpt_lvl_nm_NC(info);
		else if (nc == Cnd_up_lv_dpt_cd) doCnd_up_lv_dpt_cd_NC(info);
		else if (nc == Cnd_up_lv_dpt_nm) doCnd_up_lv_dpt_nm_NC(info);
		else if (nc == Cnd_new_dpt_cd) doCnd_new_dpt_cd_NC(info);
		else if (nc == Cnd_ar_dpt_flg) doCnd_ar_dpt_flg_NC(info);
		else if (nc == Cnd_ap_dpt_flg) doCnd_ap_dpt_flg_NC(info);
		else if (nc == Cnd_sls_dpt_flg) doCnd_sls_dpt_flg_NC(info);
		else if (nc == Cnd_purc_dpt_flg) doCnd_purc_dpt_flg_NC(info);
		else if (nc == Cnd_asst_dpt_flg) doCnd_asst_dpt_flg_NC(info);
		else if (nc == Cnd_ship_dpt_flg) doCnd_ship_dpt_flg_NC(info);
		else if (nc == Cnd_arr_dpt_flg) doCnd_arr_dpt_flg_NC(info);
		else if (nc == Cnd_mfg_dpt_flg) doCnd_mfg_dpt_flg_NC(info);
		else if (nc == Cnd_insp_dpt_flg) doCnd_insp_dpt_flg_NC(info);
		else if (nc == Cnd_bd_dpt_flg) doCnd_bd_dpt_flg_NC(info);
		else if (nc == Cnd_sd_dpt_flg) doCnd_sd_dpt_flg_NC(info);
		else if (nc == Cnd_non_biz_dpt_flg) doCnd_non_biz_dpt_flg_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_dpt_is_srch_typ_nm) doCnd_dpt_is_srch_typ_nm_NC(info);
		else if (nc == Cnd_match_typ_Group) doCnd_match_typ_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_dpt_cd) doRslt_dpt_cd_NC(info);
		else if (nc == columnRslt_dpt_nm) doRslt_dpt_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_dpt_lvl_cd) doRslt_dpt_lvl_cd_NC(info);
		else if (nc == columnRslt_dpt_lvl_nm) doRslt_dpt_lvl_nm_NC(info);
		else if (nc == columnRslt_up_lv_dpt_cd) doRslt_up_lv_dpt_cd_NC(info);
		else if (nc == columnRslt_up_lv_dpt_nm) doRslt_up_lv_dpt_nm_NC(info);
		else if (nc == columnRslt_new_dpt_cd) doRslt_new_dpt_cd_NC(info);
		else if (nc == columnRslt_ar_dpt_flg) doRslt_ar_dpt_flg_NC(info);
		else if (nc == columnRslt_ap_dpt_flg) doRslt_ap_dpt_flg_NC(info);
		else if (nc == columnRslt_sls_dpt_flg) doRslt_sls_dpt_flg_NC(info);
		else if (nc == columnRslt_purc_dpt_flg) doRslt_purc_dpt_flg_NC(info);
		else if (nc == columnRslt_asst_dpt_flg) doRslt_asst_dpt_flg_NC(info);
		else if (nc == columnRslt_ship_dpt_flg) doRslt_ship_dpt_flg_NC(info);
		else if (nc == columnRslt_arr_dpt_flg) doRslt_arr_dpt_flg_NC(info);
		else if (nc == columnRslt_mfg_dpt_flg) doRslt_mfg_dpt_flg_NC(info);
		else if (nc == columnRslt_insp_dpt_flg) doRslt_insp_dpt_flg_NC(info);
		else if (nc == columnRslt_bd_dpt_flg) doRslt_bd_dpt_flg_NC(info);
		else if (nc == columnRslt_memo1) doRslt_memo1_NC(info);
		else if (nc == columnRslt_memo2) doRslt_memo2_NC(info);
		else if (nc == columnRslt_memo3) doRslt_memo3_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wr_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[dpt_lvl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[up_lv_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_up_lv_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[up_lv_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_up_lv_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sd_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sd_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_biz_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_biz_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_is_srch_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_is_srch_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_lvl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_lvl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_lvl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_lvl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[up_lv_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_up_lv_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[up_lv_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_up_lv_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[new_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_new_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NC(MCEventInfo info){
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
		else if (ne == Cnd_dpt_cd) doCnd_dpt_cd_NE(info);
		else if (ne == Cnd_dpt_nm) doCnd_dpt_nm_NE(info);
		else if (ne == Cnd_dt) doCnd_dt_NE(info);
		else if (ne == Cnd_rd_flg) doCnd_rd_flg_NE(info);
		else if (ne == Cnd_wr_flg) doCnd_wr_flg_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_dpt_lvl_cd) doCnd_dpt_lvl_cd_NE(info);
		else if (ne == Cnd_dpt_lvl_nm) doCnd_dpt_lvl_nm_NE(info);
		else if (ne == Cnd_up_lv_dpt_cd) doCnd_up_lv_dpt_cd_NE(info);
		else if (ne == Cnd_up_lv_dpt_nm) doCnd_up_lv_dpt_nm_NE(info);
		else if (ne == Cnd_new_dpt_cd) doCnd_new_dpt_cd_NE(info);
		else if (ne == Cnd_ar_dpt_flg) doCnd_ar_dpt_flg_NE(info);
		else if (ne == Cnd_ap_dpt_flg) doCnd_ap_dpt_flg_NE(info);
		else if (ne == Cnd_sls_dpt_flg) doCnd_sls_dpt_flg_NE(info);
		else if (ne == Cnd_purc_dpt_flg) doCnd_purc_dpt_flg_NE(info);
		else if (ne == Cnd_asst_dpt_flg) doCnd_asst_dpt_flg_NE(info);
		else if (ne == Cnd_ship_dpt_flg) doCnd_ship_dpt_flg_NE(info);
		else if (ne == Cnd_arr_dpt_flg) doCnd_arr_dpt_flg_NE(info);
		else if (ne == Cnd_mfg_dpt_flg) doCnd_mfg_dpt_flg_NE(info);
		else if (ne == Cnd_insp_dpt_flg) doCnd_insp_dpt_flg_NE(info);
		else if (ne == Cnd_bd_dpt_flg) doCnd_bd_dpt_flg_NE(info);
		else if (ne == Cnd_sd_dpt_flg) doCnd_sd_dpt_flg_NE(info);
		else if (ne == Cnd_non_biz_dpt_flg) doCnd_non_biz_dpt_flg_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_dpt_is_srch_typ_nm) doCnd_dpt_is_srch_typ_nm_NE(info);
		else if (ne == Cnd_match_typ_Group) doCnd_match_typ_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_dpt_cd) doRslt_dpt_cd_NE(info);
		else if (ne == columnRslt_dpt_nm) doRslt_dpt_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_dpt_lvl_cd) doRslt_dpt_lvl_cd_NE(info);
		else if (ne == columnRslt_dpt_lvl_nm) doRslt_dpt_lvl_nm_NE(info);
		else if (ne == columnRslt_up_lv_dpt_cd) doRslt_up_lv_dpt_cd_NE(info);
		else if (ne == columnRslt_up_lv_dpt_nm) doRslt_up_lv_dpt_nm_NE(info);
		else if (ne == columnRslt_new_dpt_cd) doRslt_new_dpt_cd_NE(info);
		else if (ne == columnRslt_ar_dpt_flg) doRslt_ar_dpt_flg_NE(info);
		else if (ne == columnRslt_ap_dpt_flg) doRslt_ap_dpt_flg_NE(info);
		else if (ne == columnRslt_sls_dpt_flg) doRslt_sls_dpt_flg_NE(info);
		else if (ne == columnRslt_purc_dpt_flg) doRslt_purc_dpt_flg_NE(info);
		else if (ne == columnRslt_asst_dpt_flg) doRslt_asst_dpt_flg_NE(info);
		else if (ne == columnRslt_ship_dpt_flg) doRslt_ship_dpt_flg_NE(info);
		else if (ne == columnRslt_arr_dpt_flg) doRslt_arr_dpt_flg_NE(info);
		else if (ne == columnRslt_mfg_dpt_flg) doRslt_mfg_dpt_flg_NE(info);
		else if (ne == columnRslt_insp_dpt_flg) doRslt_insp_dpt_flg_NE(info);
		else if (ne == columnRslt_bd_dpt_flg) doRslt_bd_dpt_flg_NE(info);
		else if (ne == columnRslt_memo1) doRslt_memo1_NE(info);
		else if (ne == columnRslt_memo2) doRslt_memo2_NE(info);
		else if (ne == columnRslt_memo3) doRslt_memo3_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wr_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[dpt_lvl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[up_lv_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_up_lv_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[up_lv_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_up_lv_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sd_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sd_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_biz_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_biz_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_is_srch_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_is_srch_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_lvl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_lvl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_lvl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_lvl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[up_lv_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_up_lv_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[up_lv_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_up_lv_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[new_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_new_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NE(MCEventInfo info){
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
		else if (nx == Cnd_dpt_cd) doCnd_dpt_cd_NX(info);
		else if (nx == Cnd_dpt_nm) doCnd_dpt_nm_NX(info);
		else if (nx == Cnd_dt) doCnd_dt_NX(info);
		else if (nx == Cnd_rd_flg) doCnd_rd_flg_NX(info);
		else if (nx == Cnd_wr_flg) doCnd_wr_flg_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_dpt_lvl_cd) doCnd_dpt_lvl_cd_NX(info);
		else if (nx == Cnd_dpt_lvl_nm) doCnd_dpt_lvl_nm_NX(info);
		else if (nx == Cnd_up_lv_dpt_cd) doCnd_up_lv_dpt_cd_NX(info);
		else if (nx == Cnd_up_lv_dpt_nm) doCnd_up_lv_dpt_nm_NX(info);
		else if (nx == Cnd_new_dpt_cd) doCnd_new_dpt_cd_NX(info);
		else if (nx == Cnd_ar_dpt_flg) doCnd_ar_dpt_flg_NX(info);
		else if (nx == Cnd_ap_dpt_flg) doCnd_ap_dpt_flg_NX(info);
		else if (nx == Cnd_sls_dpt_flg) doCnd_sls_dpt_flg_NX(info);
		else if (nx == Cnd_purc_dpt_flg) doCnd_purc_dpt_flg_NX(info);
		else if (nx == Cnd_asst_dpt_flg) doCnd_asst_dpt_flg_NX(info);
		else if (nx == Cnd_ship_dpt_flg) doCnd_ship_dpt_flg_NX(info);
		else if (nx == Cnd_arr_dpt_flg) doCnd_arr_dpt_flg_NX(info);
		else if (nx == Cnd_mfg_dpt_flg) doCnd_mfg_dpt_flg_NX(info);
		else if (nx == Cnd_insp_dpt_flg) doCnd_insp_dpt_flg_NX(info);
		else if (nx == Cnd_bd_dpt_flg) doCnd_bd_dpt_flg_NX(info);
		else if (nx == Cnd_sd_dpt_flg) doCnd_sd_dpt_flg_NX(info);
		else if (nx == Cnd_non_biz_dpt_flg) doCnd_non_biz_dpt_flg_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_dpt_is_srch_typ_nm) doCnd_dpt_is_srch_typ_nm_NX(info);
		else if (nx == Cnd_match_typ_Group) doCnd_match_typ_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_dpt_cd) doRslt_dpt_cd_NX(info);
		else if (nx == columnRslt_dpt_nm) doRslt_dpt_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_dpt_lvl_cd) doRslt_dpt_lvl_cd_NX(info);
		else if (nx == columnRslt_dpt_lvl_nm) doRslt_dpt_lvl_nm_NX(info);
		else if (nx == columnRslt_up_lv_dpt_cd) doRslt_up_lv_dpt_cd_NX(info);
		else if (nx == columnRslt_up_lv_dpt_nm) doRslt_up_lv_dpt_nm_NX(info);
		else if (nx == columnRslt_new_dpt_cd) doRslt_new_dpt_cd_NX(info);
		else if (nx == columnRslt_ar_dpt_flg) doRslt_ar_dpt_flg_NX(info);
		else if (nx == columnRslt_ap_dpt_flg) doRslt_ap_dpt_flg_NX(info);
		else if (nx == columnRslt_sls_dpt_flg) doRslt_sls_dpt_flg_NX(info);
		else if (nx == columnRslt_purc_dpt_flg) doRslt_purc_dpt_flg_NX(info);
		else if (nx == columnRslt_asst_dpt_flg) doRslt_asst_dpt_flg_NX(info);
		else if (nx == columnRslt_ship_dpt_flg) doRslt_ship_dpt_flg_NX(info);
		else if (nx == columnRslt_arr_dpt_flg) doRslt_arr_dpt_flg_NX(info);
		else if (nx == columnRslt_mfg_dpt_flg) doRslt_mfg_dpt_flg_NX(info);
		else if (nx == columnRslt_insp_dpt_flg) doRslt_insp_dpt_flg_NX(info);
		else if (nx == columnRslt_bd_dpt_flg) doRslt_bd_dpt_flg_NX(info);
		else if (nx == columnRslt_memo1) doRslt_memo1_NX(info);
		else if (nx == columnRslt_memo2) doRslt_memo2_NX(info);
		else if (nx == columnRslt_memo3) doRslt_memo3_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wr_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[dpt_lvl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[up_lv_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_up_lv_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[up_lv_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_up_lv_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sd_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sd_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_biz_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_biz_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_is_srch_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_is_srch_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_lvl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_lvl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_lvl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_lvl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[up_lv_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_up_lv_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[up_lv_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_up_lv_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[new_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_new_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_dpt_cd) doCnd_dpt_cd_LC(info);
		else if (lc == Cnd_dpt_nm) doCnd_dpt_nm_LC(info);
		else if (lc == Cnd_dt) doCnd_dt_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_dpt_lvl_cd) doCnd_dpt_lvl_cd_LC(info);
		else if (lc == Cnd_dpt_lvl_nm) doCnd_dpt_lvl_nm_LC(info);
		else if (lc == Cnd_up_lv_dpt_cd) doCnd_up_lv_dpt_cd_LC(info);
		else if (lc == Cnd_up_lv_dpt_nm) doCnd_up_lv_dpt_nm_LC(info);
		else if (lc == Cnd_new_dpt_cd) doCnd_new_dpt_cd_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == Cnd_dpt_is_srch_typ_nm) doCnd_dpt_is_srch_typ_nm_LC(info);
		else if (lc == columnRslt_dpt_cd) doRslt_dpt_cd_LC(info);
		else if (lc == columnRslt_dpt_nm) doRslt_dpt_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_dpt_lvl_cd) doRslt_dpt_lvl_cd_LC(info);
		else if (lc == columnRslt_dpt_lvl_nm) doRslt_dpt_lvl_nm_LC(info);
		else if (lc == columnRslt_up_lv_dpt_cd) doRslt_up_lv_dpt_cd_LC(info);
		else if (lc == columnRslt_up_lv_dpt_nm) doRslt_up_lv_dpt_nm_LC(info);
		else if (lc == columnRslt_new_dpt_cd) doRslt_new_dpt_cd_LC(info);
		else if (lc == columnRslt_memo1) doRslt_memo1_LC(info);
		else if (lc == columnRslt_memo2) doRslt_memo2_LC(info);
		else if (lc == columnRslt_memo3) doRslt_memo3_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[dpt_lvl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[up_lv_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_up_lv_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[up_lv_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_up_lv_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_is_srch_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_is_srch_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_lvl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_lvl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_lvl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_lvl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[up_lv_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_up_lv_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[up_lv_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_up_lv_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[new_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_new_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_lvl_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_lvl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDptLvl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_up_lv_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_up_lv_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}