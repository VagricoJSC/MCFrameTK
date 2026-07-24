package mcframe.clientMABC.MABCP0850;

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
import mcframe.clientMABC.MABCP0850.MABCP_SlsItmGrpReg_MC.MA_MABCL0850_Srch01Caller;
import mcframe.clientMABC.MABCP0850.MABCP_SlsItmGrpReg_MC.MA_MABCL0850_Upd01Caller;
import mcframe.clientMABC.MABCP0850.MABCP_SlsItmGrpReg_MC.MA_MABCL0850_Del01Caller;

/**
 * 画面"MABCP_SlsItmGrpReg"パネルクラスです。<p>
 *
 * 販売品目体系マスタの検索、更新を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_SlsItmGrpReg_MC_A extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase{
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
	public static final String SCREEN_ID = "MABCP0850";

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
	// [CndPnl]ブロック関連のField定義
	public MCPanel CndPnlPanel = null;
	public MCTitledBorder CndPnlTitledBorder = null;
	// [CndPnl]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_sls_itm_grp_cd_Label = null;
	/**
	 * Sales item system cd. 販売品目体系ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_sls_itm_grp_cd = null;
	/**
	 * Sales item system name 販売品目体系名.<p>
	 *
	 */
	public MCTextField Cnd_sls_itm_grp_nm = null;
	/**
	 * Including logical delete 論理削除を含む.<p>
	 *
	 */
	public MCCheckBox Cnd_del_flg = null;
	/**
	 * Sales item system hierarchy 販売品目体系階層.<p>
	 *
	 */
	public MCNumberField Cnd_sls_itm_grp_lvl = null;
	// [SrchBtn]ブロック関連のField定義
	public MCPanel SrchBtnPanel = null;
	// [SrchBtn]ブロックの項目のField定義
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton SrchBtn_srch = null;
	// [Wrk]ブロック関連のField定義
	public MCPanel WrkPanel = null;
	// [Wrk]ブロックの項目のField定義
	// [TreePnl]ブロック関連のField定義
	public MCPanel TreePnlPanel = null;
	// [TreePnl]ブロックの項目のField定義
	// [Tree]ブロック関連のField定義
	public MCPanel TreePanel = null;
	public MCScrollPane TreeScrollPane = null;
	public MCTree<mcframe.clientMABC.MABCP0850.TreeR> TreeTree = null;
	// [Tree]ブロックの項目のField定義
	// [TreeBtn]ブロック関連のField定義
	public MCPanel TreeBtnPanel = null;
	// [TreeBtn]ブロックの項目のField定義
	/**
	 * Display again 再表示.<p>
	 *
	 */
	public MCButton TreeBtn_view = null;
	/**
	 * Explosion 展開.<p>
	 *
	 */
	public MCButton TreeBtn_expand = null;
	/**
	 * Collapse 折りたたみ.<p>
	 *
	 */
	public MCButton TreeBtn_collapse = null;
	// [DtlPnl]ブロック関連のField定義
	public MCPanel DtlPnlPanel = null;
	// [DtlPnl]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0850.DtlR> DtlTable = null;
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
	 * Sales item system cd. 販売品目体系ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_itm_grp_cd = null;
	/**
	 * Sales item system name 販売品目体系名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_itm_grp_nm_lcl = null;
	/**
	 * Standard sales item system name 標準販売品目体系名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_itm_grp_nm = null;
	/**
	 * Sales item system hierarchy 販売品目体系階層.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_itm_grp_lvl = null;
	/**
	 * Upper sales item system cd. 上位販売品目体系ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_up_sls_itm_grp_cd = null;
	/**
	 * Upper sales item system name 上位販売品目体系名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_up_sls_itm_grp_nm = null;
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
	// [Btn1]ブロック関連のField定義
	public MCPanel Btn1Panel = null;
	// [Btn1]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Btn1_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Btn1_deselect_all = null;
	/**
	 * Add to top 最上位追加.<p>
	 *
	 */
	public MCButton Btn1_add_top = null;
	/**
	 * Lower add 下位追加.<p>
	 *
	 */
	public MCButton Btn1_add_sub = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btn1_rcopy = null;
	/**
	 * Delete sales item system 販売品目体系削除.<p>
	 *
	 */
	public MCButton Btn1_del_rec = null;
	/**
	 * Cancel logical delete 論理削除取消.<p>
	 *
	 */
	public MCButton Btn1_can_del = null;
	// [LclWrk]ブロック関連のField定義
	public MCPanel LclWrkPanel = null;
	// [LclWrk]ブロックの項目のField定義
	// [Lcl]ブロック関連のField定義
	public MCPanel LclPanel = null;
	public MCScrollPane LclScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0850.LclR> LclTable = null;
	// [Lcl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLcl_check = null;
	/**
	 * Sales item system cd. 販売品目体系ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_sls_itm_grp_cd = null;
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
	 * Sales item system name 販売品目体系名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_sls_itm_grp_nm = null;
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
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{FIX, UPD, DEL, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL0850_Srch01]のCallerの作成 */
	protected MABCP_SlsItmGrpReg_MC.MA_MABCL0850_Srch01Caller createMA_MABCL0850_Srch01() {
		MABCP_SlsItmGrpReg_MC.MA_MABCL0850_Srch01Caller<MABCP_SlsItmGrpReg, MA_MABCL0850_Srch01Bridge>
		caller = ((MABCP_SlsItmGrpReg_MC)this).new MA_MABCL0850_Srch01Caller<MABCP_SlsItmGrpReg, MA_MABCL0850_Srch01Bridge>(
					(MABCP_SlsItmGrpReg)this, new MA_MABCL0850_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0850_Srch01]の呼び出し */
	protected void callMA_MABCL0850_Srch01() {
		MCCaller caller = createMA_MABCL0850_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0850_Upd01]のCallerの作成 */
	protected MABCP_SlsItmGrpReg_MC.MA_MABCL0850_Upd01Caller createMA_MABCL0850_Upd01() {
		MABCP_SlsItmGrpReg_MC.MA_MABCL0850_Upd01Caller<MABCP_SlsItmGrpReg, MA_MABCL0850_Upd01Bridge>
		caller = ((MABCP_SlsItmGrpReg_MC)this).new MA_MABCL0850_Upd01Caller<MABCP_SlsItmGrpReg, MA_MABCL0850_Upd01Bridge>(
					(MABCP_SlsItmGrpReg)this, new MA_MABCL0850_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0850_Upd01]の呼び出し */
	protected void callMA_MABCL0850_Upd01() {
		MCCaller caller = createMA_MABCL0850_Upd01();
		caller.exec();
	}
	/** [MA_MABCL0850_Del01]のCallerの作成 */
	protected MABCP_SlsItmGrpReg_MC.MA_MABCL0850_Del01Caller createMA_MABCL0850_Del01() {
		MABCP_SlsItmGrpReg_MC.MA_MABCL0850_Del01Caller<MABCP_SlsItmGrpReg, MA_MABCL0850_Del01Bridge>
		caller = ((MABCP_SlsItmGrpReg_MC)this).new MA_MABCL0850_Del01Caller<MABCP_SlsItmGrpReg, MA_MABCL0850_Del01Bridge>(
					(MABCP_SlsItmGrpReg)this, new MA_MABCL0850_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL0850_Del01]の呼び出し */
	protected void callMA_MABCL0850_Del01() {
		MCCaller caller = createMA_MABCL0850_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0850.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0850.CndR aCndR;
	/** [Tree]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0850.TreeR> aTreeL;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0850.DtlR> aDtlL;
	/** [Lcl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0850.LclR> aLclL;
	/** [LclAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0850.LclR> aLclAllL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP0850.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0850.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0850.MstR createMstR() {
		return mcframe.clientMABC.MABCP0850.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0850.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0850.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0850.CndR createCndR() {
		return mcframe.clientMABC.MABCP0850.CndR.create();
	}

	/**
	 * コピーによってaTreeLを設定します。
	 *
	 * aTreeLのインスタンスは変更されません。
	 *
	 * @param dataset TreeL
	 */
	public void setTreeL(MCList<mcframe.clientMABC.MABCP0850.TreeR> aList) {
		if (getTreeL() != aList) {
			getTreeL().setAll(aList);
		}
	}

	/**
	 * [Tree]ブロックのコンテナaTreeLを返します。
	 *
	 * @return TreeL
	 */
	public MCList<mcframe.clientMABC.MABCP0850.TreeR> getTreeL() {
		return aTreeL;
	}

	/**
	 * aTreeRを作成します。
	 *
	 * @return TreeR
	 */
	public mcframe.clientMABC.MABCP0850.TreeR createTreeR() {
		return mcframe.clientMABC.MABCP0850.TreeR.create();
	}

	/**
	 * aTreeLを作成します。
	 *
	 * @return TreeL
	 */
	public MCList<mcframe.clientMABC.MABCP0850.TreeR> createTreeL() {
		return MCList.create(mcframe.clientMABC.MABCP0850.TreeR.class);
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0850.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0850.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0850.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0850.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0850.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0850.DtlR.class);
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
	public void setLclL(MCList<mcframe.clientMABC.MABCP0850.LclR> aList) {
		if (getLclL() != aList) {
			getLclL().setAll(aList);
		}
	}

	/**
	 * [Lcl]ブロックのコンテナaLclLを返します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0850.LclR> getLclL() {
		return aLclL;
	}

	/**
	 * aLclRを作成します。
	 *
	 * @return LclR
	 */
	public mcframe.clientMABC.MABCP0850.LclR createLclR() {
		return mcframe.clientMABC.MABCP0850.LclR.create();
	}

	/**
	 * aLclLを作成します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0850.LclR> createLclL() {
		return MCList.create(mcframe.clientMABC.MABCP0850.LclR.class);
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
	public void setLclAllL(MCList<mcframe.clientMABC.MABCP0850.LclR> aList) {
		if (getLclAllL() != aList) {
			getLclAllL().setAll(aList);
		}
	}

	/**
	 * [LclAll]ブロックのコンテナaLclAllLを返します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0850.LclR> getLclAllL() {
		return aLclAllL;
	}

	/**
	 * aLclAllRを作成します。
	 *
	 * @return LclAllR
	 */
	public mcframe.clientMABC.MABCP0850.LclR createLclAllR() {
		return mcframe.clientMABC.MABCP0850.LclR.create();
	}

	/**
	 * aLclAllLを作成します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0850.LclR> createLclAllL() {
		return MCList.create(mcframe.clientMABC.MABCP0850.LclR.class);
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
		if(!MCCollectionUtil.contains(ret, getTreeL())) ret.add(getTreeL());
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
		if(aCnt == getTreeL()) return "Tree";
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
		if(bId.equals("Tree")) return getTreeL();
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
		ret.add(CndPnlPanel);
		ret.add(CndPanel);
		ret.add(SrchBtnPanel);
		ret.add(WrkPanel);
		ret.add(TreePnlPanel);
		ret.add(TreePanel);
		ret.add(TreeBtnPanel);
		ret.add(DtlPnlPanel);
		ret.add(DtlPanel);
		ret.add(Btn1Panel);
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
	public MABCP_SlsItmGrpReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aTreeL = createTreeL();
		aDtlL = createDtlL();
		aLclL = createLclL();
		aLclAllL = createLclAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_SlsItmGrpReg_MC_A(String name) {
		aMstR = createMstR();
		aCndR = createCndR();
		aTreeL = createTreeL();
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
		MABCP_SlsItmGrpReg_MC.jbCreateScreenOpe((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbCreateMst((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbCreateCndPnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbCreateCnd((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbCreateSrchBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbCreateWrk((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbCreateTreePnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbCreateTree((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbCreateTreeBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbCreateDtlPnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbCreateDtl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbCreateBtn1((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbCreateLclWrk((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbCreateLcl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbCreateLclBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbCreateBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbCreateEastBtn((MABCP_SlsItmGrpReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_SlsItmGrpReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_SlsItmGrpReg p) {
	}

	/**
	 * [CndPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCndPnl(MABCP_SlsItmGrpReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_SlsItmGrpReg p) {
	}

	/**
	 * [SrchBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn(MABCP_SlsItmGrpReg p) {
	}

	/**
	 * [Wrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk(MABCP_SlsItmGrpReg p) {
	}

	/**
	 * [TreePnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTreePnl(MABCP_SlsItmGrpReg p) {
	}

	/**
	 * [Tree]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTree(MABCP_SlsItmGrpReg p) {
	}

	/**
	 * [TreeBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTreeBtn(MABCP_SlsItmGrpReg p) {
	}

	/**
	 * [DtlPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlPnl(MABCP_SlsItmGrpReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_SlsItmGrpReg p) {
	}

	/**
	 * [Btn1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn1(MABCP_SlsItmGrpReg p) {
	}

	/**
	 * [LclWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclWrk(MABCP_SlsItmGrpReg p) {
	}

	/**
	 * [Lcl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLcl(MABCP_SlsItmGrpReg p) {
	}

	/**
	 * [LclBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtn(MABCP_SlsItmGrpReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_SlsItmGrpReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_SlsItmGrpReg p) {
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

	
	/** [Cnd_sls_itm_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sls_itm_grp_cd_p = null;

	/**
	 * [Cnd_sls_itm_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_itm_grp_cd_ListPutter() {
		if (Cnd_sls_itm_grp_cd_p == null) {
			Cnd_sls_itm_grp_cd_p = createCnd_sls_itm_grp_cd_ListPutter(Cnd_sls_itm_grp_cd, "sls_itm_grp_cd", "sls_itm_grp_nm");

		}
		return Cnd_sls_itm_grp_cd_p;
	}
	
	
	/** [Dtl_up_sls_itm_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_up_sls_itm_grp_cd_p = null;

	/**
	 * [Dtl_up_sls_itm_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_up_sls_itm_grp_cd_ListPutter() {
		if (Dtl_up_sls_itm_grp_cd_p == null) {
			Dtl_up_sls_itm_grp_cd_p = createDtl_up_sls_itm_grp_cd_ListPutter(columnDtl_up_sls_itm_grp_cd, "up_sls_itm_grp_cd", "up_sls_itm_grp_nm");

		}
		return Dtl_up_sls_itm_grp_cd_p;
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
	public static MABCP_SlsItmGrpReg create(){
		MABCP_SlsItmGrpReg p = new MABCP_SlsItmGrpReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_SlsItmGrpReg create(String name){
		MABCP_SlsItmGrpReg p = new MABCP_SlsItmGrpReg(name);
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
		MABCP_SlsItmGrpReg_MC.jbfInitScreenOpe((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbfInitMst((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbfInitCndPnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbfInitCnd((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbfInitSrchBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbfInitWrk((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbfInitTreePnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbfInitTree((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbfInitTreeBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbfInitDtlPnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbfInitDtl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbfInitBtn1((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbfInitLclWrk((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbfInitLcl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbfInitLclBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbfInitBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbfInitEastBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbInitScreenOpe((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbInitMst((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbInitCndPnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbInitCnd((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbInitSrchBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbInitWrk((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbInitTreePnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbInitTree((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbInitTreeBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbInitDtlPnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbInitDtl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbInitBtn1((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbInitLclWrk((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbInitLcl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbInitLclBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbInitBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.jbInitEastBtn((MABCP_SlsItmGrpReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.MstPanel = p.beansFactory.createPanel("Mst");
		// ブロックの項目の初期化
		p.Mst_mst_set_typ_nm_Label = p.beansFactory.createLabel("Mst.mst_set_typ_nm_Label");
		p.Mst_mst_set_typ_nm = p.beansFactory.createTextField("Mst.mst_set_typ_nm");
		p.Mst_mst_set_typ_nm.setLabel(p.Mst_mst_set_typ_nm_Label);
	}

	/**
	 * [CndPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCndPnl(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.CndPnlPanel = p.beansFactory.createPanel("CndPnl");
		p.CndPnlTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_sls_itm_grp_cd_Label = p.beansFactory.createLabel("Cnd.sls_itm_grp_cd_Label");
		p.Cnd_sls_itm_grp_cd = p.beansFactory.createTextComboBox("Cnd.sls_itm_grp_cd");
		p.Cnd_sls_itm_grp_cd.setLabel(p.Cnd_sls_itm_grp_cd_Label);
		p.Cnd_sls_itm_grp_nm = p.beansFactory.createTextField("Cnd.sls_itm_grp_nm");
		p.Cnd_del_flg = p.beansFactory.createCheckBox("Cnd.del_flg");
		p.Cnd_sls_itm_grp_lvl = p.beansFactory.createNumberField("Cnd.sls_itm_grp_lvl");
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.SrchBtnPanel = p.beansFactory.createPanel("SrchBtn");
		// ブロックの項目の初期化
		p.SrchBtn_srch = p.beansFactory.createButton("SrchBtn.srch", "srch");
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.WrkPanel = p.beansFactory.createPanel("Wrk");
		// ブロックの項目の初期化
	}

	/**
	 * [TreePnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTreePnl(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.TreePnlPanel = p.beansFactory.createPanel("TreePnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tree]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTree(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.TreePanel = p.beansFactory.createPanel("Tree");
		p.TreeScrollPane = p.beansFactory.createScrollPane("Tree.scroll");
		p.TreeTree = p.beansFactory.createDandDTree("Tree.tree");
		((MCTree64)p.TreeTree).delegate64 = getTreeDelegate();
		// ブロックの項目の初期化
	}

	protected static MCTree64Delegate getTreeDelegate() {
		return new mcframe.clientCore.beans.tree.MCTree64DefaultDelegate();
	}

	/**
	 * [TreeBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTreeBtn(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.TreeBtnPanel = p.beansFactory.createPanel("TreeBtn");
		// ブロックの項目の初期化
		p.TreeBtn_view = p.beansFactory.createButton("TreeBtn.view");
		p.TreeBtn_expand = p.beansFactory.createButton("TreeBtn.expand");
		p.TreeBtn_collapse = p.beansFactory.createButton("TreeBtn.collapse");
	}

	/**
	 * [DtlPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlPnl(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.DtlPnlPanel = p.beansFactory.createPanel("DtlPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_sls_itm_grp_cd = p.beansFactory.createTableColumn("Dtl.sls_itm_grp_cd", MCColumnType.TEXT);
		p.columnDtl_sls_itm_grp_nm_lcl = p.beansFactory.createTableColumn("Dtl.sls_itm_grp_nm_lcl", MCColumnType.TEXT);
		p.columnDtl_sls_itm_grp_nm = p.beansFactory.createTableColumn("Dtl.sls_itm_grp_nm", MCColumnType.TEXT);
		p.columnDtl_sls_itm_grp_lvl = p.beansFactory.createTableColumn("Dtl.sls_itm_grp_lvl", MCColumnType.NUMBER);
		p.columnDtl_up_sls_itm_grp_cd = p.beansFactory.createTableColumn("Dtl.up_sls_itm_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_up_sls_itm_grp_nm = p.beansFactory.createTableColumn("Dtl.up_sls_itm_grp_nm", MCColumnType.TEXT);
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
	 * [Btn1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn1(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.Btn1Panel = p.beansFactory.createPanel("Btn1");
		// ブロックの項目の初期化
		p.Btn1_select_all = p.beansFactory.createButton("Btn1.select_all", "no_border");
		p.Btn1_deselect_all = p.beansFactory.createButton("Btn1.deselect_all", "no_border");
		p.Btn1_add_top = p.beansFactory.createButton("Btn1.add_top");
		p.Btn1_add_sub = p.beansFactory.createButton("Btn1.add_sub");
		p.Btn1_rcopy = p.beansFactory.createButton("Btn1.rcopy");
		p.Btn1_del_rec = p.beansFactory.createButton("Btn1.del_rec");
		p.Btn1_can_del = p.beansFactory.createButton("Btn1.can_del");
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclWrk(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.LclWrkPanel = p.beansFactory.createPanel("LclWrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLcl(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.LclPanel = p.beansFactory.createPanel("Lcl");
		p.LclScrollPane = p.beansFactory.createScrollPane("Lcl.scroll");
		p.createLclTable();
		// ブロックの項目の初期化
		p.columnLcl_check = p.beansFactory.createTableColumn("Lcl.check", MCColumnType.CHECK);
		p.columnLcl_sls_itm_grp_cd = p.beansFactory.createTableColumn("Lcl.sls_itm_grp_cd", MCColumnType.TEXT);
		p.columnLcl_lcl_cd = p.beansFactory.createTableColumn("Lcl.lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnLcl_lcl_nm = p.beansFactory.createTableColumn("Lcl.lcl_nm", MCColumnType.TEXT);
		p.columnLcl_sls_itm_grp_nm = p.beansFactory.createTableColumn("Lcl.sls_itm_grp_nm", MCColumnType.TEXT);
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
	protected static void jbfInitLclBtn(MABCP_SlsItmGrpReg p) {
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
	protected static void jbfInitBtn(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_SlsItmGrpReg p) {
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
	protected static void jbInitMst(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.CndPnlPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP0850.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [CndPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCndPnl(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.CndPnlPanel.setBorder(p.CndPnlTitledBorder);
		p.add(p.CndPnlPanel);
		p.CndPnlPanel.setNextBeans(p.WrkPanel);
		p.CndPnlPanel.setLayoutPosition("NS+");
		// ブロックの項目の初期化
		p.CndPnlPanel.add(p.CndPanel, null);
		p.CndPnlPanel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.SrchBtnPanel);
		p.CndPnlPanel.add(p.SrchBtnPanel, null);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("W");
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0850.CndR.ope_META);
		p.Cnd_sls_itm_grp_cd.setListType(MCListType.STRICT);
		p.Cnd_sls_itm_grp_cd.setLinkBeans(p.Cnd_sls_itm_grp_nm);
		p.CndPanel.add(p.Cnd_sls_itm_grp_cd_Label);
		p.CndPanel.add(p.Cnd_sls_itm_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_sls_itm_grp_cd);
		p.Cnd_sls_itm_grp_cd.setNextBeans(p.Cnd_sls_itm_grp_nm);
		p.Cnd_sls_itm_grp_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0850.CndR.sls_itm_grp_cd_META);
		p.CndPanel.add(p.Cnd_sls_itm_grp_nm);
		p.Cnd_sls_itm_grp_nm.setNextBeans(p.Cnd_del_flg);
		p.Cnd_sls_itm_grp_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0850.CndR.sls_itm_grp_nm_META);
		p.CndPanel.add(p.Cnd_del_flg);
		p.Cnd_del_flg.setNextBeans(p.Cnd_sls_itm_grp_lvl);
		p.Cnd_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0850.CndR.del_flg_META);
		p.CndPanel.add(p.Cnd_sls_itm_grp_lvl);
		p.Cnd_sls_itm_grp_lvl.setRow(p.getCndR(), mcframe.clientMABC.MABCP0850.CndR.sls_itm_grp_lvl_META);
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.SrchBtnPanel.setLayoutPosition("E");
		// ブロックの項目の初期化
		p.SrchBtn_srch.setIcon("SEARCH");
		p.SrchBtn_srch.setFunctionKey(MCFunctionKey.F1);
		p.SrchBtnPanel.add(p.SrchBtn_srch);
		p.SrchBtnPanel.setLastBeans(p.SrchBtn_srch);
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.add(p.WrkPanel);
		p.WrkPanel.setNextBeans(p.LclWrkPanel);
		p.WrkPanel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.WrkPanel.add(p.TreePnlPanel, null);
		p.WrkPanel.setLastBeans(p.TreePnlPanel);
		p.TreePnlPanel.setNextBeans(p.DtlPnlPanel);
		p.WrkPanel.add(p.DtlPnlPanel, null);
	}

	/**
	 * [TreePnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTreePnl(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.TreePnlPanel.setLayoutPosition("CLC+");
		// ブロックの項目の初期化
		p.TreePnlPanel.add(p.TreePanel, null);
		p.TreePnlPanel.setLastBeans(p.TreePanel);
		p.TreePanel.setNextBeans(p.TreeBtnPanel);
		p.TreePnlPanel.add(p.TreeBtnPanel, null);
	}

	/**
	 * [Tree]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTree(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.TreePanel.add(p.TreeScrollPane);
		p.TreePanel.setLastBeans(p.TreeTree);
		p.TreeScrollPane.setViewportView(p.TreeTree);
		p.TreeTree.setList(p.getTreeL());
		p.TreePanel.setValueCheck(false);
		p.TreePanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [TreeBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTreeBtn(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.TreeBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.TreeBtnPanel.add(p.TreeBtn_view);
		p.TreeBtnPanel.setLastBeans(p.TreeBtn_view);
		p.TreeBtn_view.setNextBeans(p.TreeBtn_expand);
		p.TreeBtnPanel.add(p.TreeBtn_expand);
		p.TreeBtn_expand.setNextBeans(p.TreeBtn_collapse);
		p.TreeBtnPanel.add(p.TreeBtn_collapse);
	}

	/**
	 * [DtlPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlPnl(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.DtlPnlPanel.setLayoutPosition("CRC+");
		// ブロックの項目の初期化
		p.DtlPnlPanel.add(p.DtlPanel, null);
		p.DtlPnlPanel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.Btn1Panel);
		p.DtlPnlPanel.add(p.Btn1Panel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn1(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.Btn1Panel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn1_select_all.setIcon("SELECT_ALL");
		p.Btn1_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Btn1Panel.add(p.Btn1_select_all);
		p.Btn1Panel.setLastBeans(p.Btn1_select_all);
		p.Btn1_select_all.setNextBeans(p.Btn1_deselect_all);
		p.Btn1_deselect_all.setIcon("DESELECT_ALL");
		p.Btn1_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Btn1Panel.add(p.Btn1_deselect_all);
		p.Btn1_deselect_all.setNextBeans(p.Btn1_add_top);
		p.Btn1_add_top.setFunctionKey(MCFunctionKey.F3);
		p.Btn1Panel.add(p.Btn1_add_top);
		p.Btn1_add_top.setNextBeans(p.Btn1_add_sub);
		p.Btn1_add_sub.setFunctionKey(MCFunctionKey.F4);
		p.Btn1Panel.add(p.Btn1_add_sub);
		p.Btn1_add_sub.setNextBeans(p.Btn1_rcopy);
		p.Btn1_rcopy.setFunctionKey(MCFunctionKey.F5);
		p.Btn1Panel.add(p.Btn1_rcopy);
		p.Btn1_rcopy.setNextBeans(p.Btn1_del_rec);
		p.Btn1_del_rec.setFunctionKey(MCFunctionKey.F6);
		p.Btn1Panel.add(p.Btn1_del_rec);
		p.Btn1_del_rec.setNextBeans(p.Btn1_can_del);
		p.Btn1_can_del.setFunctionKey(MCFunctionKey.F15);
		p.Btn1Panel.add(p.Btn1_can_del);
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclWrk(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.add(p.LclWrkPanel);
		p.LclWrkPanel.setNextBeans(p.BtnPanel);
		p.LclWrkPanel.setLayoutPosition("CBC+");
		// ブロックの項目の初期化
		p.LclWrkPanel.add(p.LclPanel, null);
		p.LclWrkPanel.setLastBeans(p.LclPanel);
		p.LclPanel.setNextBeans(p.LclBtnPanel);
		p.LclWrkPanel.add(p.LclBtnPanel, null);
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLcl(MABCP_SlsItmGrpReg p) {
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
	protected static void jbInitLclBtn(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.LclBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.LclBtn_select_all.setIcon("SELECT_ALL");
		p.LclBtn_select_all.setFunctionKey(MCFunctionKey.F18);
		p.LclBtnPanel.add(p.LclBtn_select_all);
		p.LclBtnPanel.setLastBeans(p.LclBtn_select_all);
		p.LclBtn_select_all.setNextBeans(p.LclBtn_deselect_all);
		p.LclBtn_deselect_all.setIcon("DESELECT_ALL");
		p.LclBtn_deselect_all.setFunctionKey(MCFunctionKey.F19);
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
		p.LclBtn_rcopy.setFunctionKey(MCFunctionKey.F20);
		p.LclBtnPanel.add(p.LclBtn_rcopy);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_SlsItmGrpReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.BtnPanel.setLastBeans(p.Btn_upd);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABCP_SlsItmGrpReg p) {
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
		MABCP_SlsItmGrpReg_MC.mcInitScreenOpe((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.mcInitMst((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.mcInitCndPnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.mcInitCnd((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.mcInitSrchBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.mcInitWrk((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.mcInitTreePnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.mcInitTree((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.mcInitTreeBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.mcInitDtlPnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.mcInitDtl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.mcInitBtn1((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.mcInitLclWrk((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.mcInitLcl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.mcInitLclBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.mcInitBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.mcInitEastBtn((MABCP_SlsItmGrpReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_SlsItmGrpReg_MC.statusInitFIX_ScreenOpe((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitFIX_Mst((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitFIX_CndPnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitFIX_Cnd((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitFIX_SrchBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitFIX_Wrk((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitFIX_TreePnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitFIX_Tree((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitFIX_TreeBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitFIX_DtlPnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitFIX_Dtl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitFIX_Btn1((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitFIX_LclWrk((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitFIX_Lcl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitFIX_LclAll((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitFIX_LclBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitFIX_Btn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitFIX_EastBtn((MABCP_SlsItmGrpReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_SlsItmGrpReg_MC.statusInitUPD_ScreenOpe((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitUPD_Mst((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitUPD_CndPnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitUPD_Cnd((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitUPD_SrchBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitUPD_Wrk((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitUPD_TreePnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitUPD_Tree((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitUPD_TreeBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitUPD_DtlPnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitUPD_Dtl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitUPD_Btn1((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitUPD_LclWrk((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitUPD_Lcl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitUPD_LclAll((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitUPD_LclBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitUPD_Btn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitUPD_EastBtn((MABCP_SlsItmGrpReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_SlsItmGrpReg_MC.statusInitDEL_ScreenOpe((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitDEL_Mst((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitDEL_CndPnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitDEL_Cnd((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitDEL_SrchBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitDEL_Wrk((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitDEL_TreePnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitDEL_Tree((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitDEL_TreeBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitDEL_DtlPnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitDEL_Dtl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitDEL_Btn1((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitDEL_LclWrk((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitDEL_Lcl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitDEL_LclAll((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitDEL_LclBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitDEL_Btn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitDEL_EastBtn((MABCP_SlsItmGrpReg)this);

		// [REF]ステータスのモードの設定
		MABCP_SlsItmGrpReg_MC.statusInitREF_ScreenOpe((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitREF_Mst((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitREF_CndPnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitREF_Cnd((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitREF_SrchBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitREF_Wrk((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitREF_TreePnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitREF_Tree((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitREF_TreeBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitREF_DtlPnl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitREF_Dtl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitREF_Btn1((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitREF_LclWrk((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitREF_Lcl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitREF_LclAll((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitREF_LclBtn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitREF_Btn((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.statusInitREF_EastBtn((MABCP_SlsItmGrpReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_SlsItmGrpReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_SlsItmGrpReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [CndPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCndPnl(MABCP_SlsItmGrpReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_SlsItmGrpReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_sls_itm_grp_cd.setListListener(p);
		p.Cnd_sls_itm_grp_cd.addAllListener(p);
		p.Cnd_sls_itm_grp_nm.setListListener(p);
		p.Cnd_sls_itm_grp_nm.addAllListener(p);
		p.Cnd_del_flg.addAllListener(p);
		p.Cnd_sls_itm_grp_lvl.setListListener(p);
		p.Cnd_sls_itm_grp_lvl.addAllListener(p);
	}

	/**
	 *  [SrchBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn(MABCP_SlsItmGrpReg p) {
		p.SrchBtn_srch.addAllListener(p);
		p.SrchBtn_srch.setAPMethodName("doSrchBtn_srch");
	}

	/**
	 *  [Wrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk(MABCP_SlsItmGrpReg p) {
	}

	/**
	 *  [TreePnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTreePnl(MABCP_SlsItmGrpReg p) {
	}

	/**
	 *  [Tree]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTree(MABCP_SlsItmGrpReg p) {
		p.TreeTree.addAllListener(p);
	}

	/**
	 *  [TreeBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTreeBtn(MABCP_SlsItmGrpReg p) {
		p.TreeBtn_view.addAllListener(p);
		p.TreeBtn_view.setAPMethodName("doTreeBtn_view");
		p.TreeBtn_expand.addAllListener(p);
		p.TreeBtn_expand.setAPMethodName("doTreeBtn_expand");
		p.TreeBtn_collapse.addAllListener(p);
		p.TreeBtn_collapse.setAPMethodName("doTreeBtn_collapse");
	}

	/**
	 *  [DtlPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlPnl(MABCP_SlsItmGrpReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_SlsItmGrpReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_sls_itm_grp_cd.addAllListener(p);
		p.columnDtl_sls_itm_grp_cd.setListListener(p);
		p.columnDtl_sls_itm_grp_nm_lcl.addAllListener(p);
		p.columnDtl_sls_itm_grp_nm_lcl.setListListener(p);
		p.columnDtl_sls_itm_grp_nm.addAllListener(p);
		p.columnDtl_sls_itm_grp_nm.setListListener(p);
		p.columnDtl_sls_itm_grp_lvl.addAllListener(p);
		p.columnDtl_sls_itm_grp_lvl.setListListener(p);
		p.columnDtl_up_sls_itm_grp_cd.addAllListener(p);
		p.columnDtl_up_sls_itm_grp_cd.setListListener(p);
		p.columnDtl_up_sls_itm_grp_nm.addAllListener(p);
		p.columnDtl_up_sls_itm_grp_nm.setListListener(p);
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
	 *  [Btn1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn1(MABCP_SlsItmGrpReg p) {
		p.Btn1_select_all.addAllListener(p);
		p.Btn1_select_all.setAPMethodName("doBtn1_select_all");
		p.Btn1_deselect_all.addAllListener(p);
		p.Btn1_deselect_all.setAPMethodName("doBtn1_deselect_all");
		p.Btn1_add_top.addAllListener(p);
		p.Btn1_add_top.setAPMethodName("doBtn1_add_top");
		p.Btn1_add_sub.addAllListener(p);
		p.Btn1_add_sub.setAPMethodName("doBtn1_add_sub");
		p.Btn1_rcopy.addAllListener(p);
		p.Btn1_rcopy.setAPMethodName("doBtn1_rcopy");
		p.Btn1_del_rec.addAllListener(p);
		p.Btn1_del_rec.setAPMethodName("doBtn1_del_rec");
		p.Btn1_can_del.addAllListener(p);
		p.Btn1_can_del.setAPMethodName("doBtn1_can_del");
	}

	/**
	 *  [LclWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclWrk(MABCP_SlsItmGrpReg p) {
	}

	/**
	 *  [Lcl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLcl(MABCP_SlsItmGrpReg p) {
		p.LclTable.addAllListener(p);
		p.columnLcl_check.addAllListener(p);
		p.columnLcl_sls_itm_grp_cd.addAllListener(p);
		p.columnLcl_sls_itm_grp_cd.setListListener(p);
		p.columnLcl_lcl_cd.addAllListener(p);
		p.columnLcl_lcl_cd.setListListener(p);
		p.columnLcl_lcl_nm.addAllListener(p);
		p.columnLcl_lcl_nm.setListListener(p);
		p.columnLcl_sls_itm_grp_nm.addAllListener(p);
		p.columnLcl_sls_itm_grp_nm.setListListener(p);
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
	protected static void mcInitLclBtn(MABCP_SlsItmGrpReg p) {
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
	protected static void mcInitBtn(MABCP_SlsItmGrpReg p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_SlsItmGrpReg p) {
	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_SlsItmGrpReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[CndPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_CndPnl(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_SlsItmGrpReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_sls_itm_grp_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_del_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_sls_itm_grp_lvl.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_SrchBtn(MABCP_SlsItmGrpReg p){
		p.SrchBtn_srch.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [FIX]ステータスの[TreePnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_TreePnl(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [FIX]ステータスの[Tree]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tree(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [FIX]ステータスの[TreeBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_TreeBtn(MABCP_SlsItmGrpReg p){
		p.TreeBtn_view.putMode(p, FIX, MCMode.DISABLE);
		p.TreeBtn_expand.putMode(p, FIX, MCMode.DISABLE);
		p.TreeBtn_collapse.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[DtlPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlPnl(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_SlsItmGrpReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_nm_lcl.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_lvl.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_up_sls_itm_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_up_sls_itm_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
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
	 * [FIX]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn1(MABCP_SlsItmGrpReg p){
		p.Btn1_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn1_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn1_add_top.putMode(p, FIX, MCMode.DISABLE);
		p.Btn1_add_sub.putMode(p, FIX, MCMode.DISABLE);
		p.Btn1_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.Btn1_del_rec.putMode(p, FIX, MCMode.DISABLE);
		p.Btn1_can_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclWrk(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [FIX]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Lcl(MABCP_SlsItmGrpReg p){
		p.columnLcl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_sls_itm_grp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_sls_itm_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclAll(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [FIX]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclBtn(MABCP_SlsItmGrpReg p){
		p.LclBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_SlsItmGrpReg p){
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_SlsItmGrpReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[CndPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CndPnl(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_SlsItmGrpReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sls_itm_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sls_itm_grp_lvl.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SrchBtn(MABCP_SlsItmGrpReg p){
		p.SrchBtn_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [UPD]ステータスの[TreePnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TreePnl(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [UPD]ステータスの[Tree]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tree(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [UPD]ステータスの[TreeBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TreeBtn(MABCP_SlsItmGrpReg p){
		p.TreeBtn_view.putMode(p, UPD, MCMode.ENABLE);
		p.TreeBtn_expand.putMode(p, UPD, MCMode.ENABLE);
		p.TreeBtn_collapse.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[DtlPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlPnl(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_SlsItmGrpReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sls_itm_grp_nm_lcl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sls_itm_grp_lvl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_up_sls_itm_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_up_sls_itm_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
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
	 * [UPD]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn1(MABCP_SlsItmGrpReg p){
		p.Btn1_select_all.putMode(p, UPD, MCMode.DISABLE);
		p.Btn1_deselect_all.putMode(p, UPD, MCMode.DISABLE);
		p.Btn1_add_top.putMode(p, UPD, MCMode.ENABLE);
		p.Btn1_add_sub.putMode(p, UPD, MCMode.ENABLE);
		p.Btn1_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn1_del_rec.putMode(p, UPD, MCMode.ENABLE);
		p.Btn1_can_del.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclWrk(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [UPD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Lcl(MABCP_SlsItmGrpReg p){
		p.columnLcl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_sls_itm_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_sls_itm_grp_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo3.putMode(p, UPD, MCMode.ENABLE);
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
	protected static void statusInitUPD_LclAll(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [UPD]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclBtn(MABCP_SlsItmGrpReg p){
		p.LclBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_SlsItmGrpReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABCP_SlsItmGrpReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[CndPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CndPnl(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_SlsItmGrpReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_sls_itm_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_sls_itm_grp_lvl.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SrchBtn(MABCP_SlsItmGrpReg p){
		p.SrchBtn_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Wrk(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [DEL]ステータスの[TreePnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_TreePnl(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [DEL]ステータスの[Tree]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tree(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [DEL]ステータスの[TreeBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_TreeBtn(MABCP_SlsItmGrpReg p){
		p.TreeBtn_view.putMode(p, DEL, MCMode.ENABLE);
		p.TreeBtn_expand.putMode(p, DEL, MCMode.ENABLE);
		p.TreeBtn_collapse.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[DtlPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlPnl(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_SlsItmGrpReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_nm_lcl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_lvl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_up_sls_itm_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_up_sls_itm_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
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
	 * [DEL]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn1(MABCP_SlsItmGrpReg p){
		p.Btn1_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn1_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn1_add_top.putMode(p, DEL, MCMode.DISABLE);
		p.Btn1_add_sub.putMode(p, DEL, MCMode.DISABLE);
		p.Btn1_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn1_del_rec.putMode(p, DEL, MCMode.DISABLE);
		p.Btn1_can_del.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclWrk(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [DEL]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Lcl(MABCP_SlsItmGrpReg p){
		p.columnLcl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_sls_itm_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_sls_itm_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
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
	protected static void statusInitDEL_LclAll(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [DEL]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclBtn(MABCP_SlsItmGrpReg p){
		p.LclBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABCP_SlsItmGrpReg p){
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_SlsItmGrpReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[CndPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndPnl(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_SlsItmGrpReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sls_itm_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_del_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sls_itm_grp_lvl.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_SrchBtn(MABCP_SlsItmGrpReg p){
		p.SrchBtn_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [REF]ステータスの[TreePnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_TreePnl(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [REF]ステータスの[Tree]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tree(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [REF]ステータスの[TreeBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_TreeBtn(MABCP_SlsItmGrpReg p){
		p.TreeBtn_view.putMode(p, REF, MCMode.ENABLE);
		p.TreeBtn_expand.putMode(p, REF, MCMode.ENABLE);
		p.TreeBtn_collapse.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[DtlPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlPnl(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_SlsItmGrpReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_nm_lcl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_lvl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_up_sls_itm_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_up_sls_itm_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
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
	 * [REF]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn1(MABCP_SlsItmGrpReg p){
		p.Btn1_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn1_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn1_add_top.putMode(p, REF, MCMode.DISABLE);
		p.Btn1_add_sub.putMode(p, REF, MCMode.DISABLE);
		p.Btn1_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn1_del_rec.putMode(p, REF, MCMode.DISABLE);
		p.Btn1_can_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclWrk(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [REF]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Lcl(MABCP_SlsItmGrpReg p){
		p.columnLcl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_sls_itm_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_sls_itm_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_LclAll(MABCP_SlsItmGrpReg p){

	}

	/**
	 * [REF]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclBtn(MABCP_SlsItmGrpReg p){
		p.LclBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_SlsItmGrpReg p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_SlsItmGrpReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return FIX;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MABCP_SlsItmGrpReg_MC.setTableConfigTree((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.setTableConfigDtl((MABCP_SlsItmGrpReg)this);
		MABCP_SlsItmGrpReg_MC.setTableConfigLcl((MABCP_SlsItmGrpReg)this);
	}

	/**
	 * [Tree]ブロックのTreeの設定
	 */
	protected static void setTableConfigTree(MABCP_SlsItmGrpReg p) {
		p.TreeTree.setKeyColumnName("tree_up_sls_itm_grp_cd", "tree_sls_itm_grp_cd", "tree_row_label");
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_SlsItmGrpReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0850.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP0850.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_sls_itm_grp_cd.setMeta(mcframe.clientMABC.MABCP0850.DtlR.sls_itm_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_itm_grp_cd);
		p.columnDtl_sls_itm_grp_nm_lcl.setMeta(mcframe.clientMABC.MABCP0850.DtlR.sls_itm_grp_nm_lcl_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_itm_grp_nm_lcl);
		p.columnDtl_sls_itm_grp_nm.setMeta(mcframe.clientMABC.MABCP0850.DtlR.sls_itm_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_itm_grp_nm);
		p.columnDtl_sls_itm_grp_lvl.setMeta(mcframe.clientMABC.MABCP0850.DtlR.sls_itm_grp_lvl_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_itm_grp_lvl);
		p.columnDtl_up_sls_itm_grp_cd.setMeta(mcframe.clientMABC.MABCP0850.DtlR.up_sls_itm_grp_cd_META);
		p.columnDtl_up_sls_itm_grp_cd.addLinkBeans(p.columnDtl_up_sls_itm_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_up_sls_itm_grp_cd);
		p.columnDtl_up_sls_itm_grp_nm.setMeta(mcframe.clientMABC.MABCP0850.DtlR.up_sls_itm_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_up_sls_itm_grp_nm);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP0850.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP0850.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP0850.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0850.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0850.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0850.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0850.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0850.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0850.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0850.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0850.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0850.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0850.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0850.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0850.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0850.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0850.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP0850.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * [Lcl]ブロックのTableの設定
	 */
	protected static void setTableConfigLcl(MABCP_SlsItmGrpReg p) {
		p.columnLcl_check.setMeta(mcframe.clientMABC.MABCP0850.LclR.check_META);
		p.LclTable.addColumnConfig(p.columnLcl_check);
		p.columnLcl_sls_itm_grp_cd.setMeta(mcframe.clientMABC.MABCP0850.LclR.sls_itm_grp_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_sls_itm_grp_cd);
		p.columnLcl_lcl_cd.setMeta(mcframe.clientMABC.MABCP0850.LclR.lcl_cd_META);
		p.columnLcl_lcl_cd.addLinkBeans(p.columnLcl_lcl_nm);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_cd);
		p.columnLcl_lcl_nm.setMeta(mcframe.clientMABC.MABCP0850.LclR.lcl_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_nm);
		p.columnLcl_sls_itm_grp_nm.setMeta(mcframe.clientMABC.MABCP0850.LclR.sls_itm_grp_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_sls_itm_grp_nm);
		p.columnLcl_memo1.setMeta(mcframe.clientMABC.MABCP0850.LclR.memo1_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo1);
		p.columnLcl_memo2.setMeta(mcframe.clientMABC.MABCP0850.LclR.memo2_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo2);
		p.columnLcl_memo3.setMeta(mcframe.clientMABC.MABCP0850.LclR.memo3_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo3);
		p.columnLcl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0850.LclR.ins_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_id);
		p.columnLcl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0850.LclR.ins_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_nm);
		p.columnLcl_ins_ts.setMeta(mcframe.clientMABC.MABCP0850.LclR.ins_ts_META);
		p.columnLcl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_ins_ts);
		p.columnLcl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0850.LclR.ins_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_id);
		p.columnLcl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0850.LclR.ins_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_nm);
		p.columnLcl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0850.LclR.upd_cntr_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_cntr);
		p.columnLcl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0850.LclR.upd_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_id);
		p.columnLcl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0850.LclR.upd_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_nm);
		p.columnLcl_upd_ts.setMeta(mcframe.clientMABC.MABCP0850.LclR.upd_ts_META);
		p.columnLcl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_upd_ts);
		p.columnLcl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0850.LclR.upd_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_id);
		p.columnLcl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0850.LclR.upd_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_nm);
		p.columnLcl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0850.LclR.upd_srv_req_no_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.LclTable.setUnscrollColumn(p.columnLcl_lcl_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_sls_itm_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sls_itm_grp_cd.getListConfig().setPutter(getCnd_sls_itm_grp_cd_ListPutter());
		columnDtl_up_sls_itm_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_up_sls_itm_grp_cd.getListConfig().setPutter(getDtl_up_sls_itm_grp_cd_ListPutter());
		columnLcl_lcl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnLcl_lcl_cd.getListConfig().setPutter(getLcl_lcl_cd_ListPutter());
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
		if (FIX.equals(status)) {
			setFIXStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
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
	 * [Cnd_sls_itm_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_itm_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsItmGrpBtm");
		return lp;
	}
	 
	/**
	 * [Dtl_up_sls_itm_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_up_sls_itm_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
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
		if(combo == Cnd_sls_itm_grp_cd) return getCnd_sls_itm_grp_cd(row, info);
		if(combo == columnDtl_up_sls_itm_grp_cd) return getDtl_up_sls_itm_grp_cd(row, info);
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
		if (ap == SrchBtn_srch) doSrchBtn_srch(info);
		else if (ap == TreeBtn_view) doTreeBtn_view(info);
		else if (ap == TreeBtn_expand) doTreeBtn_expand(info);
		else if (ap == TreeBtn_collapse) doTreeBtn_collapse(info);
		else if (ap == Btn1_select_all) doBtn1_select_all(info);
		else if (ap == Btn1_deselect_all) doBtn1_deselect_all(info);
		else if (ap == Btn1_add_top) doBtn1_add_top(info);
		else if (ap == Btn1_add_sub) doBtn1_add_sub(info);
		else if (ap == Btn1_rcopy) doBtn1_rcopy(info);
		else if (ap == Btn1_del_rec) doBtn1_del_rec(info);
		else if (ap == Btn1_can_del) doBtn1_can_del(info);
		else if (ap == LclBtn_select_all) doLclBtn_select_all(info);
		else if (ap == LclBtn_deselect_all) doLclBtn_deselect_all(info);
		else if (ap == LclBtn_radd) doLclBtn_radd(info);
		else if (ap == LclBtn_rdel) doLclBtn_rdel(info);
		else if (ap == LclBtn_rcopy) doLclBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [SrchBtn]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doSrchBtn_srch(MCEventInfo info);

	/**
	 * [TreeBtn]パネルの[view]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doTreeBtn_view(MCEventInfo info);

	/**
	 * [TreeBtn]パネルの[expand]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doTreeBtn_expand(MCEventInfo info);

	/**
	 * [TreeBtn]パネルの[collapse]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doTreeBtn_collapse(MCEventInfo info);

	/**
	 * [Btn1]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn1_select_all(MCEventInfo info);

	/**
	 * [Btn1]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn1_deselect_all(MCEventInfo info);

	/**
	 * [Btn1]パネルの[add_top]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn1_add_top(MCEventInfo info);

	/**
	 * [Btn1]パネルの[add_sub]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn1_add_sub(MCEventInfo info);

	/**
	 * [Btn1]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn1_rcopy(MCEventInfo info);

	/**
	 * [Btn1]パネルの[del_rec]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn1_del_rec(MCEventInfo info);

	/**
	 * [Btn1]パネルの[can_del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn1_can_del(MCEventInfo info);

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
		if (vc == TreeTree) return doTree_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == LclTable) return doLcl_VC(info);
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_sls_itm_grp_cd) return doCnd_sls_itm_grp_cd_VC(info);
		if (vc == Cnd_sls_itm_grp_nm) return doCnd_sls_itm_grp_nm_VC(info);
		if (vc == Cnd_del_flg) return doCnd_del_flg_VC(info);
		if (vc == Cnd_sls_itm_grp_lvl) return doCnd_sls_itm_grp_lvl_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_sls_itm_grp_cd) return doDtl_sls_itm_grp_cd_VC(info);
		if (vc == columnDtl_sls_itm_grp_nm_lcl) return doDtl_sls_itm_grp_nm_lcl_VC(info);
		if (vc == columnDtl_sls_itm_grp_nm) return doDtl_sls_itm_grp_nm_VC(info);
		if (vc == columnDtl_sls_itm_grp_lvl) return doDtl_sls_itm_grp_lvl_VC(info);
		if (vc == columnDtl_up_sls_itm_grp_cd) return doDtl_up_sls_itm_grp_cd_VC(info);
		if (vc == columnDtl_up_sls_itm_grp_nm) return doDtl_up_sls_itm_grp_nm_VC(info);
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
		if (vc == columnLcl_sls_itm_grp_cd) return doLcl_sls_itm_grp_cd_VC(info);
		if (vc == columnLcl_lcl_cd) return doLcl_lcl_cd_VC(info);
		if (vc == columnLcl_lcl_nm) return doLcl_lcl_nm_VC(info);
		if (vc == columnLcl_sls_itm_grp_nm) return doLcl_sls_itm_grp_nm_VC(info);
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
	 * [Tree]Treeの選択ノードが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTree_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_itm_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_itm_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_itm_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_lvl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_itm_grp_lvl_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_itm_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_itm_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_itm_grp_nm_lcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_itm_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_lvl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_itm_grp_lvl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[up_sls_itm_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_up_sls_itm_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[up_sls_itm_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_up_sls_itm_grp_nm_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[sls_itm_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_sls_itm_grp_cd_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[sls_itm_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_sls_itm_grp_nm_VC(MCEventInfo info){
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
		if (nc == TreeTree) doTree_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == LclTable) doLcl_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_sls_itm_grp_cd) doCnd_sls_itm_grp_cd_NC(info);
		else if (nc == Cnd_sls_itm_grp_nm) doCnd_sls_itm_grp_nm_NC(info);
		else if (nc == Cnd_del_flg) doCnd_del_flg_NC(info);
		else if (nc == Cnd_sls_itm_grp_lvl) doCnd_sls_itm_grp_lvl_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_sls_itm_grp_cd) doDtl_sls_itm_grp_cd_NC(info);
		else if (nc == columnDtl_sls_itm_grp_nm_lcl) doDtl_sls_itm_grp_nm_lcl_NC(info);
		else if (nc == columnDtl_sls_itm_grp_nm) doDtl_sls_itm_grp_nm_NC(info);
		else if (nc == columnDtl_sls_itm_grp_lvl) doDtl_sls_itm_grp_lvl_NC(info);
		else if (nc == columnDtl_up_sls_itm_grp_cd) doDtl_up_sls_itm_grp_cd_NC(info);
		else if (nc == columnDtl_up_sls_itm_grp_nm) doDtl_up_sls_itm_grp_nm_NC(info);
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
		else if (nc == columnLcl_sls_itm_grp_cd) doLcl_sls_itm_grp_cd_NC(info);
		else if (nc == columnLcl_lcl_cd) doLcl_lcl_cd_NC(info);
		else if (nc == columnLcl_lcl_nm) doLcl_lcl_nm_NC(info);
		else if (nc == columnLcl_sls_itm_grp_nm) doLcl_sls_itm_grp_nm_NC(info);
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
	 * [Tree]Treeの選択ノードが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTree_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_itm_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_lvl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_lvl_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_itm_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_nm_lcl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_lvl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_lvl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[up_sls_itm_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_up_sls_itm_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[up_sls_itm_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_up_sls_itm_grp_nm_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[sls_itm_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_sls_itm_grp_cd_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[sls_itm_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_sls_itm_grp_nm_NC(MCEventInfo info){
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
		if (ne == TreeTree) doTree_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == LclTable) doLcl_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_sls_itm_grp_cd) doCnd_sls_itm_grp_cd_NE(info);
		else if (ne == Cnd_sls_itm_grp_nm) doCnd_sls_itm_grp_nm_NE(info);
		else if (ne == Cnd_del_flg) doCnd_del_flg_NE(info);
		else if (ne == Cnd_sls_itm_grp_lvl) doCnd_sls_itm_grp_lvl_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_sls_itm_grp_cd) doDtl_sls_itm_grp_cd_NE(info);
		else if (ne == columnDtl_sls_itm_grp_nm_lcl) doDtl_sls_itm_grp_nm_lcl_NE(info);
		else if (ne == columnDtl_sls_itm_grp_nm) doDtl_sls_itm_grp_nm_NE(info);
		else if (ne == columnDtl_sls_itm_grp_lvl) doDtl_sls_itm_grp_lvl_NE(info);
		else if (ne == columnDtl_up_sls_itm_grp_cd) doDtl_up_sls_itm_grp_cd_NE(info);
		else if (ne == columnDtl_up_sls_itm_grp_nm) doDtl_up_sls_itm_grp_nm_NE(info);
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
		else if (ne == columnLcl_sls_itm_grp_cd) doLcl_sls_itm_grp_cd_NE(info);
		else if (ne == columnLcl_lcl_cd) doLcl_lcl_cd_NE(info);
		else if (ne == columnLcl_lcl_nm) doLcl_lcl_nm_NE(info);
		else if (ne == columnLcl_sls_itm_grp_nm) doLcl_sls_itm_grp_nm_NE(info);
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
	 * [Tree]TreeのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTree_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_itm_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_lvl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_lvl_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_itm_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_nm_lcl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_lvl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_lvl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[up_sls_itm_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_up_sls_itm_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[up_sls_itm_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_up_sls_itm_grp_nm_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[sls_itm_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_sls_itm_grp_cd_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[sls_itm_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_sls_itm_grp_nm_NE(MCEventInfo info){
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
		if (nx == TreeTree) doTree_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == LclTable) doLcl_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_sls_itm_grp_cd) doCnd_sls_itm_grp_cd_NX(info);
		else if (nx == Cnd_sls_itm_grp_nm) doCnd_sls_itm_grp_nm_NX(info);
		else if (nx == Cnd_del_flg) doCnd_del_flg_NX(info);
		else if (nx == Cnd_sls_itm_grp_lvl) doCnd_sls_itm_grp_lvl_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_sls_itm_grp_cd) doDtl_sls_itm_grp_cd_NX(info);
		else if (nx == columnDtl_sls_itm_grp_nm_lcl) doDtl_sls_itm_grp_nm_lcl_NX(info);
		else if (nx == columnDtl_sls_itm_grp_nm) doDtl_sls_itm_grp_nm_NX(info);
		else if (nx == columnDtl_sls_itm_grp_lvl) doDtl_sls_itm_grp_lvl_NX(info);
		else if (nx == columnDtl_up_sls_itm_grp_cd) doDtl_up_sls_itm_grp_cd_NX(info);
		else if (nx == columnDtl_up_sls_itm_grp_nm) doDtl_up_sls_itm_grp_nm_NX(info);
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
		else if (nx == columnLcl_sls_itm_grp_cd) doLcl_sls_itm_grp_cd_NX(info);
		else if (nx == columnLcl_lcl_cd) doLcl_lcl_cd_NX(info);
		else if (nx == columnLcl_lcl_nm) doLcl_lcl_nm_NX(info);
		else if (nx == columnLcl_sls_itm_grp_nm) doLcl_sls_itm_grp_nm_NX(info);
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
	 * [Tree]TreeのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTree_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_itm_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_lvl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_lvl_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_itm_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_nm_lcl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_lvl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_lvl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[up_sls_itm_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_up_sls_itm_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[up_sls_itm_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_up_sls_itm_grp_nm_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[sls_itm_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_sls_itm_grp_cd_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[sls_itm_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_sls_itm_grp_nm_NX(MCEventInfo info){
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
		else if (lc == Cnd_sls_itm_grp_cd) doCnd_sls_itm_grp_cd_LC(info);
		else if (lc == Cnd_sls_itm_grp_nm) doCnd_sls_itm_grp_nm_LC(info);
		else if (lc == Cnd_sls_itm_grp_lvl) doCnd_sls_itm_grp_lvl_LC(info);
		else if (lc == columnDtl_sls_itm_grp_cd) doDtl_sls_itm_grp_cd_LC(info);
		else if (lc == columnDtl_sls_itm_grp_nm_lcl) doDtl_sls_itm_grp_nm_lcl_LC(info);
		else if (lc == columnDtl_sls_itm_grp_nm) doDtl_sls_itm_grp_nm_LC(info);
		else if (lc == columnDtl_sls_itm_grp_lvl) doDtl_sls_itm_grp_lvl_LC(info);
		else if (lc == columnDtl_up_sls_itm_grp_cd) doDtl_up_sls_itm_grp_cd_LC(info);
		else if (lc == columnDtl_up_sls_itm_grp_nm) doDtl_up_sls_itm_grp_nm_LC(info);
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
		else if (lc == columnLcl_sls_itm_grp_cd) doLcl_sls_itm_grp_cd_LC(info);
		else if (lc == columnLcl_lcl_cd) doLcl_lcl_cd_LC(info);
		else if (lc == columnLcl_lcl_nm) doLcl_lcl_nm_LC(info);
		else if (lc == columnLcl_sls_itm_grp_nm) doLcl_sls_itm_grp_nm_LC(info);
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
	 * [Cnd]パネルの[sls_itm_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_lvl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_lvl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_lvl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_lvl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[up_sls_itm_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_up_sls_itm_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[up_sls_itm_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_up_sls_itm_grp_nm_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[sls_itm_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_sls_itm_grp_cd_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[sls_itm_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_sls_itm_grp_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_sls_itm_grp_cd]の作成メソッド
	 */
	public MCList getCnd_sls_itm_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsItmGrpBtm(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_up_sls_itm_grp_cd]の作成メソッド
	 */
	public MCList getDtl_up_sls_itm_grp_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnLcl_lcl_cd]の作成メソッド
	 */
	public MCList getLcl_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0850.Srch01")) {
			return new MA_MABCL0850_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0850.Upd01")) {
			return new MA_MABCL0850_Upd01Bridge();
		}
		if (id.equals("MA.MABCL0850.Del01")) {
			return new MA_MABCL0850_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0850_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0850_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0850_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0850_Srch01Bridge() {
			p_MA_MABCL0850_Srch01 = new MCParam(PDef.MA_MABCL0850_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0850_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0850.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0850.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0850.LclR.class));

			p_MA_MABCL0850_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0850_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0850_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0850_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0850_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0850.CndR up0() {
			return (mcframe.clientMABC.MABCP0850.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0850.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0850.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0850.LclR> down1() {
			return (MCList<mcframe.clientMABC.MABCP0850.LclR>)down(1);
		}

		protected void setupDownParam() {
			p_MA_MABCL0850_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0850.DtlR.class));
			p_MA_MABCL0850_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0850.LclR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0850_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0850.DtlR>)p_MA_MABCL0850_Srch01.getContainerParam().getDownBlock(0));
			setLclAllL((MCList<mcframe.clientMABC.MABCP0850.LclR>)p_MA_MABCL0850_Srch01.getContainerParam().getDownBlock(1));
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
	 * [MA_MABCL0850_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0850_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0850_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0850_Upd01Bridge() {
			p_MA_MABCL0850_Upd01 = new MCParam(PDef.MA_MABCL0850_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0850_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0850.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0850.LclR.class));
			// Down

			p_MA_MABCL0850_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0850_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0850_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABCL0850_Upd01.addUpBlock(getLclAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0850_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0850_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0850.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0850.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0850.LclR> up1() {
			return (MCList<mcframe.clientMABC.MABCP0850.LclR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0850_Upd01;
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
	 * [MA_MABCL0850_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0850_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0850_Del01;

		/** コンストラクタ */
		protected MA_MABCL0850_Del01Bridge() {
			p_MA_MABCL0850_Del01 = new MCParam(PDef.MA_MABCL0850_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0850_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0850.DtlR.class));
			// Down

			p_MA_MABCL0850_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0850_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0850_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0850_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0850_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0850.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0850.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0850_Del01;
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