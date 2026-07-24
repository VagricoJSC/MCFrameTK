package mcframe.clientMABG.MABGP0360;

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
import mcframe.clientMABG.MABGP0360.MABGP_CostIoConfigReg_MC.MA_MABGL0360_Srch01Caller;
import mcframe.clientMABG.MABGP0360.MABGP_CostIoConfigReg_MC.MA_MABGL0360_Upd01Caller;
import mcframe.clientMABG.MABGP0360.MABGP_CostIoConfigReg_MC.MA_MABGL0360_Del01Caller;

/**
 * 画面"MABGP_CostIoConfigReg"パネルクラスです。<p>
 *
 * 原価個別受払表構成マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABGP_CostIoConfigReg_MC_A extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase{
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
	public static final String SUBMODULE_ID = "MABG";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABGP0360";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create,0;MOD,Modify,4;DEL,Delete (Administrator),1;REF,View,3 UPD,登録する,0;MOD,訂正する,4;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_MOD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_cost_io_id_Label = null;
	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public MCNumberComboBox Cnd_cost_io_id = null;
	/**
	 * GR/GI list name 受払表名.<p>
	 *
	 */
	public MCTextField Cnd_cost_io_nm = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	public MCTitledBorder HdrTitledBorder = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_cost_io_id_Label = null;
	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public MCNumberComboBox Hdr_cost_io_id = null;
	/**
	 * GR/GI list name 受払表名.<p>
	 *
	 */
	public MCTextField Hdr_cost_io_nm = null;
	// [Wrk]ブロック関連のField定義
	public MCPanel WrkPanel = null;
	// [Wrk]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABG.MABGP0360.DtlR> DtlTable = null;
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
	 * GR/GI column cd. 受払項目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_col_cd = null;
	/**
	 * GR/GI column name 受払項目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_col_nm_lcl = null;
	/**
	 * Standard GR/GI column name 標準受払項目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_col_nm = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_seq = null;
	/**
	 * GR/GI type 受払対象区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_tgt_typ = null;
	/**
	 * GR/GI type name 受払対象区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_tgt_typ_nm = null;
	/**
	 * GR/GI aggregated unit type 受払集計単位区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_sml_typ = null;
	/**
	 * GR/GI aggregated unit type name 受払集計単位区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_sml_typ_nm = null;
	/**
	 * With gain or loss of chargeable supply 有償差額有.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_expns_flg = null;
	/**
	 * Display unit price 単価表示.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unit_flg = null;
	/**
	 * Display qty. 数量表示.<p>
	 *
	 */
	public MCColumnConfig columnDtl_qty_flg = null;
	/**
	 * Display amount 金額表示.<p>
	 *
	 */
	public MCColumnConfig columnDtl_amt_flg = null;
	/**
	 * Display standard 標準表示.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_flg = null;
	/**
	 * Display variance 差異表示.<p>
	 *
	 */
	public MCColumnConfig columnDtl_diff_flg = null;
	/**
	 * Variance calculation type 差額計算区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bal_calc_typ = null;
	/**
	 * Difference calculation type name 差額計算区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bal_calc_typ_nm = null;
	/**
	 * Minus マイナス.<p>
	 *
	 */
	public MCColumnConfig columnDtl_minus_flg = null;
	public mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D Dtl_fg_p_PPanel;
	public MCColumnConfig columnDtl_fg_r;// [Dtl]の[fg_p.red]を[columnDtl_fg_r]としてエイリアス定義。
	public MCColumnConfig columnDtl_fg_g;// [Dtl]の[fg_p.green]を[columnDtl_fg_g]としてエイリアス定義。
	public MCColumnConfig columnDtl_fg_b;// [Dtl]の[fg_p.blue]を[columnDtl_fg_b]としてエイリアス定義。
	public MCColumnConfig columnDtl_fg_color;// [Dtl]の[fg_p.color]を[columnDtl_fg_color]としてエイリアス定義。
	public mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D Dtl_bg_p_PPanel;
	public MCColumnConfig columnDtl_bg_r;// [Dtl]の[bg_p.red]を[columnDtl_bg_r]としてエイリアス定義。
	public MCColumnConfig columnDtl_bg_g;// [Dtl]の[bg_p.green]を[columnDtl_bg_g]としてエイリアス定義。
	public MCColumnConfig columnDtl_bg_b;// [Dtl]の[bg_p.blue]を[columnDtl_bg_b]としてエイリアス定義。
	public MCColumnConfig columnDtl_bg_color;// [Dtl]の[bg_p.color]を[columnDtl_bg_color]としてエイリアス定義。
	/**
	 * Sample サンプル.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sample = null;
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
	public mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H DtlBtn_menu_move_p_PPanel;
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
	// [LclWrk]ブロック関連のField定義
	public MCPanel LclWrkPanel = null;
	// [LclWrk]ブロックの項目のField定義
	// [Lcl]ブロック関連のField定義
	public MCPanel LclPanel = null;
	public MCScrollPane LclScrollPane = null;
	public MCTable2<mcframe.clientMABG.MABGP0360.LclR> LclTable = null;
	// [Lcl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLcl_check = null;
	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_cost_io_id = null;
	/**
	 * GR/GI column cd. 受払項目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_io_col_cd = null;
	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_lcl_cd = null;
	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_lcl_nm = null;
	/**
	 * GR/GI column name 受払項目名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_io_col_nm = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_srv_req_no = null;
	// [LclBtn]ブロック関連のField定義
	public MCPanel LclBtnPanel = null;
	// [LclBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton LclBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton LclBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton LclBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton LclBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton LclBtn_rcopy = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Custom T account column master entry 原価個別受払表項目マスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABGP0370 = null;
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
	/** [UPD_FIX_H]モードを表す定数 */
	public static final String UPD_FIX_H = "UPD_FIX_H";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [MOD]モードを表す定数 */
	public static final String MOD = "MOD";
	/** [MOD_FIX_H]モードを表す定数 */
	public static final String MOD_FIX_H = "MOD_FIX_H";
	/** [FIX_M]モードを表す定数 */
	public static final String FIX_M = "FIX_M";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, UPD_FIX_H, FIX_U, MOD, MOD_FIX_H, FIX_M, DEL, FIX_D, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABGL0360_Srch01]のCallerの作成 */
	protected MABGP_CostIoConfigReg_MC.MA_MABGL0360_Srch01Caller createMA_MABGL0360_Srch01() {
		MABGP_CostIoConfigReg_MC.MA_MABGL0360_Srch01Caller<MABGP_CostIoConfigReg, MA_MABGL0360_Srch01Bridge>
		caller = ((MABGP_CostIoConfigReg_MC)this).new MA_MABGL0360_Srch01Caller<MABGP_CostIoConfigReg, MA_MABGL0360_Srch01Bridge>(
					(MABGP_CostIoConfigReg)this, new MA_MABGL0360_Srch01Bridge());
		return caller;
	}
	/** [MA_MABGL0360_Srch01]の呼び出し */
	protected void callMA_MABGL0360_Srch01() {
		MCCaller caller = createMA_MABGL0360_Srch01();
		caller.exec();
	}
	/** [MA_MABGL0360_Upd01]のCallerの作成 */
	protected MABGP_CostIoConfigReg_MC.MA_MABGL0360_Upd01Caller createMA_MABGL0360_Upd01() {
		MABGP_CostIoConfigReg_MC.MA_MABGL0360_Upd01Caller<MABGP_CostIoConfigReg, MA_MABGL0360_Upd01Bridge>
		caller = ((MABGP_CostIoConfigReg_MC)this).new MA_MABGL0360_Upd01Caller<MABGP_CostIoConfigReg, MA_MABGL0360_Upd01Bridge>(
					(MABGP_CostIoConfigReg)this, new MA_MABGL0360_Upd01Bridge());
		return caller;
	}
	/** [MA_MABGL0360_Upd01]の呼び出し */
	protected void callMA_MABGL0360_Upd01() {
		MCCaller caller = createMA_MABGL0360_Upd01();
		caller.exec();
	}
	/** [MA_MABGL0360_Del01]のCallerの作成 */
	protected MABGP_CostIoConfigReg_MC.MA_MABGL0360_Del01Caller createMA_MABGL0360_Del01() {
		MABGP_CostIoConfigReg_MC.MA_MABGL0360_Del01Caller<MABGP_CostIoConfigReg, MA_MABGL0360_Del01Bridge>
		caller = ((MABGP_CostIoConfigReg_MC)this).new MA_MABGL0360_Del01Caller<MABGP_CostIoConfigReg, MA_MABGL0360_Del01Bridge>(
					(MABGP_CostIoConfigReg)this, new MA_MABGL0360_Del01Bridge());
		return caller;
	}
	/** [MA_MABGL0360_Del01]の呼び出し */
	protected void callMA_MABGL0360_Del01() {
		MCCaller caller = createMA_MABGL0360_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABG.MABGP0360.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABG.MABGP0360.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABG.MABGP0360.HdrR aHdrR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABG.MABGP0360.DtlR> aDtlL;
	/** [Lcl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABG.MABGP0360.LclR> aLclL;
	/** [LclAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABG.MABGP0360.LclR> aLclAllL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABG.MABGP0360.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABG.MABGP0360.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABG.MABGP0360.MstR createMstR() {
		return mcframe.clientMABG.MABGP0360.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABG.MABGP0360.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABG.MABGP0360.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABG.MABGP0360.CndR createCndR() {
		return mcframe.clientMABG.MABGP0360.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMABG.MABGP0360.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABG.MABGP0360.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABG.MABGP0360.HdrR createHdrR() {
		return mcframe.clientMABG.MABGP0360.HdrR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABG.MABGP0360.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0360.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABG.MABGP0360.DtlR createDtlR() {
		return mcframe.clientMABG.MABGP0360.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0360.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABG.MABGP0360.DtlR.class);
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
	 * コピーによってaLclLを設定します。
	 *
	 * aLclLのインスタンスは変更されません。
	 *
	 * @param dataset LclL
	 */
	public void setLclL(MCList<mcframe.clientMABG.MABGP0360.LclR> aList) {
		if (getLclL() != aList) {
			getLclL().setAll(aList);
		}
	}

	/**
	 * [Lcl]ブロックのコンテナaLclLを返します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABG.MABGP0360.LclR> getLclL() {
		return aLclL;
	}

	/**
	 * aLclRを作成します。
	 *
	 * @return LclR
	 */
	public mcframe.clientMABG.MABGP0360.LclR createLclR() {
		return mcframe.clientMABG.MABGP0360.LclR.create();
	}

	/**
	 * aLclLを作成します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABG.MABGP0360.LclR> createLclL() {
		return MCList.create(mcframe.clientMABG.MABGP0360.LclR.class);
	}

	/**
	 * LclTableを初期化します。
	 */
	protected void createLclTable(){
		if(LclTable == null){
			LclTable = beansFactory.createTable2("Lcl.table");
		}
	}

	/**
	 * コピーによってaLclAllLを設定します。
	 *
	 * aLclAllLのインスタンスは変更されません。
	 *
	 * @param dataset LclAllL
	 */
	public void setLclAllL(MCList<mcframe.clientMABG.MABGP0360.LclR> aList) {
		if (getLclAllL() != aList) {
			getLclAllL().setAll(aList);
		}
	}

	/**
	 * [LclAll]ブロックのコンテナaLclAllLを返します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABG.MABGP0360.LclR> getLclAllL() {
		return aLclAllL;
	}

	/**
	 * aLclAllRを作成します。
	 *
	 * @return LclAllR
	 */
	public mcframe.clientMABG.MABGP0360.LclR createLclAllR() {
		return mcframe.clientMABG.MABGP0360.LclR.create();
	}

	/**
	 * aLclAllLを作成します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABG.MABGP0360.LclR> createLclAllL() {
		return MCList.create(mcframe.clientMABG.MABGP0360.LclR.class);
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
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getLclL())) ret.add(getLclL());
		if(!MCCollectionUtil.contains(ret, getLclAllL())) ret.add(getLclAllL());
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
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getLclL()) return "Lcl";
		if(aCnt == getLclAllL()) return "LclAll";
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
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("Lcl")) return getLclL();
		if(bId.equals("LclAll")) return getLclAllL();
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
		ret.add(CndPanel);
		ret.add(HdrPanel);
		ret.add(WrkPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(LclWrkPanel);
		ret.add(LclPanel);
		ret.add(LclBtnPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_CostIoConfigReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		aLclL = createLclL();
		aLclAllL = createLclAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABGP_CostIoConfigReg_MC_A(String name) {
		aMstR = createMstR();
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aLclL = createLclL();
		createLclTable();
		LclTable.setRowName(name);
		aLclAllL = createLclAllL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABGP_CostIoConfigReg_MC.jbCreateScreenOpe((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbCreateMst((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbCreateCnd((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbCreateHdr((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbCreateWrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbCreateDtl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbCreateDtlBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbCreateLclWrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbCreateLcl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbCreateLclBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbCreateBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbCreateEastBtn((MABGP_CostIoConfigReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABGP_CostIoConfigReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABGP_CostIoConfigReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABGP_CostIoConfigReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MABGP_CostIoConfigReg p) {
	}

	/**
	 * [Wrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk(MABGP_CostIoConfigReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABGP_CostIoConfigReg p) {
		p.Dtl_fg_p_PPanel = mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.create(mcframe.clientMABG.MABGP0360.DtlR.$fg_p);
		p.Dtl_fg_p_PPanel.setName("Dtl.fg_p");
		p.columnDtl_fg_r = p.Dtl_fg_p_PPanel.columnColor_red;
		p.columnDtl_fg_r.addAliasName("Dtl.fg_r", p);
		p.columnDtl_fg_g = p.Dtl_fg_p_PPanel.columnColor_green;
		p.columnDtl_fg_g.addAliasName("Dtl.fg_g", p);
		p.columnDtl_fg_b = p.Dtl_fg_p_PPanel.columnColor_blue;
		p.columnDtl_fg_b.addAliasName("Dtl.fg_b", p);
		p.columnDtl_fg_color = p.Dtl_fg_p_PPanel.columnColor_color;
		p.columnDtl_fg_color.addAliasName("Dtl.fg_color", p);
		p.Dtl_bg_p_PPanel = mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.create(mcframe.clientMABG.MABGP0360.DtlR.$bg_p);
		p.Dtl_bg_p_PPanel.setName("Dtl.bg_p");
		p.columnDtl_bg_r = p.Dtl_bg_p_PPanel.columnColor_red;
		p.columnDtl_bg_r.addAliasName("Dtl.bg_r", p);
		p.columnDtl_bg_g = p.Dtl_bg_p_PPanel.columnColor_green;
		p.columnDtl_bg_g.addAliasName("Dtl.bg_g", p);
		p.columnDtl_bg_b = p.Dtl_bg_p_PPanel.columnColor_blue;
		p.columnDtl_bg_b.addAliasName("Dtl.bg_b", p);
		p.columnDtl_bg_color = p.Dtl_bg_p_PPanel.columnColor_color;
		p.columnDtl_bg_color.addAliasName("Dtl.bg_color", p);
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABGP_CostIoConfigReg p) {
		p.DtlBtn_menu_move_p_PPanel = mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.create();
		p.DtlBtn_menu_move_p_PPanel.setName("DtlBtn.menu_move_p");
	}

	/**
	 * [LclWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclWrk(MABGP_CostIoConfigReg p) {
	}

	/**
	 * [Lcl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLcl(MABGP_CostIoConfigReg p) {
	}

	/**
	 * [LclBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtn(MABGP_CostIoConfigReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABGP_CostIoConfigReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABGP_CostIoConfigReg p) {
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

	
	/** [Cnd_cost_io_id_ListPutter]の定義 */
	private MCListPutter Cnd_cost_io_id_p = null;

	/**
	 * [Cnd_cost_io_id_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cost_io_id_ListPutter() {
		if (Cnd_cost_io_id_p == null) {
			Cnd_cost_io_id_p = createCnd_cost_io_id_ListPutter(Cnd_cost_io_id, "cost_io_id", "cost_io_nm");

		}
		return Cnd_cost_io_id_p;
	}
	
	
	/** [Hdr_cost_io_id_ListPutter]の定義 */
	private MCListPutter Hdr_cost_io_id_p = null;

	/**
	 * [Hdr_cost_io_id_ListPutter]の取得
	 */
	protected MCListPutter getHdr_cost_io_id_ListPutter() {
		if (Hdr_cost_io_id_p == null) {
			Hdr_cost_io_id_p = createHdr_cost_io_id_ListPutter(Hdr_cost_io_id, "cost_io_id", "cost_io_nm");

		}
		return Hdr_cost_io_id_p;
	}
	
	
	/** [Dtl_io_tgt_typ_ListPutter]の定義 */
	private MCListPutter Dtl_io_tgt_typ_p = null;

	/**
	 * [Dtl_io_tgt_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_io_tgt_typ_ListPutter() {
		if (Dtl_io_tgt_typ_p == null) {
			Dtl_io_tgt_typ_p = createDtl_io_tgt_typ_ListPutter(columnDtl_io_tgt_typ, "io_tgt_typ", "io_tgt_typ_nm");

		}
		return Dtl_io_tgt_typ_p;
	}
	
	
	/** [Dtl_io_sml_typ_ListPutter]の定義 */
	private MCListPutter Dtl_io_sml_typ_p = null;

	/**
	 * [Dtl_io_sml_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_io_sml_typ_ListPutter() {
		if (Dtl_io_sml_typ_p == null) {
			Dtl_io_sml_typ_p = createDtl_io_sml_typ_ListPutter(columnDtl_io_sml_typ, "io_sml_typ", "io_sml_typ_nm");

		}
		return Dtl_io_sml_typ_p;
	}
	
	
	/** [Dtl_bal_calc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_bal_calc_typ_p = null;

	/**
	 * [Dtl_bal_calc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bal_calc_typ_ListPutter() {
		if (Dtl_bal_calc_typ_p == null) {
			Dtl_bal_calc_typ_p = createDtl_bal_calc_typ_ListPutter(columnDtl_bal_calc_typ, "bal_calc_typ", "bal_calc_typ_nm");

		}
		return Dtl_bal_calc_typ_p;
	}
	
	
	/** [Lcl_lcl_cd_ListPutter]の定義 */
	private MCListPutter Lcl_lcl_cd_p = null;

	/**
	 * [Lcl_lcl_cd_ListPutter]の取得
	 */
	protected MCListPutter getLcl_lcl_cd_ListPutter() {
		if (Lcl_lcl_cd_p == null) {
			Lcl_lcl_cd_p = createLcl_lcl_cd_ListPutter(columnLcl_lcl_cd, "lcl_cd", "lcl_nm");

		}
		return Lcl_lcl_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABGP_CostIoConfigReg create(){
		MABGP_CostIoConfigReg p = new MABGP_CostIoConfigReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABGP_CostIoConfigReg create(String name){
		MABGP_CostIoConfigReg p = new MABGP_CostIoConfigReg(name);
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
		MABGP_CostIoConfigReg_MC.jbfInitScreenOpe((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbfInitMst((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbfInitCnd((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbfInitHdr((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbfInitWrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbfInitDtl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbfInitDtlBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbfInitLclWrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbfInitLcl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbfInitLclBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbfInitBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbfInitEastBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbInitScreenOpe((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbInitMst((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbInitCnd((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbInitHdr((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbInitWrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbInitDtl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbInitDtlBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbInitLclWrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbInitLcl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbInitLclBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbInitBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.jbInitEastBtn((MABGP_CostIoConfigReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.MstPanel = p.beansFactory.createPanel("Mst");
		// ブロックの項目の初期化
		p.Mst_mst_set_typ_nm_Label = p.beansFactory.createLabel("Mst.mst_set_typ_nm_Label");
		p.Mst_mst_set_typ_nm = p.beansFactory.createTextField("Mst.mst_set_typ_nm");
		p.Mst_mst_set_typ_nm.setLabel(p.Mst_mst_set_typ_nm_Label);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_MOD = p.beansFactory.createRadioButton("Cnd.ope_MOD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_cost_io_id_Label = p.beansFactory.createLabel("Cnd.cost_io_id_Label");
		p.Cnd_cost_io_id = p.beansFactory.createNumberComboBox("Cnd.cost_io_id");
		p.Cnd_cost_io_id.setLabel(p.Cnd_cost_io_id_Label);
		p.Cnd_cost_io_nm = p.beansFactory.createTextField("Cnd.cost_io_nm");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		p.HdrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Hdr_cost_io_id_Label = p.beansFactory.createLabel("Hdr.cost_io_id_Label");
		p.Hdr_cost_io_id = p.beansFactory.createNumberComboBox("Hdr.cost_io_id");
		p.Hdr_cost_io_id.setLabel(p.Hdr_cost_io_id_Label);
		p.Hdr_cost_io_nm = p.beansFactory.createTextField("Hdr.cost_io_nm");
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.WrkPanel = p.beansFactory.createPanel("Wrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_io_col_cd = p.beansFactory.createTableColumn("Dtl.io_col_cd", MCColumnType.TEXT);
		p.columnDtl_io_col_nm_lcl = p.beansFactory.createTableColumn("Dtl.io_col_nm_lcl", MCColumnType.TEXT);
		p.columnDtl_io_col_nm = p.beansFactory.createTableColumn("Dtl.io_col_nm", MCColumnType.TEXT);
		p.columnDtl_io_seq = p.beansFactory.createTableColumn("Dtl.io_seq", MCColumnType.NUMBER);
		p.columnDtl_io_tgt_typ = p.beansFactory.createTableColumn("Dtl.io_tgt_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_io_tgt_typ_nm = p.beansFactory.createTableColumn("Dtl.io_tgt_typ_nm", MCColumnType.TEXT);
		p.columnDtl_io_sml_typ = p.beansFactory.createTableColumn("Dtl.io_sml_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_io_sml_typ_nm = p.beansFactory.createTableColumn("Dtl.io_sml_typ_nm", MCColumnType.TEXT);
		p.columnDtl_prov_expns_flg = p.beansFactory.createTableColumn("Dtl.prov_expns_flg", MCColumnType.CHECK);
		p.columnDtl_unit_flg = p.beansFactory.createTableColumn("Dtl.unit_flg", MCColumnType.CHECK);
		p.columnDtl_qty_flg = p.beansFactory.createTableColumn("Dtl.qty_flg", MCColumnType.CHECK);
		p.columnDtl_amt_flg = p.beansFactory.createTableColumn("Dtl.amt_flg", MCColumnType.CHECK);
		p.columnDtl_std_flg = p.beansFactory.createTableColumn("Dtl.std_flg", MCColumnType.CHECK);
		p.columnDtl_diff_flg = p.beansFactory.createTableColumn("Dtl.diff_flg", MCColumnType.CHECK);
		p.columnDtl_bal_calc_typ = p.beansFactory.createTableColumn("Dtl.bal_calc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_bal_calc_typ_nm = p.beansFactory.createTableColumn("Dtl.bal_calc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_minus_flg = p.beansFactory.createTableColumn("Dtl.minus_flg", MCColumnType.CHECK);
		p.columnDtl_sample = p.beansFactory.createTableColumn("Dtl.sample", MCColumnType.TEXT);
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
	protected static void jbfInitDtlBtn(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_select_all = p.beansFactory.createButton("DtlBtn.select_all", "no_border");
		p.DtlBtn_deselect_all = p.beansFactory.createButton("DtlBtn.deselect_all", "no_border");
		p.DtlBtn_radd = p.beansFactory.createButton("DtlBtn.radd", "no_border");
		p.DtlBtn_rdel = p.beansFactory.createButton("DtlBtn.rdel", "no_border");
		p.DtlBtn_rcopy = p.beansFactory.createButton("DtlBtn.rcopy", "no_border");
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclWrk(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.LclWrkPanel = p.beansFactory.createPanel("LclWrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLcl(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.LclPanel = p.beansFactory.createPanel("Lcl");
		p.LclScrollPane = p.beansFactory.createScrollPane("Lcl.scroll");
		p.createLclTable();
		// ブロックの項目の初期化
		p.columnLcl_check = p.beansFactory.createTableColumn("Lcl.check", MCColumnType.CHECK);
		p.columnLcl_cost_io_id = p.beansFactory.createTableColumn("Lcl.cost_io_id", MCColumnType.NUMBER);
		p.columnLcl_io_col_cd = p.beansFactory.createTableColumn("Lcl.io_col_cd", MCColumnType.TEXT);
		p.columnLcl_lcl_cd = p.beansFactory.createTableColumn("Lcl.lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnLcl_lcl_nm = p.beansFactory.createTableColumn("Lcl.lcl_nm", MCColumnType.TEXT);
		p.columnLcl_io_col_nm = p.beansFactory.createTableColumn("Lcl.io_col_nm", MCColumnType.TEXT);
		p.columnLcl_memo1 = p.beansFactory.createTableColumn("Lcl.memo1", MCColumnType.TEXT);
		p.columnLcl_memo2 = p.beansFactory.createTableColumn("Lcl.memo2", MCColumnType.TEXT);
		p.columnLcl_memo3 = p.beansFactory.createTableColumn("Lcl.memo3", MCColumnType.TEXT);
		p.columnLcl_ins_usr_id = p.beansFactory.createTableColumn("Lcl.ins_usr_id", MCColumnType.TEXT);
		p.columnLcl_ins_usr_nm = p.beansFactory.createTableColumn("Lcl.ins_usr_nm", MCColumnType.TEXT);
		p.columnLcl_ins_ts = p.beansFactory.createTableColumn("Lcl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnLcl_ins_func_id = p.beansFactory.createTableColumn("Lcl.ins_func_id", MCColumnType.TEXT);
		p.columnLcl_ins_func_nm = p.beansFactory.createTableColumn("Lcl.ins_func_nm", MCColumnType.TEXT);
		p.columnLcl_upd_cntr = p.beansFactory.createTableColumn("Lcl.upd_cntr", MCColumnType.NUMBER);
		p.columnLcl_upd_usr_id = p.beansFactory.createTableColumn("Lcl.upd_usr_id", MCColumnType.TEXT);
		p.columnLcl_upd_usr_nm = p.beansFactory.createTableColumn("Lcl.upd_usr_nm", MCColumnType.TEXT);
		p.columnLcl_upd_ts = p.beansFactory.createTableColumn("Lcl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnLcl_upd_func_id = p.beansFactory.createTableColumn("Lcl.upd_func_id", MCColumnType.TEXT);
		p.columnLcl_upd_func_nm = p.beansFactory.createTableColumn("Lcl.upd_func_nm", MCColumnType.TEXT);
		p.columnLcl_upd_srv_req_no = p.beansFactory.createTableColumn("Lcl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [LclBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclBtn(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.LclBtnPanel = p.beansFactory.createPanel("LclBtn");
		// ブロックの項目の初期化
		p.LclBtn_select_all = p.beansFactory.createButton("LclBtn.select_all", "no_border");
		p.LclBtn_deselect_all = p.beansFactory.createButton("LclBtn.deselect_all", "no_border");
		p.LclBtn_radd = p.beansFactory.createButton("LclBtn.radd", "no_border");
		p.LclBtn_rdel = p.beansFactory.createButton("LclBtn.rdel", "no_border");
		p.LclBtn_rcopy = p.beansFactory.createButton("LclBtn.rcopy", "no_border");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MABGP0370 = p.beansFactory.createButton("Btn.open_MABGP0370", "open");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABGP_CostIoConfigReg p) {
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
	protected static void jbInitMst(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.CndPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABG.MABGP0360.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_MOD);
		p.Cnd_ope_MOD.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_MOD);
		p.ScreenOpePanel.add(p.Cnd_ope_MOD);
		p.Cnd_ope_MOD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABG.MABGP0360.CndR.ope_META);
		p.Cnd_cost_io_id.setListType(MCListType.FREE);
		p.Cnd_cost_io_id.setLinkBeans(p.Cnd_cost_io_nm);
		p.CndPanel.add(p.Cnd_cost_io_id_Label);
		p.CndPanel.add(p.Cnd_cost_io_id);
		p.CndPanel.setLastBeans(p.Cnd_cost_io_id);
		p.Cnd_cost_io_id.setNextBeans(p.Cnd_cost_io_nm);
		p.Cnd_cost_io_id.setRow(p.getCndR(), mcframe.clientMABG.MABGP0360.CndR.cost_io_id_META);
		p.CndPanel.add(p.Cnd_cost_io_nm);
		p.Cnd_cost_io_nm.setNextBeans(p.Cnd_srch);
		p.Cnd_cost_io_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0360.CndR.cost_io_nm_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setBorder(p.HdrTitledBorder);
		p.add(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.WrkPanel);
		p.HdrPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.Hdr_cost_io_id.setListType(MCListType.STRICT);
		p.Hdr_cost_io_id.setLinkBeans(p.Hdr_cost_io_nm);
		p.HdrPanel.add(p.Hdr_cost_io_id_Label);
		p.HdrPanel.add(p.Hdr_cost_io_id);
		p.HdrPanel.setLastBeans(p.Hdr_cost_io_id);
		p.Hdr_cost_io_id.setNextBeans(p.Hdr_cost_io_nm);
		p.Hdr_cost_io_id.setRow(p.getHdrR(), mcframe.clientMABG.MABGP0360.HdrR.cost_io_id_META);
		p.HdrPanel.add(p.Hdr_cost_io_nm);
		p.Hdr_cost_io_nm.setRow(p.getHdrR(), mcframe.clientMABG.MABGP0360.HdrR.cost_io_nm_META);
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.add(p.WrkPanel);
		p.WrkPanel.setNextBeans(p.LclWrkPanel);
		p.WrkPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.WrkPanel.add(p.DtlPanel, null);
		p.WrkPanel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.WrkPanel.add(p.DtlBtnPanel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.DtlBtnPanel.add(p.DtlBtn_menu_move_p_PPanel);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_menu_move_p_PPanel);
		p.DtlBtn_menu_move_p_PPanel.setNextBeans(p.DtlBtn_select_all);
		p.DtlBtn_select_all.setIcon("SELECT_ALL");
		p.DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.DtlBtnPanel.add(p.DtlBtn_select_all);
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
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclWrk(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.add(p.LclWrkPanel);
		p.LclWrkPanel.setNextBeans(p.BtnPanel);
		p.LclWrkPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.LclWrkPanel.add(p.LclPanel, null);
		p.LclWrkPanel.setLastBeans(p.LclPanel);
		p.LclPanel.setNextBeans(p.LclBtnPanel);
		p.LclWrkPanel.add(p.LclBtnPanel, null);
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLcl(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.LclPanel.add(p.LclScrollPane);
		p.LclPanel.setLastBeans(p.LclTable);
		p.LclScrollPane.setViewportView(p.LclTable);
		p.LclTable.setList(p.getLclL());
		p.LclPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LclBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclBtn(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.LclBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.LclBtn_select_all.setIcon("SELECT_ALL");
		p.LclBtn_select_all.setFunctionKey(MCFunctionKey.F15);
		p.LclBtnPanel.add(p.LclBtn_select_all);
		p.LclBtnPanel.setLastBeans(p.LclBtn_select_all);
		p.LclBtn_select_all.setNextBeans(p.LclBtn_deselect_all);
		p.LclBtn_deselect_all.setIcon("DESELECT_ALL");
		p.LclBtn_deselect_all.setFunctionKey(MCFunctionKey.F16);
		p.LclBtnPanel.add(p.LclBtn_deselect_all);
		p.LclBtn_deselect_all.setNextBeans(p.LclBtn_radd);
		p.LclBtn_radd.setIcon("INSERT_RECORD");
		p.LclBtn_radd.setFunctionKey(MCFunctionKey.F7);
		p.LclBtnPanel.add(p.LclBtn_radd);
		p.LclBtn_radd.setNextBeans(p.LclBtn_rdel);
		p.LclBtn_rdel.setIcon("DELETE_RECORD");
		p.LclBtn_rdel.setFunctionKey(MCFunctionKey.F8);
		p.LclBtnPanel.add(p.LclBtn_rdel);
		p.LclBtn_rdel.setNextBeans(p.LclBtn_rcopy);
		p.LclBtn_rcopy.setIcon("COPY_RECORD");
		p.LclBtn_rcopy.setFunctionKey(MCFunctionKey.F23);
		p.LclBtnPanel.add(p.LclBtn_rcopy);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABGP_CostIoConfigReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MABGP0370.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MABGP0370);
		p.BtnPanel.setLastBeans(p.Btn_open_MABGP0370);
		p.Btn_open_MABGP0370.setNextBeans(p.Btn_upd);
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
	protected static void jbInitEastBtn(MABGP_CostIoConfigReg p) {
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
		MABGP_CostIoConfigReg_MC.mcInitScreenOpe((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.mcInitMst((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.mcInitCnd((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.mcInitHdr((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.mcInitWrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.mcInitDtl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.mcInitDtlBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.mcInitLclWrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.mcInitLcl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.mcInitLclBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.mcInitBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.mcInitEastBtn((MABGP_CostIoConfigReg)this);

		// [UPD]ステータスのモードの設定
		MABGP_CostIoConfigReg_MC.statusInitUPD_ScreenOpe((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD_Mst((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD_Cnd((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD_Hdr((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD_Wrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD_Dtl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD_DtlBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD_LclWrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD_Lcl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD_LclAll((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD_LclBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD_Btn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD_EastBtn((MABGP_CostIoConfigReg)this);

		// [UPD_FIX_H]ステータスのモードの設定
		MABGP_CostIoConfigReg_MC.statusInitUPD__FIX__H_ScreenOpe((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD__FIX__H_Mst((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD__FIX__H_Cnd((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD__FIX__H_Hdr((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD__FIX__H_Wrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD__FIX__H_Dtl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD__FIX__H_DtlBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD__FIX__H_LclWrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD__FIX__H_Lcl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD__FIX__H_LclAll((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD__FIX__H_LclBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD__FIX__H_Btn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitUPD__FIX__H_EastBtn((MABGP_CostIoConfigReg)this);

		// [FIX_U]ステータスのモードの設定
		MABGP_CostIoConfigReg_MC.statusInitFIX__U_ScreenOpe((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__U_Mst((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__U_Cnd((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__U_Hdr((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__U_Wrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__U_Dtl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__U_DtlBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__U_LclWrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__U_Lcl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__U_LclAll((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__U_LclBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__U_Btn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__U_EastBtn((MABGP_CostIoConfigReg)this);

		// [MOD]ステータスのモードの設定
		MABGP_CostIoConfigReg_MC.statusInitMOD_ScreenOpe((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD_Mst((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD_Cnd((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD_Hdr((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD_Wrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD_Dtl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD_DtlBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD_LclWrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD_Lcl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD_LclAll((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD_LclBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD_Btn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD_EastBtn((MABGP_CostIoConfigReg)this);

		// [MOD_FIX_H]ステータスのモードの設定
		MABGP_CostIoConfigReg_MC.statusInitMOD__FIX__H_ScreenOpe((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD__FIX__H_Mst((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD__FIX__H_Cnd((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD__FIX__H_Hdr((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD__FIX__H_Wrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD__FIX__H_Dtl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD__FIX__H_DtlBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD__FIX__H_LclWrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD__FIX__H_Lcl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD__FIX__H_LclAll((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD__FIX__H_LclBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD__FIX__H_Btn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitMOD__FIX__H_EastBtn((MABGP_CostIoConfigReg)this);

		// [FIX_M]ステータスのモードの設定
		MABGP_CostIoConfigReg_MC.statusInitFIX__M_ScreenOpe((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__M_Mst((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__M_Cnd((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__M_Hdr((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__M_Wrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__M_Dtl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__M_DtlBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__M_LclWrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__M_Lcl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__M_LclAll((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__M_LclBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__M_Btn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__M_EastBtn((MABGP_CostIoConfigReg)this);

		// [DEL]ステータスのモードの設定
		MABGP_CostIoConfigReg_MC.statusInitDEL_ScreenOpe((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitDEL_Mst((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitDEL_Cnd((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitDEL_Hdr((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitDEL_Wrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitDEL_Dtl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitDEL_DtlBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitDEL_LclWrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitDEL_Lcl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitDEL_LclAll((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitDEL_LclBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitDEL_Btn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitDEL_EastBtn((MABGP_CostIoConfigReg)this);

		// [FIX_D]ステータスのモードの設定
		MABGP_CostIoConfigReg_MC.statusInitFIX__D_ScreenOpe((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__D_Mst((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__D_Cnd((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__D_Hdr((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__D_Wrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__D_Dtl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__D_DtlBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__D_LclWrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__D_Lcl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__D_LclAll((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__D_LclBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__D_Btn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitFIX__D_EastBtn((MABGP_CostIoConfigReg)this);

		// [REF]ステータスのモードの設定
		MABGP_CostIoConfigReg_MC.statusInitREF_ScreenOpe((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitREF_Mst((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitREF_Cnd((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitREF_Hdr((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitREF_Wrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitREF_Dtl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitREF_DtlBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitREF_LclWrk((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitREF_Lcl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitREF_LclAll((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitREF_LclBtn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitREF_Btn((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.statusInitREF_EastBtn((MABGP_CostIoConfigReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABGP_CostIoConfigReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABGP_CostIoConfigReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABGP_CostIoConfigReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_MOD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_cost_io_id.setListListener(p);
		p.Cnd_cost_io_id.addAllListener(p);
		p.Cnd_cost_io_nm.setListListener(p);
		p.Cnd_cost_io_nm.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MABGP_CostIoConfigReg p) {
		p.Hdr_cost_io_id.setListListener(p);
		p.Hdr_cost_io_id.addAllListener(p);
		p.Hdr_cost_io_nm.setListListener(p);
		p.Hdr_cost_io_nm.addAllListener(p);
	}

	/**
	 *  [Wrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk(MABGP_CostIoConfigReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABGP_CostIoConfigReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_io_col_cd.addAllListener(p);
		p.columnDtl_io_col_cd.setListListener(p);
		p.columnDtl_io_col_nm_lcl.addAllListener(p);
		p.columnDtl_io_col_nm_lcl.setListListener(p);
		p.columnDtl_io_col_nm.addAllListener(p);
		p.columnDtl_io_col_nm.setListListener(p);
		p.columnDtl_io_seq.addAllListener(p);
		p.columnDtl_io_seq.setListListener(p);
		p.columnDtl_io_tgt_typ.addAllListener(p);
		p.columnDtl_io_tgt_typ.setListListener(p);
		p.columnDtl_io_tgt_typ_nm.addAllListener(p);
		p.columnDtl_io_tgt_typ_nm.setListListener(p);
		p.columnDtl_io_sml_typ.addAllListener(p);
		p.columnDtl_io_sml_typ.setListListener(p);
		p.columnDtl_io_sml_typ_nm.addAllListener(p);
		p.columnDtl_io_sml_typ_nm.setListListener(p);
		p.columnDtl_prov_expns_flg.addAllListener(p);
		p.columnDtl_unit_flg.addAllListener(p);
		p.columnDtl_qty_flg.addAllListener(p);
		p.columnDtl_amt_flg.addAllListener(p);
		p.columnDtl_std_flg.addAllListener(p);
		p.columnDtl_diff_flg.addAllListener(p);
		p.columnDtl_bal_calc_typ.addAllListener(p);
		p.columnDtl_bal_calc_typ.setListListener(p);
		p.columnDtl_bal_calc_typ_nm.addAllListener(p);
		p.columnDtl_bal_calc_typ_nm.setListListener(p);
		p.columnDtl_minus_flg.addAllListener(p);
		p.columnDtl_sample.addAllListener(p);
		p.columnDtl_sample.setListListener(p);
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
	protected static void mcInitDtlBtn(MABGP_CostIoConfigReg p) {
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
	}

	/**
	 *  [LclWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclWrk(MABGP_CostIoConfigReg p) {
	}

	/**
	 *  [Lcl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLcl(MABGP_CostIoConfigReg p) {
		p.LclTable.addAllListener(p);
		p.columnLcl_check.addAllListener(p);
		p.columnLcl_cost_io_id.addAllListener(p);
		p.columnLcl_cost_io_id.setListListener(p);
		p.columnLcl_io_col_cd.addAllListener(p);
		p.columnLcl_io_col_cd.setListListener(p);
		p.columnLcl_lcl_cd.addAllListener(p);
		p.columnLcl_lcl_cd.setListListener(p);
		p.columnLcl_lcl_nm.addAllListener(p);
		p.columnLcl_lcl_nm.setListListener(p);
		p.columnLcl_io_col_nm.addAllListener(p);
		p.columnLcl_io_col_nm.setListListener(p);
		p.columnLcl_memo1.addAllListener(p);
		p.columnLcl_memo1.setListListener(p);
		p.columnLcl_memo2.addAllListener(p);
		p.columnLcl_memo2.setListListener(p);
		p.columnLcl_memo3.addAllListener(p);
		p.columnLcl_memo3.setListListener(p);
		p.columnLcl_ins_usr_id.addAllListener(p);
		p.columnLcl_ins_usr_id.setListListener(p);
		p.columnLcl_ins_usr_nm.addAllListener(p);
		p.columnLcl_ins_usr_nm.setListListener(p);
		p.columnLcl_ins_ts.addAllListener(p);
		p.columnLcl_ins_ts.setListListener(p);
		p.columnLcl_ins_func_id.addAllListener(p);
		p.columnLcl_ins_func_id.setListListener(p);
		p.columnLcl_ins_func_nm.addAllListener(p);
		p.columnLcl_ins_func_nm.setListListener(p);
		p.columnLcl_upd_cntr.addAllListener(p);
		p.columnLcl_upd_cntr.setListListener(p);
		p.columnLcl_upd_usr_id.addAllListener(p);
		p.columnLcl_upd_usr_id.setListListener(p);
		p.columnLcl_upd_usr_nm.addAllListener(p);
		p.columnLcl_upd_usr_nm.setListListener(p);
		p.columnLcl_upd_ts.addAllListener(p);
		p.columnLcl_upd_ts.setListListener(p);
		p.columnLcl_upd_func_id.addAllListener(p);
		p.columnLcl_upd_func_id.setListListener(p);
		p.columnLcl_upd_func_nm.addAllListener(p);
		p.columnLcl_upd_func_nm.setListListener(p);
		p.columnLcl_upd_srv_req_no.addAllListener(p);
		p.columnLcl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [LclBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclBtn(MABGP_CostIoConfigReg p) {
		p.LclBtn_select_all.addAllListener(p);
		p.LclBtn_select_all.setAPMethodName("doLclBtn_select_all");
		p.LclBtn_deselect_all.addAllListener(p);
		p.LclBtn_deselect_all.setAPMethodName("doLclBtn_deselect_all");
		p.LclBtn_radd.addAllListener(p);
		p.LclBtn_radd.setAPMethodName("doLclBtn_radd");
		p.LclBtn_rdel.addAllListener(p);
		p.LclBtn_rdel.setAPMethodName("doLclBtn_rdel");
		p.LclBtn_rcopy.addAllListener(p);
		p.LclBtn_rcopy.setAPMethodName("doLclBtn_rcopy");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABGP_CostIoConfigReg p) {
		p.Btn_open_MABGP0370.addAllListener(p);
		p.Btn_open_MABGP0370.setAPMethodName("doBtn_open_MABGP0370");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABGP_CostIoConfigReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABGP_CostIoConfigReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABGP_CostIoConfigReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABGP_CostIoConfigReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_cost_io_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_cost_io_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MABGP_CostIoConfigReg p){
		p.Hdr_cost_io_id.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_cost_io_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk(MABGP_CostIoConfigReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABGP_CostIoConfigReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_io_col_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_io_col_nm_lcl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_io_col_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_io_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_io_tgt_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_io_tgt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_io_sml_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_io_sml_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_expns_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_unit_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_qty_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_amt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_std_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_diff_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bal_calc_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bal_calc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_minus_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_fg_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.Dtl_bg_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.columnDtl_sample.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.READ_ONLY);
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
	protected static void statusInitUPD_DtlBtn(MABGP_CostIoConfigReg p){
		p.DtlBtn_menu_move_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclWrk(MABGP_CostIoConfigReg p){

	}

	/**
	 * [UPD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Lcl(MABGP_CostIoConfigReg p){
		p.columnLcl_check.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_cost_io_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_io_col_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_io_col_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclAll(MABGP_CostIoConfigReg p){

	}

	/**
	 * [UPD]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclBtn(MABGP_CostIoConfigReg p){
		p.LclBtn_select_all.putMode(p, UPD, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, UPD, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, UPD, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, UPD, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABGP_CostIoConfigReg p){
		p.Btn_open_MABGP0370.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABGP_CostIoConfigReg p){

	}

	/**
	 * [UPD_FIX_H]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_ScreenOpe(MABGP_CostIoConfigReg p){

	}

	/**
	 * [UPD_FIX_H]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_Mst(MABGP_CostIoConfigReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_FIX_H]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_Cnd(MABGP_CostIoConfigReg p){
		p.Cnd_ope_Group.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.Cnd_cost_io_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.Cnd_cost_io_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_FIX_H]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_Hdr(MABGP_CostIoConfigReg p){
		p.Hdr_cost_io_id.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.Hdr_cost_io_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_FIX_H]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_Wrk(MABGP_CostIoConfigReg p){

	}

	/**
	 * [UPD_FIX_H]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_Dtl(MABGP_CostIoConfigReg p){
		p.columnDtl_check.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_io_col_cd.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_io_col_nm_lcl.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_io_col_nm.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_io_seq.putMode(p, UPD_FIX_H, MCMode.INVISIBLE);
		p.columnDtl_io_tgt_typ.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_io_tgt_typ_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_io_sml_typ.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_io_sml_typ_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_prov_expns_flg.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_unit_flg.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_qty_flg.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_amt_flg.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_std_flg.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_diff_flg.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_bal_calc_typ.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_bal_calc_typ_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_minus_flg.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.Dtl_fg_p_PPanel.putStatus(UPD_FIX_H, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.ENABLE);
		p.Dtl_bg_p_PPanel.putStatus(UPD_FIX_H, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.ENABLE);
		p.columnDtl_sample.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_memo1.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD_FIX_H, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_FIX_H]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_DtlBtn(MABGP_CostIoConfigReg p){
		p.DtlBtn_menu_move_p_PPanel.putStatus(UPD_FIX_H, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.DtlBtn_select_all.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD_FIX_H, MCMode.ENABLE);

	}

	/**
	 * [UPD_FIX_H]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_LclWrk(MABGP_CostIoConfigReg p){

	}

	/**
	 * [UPD_FIX_H]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_Lcl(MABGP_CostIoConfigReg p){
		p.columnLcl_check.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnLcl_cost_io_id.putMode(p, UPD_FIX_H, MCMode.INVISIBLE);
		p.columnLcl_io_col_cd.putMode(p, UPD_FIX_H, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_io_col_nm.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnLcl_memo1.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnLcl_memo2.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnLcl_memo3.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnLcl_ins_usr_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, UPD_FIX_H, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_FIX_H]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_LclAll(MABGP_CostIoConfigReg p){

	}

	/**
	 * [UPD_FIX_H]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_LclBtn(MABGP_CostIoConfigReg p){
		p.LclBtn_select_all.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD_FIX_H, MCMode.ENABLE);

	}

	/**
	 * [UPD_FIX_H]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_Btn(MABGP_CostIoConfigReg p){
		p.Btn_open_MABGP0370.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD_FIX_H, MCMode.DISABLE);

	}

	/**
	 * [UPD_FIX_H]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_EastBtn(MABGP_CostIoConfigReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MABGP_CostIoConfigReg p){

	}

	/**
	 * [FIX_U]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Mst(MABGP_CostIoConfigReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MABGP_CostIoConfigReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_cost_io_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_cost_io_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MABGP_CostIoConfigReg p){
		p.Hdr_cost_io_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cost_io_nm.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Wrk(MABGP_CostIoConfigReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MABGP_CostIoConfigReg p){
		p.columnDtl_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_io_col_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_io_col_nm_lcl.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_io_col_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_io_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_io_tgt_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_io_tgt_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_io_sml_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_io_sml_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prov_expns_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_unit_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_qty_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_amt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_std_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_diff_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bal_calc_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bal_calc_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_minus_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_fg_p_PPanel.putStatus(FIX_U, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.Dtl_bg_p_PPanel.putStatus(FIX_U, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.columnDtl_sample.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DtlBtn(MABGP_CostIoConfigReg p){
		p.DtlBtn_menu_move_p_PPanel.putStatus(FIX_U, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.DtlBtn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_LclWrk(MABGP_CostIoConfigReg p){

	}

	/**
	 * [FIX_U]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Lcl(MABGP_CostIoConfigReg p){
		p.columnLcl_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_cost_io_id.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnLcl_io_col_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_io_col_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_LclAll(MABGP_CostIoConfigReg p){

	}

	/**
	 * [FIX_U]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_LclBtn(MABGP_CostIoConfigReg p){
		p.LclBtn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MABGP_CostIoConfigReg p){
		p.Btn_open_MABGP0370.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MABGP_CostIoConfigReg p){

	}

	/**
	 * [MOD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitMOD_ScreenOpe(MABGP_CostIoConfigReg p){

	}

	/**
	 * [MOD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Mst(MABGP_CostIoConfigReg p){
		p.Mst_mst_set_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);

	}

	/**
	 * [MOD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Cnd(MABGP_CostIoConfigReg p){
		p.Cnd_ope_Group.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_cost_io_id.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_cost_io_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, MOD, MCMode.ENABLE);

	}

	/**
	 * [MOD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Hdr(MABGP_CostIoConfigReg p){
		p.Hdr_cost_io_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_cost_io_nm.putMode(p, MOD, MCMode.READ_ONLY);

	}

	/**
	 * [MOD]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Wrk(MABGP_CostIoConfigReg p){

	}

	/**
	 * [MOD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Dtl(MABGP_CostIoConfigReg p){
		p.columnDtl_check.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_io_col_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_io_col_nm_lcl.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_io_col_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_io_seq.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_io_tgt_typ.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_io_tgt_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_io_sml_typ.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_io_sml_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_prov_expns_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_unit_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_qty_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_amt_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_std_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_diff_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_bal_calc_typ.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_bal_calc_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_minus_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.Dtl_fg_p_PPanel.putStatus(MOD, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.Dtl_bg_p_PPanel.putStatus(MOD, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.columnDtl_sample.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, MOD, MCMode.READ_ONLY);

	}

	/**
	 * [MOD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_DtlBtn(MABGP_CostIoConfigReg p){
		p.DtlBtn_menu_move_p_PPanel.putStatus(MOD, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.DtlBtn_select_all.putMode(p, MOD, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, MOD, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, MOD, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, MOD, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, MOD, MCMode.DISABLE);

	}

	/**
	 * [MOD]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitMOD_LclWrk(MABGP_CostIoConfigReg p){

	}

	/**
	 * [MOD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Lcl(MABGP_CostIoConfigReg p){
		p.columnLcl_check.putMode(p, MOD, MCMode.REQUIRED);
		p.columnLcl_cost_io_id.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnLcl_io_col_cd.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_io_col_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, MOD, MCMode.READ_ONLY);

	}

	/**
	 * [MOD]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitMOD_LclAll(MABGP_CostIoConfigReg p){

	}

	/**
	 * [MOD]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_LclBtn(MABGP_CostIoConfigReg p){
		p.LclBtn_select_all.putMode(p, MOD, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, MOD, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, MOD, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, MOD, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, MOD, MCMode.DISABLE);

	}

	/**
	 * [MOD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Btn(MABGP_CostIoConfigReg p){
		p.Btn_open_MABGP0370.putMode(p, MOD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, MOD, MCMode.DISABLE);
		p.Btn_del.putMode(p, MOD, MCMode.DISABLE);

	}

	/**
	 * [MOD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_EastBtn(MABGP_CostIoConfigReg p){

	}

	/**
	 * [MOD_FIX_H]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_ScreenOpe(MABGP_CostIoConfigReg p){

	}

	/**
	 * [MOD_FIX_H]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_Mst(MABGP_CostIoConfigReg p){
		p.Mst_mst_set_typ_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [MOD_FIX_H]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_Cnd(MABGP_CostIoConfigReg p){
		p.Cnd_ope_Group.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.Cnd_cost_io_id.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.Cnd_cost_io_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, MOD_FIX_H, MCMode.ENABLE);

	}

	/**
	 * [MOD_FIX_H]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_Hdr(MABGP_CostIoConfigReg p){
		p.Hdr_cost_io_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.Hdr_cost_io_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [MOD_FIX_H]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_Wrk(MABGP_CostIoConfigReg p){

	}

	/**
	 * [MOD_FIX_H]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_Dtl(MABGP_CostIoConfigReg p){
		p.columnDtl_check.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_io_col_cd.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_io_col_nm_lcl.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_io_col_nm.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_io_seq.putMode(p, MOD_FIX_H, MCMode.INVISIBLE);
		p.columnDtl_io_tgt_typ.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_io_tgt_typ_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_io_sml_typ.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_io_sml_typ_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_prov_expns_flg.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_unit_flg.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_qty_flg.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_amt_flg.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_std_flg.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_diff_flg.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_bal_calc_typ.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_bal_calc_typ_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_minus_flg.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.Dtl_fg_p_PPanel.putStatus(MOD_FIX_H, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.ENABLE);
		p.Dtl_bg_p_PPanel.putStatus(MOD_FIX_H, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.ENABLE);
		p.columnDtl_sample.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_memo1.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, MOD_FIX_H, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [MOD_FIX_H]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_DtlBtn(MABGP_CostIoConfigReg p){
		p.DtlBtn_menu_move_p_PPanel.putStatus(MOD_FIX_H, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.DtlBtn_select_all.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, MOD_FIX_H, MCMode.ENABLE);

	}

	/**
	 * [MOD_FIX_H]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_LclWrk(MABGP_CostIoConfigReg p){

	}

	/**
	 * [MOD_FIX_H]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_Lcl(MABGP_CostIoConfigReg p){
		p.columnLcl_check.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnLcl_cost_io_id.putMode(p, MOD_FIX_H, MCMode.INVISIBLE);
		p.columnLcl_io_col_cd.putMode(p, MOD_FIX_H, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_io_col_nm.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnLcl_memo1.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnLcl_memo2.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnLcl_memo3.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnLcl_ins_usr_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, MOD_FIX_H, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [MOD_FIX_H]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_LclAll(MABGP_CostIoConfigReg p){

	}

	/**
	 * [MOD_FIX_H]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_LclBtn(MABGP_CostIoConfigReg p){
		p.LclBtn_select_all.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, MOD_FIX_H, MCMode.ENABLE);

	}

	/**
	 * [MOD_FIX_H]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_Btn(MABGP_CostIoConfigReg p){
		p.Btn_open_MABGP0370.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.Btn_upd.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.Btn_del.putMode(p, MOD_FIX_H, MCMode.DISABLE);

	}

	/**
	 * [MOD_FIX_H]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_EastBtn(MABGP_CostIoConfigReg p){

	}

	/**
	 * [FIX_M]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_ScreenOpe(MABGP_CostIoConfigReg p){

	}

	/**
	 * [FIX_M]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Mst(MABGP_CostIoConfigReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX_M, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_M]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Cnd(MABGP_CostIoConfigReg p){
		p.Cnd_ope_Group.putMode(p, FIX_M, MCMode.REQUIRED);
		p.Cnd_cost_io_id.putMode(p, FIX_M, MCMode.REQUIRED);
		p.Cnd_cost_io_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_M, MCMode.ENABLE);

	}

	/**
	 * [FIX_M]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Hdr(MABGP_CostIoConfigReg p){
		p.Hdr_cost_io_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Hdr_cost_io_nm.putMode(p, FIX_M, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_M]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Wrk(MABGP_CostIoConfigReg p){

	}

	/**
	 * [FIX_M]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Dtl(MABGP_CostIoConfigReg p){
		p.columnDtl_check.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_io_col_cd.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_io_col_nm_lcl.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_io_col_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_io_seq.putMode(p, FIX_M, MCMode.INVISIBLE);
		p.columnDtl_io_tgt_typ.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_io_tgt_typ_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_io_sml_typ.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_io_sml_typ_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_prov_expns_flg.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_unit_flg.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_qty_flg.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_amt_flg.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_std_flg.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_diff_flg.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_bal_calc_typ.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_bal_calc_typ_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_minus_flg.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Dtl_fg_p_PPanel.putStatus(FIX_M, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.Dtl_bg_p_PPanel.putStatus(FIX_M, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.columnDtl_sample.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX_M, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX_M, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_M]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_DtlBtn(MABGP_CostIoConfigReg p){
		p.DtlBtn_menu_move_p_PPanel.putStatus(FIX_M, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.DtlBtn_select_all.putMode(p, FIX_M, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX_M, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX_M, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX_M, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX_M, MCMode.DISABLE);

	}

	/**
	 * [FIX_M]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_LclWrk(MABGP_CostIoConfigReg p){

	}

	/**
	 * [FIX_M]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Lcl(MABGP_CostIoConfigReg p){
		p.columnLcl_check.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_cost_io_id.putMode(p, FIX_M, MCMode.INVISIBLE);
		p.columnLcl_io_col_cd.putMode(p, FIX_M, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_io_col_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, FIX_M, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, FIX_M, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_M]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_LclAll(MABGP_CostIoConfigReg p){

	}

	/**
	 * [FIX_M]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_LclBtn(MABGP_CostIoConfigReg p){
		p.LclBtn_select_all.putMode(p, FIX_M, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX_M, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX_M, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX_M, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX_M, MCMode.DISABLE);

	}

	/**
	 * [FIX_M]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Btn(MABGP_CostIoConfigReg p){
		p.Btn_open_MABGP0370.putMode(p, FIX_M, MCMode.ENABLE);
		p.Btn_upd.putMode(p, FIX_M, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_M, MCMode.DISABLE);

	}

	/**
	 * [FIX_M]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_EastBtn(MABGP_CostIoConfigReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABGP_CostIoConfigReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABGP_CostIoConfigReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABGP_CostIoConfigReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_cost_io_id.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_cost_io_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MABGP_CostIoConfigReg p){
		p.Hdr_cost_io_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cost_io_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Wrk(MABGP_CostIoConfigReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABGP_CostIoConfigReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_io_col_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_io_col_nm_lcl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_io_col_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_io_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_io_tgt_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_io_tgt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_io_sml_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_io_sml_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prov_expns_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_unit_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_qty_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_amt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_std_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_diff_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bal_calc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bal_calc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_minus_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_fg_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.Dtl_bg_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.columnDtl_sample.putMode(p, DEL, MCMode.READ_ONLY);
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
	protected static void statusInitDEL_DtlBtn(MABGP_CostIoConfigReg p){
		p.DtlBtn_menu_move_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclWrk(MABGP_CostIoConfigReg p){

	}

	/**
	 * [DEL]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Lcl(MABGP_CostIoConfigReg p){
		p.columnLcl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_cost_io_id.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_io_col_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_io_col_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclAll(MABGP_CostIoConfigReg p){

	}

	/**
	 * [DEL]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclBtn(MABGP_CostIoConfigReg p){
		p.LclBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABGP_CostIoConfigReg p){
		p.Btn_open_MABGP0370.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABGP_CostIoConfigReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MABGP_CostIoConfigReg p){

	}

	/**
	 * [FIX_D]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Mst(MABGP_CostIoConfigReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MABGP_CostIoConfigReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_cost_io_id.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_cost_io_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MABGP_CostIoConfigReg p){
		p.Hdr_cost_io_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cost_io_nm.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Wrk(MABGP_CostIoConfigReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MABGP_CostIoConfigReg p){
		p.columnDtl_check.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_io_col_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_io_col_nm_lcl.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_io_col_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_io_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_io_tgt_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_io_tgt_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_io_sml_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_io_sml_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_prov_expns_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_unit_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_qty_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_amt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_std_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_diff_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bal_calc_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bal_calc_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_minus_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_fg_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.Dtl_bg_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.columnDtl_sample.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_DtlBtn(MABGP_CostIoConfigReg p){
		p.DtlBtn_menu_move_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.DtlBtn_select_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_LclWrk(MABGP_CostIoConfigReg p){

	}

	/**
	 * [FIX_D]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Lcl(MABGP_CostIoConfigReg p){
		p.columnLcl_check.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_cost_io_id.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnLcl_io_col_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_io_col_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_LclAll(MABGP_CostIoConfigReg p){

	}

	/**
	 * [FIX_D]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_LclBtn(MABGP_CostIoConfigReg p){
		p.LclBtn_select_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MABGP_CostIoConfigReg p){
		p.Btn_open_MABGP0370.putMode(p, FIX_D, MCMode.ENABLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MABGP_CostIoConfigReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABGP_CostIoConfigReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABGP_CostIoConfigReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABGP_CostIoConfigReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cost_io_id.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cost_io_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MABGP_CostIoConfigReg p){
		p.Hdr_cost_io_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cost_io_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk(MABGP_CostIoConfigReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABGP_CostIoConfigReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_io_col_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_io_col_nm_lcl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_io_col_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_io_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_io_tgt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_io_tgt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_io_sml_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_io_sml_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_expns_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_unit_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_qty_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_amt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_std_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_diff_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bal_calc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bal_calc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_minus_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_fg_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.Dtl_bg_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.columnDtl_sample.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_DtlBtn(MABGP_CostIoConfigReg p){
		p.DtlBtn_menu_move_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclWrk(MABGP_CostIoConfigReg p){

	}

	/**
	 * [REF]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Lcl(MABGP_CostIoConfigReg p){
		p.columnLcl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_cost_io_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_io_col_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_io_col_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclAll(MABGP_CostIoConfigReg p){

	}

	/**
	 * [REF]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclBtn(MABGP_CostIoConfigReg p){
		p.LclBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABGP_CostIoConfigReg p){
		p.Btn_open_MABGP0370.putMode(p, REF, MCMode.ENABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABGP_CostIoConfigReg p){

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
		MABGP_CostIoConfigReg_MC.setTableConfigDtl((MABGP_CostIoConfigReg)this);
		MABGP_CostIoConfigReg_MC.setTableConfigLcl((MABGP_CostIoConfigReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABGP_CostIoConfigReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABG.MABGP0360.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABG.MABGP0360.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_io_col_cd.setMeta(mcframe.clientMABG.MABGP0360.DtlR.io_col_cd_META);
		p.columnDtl_io_col_cd.addLinkBeans(p.columnDtl_io_col_nm_lcl);
		p.DtlTable.addColumnConfig(p.columnDtl_io_col_cd);
		p.columnDtl_io_col_nm_lcl.setMeta(mcframe.clientMABG.MABGP0360.DtlR.io_col_nm_lcl_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_col_nm_lcl);
		p.columnDtl_io_col_nm.setMeta(mcframe.clientMABG.MABGP0360.DtlR.io_col_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_col_nm);
		p.columnDtl_io_seq.setMeta(mcframe.clientMABG.MABGP0360.DtlR.io_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_seq);
		p.columnDtl_io_tgt_typ.setMeta(mcframe.clientMABG.MABGP0360.DtlR.io_tgt_typ_META);
		p.columnDtl_io_tgt_typ.addLinkBeans(p.columnDtl_io_tgt_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_io_tgt_typ);
		p.columnDtl_io_tgt_typ_nm.setMeta(mcframe.clientMABG.MABGP0360.DtlR.io_tgt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_tgt_typ_nm);
		p.columnDtl_io_sml_typ.setMeta(mcframe.clientMABG.MABGP0360.DtlR.io_sml_typ_META);
		p.columnDtl_io_sml_typ.addLinkBeans(p.columnDtl_io_sml_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_io_sml_typ);
		p.columnDtl_io_sml_typ_nm.setMeta(mcframe.clientMABG.MABGP0360.DtlR.io_sml_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_sml_typ_nm);
		p.columnDtl_prov_expns_flg.setMeta(mcframe.clientMABG.MABGP0360.DtlR.prov_expns_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_expns_flg);
		p.columnDtl_unit_flg.setMeta(mcframe.clientMABG.MABGP0360.DtlR.unit_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_flg);
		p.columnDtl_qty_flg.setMeta(mcframe.clientMABG.MABGP0360.DtlR.qty_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_qty_flg);
		p.columnDtl_amt_flg.setMeta(mcframe.clientMABG.MABGP0360.DtlR.amt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_amt_flg);
		p.columnDtl_std_flg.setMeta(mcframe.clientMABG.MABGP0360.DtlR.std_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_flg);
		p.columnDtl_diff_flg.setMeta(mcframe.clientMABG.MABGP0360.DtlR.diff_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_diff_flg);
		p.columnDtl_bal_calc_typ.setMeta(mcframe.clientMABG.MABGP0360.DtlR.bal_calc_typ_META);
		p.columnDtl_bal_calc_typ.addLinkBeans(p.columnDtl_bal_calc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_bal_calc_typ);
		p.columnDtl_bal_calc_typ_nm.setMeta(mcframe.clientMABG.MABGP0360.DtlR.bal_calc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bal_calc_typ_nm);
		p.columnDtl_minus_flg.setMeta(mcframe.clientMABG.MABGP0360.DtlR.minus_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_minus_flg);
		p.DtlTable.addTable(p.Dtl_fg_p_PPanel.ColorTable);
		p.DtlTable.addTable(p.Dtl_bg_p_PPanel.ColorTable);
		p.columnDtl_sample.setMeta(mcframe.clientMABG.MABGP0360.DtlR.sample_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sample);
		p.columnDtl_memo1.setMeta(mcframe.clientMABG.MABGP0360.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABG.MABGP0360.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABG.MABGP0360.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABG.MABGP0360.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABG.MABGP0360.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABG.MABGP0360.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABG.MABGP0360.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABG.MABGP0360.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABG.MABGP0360.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABG.MABGP0360.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABG.MABGP0360.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABG.MABGP0360.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABG.MABGP0360.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABG.MABGP0360.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABG.MABGP0360.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABG.MABGP0360.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABG.MABGP0360.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABG.MABGP0360.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * [Lcl]ブロックのTableの設定
	 */
	protected static void setTableConfigLcl(MABGP_CostIoConfigReg p) {
		p.columnLcl_check.setMeta(mcframe.clientMABG.MABGP0360.LclR.check_META);
		p.LclTable.addColumnConfig(p.columnLcl_check);
		p.columnLcl_cost_io_id.setMeta(mcframe.clientMABG.MABGP0360.LclR.cost_io_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_cost_io_id);
		p.columnLcl_io_col_cd.setMeta(mcframe.clientMABG.MABGP0360.LclR.io_col_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_io_col_cd);
		p.columnLcl_lcl_cd.setMeta(mcframe.clientMABG.MABGP0360.LclR.lcl_cd_META);
		p.columnLcl_lcl_cd.addLinkBeans(p.columnLcl_lcl_nm);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_cd);
		p.columnLcl_lcl_nm.setMeta(mcframe.clientMABG.MABGP0360.LclR.lcl_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_nm);
		p.columnLcl_io_col_nm.setMeta(mcframe.clientMABG.MABGP0360.LclR.io_col_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_io_col_nm);
		p.columnLcl_memo1.setMeta(mcframe.clientMABG.MABGP0360.LclR.memo1_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo1);
		p.columnLcl_memo2.setMeta(mcframe.clientMABG.MABGP0360.LclR.memo2_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo2);
		p.columnLcl_memo3.setMeta(mcframe.clientMABG.MABGP0360.LclR.memo3_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo3);
		p.columnLcl_ins_usr_id.setMeta(mcframe.clientMABG.MABGP0360.LclR.ins_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_id);
		p.columnLcl_ins_usr_nm.setMeta(mcframe.clientMABG.MABGP0360.LclR.ins_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_nm);
		p.columnLcl_ins_ts.setMeta(mcframe.clientMABG.MABGP0360.LclR.ins_ts_META);
		p.columnLcl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_ins_ts);
		p.columnLcl_ins_func_id.setMeta(mcframe.clientMABG.MABGP0360.LclR.ins_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_id);
		p.columnLcl_ins_func_nm.setMeta(mcframe.clientMABG.MABGP0360.LclR.ins_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_nm);
		p.columnLcl_upd_cntr.setMeta(mcframe.clientMABG.MABGP0360.LclR.upd_cntr_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_cntr);
		p.columnLcl_upd_usr_id.setMeta(mcframe.clientMABG.MABGP0360.LclR.upd_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_id);
		p.columnLcl_upd_usr_nm.setMeta(mcframe.clientMABG.MABGP0360.LclR.upd_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_nm);
		p.columnLcl_upd_ts.setMeta(mcframe.clientMABG.MABGP0360.LclR.upd_ts_META);
		p.columnLcl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_upd_ts);
		p.columnLcl_upd_func_id.setMeta(mcframe.clientMABG.MABGP0360.LclR.upd_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_id);
		p.columnLcl_upd_func_nm.setMeta(mcframe.clientMABG.MABGP0360.LclR.upd_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_nm);
		p.columnLcl_upd_srv_req_no.setMeta(mcframe.clientMABG.MABGP0360.LclR.upd_srv_req_no_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.LclTable.setUnscrollColumn(p.columnLcl_lcl_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_cost_io_id.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cost_io_id.getListConfig().setPutter(getCnd_cost_io_id_ListPutter());
		Hdr_cost_io_id.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_cost_io_id.getListConfig().setPutter(getHdr_cost_io_id_ListPutter());
		columnDtl_io_tgt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_io_tgt_typ.getListConfig().setPutter(getDtl_io_tgt_typ_ListPutter());
		columnDtl_io_sml_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_io_sml_typ.getListConfig().setPutter(getDtl_io_sml_typ_ListPutter());
		columnDtl_bal_calc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bal_calc_typ.getListConfig().setPutter(getDtl_bal_calc_typ_ListPutter());
		columnLcl_lcl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnLcl_lcl_cd.getListConfig().setPutter(getLcl_lcl_cd_ListPutter());
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
	 * この画面を[UPD_FIX_H]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_FIX_HStatus() {
		status = UPD_FIX_H;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_U]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_UStatus() {
		status = FIX_U;
		setAllStatus(status);
	}

	/**
	 * この画面を[MOD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setMODStatus() {
		status = MOD;
		setAllStatus(status);
	}

	/**
	 * この画面を[MOD_FIX_H]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setMOD_FIX_HStatus() {
		status = MOD_FIX_H;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_M]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_MStatus() {
		status = FIX_M;
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
	 * この画面を[FIX_D]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_DStatus() {
		status = FIX_D;
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
		else if (UPD_FIX_H.equals(status)) {
			setUPD_FIX_HStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (MOD.equals(status)) {
			setMODStatus();
		}
		else if (MOD_FIX_H.equals(status)) {
			setMOD_FIX_HStatus();
		}
		else if (FIX_M.equals(status)) {
			setFIX_MStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
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
	 * [Cnd_cost_io_id_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cost_io_id_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostIo");
		return lp;
	}
	 
	/**
	 * [Hdr_cost_io_id_ListPutter]の作成
	 */
	protected MCListPutter createHdr_cost_io_id_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostIoNotInCostIoConf");
		return lp;
	}
	 
	/**
	 * [Dtl_io_tgt_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_io_tgt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IoTgtTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_io_sml_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_io_sml_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IoSmlTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_bal_calc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bal_calc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BalCalcTyp");
		return lp;
	}
	 
	/**
	 * [Lcl_lcl_cd_ListPutter]の作成
	 */
	protected MCListPutter createLcl_lcl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocaleEntry");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_cost_io_id) return getCnd_cost_io_id(row, info);
		if(combo == Hdr_cost_io_id) return getHdr_cost_io_id(row, info);
		if(combo == columnDtl_io_tgt_typ) return getDtl_io_tgt_typ(row, info);
		if(combo == columnDtl_io_sml_typ) return getDtl_io_sml_typ(row, info);
		if(combo == columnDtl_bal_calc_typ) return getDtl_bal_calc_typ(row, info);
		if(combo == columnLcl_lcl_cd) return getLcl_lcl_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch) doCnd_srch(info);
		else if (ap == DtlBtn_select_all) doDtlBtn_select_all(info);
		else if (ap == DtlBtn_deselect_all) doDtlBtn_deselect_all(info);
		else if (ap == DtlBtn_radd) doDtlBtn_radd(info);
		else if (ap == DtlBtn_rdel) doDtlBtn_rdel(info);
		else if (ap == DtlBtn_rcopy) doDtlBtn_rcopy(info);
		else if (ap == LclBtn_select_all) doLclBtn_select_all(info);
		else if (ap == LclBtn_deselect_all) doLclBtn_deselect_all(info);
		else if (ap == LclBtn_radd) doLclBtn_radd(info);
		else if (ap == LclBtn_rdel) doLclBtn_rdel(info);
		else if (ap == LclBtn_rcopy) doLclBtn_rcopy(info);
		else if (ap == Btn_open_MABGP0370) doBtn_open_MABGP0370(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

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
	 * [LclBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_select_all(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_deselect_all(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_radd(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_rdel(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABGP0370]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABGP0370(MCEventInfo info);

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
		if (vc == LclTable) return doLcl_VC(info);
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_cost_io_id) return doCnd_cost_io_id_VC(info);
		if (vc == Cnd_cost_io_nm) return doCnd_cost_io_nm_VC(info);
		if (vc == Hdr_cost_io_id) return doHdr_cost_io_id_VC(info);
		if (vc == Hdr_cost_io_nm) return doHdr_cost_io_nm_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_io_col_cd) return doDtl_io_col_cd_VC(info);
		if (vc == columnDtl_io_col_nm_lcl) return doDtl_io_col_nm_lcl_VC(info);
		if (vc == columnDtl_io_col_nm) return doDtl_io_col_nm_VC(info);
		if (vc == columnDtl_io_seq) return doDtl_io_seq_VC(info);
		if (vc == columnDtl_io_tgt_typ) return doDtl_io_tgt_typ_VC(info);
		if (vc == columnDtl_io_tgt_typ_nm) return doDtl_io_tgt_typ_nm_VC(info);
		if (vc == columnDtl_io_sml_typ) return doDtl_io_sml_typ_VC(info);
		if (vc == columnDtl_io_sml_typ_nm) return doDtl_io_sml_typ_nm_VC(info);
		if (vc == columnDtl_prov_expns_flg) return doDtl_prov_expns_flg_VC(info);
		if (vc == columnDtl_unit_flg) return doDtl_unit_flg_VC(info);
		if (vc == columnDtl_qty_flg) return doDtl_qty_flg_VC(info);
		if (vc == columnDtl_amt_flg) return doDtl_amt_flg_VC(info);
		if (vc == columnDtl_std_flg) return doDtl_std_flg_VC(info);
		if (vc == columnDtl_diff_flg) return doDtl_diff_flg_VC(info);
		if (vc == columnDtl_bal_calc_typ) return doDtl_bal_calc_typ_VC(info);
		if (vc == columnDtl_bal_calc_typ_nm) return doDtl_bal_calc_typ_nm_VC(info);
		if (vc == columnDtl_minus_flg) return doDtl_minus_flg_VC(info);
		if (vc == columnDtl_sample) return doDtl_sample_VC(info);
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
		if (vc == columnLcl_check) return doLcl_check_VC(info);
		if (vc == columnLcl_cost_io_id) return doLcl_cost_io_id_VC(info);
		if (vc == columnLcl_io_col_cd) return doLcl_io_col_cd_VC(info);
		if (vc == columnLcl_lcl_cd) return doLcl_lcl_cd_VC(info);
		if (vc == columnLcl_lcl_nm) return doLcl_lcl_nm_VC(info);
		if (vc == columnLcl_io_col_nm) return doLcl_io_col_nm_VC(info);
		if (vc == columnLcl_memo1) return doLcl_memo1_VC(info);
		if (vc == columnLcl_memo2) return doLcl_memo2_VC(info);
		if (vc == columnLcl_memo3) return doLcl_memo3_VC(info);
		if (vc == columnLcl_ins_usr_id) return doLcl_ins_usr_id_VC(info);
		if (vc == columnLcl_ins_usr_nm) return doLcl_ins_usr_nm_VC(info);
		if (vc == columnLcl_ins_ts) return doLcl_ins_ts_VC(info);
		if (vc == columnLcl_ins_func_id) return doLcl_ins_func_id_VC(info);
		if (vc == columnLcl_ins_func_nm) return doLcl_ins_func_nm_VC(info);
		if (vc == columnLcl_upd_cntr) return doLcl_upd_cntr_VC(info);
		if (vc == columnLcl_upd_usr_id) return doLcl_upd_usr_id_VC(info);
		if (vc == columnLcl_upd_usr_nm) return doLcl_upd_usr_nm_VC(info);
		if (vc == columnLcl_upd_ts) return doLcl_upd_ts_VC(info);
		if (vc == columnLcl_upd_func_id) return doLcl_upd_func_id_VC(info);
		if (vc == columnLcl_upd_func_nm) return doLcl_upd_func_nm_VC(info);
		if (vc == columnLcl_upd_srv_req_no) return doLcl_upd_srv_req_no_VC(info);
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
	 * [Lcl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[cost_io_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_io_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_io_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_io_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cost_io_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cost_io_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cost_io_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cost_io_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[io_col_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_col_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_col_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_col_nm_lcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_col_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_col_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_tgt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_tgt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_tgt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_tgt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_sml_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_sml_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_sml_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_sml_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_expns_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_expns_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[unit_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_unit_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[qty_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_qty_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[amt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_amt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[diff_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_diff_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bal_calc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bal_calc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bal_calc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bal_calc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[minus_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_minus_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sample]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sample_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[cost_io_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_cost_io_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[io_col_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_io_col_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_lcl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_lcl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[io_col_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_io_col_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_srv_req_no_VC(MCEventInfo info){
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
		else if (nc == LclTable) doLcl_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_cost_io_id) doCnd_cost_io_id_NC(info);
		else if (nc == Cnd_cost_io_nm) doCnd_cost_io_nm_NC(info);
		else if (nc == Hdr_cost_io_id) doHdr_cost_io_id_NC(info);
		else if (nc == Hdr_cost_io_nm) doHdr_cost_io_nm_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_io_col_cd) doDtl_io_col_cd_NC(info);
		else if (nc == columnDtl_io_col_nm_lcl) doDtl_io_col_nm_lcl_NC(info);
		else if (nc == columnDtl_io_col_nm) doDtl_io_col_nm_NC(info);
		else if (nc == columnDtl_io_seq) doDtl_io_seq_NC(info);
		else if (nc == columnDtl_io_tgt_typ) doDtl_io_tgt_typ_NC(info);
		else if (nc == columnDtl_io_tgt_typ_nm) doDtl_io_tgt_typ_nm_NC(info);
		else if (nc == columnDtl_io_sml_typ) doDtl_io_sml_typ_NC(info);
		else if (nc == columnDtl_io_sml_typ_nm) doDtl_io_sml_typ_nm_NC(info);
		else if (nc == columnDtl_prov_expns_flg) doDtl_prov_expns_flg_NC(info);
		else if (nc == columnDtl_unit_flg) doDtl_unit_flg_NC(info);
		else if (nc == columnDtl_qty_flg) doDtl_qty_flg_NC(info);
		else if (nc == columnDtl_amt_flg) doDtl_amt_flg_NC(info);
		else if (nc == columnDtl_std_flg) doDtl_std_flg_NC(info);
		else if (nc == columnDtl_diff_flg) doDtl_diff_flg_NC(info);
		else if (nc == columnDtl_bal_calc_typ) doDtl_bal_calc_typ_NC(info);
		else if (nc == columnDtl_bal_calc_typ_nm) doDtl_bal_calc_typ_nm_NC(info);
		else if (nc == columnDtl_minus_flg) doDtl_minus_flg_NC(info);
		else if (nc == columnDtl_sample) doDtl_sample_NC(info);
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
		else if (nc == columnLcl_check) doLcl_check_NC(info);
		else if (nc == columnLcl_cost_io_id) doLcl_cost_io_id_NC(info);
		else if (nc == columnLcl_io_col_cd) doLcl_io_col_cd_NC(info);
		else if (nc == columnLcl_lcl_cd) doLcl_lcl_cd_NC(info);
		else if (nc == columnLcl_lcl_nm) doLcl_lcl_nm_NC(info);
		else if (nc == columnLcl_io_col_nm) doLcl_io_col_nm_NC(info);
		else if (nc == columnLcl_memo1) doLcl_memo1_NC(info);
		else if (nc == columnLcl_memo2) doLcl_memo2_NC(info);
		else if (nc == columnLcl_memo3) doLcl_memo3_NC(info);
		else if (nc == columnLcl_ins_usr_id) doLcl_ins_usr_id_NC(info);
		else if (nc == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NC(info);
		else if (nc == columnLcl_ins_ts) doLcl_ins_ts_NC(info);
		else if (nc == columnLcl_ins_func_id) doLcl_ins_func_id_NC(info);
		else if (nc == columnLcl_ins_func_nm) doLcl_ins_func_nm_NC(info);
		else if (nc == columnLcl_upd_cntr) doLcl_upd_cntr_NC(info);
		else if (nc == columnLcl_upd_usr_id) doLcl_upd_usr_id_NC(info);
		else if (nc == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NC(info);
		else if (nc == columnLcl_upd_ts) doLcl_upd_ts_NC(info);
		else if (nc == columnLcl_upd_func_id) doLcl_upd_func_id_NC(info);
		else if (nc == columnLcl_upd_func_nm) doLcl_upd_func_nm_NC(info);
		else if (nc == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[cost_io_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_id_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_io_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cost_io_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cost_io_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cost_io_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cost_io_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[io_col_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_col_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_col_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_col_nm_lcl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_col_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_col_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_tgt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_tgt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_tgt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_tgt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sml_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sml_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sml_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sml_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_expns_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_expns_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qty_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qty_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[diff_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_diff_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bal_calc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bal_calc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bal_calc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bal_calc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[minus_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_minus_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sample]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sample_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[cost_io_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_cost_io_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[io_col_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_io_col_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[io_col_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_io_col_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NC(MCEventInfo info){
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
		else if (ne == LclTable) doLcl_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_cost_io_id) doCnd_cost_io_id_NE(info);
		else if (ne == Cnd_cost_io_nm) doCnd_cost_io_nm_NE(info);
		else if (ne == Hdr_cost_io_id) doHdr_cost_io_id_NE(info);
		else if (ne == Hdr_cost_io_nm) doHdr_cost_io_nm_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_io_col_cd) doDtl_io_col_cd_NE(info);
		else if (ne == columnDtl_io_col_nm_lcl) doDtl_io_col_nm_lcl_NE(info);
		else if (ne == columnDtl_io_col_nm) doDtl_io_col_nm_NE(info);
		else if (ne == columnDtl_io_seq) doDtl_io_seq_NE(info);
		else if (ne == columnDtl_io_tgt_typ) doDtl_io_tgt_typ_NE(info);
		else if (ne == columnDtl_io_tgt_typ_nm) doDtl_io_tgt_typ_nm_NE(info);
		else if (ne == columnDtl_io_sml_typ) doDtl_io_sml_typ_NE(info);
		else if (ne == columnDtl_io_sml_typ_nm) doDtl_io_sml_typ_nm_NE(info);
		else if (ne == columnDtl_prov_expns_flg) doDtl_prov_expns_flg_NE(info);
		else if (ne == columnDtl_unit_flg) doDtl_unit_flg_NE(info);
		else if (ne == columnDtl_qty_flg) doDtl_qty_flg_NE(info);
		else if (ne == columnDtl_amt_flg) doDtl_amt_flg_NE(info);
		else if (ne == columnDtl_std_flg) doDtl_std_flg_NE(info);
		else if (ne == columnDtl_diff_flg) doDtl_diff_flg_NE(info);
		else if (ne == columnDtl_bal_calc_typ) doDtl_bal_calc_typ_NE(info);
		else if (ne == columnDtl_bal_calc_typ_nm) doDtl_bal_calc_typ_nm_NE(info);
		else if (ne == columnDtl_minus_flg) doDtl_minus_flg_NE(info);
		else if (ne == columnDtl_sample) doDtl_sample_NE(info);
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
		else if (ne == columnLcl_check) doLcl_check_NE(info);
		else if (ne == columnLcl_cost_io_id) doLcl_cost_io_id_NE(info);
		else if (ne == columnLcl_io_col_cd) doLcl_io_col_cd_NE(info);
		else if (ne == columnLcl_lcl_cd) doLcl_lcl_cd_NE(info);
		else if (ne == columnLcl_lcl_nm) doLcl_lcl_nm_NE(info);
		else if (ne == columnLcl_io_col_nm) doLcl_io_col_nm_NE(info);
		else if (ne == columnLcl_memo1) doLcl_memo1_NE(info);
		else if (ne == columnLcl_memo2) doLcl_memo2_NE(info);
		else if (ne == columnLcl_memo3) doLcl_memo3_NE(info);
		else if (ne == columnLcl_ins_usr_id) doLcl_ins_usr_id_NE(info);
		else if (ne == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NE(info);
		else if (ne == columnLcl_ins_ts) doLcl_ins_ts_NE(info);
		else if (ne == columnLcl_ins_func_id) doLcl_ins_func_id_NE(info);
		else if (ne == columnLcl_ins_func_nm) doLcl_ins_func_nm_NE(info);
		else if (ne == columnLcl_upd_cntr) doLcl_upd_cntr_NE(info);
		else if (ne == columnLcl_upd_usr_id) doLcl_upd_usr_id_NE(info);
		else if (ne == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NE(info);
		else if (ne == columnLcl_upd_ts) doLcl_upd_ts_NE(info);
		else if (ne == columnLcl_upd_func_id) doLcl_upd_func_id_NE(info);
		else if (ne == columnLcl_upd_func_nm) doLcl_upd_func_nm_NE(info);
		else if (ne == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[cost_io_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_id_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_io_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cost_io_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cost_io_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cost_io_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cost_io_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[io_col_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_col_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_col_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_col_nm_lcl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_col_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_col_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_tgt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_tgt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_tgt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_tgt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sml_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sml_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sml_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sml_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_expns_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_expns_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qty_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qty_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[diff_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_diff_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bal_calc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bal_calc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bal_calc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bal_calc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[minus_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_minus_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sample]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sample_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[cost_io_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_cost_io_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[io_col_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_io_col_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[io_col_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_io_col_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NE(MCEventInfo info){
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
		else if (nx == LclTable) doLcl_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_cost_io_id) doCnd_cost_io_id_NX(info);
		else if (nx == Cnd_cost_io_nm) doCnd_cost_io_nm_NX(info);
		else if (nx == Hdr_cost_io_id) doHdr_cost_io_id_NX(info);
		else if (nx == Hdr_cost_io_nm) doHdr_cost_io_nm_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_io_col_cd) doDtl_io_col_cd_NX(info);
		else if (nx == columnDtl_io_col_nm_lcl) doDtl_io_col_nm_lcl_NX(info);
		else if (nx == columnDtl_io_col_nm) doDtl_io_col_nm_NX(info);
		else if (nx == columnDtl_io_seq) doDtl_io_seq_NX(info);
		else if (nx == columnDtl_io_tgt_typ) doDtl_io_tgt_typ_NX(info);
		else if (nx == columnDtl_io_tgt_typ_nm) doDtl_io_tgt_typ_nm_NX(info);
		else if (nx == columnDtl_io_sml_typ) doDtl_io_sml_typ_NX(info);
		else if (nx == columnDtl_io_sml_typ_nm) doDtl_io_sml_typ_nm_NX(info);
		else if (nx == columnDtl_prov_expns_flg) doDtl_prov_expns_flg_NX(info);
		else if (nx == columnDtl_unit_flg) doDtl_unit_flg_NX(info);
		else if (nx == columnDtl_qty_flg) doDtl_qty_flg_NX(info);
		else if (nx == columnDtl_amt_flg) doDtl_amt_flg_NX(info);
		else if (nx == columnDtl_std_flg) doDtl_std_flg_NX(info);
		else if (nx == columnDtl_diff_flg) doDtl_diff_flg_NX(info);
		else if (nx == columnDtl_bal_calc_typ) doDtl_bal_calc_typ_NX(info);
		else if (nx == columnDtl_bal_calc_typ_nm) doDtl_bal_calc_typ_nm_NX(info);
		else if (nx == columnDtl_minus_flg) doDtl_minus_flg_NX(info);
		else if (nx == columnDtl_sample) doDtl_sample_NX(info);
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
		else if (nx == columnLcl_check) doLcl_check_NX(info);
		else if (nx == columnLcl_cost_io_id) doLcl_cost_io_id_NX(info);
		else if (nx == columnLcl_io_col_cd) doLcl_io_col_cd_NX(info);
		else if (nx == columnLcl_lcl_cd) doLcl_lcl_cd_NX(info);
		else if (nx == columnLcl_lcl_nm) doLcl_lcl_nm_NX(info);
		else if (nx == columnLcl_io_col_nm) doLcl_io_col_nm_NX(info);
		else if (nx == columnLcl_memo1) doLcl_memo1_NX(info);
		else if (nx == columnLcl_memo2) doLcl_memo2_NX(info);
		else if (nx == columnLcl_memo3) doLcl_memo3_NX(info);
		else if (nx == columnLcl_ins_usr_id) doLcl_ins_usr_id_NX(info);
		else if (nx == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NX(info);
		else if (nx == columnLcl_ins_ts) doLcl_ins_ts_NX(info);
		else if (nx == columnLcl_ins_func_id) doLcl_ins_func_id_NX(info);
		else if (nx == columnLcl_ins_func_nm) doLcl_ins_func_nm_NX(info);
		else if (nx == columnLcl_upd_cntr) doLcl_upd_cntr_NX(info);
		else if (nx == columnLcl_upd_usr_id) doLcl_upd_usr_id_NX(info);
		else if (nx == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NX(info);
		else if (nx == columnLcl_upd_ts) doLcl_upd_ts_NX(info);
		else if (nx == columnLcl_upd_func_id) doLcl_upd_func_id_NX(info);
		else if (nx == columnLcl_upd_func_nm) doLcl_upd_func_nm_NX(info);
		else if (nx == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[cost_io_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_id_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_io_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cost_io_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cost_io_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cost_io_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cost_io_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[io_col_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_col_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_col_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_col_nm_lcl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_col_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_col_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_tgt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_tgt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_tgt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_tgt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sml_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sml_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sml_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sml_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_expns_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_expns_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qty_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qty_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[diff_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_diff_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bal_calc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bal_calc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bal_calc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bal_calc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[minus_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_minus_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sample]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sample_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[cost_io_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_cost_io_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[io_col_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_io_col_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[io_col_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_io_col_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NX(MCEventInfo info){
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
		else if (lc == Cnd_cost_io_id) doCnd_cost_io_id_LC(info);
		else if (lc == Cnd_cost_io_nm) doCnd_cost_io_nm_LC(info);
		else if (lc == Hdr_cost_io_id) doHdr_cost_io_id_LC(info);
		else if (lc == Hdr_cost_io_nm) doHdr_cost_io_nm_LC(info);
		else if (lc == columnDtl_io_col_cd) doDtl_io_col_cd_LC(info);
		else if (lc == columnDtl_io_col_nm_lcl) doDtl_io_col_nm_lcl_LC(info);
		else if (lc == columnDtl_io_col_nm) doDtl_io_col_nm_LC(info);
		else if (lc == columnDtl_io_seq) doDtl_io_seq_LC(info);
		else if (lc == columnDtl_io_tgt_typ) doDtl_io_tgt_typ_LC(info);
		else if (lc == columnDtl_io_tgt_typ_nm) doDtl_io_tgt_typ_nm_LC(info);
		else if (lc == columnDtl_io_sml_typ) doDtl_io_sml_typ_LC(info);
		else if (lc == columnDtl_io_sml_typ_nm) doDtl_io_sml_typ_nm_LC(info);
		else if (lc == columnDtl_bal_calc_typ) doDtl_bal_calc_typ_LC(info);
		else if (lc == columnDtl_bal_calc_typ_nm) doDtl_bal_calc_typ_nm_LC(info);
		else if (lc == columnDtl_sample) doDtl_sample_LC(info);
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
		else if (lc == columnLcl_cost_io_id) doLcl_cost_io_id_LC(info);
		else if (lc == columnLcl_io_col_cd) doLcl_io_col_cd_LC(info);
		else if (lc == columnLcl_lcl_cd) doLcl_lcl_cd_LC(info);
		else if (lc == columnLcl_lcl_nm) doLcl_lcl_nm_LC(info);
		else if (lc == columnLcl_io_col_nm) doLcl_io_col_nm_LC(info);
		else if (lc == columnLcl_memo1) doLcl_memo1_LC(info);
		else if (lc == columnLcl_memo2) doLcl_memo2_LC(info);
		else if (lc == columnLcl_memo3) doLcl_memo3_LC(info);
		else if (lc == columnLcl_ins_usr_id) doLcl_ins_usr_id_LC(info);
		else if (lc == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_LC(info);
		else if (lc == columnLcl_ins_ts) doLcl_ins_ts_LC(info);
		else if (lc == columnLcl_ins_func_id) doLcl_ins_func_id_LC(info);
		else if (lc == columnLcl_ins_func_nm) doLcl_ins_func_nm_LC(info);
		else if (lc == columnLcl_upd_cntr) doLcl_upd_cntr_LC(info);
		else if (lc == columnLcl_upd_usr_id) doLcl_upd_usr_id_LC(info);
		else if (lc == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_LC(info);
		else if (lc == columnLcl_upd_ts) doLcl_upd_ts_LC(info);
		else if (lc == columnLcl_upd_func_id) doLcl_upd_func_id_LC(info);
		else if (lc == columnLcl_upd_func_nm) doLcl_upd_func_nm_LC(info);
		else if (lc == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_LC(info);
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_io_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_id_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_io_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cost_io_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cost_io_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cost_io_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cost_io_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_col_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_col_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_col_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_col_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_col_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_col_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_tgt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_tgt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_tgt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_tgt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sml_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sml_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sml_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sml_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bal_calc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bal_calc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bal_calc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bal_calc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sample]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sample_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[cost_io_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_cost_io_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[io_col_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_io_col_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[io_col_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_io_col_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_cost_io_id]の作成メソッド
	 */
	public MCList getCnd_cost_io_id(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostIo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_cost_io_id]の作成メソッド
	 */
	public MCList getHdr_cost_io_id(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostIoNotInCostIoConf(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_io_tgt_typ]の作成メソッド
	 */
	public MCList getDtl_io_tgt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIoTgtTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_io_sml_typ]の作成メソッド
	 */
	public MCList getDtl_io_sml_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIoSmlTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bal_calc_typ]の作成メソッド
	 */
	public MCList getDtl_bal_calc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBalCalcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLcl_lcl_cd]の作成メソッド
	 */
	public MCList getLcl_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABGL0360.Srch01")) {
			return new MA_MABGL0360_Srch01Bridge();
		}
		if (id.equals("MA.MABGL0360.Upd01")) {
			return new MA_MABGL0360_Upd01Bridge();
		}
		if (id.equals("MA.MABGL0360.Del01")) {
			return new MA_MABGL0360_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABGL0360_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0360_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0360_Srch01;

		/** コンストラクタ */
		protected MA_MABGL0360_Srch01Bridge() {
			p_MA_MABGL0360_Srch01 = new MCParam(PDef.MA_MABGL0360_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0360_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABG.MABGP0360.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0360.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0360.LclR.class));

			p_MA_MABGL0360_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0360_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0360_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0360_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0360_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABG.MABGP0360.CndR up0() {
			return (mcframe.clientMABG.MABGP0360.CndR)up(0);
		}

		protected MCList<mcframe.clientMABG.MABGP0360.DtlR> down0() {
			return (MCList<mcframe.clientMABG.MABGP0360.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABG.MABGP0360.LclR> down1() {
			return (MCList<mcframe.clientMABG.MABGP0360.LclR>)down(1);
		}

		protected void setupDownParam() {
			p_MA_MABGL0360_Srch01.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0360.DtlR.class));
			p_MA_MABGL0360_Srch01.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0360.LclR.class));
		}
		protected MCParam param() {
			return p_MA_MABGL0360_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABG.MABGP0360.DtlR>)p_MA_MABGL0360_Srch01.getContainerParam().getDownBlock(0));
			setLclAllL((MCList<mcframe.clientMABG.MABGP0360.LclR>)p_MA_MABGL0360_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getDtlL().clear();
			getLclAllL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getLclAllL());
			return result;
		}
	}
	/**
	 * [MA_MABGL0360_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0360_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0360_Upd01;

		/** コンストラクタ */
		protected MA_MABGL0360_Upd01Bridge() {
			p_MA_MABGL0360_Upd01 = new MCParam(PDef.MA_MABGL0360_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0360_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0360.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0360.LclR.class));
			// Down

			p_MA_MABGL0360_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0360_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0360_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABGL0360_Upd01.addUpBlock(getLclAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0360_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0360_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABG.MABGP0360.DtlR> up0() {
			return (MCList<mcframe.clientMABG.MABGP0360.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMABG.MABGP0360.LclR> up1() {
			return (MCList<mcframe.clientMABG.MABGP0360.LclR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABGL0360_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getLclAllL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABGL0360_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0360_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0360_Del01;

		/** コンストラクタ */
		protected MA_MABGL0360_Del01Bridge() {
			p_MA_MABGL0360_Del01 = new MCParam(PDef.MA_MABGL0360_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0360_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0360.DtlR.class));
			// Down

			p_MA_MABGL0360_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0360_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0360_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0360_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0360_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABG.MABGP0360.DtlR> up0() {
			return (MCList<mcframe.clientMABG.MABGP0360.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABGL0360_Del01;
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