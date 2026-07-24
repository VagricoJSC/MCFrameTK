package mcframe.clientMSBE.MSBEP0090;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0020.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP0440.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5030.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.commonFXUC.FXUCC0010.FXUCC_DataUtil.*;
import mcframe.commonMS.constant.MSC_IO_SCHD_TYP;
import mcframe.commonMS.constant.MSC_IO_SCHD_STS_TYP;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_IoSchdSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_IoSchdSrch_MC extends MSBEP_IoSchdSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_IoSchdSrch_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_IoSchdSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBEL0090_Srch01().execDL();
	}
	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setDispTabSelectAll(true);
	}
	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setDispTabSelectAll(false);
	}
	/**
	 * [MS_MSBEL0090_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0090_Srch01Caller<P extends MSBEP_IoSchdSrch, B extends MS_MSBEL0090_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0090_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackForSrch(msgList);
		}

		/**
		 * 検索条件のチェックの共通処理
		 * @param msgList
		 */
		protected void checkForCallStackForSrch(MCMessageList msgList) {
			checkDt(msgList);
			checkChkBoxStatus(msgList);
		}

		/**
		 * 日付の前後関係をチェックする。
		 * 
		 * @param msgList メッセージリスト
		 */
		protected void checkDt(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_schd_dt_fr, Cnd_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_accpt_schd_dt_fr, Cnd_accpt_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_avl_schd_dt_fr, Cnd_avl_schd_dt_to));
		}

		/**
		 * チェックボックスのステータスをチェックする。
		 * 
		 * @param msgList メッセージリスト
		 */
		protected void checkChkBoxStatus(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(Sno1NullPanel));
			msgList.addAll(checkAtLeastOne(Sno2NullPanel));
			msgList.addAll(checkAtLeastOne(Sno3NullPanel));
			msgList.addAll(checkAtLeastOne(Sno4NullPanel));
			msgList.addAll(checkAtLeastOne(AllocTgtPanel));
			msgList.addAll(checkAtLeastOne(AllocPanel));
			msgList.addAll(checkAtLeastOne(AllocWaitPanel));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setREFStatus();

			//集計の場合、非表示項目を非表示にする
			if (!getCndR().slip_schd_no_flg()){
				setDispMode();
			}
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}

		/**
		 * 集計時の非表示項目を非表示にする。
		 */
		protected void setDispMode() {
			setDispInvisible();
			setDispDefaultInvisible();
		}

		/**
		 * 集計タブでチェックオフの集計関連項目を非表示にする。
		 */
		protected void setDispInvisible() {
			columnRslt_slip_schd_no.setMode(MCMode.INVISIBLE);
			if (!getCndR().schd_dt_flg()) {
				columnRslt_schd_dt.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().accpt_schd_dt_flg()) {
				columnRslt_accpt_schd_dt.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().avl_schd_dt_flg()) {
				columnRslt_avl_schd_dt.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().loc_flg()) {
				columnRslt_loc_cd.setMode(MCMode.INVISIBLE);
				columnRslt_loc_nm.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().str_ln_flg()) {
				columnRslt_str_ln_cd.setMode(MCMode.INVISIBLE);
				columnRslt_str_ln_nm.setMode(MCMode.INVISIBLE);
				columnRslt_str_ln_cd_none_flg.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().stk_arrv_flg()) {
				columnRslt_stk_arrv_bp_cd.setMode(MCMode.INVISIBLE);
				columnRslt_stk_arrv_bp_nm.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().site_flg()) {
				columnRslt_site_cd.setMode(MCMode.INVISIBLE);
				columnRslt_site_nm.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().wg_flg()) {
				columnRslt_wg_cd.setMode(MCMode.INVISIBLE);
				columnRslt_wg_nm.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().lg_grp_flg()) {
				columnRslt_lg_grp_cd.setMode(MCMode.INVISIBLE);
				columnRslt_lg_grp_nm.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().alloc_grp_flg()) {
				columnRslt_alloc_grp_cd.setMode(MCMode.INVISIBLE);
				columnRslt_alloc_grp_nm.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().loc_grp_flg()) {
				columnRslt_loc_grp_cd.setMode(MCMode.INVISIBLE);
				columnRslt_loc_grp_nm.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().sppl_flg()) {
				columnRslt_sppl_cd.setMode(MCMode.INVISIBLE);
				columnRslt_sppl_nm.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().lot_no_flg()) {
				columnRslt_lot_no.setMode(MCMode.INVISIBLE);
				columnRslt_ver_no.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().sublot_no_flg()) {
				columnRslt_sublot_no.setMode(MCMode.INVISIBLE);
				columnRslt_ver_no.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().sno1_flg()) {
				columnRslt_sno1_null_flg.setMode(MCMode.INVISIBLE);
				columnRslt_sno1.setMode(MCMode.INVISIBLE);
				columnRslt_ver_no.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().sno2_flg()) {
				columnRslt_sno2_null_flg.setMode(MCMode.INVISIBLE);
				columnRslt_sno2.setMode(MCMode.INVISIBLE);
				columnRslt_ver_no.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().sno3_flg()) {
				columnRslt_sno3_null_flg.setMode(MCMode.INVISIBLE);
				columnRslt_sno3.setMode(MCMode.INVISIBLE);
				columnRslt_ver_no.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().sno4_flg()) {
				columnRslt_sno4_null_flg.setMode(MCMode.INVISIBLE);
				columnRslt_sno4.setMode(MCMode.INVISIBLE);
				columnRslt_ver_no.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().pack_flg()) {
				columnRslt_i_pack_unit_qty.setMode(MCMode.INVISIBLE);
				columnRslt_o_pack_unit_qty.setMode(MCMode.INVISIBLE);
				columnRslt_pack_unit_cd.setMode(MCMode.INVISIBLE);
				columnRslt_pack_unit_nm.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().alt_grp_flg()) {
				columnRslt_alt_grp_cd.setMode(MCMode.INVISIBLE);
				columnRslt_alt_grp_nm.setMode(MCMode.INVISIBLE);
				columnRslt_alt_grp_seq.setMode(MCMode.INVISIBLE);
				columnRslt_oper_inst_no.setMode(MCMode.INVISIBLE);
				columnRslt_oper_ord_no.setMode(MCMode.INVISIBLE);
				columnRslt_alt_qty.setMode(MCMode.INVISIBLE);
				columnRslt_alt_itm_typ.setMode(MCMode.INVISIBLE);
				columnRslt_alt_itm_typ_nm.setMode(MCMode.INVISIBLE);
				columnRslt_alt_itm_ratio.setMode(MCMode.INVISIBLE);
				columnRslt_alt_alloc_prio.setMode(MCMode.INVISIBLE);
			}
			if (!getCndR().gd_flg()) {
				columnRslt_gd_cd.setMode(MCMode.INVISIBLE);
				columnRslt_gd_nm.setMode(MCMode.INVISIBLE);
			}
		}

		/**
		 * 集計時のデフォールトの非表示項目を非表示にする。
		 */
		protected void setDispDefaultInvisible() {
			columnRslt_alloc_tgt_flg.setMode(MCMode.INVISIBLE);
			columnRslt_alloc_scope_typ.setMode(MCMode.INVISIBLE);
			columnRslt_alloc_scope_typ_nm.setMode(MCMode.INVISIBLE);
			columnRslt_alloc_flg.setMode(MCMode.INVISIBLE);
			columnRslt_alloc_wait_flg.setMode(MCMode.INVISIBLE);
			columnRslt_vld_dt_fr.setMode(MCMode.INVISIBLE);
			columnRslt_vld_dt_to.setMode(MCMode.INVISIBLE);
			columnRslt_inpt_ctl_typ.setMode(MCMode.INVISIBLE);
			columnRslt_inpt_ctl_typ_nm.setMode(MCMode.INVISIBLE);
			columnRslt_io_schd_no.setMode(MCMode.INVISIBLE);
			columnRslt_io_schd_seq.setMode(MCMode.INVISIBLE);
			columnRslt_io_schd_sub_typ1.setMode(MCMode.INVISIBLE);
			columnRslt_io_schd_sub_typ_nm1.setMode(MCMode.INVISIBLE);
			columnRslt_io_schd_sub_no1.setMode(MCMode.INVISIBLE);
			columnRslt_io_schd_sub_seq1.setMode(MCMode.INVISIBLE);
			columnRslt_io_schd_sub_typ2.setMode(MCMode.INVISIBLE);
			columnRslt_io_schd_sub_typ_nm2.setMode(MCMode.INVISIBLE);
			columnRslt_io_schd_sub_no2.setMode(MCMode.INVISIBLE);
			columnRslt_io_schd_sub_seq2.setMode(MCMode.INVISIBLE);
			columnRslt_io_schd_sub_typ3.setMode(MCMode.INVISIBLE);
			columnRslt_io_schd_sub_typ_nm3.setMode(MCMode.INVISIBLE);
			columnRslt_io_schd_sub_no3.setMode(MCMode.INVISIBLE);
			columnRslt_io_schd_sub_seq3.setMode(MCMode.INVISIBLE);
			columnRslt_io_schd_sub_typ4.setMode(MCMode.INVISIBLE);
			columnRslt_io_schd_sub_typ_nm4.setMode(MCMode.INVISIBLE);
			columnRslt_io_schd_sub_no4.setMode(MCMode.INVISIBLE);
			columnRslt_io_schd_sub_seq4.setMode(MCMode.INVISIBLE);
			columnRslt_io_schd_pr_no.setMode(MCMode.INVISIBLE);
			columnRslt_sub_char1.setMode(MCMode.INVISIBLE);
			columnRslt_sub_char2.setMode(MCMode.INVISIBLE);
			columnRslt_sub_char3.setMode(MCMode.INVISIBLE);
			columnRslt_sub_char4.setMode(MCMode.INVISIBLE);
			columnRslt_sub_char5.setMode(MCMode.INVISIBLE);
			columnRslt_sub_num1.setMode(MCMode.INVISIBLE);
			columnRslt_sub_num2.setMode(MCMode.INVISIBLE);
			columnRslt_sub_num3.setMode(MCMode.INVISIBLE);
			columnRslt_sub_dt1.setMode(MCMode.INVISIBLE);
			columnRslt_sub_dt2.setMode(MCMode.INVISIBLE);
			columnRslt_sub_dt3.setMode(MCMode.INVISIBLE);
			columnRslt_ins_usr_id.setMode(MCMode.INVISIBLE);
			columnRslt_ins_usr_nm.setMode(MCMode.INVISIBLE);
			columnRslt_ins_ts.setMode(MCMode.INVISIBLE);
			columnRslt_ins_func_id.setMode(MCMode.INVISIBLE);
			columnRslt_ins_func_nm.setMode(MCMode.INVISIBLE);
			columnRslt_upd_usr_id.setMode(MCMode.INVISIBLE);
			columnRslt_upd_usr_nm.setMode(MCMode.INVISIBLE);
			columnRslt_upd_ts.setMode(MCMode.INVISIBLE);
			columnRslt_upd_func_id.setMode(MCMode.INVISIBLE);
			columnRslt_upd_func_nm.setMode(MCMode.INVISIBLE);
			columnRslt_upd_srv_req_no.setMode(MCMode.INVISIBLE);
		}
	}

	// 画面初期化処理
	@Override
	protected void valueInit() {
		super.valueInit();

		initCheckBox(true);
	}

	/**
	 * チェックボックスの初期化処理
	 * @param flg
	 */
	protected void initCheckBox(boolean flg) {
		setSearchTabSelectAll(flg);
		setDispTabSelectAll(flg);
	}

	/**
	 * 検索タブの全チェックオン／オフ処理
	 * @param flg
	 */
	protected void setSearchTabSelectAll(boolean flg) {
		getCndR().sno1_null_ng_flg(flg);
		getCndR().sno1_null_ok_flg(flg);
		getCndR().sno2_null_ng_flg(flg);
		getCndR().sno2_null_ok_flg(flg);
		getCndR().sno3_null_ng_flg(flg);
		getCndR().sno3_null_ok_flg(flg);
		getCndR().sno4_null_ng_flg(flg);
		getCndR().sno4_null_ok_flg(flg);
		getCndR().non_alloc_tgt_flg(flg);
		getCndR().is_alloc_tgt_flg(flg);
		getCndR().yet_allocate_flg(flg);
		getCndR().allocated_flg(flg);
		getCndR().non_alloc_wait_flg(flg);
		getCndR().is_alloc_wait_flg(flg);
	}

	/**
	 * 集計タブの全チェックオン／オフ処理
	 * @param flg
	 */
	protected void setDispTabSelectAll(boolean flg) {
		getCndR().slip_schd_no_flg(flg);
		getCndR().schd_dt_flg(flg);
		getCndR().accpt_schd_dt_flg(flg);
		getCndR().avl_schd_dt_flg(flg);
		getCndR().loc_flg(flg);
		getCndR().str_ln_flg(flg);
		getCndR().stk_arrv_flg(flg);
		getCndR().site_flg(flg);
		getCndR().wg_flg(flg);
		getCndR().lg_grp_flg(flg);
		getCndR().alloc_grp_flg(flg);
		getCndR().loc_grp_flg(flg);
		getCndR().sppl_flg(flg);
		getCndR().lot_no_flg(flg);
		getCndR().sublot_no_flg(flg);
		getCndR().sno1_flg(flg);
		getCndR().sno2_flg(flg);
		getCndR().sno3_flg(flg);
		getCndR().sno4_flg(flg);
		getCndR().pack_flg(flg);
		getCndR().alt_grp_flg(flg);
		getCndR().gd_flg(flg);
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);

		setBtn_open_dtlMode();
	}

	@Override
	public void setSRCHStatus() {
		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setBtn_open_dtlMode() {
		if (!getCndR().slip_schd_no_flg()) {
			Btn_open_dtl.setMode(MCMode.DISABLE);
		}
	}

	//イベント

	@Override
	public void doCnd_slip_schd_no_flg_NC(MCEventInfo info) {
		super.doCnd_slip_schd_no_flg_NC(info);
		if (getCndR().slip_schd_no_flg()) {
			setDispTabSelectAll(true);
		}
	}

	@Override
	public void doCnd_schd_dt_flg_NC(MCEventInfo info) {
		super.doCnd_schd_dt_flg_NC(info);
		if (!getCndR().schd_dt_flg()) {
			getCndR().slip_schd_no_flg(false);
		}
	}

	@Override
	public void doCnd_accpt_schd_dt_flg_NC(MCEventInfo info) {
		super.doCnd_accpt_schd_dt_flg_NC(info);
		if (!getCndR().accpt_schd_dt_flg()) {
			getCndR().slip_schd_no_flg(false);
		}
	}

	@Override
	public void doCnd_avl_schd_dt_flg_NC(MCEventInfo info) {
		super.doCnd_avl_schd_dt_flg_NC(info);
		if (!getCndR().avl_schd_dt_flg()) {
			getCndR().slip_schd_no_flg(false);
		}
	}

	@Override
	public void doCnd_loc_flg_NC(MCEventInfo info) {
		super.doCnd_loc_flg_NC(info);
		if (!getCndR().loc_flg()) {
			getCndR().str_ln_flg(false);
			getCndR().slip_schd_no_flg(false);
		}
	}

	@Override
	public void doCnd_str_ln_flg_NC(MCEventInfo info) {
		super.doCnd_str_ln_flg_NC(info);
		if (getCndR().str_ln_flg()) {
			getCndR().loc_flg(true);
		}
		else {
			getCndR().slip_schd_no_flg(false);
		}
	}

	@Override
	public void doCnd_stk_arrv_flg_NC(MCEventInfo info) {
		super.doCnd_stk_arrv_flg_NC(info);
		if (!getCndR().stk_arrv_flg()) {
			getCndR().slip_schd_no_flg(false);
		}
	}

	@Override
	public void doCnd_site_flg_NC(MCEventInfo info) {
		super.doCnd_site_flg_NC(info);
		if (!getCndR().site_flg()) {
			getCndR().slip_schd_no_flg(false);
		}
	}

	@Override
	public void doCnd_wg_flg_NC(MCEventInfo info) {
		super.doCnd_wg_flg_NC(info);
		if (!getCndR().wg_flg()) {
			getCndR().slip_schd_no_flg(false);
		}
	}

	@Override
	public void doCnd_lg_grp_flg_NC(MCEventInfo info) {
		super.doCnd_lg_grp_flg_NC(info);
		if (!getCndR().lg_grp_flg()) {
			getCndR().slip_schd_no_flg(false);
		}
	}

	@Override
	public void doCnd_alloc_grp_flg_NC(MCEventInfo info) {
		super.doCnd_alloc_grp_flg_NC(info);
		if (!getCndR().alloc_grp_flg()) {
			getCndR().slip_schd_no_flg(false);
		}
	}

	@Override
	public void doCnd_loc_grp_flg_NC(MCEventInfo info) {
		super.doCnd_loc_grp_flg_NC(info);
		if (!getCndR().loc_grp_flg()) {
			getCndR().slip_schd_no_flg(false);
		}
	}

	@Override
	public void doCnd_sppl_flg_NC(MCEventInfo info) {
		super.doCnd_sppl_flg_NC(info);
		if (!getCndR().sppl_flg()) {
			getCndR().slip_schd_no_flg(false);
		}
	}

	@Override
	public void doCnd_lot_no_flg_NC(MCEventInfo info) {
		super.doCnd_lot_no_flg_NC(info);
		if (!getCndR().lot_no_flg()) {
			getCndR().slip_schd_no_flg(false);
		}
	}

	@Override
	public void doCnd_sublot_no_flg_NC(MCEventInfo info) {
		super.doCnd_sublot_no_flg_NC(info);
		if (!getCndR().sublot_no_flg()) {
			getCndR().slip_schd_no_flg(false);
		}
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		Cnd_sno1_flg.addNCListener(this);
		Cnd_sno2_flg.addNCListener(this);
		Cnd_sno3_flg.addNCListener(this);
		Cnd_sno4_flg.addNCListener(this);
	}
	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (nc == Cnd_sno1_flg) {
			if (!getCndR().sno1_flg()) {
				getCndR().slip_schd_no_flg(false);
			}
		}
		else if (nc == Cnd_sno2_flg) {
			if (!getCndR().sno2_flg()) {
				getCndR().slip_schd_no_flg(false);
			}
		}
		else if (nc == Cnd_sno3_flg) {
			if (!getCndR().sno3_flg()) {
				getCndR().slip_schd_no_flg(false);
			}
		}
		else if (nc == Cnd_sno4_flg) {
			if (!getCndR().sno4_flg()) {
				getCndR().slip_schd_no_flg(false);
			}
		}
	}

	@Override
	public void doCnd_pack_flg_NC(MCEventInfo info) {
		super.doCnd_pack_flg_NC(info);
		if (!getCndR().pack_flg()) {
			getCndR().slip_schd_no_flg(false);
		}
	}

	@Override
	public void doCnd_alt_grp_flg_NC(MCEventInfo info) {
		super.doCnd_alt_grp_flg_NC(info);
		if (!getCndR().alt_grp_flg()) {
			getCndR().slip_schd_no_flg(false);
		}
	}

	@Override
	public void doCnd_gd_flg_NC(MCEventInfo info) {
		super.doCnd_gd_flg_NC(info);
		if (!getCndR().gd_flg()) {
			getCndR().slip_schd_no_flg(false);
		}
	}

	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			doBtn_open_dtl();
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBEL0090_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[open_dtl]の押下時の処理
	 */
	@Override
	public void doBtn_open_dtl(MCEventInfo info) {
		doBtn_open_dtl();
	}

	protected void doBtn_open_dtl() {
		//集計の場合、何もしない。
		if (!getCndR().slip_schd_no_flg()){
			return;
		}

		RsltR r = RsltTable.getSelectedMCRow();
		// 行が選択されていない場合
		if (isNull(r)) {
			dialog(msgNoSelectedRow());
			return;
		}

		String screenId = getScreenId(r);
		showDtl(screenId, r);
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}

	/**
	 * 各詳細画面へ遷移する。
	 * @param r
	 */
	protected void showDtl(String screenId, RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", screenId);
		aso.putCnd(crtOpenDtlCndR(aso, r, screenId));
		aso.putSearchAction();
		aso.show();
	}

	protected MCConstRow crtOpenDtlCndR(MAUCP_AppScreenOpener aso, RsltR r, String screenId) {
		MCConstRow to = null;

		if (isSame(screenId, _MSBAP0100)) { //ＷＧ間依頼登録
			to = crtOpenMSBAP0100CndR(aso, r);
		}
		else if (isSame(screenId, _MSBBP1220)) { //受注一覧照会
			to = crtOpenMSBBP1220CndR(aso, r);
		}
		else if (isSame(screenId, _MSBBP1230)) { //販売納期調整登録
			to = crtOpenMSBBP1230CndR(aso, r);
		}
		else if (isSame(screenId, _MSBBP1350)) { //売上返品一覧照会
			to = crtOpenMSBBP1350CndR(aso, r);
		}
		else if (isSame(screenId, _MSBCP0040)) { //オーダ登録
			to = crtOpenMSBCP0040CndR(aso, r);
		}
		else if (isSame(screenId, _MSBCP1010)) { //製造指図登録
			to = crtOpenMSBCP1010CndR(aso, r);
		}
		else if (isSame(screenId, _MSBDP0030)) { //発注予定一覧登録
			to = crtOpenMSBDP0030CndR(aso, r);
		}
		else if (isSame(screenId, _MSBDP0090)) { //発注一覧登録
			to = crtOpenMSBDP0090CndR(aso, r);
		}
		else if (isSame(screenId, _MSBDP0120)) { //購買納期調整登録
			to = crtOpenMSBDP0120CndR(aso, r);
		}
		else if (isSame(screenId, _MSBDP0130)) { //仕入実績一覧登録
			to = crtOpenMSBDP0130CndR(aso, r);
		}
		else if (isSame(screenId, _MSBEP1050)) { //移動一覧登録
			to = crtOpenMSBEP1050CndR(aso, r);
		}
		else if (isSame(screenId, _MSBEP1090)) { //支給品着荷一覧登録
			to = crtOpenMSBEP1090CndR(aso, r);
		}
		else if (isSame(screenId, _MSBDP0170)) { //仕入返品一覧照会
			to = crtOpenMSBDP0170CndR(aso, r);
		}
		else if (isSame(screenId, _MSBEP1410)) { //出荷指図一覧登録
			to = crtOpenMSBEP1410CndR(aso, r);
		}
		else if (isSame(screenId, _MSBEP1420)) { //出荷予定変更登録
			to = crtOpenMSBEP1420CndR(aso, r);
		}
		else if (isSame(screenId, _MSBEP1450)) { //出荷実績一覧登録
			to = crtOpenMSBEP1450CndR(aso, r);
		}
		else if (isSame(screenId, _MSBEP1760)) { //輸出実績一覧登録
			to = crtOpenMSBEP1760CndR(aso, r);
		}
		else if (isSame(screenId, _MSBEP2000)) { //入荷実績一覧登録
			to = crtOpenMSBEP2000CndR(aso, r);
		}
		else if (isSame(screenId, _MSBEP2430)) { //他勘定振替一覧照会
			to = crtOpenMSBEP2430CndR(aso, r);
		}
		else if (isSame(screenId, _MSBFP0030)) { //検査指図一覧登録
			to = crtOpenMSBFP0030CndR(aso, r);
		}
		else if (isSame(screenId, _MSBFP0070)) { //検査実績登録
			to = crtOpenMSBFP0070CndR(aso, r);
		}

		return to;
	}

	/**
	 * ＷＧ間依頼登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBAP0100CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBA.MSBAP0100.MSBAP_WgRqstReg p = (mcframe.clientMSBA.MSBAP0100.MSBAP_WgRqstReg) aso.getPanel();
		mcframe.clientMSBA.MSBAP0100.CndR to = mcframe.clientMSBA.MSBAP0100.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand()); //操作種別＠参照する

		to.xfr_rqst_flg(true);
		to.purc_rqst_flg(true);
		to.ship_rqst_flg(true);
		to.rqst_sts_flg(true);
		to.prms_sts_flg(true);
		to.inst_sts_flg(true);
		to.cmpl_sts_flg(true);
		to.slo_rqst_flg(true);
		to.un_slo_rqst_flg(true);

		to.inc_can_flg(true);
		to.wg_rqst_no(r.io_schd_no());

		return to;
	}
	/**
	 * 受注一覧照会画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBBP1220CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBB.MSBBP1220.MSBBP_SloSrch p = (mcframe.clientMSBB.MSBBP1220.MSBBP_SloSrch) aso.getPanel();
		mcframe.clientMSBB.MSBBP1220.CndR to = mcframe.clientMSBB.MSBBP1220.CndR.create();

		//販売状況
		to.slo_flg(true);
		to.prms_flg(true);
		to.dlv_inst_rcpt_flg(true);
		to.dlv_inst_prms_flg(true);
		to.sls_flg(true);
		to.sls_ship_flg(true);
		to.sls_compl_flg(true);

		to.disp_unit(p.Cnd_disp_unit_DTL.getActionCommand()); //検索モード＠明細

		//承認状況
		to.aprv_open_flg(true);
		to.aprv_fix_flg(true);
		to.aprv_acpt_flg(true);
		to.aprv_rjct_flg(true);
		to.aprv_last_rjct_flg(true);
		to.aprv_invalid_flg(true);

		//Ｉ／Ｖ取引対象
		to.iv_trd_flg(true);
		to.iv_trd_invalid_flg(true);
		//ＥＤＩ対象
		to.edi_flg(true);
		to.edi_invalid_flg(true);
		//引当状況
		to.not_alloc_flg(true);
		to.part_alloc_flg(true);
		to.all_alloc_flg(true);
		to.alloc_invalid_flg(true);

		to.inc_can_flg(true); //取消含む
		to.inc_abort_flg(true); //打切含む

		to.slo_no(r.io_schd_sub_no1());
		to.slo_d_no(r.io_schd_sub_no2());

		return to;
	}
	/**
	 * 販売納期調整登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBBP1230CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBB.MSBBP1230.MSBBP_SlsDlvDtAdjstReg p = (mcframe.clientMSBB.MSBBP1230.MSBBP_SlsDlvDtAdjstReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1230.CndR to = mcframe.clientMSBB.MSBBP1230.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.slo_no(r.io_schd_sub_no1());

		return to;
	}
	/**
	 * 売上返品一覧照会画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBBP1350CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBB.MSBBP1350.MSBBP_SretSrch p = (mcframe.clientMSBB.MSBBP1350.MSBBP_SretSrch) aso.getPanel();
		mcframe.clientMSBB.MSBBP1350.CndR to = mcframe.clientMSBB.MSBBP1350.CndR.create();

		to.ope(p.Cnd_ope_SRCH_SCHD_REF.getActionCommand()); //操作種別＠予定を参照する
		to.mode(p.Cnd_mode_SRCH_LST.getActionCommand()); //検索モード＠詳細
		to.non_arr_flg(true);
		to.part_arr_non_ac_flg(true);
		to.part_arr_flg(true);
		to.cmpl_arr_non_ac_flg(true);
		to.cmpl_flg(true);
		to.iv_trgt_flg(true);
		to.iv_not_trgt_flg(true);
		to.sync_flg(true);
		to.not_sync_flg(true);
		to.vmi_flg(true);
		to.not_vmi_flg(true);

		to.sls_ret_schd_d_no(r.io_schd_sub_no1());

		return to;
	}
	/**
	 * オーダ登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBCP0040CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg p = (mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg) aso.getPanel();
		mcframe.clientMSBC.MSBCP0040.CndR to = mcframe.clientMSBC.MSBCP0040.CndR.create();

		to.ope(p.Cnd_ope_SRCH.getActionCommand()); //操作種別＠参照する
		to.itm_ord_no(r.io_schd_pr_no());

		return to;
	}
	/**
	 * 製造指図登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBCP1010CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBC.MSBCP1010.MSBCP_MfgInstReg p = (mcframe.clientMSBC.MSBCP1010.MSBCP_MfgInstReg) aso.getPanel();
		mcframe.clientMSBC.MSBCP1010.CndR to = mcframe.clientMSBC.MSBCP1010.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand()); //操作種別＠参照する
		to.srch_tgt_no(r.io_schd_sub_no3());

		return to;
	}
	/**
	 * 発注予定一覧登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBDP0030CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBD.MSBDP0030.MSBDP_PoSchdListReg p = (mcframe.clientMSBD.MSBDP0030.MSBDP_PoSchdListReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0030.CndR to = mcframe.clientMSBD.MSBDP0030.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand()); //操作種別＠参照する
		to.po_schd_no(r.io_schd_no());

		return to;
	}
	/**
	 * 発注一覧登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBDP0090CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBD.MSBDP0090.MSBDP_PoListReg p = (mcframe.clientMSBD.MSBDP0090.MSBDP_PoListReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0090.CndR to = mcframe.clientMSBD.MSBDP0090.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand()); //操作種別＠参照する
		to.po_no(r.io_schd_sub_no1());
		to.po_d_no(r.io_schd_sub_no2());

		return to;
	}
	/**
	 * 購買納期調整登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBDP0120CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBD.MSBDP0120.MSBDP_PurcDlvDtAdjstReg p = (mcframe.clientMSBD.MSBDP0120.MSBDP_PurcDlvDtAdjstReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0120.CndR to = mcframe.clientMSBD.MSBDP0120.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand()); //操作種別＠参照する
		to.po_no(r.io_schd_sub_no1());

		return to;
	}

	/**
	 * 仕入実績一覧登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBDP0130CndR(MAUCP_AppScreenOpener aso, RsltR r) {

		mcframe.clientMSBD.MSBDP0130.MSBDP_PurcActListReg p = (mcframe.clientMSBD.MSBDP0130.MSBDP_PurcActListReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0130.CndR to = mcframe.clientMSBD.MSBDP0130.CndR.create();

		to.ope(p.Cnd_ope_SRCH_SCHD.getActionCommand()); //操作種別＠予定を参照する
		to.mode(p.Cnd_mode_DTL.getActionCommand()); //検索モード＠明細

		to.arr_flg(true);
		to.not_yet_arr_flg(true);
		to.arr_not_cmpl_flg(true);
		to.arr_cmpl_flg(true);
		to.purc_not_cmpl_flg(true);
		to.purc_cmpl_flg(true);
		to.iv_flg(true);
		to.not_iv_flg(true);
		to.edi_flg(true);

		to.purc_schd_no(r.io_schd_sub_no1());

		return to;
	}
	/**
	 * 移動一覧登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBEP1050CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1050.MSBEP_XfrListReg p = (mcframe.clientMSBE.MSBEP1050.MSBEP_XfrListReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1050.CndR to = mcframe.clientMSBE.MSBEP1050.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand()); //操作種別＠参照する
		if (MSC_IO_SCHD_STS_TYP.isSCHD(r.io_schd_sts_typ())) {
			to.tgt(p.Cnd_tgt_SCHD.getActionCommand()); //処理対象＠予定
		}
		else {
			to.tgt(p.Cnd_tgt_INST.getActionCommand()); //処理対象＠指図
		}

		to.not_alloc_flg(true);
		to.alloc_flg(true);
		to.abort_flg(true);

		to.xfr_alloc_sts_no(r.io_schd_no());

		return to;
	}
	/**
	 * 支給品着荷一覧登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBEP1090CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		aso.runValueInit();
		mcframe.clientMSBE.MSBEP1090.MSBEP_ProvArrReg p = (mcframe.clientMSBE.MSBEP1090.MSBEP_ProvArrReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP2000.CndR to = mcframe.clientMSBE.MSBEP2000.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand()); //操作種別＠参照する

		to.arr_yet_flg(true);
		to.arr_done_flg(true);
		to.abort_flg(true);

		if (MSC_IO_SCHD_TYP.isPURC_XFR_OUT_PROV(r.io_schd_typ()) ||
				MSC_IO_SCHD_TYP.isARR_PROV(r.io_schd_typ())) {//仕入転出（支給）or 入荷（支給）
					to.arr_schd_no(r.io_schd_no());
		}
		else {
			to.dlv_slip_d_no(r.io_schd_sub_no1());
		}
		return to;
	}
	/**
	 * 仕入返品一覧照会を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBDP0170CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBD.MSBDP0170.MSBDP_PurcRetSrch p = (mcframe.clientMSBD.MSBDP0170.MSBDP_PurcRetSrch) aso.getPanel();
		mcframe.clientMSBD.MSBDP0170.CndR to = mcframe.clientMSBD.MSBDP0170.CndR.create();

		to.ope(p.Cnd_ope_SRCH_SCHD_REF.getActionCommand()); //操作種別＠返品予定を参照する
		to.mode(p.Cnd_mode_SRCH_DTL.getActionCommand()); //検索モード＠明細

		to.not_transt_flg(true);
		to.part_transt_flg(true);
		to.all_transt_flg(true);
		to.sret_abort_flg(true);
		to.iv_trgt_flg(true);
		to.iv_not_trgt_flg(true);

		to.purc_ret_schd_d_no(r.io_schd_no());

		return to;
	}
	/**
	 * 出荷指図一覧登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBEP1410CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1410.MSBEP_ShipInstListReg p = (mcframe.clientMSBE.MSBEP1410.MSBEP_ShipInstListReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1410.CndR to = mcframe.clientMSBE.MSBEP1410.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand()); //操作種別＠参照する
		to.disp_unit(p.Cnd_disp_unit_Dtl.getActionCommand()); //検索モード＠明細

		to.inst(true);
		to.p_ship(true);
		to.ship(true);
		to.not_alloc_flg(true);
		to.part_alloc_flg(false);
		to.all_alloc_flg(true);
		to.alloc_invalid_flg(true);
		to.late_ship(false);
		to.late_rqst(false);
		to.pick_not_prnted(true);
		to.pick_prnted(true);
		to.inst_not_prnted(true);
		to.inst_prnted(true);
		to.dlv_not_prnted(true);
		to.dlv_prnted(true);
		to.adv_not_prnted(true);
		to.adv_prnted(true);

		to.lg_grp_cd(nvl(r.gi_lg_grp_cd(), r.lg_grp_cd()));
		to.ship_schd_no(r.io_schd_sub_no3());

		return to;
	}
	/**
	 * 出荷予定変更登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBEP1420CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1420.MSBEP_ShipSchdReg p = (mcframe.clientMSBE.MSBEP1420.MSBEP_ShipSchdReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1420.CndR to = mcframe.clientMSBE.MSBEP1420.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand()); //操作種別＠参照する
		to.md(p.Cnd_md_SHIP.getActionCommand()); //検索モード＠出荷予定

		to.not_inst_flg(true);
		to.inst_flg(true);
		to.not_ship_flg(true);
		to.part_ship_flg(true);
		to.ship_flg(true);
		to.not_alloc_flg(true);
		to.part_alloc_flg(true);
		to.all_alloc_flg(true);
		to.alloc_invalid_flg(true);
		to.ship_block_flg(true);
		to.not_ship_block_flg(true);
		to.dlv_rqst_flg(false);
		to.ship_rqst_flg(false);
		to.pd_inst_dlv_flg(false);
		to.abort_flg(true);

		to.lg_grp_cd(nvl(r.gi_lg_grp_cd(), r.lg_grp_cd()));
		to.ship_schd_no(r.io_schd_sub_no3());

		return to;
	}
	/**
	 * 出荷実績一覧登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBEP1450CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1450.MSBEP_ShipActListReg p = (mcframe.clientMSBE.MSBEP1450.MSBEP_ShipActListReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1450.CndR to = mcframe.clientMSBE.MSBEP1450.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand()); //操作種別＠参照する
		to.md(p.Cnd_md_DTL.getActionCommand()); //検索モード＠明細

		to.not_ship_flg(true);
		to.ship_flg(true);
		to.dlv_rqst_flg(false);
		to.ship_rqst_flg(false);
		to.pd_inst_dlv_flg(false);
		to.dlv_not_prnted(true);
		to.dlv_prnted(true);
		to.adv_not_prnted(true);
		to.adv_prnted(true);

		to.ship_act_d_no(r.io_schd_no());

		return to;
	}
	/**
	 * 輸出実績一覧登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBEP1760CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1760.MSBEP_ExActListReg p = (mcframe.clientMSBE.MSBEP1760.MSBEP_ExActListReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1760.CndR to = mcframe.clientMSBE.MSBEP1760.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand()); //操作種別＠予定を参照する
		to.iv_no(r.io_schd_sub_no2());

		return to;
	}
	/**
	 * 入荷実績一覧登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBEP2000CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP2000.MSBEP_ArrActReg p = (mcframe.clientMSBE.MSBEP2000.MSBEP_ArrActReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP2000.CndR to = mcframe.clientMSBE.MSBEP2000.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand()); //操作種別＠参照する

		to.arr_done_flg(true);
		to.abort_flg(true);

		if (MSC_IO_SCHD_TYP.isPURC_XFR_OUT(r.io_schd_typ()) ||
				MSC_IO_SCHD_TYP.isARR(r.io_schd_typ()) ||
				MSC_IO_SCHD_TYP.isSHIP_RTN_GI(r.io_schd_typ()) ||
				MSC_IO_SCHD_TYP.isSHIP_RTN_GR(r.io_schd_typ())) { //仕入転出 or 入荷 or 出荷返品出庫 or 出荷返品入庫
			to.arr_schd_no(r.io_schd_no());
		}
		else {
			to.dlv_slip_d_no(r.io_schd_sub_no1());
		}

		return to;
	}
	/**
	 * 他勘定振替一覧照会画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBEP2430CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP2430.MSBEP_AcXfrSrch p = (mcframe.clientMSBE.MSBEP2430.MSBEP_AcXfrSrch) aso.getPanel();
		mcframe.clientMSBE.MSBEP2430.CndR to = mcframe.clientMSBE.MSBEP2430.CndR.create();

		if (MSC_IO_SCHD_STS_TYP.isSCHD(r.io_schd_sts_typ())) {
			to.ope(p.Cnd_ope_REF1.getActionCommand()); //操作種別＠予定
			to.not_inst_flg(true);

			to.schd_no_aprv_flg(true);

			to.acxfr_schd_no(r.io_schd_no());
		}
		else if (MSC_IO_SCHD_STS_TYP.isORD(r.io_schd_sts_typ())) {
			to.ope(p.Cnd_ope_REF2.getActionCommand()); //操作種別＠指図
			to.inst_flg(true);
			to.part_comp_flg(true);

			to.acxfr_inst_d_no(r.io_schd_no());
		}

		return to;
	}
	/**
	 * 検査指図一覧登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBFP0030CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBF.MSBFP0030.MSBFP_InspInstLstReg p = (mcframe.clientMSBF.MSBFP0030.MSBFP_InspInstLstReg) aso.getPanel();
		mcframe.clientMSBF.MSBFP0030.CndR to = mcframe.clientMSBF.MSBFP0030.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand()); //操作種別＠参照する

		to.insp_sts_typ_schd(true);
		to.insp_sts_typ_yet(true);
		to.insp_sts_typ_ord(true);
		to.insp_sts_typ_str(true);
		to.insp_sts_typ_jdg(true);
		to.insp_lst_not_prnt_flg(true);
		to.insp_lst_prnt_flg(true);
		to.insp_rslt_not_prnt_flg(true);
		to.insp_rslt_prnt_flg(true);

		to.insp_schd_no(r.io_schd_no());

		return to;
	}
	/**
	 * 検査実績登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBFP0070CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBF.MSBFP0070.MSBFP_InspActReg p = (mcframe.clientMSBF.MSBFP0070.MSBFP_InspActReg) aso.getPanel();
		mcframe.clientMSBF.MSBFP0070.CndR to = mcframe.clientMSBF.MSBFP0070.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand()); //操作種別＠参照する
		to.insp_no(r.io_schd_sub_no1());

		return to;
	}

	/**
	 * 詳細情報ボタンでの画面遷移先の画面ＩＤを取得する。
	 * @return 画面遷移対象の場合、その画面ＩＤを返す。画面遷移対象外の場合、nullを返す。
	 */
	protected String getScreenId(RsltR selectedR) {
		String screenId = null;

		//受払予定区分
		String ioSchdTyp = selectedR.io_schd_typ();
		//受払予定状況区分
		String ioSchdStsTyp = selectedR.io_schd_sts_typ();

		if (MSC_IO_SCHD_TYP.isSLS(ioSchdTyp)
				|| MSC_IO_SCHD_TYP.isSLS_ACXFR(ioSchdTyp)) { //売上 or 売上（他勘定）
			if (MSC_IO_SCHD_STS_TYP.isSLO(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isDDLV_SLO(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isORD(ioSchdStsTyp) ||
				MSC_IO_SCHD_STS_TYP.isSHIP(ioSchdStsTyp) ||
				MSC_IO_SCHD_STS_TYP.isEX(ioSchdStsTyp)) {
				screenId = _MSBBP1220; //受注一覧照会
			}
			else if (MSC_IO_SCHD_STS_TYP.isPRMS(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isDLV_INST(ioSchdStsTyp)) {
				screenId = _MSBBP1230; //販売納期調整登録
			}
		}
		else if (MSC_IO_SCHD_TYP.isSLS_RTN_GI(ioSchdTyp) ||
				MSC_IO_SCHD_TYP.isSLS_RTN_GI_ACXFR(ioSchdTyp)) { //売上返品出庫 or 売上返品出庫（他勘定）
			if (MSC_IO_SCHD_STS_TYP.isARR(ioSchdStsTyp)) {
				screenId = _MSBBP1350; //売上返品一覧照会
			}
		}
		else if (MSC_IO_SCHD_TYP.isSLS_RTN_GR(ioSchdTyp) ||
				MSC_IO_SCHD_TYP.isSLS_RTN_GR_ACXFR(ioSchdTyp)) { //売上返品入庫 or 売上返品入庫（他勘定）
			if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isARR(ioSchdStsTyp)) {
				screenId = _MSBBP1350; //売上返品一覧照会
			}
		}
		else if (MSC_IO_SCHD_TYP.isMFG(ioSchdTyp)) { //製造
			if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp)) {
				screenId = _MSBCP0040; //オーダ登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isMFG_SAV(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isORD(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isSTT(ioSchdStsTyp)) {
				screenId = _MSBCP1010; //製造指図登録
			}
		}
		else if (MSC_IO_SCHD_TYP.isBYMFG(ioSchdTyp)) { //副産品製造
			if (MSC_IO_SCHD_STS_TYP.isMFG_SAV(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isORD(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isSTT(ioSchdStsTyp)) {
				screenId = _MSBCP1010; //製造指図登録
			}
		}
		else if (MSC_IO_SCHD_TYP.isINPT(ioSchdTyp)) { //投入
			if (MSC_IO_SCHD_STS_TYP.isFIX(ioSchdStsTyp)) {
				screenId = _MSBAP0100; //ＷＧ間依頼登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp)) {
				screenId = _MSBCP0040; //オーダ登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isMFG_SAV(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isORD(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isSTT(ioSchdStsTyp)) {
				screenId = _MSBCP1010; //製造指図登録
			}
		}
		else if (MSC_IO_SCHD_TYP.isPURC_GI(ioSchdTyp) ||
				MSC_IO_SCHD_TYP.isPURC_GI_PROV(ioSchdTyp)) { //仕入出庫 or 仕入出庫（支給）
			if (MSC_IO_SCHD_STS_TYP.isARR(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isINSP(ioSchdStsTyp)) {
				screenId = _MSBDP0130; //仕入実績一覧登録
			}
		}
		else if (MSC_IO_SCHD_TYP.isPURC_GR(ioSchdTyp) ||
				MSC_IO_SCHD_TYP.isPURC_GR_PROV(ioSchdTyp)) { //仕入入庫 or 仕入入庫（支給）
			if (MSC_IO_SCHD_STS_TYP.isFIX(ioSchdStsTyp)) {
				screenId = _MSBAP0100; //ＷＧ間依頼登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp)) {
				screenId = _MSBDP0030; //発注予定一覧登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isPO(ioSchdStsTyp)) {
				screenId = _MSBDP0090; //発注一覧登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isPRMS(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isDLV_INST(ioSchdStsTyp)) {
				screenId = _MSBDP0120; //購買納期調整登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isARR(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isINSP(ioSchdStsTyp)) {
				screenId = _MSBDP0130; //仕入実績一覧登録
			}
		}
		else if (MSC_IO_SCHD_TYP.isPURC_GR_DDLV(ioSchdTyp)) { //仕入入庫（直送）
			if (MSC_IO_SCHD_STS_TYP.isFIX(ioSchdStsTyp)) {
				screenId = _MSBAP0100; //ＷＧ間依頼登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp)) {
				screenId = _MSBDP0030; //発注予定一覧登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isPO(ioSchdStsTyp)) {
				screenId = _MSBDP0090; //発注一覧登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isPRMS(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isDLV_INST(ioSchdStsTyp)) {
				screenId = _MSBDP0120; //購買納期調整登録
			}
		}
		else if (MSC_IO_SCHD_TYP.isPURC_XFR_OUT(ioSchdTyp)) { //仕入転出
			if (MSC_IO_SCHD_STS_TYP.isPURC(ioSchdStsTyp)) {
				screenId = _MSBEP2000; //入荷実績一覧登録
			}
		}
		else if (MSC_IO_SCHD_TYP.isPURC_XFR_OUT_PROV(ioSchdTyp)) { //仕入転出（支給）
			if (MSC_IO_SCHD_STS_TYP.isPURC(ioSchdStsTyp)) {
				screenId = _MSBEP1090; //支給品着荷一覧登録
			}
		}
		else if (MSC_IO_SCHD_TYP.isSHIP_OUT(ioSchdTyp) ||
				MSC_IO_SCHD_TYP.isSHIP_OUT_EX(ioSchdTyp)) { //出荷 or 出荷（輸出）
			if (MSC_IO_SCHD_STS_TYP.isFIX(ioSchdStsTyp)) {
				screenId = _MSBAP0100; //ＷＧ間依頼登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp)) {
				screenId = _MSBEP1420; //出荷予定変更登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isORD(ioSchdStsTyp)) {
				screenId = _MSBEP1410; //出荷指図一覧登録
			}
		}
		else if (MSC_IO_SCHD_TYP.isSHIP_IN(ioSchdTyp) ||
				MSC_IO_SCHD_TYP.isSHIP_IN_EX(ioSchdTyp)) { //着荷 or 着荷（輸出）
			if (MSC_IO_SCHD_STS_TYP.isFIX(ioSchdStsTyp)) {
				screenId = _MSBAP0100; //ＷＧ間依頼登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp)) {
				screenId = _MSBEP1420; //出荷予定変更登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isORD(ioSchdStsTyp)) {
				screenId = _MSBEP1410; //出荷指図一覧登録
			}
		}
		else if (MSC_IO_SCHD_TYP.isSHIP_RTN_GI(ioSchdTyp) ||
				MSC_IO_SCHD_TYP.isSHIP_RTN_GR(ioSchdTyp)) { //出荷返品出庫 or 出荷返品入庫
			if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp)) {
				screenId = _MSBBP1350; //売上返品一覧照会
			}
		}
		else if (MSC_IO_SCHD_TYP.isXFR_GI(ioSchdTyp) ||
				MSC_IO_SCHD_TYP.isXFR_GI_PROV(ioSchdTyp)) { //移送出庫 or 移送出庫（支給）
			if (MSC_IO_SCHD_STS_TYP.isFIX(ioSchdStsTyp)) {
				screenId = _MSBAP0100; //ＷＧ間依頼登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp)) {
				screenId = _MSBEP1420; //出荷予定変更登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isORD(ioSchdStsTyp)) {
				screenId = _MSBEP1410; //出荷指図一覧登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isSHIP(ioSchdStsTyp)) {
				//出荷実績一覧登録 or 輸出実績一覧登録
				screenId = getScreenIdForShip(selectedR);
			}
		}
		else if (MSC_IO_SCHD_TYP.isXFR_GR(ioSchdTyp) ||
				MSC_IO_SCHD_TYP.isXFR_GR_PROV(ioSchdTyp)) { //移送入庫 or 移送入庫（支給）
			if (MSC_IO_SCHD_STS_TYP.isFIX(ioSchdStsTyp)) {
				screenId = _MSBAP0100; //ＷＧ間依頼登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp)) {
				screenId = _MSBEP1420; //出荷予定変更登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isORD(ioSchdStsTyp)) {
				screenId = _MSBEP1410; //出荷指図一覧登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isSHIP(ioSchdStsTyp)) {
				//出荷実績一覧登録 or 輸出実績一覧登録 or 入荷実績一覧登録 or 支給品着荷一覧登録
				screenId = getScreenId(selectedR, MSC_IO_SCHD_TYP.isXFR_GR_PROV(ioSchdTyp) ? true : false);
			}
			else if (MSC_IO_SCHD_STS_TYP.isEX(ioSchdStsTyp)) {
				//入荷実績一覧登録 or 支給品着荷一覧登録
				screenId = getScreenIdForArr(MSC_IO_SCHD_TYP.isXFR_GR_PROV(ioSchdTyp) ? true : false);
			}
		}
		else if (MSC_IO_SCHD_TYP.isXFR_RTN_GI(ioSchdTyp) ||
				MSC_IO_SCHD_TYP.isXFR_RTN_GI_PROV(ioSchdTyp)) { //移送返品出庫 or 移送返品出庫（支給）
			if (MSC_IO_SCHD_STS_TYP.isFIX(ioSchdStsTyp)) {
				screenId = _MSBAP0100; //ＷＧ間依頼登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp)) {
				screenId = _MSBEP1420; //出荷予定変更登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isORD(ioSchdStsTyp)) {
				screenId = _MSBEP1410; //出荷指図一覧登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isSHIP(ioSchdStsTyp)) {
				//出荷実績一覧登録 or 輸出実績一覧登録
				screenId = getScreenIdForShip(selectedR);
			}
		}
		else if (MSC_IO_SCHD_TYP.isXFR_RTN_GR(ioSchdTyp) ||
				MSC_IO_SCHD_TYP.isXFR_RTN_GR_PROV(ioSchdTyp)) { //移送返品入庫 or 移送返品入庫（支給）
			if (MSC_IO_SCHD_STS_TYP.isFIX(ioSchdStsTyp)) {
				screenId = _MSBAP0100; //ＷＧ間依頼登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp)) {
				screenId = _MSBEP1420; //出荷予定変更登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isORD(ioSchdStsTyp)) {
				screenId = _MSBEP1410; //出荷指図一覧登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isSHIP(ioSchdStsTyp)) {
				//入荷実績一覧登録 or 輸出実績一覧登録
				screenId = getScreenId(selectedR, false);
			}
			else if (MSC_IO_SCHD_STS_TYP.isEX(ioSchdStsTyp)) {
				screenId = _MSBEP2000; //入荷実績一覧登録
			}
		}
		else if (MSC_IO_SCHD_TYP.isMOVE_GI(ioSchdTyp) || //移動出庫
				MSC_IO_SCHD_TYP.isMOVE_GI_PROV(ioSchdTyp) || //移動出庫（支給）
				MSC_IO_SCHD_TYP.isMOVE_GR(ioSchdTyp) || //移動入庫
				MSC_IO_SCHD_TYP.isMOVE_GR_PROV(ioSchdTyp) || //移動入庫（支給）
				MSC_IO_SCHD_TYP.isMOVE_RTN_GI(ioSchdTyp) || //移動返品出庫
				MSC_IO_SCHD_TYP.isMOVE_RTN_GI_PROV(ioSchdTyp) || //移動返品出庫（支給）
				MSC_IO_SCHD_TYP.isMOVE_RTN_GR(ioSchdTyp) || //移動返品入庫
				MSC_IO_SCHD_TYP.isMOVE_RTN_GR_PROV(ioSchdTyp)) { //移動返品入庫（支給）
			if (MSC_IO_SCHD_STS_TYP.isFIX(ioSchdStsTyp)) {
				screenId = _MSBAP0100; //ＷＧ間依頼登録
			}
			if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isORD(ioSchdStsTyp)) {
				screenId = _MSBEP1050; //移動一覧登録
			}
		}
		else if (MSC_IO_SCHD_TYP.isXFR_IN(ioSchdTyp) ||
				MSC_IO_SCHD_TYP.isXFR_IN_PROV(ioSchdTyp)) { //転入 or 転入（支給）
			if (MSC_IO_SCHD_STS_TYP.isFIX(ioSchdStsTyp)) {
				screenId = _MSBAP0100; //ＷＧ間依頼登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp)) {
				screenId = _MSBEP1420; //出荷予定変更登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isORD(ioSchdStsTyp)) {
				screenId = _MSBEP1410; //出荷指図一覧登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isSHIP(ioSchdStsTyp)) {
				//出荷実績一覧登録 or 輸出実績一覧登録
				screenId = getScreenIdForShip(selectedR);
			}
		}
		else if (MSC_IO_SCHD_TYP.isXFR_OUT(ioSchdTyp) ||
				MSC_IO_SCHD_TYP.isXFR_OUT_PROV(ioSchdTyp)) { //転出 or 転出（支給）
			if (MSC_IO_SCHD_STS_TYP.isFIX(ioSchdStsTyp)) {
				screenId = _MSBAP0100; //ＷＧ間依頼登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp)) {
				screenId = _MSBEP1420; //出荷予定変更登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isORD(ioSchdStsTyp)) {
				screenId = _MSBEP1410; //出荷指図一覧登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isSHIP(ioSchdStsTyp)) {
				//出荷実績一覧登録 or 輸出実績一覧登録 or 入荷実績一覧登録 or 支給品着荷一覧登録
				screenId = getScreenId(selectedR, MSC_IO_SCHD_TYP.isXFR_OUT_PROV(ioSchdTyp) ? true : false);
			}
			else if (MSC_IO_SCHD_STS_TYP.isEX(ioSchdStsTyp)) {
				//入荷実績一覧登録 or 支給品着荷一覧登録
				screenId = getScreenIdForArr(MSC_IO_SCHD_TYP.isXFR_OUT_PROV(ioSchdTyp) ? true : false);
			}
		}
		else if (MSC_IO_SCHD_TYP.isARR(ioSchdTyp) ||
				MSC_IO_SCHD_TYP.isARR_PROV(ioSchdTyp)) { //入荷 or 入荷（支給）
			if (MSC_IO_SCHD_STS_TYP.isPO(ioSchdStsTyp)) {
				screenId = _MSBDP0090; //発注一覧登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isPRMS(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isDLV_INST(ioSchdStsTyp)) {
				screenId = _MSBDP0120; //購買納期調整登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isPURC(ioSchdStsTyp)) {
				if (MSC_IO_SCHD_TYP.isARR(ioSchdTyp)) {
					screenId = _MSBEP2000; //入荷実績一覧登録
				}
				else {
					screenId = _MSBEP1090; //支給品着荷一覧登録
				}
			}
			else if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp)) {
				screenId = _MSBDP0030; //発注予定一覧登録
			}
		}
		else if (MSC_IO_SCHD_TYP.isARR_RTN(ioSchdTyp) ||
				MSC_IO_SCHD_TYP.isARR_RTN_PROV(ioSchdTyp)) { //入荷返品 or 入荷返品（支給）
			if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp)) {
				screenId = _MSBDP0170; //仕入返品一覧照会
			}
		}
		else if (MSC_IO_SCHD_TYP.isACXFR_GI_XFR(ioSchdTyp)) { //他勘定振替出庫（移送）
			if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp)) {
				screenId = _MSBEP1420; //出荷予定変更登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isORD(ioSchdStsTyp)) {
				screenId = _MSBEP1410; //出荷指図一覧登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isSHIP(ioSchdStsTyp)) {
				//入荷実績一覧登録 or 輸出実績一覧登録
				screenId = getScreenId(selectedR, false);
			}
			else if (MSC_IO_SCHD_STS_TYP.isEX(ioSchdStsTyp)) {
				screenId = _MSBEP2000; //入荷実績一覧登録
			}
		}
		else if (MSC_IO_SCHD_TYP.isACXFR_GI_MOVE(ioSchdTyp)) { //他勘定振替出庫（移動）
			if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isORD(ioSchdStsTyp)) {
				screenId = _MSBEP1050; //移動一覧登録
			}
		}
		else if (MSC_IO_SCHD_TYP.isACXFR_GI(ioSchdTyp) || //他勘定振替出庫
				MSC_IO_SCHD_TYP.isACXFR_GR(ioSchdTyp) || //他勘定振替入庫
				MSC_IO_SCHD_TYP.isSCRP(ioSchdTyp)) { //廃棄
			if (MSC_IO_SCHD_STS_TYP.isSCHD(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isORD(ioSchdStsTyp)) {
				screenId = _MSBEP2430; //他勘定振替一覧照会
			}
		}
		else if (MSC_IO_SCHD_TYP.isINSP_CMPL_GI(ioSchdTyp) ||
				MSC_IO_SCHD_TYP.isINSP_CMPL_GR(ioSchdTyp)) { //検査完了出庫 or 検査完了入庫
			if (MSC_IO_SCHD_STS_TYP.isYET(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isORD(ioSchdStsTyp)) {
				screenId = _MSBFP0030; //検査指図一覧登録
			}
			else if (MSC_IO_SCHD_STS_TYP.isING(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isWAIT_JUDG(ioSchdStsTyp)) {
				screenId = _MSBFP0070; //検査実績登録
			}
		}
		else if (MSC_IO_SCHD_TYP.isMFG_PLN(ioSchdTyp) || //製造計画
				MSC_IO_SCHD_TYP.isINPT_PLN(ioSchdTyp) || //投入計画
				MSC_IO_SCHD_TYP.isPURC_PLN(ioSchdTyp) || //購買計画
				MSC_IO_SCHD_TYP.isXFR_GI_PLN(ioSchdTyp) || //移動・移送出庫計画
				MSC_IO_SCHD_TYP.isXFR_GR_PLN(ioSchdTyp)) { //移動・移送入庫計画
			if (MSC_IO_SCHD_STS_TYP.isOPN(ioSchdStsTyp) ||
					MSC_IO_SCHD_STS_TYP.isORD_SAV(ioSchdStsTyp)) {
				screenId = _MSBCP0040; //オーダ登録
			}
		}

		return screenId;
	}

	/**
	 * 出荷実績一覧登録・輸出実績一覧登録・入荷実績一覧登録・支給品着荷一覧登録の画面ＩＤを判別する
	 * @param selectedR　一覧の選択行
	 * @param isProv　支給であるかどうか
	 * @return
	 */
	protected String getScreenId(RsltR selectedR, boolean isProv) {
		if (MSC_IO_SCHD_SUB_TYP.isDLV_SLIP_D_NO(selectedR.io_schd_sub_typ1())) {
			//入荷実績一覧登録  or 支給品着荷一覧登録
			return getScreenIdForArr(isProv);
		}
		//出荷実績一覧登録  or 輸出実績一覧登録
		return getScreenIdForShip(selectedR);
	}

	/**
	 * 入荷実績一覧登録・支給品着荷一覧登録の画面ＩＤを判別する
	 * @param isProv 支給であるかどうか
	 * @return
	 */
	protected String getScreenIdForArr(boolean isProv) {
		String screenId = null;

		//支給の場合
		if (isProv) {
			screenId = _MSBEP1090; //支給品着荷一覧登録
		}
		//支給ではない場合
		else {
			screenId = _MSBEP2000; //入荷実績一覧登録
		}

		return screenId;
	}

	/**
	 * 出荷実績一覧登録・輸出実績一覧登録の画面ＩＤを判別する
	 * @param selectedR　一覧の選択行
	 * @return
	 */
	protected String getScreenIdForShip(RsltR selectedR) {
		if (MSC_IO_SCHD_SUB_TYP.isIV_NO(selectedR.io_schd_sub_typ2())) {
			return _MSBEP1760; //輸出実績一覧登録
		}

		return _MSBEP1450; //出荷実績一覧登録
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0040(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		// 行が選択されていない場合
		if (isNull(r)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0040");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP0040CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP0040.CndR crtOpenMSBEP0040CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP0040.MSBEP_AllocSrch p = (mcframe.clientMSBE.MSBEP0040.MSBEP_AllocSrch) aso.getPanel();
		mcframe.clientMSBE.MSBEP0040.CndR to = mcframe.clientMSBE.MSBEP0040.CndR.create();

		to.ope(p.Cnd_ope_ALLOC.getActionCommand());
		to.lg_grp_cd(r.lg_grp_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.ver_no(r.ver_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());

		return to;
	}

	//詳細情報を表示時の諸遷移先
	protected String _MSBAP0100 = "MSBAP0100"; //ＷＧ間依頼登録
	protected String _MSBBP1220 = "MSBBP1220"; //受注一覧照会
	protected String _MSBBP1230 = "MSBBP1230"; //販売納期調整登録
	protected String _MSBBP1350 = "MSBBP1350"; //売上返品一覧照会
	protected String _MSBCP0040 = "MSBCP0040"; //オーダ登録
	protected String _MSBCP1010 = "MSBCP1010"; //製造指図登録
	protected String _MSBDP0030 = "MSBDP0030"; //発注予定一覧登録
	protected String _MSBDP0090 = "MSBDP0090"; //発注一覧登録
	protected String _MSBDP0120 = "MSBDP0120"; //購買納期調整登録
	protected String _MSBDP0130 = "MSBDP0130"; //仕入実績一覧登録
	protected String _MSBEP1050 = "MSBEP1050"; //移動一覧登録
	protected String _MSBEP1090 = "MSBEP1090"; //支給品着荷一覧登録
	protected String _MSBDP0170 = "MSBDP0170"; //仕入返品一覧照会
	protected String _MSBEP1410 = "MSBEP1410"; //出荷指図一覧登録
	protected String _MSBEP1420 = "MSBEP1420"; //出荷予定変更登録
	protected String _MSBEP1450 = "MSBEP1450"; //出荷実績一覧登録
	protected String _MSBEP1760 = "MSBEP1760"; //輸出実績一覧登録
	protected String _MSBEP2000 = "MSBEP2000"; //入荷実績一覧登録
	protected String _MSBEP2430 = "MSBEP2430"; //他勘定振替一覧照会
	protected String _MSBFP0030 = "MSBFP0030"; //検査指図一覧登録
	protected String _MSBFP0070 = "MSBFP0070"; //検査実績登録

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		linkBeansToISPanelCustom(Cnd_sppl_cd, true);
	}

}