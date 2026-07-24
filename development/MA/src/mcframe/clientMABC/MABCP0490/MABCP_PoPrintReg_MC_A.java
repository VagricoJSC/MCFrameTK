package mcframe.clientMABC.MABCP0490;

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
import mcframe.clientMABC.MABCP0490.MABCP_PoPrintReg_MC.MA_MABCL0490_Srch01Caller;
import mcframe.clientMABC.MABCP0490.MABCP_PoPrintReg_MC.MA_MABCL0490_Upd01Caller;
import mcframe.clientMABC.MABCP0490.MABCP_PoPrintReg_MC.MA_MABCL0490_Del01Caller;

/**
 * 画面"MABCP_PoPrintReg"パネルクラスです。<p>
 *
 * 注文書表示マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_PoPrintReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABCP0490";

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
	public MCLabel Cnd_po_print_cd_Label = null;
	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_po_print_cd = null;
	/**
	 * Display PO sheet name 注文書表示名.<p>
	 *
	 */
	public MCTextField Cnd_po_print_nm = null;
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
	public MCTable2<mcframe.clientMABC.MABCP0490.DtlR> DtlTable = null;
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
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_print_cd = null;
	/**
	 * Display PO sheet name 注文書表示名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_print_nm = null;
	/**
	 * Text (New: without temporary unit price) テキスト（新規：仮単価なし）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_txt_new_off = null;
	/**
	 * Text (New: with temporary unit price) テキスト（新規：仮単価あり）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_txt_new_on = null;
	/**
	 * Text (Correct: without temporary unit price) テキスト（訂正：仮単価なし）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_txt_mod_off = null;
	/**
	 * Text (Correct: with temporary unit price) テキスト（訂正：仮単価あり）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_txt_mod_on = null;
	/**
	 * Text (Cancel: without temporary unit price) テキスト（取消：仮単価なし）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_txt_del_off = null;
	/**
	 * Text (Cancel: with temporary unit price) テキスト（取消：仮単価あり）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_txt_del_on = null;
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
	// [DtlInfoTab]ブロック関連のField定義
	public MCPanel DtlInfoTabPanel = null;
	public MCTabbedPane DtlInfoTabTab = null;
	// [DtlInfoTab]ブロックの項目のField定義
	// [Prnt1]ブロック関連のField定義
	public MCPanel Prnt1Panel = null;
	// [Prnt1]ブロックの項目のField定義
	public MCLabel Prnt1_txt_new_off_Label = null;
	public MCScrollPane Prnt1_txt_new_offScrollPane = null;
	/**
	 * Text (New: without temporary unit price) テキスト（新規：仮単価なし）.<p>
	 *
	 */
	public MCTextArea Prnt1_txt_new_off = null;
	public MCLabel Prnt1_txt_new_on_Label = null;
	public MCScrollPane Prnt1_txt_new_onScrollPane = null;
	/**
	 * Text (New: with temporary unit price) テキスト（新規：仮単価あり）.<p>
	 *
	 */
	public MCTextArea Prnt1_txt_new_on = null;
	// [Prnt2]ブロック関連のField定義
	public MCPanel Prnt2Panel = null;
	// [Prnt2]ブロックの項目のField定義
	public MCLabel Prnt2_txt_mod_off_Label = null;
	public MCScrollPane Prnt2_txt_mod_offScrollPane = null;
	/**
	 * Text (Correct: without temporary unit price) テキスト（訂正：仮単価なし）.<p>
	 *
	 */
	public MCTextArea Prnt2_txt_mod_off = null;
	public MCLabel Prnt2_txt_mod_on_Label = null;
	public MCScrollPane Prnt2_txt_mod_onScrollPane = null;
	/**
	 * Text (Correct: with temporary unit price) テキスト（訂正：仮単価あり）.<p>
	 *
	 */
	public MCTextArea Prnt2_txt_mod_on = null;
	// [Prnt3]ブロック関連のField定義
	public MCPanel Prnt3Panel = null;
	// [Prnt3]ブロックの項目のField定義
	public MCLabel Prnt3_txt_del_off_Label = null;
	public MCScrollPane Prnt3_txt_del_offScrollPane = null;
	/**
	 * Text (Cancel: without temporary unit price) テキスト（取消：仮単価なし）.<p>
	 *
	 */
	public MCTextArea Prnt3_txt_del_off = null;
	public MCLabel Prnt3_txt_del_on_Label = null;
	public MCScrollPane Prnt3_txt_del_onScrollPane = null;
	/**
	 * Text (Cancel: with temporary unit price) テキスト（取消：仮単価あり）.<p>
	 *
	 */
	public MCTextArea Prnt3_txt_del_on = null;
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
	
	/** [MA_MABCL0490_Srch01]のCallerの作成 */
	protected MABCP_PoPrintReg_MC.MA_MABCL0490_Srch01Caller createMA_MABCL0490_Srch01() {
		MABCP_PoPrintReg_MC.MA_MABCL0490_Srch01Caller<MABCP_PoPrintReg, MA_MABCL0490_Srch01Bridge>
		caller = ((MABCP_PoPrintReg_MC)this).new MA_MABCL0490_Srch01Caller<MABCP_PoPrintReg, MA_MABCL0490_Srch01Bridge>(
					(MABCP_PoPrintReg)this, new MA_MABCL0490_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0490_Srch01]の呼び出し */
	protected void callMA_MABCL0490_Srch01() {
		MCCaller caller = createMA_MABCL0490_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0490_Upd01]のCallerの作成 */
	protected MABCP_PoPrintReg_MC.MA_MABCL0490_Upd01Caller createMA_MABCL0490_Upd01() {
		MABCP_PoPrintReg_MC.MA_MABCL0490_Upd01Caller<MABCP_PoPrintReg, MA_MABCL0490_Upd01Bridge>
		caller = ((MABCP_PoPrintReg_MC)this).new MA_MABCL0490_Upd01Caller<MABCP_PoPrintReg, MA_MABCL0490_Upd01Bridge>(
					(MABCP_PoPrintReg)this, new MA_MABCL0490_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0490_Upd01]の呼び出し */
	protected void callMA_MABCL0490_Upd01() {
		MCCaller caller = createMA_MABCL0490_Upd01();
		caller.exec();
	}
	/** [MA_MABCL0490_Del01]のCallerの作成 */
	protected MABCP_PoPrintReg_MC.MA_MABCL0490_Del01Caller createMA_MABCL0490_Del01() {
		MABCP_PoPrintReg_MC.MA_MABCL0490_Del01Caller<MABCP_PoPrintReg, MA_MABCL0490_Del01Bridge>
		caller = ((MABCP_PoPrintReg_MC)this).new MA_MABCL0490_Del01Caller<MABCP_PoPrintReg, MA_MABCL0490_Del01Bridge>(
					(MABCP_PoPrintReg)this, new MA_MABCL0490_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL0490_Del01]の呼び出し */
	protected void callMA_MABCL0490_Del01() {
		MCCaller caller = createMA_MABCL0490_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0490.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0490.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0490.DtlR> aDtlL;
	/** [Prnt1]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0490.Prnt1R aPrnt1R;
	/** [Prnt2]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0490.Prnt2R aPrnt2R;
	/** [Prnt3]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0490.Prnt3R aPrnt3R;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP0490.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0490.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0490.MstR createMstR() {
		return mcframe.clientMABC.MABCP0490.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0490.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0490.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0490.CndR createCndR() {
		return mcframe.clientMABC.MABCP0490.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0490.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0490.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0490.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0490.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0490.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0490.DtlR.class);
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
	 * 項目コピーによってaPrnt1Rを設定します。
	 *
	 * aPrnt1Rのインスタンスは変更されません。
	 *
	 * @param row Prnt1R
	 */
	public void setPrnt1R(mcframe.clientMABC.MABCP0490.Prnt1R row) {
		if (row != null) {
			MCRow.copyall(getPrnt1R(), row);
		}
	}

	/**
	 * [Prnt1]ブロックのコンテナaPrnt1Rを返します。
	 *
	 * @return Prnt1R
	 */
	public mcframe.clientMABC.MABCP0490.Prnt1R getPrnt1R() {
		return aPrnt1R;
	}

	/**
	 * aPrnt1Rを作成します。
	 *
	 * @return Prnt1R
	 */
	public mcframe.clientMABC.MABCP0490.Prnt1R createPrnt1R() {
		return mcframe.clientMABC.MABCP0490.Prnt1R.create();
	}

	/**
	 * 項目コピーによってaPrnt2Rを設定します。
	 *
	 * aPrnt2Rのインスタンスは変更されません。
	 *
	 * @param row Prnt2R
	 */
	public void setPrnt2R(mcframe.clientMABC.MABCP0490.Prnt2R row) {
		if (row != null) {
			MCRow.copyall(getPrnt2R(), row);
		}
	}

	/**
	 * [Prnt2]ブロックのコンテナaPrnt2Rを返します。
	 *
	 * @return Prnt2R
	 */
	public mcframe.clientMABC.MABCP0490.Prnt2R getPrnt2R() {
		return aPrnt2R;
	}

	/**
	 * aPrnt2Rを作成します。
	 *
	 * @return Prnt2R
	 */
	public mcframe.clientMABC.MABCP0490.Prnt2R createPrnt2R() {
		return mcframe.clientMABC.MABCP0490.Prnt2R.create();
	}

	/**
	 * 項目コピーによってaPrnt3Rを設定します。
	 *
	 * aPrnt3Rのインスタンスは変更されません。
	 *
	 * @param row Prnt3R
	 */
	public void setPrnt3R(mcframe.clientMABC.MABCP0490.Prnt3R row) {
		if (row != null) {
			MCRow.copyall(getPrnt3R(), row);
		}
	}

	/**
	 * [Prnt3]ブロックのコンテナaPrnt3Rを返します。
	 *
	 * @return Prnt3R
	 */
	public mcframe.clientMABC.MABCP0490.Prnt3R getPrnt3R() {
		return aPrnt3R;
	}

	/**
	 * aPrnt3Rを作成します。
	 *
	 * @return Prnt3R
	 */
	public mcframe.clientMABC.MABCP0490.Prnt3R createPrnt3R() {
		return mcframe.clientMABC.MABCP0490.Prnt3R.create();
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
		if(!MCCollectionUtil.contains(ret, getPrnt1R())) ret.add(getPrnt1R());
		if(!MCCollectionUtil.contains(ret, getPrnt2R())) ret.add(getPrnt2R());
		if(!MCCollectionUtil.contains(ret, getPrnt3R())) ret.add(getPrnt3R());
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
		if(aCnt == getPrnt1R()) return "Prnt1";
		if(aCnt == getPrnt2R()) return "Prnt2";
		if(aCnt == getPrnt3R()) return "Prnt3";
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
		if(bId.equals("Prnt1")) return getPrnt1R();
		if(bId.equals("Prnt2")) return getPrnt2R();
		if(bId.equals("Prnt3")) return getPrnt3R();
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
		ret.add(DtlInfoTabPanel);
		ret.add(Prnt1Panel);
		ret.add(Prnt2Panel);
		ret.add(Prnt3Panel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_PoPrintReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();
		aPrnt1R = createPrnt1R();
		aPrnt2R = createPrnt2R();
		aPrnt3R = createPrnt3R();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_PoPrintReg_MC_A(String name) {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aPrnt1R = createPrnt1R();
		aPrnt2R = createPrnt2R();
		aPrnt3R = createPrnt3R();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_PoPrintReg_MC.jbCreateScreenOpe((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbCreateMst((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbCreateTop((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbCreateFold((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbCreateCnd((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbCreateCtrl((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbCreateDtl((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbCreateDtlInfoTab((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbCreatePrnt1((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbCreatePrnt2((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbCreatePrnt3((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbCreateBtn((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbCreateEastBtn((MABCP_PoPrintReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_PoPrintReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_PoPrintReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_PoPrintReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_PoPrintReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_PoPrintReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_PoPrintReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_PoPrintReg p) {
	}

	/**
	 * [DtlInfoTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlInfoTab(MABCP_PoPrintReg p) {
	}

	/**
	 * [Prnt1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePrnt1(MABCP_PoPrintReg p) {
	}

	/**
	 * [Prnt2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePrnt2(MABCP_PoPrintReg p) {
	}

	/**
	 * [Prnt3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePrnt3(MABCP_PoPrintReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_PoPrintReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_PoPrintReg p) {
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

	
	/** [Cnd_po_print_cd_ListPutter]の定義 */
	private MCListPutter Cnd_po_print_cd_p = null;

	/**
	 * [Cnd_po_print_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_po_print_cd_ListPutter() {
		if (Cnd_po_print_cd_p == null) {
			Cnd_po_print_cd_p = createCnd_po_print_cd_ListPutter(Cnd_po_print_cd, "po_print_cd", "po_print_nm");

		}
		return Cnd_po_print_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_PoPrintReg create(){
		MABCP_PoPrintReg p = new MABCP_PoPrintReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_PoPrintReg create(String name){
		MABCP_PoPrintReg p = new MABCP_PoPrintReg(name);
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
		MABCP_PoPrintReg_MC.jbfInitScreenOpe((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbfInitMst((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbfInitTop((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbfInitFold((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbfInitCnd((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbfInitCtrl((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbfInitDtl((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbfInitDtlInfoTab((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbfInitPrnt1((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbfInitPrnt2((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbfInitPrnt3((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbfInitBtn((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbfInitEastBtn((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbInitScreenOpe((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbInitMst((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbInitTop((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbInitFold((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbInitCnd((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbInitCtrl((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbInitDtl((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbInitDtlInfoTab((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbInitPrnt1((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbInitPrnt2((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbInitPrnt3((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbInitBtn((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.jbInitEastBtn((MABCP_PoPrintReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_PoPrintReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_PoPrintReg p) {
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
	protected static void jbfInitTop(MABCP_PoPrintReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_PoPrintReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_PoPrintReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_po_print_cd_Label = p.beansFactory.createLabel("Cnd.po_print_cd_Label");
		p.Cnd_po_print_cd = p.beansFactory.createTextComboBox("Cnd.po_print_cd");
		p.Cnd_po_print_cd.setLabel(p.Cnd_po_print_cd_Label);
		p.Cnd_po_print_nm = p.beansFactory.createTextField("Cnd.po_print_nm");
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
	protected static void jbfInitCtrl(MABCP_PoPrintReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_PoPrintReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_po_print_cd = p.beansFactory.createTableColumn("Dtl.po_print_cd", MCColumnType.TEXT);
		p.columnDtl_po_print_nm = p.beansFactory.createTableColumn("Dtl.po_print_nm", MCColumnType.TEXT);
		p.columnDtl_txt_new_off = p.beansFactory.createTableColumn("Dtl.txt_new_off", MCColumnType.TEXT);
		p.columnDtl_txt_new_on = p.beansFactory.createTableColumn("Dtl.txt_new_on", MCColumnType.TEXT);
		p.columnDtl_txt_mod_off = p.beansFactory.createTableColumn("Dtl.txt_mod_off", MCColumnType.TEXT);
		p.columnDtl_txt_mod_on = p.beansFactory.createTableColumn("Dtl.txt_mod_on", MCColumnType.TEXT);
		p.columnDtl_txt_del_off = p.beansFactory.createTableColumn("Dtl.txt_del_off", MCColumnType.TEXT);
		p.columnDtl_txt_del_on = p.beansFactory.createTableColumn("Dtl.txt_del_on", MCColumnType.TEXT);
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
	 * [DtlInfoTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlInfoTab(MABCP_PoPrintReg p) {
		// ブロック関連の初期化
		p.DtlInfoTabPanel = p.beansFactory.createPanel("DtlInfoTab");
		p.DtlInfoTabTab = p.beansFactory.createTabbedPane("DtlInfoTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Prnt1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPrnt1(MABCP_PoPrintReg p) {
		// ブロック関連の初期化
		p.Prnt1Panel = p.beansFactory.createPanel("Prnt1");
		// ブロックの項目の初期化
		p.Prnt1_txt_new_off_Label = p.beansFactory.createLabel("Prnt1.txt_new_off_Label");
		p.Prnt1_txt_new_offScrollPane = p.beansFactory.createScrollPane("Prnt1.txt_new_offscroll");
		p.Prnt1_txt_new_off = p.beansFactory.createTextArea("Prnt1.txt_new_off");
		p.Prnt1_txt_new_off.setLabel(p.Prnt1_txt_new_off_Label);
		p.Prnt1_txt_new_on_Label = p.beansFactory.createLabel("Prnt1.txt_new_on_Label");
		p.Prnt1_txt_new_onScrollPane = p.beansFactory.createScrollPane("Prnt1.txt_new_onscroll");
		p.Prnt1_txt_new_on = p.beansFactory.createTextArea("Prnt1.txt_new_on");
		p.Prnt1_txt_new_on.setLabel(p.Prnt1_txt_new_on_Label);
	}

	/**
	 * [Prnt2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPrnt2(MABCP_PoPrintReg p) {
		// ブロック関連の初期化
		p.Prnt2Panel = p.beansFactory.createPanel("Prnt2");
		// ブロックの項目の初期化
		p.Prnt2_txt_mod_off_Label = p.beansFactory.createLabel("Prnt2.txt_mod_off_Label");
		p.Prnt2_txt_mod_offScrollPane = p.beansFactory.createScrollPane("Prnt2.txt_mod_offscroll");
		p.Prnt2_txt_mod_off = p.beansFactory.createTextArea("Prnt2.txt_mod_off");
		p.Prnt2_txt_mod_off.setLabel(p.Prnt2_txt_mod_off_Label);
		p.Prnt2_txt_mod_on_Label = p.beansFactory.createLabel("Prnt2.txt_mod_on_Label");
		p.Prnt2_txt_mod_onScrollPane = p.beansFactory.createScrollPane("Prnt2.txt_mod_onscroll");
		p.Prnt2_txt_mod_on = p.beansFactory.createTextArea("Prnt2.txt_mod_on");
		p.Prnt2_txt_mod_on.setLabel(p.Prnt2_txt_mod_on_Label);
	}

	/**
	 * [Prnt3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPrnt3(MABCP_PoPrintReg p) {
		// ブロック関連の初期化
		p.Prnt3Panel = p.beansFactory.createPanel("Prnt3");
		// ブロックの項目の初期化
		p.Prnt3_txt_del_off_Label = p.beansFactory.createLabel("Prnt3.txt_del_off_Label");
		p.Prnt3_txt_del_offScrollPane = p.beansFactory.createScrollPane("Prnt3.txt_del_offscroll");
		p.Prnt3_txt_del_off = p.beansFactory.createTextArea("Prnt3.txt_del_off");
		p.Prnt3_txt_del_off.setLabel(p.Prnt3_txt_del_off_Label);
		p.Prnt3_txt_del_on_Label = p.beansFactory.createLabel("Prnt3.txt_del_on_Label");
		p.Prnt3_txt_del_onScrollPane = p.beansFactory.createScrollPane("Prnt3.txt_del_onscroll");
		p.Prnt3_txt_del_on = p.beansFactory.createTextArea("Prnt3.txt_del_on");
		p.Prnt3_txt_del_on.setLabel(p.Prnt3_txt_del_on_Label);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABCP_PoPrintReg p) {
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
	protected static void jbfInitEastBtn(MABCP_PoPrintReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_PoPrintReg p) {
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
	protected static void jbInitMst(MABCP_PoPrintReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.TopPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP0490.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_PoPrintReg p) {
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
	protected static void jbInitFold(MABCP_PoPrintReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_PoPrintReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0490.CndR.ope_META);
		p.Cnd_po_print_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_po_print_cd, true);
		p.Cnd_po_print_cd.setLinkBeans(p.Cnd_po_print_nm);
		p.CndPanel.add(p.Cnd_po_print_cd_Label);
		p.CndPanel.add(p.Cnd_po_print_cd);
		p.CndPanel.setLastBeans(p.Cnd_po_print_cd);
		p.Cnd_po_print_cd.setNextBeans(p.Cnd_po_print_nm);
		p.Cnd_po_print_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0490.CndR.po_print_cd_META);
		p.CndPanel.add(p.Cnd_po_print_nm);
		p.Cnd_po_print_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_po_print_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0490.CndR.po_print_nm_META);
		p.setPluralValueEnable(p.Cnd_po_print_nm, true);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0490.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0490.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0490.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0490.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0490.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_PoPrintReg p) {
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
	protected static void jbInitDtl(MABCP_PoPrintReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlInfoTabPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlInfoTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlInfoTab(MABCP_PoPrintReg p) {
		// ブロック関連の初期化
		p.add(p.DtlInfoTabPanel);
		p.DtlInfoTabPanel.setNextBeans(p.BtnPanel);
		p.DtlInfoTabPanel.add(p.DtlInfoTabTab);
		p.DtlInfoTabPanel.setLastBeans(p.DtlInfoTabTab);
		p.DtlInfoTabPanel.setLayoutPosition("SN");
		// ブロックの項目の初期化
		p.DtlInfoTabTab.add(p.Prnt1Panel, "DtlInfoTab.dtl1");
		p.DtlInfoTabTab.setLastBeans(p.Prnt1Panel);
		p.Prnt1Panel.setNextBeans(p.Prnt2Panel);
		p.DtlInfoTabTab.add(p.Prnt2Panel, "DtlInfoTab.dtl2");
		p.Prnt2Panel.setNextBeans(p.Prnt3Panel);
		p.DtlInfoTabTab.add(p.Prnt3Panel, "DtlInfoTab.dtl3");
	}

	/**
	 * [Prnt1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPrnt1(MABCP_PoPrintReg p) {
		// ブロック関連の初期化
		p.Prnt1Panel.setNextBeans(p.Prnt2Panel);
		p.Prnt1Panel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Prnt1Panel.add(p.Prnt1_txt_new_off_Label);
		p.Prnt1_txt_new_offScrollPane.getViewport().add(p.Prnt1_txt_new_off);
		p.Prnt1Panel.add(p.Prnt1_txt_new_offScrollPane);
		p.Prnt1Panel.setLastBeans(p.Prnt1_txt_new_off);
		p.Prnt1_txt_new_off.setNextBeans(p.Prnt1_txt_new_on);
		p.Prnt1_txt_new_off.setRow(p.getPrnt1R(), mcframe.clientMABC.MABCP0490.Prnt1R.txt_new_off_META);
		p.Prnt1Panel.add(p.Prnt1_txt_new_on_Label);
		p.Prnt1_txt_new_onScrollPane.getViewport().add(p.Prnt1_txt_new_on);
		p.Prnt1Panel.add(p.Prnt1_txt_new_onScrollPane);
		p.Prnt1_txt_new_on.setRow(p.getPrnt1R(), mcframe.clientMABC.MABCP0490.Prnt1R.txt_new_on_META);
	}

	/**
	 * [Prnt2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPrnt2(MABCP_PoPrintReg p) {
		// ブロック関連の初期化
		p.Prnt2Panel.setNextBeans(p.Prnt3Panel);
		p.Prnt2Panel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Prnt2Panel.add(p.Prnt2_txt_mod_off_Label);
		p.Prnt2_txt_mod_offScrollPane.getViewport().add(p.Prnt2_txt_mod_off);
		p.Prnt2Panel.add(p.Prnt2_txt_mod_offScrollPane);
		p.Prnt2Panel.setLastBeans(p.Prnt2_txt_mod_off);
		p.Prnt2_txt_mod_off.setNextBeans(p.Prnt2_txt_mod_on);
		p.Prnt2_txt_mod_off.setRow(p.getPrnt2R(), mcframe.clientMABC.MABCP0490.Prnt2R.txt_mod_off_META);
		p.Prnt2Panel.add(p.Prnt2_txt_mod_on_Label);
		p.Prnt2_txt_mod_onScrollPane.getViewport().add(p.Prnt2_txt_mod_on);
		p.Prnt2Panel.add(p.Prnt2_txt_mod_onScrollPane);
		p.Prnt2_txt_mod_on.setRow(p.getPrnt2R(), mcframe.clientMABC.MABCP0490.Prnt2R.txt_mod_on_META);
	}

	/**
	 * [Prnt3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPrnt3(MABCP_PoPrintReg p) {
		// ブロック関連の初期化
		p.Prnt3Panel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Prnt3Panel.add(p.Prnt3_txt_del_off_Label);
		p.Prnt3_txt_del_offScrollPane.getViewport().add(p.Prnt3_txt_del_off);
		p.Prnt3Panel.add(p.Prnt3_txt_del_offScrollPane);
		p.Prnt3Panel.setLastBeans(p.Prnt3_txt_del_off);
		p.Prnt3_txt_del_off.setNextBeans(p.Prnt3_txt_del_on);
		p.Prnt3_txt_del_off.setRow(p.getPrnt3R(), mcframe.clientMABC.MABCP0490.Prnt3R.txt_del_off_META);
		p.Prnt3Panel.add(p.Prnt3_txt_del_on_Label);
		p.Prnt3_txt_del_onScrollPane.getViewport().add(p.Prnt3_txt_del_on);
		p.Prnt3Panel.add(p.Prnt3_txt_del_onScrollPane);
		p.Prnt3_txt_del_on.setRow(p.getPrnt3R(), mcframe.clientMABC.MABCP0490.Prnt3R.txt_del_on_META);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_PoPrintReg p) {
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
	protected static void jbInitEastBtn(MABCP_PoPrintReg p) {
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
		MABCP_PoPrintReg_MC.mcInitScreenOpe((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.mcInitMst((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.mcInitTop((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.mcInitFold((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.mcInitCnd((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.mcInitCtrl((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.mcInitDtl((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.mcInitDtlInfoTab((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.mcInitPrnt1((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.mcInitPrnt2((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.mcInitPrnt3((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.mcInitBtn((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.mcInitEastBtn((MABCP_PoPrintReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_PoPrintReg_MC.statusInitUPD_ScreenOpe((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitUPD_Mst((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitUPD_Top((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitUPD_Fold((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitUPD_Cnd((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitUPD_Ctrl((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitUPD_Dtl((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitUPD_DtlInfoTab((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitUPD_Prnt1((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitUPD_Prnt2((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitUPD_Prnt3((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitUPD_Btn((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitUPD_EastBtn((MABCP_PoPrintReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_PoPrintReg_MC.statusInitFIX_ScreenOpe((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitFIX_Mst((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitFIX_Top((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitFIX_Fold((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitFIX_Cnd((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitFIX_Ctrl((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitFIX_Dtl((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitFIX_DtlInfoTab((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitFIX_Prnt1((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitFIX_Prnt2((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitFIX_Prnt3((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitFIX_Btn((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitFIX_EastBtn((MABCP_PoPrintReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_PoPrintReg_MC.statusInitDEL_ScreenOpe((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitDEL_Mst((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitDEL_Top((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitDEL_Fold((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitDEL_Cnd((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitDEL_Ctrl((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitDEL_Dtl((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitDEL_DtlInfoTab((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitDEL_Prnt1((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitDEL_Prnt2((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitDEL_Prnt3((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitDEL_Btn((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitDEL_EastBtn((MABCP_PoPrintReg)this);

		// [REF]ステータスのモードの設定
		MABCP_PoPrintReg_MC.statusInitREF_ScreenOpe((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitREF_Mst((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitREF_Top((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitREF_Fold((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitREF_Cnd((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitREF_Ctrl((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitREF_Dtl((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitREF_DtlInfoTab((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitREF_Prnt1((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitREF_Prnt2((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitREF_Prnt3((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitREF_Btn((MABCP_PoPrintReg)this);
		MABCP_PoPrintReg_MC.statusInitREF_EastBtn((MABCP_PoPrintReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_PoPrintReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_PoPrintReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_PoPrintReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_PoPrintReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_PoPrintReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_po_print_cd.setListListener(p);
		p.Cnd_po_print_cd.addAllListener(p);
		p.Cnd_po_print_nm.setListListener(p);
		p.Cnd_po_print_nm.addAllListener(p);
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
	protected static void mcInitCtrl(MABCP_PoPrintReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_PoPrintReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_po_print_cd.addAllListener(p);
		p.columnDtl_po_print_cd.setListListener(p);
		p.columnDtl_po_print_nm.addAllListener(p);
		p.columnDtl_po_print_nm.setListListener(p);
		p.columnDtl_txt_new_off.addAllListener(p);
		p.columnDtl_txt_new_off.setListListener(p);
		p.columnDtl_txt_new_on.addAllListener(p);
		p.columnDtl_txt_new_on.setListListener(p);
		p.columnDtl_txt_mod_off.addAllListener(p);
		p.columnDtl_txt_mod_off.setListListener(p);
		p.columnDtl_txt_mod_on.addAllListener(p);
		p.columnDtl_txt_mod_on.setListListener(p);
		p.columnDtl_txt_del_off.addAllListener(p);
		p.columnDtl_txt_del_off.setListListener(p);
		p.columnDtl_txt_del_on.addAllListener(p);
		p.columnDtl_txt_del_on.setListListener(p);
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
	 *  [DtlInfoTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlInfoTab(MABCP_PoPrintReg p) {
		p.DtlInfoTabTab.addAllListener(p);
	}

	/**
	 *  [Prnt1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPrnt1(MABCP_PoPrintReg p) {
		p.Prnt1_txt_new_off.addAllListener(p);
		p.Prnt1_txt_new_on.addAllListener(p);
	}

	/**
	 *  [Prnt2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPrnt2(MABCP_PoPrintReg p) {
		p.Prnt2_txt_mod_off.addAllListener(p);
		p.Prnt2_txt_mod_on.addAllListener(p);
	}

	/**
	 *  [Prnt3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPrnt3(MABCP_PoPrintReg p) {
		p.Prnt3_txt_del_off.addAllListener(p);
		p.Prnt3_txt_del_on.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABCP_PoPrintReg p) {
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
	protected static void mcInitEastBtn(MABCP_PoPrintReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_PoPrintReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_PoPrintReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_PoPrintReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_PoPrintReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_PoPrintReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_po_print_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_po_print_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_PoPrintReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_PoPrintReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_po_print_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_po_print_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_txt_new_off.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_txt_new_on.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_txt_mod_off.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_txt_mod_on.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_txt_del_off.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_txt_del_on.putMode(p, UPD, MCMode.READ_ONLY);
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
	 * [UPD]ステータスの[DtlInfoTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlInfoTab(MABCP_PoPrintReg p){

	}

	/**
	 * [UPD]ステータスの[Prnt1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Prnt1(MABCP_PoPrintReg p){
		p.Prnt1_txt_new_off.putMode(p, UPD, MCMode.ENABLE);
		p.Prnt1_txt_new_on.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Prnt2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Prnt2(MABCP_PoPrintReg p){
		p.Prnt2_txt_mod_off.putMode(p, UPD, MCMode.ENABLE);
		p.Prnt2_txt_mod_on.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Prnt3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Prnt3(MABCP_PoPrintReg p){
		p.Prnt3_txt_del_off.putMode(p, UPD, MCMode.ENABLE);
		p.Prnt3_txt_del_on.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_PoPrintReg p){
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
	protected static void statusInitUPD_EastBtn(MABCP_PoPrintReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_PoPrintReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_PoPrintReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_PoPrintReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_PoPrintReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_PoPrintReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_po_print_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_po_print_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_PoPrintReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_PoPrintReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_po_print_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_po_print_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_txt_new_off.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_txt_new_on.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_txt_mod_off.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_txt_mod_on.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_txt_del_off.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_txt_del_on.putMode(p, FIX, MCMode.READ_ONLY);
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
	 * [FIX]ステータスの[DtlInfoTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlInfoTab(MABCP_PoPrintReg p){

	}

	/**
	 * [FIX]ステータスの[Prnt1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Prnt1(MABCP_PoPrintReg p){
		p.Prnt1_txt_new_off.putMode(p, FIX, MCMode.READ_ONLY);
		p.Prnt1_txt_new_on.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Prnt2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Prnt2(MABCP_PoPrintReg p){
		p.Prnt2_txt_mod_off.putMode(p, FIX, MCMode.READ_ONLY);
		p.Prnt2_txt_mod_on.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Prnt3]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Prnt3(MABCP_PoPrintReg p){
		p.Prnt3_txt_del_off.putMode(p, FIX, MCMode.READ_ONLY);
		p.Prnt3_txt_del_on.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_PoPrintReg p){
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
	protected static void statusInitFIX_EastBtn(MABCP_PoPrintReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_PoPrintReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABCP_PoPrintReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_PoPrintReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_PoPrintReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_PoPrintReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_po_print_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_po_print_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABCP_PoPrintReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_PoPrintReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_print_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_print_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_txt_new_off.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_txt_new_on.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_txt_mod_off.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_txt_mod_on.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_txt_del_off.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_txt_del_on.putMode(p, DEL, MCMode.READ_ONLY);
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
	 * [DEL]ステータスの[DtlInfoTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlInfoTab(MABCP_PoPrintReg p){

	}

	/**
	 * [DEL]ステータスの[Prnt1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Prnt1(MABCP_PoPrintReg p){
		p.Prnt1_txt_new_off.putMode(p, DEL, MCMode.READ_ONLY);
		p.Prnt1_txt_new_on.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Prnt2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Prnt2(MABCP_PoPrintReg p){
		p.Prnt2_txt_mod_off.putMode(p, DEL, MCMode.READ_ONLY);
		p.Prnt2_txt_mod_on.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Prnt3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Prnt3(MABCP_PoPrintReg p){
		p.Prnt3_txt_del_off.putMode(p, DEL, MCMode.READ_ONLY);
		p.Prnt3_txt_del_on.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABCP_PoPrintReg p){
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
	protected static void statusInitDEL_EastBtn(MABCP_PoPrintReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_PoPrintReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_PoPrintReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_PoPrintReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_PoPrintReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_PoPrintReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_po_print_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_print_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_PoPrintReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_PoPrintReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_print_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_print_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_txt_new_off.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_txt_new_on.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_txt_mod_off.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_txt_mod_on.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_txt_del_off.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_txt_del_on.putMode(p, REF, MCMode.READ_ONLY);
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
	 * [REF]ステータスの[DtlInfoTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlInfoTab(MABCP_PoPrintReg p){

	}

	/**
	 * [REF]ステータスの[Prnt1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Prnt1(MABCP_PoPrintReg p){
		p.Prnt1_txt_new_off.putMode(p, REF, MCMode.READ_ONLY);
		p.Prnt1_txt_new_on.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Prnt2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Prnt2(MABCP_PoPrintReg p){
		p.Prnt2_txt_mod_off.putMode(p, REF, MCMode.READ_ONLY);
		p.Prnt2_txt_mod_on.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Prnt3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Prnt3(MABCP_PoPrintReg p){
		p.Prnt3_txt_del_off.putMode(p, REF, MCMode.READ_ONLY);
		p.Prnt3_txt_del_on.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_PoPrintReg p){
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_PoPrintReg p){

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
		MABCP_PoPrintReg_MC.setTableConfigDtl((MABCP_PoPrintReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_PoPrintReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0490.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP0490.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_po_print_cd.setMeta(mcframe.clientMABC.MABCP0490.DtlR.po_print_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_print_cd);
		p.columnDtl_po_print_nm.setMeta(mcframe.clientMABC.MABCP0490.DtlR.po_print_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_print_nm);
		p.columnDtl_txt_new_off.setMeta(mcframe.clientMABC.MABCP0490.DtlR.txt_new_off_META);
		p.DtlTable.addColumnConfig(p.columnDtl_txt_new_off);
		p.columnDtl_txt_new_on.setMeta(mcframe.clientMABC.MABCP0490.DtlR.txt_new_on_META);
		p.DtlTable.addColumnConfig(p.columnDtl_txt_new_on);
		p.columnDtl_txt_mod_off.setMeta(mcframe.clientMABC.MABCP0490.DtlR.txt_mod_off_META);
		p.DtlTable.addColumnConfig(p.columnDtl_txt_mod_off);
		p.columnDtl_txt_mod_on.setMeta(mcframe.clientMABC.MABCP0490.DtlR.txt_mod_on_META);
		p.DtlTable.addColumnConfig(p.columnDtl_txt_mod_on);
		p.columnDtl_txt_del_off.setMeta(mcframe.clientMABC.MABCP0490.DtlR.txt_del_off_META);
		p.DtlTable.addColumnConfig(p.columnDtl_txt_del_off);
		p.columnDtl_txt_del_on.setMeta(mcframe.clientMABC.MABCP0490.DtlR.txt_del_on_META);
		p.DtlTable.addColumnConfig(p.columnDtl_txt_del_on);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP0490.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP0490.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP0490.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0490.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0490.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0490.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0490.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0490.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0490.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0490.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0490.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0490.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0490.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0490.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0490.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0490.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0490.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP0490.DtlR.del_ts_META);
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
		Cnd_po_print_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_po_print_cd.getListConfig().setPutter(getCnd_po_print_cd_ListPutter());
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
	 * [Cnd_po_print_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_po_print_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PoPrint");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_po_print_cd) return getCnd_po_print_cd(row, info);
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
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
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
		if (vc == DtlInfoTabTab) return doDtlInfoTab_VC(info);
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_po_print_cd) return doCnd_po_print_cd_VC(info);
		if (vc == Cnd_po_print_nm) return doCnd_po_print_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_po_print_cd) return doDtl_po_print_cd_VC(info);
		if (vc == columnDtl_po_print_nm) return doDtl_po_print_nm_VC(info);
		if (vc == columnDtl_txt_new_off) return doDtl_txt_new_off_VC(info);
		if (vc == columnDtl_txt_new_on) return doDtl_txt_new_on_VC(info);
		if (vc == columnDtl_txt_mod_off) return doDtl_txt_mod_off_VC(info);
		if (vc == columnDtl_txt_mod_on) return doDtl_txt_mod_on_VC(info);
		if (vc == columnDtl_txt_del_off) return doDtl_txt_del_off_VC(info);
		if (vc == columnDtl_txt_del_on) return doDtl_txt_del_on_VC(info);
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
		if (vc == Prnt1_txt_new_off) return doPrnt1_txt_new_off_VC(info);
		if (vc == Prnt1_txt_new_on) return doPrnt1_txt_new_on_VC(info);
		if (vc == Prnt2_txt_mod_off) return doPrnt2_txt_mod_off_VC(info);
		if (vc == Prnt2_txt_mod_on) return doPrnt2_txt_mod_on_VC(info);
		if (vc == Prnt3_txt_del_off) return doPrnt3_txt_del_off_VC(info);
		if (vc == Prnt3_txt_del_on) return doPrnt3_txt_del_on_VC(info);
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
	 * [DtlInfoTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlInfoTab_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[po_print_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_print_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_print_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_print_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[po_print_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_print_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_print_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_print_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[txt_new_off]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_txt_new_off_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[txt_new_on]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_txt_new_on_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[txt_mod_off]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_txt_mod_off_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[txt_mod_on]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_txt_mod_on_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[txt_del_off]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_txt_del_off_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[txt_del_on]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_txt_del_on_VC(MCEventInfo info){
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
	 * [Prnt1]パネルの[txt_new_off]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doPrnt1_txt_new_off_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Prnt1]パネルの[txt_new_on]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doPrnt1_txt_new_on_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Prnt2]パネルの[txt_mod_off]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doPrnt2_txt_mod_off_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Prnt2]パネルの[txt_mod_on]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doPrnt2_txt_mod_on_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Prnt3]パネルの[txt_del_off]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doPrnt3_txt_del_off_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Prnt3]パネルの[txt_del_on]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doPrnt3_txt_del_on_VC(MCEventInfo info){
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
		else if (nc == DtlInfoTabTab) doDtlInfoTab_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_po_print_cd) doCnd_po_print_cd_NC(info);
		else if (nc == Cnd_po_print_nm) doCnd_po_print_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_po_print_cd) doDtl_po_print_cd_NC(info);
		else if (nc == columnDtl_po_print_nm) doDtl_po_print_nm_NC(info);
		else if (nc == columnDtl_txt_new_off) doDtl_txt_new_off_NC(info);
		else if (nc == columnDtl_txt_new_on) doDtl_txt_new_on_NC(info);
		else if (nc == columnDtl_txt_mod_off) doDtl_txt_mod_off_NC(info);
		else if (nc == columnDtl_txt_mod_on) doDtl_txt_mod_on_NC(info);
		else if (nc == columnDtl_txt_del_off) doDtl_txt_del_off_NC(info);
		else if (nc == columnDtl_txt_del_on) doDtl_txt_del_on_NC(info);
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
		else if (nc == Prnt1_txt_new_off) doPrnt1_txt_new_off_NC(info);
		else if (nc == Prnt1_txt_new_on) doPrnt1_txt_new_on_NC(info);
		else if (nc == Prnt2_txt_mod_off) doPrnt2_txt_mod_off_NC(info);
		else if (nc == Prnt2_txt_mod_on) doPrnt2_txt_mod_on_NC(info);
		else if (nc == Prnt3_txt_del_off) doPrnt3_txt_del_off_NC(info);
		else if (nc == Prnt3_txt_del_on) doPrnt3_txt_del_on_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [DtlInfoTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlInfoTab_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[po_print_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_print_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_print_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_print_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[po_print_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_new_off]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_new_off_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_new_on]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_new_on_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_mod_off]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_mod_off_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_mod_on]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_mod_on_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_del_off]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_del_off_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_del_on]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_del_on_NC(MCEventInfo info){
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
	 * [Prnt1]パネルの[txt_new_off]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPrnt1_txt_new_off_NC(MCEventInfo info){
	}

	/**
	 * [Prnt1]パネルの[txt_new_on]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPrnt1_txt_new_on_NC(MCEventInfo info){
	}

	/**
	 * [Prnt2]パネルの[txt_mod_off]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPrnt2_txt_mod_off_NC(MCEventInfo info){
	}

	/**
	 * [Prnt2]パネルの[txt_mod_on]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPrnt2_txt_mod_on_NC(MCEventInfo info){
	}

	/**
	 * [Prnt3]パネルの[txt_del_off]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPrnt3_txt_del_off_NC(MCEventInfo info){
	}

	/**
	 * [Prnt3]パネルの[txt_del_on]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPrnt3_txt_del_on_NC(MCEventInfo info){
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
		else if (ne == DtlInfoTabTab) doDtlInfoTab_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_po_print_cd) doCnd_po_print_cd_NE(info);
		else if (ne == Cnd_po_print_nm) doCnd_po_print_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_po_print_cd) doDtl_po_print_cd_NE(info);
		else if (ne == columnDtl_po_print_nm) doDtl_po_print_nm_NE(info);
		else if (ne == columnDtl_txt_new_off) doDtl_txt_new_off_NE(info);
		else if (ne == columnDtl_txt_new_on) doDtl_txt_new_on_NE(info);
		else if (ne == columnDtl_txt_mod_off) doDtl_txt_mod_off_NE(info);
		else if (ne == columnDtl_txt_mod_on) doDtl_txt_mod_on_NE(info);
		else if (ne == columnDtl_txt_del_off) doDtl_txt_del_off_NE(info);
		else if (ne == columnDtl_txt_del_on) doDtl_txt_del_on_NE(info);
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
		else if (ne == Prnt1_txt_new_off) doPrnt1_txt_new_off_NE(info);
		else if (ne == Prnt1_txt_new_on) doPrnt1_txt_new_on_NE(info);
		else if (ne == Prnt2_txt_mod_off) doPrnt2_txt_mod_off_NE(info);
		else if (ne == Prnt2_txt_mod_on) doPrnt2_txt_mod_on_NE(info);
		else if (ne == Prnt3_txt_del_off) doPrnt3_txt_del_off_NE(info);
		else if (ne == Prnt3_txt_del_on) doPrnt3_txt_del_on_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [DtlInfoTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlInfoTab_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[po_print_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_print_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_print_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_print_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[po_print_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_new_off]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_new_off_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_new_on]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_new_on_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_mod_off]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_mod_off_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_mod_on]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_mod_on_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_del_off]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_del_off_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_del_on]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_del_on_NE(MCEventInfo info){
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
	 * [Prnt1]パネルの[txt_new_off]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPrnt1_txt_new_off_NE(MCEventInfo info){
	}

	/**
	 * [Prnt1]パネルの[txt_new_on]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPrnt1_txt_new_on_NE(MCEventInfo info){
	}

	/**
	 * [Prnt2]パネルの[txt_mod_off]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPrnt2_txt_mod_off_NE(MCEventInfo info){
	}

	/**
	 * [Prnt2]パネルの[txt_mod_on]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPrnt2_txt_mod_on_NE(MCEventInfo info){
	}

	/**
	 * [Prnt3]パネルの[txt_del_off]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPrnt3_txt_del_off_NE(MCEventInfo info){
	}

	/**
	 * [Prnt3]パネルの[txt_del_on]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPrnt3_txt_del_on_NE(MCEventInfo info){
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
		else if (nx == DtlInfoTabTab) doDtlInfoTab_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_po_print_cd) doCnd_po_print_cd_NX(info);
		else if (nx == Cnd_po_print_nm) doCnd_po_print_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_po_print_cd) doDtl_po_print_cd_NX(info);
		else if (nx == columnDtl_po_print_nm) doDtl_po_print_nm_NX(info);
		else if (nx == columnDtl_txt_new_off) doDtl_txt_new_off_NX(info);
		else if (nx == columnDtl_txt_new_on) doDtl_txt_new_on_NX(info);
		else if (nx == columnDtl_txt_mod_off) doDtl_txt_mod_off_NX(info);
		else if (nx == columnDtl_txt_mod_on) doDtl_txt_mod_on_NX(info);
		else if (nx == columnDtl_txt_del_off) doDtl_txt_del_off_NX(info);
		else if (nx == columnDtl_txt_del_on) doDtl_txt_del_on_NX(info);
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
		else if (nx == Prnt1_txt_new_off) doPrnt1_txt_new_off_NX(info);
		else if (nx == Prnt1_txt_new_on) doPrnt1_txt_new_on_NX(info);
		else if (nx == Prnt2_txt_mod_off) doPrnt2_txt_mod_off_NX(info);
		else if (nx == Prnt2_txt_mod_on) doPrnt2_txt_mod_on_NX(info);
		else if (nx == Prnt3_txt_del_off) doPrnt3_txt_del_off_NX(info);
		else if (nx == Prnt3_txt_del_on) doPrnt3_txt_del_on_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [DtlInfoTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlInfoTab_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[po_print_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_print_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_print_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_print_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[po_print_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_new_off]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_new_off_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_new_on]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_new_on_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_mod_off]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_mod_off_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_mod_on]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_mod_on_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_del_off]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_del_off_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_del_on]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_del_on_NX(MCEventInfo info){
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
	 * [Prnt1]パネルの[txt_new_off]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPrnt1_txt_new_off_NX(MCEventInfo info){
	}

	/**
	 * [Prnt1]パネルの[txt_new_on]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPrnt1_txt_new_on_NX(MCEventInfo info){
	}

	/**
	 * [Prnt2]パネルの[txt_mod_off]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPrnt2_txt_mod_off_NX(MCEventInfo info){
	}

	/**
	 * [Prnt2]パネルの[txt_mod_on]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPrnt2_txt_mod_on_NX(MCEventInfo info){
	}

	/**
	 * [Prnt3]パネルの[txt_del_off]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPrnt3_txt_del_off_NX(MCEventInfo info){
	}

	/**
	 * [Prnt3]パネルの[txt_del_on]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPrnt3_txt_del_on_NX(MCEventInfo info){
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
		else if (lc == Cnd_po_print_cd) doCnd_po_print_cd_LC(info);
		else if (lc == Cnd_po_print_nm) doCnd_po_print_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnDtl_po_print_cd) doDtl_po_print_cd_LC(info);
		else if (lc == columnDtl_po_print_nm) doDtl_po_print_nm_LC(info);
		else if (lc == columnDtl_txt_new_off) doDtl_txt_new_off_LC(info);
		else if (lc == columnDtl_txt_new_on) doDtl_txt_new_on_LC(info);
		else if (lc == columnDtl_txt_mod_off) doDtl_txt_mod_off_LC(info);
		else if (lc == columnDtl_txt_mod_on) doDtl_txt_mod_on_LC(info);
		else if (lc == columnDtl_txt_del_off) doDtl_txt_del_off_LC(info);
		else if (lc == columnDtl_txt_del_on) doDtl_txt_del_on_LC(info);
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
	 * [Cnd]パネルの[po_print_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_print_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_print_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_print_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[po_print_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_new_off]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_new_off_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_new_on]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_new_on_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_mod_off]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_mod_off_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_mod_on]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_mod_on_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_del_off]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_del_off_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[txt_del_on]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_txt_del_on_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_po_print_cd]の作成メソッド
	 */
	public MCList getCnd_po_print_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPoPrint(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0490.Srch01")) {
			return new MA_MABCL0490_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0490.Upd01")) {
			return new MA_MABCL0490_Upd01Bridge();
		}
		if (id.equals("MA.MABCL0490.Del01")) {
			return new MA_MABCL0490_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0490_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0490_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0490_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0490_Srch01Bridge() {
			p_MA_MABCL0490_Srch01 = new MCParam(PDef.MA_MABCL0490_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0490_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0490.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0490.DtlR.class));

			p_MA_MABCL0490_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0490_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0490_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0490_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0490_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0490.CndR up0() {
			return (mcframe.clientMABC.MABCP0490.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0490.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0490.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL0490_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0490.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0490_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0490.DtlR>)p_MA_MABCL0490_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABCL0490_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0490_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0490_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0490_Upd01Bridge() {
			p_MA_MABCL0490_Upd01 = new MCParam(PDef.MA_MABCL0490_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0490_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0490.DtlR.class));
			// Down

			p_MA_MABCL0490_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0490_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0490_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0490_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0490_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0490.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0490.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0490_Upd01;
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
	 * [MA_MABCL0490_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0490_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0490_Del01;

		/** コンストラクタ */
		protected MA_MABCL0490_Del01Bridge() {
			p_MA_MABCL0490_Del01 = new MCParam(PDef.MA_MABCL0490_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0490_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0490.DtlR.class));
			// Down

			p_MA_MABCL0490_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0490_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0490_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0490_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0490_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0490.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0490.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0490_Del01;
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