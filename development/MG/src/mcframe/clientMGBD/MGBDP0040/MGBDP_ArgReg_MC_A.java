package mcframe.clientMGBD.MGBDP0040;

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
import mcframe.clientMGBD.MGBDP0040.MGBDP_ArgReg_MC.MG_MGBDL0040_Srch01Caller;
import mcframe.clientMGBD.MGBDP0040.MGBDP_ArgReg_MC.MG_MGBDL0040_Ins01Caller;
import mcframe.clientMGBD.MGBDP0040.MGBDP_ArgReg_MC.MG_MGBDL0040_Del01Caller;
import mcframe.clientMGBD.MGBDP0040.MGBDP_ArgReg_MC.MG_MGBDL0040_Ins02Caller;
import mcframe.clientMGBD.MGBDP0040.MGBDP_ArgReg_MC.MG_MGBDL0040_Del02Caller;

/**
 * 画面"MGBDP_ArgReg"パネルクラスです。<p>
 *
 * 原価計算結果を確定する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDP_ArgReg_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBD";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBDP0040";

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
	 * INS01,Firm,INS01;DEL01,Cancel firming,DEL01;INS02,Export to accounting IF,INS02;DEL02,Cancel exporting to accounting IF,DEL02 INS01,確定する,INS01;DEL01,確定を取り消す,DEL01;INS02,会計ＩＦに送信する,INS02;DEL02,会計ＩＦへの送信を取り消す,DEL02.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS01 = null;
	public MCRadioButton Cnd_ope_DEL01 = null;
	public MCRadioButton Cnd_ope_INS02 = null;
	public MCRadioButton Cnd_ope_DEL02 = null;
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H Cnd_term_p_PPanel;
	public MCDateComboBox Cnd_term;	// [Cnd]の[term_p.term]を[Cnd_term]としてエイリアス定義。
	public MCDateField Cnd_term_end_ym;	// [Cnd]の[term_p.term_end_ym]を[Cnd_term_end_ym]としてエイリアス定義。
	public MCLabel Cnd_calc_grp_cd_Label = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_grp_nm = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0040.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ym = null;
	public mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D Rslt_term_p_PPanel;
	public MCColumnConfig columnRslt_term;// [Rslt]の[term_p.term]を[columnRslt_term]としてエイリアス定義。
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_no = null;
	/**
	 * Accounting IF sent 会計ＩＦ送信済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_if_flg = null;
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_srv_req_no = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0040.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ym = null;
	public mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D Dtl_term_p_PPanel;
	public MCColumnConfig columnDtl_term;// [Dtl]の[term_p.term]を[columnDtl_term]としてエイリアス定義。
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_no = null;
	/**
	 * Accounting IF sent 会計ＩＦ送信済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_if_flg = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_grp_cd = null;
	/**
	 * Calculation first month 計算対象先頭月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_st_ym = null;
	/**
	 * Calculation last month 計算対象末尾月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_end_ym = null;
	/**
	 * Calculation user cd. 計算者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_usr_cd = null;
	/**
	 * Calculation user name 計算者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_usr_nm = null;
	/**
	 * Calculation start time 計算開始時刻.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_st = null;
	/**
	 * Calculation end time 計算終了時刻.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_fin = null;
	/**
	 * Calculation time (Hour:minute:second) 計算時間（時：分：秒）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_time = null;
	/**
	 * Entry request No. 登録リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_srv_req_no = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char3 = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Dtl_rts_msg_p_PPanel;
	public MCColumnConfig columnDtl_rtn_sts_typ;// [Dtl]の[rts_msg_p.rtn_sts_typ]を[columnDtl_rtn_sts_typ]としてエイリアス定義。
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts = null;
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Cost calculation results 原価計算結果確認.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0030 = null;
	/**
	 * Accounting cost info. 会計原価情報一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MBBBP0080 = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_reg = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_send_reg = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del_reg_cancel = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del_send_cancel = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [INS_REG]モードを表す定数 */
	public static final String INS_REG = "INS_REG";
	/** [DEL_REG]モードを表す定数 */
	public static final String DEL_REG = "DEL_REG";
	/** [INS_SEND]モードを表す定数 */
	public static final String INS_SEND = "INS_SEND";
	/** [FIX_IS]モードを表す定数 */
	public static final String FIX_IS = "FIX_IS";
	/** [DEL_SEND]モードを表す定数 */
	public static final String DEL_SEND = "DEL_SEND";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, INS_REG, DEL_REG, INS_SEND, FIX_IS, DEL_SEND};
	
	/** [MG_MGBDL0040_Srch01]のCallerの作成 */
	protected MGBDP_ArgReg_MC.MG_MGBDL0040_Srch01Caller createMG_MGBDL0040_Srch01() {
		MGBDP_ArgReg_MC.MG_MGBDL0040_Srch01Caller<MGBDP_ArgReg, MG_MGBDL0040_Srch01Bridge>
		caller = ((MGBDP_ArgReg_MC)this).new MG_MGBDL0040_Srch01Caller<MGBDP_ArgReg, MG_MGBDL0040_Srch01Bridge>(
					(MGBDP_ArgReg)this, new MG_MGBDL0040_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBDL0040_Srch01]の呼び出し */
	protected void callMG_MGBDL0040_Srch01() {
		MCCaller caller = createMG_MGBDL0040_Srch01();
		caller.exec();
	}
	/** [MG_MGBDL0040_Ins01]のCallerの作成 */
	protected MGBDP_ArgReg_MC.MG_MGBDL0040_Ins01Caller createMG_MGBDL0040_Ins01() {
		MGBDP_ArgReg_MC.MG_MGBDL0040_Ins01Caller<MGBDP_ArgReg, MG_MGBDL0040_Ins01Bridge>
		caller = ((MGBDP_ArgReg_MC)this).new MG_MGBDL0040_Ins01Caller<MGBDP_ArgReg, MG_MGBDL0040_Ins01Bridge>(
					(MGBDP_ArgReg)this, new MG_MGBDL0040_Ins01Bridge());
		return caller;
	}
	/** [MG_MGBDL0040_Ins01]の呼び出し */
	protected void callMG_MGBDL0040_Ins01() {
		MCCaller caller = createMG_MGBDL0040_Ins01();
		caller.exec();
	}
	/** [MG_MGBDL0040_Del01]のCallerの作成 */
	protected MGBDP_ArgReg_MC.MG_MGBDL0040_Del01Caller createMG_MGBDL0040_Del01() {
		MGBDP_ArgReg_MC.MG_MGBDL0040_Del01Caller<MGBDP_ArgReg, MG_MGBDL0040_Del01Bridge>
		caller = ((MGBDP_ArgReg_MC)this).new MG_MGBDL0040_Del01Caller<MGBDP_ArgReg, MG_MGBDL0040_Del01Bridge>(
					(MGBDP_ArgReg)this, new MG_MGBDL0040_Del01Bridge());
		return caller;
	}
	/** [MG_MGBDL0040_Del01]の呼び出し */
	protected void callMG_MGBDL0040_Del01() {
		MCCaller caller = createMG_MGBDL0040_Del01();
		caller.exec();
	}
	/** [MG_MGBDL0040_Ins02]のCallerの作成 */
	protected MGBDP_ArgReg_MC.MG_MGBDL0040_Ins02Caller createMG_MGBDL0040_Ins02() {
		MGBDP_ArgReg_MC.MG_MGBDL0040_Ins02Caller<MGBDP_ArgReg, MG_MGBDL0040_Ins02Bridge>
		caller = ((MGBDP_ArgReg_MC)this).new MG_MGBDL0040_Ins02Caller<MGBDP_ArgReg, MG_MGBDL0040_Ins02Bridge>(
					(MGBDP_ArgReg)this, new MG_MGBDL0040_Ins02Bridge());
		return caller;
	}
	/** [MG_MGBDL0040_Ins02]の呼び出し */
	protected void callMG_MGBDL0040_Ins02() {
		MCCaller caller = createMG_MGBDL0040_Ins02();
		caller.exec();
	}
	/** [MG_MGBDL0040_Del02]のCallerの作成 */
	protected MGBDP_ArgReg_MC.MG_MGBDL0040_Del02Caller createMG_MGBDL0040_Del02() {
		MGBDP_ArgReg_MC.MG_MGBDL0040_Del02Caller<MGBDP_ArgReg, MG_MGBDL0040_Del02Bridge>
		caller = ((MGBDP_ArgReg_MC)this).new MG_MGBDL0040_Del02Caller<MGBDP_ArgReg, MG_MGBDL0040_Del02Bridge>(
					(MGBDP_ArgReg)this, new MG_MGBDL0040_Del02Bridge());
		return caller;
	}
	/** [MG_MGBDL0040_Del02]の呼び出し */
	protected void callMG_MGBDL0040_Del02() {
		MCCaller caller = createMG_MGBDL0040_Del02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0040.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0040.RsltR> aRsltL;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0040.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBD.MGBDP0040.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0040.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0040.CndR createCndR() {
		return mcframe.clientMGBD.MGBDP0040.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBD.MGBDP0040.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0040.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBD.MGBDP0040.RsltR createRsltR() {
		return mcframe.clientMGBD.MGBDP0040.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0040.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0040.RsltR.class);
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
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMGBD.MGBDP0040.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0040.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMGBD.MGBDP0040.DtlR createDtlR() {
		return mcframe.clientMGBD.MGBDP0040.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0040.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0040.DtlR.class);
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
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
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
		if(aCnt == getRsltL()) return "Rslt";
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
		if(bId.equals("Rslt")) return getRsltL();
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
		ret.add(RsltPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_ArgReg_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBDP_ArgReg_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBDP_ArgReg_MC.jbCreateScreenOpe((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.jbCreateCnd((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.jbCreateRslt((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.jbCreateDtl((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.jbCreateBtn((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.jbCreateEastBtn((MGBDP_ArgReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBDP_ArgReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBDP_ArgReg p) {
		p.Cnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getCndR().term_p());
		p.Cnd_term_p_PPanel.setName("Cnd.term_p");
		p.Cnd_term = p.Cnd_term_p_PPanel.Term_term;
		p.Cnd_term.addAliasName("Cnd.term", p);
		p.Cnd_term_end_ym = p.Cnd_term_p_PPanel.Term_term_end_ym;
		p.Cnd_term_end_ym.addAliasName("Cnd.term_end_ym", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBDP_ArgReg p) {
		p.Rslt_term_p_PPanel = mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.create(mcframe.clientMGBD.MGBDP0040.RsltR.$term_p);
		p.Rslt_term_p_PPanel.setName("Rslt.term_p");
		p.columnRslt_term = p.Rslt_term_p_PPanel.columnTerm_term;
		p.columnRslt_term.addAliasName("Rslt.term", p);
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MGBDP_ArgReg p) {
		p.Dtl_term_p_PPanel = mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.create(mcframe.clientMGBD.MGBDP0040.DtlR.$term_p);
		p.Dtl_term_p_PPanel.setName("Dtl.term_p");
		p.columnDtl_term = p.Dtl_term_p_PPanel.columnTerm_term;
		p.columnDtl_term.addAliasName("Dtl.term", p);
		p.Dtl_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMGBD.MGBDP0040.DtlR.$rts_msg_p);
		p.Dtl_rts_msg_p_PPanel.setName("Dtl.rts_msg_p");
		p.columnDtl_rtn_sts_typ = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnDtl_rtn_sts_typ.addAliasName("Dtl.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBDP_ArgReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MGBDP_ArgReg p) {
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

	
	/** [Cnd_calc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_calc_grp_cd_p = null;

	/**
	 * [Cnd_calc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_grp_cd_ListPutter() {
		if (Cnd_calc_grp_cd_p == null) {
			Cnd_calc_grp_cd_p = createCnd_calc_grp_cd_ListPutter(Cnd_calc_grp_cd, "calc_grp_cd", "calc_grp_nm");

		}
		return Cnd_calc_grp_cd_p;
	}
	
	
	/** [Dtl_calc_no_ListPutter]の定義 */
	private MCListPutter Dtl_calc_no_p = null;

	/**
	 * [Dtl_calc_no_ListPutter]の取得
	 */
	protected MCListPutter getDtl_calc_no_ListPutter() {
		if (Dtl_calc_no_p == null) {
			Dtl_calc_no_p = createDtl_calc_no_ListPutter(columnDtl_calc_no, "calc_no");

		}
		return Dtl_calc_no_p;
	}
	
	
	/** [Dtl_calc_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_calc_grp_cd_p = null;

	/**
	 * [Dtl_calc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_calc_grp_cd_ListPutter() {
		if (Dtl_calc_grp_cd_p == null) {
			Dtl_calc_grp_cd_p = createDtl_calc_grp_cd_ListPutter(columnDtl_calc_grp_cd, "calc_grp_cd");

		}
		return Dtl_calc_grp_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_ArgReg create(){
		MGBDP_ArgReg p = new MGBDP_ArgReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_ArgReg create(String name){
		MGBDP_ArgReg p = new MGBDP_ArgReg(name);
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
		MGBDP_ArgReg_MC.jbfInitScreenOpe((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.jbfInitCnd((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.jbfInitRslt((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.jbfInitDtl((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.jbfInitBtn((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.jbfInitEastBtn((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.jbInitScreenOpe((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.jbInitCnd((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.jbInitRslt((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.jbInitDtl((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.jbInitBtn((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.jbInitEastBtn((MGBDP_ArgReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBDP_ArgReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBDP_ArgReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS01 = p.beansFactory.createRadioButton("Cnd.ope_INS01");
		p.Cnd_ope_DEL01 = p.beansFactory.createRadioButton("Cnd.ope_DEL01");
		p.Cnd_ope_INS02 = p.beansFactory.createRadioButton("Cnd.ope_INS02");
		p.Cnd_ope_DEL02 = p.beansFactory.createRadioButton("Cnd.ope_DEL02");
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBDP_ArgReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_ym = p.beansFactory.createTableColumn("Rslt.ym", MCColumnType.DATE);
		p.columnRslt_calc_no = p.beansFactory.createTableColumn("Rslt.calc_no", MCColumnType.TEXT);
		p.columnRslt_ac_if_flg = p.beansFactory.createTableColumn("Rslt.ac_if_flg", MCColumnType.CHECK);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MGBDP_ArgReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_ym = p.beansFactory.createTableColumn("Dtl.ym", MCColumnType.DATE);
		p.columnDtl_calc_no = p.beansFactory.createTableColumn("Dtl.calc_no", MCColumnType.TEXT_COMBO);
		p.columnDtl_ac_if_flg = p.beansFactory.createTableColumn("Dtl.ac_if_flg", MCColumnType.CHECK);
		p.columnDtl_calc_grp_cd = p.beansFactory.createTableColumn("Dtl.calc_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_st_ym = p.beansFactory.createTableColumn("Dtl.st_ym", MCColumnType.DATE);
		p.columnDtl_end_ym = p.beansFactory.createTableColumn("Dtl.end_ym", MCColumnType.DATE);
		p.columnDtl_calc_usr_cd = p.beansFactory.createTableColumn("Dtl.calc_usr_cd", MCColumnType.TEXT);
		p.columnDtl_calc_usr_nm = p.beansFactory.createTableColumn("Dtl.calc_usr_nm", MCColumnType.TEXT);
		p.columnDtl_calc_st = p.beansFactory.createTableColumn("Dtl.calc_st", MCColumnType.DATE);
		p.columnDtl_calc_fin = p.beansFactory.createTableColumn("Dtl.calc_fin", MCColumnType.DATE);
		p.columnDtl_calc_time = p.beansFactory.createTableColumn("Dtl.calc_time", MCColumnType.TEXT);
		p.columnDtl_ins_srv_req_no = p.beansFactory.createTableColumn("Dtl.ins_srv_req_no", MCColumnType.TEXT);
		p.columnDtl_rmrks = p.beansFactory.createTableColumn("Dtl.rmrks", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBDP_ArgReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MGBDP0030 = p.beansFactory.createButton("Btn.open_MGBDP0030", "open");
		p.Btn_open_MBBBP0080 = p.beansFactory.createButton("Btn.open_MBBBP0080", "open");
		p.Btn_upd_reg = p.beansFactory.createButton("Btn.upd_reg", "upd");
		p.Btn_upd_send_reg = p.beansFactory.createButton("Btn.upd_send_reg", "upd");
		p.Btn_del_reg_cancel = p.beansFactory.createButton("Btn.del_reg_cancel", "del");
		p.Btn_del_send_cancel = p.beansFactory.createButton("Btn.del_send_cancel", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MGBDP_ArgReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBDP_ArgReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.CndPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NN");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBDP_ArgReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.RsltPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NN");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_INS01);
		p.Cnd_ope_INS01.setActionCommand("INS01");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS01);
		p.ScreenOpePanel.add(p.Cnd_ope_INS01);
		p.Cnd_ope_INS01.setNextBeans(p.Cnd_ope_DEL01);
		p.Cnd_ope_DEL01.setActionCommand("DEL01");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL01);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL01);
		p.Cnd_ope_DEL01.setNextBeans(p.Cnd_ope_INS02);
		p.Cnd_ope_INS02.setActionCommand("INS02");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS02);
		p.ScreenOpePanel.add(p.Cnd_ope_INS02);
		p.Cnd_ope_INS02.setNextBeans(p.Cnd_ope_DEL02);
		p.Cnd_ope_DEL02.setActionCommand("DEL02");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL02);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL02);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0040.CndR.ope_META);
		p.CndPanel.add(p.Cnd_term_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setListType(MCListType.STRICT);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0040.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_srch);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0040.CndR.calc_grp_nm_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MGBDP_ArgReg p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.DtlPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MGBDP_ArgReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlTable.setStatusColumnVisible(false);
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBDP_ArgReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MGBDP0030.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MGBDP0030);
		p.BtnPanel.setLastBeans(p.Btn_open_MGBDP0030);
		p.Btn_open_MGBDP0030.setNextBeans(p.Btn_open_MBBBP0080);
		p.Btn_open_MBBBP0080.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MBBBP0080);
		p.Btn_open_MBBBP0080.setNextBeans(p.Btn_upd_reg);
		p.Btn_upd_reg.setIcon("REGISTER");
		p.Btn_upd_reg.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_reg);
		p.Btn_upd_reg.setNextBeans(p.Btn_upd_send_reg);
		p.Btn_upd_send_reg.setIcon("REGISTER");
		p.Btn_upd_send_reg.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_send_reg);
		p.Btn_del_reg_cancel.setIcon("CANCEL");
		p.Btn_del_reg_cancel.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del_reg_cancel);
		p.EastBtnPanel.add(p.Btn_del_reg_cancel);
		p.Btn_del_reg_cancel.setNextBeans(p.Btn_del_send_cancel);
		p.Btn_del_send_cancel.setIcon("CANCEL");
		p.Btn_del_send_cancel.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_send_cancel);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MGBDP_ArgReg p) {
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
		MGBDP_ArgReg_MC.mcInitScreenOpe((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.mcInitCnd((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.mcInitRslt((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.mcInitDtl((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.mcInitBtn((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.mcInitEastBtn((MGBDP_ArgReg)this);

		// [SRCH]ステータスのモードの設定
		MGBDP_ArgReg_MC.statusInitSRCH_ScreenOpe((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitSRCH_Cnd((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitSRCH_Rslt((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitSRCH_Dtl((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitSRCH_Btn((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitSRCH_EastBtn((MGBDP_ArgReg)this);

		// [INS_REG]ステータスのモードの設定
		MGBDP_ArgReg_MC.statusInitINS__REG_ScreenOpe((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitINS__REG_Cnd((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitINS__REG_Rslt((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitINS__REG_Dtl((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitINS__REG_Btn((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitINS__REG_EastBtn((MGBDP_ArgReg)this);

		// [DEL_REG]ステータスのモードの設定
		MGBDP_ArgReg_MC.statusInitDEL__REG_ScreenOpe((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitDEL__REG_Cnd((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitDEL__REG_Rslt((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitDEL__REG_Dtl((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitDEL__REG_Btn((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitDEL__REG_EastBtn((MGBDP_ArgReg)this);

		// [INS_SEND]ステータスのモードの設定
		MGBDP_ArgReg_MC.statusInitINS__SEND_ScreenOpe((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitINS__SEND_Cnd((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitINS__SEND_Rslt((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitINS__SEND_Dtl((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitINS__SEND_Btn((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitINS__SEND_EastBtn((MGBDP_ArgReg)this);

		// [FIX_IS]ステータスのモードの設定
		MGBDP_ArgReg_MC.statusInitFIX__IS_ScreenOpe((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitFIX__IS_Cnd((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitFIX__IS_Rslt((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitFIX__IS_Dtl((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitFIX__IS_Btn((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitFIX__IS_EastBtn((MGBDP_ArgReg)this);

		// [DEL_SEND]ステータスのモードの設定
		MGBDP_ArgReg_MC.statusInitDEL__SEND_ScreenOpe((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitDEL__SEND_Cnd((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitDEL__SEND_Rslt((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitDEL__SEND_Dtl((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitDEL__SEND_Btn((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.statusInitDEL__SEND_EastBtn((MGBDP_ArgReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBDP_ArgReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBDP_ArgReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS01.addAllListener(p);
		p.Cnd_ope_DEL01.addAllListener(p);
		p.Cnd_ope_INS02.addAllListener(p);
		p.Cnd_ope_DEL02.addAllListener(p);
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBDP_ArgReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_ym.addAllListener(p);
		p.columnRslt_ym.setListListener(p);
		p.columnRslt_calc_no.addAllListener(p);
		p.columnRslt_calc_no.setListListener(p);
		p.columnRslt_ac_if_flg.addAllListener(p);
		p.columnRslt_ins_usr_id.addAllListener(p);
		p.columnRslt_ins_usr_id.setListListener(p);
		p.columnRslt_ins_usr_nm.addAllListener(p);
		p.columnRslt_ins_usr_nm.setListListener(p);
		p.columnRslt_ins_func_id.addAllListener(p);
		p.columnRslt_ins_func_id.setListListener(p);
		p.columnRslt_ins_func_nm.addAllListener(p);
		p.columnRslt_ins_func_nm.setListListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_upd_usr_id.addAllListener(p);
		p.columnRslt_upd_usr_id.setListListener(p);
		p.columnRslt_upd_usr_nm.addAllListener(p);
		p.columnRslt_upd_usr_nm.setListListener(p);
		p.columnRslt_upd_func_id.addAllListener(p);
		p.columnRslt_upd_func_id.setListListener(p);
		p.columnRslt_upd_func_nm.addAllListener(p);
		p.columnRslt_upd_func_nm.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
		p.columnRslt_upd_srv_req_no.addAllListener(p);
		p.columnRslt_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MGBDP_ArgReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_ym.addAllListener(p);
		p.columnDtl_ym.setListListener(p);
		p.columnDtl_calc_no.addAllListener(p);
		p.columnDtl_calc_no.setListListener(p);
		p.columnDtl_ac_if_flg.addAllListener(p);
		p.columnDtl_calc_grp_cd.addAllListener(p);
		p.columnDtl_calc_grp_cd.setListListener(p);
		p.columnDtl_st_ym.addAllListener(p);
		p.columnDtl_st_ym.setListListener(p);
		p.columnDtl_end_ym.addAllListener(p);
		p.columnDtl_end_ym.setListListener(p);
		p.columnDtl_calc_usr_cd.addAllListener(p);
		p.columnDtl_calc_usr_cd.setListListener(p);
		p.columnDtl_calc_usr_nm.addAllListener(p);
		p.columnDtl_calc_usr_nm.setListListener(p);
		p.columnDtl_calc_st.addAllListener(p);
		p.columnDtl_calc_st.setListListener(p);
		p.columnDtl_calc_fin.addAllListener(p);
		p.columnDtl_calc_fin.setListListener(p);
		p.columnDtl_calc_time.addAllListener(p);
		p.columnDtl_calc_time.setListListener(p);
		p.columnDtl_ins_srv_req_no.addAllListener(p);
		p.columnDtl_ins_srv_req_no.setListListener(p);
		p.columnDtl_rmrks.addAllListener(p);
		p.columnDtl_rmrks.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_ins_usr_id.addAllListener(p);
		p.columnDtl_ins_usr_id.setListListener(p);
		p.columnDtl_ins_usr_nm.addAllListener(p);
		p.columnDtl_ins_usr_nm.setListListener(p);
		p.columnDtl_ins_func_id.addAllListener(p);
		p.columnDtl_ins_func_id.setListListener(p);
		p.columnDtl_ins_func_nm.addAllListener(p);
		p.columnDtl_ins_func_nm.setListListener(p);
		p.columnDtl_ins_ts.addAllListener(p);
		p.columnDtl_ins_ts.setListListener(p);
		p.columnDtl_upd_usr_id.addAllListener(p);
		p.columnDtl_upd_usr_id.setListListener(p);
		p.columnDtl_upd_usr_nm.addAllListener(p);
		p.columnDtl_upd_usr_nm.setListListener(p);
		p.columnDtl_upd_func_id.addAllListener(p);
		p.columnDtl_upd_func_id.setListListener(p);
		p.columnDtl_upd_func_nm.addAllListener(p);
		p.columnDtl_upd_func_nm.setListListener(p);
		p.columnDtl_upd_ts.addAllListener(p);
		p.columnDtl_upd_ts.setListListener(p);
		p.columnDtl_upd_srv_req_no.addAllListener(p);
		p.columnDtl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBDP_ArgReg p) {
		p.Btn_open_MGBDP0030.addAllListener(p);
		p.Btn_open_MGBDP0030.setAPMethodName("doBtn_open_MGBDP0030");
		p.Btn_open_MBBBP0080.addAllListener(p);
		p.Btn_open_MBBBP0080.setAPMethodName("doBtn_open_MBBBP0080");
		p.Btn_upd_reg.addAllListener(p);
		p.Btn_upd_reg.setAPMethodName("doBtn_upd_reg");
		p.Btn_upd_send_reg.addAllListener(p);
		p.Btn_upd_send_reg.setAPMethodName("doBtn_upd_send_reg");
		p.Btn_del_reg_cancel.addAllListener(p);
		p.Btn_del_reg_cancel.setAPMethodName("doBtn_del_reg_cancel");
		p.Btn_del_send_cancel.addAllListener(p);
		p.Btn_del_send_cancel.setAPMethodName("doBtn_del_send_cancel");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MGBDP_ArgReg p) {
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MGBDP_ArgReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBDP_ArgReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MGBDP_ArgReg p){
		p.columnRslt_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.INVISIBLE);
		p.columnRslt_calc_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_if_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MGBDP_ArgReg p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtl_ym.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_term_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.INVISIBLE);
		p.columnDtl_calc_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ac_if_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_calc_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_st_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_end_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_st.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_fin.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_time.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MGBDP_ArgReg p){
		p.Btn_open_MGBDP0030.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MBBBP0080.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_reg.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_send_reg.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del_reg_cancel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del_send_cancel.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MGBDP_ArgReg p){

	}

	/**
	 * [INS_REG]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__REG_ScreenOpe(MGBDP_ArgReg p){

	}

	/**
	 * [INS_REG]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__REG_Cnd(MGBDP_ArgReg p){
		p.Cnd_ope_Group.putMode(p, INS_REG, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(INS_REG, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, INS_REG, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS_REG, MCMode.ENABLE);

	}

	/**
	 * [INS_REG]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS__REG_Rslt(MGBDP_ArgReg p){
		p.columnRslt_ym.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(INS_REG, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.INVISIBLE);
		p.columnRslt_calc_no.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnRslt_ac_if_flg.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, INS_REG, MCMode.READ_ONLY);

	}

	/**
	 * [INS_REG]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__REG_Dtl(MGBDP_ArgReg p){
		p.columnDtl_check.putMode(p, INS_REG, MCMode.REQUIRED);
		p.columnDtl_ym.putMode(p, INS_REG, MCMode.INVISIBLE);
		p.Dtl_term_p_PPanel.putStatus(INS_REG, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.INVISIBLE);
		p.columnDtl_calc_no.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_ac_if_flg.putMode(p, INS_REG, MCMode.INVISIBLE);
		p.columnDtl_calc_grp_cd.putMode(p, INS_REG, MCMode.INVISIBLE);
		p.columnDtl_st_ym.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_end_ym.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_cd.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_nm.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_calc_st.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_calc_fin.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_calc_time.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_ins_srv_req_no.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_rmrks.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(INS_REG, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, INS_REG, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, INS_REG, MCMode.READ_ONLY);

	}

	/**
	 * [INS_REG]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__REG_Btn(MGBDP_ArgReg p){
		p.Btn_open_MGBDP0030.putMode(p, INS_REG, MCMode.ENABLE);
		p.Btn_open_MBBBP0080.putMode(p, INS_REG, MCMode.ENABLE);
		p.Btn_upd_reg.putMode(p, INS_REG, MCMode.ENABLE);
		p.Btn_upd_send_reg.putMode(p, INS_REG, MCMode.INVISIBLE);
		p.Btn_del_reg_cancel.putMode(p, INS_REG, MCMode.DISABLE);
		p.Btn_del_send_cancel.putMode(p, INS_REG, MCMode.DISABLE);

	}

	/**
	 * [INS_REG]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__REG_EastBtn(MGBDP_ArgReg p){

	}

	/**
	 * [DEL_REG]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__REG_ScreenOpe(MGBDP_ArgReg p){

	}

	/**
	 * [DEL_REG]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__REG_Cnd(MGBDP_ArgReg p){
		p.Cnd_ope_Group.putMode(p, DEL_REG, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(DEL_REG, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, DEL_REG, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, DEL_REG, MCMode.ENABLE);

	}

	/**
	 * [DEL_REG]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__REG_Rslt(MGBDP_ArgReg p){
		p.columnRslt_ym.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(DEL_REG, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.INVISIBLE);
		p.columnRslt_calc_no.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnRslt_ac_if_flg.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL_REG, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_REG]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__REG_Dtl(MGBDP_ArgReg p){
		p.columnDtl_check.putMode(p, DEL_REG, MCMode.REQUIRED);
		p.columnDtl_ym.putMode(p, DEL_REG, MCMode.INVISIBLE);
		p.Dtl_term_p_PPanel.putStatus(DEL_REG, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.INVISIBLE);
		p.columnDtl_calc_no.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_ac_if_flg.putMode(p, DEL_REG, MCMode.INVISIBLE);
		p.columnDtl_calc_grp_cd.putMode(p, DEL_REG, MCMode.INVISIBLE);
		p.columnDtl_st_ym.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_end_ym.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_cd.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_nm.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_calc_st.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_calc_fin.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_calc_time.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_ins_srv_req_no.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_rmrks.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(DEL_REG, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL_REG, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL_REG, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_REG]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__REG_Btn(MGBDP_ArgReg p){
		p.Btn_open_MGBDP0030.putMode(p, DEL_REG, MCMode.ENABLE);
		p.Btn_open_MBBBP0080.putMode(p, DEL_REG, MCMode.ENABLE);
		p.Btn_upd_reg.putMode(p, DEL_REG, MCMode.DISABLE);
		p.Btn_upd_send_reg.putMode(p, DEL_REG, MCMode.DISABLE);
		p.Btn_del_reg_cancel.putMode(p, DEL_REG, MCMode.ENABLE);
		p.Btn_del_send_cancel.putMode(p, DEL_REG, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_REG]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__REG_EastBtn(MGBDP_ArgReg p){

	}

	/**
	 * [INS_SEND]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__SEND_ScreenOpe(MGBDP_ArgReg p){

	}

	/**
	 * [INS_SEND]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__SEND_Cnd(MGBDP_ArgReg p){
		p.Cnd_ope_Group.putMode(p, INS_SEND, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(INS_SEND, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, INS_SEND, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS_SEND, MCMode.ENABLE);

	}

	/**
	 * [INS_SEND]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS__SEND_Rslt(MGBDP_ArgReg p){
		p.columnRslt_ym.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(INS_SEND, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.INVISIBLE);
		p.columnRslt_calc_no.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnRslt_ac_if_flg.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, INS_SEND, MCMode.READ_ONLY);

	}

	/**
	 * [INS_SEND]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__SEND_Dtl(MGBDP_ArgReg p){
		p.columnDtl_check.putMode(p, INS_SEND, MCMode.REQUIRED);
		p.columnDtl_ym.putMode(p, INS_SEND, MCMode.INVISIBLE);
		p.Dtl_term_p_PPanel.putStatus(INS_SEND, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.INVISIBLE);
		p.columnDtl_calc_no.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_ac_if_flg.putMode(p, INS_SEND, MCMode.INVISIBLE);
		p.columnDtl_calc_grp_cd.putMode(p, INS_SEND, MCMode.INVISIBLE);
		p.columnDtl_st_ym.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_end_ym.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_cd.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_nm.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_calc_st.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_calc_fin.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_calc_time.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_ins_srv_req_no.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_rmrks.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(INS_SEND, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, INS_SEND, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, INS_SEND, MCMode.READ_ONLY);

	}

	/**
	 * [INS_SEND]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__SEND_Btn(MGBDP_ArgReg p){
		p.Btn_open_MGBDP0030.putMode(p, INS_SEND, MCMode.ENABLE);
		p.Btn_open_MBBBP0080.putMode(p, INS_SEND, MCMode.ENABLE);
		p.Btn_upd_reg.putMode(p, INS_SEND, MCMode.INVISIBLE);
		p.Btn_upd_send_reg.putMode(p, INS_SEND, MCMode.ENABLE);
		p.Btn_del_reg_cancel.putMode(p, INS_SEND, MCMode.DISABLE);
		p.Btn_del_send_cancel.putMode(p, INS_SEND, MCMode.DISABLE);

	}

	/**
	 * [INS_SEND]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__SEND_EastBtn(MGBDP_ArgReg p){

	}

	/**
	 * [FIX_IS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__IS_ScreenOpe(MGBDP_ArgReg p){

	}

	/**
	 * [FIX_IS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__IS_Cnd(MGBDP_ArgReg p){
		p.Cnd_ope_Group.putMode(p, FIX_IS, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(FIX_IS, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, FIX_IS, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_IS, MCMode.ENABLE);

	}

	/**
	 * [FIX_IS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__IS_Rslt(MGBDP_ArgReg p){
		p.columnRslt_ym.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(FIX_IS, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.INVISIBLE);
		p.columnRslt_calc_no.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnRslt_ac_if_flg.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_IS, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_IS]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__IS_Dtl(MGBDP_ArgReg p){
		p.columnDtl_check.putMode(p, FIX_IS, MCMode.REQUIRED);
		p.columnDtl_ym.putMode(p, FIX_IS, MCMode.INVISIBLE);
		p.Dtl_term_p_PPanel.putStatus(FIX_IS, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.INVISIBLE);
		p.columnDtl_calc_no.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_ac_if_flg.putMode(p, FIX_IS, MCMode.INVISIBLE);
		p.columnDtl_calc_grp_cd.putMode(p, FIX_IS, MCMode.INVISIBLE);
		p.columnDtl_st_ym.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_end_ym.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_cd.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_nm.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_calc_st.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_calc_fin.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_calc_time.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_ins_srv_req_no.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_rmrks.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(FIX_IS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_IS, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_IS, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_IS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__IS_Btn(MGBDP_ArgReg p){
		p.Btn_open_MGBDP0030.putMode(p, FIX_IS, MCMode.ENABLE);
		p.Btn_open_MBBBP0080.putMode(p, FIX_IS, MCMode.ENABLE);
		p.Btn_upd_reg.putMode(p, FIX_IS, MCMode.DISABLE);
		p.Btn_upd_send_reg.putMode(p, FIX_IS, MCMode.DISABLE);
		p.Btn_del_reg_cancel.putMode(p, FIX_IS, MCMode.DISABLE);
		p.Btn_del_send_cancel.putMode(p, FIX_IS, MCMode.DISABLE);

	}

	/**
	 * [FIX_IS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__IS_EastBtn(MGBDP_ArgReg p){

	}

	/**
	 * [DEL_SEND]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SEND_ScreenOpe(MGBDP_ArgReg p){

	}

	/**
	 * [DEL_SEND]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SEND_Cnd(MGBDP_ArgReg p){
		p.Cnd_ope_Group.putMode(p, DEL_SEND, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(DEL_SEND, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, DEL_SEND, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, DEL_SEND, MCMode.ENABLE);

	}

	/**
	 * [DEL_SEND]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SEND_Rslt(MGBDP_ArgReg p){
		p.columnRslt_ym.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(DEL_SEND, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.INVISIBLE);
		p.columnRslt_calc_no.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnRslt_ac_if_flg.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL_SEND, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_SEND]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SEND_Dtl(MGBDP_ArgReg p){
		p.columnDtl_check.putMode(p, DEL_SEND, MCMode.REQUIRED);
		p.columnDtl_ym.putMode(p, DEL_SEND, MCMode.INVISIBLE);
		p.Dtl_term_p_PPanel.putStatus(DEL_SEND, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.INVISIBLE);
		p.columnDtl_calc_no.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_ac_if_flg.putMode(p, DEL_SEND, MCMode.INVISIBLE);
		p.columnDtl_calc_grp_cd.putMode(p, DEL_SEND, MCMode.INVISIBLE);
		p.columnDtl_st_ym.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_end_ym.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_cd.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_nm.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_calc_st.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_calc_fin.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_calc_time.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_ins_srv_req_no.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_rmrks.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(DEL_SEND, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL_SEND, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL_SEND, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_SEND]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SEND_Btn(MGBDP_ArgReg p){
		p.Btn_open_MGBDP0030.putMode(p, DEL_SEND, MCMode.ENABLE);
		p.Btn_open_MBBBP0080.putMode(p, DEL_SEND, MCMode.ENABLE);
		p.Btn_upd_reg.putMode(p, DEL_SEND, MCMode.DISABLE);
		p.Btn_upd_send_reg.putMode(p, DEL_SEND, MCMode.DISABLE);
		p.Btn_del_reg_cancel.putMode(p, DEL_SEND, MCMode.INVISIBLE);
		p.Btn_del_send_cancel.putMode(p, DEL_SEND, MCMode.ENABLE);

	}

	/**
	 * [DEL_SEND]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SEND_EastBtn(MGBDP_ArgReg p){

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
		MGBDP_ArgReg_MC.setTableConfigRslt((MGBDP_ArgReg)this);
		MGBDP_ArgReg_MC.setTableConfigDtl((MGBDP_ArgReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBDP_ArgReg p) {
		p.columnRslt_ym.setMeta(mcframe.clientMGBD.MGBDP0040.RsltR.ym_META);
		p.columnRslt_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ym);
		p.RsltTable.addTable(p.Rslt_term_p_PPanel.TermTable);
		p.columnRslt_calc_no.setMeta(mcframe.clientMGBD.MGBDP0040.RsltR.calc_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_no);
		p.columnRslt_ac_if_flg.setMeta(mcframe.clientMGBD.MGBDP0040.RsltR.ac_if_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_if_flg);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMGBD.MGBDP0040.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0040.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMGBD.MGBDP0040.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMGBD.MGBDP0040.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMGBD.MGBDP0040.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMGBD.MGBDP0040.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0040.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMGBD.MGBDP0040.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMGBD.MGBDP0040.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMGBD.MGBDP0040.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0040.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MGBDP_ArgReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_ym.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.ym_META);
		p.columnDtl_ym.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ym);
		p.DtlTable.addTable(p.Dtl_term_p_PPanel.TermTable);
		p.columnDtl_calc_no.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.calc_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_no);
		p.columnDtl_ac_if_flg.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.ac_if_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_if_flg);
		p.columnDtl_calc_grp_cd.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.calc_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_grp_cd);
		p.columnDtl_st_ym.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.st_ym_META);
		p.columnDtl_st_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_st_ym);
		p.columnDtl_end_ym.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.end_ym_META);
		p.columnDtl_end_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_end_ym);
		p.columnDtl_calc_usr_cd.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.calc_usr_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_usr_cd);
		p.columnDtl_calc_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.calc_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_usr_nm);
		p.columnDtl_calc_st.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.calc_st_META);
		p.columnDtl_calc_st.setFormatID(mcframe.commonMA.meta.MA_META.YMDHMS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_st);
		p.columnDtl_calc_fin.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.calc_fin_META);
		p.columnDtl_calc_fin.setFormatID(mcframe.commonMA.meta.MA_META.YMDHMS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_fin);
		p.columnDtl_calc_time.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.calc_time_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_time);
		p.columnDtl_ins_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.ins_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_srv_req_no);
		p.columnDtl_rmrks.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rmrks);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.DtlTable.addTable(p.Dtl_rts_msg_p_PPanel.RtnMsgTable);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0040.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_grp_cd.getListConfig().setPutter(getCnd_calc_grp_cd_ListPutter());
		columnDtl_calc_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_calc_no.getListConfig().setPutter(getDtl_calc_no_ListPutter());
		columnDtl_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_calc_grp_cd.getListConfig().setPutter(getDtl_calc_grp_cd_ListPutter());
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
	 * この画面を[INS_REG]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_REGStatus() {
		status = INS_REG;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_REG]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_REGStatus() {
		status = DEL_REG;
		setAllStatus(status);
	}

	/**
	 * この画面を[INS_SEND]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_SENDStatus() {
		status = INS_SEND;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_IS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_ISStatus() {
		status = FIX_IS;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_SEND]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_SENDStatus() {
		status = DEL_SEND;
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
		else if (INS_REG.equals(status)) {
			setINS_REGStatus();
		}
		else if (DEL_REG.equals(status)) {
			setDEL_REGStatus();
		}
		else if (INS_SEND.equals(status)) {
			setINS_SENDStatus();
		}
		else if (FIX_IS.equals(status)) {
			setFIX_ISStatus();
		}
		else if (DEL_SEND.equals(status)) {
			setDEL_SENDStatus();
		}
	}

	/**
	 * [Cnd_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.FixCalcGrp");
		return lp;
	}
	 
	/**
	 * [Dtl_calc_no_ListPutter]の作成
	 */
	protected MCListPutter createDtl_calc_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == columnDtl_calc_no) return getDtl_calc_no(row, info);
		if(combo == columnDtl_calc_grp_cd) return getDtl_calc_grp_cd(row, info);
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
		else if (ap == Btn_open_MGBDP0030) doBtn_open_MGBDP0030(info);
		else if (ap == Btn_open_MBBBP0080) doBtn_open_MBBBP0080(info);
		else if (ap == Btn_upd_reg) doBtn_upd_reg(info);
		else if (ap == Btn_upd_send_reg) doBtn_upd_send_reg(info);
		else if (ap == Btn_del_reg_cancel) doBtn_del_reg_cancel(info);
		else if (ap == Btn_del_send_cancel) doBtn_del_send_cancel(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0030]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0030(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MBBBP0080]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MBBBP0080(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_reg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_reg(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_send_reg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_send_reg(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_reg_cancel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_reg_cancel(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_send_cancel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_send_cancel(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == columnRslt_ym) return doRslt_ym_VC(info);
		if (vc == columnRslt_calc_no) return doRslt_calc_no_VC(info);
		if (vc == columnRslt_ac_if_flg) return doRslt_ac_if_flg_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_ym) return doDtl_ym_VC(info);
		if (vc == columnDtl_calc_no) return doDtl_calc_no_VC(info);
		if (vc == columnDtl_ac_if_flg) return doDtl_ac_if_flg_VC(info);
		if (vc == columnDtl_calc_grp_cd) return doDtl_calc_grp_cd_VC(info);
		if (vc == columnDtl_st_ym) return doDtl_st_ym_VC(info);
		if (vc == columnDtl_end_ym) return doDtl_end_ym_VC(info);
		if (vc == columnDtl_calc_usr_cd) return doDtl_calc_usr_cd_VC(info);
		if (vc == columnDtl_calc_usr_nm) return doDtl_calc_usr_nm_VC(info);
		if (vc == columnDtl_calc_st) return doDtl_calc_st_VC(info);
		if (vc == columnDtl_calc_fin) return doDtl_calc_fin_VC(info);
		if (vc == columnDtl_calc_time) return doDtl_calc_time_VC(info);
		if (vc == columnDtl_ins_srv_req_no) return doDtl_ins_srv_req_no_VC(info);
		if (vc == columnDtl_rmrks) return doDtl_rmrks_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
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
	 * [Cnd]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[calc_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_if_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_if_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_ts_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_ts_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_if_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_if_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[st_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_st_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[end_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_end_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_st]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_st_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_fin]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_fin_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_time]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_time_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char3_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == columnRslt_ym) doRslt_ym_NC(info);
		else if (nc == columnRslt_calc_no) doRslt_calc_no_NC(info);
		else if (nc == columnRslt_ac_if_flg) doRslt_ac_if_flg_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_ym) doDtl_ym_NC(info);
		else if (nc == columnDtl_calc_no) doDtl_calc_no_NC(info);
		else if (nc == columnDtl_ac_if_flg) doDtl_ac_if_flg_NC(info);
		else if (nc == columnDtl_calc_grp_cd) doDtl_calc_grp_cd_NC(info);
		else if (nc == columnDtl_st_ym) doDtl_st_ym_NC(info);
		else if (nc == columnDtl_end_ym) doDtl_end_ym_NC(info);
		else if (nc == columnDtl_calc_usr_cd) doDtl_calc_usr_cd_NC(info);
		else if (nc == columnDtl_calc_usr_nm) doDtl_calc_usr_nm_NC(info);
		else if (nc == columnDtl_calc_st) doDtl_calc_st_NC(info);
		else if (nc == columnDtl_calc_fin) doDtl_calc_fin_NC(info);
		else if (nc == columnDtl_calc_time) doDtl_calc_time_NC(info);
		else if (nc == columnDtl_ins_srv_req_no) doDtl_ins_srv_req_no_NC(info);
		else if (nc == columnDtl_rmrks) doDtl_rmrks_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_if_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_if_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_if_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_if_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_ym_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[end_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_end_ym_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_st]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_st_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_fin]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_fin_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_time]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_time_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NC(MCEventInfo info){
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
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == columnRslt_ym) doRslt_ym_NE(info);
		else if (ne == columnRslt_calc_no) doRslt_calc_no_NE(info);
		else if (ne == columnRslt_ac_if_flg) doRslt_ac_if_flg_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_ym) doDtl_ym_NE(info);
		else if (ne == columnDtl_calc_no) doDtl_calc_no_NE(info);
		else if (ne == columnDtl_ac_if_flg) doDtl_ac_if_flg_NE(info);
		else if (ne == columnDtl_calc_grp_cd) doDtl_calc_grp_cd_NE(info);
		else if (ne == columnDtl_st_ym) doDtl_st_ym_NE(info);
		else if (ne == columnDtl_end_ym) doDtl_end_ym_NE(info);
		else if (ne == columnDtl_calc_usr_cd) doDtl_calc_usr_cd_NE(info);
		else if (ne == columnDtl_calc_usr_nm) doDtl_calc_usr_nm_NE(info);
		else if (ne == columnDtl_calc_st) doDtl_calc_st_NE(info);
		else if (ne == columnDtl_calc_fin) doDtl_calc_fin_NE(info);
		else if (ne == columnDtl_calc_time) doDtl_calc_time_NE(info);
		else if (ne == columnDtl_ins_srv_req_no) doDtl_ins_srv_req_no_NE(info);
		else if (ne == columnDtl_rmrks) doDtl_rmrks_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_if_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_if_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_if_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_if_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_ym_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[end_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_end_ym_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_st]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_st_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_fin]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_fin_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_time]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_time_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NE(MCEventInfo info){
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
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == columnRslt_ym) doRslt_ym_NX(info);
		else if (nx == columnRslt_calc_no) doRslt_calc_no_NX(info);
		else if (nx == columnRslt_ac_if_flg) doRslt_ac_if_flg_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_ym) doDtl_ym_NX(info);
		else if (nx == columnDtl_calc_no) doDtl_calc_no_NX(info);
		else if (nx == columnDtl_ac_if_flg) doDtl_ac_if_flg_NX(info);
		else if (nx == columnDtl_calc_grp_cd) doDtl_calc_grp_cd_NX(info);
		else if (nx == columnDtl_st_ym) doDtl_st_ym_NX(info);
		else if (nx == columnDtl_end_ym) doDtl_end_ym_NX(info);
		else if (nx == columnDtl_calc_usr_cd) doDtl_calc_usr_cd_NX(info);
		else if (nx == columnDtl_calc_usr_nm) doDtl_calc_usr_nm_NX(info);
		else if (nx == columnDtl_calc_st) doDtl_calc_st_NX(info);
		else if (nx == columnDtl_calc_fin) doDtl_calc_fin_NX(info);
		else if (nx == columnDtl_calc_time) doDtl_calc_time_NX(info);
		else if (nx == columnDtl_ins_srv_req_no) doDtl_ins_srv_req_no_NX(info);
		else if (nx == columnDtl_rmrks) doDtl_rmrks_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_if_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_if_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_if_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_if_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_ym_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[end_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_end_ym_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_st]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_st_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_fin]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_fin_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_time]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_time_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_LC(info);
		else if (lc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_LC(info);
		else if (lc == columnRslt_ym) doRslt_ym_LC(info);
		else if (lc == columnRslt_calc_no) doRslt_calc_no_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
		else if (lc == columnDtl_ym) doDtl_ym_LC(info);
		else if (lc == columnDtl_calc_no) doDtl_calc_no_LC(info);
		else if (lc == columnDtl_calc_grp_cd) doDtl_calc_grp_cd_LC(info);
		else if (lc == columnDtl_st_ym) doDtl_st_ym_LC(info);
		else if (lc == columnDtl_end_ym) doDtl_end_ym_LC(info);
		else if (lc == columnDtl_calc_usr_cd) doDtl_calc_usr_cd_LC(info);
		else if (lc == columnDtl_calc_usr_nm) doDtl_calc_usr_nm_LC(info);
		else if (lc == columnDtl_calc_st) doDtl_calc_st_LC(info);
		else if (lc == columnDtl_calc_fin) doDtl_calc_fin_LC(info);
		else if (lc == columnDtl_calc_time) doDtl_calc_time_LC(info);
		else if (lc == columnDtl_ins_srv_req_no) doDtl_ins_srv_req_no_LC(info);
		else if (lc == columnDtl_rmrks) doDtl_rmrks_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_ym_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[end_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_end_ym_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_st]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_st_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_fin]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_fin_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_time]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_time_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getFixCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_calc_no]の作成メソッド
	 */
	public MCList getDtl_calc_no(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_calc_grp_cd]の作成メソッド
	 */
	public MCList getDtl_calc_grp_cd(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBDL0040.Srch01")) {
			return new MG_MGBDL0040_Srch01Bridge();
		}
		if (id.equals("MG.MGBDL0040.Ins01")) {
			return new MG_MGBDL0040_Ins01Bridge();
		}
		if (id.equals("MG.MGBDL0040.Del01")) {
			return new MG_MGBDL0040_Del01Bridge();
		}
		if (id.equals("MG.MGBDL0040.Ins02")) {
			return new MG_MGBDL0040_Ins02Bridge();
		}
		if (id.equals("MG.MGBDL0040.Del02")) {
			return new MG_MGBDL0040_Del02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBDL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0040_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0040_Srch01;

		/** コンストラクタ */
		protected MG_MGBDL0040_Srch01Bridge() {
			p_MG_MGBDL0040_Srch01 = new MCParam(PDef.MG_MGBDL0040_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0040_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0040.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0040.RsltR.class));
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0040.DtlR.class));

			p_MG_MGBDL0040_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0040_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0040_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0040_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0040_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0040.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0040.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0040.RsltR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0040.RsltR>)down(0);
		}
		protected MCList<mcframe.clientMGBD.MGBDP0040.DtlR> down1() {
			return (MCList<mcframe.clientMGBD.MGBDP0040.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0040_Srch01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0040.RsltR.class));
			p_MG_MGBDL0040_Srch01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0040.DtlR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0040_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBD.MGBDP0040.RsltR>)p_MG_MGBDL0040_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMGBD.MGBDP0040.DtlR>)p_MG_MGBDL0040_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getRsltL().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MG_MGBDL0040_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0040_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0040_Ins01;

		/** コンストラクタ */
		protected MG_MGBDL0040_Ins01Bridge() {
			p_MG_MGBDL0040_Ins01 = new MCParam(PDef.MG_MGBDL0040_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0040_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0040.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0040.DtlR.class));

			p_MG_MGBDL0040_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0040_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0040_Ins01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0040_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0040_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0040.DtlR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0040.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0040.DtlR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0040.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0040_Ins01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0040.DtlR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0040_Ins01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMGBD.MGBDP0040.DtlR>)p_MG_MGBDL0040_Ins01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MG_MGBDL0040_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0040_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0040_Del01;

		/** コンストラクタ */
		protected MG_MGBDL0040_Del01Bridge() {
			p_MG_MGBDL0040_Del01 = new MCParam(PDef.MG_MGBDL0040_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0040_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0040.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0040.DtlR.class));

			p_MG_MGBDL0040_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0040_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0040_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0040_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0040_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0040.DtlR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0040.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0040.DtlR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0040.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0040_Del01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0040.DtlR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0040_Del01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMGBD.MGBDP0040.DtlR>)p_MG_MGBDL0040_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MG_MGBDL0040_Ins02]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0040_Ins02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0040_Ins02;

		/** コンストラクタ */
		protected MG_MGBDL0040_Ins02Bridge() {
			p_MG_MGBDL0040_Ins02 = new MCParam(PDef.MG_MGBDL0040_Ins02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0040_Ins02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0040.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0040.DtlR.class));

			p_MG_MGBDL0040_Ins02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0040_Ins02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0040_Ins02.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0040_Ins02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0040_Ins02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0040.DtlR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0040.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0040.DtlR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0040.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0040_Ins02.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0040.DtlR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0040_Ins02;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMGBD.MGBDP0040.DtlR>)p_MG_MGBDL0040_Ins02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MG_MGBDL0040_Del02]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0040_Del02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0040_Del02;

		/** コンストラクタ */
		protected MG_MGBDL0040_Del02Bridge() {
			p_MG_MGBDL0040_Del02 = new MCParam(PDef.MG_MGBDL0040_Del02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0040_Del02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0040.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0040.DtlR.class));

			p_MG_MGBDL0040_Del02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0040_Del02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0040_Del02.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0040_Del02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0040_Del02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0040.DtlR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0040.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0040.DtlR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0040.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0040_Del02.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0040.DtlR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0040_Del02;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMGBD.MGBDP0040.DtlR>)p_MG_MGBDL0040_Del02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
}