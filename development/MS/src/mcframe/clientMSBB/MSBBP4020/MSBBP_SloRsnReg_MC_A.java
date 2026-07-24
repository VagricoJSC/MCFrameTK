package mcframe.clientMSBB.MSBBP4020;

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
import mcframe.clientMSBB.MSBBP4020.MSBBP_SloRsnReg_MC.MS_MSBBL4020_Srch01Caller;
import mcframe.clientMSBB.MSBBP4020.MSBBP_SloRsnReg_MC.MS_MSBBL4020_Upd01Caller;
import mcframe.clientMSBB.MSBBP4020.MSBBP_SloRsnReg_MC.MS_MSBBL4020_Del01Caller;

/**
 * 画面"MSBBP_SloRsnReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBP_SloRsnReg_MC_A extends mcframe.clientMAUD.MAUDP0030.MAUDP_RLBase{
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
	public static final String SUBMODULE_ID = "MSBB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBBP4020";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;DEL,Delete,1 UPD,登録・訂正する,0;DEL,削除する,1.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCLabel Cnd_slo_rsn_cd_Label = null;
	/**
	 * Quotation sales order reason cd. 見積受注理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_slo_rsn_cd = null;
	/**
	 * Quotation sales order reason name 見積受注理由名.<p>
	 *
	 */
	public MCTextField Cnd_slo_rsn_nm = null;
	/**
	 * Quotation terms 見積条件.<p>
	 *
	 */
	public MCLabel Cnd_qtn_term_flg_lab = null;
	/**
	 * Quotation terms. Off 見積条件.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_off_qtn_term_flg = null;
	/**
	 * Quotation terms. On 見積条件.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_on_qtn_term_flg = null;
	/**
	 * Quotation result 見積結果.<p>
	 *
	 */
	public MCLabel Cnd_qtn_rslt_flg_lab = null;
	/**
	 * Quotation result. Off 見積結果.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_off_qtn_rslt_flg = null;
	/**
	 * Quotation result. On 見積結果.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_on_qtn_rslt_flg = null;
	/**
	 * Cancel sales order 受注取消.<p>
	 *
	 */
	public MCLabel Cnd_slo_can_flg_lab = null;
	/**
	 * Sales order cancel. Off 受注取消.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_off_slo_can_flg = null;
	/**
	 * Sales order cancel. On 受注取消.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_on_slo_can_flg = null;
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
	// [SrchBtn1]ブロック関連のField定義
	public MCPanel SrchBtn1Panel = null;
	// [SrchBtn1]ブロックの項目のField定義
	// [SrchBtn2]ブロック関連のField定義
	public MCPanel SrchBtn2Panel = null;
	// [SrchBtn2]ブロックの項目のField定義
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton SrchBtn2_srch = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP4020.DtlR> DtlTable = null;
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
	 * Quotation sales order reason cd. 見積受注理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_rsn_cd = null;
	/**
	 * Quotation sales order reason name 見積受注理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_rsn_nm = null;
	/**
	 * Quotation terms 見積条件.<p>
	 *
	 */
	public MCColumnConfig columnDtl_qtn_term_flg = null;
	/**
	 * Quotation terms sort order 見積条件ソート順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_qtn_term_sort_seq = null;
	/**
	 * Quotation result 見積結果.<p>
	 *
	 */
	public MCColumnConfig columnDtl_qtn_rslt_flg = null;
	/**
	 * Quotation result sort order 見積結果ソート順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_qtn_rslt_sort_seq = null;
	/**
	 * Cancel sales order 受注取消.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_can_flg = null;
	/**
	 * Sales order cancel sort order 受注取消ソート順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_can_sort_seq = null;
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
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, DEL, FIX};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MS_MSBBL4020_Srch01]のCallerの作成 */
	protected MSBBP_SloRsnReg_MC.MS_MSBBL4020_Srch01Caller createMS_MSBBL4020_Srch01() {
		MSBBP_SloRsnReg_MC.MS_MSBBL4020_Srch01Caller<MSBBP_SloRsnReg, MS_MSBBL4020_Srch01Bridge>
		caller = ((MSBBP_SloRsnReg_MC)this).new MS_MSBBL4020_Srch01Caller<MSBBP_SloRsnReg, MS_MSBBL4020_Srch01Bridge>(
					(MSBBP_SloRsnReg)this, new MS_MSBBL4020_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBL4020_Srch01]の呼び出し */
	protected void callMS_MSBBL4020_Srch01() {
		MCCaller caller = createMS_MSBBL4020_Srch01();
		caller.exec();
	}
	/** [MS_MSBBL4020_Upd01]のCallerの作成 */
	protected MSBBP_SloRsnReg_MC.MS_MSBBL4020_Upd01Caller createMS_MSBBL4020_Upd01() {
		MSBBP_SloRsnReg_MC.MS_MSBBL4020_Upd01Caller<MSBBP_SloRsnReg, MS_MSBBL4020_Upd01Bridge>
		caller = ((MSBBP_SloRsnReg_MC)this).new MS_MSBBL4020_Upd01Caller<MSBBP_SloRsnReg, MS_MSBBL4020_Upd01Bridge>(
					(MSBBP_SloRsnReg)this, new MS_MSBBL4020_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBBL4020_Upd01]の呼び出し */
	protected void callMS_MSBBL4020_Upd01() {
		MCCaller caller = createMS_MSBBL4020_Upd01();
		caller.exec();
	}
	/** [MS_MSBBL4020_Del01]のCallerの作成 */
	protected MSBBP_SloRsnReg_MC.MS_MSBBL4020_Del01Caller createMS_MSBBL4020_Del01() {
		MSBBP_SloRsnReg_MC.MS_MSBBL4020_Del01Caller<MSBBP_SloRsnReg, MS_MSBBL4020_Del01Bridge>
		caller = ((MSBBP_SloRsnReg_MC)this).new MS_MSBBL4020_Del01Caller<MSBBP_SloRsnReg, MS_MSBBL4020_Del01Bridge>(
					(MSBBP_SloRsnReg)this, new MS_MSBBL4020_Del01Bridge());
		return caller;
	}
	/** [MS_MSBBL4020_Del01]の呼び出し */
	protected void callMS_MSBBL4020_Del01() {
		MCCaller caller = createMS_MSBBL4020_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP4020.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP4020.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBP4020.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP4020.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP4020.CndR createCndR() {
		return mcframe.clientMSBB.MSBBP4020.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBB.MSBBP4020.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP4020.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBB.MSBBP4020.DtlR createDtlR() {
		return mcframe.clientMSBB.MSBBP4020.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP4020.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBB.MSBBP4020.DtlR.class);
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
		ret.add(ScreenOpePanel);
		ret.add(CndPanel);
		ret.add(SrchBtn1Panel);
		ret.add(SrchBtn2Panel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SloRsnReg_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_SloRsnReg_MC_A(String name) {
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
		MSBBP_SloRsnReg_MC.jbCreateScreenOpe((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.jbCreateCnd((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.jbCreateSrchBtn1((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.jbCreateSrchBtn2((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.jbCreateDtl((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.jbCreateBtn((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.jbCreateEastBtn((MSBBP_SloRsnReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBBP_SloRsnReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBP_SloRsnReg p) {
	}

	/**
	 * [SrchBtn1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn1(MSBBP_SloRsnReg p) {
	}

	/**
	 * [SrchBtn2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn2(MSBBP_SloRsnReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBBP_SloRsnReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBBP_SloRsnReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBBP_SloRsnReg p) {
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

	
	/** [Cnd_slo_rsn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_slo_rsn_cd_p = null;

	/**
	 * [Cnd_slo_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_slo_rsn_cd_ListPutter() {
		if (Cnd_slo_rsn_cd_p == null) {
			Cnd_slo_rsn_cd_p = createCnd_slo_rsn_cd_ListPutter(Cnd_slo_rsn_cd, "slo_rsn_cd", "slo_rsn_nm");

		}
		return Cnd_slo_rsn_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_SloRsnReg create(){
		MSBBP_SloRsnReg p = new MSBBP_SloRsnReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_SloRsnReg create(String name){
		MSBBP_SloRsnReg p = new MSBBP_SloRsnReg(name);
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
		MSBBP_SloRsnReg_MC.jbfInitScreenOpe((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.jbfInitCnd((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.jbfInitSrchBtn1((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.jbfInitSrchBtn2((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.jbfInitDtl((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.jbfInitBtn((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.jbfInitEastBtn((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.jbInitScreenOpe((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.jbInitCnd((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.jbInitSrchBtn1((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.jbInitSrchBtn2((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.jbInitDtl((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.jbInitBtn((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.jbInitEastBtn((MSBBP_SloRsnReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBBP_SloRsnReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBP_SloRsnReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_slo_rsn_cd_Label = p.beansFactory.createLabel("Cnd.slo_rsn_cd_Label");
		p.Cnd_slo_rsn_cd = p.beansFactory.createTextComboBox("Cnd.slo_rsn_cd");
		p.Cnd_slo_rsn_cd.setLabel(p.Cnd_slo_rsn_cd_Label);
		p.Cnd_slo_rsn_nm = p.beansFactory.createTextField("Cnd.slo_rsn_nm");
		p.Cnd_qtn_term_flg_lab = p.beansFactory.createLabel("Cnd.qtn_term_flg_lab");
		p.Cnd_off_qtn_term_flg = p.beansFactory.createCheckBox("Cnd.off_qtn_term_flg");
		p.Cnd_on_qtn_term_flg = p.beansFactory.createCheckBox("Cnd.on_qtn_term_flg");
		p.Cnd_qtn_rslt_flg_lab = p.beansFactory.createLabel("Cnd.qtn_rslt_flg_lab");
		p.Cnd_off_qtn_rslt_flg = p.beansFactory.createCheckBox("Cnd.off_qtn_rslt_flg");
		p.Cnd_on_qtn_rslt_flg = p.beansFactory.createCheckBox("Cnd.on_qtn_rslt_flg");
		p.Cnd_slo_can_flg_lab = p.beansFactory.createLabel("Cnd.slo_can_flg_lab");
		p.Cnd_off_slo_can_flg = p.beansFactory.createCheckBox("Cnd.off_slo_can_flg");
		p.Cnd_on_slo_can_flg = p.beansFactory.createCheckBox("Cnd.on_slo_can_flg");
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_off_del_flg = p.beansFactory.createCheckBox("Cnd.off_del_flg");
		p.Cnd_on_del_flg = p.beansFactory.createCheckBox("Cnd.on_del_flg");
		p.Cnd_memo1_Label = p.beansFactory.createLabel("Cnd.memo1_Label");
		p.Cnd_memo1 = p.beansFactory.createTextField("Cnd.memo1");
		p.Cnd_memo1.setLabel(p.Cnd_memo1_Label);
		p.Cnd_memo2_Label = p.beansFactory.createLabel("Cnd.memo2_Label");
		p.Cnd_memo2 = p.beansFactory.createTextField("Cnd.memo2");
		p.Cnd_memo2.setLabel(p.Cnd_memo2_Label);
		p.Cnd_memo3_Label = p.beansFactory.createLabel("Cnd.memo3_Label");
		p.Cnd_memo3 = p.beansFactory.createTextField("Cnd.memo3");
		p.Cnd_memo3.setLabel(p.Cnd_memo3_Label);
	}

	/**
	 * [SrchBtn1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn1(MSBBP_SloRsnReg p) {
		// ブロック関連の初期化
		p.SrchBtn1Panel = p.beansFactory.createPanel("SrchBtn1");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchBtn2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn2(MSBBP_SloRsnReg p) {
		// ブロック関連の初期化
		p.SrchBtn2Panel = p.beansFactory.createPanel("SrchBtn2");
		// ブロックの項目の初期化
		p.SrchBtn2_srch = p.beansFactory.createButton("SrchBtn2.srch", "srch");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBBP_SloRsnReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_slo_rsn_cd = p.beansFactory.createTableColumn("Dtl.slo_rsn_cd", MCColumnType.TEXT);
		p.columnDtl_slo_rsn_nm = p.beansFactory.createTableColumn("Dtl.slo_rsn_nm", MCColumnType.TEXT);
		p.columnDtl_qtn_term_flg = p.beansFactory.createTableColumn("Dtl.qtn_term_flg", MCColumnType.CHECK);
		p.columnDtl_qtn_term_sort_seq = p.beansFactory.createTableColumn("Dtl.qtn_term_sort_seq", MCColumnType.NUMBER);
		p.columnDtl_qtn_rslt_flg = p.beansFactory.createTableColumn("Dtl.qtn_rslt_flg", MCColumnType.CHECK);
		p.columnDtl_qtn_rslt_sort_seq = p.beansFactory.createTableColumn("Dtl.qtn_rslt_sort_seq", MCColumnType.NUMBER);
		p.columnDtl_slo_can_flg = p.beansFactory.createTableColumn("Dtl.slo_can_flg", MCColumnType.CHECK);
		p.columnDtl_slo_can_sort_seq = p.beansFactory.createTableColumn("Dtl.slo_can_sort_seq", MCColumnType.NUMBER);
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
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBBP_SloRsnReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBBP_SloRsnReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBBP_SloRsnReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.CndPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBBP_SloRsnReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.SrchBtn1Panel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NS");
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP4020.CndR.ope_META);
		p.Cnd_slo_rsn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_slo_rsn_cd, true);
		p.Cnd_slo_rsn_cd.setLinkBeans(p.Cnd_slo_rsn_nm);
		p.CndPanel.add(p.Cnd_slo_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_slo_rsn_cd);
		p.CndPanel.setLastBeans(p.Cnd_slo_rsn_cd);
		p.Cnd_slo_rsn_cd.setNextBeans(p.Cnd_slo_rsn_nm);
		p.Cnd_slo_rsn_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP4020.CndR.slo_rsn_cd_META);
		p.CndPanel.add(p.Cnd_slo_rsn_nm);
		p.Cnd_slo_rsn_nm.setNextBeans(p.Cnd_off_qtn_term_flg);
		p.Cnd_slo_rsn_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP4020.CndR.slo_rsn_nm_META);
		p.setPluralValueEnable(p.Cnd_slo_rsn_nm, true);
		p.CndPanel.add(p.Cnd_qtn_term_flg_lab);
		p.CndPanel.add(p.Cnd_off_qtn_term_flg);
		p.Cnd_off_qtn_term_flg.setNextBeans(p.Cnd_on_qtn_term_flg);
		p.Cnd_off_qtn_term_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP4020.CndR.off_qtn_term_flg_META);
		p.CndPanel.add(p.Cnd_on_qtn_term_flg);
		p.Cnd_on_qtn_term_flg.setNextBeans(p.Cnd_off_qtn_rslt_flg);
		p.Cnd_on_qtn_term_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP4020.CndR.on_qtn_term_flg_META);
		p.CndPanel.add(p.Cnd_qtn_rslt_flg_lab);
		p.CndPanel.add(p.Cnd_off_qtn_rslt_flg);
		p.Cnd_off_qtn_rslt_flg.setNextBeans(p.Cnd_on_qtn_rslt_flg);
		p.Cnd_off_qtn_rslt_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP4020.CndR.off_qtn_rslt_flg_META);
		p.CndPanel.add(p.Cnd_on_qtn_rslt_flg);
		p.Cnd_on_qtn_rslt_flg.setNextBeans(p.Cnd_off_slo_can_flg);
		p.Cnd_on_qtn_rslt_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP4020.CndR.on_qtn_rslt_flg_META);
		p.CndPanel.add(p.Cnd_slo_can_flg_lab);
		p.CndPanel.add(p.Cnd_off_slo_can_flg);
		p.Cnd_off_slo_can_flg.setNextBeans(p.Cnd_on_slo_can_flg);
		p.Cnd_off_slo_can_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP4020.CndR.off_slo_can_flg_META);
		p.CndPanel.add(p.Cnd_on_slo_can_flg);
		p.Cnd_on_slo_can_flg.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_on_slo_can_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP4020.CndR.on_slo_can_flg_META);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP4020.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setNextBeans(p.Cnd_memo1);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP4020.CndR.on_del_flg_META);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP4020.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP4020.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP4020.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
	}

	/**
	 * [SrchBtn1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn1(MSBBP_SloRsnReg p) {
		// ブロック関連の初期化
		p.add(p.SrchBtn1Panel);
		p.SrchBtn1Panel.setNextBeans(p.SrchBtn2Panel);
		p.SrchBtn1Panel.setLayoutPosition("NSW");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchBtn2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn2(MSBBP_SloRsnReg p) {
		// ブロック関連の初期化
		p.add(p.SrchBtn2Panel);
		p.SrchBtn2Panel.setNextBeans(p.DtlPanel);
		p.SrchBtn2Panel.setLayoutPosition("NSE");
		// ブロックの項目の初期化
		p.SrchBtn2_srch.setIcon("SEARCH");
		p.SrchBtn2_srch.setFunctionKey(MCFunctionKey.F1);
		p.SrchBtn2Panel.add(p.SrchBtn2_srch);
		p.SrchBtn2Panel.setLastBeans(p.SrchBtn2_srch);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBBP_SloRsnReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBBP_SloRsnReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_radd);
		p.Btn_radd.setIcon("INSERT_RECORD");
		p.Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_radd);
		p.Btn_radd.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBBP_SloRsnReg p) {
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

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSBBP_SloRsnReg_MC.mcInitScreenOpe((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.mcInitCnd((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.mcInitSrchBtn1((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.mcInitSrchBtn2((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.mcInitDtl((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.mcInitBtn((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.mcInitEastBtn((MSBBP_SloRsnReg)this);

		// [UPD]ステータスのモードの設定
		MSBBP_SloRsnReg_MC.statusInitUPD_ScreenOpe((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.statusInitUPD_Cnd((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.statusInitUPD_SrchBtn1((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.statusInitUPD_SrchBtn2((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.statusInitUPD_Dtl((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.statusInitUPD_Btn((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.statusInitUPD_EastBtn((MSBBP_SloRsnReg)this);

		// [DEL]ステータスのモードの設定
		MSBBP_SloRsnReg_MC.statusInitDEL_ScreenOpe((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.statusInitDEL_Cnd((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.statusInitDEL_SrchBtn1((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.statusInitDEL_SrchBtn2((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.statusInitDEL_Dtl((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.statusInitDEL_Btn((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.statusInitDEL_EastBtn((MSBBP_SloRsnReg)this);

		// [FIX]ステータスのモードの設定
		MSBBP_SloRsnReg_MC.statusInitFIX_ScreenOpe((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.statusInitFIX_Cnd((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.statusInitFIX_SrchBtn1((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.statusInitFIX_SrchBtn2((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.statusInitFIX_Dtl((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.statusInitFIX_Btn((MSBBP_SloRsnReg)this);
		MSBBP_SloRsnReg_MC.statusInitFIX_EastBtn((MSBBP_SloRsnReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBBP_SloRsnReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBP_SloRsnReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_slo_rsn_cd.setListListener(p);
		p.Cnd_slo_rsn_cd.addAllListener(p);
		p.Cnd_slo_rsn_nm.setListListener(p);
		p.Cnd_slo_rsn_nm.addAllListener(p);
		p.Cnd_off_qtn_term_flg.addAllListener(p);
		p.Cnd_on_qtn_term_flg.addAllListener(p);
		p.Cnd_off_qtn_rslt_flg.addAllListener(p);
		p.Cnd_on_qtn_rslt_flg.addAllListener(p);
		p.Cnd_off_slo_can_flg.addAllListener(p);
		p.Cnd_on_slo_can_flg.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
	}

	/**
	 *  [SrchBtn1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn1(MSBBP_SloRsnReg p) {
	}

	/**
	 *  [SrchBtn2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn2(MSBBP_SloRsnReg p) {
		p.SrchBtn2_srch.addAllListener(p);
		p.SrchBtn2_srch.setAPMethodName("doSrchBtn2_srch");
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBBP_SloRsnReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_slo_rsn_cd.addAllListener(p);
		p.columnDtl_slo_rsn_cd.setListListener(p);
		p.columnDtl_slo_rsn_nm.addAllListener(p);
		p.columnDtl_slo_rsn_nm.setListListener(p);
		p.columnDtl_qtn_term_flg.addAllListener(p);
		p.columnDtl_qtn_term_sort_seq.addAllListener(p);
		p.columnDtl_qtn_term_sort_seq.setListListener(p);
		p.columnDtl_qtn_rslt_flg.addAllListener(p);
		p.columnDtl_qtn_rslt_sort_seq.addAllListener(p);
		p.columnDtl_qtn_rslt_sort_seq.setListListener(p);
		p.columnDtl_slo_can_flg.addAllListener(p);
		p.columnDtl_slo_can_sort_seq.addAllListener(p);
		p.columnDtl_slo_can_sort_seq.setListListener(p);
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
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBBP_SloRsnReg p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBBP_SloRsnReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBBP_SloRsnReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBBP_SloRsnReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_slo_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_rsn_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_qtn_term_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_qtn_term_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_qtn_rslt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_qtn_rslt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_slo_can_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_slo_can_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[SrchBtn1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SrchBtn1(MSBBP_SloRsnReg p){

	}

	/**
	 * [UPD]ステータスの[SrchBtn2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SrchBtn2(MSBBP_SloRsnReg p){
		p.SrchBtn2_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBBP_SloRsnReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_slo_rsn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_slo_rsn_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_qtn_term_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_qtn_term_sort_seq.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_qtn_rslt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_qtn_rslt_sort_seq.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_slo_can_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_slo_can_sort_seq.putMode(p, UPD, MCMode.REQUIRED);
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
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBBP_SloRsnReg p){
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBBP_SloRsnReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBBP_SloRsnReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBBP_SloRsnReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_slo_rsn_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_slo_rsn_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_qtn_term_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_qtn_term_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_qtn_rslt_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_qtn_rslt_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_slo_can_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_slo_can_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[SrchBtn1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SrchBtn1(MSBBP_SloRsnReg p){

	}

	/**
	 * [DEL]ステータスの[SrchBtn2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SrchBtn2(MSBBP_SloRsnReg p){
		p.SrchBtn2_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBBP_SloRsnReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_qtn_term_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_qtn_term_sort_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_qtn_rslt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_qtn_rslt_sort_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_can_sort_seq.putMode(p, DEL, MCMode.READ_ONLY);
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
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBBP_SloRsnReg p){
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBBP_SloRsnReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MSBBP_SloRsnReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MSBBP_SloRsnReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_slo_rsn_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_slo_rsn_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_qtn_term_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_qtn_term_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_qtn_rslt_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_qtn_rslt_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_slo_can_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_slo_can_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[SrchBtn1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_SrchBtn1(MSBBP_SloRsnReg p){

	}

	/**
	 * [FIX]ステータスの[SrchBtn2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_SrchBtn2(MSBBP_SloRsnReg p){
		p.SrchBtn2_srch.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MSBBP_SloRsnReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_slo_rsn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_slo_rsn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_qtn_term_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_qtn_term_sort_seq.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_qtn_rslt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_qtn_rslt_sort_seq.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_slo_can_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_slo_can_sort_seq.putMode(p, FIX, MCMode.READ_ONLY);
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
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MSBBP_SloRsnReg p){
		p.Btn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MSBBP_SloRsnReg p){

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
		MSBBP_SloRsnReg_MC.setTableConfigDtl((MSBBP_SloRsnReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBBP_SloRsnReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_slo_rsn_cd.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.slo_rsn_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_rsn_cd);
		p.columnDtl_slo_rsn_nm.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.slo_rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_rsn_nm);
		p.columnDtl_qtn_term_flg.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.qtn_term_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_qtn_term_flg);
		p.columnDtl_qtn_term_sort_seq.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.qtn_term_sort_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_qtn_term_sort_seq);
		p.columnDtl_qtn_rslt_flg.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.qtn_rslt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_qtn_rslt_flg);
		p.columnDtl_qtn_rslt_sort_seq.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.qtn_rslt_sort_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_qtn_rslt_sort_seq);
		p.columnDtl_slo_can_flg.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.slo_can_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_can_flg);
		p.columnDtl_slo_can_sort_seq.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.slo_can_sort_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_can_sort_seq);
		p.columnDtl_memo1.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMSBB.MSBBP4020.DtlR.del_ts_META);
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
		Cnd_slo_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_slo_rsn_cd.getListConfig().setPutter(getCnd_slo_rsn_cd_ListPutter());
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
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
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
	 * [Cnd_slo_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_slo_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.QtnSloRsn");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_slo_rsn_cd) return getCnd_slo_rsn_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == SrchBtn2_srch) doSrchBtn2_srch(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [SrchBtn2]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doSrchBtn2_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

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
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_slo_rsn_cd) return doCnd_slo_rsn_cd_VC(info);
		if (vc == Cnd_slo_rsn_nm) return doCnd_slo_rsn_nm_VC(info);
		if (vc == Cnd_off_qtn_term_flg) return doCnd_off_qtn_term_flg_VC(info);
		if (vc == Cnd_on_qtn_term_flg) return doCnd_on_qtn_term_flg_VC(info);
		if (vc == Cnd_off_qtn_rslt_flg) return doCnd_off_qtn_rslt_flg_VC(info);
		if (vc == Cnd_on_qtn_rslt_flg) return doCnd_on_qtn_rslt_flg_VC(info);
		if (vc == Cnd_off_slo_can_flg) return doCnd_off_slo_can_flg_VC(info);
		if (vc == Cnd_on_slo_can_flg) return doCnd_on_slo_can_flg_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_slo_rsn_cd) return doDtl_slo_rsn_cd_VC(info);
		if (vc == columnDtl_slo_rsn_nm) return doDtl_slo_rsn_nm_VC(info);
		if (vc == columnDtl_qtn_term_flg) return doDtl_qtn_term_flg_VC(info);
		if (vc == columnDtl_qtn_term_sort_seq) return doDtl_qtn_term_sort_seq_VC(info);
		if (vc == columnDtl_qtn_rslt_flg) return doDtl_qtn_rslt_flg_VC(info);
		if (vc == columnDtl_qtn_rslt_sort_seq) return doDtl_qtn_rslt_sort_seq_VC(info);
		if (vc == columnDtl_slo_can_flg) return doDtl_slo_can_flg_VC(info);
		if (vc == columnDtl_slo_can_sort_seq) return doDtl_slo_can_sort_seq_VC(info);
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[off_qtn_term_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_off_qtn_term_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[on_qtn_term_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_on_qtn_term_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[off_qtn_rslt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_off_qtn_rslt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[on_qtn_rslt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_on_qtn_rslt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[off_slo_can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_off_slo_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[on_slo_can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_on_slo_can_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[slo_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[qtn_term_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_qtn_term_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[qtn_term_sort_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_qtn_term_sort_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[qtn_rslt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_qtn_rslt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[qtn_rslt_sort_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_qtn_rslt_sort_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_can_sort_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_can_sort_seq_VC(MCEventInfo info){
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
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_slo_rsn_cd) doCnd_slo_rsn_cd_NC(info);
		else if (nc == Cnd_slo_rsn_nm) doCnd_slo_rsn_nm_NC(info);
		else if (nc == Cnd_off_qtn_term_flg) doCnd_off_qtn_term_flg_NC(info);
		else if (nc == Cnd_on_qtn_term_flg) doCnd_on_qtn_term_flg_NC(info);
		else if (nc == Cnd_off_qtn_rslt_flg) doCnd_off_qtn_rslt_flg_NC(info);
		else if (nc == Cnd_on_qtn_rslt_flg) doCnd_on_qtn_rslt_flg_NC(info);
		else if (nc == Cnd_off_slo_can_flg) doCnd_off_slo_can_flg_NC(info);
		else if (nc == Cnd_on_slo_can_flg) doCnd_on_slo_can_flg_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_slo_rsn_cd) doDtl_slo_rsn_cd_NC(info);
		else if (nc == columnDtl_slo_rsn_nm) doDtl_slo_rsn_nm_NC(info);
		else if (nc == columnDtl_qtn_term_flg) doDtl_qtn_term_flg_NC(info);
		else if (nc == columnDtl_qtn_term_sort_seq) doDtl_qtn_term_sort_seq_NC(info);
		else if (nc == columnDtl_qtn_rslt_flg) doDtl_qtn_rslt_flg_NC(info);
		else if (nc == columnDtl_qtn_rslt_sort_seq) doDtl_qtn_rslt_sort_seq_NC(info);
		else if (nc == columnDtl_slo_can_flg) doDtl_slo_can_flg_NC(info);
		else if (nc == columnDtl_slo_can_sort_seq) doDtl_slo_can_sort_seq_NC(info);
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
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_qtn_term_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_qtn_term_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_qtn_term_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_qtn_term_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_qtn_rslt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_qtn_rslt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_qtn_rslt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_qtn_rslt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_slo_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_slo_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_slo_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_slo_can_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[slo_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_term_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_term_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_term_sort_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_term_sort_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_rslt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_rslt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_rslt_sort_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_rslt_sort_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_can_sort_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_can_sort_seq_NC(MCEventInfo info){
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
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_slo_rsn_cd) doCnd_slo_rsn_cd_NE(info);
		else if (ne == Cnd_slo_rsn_nm) doCnd_slo_rsn_nm_NE(info);
		else if (ne == Cnd_off_qtn_term_flg) doCnd_off_qtn_term_flg_NE(info);
		else if (ne == Cnd_on_qtn_term_flg) doCnd_on_qtn_term_flg_NE(info);
		else if (ne == Cnd_off_qtn_rslt_flg) doCnd_off_qtn_rslt_flg_NE(info);
		else if (ne == Cnd_on_qtn_rslt_flg) doCnd_on_qtn_rslt_flg_NE(info);
		else if (ne == Cnd_off_slo_can_flg) doCnd_off_slo_can_flg_NE(info);
		else if (ne == Cnd_on_slo_can_flg) doCnd_on_slo_can_flg_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_slo_rsn_cd) doDtl_slo_rsn_cd_NE(info);
		else if (ne == columnDtl_slo_rsn_nm) doDtl_slo_rsn_nm_NE(info);
		else if (ne == columnDtl_qtn_term_flg) doDtl_qtn_term_flg_NE(info);
		else if (ne == columnDtl_qtn_term_sort_seq) doDtl_qtn_term_sort_seq_NE(info);
		else if (ne == columnDtl_qtn_rslt_flg) doDtl_qtn_rslt_flg_NE(info);
		else if (ne == columnDtl_qtn_rslt_sort_seq) doDtl_qtn_rslt_sort_seq_NE(info);
		else if (ne == columnDtl_slo_can_flg) doDtl_slo_can_flg_NE(info);
		else if (ne == columnDtl_slo_can_sort_seq) doDtl_slo_can_sort_seq_NE(info);
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
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_qtn_term_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_qtn_term_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_qtn_term_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_qtn_term_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_qtn_rslt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_qtn_rslt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_qtn_rslt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_qtn_rslt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_slo_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_slo_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_slo_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_slo_can_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[slo_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_term_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_term_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_term_sort_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_term_sort_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_rslt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_rslt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_rslt_sort_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_rslt_sort_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_can_sort_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_can_sort_seq_NE(MCEventInfo info){
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
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_slo_rsn_cd) doCnd_slo_rsn_cd_NX(info);
		else if (nx == Cnd_slo_rsn_nm) doCnd_slo_rsn_nm_NX(info);
		else if (nx == Cnd_off_qtn_term_flg) doCnd_off_qtn_term_flg_NX(info);
		else if (nx == Cnd_on_qtn_term_flg) doCnd_on_qtn_term_flg_NX(info);
		else if (nx == Cnd_off_qtn_rslt_flg) doCnd_off_qtn_rslt_flg_NX(info);
		else if (nx == Cnd_on_qtn_rslt_flg) doCnd_on_qtn_rslt_flg_NX(info);
		else if (nx == Cnd_off_slo_can_flg) doCnd_off_slo_can_flg_NX(info);
		else if (nx == Cnd_on_slo_can_flg) doCnd_on_slo_can_flg_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_slo_rsn_cd) doDtl_slo_rsn_cd_NX(info);
		else if (nx == columnDtl_slo_rsn_nm) doDtl_slo_rsn_nm_NX(info);
		else if (nx == columnDtl_qtn_term_flg) doDtl_qtn_term_flg_NX(info);
		else if (nx == columnDtl_qtn_term_sort_seq) doDtl_qtn_term_sort_seq_NX(info);
		else if (nx == columnDtl_qtn_rslt_flg) doDtl_qtn_rslt_flg_NX(info);
		else if (nx == columnDtl_qtn_rslt_sort_seq) doDtl_qtn_rslt_sort_seq_NX(info);
		else if (nx == columnDtl_slo_can_flg) doDtl_slo_can_flg_NX(info);
		else if (nx == columnDtl_slo_can_sort_seq) doDtl_slo_can_sort_seq_NX(info);
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
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_qtn_term_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_qtn_term_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_qtn_term_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_qtn_term_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_qtn_rslt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_qtn_rslt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_qtn_rslt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_qtn_rslt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_slo_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_slo_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_slo_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_slo_can_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[slo_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_term_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_term_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_term_sort_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_term_sort_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_rslt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_rslt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_rslt_sort_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_rslt_sort_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_can_sort_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_can_sort_seq_NX(MCEventInfo info){
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
		if (lc == Cnd_slo_rsn_cd) doCnd_slo_rsn_cd_LC(info);
		else if (lc == Cnd_slo_rsn_nm) doCnd_slo_rsn_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnDtl_slo_rsn_cd) doDtl_slo_rsn_cd_LC(info);
		else if (lc == columnDtl_slo_rsn_nm) doDtl_slo_rsn_nm_LC(info);
		else if (lc == columnDtl_qtn_term_sort_seq) doDtl_qtn_term_sort_seq_LC(info);
		else if (lc == columnDtl_qtn_rslt_sort_seq) doDtl_qtn_rslt_sort_seq_LC(info);
		else if (lc == columnDtl_slo_can_sort_seq) doDtl_slo_can_sort_seq_LC(info);
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
	 * [Cnd]パネルの[slo_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_rsn_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[slo_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_term_sort_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_term_sort_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_rslt_sort_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_rslt_sort_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_can_sort_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_can_sort_seq_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_slo_rsn_cd]の作成メソッド
	 */
	public MCList getCnd_slo_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getQtnSloRsn(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBL4020.Srch01")) {
			return new MS_MSBBL4020_Srch01Bridge();
		}
		if (id.equals("MS.MSBBL4020.Upd01")) {
			return new MS_MSBBL4020_Upd01Bridge();
		}
		if (id.equals("MS.MSBBL4020.Del01")) {
			return new MS_MSBBL4020_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBL4020_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL4020_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL4020_Srch01;

		/** コンストラクタ */
		protected MS_MSBBL4020_Srch01Bridge() {
			p_MS_MSBBL4020_Srch01 = new MCParam(PDef.MS_MSBBL4020_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL4020_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP4020.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP4020.DtlR.class));

			p_MS_MSBBL4020_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL4020_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL4020_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL4020_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL4020_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP4020.CndR up0() {
			return (mcframe.clientMSBB.MSBBP4020.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP4020.DtlR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP4020.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL4020_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP4020.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL4020_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBB.MSBBP4020.DtlR>)p_MS_MSBBL4020_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBBL4020_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL4020_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL4020_Upd01;

		/** コンストラクタ */
		protected MS_MSBBL4020_Upd01Bridge() {
			p_MS_MSBBL4020_Upd01 = new MCParam(PDef.MS_MSBBL4020_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL4020_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP4020.DtlR.class));
			// Down

			p_MS_MSBBL4020_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL4020_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL4020_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL4020_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL4020_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP4020.DtlR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP4020.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBBL4020_Upd01;
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
	 * [MS_MSBBL4020_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL4020_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL4020_Del01;

		/** コンストラクタ */
		protected MS_MSBBL4020_Del01Bridge() {
			p_MS_MSBBL4020_Del01 = new MCParam(PDef.MS_MSBBL4020_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL4020_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP4020.DtlR.class));
			// Down

			p_MS_MSBBL4020_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL4020_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL4020_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL4020_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL4020_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP4020.DtlR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP4020.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBBL4020_Del01;
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