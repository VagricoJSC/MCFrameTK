package mcframe.clientMSUA.MSUAP1010;

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
 * 画面"MSUAP_LotNo"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUAP_LotNo_MC_A extends mcframe.clientMAUD.MAUDP0020.MAUDP_ISPanel{
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
	public static final String SCREEN_ID = "MSUAP1010";

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
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_lot_no_Label = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_lot_no = null;
	/**
	 * Include lot without inventory/GR schedule 在庫・入庫予定がないロットも含む.<p>
	 *
	 */
	public MCCheckBox Cnd_srch_no_stk_and_io_flg = null;
	public mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H Cnd_ver_no_p_PPanel;
	public MCTextComboBox Cnd_ver_no;	// [Cnd]の[ver_no_p.ver_no]を[Cnd_ver_no]としてエイリアス定義。
	public MCLabel Cnd_vld_dt_fr_Label = null;
	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_vld_dt_fr = null;
	public MCLabel Cnd_vld_dt_to_Label = null;
	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_vld_dt_to = null;
	public MCLabel Cnd_lmt_dt_fr_Label = null;
	/**
	 * Usage expiration date FROM 使用期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_lmt_dt_fr = null;
	public MCLabel Cnd_lmt_dt_to_Label = null;
	/**
	 * Usage expiration date TO 使用期限ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_lmt_dt_to = null;
	public MCLabel Cnd_first_gr_dt_fr_Label = null;
	/**
	 * Oldest GR date FROM 最古入庫日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_first_gr_dt_fr = null;
	public MCLabel Cnd_first_gr_dt_to_Label = null;
	/**
	 * Oldest GR date TO 最古入庫日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_first_gr_dt_to = null;
	public MCLabel Cnd_stk_insp_typ_Label = null;
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_stk_insp_typ = null;
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public MCTextField Cnd_stk_insp_typ_nm = null;
	public MCLabel Cnd_quality_typ_Label = null;
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCTextField Cnd_quality_typ_nm = null;
	public MCLabel Cnd_mfg_aprv_sts_typ_Label = null;
	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_aprv_sts_typ = null;
	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_aprv_sts_typ_nm = null;
	public MCLabel Cnd_insp_aprv_sts_typ_Label = null;
	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_insp_aprv_sts_typ = null;
	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public MCTextField Cnd_insp_aprv_sts_typ_nm = null;
	public MCLabel Cnd_plnt_aprv_sts_typ_Label = null;
	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_plnt_aprv_sts_typ = null;
	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public MCTextField Cnd_plnt_aprv_sts_typ_nm = null;
	public MCLabel Cnd_mrkt_judg_sts_typ_Label = null;
	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_mrkt_judg_sts_typ = null;
	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public MCTextField Cnd_mrkt_judg_sts_typ_nm = null;
	public MCLabel Cnd_lot_rmrks_Label = null;
	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public MCTextField Cnd_lot_rmrks = null;
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
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSUA.MSUAP1010.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_no = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Rslt_ver_no_p_PPanel;
	public MCColumnConfig columnRslt_ver_no;// [Rslt]の[ver_no_p.ver_no]を[columnRslt_ver_no]としてエイリアス定義。
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_lot_no = null;
	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_first_gr_dt = null;
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCColumnConfig columnRslt_vld_dt = null;
	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lmt_dt = null;
	/**
	 * Base date 起算日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lmt_dt_frm = null;
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_insp_typ = null;
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_insp_typ_nm = null;
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_quality_typ_nm = null;
	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_aprv_sts_typ = null;
	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_aprv_sts_typ_nm = null;
	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_aprv_sts_typ = null;
	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_aprv_sts_typ_nm = null;
	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_plnt_aprv_sts_typ = null;
	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_plnt_aprv_sts_typ_nm = null;
	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mrkt_judg_sts_typ = null;
	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mrkt_judg_sts_typ_nm = null;
	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_cont_fctr = null;
	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lmt_dt_frm_typ = null;
	/**
	 * Expiration base date type name 期限起算日区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lmt_dt_frm_typ_nm = null;
	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_seq = null;
	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_rmrks = null;
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
	private final mcframe.clientMSUA.MSUAP1010.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSUA.MSUAP1010.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSUA.MSUAP1010.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSUA.MSUAP1010.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSUA.MSUAP1010.CndR createCndR() {
		return mcframe.clientMSUA.MSUAP1010.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSUA.MSUAP1010.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSUA.MSUAP1010.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSUA.MSUAP1010.RsltR createRsltR() {
		return mcframe.clientMSUA.MSUAP1010.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSUA.MSUAP1010.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSUA.MSUAP1010.RsltR.class);
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
		ret.add(SrchBtnPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUAP_LotNo_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSUAP_LotNo_MC_A(String name) {
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
		MSUAP_LotNo_MC.jbCreateTop((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.jbCreateCnd((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.jbCreateSrchBtn((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.jbCreateCtrl((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.jbCreateRslt((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.jbCreateBtn((MSUAP_LotNo)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSUAP_LotNo p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSUAP_LotNo p) {
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
		p.Cnd_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.create(p.getCndR().ver_no_p());
		p.Cnd_ver_no_p_PPanel.setName("Cnd.ver_no_p");
		p.Cnd_ver_no = p.Cnd_ver_no_p_PPanel.VerNo_ver_no;
		p.Cnd_ver_no.addAliasName("Cnd.ver_no", p);
	}

	/**
	 * [SrchBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn(MSUAP_LotNo p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSUAP_LotNo p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSUAP_LotNo p) {
		p.Rslt_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSUA.MSUAP1010.RsltR.$ver_no_p);
		p.Rslt_ver_no_p_PPanel.setName("Rslt.ver_no_p");
		p.columnRslt_ver_no = p.Rslt_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRslt_ver_no.addAliasName("Rslt.ver_no", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSUAP_LotNo p) {
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

	
	/** [Cnd_stk_insp_typ_ListPutter]の定義 */
	private MCListPutter Cnd_stk_insp_typ_p = null;

	/**
	 * [Cnd_stk_insp_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_stk_insp_typ_ListPutter() {
		if (Cnd_stk_insp_typ_p == null) {
			Cnd_stk_insp_typ_p = createCnd_stk_insp_typ_ListPutter(Cnd_stk_insp_typ, "stk_insp_typ", "stk_insp_typ_nm");

		}
		return Cnd_stk_insp_typ_p;
	}
	
	
	/** [Cnd_quality_typ_ListPutter]の定義 */
	private MCListPutter Cnd_quality_typ_p = null;

	/**
	 * [Cnd_quality_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_quality_typ_ListPutter() {
		if (Cnd_quality_typ_p == null) {
			Cnd_quality_typ_p = createCnd_quality_typ_ListPutter(Cnd_quality_typ, "quality_typ", "quality_typ_nm");

		}
		return Cnd_quality_typ_p;
	}
	
	
	/** [Cnd_mfg_aprv_sts_typ_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_aprv_sts_typ_p = null;

	/**
	 * [Cnd_mfg_aprv_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_aprv_sts_typ_ListPutter() {
		if (Cnd_mfg_aprv_sts_typ_p == null) {
			Cnd_mfg_aprv_sts_typ_p = createCnd_mfg_aprv_sts_typ_ListPutter(Cnd_mfg_aprv_sts_typ, "mfg_aprv_sts_typ", "mfg_aprv_sts_typ_nm");

		}
		return Cnd_mfg_aprv_sts_typ_p;
	}
	
	
	/** [Cnd_insp_aprv_sts_typ_ListPutter]の定義 */
	private MCListPutter Cnd_insp_aprv_sts_typ_p = null;

	/**
	 * [Cnd_insp_aprv_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_insp_aprv_sts_typ_ListPutter() {
		if (Cnd_insp_aprv_sts_typ_p == null) {
			Cnd_insp_aprv_sts_typ_p = createCnd_insp_aprv_sts_typ_ListPutter(Cnd_insp_aprv_sts_typ, "insp_aprv_sts_typ", "insp_aprv_sts_typ_nm");

		}
		return Cnd_insp_aprv_sts_typ_p;
	}
	
	
	/** [Cnd_plnt_aprv_sts_typ_ListPutter]の定義 */
	private MCListPutter Cnd_plnt_aprv_sts_typ_p = null;

	/**
	 * [Cnd_plnt_aprv_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_plnt_aprv_sts_typ_ListPutter() {
		if (Cnd_plnt_aprv_sts_typ_p == null) {
			Cnd_plnt_aprv_sts_typ_p = createCnd_plnt_aprv_sts_typ_ListPutter(Cnd_plnt_aprv_sts_typ, "plnt_aprv_sts_typ", "plnt_aprv_sts_typ_nm");

		}
		return Cnd_plnt_aprv_sts_typ_p;
	}
	
	
	/** [Cnd_mrkt_judg_sts_typ_ListPutter]の定義 */
	private MCListPutter Cnd_mrkt_judg_sts_typ_p = null;

	/**
	 * [Cnd_mrkt_judg_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mrkt_judg_sts_typ_ListPutter() {
		if (Cnd_mrkt_judg_sts_typ_p == null) {
			Cnd_mrkt_judg_sts_typ_p = createCnd_mrkt_judg_sts_typ_ListPutter(Cnd_mrkt_judg_sts_typ, "mrkt_judg_sts_typ", "mrkt_judg_sts_typ_nm");

		}
		return Cnd_mrkt_judg_sts_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUAP_LotNo create(){
		MSUAP_LotNo p = new MSUAP_LotNo();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUAP_LotNo create(String name){
		MSUAP_LotNo p = new MSUAP_LotNo(name);
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
		MSUAP_LotNo_MC.jbfInitTop((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.jbfInitCnd((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.jbfInitSrchBtn((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.jbfInitCtrl((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.jbfInitRslt((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.jbfInitBtn((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.jbInitTop((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.jbInitCnd((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.jbInitSrchBtn((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.jbInitCtrl((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.jbInitRslt((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.jbInitBtn((MSUAP_LotNo)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSUAP_LotNo p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSUAP_LotNo p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_srch_no_stk_and_io_flg = p.beansFactory.createCheckBox("Cnd.srch_no_stk_and_io_flg");
		p.Cnd_vld_dt_fr_Label = p.beansFactory.createLabel("Cnd.vld_dt_fr_Label");
		p.Cnd_vld_dt_fr = p.beansFactory.createDateField("Cnd.vld_dt_fr");
		p.Cnd_vld_dt_fr.setLabel(p.Cnd_vld_dt_fr_Label);
		p.Cnd_vld_dt_to_Label = p.beansFactory.createLabel("Cnd.vld_dt_to_Label");
		p.Cnd_vld_dt_to = p.beansFactory.createDateField("Cnd.vld_dt_to");
		p.Cnd_vld_dt_to.setLabel(p.Cnd_vld_dt_to_Label);
		p.Cnd_lmt_dt_fr_Label = p.beansFactory.createLabel("Cnd.lmt_dt_fr_Label");
		p.Cnd_lmt_dt_fr = p.beansFactory.createDateField("Cnd.lmt_dt_fr");
		p.Cnd_lmt_dt_fr.setLabel(p.Cnd_lmt_dt_fr_Label);
		p.Cnd_lmt_dt_to_Label = p.beansFactory.createLabel("Cnd.lmt_dt_to_Label");
		p.Cnd_lmt_dt_to = p.beansFactory.createDateField("Cnd.lmt_dt_to");
		p.Cnd_lmt_dt_to.setLabel(p.Cnd_lmt_dt_to_Label);
		p.Cnd_first_gr_dt_fr_Label = p.beansFactory.createLabel("Cnd.first_gr_dt_fr_Label");
		p.Cnd_first_gr_dt_fr = p.beansFactory.createDateField("Cnd.first_gr_dt_fr");
		p.Cnd_first_gr_dt_fr.setLabel(p.Cnd_first_gr_dt_fr_Label);
		p.Cnd_first_gr_dt_to_Label = p.beansFactory.createLabel("Cnd.first_gr_dt_to_Label");
		p.Cnd_first_gr_dt_to = p.beansFactory.createDateField("Cnd.first_gr_dt_to");
		p.Cnd_first_gr_dt_to.setLabel(p.Cnd_first_gr_dt_to_Label);
		p.Cnd_stk_insp_typ_Label = p.beansFactory.createLabel("Cnd.stk_insp_typ_Label");
		p.Cnd_stk_insp_typ = p.beansFactory.createTextComboBox("Cnd.stk_insp_typ");
		p.Cnd_stk_insp_typ.setLabel(p.Cnd_stk_insp_typ_Label);
		p.Cnd_stk_insp_typ_nm = p.beansFactory.createTextField("Cnd.stk_insp_typ_nm");
		p.Cnd_quality_typ_Label = p.beansFactory.createLabel("Cnd.quality_typ_Label");
		p.Cnd_quality_typ = p.beansFactory.createTextComboBox("Cnd.quality_typ");
		p.Cnd_quality_typ.setLabel(p.Cnd_quality_typ_Label);
		p.Cnd_quality_typ_nm = p.beansFactory.createTextField("Cnd.quality_typ_nm");
		p.Cnd_mfg_aprv_sts_typ_Label = p.beansFactory.createLabel("Cnd.mfg_aprv_sts_typ_Label");
		p.Cnd_mfg_aprv_sts_typ = p.beansFactory.createTextComboBox("Cnd.mfg_aprv_sts_typ");
		p.Cnd_mfg_aprv_sts_typ.setLabel(p.Cnd_mfg_aprv_sts_typ_Label);
		p.Cnd_mfg_aprv_sts_typ_nm = p.beansFactory.createTextField("Cnd.mfg_aprv_sts_typ_nm");
		p.Cnd_insp_aprv_sts_typ_Label = p.beansFactory.createLabel("Cnd.insp_aprv_sts_typ_Label");
		p.Cnd_insp_aprv_sts_typ = p.beansFactory.createTextComboBox("Cnd.insp_aprv_sts_typ");
		p.Cnd_insp_aprv_sts_typ.setLabel(p.Cnd_insp_aprv_sts_typ_Label);
		p.Cnd_insp_aprv_sts_typ_nm = p.beansFactory.createTextField("Cnd.insp_aprv_sts_typ_nm");
		p.Cnd_plnt_aprv_sts_typ_Label = p.beansFactory.createLabel("Cnd.plnt_aprv_sts_typ_Label");
		p.Cnd_plnt_aprv_sts_typ = p.beansFactory.createTextComboBox("Cnd.plnt_aprv_sts_typ");
		p.Cnd_plnt_aprv_sts_typ.setLabel(p.Cnd_plnt_aprv_sts_typ_Label);
		p.Cnd_plnt_aprv_sts_typ_nm = p.beansFactory.createTextField("Cnd.plnt_aprv_sts_typ_nm");
		p.Cnd_mrkt_judg_sts_typ_Label = p.beansFactory.createLabel("Cnd.mrkt_judg_sts_typ_Label");
		p.Cnd_mrkt_judg_sts_typ = p.beansFactory.createTextComboBox("Cnd.mrkt_judg_sts_typ");
		p.Cnd_mrkt_judg_sts_typ.setLabel(p.Cnd_mrkt_judg_sts_typ_Label);
		p.Cnd_mrkt_judg_sts_typ_nm = p.beansFactory.createTextField("Cnd.mrkt_judg_sts_typ_nm");
		p.Cnd_lot_rmrks_Label = p.beansFactory.createLabel("Cnd.lot_rmrks_Label");
		p.Cnd_lot_rmrks = p.beansFactory.createTextField("Cnd.lot_rmrks");
		p.Cnd_lot_rmrks.setLabel(p.Cnd_lot_rmrks_Label);
		p.Cnd_match_typ_Group = p.beansFactory.createButtonGroup("Cnd.match_typ");
		p.Cnd_match_typ_0 = p.beansFactory.createRadioButton("Cnd.match_typ_0");
		p.Cnd_match_typ_1 = p.beansFactory.createRadioButton("Cnd.match_typ_1");
		p.Cnd_match_typ_2 = p.beansFactory.createRadioButton("Cnd.match_typ_2");
		p.Cnd_match_typ_3 = p.beansFactory.createRadioButton("Cnd.match_typ_3");
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn(MSUAP_LotNo p) {
		// ブロック関連の初期化
		p.SrchBtnPanel = p.beansFactory.createPanel("SrchBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSUAP_LotNo p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSUAP_LotNo p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_bp_lot_no = p.beansFactory.createTableColumn("Rslt.bp_lot_no", MCColumnType.TEXT);
		p.columnRslt_first_gr_dt = p.beansFactory.createTableColumn("Rslt.first_gr_dt", MCColumnType.DATE);
		p.columnRslt_vld_dt = p.beansFactory.createTableColumn("Rslt.vld_dt", MCColumnType.DATE);
		p.columnRslt_lmt_dt = p.beansFactory.createTableColumn("Rslt.lmt_dt", MCColumnType.DATE);
		p.columnRslt_lmt_dt_frm = p.beansFactory.createTableColumn("Rslt.lmt_dt_frm", MCColumnType.DATE);
		p.columnRslt_stk_insp_typ = p.beansFactory.createTableColumn("Rslt.stk_insp_typ", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnRslt_quality_typ = p.beansFactory.createTableColumn("Rslt.quality_typ", MCColumnType.TEXT);
		p.columnRslt_quality_typ_nm = p.beansFactory.createTableColumn("Rslt.quality_typ_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.mfg_aprv_sts_typ", MCColumnType.TEXT);
		p.columnRslt_mfg_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.mfg_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_insp_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.insp_aprv_sts_typ", MCColumnType.TEXT);
		p.columnRslt_insp_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.insp_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_plnt_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.plnt_aprv_sts_typ", MCColumnType.TEXT);
		p.columnRslt_plnt_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.plnt_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_mrkt_judg_sts_typ = p.beansFactory.createTableColumn("Rslt.mrkt_judg_sts_typ", MCColumnType.TEXT);
		p.columnRslt_mrkt_judg_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.mrkt_judg_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_act_cont_fctr = p.beansFactory.createTableColumn("Rslt.act_cont_fctr", MCColumnType.NUMBER);
		p.columnRslt_lmt_dt_frm_typ = p.beansFactory.createTableColumn("Rslt.lmt_dt_frm_typ", MCColumnType.TEXT);
		p.columnRslt_lmt_dt_frm_typ_nm = p.beansFactory.createTableColumn("Rslt.lmt_dt_frm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_lot_seq = p.beansFactory.createTableColumn("Rslt.lot_seq", MCColumnType.TEXT);
		p.columnRslt_lot_rmrks = p.beansFactory.createTableColumn("Rslt.lot_rmrks", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSUAP_LotNo p) {
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
	protected static void jbInitTop(MSUAP_LotNo p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
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
	protected static void jbInitCnd(MSUAP_LotNo p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_lot_no);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_srch_no_stk_and_io_flg);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.lot_no_META);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.CndPanel.add(p.Cnd_srch_no_stk_and_io_flg);
		p.Cnd_srch_no_stk_and_io_flg.setNextBeans(p.Cnd_ver_no_p_PPanel);
		p.Cnd_srch_no_stk_and_io_flg.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.srch_no_stk_and_io_flg_META);
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_vld_dt_fr);
		p.CndPanel.add(p.Cnd_vld_dt_fr_Label);
		p.CndPanel.add(p.Cnd_vld_dt_fr);
		p.Cnd_vld_dt_fr.setNextBeans(p.Cnd_vld_dt_to);
		p.Cnd_vld_dt_fr.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.vld_dt_fr_META);
		p.Cnd_vld_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_vld_dt_to_Label);
		p.CndPanel.add(p.Cnd_vld_dt_to);
		p.Cnd_vld_dt_to.setNextBeans(p.Cnd_lmt_dt_fr);
		p.Cnd_vld_dt_to.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.vld_dt_to_META);
		p.Cnd_vld_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_lmt_dt_fr_Label);
		p.CndPanel.add(p.Cnd_lmt_dt_fr);
		p.Cnd_lmt_dt_fr.setNextBeans(p.Cnd_lmt_dt_to);
		p.Cnd_lmt_dt_fr.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.lmt_dt_fr_META);
		p.Cnd_lmt_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_lmt_dt_to_Label);
		p.CndPanel.add(p.Cnd_lmt_dt_to);
		p.Cnd_lmt_dt_to.setNextBeans(p.Cnd_first_gr_dt_fr);
		p.Cnd_lmt_dt_to.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.lmt_dt_to_META);
		p.Cnd_lmt_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_first_gr_dt_fr_Label);
		p.CndPanel.add(p.Cnd_first_gr_dt_fr);
		p.Cnd_first_gr_dt_fr.setNextBeans(p.Cnd_first_gr_dt_to);
		p.Cnd_first_gr_dt_fr.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.first_gr_dt_fr_META);
		p.Cnd_first_gr_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_first_gr_dt_to_Label);
		p.CndPanel.add(p.Cnd_first_gr_dt_to);
		p.Cnd_first_gr_dt_to.setNextBeans(p.Cnd_stk_insp_typ);
		p.Cnd_first_gr_dt_to.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.first_gr_dt_to_META);
		p.Cnd_first_gr_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_stk_insp_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_stk_insp_typ, true);
		p.Cnd_stk_insp_typ.setLinkBeans(p.Cnd_stk_insp_typ_nm);
		p.CndPanel.add(p.Cnd_stk_insp_typ_Label);
		p.CndPanel.add(p.Cnd_stk_insp_typ);
		p.Cnd_stk_insp_typ.setNextBeans(p.Cnd_stk_insp_typ_nm);
		p.Cnd_stk_insp_typ.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.stk_insp_typ_META);
		p.CndPanel.add(p.Cnd_stk_insp_typ_nm);
		p.Cnd_stk_insp_typ_nm.setNextBeans(p.Cnd_quality_typ);
		p.Cnd_stk_insp_typ_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.stk_insp_typ_nm_META);
		p.Cnd_quality_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_quality_typ, true);
		p.Cnd_quality_typ.setLinkBeans(p.Cnd_quality_typ_nm);
		p.CndPanel.add(p.Cnd_quality_typ_Label);
		p.CndPanel.add(p.Cnd_quality_typ);
		p.Cnd_quality_typ.setNextBeans(p.Cnd_quality_typ_nm);
		p.Cnd_quality_typ.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.quality_typ_META);
		p.CndPanel.add(p.Cnd_quality_typ_nm);
		p.Cnd_quality_typ_nm.setNextBeans(p.Cnd_mfg_aprv_sts_typ);
		p.Cnd_quality_typ_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.quality_typ_nm_META);
		p.Cnd_mfg_aprv_sts_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_aprv_sts_typ, true);
		p.Cnd_mfg_aprv_sts_typ.setLinkBeans(p.Cnd_mfg_aprv_sts_typ_nm);
		p.CndPanel.add(p.Cnd_mfg_aprv_sts_typ_Label);
		p.CndPanel.add(p.Cnd_mfg_aprv_sts_typ);
		p.Cnd_mfg_aprv_sts_typ.setNextBeans(p.Cnd_mfg_aprv_sts_typ_nm);
		p.Cnd_mfg_aprv_sts_typ.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.mfg_aprv_sts_typ_META);
		p.CndPanel.add(p.Cnd_mfg_aprv_sts_typ_nm);
		p.Cnd_mfg_aprv_sts_typ_nm.setNextBeans(p.Cnd_insp_aprv_sts_typ);
		p.Cnd_mfg_aprv_sts_typ_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.mfg_aprv_sts_typ_nm_META);
		p.Cnd_insp_aprv_sts_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_insp_aprv_sts_typ, true);
		p.Cnd_insp_aprv_sts_typ.setLinkBeans(p.Cnd_insp_aprv_sts_typ_nm);
		p.CndPanel.add(p.Cnd_insp_aprv_sts_typ_Label);
		p.CndPanel.add(p.Cnd_insp_aprv_sts_typ);
		p.Cnd_insp_aprv_sts_typ.setNextBeans(p.Cnd_insp_aprv_sts_typ_nm);
		p.Cnd_insp_aprv_sts_typ.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.insp_aprv_sts_typ_META);
		p.CndPanel.add(p.Cnd_insp_aprv_sts_typ_nm);
		p.Cnd_insp_aprv_sts_typ_nm.setNextBeans(p.Cnd_plnt_aprv_sts_typ);
		p.Cnd_insp_aprv_sts_typ_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.insp_aprv_sts_typ_nm_META);
		p.Cnd_plnt_aprv_sts_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_plnt_aprv_sts_typ, true);
		p.Cnd_plnt_aprv_sts_typ.setLinkBeans(p.Cnd_plnt_aprv_sts_typ_nm);
		p.CndPanel.add(p.Cnd_plnt_aprv_sts_typ_Label);
		p.CndPanel.add(p.Cnd_plnt_aprv_sts_typ);
		p.Cnd_plnt_aprv_sts_typ.setNextBeans(p.Cnd_plnt_aprv_sts_typ_nm);
		p.Cnd_plnt_aprv_sts_typ.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.plnt_aprv_sts_typ_META);
		p.CndPanel.add(p.Cnd_plnt_aprv_sts_typ_nm);
		p.Cnd_plnt_aprv_sts_typ_nm.setNextBeans(p.Cnd_mrkt_judg_sts_typ);
		p.Cnd_plnt_aprv_sts_typ_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.plnt_aprv_sts_typ_nm_META);
		p.Cnd_mrkt_judg_sts_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mrkt_judg_sts_typ, true);
		p.Cnd_mrkt_judg_sts_typ.setLinkBeans(p.Cnd_mrkt_judg_sts_typ_nm);
		p.CndPanel.add(p.Cnd_mrkt_judg_sts_typ_Label);
		p.CndPanel.add(p.Cnd_mrkt_judg_sts_typ);
		p.Cnd_mrkt_judg_sts_typ.setNextBeans(p.Cnd_mrkt_judg_sts_typ_nm);
		p.Cnd_mrkt_judg_sts_typ.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.mrkt_judg_sts_typ_META);
		p.CndPanel.add(p.Cnd_mrkt_judg_sts_typ_nm);
		p.Cnd_mrkt_judg_sts_typ_nm.setNextBeans(p.Cnd_lot_rmrks);
		p.Cnd_mrkt_judg_sts_typ_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.mrkt_judg_sts_typ_nm_META);
		p.CndPanel.add(p.Cnd_lot_rmrks_Label);
		p.CndPanel.add(p.Cnd_lot_rmrks);
		p.Cnd_lot_rmrks.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.lot_rmrks_META);
		p.setPluralValueEnable(p.Cnd_lot_rmrks, true);
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
		p.Cnd_match_typ_Group.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1010.CndR.match_typ_META);
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn(MSUAP_LotNo p) {
		// ブロック関連の初期化
		p.SrchBtnPanel.setLayoutPosition("SEC");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSUAP_LotNo p) {
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
	protected static void jbInitRslt(MSUAP_LotNo p) {
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
	protected static void jbInitBtn(MSUAP_LotNo p) {
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
		MSUAP_LotNo_MC.mcInitTop((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.mcInitCnd((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.mcInitSrchBtn((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.mcInitCtrl((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.mcInitRslt((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.mcInitBtn((MSUAP_LotNo)this);

		// [SRCH]ステータスのモードの設定
		MSUAP_LotNo_MC.statusInitSRCH_Top((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.statusInitSRCH_Cnd((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.statusInitSRCH_SrchBtn((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.statusInitSRCH_Ctrl((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.statusInitSRCH_Rslt((MSUAP_LotNo)this);
		MSUAP_LotNo_MC.statusInitSRCH_Btn((MSUAP_LotNo)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSUAP_LotNo p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSUAP_LotNo p) {
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_srch_no_stk_and_io_flg.addAllListener(p);
		p.Cnd_vld_dt_fr.setListListener(p);
		p.Cnd_vld_dt_fr.addAllListener(p);
		p.Cnd_vld_dt_to.setListListener(p);
		p.Cnd_vld_dt_to.addAllListener(p);
		p.Cnd_lmt_dt_fr.setListListener(p);
		p.Cnd_lmt_dt_fr.addAllListener(p);
		p.Cnd_lmt_dt_to.setListListener(p);
		p.Cnd_lmt_dt_to.addAllListener(p);
		p.Cnd_first_gr_dt_fr.setListListener(p);
		p.Cnd_first_gr_dt_fr.addAllListener(p);
		p.Cnd_first_gr_dt_to.setListListener(p);
		p.Cnd_first_gr_dt_to.addAllListener(p);
		p.Cnd_stk_insp_typ.setListListener(p);
		p.Cnd_stk_insp_typ.addAllListener(p);
		p.Cnd_stk_insp_typ_nm.setListListener(p);
		p.Cnd_stk_insp_typ_nm.addAllListener(p);
		p.Cnd_quality_typ.setListListener(p);
		p.Cnd_quality_typ.addAllListener(p);
		p.Cnd_quality_typ_nm.setListListener(p);
		p.Cnd_quality_typ_nm.addAllListener(p);
		p.Cnd_mfg_aprv_sts_typ.setListListener(p);
		p.Cnd_mfg_aprv_sts_typ.addAllListener(p);
		p.Cnd_mfg_aprv_sts_typ_nm.setListListener(p);
		p.Cnd_mfg_aprv_sts_typ_nm.addAllListener(p);
		p.Cnd_insp_aprv_sts_typ.setListListener(p);
		p.Cnd_insp_aprv_sts_typ.addAllListener(p);
		p.Cnd_insp_aprv_sts_typ_nm.setListListener(p);
		p.Cnd_insp_aprv_sts_typ_nm.addAllListener(p);
		p.Cnd_plnt_aprv_sts_typ.setListListener(p);
		p.Cnd_plnt_aprv_sts_typ.addAllListener(p);
		p.Cnd_plnt_aprv_sts_typ_nm.setListListener(p);
		p.Cnd_plnt_aprv_sts_typ_nm.addAllListener(p);
		p.Cnd_mrkt_judg_sts_typ.setListListener(p);
		p.Cnd_mrkt_judg_sts_typ.addAllListener(p);
		p.Cnd_mrkt_judg_sts_typ_nm.setListListener(p);
		p.Cnd_mrkt_judg_sts_typ_nm.addAllListener(p);
		p.Cnd_lot_rmrks.setListListener(p);
		p.Cnd_lot_rmrks.addAllListener(p);
		p.Cnd_match_typ_Group.addAllListener(p);
		p.Cnd_match_typ_0.addAllListener(p);
		p.Cnd_match_typ_1.addAllListener(p);
		p.Cnd_match_typ_2.addAllListener(p);
		p.Cnd_match_typ_3.addAllListener(p);
	}

	/**
	 *  [SrchBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn(MSUAP_LotNo p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSUAP_LotNo p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSUAP_LotNo p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_lot_no.addAllListener(p);
		p.columnRslt_lot_no.setListListener(p);
		p.columnRslt_sublot_no.addAllListener(p);
		p.columnRslt_sublot_no.setListListener(p);
		p.columnRslt_bp_lot_no.addAllListener(p);
		p.columnRslt_bp_lot_no.setListListener(p);
		p.columnRslt_first_gr_dt.addAllListener(p);
		p.columnRslt_first_gr_dt.setListListener(p);
		p.columnRslt_vld_dt.addAllListener(p);
		p.columnRslt_vld_dt.setListListener(p);
		p.columnRslt_lmt_dt.addAllListener(p);
		p.columnRslt_lmt_dt.setListListener(p);
		p.columnRslt_lmt_dt_frm.addAllListener(p);
		p.columnRslt_lmt_dt_frm.setListListener(p);
		p.columnRslt_stk_insp_typ.addAllListener(p);
		p.columnRslt_stk_insp_typ.setListListener(p);
		p.columnRslt_stk_insp_typ_nm.addAllListener(p);
		p.columnRslt_stk_insp_typ_nm.setListListener(p);
		p.columnRslt_quality_typ.addAllListener(p);
		p.columnRslt_quality_typ.setListListener(p);
		p.columnRslt_quality_typ_nm.addAllListener(p);
		p.columnRslt_quality_typ_nm.setListListener(p);
		p.columnRslt_mfg_aprv_sts_typ.addAllListener(p);
		p.columnRslt_mfg_aprv_sts_typ.setListListener(p);
		p.columnRslt_mfg_aprv_sts_typ_nm.addAllListener(p);
		p.columnRslt_mfg_aprv_sts_typ_nm.setListListener(p);
		p.columnRslt_insp_aprv_sts_typ.addAllListener(p);
		p.columnRslt_insp_aprv_sts_typ.setListListener(p);
		p.columnRslt_insp_aprv_sts_typ_nm.addAllListener(p);
		p.columnRslt_insp_aprv_sts_typ_nm.setListListener(p);
		p.columnRslt_plnt_aprv_sts_typ.addAllListener(p);
		p.columnRslt_plnt_aprv_sts_typ.setListListener(p);
		p.columnRslt_plnt_aprv_sts_typ_nm.addAllListener(p);
		p.columnRslt_plnt_aprv_sts_typ_nm.setListListener(p);
		p.columnRslt_mrkt_judg_sts_typ.addAllListener(p);
		p.columnRslt_mrkt_judg_sts_typ.setListListener(p);
		p.columnRslt_mrkt_judg_sts_typ_nm.addAllListener(p);
		p.columnRslt_mrkt_judg_sts_typ_nm.setListListener(p);
		p.columnRslt_act_cont_fctr.addAllListener(p);
		p.columnRslt_act_cont_fctr.setListListener(p);
		p.columnRslt_lmt_dt_frm_typ.addAllListener(p);
		p.columnRslt_lmt_dt_frm_typ.setListListener(p);
		p.columnRslt_lmt_dt_frm_typ_nm.addAllListener(p);
		p.columnRslt_lmt_dt_frm_typ_nm.setListListener(p);
		p.columnRslt_lot_seq.addAllListener(p);
		p.columnRslt_lot_seq.setListListener(p);
		p.columnRslt_lot_rmrks.addAllListener(p);
		p.columnRslt_lot_rmrks.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSUAP_LotNo p) {
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
	protected static void statusInitSRCH_Top(MSUAP_LotNo p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSUAP_LotNo p){
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_srch_no_stk_and_io_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_vld_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lmt_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lmt_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_first_gr_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_first_gr_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_stk_insp_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_stk_insp_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_quality_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_insp_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_plnt_aprv_sts_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_plnt_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_mrkt_judg_sts_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mrkt_judg_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_lot_rmrks.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchBtn(MSUAP_LotNo p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSUAP_LotNo p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSUAP_LotNo p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnRslt_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_first_gr_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act_cont_fctr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSUAP_LotNo p){
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
		MSUAP_LotNo_MC.setTableConfigRslt((MSUAP_LotNo)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSUAP_LotNo p) {
		p.columnRslt_check.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_lot_no.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.RsltTable.addTable(p.Rslt_ver_no_p_PPanel.VerNoTable);
		p.columnRslt_bp_lot_no.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.bp_lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_lot_no);
		p.columnRslt_first_gr_dt.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.first_gr_dt_META);
		p.columnRslt_first_gr_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_first_gr_dt);
		p.columnRslt_vld_dt.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.vld_dt_META);
		p.columnRslt_vld_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_vld_dt);
		p.columnRslt_lmt_dt.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.lmt_dt_META);
		p.columnRslt_lmt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_lmt_dt);
		p.columnRslt_lmt_dt_frm.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.lmt_dt_frm_META);
		p.columnRslt_lmt_dt_frm.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_lmt_dt_frm);
		p.columnRslt_stk_insp_typ.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.stk_insp_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ);
		p.columnRslt_stk_insp_typ_nm.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.stk_insp_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ_nm);
		p.columnRslt_quality_typ.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.quality_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ);
		p.columnRslt_quality_typ_nm.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.quality_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ_nm);
		p.columnRslt_mfg_aprv_sts_typ.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.mfg_aprv_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_aprv_sts_typ);
		p.columnRslt_mfg_aprv_sts_typ_nm.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.mfg_aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_aprv_sts_typ_nm);
		p.columnRslt_insp_aprv_sts_typ.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.insp_aprv_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_aprv_sts_typ);
		p.columnRslt_insp_aprv_sts_typ_nm.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.insp_aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_aprv_sts_typ_nm);
		p.columnRslt_plnt_aprv_sts_typ.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.plnt_aprv_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_plnt_aprv_sts_typ);
		p.columnRslt_plnt_aprv_sts_typ_nm.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.plnt_aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_plnt_aprv_sts_typ_nm);
		p.columnRslt_mrkt_judg_sts_typ.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.mrkt_judg_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mrkt_judg_sts_typ);
		p.columnRslt_mrkt_judg_sts_typ_nm.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.mrkt_judg_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mrkt_judg_sts_typ_nm);
		p.columnRslt_act_cont_fctr.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.act_cont_fctr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_cont_fctr);
		p.columnRslt_lmt_dt_frm_typ.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.lmt_dt_frm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lmt_dt_frm_typ);
		p.columnRslt_lmt_dt_frm_typ_nm.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.lmt_dt_frm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lmt_dt_frm_typ_nm);
		p.columnRslt_lot_seq.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.lot_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_seq);
		p.columnRslt_lot_rmrks.setMeta(mcframe.clientMSUA.MSUAP1010.RsltR.lot_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_rmrks);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_stk_insp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_stk_insp_typ.getListConfig().setPutter(getCnd_stk_insp_typ_ListPutter());
		Cnd_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_quality_typ.getListConfig().setPutter(getCnd_quality_typ_ListPutter());
		Cnd_mfg_aprv_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_aprv_sts_typ.getListConfig().setPutter(getCnd_mfg_aprv_sts_typ_ListPutter());
		Cnd_insp_aprv_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_insp_aprv_sts_typ.getListConfig().setPutter(getCnd_insp_aprv_sts_typ_ListPutter());
		Cnd_plnt_aprv_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_plnt_aprv_sts_typ.getListConfig().setPutter(getCnd_plnt_aprv_sts_typ_ListPutter());
		Cnd_mrkt_judg_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mrkt_judg_sts_typ.getListConfig().setPutter(getCnd_mrkt_judg_sts_typ_ListPutter());
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
	 * [Cnd_stk_insp_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_stk_insp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.StkInspTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_quality_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_quality_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.QualityTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_aprv_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_aprv_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.MfgAprvStsTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_insp_aprv_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_insp_aprv_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.InspAprvStsTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_plnt_aprv_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_plnt_aprv_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.PlntAprvStsTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_mrkt_judg_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mrkt_judg_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.MrktJudgStsTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_stk_insp_typ) return getCnd_stk_insp_typ(row, info);
		if(combo == Cnd_quality_typ) return getCnd_quality_typ(row, info);
		if(combo == Cnd_mfg_aprv_sts_typ) return getCnd_mfg_aprv_sts_typ(row, info);
		if(combo == Cnd_insp_aprv_sts_typ) return getCnd_insp_aprv_sts_typ(row, info);
		if(combo == Cnd_plnt_aprv_sts_typ) return getCnd_plnt_aprv_sts_typ(row, info);
		if(combo == Cnd_mrkt_judg_sts_typ) return getCnd_mrkt_judg_sts_typ(row, info);
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
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_srch_no_stk_and_io_flg) return doCnd_srch_no_stk_and_io_flg_VC(info);
		if (vc == Cnd_vld_dt_fr) return doCnd_vld_dt_fr_VC(info);
		if (vc == Cnd_vld_dt_to) return doCnd_vld_dt_to_VC(info);
		if (vc == Cnd_lmt_dt_fr) return doCnd_lmt_dt_fr_VC(info);
		if (vc == Cnd_lmt_dt_to) return doCnd_lmt_dt_to_VC(info);
		if (vc == Cnd_first_gr_dt_fr) return doCnd_first_gr_dt_fr_VC(info);
		if (vc == Cnd_first_gr_dt_to) return doCnd_first_gr_dt_to_VC(info);
		if (vc == Cnd_stk_insp_typ) return doCnd_stk_insp_typ_VC(info);
		if (vc == Cnd_stk_insp_typ_nm) return doCnd_stk_insp_typ_nm_VC(info);
		if (vc == Cnd_quality_typ) return doCnd_quality_typ_VC(info);
		if (vc == Cnd_quality_typ_nm) return doCnd_quality_typ_nm_VC(info);
		if (vc == Cnd_mfg_aprv_sts_typ) return doCnd_mfg_aprv_sts_typ_VC(info);
		if (vc == Cnd_mfg_aprv_sts_typ_nm) return doCnd_mfg_aprv_sts_typ_nm_VC(info);
		if (vc == Cnd_insp_aprv_sts_typ) return doCnd_insp_aprv_sts_typ_VC(info);
		if (vc == Cnd_insp_aprv_sts_typ_nm) return doCnd_insp_aprv_sts_typ_nm_VC(info);
		if (vc == Cnd_plnt_aprv_sts_typ) return doCnd_plnt_aprv_sts_typ_VC(info);
		if (vc == Cnd_plnt_aprv_sts_typ_nm) return doCnd_plnt_aprv_sts_typ_nm_VC(info);
		if (vc == Cnd_mrkt_judg_sts_typ) return doCnd_mrkt_judg_sts_typ_VC(info);
		if (vc == Cnd_mrkt_judg_sts_typ_nm) return doCnd_mrkt_judg_sts_typ_nm_VC(info);
		if (vc == Cnd_lot_rmrks) return doCnd_lot_rmrks_VC(info);
		if (vc == Cnd_match_typ_Group) return doCnd_match_typ_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_bp_lot_no) return doRslt_bp_lot_no_VC(info);
		if (vc == columnRslt_first_gr_dt) return doRslt_first_gr_dt_VC(info);
		if (vc == columnRslt_vld_dt) return doRslt_vld_dt_VC(info);
		if (vc == columnRslt_lmt_dt) return doRslt_lmt_dt_VC(info);
		if (vc == columnRslt_lmt_dt_frm) return doRslt_lmt_dt_frm_VC(info);
		if (vc == columnRslt_stk_insp_typ) return doRslt_stk_insp_typ_VC(info);
		if (vc == columnRslt_stk_insp_typ_nm) return doRslt_stk_insp_typ_nm_VC(info);
		if (vc == columnRslt_quality_typ) return doRslt_quality_typ_VC(info);
		if (vc == columnRslt_quality_typ_nm) return doRslt_quality_typ_nm_VC(info);
		if (vc == columnRslt_mfg_aprv_sts_typ) return doRslt_mfg_aprv_sts_typ_VC(info);
		if (vc == columnRslt_mfg_aprv_sts_typ_nm) return doRslt_mfg_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_insp_aprv_sts_typ) return doRslt_insp_aprv_sts_typ_VC(info);
		if (vc == columnRslt_insp_aprv_sts_typ_nm) return doRslt_insp_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_plnt_aprv_sts_typ) return doRslt_plnt_aprv_sts_typ_VC(info);
		if (vc == columnRslt_plnt_aprv_sts_typ_nm) return doRslt_plnt_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_mrkt_judg_sts_typ) return doRslt_mrkt_judg_sts_typ_VC(info);
		if (vc == columnRslt_mrkt_judg_sts_typ_nm) return doRslt_mrkt_judg_sts_typ_nm_VC(info);
		if (vc == columnRslt_act_cont_fctr) return doRslt_act_cont_fctr_VC(info);
		if (vc == columnRslt_lmt_dt_frm_typ) return doRslt_lmt_dt_frm_typ_VC(info);
		if (vc == columnRslt_lmt_dt_frm_typ_nm) return doRslt_lmt_dt_frm_typ_nm_VC(info);
		if (vc == columnRslt_lot_seq) return doRslt_lot_seq_VC(info);
		if (vc == columnRslt_lot_rmrks) return doRslt_lot_rmrks_VC(info);
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
	 * [Cnd]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[srch_no_stk_and_io_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_no_stk_and_io_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_vld_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_vld_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lmt_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lmt_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lmt_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lmt_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_first_gr_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_first_gr_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_insp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[plnt_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_plnt_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[plnt_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_plnt_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mrkt_judg_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mrkt_judg_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_first_gr_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[vld_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_vld_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lmt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lmt_dt_frm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_insp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_plnt_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_plnt_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mrkt_judg_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mrkt_judg_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_cont_fctr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_cont_fctr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lmt_dt_frm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lmt_dt_frm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_rmrks_VC(MCEventInfo info){
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
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_srch_no_stk_and_io_flg) doCnd_srch_no_stk_and_io_flg_NC(info);
		else if (nc == Cnd_vld_dt_fr) doCnd_vld_dt_fr_NC(info);
		else if (nc == Cnd_vld_dt_to) doCnd_vld_dt_to_NC(info);
		else if (nc == Cnd_lmt_dt_fr) doCnd_lmt_dt_fr_NC(info);
		else if (nc == Cnd_lmt_dt_to) doCnd_lmt_dt_to_NC(info);
		else if (nc == Cnd_first_gr_dt_fr) doCnd_first_gr_dt_fr_NC(info);
		else if (nc == Cnd_first_gr_dt_to) doCnd_first_gr_dt_to_NC(info);
		else if (nc == Cnd_stk_insp_typ) doCnd_stk_insp_typ_NC(info);
		else if (nc == Cnd_stk_insp_typ_nm) doCnd_stk_insp_typ_nm_NC(info);
		else if (nc == Cnd_quality_typ) doCnd_quality_typ_NC(info);
		else if (nc == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NC(info);
		else if (nc == Cnd_mfg_aprv_sts_typ) doCnd_mfg_aprv_sts_typ_NC(info);
		else if (nc == Cnd_mfg_aprv_sts_typ_nm) doCnd_mfg_aprv_sts_typ_nm_NC(info);
		else if (nc == Cnd_insp_aprv_sts_typ) doCnd_insp_aprv_sts_typ_NC(info);
		else if (nc == Cnd_insp_aprv_sts_typ_nm) doCnd_insp_aprv_sts_typ_nm_NC(info);
		else if (nc == Cnd_plnt_aprv_sts_typ) doCnd_plnt_aprv_sts_typ_NC(info);
		else if (nc == Cnd_plnt_aprv_sts_typ_nm) doCnd_plnt_aprv_sts_typ_nm_NC(info);
		else if (nc == Cnd_mrkt_judg_sts_typ) doCnd_mrkt_judg_sts_typ_NC(info);
		else if (nc == Cnd_mrkt_judg_sts_typ_nm) doCnd_mrkt_judg_sts_typ_nm_NC(info);
		else if (nc == Cnd_lot_rmrks) doCnd_lot_rmrks_NC(info);
		else if (nc == Cnd_match_typ_Group) doCnd_match_typ_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_bp_lot_no) doRslt_bp_lot_no_NC(info);
		else if (nc == columnRslt_first_gr_dt) doRslt_first_gr_dt_NC(info);
		else if (nc == columnRslt_vld_dt) doRslt_vld_dt_NC(info);
		else if (nc == columnRslt_lmt_dt) doRslt_lmt_dt_NC(info);
		else if (nc == columnRslt_lmt_dt_frm) doRslt_lmt_dt_frm_NC(info);
		else if (nc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NC(info);
		else if (nc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NC(info);
		else if (nc == columnRslt_quality_typ) doRslt_quality_typ_NC(info);
		else if (nc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NC(info);
		else if (nc == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_insp_aprv_sts_typ) doRslt_insp_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_insp_aprv_sts_typ_nm) doRslt_insp_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_plnt_aprv_sts_typ) doRslt_plnt_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_plnt_aprv_sts_typ_nm) doRslt_plnt_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_mrkt_judg_sts_typ) doRslt_mrkt_judg_sts_typ_NC(info);
		else if (nc == columnRslt_mrkt_judg_sts_typ_nm) doRslt_mrkt_judg_sts_typ_nm_NC(info);
		else if (nc == columnRslt_act_cont_fctr) doRslt_act_cont_fctr_NC(info);
		else if (nc == columnRslt_lmt_dt_frm_typ) doRslt_lmt_dt_frm_typ_NC(info);
		else if (nc == columnRslt_lmt_dt_frm_typ_nm) doRslt_lmt_dt_frm_typ_nm_NC(info);
		else if (nc == columnRslt_lot_seq) doRslt_lot_seq_NC(info);
		else if (nc == columnRslt_lot_rmrks) doRslt_lot_rmrks_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_no_stk_and_io_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_no_stk_and_io_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_insp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[plnt_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_plnt_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[plnt_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_plnt_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrkt_judg_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrkt_judg_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_first_gr_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_cont_fctr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_cont_fctr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_NC(MCEventInfo info){
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
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_srch_no_stk_and_io_flg) doCnd_srch_no_stk_and_io_flg_NE(info);
		else if (ne == Cnd_vld_dt_fr) doCnd_vld_dt_fr_NE(info);
		else if (ne == Cnd_vld_dt_to) doCnd_vld_dt_to_NE(info);
		else if (ne == Cnd_lmt_dt_fr) doCnd_lmt_dt_fr_NE(info);
		else if (ne == Cnd_lmt_dt_to) doCnd_lmt_dt_to_NE(info);
		else if (ne == Cnd_first_gr_dt_fr) doCnd_first_gr_dt_fr_NE(info);
		else if (ne == Cnd_first_gr_dt_to) doCnd_first_gr_dt_to_NE(info);
		else if (ne == Cnd_stk_insp_typ) doCnd_stk_insp_typ_NE(info);
		else if (ne == Cnd_stk_insp_typ_nm) doCnd_stk_insp_typ_nm_NE(info);
		else if (ne == Cnd_quality_typ) doCnd_quality_typ_NE(info);
		else if (ne == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NE(info);
		else if (ne == Cnd_mfg_aprv_sts_typ) doCnd_mfg_aprv_sts_typ_NE(info);
		else if (ne == Cnd_mfg_aprv_sts_typ_nm) doCnd_mfg_aprv_sts_typ_nm_NE(info);
		else if (ne == Cnd_insp_aprv_sts_typ) doCnd_insp_aprv_sts_typ_NE(info);
		else if (ne == Cnd_insp_aprv_sts_typ_nm) doCnd_insp_aprv_sts_typ_nm_NE(info);
		else if (ne == Cnd_plnt_aprv_sts_typ) doCnd_plnt_aprv_sts_typ_NE(info);
		else if (ne == Cnd_plnt_aprv_sts_typ_nm) doCnd_plnt_aprv_sts_typ_nm_NE(info);
		else if (ne == Cnd_mrkt_judg_sts_typ) doCnd_mrkt_judg_sts_typ_NE(info);
		else if (ne == Cnd_mrkt_judg_sts_typ_nm) doCnd_mrkt_judg_sts_typ_nm_NE(info);
		else if (ne == Cnd_lot_rmrks) doCnd_lot_rmrks_NE(info);
		else if (ne == Cnd_match_typ_Group) doCnd_match_typ_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_bp_lot_no) doRslt_bp_lot_no_NE(info);
		else if (ne == columnRslt_first_gr_dt) doRslt_first_gr_dt_NE(info);
		else if (ne == columnRslt_vld_dt) doRslt_vld_dt_NE(info);
		else if (ne == columnRslt_lmt_dt) doRslt_lmt_dt_NE(info);
		else if (ne == columnRslt_lmt_dt_frm) doRslt_lmt_dt_frm_NE(info);
		else if (ne == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NE(info);
		else if (ne == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NE(info);
		else if (ne == columnRslt_quality_typ) doRslt_quality_typ_NE(info);
		else if (ne == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NE(info);
		else if (ne == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_insp_aprv_sts_typ) doRslt_insp_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_insp_aprv_sts_typ_nm) doRslt_insp_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_plnt_aprv_sts_typ) doRslt_plnt_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_plnt_aprv_sts_typ_nm) doRslt_plnt_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_mrkt_judg_sts_typ) doRslt_mrkt_judg_sts_typ_NE(info);
		else if (ne == columnRslt_mrkt_judg_sts_typ_nm) doRslt_mrkt_judg_sts_typ_nm_NE(info);
		else if (ne == columnRslt_act_cont_fctr) doRslt_act_cont_fctr_NE(info);
		else if (ne == columnRslt_lmt_dt_frm_typ) doRslt_lmt_dt_frm_typ_NE(info);
		else if (ne == columnRslt_lmt_dt_frm_typ_nm) doRslt_lmt_dt_frm_typ_nm_NE(info);
		else if (ne == columnRslt_lot_seq) doRslt_lot_seq_NE(info);
		else if (ne == columnRslt_lot_rmrks) doRslt_lot_rmrks_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_no_stk_and_io_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_no_stk_and_io_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_insp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[plnt_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_plnt_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[plnt_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_plnt_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrkt_judg_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrkt_judg_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_first_gr_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_cont_fctr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_cont_fctr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_NE(MCEventInfo info){
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
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_srch_no_stk_and_io_flg) doCnd_srch_no_stk_and_io_flg_NX(info);
		else if (nx == Cnd_vld_dt_fr) doCnd_vld_dt_fr_NX(info);
		else if (nx == Cnd_vld_dt_to) doCnd_vld_dt_to_NX(info);
		else if (nx == Cnd_lmt_dt_fr) doCnd_lmt_dt_fr_NX(info);
		else if (nx == Cnd_lmt_dt_to) doCnd_lmt_dt_to_NX(info);
		else if (nx == Cnd_first_gr_dt_fr) doCnd_first_gr_dt_fr_NX(info);
		else if (nx == Cnd_first_gr_dt_to) doCnd_first_gr_dt_to_NX(info);
		else if (nx == Cnd_stk_insp_typ) doCnd_stk_insp_typ_NX(info);
		else if (nx == Cnd_stk_insp_typ_nm) doCnd_stk_insp_typ_nm_NX(info);
		else if (nx == Cnd_quality_typ) doCnd_quality_typ_NX(info);
		else if (nx == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NX(info);
		else if (nx == Cnd_mfg_aprv_sts_typ) doCnd_mfg_aprv_sts_typ_NX(info);
		else if (nx == Cnd_mfg_aprv_sts_typ_nm) doCnd_mfg_aprv_sts_typ_nm_NX(info);
		else if (nx == Cnd_insp_aprv_sts_typ) doCnd_insp_aprv_sts_typ_NX(info);
		else if (nx == Cnd_insp_aprv_sts_typ_nm) doCnd_insp_aprv_sts_typ_nm_NX(info);
		else if (nx == Cnd_plnt_aprv_sts_typ) doCnd_plnt_aprv_sts_typ_NX(info);
		else if (nx == Cnd_plnt_aprv_sts_typ_nm) doCnd_plnt_aprv_sts_typ_nm_NX(info);
		else if (nx == Cnd_mrkt_judg_sts_typ) doCnd_mrkt_judg_sts_typ_NX(info);
		else if (nx == Cnd_mrkt_judg_sts_typ_nm) doCnd_mrkt_judg_sts_typ_nm_NX(info);
		else if (nx == Cnd_lot_rmrks) doCnd_lot_rmrks_NX(info);
		else if (nx == Cnd_match_typ_Group) doCnd_match_typ_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_bp_lot_no) doRslt_bp_lot_no_NX(info);
		else if (nx == columnRslt_first_gr_dt) doRslt_first_gr_dt_NX(info);
		else if (nx == columnRslt_vld_dt) doRslt_vld_dt_NX(info);
		else if (nx == columnRslt_lmt_dt) doRslt_lmt_dt_NX(info);
		else if (nx == columnRslt_lmt_dt_frm) doRslt_lmt_dt_frm_NX(info);
		else if (nx == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NX(info);
		else if (nx == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NX(info);
		else if (nx == columnRslt_quality_typ) doRslt_quality_typ_NX(info);
		else if (nx == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NX(info);
		else if (nx == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_insp_aprv_sts_typ) doRslt_insp_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_insp_aprv_sts_typ_nm) doRslt_insp_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_plnt_aprv_sts_typ) doRslt_plnt_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_plnt_aprv_sts_typ_nm) doRslt_plnt_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_mrkt_judg_sts_typ) doRslt_mrkt_judg_sts_typ_NX(info);
		else if (nx == columnRslt_mrkt_judg_sts_typ_nm) doRslt_mrkt_judg_sts_typ_nm_NX(info);
		else if (nx == columnRslt_act_cont_fctr) doRslt_act_cont_fctr_NX(info);
		else if (nx == columnRslt_lmt_dt_frm_typ) doRslt_lmt_dt_frm_typ_NX(info);
		else if (nx == columnRslt_lmt_dt_frm_typ_nm) doRslt_lmt_dt_frm_typ_nm_NX(info);
		else if (nx == columnRslt_lot_seq) doRslt_lot_seq_NX(info);
		else if (nx == columnRslt_lot_rmrks) doRslt_lot_rmrks_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_no_stk_and_io_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_no_stk_and_io_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_insp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[plnt_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_plnt_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[plnt_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_plnt_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrkt_judg_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrkt_judg_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_first_gr_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_cont_fctr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_cont_fctr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_vld_dt_fr) doCnd_vld_dt_fr_LC(info);
		else if (lc == Cnd_vld_dt_to) doCnd_vld_dt_to_LC(info);
		else if (lc == Cnd_lmt_dt_fr) doCnd_lmt_dt_fr_LC(info);
		else if (lc == Cnd_lmt_dt_to) doCnd_lmt_dt_to_LC(info);
		else if (lc == Cnd_first_gr_dt_fr) doCnd_first_gr_dt_fr_LC(info);
		else if (lc == Cnd_first_gr_dt_to) doCnd_first_gr_dt_to_LC(info);
		else if (lc == Cnd_stk_insp_typ) doCnd_stk_insp_typ_LC(info);
		else if (lc == Cnd_stk_insp_typ_nm) doCnd_stk_insp_typ_nm_LC(info);
		else if (lc == Cnd_quality_typ) doCnd_quality_typ_LC(info);
		else if (lc == Cnd_quality_typ_nm) doCnd_quality_typ_nm_LC(info);
		else if (lc == Cnd_mfg_aprv_sts_typ) doCnd_mfg_aprv_sts_typ_LC(info);
		else if (lc == Cnd_mfg_aprv_sts_typ_nm) doCnd_mfg_aprv_sts_typ_nm_LC(info);
		else if (lc == Cnd_insp_aprv_sts_typ) doCnd_insp_aprv_sts_typ_LC(info);
		else if (lc == Cnd_insp_aprv_sts_typ_nm) doCnd_insp_aprv_sts_typ_nm_LC(info);
		else if (lc == Cnd_plnt_aprv_sts_typ) doCnd_plnt_aprv_sts_typ_LC(info);
		else if (lc == Cnd_plnt_aprv_sts_typ_nm) doCnd_plnt_aprv_sts_typ_nm_LC(info);
		else if (lc == Cnd_mrkt_judg_sts_typ) doCnd_mrkt_judg_sts_typ_LC(info);
		else if (lc == Cnd_mrkt_judg_sts_typ_nm) doCnd_mrkt_judg_sts_typ_nm_LC(info);
		else if (lc == Cnd_lot_rmrks) doCnd_lot_rmrks_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_bp_lot_no) doRslt_bp_lot_no_LC(info);
		else if (lc == columnRslt_first_gr_dt) doRslt_first_gr_dt_LC(info);
		else if (lc == columnRslt_vld_dt) doRslt_vld_dt_LC(info);
		else if (lc == columnRslt_lmt_dt) doRslt_lmt_dt_LC(info);
		else if (lc == columnRslt_lmt_dt_frm) doRslt_lmt_dt_frm_LC(info);
		else if (lc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_LC(info);
		else if (lc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_LC(info);
		else if (lc == columnRslt_quality_typ) doRslt_quality_typ_LC(info);
		else if (lc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_LC(info);
		else if (lc == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRslt_insp_aprv_sts_typ) doRslt_insp_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_insp_aprv_sts_typ_nm) doRslt_insp_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRslt_plnt_aprv_sts_typ) doRslt_plnt_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_plnt_aprv_sts_typ_nm) doRslt_plnt_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRslt_mrkt_judg_sts_typ) doRslt_mrkt_judg_sts_typ_LC(info);
		else if (lc == columnRslt_mrkt_judg_sts_typ_nm) doRslt_mrkt_judg_sts_typ_nm_LC(info);
		else if (lc == columnRslt_act_cont_fctr) doRslt_act_cont_fctr_LC(info);
		else if (lc == columnRslt_lmt_dt_frm_typ) doRslt_lmt_dt_frm_typ_LC(info);
		else if (lc == columnRslt_lmt_dt_frm_typ_nm) doRslt_lmt_dt_frm_typ_nm_LC(info);
		else if (lc == columnRslt_lot_seq) doRslt_lot_seq_LC(info);
		else if (lc == columnRslt_lot_rmrks) doRslt_lot_rmrks_LC(info);
	}

	/**
	 * [Cnd]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_insp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[plnt_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_plnt_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[plnt_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_plnt_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrkt_judg_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrkt_judg_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_first_gr_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_cont_fctr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_cont_fctr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_stk_insp_typ]の作成メソッド
	 */
	public MCList getCnd_stk_insp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStkInspTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_quality_typ]の作成メソッド
	 */
	public MCList getCnd_quality_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getQualityTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_aprv_sts_typ]の作成メソッド
	 */
	public MCList getCnd_mfg_aprv_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getMfgAprvStsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_insp_aprv_sts_typ]の作成メソッド
	 */
	public MCList getCnd_insp_aprv_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getInspAprvStsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_plnt_aprv_sts_typ]の作成メソッド
	 */
	public MCList getCnd_plnt_aprv_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getPlntAprvStsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mrkt_judg_sts_typ]の作成メソッド
	 */
	public MCList getCnd_mrkt_judg_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getMrktJudgStsTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}