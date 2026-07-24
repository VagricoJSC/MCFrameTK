package mcframe.clientMSUA.MSUAP1140;

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
 * 画面"MSUAP_CstItm"パネルクラスです。<p>
 *
 * 取引先品目の検索を行う<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUAP_CstItm_MC_A extends mcframe.clientMAUD.MAUDP0020.MAUDP_ISPanel{
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
	public static final String SCREEN_ID = "MSUAP1140";

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
	public MCLabel Cnd_bp_cd_Label = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bp_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCTextField Cnd_bp_nm = null;
	public MCLabel Cnd_bp_itm_cd_Label = null;
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bp_itm_cd = null;
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCTextField Cnd_bp_itm_nm = null;
	public MCLabel Cnd_itm_cd_Label = null;
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_itm_cd = null;
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public MCTextField Cnd_itm_sub1 = null;
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public MCTextField Cnd_itm_sub2 = null;
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public MCTextField Cnd_itm_sub3 = null;
	/**
	 * Item name 品名.<p>
	 *
	 */
	public MCTextField Cnd_itm_nm = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_nm;	// [Cnd]の[itm_typ_p.itm_typ_nm]を[Cnd_itm_typ_nm]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCLabel Cnd_sundry_itm_flg_lab = null;
	/**
	 * Miscellaneous item. On 諸口品.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_sundry_itm_flg_on = null;
	/**
	 * Miscellaneous item. Off 諸口品.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_sundry_itm_flg_off = null;
	public MCLabel Cnd_stk_mng_typ_Label = null;
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_stk_mng_typ = null;
	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public MCTextField Cnd_stk_mng_typ_nm = null;
	public MCLabel Cnd_asset_mng_typ_Label = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_asset_mng_typ = null;
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public MCTextField Cnd_asset_mng_typ_nm = null;
	public MCLabel Cnd_dt_Label = null;
	/**
	 * Application date 適用日.<p>
	 *
	 */
	public MCDateField Cnd_dt = null;
	public MCLabel Cnd_cst_itm_is_srch_typ_nm_Label = null;
	/**
	 * Search type 検索区分.<p>
	 *
	 */
	public MCTextField Cnd_cst_itm_is_srch_typ_nm = null;
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
	public MCTable2<mcframe.clientMSUA.MSUAP1140.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_nm = null;
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_itm_cd = null;
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_itm_nm = null;
	/**
	 * Default デフォルト.<p>
	 *
	 */
	public MCColumnConfig columnRslt_def_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_cd_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_cd_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_cd_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_cd_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_cd_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_cd_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_d_nm = null;
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_mng_typ = null;
	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_mng_typ_nm = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asset_mng_typ = null;
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asset_mng_typ_nm = null;
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sundry_itm_flg = null;
	/**
	 * Purchase forecast group cd. 購買内示グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pf_grp_cd = null;
	/**
	 * Purchase forecast group name 購買内示グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pf_grp_nm = null;
	/**
	 * Purchase forecast firm 購買内示確定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pf_fix_flg = null;
	/**
	 * Pickup responsibility 引取責任.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_commit_flg = null;
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
	private final mcframe.clientMSUA.MSUAP1140.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSUA.MSUAP1140.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSUA.MSUAP1140.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSUA.MSUAP1140.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSUA.MSUAP1140.CndR createCndR() {
		return mcframe.clientMSUA.MSUAP1140.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSUA.MSUAP1140.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSUA.MSUAP1140.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSUA.MSUAP1140.RsltR createRsltR() {
		return mcframe.clientMSUA.MSUAP1140.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSUA.MSUAP1140.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSUA.MSUAP1140.RsltR.class);
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
	public MSUAP_CstItm_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSUAP_CstItm_MC_A(String name) {
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
		MSUAP_CstItm_MC.jbCreateTop((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.jbCreateCnd((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.jbCreateSrchBtn1((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.jbCreateSrchBtn2((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.jbCreateCtrl((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.jbCreateRslt((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.jbCreateBtn((MSUAP_CstItm)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSUAP_CstItm p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSUAP_CstItm p) {
		p.Cnd_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().itm_typ_p());
		p.Cnd_itm_typ_p_PPanel.setName("Cnd.itm_typ_p");
		p.Cnd_itm_typ = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_itm_typ.addAliasName("Cnd.itm_typ", p);
		p.Cnd_itm_typ_nm = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_nm;
		p.Cnd_itm_typ_nm.addAliasName("Cnd.itm_typ_nm", p);
		p.Cnd_itm_typ_d_cd = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_cd;
		p.Cnd_itm_typ_d_cd.addAliasName("Cnd.itm_typ_d_cd", p);
		p.Cnd_itm_typ_d_nm = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_nm;
		p.Cnd_itm_typ_d_nm.addAliasName("Cnd.itm_typ_d_nm", p);
	}

	/**
	 * [SrchBtn1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn1(MSUAP_CstItm p) {
	}

	/**
	 * [SrchBtn2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn2(MSUAP_CstItm p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSUAP_CstItm p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSUAP_CstItm p) {
		p.Rslt_itm_cd_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSUA.MSUAP1140.RsltR.$itm_cd_p);
		p.Rslt_itm_cd_p_PPanel.setName("Rslt.itm_cd_p");
		p.columnRslt_itm_cd = p.Rslt_itm_cd_p_PPanel.columnItm_itm_cd;
		p.columnRslt_itm_cd.addAliasName("Rslt.itm_cd", p);
		p.columnRslt_itm_sub1 = p.Rslt_itm_cd_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_itm_sub1.addAliasName("Rslt.itm_sub1", p);
		p.columnRslt_itm_sub2 = p.Rslt_itm_cd_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_itm_sub2.addAliasName("Rslt.itm_sub2", p);
		p.columnRslt_itm_sub3 = p.Rslt_itm_cd_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_itm_sub3.addAliasName("Rslt.itm_sub3", p);
		p.columnRslt_itm_nm = p.Rslt_itm_cd_p_PPanel.columnItm_itm_nm;
		p.columnRslt_itm_nm.addAliasName("Rslt.itm_nm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSUAP_CstItm p) {
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

	
	/** [Cnd_stk_mng_typ_ListPutter]の定義 */
	private MCListPutter Cnd_stk_mng_typ_p = null;

	/**
	 * [Cnd_stk_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_stk_mng_typ_ListPutter() {
		if (Cnd_stk_mng_typ_p == null) {
			Cnd_stk_mng_typ_p = createCnd_stk_mng_typ_ListPutter(Cnd_stk_mng_typ, "stk_mng_typ", "stk_mng_typ_nm");

		}
		return Cnd_stk_mng_typ_p;
	}
	
	
	/** [Cnd_asset_mng_typ_ListPutter]の定義 */
	private MCListPutter Cnd_asset_mng_typ_p = null;

	/**
	 * [Cnd_asset_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_asset_mng_typ_ListPutter() {
		if (Cnd_asset_mng_typ_p == null) {
			Cnd_asset_mng_typ_p = createCnd_asset_mng_typ_ListPutter(Cnd_asset_mng_typ, "asset_mng_typ", "asset_mng_typ_nm");

		}
		return Cnd_asset_mng_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUAP_CstItm create(){
		MSUAP_CstItm p = new MSUAP_CstItm();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUAP_CstItm create(String name){
		MSUAP_CstItm p = new MSUAP_CstItm(name);
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
		MSUAP_CstItm_MC.jbfInitTop((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.jbfInitCnd((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.jbfInitSrchBtn1((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.jbfInitSrchBtn2((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.jbfInitCtrl((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.jbfInitRslt((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.jbfInitBtn((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.jbInitTop((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.jbInitCnd((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.jbInitSrchBtn1((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.jbInitSrchBtn2((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.jbInitCtrl((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.jbInitRslt((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.jbInitBtn((MSUAP_CstItm)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSUAP_CstItm p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSUAP_CstItm p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_bp_cd_Label = p.beansFactory.createLabel("Cnd.bp_cd_Label");
		p.Cnd_bp_cd = p.beansFactory.createTextField("Cnd.bp_cd");
		p.Cnd_bp_cd.setLabel(p.Cnd_bp_cd_Label);
		p.Cnd_bp_nm = p.beansFactory.createTextField("Cnd.bp_nm");
		p.Cnd_bp_itm_cd_Label = p.beansFactory.createLabel("Cnd.bp_itm_cd_Label");
		p.Cnd_bp_itm_cd = p.beansFactory.createTextField("Cnd.bp_itm_cd");
		p.Cnd_bp_itm_cd.setLabel(p.Cnd_bp_itm_cd_Label);
		p.Cnd_bp_itm_nm = p.beansFactory.createTextField("Cnd.bp_itm_nm");
		p.Cnd_itm_cd_Label = p.beansFactory.createLabel("Cnd.itm_cd_Label");
		p.Cnd_itm_cd = p.beansFactory.createTextField("Cnd.itm_cd");
		p.Cnd_itm_cd.setLabel(p.Cnd_itm_cd_Label);
		p.Cnd_itm_sub1 = p.beansFactory.createTextField("Cnd.itm_sub1");
		p.Cnd_itm_sub2 = p.beansFactory.createTextField("Cnd.itm_sub2");
		p.Cnd_itm_sub3 = p.beansFactory.createTextField("Cnd.itm_sub3");
		p.Cnd_itm_nm = p.beansFactory.createTextField("Cnd.itm_nm");
		p.Cnd_sundry_itm_flg_lab = p.beansFactory.createLabel("Cnd.sundry_itm_flg_lab");
		p.Cnd_sundry_itm_flg_on = p.beansFactory.createCheckBox("Cnd.sundry_itm_flg_on");
		p.Cnd_sundry_itm_flg_off = p.beansFactory.createCheckBox("Cnd.sundry_itm_flg_off");
		p.Cnd_stk_mng_typ_Label = p.beansFactory.createLabel("Cnd.stk_mng_typ_Label");
		p.Cnd_stk_mng_typ = p.beansFactory.createTextComboBox("Cnd.stk_mng_typ");
		p.Cnd_stk_mng_typ.setLabel(p.Cnd_stk_mng_typ_Label);
		p.Cnd_stk_mng_typ_nm = p.beansFactory.createTextField("Cnd.stk_mng_typ_nm");
		p.Cnd_asset_mng_typ_Label = p.beansFactory.createLabel("Cnd.asset_mng_typ_Label");
		p.Cnd_asset_mng_typ = p.beansFactory.createTextComboBox("Cnd.asset_mng_typ");
		p.Cnd_asset_mng_typ.setLabel(p.Cnd_asset_mng_typ_Label);
		p.Cnd_asset_mng_typ_nm = p.beansFactory.createTextField("Cnd.asset_mng_typ_nm");
		p.Cnd_dt_Label = p.beansFactory.createLabel("Cnd.dt_Label");
		p.Cnd_dt = p.beansFactory.createDateField("Cnd.dt");
		p.Cnd_dt.setLabel(p.Cnd_dt_Label);
		p.Cnd_cst_itm_is_srch_typ_nm_Label = p.beansFactory.createLabel("Cnd.cst_itm_is_srch_typ_nm_Label");
		p.Cnd_cst_itm_is_srch_typ_nm = p.beansFactory.createTextField("Cnd.cst_itm_is_srch_typ_nm");
		p.Cnd_cst_itm_is_srch_typ_nm.setLabel(p.Cnd_cst_itm_is_srch_typ_nm_Label);
		p.Cnd_match_typ_Group = p.beansFactory.createButtonGroup("Cnd.match_typ");
		p.Cnd_match_typ_0 = p.beansFactory.createRadioButton("Cnd.match_typ_0");
		p.Cnd_match_typ_1 = p.beansFactory.createRadioButton("Cnd.match_typ_1");
		p.Cnd_match_typ_2 = p.beansFactory.createRadioButton("Cnd.match_typ_2");
		p.Cnd_match_typ_3 = p.beansFactory.createRadioButton("Cnd.match_typ_3");
	}

	/**
	 * [SrchBtn1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn1(MSUAP_CstItm p) {
		// ブロック関連の初期化
		p.SrchBtn1Panel = p.beansFactory.createPanel("SrchBtn1");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchBtn2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn2(MSUAP_CstItm p) {
		// ブロック関連の初期化
		p.SrchBtn2Panel = p.beansFactory.createPanel("SrchBtn2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSUAP_CstItm p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSUAP_CstItm p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_bp_cd = p.beansFactory.createTableColumn("Rslt.bp_cd", MCColumnType.TEXT);
		p.columnRslt_bp_nm = p.beansFactory.createTableColumn("Rslt.bp_nm", MCColumnType.TEXT);
		p.columnRslt_bp_itm_cd = p.beansFactory.createTableColumn("Rslt.bp_itm_cd", MCColumnType.TEXT);
		p.columnRslt_bp_itm_nm = p.beansFactory.createTableColumn("Rslt.bp_itm_nm", MCColumnType.TEXT);
		p.columnRslt_def_flg = p.beansFactory.createTableColumn("Rslt.def_flg", MCColumnType.CHECK);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_stk_mng_typ = p.beansFactory.createTableColumn("Rslt.stk_mng_typ", MCColumnType.TEXT);
		p.columnRslt_stk_mng_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_mng_typ_nm", MCColumnType.TEXT);
		p.columnRslt_asset_mng_typ = p.beansFactory.createTableColumn("Rslt.asset_mng_typ", MCColumnType.TEXT);
		p.columnRslt_asset_mng_typ_nm = p.beansFactory.createTableColumn("Rslt.asset_mng_typ_nm", MCColumnType.TEXT);
		p.columnRslt_sundry_itm_flg = p.beansFactory.createTableColumn("Rslt.sundry_itm_flg", MCColumnType.CHECK);
		p.columnRslt_pf_grp_cd = p.beansFactory.createTableColumn("Rslt.pf_grp_cd", MCColumnType.TEXT);
		p.columnRslt_pf_grp_nm = p.beansFactory.createTableColumn("Rslt.pf_grp_nm", MCColumnType.TEXT);
		p.columnRslt_pf_fix_flg = p.beansFactory.createTableColumn("Rslt.pf_fix_flg", MCColumnType.CHECK);
		p.columnRslt_purc_commit_flg = p.beansFactory.createTableColumn("Rslt.purc_commit_flg", MCColumnType.CHECK);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSUAP_CstItm p) {
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
	protected static void jbInitTop(MSUAP_CstItm p) {
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
	protected static void jbInitCnd(MSUAP_CstItm p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_bp_cd_Label);
		p.CndPanel.add(p.Cnd_bp_cd);
		p.CndPanel.setLastBeans(p.Cnd_bp_cd);
		p.Cnd_bp_cd.setNextBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1140.CndR.bp_cd_META);
		p.CndPanel.add(p.Cnd_bp_nm);
		p.Cnd_bp_nm.setNextBeans(p.Cnd_bp_itm_cd);
		p.Cnd_bp_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1140.CndR.bp_nm_META);
		p.CndPanel.add(p.Cnd_bp_itm_cd_Label);
		p.CndPanel.add(p.Cnd_bp_itm_cd);
		p.Cnd_bp_itm_cd.setNextBeans(p.Cnd_bp_itm_nm);
		p.Cnd_bp_itm_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1140.CndR.bp_itm_cd_META);
		p.setPluralValueEnable(p.Cnd_bp_itm_cd, true);
		p.CndPanel.add(p.Cnd_bp_itm_nm);
		p.Cnd_bp_itm_nm.setNextBeans(p.Cnd_itm_cd);
		p.Cnd_bp_itm_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1140.CndR.bp_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_bp_itm_nm, true);
		p.CndPanel.add(p.Cnd_itm_cd_Label);
		p.CndPanel.add(p.Cnd_itm_cd);
		p.Cnd_itm_cd.setNextBeans(p.Cnd_itm_sub1);
		p.Cnd_itm_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1140.CndR.itm_cd_META);
		p.setPluralValueEnable(p.Cnd_itm_cd, true);
		p.CndPanel.add(p.Cnd_itm_sub1);
		p.Cnd_itm_sub1.setNextBeans(p.Cnd_itm_sub2);
		p.Cnd_itm_sub1.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1140.CndR.itm_sub1_META);
		p.setPluralValueEnable(p.Cnd_itm_sub1, true);
		p.CndPanel.add(p.Cnd_itm_sub2);
		p.Cnd_itm_sub2.setNextBeans(p.Cnd_itm_sub3);
		p.Cnd_itm_sub2.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1140.CndR.itm_sub2_META);
		p.setPluralValueEnable(p.Cnd_itm_sub2, true);
		p.CndPanel.add(p.Cnd_itm_sub3);
		p.Cnd_itm_sub3.setNextBeans(p.Cnd_itm_nm);
		p.Cnd_itm_sub3.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1140.CndR.itm_sub3_META);
		p.setPluralValueEnable(p.Cnd_itm_sub3, true);
		p.CndPanel.add(p.Cnd_itm_nm);
		p.Cnd_itm_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1140.CndR.itm_nm_META);
		p.setPluralValueEnable(p.Cnd_itm_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_sundry_itm_flg_on);
		p.CndPanel.add(p.Cnd_sundry_itm_flg_lab);
		p.CndPanel.add(p.Cnd_sundry_itm_flg_on);
		p.Cnd_sundry_itm_flg_on.setNextBeans(p.Cnd_sundry_itm_flg_off);
		p.Cnd_sundry_itm_flg_on.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1140.CndR.sundry_itm_flg_on_META);
		p.CndPanel.add(p.Cnd_sundry_itm_flg_off);
		p.Cnd_sundry_itm_flg_off.setNextBeans(p.Cnd_stk_mng_typ);
		p.Cnd_sundry_itm_flg_off.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1140.CndR.sundry_itm_flg_off_META);
		p.Cnd_stk_mng_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_stk_mng_typ, true);
		p.Cnd_stk_mng_typ.setLinkBeans(p.Cnd_stk_mng_typ_nm);
		p.CndPanel.add(p.Cnd_stk_mng_typ_Label);
		p.CndPanel.add(p.Cnd_stk_mng_typ);
		p.Cnd_stk_mng_typ.setNextBeans(p.Cnd_stk_mng_typ_nm);
		p.Cnd_stk_mng_typ.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1140.CndR.stk_mng_typ_META);
		p.CndPanel.add(p.Cnd_stk_mng_typ_nm);
		p.Cnd_stk_mng_typ_nm.setNextBeans(p.Cnd_asset_mng_typ);
		p.Cnd_stk_mng_typ_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1140.CndR.stk_mng_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_stk_mng_typ_nm, true);
		p.Cnd_asset_mng_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asset_mng_typ, true);
		p.Cnd_asset_mng_typ.setLinkBeans(p.Cnd_asset_mng_typ_nm);
		p.CndPanel.add(p.Cnd_asset_mng_typ_Label);
		p.CndPanel.add(p.Cnd_asset_mng_typ);
		p.Cnd_asset_mng_typ.setNextBeans(p.Cnd_asset_mng_typ_nm);
		p.Cnd_asset_mng_typ.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1140.CndR.asset_mng_typ_META);
		p.CndPanel.add(p.Cnd_asset_mng_typ_nm);
		p.Cnd_asset_mng_typ_nm.setNextBeans(p.Cnd_dt);
		p.Cnd_asset_mng_typ_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1140.CndR.asset_mng_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_asset_mng_typ_nm, true);
		p.CndPanel.add(p.Cnd_dt_Label);
		p.CndPanel.add(p.Cnd_dt);
		p.Cnd_dt.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1140.CndR.dt_META);
		p.Cnd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.SrchBtn1Panel.add(p.Cnd_cst_itm_is_srch_typ_nm_Label);
		p.SrchBtn1Panel.add(p.Cnd_cst_itm_is_srch_typ_nm);
		p.SrchBtn1Panel.setLastBeans(p.Cnd_cst_itm_is_srch_typ_nm);
		p.Cnd_cst_itm_is_srch_typ_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1140.CndR.cst_itm_is_srch_typ_nm_META);
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
		p.Cnd_match_typ_Group.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1140.CndR.match_typ_META);
	}

	/**
	 * [SrchBtn1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn1(MSUAP_CstItm p) {
		// ブロック関連の初期化
		p.SrchBtn1Panel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchBtn2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn2(MSUAP_CstItm p) {
		// ブロック関連の初期化
		p.SrchBtn2Panel.setLayoutPosition("SEC");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSUAP_CstItm p) {
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
	protected static void jbInitRslt(MSUAP_CstItm p) {
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
	protected static void jbInitBtn(MSUAP_CstItm p) {
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
		MSUAP_CstItm_MC.mcInitTop((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.mcInitCnd((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.mcInitSrchBtn1((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.mcInitSrchBtn2((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.mcInitCtrl((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.mcInitRslt((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.mcInitBtn((MSUAP_CstItm)this);

		// [SRCH]ステータスのモードの設定
		MSUAP_CstItm_MC.statusInitSRCH_Top((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.statusInitSRCH_Cnd((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.statusInitSRCH_SrchBtn1((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.statusInitSRCH_SrchBtn2((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.statusInitSRCH_Ctrl((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.statusInitSRCH_Rslt((MSUAP_CstItm)this);
		MSUAP_CstItm_MC.statusInitSRCH_Btn((MSUAP_CstItm)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSUAP_CstItm p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSUAP_CstItm p) {
		p.Cnd_bp_cd.setListListener(p);
		p.Cnd_bp_cd.addAllListener(p);
		p.Cnd_bp_nm.setListListener(p);
		p.Cnd_bp_nm.addAllListener(p);
		p.Cnd_bp_itm_cd.setListListener(p);
		p.Cnd_bp_itm_cd.addAllListener(p);
		p.Cnd_bp_itm_nm.setListListener(p);
		p.Cnd_bp_itm_nm.addAllListener(p);
		p.Cnd_itm_cd.setListListener(p);
		p.Cnd_itm_cd.addAllListener(p);
		p.Cnd_itm_sub1.setListListener(p);
		p.Cnd_itm_sub1.addAllListener(p);
		p.Cnd_itm_sub2.setListListener(p);
		p.Cnd_itm_sub2.addAllListener(p);
		p.Cnd_itm_sub3.setListListener(p);
		p.Cnd_itm_sub3.addAllListener(p);
		p.Cnd_itm_nm.setListListener(p);
		p.Cnd_itm_nm.addAllListener(p);
		p.Cnd_sundry_itm_flg_on.addAllListener(p);
		p.Cnd_sundry_itm_flg_off.addAllListener(p);
		p.Cnd_stk_mng_typ.setListListener(p);
		p.Cnd_stk_mng_typ.addAllListener(p);
		p.Cnd_stk_mng_typ_nm.setListListener(p);
		p.Cnd_stk_mng_typ_nm.addAllListener(p);
		p.Cnd_asset_mng_typ.setListListener(p);
		p.Cnd_asset_mng_typ.addAllListener(p);
		p.Cnd_asset_mng_typ_nm.setListListener(p);
		p.Cnd_asset_mng_typ_nm.addAllListener(p);
		p.Cnd_dt.setListListener(p);
		p.Cnd_dt.addAllListener(p);
		p.Cnd_cst_itm_is_srch_typ_nm.setListListener(p);
		p.Cnd_cst_itm_is_srch_typ_nm.addAllListener(p);
		p.Cnd_match_typ_Group.addAllListener(p);
		p.Cnd_match_typ_0.addAllListener(p);
		p.Cnd_match_typ_1.addAllListener(p);
		p.Cnd_match_typ_2.addAllListener(p);
		p.Cnd_match_typ_3.addAllListener(p);
	}

	/**
	 *  [SrchBtn1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn1(MSUAP_CstItm p) {
	}

	/**
	 *  [SrchBtn2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn2(MSUAP_CstItm p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSUAP_CstItm p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSUAP_CstItm p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_bp_cd.addAllListener(p);
		p.columnRslt_bp_cd.setListListener(p);
		p.columnRslt_bp_nm.addAllListener(p);
		p.columnRslt_bp_nm.setListListener(p);
		p.columnRslt_bp_itm_cd.addAllListener(p);
		p.columnRslt_bp_itm_cd.setListListener(p);
		p.columnRslt_bp_itm_nm.addAllListener(p);
		p.columnRslt_bp_itm_nm.setListListener(p);
		p.columnRslt_def_flg.addAllListener(p);
		p.columnRslt_itm_typ.addAllListener(p);
		p.columnRslt_itm_typ.setListListener(p);
		p.columnRslt_itm_typ_nm.addAllListener(p);
		p.columnRslt_itm_typ_nm.setListListener(p);
		p.columnRslt_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_itm_typ_d_cd.setListListener(p);
		p.columnRslt_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_itm_typ_d_nm.setListListener(p);
		p.columnRslt_stk_mng_typ.addAllListener(p);
		p.columnRslt_stk_mng_typ.setListListener(p);
		p.columnRslt_stk_mng_typ_nm.addAllListener(p);
		p.columnRslt_stk_mng_typ_nm.setListListener(p);
		p.columnRslt_asset_mng_typ.addAllListener(p);
		p.columnRslt_asset_mng_typ.setListListener(p);
		p.columnRslt_asset_mng_typ_nm.addAllListener(p);
		p.columnRslt_asset_mng_typ_nm.setListListener(p);
		p.columnRslt_sundry_itm_flg.addAllListener(p);
		p.columnRslt_pf_grp_cd.addAllListener(p);
		p.columnRslt_pf_grp_cd.setListListener(p);
		p.columnRslt_pf_grp_nm.addAllListener(p);
		p.columnRslt_pf_grp_nm.setListListener(p);
		p.columnRslt_pf_fix_flg.addAllListener(p);
		p.columnRslt_purc_commit_flg.addAllListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSUAP_CstItm p) {
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
	protected static void statusInitSRCH_Top(MSUAP_CstItm p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSUAP_CstItm p){
		p.Cnd_bp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_itm_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_itm_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_sub1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_sub2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_sub3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_sundry_itm_flg_on.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sundry_itm_flg_off.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_stk_mng_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_stk_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_asset_mng_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asset_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_dt.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_itm_is_srch_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_match_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[SrchBtn1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchBtn1(MSUAP_CstItm p){

	}

	/**
	 * [SRCH]ステータスの[SrchBtn2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchBtn2(MSUAP_CstItm p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSUAP_CstItm p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSUAP_CstItm p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnRslt_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_def_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_cd_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pf_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pf_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pf_fix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_commit_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSUAP_CstItm p){
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
		MSUAP_CstItm_MC.setTableConfigRslt((MSUAP_CstItm)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSUAP_CstItm p) {
		p.columnRslt_check.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_bp_cd.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_cd);
		p.columnRslt_bp_nm.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_nm);
		p.columnRslt_bp_itm_cd.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.bp_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_itm_cd);
		p.columnRslt_bp_itm_nm.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.bp_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_itm_nm);
		p.columnRslt_def_flg.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.def_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_def_flg);
		p.RsltTable.addTable(p.Rslt_itm_cd_p_PPanel.ItmTable);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.columnRslt_stk_mng_typ.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.stk_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_mng_typ);
		p.columnRslt_stk_mng_typ_nm.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.stk_mng_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_mng_typ_nm);
		p.columnRslt_asset_mng_typ.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.asset_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asset_mng_typ);
		p.columnRslt_asset_mng_typ_nm.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.asset_mng_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asset_mng_typ_nm);
		p.columnRslt_sundry_itm_flg.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.sundry_itm_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sundry_itm_flg);
		p.columnRslt_pf_grp_cd.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.pf_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pf_grp_cd);
		p.columnRslt_pf_grp_nm.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.pf_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pf_grp_nm);
		p.columnRslt_pf_fix_flg.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.pf_fix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pf_fix_flg);
		p.columnRslt_purc_commit_flg.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.purc_commit_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_commit_flg);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSUA.MSUAP1140.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_stk_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_stk_mng_typ.getListConfig().setPutter(getCnd_stk_mng_typ_ListPutter());
		Cnd_asset_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_asset_mng_typ.getListConfig().setPutter(getCnd_asset_mng_typ_ListPutter());
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
	 * [Cnd_stk_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_stk_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkMngTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_asset_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_asset_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AssetMngTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_stk_mng_typ) return getCnd_stk_mng_typ(row, info);
		if(combo == Cnd_asset_mng_typ) return getCnd_asset_mng_typ(row, info);
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
		if (vc == Cnd_bp_cd) return doCnd_bp_cd_VC(info);
		if (vc == Cnd_bp_nm) return doCnd_bp_nm_VC(info);
		if (vc == Cnd_bp_itm_cd) return doCnd_bp_itm_cd_VC(info);
		if (vc == Cnd_bp_itm_nm) return doCnd_bp_itm_nm_VC(info);
		if (vc == Cnd_itm_cd) return doCnd_itm_cd_VC(info);
		if (vc == Cnd_itm_sub1) return doCnd_itm_sub1_VC(info);
		if (vc == Cnd_itm_sub2) return doCnd_itm_sub2_VC(info);
		if (vc == Cnd_itm_sub3) return doCnd_itm_sub3_VC(info);
		if (vc == Cnd_itm_nm) return doCnd_itm_nm_VC(info);
		if (vc == Cnd_sundry_itm_flg_on) return doCnd_sundry_itm_flg_on_VC(info);
		if (vc == Cnd_sundry_itm_flg_off) return doCnd_sundry_itm_flg_off_VC(info);
		if (vc == Cnd_stk_mng_typ) return doCnd_stk_mng_typ_VC(info);
		if (vc == Cnd_stk_mng_typ_nm) return doCnd_stk_mng_typ_nm_VC(info);
		if (vc == Cnd_asset_mng_typ) return doCnd_asset_mng_typ_VC(info);
		if (vc == Cnd_asset_mng_typ_nm) return doCnd_asset_mng_typ_nm_VC(info);
		if (vc == Cnd_dt) return doCnd_dt_VC(info);
		if (vc == Cnd_cst_itm_is_srch_typ_nm) return doCnd_cst_itm_is_srch_typ_nm_VC(info);
		if (vc == Cnd_match_typ_Group) return doCnd_match_typ_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_bp_cd) return doRslt_bp_cd_VC(info);
		if (vc == columnRslt_bp_nm) return doRslt_bp_nm_VC(info);
		if (vc == columnRslt_bp_itm_cd) return doRslt_bp_itm_cd_VC(info);
		if (vc == columnRslt_bp_itm_nm) return doRslt_bp_itm_nm_VC(info);
		if (vc == columnRslt_def_flg) return doRslt_def_flg_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_stk_mng_typ) return doRslt_stk_mng_typ_VC(info);
		if (vc == columnRslt_stk_mng_typ_nm) return doRslt_stk_mng_typ_nm_VC(info);
		if (vc == columnRslt_asset_mng_typ) return doRslt_asset_mng_typ_VC(info);
		if (vc == columnRslt_asset_mng_typ_nm) return doRslt_asset_mng_typ_nm_VC(info);
		if (vc == columnRslt_sundry_itm_flg) return doRslt_sundry_itm_flg_VC(info);
		if (vc == columnRslt_pf_grp_cd) return doRslt_pf_grp_cd_VC(info);
		if (vc == columnRslt_pf_grp_nm) return doRslt_pf_grp_nm_VC(info);
		if (vc == columnRslt_pf_fix_flg) return doRslt_pf_fix_flg_VC(info);
		if (vc == columnRslt_purc_commit_flg) return doRslt_purc_commit_flg_VC(info);
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
	 * [Cnd]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_sub1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_sub1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_sub2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_sub2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_sub3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_sub3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_on]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sundry_itm_flg_on_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_off]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sundry_itm_flg_off_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asset_mng_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_itm_is_srch_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_itm_is_srch_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[def_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_def_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asset_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pf_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pf_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pf_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pf_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pf_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pf_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_commit_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_commit_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_bp_cd) doCnd_bp_cd_NC(info);
		else if (nc == Cnd_bp_nm) doCnd_bp_nm_NC(info);
		else if (nc == Cnd_bp_itm_cd) doCnd_bp_itm_cd_NC(info);
		else if (nc == Cnd_bp_itm_nm) doCnd_bp_itm_nm_NC(info);
		else if (nc == Cnd_itm_cd) doCnd_itm_cd_NC(info);
		else if (nc == Cnd_itm_sub1) doCnd_itm_sub1_NC(info);
		else if (nc == Cnd_itm_sub2) doCnd_itm_sub2_NC(info);
		else if (nc == Cnd_itm_sub3) doCnd_itm_sub3_NC(info);
		else if (nc == Cnd_itm_nm) doCnd_itm_nm_NC(info);
		else if (nc == Cnd_sundry_itm_flg_on) doCnd_sundry_itm_flg_on_NC(info);
		else if (nc == Cnd_sundry_itm_flg_off) doCnd_sundry_itm_flg_off_NC(info);
		else if (nc == Cnd_stk_mng_typ) doCnd_stk_mng_typ_NC(info);
		else if (nc == Cnd_stk_mng_typ_nm) doCnd_stk_mng_typ_nm_NC(info);
		else if (nc == Cnd_asset_mng_typ) doCnd_asset_mng_typ_NC(info);
		else if (nc == Cnd_asset_mng_typ_nm) doCnd_asset_mng_typ_nm_NC(info);
		else if (nc == Cnd_dt) doCnd_dt_NC(info);
		else if (nc == Cnd_cst_itm_is_srch_typ_nm) doCnd_cst_itm_is_srch_typ_nm_NC(info);
		else if (nc == Cnd_match_typ_Group) doCnd_match_typ_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_bp_cd) doRslt_bp_cd_NC(info);
		else if (nc == columnRslt_bp_nm) doRslt_bp_nm_NC(info);
		else if (nc == columnRslt_bp_itm_cd) doRslt_bp_itm_cd_NC(info);
		else if (nc == columnRslt_bp_itm_nm) doRslt_bp_itm_nm_NC(info);
		else if (nc == columnRslt_def_flg) doRslt_def_flg_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NC(info);
		else if (nc == columnRslt_stk_mng_typ_nm) doRslt_stk_mng_typ_nm_NC(info);
		else if (nc == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NC(info);
		else if (nc == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_NC(info);
		else if (nc == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NC(info);
		else if (nc == columnRslt_pf_grp_cd) doRslt_pf_grp_cd_NC(info);
		else if (nc == columnRslt_pf_grp_nm) doRslt_pf_grp_nm_NC(info);
		else if (nc == columnRslt_pf_fix_flg) doRslt_pf_fix_flg_NC(info);
		else if (nc == columnRslt_purc_commit_flg) doRslt_purc_commit_flg_NC(info);
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
	 * [Cnd]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_on]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sundry_itm_flg_on_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_off]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sundry_itm_flg_off_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_is_srch_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_is_srch_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[def_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_def_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_commit_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_commit_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_bp_cd) doCnd_bp_cd_NE(info);
		else if (ne == Cnd_bp_nm) doCnd_bp_nm_NE(info);
		else if (ne == Cnd_bp_itm_cd) doCnd_bp_itm_cd_NE(info);
		else if (ne == Cnd_bp_itm_nm) doCnd_bp_itm_nm_NE(info);
		else if (ne == Cnd_itm_cd) doCnd_itm_cd_NE(info);
		else if (ne == Cnd_itm_sub1) doCnd_itm_sub1_NE(info);
		else if (ne == Cnd_itm_sub2) doCnd_itm_sub2_NE(info);
		else if (ne == Cnd_itm_sub3) doCnd_itm_sub3_NE(info);
		else if (ne == Cnd_itm_nm) doCnd_itm_nm_NE(info);
		else if (ne == Cnd_sundry_itm_flg_on) doCnd_sundry_itm_flg_on_NE(info);
		else if (ne == Cnd_sundry_itm_flg_off) doCnd_sundry_itm_flg_off_NE(info);
		else if (ne == Cnd_stk_mng_typ) doCnd_stk_mng_typ_NE(info);
		else if (ne == Cnd_stk_mng_typ_nm) doCnd_stk_mng_typ_nm_NE(info);
		else if (ne == Cnd_asset_mng_typ) doCnd_asset_mng_typ_NE(info);
		else if (ne == Cnd_asset_mng_typ_nm) doCnd_asset_mng_typ_nm_NE(info);
		else if (ne == Cnd_dt) doCnd_dt_NE(info);
		else if (ne == Cnd_cst_itm_is_srch_typ_nm) doCnd_cst_itm_is_srch_typ_nm_NE(info);
		else if (ne == Cnd_match_typ_Group) doCnd_match_typ_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_bp_cd) doRslt_bp_cd_NE(info);
		else if (ne == columnRslt_bp_nm) doRslt_bp_nm_NE(info);
		else if (ne == columnRslt_bp_itm_cd) doRslt_bp_itm_cd_NE(info);
		else if (ne == columnRslt_bp_itm_nm) doRslt_bp_itm_nm_NE(info);
		else if (ne == columnRslt_def_flg) doRslt_def_flg_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NE(info);
		else if (ne == columnRslt_stk_mng_typ_nm) doRslt_stk_mng_typ_nm_NE(info);
		else if (ne == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NE(info);
		else if (ne == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_NE(info);
		else if (ne == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NE(info);
		else if (ne == columnRslt_pf_grp_cd) doRslt_pf_grp_cd_NE(info);
		else if (ne == columnRslt_pf_grp_nm) doRslt_pf_grp_nm_NE(info);
		else if (ne == columnRslt_pf_fix_flg) doRslt_pf_fix_flg_NE(info);
		else if (ne == columnRslt_purc_commit_flg) doRslt_purc_commit_flg_NE(info);
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
	 * [Cnd]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_on]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sundry_itm_flg_on_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_off]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sundry_itm_flg_off_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_is_srch_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_is_srch_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[def_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_def_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_commit_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_commit_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_bp_cd) doCnd_bp_cd_NX(info);
		else if (nx == Cnd_bp_nm) doCnd_bp_nm_NX(info);
		else if (nx == Cnd_bp_itm_cd) doCnd_bp_itm_cd_NX(info);
		else if (nx == Cnd_bp_itm_nm) doCnd_bp_itm_nm_NX(info);
		else if (nx == Cnd_itm_cd) doCnd_itm_cd_NX(info);
		else if (nx == Cnd_itm_sub1) doCnd_itm_sub1_NX(info);
		else if (nx == Cnd_itm_sub2) doCnd_itm_sub2_NX(info);
		else if (nx == Cnd_itm_sub3) doCnd_itm_sub3_NX(info);
		else if (nx == Cnd_itm_nm) doCnd_itm_nm_NX(info);
		else if (nx == Cnd_sundry_itm_flg_on) doCnd_sundry_itm_flg_on_NX(info);
		else if (nx == Cnd_sundry_itm_flg_off) doCnd_sundry_itm_flg_off_NX(info);
		else if (nx == Cnd_stk_mng_typ) doCnd_stk_mng_typ_NX(info);
		else if (nx == Cnd_stk_mng_typ_nm) doCnd_stk_mng_typ_nm_NX(info);
		else if (nx == Cnd_asset_mng_typ) doCnd_asset_mng_typ_NX(info);
		else if (nx == Cnd_asset_mng_typ_nm) doCnd_asset_mng_typ_nm_NX(info);
		else if (nx == Cnd_dt) doCnd_dt_NX(info);
		else if (nx == Cnd_cst_itm_is_srch_typ_nm) doCnd_cst_itm_is_srch_typ_nm_NX(info);
		else if (nx == Cnd_match_typ_Group) doCnd_match_typ_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_bp_cd) doRslt_bp_cd_NX(info);
		else if (nx == columnRslt_bp_nm) doRslt_bp_nm_NX(info);
		else if (nx == columnRslt_bp_itm_cd) doRslt_bp_itm_cd_NX(info);
		else if (nx == columnRslt_bp_itm_nm) doRslt_bp_itm_nm_NX(info);
		else if (nx == columnRslt_def_flg) doRslt_def_flg_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NX(info);
		else if (nx == columnRslt_stk_mng_typ_nm) doRslt_stk_mng_typ_nm_NX(info);
		else if (nx == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NX(info);
		else if (nx == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_NX(info);
		else if (nx == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NX(info);
		else if (nx == columnRslt_pf_grp_cd) doRslt_pf_grp_cd_NX(info);
		else if (nx == columnRslt_pf_grp_nm) doRslt_pf_grp_nm_NX(info);
		else if (nx == columnRslt_pf_fix_flg) doRslt_pf_fix_flg_NX(info);
		else if (nx == columnRslt_purc_commit_flg) doRslt_purc_commit_flg_NX(info);
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
	 * [Cnd]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_on]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sundry_itm_flg_on_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_off]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sundry_itm_flg_off_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_is_srch_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_is_srch_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[def_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_def_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_commit_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_commit_flg_NX(MCEventInfo info){
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
		if (lc == Cnd_bp_cd) doCnd_bp_cd_LC(info);
		else if (lc == Cnd_bp_nm) doCnd_bp_nm_LC(info);
		else if (lc == Cnd_bp_itm_cd) doCnd_bp_itm_cd_LC(info);
		else if (lc == Cnd_bp_itm_nm) doCnd_bp_itm_nm_LC(info);
		else if (lc == Cnd_itm_cd) doCnd_itm_cd_LC(info);
		else if (lc == Cnd_itm_sub1) doCnd_itm_sub1_LC(info);
		else if (lc == Cnd_itm_sub2) doCnd_itm_sub2_LC(info);
		else if (lc == Cnd_itm_sub3) doCnd_itm_sub3_LC(info);
		else if (lc == Cnd_itm_nm) doCnd_itm_nm_LC(info);
		else if (lc == Cnd_stk_mng_typ) doCnd_stk_mng_typ_LC(info);
		else if (lc == Cnd_stk_mng_typ_nm) doCnd_stk_mng_typ_nm_LC(info);
		else if (lc == Cnd_asset_mng_typ) doCnd_asset_mng_typ_LC(info);
		else if (lc == Cnd_asset_mng_typ_nm) doCnd_asset_mng_typ_nm_LC(info);
		else if (lc == Cnd_dt) doCnd_dt_LC(info);
		else if (lc == Cnd_cst_itm_is_srch_typ_nm) doCnd_cst_itm_is_srch_typ_nm_LC(info);
		else if (lc == columnRslt_bp_cd) doRslt_bp_cd_LC(info);
		else if (lc == columnRslt_bp_nm) doRslt_bp_nm_LC(info);
		else if (lc == columnRslt_bp_itm_cd) doRslt_bp_itm_cd_LC(info);
		else if (lc == columnRslt_bp_itm_nm) doRslt_bp_itm_nm_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_LC(info);
		else if (lc == columnRslt_stk_mng_typ_nm) doRslt_stk_mng_typ_nm_LC(info);
		else if (lc == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_LC(info);
		else if (lc == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_LC(info);
		else if (lc == columnRslt_pf_grp_cd) doRslt_pf_grp_cd_LC(info);
		else if (lc == columnRslt_pf_grp_nm) doRslt_pf_grp_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
	}

	/**
	 * [Cnd]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_is_srch_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_is_srch_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_grp_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_stk_mng_typ]の作成メソッド
	 */
	public MCList getCnd_stk_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_asset_mng_typ]の作成メソッド
	 */
	public MCList getCnd_asset_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAssetMngTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}