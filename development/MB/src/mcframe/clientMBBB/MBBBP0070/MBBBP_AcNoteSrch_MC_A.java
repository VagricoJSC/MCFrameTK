package mcframe.clientMBBB.MBBBP0070;

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
import mcframe.clientMBBB.MBBBP0070.MBBBP_AcNoteSrch_MC.MB_MBBBL0070_Srch01Caller;

/**
 * 画面"MBBBP_AcNoteSrch"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBBP_AcNoteSrch_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MBBBP0070";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_ac_ym_fr_Label = null;
	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym_fr = null;
	public MCLabel Cnd_ac_ym_to_Label = null;
	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym_to = null;
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
	public MCLabel Cnd_note_no_Label = null;
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public MCTextField Cnd_note_no = null;
	public MCLabel Cnd_note_rsn_cd_Label = null;
	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_note_rsn_cd = null;
	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public MCTextField Cnd_note_rsn_nm = null;
	public MCLabel Cnd_dpt_cd_Label = null;
	/**
	 * Receiving dept. cd. 受入部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_dpt_cd = null;
	/**
	 * Receiving dept. name 受入部門名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_nm = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMBBB.MBBBP0070.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_data_no = null;
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
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_ym = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_dt = null;
	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_rsn_cd = null;
	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_rsn_nm = null;
	/**
	 * Receiving dept. cd. 受入部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_cd = null;
	/**
	 * Receiving dept. name 受入部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_nm = null;
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcst_cd = null;
	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcst_nm = null;
	/**
	 * Foreign transaction 国外取引.<p>
	 *
	 */
	public MCColumnConfig columnRslt_foreign_flg = null;
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_nm = null;
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_amt = null;
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_tax_amt = null;
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_nm = null;
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_amt = null;
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_tax_amt = null;
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_cd = null;
	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_nm = null;
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate = null;
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_no = null;
	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_typ = null;
	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_typ_nm = null;
	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_draw_dt = null;
	/**
	 * Maturity date 満期日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_due_dt = null;
	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_cd = null;
	/**
	 * Bank name 銀行名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_nm = null;
	/**
	 * Bank branch cd. 銀行支店ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_branch_cd = null;
	/**
	 * Bank branch name 銀行支店名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_branch_nm = null;
	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_drawer_nm = null;
	/**
	 * Endorser 1 裏書人１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_endrsr1 = null;
	/**
	 * Endorser 2 裏書人２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_endrsr2 = null;
	/**
	 * Endorser 3 裏書人３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_endrsr3 = null;
	/**
	 * Endorser 4 裏書人４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_endrsr4 = null;
	/**
	 * Endorser 5 裏書人５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_endrsr5 = null;
	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public MCColumnConfig columnRslt_accptr = null;
	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char1 = null;
	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char2 = null;
	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char3 = null;
	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char4 = null;
	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char5 = null;
	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char6 = null;
	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char7 = null;
	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char8 = null;
	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char9 = null;
	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char10 = null;
	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_num1 = null;
	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_num2 = null;
	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_num3 = null;
	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dt1 = null;
	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dt2 = null;
	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dt3 = null;
	/**
	 * Processed 処理済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fin_flg = null;
	/**
	 * Process No. 処理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_proc_no = null;
	/**
	 * Slip group ID 伝票グループＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slip_cnt_id = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_srv_req_no = null;
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
	
	/** [MB_MBBBL0070_Srch01]のCallerの作成 */
	protected MBBBP_AcNoteSrch_MC.MB_MBBBL0070_Srch01Caller createMB_MBBBL0070_Srch01() {
		MBBBP_AcNoteSrch_MC.MB_MBBBL0070_Srch01Caller<MBBBP_AcNoteSrch, MB_MBBBL0070_Srch01Bridge>
		caller = ((MBBBP_AcNoteSrch_MC)this).new MB_MBBBL0070_Srch01Caller<MBBBP_AcNoteSrch, MB_MBBBL0070_Srch01Bridge>(
					(MBBBP_AcNoteSrch)this, new MB_MBBBL0070_Srch01Bridge());
		return caller;
	}
	/** [MB_MBBBL0070_Srch01]の呼び出し */
	protected void callMB_MBBBL0070_Srch01() {
		MCCaller caller = createMB_MBBBL0070_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMBBB.MBBBP0070.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBB.MBBBP0070.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMBBB.MBBBP0070.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBB.MBBBP0070.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBB.MBBBP0070.CndR createCndR() {
		return mcframe.clientMBBB.MBBBP0070.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMBBB.MBBBP0070.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBB.MBBBP0070.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMBBB.MBBBP0070.RsltR createRsltR() {
		return mcframe.clientMBBB.MBBBP0070.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBB.MBBBP0070.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMBBB.MBBBP0070.RsltR.class);
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
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBBP_AcNoteSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBBP_AcNoteSrch_MC_A(String name) {
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
		MBBBP_AcNoteSrch_MC.jbCreateTop((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.jbCreateFold((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.jbCreateCnd((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.jbCreateCtrl((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.jbCreateRslt((MBBBP_AcNoteSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MBBBP_AcNoteSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MBBBP_AcNoteSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBBP_AcNoteSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MBBBP_AcNoteSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MBBBP_AcNoteSrch p) {
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
	
	
	/** [Cnd_note_rsn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_note_rsn_cd_p = null;

	/**
	 * [Cnd_note_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_note_rsn_cd_ListPutter() {
		if (Cnd_note_rsn_cd_p == null) {
			Cnd_note_rsn_cd_p = createCnd_note_rsn_cd_ListPutter(Cnd_note_rsn_cd, "note_rsn_cd", "note_rsn_nm");

		}
		return Cnd_note_rsn_cd_p;
	}
	
	
	/** [Cnd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dpt_cd_p = null;

	/**
	 * [Cnd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dpt_cd_ListPutter() {
		if (Cnd_dpt_cd_p == null) {
			Cnd_dpt_cd_p = createCnd_dpt_cd_ListPutter(Cnd_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return Cnd_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBBP_AcNoteSrch create(){
		MBBBP_AcNoteSrch p = new MBBBP_AcNoteSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBBP_AcNoteSrch create(String name){
		MBBBP_AcNoteSrch p = new MBBBP_AcNoteSrch(name);
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
		MBBBP_AcNoteSrch_MC.jbfInitTop((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.jbfInitFold((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.jbfInitCnd((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.jbfInitCtrl((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.jbfInitRslt((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.jbInitTop((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.jbInitFold((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.jbInitCnd((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.jbInitCtrl((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.jbInitRslt((MBBBP_AcNoteSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MBBBP_AcNoteSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MBBBP_AcNoteSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBBP_AcNoteSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ac_ym_fr_Label = p.beansFactory.createLabel("Cnd.ac_ym_fr_Label");
		p.Cnd_ac_ym_fr = p.beansFactory.createDateField("Cnd.ac_ym_fr");
		p.Cnd_ac_ym_fr.setLabel(p.Cnd_ac_ym_fr_Label);
		p.Cnd_ac_ym_to_Label = p.beansFactory.createLabel("Cnd.ac_ym_to_Label");
		p.Cnd_ac_ym_to = p.beansFactory.createDateField("Cnd.ac_ym_to");
		p.Cnd_ac_ym_to.setLabel(p.Cnd_ac_ym_to_Label);
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_note_no_Label = p.beansFactory.createLabel("Cnd.note_no_Label");
		p.Cnd_note_no = p.beansFactory.createTextField("Cnd.note_no");
		p.Cnd_note_no.setLabel(p.Cnd_note_no_Label);
		p.Cnd_note_rsn_cd_Label = p.beansFactory.createLabel("Cnd.note_rsn_cd_Label");
		p.Cnd_note_rsn_cd = p.beansFactory.createTextComboBox("Cnd.note_rsn_cd");
		p.Cnd_note_rsn_cd.setLabel(p.Cnd_note_rsn_cd_Label);
		p.Cnd_note_rsn_nm = p.beansFactory.createTextField("Cnd.note_rsn_nm");
		p.Cnd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.dpt_cd_Label");
		p.Cnd_dpt_cd = p.beansFactory.createTextComboBox("Cnd.dpt_cd");
		p.Cnd_dpt_cd.setLabel(p.Cnd_dpt_cd_Label);
		p.Cnd_dpt_nm = p.beansFactory.createTextField("Cnd.dpt_nm");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MBBBP_AcNoteSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MBBBP_AcNoteSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_data_no = p.beansFactory.createTableColumn("Rslt.data_no", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_ac_ym = p.beansFactory.createTableColumn("Rslt.ac_ym", MCColumnType.DATE);
		p.columnRslt_ac_dt = p.beansFactory.createTableColumn("Rslt.ac_dt", MCColumnType.DATE);
		p.columnRslt_note_rsn_cd = p.beansFactory.createTableColumn("Rslt.note_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_note_rsn_nm = p.beansFactory.createTableColumn("Rslt.note_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_dpt_cd = p.beansFactory.createTableColumn("Rslt.dpt_cd", MCColumnType.TEXT);
		p.columnRslt_dpt_nm = p.beansFactory.createTableColumn("Rslt.dpt_nm", MCColumnType.TEXT);
		p.columnRslt_rcst_cd = p.beansFactory.createTableColumn("Rslt.rcst_cd", MCColumnType.TEXT);
		p.columnRslt_rcst_nm = p.beansFactory.createTableColumn("Rslt.rcst_nm", MCColumnType.TEXT);
		p.columnRslt_foreign_flg = p.beansFactory.createTableColumn("Rslt.foreign_flg", MCColumnType.CHECK);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_base_cur_amt = p.beansFactory.createTableColumn("Rslt.base_cur_amt", MCColumnType.NUMBER);
		p.columnRslt_base_cur_tax_amt = p.beansFactory.createTableColumn("Rslt.base_cur_tax_amt", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_amt = p.beansFactory.createTableColumn("Rslt.trd_cur_amt", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_tax_amt = p.beansFactory.createTableColumn("Rslt.trd_cur_tax_amt", MCColumnType.NUMBER);
		p.columnRslt_xrate_cd = p.beansFactory.createTableColumn("Rslt.xrate_cd", MCColumnType.TEXT);
		p.columnRslt_xrate_nm = p.beansFactory.createTableColumn("Rslt.xrate_nm", MCColumnType.TEXT);
		p.columnRslt_xrate = p.beansFactory.createTableColumn("Rslt.xrate", MCColumnType.NUMBER);
		p.columnRslt_note_no = p.beansFactory.createTableColumn("Rslt.note_no", MCColumnType.TEXT);
		p.columnRslt_note_typ = p.beansFactory.createTableColumn("Rslt.note_typ", MCColumnType.TEXT);
		p.columnRslt_note_typ_nm = p.beansFactory.createTableColumn("Rslt.note_typ_nm", MCColumnType.TEXT);
		p.columnRslt_draw_dt = p.beansFactory.createTableColumn("Rslt.draw_dt", MCColumnType.DATE);
		p.columnRslt_due_dt = p.beansFactory.createTableColumn("Rslt.due_dt", MCColumnType.DATE);
		p.columnRslt_bank_cd = p.beansFactory.createTableColumn("Rslt.bank_cd", MCColumnType.TEXT);
		p.columnRslt_bank_nm = p.beansFactory.createTableColumn("Rslt.bank_nm", MCColumnType.TEXT);
		p.columnRslt_branch_cd = p.beansFactory.createTableColumn("Rslt.branch_cd", MCColumnType.TEXT);
		p.columnRslt_branch_nm = p.beansFactory.createTableColumn("Rslt.branch_nm", MCColumnType.TEXT);
		p.columnRslt_drawer_nm = p.beansFactory.createTableColumn("Rslt.drawer_nm", MCColumnType.TEXT);
		p.columnRslt_endrsr1 = p.beansFactory.createTableColumn("Rslt.endrsr1", MCColumnType.TEXT);
		p.columnRslt_endrsr2 = p.beansFactory.createTableColumn("Rslt.endrsr2", MCColumnType.TEXT);
		p.columnRslt_endrsr3 = p.beansFactory.createTableColumn("Rslt.endrsr3", MCColumnType.TEXT);
		p.columnRslt_endrsr4 = p.beansFactory.createTableColumn("Rslt.endrsr4", MCColumnType.TEXT);
		p.columnRslt_endrsr5 = p.beansFactory.createTableColumn("Rslt.endrsr5", MCColumnType.TEXT);
		p.columnRslt_accptr = p.beansFactory.createTableColumn("Rslt.accptr", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_sub_char4 = p.beansFactory.createTableColumn("Rslt.sub_char4", MCColumnType.TEXT);
		p.columnRslt_sub_char5 = p.beansFactory.createTableColumn("Rslt.sub_char5", MCColumnType.TEXT);
		p.columnRslt_sub_char6 = p.beansFactory.createTableColumn("Rslt.sub_char6", MCColumnType.TEXT);
		p.columnRslt_sub_char7 = p.beansFactory.createTableColumn("Rslt.sub_char7", MCColumnType.TEXT);
		p.columnRslt_sub_char8 = p.beansFactory.createTableColumn("Rslt.sub_char8", MCColumnType.TEXT);
		p.columnRslt_sub_char9 = p.beansFactory.createTableColumn("Rslt.sub_char9", MCColumnType.TEXT);
		p.columnRslt_sub_char10 = p.beansFactory.createTableColumn("Rslt.sub_char10", MCColumnType.TEXT);
		p.columnRslt_sub_num1 = p.beansFactory.createTableColumn("Rslt.sub_num1", MCColumnType.NUMBER);
		p.columnRslt_sub_num2 = p.beansFactory.createTableColumn("Rslt.sub_num2", MCColumnType.NUMBER);
		p.columnRslt_sub_num3 = p.beansFactory.createTableColumn("Rslt.sub_num3", MCColumnType.NUMBER);
		p.columnRslt_sub_dt1 = p.beansFactory.createTableColumn("Rslt.sub_dt1", MCColumnType.DATE);
		p.columnRslt_sub_dt2 = p.beansFactory.createTableColumn("Rslt.sub_dt2", MCColumnType.DATE);
		p.columnRslt_sub_dt3 = p.beansFactory.createTableColumn("Rslt.sub_dt3", MCColumnType.DATE);
		p.columnRslt_fin_flg = p.beansFactory.createTableColumn("Rslt.fin_flg", MCColumnType.CHECK);
		p.columnRslt_proc_no = p.beansFactory.createTableColumn("Rslt.proc_no", MCColumnType.TEXT);
		p.columnRslt_slip_cnt_id = p.beansFactory.createTableColumn("Rslt.slip_cnt_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MBBBP_AcNoteSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
		p.TopPanel.setValueCheck(false);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.FoldBasePanel);
		p.FoldBasePanel.add(p.FoldScrollPane);
		p.FoldScrollPane.setBorder(null);
		p.FoldScrollPane.setViewportView(p.FoldPanel);
		p.FoldBasePanel.setLayoutPosition("C");
		p.TopPanel.setLastBeans(p.FoldPanel);
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MBBBP_AcNoteSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MBBBP_AcNoteSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_ac_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ac_ym_fr);
		p.CndPanel.setLastBeans(p.Cnd_ac_ym_fr);
		p.Cnd_ac_ym_fr.setNextBeans(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_fr.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0070.CndR.ac_ym_fr_META);
		p.Cnd_ac_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ac_ym_to_Label);
		p.CndPanel.add(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_to.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_ac_ym_to.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0070.CndR.ac_ym_to_META);
		p.Cnd_ac_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0070.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_note_no);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0070.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_note_no_Label);
		p.CndPanel.add(p.Cnd_note_no);
		p.Cnd_note_no.setNextBeans(p.Cnd_note_rsn_cd);
		p.Cnd_note_no.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0070.CndR.note_no_META);
		p.setPluralValueEnable(p.Cnd_note_no, true);
		p.Cnd_note_rsn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_note_rsn_cd, true);
		p.Cnd_note_rsn_cd.setLinkBeans(p.Cnd_note_rsn_nm);
		p.CndPanel.add(p.Cnd_note_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_note_rsn_cd);
		p.Cnd_note_rsn_cd.setNextBeans(p.Cnd_note_rsn_nm);
		p.Cnd_note_rsn_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0070.CndR.note_rsn_cd_META);
		p.CndPanel.add(p.Cnd_note_rsn_nm);
		p.Cnd_note_rsn_nm.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_note_rsn_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0070.CndR.note_rsn_nm_META);
		p.setPluralValueEnable(p.Cnd_note_rsn_nm, true);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.Cnd_dpt_cd.setLinkBeans(p.Cnd_dpt_nm);
		p.CndPanel.add(p.Cnd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0070.CndR.dpt_cd_META);
		p.CndPanel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0070.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MBBBP_AcNoteSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MBBBP_AcNoteSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBC");
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
		MBBBP_AcNoteSrch_MC.mcInitTop((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.mcInitFold((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.mcInitCnd((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.mcInitCtrl((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.mcInitRslt((MBBBP_AcNoteSrch)this);

		// [SRCH]ステータスのモードの設定
		MBBBP_AcNoteSrch_MC.statusInitSRCH_Top((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.statusInitSRCH_Fold((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.statusInitSRCH_Cnd((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.statusInitSRCH_Ctrl((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.statusInitSRCH_Rslt((MBBBP_AcNoteSrch)this);

		// [REF]ステータスのモードの設定
		MBBBP_AcNoteSrch_MC.statusInitREF_Top((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.statusInitREF_Fold((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.statusInitREF_Cnd((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.statusInitREF_Ctrl((MBBBP_AcNoteSrch)this);
		MBBBP_AcNoteSrch_MC.statusInitREF_Rslt((MBBBP_AcNoteSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MBBBP_AcNoteSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MBBBP_AcNoteSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBBP_AcNoteSrch p) {
		p.Cnd_ac_ym_fr.setListListener(p);
		p.Cnd_ac_ym_fr.addAllListener(p);
		p.Cnd_ac_ym_to.setListListener(p);
		p.Cnd_ac_ym_to.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_note_no.setListListener(p);
		p.Cnd_note_no.addAllListener(p);
		p.Cnd_note_rsn_cd.setListListener(p);
		p.Cnd_note_rsn_cd.addAllListener(p);
		p.Cnd_note_rsn_nm.setListListener(p);
		p.Cnd_note_rsn_nm.addAllListener(p);
		p.Cnd_dpt_cd.setListListener(p);
		p.Cnd_dpt_cd.addAllListener(p);
		p.Cnd_dpt_nm.setListListener(p);
		p.Cnd_dpt_nm.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MBBBP_AcNoteSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MBBBP_AcNoteSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_data_no.addAllListener(p);
		p.columnRslt_data_no.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_ac_ym.addAllListener(p);
		p.columnRslt_ac_ym.setListListener(p);
		p.columnRslt_ac_dt.addAllListener(p);
		p.columnRslt_ac_dt.setListListener(p);
		p.columnRslt_note_rsn_cd.addAllListener(p);
		p.columnRslt_note_rsn_cd.setListListener(p);
		p.columnRslt_note_rsn_nm.addAllListener(p);
		p.columnRslt_note_rsn_nm.setListListener(p);
		p.columnRslt_dpt_cd.addAllListener(p);
		p.columnRslt_dpt_cd.setListListener(p);
		p.columnRslt_dpt_nm.addAllListener(p);
		p.columnRslt_dpt_nm.setListListener(p);
		p.columnRslt_rcst_cd.addAllListener(p);
		p.columnRslt_rcst_cd.setListListener(p);
		p.columnRslt_rcst_nm.addAllListener(p);
		p.columnRslt_rcst_nm.setListListener(p);
		p.columnRslt_foreign_flg.addAllListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_nm.addAllListener(p);
		p.columnRslt_base_cur_nm.setListListener(p);
		p.columnRslt_base_cur_amt.addAllListener(p);
		p.columnRslt_base_cur_amt.setListListener(p);
		p.columnRslt_base_cur_tax_amt.addAllListener(p);
		p.columnRslt_base_cur_tax_amt.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_trd_cur_amt.addAllListener(p);
		p.columnRslt_trd_cur_amt.setListListener(p);
		p.columnRslt_trd_cur_tax_amt.addAllListener(p);
		p.columnRslt_trd_cur_tax_amt.setListListener(p);
		p.columnRslt_xrate_cd.addAllListener(p);
		p.columnRslt_xrate_cd.setListListener(p);
		p.columnRslt_xrate_nm.addAllListener(p);
		p.columnRslt_xrate_nm.setListListener(p);
		p.columnRslt_xrate.addAllListener(p);
		p.columnRslt_xrate.setListListener(p);
		p.columnRslt_note_no.addAllListener(p);
		p.columnRslt_note_no.setListListener(p);
		p.columnRslt_note_typ.addAllListener(p);
		p.columnRslt_note_typ.setListListener(p);
		p.columnRslt_note_typ_nm.addAllListener(p);
		p.columnRslt_note_typ_nm.setListListener(p);
		p.columnRslt_draw_dt.addAllListener(p);
		p.columnRslt_draw_dt.setListListener(p);
		p.columnRslt_due_dt.addAllListener(p);
		p.columnRslt_due_dt.setListListener(p);
		p.columnRslt_bank_cd.addAllListener(p);
		p.columnRslt_bank_cd.setListListener(p);
		p.columnRslt_bank_nm.addAllListener(p);
		p.columnRslt_bank_nm.setListListener(p);
		p.columnRslt_branch_cd.addAllListener(p);
		p.columnRslt_branch_cd.setListListener(p);
		p.columnRslt_branch_nm.addAllListener(p);
		p.columnRslt_branch_nm.setListListener(p);
		p.columnRslt_drawer_nm.addAllListener(p);
		p.columnRslt_drawer_nm.setListListener(p);
		p.columnRslt_endrsr1.addAllListener(p);
		p.columnRslt_endrsr1.setListListener(p);
		p.columnRslt_endrsr2.addAllListener(p);
		p.columnRslt_endrsr2.setListListener(p);
		p.columnRslt_endrsr3.addAllListener(p);
		p.columnRslt_endrsr3.setListListener(p);
		p.columnRslt_endrsr4.addAllListener(p);
		p.columnRslt_endrsr4.setListListener(p);
		p.columnRslt_endrsr5.addAllListener(p);
		p.columnRslt_endrsr5.setListListener(p);
		p.columnRslt_accptr.addAllListener(p);
		p.columnRslt_accptr.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_sub_char4.addAllListener(p);
		p.columnRslt_sub_char4.setListListener(p);
		p.columnRslt_sub_char5.addAllListener(p);
		p.columnRslt_sub_char5.setListListener(p);
		p.columnRslt_sub_char6.addAllListener(p);
		p.columnRslt_sub_char6.setListListener(p);
		p.columnRslt_sub_char7.addAllListener(p);
		p.columnRslt_sub_char7.setListListener(p);
		p.columnRslt_sub_char8.addAllListener(p);
		p.columnRslt_sub_char8.setListListener(p);
		p.columnRslt_sub_char9.addAllListener(p);
		p.columnRslt_sub_char9.setListListener(p);
		p.columnRslt_sub_char10.addAllListener(p);
		p.columnRslt_sub_char10.setListListener(p);
		p.columnRslt_sub_num1.addAllListener(p);
		p.columnRslt_sub_num1.setListListener(p);
		p.columnRslt_sub_num2.addAllListener(p);
		p.columnRslt_sub_num2.setListListener(p);
		p.columnRslt_sub_num3.addAllListener(p);
		p.columnRslt_sub_num3.setListListener(p);
		p.columnRslt_sub_dt1.addAllListener(p);
		p.columnRslt_sub_dt1.setListListener(p);
		p.columnRslt_sub_dt2.addAllListener(p);
		p.columnRslt_sub_dt2.setListListener(p);
		p.columnRslt_sub_dt3.addAllListener(p);
		p.columnRslt_sub_dt3.setListListener(p);
		p.columnRslt_fin_flg.addAllListener(p);
		p.columnRslt_proc_no.addAllListener(p);
		p.columnRslt_proc_no.setListListener(p);
		p.columnRslt_slip_cnt_id.addAllListener(p);
		p.columnRslt_slip_cnt_id.setListListener(p);
		p.columnRslt_ins_usr_id.addAllListener(p);
		p.columnRslt_ins_usr_id.setListListener(p);
		p.columnRslt_ins_usr_nm.addAllListener(p);
		p.columnRslt_ins_usr_nm.setListListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_ins_func_id.addAllListener(p);
		p.columnRslt_ins_func_id.setListListener(p);
		p.columnRslt_ins_func_nm.addAllListener(p);
		p.columnRslt_ins_func_nm.setListListener(p);
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
		p.columnRslt_upd_usr_id.addAllListener(p);
		p.columnRslt_upd_usr_id.setListListener(p);
		p.columnRslt_upd_usr_nm.addAllListener(p);
		p.columnRslt_upd_usr_nm.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
		p.columnRslt_upd_func_id.addAllListener(p);
		p.columnRslt_upd_func_id.setListListener(p);
		p.columnRslt_upd_func_nm.addAllListener(p);
		p.columnRslt_upd_func_nm.setListListener(p);
		p.columnRslt_upd_srv_req_no.addAllListener(p);
		p.columnRslt_upd_srv_req_no.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MBBBP_AcNoteSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MBBBP_AcNoteSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MBBBP_AcNoteSrch p){
		p.Cnd_ac_ym_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_note_rsn_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_note_rsn_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MBBBP_AcNoteSrch p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MBBBP_AcNoteSrch p){
		p.columnRslt_data_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_foreign_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_xrate_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_draw_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_branch_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_branch_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_drawer_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_endrsr1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_endrsr2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_endrsr3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_endrsr4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_endrsr5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_accptr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_num1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_num2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_num3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dt1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dt2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dt3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_fin_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_proc_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slip_cnt_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MBBBP_AcNoteSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MBBBP_AcNoteSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MBBBP_AcNoteSrch p){
		p.Cnd_ac_ym_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_note_rsn_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_note_rsn_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MBBBP_AcNoteSrch p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MBBBP_AcNoteSrch p){
		p.columnRslt_data_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_foreign_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xrate_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_note_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_note_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_draw_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_branch_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_branch_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_drawer_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_endrsr1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_endrsr2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_endrsr3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_endrsr4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_endrsr5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_accptr.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_num1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_num2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_num3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dt1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dt2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dt3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_fin_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_proc_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slip_cnt_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

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
		MBBBP_AcNoteSrch_MC.setTableConfigRslt((MBBBP_AcNoteSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MBBBP_AcNoteSrch p) {
		p.columnRslt_data_no.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.data_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_data_no);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_ac_ym.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.ac_ym_META);
		p.columnRslt_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_ym);
		p.columnRslt_ac_dt.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.ac_dt_META);
		p.columnRslt_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_dt);
		p.columnRslt_note_rsn_cd.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.note_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_rsn_cd);
		p.columnRslt_note_rsn_nm.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.note_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_rsn_nm);
		p.columnRslt_dpt_cd.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_cd);
		p.columnRslt_dpt_nm.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_nm);
		p.columnRslt_rcst_cd.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.rcst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcst_cd);
		p.columnRslt_rcst_nm.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.rcst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcst_nm);
		p.columnRslt_foreign_flg.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.foreign_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_foreign_flg);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_base_cur_amt.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.base_cur_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_amt);
		p.columnRslt_base_cur_tax_amt.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.base_cur_tax_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_tax_amt);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_trd_cur_amt.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.trd_cur_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_amt);
		p.columnRslt_trd_cur_tax_amt.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.trd_cur_tax_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_tax_amt);
		p.columnRslt_xrate_cd.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.xrate_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_cd);
		p.columnRslt_xrate_nm.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.xrate_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_nm);
		p.columnRslt_xrate.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate);
		p.columnRslt_note_no.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.note_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_no);
		p.columnRslt_note_typ.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.note_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_typ);
		p.columnRslt_note_typ_nm.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.note_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_typ_nm);
		p.columnRslt_draw_dt.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.draw_dt_META);
		p.columnRslt_draw_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_dt);
		p.columnRslt_due_dt.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.due_dt_META);
		p.columnRslt_due_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_due_dt);
		p.columnRslt_bank_cd.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.bank_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_cd);
		p.columnRslt_bank_nm.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.bank_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_nm);
		p.columnRslt_branch_cd.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.branch_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_branch_cd);
		p.columnRslt_branch_nm.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.branch_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_branch_nm);
		p.columnRslt_drawer_nm.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.drawer_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_drawer_nm);
		p.columnRslt_endrsr1.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.endrsr1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_endrsr1);
		p.columnRslt_endrsr2.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.endrsr2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_endrsr2);
		p.columnRslt_endrsr3.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.endrsr3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_endrsr3);
		p.columnRslt_endrsr4.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.endrsr4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_endrsr4);
		p.columnRslt_endrsr5.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.endrsr5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_endrsr5);
		p.columnRslt_accptr.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.accptr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_accptr);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_sub_char4.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.sub_char4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char4);
		p.columnRslt_sub_char5.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.sub_char5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char5);
		p.columnRslt_sub_char6.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.sub_char6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char6);
		p.columnRslt_sub_char7.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.sub_char7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char7);
		p.columnRslt_sub_char8.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.sub_char8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char8);
		p.columnRslt_sub_char9.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.sub_char9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char9);
		p.columnRslt_sub_char10.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.sub_char10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char10);
		p.columnRslt_sub_num1.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.sub_num1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_num1);
		p.columnRslt_sub_num2.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.sub_num2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_num2);
		p.columnRslt_sub_num3.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.sub_num3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_num3);
		p.columnRslt_sub_dt1.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.sub_dt1_META);
		p.columnRslt_sub_dt1.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dt1);
		p.columnRslt_sub_dt2.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.sub_dt2_META);
		p.columnRslt_sub_dt2.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dt2);
		p.columnRslt_sub_dt3.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.sub_dt3_META);
		p.columnRslt_sub_dt3.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dt3);
		p.columnRslt_fin_flg.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.fin_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fin_flg);
		p.columnRslt_proc_no.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.proc_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_proc_no);
		p.columnRslt_slip_cnt_id.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.slip_cnt_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slip_cnt_id);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMBBB.MBBBP0070.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_note_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_note_rsn_cd.getListConfig().setPutter(getCnd_note_rsn_cd_ListPutter());
		Cnd_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dpt_cd.getListConfig().setPutter(getCnd_dpt_cd_ListPutter());
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
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Cnd_note_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_note_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NoteRsn");
		return lp;
	}
	 
	/**
	 * [Cnd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcDpt");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_note_rsn_cd) return getCnd_note_rsn_cd(row, info);
		if(combo == Cnd_dpt_cd) return getCnd_dpt_cd(row, info);
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
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_ac_ym_fr) return doCnd_ac_ym_fr_VC(info);
		if (vc == Cnd_ac_ym_to) return doCnd_ac_ym_to_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_note_no) return doCnd_note_no_VC(info);
		if (vc == Cnd_note_rsn_cd) return doCnd_note_rsn_cd_VC(info);
		if (vc == Cnd_note_rsn_nm) return doCnd_note_rsn_nm_VC(info);
		if (vc == Cnd_dpt_cd) return doCnd_dpt_cd_VC(info);
		if (vc == Cnd_dpt_nm) return doCnd_dpt_nm_VC(info);
		if (vc == columnRslt_data_no) return doRslt_data_no_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_ac_ym) return doRslt_ac_ym_VC(info);
		if (vc == columnRslt_ac_dt) return doRslt_ac_dt_VC(info);
		if (vc == columnRslt_note_rsn_cd) return doRslt_note_rsn_cd_VC(info);
		if (vc == columnRslt_note_rsn_nm) return doRslt_note_rsn_nm_VC(info);
		if (vc == columnRslt_dpt_cd) return doRslt_dpt_cd_VC(info);
		if (vc == columnRslt_dpt_nm) return doRslt_dpt_nm_VC(info);
		if (vc == columnRslt_rcst_cd) return doRslt_rcst_cd_VC(info);
		if (vc == columnRslt_rcst_nm) return doRslt_rcst_nm_VC(info);
		if (vc == columnRslt_foreign_flg) return doRslt_foreign_flg_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_base_cur_amt) return doRslt_base_cur_amt_VC(info);
		if (vc == columnRslt_base_cur_tax_amt) return doRslt_base_cur_tax_amt_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_trd_cur_amt) return doRslt_trd_cur_amt_VC(info);
		if (vc == columnRslt_trd_cur_tax_amt) return doRslt_trd_cur_tax_amt_VC(info);
		if (vc == columnRslt_xrate_cd) return doRslt_xrate_cd_VC(info);
		if (vc == columnRslt_xrate_nm) return doRslt_xrate_nm_VC(info);
		if (vc == columnRslt_xrate) return doRslt_xrate_VC(info);
		if (vc == columnRslt_note_no) return doRslt_note_no_VC(info);
		if (vc == columnRslt_note_typ) return doRslt_note_typ_VC(info);
		if (vc == columnRslt_note_typ_nm) return doRslt_note_typ_nm_VC(info);
		if (vc == columnRslt_draw_dt) return doRslt_draw_dt_VC(info);
		if (vc == columnRslt_due_dt) return doRslt_due_dt_VC(info);
		if (vc == columnRslt_bank_cd) return doRslt_bank_cd_VC(info);
		if (vc == columnRslt_bank_nm) return doRslt_bank_nm_VC(info);
		if (vc == columnRslt_branch_cd) return doRslt_branch_cd_VC(info);
		if (vc == columnRslt_branch_nm) return doRslt_branch_nm_VC(info);
		if (vc == columnRslt_drawer_nm) return doRslt_drawer_nm_VC(info);
		if (vc == columnRslt_endrsr1) return doRslt_endrsr1_VC(info);
		if (vc == columnRslt_endrsr2) return doRslt_endrsr2_VC(info);
		if (vc == columnRslt_endrsr3) return doRslt_endrsr3_VC(info);
		if (vc == columnRslt_endrsr4) return doRslt_endrsr4_VC(info);
		if (vc == columnRslt_endrsr5) return doRslt_endrsr5_VC(info);
		if (vc == columnRslt_accptr) return doRslt_accptr_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_sub_char4) return doRslt_sub_char4_VC(info);
		if (vc == columnRslt_sub_char5) return doRslt_sub_char5_VC(info);
		if (vc == columnRslt_sub_char6) return doRslt_sub_char6_VC(info);
		if (vc == columnRslt_sub_char7) return doRslt_sub_char7_VC(info);
		if (vc == columnRslt_sub_char8) return doRslt_sub_char8_VC(info);
		if (vc == columnRslt_sub_char9) return doRslt_sub_char9_VC(info);
		if (vc == columnRslt_sub_char10) return doRslt_sub_char10_VC(info);
		if (vc == columnRslt_sub_num1) return doRslt_sub_num1_VC(info);
		if (vc == columnRslt_sub_num2) return doRslt_sub_num2_VC(info);
		if (vc == columnRslt_sub_num3) return doRslt_sub_num3_VC(info);
		if (vc == columnRslt_sub_dt1) return doRslt_sub_dt1_VC(info);
		if (vc == columnRslt_sub_dt2) return doRslt_sub_dt2_VC(info);
		if (vc == columnRslt_sub_dt3) return doRslt_sub_dt3_VC(info);
		if (vc == columnRslt_fin_flg) return doRslt_fin_flg_VC(info);
		if (vc == columnRslt_proc_no) return doRslt_proc_no_VC(info);
		if (vc == columnRslt_slip_cnt_id) return doRslt_slip_cnt_id_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
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
	 * [Cnd]パネルの[ac_ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_ym_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[note_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_note_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[note_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_note_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[note_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_note_rsn_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[data_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_data_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_rsn_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_foreign_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[draw_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_draw_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[due_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_due_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bank_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bank_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bank_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bank_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[branch_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_branch_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[branch_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_branch_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_drawer_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[endrsr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_endrsr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[endrsr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_endrsr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[endrsr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_endrsr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[endrsr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_endrsr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[endrsr5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_endrsr5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[accptr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_accptr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_num1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_num1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_num2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_num2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_num3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_num3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dt2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dt3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fin_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fin_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[proc_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_proc_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slip_cnt_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slip_cnt_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_usr_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_usr_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_srv_req_no_VC(MCEventInfo info){
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
		else if (nc == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NC(info);
		else if (nc == Cnd_ac_ym_to) doCnd_ac_ym_to_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_note_no) doCnd_note_no_NC(info);
		else if (nc == Cnd_note_rsn_cd) doCnd_note_rsn_cd_NC(info);
		else if (nc == Cnd_note_rsn_nm) doCnd_note_rsn_nm_NC(info);
		else if (nc == Cnd_dpt_cd) doCnd_dpt_cd_NC(info);
		else if (nc == Cnd_dpt_nm) doCnd_dpt_nm_NC(info);
		else if (nc == columnRslt_data_no) doRslt_data_no_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_ac_ym) doRslt_ac_ym_NC(info);
		else if (nc == columnRslt_ac_dt) doRslt_ac_dt_NC(info);
		else if (nc == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_NC(info);
		else if (nc == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_NC(info);
		else if (nc == columnRslt_dpt_cd) doRslt_dpt_cd_NC(info);
		else if (nc == columnRslt_dpt_nm) doRslt_dpt_nm_NC(info);
		else if (nc == columnRslt_rcst_cd) doRslt_rcst_cd_NC(info);
		else if (nc == columnRslt_rcst_nm) doRslt_rcst_nm_NC(info);
		else if (nc == columnRslt_foreign_flg) doRslt_foreign_flg_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_base_cur_amt) doRslt_base_cur_amt_NC(info);
		else if (nc == columnRslt_base_cur_tax_amt) doRslt_base_cur_tax_amt_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_trd_cur_amt) doRslt_trd_cur_amt_NC(info);
		else if (nc == columnRslt_trd_cur_tax_amt) doRslt_trd_cur_tax_amt_NC(info);
		else if (nc == columnRslt_xrate_cd) doRslt_xrate_cd_NC(info);
		else if (nc == columnRslt_xrate_nm) doRslt_xrate_nm_NC(info);
		else if (nc == columnRslt_xrate) doRslt_xrate_NC(info);
		else if (nc == columnRslt_note_no) doRslt_note_no_NC(info);
		else if (nc == columnRslt_note_typ) doRslt_note_typ_NC(info);
		else if (nc == columnRslt_note_typ_nm) doRslt_note_typ_nm_NC(info);
		else if (nc == columnRslt_draw_dt) doRslt_draw_dt_NC(info);
		else if (nc == columnRslt_due_dt) doRslt_due_dt_NC(info);
		else if (nc == columnRslt_bank_cd) doRslt_bank_cd_NC(info);
		else if (nc == columnRslt_bank_nm) doRslt_bank_nm_NC(info);
		else if (nc == columnRslt_branch_cd) doRslt_branch_cd_NC(info);
		else if (nc == columnRslt_branch_nm) doRslt_branch_nm_NC(info);
		else if (nc == columnRslt_drawer_nm) doRslt_drawer_nm_NC(info);
		else if (nc == columnRslt_endrsr1) doRslt_endrsr1_NC(info);
		else if (nc == columnRslt_endrsr2) doRslt_endrsr2_NC(info);
		else if (nc == columnRslt_endrsr3) doRslt_endrsr3_NC(info);
		else if (nc == columnRslt_endrsr4) doRslt_endrsr4_NC(info);
		else if (nc == columnRslt_endrsr5) doRslt_endrsr5_NC(info);
		else if (nc == columnRslt_accptr) doRslt_accptr_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_sub_char4) doRslt_sub_char4_NC(info);
		else if (nc == columnRslt_sub_char5) doRslt_sub_char5_NC(info);
		else if (nc == columnRslt_sub_char6) doRslt_sub_char6_NC(info);
		else if (nc == columnRslt_sub_char7) doRslt_sub_char7_NC(info);
		else if (nc == columnRslt_sub_char8) doRslt_sub_char8_NC(info);
		else if (nc == columnRslt_sub_char9) doRslt_sub_char9_NC(info);
		else if (nc == columnRslt_sub_char10) doRslt_sub_char10_NC(info);
		else if (nc == columnRslt_sub_num1) doRslt_sub_num1_NC(info);
		else if (nc == columnRslt_sub_num2) doRslt_sub_num2_NC(info);
		else if (nc == columnRslt_sub_num3) doRslt_sub_num3_NC(info);
		else if (nc == columnRslt_sub_dt1) doRslt_sub_dt1_NC(info);
		else if (nc == columnRslt_sub_dt2) doRslt_sub_dt2_NC(info);
		else if (nc == columnRslt_sub_dt3) doRslt_sub_dt3_NC(info);
		else if (nc == columnRslt_fin_flg) doRslt_fin_flg_NC(info);
		else if (nc == columnRslt_proc_no) doRslt_proc_no_NC(info);
		else if (nc == columnRslt_slip_cnt_id) doRslt_slip_cnt_id_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[note_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[data_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[branch_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_branch_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[branch_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_branch_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accptr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accptr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fin_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fin_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_cnt_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_cnt_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NC(MCEventInfo info){
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
		else if (ne == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NE(info);
		else if (ne == Cnd_ac_ym_to) doCnd_ac_ym_to_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_note_no) doCnd_note_no_NE(info);
		else if (ne == Cnd_note_rsn_cd) doCnd_note_rsn_cd_NE(info);
		else if (ne == Cnd_note_rsn_nm) doCnd_note_rsn_nm_NE(info);
		else if (ne == Cnd_dpt_cd) doCnd_dpt_cd_NE(info);
		else if (ne == Cnd_dpt_nm) doCnd_dpt_nm_NE(info);
		else if (ne == columnRslt_data_no) doRslt_data_no_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_ac_ym) doRslt_ac_ym_NE(info);
		else if (ne == columnRslt_ac_dt) doRslt_ac_dt_NE(info);
		else if (ne == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_NE(info);
		else if (ne == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_NE(info);
		else if (ne == columnRslt_dpt_cd) doRslt_dpt_cd_NE(info);
		else if (ne == columnRslt_dpt_nm) doRslt_dpt_nm_NE(info);
		else if (ne == columnRslt_rcst_cd) doRslt_rcst_cd_NE(info);
		else if (ne == columnRslt_rcst_nm) doRslt_rcst_nm_NE(info);
		else if (ne == columnRslt_foreign_flg) doRslt_foreign_flg_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_base_cur_amt) doRslt_base_cur_amt_NE(info);
		else if (ne == columnRslt_base_cur_tax_amt) doRslt_base_cur_tax_amt_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_trd_cur_amt) doRslt_trd_cur_amt_NE(info);
		else if (ne == columnRslt_trd_cur_tax_amt) doRslt_trd_cur_tax_amt_NE(info);
		else if (ne == columnRslt_xrate_cd) doRslt_xrate_cd_NE(info);
		else if (ne == columnRslt_xrate_nm) doRslt_xrate_nm_NE(info);
		else if (ne == columnRslt_xrate) doRslt_xrate_NE(info);
		else if (ne == columnRslt_note_no) doRslt_note_no_NE(info);
		else if (ne == columnRslt_note_typ) doRslt_note_typ_NE(info);
		else if (ne == columnRslt_note_typ_nm) doRslt_note_typ_nm_NE(info);
		else if (ne == columnRslt_draw_dt) doRslt_draw_dt_NE(info);
		else if (ne == columnRslt_due_dt) doRslt_due_dt_NE(info);
		else if (ne == columnRslt_bank_cd) doRslt_bank_cd_NE(info);
		else if (ne == columnRslt_bank_nm) doRslt_bank_nm_NE(info);
		else if (ne == columnRslt_branch_cd) doRslt_branch_cd_NE(info);
		else if (ne == columnRslt_branch_nm) doRslt_branch_nm_NE(info);
		else if (ne == columnRslt_drawer_nm) doRslt_drawer_nm_NE(info);
		else if (ne == columnRslt_endrsr1) doRslt_endrsr1_NE(info);
		else if (ne == columnRslt_endrsr2) doRslt_endrsr2_NE(info);
		else if (ne == columnRslt_endrsr3) doRslt_endrsr3_NE(info);
		else if (ne == columnRslt_endrsr4) doRslt_endrsr4_NE(info);
		else if (ne == columnRslt_endrsr5) doRslt_endrsr5_NE(info);
		else if (ne == columnRslt_accptr) doRslt_accptr_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_sub_char4) doRslt_sub_char4_NE(info);
		else if (ne == columnRslt_sub_char5) doRslt_sub_char5_NE(info);
		else if (ne == columnRslt_sub_char6) doRslt_sub_char6_NE(info);
		else if (ne == columnRslt_sub_char7) doRslt_sub_char7_NE(info);
		else if (ne == columnRslt_sub_char8) doRslt_sub_char8_NE(info);
		else if (ne == columnRslt_sub_char9) doRslt_sub_char9_NE(info);
		else if (ne == columnRslt_sub_char10) doRslt_sub_char10_NE(info);
		else if (ne == columnRslt_sub_num1) doRslt_sub_num1_NE(info);
		else if (ne == columnRslt_sub_num2) doRslt_sub_num2_NE(info);
		else if (ne == columnRslt_sub_num3) doRslt_sub_num3_NE(info);
		else if (ne == columnRslt_sub_dt1) doRslt_sub_dt1_NE(info);
		else if (ne == columnRslt_sub_dt2) doRslt_sub_dt2_NE(info);
		else if (ne == columnRslt_sub_dt3) doRslt_sub_dt3_NE(info);
		else if (ne == columnRslt_fin_flg) doRslt_fin_flg_NE(info);
		else if (ne == columnRslt_proc_no) doRslt_proc_no_NE(info);
		else if (ne == columnRslt_slip_cnt_id) doRslt_slip_cnt_id_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[note_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[data_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[rcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[branch_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_branch_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[branch_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_branch_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accptr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accptr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fin_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fin_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_cnt_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_cnt_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NE(MCEventInfo info){
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
		else if (nx == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NX(info);
		else if (nx == Cnd_ac_ym_to) doCnd_ac_ym_to_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_note_no) doCnd_note_no_NX(info);
		else if (nx == Cnd_note_rsn_cd) doCnd_note_rsn_cd_NX(info);
		else if (nx == Cnd_note_rsn_nm) doCnd_note_rsn_nm_NX(info);
		else if (nx == Cnd_dpt_cd) doCnd_dpt_cd_NX(info);
		else if (nx == Cnd_dpt_nm) doCnd_dpt_nm_NX(info);
		else if (nx == columnRslt_data_no) doRslt_data_no_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_ac_ym) doRslt_ac_ym_NX(info);
		else if (nx == columnRslt_ac_dt) doRslt_ac_dt_NX(info);
		else if (nx == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_NX(info);
		else if (nx == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_NX(info);
		else if (nx == columnRslt_dpt_cd) doRslt_dpt_cd_NX(info);
		else if (nx == columnRslt_dpt_nm) doRslt_dpt_nm_NX(info);
		else if (nx == columnRslt_rcst_cd) doRslt_rcst_cd_NX(info);
		else if (nx == columnRslt_rcst_nm) doRslt_rcst_nm_NX(info);
		else if (nx == columnRslt_foreign_flg) doRslt_foreign_flg_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_base_cur_amt) doRslt_base_cur_amt_NX(info);
		else if (nx == columnRslt_base_cur_tax_amt) doRslt_base_cur_tax_amt_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_trd_cur_amt) doRslt_trd_cur_amt_NX(info);
		else if (nx == columnRslt_trd_cur_tax_amt) doRslt_trd_cur_tax_amt_NX(info);
		else if (nx == columnRslt_xrate_cd) doRslt_xrate_cd_NX(info);
		else if (nx == columnRslt_xrate_nm) doRslt_xrate_nm_NX(info);
		else if (nx == columnRslt_xrate) doRslt_xrate_NX(info);
		else if (nx == columnRslt_note_no) doRslt_note_no_NX(info);
		else if (nx == columnRslt_note_typ) doRslt_note_typ_NX(info);
		else if (nx == columnRslt_note_typ_nm) doRslt_note_typ_nm_NX(info);
		else if (nx == columnRslt_draw_dt) doRslt_draw_dt_NX(info);
		else if (nx == columnRslt_due_dt) doRslt_due_dt_NX(info);
		else if (nx == columnRslt_bank_cd) doRslt_bank_cd_NX(info);
		else if (nx == columnRslt_bank_nm) doRslt_bank_nm_NX(info);
		else if (nx == columnRslt_branch_cd) doRslt_branch_cd_NX(info);
		else if (nx == columnRslt_branch_nm) doRslt_branch_nm_NX(info);
		else if (nx == columnRslt_drawer_nm) doRslt_drawer_nm_NX(info);
		else if (nx == columnRslt_endrsr1) doRslt_endrsr1_NX(info);
		else if (nx == columnRslt_endrsr2) doRslt_endrsr2_NX(info);
		else if (nx == columnRslt_endrsr3) doRslt_endrsr3_NX(info);
		else if (nx == columnRslt_endrsr4) doRslt_endrsr4_NX(info);
		else if (nx == columnRslt_endrsr5) doRslt_endrsr5_NX(info);
		else if (nx == columnRslt_accptr) doRslt_accptr_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_sub_char4) doRslt_sub_char4_NX(info);
		else if (nx == columnRslt_sub_char5) doRslt_sub_char5_NX(info);
		else if (nx == columnRslt_sub_char6) doRslt_sub_char6_NX(info);
		else if (nx == columnRslt_sub_char7) doRslt_sub_char7_NX(info);
		else if (nx == columnRslt_sub_char8) doRslt_sub_char8_NX(info);
		else if (nx == columnRslt_sub_char9) doRslt_sub_char9_NX(info);
		else if (nx == columnRslt_sub_char10) doRslt_sub_char10_NX(info);
		else if (nx == columnRslt_sub_num1) doRslt_sub_num1_NX(info);
		else if (nx == columnRslt_sub_num2) doRslt_sub_num2_NX(info);
		else if (nx == columnRslt_sub_num3) doRslt_sub_num3_NX(info);
		else if (nx == columnRslt_sub_dt1) doRslt_sub_dt1_NX(info);
		else if (nx == columnRslt_sub_dt2) doRslt_sub_dt2_NX(info);
		else if (nx == columnRslt_sub_dt3) doRslt_sub_dt3_NX(info);
		else if (nx == columnRslt_fin_flg) doRslt_fin_flg_NX(info);
		else if (nx == columnRslt_proc_no) doRslt_proc_no_NX(info);
		else if (nx == columnRslt_slip_cnt_id) doRslt_slip_cnt_id_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[note_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[data_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[rcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[branch_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_branch_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[branch_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_branch_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accptr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accptr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fin_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fin_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_cnt_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_cnt_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_ac_ym_fr) doCnd_ac_ym_fr_LC(info);
		else if (lc == Cnd_ac_ym_to) doCnd_ac_ym_to_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_note_no) doCnd_note_no_LC(info);
		else if (lc == Cnd_note_rsn_cd) doCnd_note_rsn_cd_LC(info);
		else if (lc == Cnd_note_rsn_nm) doCnd_note_rsn_nm_LC(info);
		else if (lc == Cnd_dpt_cd) doCnd_dpt_cd_LC(info);
		else if (lc == Cnd_dpt_nm) doCnd_dpt_nm_LC(info);
		else if (lc == columnRslt_data_no) doRslt_data_no_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_ac_ym) doRslt_ac_ym_LC(info);
		else if (lc == columnRslt_ac_dt) doRslt_ac_dt_LC(info);
		else if (lc == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_LC(info);
		else if (lc == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_LC(info);
		else if (lc == columnRslt_dpt_cd) doRslt_dpt_cd_LC(info);
		else if (lc == columnRslt_dpt_nm) doRslt_dpt_nm_LC(info);
		else if (lc == columnRslt_rcst_cd) doRslt_rcst_cd_LC(info);
		else if (lc == columnRslt_rcst_nm) doRslt_rcst_nm_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_base_cur_amt) doRslt_base_cur_amt_LC(info);
		else if (lc == columnRslt_base_cur_tax_amt) doRslt_base_cur_tax_amt_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_trd_cur_amt) doRslt_trd_cur_amt_LC(info);
		else if (lc == columnRslt_trd_cur_tax_amt) doRslt_trd_cur_tax_amt_LC(info);
		else if (lc == columnRslt_xrate_cd) doRslt_xrate_cd_LC(info);
		else if (lc == columnRslt_xrate_nm) doRslt_xrate_nm_LC(info);
		else if (lc == columnRslt_xrate) doRslt_xrate_LC(info);
		else if (lc == columnRslt_note_no) doRslt_note_no_LC(info);
		else if (lc == columnRslt_note_typ) doRslt_note_typ_LC(info);
		else if (lc == columnRslt_note_typ_nm) doRslt_note_typ_nm_LC(info);
		else if (lc == columnRslt_draw_dt) doRslt_draw_dt_LC(info);
		else if (lc == columnRslt_due_dt) doRslt_due_dt_LC(info);
		else if (lc == columnRslt_bank_cd) doRslt_bank_cd_LC(info);
		else if (lc == columnRslt_bank_nm) doRslt_bank_nm_LC(info);
		else if (lc == columnRslt_branch_cd) doRslt_branch_cd_LC(info);
		else if (lc == columnRslt_branch_nm) doRslt_branch_nm_LC(info);
		else if (lc == columnRslt_drawer_nm) doRslt_drawer_nm_LC(info);
		else if (lc == columnRslt_endrsr1) doRslt_endrsr1_LC(info);
		else if (lc == columnRslt_endrsr2) doRslt_endrsr2_LC(info);
		else if (lc == columnRslt_endrsr3) doRslt_endrsr3_LC(info);
		else if (lc == columnRslt_endrsr4) doRslt_endrsr4_LC(info);
		else if (lc == columnRslt_endrsr5) doRslt_endrsr5_LC(info);
		else if (lc == columnRslt_accptr) doRslt_accptr_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_sub_char4) doRslt_sub_char4_LC(info);
		else if (lc == columnRslt_sub_char5) doRslt_sub_char5_LC(info);
		else if (lc == columnRslt_sub_char6) doRslt_sub_char6_LC(info);
		else if (lc == columnRslt_sub_char7) doRslt_sub_char7_LC(info);
		else if (lc == columnRslt_sub_char8) doRslt_sub_char8_LC(info);
		else if (lc == columnRslt_sub_char9) doRslt_sub_char9_LC(info);
		else if (lc == columnRslt_sub_char10) doRslt_sub_char10_LC(info);
		else if (lc == columnRslt_sub_num1) doRslt_sub_num1_LC(info);
		else if (lc == columnRslt_sub_num2) doRslt_sub_num2_LC(info);
		else if (lc == columnRslt_sub_num3) doRslt_sub_num3_LC(info);
		else if (lc == columnRslt_sub_dt1) doRslt_sub_dt1_LC(info);
		else if (lc == columnRslt_sub_dt2) doRslt_sub_dt2_LC(info);
		else if (lc == columnRslt_sub_dt3) doRslt_sub_dt3_LC(info);
		else if (lc == columnRslt_proc_no) doRslt_proc_no_LC(info);
		else if (lc == columnRslt_slip_cnt_id) doRslt_slip_cnt_id_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[note_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[data_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[branch_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_branch_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[branch_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_branch_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accptr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accptr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_cnt_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_cnt_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_note_rsn_cd]の作成メソッド
	 */
	public MCList getCnd_note_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNoteRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBBL0070.Srch01")) {
			return new MB_MBBBL0070_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBBL0070_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0070_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBBL0070_Srch01;

		/** コンストラクタ */
		protected MB_MBBBL0070_Srch01Bridge() {
			p_MB_MBBBL0070_Srch01 = new MCParam(PDef.MB_MBBBL0070_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBBL0070_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBB.MBBBP0070.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0070.RsltR.class));

			p_MB_MBBBL0070_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBBL0070_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBBL0070_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBBL0070_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBBL0070_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBB.MBBBP0070.CndR up0() {
			return (mcframe.clientMBBB.MBBBP0070.CndR)up(0);
		}

		protected MCList<mcframe.clientMBBB.MBBBP0070.RsltR> down0() {
			return (MCList<mcframe.clientMBBB.MBBBP0070.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBBL0070_Srch01.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0070.RsltR.class));
		}
		protected MCParam param() {
			return p_MB_MBBBL0070_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBB.MBBBP0070.RsltR>)p_MB_MBBBL0070_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}