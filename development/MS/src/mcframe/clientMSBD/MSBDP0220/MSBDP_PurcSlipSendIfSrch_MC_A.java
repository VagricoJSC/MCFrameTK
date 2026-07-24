package mcframe.clientMSBD.MSBDP0220;

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
import mcframe.clientMSBD.MSBDP0220.MSBDP_PurcSlipSendIfSrch_MC.MS_MSBDL0220_Srch01Caller;
import mcframe.clientMSBD.MSBDP0220.MSBDP_PurcSlipSendIfSrch_MC.MS_MSBDL0220_Upd01Caller;
import mcframe.clientMSBD.MSBDP0220.MSBDP_PurcSlipSendIfSrch_MC.MS_MSBDL0220_Upd02Caller;

/**
 * 画面"MSBDP_PurcSlipSendIfSrch"パネルクラスです。<p>
 *
 * 仕入伝票を再送信します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDP_PurcSlipSendIfSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBD";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBDP0220";

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
	// [ReSnd]ブロック関連のField定義
	public MCPanel ReSndPanel = null;
	public MCTitledBorder ReSndTitledBorder = null;
	// [ReSnd]ブロックの項目のField定義
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
	 * RESND,Resend;UPD,Modify;REF,View; RESND,再送信する;UPD,訂正する;REF,参照する;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_RESND = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * To resend 再送信対象.<p>
	 *
	 */
	public MCCheckBox Cnd_re_snd_flg = null;
	/**
	 * Not to resend 再送信対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_re_snd_flg = null;
	public MCLabel Cnd_data_no_Label = null;
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumberField Cnd_data_no = null;
	public MCLabel Cnd_purc_slip_no_Label = null;
	/**
	 * Purchase slip No. 仕入伝票ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_purc_slip_no = null;
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
	public MCLabel Cnd_ac_dt_fr_Label = null;
	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ac_dt_fr = null;
	public MCLabel Cnd_ac_dt_to_Label = null;
	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ac_dt_to = null;
	public MCLabel Cnd_sppl_cd_Label = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCTextField Cnd_sppl_nm = null;
	public MCLabel Cnd_usr_cd_Label = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCTextField Cnd_usr_nm = null;
	public MCLabel Cnd_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_nm = null;
	public MCLabel Cnd_trd_cd_Label = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCTextField Cnd_trd_nm = null;
	public MCLabel Cnd_ext_sys_cd_Label = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCTextField Cnd_ext_sys_nm = null;
	/**
	 * Display latest only 最新のみ表示.<p>
	 *
	 */
	public MCCheckBox Cnd_new_flg = null;
	/**
	 * Display not applied data only 未反映のみ表示.<p>
	 *
	 */
	public MCCheckBox Cnd_snd_to_err_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBD.MSBDP0220.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_data_no = null;
	/**
	 * Purchase slip No. 仕入伝票ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_slip_no = null;
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
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_ptn_typ = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_nm = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_nm = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_nm = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_sys_nm = null;
	/**
	 * Sending date and time 送信日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_snd_ts = null;
	/**
	 * Resend 再送信.<p>
	 *
	 */
	public MCColumnConfig columnRslt_re_snd_flg = null;
	/**
	 * Not to be exported 送信対象外.<p>
	 *
	 */
	public MCColumnConfig columnRslt_not_snd_flg = null;
	/**
	 * Not applied 未反映.<p>
	 *
	 */
	public MCColumnConfig columnRslt_snd_to_err_flg = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
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
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * IF data status ＩＦデータ確認.<p>
	 *
	 */
	public MCButton Btn_open_MBBEP0080 = null;
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
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_resnd = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/** [SRCH_RESND]モードを表す定数 */
	public static final String SRCH_RESND = "SRCH_RESND";
	/** [SRCH_UPD]モードを表す定数 */
	public static final String SRCH_UPD = "SRCH_UPD";
	/** [SRCH_REF]モードを表す定数 */
	public static final String SRCH_REF = "SRCH_REF";
	/** [RESND]モードを表す定数 */
	public static final String RESND = "RESND";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_RESND, SRCH_UPD, SRCH_REF, RESND, UPD, REF};
	
	/** [MS_MSBDL0220_Srch01]のCallerの作成 */
	protected MSBDP_PurcSlipSendIfSrch_MC.MS_MSBDL0220_Srch01Caller createMS_MSBDL0220_Srch01() {
		MSBDP_PurcSlipSendIfSrch_MC.MS_MSBDL0220_Srch01Caller<MSBDP_PurcSlipSendIfSrch, MS_MSBDL0220_Srch01Bridge>
		caller = ((MSBDP_PurcSlipSendIfSrch_MC)this).new MS_MSBDL0220_Srch01Caller<MSBDP_PurcSlipSendIfSrch, MS_MSBDL0220_Srch01Bridge>(
					(MSBDP_PurcSlipSendIfSrch)this, new MS_MSBDL0220_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBDL0220_Srch01]の呼び出し */
	protected void callMS_MSBDL0220_Srch01() {
		MCCaller caller = createMS_MSBDL0220_Srch01();
		caller.exec();
	}
	/** [MS_MSBDL0220_Upd01]のCallerの作成 */
	protected MSBDP_PurcSlipSendIfSrch_MC.MS_MSBDL0220_Upd01Caller createMS_MSBDL0220_Upd01() {
		MSBDP_PurcSlipSendIfSrch_MC.MS_MSBDL0220_Upd01Caller<MSBDP_PurcSlipSendIfSrch, MS_MSBDL0220_Upd01Bridge>
		caller = ((MSBDP_PurcSlipSendIfSrch_MC)this).new MS_MSBDL0220_Upd01Caller<MSBDP_PurcSlipSendIfSrch, MS_MSBDL0220_Upd01Bridge>(
					(MSBDP_PurcSlipSendIfSrch)this, new MS_MSBDL0220_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBDL0220_Upd01]の呼び出し */
	protected void callMS_MSBDL0220_Upd01() {
		MCCaller caller = createMS_MSBDL0220_Upd01();
		caller.exec();
	}
	/** [MS_MSBDL0220_Upd02]のCallerの作成 */
	protected MSBDP_PurcSlipSendIfSrch_MC.MS_MSBDL0220_Upd02Caller createMS_MSBDL0220_Upd02() {
		MSBDP_PurcSlipSendIfSrch_MC.MS_MSBDL0220_Upd02Caller<MSBDP_PurcSlipSendIfSrch, MS_MSBDL0220_Upd02Bridge>
		caller = ((MSBDP_PurcSlipSendIfSrch_MC)this).new MS_MSBDL0220_Upd02Caller<MSBDP_PurcSlipSendIfSrch, MS_MSBDL0220_Upd02Bridge>(
					(MSBDP_PurcSlipSendIfSrch)this, new MS_MSBDL0220_Upd02Bridge());
		return caller;
	}
	/** [MS_MSBDL0220_Upd02]の呼び出し */
	protected void callMS_MSBDL0220_Upd02() {
		MCCaller caller = createMS_MSBDL0220_Upd02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0220.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBD.MSBDP0220.RsltR> aRsltL;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBD.MSBDP0220.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBD.MSBDP0220.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0220.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0220.CndR createCndR() {
		return mcframe.clientMSBD.MSBDP0220.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBD.MSBDP0220.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0220.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBD.MSBDP0220.RsltR createRsltR() {
		return mcframe.clientMSBD.MSBDP0220.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0220.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBD.MSBDP0220.RsltR.class);
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
	public void setDtlL(MCList<mcframe.clientMSBD.MSBDP0220.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0220.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBD.MSBDP0220.DtlR createDtlR() {
		return mcframe.clientMSBD.MSBDP0220.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0220.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBD.MSBDP0220.DtlR.class);
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
		ret.add(ReSndPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PurcSlipSendIfSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBDP_PurcSlipSendIfSrch_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aDtlL = createDtlL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBDP_PurcSlipSendIfSrch_MC.jbCreateScreenOpe((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbCreateReSnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbCreateTop((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbCreateFold((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbCreateCnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbCreateCtrl((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbCreateRslt((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbCreateBtn((MSBDP_PurcSlipSendIfSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBDP_PurcSlipSendIfSrch p) {
	}

	/**
	 * [ReSnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateReSnd(MSBDP_PurcSlipSendIfSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBDP_PurcSlipSendIfSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBDP_PurcSlipSendIfSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBDP_PurcSlipSendIfSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBDP_PurcSlipSendIfSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBDP_PurcSlipSendIfSrch p) {
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBD.MSBDP0220.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBDP_PurcSlipSendIfSrch p) {
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

	
	/** [Cnd_sppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_cd_p = null;

	/**
	 * [Cnd_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_cd_ListPutter() {
		if (Cnd_sppl_cd_p == null) {
			Cnd_sppl_cd_p = createCnd_sppl_cd_ListPutter(Cnd_sppl_cd, "sppl_cd", "sppl_nm");

		}
		return Cnd_sppl_cd_p;
	}
	
	
	/** [Cnd_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_usr_cd_p = null;

	/**
	 * [Cnd_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_usr_cd_ListPutter() {
		if (Cnd_usr_cd_p == null) {
			Cnd_usr_cd_p = createCnd_usr_cd_ListPutter(Cnd_usr_cd, "usr_cd", "usr_nm");

		}
		return Cnd_usr_cd_p;
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
	
	
	/** [Cnd_trd_cd_ListPutter]の定義 */
	private MCListPutter Cnd_trd_cd_p = null;

	/**
	 * [Cnd_trd_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_trd_cd_ListPutter() {
		if (Cnd_trd_cd_p == null) {
			Cnd_trd_cd_p = createCnd_trd_cd_ListPutter(Cnd_trd_cd, "trd_cd", "trd_nm");

		}
		return Cnd_trd_cd_p;
	}
	
	
	/** [Cnd_ext_sys_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ext_sys_cd_p = null;

	/**
	 * [Cnd_ext_sys_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ext_sys_cd_ListPutter() {
		if (Cnd_ext_sys_cd_p == null) {
			Cnd_ext_sys_cd_p = createCnd_ext_sys_cd_ListPutter(Cnd_ext_sys_cd, "ext_sys_cd", "ext_sys_nm");

		}
		return Cnd_ext_sys_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_PurcSlipSendIfSrch create(){
		MSBDP_PurcSlipSendIfSrch p = new MSBDP_PurcSlipSendIfSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_PurcSlipSendIfSrch create(String name){
		MSBDP_PurcSlipSendIfSrch p = new MSBDP_PurcSlipSendIfSrch(name);
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
		MSBDP_PurcSlipSendIfSrch_MC.jbfInitScreenOpe((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbfInitReSnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbfInitTop((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbfInitFold((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbfInitCnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbfInitCtrl((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbfInitRslt((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbfInitBtn((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbInitScreenOpe((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbInitReSnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbInitTop((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbInitFold((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbInitCnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbInitCtrl((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbInitRslt((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.jbInitBtn((MSBDP_PurcSlipSendIfSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBDP_PurcSlipSendIfSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [ReSnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitReSnd(MSBDP_PurcSlipSendIfSrch p) {
		// ブロック関連の初期化
		p.ReSndPanel = p.beansFactory.createPanel("ReSnd");
		p.ReSndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBDP_PurcSlipSendIfSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBDP_PurcSlipSendIfSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBDP_PurcSlipSendIfSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_RESND = p.beansFactory.createRadioButton("Cnd.ope_RESND");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_re_snd_flg = p.beansFactory.createCheckBox("Cnd.re_snd_flg");
		p.Cnd_not_re_snd_flg = p.beansFactory.createCheckBox("Cnd.not_re_snd_flg");
		p.Cnd_data_no_Label = p.beansFactory.createLabel("Cnd.data_no_Label");
		p.Cnd_data_no = p.beansFactory.createNumberField("Cnd.data_no");
		p.Cnd_data_no.setLabel(p.Cnd_data_no_Label);
		p.Cnd_purc_slip_no_Label = p.beansFactory.createLabel("Cnd.purc_slip_no_Label");
		p.Cnd_purc_slip_no = p.beansFactory.createTextField("Cnd.purc_slip_no");
		p.Cnd_purc_slip_no.setLabel(p.Cnd_purc_slip_no_Label);
		p.Cnd_ac_ym_fr_Label = p.beansFactory.createLabel("Cnd.ac_ym_fr_Label");
		p.Cnd_ac_ym_fr = p.beansFactory.createDateField("Cnd.ac_ym_fr");
		p.Cnd_ac_ym_fr.setLabel(p.Cnd_ac_ym_fr_Label);
		p.Cnd_ac_ym_to_Label = p.beansFactory.createLabel("Cnd.ac_ym_to_Label");
		p.Cnd_ac_ym_to = p.beansFactory.createDateField("Cnd.ac_ym_to");
		p.Cnd_ac_ym_to.setLabel(p.Cnd_ac_ym_to_Label);
		p.Cnd_ac_dt_fr_Label = p.beansFactory.createLabel("Cnd.ac_dt_fr_Label");
		p.Cnd_ac_dt_fr = p.beansFactory.createDateField("Cnd.ac_dt_fr");
		p.Cnd_ac_dt_fr.setLabel(p.Cnd_ac_dt_fr_Label);
		p.Cnd_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.ac_dt_to_Label");
		p.Cnd_ac_dt_to = p.beansFactory.createDateField("Cnd.ac_dt_to");
		p.Cnd_ac_dt_to.setLabel(p.Cnd_ac_dt_to_Label);
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_usr_cd_Label = p.beansFactory.createLabel("Cnd.usr_cd_Label");
		p.Cnd_usr_cd = p.beansFactory.createTextField("Cnd.usr_cd");
		p.Cnd_usr_cd.setLabel(p.Cnd_usr_cd_Label);
		p.Cnd_usr_nm = p.beansFactory.createTextField("Cnd.usr_nm");
		p.Cnd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.dpt_cd_Label");
		p.Cnd_dpt_cd = p.beansFactory.createTextField("Cnd.dpt_cd");
		p.Cnd_dpt_cd.setLabel(p.Cnd_dpt_cd_Label);
		p.Cnd_dpt_nm = p.beansFactory.createTextField("Cnd.dpt_nm");
		p.Cnd_trd_cd_Label = p.beansFactory.createLabel("Cnd.trd_cd_Label");
		p.Cnd_trd_cd = p.beansFactory.createTextComboBox("Cnd.trd_cd");
		p.Cnd_trd_cd.setLabel(p.Cnd_trd_cd_Label);
		p.Cnd_trd_nm = p.beansFactory.createTextField("Cnd.trd_nm");
		p.Cnd_ext_sys_cd_Label = p.beansFactory.createLabel("Cnd.ext_sys_cd_Label");
		p.Cnd_ext_sys_cd = p.beansFactory.createTextComboBox("Cnd.ext_sys_cd");
		p.Cnd_ext_sys_cd.setLabel(p.Cnd_ext_sys_cd_Label);
		p.Cnd_ext_sys_nm = p.beansFactory.createTextField("Cnd.ext_sys_nm");
		p.Cnd_new_flg = p.beansFactory.createCheckBox("Cnd.new_flg");
		p.Cnd_snd_to_err_flg = p.beansFactory.createCheckBox("Cnd.snd_to_err_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBDP_PurcSlipSendIfSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBDP_PurcSlipSendIfSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_data_no = p.beansFactory.createTableColumn("Rslt.data_no", MCColumnType.NUMBER);
		p.columnRslt_purc_slip_no = p.beansFactory.createTableColumn("Rslt.purc_slip_no", MCColumnType.TEXT);
		p.columnRslt_ac_ym = p.beansFactory.createTableColumn("Rslt.ac_ym", MCColumnType.DATE);
		p.columnRslt_ac_dt = p.beansFactory.createTableColumn("Rslt.ac_dt", MCColumnType.DATE);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_trd_ptn_typ = p.beansFactory.createTableColumn("Rslt.trd_ptn_typ", MCColumnType.TEXT);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_usr_cd = p.beansFactory.createTableColumn("Rslt.usr_cd", MCColumnType.TEXT);
		p.columnRslt_usr_nm = p.beansFactory.createTableColumn("Rslt.usr_nm", MCColumnType.TEXT);
		p.columnRslt_dpt_cd = p.beansFactory.createTableColumn("Rslt.dpt_cd", MCColumnType.TEXT);
		p.columnRslt_dpt_nm = p.beansFactory.createTableColumn("Rslt.dpt_nm", MCColumnType.TEXT);
		p.columnRslt_ext_sys_cd = p.beansFactory.createTableColumn("Rslt.ext_sys_cd", MCColumnType.TEXT);
		p.columnRslt_ext_sys_nm = p.beansFactory.createTableColumn("Rslt.ext_sys_nm", MCColumnType.TEXT);
		p.columnRslt_snd_ts = p.beansFactory.createTableColumn("Rslt.snd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_re_snd_flg = p.beansFactory.createTableColumn("Rslt.re_snd_flg", MCColumnType.CHECK);
		p.columnRslt_not_snd_flg = p.beansFactory.createTableColumn("Rslt.not_snd_flg", MCColumnType.CHECK);
		p.columnRslt_snd_to_err_flg = p.beansFactory.createTableColumn("Rslt.snd_to_err_flg", MCColumnType.CHECK);
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
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBDP_PurcSlipSendIfSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MBBEP0080 = p.beansFactory.createButton("Btn.open_MBBEP0080", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_resnd = p.beansFactory.createButton("Btn.resnd", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBDP_PurcSlipSendIfSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.ReSndPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [ReSnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitReSnd(MSBDP_PurcSlipSendIfSrch p) {
		// ブロック関連の初期化
		p.ReSndPanel.setBorder(p.ReSndTitledBorder);
		p.add(p.ReSndPanel);
		p.ReSndPanel.setNextBeans(p.TopPanel);
		p.ReSndPanel.setValueCheck(false);
		p.ReSndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ReSndPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBDP_PurcSlipSendIfSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
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
	protected static void jbInitFold(MSBDP_PurcSlipSendIfSrch p) {
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
	protected static void jbInitCnd(MSBDP_PurcSlipSendIfSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_RESND);
		p.Cnd_ope_RESND.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_RESND);
		p.ScreenOpePanel.add(p.Cnd_ope_RESND);
		p.Cnd_ope_RESND.setNextBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.ope_META);
		p.ReSndPanel.add(p.Cnd_re_snd_flg);
		p.ReSndPanel.setLastBeans(p.Cnd_re_snd_flg);
		p.Cnd_re_snd_flg.setNextBeans(p.Cnd_not_re_snd_flg);
		p.Cnd_re_snd_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.re_snd_flg_META);
		p.ReSndPanel.add(p.Cnd_not_re_snd_flg);
		p.Cnd_not_re_snd_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.not_re_snd_flg_META);
		p.CndPanel.add(p.Cnd_data_no_Label);
		p.CndPanel.add(p.Cnd_data_no);
		p.CndPanel.setLastBeans(p.Cnd_data_no);
		p.Cnd_data_no.setNextBeans(p.Cnd_purc_slip_no);
		p.Cnd_data_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.data_no_META);
		p.CndPanel.add(p.Cnd_purc_slip_no_Label);
		p.CndPanel.add(p.Cnd_purc_slip_no);
		p.Cnd_purc_slip_no.setNextBeans(p.Cnd_ac_ym_fr);
		p.Cnd_purc_slip_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.purc_slip_no_META);
		p.setPluralValueEnable(p.Cnd_purc_slip_no, true);
		p.CndPanel.add(p.Cnd_ac_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ac_ym_fr);
		p.Cnd_ac_ym_fr.setNextBeans(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_fr.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.ac_ym_fr_META);
		p.Cnd_ac_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ac_ym_to_Label);
		p.CndPanel.add(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_to.setNextBeans(p.Cnd_ac_dt_fr);
		p.Cnd_ac_ym_to.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.ac_ym_to_META);
		p.Cnd_ac_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ac_dt_fr);
		p.Cnd_ac_dt_fr.setNextBeans(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.ac_dt_fr_META);
		p.Cnd_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_to.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.ac_dt_to_META);
		p.Cnd_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_usr_cd);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.sppl_nm_META);
		p.CndPanel.add(p.Cnd_usr_cd_Label);
		p.CndPanel.add(p.Cnd_usr_cd);
		p.Cnd_usr_cd.setNextBeans(p.Cnd_usr_nm);
		p.Cnd_usr_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.usr_cd_META);
		p.Cnd_usr_cd.addLinkBeans(p.Cnd_usr_nm);
		p.Cnd_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_usr_cd, true);
		p.CndPanel.add(p.Cnd_usr_nm);
		p.Cnd_usr_nm.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_usr_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.usr_nm_META);
		p.setPluralValueEnable(p.Cnd_usr_nm, true);
		p.CndPanel.add(p.Cnd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.dpt_cd_META);
		p.Cnd_dpt_cd.addLinkBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.CndPanel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_trd_cd);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
		p.Cnd_trd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cd, true);
		p.Cnd_trd_cd.setLinkBeans(p.Cnd_trd_nm);
		p.CndPanel.add(p.Cnd_trd_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cd);
		p.Cnd_trd_cd.setNextBeans(p.Cnd_trd_nm);
		p.Cnd_trd_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.trd_cd_META);
		p.CndPanel.add(p.Cnd_trd_nm);
		p.Cnd_trd_nm.setNextBeans(p.Cnd_ext_sys_cd);
		p.Cnd_trd_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.trd_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_nm, true);
		p.Cnd_ext_sys_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ext_sys_cd, true);
		p.Cnd_ext_sys_cd.setLinkBeans(p.Cnd_ext_sys_nm);
		p.CndPanel.add(p.Cnd_ext_sys_cd_Label);
		p.CndPanel.add(p.Cnd_ext_sys_cd);
		p.Cnd_ext_sys_cd.setNextBeans(p.Cnd_ext_sys_nm);
		p.Cnd_ext_sys_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.ext_sys_cd_META);
		p.CndPanel.add(p.Cnd_ext_sys_nm);
		p.Cnd_ext_sys_nm.setNextBeans(p.Cnd_new_flg);
		p.Cnd_ext_sys_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.ext_sys_nm_META);
		p.setPluralValueEnable(p.Cnd_ext_sys_nm, true);
		p.CndPanel.add(p.Cnd_new_flg);
		p.Cnd_new_flg.setNextBeans(p.Cnd_snd_to_err_flg);
		p.Cnd_new_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.new_flg_META);
		p.CndPanel.add(p.Cnd_snd_to_err_flg);
		p.Cnd_snd_to_err_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0220.CndR.snd_to_err_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBDP_PurcSlipSendIfSrch p) {
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
	protected static void jbInitRslt(MSBDP_PurcSlipSendIfSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBDP_PurcSlipSendIfSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MBBEP0080.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MBBEP0080);
		p.BtnPanel.setLastBeans(p.Btn_open_MBBEP0080);
		p.Btn_open_MBBEP0080.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_resnd);
		p.Btn_resnd.setIcon("REGISTER");
		p.Btn_resnd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_resnd);
		p.Btn_resnd.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
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
		MSBDP_PurcSlipSendIfSrch_MC.mcInitScreenOpe((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.mcInitReSnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.mcInitTop((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.mcInitFold((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.mcInitCnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.mcInitCtrl((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.mcInitRslt((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.mcInitBtn((MSBDP_PurcSlipSendIfSrch)this);

		// [SRCH_RESND]ステータスのモードの設定
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__RESND_ScreenOpe((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__RESND_ReSnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__RESND_Top((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__RESND_Fold((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__RESND_Cnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__RESND_Ctrl((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__RESND_Rslt((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__RESND_Btn((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__RESND_Dtl((MSBDP_PurcSlipSendIfSrch)this);

		// [SRCH_UPD]ステータスのモードの設定
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__UPD_ScreenOpe((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__UPD_ReSnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__UPD_Top((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__UPD_Fold((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__UPD_Cnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__UPD_Ctrl((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__UPD_Rslt((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__UPD_Btn((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__UPD_Dtl((MSBDP_PurcSlipSendIfSrch)this);

		// [SRCH_REF]ステータスのモードの設定
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__REF_ScreenOpe((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__REF_ReSnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__REF_Top((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__REF_Fold((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__REF_Cnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__REF_Ctrl((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__REF_Rslt((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__REF_Btn((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitSRCH__REF_Dtl((MSBDP_PurcSlipSendIfSrch)this);

		// [RESND]ステータスのモードの設定
		MSBDP_PurcSlipSendIfSrch_MC.statusInitRESND_ScreenOpe((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitRESND_ReSnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitRESND_Top((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitRESND_Fold((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitRESND_Cnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitRESND_Ctrl((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitRESND_Rslt((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitRESND_Btn((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitRESND_Dtl((MSBDP_PurcSlipSendIfSrch)this);

		// [UPD]ステータスのモードの設定
		MSBDP_PurcSlipSendIfSrch_MC.statusInitUPD_ScreenOpe((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitUPD_ReSnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitUPD_Top((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitUPD_Fold((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitUPD_Cnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitUPD_Ctrl((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitUPD_Rslt((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitUPD_Btn((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitUPD_Dtl((MSBDP_PurcSlipSendIfSrch)this);

		// [REF]ステータスのモードの設定
		MSBDP_PurcSlipSendIfSrch_MC.statusInitREF_ScreenOpe((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitREF_ReSnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitREF_Top((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitREF_Fold((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitREF_Cnd((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitREF_Ctrl((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitREF_Rslt((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitREF_Btn((MSBDP_PurcSlipSendIfSrch)this);
		MSBDP_PurcSlipSendIfSrch_MC.statusInitREF_Dtl((MSBDP_PurcSlipSendIfSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBDP_PurcSlipSendIfSrch p) {
	}

	/**
	 *  [ReSnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitReSnd(MSBDP_PurcSlipSendIfSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBDP_PurcSlipSendIfSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBDP_PurcSlipSendIfSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBDP_PurcSlipSendIfSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_RESND.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_re_snd_flg.addAllListener(p);
		p.Cnd_not_re_snd_flg.addAllListener(p);
		p.Cnd_data_no.setListListener(p);
		p.Cnd_data_no.addAllListener(p);
		p.Cnd_purc_slip_no.setListListener(p);
		p.Cnd_purc_slip_no.addAllListener(p);
		p.Cnd_ac_ym_fr.setListListener(p);
		p.Cnd_ac_ym_fr.addAllListener(p);
		p.Cnd_ac_ym_to.setListListener(p);
		p.Cnd_ac_ym_to.addAllListener(p);
		p.Cnd_ac_dt_fr.setListListener(p);
		p.Cnd_ac_dt_fr.addAllListener(p);
		p.Cnd_ac_dt_to.setListListener(p);
		p.Cnd_ac_dt_to.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_usr_cd.setListListener(p);
		p.Cnd_usr_cd.addAllListener(p);
		p.Cnd_usr_nm.setListListener(p);
		p.Cnd_usr_nm.addAllListener(p);
		p.Cnd_dpt_cd.setListListener(p);
		p.Cnd_dpt_cd.addAllListener(p);
		p.Cnd_dpt_nm.setListListener(p);
		p.Cnd_dpt_nm.addAllListener(p);
		p.Cnd_trd_cd.setListListener(p);
		p.Cnd_trd_cd.addAllListener(p);
		p.Cnd_trd_nm.setListListener(p);
		p.Cnd_trd_nm.addAllListener(p);
		p.Cnd_ext_sys_cd.setListListener(p);
		p.Cnd_ext_sys_cd.addAllListener(p);
		p.Cnd_ext_sys_nm.setListListener(p);
		p.Cnd_ext_sys_nm.addAllListener(p);
		p.Cnd_new_flg.addAllListener(p);
		p.Cnd_snd_to_err_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBDP_PurcSlipSendIfSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBDP_PurcSlipSendIfSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_data_no.addAllListener(p);
		p.columnRslt_data_no.setListListener(p);
		p.columnRslt_purc_slip_no.addAllListener(p);
		p.columnRslt_purc_slip_no.setListListener(p);
		p.columnRslt_ac_ym.addAllListener(p);
		p.columnRslt_ac_ym.setListListener(p);
		p.columnRslt_ac_dt.addAllListener(p);
		p.columnRslt_ac_dt.setListListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_trd_ptn_typ.addAllListener(p);
		p.columnRslt_trd_ptn_typ.setListListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_usr_cd.addAllListener(p);
		p.columnRslt_usr_cd.setListListener(p);
		p.columnRslt_usr_nm.addAllListener(p);
		p.columnRslt_usr_nm.setListListener(p);
		p.columnRslt_dpt_cd.addAllListener(p);
		p.columnRslt_dpt_cd.setListListener(p);
		p.columnRslt_dpt_nm.addAllListener(p);
		p.columnRslt_dpt_nm.setListListener(p);
		p.columnRslt_ext_sys_cd.addAllListener(p);
		p.columnRslt_ext_sys_cd.setListListener(p);
		p.columnRslt_ext_sys_nm.addAllListener(p);
		p.columnRslt_ext_sys_nm.setListListener(p);
		p.columnRslt_snd_ts.addAllListener(p);
		p.columnRslt_snd_ts.setListListener(p);
		p.columnRslt_re_snd_flg.addAllListener(p);
		p.columnRslt_not_snd_flg.addAllListener(p);
		p.columnRslt_snd_to_err_flg.addAllListener(p);
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
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBDP_PurcSlipSendIfSrch p) {
		p.Btn_open_MBBEP0080.addAllListener(p);
		p.Btn_open_MBBEP0080.setAPMethodName("doBtn_open_MBBEP0080");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_resnd.addAllListener(p);
		p.Btn_resnd.setAPMethodName("doBtn_resnd");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [SRCH_RESND]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RESND_ScreenOpe(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [SRCH_RESND]ステータスの[ReSnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RESND_ReSnd(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [SRCH_RESND]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RESND_Top(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [SRCH_RESND]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RESND_Fold(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [SRCH_RESND]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RESND_Cnd(MSBDP_PurcSlipSendIfSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_RESND, MCMode.REQUIRED);
		p.Cnd_re_snd_flg.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.Cnd_not_re_snd_flg.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.Cnd_data_no.putMode(p, SRCH_RESND, MCMode.ENABLE);
		p.Cnd_purc_slip_no.putMode(p, SRCH_RESND, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, SRCH_RESND, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, SRCH_RESND, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_RESND, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_RESND, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_RESND, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_RESND, MCMode.ENABLE);
		p.Cnd_usr_cd.putMode(p, SRCH_RESND, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, SRCH_RESND, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH_RESND, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH_RESND, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_RESND, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_RESND, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, SRCH_RESND, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, SRCH_RESND, MCMode.ENABLE);
		p.Cnd_new_flg.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.Cnd_snd_to_err_flg.putMode(p, SRCH_RESND, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_RESND]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RESND_Ctrl(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [SRCH_RESND]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RESND_Rslt(MSBDP_PurcSlipSendIfSrch p){
		p.columnRslt_check.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_data_no.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_purc_slip_no.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_RESND, MCMode.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_snd_ts.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_re_snd_flg.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_not_snd_flg.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_snd_to_err_flg.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_RESND, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_RESND, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_RESND, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_RESND]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RESND_Btn(MSBDP_PurcSlipSendIfSrch p){
		p.Btn_open_MBBEP0080.putMode(p, SRCH_RESND, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_RESND, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_RESND, MCMode.DISABLE);
		p.Btn_resnd.putMode(p, SRCH_RESND, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_RESND, MCMode.DISABLE);

	}

	/**
	 * [SRCH_RESND]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RESND_Dtl(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [SRCH_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ScreenOpe(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [SRCH_UPD]ステータスの[ReSnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ReSnd(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Top(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Fold(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Cnd(MSBDP_PurcSlipSendIfSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_re_snd_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_not_re_snd_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_data_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_purc_slip_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_usr_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_new_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_snd_to_err_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Ctrl(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Rslt(MSBDP_PurcSlipSendIfSrch p){
		p.columnRslt_check.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_data_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_purc_slip_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_snd_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_re_snd_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_not_snd_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_snd_to_err_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Btn(MSBDP_PurcSlipSendIfSrch p){
		p.Btn_open_MBBEP0080.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_resnd.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_UPD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Dtl(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[ReSnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ReSnd(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Top(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Fold(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MSBDP_PurcSlipSendIfSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_re_snd_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_not_re_snd_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_data_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_purc_slip_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_usr_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_new_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_snd_to_err_flg.putMode(p, SRCH_REF, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Ctrl(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Rslt(MSBDP_PurcSlipSendIfSrch p){
		p.columnRslt_check.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_data_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_purc_slip_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_snd_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_re_snd_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_not_snd_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_snd_to_err_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MSBDP_PurcSlipSendIfSrch p){
		p.Btn_open_MBBEP0080.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_resnd.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_REF, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Dtl(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [RESND]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitRESND_ScreenOpe(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [RESND]ステータスの[ReSnd]ブロックのモードの設定
	 */
	protected static void statusInitRESND_ReSnd(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [RESND]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitRESND_Top(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [RESND]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitRESND_Fold(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [RESND]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitRESND_Cnd(MSBDP_PurcSlipSendIfSrch p){
		p.Cnd_ope_Group.putMode(p, RESND, MCMode.REQUIRED);
		p.Cnd_re_snd_flg.putMode(p, RESND, MCMode.READ_ONLY);
		p.Cnd_not_re_snd_flg.putMode(p, RESND, MCMode.READ_ONLY);
		p.Cnd_data_no.putMode(p, RESND, MCMode.ENABLE);
		p.Cnd_purc_slip_no.putMode(p, RESND, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, RESND, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, RESND, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, RESND, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, RESND, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, RESND, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, RESND, MCMode.ENABLE);
		p.Cnd_usr_cd.putMode(p, RESND, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, RESND, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, RESND, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, RESND, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, RESND, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, RESND, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, RESND, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, RESND, MCMode.ENABLE);
		p.Cnd_new_flg.putMode(p, RESND, MCMode.READ_ONLY);
		p.Cnd_snd_to_err_flg.putMode(p, RESND, MCMode.READ_ONLY);

	}

	/**
	 * [RESND]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitRESND_Ctrl(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [RESND]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitRESND_Rslt(MSBDP_PurcSlipSendIfSrch p){
		p.columnRslt_check.putMode(p, RESND, MCMode.REQUIRED);
		p.columnRslt_data_no.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_purc_slip_no.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, RESND, MCMode.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_snd_ts.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_re_snd_flg.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_not_snd_flg.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_snd_to_err_flg.putMode(p, RESND, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(RESND, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, RESND, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, RESND, MCMode.READ_ONLY);

	}

	/**
	 * [RESND]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitRESND_Btn(MSBDP_PurcSlipSendIfSrch p){
		p.Btn_open_MBBEP0080.putMode(p, RESND, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, RESND, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, RESND, MCMode.ENABLE);
		p.Btn_resnd.putMode(p, RESND, MCMode.ENABLE);
		p.Btn_upd.putMode(p, RESND, MCMode.INVISIBLE);

	}

	/**
	 * [RESND]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitRESND_Dtl(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [UPD]ステータスの[ReSnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ReSnd(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBDP_PurcSlipSendIfSrch p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_re_snd_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_not_re_snd_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_data_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_slip_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_new_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_snd_to_err_flg.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBDP_PurcSlipSendIfSrch p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_data_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_purc_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_snd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_re_snd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_not_snd_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_snd_to_err_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBDP_PurcSlipSendIfSrch p){
		p.Btn_open_MBBEP0080.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_resnd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [REF]ステータスの[ReSnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_ReSnd(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBDP_PurcSlipSendIfSrch p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_re_snd_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_not_re_snd_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_data_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_slip_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_new_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_snd_to_err_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBDP_PurcSlipSendIfSrch p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_data_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_snd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_re_snd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_not_snd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_snd_to_err_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBDP_PurcSlipSendIfSrch p){
		p.Btn_open_MBBEP0080.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.ENABLE);
		p.Btn_resnd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBDP_PurcSlipSendIfSrch p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_RESND;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBDP_PurcSlipSendIfSrch_MC.setTableConfigRslt((MSBDP_PurcSlipSendIfSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBDP_PurcSlipSendIfSrch p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_data_no.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.data_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_data_no);
		p.columnRslt_purc_slip_no.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.purc_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_slip_no);
		p.columnRslt_ac_ym.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.ac_ym_META);
		p.columnRslt_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_ym);
		p.columnRslt_ac_dt.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.ac_dt_META);
		p.columnRslt_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_dt);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.columnRslt_trd_ptn_typ.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.trd_ptn_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_ptn_typ);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.columnRslt_usr_cd.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_cd);
		p.columnRslt_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_nm);
		p.columnRslt_dpt_cd.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_cd);
		p.columnRslt_dpt_nm.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_nm);
		p.columnRslt_ext_sys_cd.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.ext_sys_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_cd);
		p.columnRslt_ext_sys_nm.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.ext_sys_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_nm);
		p.columnRslt_snd_ts.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.snd_ts_META);
		p.columnRslt_snd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_snd_ts);
		p.columnRslt_re_snd_flg.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.re_snd_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_re_snd_flg);
		p.columnRslt_not_snd_flg.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.not_snd_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_not_snd_flg);
		p.columnRslt_snd_to_err_flg.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.snd_to_err_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_snd_to_err_flg);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBD.MSBDP0220.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_usr_cd.getListConfig().setPutter(getCnd_usr_cd_ListPutter());
		Cnd_dpt_cd.getListConfig().setPutter(getCnd_dpt_cd_ListPutter());
		Cnd_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cd.getListConfig().setPutter(getCnd_trd_cd_ListPutter());
		Cnd_ext_sys_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ext_sys_cd.getListConfig().setPutter(getCnd_ext_sys_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_RESND]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_RESNDStatus() {
		status = SRCH_RESND;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UPDStatus() {
		status = SRCH_UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REFStatus() {
		status = SRCH_REF;
		setAllStatus(status);
	}

	/**
	 * この画面を[RESND]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setRESNDStatus() {
		status = RESND;
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
		if (SRCH_RESND.equals(status)) {
			setSRCH_RESNDStatus();
		}
		else if (SRCH_UPD.equals(status)) {
			setSRCH_UPDStatus();
		}
		else if (SRCH_REF.equals(status)) {
			setSRCH_REFStatus();
		}
		else if (RESND.equals(status)) {
			setRESNDStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Cnd_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
		return lp;
	}
	 
	/**
	 * [Cnd_ext_sys_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ext_sys_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExtSys");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_usr_cd) return getCnd_usr_cd(row, info);
		if(combo == Cnd_dpt_cd) return getCnd_dpt_cd(row, info);
		if(combo == Cnd_trd_cd) return getCnd_trd_cd(row, info);
		if(combo == Cnd_ext_sys_cd) return getCnd_ext_sys_cd(row, info);
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
		else if (ap == Btn_open_MBBEP0080) doBtn_open_MBBEP0080(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_resnd) doBtn_resnd(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MBBEP0080]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MBBEP0080(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[resnd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_resnd(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_re_snd_flg) return doCnd_re_snd_flg_VC(info);
		if (vc == Cnd_not_re_snd_flg) return doCnd_not_re_snd_flg_VC(info);
		if (vc == Cnd_data_no) return doCnd_data_no_VC(info);
		if (vc == Cnd_purc_slip_no) return doCnd_purc_slip_no_VC(info);
		if (vc == Cnd_ac_ym_fr) return doCnd_ac_ym_fr_VC(info);
		if (vc == Cnd_ac_ym_to) return doCnd_ac_ym_to_VC(info);
		if (vc == Cnd_ac_dt_fr) return doCnd_ac_dt_fr_VC(info);
		if (vc == Cnd_ac_dt_to) return doCnd_ac_dt_to_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_usr_cd) return doCnd_usr_cd_VC(info);
		if (vc == Cnd_usr_nm) return doCnd_usr_nm_VC(info);
		if (vc == Cnd_dpt_cd) return doCnd_dpt_cd_VC(info);
		if (vc == Cnd_dpt_nm) return doCnd_dpt_nm_VC(info);
		if (vc == Cnd_trd_cd) return doCnd_trd_cd_VC(info);
		if (vc == Cnd_trd_nm) return doCnd_trd_nm_VC(info);
		if (vc == Cnd_ext_sys_cd) return doCnd_ext_sys_cd_VC(info);
		if (vc == Cnd_ext_sys_nm) return doCnd_ext_sys_nm_VC(info);
		if (vc == Cnd_new_flg) return doCnd_new_flg_VC(info);
		if (vc == Cnd_snd_to_err_flg) return doCnd_snd_to_err_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_data_no) return doRslt_data_no_VC(info);
		if (vc == columnRslt_purc_slip_no) return doRslt_purc_slip_no_VC(info);
		if (vc == columnRslt_ac_ym) return doRslt_ac_ym_VC(info);
		if (vc == columnRslt_ac_dt) return doRslt_ac_dt_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_trd_ptn_typ) return doRslt_trd_ptn_typ_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_usr_cd) return doRslt_usr_cd_VC(info);
		if (vc == columnRslt_usr_nm) return doRslt_usr_nm_VC(info);
		if (vc == columnRslt_dpt_cd) return doRslt_dpt_cd_VC(info);
		if (vc == columnRslt_dpt_nm) return doRslt_dpt_nm_VC(info);
		if (vc == columnRslt_ext_sys_cd) return doRslt_ext_sys_cd_VC(info);
		if (vc == columnRslt_ext_sys_nm) return doRslt_ext_sys_nm_VC(info);
		if (vc == columnRslt_snd_ts) return doRslt_snd_ts_VC(info);
		if (vc == columnRslt_re_snd_flg) return doRslt_re_snd_flg_VC(info);
		if (vc == columnRslt_not_snd_flg) return doRslt_not_snd_flg_VC(info);
		if (vc == columnRslt_snd_to_err_flg) return doRslt_snd_to_err_flg_VC(info);
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[re_snd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_re_snd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_re_snd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_re_snd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[data_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_data_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_slip_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[new_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_new_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[snd_to_err_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_snd_to_err_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[data_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_data_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_slip_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[snd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_snd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[re_snd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_re_snd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[not_snd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_not_snd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[snd_to_err_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_snd_to_err_flg_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_re_snd_flg) doCnd_re_snd_flg_NC(info);
		else if (nc == Cnd_not_re_snd_flg) doCnd_not_re_snd_flg_NC(info);
		else if (nc == Cnd_data_no) doCnd_data_no_NC(info);
		else if (nc == Cnd_purc_slip_no) doCnd_purc_slip_no_NC(info);
		else if (nc == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NC(info);
		else if (nc == Cnd_ac_ym_to) doCnd_ac_ym_to_NC(info);
		else if (nc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NC(info);
		else if (nc == Cnd_ac_dt_to) doCnd_ac_dt_to_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_usr_cd) doCnd_usr_cd_NC(info);
		else if (nc == Cnd_usr_nm) doCnd_usr_nm_NC(info);
		else if (nc == Cnd_dpt_cd) doCnd_dpt_cd_NC(info);
		else if (nc == Cnd_dpt_nm) doCnd_dpt_nm_NC(info);
		else if (nc == Cnd_trd_cd) doCnd_trd_cd_NC(info);
		else if (nc == Cnd_trd_nm) doCnd_trd_nm_NC(info);
		else if (nc == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NC(info);
		else if (nc == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NC(info);
		else if (nc == Cnd_new_flg) doCnd_new_flg_NC(info);
		else if (nc == Cnd_snd_to_err_flg) doCnd_snd_to_err_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_data_no) doRslt_data_no_NC(info);
		else if (nc == columnRslt_purc_slip_no) doRslt_purc_slip_no_NC(info);
		else if (nc == columnRslt_ac_ym) doRslt_ac_ym_NC(info);
		else if (nc == columnRslt_ac_dt) doRslt_ac_dt_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_usr_cd) doRslt_usr_cd_NC(info);
		else if (nc == columnRslt_usr_nm) doRslt_usr_nm_NC(info);
		else if (nc == columnRslt_dpt_cd) doRslt_dpt_cd_NC(info);
		else if (nc == columnRslt_dpt_nm) doRslt_dpt_nm_NC(info);
		else if (nc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NC(info);
		else if (nc == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NC(info);
		else if (nc == columnRslt_snd_ts) doRslt_snd_ts_NC(info);
		else if (nc == columnRslt_re_snd_flg) doRslt_re_snd_flg_NC(info);
		else if (nc == columnRslt_not_snd_flg) doRslt_not_snd_flg_NC(info);
		else if (nc == columnRslt_snd_to_err_flg) doRslt_snd_to_err_flg_NC(info);
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
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[re_snd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_re_snd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_re_snd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_re_snd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_slip_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[snd_to_err_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_snd_to_err_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_slip_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[snd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_snd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[re_snd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_re_snd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_snd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_snd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[snd_to_err_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_snd_to_err_flg_NC(MCEventInfo info){
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
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_re_snd_flg) doCnd_re_snd_flg_NE(info);
		else if (ne == Cnd_not_re_snd_flg) doCnd_not_re_snd_flg_NE(info);
		else if (ne == Cnd_data_no) doCnd_data_no_NE(info);
		else if (ne == Cnd_purc_slip_no) doCnd_purc_slip_no_NE(info);
		else if (ne == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NE(info);
		else if (ne == Cnd_ac_ym_to) doCnd_ac_ym_to_NE(info);
		else if (ne == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NE(info);
		else if (ne == Cnd_ac_dt_to) doCnd_ac_dt_to_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_usr_cd) doCnd_usr_cd_NE(info);
		else if (ne == Cnd_usr_nm) doCnd_usr_nm_NE(info);
		else if (ne == Cnd_dpt_cd) doCnd_dpt_cd_NE(info);
		else if (ne == Cnd_dpt_nm) doCnd_dpt_nm_NE(info);
		else if (ne == Cnd_trd_cd) doCnd_trd_cd_NE(info);
		else if (ne == Cnd_trd_nm) doCnd_trd_nm_NE(info);
		else if (ne == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NE(info);
		else if (ne == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NE(info);
		else if (ne == Cnd_new_flg) doCnd_new_flg_NE(info);
		else if (ne == Cnd_snd_to_err_flg) doCnd_snd_to_err_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_data_no) doRslt_data_no_NE(info);
		else if (ne == columnRslt_purc_slip_no) doRslt_purc_slip_no_NE(info);
		else if (ne == columnRslt_ac_ym) doRslt_ac_ym_NE(info);
		else if (ne == columnRslt_ac_dt) doRslt_ac_dt_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_usr_cd) doRslt_usr_cd_NE(info);
		else if (ne == columnRslt_usr_nm) doRslt_usr_nm_NE(info);
		else if (ne == columnRslt_dpt_cd) doRslt_dpt_cd_NE(info);
		else if (ne == columnRslt_dpt_nm) doRslt_dpt_nm_NE(info);
		else if (ne == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NE(info);
		else if (ne == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NE(info);
		else if (ne == columnRslt_snd_ts) doRslt_snd_ts_NE(info);
		else if (ne == columnRslt_re_snd_flg) doRslt_re_snd_flg_NE(info);
		else if (ne == columnRslt_not_snd_flg) doRslt_not_snd_flg_NE(info);
		else if (ne == columnRslt_snd_to_err_flg) doRslt_snd_to_err_flg_NE(info);
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
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[re_snd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_re_snd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_re_snd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_re_snd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_slip_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[snd_to_err_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_snd_to_err_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_slip_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[snd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_snd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[re_snd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_re_snd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_snd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_snd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[snd_to_err_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_snd_to_err_flg_NE(MCEventInfo info){
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
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_re_snd_flg) doCnd_re_snd_flg_NX(info);
		else if (nx == Cnd_not_re_snd_flg) doCnd_not_re_snd_flg_NX(info);
		else if (nx == Cnd_data_no) doCnd_data_no_NX(info);
		else if (nx == Cnd_purc_slip_no) doCnd_purc_slip_no_NX(info);
		else if (nx == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NX(info);
		else if (nx == Cnd_ac_ym_to) doCnd_ac_ym_to_NX(info);
		else if (nx == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NX(info);
		else if (nx == Cnd_ac_dt_to) doCnd_ac_dt_to_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_usr_cd) doCnd_usr_cd_NX(info);
		else if (nx == Cnd_usr_nm) doCnd_usr_nm_NX(info);
		else if (nx == Cnd_dpt_cd) doCnd_dpt_cd_NX(info);
		else if (nx == Cnd_dpt_nm) doCnd_dpt_nm_NX(info);
		else if (nx == Cnd_trd_cd) doCnd_trd_cd_NX(info);
		else if (nx == Cnd_trd_nm) doCnd_trd_nm_NX(info);
		else if (nx == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NX(info);
		else if (nx == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NX(info);
		else if (nx == Cnd_new_flg) doCnd_new_flg_NX(info);
		else if (nx == Cnd_snd_to_err_flg) doCnd_snd_to_err_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_data_no) doRslt_data_no_NX(info);
		else if (nx == columnRslt_purc_slip_no) doRslt_purc_slip_no_NX(info);
		else if (nx == columnRslt_ac_ym) doRslt_ac_ym_NX(info);
		else if (nx == columnRslt_ac_dt) doRslt_ac_dt_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_usr_cd) doRslt_usr_cd_NX(info);
		else if (nx == columnRslt_usr_nm) doRslt_usr_nm_NX(info);
		else if (nx == columnRslt_dpt_cd) doRslt_dpt_cd_NX(info);
		else if (nx == columnRslt_dpt_nm) doRslt_dpt_nm_NX(info);
		else if (nx == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NX(info);
		else if (nx == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NX(info);
		else if (nx == columnRslt_snd_ts) doRslt_snd_ts_NX(info);
		else if (nx == columnRslt_re_snd_flg) doRslt_re_snd_flg_NX(info);
		else if (nx == columnRslt_not_snd_flg) doRslt_not_snd_flg_NX(info);
		else if (nx == columnRslt_snd_to_err_flg) doRslt_snd_to_err_flg_NX(info);
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
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[re_snd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_re_snd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_re_snd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_re_snd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_slip_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[snd_to_err_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_snd_to_err_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_slip_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[snd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_snd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[re_snd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_re_snd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_snd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_snd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[snd_to_err_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_snd_to_err_flg_NX(MCEventInfo info){
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
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_data_no) doCnd_data_no_LC(info);
		else if (lc == Cnd_purc_slip_no) doCnd_purc_slip_no_LC(info);
		else if (lc == Cnd_ac_ym_fr) doCnd_ac_ym_fr_LC(info);
		else if (lc == Cnd_ac_ym_to) doCnd_ac_ym_to_LC(info);
		else if (lc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_LC(info);
		else if (lc == Cnd_ac_dt_to) doCnd_ac_dt_to_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_usr_cd) doCnd_usr_cd_LC(info);
		else if (lc == Cnd_usr_nm) doCnd_usr_nm_LC(info);
		else if (lc == Cnd_dpt_cd) doCnd_dpt_cd_LC(info);
		else if (lc == Cnd_dpt_nm) doCnd_dpt_nm_LC(info);
		else if (lc == Cnd_trd_cd) doCnd_trd_cd_LC(info);
		else if (lc == Cnd_trd_nm) doCnd_trd_nm_LC(info);
		else if (lc == Cnd_ext_sys_cd) doCnd_ext_sys_cd_LC(info);
		else if (lc == Cnd_ext_sys_nm) doCnd_ext_sys_nm_LC(info);
		else if (lc == columnRslt_data_no) doRslt_data_no_LC(info);
		else if (lc == columnRslt_purc_slip_no) doRslt_purc_slip_no_LC(info);
		else if (lc == columnRslt_ac_ym) doRslt_ac_ym_LC(info);
		else if (lc == columnRslt_ac_dt) doRslt_ac_dt_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_usr_cd) doRslt_usr_cd_LC(info);
		else if (lc == columnRslt_usr_nm) doRslt_usr_nm_LC(info);
		else if (lc == columnRslt_dpt_cd) doRslt_dpt_cd_LC(info);
		else if (lc == columnRslt_dpt_nm) doRslt_dpt_nm_LC(info);
		else if (lc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_LC(info);
		else if (lc == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_LC(info);
		else if (lc == columnRslt_snd_ts) doRslt_snd_ts_LC(info);
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
	}

	/**
	 * [Cnd]パネルの[data_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_slip_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_slip_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[snd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_snd_ts_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_usr_cd]の作成メソッド
	 */
	public MCList getCnd_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ext_sys_cd]の作成メソッド
	 */
	public MCList getCnd_ext_sys_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExtSys(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBDL0220.Srch01")) {
			return new MS_MSBDL0220_Srch01Bridge();
		}
		if (id.equals("MS.MSBDL0220.Upd01")) {
			return new MS_MSBDL0220_Upd01Bridge();
		}
		if (id.equals("MS.MSBDL0220.Upd02")) {
			return new MS_MSBDL0220_Upd02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBDL0220_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0220_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0220_Srch01;

		/** コンストラクタ */
		protected MS_MSBDL0220_Srch01Bridge() {
			p_MS_MSBDL0220_Srch01 = new MCParam(PDef.MS_MSBDL0220_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0220_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0220.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0220.RsltR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0220.DtlR.class));

			p_MS_MSBDL0220_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0220_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0220_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0220_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0220_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0220.CndR up0() {
			return (mcframe.clientMSBD.MSBDP0220.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0220.RsltR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0220.RsltR>)down(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0220.DtlR> down1() {
			return (MCList<mcframe.clientMSBD.MSBDP0220.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0220_Srch01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0220.RsltR.class));
			p_MS_MSBDL0220_Srch01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0220.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0220_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBD.MSBDP0220.RsltR>)p_MS_MSBDL0220_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0220.DtlR>)p_MS_MSBDL0220_Srch01.getContainerParam().getDownBlock(1));
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
	 * [MS_MSBDL0220_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0220_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0220_Upd01;

		/** コンストラクタ */
		protected MS_MSBDL0220_Upd01Bridge() {
			p_MS_MSBDL0220_Upd01 = new MCParam(PDef.MS_MSBDL0220_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0220_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0220.RsltR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0220.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0220.RsltR.class));

			p_MS_MSBDL0220_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0220_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0220_Upd01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBDL0220_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0220_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0220_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0220.RsltR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0220.RsltR>)up(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0220.DtlR> up1() {
			return (MCList<mcframe.clientMSBD.MSBDP0220.DtlR>)up(1);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0220.RsltR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0220.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0220_Upd01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0220.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0220_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBD.MSBDP0220.RsltR>)p_MS_MSBDL0220_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0220_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0220_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0220_Upd02;

		/** コンストラクタ */
		protected MS_MSBDL0220_Upd02Bridge() {
			p_MS_MSBDL0220_Upd02 = new MCParam(PDef.MS_MSBDL0220_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0220_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0220.RsltR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0220.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0220.RsltR.class));

			p_MS_MSBDL0220_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0220_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0220_Upd02.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBDL0220_Upd02.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0220_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0220_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0220.RsltR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0220.RsltR>)up(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0220.DtlR> up1() {
			return (MCList<mcframe.clientMSBD.MSBDP0220.DtlR>)up(1);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0220.RsltR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0220.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0220_Upd02.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0220.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0220_Upd02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBD.MSBDP0220.RsltR>)p_MS_MSBDL0220_Upd02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}