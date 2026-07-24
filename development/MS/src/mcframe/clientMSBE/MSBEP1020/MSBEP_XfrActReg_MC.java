package mcframe.clientMSBE.MSBEP1020;

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

import mcframe.clientFSUB.FSUBP0060.*;
import mcframe.clientMAUB.MAUBP0310.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0330.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5290.*;
import mcframe.clientMSUB.MSUBP0070.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5030.*;
import mcframe.clientMSUB.MSUBP5050.*;

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
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
import mcframe.clientMSUD.MSUDP0020.IfStkInspBase;

import mcframe.clientCore.beans.list.*;
import mcframe.clientMAUC.MAUCP0050.*;
import mcframe.clientMSUC.MSUCP0110.MSUCP_StrLnUtil;
import static mcframe.clientMSUC.MSUCP0070.MSUCP_StkUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_XfrActReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_XfrActReg_MC extends MSBEP_XfrActReg_MC_A implements IfOpePanel, IfRowMoveBase, IfStkInspBase, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected boolean _fromOtherScreenFlg = false;
	protected boolean _dataClearedFlg = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_XfrActReg_MC() {
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
	public MSBEP_XfrActReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL1020_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1020_Sprt01Caller<P extends MSBEP_XfrActReg, B extends MS_MSBEL1020_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBEL1020_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Btn]のボタン[sprt_ac_dt]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_ac_dt(MCEventInfo info) {
		callMS_MSBEL1020_Sprt01();
	}
	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}

	/**
	 * [MS_MSBEL1020_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1020_Prnt01Caller<P extends MSBEP_XfrActReg, B extends MS_MSBEL1020_Prnt01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBEL1020_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setMode() {
			super.setMode();
			// 印刷ボタンを押下不可にする
			setFIX_UStatus();
		}
	}

	/**
	 * Panel[Btn]のボタン[prnt_dlv]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_dlv(MCEventInfo info) {
		callMS_MSBEL1020_Prnt01();
	}

	/**
	 * [MS_MSBEL1020_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1020_Del01Caller<P extends MSBEP_XfrActReg, B extends MS_MSBEL1020_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBEL1020_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(getHdrR().immd_dlv_prnt_flg());
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(Hdr_can_ac_dt_for_input));
		}
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBEL1020_Del01();
	}

	/**
	 * [MS_MSBEL1020_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1020_Ins01Caller<P extends MSBEP_XfrActReg, B extends MS_MSBEL1020_Ins01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1020_Ins01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(getHdrR().immd_dlv_prnt_flg());
		}
		
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);

			// 入力値チェック
			msgList.addAll(inptChk());
		}
	}

	/**
	 * [MS_MSBEL1020_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1020_Upd01Caller<P extends MSBEP_XfrActReg, B extends MS_MSBEL1020_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1020_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(getHdrR().immd_dlv_prnt_flg());
		}
		
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);

			// 入力値チェック
			msgList.addAll(inptChk());
		}
	}

	/**
	 * 入力値チェックマスタによる入力値チェックを行う
	 */
	protected MCMessageList inptChk() {
		MCMessageList msgL = new MCMessageList();

		MCList<DtlR> chkTargetL = makeInptChkTargetList();

		MCColumnConfig[] cols = getShipTgtCols();
		
		if (!chkTargetL.isEmpty()) {
			msgL.addAll(
				doInptChk(
					MAC_FUNC_TYP.XFER.value(),
					columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3,
					columnDtl_xfr_act_d_no, columnDtl_base_unit_qty_bef, columnDtl_base_unit_qty,
					columnDtl_base_unit_act_qty_sum, cols[1], chkTargetL, columnDtl_trd_unit_qty, cols[0]));
		}
		
		return msgL;
	}
	
	protected String[] getGrpColums() {
		String targetKeyNo = getShipTgtKey();
		return new String[] {
				targetKeyNo, DtlR.$itm_cd, DtlR.$itm_sub1, DtlR.$itm_sub2, DtlR.$itm_sub3
		};
	}
	
	protected MCGroupByPolicy getInptChkGrpPolicy() {
		return new MCGroupByPolicy(getGrpColums());
	}
	
	protected MCList<DtlR> makeInptChkTargetList() {
		MCList<DtlR> chkTargetL = MCList.create(DtlR.class);
		
		MCGroupByPolicy grpKey = getInptChkGrpPolicy();
		
		MCIndexKey xfrAllocStsIdxKey = getDtlL().createIndex(DtlR.$xfr_alloc_sts_no);
		MCIndexKey xfrInstDIdxKey = getDtlL().createIndex(DtlR.$xfr_inst_d_no);
		
		MCList<DtlR> schdGroupL = getDtlL().groupBy(grpKey);
		for (DtlR schdGroupR : schdGroupL) {
			
			if (isNull(schdGroupR.itm_cd())
				|| isNullOrNullVal(schdGroupR.xfr_alloc_sts_no()) && isNullOrNullVal(schdGroupR.xfr_inst_d_no())) {
				continue;
			}

			if (!isNullOrNullVal(schdGroupR.xfr_alloc_sts_no())) {
				chkTargetL.addAll(getDtlL().subList(xfrAllocStsIdxKey, schdGroupR.xfr_alloc_sts_no()));
			}
			if (!isNullOrNullVal(schdGroupR.xfr_inst_d_no())) {
				chkTargetL.addAll(getDtlL().subList(xfrInstDIdxKey, schdGroupR.xfr_inst_d_no()));
			}
		}
		
		return chkTargetL;
	}

	protected String getShipTgtKey() {
		if (!isNullOrNullVal(getHdrR().xfr_inst_no())) {
			// 移動指図明細単位に予実比をチェック
			return DtlR.$xfr_inst_d_no;
		}

		// 移動引当状況単位に予実比をチェック
		return DtlR.$xfr_alloc_sts_no;
	}
	protected MCColumnConfig[] getShipTgtCols() {
		String key = getShipTgtKey();
		if (isSame(key, DtlR.$xfr_inst_d_no)) {
			// 移動指図明細単位に予実比をチェック
			return new MCColumnConfig[]{
				columnDtl_xfr_inst_d_no,
				columnDtl_base_unit_inst_qty
			};
		}
		// 移動引当状況単位に予実比をチェック
		return new MCColumnConfig[]{
			columnDtl_xfr_alloc_sts_no,
			columnDtl_base_unit_schd_qty
		};
	}

	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBEL1020_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[ins_noSchd]の押下時の処理
	 */
	@Override
	public void doBtn_ins_noSchd(MCEventInfo info) {
		callMS_MSBEL1020_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBEL1020_Upd01();
	}

	/**
	 * [MS_MSBEL1020_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1020_Srch01Caller<P extends MSBEP_XfrActReg, B extends MS_MSBEL1020_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1020_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			bridge.down1().setStatus(Status.CREATE);
		}

		@Override
		protected void setMode() {
			super.setMode();

			setINS_INSTStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			setINSStatus();
			DtlTable.fillSpace();
		}
	}

	/**
	 * [MS_MSBEL1020_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1020_Srch02Caller<P extends MSBEP_XfrActReg, B extends MS_MSBEL1020_Srch02Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1020_Srch02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch_inst]の押下時の処理
	 */
	@Override
	public void doCnd_srch_inst(MCEventInfo info) {
		callMS_MSBEL1020_Srch01();
	}

	/**
	 * Panel[Cnd]のボタン[srch_act]の押下時の処理
	 */
	@Override
	public void doCnd_srch_act(MCEventInfo info) {
		callMS_MSBEL1020_Srch02();
	}

	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}

	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}

	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);

		if (cont == getHdrR()) {
			list.add(HdrR.$xfr_inst_no);
			list.add(HdrR.$xfr_act_no);
			list.add(HdrR.$xfr_dt);
			list.add(HdrR.$ac_dt);
			list.add(HdrR.$dlv_prnt_flg);
			list.add(HdrR.$can_ac_dt_for_input);
			list.add(HdrR.$can_ac_dt);
			list.add(HdrR.$ac_dt_after_srch);
		}
		else if (cont == getDtlL()) {
			list.add(DtlR.$xfr_act_no);
			list.add(DtlR.$xfr_act_d_no);
			list.add(DtlR.$pr_sts_typ);
			list.add(DtlR.$pr_sts_typ_nm);
			list.add(DtlR.$dlv_slip_no);
			list.add(DtlR.$dlv_slip_d_no);
			list.add(DtlR.$prov_act_no);
			list.add(DtlR.$ret_prov_act_no);
			list.add(DtlR.$wms_flg);
			list.add(DtlR.$ext_sys_cd);
			list.add(DtlR.$ext_sys_nm);
			list.add(DtlR.$ext_xfr_act_no);
			if (isSame(type, NOT_INHERIT_TYPE_REF_UPD)) {
				list.add(DtlR.$xfr_inst_d_no);
				list.add(DtlR.$xfr_alloc_sts_no);
				list.add(DtlR.$xfr_src_typ);
				list.add(DtlR.$xfr_src_typ_nm);
				list.add(DtlR.$xfr_src_no);
				list.add(DtlR.$xfr_schd_no);
				list.add(DtlR.$base_unit_schd_qty);
				list.add(DtlR.$base_unit_inst_qty);
				list.add(DtlR.$base_unit_act_qty);
				list.add(DtlR.$schd_sno1);
				list.add(DtlR.$schd_sno2);
				list.add(DtlR.$schd_sno3);
				list.add(DtlR.$schd_sno4);
				list.add(DtlR.$sno1_null_flg);
				list.add(DtlR.$sno2_null_flg);
				list.add(DtlR.$sno3_null_flg);
				list.add(DtlR.$sno4_null_flg);
			}
		}
		list.remove(DtlR.$act_d_upd_cntr);
		list.remove(DtlR.$alloc_sts_upd_cntr);

		return list;
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Hdr_ac_dt_p_PPanel.setRelateBeans(Hdr_xfr_dt);
		Hdr_act_usr_dpt_p_PPanel.setRelateBeans(Hdr_ac_dt);
		Dtl_lot_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_lot_mng_typ,
				columnDtl_sublot_mng_typ);
		Dtl_ver_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, null, columnDtl_ver_flg);
		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(
			columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3,
			columnDtl_trd_unit_cd, columnDtl_trd_unit_dec_place, columnDtl_trd_unit_rnd_typ,
			columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty, columnDtl_base_unit_cd);
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
		columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
		columnDtl_trd_unit_qty, columnDtl_trd_unit_conv_base_qty,
		columnDtl_trd_unit_conv_qty);
		Dtl_base_unit_act_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
		columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
		columnDtl_base_unit_act_qty, columnDtl_trd_unit_conv_base_qty,
		columnDtl_trd_unit_conv_qty);
		Dtl_base_unit_schd_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
				columnDtl_base_unit_schd_qty, columnDtl_trd_unit_conv_base_qty,
				columnDtl_trd_unit_conv_qty);
		Dtl_base_unit_inst_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
				columnDtl_base_unit_inst_qty, columnDtl_trd_unit_conv_base_qty,
				columnDtl_trd_unit_conv_qty);
		Dtl_act_cont_qty_p_PPanel.setRelateBeans(columnDtl_cont_fctr_flg,
				columnDtl_base_unit_qty, null, columnDtl_act_cont_fctr,
				columnDtl_cont_fctr_dec_place, columnDtl_cont_fctr_rnd_typ);
		Dtl_std_cont_qty_p_PPanel.setRelateBeans(columnDtl_cont_fctr_flg,
				columnDtl_base_unit_qty, columnDtl_std_cont_fctr, null,
				columnDtl_cont_fctr_dec_place, columnDtl_cont_fctr_rnd_typ);
		Dtl_gi_str_ln_p_PPanel.setRelateBeans(columnDtl_gi_loc_cd,
				columnDtl_gi_str_ln_tgt_flg);
		Dtl_gr_str_ln_p_PPanel.setRelateBeans(Hdr_gr_loc_cd, Hdr_gr_str_ln_tgt_flg);
		Dtl_sno_wrk_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_sno1_mng_typ,
				columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ);
		Dtl_stk_bp_p_PPanel.setRelateBeans(columnDtl_stk_id_typ);
		
		Dtl_trd_unit_qty_p_PPanel.columnQty_qty.setName("trd_unit_qty_p.qty");
		Dtl_base_unit_qty_p_PPanel.columnQty_qty.setName("base_unit_qty_p.qty");
		Dtl_base_unit_act_qty_p_PPanel.columnQty_qty.setName("base_unit_act_qty_p.qty");
		Dtl_base_unit_schd_qty_p_PPanel.columnQty_qty.setName("base_unit_schd_qty_p.qty");
		Dtl_base_unit_inst_qty_p_PPanel.columnQty_qty.setName("base_unit_inst_qty_p.qty");
		Dtl_gi_str_ln_p_PPanel.columnStrLn_str_ln_cd.setName("gi_str_ln_p.str_ln_cd");
		Dtl_gi_str_ln_p_PPanel.columnStrLn_str_ln_nm.setName("gi_str_ln_p.str_ln_nm");
		Dtl_gi_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.setName("gi_str_ln_p.str_ln_cd_none_flg");
		Dtl_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd.setName("gr_str_ln_p.str_ln_cd");
		Dtl_gr_str_ln_p_PPanel.columnStrLn_str_ln_nm.setName("gr_str_ln_p.str_ln_nm");
		Dtl_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.setName("gr_str_ln_p.str_ln_cd_none_flg");
		Dtl_act_cont_qty_p_PPanel.columnContQty_cont_qty.setName("act_cont_qty_p.cont_qty");
		Dtl_std_cont_qty_p_PPanel.columnContQty_cont_qty.setName("std_cont_qty_p.cont_qty");
		Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1.setName("sno_wrk_no_p.sno1");
		Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2.setName("sno_wrk_no_p.sno2");
		Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3.setName("sno_wrk_no_p.sno3");
		Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4.setName("sno_wrk_no_p.sno4");
		Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.setName("sno_wrk_no_p.wrk_no");
		Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.setName("sno_wrk_no_p.wrk_nm");
	}

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		
		linkBeansToISPanelCustom(Hdr_gr_loc_cd);
	}

	//----- common
	protected boolean isInsStatus() {
		return isSame(getStatus(), INS)
				|| isSame(getStatus(), INS_INST);
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	/**
	 * 行追加ボタンで追加された行かどうか
	 * @param r
	 * @return 
	 */
	protected boolean isNewRow(DtlR r) {
		return isNull(r.xfr_alloc_sts_no());
	}

	/**
	 * 予定なしの行かどうか
	 * @param r
	 * @return 
	 */
	protected boolean isNonSchdRow(DtlR r) {
		return isNullOrNullVal(r.xfr_alloc_sts_no());
	}

	/**
	 * 移動・移送かどうか
	 * 社内場所から社内場所、または同一発注先間の移動なら移動。
	 * @param dtlR
	 * @return
	 */
	protected boolean isXfr(DtlR dtlR) {
		HdrR hdrR = getHdrR();
		return (isNullOrNullVal(dtlR.gi_sppl_cd())
				&& isNullOrNullVal(hdrR.sppl_cd()))
				|| isSame(dtlR.gi_sppl_cd(), hdrR.sppl_cd());
	}

	/**
	 * 支給かどうか
	 * 社内場所から社外場所への移動なら支給。
	 * @param dtlR
	 * @return
	 */
	protected boolean isProv(DtlR dtlR) {
		HdrR hdrR = getHdrR();
		return isNullOrNullVal(dtlR.gi_sppl_cd())
				&& !isNullOrNullVal(hdrR.sppl_cd());
	}

	/**
	 * 支給返品かどうか
	 * 社外場所から社内場所への移動なら支給返品。
	 * @param dtlR
	 * @return
	 */
	protected boolean isProvRtn(DtlR dtlR) {
		HdrR hdrR = getHdrR();
		return !isNullOrNullVal(dtlR.gi_sppl_cd())
				&& isNullOrNullVal(hdrR.sppl_cd());
	}

	/**
	 * 直送支給かどうか
	 * 社外場所から社外場所へかつ異なる発注先間での移動なら直送支給。
	 * @param dtlR
	 * @return
	 */
	protected boolean isProvDD(DtlR dtlR) {
		HdrR hdrR = getHdrR();
		return !isNullOrNullVal(dtlR.gi_sppl_cd())
				&& !isNullOrNullVal(hdrR.sppl_cd())
				&& !isSame(dtlR.gi_sppl_cd(), hdrR.sppl_cd());
	}

	/**
	 * 取引と入庫場所が埋まっているかどうか。
	 * @return 
	 */
	protected boolean headerFills() {
		HdrR hdrR = getHdrR();
		return !isNullOr(hdrR.trd_cd(), hdrR.gr_loc_cd());
	}

	/**
	 * 支給区分と支給計上区分を設定する。
	 * @param idx
	 * @param r
	 */
	protected void setProvInfo(int idx, DtlR r) {
		setValueEx(columnDtl_prov_typ, idx, null);

		// 資産区分が確定しているイベントでのみ支給区分を設定する
		// ※資産区分が設定されていない場合、支給区分に「有償支給」が設定できないので
		if (!isNull(r.asset_mng_typ())) {
			if (isProv(r) || isProvDD(r)) {
				HdrR hdrR = getHdrR();
				String provTyp = MAC_PROV_TYP.FFR_PROV.value();
				MCRow upriR = getProvUpri(
						r.itm_cd(),
						r.itm_sub1(),
						r.itm_sub2(),
						r.itm_sub3(),
						hdrR.sppl_cd(),
						hdrR.cur_cd(),
						hdrR.wg_cd(),
						hdrR.xfr_dt(),
						this);
				if (!isNull(upriR)) {
					if (MAC_PROV_TYP.isONR_PROV(upriR.getStringNE("prov_typ"))) {
						provTyp = MAC_PROV_TYP.ONR_PROV.value();
					}
				}
				setValueEx(columnDtl_prov_typ, idx, provTyp);
			}
		}
	}

	/**
	 * 支給区分（返品）と支給計上区分（返品）を設定する。
	 * @param idx
	 * @param r
	 */
	protected void setRetProvInfo(int idx, DtlR r) {
		setValueEx(columnDtl_ret_prov_typ, idx, null);
		if (!isNull(r.stk_id_typ())) {
			if (isProvRtn(r) || isProvDD(r)) {
				if (MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
					setValueEx(columnDtl_ret_prov_typ, idx, MAC_PROV_TYP.ONR_PROV.value());
					setValueEx(columnDtl_ret_prov_basis_typ, idx, MAC_PROV_BASIS_TYP.GI.value());
				}
				else if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())
						&& isNullOrNullVal(r.gi_stk_arrv_bp_cd())) {
					setValueEx(columnDtl_ret_prov_typ, idx, MAC_PROV_TYP.ONR_PROV.value());
					setValueEx(columnDtl_ret_prov_basis_typ, idx, MAC_PROV_BASIS_TYP.INPT.value());
				}
				else {
					setValueEx(columnDtl_ret_prov_typ, idx, MAC_PROV_TYP.FFR_PROV.value());
				}
			}
		}
	}

	/**
	 * 標準の棚・ラインCDを設定します。
	 */
	protected void setDefStrLnCd(DtlR dtlR) {
		if (isNull(getHdrR().gr_loc_cd()) || !getHdrR().gr_str_ln_tgt_flg()) {
			return;
		}
		String StrLnCd = MSUCP_StrLnUtil.getDefStrLnCd(
				dtlR.itm_cd(), 
				dtlR.itm_sub1(), 
				dtlR.itm_sub2(), 
				dtlR.itm_sub3(), 
				getHdrR().gr_loc_cd(), 
				this);
		if (isNull(StrLnCd)) {
			setValueEx(columnDtl_gr_str_ln_cd_none_flg, dtlR.getGUIIndex(), true);
		}
		else {
			setValueEx(columnDtl_gr_str_ln_cd, dtlR.getGUIIndex(), StrLnCd);
		}
	}
	//----- combobox
	@Override
	protected void listInit() {
		super.listInit();
		getDtl_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_ac_dt);
		getDtl_stk_id_typ_ListPutter().putBind(mcframe.commonMSUA.MSUAC0060.MSUAC_List.StkIdTypCols.$i_gr_sppl_cd, Hdr_sppl_cd);
		getDtl_stk_id_typ_ListPutter().putBind(mcframe.commonMSUA.MSUAC0060.MSUAC_List.StkIdTypCols.$i_xfr_flg, true);
		getDtl_prov_typ_ListPutter().putBind(mcframe.commonMSUA.MSUAC0060.MSUAC_List.ProvTypCols.$i_onr_prsppl_flg, Hdr_onr_prsppl_flg);
	}	

	// 検索対象区分
	@Override
	public MCList<?> getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			addListLogicCnd(row, new MSC_STK_SRCH_TGT_TYP[]{MSC_STK_SRCH_TGT_TYP.XFR_SCHD_NO, MSC_STK_SRCH_TGT_TYP.XFR_INST_NO});
		}
		else {
			addListLogicCnd(row, new MSC_STK_SRCH_TGT_TYP[]{MSC_STK_SRCH_TGT_TYP.XFR_ACT_NO});
		}
		return super.getCnd_srch_tgt_typ_nm(row, info);
	}

	// 入庫場所
	@Override
	public MCList<?> getHdr_gr_loc_cd(MCRow row, MCEventInfo info) {
		setGrLocBind(row);

		return super.getHdr_gr_loc_cd(row, info);
	}

	// 出庫場所
	@Override
	public MCList<?> getDtl_gi_loc_cd(MCRow row, MCEventInfo info) {
		HdrR hdrR = getHdrR();
		DtlR dtlR = getDtlL().get(info.getEventIndex());

		if (MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ())) {
			row.addStringColumn(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.LG_GRP_OUTSIDE.value());
		}
		else if (MAC_TRD_PTN_TYP.isXFR(hdrR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isXFR_RTN(hdrR.trd_ptn_typ())) {
			row.addStringColumn(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.LG_GRP_HOUSE.value());
		}

		row.addStringColumn(LocCols.$i_lg_grp_cd, getHdrR().lg_grp_cd());

		if (!isNewRow(dtlR) && (isXfr(dtlR) || isProv(dtlR))) {
			row.addStringColumn(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.LG_GRP_HOUSE.value());			
		}

		return super.getDtl_gi_loc_cd(row, info);
	}

	// 理由ＣＤ
	@Override
	public MCList<?> getDtl_rsn_cd(MCRow row, MCEventInfo info) {
 		MCList<?> dtlL = super.getDtl_rsn_cd(row, info);
 		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (!canAcXfr(dtlR)) {
			dtlL = dtlL.subList(r -> !r.getBooleanNE(XfrBizRsnCols.$o_acxfr_gi_flg));
		}
		return dtlL;
	}

	// 在庫検査区分
	@Override
	public MCList getDtl_stk_insp_typ(MCRow row, MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		if (!isNullOr(getHdrR().gr_site_cd(), r.gi_site_cd())
			&& !isSame(getHdrR().gr_site_cd(), r.gi_site_cd())) {
			// 工場・物流倉庫が異なる場合は「検査済」のみ
			addListLogicCnd(row,
				new MSC_STK_INSP_TYP[]{
					MSC_STK_INSP_TYP.FIN
				}
			);
		}
		return super.getDtl_stk_insp_typ(row, info);
	}

	// 他勘定出庫できるか
	protected boolean canAcXfr(DtlR r) {
		String trd_ptn_typ = getHdrR().trd_ptn_typ();
		return MAC_TRD_PTN_TYP.isXFR(trd_ptn_typ);
	}

	/**
	 * 入庫場所のリストロジックの検索条件を設定する。
	 * @param bind バインド
	 */
	protected void setGrLocBind(MCRow bind) {
		HdrR hdrR = getHdrR();
		if (MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())) {
			bind.addStringColumn(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.OUTSIDE.value());
		}
		else {
			bind.addStringColumn(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.HOUSE.value());
		}
	}

	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);

		if (beans == Hdr_gr_loc_cd) {
			setGrLocBind(row);
		}

		if (eventIndex < 0) {
			return row;
		}

		DtlR dtlR = getDtlL().get(eventIndex);

		if (beans == columnDtl_gi_stk_arrv_bp_cd) {
			if (!isNull(dtlR.gi_sppl_cd())) {
				row.setStringNE(BpCols.$i_bp_is_srch_typ,
						MAC_BP_IS_SRCH_TYP.SPPL.value());
			}
		}

		return row;
	}

	// 初期化処理(init)
	@Override
	protected void valueInit() {
		super.valueInit();

		setSrchTgtTyp();
	}

	protected void setSrchTgtTyp() {
		if (!Cnd_ope_INS.isSelected()) {
			setValueEx(Cnd_srch_tgt_typ, MSC_STK_SRCH_TGT_TYP.XFR_ACT_NO.value());
			setValueEx(Cnd_srch_tgt_typ_nm, MSC_STK_SRCH_TGT_TYP.XFR_ACT_NO.name());
		}
		else {
			setValueEx(Cnd_srch_tgt_typ, null);
			setValueEx(Cnd_srch_tgt_typ_nm, null);
		}
	}

	/**
	 * 移動日、計上日、取消計上日の初期値を設定する。
	 */
	protected void setDate() {
		HdrR hdrR = getHdrR();
		if ((isUpdStatus() || isDelStatus())
				&& !isNull(hdrR.ac_dt())) {
			hdrR.can_ac_dt(hdrR.ac_dt());
		}
		if (isInsStatus()) {
			setValueEx(Hdr_xfr_dt, getToday());
			setValueEx(Hdr_ac_dt, getToday());
		}
	}

	// イベント処理(event)
	//----- ヘッダ
	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info,IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);		
		if (!Cnd_ope_INS.isSelected() && !isNull(getHdrR().xfr_act_no())) {
			setValueEx(Cnd_srch_tgt_no, getHdrR().xfr_act_no());
		}
	}

	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe,
			String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);

		setSrchTgtTyp();
	}
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		setIndivPrnt();
	}
	/**
	 * 個別発行を設定する。
	 */
	protected void setIndivPrnt(){
		setValueEx(Btn_indiv_prnt_flg, false);
	}

	@Override
	public boolean doHdr_trd_cd_VC(MCEventInfo info) {
		if (!super.doHdr_trd_cd_VC(info)) {
			return false;
		}

		_dataClearedFlg = false;
		if (!isNull(getHdrR().gr_loc_cd())) {
			if (confirmRegDataClear()) {
				_dataClearedFlg = true;
				return true;
			}
			else {
				return false;
			}
		}

		return true;
	}

	@Override
	public boolean doHdr_gr_loc_cd_VC(MCEventInfo info) {
		if (!super.doHdr_gr_loc_cd_VC(info)) {
			return false;
		}

		if (_dataClearedFlg) {
			_dataClearedFlg = false;
			return true;
		}

		if (isChanged(DtlTable)) {
			return confirmTableClear();
		}

		return true;
	}

	@Override
	public void doHdr_trd_cd_LC(MCEventInfo info) {
		super.doHdr_trd_cd_NC(info);

		setValueEx(Hdr_gr_loc_cd, null);
	}

	@Override
	public void doHdr_gr_loc_cd_LC(MCEventInfo info) {
		super.doHdr_gr_loc_cd_LC(info);

		getDtlL().clear();
		DtlTable.fillSpace();
	}

	//----- 明細
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Dtl_itm_p_PPanel.addItmLCListner(this);
		columnDtl_sno1.addVCListener(this);
		columnDtl_sno2.addVCListener(this);
		columnDtl_sno3.addVCListener(this);
		columnDtl_sno4.addVCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (Dtl_itm_p_PPanel.isItm(lc)
				&& Dtl_itm_p_PPanel.isItmFix(info.getEventIndex())) {
			doDtl_itm_cd(info);
		}
	}
	
	@Override
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (vc == columnDtl_sno1) {
			return doDtl_sno1_VC(info);
		}
		if (vc == columnDtl_sno2) {
			return doDtl_sno2_VC(info);
		}
		if (vc == columnDtl_sno3) {
			return doDtl_sno3_VC(info);
		}
		if (vc == columnDtl_sno4) {
			return doDtl_sno4_VC(info);
		}
		return super.doVCEvent(vc, info);
	}

	protected void doDtl_itm_cd(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR dtlR = getDtlL().get(idx);
		HdrR hdrR = getHdrR();

		if (!isNull(dtlR.itm_cd())) {
			if (MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())) {
				setValueEx(columnDtl_quality_typ, idx, MAC_QUALITY_TYP.GOOD.value());
			}
			setDefStrLnCd(dtlR);
		}
		else {
			setValueEx(columnDtl_quality_typ, idx, null);
		}

		setProvInfo(idx, dtlR);
		setRetProvInfo(idx, dtlR);
	}

	@Override
	public void doDtl_gi_loc_cd_LC(MCEventInfo info) {
		super.doDtl_gi_loc_cd_LC(info);

		int idx = info.getEventIndex();
		DtlR dtlR = getDtlL().get(idx);

		setValueEx(columnDtl_stk_insp_typ, idx, null);

		if (isNewRow(dtlR)) {
			setValueEx(columnDtl_stk_id_typ, idx, null);
		}

		if (isNull(dtlR.gi_loc_cd())) {
			setValueEx(columnDtl_gi_stk_arrv_bp_cd, idx, null);
		}
		else {
			if (isNull(dtlR.gi_sppl_cd())) {
				setValueEx(columnDtl_gi_stk_arrv_bp_cd, idx, MAC_STR.NULL_VAL.value());
			}
			else {
				setValueEx(columnDtl_gi_stk_arrv_bp_cd, idx, null);
			}
		}
	}

	@Override
	public void doDtl_gi_sppl_cd_LC(MCEventInfo info) {
		super.doDtl_gi_sppl_cd_LC(info);
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		
		setProvInfo(index, r);
	}
	
	@Override
	public void doDtl_stk_id_typ_LC(MCEventInfo info) {
		super.doDtl_stk_id_typ_LC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.gi_sppl_cd())) {
			setValueEx(columnDtl_gi_stk_arrv_bp_cd, idx, MAC_STR.NULL_VAL.value());
		}
		else {
			if (isNull(r.stk_id_typ()) || MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
				setValueEx(columnDtl_gi_stk_arrv_bp_cd, idx, null);
			}
			else {
				setValueEx(columnDtl_gi_stk_arrv_bp_cd, idx, r.gi_sppl_cd());
			}
		}
		setRetProvInfo(idx, r);
	}

	@Override
	public void doDtl_gi_stk_arrv_bp_cd_NC(MCEventInfo info) {
		super.doDtl_stk_id_typ_LC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		setProvInfo(idx, r);
		setRetProvInfo(idx, r);
	};

	@Override
	public void doDtl_rsn_cd_LC(MCEventInfo info) {
		super.doDtl_rsn_cd_LC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.acxfr_gi_flg()) {
			setValueEx(columnDtl_bd_dpt_cd, idx, null);
		}
	}

	@Override
	public void doDtl_prov_typ_LC(MCEventInfo info) {
		super.doDtl_prov_typ_LC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
			setValueEx(columnDtl_prov_basis_typ, idx, getHdrR().prov_basis_typ());
		}
		else {
			setValueEx(columnDtl_prov_basis_typ, idx, null);
		}
	}

	@Override
	public void doDtl_ret_prov_typ_LC(MCEventInfo info) {
		super.doDtl_ret_prov_typ_LC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!MAC_PROV_TYP.isONR_PROV(r.ret_prov_typ())) {
			setValueEx(columnDtl_ret_prov_basis_typ, idx, null);
		}
	}

	@Override
	public void doDtl_abort_flg_NC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		// 打切、打切解除は指図明細ＮＯまたは予定ＮＯの単位で行う
		String key = getXfrTgtKey();
		getDtlL().forEach(rr -> {
			if (rr != r
				&& isSame(rr.getStringNE(key), r.getString(key))) {
				setValueEx(columnDtl_abort_flg, rr.getGUIIndex(), r.abort_flg());
			}
		});
	}

	protected String getXfrTgtKey() {
		HdrR hdrR = getHdrR();
		if (!isNullOrNullVal(hdrR.xfr_inst_no())) {
			return DtlR.$xfr_inst_d_no;
		}
		return DtlR.$xfr_schd_no;
	}

	protected boolean doDtl_sno1_VC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		if (!isSame(info.getNewValue(), r.schd_sno1())
				&& !isNull(info.getNewValue())
				&& !isNull(r.schd_sno1())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}

	protected boolean doDtl_sno2_VC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		if (!isSame(info.getNewValue(), r.schd_sno2())
				&& !isNull(info.getNewValue())
				&& !isNull(r.schd_sno2())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}

	protected boolean doDtl_sno3_VC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		if (!isSame(info.getNewValue(), r.schd_sno3())
				&& !isNull(info.getNewValue())
				&& !isNull(r.schd_sno3())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}

	protected boolean doDtl_sno4_VC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		if (!isSame(info.getNewValue(), r.schd_sno4())
				&& !isNull(info.getNewValue())
				&& !isNull(r.schd_sno4())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}

	// Status Override
	@Override
	public void setINSStatus() {
		super.setINSStatus();

		HdrPanel.focusFirstComponent();
		setDate();
	}

	@Override
	public void setINS_INSTStatus() {
		super.setINS_INSTStatus();

		HdrPanel.focusFirstComponent();
		setDate();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();

		CndPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();

		CndPanel.focusFirstComponent();
		getHdrR().immd_dlv_prnt_flg(false);
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();

		HdrPanel.focusFirstComponent();
		setDate();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();

		CndPanel.focusFirstComponent();
		setDate();
	}

	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();

		ScreenOpePanel.focusFirstComponent();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();

		CndPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();

		CndPanel.focusFirstComponent();
	}

	// Cell Config Override
	@Override
	protected void setCellConfig() {
		super.setCellConfig();

		DtlTable.setCellConfig(createDtlTableCellConfig());
	}

	/**
	 * DtlTable用のセルコンフィグ
	 */
	protected MCCellConfig createDtlTableCellConfig() {
		return new DtlTableCellConfig();
	}

	/**
	 * DtlTable用のセルコンフィグ
	 */
	public class DtlTableCellConfig
			extends mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			// ヘッダの必須項目が埋まってなければ一覧は入力不可
			if (!headerFills()) {
				return MCMode.READ_ONLY;
			}

			HdrR hdrR = getHdrR();
			DtlR dtlR = (DtlR) table.getBaseTable().getRow(index);

			if (isInsStatus() || isUpdStatus()) {
				//----- 入力を不可にする制御
				// 新規追加行の場合
				if (isNonSchdRow(dtlR)) {
					if (column == columnDtl_abort_flg) {
						return MCMode.READ_ONLY;
					}
				}
				// 新規追加行でない場合
				else {
					if (column == columnDtl_sno1) {
						if (!dtlR.sno1_null_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnDtl_sno2) {
						if (!dtlR.sno2_null_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnDtl_sno3) {
						if (!dtlR.sno3_null_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnDtl_sno4) {
						if (!dtlR.sno4_null_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnDtl_rsn_cd) {
						return MCMode.READ_ONLY;
					}
				}
				if (!isNewRow(dtlR)) {
					if (isSchdROCol(column)) {
						return MCMode.READ_ONLY;
					}
					if (isProvRtn(dtlR) || isProvDD(dtlR)) {
						if (column == columnDtl_gi_loc_cd
								|| column == columnDtl_gi_stk_arrv_bp_cd
								|| column == columnDtl_stk_id_typ) {
							return MCMode.READ_ONLY;
						}
					}
					if (!isNull(dtlR.xfr_act_d_no()) && MSC_STK_ID_TYP.isRNT_RCV(dtlR.stk_id_typ())) {
						if (column == columnDtl_stk_id_typ) {
							return MCMode.READ_ONLY;
						}
					}
				}

				// 移動または支給返品の場合、支給区分は入力できない
				if (isXfr(dtlR) || isProvRtn(dtlR)) {
					if (column == columnDtl_prov_typ) {
						return MCMode.READ_ONLY;
					}
				}

				// 社外かつ自社在庫の場合のみ入力可能
				if (isNull(dtlR.gi_loc_cd()) || isNull(dtlR.gi_sppl_cd()) || !MSC_STK_ID_TYP.isCOSTK(dtlR.stk_id_typ())) {
					if (column == columnDtl_gi_stk_arrv_bp_cd) {
						return MCMode.READ_ONLY;
					}
				}

				// 取引パタン区分が支給
				if (MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())) {
					if (column == columnDtl_quality_typ) {
						return MCMode.READ_ONLY;
					}
				}

				// 在庫識別区分がNULLまたは自社在庫の場合
				if (isNull(dtlR.stk_id_typ())
						|| MSC_STK_ID_TYP.isCOSTK(dtlR.stk_id_typ())) {
					if (column == columnDtl_stk_bp_cd) {
						return MCMode.READ_ONLY;
					}
				}

				// 他勘定出庫の理由でない場合
				if (!dtlR.acxfr_gi_flg()) {
					if (column == columnDtl_bd_dpt_cd) {
						return MCMode.READ_ONLY;
					}
				}
				if (!MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ())) {
					if (column == columnDtl_base_dlv_slip_no
							|| column == columnDtl_base_prov_act_no
							|| column == columnDtl_base_ac_dt) {
						return MCMode.READ_ONLY;
					}
				}

				//----- 入力を必須にする制御
				// 取引パタン区分が支給返品の場合
				if (MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ())) {
					if (column == columnDtl_gi_loc_cd
							||column == columnDtl_gi_stk_arrv_bp_cd
							|| column == columnDtl_stk_id_typ) {
						return MCMode.REQUIRED;
					}
				}
				if (isNewRow(dtlR) && (isProvDD(dtlR) || isProvRtn(dtlR))) {
					if (column == columnDtl_gi_stk_arrv_bp_cd
							|| column == columnDtl_stk_id_typ) {
						return MCMode.REQUIRED;
					}
				}

				// 在庫識別区分がNULLでも自社在庫でもない場合
				if (!isNull(dtlR.stk_id_typ())
						&& !MSC_STK_ID_TYP.isCOSTK(dtlR.stk_id_typ())) {
					if (column == columnDtl_stk_bp_cd) {
						return MCMode.REQUIRED;
					}
				}

				// 他勘定出庫の理由の場合
				if (dtlR.acxfr_gi_flg()) {
					if (column == columnDtl_bd_dpt_cd) {
						return MCMode.REQUIRED;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}

		/**
		 * 既存行のときにROになるカラム
		 * (新規追加行のときのみ入力可能なカラム)
		 * @param column
		 * @return
		 */
		protected boolean isSchdROCol(MCColumnConfig column) {
			if (column == columnDtl_itm_cd
					|| column == columnDtl_itm_sub1
					|| column == columnDtl_itm_sub2
					|| column == columnDtl_itm_sub3
					|| column == columnDtl_prov_typ
					|| column == columnDtl_ret_prov_typ) {
				return true;
			}
			return false;
		}
	}

	//********************** インターフェースに対する実装 **************************
	// IfOpePanelの実装
	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();

		ret.add(getHdrR());
		ret.add(getDtlL());

		return ret;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();

		ret.add(getCndR());

		return ret;
	}

	@Override
	public MCCheckBox getCndLatestFlg () {
		return null;
	}

	@Override
	public MCRowBeans getCndRevNo() {
		return null;
	}

	@Override
	public MCCheckBox getRegLatestFlg() {
		return null;
	}

	// IfRowMoveBaseの実装
	@Override
	public MCTable<?> getRowMoveTable() {
		return DtlTable;
	}

	@Override
	public boolean isStatusChange() {
		return false;
	}

	// IfStkInspBaseの実装 (在庫情報選択画面との連携)
	@Override
	public MCTable<?> getStkTable(MCRootPanel panel) {
		return DtlTable;
	}

	@Override
	public boolean checkOpenStkInfoPanel(MCRootPanel panel) {
		boolean boo = IfStkInspBase.super.checkOpenStkInfoPanel(panel);
		if (!boo) {
			return false;
		}

		MCTable<?> table = getStkTable(panel);
		MCRow row = table.getSelectedMCRow();
		if (row == null) {
			return false;
		}

		return true;
	}

	public MCRow get_open_MSBEP0500_bind_Row(MCTable<?> table) {
		HdrR hdrR = getHdrR();
		MCRow row = table.getSelectedMCRow();
		MCRow bind = MCRow.create();

		if (row instanceof DtlR) {
			DtlR r = (DtlR)row;

			bind.addStringColumn(IfStkInspBase.CND_OPE, IfStkInspBase.OPE_UPD);
			bind.addStringColumn(IfStkInspBase.CND_LOC_CD, r.gi_loc_cd());
			bind.addStringColumn(IfStkInspBase.CND_LOC_NM, r.gi_loc_nm());
			bind.addStringColumn(IfStkInspBase.CND_STR_LN_CD, r.gi_str_ln_cd());
			bind.addStringColumn(IfStkInspBase.CND_STR_LN_NM, r.gi_str_ln_nm());
			bind.addStringColumn(IfStkInspBase.CND_STK_ARRV_BP_CD, r.gi_stk_arrv_bp_cd());
			bind.addStringColumn(IfStkInspBase.CND_STK_ARRV_BP_NM, r.gi_stk_arrv_bp_nm());
			bind.addBooleanColumn(IfStkInspBase.CND_ONLY_INT_FLG, true);
			bind.addStringColumn(IfStkInspBase.CND_LG_GRP_CD, hdrR.lg_grp_cd());
			bind.addStringColumn(IfStkInspBase.CND_LG_GRP_NM, hdrR.lg_grp_nm());
			bind.addStringColumn(IfStkInspBase.CND_ITM_CD, r.itm_cd());
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB1, r.itm_sub1());
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB2, r.itm_sub2());
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB3, r.itm_sub3());
			bind.addStringColumn(IfStkInspBase.CND_ITM_NM, r.itm_nm());
			bind.addStringColumn(IfStkInspBase.CND_VER_NO, r.ver_no());
			if (isNonSchdRow(r)) {
				bind.addStringColumn(IfStkInspBase.CND_SNO1, r.sno1());
				bind.addStringColumn(IfStkInspBase.CND_SNO2, r.sno2());
				bind.addStringColumn(IfStkInspBase.CND_SNO3, r.sno3());
				bind.addStringColumn(IfStkInspBase.CND_SNO4, r.sno4());
			}
			else {
				bind.addStringColumn(IfStkInspBase.CND_SNO1, r.schd_sno1());
				bind.addBooleanColumn(IfStkInspBase.CND_SNO1_NULL_FLG, r.sno1_null_flg()); // 手配ＮＯ無し可
				bind.addStringColumn(IfStkInspBase.CND_SNO2, r.schd_sno2());
				bind.addBooleanColumn(IfStkInspBase.CND_SNO2_NULL_FLG, r.sno2_null_flg()); // 手配ＮＯ無し可
				bind.addStringColumn(IfStkInspBase.CND_SNO3, r.schd_sno3());
				bind.addBooleanColumn(IfStkInspBase.CND_SNO3_NULL_FLG, r.sno3_null_flg()); // 手配ＮＯ無し可
				bind.addStringColumn(IfStkInspBase.CND_SNO4, r.schd_sno4());
				bind.addBooleanColumn(IfStkInspBase.CND_SNO4_NULL_FLG, r.sno4_null_flg()); // 手配ＮＯ無し可
			}
			bind.addStringColumn(IfStkInspBase.CND_GD_CD, r.gd_cd());
			bind.addStringColumn(IfStkInspBase.CND_GD_NM, r.gd_nm());
			if (r != null && !isNull(r.quality_typ())) {
				bind.addStringColumn(IfStkInspBase.CND_QUALITY_TYP, r.quality_typ());
			}
			else {
				bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_GOOD_FLG, true);
				if (!MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())) {
					bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_DFCT_OPER_FLG, true);
					bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_DFCT_INSP_FLG, true);
					bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_SSPND_FLG, true);
				}
			}

			if (isNewRow(r)) {
				bind.addBooleanColumn(IfStkInspBase.CND_STK_INSP_TYP_FIN_FLG, true);
				bind.addBooleanColumn(IfStkInspBase.CND_STK_INSP_TYP_ING_FLG, true);
				bind.addBooleanColumn(IfStkInspBase.CND_STK_INSP_TYP_WAIT_JUDG_FLG, true);
				bind.addBooleanColumn(IfStkInspBase.CND_STK_INSP_TYP_YET_FLG, true);
			}
			else {
				bind.addStringColumn(IfStkInspBase.CND_STK_INSP_TYP, r.stk_insp_typ());
			}

			if (!isNull(r.stk_id_typ())) {
				bind.addStringColumn(IfStkInspBase.CND_STK_ID_TYP, r.stk_id_typ());
			}
			else {
				bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_COSTK_FLG, true);
				bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_RTN_PRE_ACCPT_FLG, true);
				bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_RNT_RCV_FLG, true);
				bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_PURC_PRE_ACCPT_FLG, true);
				bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ACCPT_DFCT_FLG, true);
				bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_NCV_RCV_FLG, true);
				bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ONR_PROV_FLG, true);
			}
			bind.addStringColumn(IfStkInspBase.CND_STK_BP_CD, r.stk_bp_cd());
			bind.addStringColumn(IfStkInspBase.CND_STK_BP_NM, r.stk_bp_nm());
			if (MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ())) {
				bind.addStringColumn(IfStkInspBase.CND_STK_INFO_LOC_TYP, MSC_STK_INFO_LOC_TYP.OUTSIDE.value());
			}
			else if (MAC_TRD_PTN_TYP.isXFR(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(hdrR.trd_ptn_typ())) {
				bind.addStringColumn(IfStkInspBase.CND_STK_INFO_LOC_TYP, MSC_STK_INFO_LOC_TYP.HOUSE.value());
			}
			else {
				if (!isNewRow(r) && (isXfr(r) || isProv(r))) {
					bind.addStringColumn(IfStkInspBase.CND_STK_INFO_LOC_TYP, MSC_STK_INFO_LOC_TYP.HOUSE.value());
				}
			}
		}
		return bind;
	}

	@Override
	public boolean isSrch(String openTyp, MCRow bind, Object... args) {
		return !isNull(bind.getStringNE(IfStkInspBase.CND_ITM_CD));
	}

	@Override
	public boolean isOpeTypEnable(MCRootPanel panel, int index, String ope) {
		MCTable<?> table = getStkTable(panel);
		MCRow row = table.getList().get(index);

		if (row instanceof DtlR) {
			DtlR r = (DtlR)row;

			// 行追加で反映ができる条件
			if (isSame(ope, IfStkInspBase.OPE_INS)) {
				if (isNewRow(r)) {
					return true;
				}
				else {
					return false;
				}
			}

			// 選択行に反映ができる条件
			if (isSame(ope, IfStkInspBase.OPE_UPD)) {
				return true;
			}
		}

		return true;
	}

	@Override
	public boolean isCndEnable(String ope, String name) {
		boolean boo = IfStkInspBase.super.isCndEnable(ope, name);
		if (!boo) {
			return false;
		}

		MCTable<?> table = DtlTable;
		MCRow row = table.getSelectedMCRow();

		if (row instanceof DtlR) {
			DtlR r = (DtlR)row;

			ArrayList<String> l = new ArrayList<>();
			l.add(IfStkInspBase.CND_ONLY_INT_FLG);
			l.add(IfStkInspBase.CND_LG_GRP_CD);
			l.add(IfStkInspBase.CND_LG_GRP_NM);
			l.add(IfStkInspBase.CND_STK_INSP_TYP);
			if (!isNewRow(r)) {
				l.add(IfStkInspBase.CND_ITM_CD);
				l.add(IfStkInspBase.CND_ITM_SUB1);
				l.add(IfStkInspBase.CND_ITM_SUB2);
				l.add(IfStkInspBase.CND_ITM_SUB3);
				l.add(IfStkInspBase.CND_ITM_NM);
				if (isProvRtn(r) || isProvDD(r)) {
					l.add(IfStkInspBase.CND_LOC_CD);
					l.add(IfStkInspBase.CND_LOC_NM);
					l.add(IfStkInspBase.CND_STK_ARRV_BP_CD);
					l.add(IfStkInspBase.CND_STK_ARRV_BP_NM);
					l.add(IfStkInspBase.CND_STK_ID_TYP);
				}
			}
			if (!isNonSchdRow(r)) {
				l.add(IfStkInspBase.CND_SNO1);
				l.add(IfStkInspBase.CND_SNO2);
				l.add(IfStkInspBase.CND_SNO3);
				l.add(IfStkInspBase.CND_SNO4);
				l.add(IfStkInspBase.CND_SNO1_NULL_FLG);
				l.add(IfStkInspBase.CND_SNO2_NULL_FLG);
				l.add(IfStkInspBase.CND_SNO3_NULL_FLG);
				l.add(IfStkInspBase.CND_SNO4_NULL_FLG);
			}
			return !l.contains(name);
		}
		else {
			return false;
		}
	}

	/**
	 * 場所ＣＤ（設定項目）
	 */
	@Override
	public String getInptLocCdCol() {
		return DtlR.$gi_loc_cd;
	}

	/**
	 * 棚・ラインＣＤ（設定項目）
	 */
	@Override
	public String getInptStrLnCdCol() {
		return DtlR.$gi_str_ln_cd;
	}

	/**
	 * 棚・ライン無ＦＬＧ（設定項目）
	 */
	@Override
	public String getInptStrLnCdNoneFlgCol() {
		return DtlR.$gi_str_ln_cd_none_flg;
	}
	
	/**
	 * 在庫着荷先ＣＤ（設定項目）
	 */
	@Override
	public String getInptStkArrvBpCdCol() {
		return DtlR.$gi_stk_arrv_bp_cd;
	}

	//********************** 画面遷移対応 **************************
	@Override
	public void statusClear() {
		if (_fromOtherScreenFlg) {
			// 何もしない
			_fromOtherScreenFlg = false;
		}
		else {
			super.statusClear();
		}
	}

	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... param) {
		super.initByScreenParam(openTyp, bind, param);

		if (T1.equals(openTyp)) {
			_fromOtherScreenFlg = true;
			valueInit();
			setINS_INSTStatus();

			setValueEx(Hdr_trd_cd, bind.getStringNE("trd_cd"));
			setValueEx(Hdr_gr_loc_cd, bind.getStringNE("gr_loc_cd"));
			setValueEx(Hdr_xfr_inst_no, bind.getStringNE("xfr_inst_no"));

			MCList<DtlR> dtlL = (MCList<DtlR>) param[0];
			getDtlL().setAll(dtlL);
			sort(DtlTable);

			DtlTable.fillSpace();
			DtlTable.adjustWidth();
		}
	}
	@Override
	public MCBeans getAcDtBeans(MCRootPanel panel) {
		return Hdr_ac_dt;
	}
	@Override
	public MCBeans getScreenOpeBeans(MCRootPanel panel) {
		return Cnd_ope_Group;
	}
	@Override
	public boolean isCanAcDtValueInitOpe(MCRootPanel panel) {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {
			return true;
		}
		return false;
	}
	@Override
	public MCBeans getCheckBeans(MCRootPanel panel) {
		return null;
	}

}