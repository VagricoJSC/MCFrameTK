package mcframe.clientMBBE.MBBEP0060;

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
import mcframe.clientMBBE.MBBEP0060.MBBEP_SrchSQLReg_MC.MB_MBBEL0060_Srch01Caller;
import mcframe.clientMBBE.MBBEP0060.MBBEP_SrchSQLReg_MC.MB_MBBEL0060_Srch02Caller;
import mcframe.clientMBBE.MBBEP0060.MBBEP_SrchSQLReg_MC.MB_MBBEL0060_Ins01Caller;
import mcframe.clientMBBE.MBBEP0060.MBBEP_SrchSQLReg_MC.MB_MBBEL0060_Upd01Caller;
import mcframe.clientMBBE.MBBEP0060.MBBEP_SrchSQLReg_MC.MB_MBBEL0060_Del01Caller;
import mcframe.clientMBBE.MBBEP0060.MBBEP_SrchSQLReg_MC.MB_MBBEL0040_Prnt01Caller;

/**
 * 画面"MBBEP_SrchSQLReg"パネルクラスです。<p>
 *
 * 業務データダウンロード管理データの検索、登録、実行を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBEP_SrchSQLReg_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MBBE";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MBBEP0060";

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
	 * INS,Create,0;UPD,Modify,1;DEL,Cancel,2;REF,View,3; INS,登録する,0;UPD,訂正する,1;DEL,取り消す,2;REF,参照する,3;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_biz_dat_id_Label = null;
	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_biz_dat_id = null;
	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public MCTextField Cnd_biz_dat_nm = null;
	/**
	 * Search 検索.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [RegTab]ブロック関連のField定義
	public MCPanel RegTabPanel = null;
	public MCTabbedPane RegTabTab = null;
	// [RegTab]ブロックの項目のField定義
	// [Reg]ブロック関連のField定義
	public MCPanel RegPanel = null;
	// [Reg]ブロックの項目のField定義
	// [Rem1]ブロック関連のField定義
	public MCPanel Rem1Panel = null;
	// [Rem1]ブロックの項目のField定義
	// [Rem2]ブロック関連のField定義
	public MCPanel Rem2Panel = null;
	// [Rem2]ブロックの項目のField定義
	// [Rem3]ブロック関連のField定義
	public MCPanel Rem3Panel = null;
	// [Rem3]ブロックの項目のField定義
	// [Info]ブロック関連のField定義
	public MCPanel InfoPanel = null;
	// [Info]ブロックの項目のField定義
	// [Report]ブロック関連のField定義
	public MCPanel ReportPanel = null;
	// [Report]ブロックの項目のField定義
	// [Base]ブロック関連のField定義
	public MCPanel BasePanel = null;
	// [Base]ブロックの項目のField定義
	public MCLabel Base_biz_dat_id_Label = null;
	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public MCTextField Base_biz_dat_id = null;
	public MCLabel Base_biz_dat_nm_Label = null;
	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public MCTextField Base_biz_dat_nm = null;
	/**
	 * For administrator 管理者用.<p>
	 *
	 */
	public MCCheckBox Base_admin_flg = null;
	public MCLabel Base_module_id_Label = null;
	/**
	 * Module ID モジュールＩＤ.<p>
	 *
	 */
	public MCTextComboBox Base_module_id = null;
	public MCLabel Base_screen_id_Label = null;
	/**
	 * Screen ID 画面ＩＤ.<p>
	 *
	 */
	public MCTextComboBox Base_screen_id = null;
	public MCLabel Base_func_actyp_Label = null;
	/**
	 * Function type 機能種別.<p>
	 *
	 */
	public MCTextField Base_func_actyp = null;
	public MCScrollPane Base_biz_dat_rmrks1ScrollPane = null;
	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public MCTextArea Base_biz_dat_rmrks1 = null;
	public MCScrollPane Base_biz_dat_rmrks2ScrollPane = null;
	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public MCTextArea Base_biz_dat_rmrks2 = null;
	public MCScrollPane Base_biz_dat_rmrks3ScrollPane = null;
	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public MCTextArea Base_biz_dat_rmrks3 = null;
	public MCLabel Base_form_file_nm_Label = null;
	/**
	 * Report form name 帳票フォーム名.<p>
	 *
	 */
	public MCTextField Base_form_file_nm = null;
	public MCLabel Base_cartridge_Label = null;
	/**
	 * Cartridge カートリッジ.<p>
	 *
	 */
	public MCTextComboBox Base_cartridge = null;
	/**
	 * Cartridge name カートリッジ名.<p>
	 *
	 */
	public MCTextField Base_cartridge_nm = null;
	/**
	 * Enable report output 帳票出力を有効にする.<p>
	 *
	 */
	public MCCheckBox Base_print_flg = null;
	/**
	 * Download report 帳票をダウンロードする.<p>
	 *
	 */
	public MCCheckBox Base_dwnld_flg = null;
	public MCLabel Base_ins_usr_id_Label = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Base_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCTextField Base_ins_usr_nm = null;
	public MCLabel Base_ins_func_id_Label = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCTextField Base_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCTextField Base_ins_func_nm = null;
	public MCLabel Base_upd_cntr_Label = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumberField Base_upd_cntr = null;
	public MCLabel Base_upd_usr_id_Label = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Base_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCTextField Base_upd_usr_nm = null;
	public MCLabel Base_upd_func_id_Label = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCTextField Base_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCTextField Base_upd_func_nm = null;
	public MCLabel Base_ins_ts_Label = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestampField Base_ins_ts = null;
	public MCLabel Base_upd_ts_Label = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestampField Base_upd_ts = null;
	public MCLabel Base_upd_srv_req_no_Label = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCTextField Base_upd_srv_req_no = null;
	// [SqlSrc]ブロック関連のField定義
	public MCPanel SqlSrcPanel = null;
	// [SqlSrc]ブロックの項目のField定義
	public MCScrollPane SqlSrc_sql_srcScrollPane = null;
	/**
	 * SQL ＳＱＬ.<p>
	 *
	 */
	public MCTextArea SqlSrc_sql_src = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMBBE.MBBEP0060.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Variable name 変数名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cond_col = null;
	/**
	 * Value 値.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cond_val = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * File classification ファイル種類.<p>
	 *
	 */
	public MCButtonGroup Btn_biz_dat_file_typ_Group = null;
	public MCRadioButton Btn_biz_dat_file_typ_DOWNLOAD = null;
	public MCRadioButton Btn_biz_dat_file_typ_SCREEN = null;
	public MCRadioButton Btn_biz_dat_file_typ_REPORT = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_exec = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [Btn2]ブロック関連のField定義
	public MCPanel Btn2Panel = null;
	// [Btn2]ブロックの項目のField定義
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, INS, UPD, DEL, REF, FIX_I, FIX_U, FIX_D};
	
	/** [MB_MBBEL0060_Srch01]のCallerの作成 */
	protected MBBEP_SrchSQLReg_MC.MB_MBBEL0060_Srch01Caller createMB_MBBEL0060_Srch01() {
		MBBEP_SrchSQLReg_MC.MB_MBBEL0060_Srch01Caller<MBBEP_SrchSQLReg, MB_MBBEL0060_Srch01Bridge>
		caller = ((MBBEP_SrchSQLReg_MC)this).new MB_MBBEL0060_Srch01Caller<MBBEP_SrchSQLReg, MB_MBBEL0060_Srch01Bridge>(
					(MBBEP_SrchSQLReg)this, new MB_MBBEL0060_Srch01Bridge());
		return caller;
	}
	/** [MB_MBBEL0060_Srch01]の呼び出し */
	protected void callMB_MBBEL0060_Srch01() {
		MCCaller caller = createMB_MBBEL0060_Srch01();
		caller.exec();
	}
	/** [MB_MBBEL0060_Srch02]のCallerの作成 */
	protected MBBEP_SrchSQLReg_MC.MB_MBBEL0060_Srch02Caller createMB_MBBEL0060_Srch02() {
		MBBEP_SrchSQLReg_MC.MB_MBBEL0060_Srch02Caller<MBBEP_SrchSQLReg, MB_MBBEL0060_Srch02Bridge>
		caller = ((MBBEP_SrchSQLReg_MC)this).new MB_MBBEL0060_Srch02Caller<MBBEP_SrchSQLReg, MB_MBBEL0060_Srch02Bridge>(
					(MBBEP_SrchSQLReg)this, new MB_MBBEL0060_Srch02Bridge());
		return caller;
	}
	/** [MB_MBBEL0060_Srch02]の呼び出し */
	protected void callMB_MBBEL0060_Srch02() {
		MCCaller caller = createMB_MBBEL0060_Srch02();
		caller.exec();
	}
	/** [MB_MBBEL0060_Ins01]のCallerの作成 */
	protected MBBEP_SrchSQLReg_MC.MB_MBBEL0060_Ins01Caller createMB_MBBEL0060_Ins01() {
		MBBEP_SrchSQLReg_MC.MB_MBBEL0060_Ins01Caller<MBBEP_SrchSQLReg, MB_MBBEL0060_Ins01Bridge>
		caller = ((MBBEP_SrchSQLReg_MC)this).new MB_MBBEL0060_Ins01Caller<MBBEP_SrchSQLReg, MB_MBBEL0060_Ins01Bridge>(
					(MBBEP_SrchSQLReg)this, new MB_MBBEL0060_Ins01Bridge());
		return caller;
	}
	/** [MB_MBBEL0060_Ins01]の呼び出し */
	protected void callMB_MBBEL0060_Ins01() {
		MCCaller caller = createMB_MBBEL0060_Ins01();
		caller.exec();
	}
	/** [MB_MBBEL0060_Upd01]のCallerの作成 */
	protected MBBEP_SrchSQLReg_MC.MB_MBBEL0060_Upd01Caller createMB_MBBEL0060_Upd01() {
		MBBEP_SrchSQLReg_MC.MB_MBBEL0060_Upd01Caller<MBBEP_SrchSQLReg, MB_MBBEL0060_Upd01Bridge>
		caller = ((MBBEP_SrchSQLReg_MC)this).new MB_MBBEL0060_Upd01Caller<MBBEP_SrchSQLReg, MB_MBBEL0060_Upd01Bridge>(
					(MBBEP_SrchSQLReg)this, new MB_MBBEL0060_Upd01Bridge());
		return caller;
	}
	/** [MB_MBBEL0060_Upd01]の呼び出し */
	protected void callMB_MBBEL0060_Upd01() {
		MCCaller caller = createMB_MBBEL0060_Upd01();
		caller.exec();
	}
	/** [MB_MBBEL0060_Del01]のCallerの作成 */
	protected MBBEP_SrchSQLReg_MC.MB_MBBEL0060_Del01Caller createMB_MBBEL0060_Del01() {
		MBBEP_SrchSQLReg_MC.MB_MBBEL0060_Del01Caller<MBBEP_SrchSQLReg, MB_MBBEL0060_Del01Bridge>
		caller = ((MBBEP_SrchSQLReg_MC)this).new MB_MBBEL0060_Del01Caller<MBBEP_SrchSQLReg, MB_MBBEL0060_Del01Bridge>(
					(MBBEP_SrchSQLReg)this, new MB_MBBEL0060_Del01Bridge());
		return caller;
	}
	/** [MB_MBBEL0060_Del01]の呼び出し */
	protected void callMB_MBBEL0060_Del01() {
		MCCaller caller = createMB_MBBEL0060_Del01();
		caller.exec();
	}
	/** [MB_MBBEL0040_Prnt01]のCallerの作成 */
	protected MBBEP_SrchSQLReg_MC.MB_MBBEL0040_Prnt01Caller createMB_MBBEL0040_Prnt01() {
		MBBEP_SrchSQLReg_MC.MB_MBBEL0040_Prnt01Caller<MBBEP_SrchSQLReg, MB_MBBEL0040_Prnt01Bridge>
		caller = ((MBBEP_SrchSQLReg_MC)this).new MB_MBBEL0040_Prnt01Caller<MBBEP_SrchSQLReg, MB_MBBEL0040_Prnt01Bridge>(
					(MBBEP_SrchSQLReg)this, new MB_MBBEL0040_Prnt01Bridge());
		return caller;
	}
	/** [MB_MBBEL0040_Prnt01]の呼び出し */
	protected void callMB_MBBEL0040_Prnt01() {
		MCCaller caller = createMB_MBBEL0040_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0060.CndR aCndR;
	/** [Base]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0060.BaseR aBaseR;
	/** [SqlSrc]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0060.SqlSrcR aSqlSrcR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBE.MBBEP0060.DtlR> aDtlL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0060.BtnR aBtnR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBE.MBBEP0060.RsltR> aRsltL;
	/** [RsltLbl]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0060.RsltLblR aRsltLblR;
	/** [RsltSml]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0060.RsltSmlR aRsltSmlR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMBBE.MBBEP0060.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBE.MBBEP0060.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBE.MBBEP0060.CndR createCndR() {
		return mcframe.clientMBBE.MBBEP0060.CndR.create();
	}

	/**
	 * 項目コピーによってaBaseRを設定します。
	 *
	 * aBaseRのインスタンスは変更されません。
	 *
	 * @param row BaseR
	 */
	public void setBaseR(mcframe.clientMBBE.MBBEP0060.BaseR row) {
		if (row != null) {
			MCRow.copyall(getBaseR(), row);
		}
	}

	/**
	 * [Base]ブロックのコンテナaBaseRを返します。
	 *
	 * @return BaseR
	 */
	public mcframe.clientMBBE.MBBEP0060.BaseR getBaseR() {
		return aBaseR;
	}

	/**
	 * aBaseRを作成します。
	 *
	 * @return BaseR
	 */
	public mcframe.clientMBBE.MBBEP0060.BaseR createBaseR() {
		return mcframe.clientMBBE.MBBEP0060.BaseR.create();
	}

	/**
	 * 項目コピーによってaSqlSrcRを設定します。
	 *
	 * aSqlSrcRのインスタンスは変更されません。
	 *
	 * @param row SqlSrcR
	 */
	public void setSqlSrcR(mcframe.clientMBBE.MBBEP0060.SqlSrcR row) {
		if (row != null) {
			MCRow.copyall(getSqlSrcR(), row);
		}
	}

	/**
	 * [SqlSrc]ブロックのコンテナaSqlSrcRを返します。
	 *
	 * @return SqlSrcR
	 */
	public mcframe.clientMBBE.MBBEP0060.SqlSrcR getSqlSrcR() {
		return aSqlSrcR;
	}

	/**
	 * aSqlSrcRを作成します。
	 *
	 * @return SqlSrcR
	 */
	public mcframe.clientMBBE.MBBEP0060.SqlSrcR createSqlSrcR() {
		return mcframe.clientMBBE.MBBEP0060.SqlSrcR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMBBE.MBBEP0060.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0060.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMBBE.MBBEP0060.DtlR createDtlR() {
		return mcframe.clientMBBE.MBBEP0060.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0060.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMBBE.MBBEP0060.DtlR.class);
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
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMBBE.MBBEP0060.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMBBE.MBBEP0060.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMBBE.MBBEP0060.BtnR createBtnR() {
		return mcframe.clientMBBE.MBBEP0060.BtnR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMBBE.MBBEP0060.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0060.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMBBE.MBBEP0060.RsltR createRsltR() {
		return mcframe.clientMBBE.MBBEP0060.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0060.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMBBE.MBBEP0060.RsltR.class);
	}

	/**
	 * 項目コピーによってaRsltLblRを設定します。
	 *
	 * aRsltLblRのインスタンスは変更されません。
	 *
	 * @param row RsltLblR
	 */
	public void setRsltLblR(mcframe.clientMBBE.MBBEP0060.RsltLblR row) {
		if (row != null) {
			MCRow.copyall(getRsltLblR(), row);
		}
	}

	/**
	 * [RsltLbl]ブロックのコンテナaRsltLblRを返します。
	 *
	 * @return RsltLblR
	 */
	public mcframe.clientMBBE.MBBEP0060.RsltLblR getRsltLblR() {
		return aRsltLblR;
	}

	/**
	 * aRsltLblRを作成します。
	 *
	 * @return RsltLblR
	 */
	public mcframe.clientMBBE.MBBEP0060.RsltLblR createRsltLblR() {
		return mcframe.clientMBBE.MBBEP0060.RsltLblR.create();
	}

	/**
	 * 項目コピーによってaRsltSmlRを設定します。
	 *
	 * aRsltSmlRのインスタンスは変更されません。
	 *
	 * @param row RsltSmlR
	 */
	public void setRsltSmlR(mcframe.clientMBBE.MBBEP0060.RsltSmlR row) {
		if (row != null) {
			MCRow.copyall(getRsltSmlR(), row);
		}
	}

	/**
	 * [RsltSml]ブロックのコンテナaRsltSmlRを返します。
	 *
	 * @return RsltSmlR
	 */
	public mcframe.clientMBBE.MBBEP0060.RsltSmlR getRsltSmlR() {
		return aRsltSmlR;
	}

	/**
	 * aRsltSmlRを作成します。
	 *
	 * @return RsltSmlR
	 */
	public mcframe.clientMBBE.MBBEP0060.RsltSmlR createRsltSmlR() {
		return mcframe.clientMBBE.MBBEP0060.RsltSmlR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getBaseR())) ret.add(getBaseR());
		if(!MCCollectionUtil.contains(ret, getSqlSrcR())) ret.add(getSqlSrcR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getBtnR())) ret.add(getBtnR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
		if(!MCCollectionUtil.contains(ret, getRsltLblR())) ret.add(getRsltLblR());
		if(!MCCollectionUtil.contains(ret, getRsltSmlR())) ret.add(getRsltSmlR());
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
		if(aCnt == getBaseR()) return "Base";
		if(aCnt == getSqlSrcR()) return "SqlSrc";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getBtnR()) return "Btn";
		if(aCnt == getRsltL()) return "Rslt";
		if(aCnt == getRsltLblR()) return "RsltLbl";
		if(aCnt == getRsltSmlR()) return "RsltSml";
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
		if(bId.equals("Base")) return getBaseR();
		if(bId.equals("SqlSrc")) return getSqlSrcR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("Btn")) return getBtnR();
		if(bId.equals("Rslt")) return getRsltL();
		if(bId.equals("RsltLbl")) return getRsltLblR();
		if(bId.equals("RsltSml")) return getRsltSmlR();
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
		ret.add(RegTabPanel);
		ret.add(RegPanel);
		ret.add(Rem1Panel);
		ret.add(Rem2Panel);
		ret.add(Rem3Panel);
		ret.add(InfoPanel);
		ret.add(ReportPanel);
		ret.add(BasePanel);
		ret.add(SqlSrcPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(Btn2Panel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBEP_SrchSQLReg_MC_A() {
		aCndR = createCndR();
		aBaseR = createBaseR();
		aSqlSrcR = createSqlSrcR();
		aDtlL = createDtlL();
		aBtnR = createBtnR();
		aRsltL = createRsltL();
		aRsltLblR = createRsltLblR();
		aRsltSmlR = createRsltSmlR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBEP_SrchSQLReg_MC_A(String name) {
		aCndR = createCndR();
		aBaseR = createBaseR();
		aSqlSrcR = createSqlSrcR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aBtnR = createBtnR();
		aRsltL = createRsltL();
		aRsltLblR = createRsltLblR();
		aRsltSmlR = createRsltSmlR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MBBEP_SrchSQLReg_MC.jbCreateScreenOpe((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbCreateCnd((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbCreateRegTab((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbCreateReg((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbCreateRem1((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbCreateRem2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbCreateRem3((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbCreateInfo((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbCreateReport((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbCreateBase((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbCreateSqlSrc((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbCreateDtl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbCreateBtn((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbCreateBtn2((MBBEP_SrchSQLReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MBBEP_SrchSQLReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBEP_SrchSQLReg p) {
	}

	/**
	 * [RegTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRegTab(MBBEP_SrchSQLReg p) {
	}

	/**
	 * [Reg]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateReg(MBBEP_SrchSQLReg p) {
	}

	/**
	 * [Rem1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRem1(MBBEP_SrchSQLReg p) {
	}

	/**
	 * [Rem2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRem2(MBBEP_SrchSQLReg p) {
	}

	/**
	 * [Rem3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRem3(MBBEP_SrchSQLReg p) {
	}

	/**
	 * [Info]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateInfo(MBBEP_SrchSQLReg p) {
	}

	/**
	 * [Report]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateReport(MBBEP_SrchSQLReg p) {
	}

	/**
	 * [Base]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBase(MBBEP_SrchSQLReg p) {
	}

	/**
	 * [SqlSrc]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSqlSrc(MBBEP_SrchSQLReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MBBEP_SrchSQLReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MBBEP_SrchSQLReg p) {
	}

	/**
	 * [Btn2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn2(MBBEP_SrchSQLReg p) {
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

	
	/** [Cnd_biz_dat_id_ListPutter]の定義 */
	private MCListPutter Cnd_biz_dat_id_p = null;

	/**
	 * [Cnd_biz_dat_id_ListPutter]の取得
	 */
	protected MCListPutter getCnd_biz_dat_id_ListPutter() {
		if (Cnd_biz_dat_id_p == null) {
			Cnd_biz_dat_id_p = createCnd_biz_dat_id_ListPutter(Cnd_biz_dat_id, "biz_dat_id", "biz_dat_nm");

		}
		return Cnd_biz_dat_id_p;
	}
	
	
	/** [Base_module_id_ListPutter]の定義 */
	private MCListPutter Base_module_id_p = null;

	/**
	 * [Base_module_id_ListPutter]の取得
	 */
	protected MCListPutter getBase_module_id_ListPutter() {
		if (Base_module_id_p == null) {
			Base_module_id_p = createBase_module_id_ListPutter(Base_module_id, "module_id");

		}
		return Base_module_id_p;
	}
	
	
	/** [Base_screen_id_ListPutter]の定義 */
	private MCListPutter Base_screen_id_p = null;

	/**
	 * [Base_screen_id_ListPutter]の取得
	 */
	protected MCListPutter getBase_screen_id_ListPutter() {
		if (Base_screen_id_p == null) {
			Base_screen_id_p = createBase_screen_id_ListPutter(Base_screen_id, "screen_id");

		}
		return Base_screen_id_p;
	}
	
	
	/** [Base_cartridge_ListPutter]の定義 */
	private MCListPutter Base_cartridge_p = null;

	/**
	 * [Base_cartridge_ListPutter]の取得
	 */
	protected MCListPutter getBase_cartridge_ListPutter() {
		if (Base_cartridge_p == null) {
			Base_cartridge_p = createBase_cartridge_ListPutter(Base_cartridge, "cartridge", "cartridge_nm");

		}
		return Base_cartridge_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBEP_SrchSQLReg create(){
		MBBEP_SrchSQLReg p = new MBBEP_SrchSQLReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBEP_SrchSQLReg create(String name){
		MBBEP_SrchSQLReg p = new MBBEP_SrchSQLReg(name);
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
		MBBEP_SrchSQLReg_MC.jbfInitScreenOpe((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbfInitCnd((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbfInitRegTab((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbfInitReg((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbfInitRem1((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbfInitRem2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbfInitRem3((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbfInitInfo((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbfInitReport((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbfInitBase((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbfInitSqlSrc((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbfInitDtl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbfInitBtn((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbfInitBtn2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbInitScreenOpe((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbInitCnd((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbInitRegTab((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbInitReg((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbInitRem1((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbInitRem2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbInitRem3((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbInitInfo((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbInitReport((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbInitBase((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbInitSqlSrc((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbInitDtl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbInitBtn((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.jbInitBtn2((MBBEP_SrchSQLReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_biz_dat_id_Label = p.beansFactory.createLabel("Cnd.biz_dat_id_Label");
		p.Cnd_biz_dat_id = p.beansFactory.createTextComboBox("Cnd.biz_dat_id");
		p.Cnd_biz_dat_id.setLabel(p.Cnd_biz_dat_id_Label);
		p.Cnd_biz_dat_nm = p.beansFactory.createTextField("Cnd.biz_dat_nm");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [RegTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRegTab(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.RegTabPanel = p.beansFactory.createPanel("RegTab");
		p.RegTabTab = p.beansFactory.createTabbedPane("RegTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Reg]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitReg(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.RegPanel = p.beansFactory.createPanel("Reg");
		// ブロックの項目の初期化
	}

	/**
	 * [Rem1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRem1(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.Rem1Panel = p.beansFactory.createPanel("Rem1");
		// ブロックの項目の初期化
	}

	/**
	 * [Rem2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRem2(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.Rem2Panel = p.beansFactory.createPanel("Rem2");
		// ブロックの項目の初期化
	}

	/**
	 * [Rem3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRem3(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.Rem3Panel = p.beansFactory.createPanel("Rem3");
		// ブロックの項目の初期化
	}

	/**
	 * [Info]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitInfo(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.InfoPanel = p.beansFactory.createPanel("Info");
		// ブロックの項目の初期化
	}

	/**
	 * [Report]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitReport(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.ReportPanel = p.beansFactory.createPanel("Report");
		// ブロックの項目の初期化
	}

	/**
	 * [Base]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBase(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.BasePanel = p.beansFactory.createPanel("Base");
		// ブロックの項目の初期化
		p.Base_biz_dat_id_Label = p.beansFactory.createLabel("Base.biz_dat_id_Label");
		p.Base_biz_dat_id = p.beansFactory.createTextField("Base.biz_dat_id");
		p.Base_biz_dat_id.setLabel(p.Base_biz_dat_id_Label);
		p.Base_biz_dat_nm_Label = p.beansFactory.createLabel("Base.biz_dat_nm_Label");
		p.Base_biz_dat_nm = p.beansFactory.createTextField("Base.biz_dat_nm");
		p.Base_biz_dat_nm.setLabel(p.Base_biz_dat_nm_Label);
		p.Base_admin_flg = p.beansFactory.createCheckBox("Base.admin_flg");
		p.Base_module_id_Label = p.beansFactory.createLabel("Base.module_id_Label");
		p.Base_module_id = p.beansFactory.createTextComboBox("Base.module_id");
		p.Base_module_id.setLabel(p.Base_module_id_Label);
		p.Base_screen_id_Label = p.beansFactory.createLabel("Base.screen_id_Label");
		p.Base_screen_id = p.beansFactory.createTextComboBox("Base.screen_id");
		p.Base_screen_id.setLabel(p.Base_screen_id_Label);
		p.Base_func_actyp_Label = p.beansFactory.createLabel("Base.func_actyp_Label");
		p.Base_func_actyp = p.beansFactory.createTextField("Base.func_actyp");
		p.Base_func_actyp.setLabel(p.Base_func_actyp_Label);
		p.Base_biz_dat_rmrks1ScrollPane = p.beansFactory.createScrollPane("Base.biz_dat_rmrks1scroll");
		p.Base_biz_dat_rmrks1 = p.beansFactory.createTextArea("Base.biz_dat_rmrks1");
		p.Base_biz_dat_rmrks2ScrollPane = p.beansFactory.createScrollPane("Base.biz_dat_rmrks2scroll");
		p.Base_biz_dat_rmrks2 = p.beansFactory.createTextArea("Base.biz_dat_rmrks2");
		p.Base_biz_dat_rmrks3ScrollPane = p.beansFactory.createScrollPane("Base.biz_dat_rmrks3scroll");
		p.Base_biz_dat_rmrks3 = p.beansFactory.createTextArea("Base.biz_dat_rmrks3");
		p.Base_form_file_nm_Label = p.beansFactory.createLabel("Base.form_file_nm_Label");
		p.Base_form_file_nm = p.beansFactory.createTextField("Base.form_file_nm");
		p.Base_form_file_nm.setLabel(p.Base_form_file_nm_Label);
		p.Base_cartridge_Label = p.beansFactory.createLabel("Base.cartridge_Label");
		p.Base_cartridge = p.beansFactory.createTextComboBox("Base.cartridge");
		p.Base_cartridge.setLabel(p.Base_cartridge_Label);
		p.Base_cartridge_nm = p.beansFactory.createTextField("Base.cartridge_nm");
		p.Base_print_flg = p.beansFactory.createCheckBox("Base.print_flg");
		p.Base_dwnld_flg = p.beansFactory.createCheckBox("Base.dwnld_flg");
		p.Base_ins_usr_id_Label = p.beansFactory.createLabel("Base.ins_usr_id_Label");
		p.Base_ins_usr_id = p.beansFactory.createTextField("Base.ins_usr_id");
		p.Base_ins_usr_id.setLabel(p.Base_ins_usr_id_Label);
		p.Base_ins_usr_nm = p.beansFactory.createTextField("Base.ins_usr_nm");
		p.Base_ins_func_id_Label = p.beansFactory.createLabel("Base.ins_func_id_Label");
		p.Base_ins_func_id = p.beansFactory.createTextField("Base.ins_func_id");
		p.Base_ins_func_id.setLabel(p.Base_ins_func_id_Label);
		p.Base_ins_func_nm = p.beansFactory.createTextField("Base.ins_func_nm");
		p.Base_upd_cntr_Label = p.beansFactory.createLabel("Base.upd_cntr_Label");
		p.Base_upd_cntr = p.beansFactory.createNumberField("Base.upd_cntr");
		p.Base_upd_cntr.setLabel(p.Base_upd_cntr_Label);
		p.Base_upd_usr_id_Label = p.beansFactory.createLabel("Base.upd_usr_id_Label");
		p.Base_upd_usr_id = p.beansFactory.createTextField("Base.upd_usr_id");
		p.Base_upd_usr_id.setLabel(p.Base_upd_usr_id_Label);
		p.Base_upd_usr_nm = p.beansFactory.createTextField("Base.upd_usr_nm");
		p.Base_upd_func_id_Label = p.beansFactory.createLabel("Base.upd_func_id_Label");
		p.Base_upd_func_id = p.beansFactory.createTextField("Base.upd_func_id");
		p.Base_upd_func_id.setLabel(p.Base_upd_func_id_Label);
		p.Base_upd_func_nm = p.beansFactory.createTextField("Base.upd_func_nm");
		p.Base_ins_ts_Label = p.beansFactory.createLabel("Base.ins_ts_Label");
		p.Base_ins_ts = p.beansFactory.createTimestampField("Base.ins_ts");
		p.Base_ins_ts.setLabel(p.Base_ins_ts_Label);
		p.Base_upd_ts_Label = p.beansFactory.createLabel("Base.upd_ts_Label");
		p.Base_upd_ts = p.beansFactory.createTimestampField("Base.upd_ts");
		p.Base_upd_ts.setLabel(p.Base_upd_ts_Label);
		p.Base_upd_srv_req_no_Label = p.beansFactory.createLabel("Base.upd_srv_req_no_Label");
		p.Base_upd_srv_req_no = p.beansFactory.createTextField("Base.upd_srv_req_no");
		p.Base_upd_srv_req_no.setLabel(p.Base_upd_srv_req_no_Label);
	}

	/**
	 * [SqlSrc]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSqlSrc(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.SqlSrcPanel = p.beansFactory.createPanel("SqlSrc");
		// ブロックの項目の初期化
		p.SqlSrc_sql_srcScrollPane = p.beansFactory.createScrollPane("SqlSrc.sql_srcscroll");
		p.SqlSrc_sql_src = p.beansFactory.createTextArea("SqlSrc.sql_src");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_cond_col = p.beansFactory.createTableColumn("Dtl.cond_col", MCColumnType.TEXT);
		p.columnDtl_cond_val = p.beansFactory.createTableColumn("Dtl.cond_val", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_biz_dat_file_typ_Group = p.beansFactory.createButtonGroup("Btn.biz_dat_file_typ");
		p.Btn_biz_dat_file_typ_DOWNLOAD = p.beansFactory.createRadioButton("Btn.biz_dat_file_typ_DOWNLOAD");
		p.Btn_biz_dat_file_typ_SCREEN = p.beansFactory.createRadioButton("Btn.biz_dat_file_typ_SCREEN");
		p.Btn_biz_dat_file_typ_REPORT = p.beansFactory.createRadioButton("Btn.biz_dat_file_typ_REPORT");
		p.Btn_exec = p.beansFactory.createButton("Btn.exec");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [Btn2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn2(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.Btn2Panel = p.beansFactory.createPanel("Btn2");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MBBEP_SrchSQLReg p) {
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
	protected static void jbInitCnd(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.RegTabPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS);
		p.ScreenOpePanel.add(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setNextBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0060.CndR.ope_META);
		p.Cnd_biz_dat_id.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_biz_dat_id, true);
		p.Cnd_biz_dat_id.setLinkBeans(p.Cnd_biz_dat_nm);
		p.CndPanel.add(p.Cnd_biz_dat_id_Label);
		p.CndPanel.add(p.Cnd_biz_dat_id);
		p.CndPanel.setLastBeans(p.Cnd_biz_dat_id);
		p.Cnd_biz_dat_id.setNextBeans(p.Cnd_biz_dat_nm);
		p.Cnd_biz_dat_id.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0060.CndR.biz_dat_id_META);
		p.CndPanel.add(p.Cnd_biz_dat_nm);
		p.Cnd_biz_dat_nm.setNextBeans(p.Cnd_srch);
		p.Cnd_biz_dat_nm.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0060.CndR.biz_dat_nm_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [RegTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRegTab(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.add(p.RegTabPanel);
		p.RegTabPanel.setNextBeans(p.BasePanel);
		p.RegTabPanel.add(p.RegTabTab);
		p.RegTabPanel.setLastBeans(p.RegTabTab);
		p.RegTabPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.RegTabTab.add(p.RegPanel, "RegTab.regist");
		p.RegTabTab.setLastBeans(p.RegPanel);
		p.RegPanel.setNextBeans(p.Rem1Panel);
		p.RegTabTab.add(p.Rem1Panel, "RegTab.remark1");
		p.Rem1Panel.setNextBeans(p.Rem2Panel);
		p.RegTabTab.add(p.Rem2Panel, "RegTab.remark2");
		p.Rem2Panel.setNextBeans(p.Rem3Panel);
		p.RegTabTab.add(p.Rem3Panel, "RegTab.remark3");
		p.Rem3Panel.setNextBeans(p.ReportPanel);
		p.RegTabTab.add(p.ReportPanel, "RegTab.report");
		p.ReportPanel.setNextBeans(p.InfoPanel);
		p.RegTabTab.add(p.InfoPanel, "RegTab.info");
	}

	/**
	 * [Reg]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitReg(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.RegPanel.setNextBeans(p.Rem1Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Rem1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRem1(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.Rem1Panel.setNextBeans(p.Rem2Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Rem2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRem2(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.Rem2Panel.setNextBeans(p.Rem3Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Rem3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRem3(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.Rem3Panel.setNextBeans(p.ReportPanel);
		// ブロックの項目の初期化
	}

	/**
	 * [Info]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitInfo(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Report]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitReport(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.ReportPanel.setNextBeans(p.InfoPanel);
		// ブロックの項目の初期化
	}

	/**
	 * [Base]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBase(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.add(p.BasePanel);
		p.BasePanel.setNextBeans(p.SqlSrcPanel);
		// ブロックの項目の初期化
		p.RegPanel.add(p.Base_biz_dat_id_Label);
		p.RegPanel.add(p.Base_biz_dat_id);
		p.RegPanel.setLastBeans(p.Base_biz_dat_id);
		p.Base_biz_dat_id.setNextBeans(p.Base_biz_dat_nm);
		p.Base_biz_dat_id.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.biz_dat_id_META);
		p.RegPanel.add(p.Base_biz_dat_nm_Label);
		p.RegPanel.add(p.Base_biz_dat_nm);
		p.Base_biz_dat_nm.setNextBeans(p.Base_admin_flg);
		p.Base_biz_dat_nm.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.biz_dat_nm_META);
		p.RegPanel.add(p.Base_admin_flg);
		p.Base_admin_flg.setNextBeans(p.Base_module_id);
		p.Base_admin_flg.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.admin_flg_META);
		p.Base_module_id.setListType(MCListType.STRICT);
		p.RegPanel.add(p.Base_module_id_Label);
		p.RegPanel.add(p.Base_module_id);
		p.Base_module_id.setNextBeans(p.Base_screen_id);
		p.Base_module_id.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.module_id_META);
		p.Base_screen_id.setListType(MCListType.STRICT);
		p.RegPanel.add(p.Base_screen_id_Label);
		p.RegPanel.add(p.Base_screen_id);
		p.Base_screen_id.setNextBeans(p.Base_func_actyp);
		p.Base_screen_id.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.screen_id_META);
		p.RegPanel.add(p.Base_func_actyp_Label);
		p.RegPanel.add(p.Base_func_actyp);
		p.Base_func_actyp.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.func_actyp_META);
		p.Base_biz_dat_rmrks1ScrollPane.getViewport().add(p.Base_biz_dat_rmrks1);
		p.Rem1Panel.add(p.Base_biz_dat_rmrks1ScrollPane);
		p.Rem1Panel.setLastBeans(p.Base_biz_dat_rmrks1);
		p.Base_biz_dat_rmrks1.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.biz_dat_rmrks1_META);
		p.Base_biz_dat_rmrks2ScrollPane.getViewport().add(p.Base_biz_dat_rmrks2);
		p.Rem2Panel.add(p.Base_biz_dat_rmrks2ScrollPane);
		p.Rem2Panel.setLastBeans(p.Base_biz_dat_rmrks2);
		p.Base_biz_dat_rmrks2.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.biz_dat_rmrks2_META);
		p.Base_biz_dat_rmrks3ScrollPane.getViewport().add(p.Base_biz_dat_rmrks3);
		p.Rem3Panel.add(p.Base_biz_dat_rmrks3ScrollPane);
		p.Rem3Panel.setLastBeans(p.Base_biz_dat_rmrks3);
		p.Base_biz_dat_rmrks3.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.biz_dat_rmrks3_META);
		p.ReportPanel.add(p.Base_form_file_nm_Label);
		p.ReportPanel.add(p.Base_form_file_nm);
		p.ReportPanel.setLastBeans(p.Base_form_file_nm);
		p.Base_form_file_nm.setNextBeans(p.Base_cartridge);
		p.Base_form_file_nm.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.form_file_nm_META);
		p.Base_cartridge.setListType(MCListType.STRICT);
		p.Base_cartridge.setLinkBeans(p.Base_cartridge_nm);
		p.ReportPanel.add(p.Base_cartridge_Label);
		p.ReportPanel.add(p.Base_cartridge);
		p.Base_cartridge.setNextBeans(p.Base_cartridge_nm);
		p.Base_cartridge.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.cartridge_META);
		p.ReportPanel.add(p.Base_cartridge_nm);
		p.Base_cartridge_nm.setNextBeans(p.Base_print_flg);
		p.Base_cartridge_nm.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.cartridge_nm_META);
		p.ReportPanel.add(p.Base_print_flg);
		p.Base_print_flg.setNextBeans(p.Base_dwnld_flg);
		p.Base_print_flg.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.print_flg_META);
		p.ReportPanel.add(p.Base_dwnld_flg);
		p.Base_dwnld_flg.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.dwnld_flg_META);
		p.InfoPanel.add(p.Base_ins_usr_id_Label);
		p.InfoPanel.add(p.Base_ins_usr_id);
		p.InfoPanel.setLastBeans(p.Base_ins_usr_id);
		p.Base_ins_usr_id.setNextBeans(p.Base_ins_usr_nm);
		p.Base_ins_usr_id.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.ins_usr_id_META);
		p.InfoPanel.add(p.Base_ins_usr_nm);
		p.Base_ins_usr_nm.setNextBeans(p.Base_ins_func_id);
		p.Base_ins_usr_nm.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.ins_usr_nm_META);
		p.InfoPanel.add(p.Base_ins_func_id_Label);
		p.InfoPanel.add(p.Base_ins_func_id);
		p.Base_ins_func_id.setNextBeans(p.Base_ins_func_nm);
		p.Base_ins_func_id.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.ins_func_id_META);
		p.InfoPanel.add(p.Base_ins_func_nm);
		p.Base_ins_func_nm.setNextBeans(p.Base_upd_usr_id);
		p.Base_ins_func_nm.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.ins_func_nm_META);
		p.BasePanel.add(p.Base_upd_cntr_Label);
		p.BasePanel.add(p.Base_upd_cntr);
		p.BasePanel.setLastBeans(p.Base_upd_cntr);
		p.Base_upd_cntr.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.upd_cntr_META);
		p.InfoPanel.add(p.Base_upd_usr_id_Label);
		p.InfoPanel.add(p.Base_upd_usr_id);
		p.Base_upd_usr_id.setNextBeans(p.Base_upd_usr_nm);
		p.Base_upd_usr_id.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.upd_usr_id_META);
		p.InfoPanel.add(p.Base_upd_usr_nm);
		p.Base_upd_usr_nm.setNextBeans(p.Base_upd_func_id);
		p.Base_upd_usr_nm.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.upd_usr_nm_META);
		p.InfoPanel.add(p.Base_upd_func_id_Label);
		p.InfoPanel.add(p.Base_upd_func_id);
		p.Base_upd_func_id.setNextBeans(p.Base_upd_func_nm);
		p.Base_upd_func_id.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.upd_func_id_META);
		p.InfoPanel.add(p.Base_upd_func_nm);
		p.Base_upd_func_nm.setNextBeans(p.Base_ins_ts);
		p.Base_upd_func_nm.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.upd_func_nm_META);
		p.InfoPanel.add(p.Base_ins_ts_Label);
		p.InfoPanel.add(p.Base_ins_ts);
		p.Base_ins_ts.setNextBeans(p.Base_upd_ts);
		p.Base_ins_ts.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.ins_ts_META);
		p.Base_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.InfoPanel.add(p.Base_upd_ts_Label);
		p.InfoPanel.add(p.Base_upd_ts);
		p.Base_upd_ts.setNextBeans(p.Base_upd_srv_req_no);
		p.Base_upd_ts.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.upd_ts_META);
		p.Base_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.InfoPanel.add(p.Base_upd_srv_req_no_Label);
		p.InfoPanel.add(p.Base_upd_srv_req_no);
		p.Base_upd_srv_req_no.setRow(p.getBaseR(), mcframe.clientMBBE.MBBEP0060.BaseR.upd_srv_req_no_META);
	}

	/**
	 * [SqlSrc]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSqlSrc(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.add(p.SqlSrcPanel);
		p.SqlSrcPanel.setNextBeans(p.DtlPanel);
		p.SqlSrcPanel.setLayoutPosition("CLC");
		// ブロックの項目の初期化
		p.SqlSrc_sql_srcScrollPane.getViewport().add(p.SqlSrc_sql_src);
		p.SqlSrcPanel.add(p.SqlSrc_sql_srcScrollPane);
		p.SqlSrcPanel.setLastBeans(p.SqlSrc_sql_src);
		p.SqlSrc_sql_src.setRow(p.getSqlSrcR(), mcframe.clientMBBE.MBBEP0060.SqlSrcR.sql_src_META);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlTable.setStatusColumnVisible(false);
		p.DtlPanel.setValueCheck(false);
		p.DtlPanel.setLayoutPosition("CRC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.Btn2Panel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.BtnPanel.setLastBeans(p.Btn_biz_dat_file_typ_Group);
		p.Btn_biz_dat_file_typ_Group.setFirstBeans(p.Btn_biz_dat_file_typ_DOWNLOAD);
		p.Btn_biz_dat_file_typ_DOWNLOAD.setActionCommand("1");
		p.Btn_biz_dat_file_typ_Group.add(p.Btn_biz_dat_file_typ_DOWNLOAD);
		p.BtnPanel.add(p.Btn_biz_dat_file_typ_DOWNLOAD);
		p.Btn_biz_dat_file_typ_DOWNLOAD.setNextBeans(p.Btn_biz_dat_file_typ_SCREEN);
		p.Btn_biz_dat_file_typ_SCREEN.setActionCommand("X");
		p.Btn_biz_dat_file_typ_Group.add(p.Btn_biz_dat_file_typ_SCREEN);
		p.BtnPanel.add(p.Btn_biz_dat_file_typ_SCREEN);
		p.Btn_biz_dat_file_typ_SCREEN.setNextBeans(p.Btn_biz_dat_file_typ_REPORT);
		p.Btn_biz_dat_file_typ_REPORT.setActionCommand("3");
		p.Btn_biz_dat_file_typ_Group.add(p.Btn_biz_dat_file_typ_REPORT);
		p.BtnPanel.add(p.Btn_biz_dat_file_typ_REPORT);
		p.Btn_biz_dat_file_typ_Group.setRow(p.getBtnR(), mcframe.clientMBBE.MBBEP0060.BtnR.biz_dat_file_typ_META);
		p.Btn_biz_dat_file_typ_Group.setNextBeans(p.Btn_exec);
		p.Btn_exec.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_exec);
		p.Btn_exec.setNextBeans(p.Btn_ins);
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
		p.Btn_ins.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.Btn2Panel.setLastBeans(p.Btn_del);
		p.Btn2Panel.add(p.Btn_del);
	}

	/**
	 * [Btn2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn2(MBBEP_SrchSQLReg p) {
		// ブロック関連の初期化
		p.add(p.Btn2Panel);
		p.Btn2Panel.setLayoutPosition("SE");
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
		MBBEP_SrchSQLReg_MC.mcInitScreenOpe((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.mcInitCnd((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.mcInitRegTab((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.mcInitReg((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.mcInitRem1((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.mcInitRem2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.mcInitRem3((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.mcInitInfo((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.mcInitReport((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.mcInitBase((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.mcInitSqlSrc((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.mcInitDtl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.mcInitBtn((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.mcInitBtn2((MBBEP_SrchSQLReg)this);

		// [SRCH]ステータスのモードの設定
		MBBEP_SrchSQLReg_MC.statusInitSRCH_ScreenOpe((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitSRCH_Cnd((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitSRCH_RegTab((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitSRCH_Reg((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitSRCH_Rem1((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitSRCH_Rem2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitSRCH_Rem3((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitSRCH_Info((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitSRCH_Report((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitSRCH_Base((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitSRCH_SqlSrc((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitSRCH_Dtl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitSRCH_Btn((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitSRCH_Btn2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitSRCH_Rslt((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitSRCH_RsltLbl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitSRCH_RsltSml((MBBEP_SrchSQLReg)this);

		// [INS]ステータスのモードの設定
		MBBEP_SrchSQLReg_MC.statusInitINS_ScreenOpe((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitINS_Cnd((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitINS_RegTab((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitINS_Reg((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitINS_Rem1((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitINS_Rem2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitINS_Rem3((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitINS_Info((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitINS_Report((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitINS_Base((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitINS_SqlSrc((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitINS_Dtl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitINS_Btn((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitINS_Btn2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitINS_Rslt((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitINS_RsltLbl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitINS_RsltSml((MBBEP_SrchSQLReg)this);

		// [UPD]ステータスのモードの設定
		MBBEP_SrchSQLReg_MC.statusInitUPD_ScreenOpe((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitUPD_Cnd((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitUPD_RegTab((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitUPD_Reg((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitUPD_Rem1((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitUPD_Rem2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitUPD_Rem3((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitUPD_Info((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitUPD_Report((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitUPD_Base((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitUPD_SqlSrc((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitUPD_Dtl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitUPD_Btn((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitUPD_Btn2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitUPD_Rslt((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitUPD_RsltLbl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitUPD_RsltSml((MBBEP_SrchSQLReg)this);

		// [DEL]ステータスのモードの設定
		MBBEP_SrchSQLReg_MC.statusInitDEL_ScreenOpe((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitDEL_Cnd((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitDEL_RegTab((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitDEL_Reg((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitDEL_Rem1((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitDEL_Rem2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitDEL_Rem3((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitDEL_Info((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitDEL_Report((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitDEL_Base((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitDEL_SqlSrc((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitDEL_Dtl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitDEL_Btn((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitDEL_Btn2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitDEL_Rslt((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitDEL_RsltLbl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitDEL_RsltSml((MBBEP_SrchSQLReg)this);

		// [REF]ステータスのモードの設定
		MBBEP_SrchSQLReg_MC.statusInitREF_ScreenOpe((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitREF_Cnd((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitREF_RegTab((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitREF_Reg((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitREF_Rem1((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitREF_Rem2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitREF_Rem3((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitREF_Info((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitREF_Report((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitREF_Base((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitREF_SqlSrc((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitREF_Dtl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitREF_Btn((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitREF_Btn2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitREF_Rslt((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitREF_RsltLbl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitREF_RsltSml((MBBEP_SrchSQLReg)this);

		// [FIX_I]ステータスのモードの設定
		MBBEP_SrchSQLReg_MC.statusInitFIX__I_ScreenOpe((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__I_Cnd((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__I_RegTab((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__I_Reg((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__I_Rem1((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__I_Rem2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__I_Rem3((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__I_Info((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__I_Report((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__I_Base((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__I_SqlSrc((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__I_Dtl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__I_Btn((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__I_Btn2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__I_Rslt((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__I_RsltLbl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__I_RsltSml((MBBEP_SrchSQLReg)this);

		// [FIX_U]ステータスのモードの設定
		MBBEP_SrchSQLReg_MC.statusInitFIX__U_ScreenOpe((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__U_Cnd((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__U_RegTab((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__U_Reg((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__U_Rem1((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__U_Rem2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__U_Rem3((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__U_Info((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__U_Report((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__U_Base((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__U_SqlSrc((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__U_Dtl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__U_Btn((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__U_Btn2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__U_Rslt((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__U_RsltLbl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__U_RsltSml((MBBEP_SrchSQLReg)this);

		// [FIX_D]ステータスのモードの設定
		MBBEP_SrchSQLReg_MC.statusInitFIX__D_ScreenOpe((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__D_Cnd((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__D_RegTab((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__D_Reg((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__D_Rem1((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__D_Rem2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__D_Rem3((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__D_Info((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__D_Report((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__D_Base((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__D_SqlSrc((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__D_Dtl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__D_Btn((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__D_Btn2((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__D_Rslt((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__D_RsltLbl((MBBEP_SrchSQLReg)this);
		MBBEP_SrchSQLReg_MC.statusInitFIX__D_RsltSml((MBBEP_SrchSQLReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MBBEP_SrchSQLReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBEP_SrchSQLReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_biz_dat_id.setListListener(p);
		p.Cnd_biz_dat_id.addAllListener(p);
		p.Cnd_biz_dat_nm.setListListener(p);
		p.Cnd_biz_dat_nm.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [RegTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRegTab(MBBEP_SrchSQLReg p) {
		p.RegTabTab.addAllListener(p);
	}

	/**
	 *  [Reg]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitReg(MBBEP_SrchSQLReg p) {
	}

	/**
	 *  [Rem1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRem1(MBBEP_SrchSQLReg p) {
	}

	/**
	 *  [Rem2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRem2(MBBEP_SrchSQLReg p) {
	}

	/**
	 *  [Rem3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRem3(MBBEP_SrchSQLReg p) {
	}

	/**
	 *  [Info]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitInfo(MBBEP_SrchSQLReg p) {
	}

	/**
	 *  [Report]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitReport(MBBEP_SrchSQLReg p) {
	}

	/**
	 *  [Base]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBase(MBBEP_SrchSQLReg p) {
		p.Base_biz_dat_id.setListListener(p);
		p.Base_biz_dat_id.addAllListener(p);
		p.Base_biz_dat_nm.setListListener(p);
		p.Base_biz_dat_nm.addAllListener(p);
		p.Base_admin_flg.addAllListener(p);
		p.Base_module_id.setListListener(p);
		p.Base_module_id.addAllListener(p);
		p.Base_screen_id.setListListener(p);
		p.Base_screen_id.addAllListener(p);
		p.Base_func_actyp.setListListener(p);
		p.Base_func_actyp.addAllListener(p);
		p.Base_biz_dat_rmrks1.addAllListener(p);
		p.Base_biz_dat_rmrks2.addAllListener(p);
		p.Base_biz_dat_rmrks3.addAllListener(p);
		p.Base_form_file_nm.setListListener(p);
		p.Base_form_file_nm.addAllListener(p);
		p.Base_cartridge.setListListener(p);
		p.Base_cartridge.addAllListener(p);
		p.Base_cartridge_nm.setListListener(p);
		p.Base_cartridge_nm.addAllListener(p);
		p.Base_print_flg.addAllListener(p);
		p.Base_dwnld_flg.addAllListener(p);
		p.Base_ins_usr_id.setListListener(p);
		p.Base_ins_usr_id.addAllListener(p);
		p.Base_ins_usr_nm.setListListener(p);
		p.Base_ins_usr_nm.addAllListener(p);
		p.Base_ins_func_id.setListListener(p);
		p.Base_ins_func_id.addAllListener(p);
		p.Base_ins_func_nm.setListListener(p);
		p.Base_ins_func_nm.addAllListener(p);
		p.Base_upd_cntr.setListListener(p);
		p.Base_upd_cntr.addAllListener(p);
		p.Base_upd_usr_id.setListListener(p);
		p.Base_upd_usr_id.addAllListener(p);
		p.Base_upd_usr_nm.setListListener(p);
		p.Base_upd_usr_nm.addAllListener(p);
		p.Base_upd_func_id.setListListener(p);
		p.Base_upd_func_id.addAllListener(p);
		p.Base_upd_func_nm.setListListener(p);
		p.Base_upd_func_nm.addAllListener(p);
		p.Base_ins_ts.setListListener(p);
		p.Base_ins_ts.addAllListener(p);
		p.Base_upd_ts.setListListener(p);
		p.Base_upd_ts.addAllListener(p);
		p.Base_upd_srv_req_no.setListListener(p);
		p.Base_upd_srv_req_no.addAllListener(p);
	}

	/**
	 *  [SqlSrc]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSqlSrc(MBBEP_SrchSQLReg p) {
		p.SqlSrc_sql_src.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MBBEP_SrchSQLReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_cond_col.addAllListener(p);
		p.columnDtl_cond_col.setListListener(p);
		p.columnDtl_cond_val.addAllListener(p);
		p.columnDtl_cond_val.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MBBEP_SrchSQLReg p) {
		p.Btn_biz_dat_file_typ_Group.addAllListener(p);
		p.Btn_biz_dat_file_typ_DOWNLOAD.addAllListener(p);
		p.Btn_biz_dat_file_typ_SCREEN.addAllListener(p);
		p.Btn_biz_dat_file_typ_REPORT.addAllListener(p);
		p.Btn_exec.addAllListener(p);
		p.Btn_exec.setAPMethodName("doBtn_exec");
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [Btn2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn2(MBBEP_SrchSQLReg p) {
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MBBEP_SrchSQLReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MBBEP_SrchSQLReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_biz_dat_id.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_biz_dat_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[RegTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RegTab(MBBEP_SrchSQLReg p){

	}

	/**
	 * [SRCH]ステータスの[Reg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Reg(MBBEP_SrchSQLReg p){

	}

	/**
	 * [SRCH]ステータスの[Rem1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rem1(MBBEP_SrchSQLReg p){

	}

	/**
	 * [SRCH]ステータスの[Rem2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rem2(MBBEP_SrchSQLReg p){

	}

	/**
	 * [SRCH]ステータスの[Rem3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rem3(MBBEP_SrchSQLReg p){

	}

	/**
	 * [SRCH]ステータスの[Info]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Info(MBBEP_SrchSQLReg p){

	}

	/**
	 * [SRCH]ステータスの[Report]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Report(MBBEP_SrchSQLReg p){

	}

	/**
	 * [SRCH]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Base(MBBEP_SrchSQLReg p){
		p.Base_biz_dat_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_biz_dat_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_admin_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_module_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_screen_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_func_actyp.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_biz_dat_rmrks1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_biz_dat_rmrks2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_biz_dat_rmrks3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_form_file_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_cartridge.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_cartridge_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_print_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_dwnld_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Base_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Base_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[SqlSrc]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SqlSrc(MBBEP_SrchSQLReg p){
		p.SqlSrc_sql_src.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MBBEP_SrchSQLReg p){
		p.columnDtl_cond_col.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cond_val.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MBBEP_SrchSQLReg p){
		p.Btn_biz_dat_file_typ_Group.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Btn_exec.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn2(MBBEP_SrchSQLReg p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MBBEP_SrchSQLReg p){

	}

	/**
	 * [SRCH]ステータスの[RsltLbl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltLbl(MBBEP_SrchSQLReg p){

	}

	/**
	 * [SRCH]ステータスの[RsltSml]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltSml(MBBEP_SrchSQLReg p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MBBEP_SrchSQLReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MBBEP_SrchSQLReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_biz_dat_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_biz_dat_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[RegTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_RegTab(MBBEP_SrchSQLReg p){

	}

	/**
	 * [INS]ステータスの[Reg]ブロックのモードの設定
	 */
	protected static void statusInitINS_Reg(MBBEP_SrchSQLReg p){

	}

	/**
	 * [INS]ステータスの[Rem1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rem1(MBBEP_SrchSQLReg p){

	}

	/**
	 * [INS]ステータスの[Rem2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rem2(MBBEP_SrchSQLReg p){

	}

	/**
	 * [INS]ステータスの[Rem3]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rem3(MBBEP_SrchSQLReg p){

	}

	/**
	 * [INS]ステータスの[Info]ブロックのモードの設定
	 */
	protected static void statusInitINS_Info(MBBEP_SrchSQLReg p){

	}

	/**
	 * [INS]ステータスの[Report]ブロックのモードの設定
	 */
	protected static void statusInitINS_Report(MBBEP_SrchSQLReg p){

	}

	/**
	 * [INS]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitINS_Base(MBBEP_SrchSQLReg p){
		p.Base_biz_dat_id.putMode(p, INS, MCMode.REQUIRED);
		p.Base_biz_dat_nm.putMode(p, INS, MCMode.REQUIRED);
		p.Base_admin_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Base_module_id.putMode(p, INS, MCMode.REQUIRED);
		p.Base_screen_id.putMode(p, INS, MCMode.REQUIRED);
		p.Base_func_actyp.putMode(p, INS, MCMode.REQUIRED);
		p.Base_biz_dat_rmrks1.putMode(p, INS, MCMode.ENABLE);
		p.Base_biz_dat_rmrks2.putMode(p, INS, MCMode.ENABLE);
		p.Base_biz_dat_rmrks3.putMode(p, INS, MCMode.ENABLE);
		p.Base_form_file_nm.putMode(p, INS, MCMode.ENABLE);
		p.Base_cartridge.putMode(p, INS, MCMode.ENABLE);
		p.Base_cartridge_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Base_print_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Base_dwnld_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Base_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Base_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Base_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Base_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Base_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.Base_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Base_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Base_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Base_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Base_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.Base_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.Base_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[SqlSrc]ブロックのモードの設定
	 */
	protected static void statusInitINS_SqlSrc(MBBEP_SrchSQLReg p){
		p.SqlSrc_sql_src.putMode(p, INS, MCMode.REQUIRED);

	}

	/**
	 * [INS]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl(MBBEP_SrchSQLReg p){
		p.columnDtl_cond_col.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_cond_val.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MBBEP_SrchSQLReg p){
		p.Btn_biz_dat_file_typ_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Btn_exec.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn2(MBBEP_SrchSQLReg p){

	}

	/**
	 * [INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rslt(MBBEP_SrchSQLReg p){

	}

	/**
	 * [INS]ステータスの[RsltLbl]ブロックのモードの設定
	 */
	protected static void statusInitINS_RsltLbl(MBBEP_SrchSQLReg p){

	}

	/**
	 * [INS]ステータスの[RsltSml]ブロックのモードの設定
	 */
	protected static void statusInitINS_RsltSml(MBBEP_SrchSQLReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MBBEP_SrchSQLReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MBBEP_SrchSQLReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_biz_dat_id.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_biz_dat_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[RegTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RegTab(MBBEP_SrchSQLReg p){

	}

	/**
	 * [UPD]ステータスの[Reg]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Reg(MBBEP_SrchSQLReg p){

	}

	/**
	 * [UPD]ステータスの[Rem1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rem1(MBBEP_SrchSQLReg p){

	}

	/**
	 * [UPD]ステータスの[Rem2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rem2(MBBEP_SrchSQLReg p){

	}

	/**
	 * [UPD]ステータスの[Rem3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rem3(MBBEP_SrchSQLReg p){

	}

	/**
	 * [UPD]ステータスの[Info]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Info(MBBEP_SrchSQLReg p){

	}

	/**
	 * [UPD]ステータスの[Report]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Report(MBBEP_SrchSQLReg p){

	}

	/**
	 * [UPD]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Base(MBBEP_SrchSQLReg p){
		p.Base_biz_dat_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_biz_dat_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_admin_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_module_id.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_screen_id.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_func_actyp.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_biz_dat_rmrks1.putMode(p, UPD, MCMode.ENABLE);
		p.Base_biz_dat_rmrks2.putMode(p, UPD, MCMode.ENABLE);
		p.Base_biz_dat_rmrks3.putMode(p, UPD, MCMode.ENABLE);
		p.Base_form_file_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Base_cartridge.putMode(p, UPD, MCMode.ENABLE);
		p.Base_cartridge_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_print_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_dwnld_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.Base_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[SqlSrc]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SqlSrc(MBBEP_SrchSQLReg p){
		p.SqlSrc_sql_src.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MBBEP_SrchSQLReg p){
		p.columnDtl_cond_col.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cond_val.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MBBEP_SrchSQLReg p){
		p.Btn_biz_dat_file_typ_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Btn_exec.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn2(MBBEP_SrchSQLReg p){

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MBBEP_SrchSQLReg p){

	}

	/**
	 * [UPD]ステータスの[RsltLbl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RsltLbl(MBBEP_SrchSQLReg p){

	}

	/**
	 * [UPD]ステータスの[RsltSml]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RsltSml(MBBEP_SrchSQLReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MBBEP_SrchSQLReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MBBEP_SrchSQLReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_biz_dat_id.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_biz_dat_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[RegTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RegTab(MBBEP_SrchSQLReg p){

	}

	/**
	 * [DEL]ステータスの[Reg]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Reg(MBBEP_SrchSQLReg p){

	}

	/**
	 * [DEL]ステータスの[Rem1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rem1(MBBEP_SrchSQLReg p){

	}

	/**
	 * [DEL]ステータスの[Rem2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rem2(MBBEP_SrchSQLReg p){

	}

	/**
	 * [DEL]ステータスの[Rem3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rem3(MBBEP_SrchSQLReg p){

	}

	/**
	 * [DEL]ステータスの[Info]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Info(MBBEP_SrchSQLReg p){

	}

	/**
	 * [DEL]ステータスの[Report]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Report(MBBEP_SrchSQLReg p){

	}

	/**
	 * [DEL]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Base(MBBEP_SrchSQLReg p){
		p.Base_biz_dat_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_biz_dat_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_admin_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_module_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_screen_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_func_actyp.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_biz_dat_rmrks1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_biz_dat_rmrks2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_biz_dat_rmrks3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_form_file_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_cartridge.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_cartridge_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_print_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_dwnld_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.Base_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[SqlSrc]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SqlSrc(MBBEP_SrchSQLReg p){
		p.SqlSrc_sql_src.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MBBEP_SrchSQLReg p){
		p.columnDtl_cond_col.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cond_val.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MBBEP_SrchSQLReg p){
		p.Btn_biz_dat_file_typ_Group.putMode(p, DEL, MCMode.READ_ONLY);
		p.Btn_exec.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn2(MBBEP_SrchSQLReg p){

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MBBEP_SrchSQLReg p){

	}

	/**
	 * [DEL]ステータスの[RsltLbl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RsltLbl(MBBEP_SrchSQLReg p){

	}

	/**
	 * [DEL]ステータスの[RsltSml]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RsltSml(MBBEP_SrchSQLReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MBBEP_SrchSQLReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MBBEP_SrchSQLReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_biz_dat_id.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_biz_dat_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[RegTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_RegTab(MBBEP_SrchSQLReg p){

	}

	/**
	 * [REF]ステータスの[Reg]ブロックのモードの設定
	 */
	protected static void statusInitREF_Reg(MBBEP_SrchSQLReg p){

	}

	/**
	 * [REF]ステータスの[Rem1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rem1(MBBEP_SrchSQLReg p){

	}

	/**
	 * [REF]ステータスの[Rem2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rem2(MBBEP_SrchSQLReg p){

	}

	/**
	 * [REF]ステータスの[Rem3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rem3(MBBEP_SrchSQLReg p){

	}

	/**
	 * [REF]ステータスの[Info]ブロックのモードの設定
	 */
	protected static void statusInitREF_Info(MBBEP_SrchSQLReg p){

	}

	/**
	 * [REF]ステータスの[Report]ブロックのモードの設定
	 */
	protected static void statusInitREF_Report(MBBEP_SrchSQLReg p){

	}

	/**
	 * [REF]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitREF_Base(MBBEP_SrchSQLReg p){
		p.Base_biz_dat_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_biz_dat_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_admin_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_module_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_screen_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_func_actyp.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_biz_dat_rmrks1.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_biz_dat_rmrks2.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_biz_dat_rmrks3.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_form_file_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_cartridge.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_cartridge_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_print_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_dwnld_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.Base_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[SqlSrc]ブロックのモードの設定
	 */
	protected static void statusInitREF_SqlSrc(MBBEP_SrchSQLReg p){
		p.SqlSrc_sql_src.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MBBEP_SrchSQLReg p){
		p.columnDtl_cond_col.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cond_val.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MBBEP_SrchSQLReg p){
		p.Btn_biz_dat_file_typ_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Btn_exec.putMode(p, REF, MCMode.ENABLE);
		p.Btn_ins.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn2(MBBEP_SrchSQLReg p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MBBEP_SrchSQLReg p){

	}

	/**
	 * [REF]ステータスの[RsltLbl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RsltLbl(MBBEP_SrchSQLReg p){

	}

	/**
	 * [REF]ステータスの[RsltSml]ブロックのモードの設定
	 */
	protected static void statusInitREF_RsltSml(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MBBEP_SrchSQLReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_biz_dat_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_biz_dat_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[RegTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_RegTab(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_I]ステータスの[Reg]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Reg(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_I]ステータスの[Rem1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Rem1(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_I]ステータスの[Rem2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Rem2(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_I]ステータスの[Rem3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Rem3(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_I]ステータスの[Info]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Info(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_I]ステータスの[Report]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Report(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_I]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Base(MBBEP_SrchSQLReg p){
		p.Base_biz_dat_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_biz_dat_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_admin_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_module_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_screen_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_func_actyp.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_biz_dat_rmrks1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_biz_dat_rmrks2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_biz_dat_rmrks3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_form_file_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_cartridge.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_cartridge_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_print_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_dwnld_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Base_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Base_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[SqlSrc]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_SqlSrc(MBBEP_SrchSQLReg p){
		p.SqlSrc_sql_src.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl(MBBEP_SrchSQLReg p){
		p.columnDtl_cond_col.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cond_val.putMode(p, FIX_I, MCMode.ENABLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MBBEP_SrchSQLReg p){
		p.Btn_biz_dat_file_typ_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Btn_exec.putMode(p, FIX_I, MCMode.ENABLE);
		p.Btn_ins.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn2(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_I]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Rslt(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_I]ステータスの[RsltLbl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_RsltLbl(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_I]ステータスの[RsltSml]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_RsltSml(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MBBEP_SrchSQLReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_biz_dat_id.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_biz_dat_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[RegTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RegTab(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_U]ステータスの[Reg]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Reg(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_U]ステータスの[Rem1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rem1(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_U]ステータスの[Rem2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rem2(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_U]ステータスの[Rem3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rem3(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_U]ステータスの[Info]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Info(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_U]ステータスの[Report]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Report(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_U]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Base(MBBEP_SrchSQLReg p){
		p.Base_biz_dat_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_biz_dat_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_admin_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_module_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_screen_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_func_actyp.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_biz_dat_rmrks1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_biz_dat_rmrks2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_biz_dat_rmrks3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_form_file_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_cartridge.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_cartridge_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_print_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_dwnld_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Base_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Base_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[SqlSrc]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SqlSrc(MBBEP_SrchSQLReg p){
		p.SqlSrc_sql_src.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MBBEP_SrchSQLReg p){
		p.columnDtl_cond_col.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cond_val.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MBBEP_SrchSQLReg p){
		p.Btn_biz_dat_file_typ_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Btn_exec.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_ins.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn2(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_U]ステータスの[RsltLbl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RsltLbl(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_U]ステータスの[RsltSml]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RsltSml(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MBBEP_SrchSQLReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_biz_dat_id.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_biz_dat_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[RegTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_RegTab(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_D]ステータスの[Reg]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Reg(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_D]ステータスの[Rem1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Rem1(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_D]ステータスの[Rem2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Rem2(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_D]ステータスの[Rem3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Rem3(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_D]ステータスの[Info]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Info(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_D]ステータスの[Report]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Report(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_D]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Base(MBBEP_SrchSQLReg p){
		p.Base_biz_dat_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_biz_dat_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_admin_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_module_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_screen_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_func_actyp.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_biz_dat_rmrks1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_biz_dat_rmrks2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_biz_dat_rmrks3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_form_file_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_cartridge.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_cartridge_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_print_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_dwnld_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Base_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Base_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[SqlSrc]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_SqlSrc(MBBEP_SrchSQLReg p){
		p.SqlSrc_sql_src.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MBBEP_SrchSQLReg p){
		p.columnDtl_cond_col.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cond_val.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MBBEP_SrchSQLReg p){
		p.Btn_biz_dat_file_typ_Group.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Btn_exec.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn2(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_D]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Rslt(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_D]ステータスの[RsltLbl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_RsltLbl(MBBEP_SrchSQLReg p){

	}

	/**
	 * [FIX_D]ステータスの[RsltSml]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_RsltSml(MBBEP_SrchSQLReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return INS;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MBBEP_SrchSQLReg_MC.setTableConfigDtl((MBBEP_SrchSQLReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MBBEP_SrchSQLReg p) {
		p.columnDtl_cond_col.setMeta(mcframe.clientMBBE.MBBEP0060.DtlR.cond_col_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cond_col);
		p.columnDtl_cond_val.setMeta(mcframe.clientMBBE.MBBEP0060.DtlR.cond_val_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cond_val);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_biz_dat_id.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_biz_dat_id.getListConfig().setPutter(getCnd_biz_dat_id_ListPutter());
		Base_module_id.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_module_id.getListConfig().setPutter(getBase_module_id_ListPutter());
		Base_screen_id.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_screen_id.getListConfig().setPutter(getBase_screen_id_ListPutter());
		Base_cartridge.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_cartridge.getListConfig().setPutter(getBase_cartridge_ListPutter());
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
	 * この画面を[INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSStatus() {
		status = INS;
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
	 * この画面を[FIX_I]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_IStatus() {
		status = FIX_I;
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
	 * この画面を[FIX_D]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_DStatus() {
		status = FIX_D;
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
		else if (INS.equals(status)) {
			setINSStatus();
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
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
		}
	}

	/**
	 * [Cnd_biz_dat_id_ListPutter]の作成
	 */
	protected MCListPutter createCnd_biz_dat_id_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MB.MBUAP0010.BizDatID");
		return lp;
	}
	 
	/**
	 * [Base_module_id_ListPutter]の作成
	 */
	protected MCListPutter createBase_module_id_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("FS.FSUAP0010.Module");
		return lp;
	}
	 
	/**
	 * [Base_screen_id_ListPutter]の作成
	 */
	protected MCListPutter createBase_screen_id_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("FS.FSUAP0010.UserMemoScreenID");
		return lp;
	}
	 
	/**
	 * [Base_cartridge_ListPutter]の作成
	 */
	protected MCListPutter createBase_cartridge_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("FS.FSUAP0010.ReportCartridge");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_biz_dat_id) return getCnd_biz_dat_id(row, info);
		if(combo == Base_module_id) return getBase_module_id(row, info);
		if(combo == Base_screen_id) return getBase_screen_id(row, info);
		if(combo == Base_cartridge) return getBase_cartridge(row, info);
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
		else if (ap == Btn_exec) doBtn_exec(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[exec]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_exec(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins(MCEventInfo info);

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
		if (vc == RegTabTab) return doRegTab_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_biz_dat_id) return doCnd_biz_dat_id_VC(info);
		if (vc == Cnd_biz_dat_nm) return doCnd_biz_dat_nm_VC(info);
		if (vc == Base_biz_dat_id) return doBase_biz_dat_id_VC(info);
		if (vc == Base_biz_dat_nm) return doBase_biz_dat_nm_VC(info);
		if (vc == Base_admin_flg) return doBase_admin_flg_VC(info);
		if (vc == Base_module_id) return doBase_module_id_VC(info);
		if (vc == Base_screen_id) return doBase_screen_id_VC(info);
		if (vc == Base_func_actyp) return doBase_func_actyp_VC(info);
		if (vc == Base_biz_dat_rmrks1) return doBase_biz_dat_rmrks1_VC(info);
		if (vc == Base_biz_dat_rmrks2) return doBase_biz_dat_rmrks2_VC(info);
		if (vc == Base_biz_dat_rmrks3) return doBase_biz_dat_rmrks3_VC(info);
		if (vc == Base_form_file_nm) return doBase_form_file_nm_VC(info);
		if (vc == Base_cartridge) return doBase_cartridge_VC(info);
		if (vc == Base_cartridge_nm) return doBase_cartridge_nm_VC(info);
		if (vc == Base_print_flg) return doBase_print_flg_VC(info);
		if (vc == Base_dwnld_flg) return doBase_dwnld_flg_VC(info);
		if (vc == Base_ins_usr_id) return doBase_ins_usr_id_VC(info);
		if (vc == Base_ins_usr_nm) return doBase_ins_usr_nm_VC(info);
		if (vc == Base_ins_func_id) return doBase_ins_func_id_VC(info);
		if (vc == Base_ins_func_nm) return doBase_ins_func_nm_VC(info);
		if (vc == Base_upd_cntr) return doBase_upd_cntr_VC(info);
		if (vc == Base_upd_usr_id) return doBase_upd_usr_id_VC(info);
		if (vc == Base_upd_usr_nm) return doBase_upd_usr_nm_VC(info);
		if (vc == Base_upd_func_id) return doBase_upd_func_id_VC(info);
		if (vc == Base_upd_func_nm) return doBase_upd_func_nm_VC(info);
		if (vc == Base_ins_ts) return doBase_ins_ts_VC(info);
		if (vc == Base_upd_ts) return doBase_upd_ts_VC(info);
		if (vc == Base_upd_srv_req_no) return doBase_upd_srv_req_no_VC(info);
		if (vc == SqlSrc_sql_src) return doSqlSrc_sql_src_VC(info);
		if (vc == columnDtl_cond_col) return doDtl_cond_col_VC(info);
		if (vc == columnDtl_cond_val) return doDtl_cond_val_VC(info);
		if (vc == Btn_biz_dat_file_typ_Group) return doBtn_biz_dat_file_typ_VC(info);
		return true;
	}

	/**
	 * [RegTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRegTab_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[biz_dat_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_dat_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_dat_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[biz_dat_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_biz_dat_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[biz_dat_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_biz_dat_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[admin_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_admin_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[module_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_module_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[screen_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_screen_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[func_actyp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_func_actyp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[biz_dat_rmrks1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_biz_dat_rmrks1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[biz_dat_rmrks2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_biz_dat_rmrks2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[biz_dat_rmrks3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_biz_dat_rmrks3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[form_file_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_form_file_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[cartridge]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_cartridge_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[cartridge_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_cartridge_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[print_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_print_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[dwnld_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_dwnld_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SqlSrc]パネルの[sql_src]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSqlSrc_sql_src_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cond_col]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cond_col_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cond_val]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cond_val_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[biz_dat_file_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_biz_dat_file_typ_VC(MCEventInfo info){
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
		if (nc == RegTabTab) doRegTab_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_biz_dat_id) doCnd_biz_dat_id_NC(info);
		else if (nc == Cnd_biz_dat_nm) doCnd_biz_dat_nm_NC(info);
		else if (nc == Base_biz_dat_id) doBase_biz_dat_id_NC(info);
		else if (nc == Base_biz_dat_nm) doBase_biz_dat_nm_NC(info);
		else if (nc == Base_admin_flg) doBase_admin_flg_NC(info);
		else if (nc == Base_module_id) doBase_module_id_NC(info);
		else if (nc == Base_screen_id) doBase_screen_id_NC(info);
		else if (nc == Base_func_actyp) doBase_func_actyp_NC(info);
		else if (nc == Base_biz_dat_rmrks1) doBase_biz_dat_rmrks1_NC(info);
		else if (nc == Base_biz_dat_rmrks2) doBase_biz_dat_rmrks2_NC(info);
		else if (nc == Base_biz_dat_rmrks3) doBase_biz_dat_rmrks3_NC(info);
		else if (nc == Base_form_file_nm) doBase_form_file_nm_NC(info);
		else if (nc == Base_cartridge) doBase_cartridge_NC(info);
		else if (nc == Base_cartridge_nm) doBase_cartridge_nm_NC(info);
		else if (nc == Base_print_flg) doBase_print_flg_NC(info);
		else if (nc == Base_dwnld_flg) doBase_dwnld_flg_NC(info);
		else if (nc == Base_ins_usr_id) doBase_ins_usr_id_NC(info);
		else if (nc == Base_ins_usr_nm) doBase_ins_usr_nm_NC(info);
		else if (nc == Base_ins_func_id) doBase_ins_func_id_NC(info);
		else if (nc == Base_ins_func_nm) doBase_ins_func_nm_NC(info);
		else if (nc == Base_upd_cntr) doBase_upd_cntr_NC(info);
		else if (nc == Base_upd_usr_id) doBase_upd_usr_id_NC(info);
		else if (nc == Base_upd_usr_nm) doBase_upd_usr_nm_NC(info);
		else if (nc == Base_upd_func_id) doBase_upd_func_id_NC(info);
		else if (nc == Base_upd_func_nm) doBase_upd_func_nm_NC(info);
		else if (nc == Base_ins_ts) doBase_ins_ts_NC(info);
		else if (nc == Base_upd_ts) doBase_upd_ts_NC(info);
		else if (nc == Base_upd_srv_req_no) doBase_upd_srv_req_no_NC(info);
		else if (nc == SqlSrc_sql_src) doSqlSrc_sql_src_NC(info);
		else if (nc == columnDtl_cond_col) doDtl_cond_col_NC(info);
		else if (nc == columnDtl_cond_val) doDtl_cond_val_NC(info);
		else if (nc == Btn_biz_dat_file_typ_Group) doBtn_biz_dat_file_typ_NC(info);
	}

	/**
	 * [RegTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRegTab_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[biz_dat_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_dat_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_dat_id_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_dat_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_dat_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[admin_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_admin_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[module_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_module_id_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[screen_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_screen_id_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[func_actyp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_func_actyp_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_dat_rmrks1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_dat_rmrks1_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_dat_rmrks2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_dat_rmrks2_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_dat_rmrks3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_dat_rmrks3_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[form_file_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_form_file_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cartridge]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cartridge_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cartridge_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cartridge_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[print_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_print_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[dwnld_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_dwnld_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [SqlSrc]パネルの[sql_src]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSqlSrc_sql_src_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cond_col]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cond_col_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cond_val]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cond_val_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[biz_dat_file_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_biz_dat_file_typ_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RegTabTab) doRegTab_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_biz_dat_id) doCnd_biz_dat_id_NE(info);
		else if (ne == Cnd_biz_dat_nm) doCnd_biz_dat_nm_NE(info);
		else if (ne == Base_biz_dat_id) doBase_biz_dat_id_NE(info);
		else if (ne == Base_biz_dat_nm) doBase_biz_dat_nm_NE(info);
		else if (ne == Base_admin_flg) doBase_admin_flg_NE(info);
		else if (ne == Base_module_id) doBase_module_id_NE(info);
		else if (ne == Base_screen_id) doBase_screen_id_NE(info);
		else if (ne == Base_func_actyp) doBase_func_actyp_NE(info);
		else if (ne == Base_biz_dat_rmrks1) doBase_biz_dat_rmrks1_NE(info);
		else if (ne == Base_biz_dat_rmrks2) doBase_biz_dat_rmrks2_NE(info);
		else if (ne == Base_biz_dat_rmrks3) doBase_biz_dat_rmrks3_NE(info);
		else if (ne == Base_form_file_nm) doBase_form_file_nm_NE(info);
		else if (ne == Base_cartridge) doBase_cartridge_NE(info);
		else if (ne == Base_cartridge_nm) doBase_cartridge_nm_NE(info);
		else if (ne == Base_print_flg) doBase_print_flg_NE(info);
		else if (ne == Base_dwnld_flg) doBase_dwnld_flg_NE(info);
		else if (ne == Base_ins_usr_id) doBase_ins_usr_id_NE(info);
		else if (ne == Base_ins_usr_nm) doBase_ins_usr_nm_NE(info);
		else if (ne == Base_ins_func_id) doBase_ins_func_id_NE(info);
		else if (ne == Base_ins_func_nm) doBase_ins_func_nm_NE(info);
		else if (ne == Base_upd_cntr) doBase_upd_cntr_NE(info);
		else if (ne == Base_upd_usr_id) doBase_upd_usr_id_NE(info);
		else if (ne == Base_upd_usr_nm) doBase_upd_usr_nm_NE(info);
		else if (ne == Base_upd_func_id) doBase_upd_func_id_NE(info);
		else if (ne == Base_upd_func_nm) doBase_upd_func_nm_NE(info);
		else if (ne == Base_ins_ts) doBase_ins_ts_NE(info);
		else if (ne == Base_upd_ts) doBase_upd_ts_NE(info);
		else if (ne == Base_upd_srv_req_no) doBase_upd_srv_req_no_NE(info);
		else if (ne == SqlSrc_sql_src) doSqlSrc_sql_src_NE(info);
		else if (ne == columnDtl_cond_col) doDtl_cond_col_NE(info);
		else if (ne == columnDtl_cond_val) doDtl_cond_val_NE(info);
		else if (ne == Btn_biz_dat_file_typ_Group) doBtn_biz_dat_file_typ_NE(info);
	}

	/**
	 * [RegTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRegTab_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[biz_dat_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_dat_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_dat_id_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_dat_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_dat_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[admin_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_admin_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[module_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_module_id_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[screen_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_screen_id_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[func_actyp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_func_actyp_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_dat_rmrks1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_dat_rmrks1_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_dat_rmrks2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_dat_rmrks2_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_dat_rmrks3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_dat_rmrks3_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[form_file_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_form_file_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cartridge]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cartridge_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cartridge_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cartridge_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[print_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_print_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[dwnld_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_dwnld_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [SqlSrc]パネルの[sql_src]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSqlSrc_sql_src_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cond_col]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cond_col_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cond_val]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cond_val_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[biz_dat_file_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_biz_dat_file_typ_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RegTabTab) doRegTab_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_biz_dat_id) doCnd_biz_dat_id_NX(info);
		else if (nx == Cnd_biz_dat_nm) doCnd_biz_dat_nm_NX(info);
		else if (nx == Base_biz_dat_id) doBase_biz_dat_id_NX(info);
		else if (nx == Base_biz_dat_nm) doBase_biz_dat_nm_NX(info);
		else if (nx == Base_admin_flg) doBase_admin_flg_NX(info);
		else if (nx == Base_module_id) doBase_module_id_NX(info);
		else if (nx == Base_screen_id) doBase_screen_id_NX(info);
		else if (nx == Base_func_actyp) doBase_func_actyp_NX(info);
		else if (nx == Base_biz_dat_rmrks1) doBase_biz_dat_rmrks1_NX(info);
		else if (nx == Base_biz_dat_rmrks2) doBase_biz_dat_rmrks2_NX(info);
		else if (nx == Base_biz_dat_rmrks3) doBase_biz_dat_rmrks3_NX(info);
		else if (nx == Base_form_file_nm) doBase_form_file_nm_NX(info);
		else if (nx == Base_cartridge) doBase_cartridge_NX(info);
		else if (nx == Base_cartridge_nm) doBase_cartridge_nm_NX(info);
		else if (nx == Base_print_flg) doBase_print_flg_NX(info);
		else if (nx == Base_dwnld_flg) doBase_dwnld_flg_NX(info);
		else if (nx == Base_ins_usr_id) doBase_ins_usr_id_NX(info);
		else if (nx == Base_ins_usr_nm) doBase_ins_usr_nm_NX(info);
		else if (nx == Base_ins_func_id) doBase_ins_func_id_NX(info);
		else if (nx == Base_ins_func_nm) doBase_ins_func_nm_NX(info);
		else if (nx == Base_upd_cntr) doBase_upd_cntr_NX(info);
		else if (nx == Base_upd_usr_id) doBase_upd_usr_id_NX(info);
		else if (nx == Base_upd_usr_nm) doBase_upd_usr_nm_NX(info);
		else if (nx == Base_upd_func_id) doBase_upd_func_id_NX(info);
		else if (nx == Base_upd_func_nm) doBase_upd_func_nm_NX(info);
		else if (nx == Base_ins_ts) doBase_ins_ts_NX(info);
		else if (nx == Base_upd_ts) doBase_upd_ts_NX(info);
		else if (nx == Base_upd_srv_req_no) doBase_upd_srv_req_no_NX(info);
		else if (nx == SqlSrc_sql_src) doSqlSrc_sql_src_NX(info);
		else if (nx == columnDtl_cond_col) doDtl_cond_col_NX(info);
		else if (nx == columnDtl_cond_val) doDtl_cond_val_NX(info);
		else if (nx == Btn_biz_dat_file_typ_Group) doBtn_biz_dat_file_typ_NX(info);
	}

	/**
	 * [RegTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRegTab_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[biz_dat_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_dat_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_dat_id_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_dat_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_dat_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[admin_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_admin_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[module_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_module_id_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[screen_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_screen_id_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[func_actyp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_func_actyp_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_dat_rmrks1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_dat_rmrks1_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_dat_rmrks2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_dat_rmrks2_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_dat_rmrks3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_dat_rmrks3_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[form_file_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_form_file_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cartridge]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cartridge_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cartridge_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cartridge_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[print_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_print_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[dwnld_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_dwnld_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [SqlSrc]パネルの[sql_src]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSqlSrc_sql_src_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cond_col]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cond_col_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cond_val]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cond_val_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[biz_dat_file_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_biz_dat_file_typ_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_biz_dat_id) doCnd_biz_dat_id_LC(info);
		else if (lc == Cnd_biz_dat_nm) doCnd_biz_dat_nm_LC(info);
		else if (lc == Base_biz_dat_id) doBase_biz_dat_id_LC(info);
		else if (lc == Base_biz_dat_nm) doBase_biz_dat_nm_LC(info);
		else if (lc == Base_module_id) doBase_module_id_LC(info);
		else if (lc == Base_screen_id) doBase_screen_id_LC(info);
		else if (lc == Base_func_actyp) doBase_func_actyp_LC(info);
		else if (lc == Base_form_file_nm) doBase_form_file_nm_LC(info);
		else if (lc == Base_cartridge) doBase_cartridge_LC(info);
		else if (lc == Base_cartridge_nm) doBase_cartridge_nm_LC(info);
		else if (lc == Base_ins_usr_id) doBase_ins_usr_id_LC(info);
		else if (lc == Base_ins_usr_nm) doBase_ins_usr_nm_LC(info);
		else if (lc == Base_ins_func_id) doBase_ins_func_id_LC(info);
		else if (lc == Base_ins_func_nm) doBase_ins_func_nm_LC(info);
		else if (lc == Base_upd_cntr) doBase_upd_cntr_LC(info);
		else if (lc == Base_upd_usr_id) doBase_upd_usr_id_LC(info);
		else if (lc == Base_upd_usr_nm) doBase_upd_usr_nm_LC(info);
		else if (lc == Base_upd_func_id) doBase_upd_func_id_LC(info);
		else if (lc == Base_upd_func_nm) doBase_upd_func_nm_LC(info);
		else if (lc == Base_ins_ts) doBase_ins_ts_LC(info);
		else if (lc == Base_upd_ts) doBase_upd_ts_LC(info);
		else if (lc == Base_upd_srv_req_no) doBase_upd_srv_req_no_LC(info);
		else if (lc == columnDtl_cond_col) doDtl_cond_col_LC(info);
		else if (lc == columnDtl_cond_val) doDtl_cond_val_LC(info);
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_dat_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_dat_id_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_dat_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_dat_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[module_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_module_id_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[screen_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_screen_id_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[func_actyp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_func_actyp_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[form_file_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_form_file_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cartridge]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cartridge_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cartridge_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cartridge_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cond_col]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cond_col_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cond_val]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cond_val_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_biz_dat_id]の作成メソッド
	 */
	public MCList getCnd_biz_dat_id(MCRow row, MCEventInfo info){
		return ((mcframe.clientMBUA.MBUAP0010.MBUAP_List)MCListLogic.create("mcframe.clientMBUA.MBUAP0010.MBUAP_List", this)).getBizDatID(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_module_id]の作成メソッド
	 */
	public MCList getBase_module_id(MCRow row, MCEventInfo info){
		return ((mcframe.clientFSUA.FSUAP0010.FSUAP_List)MCListLogic.create("mcframe.clientFSUA.FSUAP0010.FSUAP_List", this)).getModule(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_screen_id]の作成メソッド
	 */
	public MCList getBase_screen_id(MCRow row, MCEventInfo info){
		return ((mcframe.clientFSUA.FSUAP0010.FSUAP_List)MCListLogic.create("mcframe.clientFSUA.FSUAP0010.FSUAP_List", this)).getUserMemoScreenID(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_cartridge]の作成メソッド
	 */
	public MCList getBase_cartridge(MCRow row, MCEventInfo info){
		return ((mcframe.clientFSUA.FSUAP0010.FSUAP_List)MCListLogic.create("mcframe.clientFSUA.FSUAP0010.FSUAP_List", this)).getReportCartridge(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBEL0060.Srch01")) {
			return new MB_MBBEL0060_Srch01Bridge();
		}
		if (id.equals("MB.MBBEL0060.Srch02")) {
			return new MB_MBBEL0060_Srch02Bridge();
		}
		if (id.equals("MB.MBBEL0060.Ins01")) {
			return new MB_MBBEL0060_Ins01Bridge();
		}
		if (id.equals("MB.MBBEL0060.Upd01")) {
			return new MB_MBBEL0060_Upd01Bridge();
		}
		if (id.equals("MB.MBBEL0060.Del01")) {
			return new MB_MBBEL0060_Del01Bridge();
		}
		if (id.equals("MB.MBBEL0040.Prnt01")) {
			return new MB_MBBEL0040_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBEL0060_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0060_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBEL0060_Srch01;

		/** コンストラクタ */
		protected MB_MBBEL0060_Srch01Bridge() {
			p_MB_MBBEL0060_Srch01 = new MCParam(PDef.MB_MBBEL0060_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBEL0060_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBE.MBBEP0060.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMBBE.MBBEP0060.BaseR.create());
			param.addDownBlock(mcframe.clientMBBE.MBBEP0060.SqlSrcR.create());
			param.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0060.DtlR.class));

			p_MB_MBBEL0060_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBEL0060_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBEL0060_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBEL0060_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBEL0060_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBE.MBBEP0060.CndR up0() {
			return (mcframe.clientMBBE.MBBEP0060.CndR)up(0);
		}

		protected mcframe.clientMBBE.MBBEP0060.BaseR down0() {
			return (mcframe.clientMBBE.MBBEP0060.BaseR)down(0);
		}
		protected mcframe.clientMBBE.MBBEP0060.SqlSrcR down1() {
			return (mcframe.clientMBBE.MBBEP0060.SqlSrcR)down(1);
		}
		protected MCList<mcframe.clientMBBE.MBBEP0060.DtlR> down2() {
			return (MCList<mcframe.clientMBBE.MBBEP0060.DtlR>)down(2);
		}

		protected void setupDownParam() {
			p_MB_MBBEL0060_Srch01.addDownBlock(mcframe.clientMBBE.MBBEP0060.BaseR.create());
			p_MB_MBBEL0060_Srch01.addDownBlock(mcframe.clientMBBE.MBBEP0060.SqlSrcR.create());
			p_MB_MBBEL0060_Srch01.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0060.DtlR.class));
		}
		protected MCParam param() {
			return p_MB_MBBEL0060_Srch01;
		}

		protected void show() {
			setBaseR((mcframe.clientMBBE.MBBEP0060.BaseR)p_MB_MBBEL0060_Srch01.getContainerParam().getDownBlock(0));
			setSqlSrcR((mcframe.clientMBBE.MBBEP0060.SqlSrcR)p_MB_MBBEL0060_Srch01.getContainerParam().getDownBlock(1));
			setDtlL((MCList<mcframe.clientMBBE.MBBEP0060.DtlR>)p_MB_MBBEL0060_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getBaseR().clear();
			getSqlSrcR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getBaseR());
			result.add(getSqlSrcR());
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MB_MBBEL0060_Srch02]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0060_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBEL0060_Srch02;

		/** コンストラクタ */
		protected MB_MBBEL0060_Srch02Bridge() {
			p_MB_MBBEL0060_Srch02 = new MCParam(PDef.MB_MBBEL0060_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBEL0060_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBE.MBBEP0060.SqlSrcR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0060.DtlR.class));

			p_MB_MBBEL0060_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBEL0060_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBEL0060_Srch02.addUpBlock(getSqlSrcR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBEL0060_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBEL0060_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBE.MBBEP0060.SqlSrcR up0() {
			return (mcframe.clientMBBE.MBBEP0060.SqlSrcR)up(0);
		}

		protected MCList<mcframe.clientMBBE.MBBEP0060.DtlR> down0() {
			return (MCList<mcframe.clientMBBE.MBBEP0060.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBEL0060_Srch02.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0060.DtlR.class));
		}
		protected MCParam param() {
			return p_MB_MBBEL0060_Srch02;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMBBE.MBBEP0060.DtlR>)p_MB_MBBEL0060_Srch02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getSqlSrcR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MB_MBBEL0060_Ins01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0060_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBEL0060_Ins01;

		/** コンストラクタ */
		protected MB_MBBEL0060_Ins01Bridge() {
			p_MB_MBBEL0060_Ins01 = new MCParam(PDef.MB_MBBEL0060_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBEL0060_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBE.MBBEP0060.BaseR.create());
			param.addUpBlock(mcframe.clientMBBE.MBBEP0060.SqlSrcR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0060.DtlR.class));

			p_MB_MBBEL0060_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBEL0060_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBEL0060_Ins01.addUpBlock(getBaseR());
			p_MB_MBBEL0060_Ins01.addUpBlock(getSqlSrcR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBEL0060_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBEL0060_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBE.MBBEP0060.BaseR up0() {
			return (mcframe.clientMBBE.MBBEP0060.BaseR)up(0);
		}
		protected mcframe.clientMBBE.MBBEP0060.SqlSrcR up1() {
			return (mcframe.clientMBBE.MBBEP0060.SqlSrcR)up(1);
		}

		protected MCList<mcframe.clientMBBE.MBBEP0060.DtlR> down0() {
			return (MCList<mcframe.clientMBBE.MBBEP0060.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBEL0060_Ins01.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0060.DtlR.class));
		}
		protected MCParam param() {
			return p_MB_MBBEL0060_Ins01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMBBE.MBBEP0060.DtlR>)p_MB_MBBEL0060_Ins01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getBaseR());
			result.add(getSqlSrcR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MB_MBBEL0060_Upd01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0060_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBEL0060_Upd01;

		/** コンストラクタ */
		protected MB_MBBEL0060_Upd01Bridge() {
			p_MB_MBBEL0060_Upd01 = new MCParam(PDef.MB_MBBEL0060_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBEL0060_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBE.MBBEP0060.BaseR.create());
			param.addUpBlock(mcframe.clientMBBE.MBBEP0060.SqlSrcR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0060.DtlR.class));

			p_MB_MBBEL0060_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBEL0060_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBEL0060_Upd01.addUpBlock(getBaseR());
			p_MB_MBBEL0060_Upd01.addUpBlock(getSqlSrcR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBEL0060_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBEL0060_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBE.MBBEP0060.BaseR up0() {
			return (mcframe.clientMBBE.MBBEP0060.BaseR)up(0);
		}
		protected mcframe.clientMBBE.MBBEP0060.SqlSrcR up1() {
			return (mcframe.clientMBBE.MBBEP0060.SqlSrcR)up(1);
		}

		protected MCList<mcframe.clientMBBE.MBBEP0060.DtlR> down0() {
			return (MCList<mcframe.clientMBBE.MBBEP0060.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBEL0060_Upd01.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0060.DtlR.class));
		}
		protected MCParam param() {
			return p_MB_MBBEL0060_Upd01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMBBE.MBBEP0060.DtlR>)p_MB_MBBEL0060_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getBaseR());
			result.add(getSqlSrcR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MB_MBBEL0060_Del01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0060_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBEL0060_Del01;

		/** コンストラクタ */
		protected MB_MBBEL0060_Del01Bridge() {
			p_MB_MBBEL0060_Del01 = new MCParam(PDef.MB_MBBEL0060_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBEL0060_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBE.MBBEP0060.BaseR.create());
			// Down

			p_MB_MBBEL0060_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBEL0060_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBEL0060_Del01.addUpBlock(getBaseR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBEL0060_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBEL0060_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBE.MBBEP0060.BaseR up0() {
			return (mcframe.clientMBBE.MBBEP0060.BaseR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MB_MBBEL0060_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getBaseR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MB_MBBEL0040_Prnt01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0040_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBEL0040_Prnt01;

		/** コンストラクタ */
		protected MB_MBBEL0040_Prnt01Bridge() {
			p_MB_MBBEL0040_Prnt01 = new MCParam(PDef.MB_MBBEL0040_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBEL0040_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBE.MBBEP0060.BaseR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0060.RsltR.class));
			param.addDownBlock(mcframe.clientMBBE.MBBEP0060.RsltLblR.create());
			param.addDownBlock(mcframe.clientMBBE.MBBEP0060.RsltSmlR.create());

			p_MB_MBBEL0040_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBEL0040_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBEL0040_Prnt01.addUpBlock(getBaseR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBEL0040_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBEL0040_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBE.MBBEP0060.BaseR up0() {
			return (mcframe.clientMBBE.MBBEP0060.BaseR)up(0);
		}

		protected MCList<mcframe.clientMBBE.MBBEP0060.RsltR> down0() {
			return (MCList<mcframe.clientMBBE.MBBEP0060.RsltR>)down(0);
		}
		protected mcframe.clientMBBE.MBBEP0060.RsltLblR down1() {
			return (mcframe.clientMBBE.MBBEP0060.RsltLblR)down(1);
		}
		protected mcframe.clientMBBE.MBBEP0060.RsltSmlR down2() {
			return (mcframe.clientMBBE.MBBEP0060.RsltSmlR)down(2);
		}

		protected void setupDownParam() {
			p_MB_MBBEL0040_Prnt01.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0060.RsltR.class));
			p_MB_MBBEL0040_Prnt01.addDownBlock(mcframe.clientMBBE.MBBEP0060.RsltLblR.create());
			p_MB_MBBEL0040_Prnt01.addDownBlock(mcframe.clientMBBE.MBBEP0060.RsltSmlR.create());
		}
		protected MCParam param() {
			return p_MB_MBBEL0040_Prnt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBE.MBBEP0060.RsltR>)p_MB_MBBEL0040_Prnt01.getContainerParam().getDownBlock(0));
			setRsltLblR((mcframe.clientMBBE.MBBEP0060.RsltLblR)p_MB_MBBEL0040_Prnt01.getContainerParam().getDownBlock(1));
			setRsltSmlR((mcframe.clientMBBE.MBBEP0060.RsltSmlR)p_MB_MBBEL0040_Prnt01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getRsltL().clear();
			getRsltLblR().clear();
			getRsltSmlR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getBaseR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getRsltLblR());
			result.add(getRsltSmlR());
			return result;
		}
	}
}