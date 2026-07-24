package mcframe.clientMABC.MABCP1050;

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
import mcframe.clientMABC.MABCP1050.MABCP_SlipJnlReg_MC.MA_MABCL1050_Srch01Caller;
import mcframe.clientMABC.MABCP1050.MABCP_SlipJnlReg_MC.MA_MABCL1050_Upd01Caller;
import mcframe.clientMABC.MABCP1050.MABCP_SlipJnlReg_MC.MA_MABCL1050_Del01Caller;

/**
 * 画面"MABCP_SlipJnlReg"パネルクラスです。<p>
 *
 * 会計伝票区分仕訳マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_SlipJnlReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABCP1050";

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
	// [Mst]ブロック関連のField定義
	public MCPanel MstPanel = null;
	// [Mst]ブロックの項目のField定義
	public MCLabel Mst_mst_set_typ_nm_Label = null;
	/**
	 * Management 管理.<p>
	 *
	 */
	public MCTextField Mst_mst_set_typ_nm = null;
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
	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_ac_slip_typ_Label = null;
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ac_slip_typ = null;
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public MCTextField Cnd_ac_slip_typ_nm = null;
	public MCLabel Cnd_summary_typ_Label = null;
	/**
	 * Aggregation type 集計区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_summary_typ = null;
	/**
	 * Aggregated type name 集計区分名.<p>
	 *
	 */
	public MCTextField Cnd_summary_typ_nm = null;
	public MCLabel Cnd_jnl_act_cd_Label = null;
	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_jnl_act_cd = null;
	/**
	 * Journalizing name 仕訳実行名.<p>
	 *
	 */
	public MCTextField Cnd_jnl_act_nm = null;
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
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCLabel Cnd_del_flg_lab = null;
	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_off_del_flg = null;
	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_on_del_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP1050.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_flg = null;
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_slip_typ = null;
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_slip_typ_nm = null;
	/**
	 * Aggregation type 集計区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_summary_typ = null;
	/**
	 * Aggregated type name 集計区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_summary_typ_nm = null;
	/**
	 * Use sales order No. 受注ＮＯ使用.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_no_flg = null;
	/**
	 * Use PO No. 発注ＮＯ使用.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_no_flg = null;
	/**
	 * Use invoice No. インボイスＮＯ使用.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_no_flg = null;
	/**
	 * Billing/Payment No. used 請求／支払ＮＯ使用.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_no_flg = null;
	/**
	 * Use transaction unit 取引単位使用.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_flg = null;
	/**
	 * Import cancel data 取消データ取込.<p>
	 *
	 */
	public MCColumnConfig columnDtl_red_input_flg = null;
	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jnl_act_cd = null;
	/**
	 * Journalizing name 仕訳実行名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jnl_act_nm = null;
	/**
	 * Auto-journal key cd. 自動仕訳キーＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_auto_jnl_key_cd = null;
	/**
	 * Auto-journal key name 自動仕訳キー名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_auto_jnl_key_nm = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_ts = null;
	// [DtlBtn]ブロック関連のField定義
	public MCPanel DtlBtnPanel = null;
	// [DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton DtlBtn_rcopy = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton DtlBtn_upd = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton DtlBtn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX, DEL, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL1050_Srch01]のCallerの作成 */
	protected MABCP_SlipJnlReg_MC.MA_MABCL1050_Srch01Caller createMA_MABCL1050_Srch01() {
		MABCP_SlipJnlReg_MC.MA_MABCL1050_Srch01Caller<MABCP_SlipJnlReg, MA_MABCL1050_Srch01Bridge>
		caller = ((MABCP_SlipJnlReg_MC)this).new MA_MABCL1050_Srch01Caller<MABCP_SlipJnlReg, MA_MABCL1050_Srch01Bridge>(
					(MABCP_SlipJnlReg)this, new MA_MABCL1050_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL1050_Srch01]の呼び出し */
	protected void callMA_MABCL1050_Srch01() {
		MCCaller caller = createMA_MABCL1050_Srch01();
		caller.exec();
	}
	/** [MA_MABCL1050_Upd01]のCallerの作成 */
	protected MABCP_SlipJnlReg_MC.MA_MABCL1050_Upd01Caller createMA_MABCL1050_Upd01() {
		MABCP_SlipJnlReg_MC.MA_MABCL1050_Upd01Caller<MABCP_SlipJnlReg, MA_MABCL1050_Upd01Bridge>
		caller = ((MABCP_SlipJnlReg_MC)this).new MA_MABCL1050_Upd01Caller<MABCP_SlipJnlReg, MA_MABCL1050_Upd01Bridge>(
					(MABCP_SlipJnlReg)this, new MA_MABCL1050_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL1050_Upd01]の呼び出し */
	protected void callMA_MABCL1050_Upd01() {
		MCCaller caller = createMA_MABCL1050_Upd01();
		caller.exec();
	}
	/** [MA_MABCL1050_Del01]のCallerの作成 */
	protected MABCP_SlipJnlReg_MC.MA_MABCL1050_Del01Caller createMA_MABCL1050_Del01() {
		MABCP_SlipJnlReg_MC.MA_MABCL1050_Del01Caller<MABCP_SlipJnlReg, MA_MABCL1050_Del01Bridge>
		caller = ((MABCP_SlipJnlReg_MC)this).new MA_MABCL1050_Del01Caller<MABCP_SlipJnlReg, MA_MABCL1050_Del01Bridge>(
					(MABCP_SlipJnlReg)this, new MA_MABCL1050_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL1050_Del01]の呼び出し */
	protected void callMA_MABCL1050_Del01() {
		MCCaller caller = createMA_MABCL1050_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP1050.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP1050.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP1050.DtlR> aDtlL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP1050.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP1050.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP1050.MstR createMstR() {
		return mcframe.clientMABC.MABCP1050.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP1050.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP1050.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP1050.CndR createCndR() {
		return mcframe.clientMABC.MABCP1050.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP1050.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1050.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP1050.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP1050.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1050.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP1050.DtlR.class);
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
		if(!MCCollectionUtil.contains(ret, getMstR())) ret.add(getMstR());
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
		if(aCnt == getMstR()) return "Mst";
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
		if(bId.equals("Mst")) return getMstR();
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
		ret.add(ScreenOpePanel);
		ret.add(MstPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_SlipJnlReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_SlipJnlReg_MC_A(String name) {
		aMstR = createMstR();
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
		MABCP_SlipJnlReg_MC.jbCreateScreenOpe((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbCreateMst((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbCreateTop((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbCreateFold((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbCreateCnd((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbCreateCtrl((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbCreateDtl((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbCreateDtlBtn((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbCreateEastBtn((MABCP_SlipJnlReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_SlipJnlReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_SlipJnlReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_SlipJnlReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_SlipJnlReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_SlipJnlReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_SlipJnlReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_SlipJnlReg p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABCP_SlipJnlReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_SlipJnlReg p) {
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

	
	/** [Cnd_ac_slip_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ac_slip_typ_p = null;

	/**
	 * [Cnd_ac_slip_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_slip_typ_ListPutter() {
		if (Cnd_ac_slip_typ_p == null) {
			Cnd_ac_slip_typ_p = createCnd_ac_slip_typ_ListPutter(Cnd_ac_slip_typ, "ac_slip_typ", "ac_slip_typ_nm");

		}
		return Cnd_ac_slip_typ_p;
	}
	
	
	/** [Cnd_summary_typ_ListPutter]の定義 */
	private MCListPutter Cnd_summary_typ_p = null;

	/**
	 * [Cnd_summary_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_summary_typ_ListPutter() {
		if (Cnd_summary_typ_p == null) {
			Cnd_summary_typ_p = createCnd_summary_typ_ListPutter(Cnd_summary_typ, "summary_typ", "summary_typ_nm");

		}
		return Cnd_summary_typ_p;
	}
	
	
	/** [Cnd_jnl_act_cd_ListPutter]の定義 */
	private MCListPutter Cnd_jnl_act_cd_p = null;

	/**
	 * [Cnd_jnl_act_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_jnl_act_cd_ListPutter() {
		if (Cnd_jnl_act_cd_p == null) {
			Cnd_jnl_act_cd_p = createCnd_jnl_act_cd_ListPutter(Cnd_jnl_act_cd, "jnl_act_cd", "jnl_act_nm");

		}
		return Cnd_jnl_act_cd_p;
	}
	
	
	/** [Dtl_ac_slip_typ_ListPutter]の定義 */
	private MCListPutter Dtl_ac_slip_typ_p = null;

	/**
	 * [Dtl_ac_slip_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ac_slip_typ_ListPutter() {
		if (Dtl_ac_slip_typ_p == null) {
			Dtl_ac_slip_typ_p = createDtl_ac_slip_typ_ListPutter(columnDtl_ac_slip_typ, "ac_slip_typ", "ac_slip_typ_nm");

		}
		return Dtl_ac_slip_typ_p;
	}
	
	
	/** [Dtl_summary_typ_ListPutter]の定義 */
	private MCListPutter Dtl_summary_typ_p = null;

	/**
	 * [Dtl_summary_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_summary_typ_ListPutter() {
		if (Dtl_summary_typ_p == null) {
			Dtl_summary_typ_p = createDtl_summary_typ_ListPutter(columnDtl_summary_typ, "summary_typ", "summary_typ_nm");

		}
		return Dtl_summary_typ_p;
	}
	
	
	/** [Dtl_jnl_act_cd_ListPutter]の定義 */
	private MCListPutter Dtl_jnl_act_cd_p = null;

	/**
	 * [Dtl_jnl_act_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_jnl_act_cd_ListPutter() {
		if (Dtl_jnl_act_cd_p == null) {
			Dtl_jnl_act_cd_p = createDtl_jnl_act_cd_ListPutter(columnDtl_jnl_act_cd, "jnl_act_cd", "jnl_act_nm");

		}
		return Dtl_jnl_act_cd_p;
	}
	
	
	/** [Dtl_auto_jnl_key_cd_ListPutter]の定義 */
	private MCListPutter Dtl_auto_jnl_key_cd_p = null;

	/**
	 * [Dtl_auto_jnl_key_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_auto_jnl_key_cd_ListPutter() {
		if (Dtl_auto_jnl_key_cd_p == null) {
			Dtl_auto_jnl_key_cd_p = createDtl_auto_jnl_key_cd_ListPutter(columnDtl_auto_jnl_key_cd, "auto_jnl_key_cd", "auto_jnl_key_nm");

		}
		return Dtl_auto_jnl_key_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_SlipJnlReg create(){
		MABCP_SlipJnlReg p = new MABCP_SlipJnlReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_SlipJnlReg create(String name){
		MABCP_SlipJnlReg p = new MABCP_SlipJnlReg(name);
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
		MABCP_SlipJnlReg_MC.jbfInitScreenOpe((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbfInitMst((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbfInitTop((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbfInitFold((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbfInitCnd((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbfInitCtrl((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbfInitDtl((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbfInitDtlBtn((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbfInitEastBtn((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbInitScreenOpe((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbInitMst((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbInitTop((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbInitFold((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbInitCnd((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbInitCtrl((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbInitDtl((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbInitDtlBtn((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.jbInitEastBtn((MABCP_SlipJnlReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_SlipJnlReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_SlipJnlReg p) {
		// ブロック関連の初期化
		p.MstPanel = p.beansFactory.createPanel("Mst");
		// ブロックの項目の初期化
		p.Mst_mst_set_typ_nm_Label = p.beansFactory.createLabel("Mst.mst_set_typ_nm_Label");
		p.Mst_mst_set_typ_nm = p.beansFactory.createTextField("Mst.mst_set_typ_nm");
		p.Mst_mst_set_typ_nm.setLabel(p.Mst_mst_set_typ_nm_Label);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABCP_SlipJnlReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_SlipJnlReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_SlipJnlReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ac_slip_typ_Label = p.beansFactory.createLabel("Cnd.ac_slip_typ_Label");
		p.Cnd_ac_slip_typ = p.beansFactory.createTextComboBox("Cnd.ac_slip_typ");
		p.Cnd_ac_slip_typ.setLabel(p.Cnd_ac_slip_typ_Label);
		p.Cnd_ac_slip_typ_nm = p.beansFactory.createTextField("Cnd.ac_slip_typ_nm");
		p.Cnd_summary_typ_Label = p.beansFactory.createLabel("Cnd.summary_typ_Label");
		p.Cnd_summary_typ = p.beansFactory.createTextComboBox("Cnd.summary_typ");
		p.Cnd_summary_typ.setLabel(p.Cnd_summary_typ_Label);
		p.Cnd_summary_typ_nm = p.beansFactory.createTextField("Cnd.summary_typ_nm");
		p.Cnd_jnl_act_cd_Label = p.beansFactory.createLabel("Cnd.jnl_act_cd_Label");
		p.Cnd_jnl_act_cd = p.beansFactory.createTextComboBox("Cnd.jnl_act_cd");
		p.Cnd_jnl_act_cd.setLabel(p.Cnd_jnl_act_cd_Label);
		p.Cnd_jnl_act_nm = p.beansFactory.createTextField("Cnd.jnl_act_nm");
		p.Cnd_memo1_Label = p.beansFactory.createLabel("Cnd.memo1_Label");
		p.Cnd_memo1 = p.beansFactory.createTextField("Cnd.memo1");
		p.Cnd_memo1.setLabel(p.Cnd_memo1_Label);
		p.Cnd_memo2_Label = p.beansFactory.createLabel("Cnd.memo2_Label");
		p.Cnd_memo2 = p.beansFactory.createTextField("Cnd.memo2");
		p.Cnd_memo2.setLabel(p.Cnd_memo2_Label);
		p.Cnd_memo3_Label = p.beansFactory.createLabel("Cnd.memo3_Label");
		p.Cnd_memo3 = p.beansFactory.createTextField("Cnd.memo3");
		p.Cnd_memo3.setLabel(p.Cnd_memo3_Label);
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_off_del_flg = p.beansFactory.createCheckBox("Cnd.off_del_flg");
		p.Cnd_on_del_flg = p.beansFactory.createCheckBox("Cnd.on_del_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_SlipJnlReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_SlipJnlReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_ac_slip_typ = p.beansFactory.createTableColumn("Dtl.ac_slip_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_ac_slip_typ_nm = p.beansFactory.createTableColumn("Dtl.ac_slip_typ_nm", MCColumnType.TEXT);
		p.columnDtl_summary_typ = p.beansFactory.createTableColumn("Dtl.summary_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_summary_typ_nm = p.beansFactory.createTableColumn("Dtl.summary_typ_nm", MCColumnType.TEXT);
		p.columnDtl_slo_no_flg = p.beansFactory.createTableColumn("Dtl.slo_no_flg", MCColumnType.CHECK);
		p.columnDtl_po_no_flg = p.beansFactory.createTableColumn("Dtl.po_no_flg", MCColumnType.CHECK);
		p.columnDtl_iv_no_flg = p.beansFactory.createTableColumn("Dtl.iv_no_flg", MCColumnType.CHECK);
		p.columnDtl_bill_no_flg = p.beansFactory.createTableColumn("Dtl.bill_no_flg", MCColumnType.CHECK);
		p.columnDtl_trd_unit_flg = p.beansFactory.createTableColumn("Dtl.trd_unit_flg", MCColumnType.CHECK);
		p.columnDtl_red_input_flg = p.beansFactory.createTableColumn("Dtl.red_input_flg", MCColumnType.CHECK);
		p.columnDtl_jnl_act_cd = p.beansFactory.createTableColumn("Dtl.jnl_act_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_jnl_act_nm = p.beansFactory.createTableColumn("Dtl.jnl_act_nm", MCColumnType.TEXT);
		p.columnDtl_auto_jnl_key_cd = p.beansFactory.createTableColumn("Dtl.auto_jnl_key_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_auto_jnl_key_nm = p.beansFactory.createTableColumn("Dtl.auto_jnl_key_nm", MCColumnType.TEXT);
		p.columnDtl_memo1 = p.beansFactory.createTableColumn("Dtl.memo1", MCColumnType.TEXT);
		p.columnDtl_memo2 = p.beansFactory.createTableColumn("Dtl.memo2", MCColumnType.TEXT);
		p.columnDtl_memo3 = p.beansFactory.createTableColumn("Dtl.memo3", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_cntr = p.beansFactory.createTableColumn("Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl_del_usr_id = p.beansFactory.createTableColumn("Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnDtl_del_usr_nm = p.beansFactory.createTableColumn("Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnDtl_del_ts = p.beansFactory.createTableColumn("Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABCP_SlipJnlReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_select_all = p.beansFactory.createButton("DtlBtn.select_all", "no_border");
		p.DtlBtn_deselect_all = p.beansFactory.createButton("DtlBtn.deselect_all", "no_border");
		p.DtlBtn_radd = p.beansFactory.createButton("DtlBtn.radd", "no_border");
		p.DtlBtn_rdel = p.beansFactory.createButton("DtlBtn.rdel", "no_border");
		p.DtlBtn_rcopy = p.beansFactory.createButton("DtlBtn.rcopy", "no_border");
		p.DtlBtn_upd = p.beansFactory.createButton("DtlBtn.upd", "upd");
		p.DtlBtn_del = p.beansFactory.createButton("DtlBtn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_SlipJnlReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_SlipJnlReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.MstPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMst(MABCP_SlipJnlReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.TopPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP1050.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_SlipJnlReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.DtlPanel);
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
	protected static void jbInitFold(MABCP_SlipJnlReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_SlipJnlReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP1050.CndR.ope_META);
		p.Cnd_ac_slip_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_slip_typ, true);
		p.Cnd_ac_slip_typ.setLinkBeans(p.Cnd_ac_slip_typ_nm);
		p.CndPanel.add(p.Cnd_ac_slip_typ_Label);
		p.CndPanel.add(p.Cnd_ac_slip_typ);
		p.CndPanel.setLastBeans(p.Cnd_ac_slip_typ);
		p.Cnd_ac_slip_typ.setNextBeans(p.Cnd_ac_slip_typ_nm);
		p.Cnd_ac_slip_typ.setRow(p.getCndR(), mcframe.clientMABC.MABCP1050.CndR.ac_slip_typ_META);
		p.CndPanel.add(p.Cnd_ac_slip_typ_nm);
		p.Cnd_ac_slip_typ_nm.setNextBeans(p.Cnd_summary_typ);
		p.Cnd_ac_slip_typ_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP1050.CndR.ac_slip_typ_nm_META);
		p.Cnd_summary_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_summary_typ, true);
		p.Cnd_summary_typ.setLinkBeans(p.Cnd_summary_typ_nm);
		p.CndPanel.add(p.Cnd_summary_typ_Label);
		p.CndPanel.add(p.Cnd_summary_typ);
		p.Cnd_summary_typ.setNextBeans(p.Cnd_summary_typ_nm);
		p.Cnd_summary_typ.setRow(p.getCndR(), mcframe.clientMABC.MABCP1050.CndR.summary_typ_META);
		p.CndPanel.add(p.Cnd_summary_typ_nm);
		p.Cnd_summary_typ_nm.setNextBeans(p.Cnd_jnl_act_cd);
		p.Cnd_summary_typ_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP1050.CndR.summary_typ_nm_META);
		p.Cnd_jnl_act_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_jnl_act_cd, true);
		p.Cnd_jnl_act_cd.setLinkBeans(p.Cnd_jnl_act_nm);
		p.CndPanel.add(p.Cnd_jnl_act_cd_Label);
		p.CndPanel.add(p.Cnd_jnl_act_cd);
		p.Cnd_jnl_act_cd.setNextBeans(p.Cnd_jnl_act_nm);
		p.Cnd_jnl_act_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP1050.CndR.jnl_act_cd_META);
		p.CndPanel.add(p.Cnd_jnl_act_nm);
		p.Cnd_jnl_act_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_jnl_act_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP1050.CndR.jnl_act_nm_META);
		p.setPluralValueEnable(p.Cnd_jnl_act_nm, true);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP1050.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP1050.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP1050.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP1050.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP1050.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_SlipJnlReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_SlipJnlReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MABCP_SlipJnlReg p) {
		// ブロック関連の初期化
		p.add(p.DtlBtnPanel);
		p.DtlBtnPanel.setNextBeans(p.EastBtnPanel);
		p.DtlBtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.DtlBtn_select_all.setIcon("SELECT_ALL");
		p.DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.DtlBtnPanel.add(p.DtlBtn_select_all);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_select_all);
		p.DtlBtn_select_all.setNextBeans(p.DtlBtn_deselect_all);
		p.DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.DtlBtnPanel.add(p.DtlBtn_deselect_all);
		p.DtlBtn_deselect_all.setNextBeans(p.DtlBtn_radd);
		p.DtlBtn_radd.setIcon("INSERT_RECORD");
		p.DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.DtlBtnPanel.add(p.DtlBtn_radd);
		p.DtlBtn_radd.setNextBeans(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.DtlBtnPanel.add(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setNextBeans(p.DtlBtn_rcopy);
		p.DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.DtlBtnPanel.add(p.DtlBtn_rcopy);
		p.DtlBtn_rcopy.setNextBeans(p.DtlBtn_upd);
		p.DtlBtn_upd.setIcon("REGISTER");
		p.DtlBtn_upd.setFunctionKey(MCFunctionKey.F9);
		p.DtlBtnPanel.add(p.DtlBtn_upd);
		p.DtlBtn_del.setIcon("DELETE");
		p.DtlBtn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.DtlBtn_del);
		p.EastBtnPanel.add(p.DtlBtn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABCP_SlipJnlReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("SE");
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
		MABCP_SlipJnlReg_MC.mcInitScreenOpe((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.mcInitMst((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.mcInitTop((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.mcInitFold((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.mcInitCnd((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.mcInitCtrl((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.mcInitDtl((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.mcInitDtlBtn((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.mcInitEastBtn((MABCP_SlipJnlReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_SlipJnlReg_MC.statusInitUPD_ScreenOpe((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitUPD_Mst((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitUPD_Top((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitUPD_Fold((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitUPD_Cnd((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitUPD_Ctrl((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitUPD_Dtl((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitUPD_DtlBtn((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitUPD_EastBtn((MABCP_SlipJnlReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_SlipJnlReg_MC.statusInitFIX_ScreenOpe((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitFIX_Mst((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitFIX_Top((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitFIX_Fold((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitFIX_Cnd((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitFIX_Ctrl((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitFIX_Dtl((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitFIX_DtlBtn((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitFIX_EastBtn((MABCP_SlipJnlReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_SlipJnlReg_MC.statusInitDEL_ScreenOpe((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitDEL_Mst((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitDEL_Top((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitDEL_Fold((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitDEL_Cnd((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitDEL_Ctrl((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitDEL_Dtl((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitDEL_DtlBtn((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitDEL_EastBtn((MABCP_SlipJnlReg)this);

		// [REF]ステータスのモードの設定
		MABCP_SlipJnlReg_MC.statusInitREF_ScreenOpe((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitREF_Mst((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitREF_Top((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitREF_Fold((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitREF_Cnd((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitREF_Ctrl((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitREF_Dtl((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitREF_DtlBtn((MABCP_SlipJnlReg)this);
		MABCP_SlipJnlReg_MC.statusInitREF_EastBtn((MABCP_SlipJnlReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_SlipJnlReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_SlipJnlReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_SlipJnlReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_SlipJnlReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_SlipJnlReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ac_slip_typ.setListListener(p);
		p.Cnd_ac_slip_typ.addAllListener(p);
		p.Cnd_ac_slip_typ_nm.setListListener(p);
		p.Cnd_ac_slip_typ_nm.addAllListener(p);
		p.Cnd_summary_typ.setListListener(p);
		p.Cnd_summary_typ.addAllListener(p);
		p.Cnd_summary_typ_nm.setListListener(p);
		p.Cnd_summary_typ_nm.addAllListener(p);
		p.Cnd_jnl_act_cd.setListListener(p);
		p.Cnd_jnl_act_cd.addAllListener(p);
		p.Cnd_jnl_act_nm.setListListener(p);
		p.Cnd_jnl_act_nm.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_SlipJnlReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_SlipJnlReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_ac_slip_typ.addAllListener(p);
		p.columnDtl_ac_slip_typ.setListListener(p);
		p.columnDtl_ac_slip_typ_nm.addAllListener(p);
		p.columnDtl_ac_slip_typ_nm.setListListener(p);
		p.columnDtl_summary_typ.addAllListener(p);
		p.columnDtl_summary_typ.setListListener(p);
		p.columnDtl_summary_typ_nm.addAllListener(p);
		p.columnDtl_summary_typ_nm.setListListener(p);
		p.columnDtl_slo_no_flg.addAllListener(p);
		p.columnDtl_po_no_flg.addAllListener(p);
		p.columnDtl_iv_no_flg.addAllListener(p);
		p.columnDtl_bill_no_flg.addAllListener(p);
		p.columnDtl_trd_unit_flg.addAllListener(p);
		p.columnDtl_red_input_flg.addAllListener(p);
		p.columnDtl_jnl_act_cd.addAllListener(p);
		p.columnDtl_jnl_act_cd.setListListener(p);
		p.columnDtl_jnl_act_nm.addAllListener(p);
		p.columnDtl_jnl_act_nm.setListListener(p);
		p.columnDtl_auto_jnl_key_cd.addAllListener(p);
		p.columnDtl_auto_jnl_key_cd.setListListener(p);
		p.columnDtl_auto_jnl_key_nm.addAllListener(p);
		p.columnDtl_auto_jnl_key_nm.setListListener(p);
		p.columnDtl_memo1.addAllListener(p);
		p.columnDtl_memo1.setListListener(p);
		p.columnDtl_memo2.addAllListener(p);
		p.columnDtl_memo2.setListListener(p);
		p.columnDtl_memo3.addAllListener(p);
		p.columnDtl_memo3.setListListener(p);
		p.columnDtl_ins_usr_id.addAllListener(p);
		p.columnDtl_ins_usr_id.setListListener(p);
		p.columnDtl_ins_usr_nm.addAllListener(p);
		p.columnDtl_ins_usr_nm.setListListener(p);
		p.columnDtl_ins_ts.addAllListener(p);
		p.columnDtl_ins_ts.setListListener(p);
		p.columnDtl_ins_func_id.addAllListener(p);
		p.columnDtl_ins_func_id.setListListener(p);
		p.columnDtl_ins_func_nm.addAllListener(p);
		p.columnDtl_ins_func_nm.setListListener(p);
		p.columnDtl_upd_cntr.addAllListener(p);
		p.columnDtl_upd_cntr.setListListener(p);
		p.columnDtl_upd_usr_id.addAllListener(p);
		p.columnDtl_upd_usr_id.setListListener(p);
		p.columnDtl_upd_usr_nm.addAllListener(p);
		p.columnDtl_upd_usr_nm.setListListener(p);
		p.columnDtl_upd_ts.addAllListener(p);
		p.columnDtl_upd_ts.setListListener(p);
		p.columnDtl_upd_func_id.addAllListener(p);
		p.columnDtl_upd_func_id.setListListener(p);
		p.columnDtl_upd_func_nm.addAllListener(p);
		p.columnDtl_upd_func_nm.setListListener(p);
		p.columnDtl_upd_srv_req_no.addAllListener(p);
		p.columnDtl_upd_srv_req_no.setListListener(p);
		p.columnDtl_del_usr_id.addAllListener(p);
		p.columnDtl_del_usr_id.setListListener(p);
		p.columnDtl_del_usr_nm.addAllListener(p);
		p.columnDtl_del_usr_nm.setListListener(p);
		p.columnDtl_del_ts.addAllListener(p);
		p.columnDtl_del_ts.setListListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABCP_SlipJnlReg p) {
		p.DtlBtn_select_all.addAllListener(p);
		p.DtlBtn_select_all.setAPMethodName("doDtlBtn_select_all");
		p.DtlBtn_deselect_all.addAllListener(p);
		p.DtlBtn_deselect_all.setAPMethodName("doDtlBtn_deselect_all");
		p.DtlBtn_radd.addAllListener(p);
		p.DtlBtn_radd.setAPMethodName("doDtlBtn_radd");
		p.DtlBtn_rdel.addAllListener(p);
		p.DtlBtn_rdel.setAPMethodName("doDtlBtn_rdel");
		p.DtlBtn_rcopy.addAllListener(p);
		p.DtlBtn_rcopy.setAPMethodName("doDtlBtn_rcopy");
		p.DtlBtn_upd.addAllListener(p);
		p.DtlBtn_upd.setAPMethodName("doDtlBtn_upd");
		p.DtlBtn_del.addAllListener(p);
		p.DtlBtn_del.setAPMethodName("doDtlBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_SlipJnlReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_SlipJnlReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_SlipJnlReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_SlipJnlReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_SlipJnlReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_SlipJnlReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ac_slip_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_summary_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_summary_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_jnl_act_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_jnl_act_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_SlipJnlReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_SlipJnlReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ac_slip_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ac_slip_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_summary_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_summary_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_no_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_po_no_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_iv_no_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bill_no_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_trd_unit_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_red_input_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_jnl_act_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_jnl_act_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_auto_jnl_key_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_auto_jnl_key_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MABCP_SlipJnlReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_SlipJnlReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_SlipJnlReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_SlipJnlReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_SlipJnlReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_SlipJnlReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_SlipJnlReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_ac_slip_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_summary_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_summary_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_jnl_act_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_jnl_act_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_SlipJnlReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_SlipJnlReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_summary_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_summary_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_slo_no_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_po_no_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_iv_no_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bill_no_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_red_input_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_jnl_act_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_jnl_act_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_auto_jnl_key_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_auto_jnl_key_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtn(MABCP_SlipJnlReg p){
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_SlipJnlReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_SlipJnlReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABCP_SlipJnlReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_SlipJnlReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_SlipJnlReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_SlipJnlReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_ac_slip_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_summary_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_summary_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_jnl_act_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_jnl_act_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABCP_SlipJnlReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_SlipJnlReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_summary_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_summary_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_no_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_no_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_iv_no_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bill_no_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_red_input_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_jnl_act_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_jnl_act_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_auto_jnl_key_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_auto_jnl_key_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MABCP_SlipJnlReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_SlipJnlReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_SlipJnlReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_SlipJnlReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_SlipJnlReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_SlipJnlReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_SlipJnlReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ac_slip_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_summary_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_summary_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_jnl_act_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_jnl_act_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_SlipJnlReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_SlipJnlReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_summary_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_summary_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_no_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_no_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_iv_no_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_no_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_red_input_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jnl_act_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jnl_act_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_auto_jnl_key_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_auto_jnl_key_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MABCP_SlipJnlReg p){
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_upd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_SlipJnlReg p){

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
		MABCP_SlipJnlReg_MC.setTableConfigDtl((MABCP_SlipJnlReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_SlipJnlReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP1050.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP1050.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_ac_slip_typ.setMeta(mcframe.clientMABC.MABCP1050.DtlR.ac_slip_typ_META);
		p.columnDtl_ac_slip_typ.addLinkBeans(p.columnDtl_ac_slip_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_slip_typ);
		p.columnDtl_ac_slip_typ_nm.setMeta(mcframe.clientMABC.MABCP1050.DtlR.ac_slip_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_slip_typ_nm);
		p.columnDtl_summary_typ.setMeta(mcframe.clientMABC.MABCP1050.DtlR.summary_typ_META);
		p.columnDtl_summary_typ.addLinkBeans(p.columnDtl_summary_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_summary_typ);
		p.columnDtl_summary_typ_nm.setMeta(mcframe.clientMABC.MABCP1050.DtlR.summary_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_summary_typ_nm);
		p.columnDtl_slo_no_flg.setMeta(mcframe.clientMABC.MABCP1050.DtlR.slo_no_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_no_flg);
		p.columnDtl_po_no_flg.setMeta(mcframe.clientMABC.MABCP1050.DtlR.po_no_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_no_flg);
		p.columnDtl_iv_no_flg.setMeta(mcframe.clientMABC.MABCP1050.DtlR.iv_no_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_no_flg);
		p.columnDtl_bill_no_flg.setMeta(mcframe.clientMABC.MABCP1050.DtlR.bill_no_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_no_flg);
		p.columnDtl_trd_unit_flg.setMeta(mcframe.clientMABC.MABCP1050.DtlR.trd_unit_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_flg);
		p.columnDtl_red_input_flg.setMeta(mcframe.clientMABC.MABCP1050.DtlR.red_input_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_red_input_flg);
		p.columnDtl_jnl_act_cd.setMeta(mcframe.clientMABC.MABCP1050.DtlR.jnl_act_cd_META);
		p.columnDtl_jnl_act_cd.addLinkBeans(p.columnDtl_jnl_act_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_jnl_act_cd);
		p.columnDtl_jnl_act_nm.setMeta(mcframe.clientMABC.MABCP1050.DtlR.jnl_act_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_jnl_act_nm);
		p.columnDtl_auto_jnl_key_cd.setMeta(mcframe.clientMABC.MABCP1050.DtlR.auto_jnl_key_cd_META);
		p.columnDtl_auto_jnl_key_cd.addLinkBeans(p.columnDtl_auto_jnl_key_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_auto_jnl_key_cd);
		p.columnDtl_auto_jnl_key_nm.setMeta(mcframe.clientMABC.MABCP1050.DtlR.auto_jnl_key_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_auto_jnl_key_nm);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP1050.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP1050.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP1050.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP1050.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP1050.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP1050.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP1050.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP1050.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP1050.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP1050.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP1050.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP1050.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP1050.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP1050.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP1050.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP1050.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP1050.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP1050.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_ac_slip_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_slip_typ.getListConfig().setPutter(getCnd_ac_slip_typ_ListPutter());
		Cnd_summary_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_summary_typ.getListConfig().setPutter(getCnd_summary_typ_ListPutter());
		Cnd_jnl_act_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_jnl_act_cd.getListConfig().setPutter(getCnd_jnl_act_cd_ListPutter());
		columnDtl_ac_slip_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ac_slip_typ.getListConfig().setPutter(getDtl_ac_slip_typ_ListPutter());
		columnDtl_summary_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_summary_typ.getListConfig().setPutter(getDtl_summary_typ_ListPutter());
		columnDtl_jnl_act_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_jnl_act_cd.getListConfig().setPutter(getDtl_jnl_act_cd_ListPutter());
		columnDtl_auto_jnl_key_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_auto_jnl_key_cd.getListConfig().setPutter(getDtl_auto_jnl_key_cd_ListPutter());
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
	 * この画面を[FIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIXStatus() {
		status = FIX;
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
		if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
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
	 * [Cnd_ac_slip_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_slip_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcSlipTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_summary_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_summary_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SummaryTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_jnl_act_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_jnl_act_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.JnlAct");
		return lp;
	}
	 
	/**
	 * [Dtl_ac_slip_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ac_slip_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcSlipTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_summary_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_summary_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SummaryTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_jnl_act_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_jnl_act_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.JnlAct");
		return lp;
	}
	 
	/**
	 * [Dtl_auto_jnl_key_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_auto_jnl_key_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AutoJnlKey");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_ac_slip_typ) return getCnd_ac_slip_typ(row, info);
		if(combo == Cnd_summary_typ) return getCnd_summary_typ(row, info);
		if(combo == Cnd_jnl_act_cd) return getCnd_jnl_act_cd(row, info);
		if(combo == columnDtl_ac_slip_typ) return getDtl_ac_slip_typ(row, info);
		if(combo == columnDtl_summary_typ) return getDtl_summary_typ(row, info);
		if(combo == columnDtl_jnl_act_cd) return getDtl_jnl_act_cd(row, info);
		if(combo == columnDtl_auto_jnl_key_cd) return getDtl_auto_jnl_key_cd(row, info);
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
		else if (ap == DtlBtn_select_all) doDtlBtn_select_all(info);
		else if (ap == DtlBtn_deselect_all) doDtlBtn_deselect_all(info);
		else if (ap == DtlBtn_radd) doDtlBtn_radd(info);
		else if (ap == DtlBtn_rdel) doDtlBtn_rdel(info);
		else if (ap == DtlBtn_rcopy) doDtlBtn_rcopy(info);
		else if (ap == DtlBtn_upd) doDtlBtn_upd(info);
		else if (ap == DtlBtn_del) doDtlBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_select_all(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_radd(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rdel(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rcopy(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_upd(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_del(MCEventInfo info);

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
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_ac_slip_typ) return doCnd_ac_slip_typ_VC(info);
		if (vc == Cnd_ac_slip_typ_nm) return doCnd_ac_slip_typ_nm_VC(info);
		if (vc == Cnd_summary_typ) return doCnd_summary_typ_VC(info);
		if (vc == Cnd_summary_typ_nm) return doCnd_summary_typ_nm_VC(info);
		if (vc == Cnd_jnl_act_cd) return doCnd_jnl_act_cd_VC(info);
		if (vc == Cnd_jnl_act_nm) return doCnd_jnl_act_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_ac_slip_typ) return doDtl_ac_slip_typ_VC(info);
		if (vc == columnDtl_ac_slip_typ_nm) return doDtl_ac_slip_typ_nm_VC(info);
		if (vc == columnDtl_summary_typ) return doDtl_summary_typ_VC(info);
		if (vc == columnDtl_summary_typ_nm) return doDtl_summary_typ_nm_VC(info);
		if (vc == columnDtl_slo_no_flg) return doDtl_slo_no_flg_VC(info);
		if (vc == columnDtl_po_no_flg) return doDtl_po_no_flg_VC(info);
		if (vc == columnDtl_iv_no_flg) return doDtl_iv_no_flg_VC(info);
		if (vc == columnDtl_bill_no_flg) return doDtl_bill_no_flg_VC(info);
		if (vc == columnDtl_trd_unit_flg) return doDtl_trd_unit_flg_VC(info);
		if (vc == columnDtl_red_input_flg) return doDtl_red_input_flg_VC(info);
		if (vc == columnDtl_jnl_act_cd) return doDtl_jnl_act_cd_VC(info);
		if (vc == columnDtl_jnl_act_nm) return doDtl_jnl_act_nm_VC(info);
		if (vc == columnDtl_auto_jnl_key_cd) return doDtl_auto_jnl_key_cd_VC(info);
		if (vc == columnDtl_auto_jnl_key_nm) return doDtl_auto_jnl_key_nm_VC(info);
		if (vc == columnDtl_memo1) return doDtl_memo1_VC(info);
		if (vc == columnDtl_memo2) return doDtl_memo2_VC(info);
		if (vc == columnDtl_memo3) return doDtl_memo3_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_upd_cntr) return doDtl_upd_cntr_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
		if (vc == columnDtl_del_usr_id) return doDtl_del_usr_id_VC(info);
		if (vc == columnDtl_del_usr_nm) return doDtl_del_usr_nm_VC(info);
		if (vc == columnDtl_del_ts) return doDtl_del_ts_VC(info);
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
	 * [Mst]パネルの[mst_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMst_mst_set_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_slip_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[summary_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_summary_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[summary_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_summary_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[jnl_act_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_jnl_act_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[jnl_act_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_jnl_act_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[off_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_off_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_on_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_slip_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[summary_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_summary_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[summary_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_summary_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[red_input_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_red_input_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jnl_act_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jnl_act_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jnl_act_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jnl_act_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_auto_jnl_key_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_auto_jnl_key_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_ts_VC(MCEventInfo info){
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
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NC(info);
		else if (nc == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NC(info);
		else if (nc == Cnd_summary_typ) doCnd_summary_typ_NC(info);
		else if (nc == Cnd_summary_typ_nm) doCnd_summary_typ_nm_NC(info);
		else if (nc == Cnd_jnl_act_cd) doCnd_jnl_act_cd_NC(info);
		else if (nc == Cnd_jnl_act_nm) doCnd_jnl_act_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_ac_slip_typ) doDtl_ac_slip_typ_NC(info);
		else if (nc == columnDtl_ac_slip_typ_nm) doDtl_ac_slip_typ_nm_NC(info);
		else if (nc == columnDtl_summary_typ) doDtl_summary_typ_NC(info);
		else if (nc == columnDtl_summary_typ_nm) doDtl_summary_typ_nm_NC(info);
		else if (nc == columnDtl_slo_no_flg) doDtl_slo_no_flg_NC(info);
		else if (nc == columnDtl_po_no_flg) doDtl_po_no_flg_NC(info);
		else if (nc == columnDtl_iv_no_flg) doDtl_iv_no_flg_NC(info);
		else if (nc == columnDtl_bill_no_flg) doDtl_bill_no_flg_NC(info);
		else if (nc == columnDtl_trd_unit_flg) doDtl_trd_unit_flg_NC(info);
		else if (nc == columnDtl_red_input_flg) doDtl_red_input_flg_NC(info);
		else if (nc == columnDtl_jnl_act_cd) doDtl_jnl_act_cd_NC(info);
		else if (nc == columnDtl_jnl_act_nm) doDtl_jnl_act_nm_NC(info);
		else if (nc == columnDtl_auto_jnl_key_cd) doDtl_auto_jnl_key_cd_NC(info);
		else if (nc == columnDtl_auto_jnl_key_nm) doDtl_auto_jnl_key_nm_NC(info);
		else if (nc == columnDtl_memo1) doDtl_memo1_NC(info);
		else if (nc == columnDtl_memo2) doDtl_memo2_NC(info);
		else if (nc == columnDtl_memo3) doDtl_memo3_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_upd_cntr) doDtl_upd_cntr_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
		else if (nc == columnDtl_del_usr_id) doDtl_del_usr_id_NC(info);
		else if (nc == columnDtl_del_usr_nm) doDtl_del_usr_nm_NC(info);
		else if (nc == columnDtl_del_ts) doDtl_del_ts_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[summary_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_summary_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[summary_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_summary_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_act_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_act_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_act_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_act_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[off_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[summary_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_summary_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[summary_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_summary_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[red_input_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_red_input_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_act_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_act_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_act_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_act_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_key_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_key_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NC(MCEventInfo info){
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
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NE(info);
		else if (ne == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NE(info);
		else if (ne == Cnd_summary_typ) doCnd_summary_typ_NE(info);
		else if (ne == Cnd_summary_typ_nm) doCnd_summary_typ_nm_NE(info);
		else if (ne == Cnd_jnl_act_cd) doCnd_jnl_act_cd_NE(info);
		else if (ne == Cnd_jnl_act_nm) doCnd_jnl_act_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_ac_slip_typ) doDtl_ac_slip_typ_NE(info);
		else if (ne == columnDtl_ac_slip_typ_nm) doDtl_ac_slip_typ_nm_NE(info);
		else if (ne == columnDtl_summary_typ) doDtl_summary_typ_NE(info);
		else if (ne == columnDtl_summary_typ_nm) doDtl_summary_typ_nm_NE(info);
		else if (ne == columnDtl_slo_no_flg) doDtl_slo_no_flg_NE(info);
		else if (ne == columnDtl_po_no_flg) doDtl_po_no_flg_NE(info);
		else if (ne == columnDtl_iv_no_flg) doDtl_iv_no_flg_NE(info);
		else if (ne == columnDtl_bill_no_flg) doDtl_bill_no_flg_NE(info);
		else if (ne == columnDtl_trd_unit_flg) doDtl_trd_unit_flg_NE(info);
		else if (ne == columnDtl_red_input_flg) doDtl_red_input_flg_NE(info);
		else if (ne == columnDtl_jnl_act_cd) doDtl_jnl_act_cd_NE(info);
		else if (ne == columnDtl_jnl_act_nm) doDtl_jnl_act_nm_NE(info);
		else if (ne == columnDtl_auto_jnl_key_cd) doDtl_auto_jnl_key_cd_NE(info);
		else if (ne == columnDtl_auto_jnl_key_nm) doDtl_auto_jnl_key_nm_NE(info);
		else if (ne == columnDtl_memo1) doDtl_memo1_NE(info);
		else if (ne == columnDtl_memo2) doDtl_memo2_NE(info);
		else if (ne == columnDtl_memo3) doDtl_memo3_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_upd_cntr) doDtl_upd_cntr_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
		else if (ne == columnDtl_del_usr_id) doDtl_del_usr_id_NE(info);
		else if (ne == columnDtl_del_usr_nm) doDtl_del_usr_nm_NE(info);
		else if (ne == columnDtl_del_ts) doDtl_del_ts_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[summary_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_summary_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[summary_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_summary_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_act_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_act_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_act_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_act_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[off_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[summary_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_summary_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[summary_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_summary_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[red_input_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_red_input_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_act_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_act_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_act_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_act_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_key_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_key_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NE(MCEventInfo info){
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
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NX(info);
		else if (nx == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NX(info);
		else if (nx == Cnd_summary_typ) doCnd_summary_typ_NX(info);
		else if (nx == Cnd_summary_typ_nm) doCnd_summary_typ_nm_NX(info);
		else if (nx == Cnd_jnl_act_cd) doCnd_jnl_act_cd_NX(info);
		else if (nx == Cnd_jnl_act_nm) doCnd_jnl_act_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_ac_slip_typ) doDtl_ac_slip_typ_NX(info);
		else if (nx == columnDtl_ac_slip_typ_nm) doDtl_ac_slip_typ_nm_NX(info);
		else if (nx == columnDtl_summary_typ) doDtl_summary_typ_NX(info);
		else if (nx == columnDtl_summary_typ_nm) doDtl_summary_typ_nm_NX(info);
		else if (nx == columnDtl_slo_no_flg) doDtl_slo_no_flg_NX(info);
		else if (nx == columnDtl_po_no_flg) doDtl_po_no_flg_NX(info);
		else if (nx == columnDtl_iv_no_flg) doDtl_iv_no_flg_NX(info);
		else if (nx == columnDtl_bill_no_flg) doDtl_bill_no_flg_NX(info);
		else if (nx == columnDtl_trd_unit_flg) doDtl_trd_unit_flg_NX(info);
		else if (nx == columnDtl_red_input_flg) doDtl_red_input_flg_NX(info);
		else if (nx == columnDtl_jnl_act_cd) doDtl_jnl_act_cd_NX(info);
		else if (nx == columnDtl_jnl_act_nm) doDtl_jnl_act_nm_NX(info);
		else if (nx == columnDtl_auto_jnl_key_cd) doDtl_auto_jnl_key_cd_NX(info);
		else if (nx == columnDtl_auto_jnl_key_nm) doDtl_auto_jnl_key_nm_NX(info);
		else if (nx == columnDtl_memo1) doDtl_memo1_NX(info);
		else if (nx == columnDtl_memo2) doDtl_memo2_NX(info);
		else if (nx == columnDtl_memo3) doDtl_memo3_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_upd_cntr) doDtl_upd_cntr_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
		else if (nx == columnDtl_del_usr_id) doDtl_del_usr_id_NX(info);
		else if (nx == columnDtl_del_usr_nm) doDtl_del_usr_nm_NX(info);
		else if (nx == columnDtl_del_ts) doDtl_del_ts_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[summary_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_summary_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[summary_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_summary_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_act_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_act_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_act_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_act_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[off_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[summary_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_summary_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[summary_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_summary_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[red_input_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_red_input_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_act_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_act_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_act_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_act_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_key_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_key_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_LC(info);
		else if (lc == Cnd_ac_slip_typ) doCnd_ac_slip_typ_LC(info);
		else if (lc == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_LC(info);
		else if (lc == Cnd_summary_typ) doCnd_summary_typ_LC(info);
		else if (lc == Cnd_summary_typ_nm) doCnd_summary_typ_nm_LC(info);
		else if (lc == Cnd_jnl_act_cd) doCnd_jnl_act_cd_LC(info);
		else if (lc == Cnd_jnl_act_nm) doCnd_jnl_act_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnDtl_ac_slip_typ) doDtl_ac_slip_typ_LC(info);
		else if (lc == columnDtl_ac_slip_typ_nm) doDtl_ac_slip_typ_nm_LC(info);
		else if (lc == columnDtl_summary_typ) doDtl_summary_typ_LC(info);
		else if (lc == columnDtl_summary_typ_nm) doDtl_summary_typ_nm_LC(info);
		else if (lc == columnDtl_jnl_act_cd) doDtl_jnl_act_cd_LC(info);
		else if (lc == columnDtl_jnl_act_nm) doDtl_jnl_act_nm_LC(info);
		else if (lc == columnDtl_auto_jnl_key_cd) doDtl_auto_jnl_key_cd_LC(info);
		else if (lc == columnDtl_auto_jnl_key_nm) doDtl_auto_jnl_key_nm_LC(info);
		else if (lc == columnDtl_memo1) doDtl_memo1_LC(info);
		else if (lc == columnDtl_memo2) doDtl_memo2_LC(info);
		else if (lc == columnDtl_memo3) doDtl_memo3_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_upd_cntr) doDtl_upd_cntr_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
		else if (lc == columnDtl_del_usr_id) doDtl_del_usr_id_LC(info);
		else if (lc == columnDtl_del_usr_nm) doDtl_del_usr_nm_LC(info);
		else if (lc == columnDtl_del_ts) doDtl_del_ts_LC(info);
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[summary_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_summary_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[summary_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_summary_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_act_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_act_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_act_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_act_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ac_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[summary_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_summary_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[summary_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_summary_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_act_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_act_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_act_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_act_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_key_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_key_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_slip_typ]の作成メソッド
	 */
	public MCList getCnd_ac_slip_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcSlipTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_summary_typ]の作成メソッド
	 */
	public MCList getCnd_summary_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSummaryTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_jnl_act_cd]の作成メソッド
	 */
	public MCList getCnd_jnl_act_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getJnlAct(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ac_slip_typ]の作成メソッド
	 */
	public MCList getDtl_ac_slip_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcSlipTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_summary_typ]の作成メソッド
	 */
	public MCList getDtl_summary_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSummaryTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_jnl_act_cd]の作成メソッド
	 */
	public MCList getDtl_jnl_act_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getJnlAct(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_auto_jnl_key_cd]の作成メソッド
	 */
	public MCList getDtl_auto_jnl_key_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAutoJnlKey(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL1050.Srch01")) {
			return new MA_MABCL1050_Srch01Bridge();
		}
		if (id.equals("MA.MABCL1050.Upd01")) {
			return new MA_MABCL1050_Upd01Bridge();
		}
		if (id.equals("MA.MABCL1050.Del01")) {
			return new MA_MABCL1050_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL1050_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1050_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL1050_Srch01;

		/** コンストラクタ */
		protected MA_MABCL1050_Srch01Bridge() {
			p_MA_MABCL1050_Srch01 = new MCParam(PDef.MA_MABCL1050_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL1050_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP1050.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1050.DtlR.class));

			p_MA_MABCL1050_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL1050_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL1050_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL1050_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL1050_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP1050.CndR up0() {
			return (mcframe.clientMABC.MABCP1050.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP1050.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP1050.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL1050_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1050.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL1050_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP1050.DtlR>)p_MA_MABCL1050_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MA_MABCL1050_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1050_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL1050_Upd01;

		/** コンストラクタ */
		protected MA_MABCL1050_Upd01Bridge() {
			p_MA_MABCL1050_Upd01 = new MCParam(PDef.MA_MABCL1050_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL1050_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP1050.DtlR.class));
			// Down

			p_MA_MABCL1050_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL1050_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL1050_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL1050_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL1050_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP1050.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP1050.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL1050_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABCL1050_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1050_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL1050_Del01;

		/** コンストラクタ */
		protected MA_MABCL1050_Del01Bridge() {
			p_MA_MABCL1050_Del01 = new MCParam(PDef.MA_MABCL1050_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL1050_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP1050.DtlR.class));
			// Down

			p_MA_MABCL1050_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL1050_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL1050_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL1050_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL1050_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP1050.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP1050.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL1050_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}