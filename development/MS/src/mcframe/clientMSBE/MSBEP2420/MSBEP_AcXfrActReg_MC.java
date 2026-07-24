package mcframe.clientMSBE.MSBEP2420;

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
import mcframe.clientMAUB.MAUBP0110.*;
import mcframe.clientMAUB.MAUBP0310.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0330.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMSUB.MSUBP0070.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5030.*;
import mcframe.clientMSUB.MSUBP5040.*;
import mcframe.clientMSUB.MSUBP5050.*;
import mcframe.clientMSUB.MSUBP5060.*;

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
import mcframe.clientCore.container.*;
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
import mcframe.clientMSUD.MSUDP0020.IfStkInspBase;
import static mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil.*;
import static mcframe.clientMAUC.MAUCP0080.MAUCP_StdUpriUtil.*;
import mcframe.clientMSUC.MSUCP0110.MSUCP_StrLnUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_AcXfrActReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_AcXfrActReg_MC extends MSBEP_AcXfrActReg_MC_A implements IfOpePanel, IfRowMoveBase, IfStkInspBase, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_AcXfrActReg_MC() {
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
	public MSBEP_AcXfrActReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL2420_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2420_Srch01Caller<P extends MSBEP_AcXfrActReg, B extends MS_MSBEL2420_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2420_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			addDownContainer(getBulkSetR());
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			bridge.down1().setStatus(Status.CREATE);
		}

		@Override
		protected void show() {
			super.show();

			setDate();
			DtlTable.fillSpace();

			setRsnCdListBind();
		}

		@Override
		protected void setMode() {
			super.setMode();

			setupPartsForLot();
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
	 * [MS_MSBEL2420_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2420_Srch02Caller<P extends MSBEP_AcXfrActReg, B extends MS_MSBEL2420_Srch02Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2420_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			addDownContainer(getBulkSetR());
		}

		@Override
		protected void show() {
			super.show();
			setRsnCdListBind();
		}
		
		@Override
		protected void setMode() {
			super.setMode();

			setupPartsForLot();
		}
	}

	/**
	 * [MS_MSBEL2420_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2420_Ins01Caller<P extends MSBEP_AcXfrActReg, B extends MS_MSBEL2420_Ins01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL2420_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
	}

	/**
	 * [MS_MSBEL2420_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2420_Upd01Caller<P extends MSBEP_AcXfrActReg, B extends MS_MSBEL2420_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL2420_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
	}

	/**
	 * [MS_MSBEL2420_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2420_Del01Caller<P extends MSBEP_AcXfrActReg, B extends MS_MSBEL2420_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBEL2420_Del01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(Hdr_can_ac_dt_for_input));
		}
	}

	/**
	 * [MS_MSBEL2420_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2420_Prnt01Caller<P extends MSBEP_AcXfrActReg, B extends MS_MSBEL2420_Prnt01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBEL2420_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch_inst]の押下時の処理
	 */
	@Override
	public void doCnd_srch_inst(MCEventInfo info) {
		callMS_MSBEL2420_Srch01();
	}

	/**
	 * Panel[Cnd]のボタン[srch_act]の押下時の処理
	 */
	@Override
	public void doCnd_srch_act(MCEventInfo info) {
		callMS_MSBEL2420_Srch02();
	}

	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
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

	/**
	 * Panel[Btn]のボタン[ins_gr]の押下時の処理
	 */
	@Override
	public void doBtn_ins_gr(MCEventInfo info) {
		callMS_MSBEL2420_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[ins_gi]の押下時の処理
	 */
	@Override
	public void doBtn_ins_gi(MCEventInfo info) {
		callMS_MSBEL2420_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[ins_dp]の押下時の処理
	 */
	@Override
	public void doBtn_ins_dp(MCEventInfo info) {
		callMS_MSBEL2420_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[upd_gr]の押下時の処理
	 */
	@Override
	public void doBtn_upd_gr(MCEventInfo info) {
		callMS_MSBEL2420_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[upd_gi]の押下時の処理
	 */
	@Override
	public void doBtn_upd_gi(MCEventInfo info) {
		callMS_MSBEL2420_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[upd_dp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_dp(MCEventInfo info) {
		callMS_MSBEL2420_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del_gr]の押下時の処理
	 */
	@Override
	public void doBtn_del_gr(MCEventInfo info) {
		callMS_MSBEL2420_Del01();
	}

	/**
	 * Panel[Btn]のボタン[del_gi]の押下時の処理
	 */
	@Override
	public void doBtn_del_gi(MCEventInfo info) {
		callMS_MSBEL2420_Del01();
	}

	/**
	 * Panel[Btn]のボタン[del_dp]の押下時の処理
	 */
	@Override
	public void doBtn_del_dp(MCEventInfo info) {
		callMS_MSBEL2420_Del01();
	}

	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBEL2420_Prnt01();
	}

// -----------------------------------------------
// 初期設定
	@Override
	protected void setupParts() {
		super.setupParts();
		setupPartsForLot();

		Hdr_ac_dt_p_PPanel.setRelateBeans(Hdr_acxfr_act_dt);
		Hdr_usr_dpt_p_PPanel.setRelateBeans(Hdr_ac_dt);

		Dtl_itm_p_PPanel.setRelateBeans(columnDtl_sundry_itm_flg);
		Dtl_ver_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, null, columnDtl_ver_flg,
				columnDtl_crt_lot_flg);
		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_trd_unit_cd,
				columnDtl_trd_unit_dec_place, columnDtl_trd_unit_rnd_typ,
				columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty,
				columnDtl_base_unit_cd);
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
				columnDtl_trd_unit_qty, columnDtl_trd_unit_conv_base_qty,
				columnDtl_trd_unit_conv_qty);
		Dtl_base_unit_act_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place);
		Dtl_base_unit_schd_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place);
		Dtl_base_unit_inst_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place);
		Dtl_str_ln_p_PPanel.setRelateBeans(Hdr_loc_cd, Hdr_str_ln_tgt_flg);
		Dtl_sno_wrk_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_sno1_mng_typ,
				columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ);
		Dtl_stk_bp_p_PPanel.setRelateBeans(columnDtl_stk_id_typ);
		Dtl_stk_arrv_bp_p_PPanel.setRelateBeans(Hdr_loc_cd, Hdr_sppl_cd);
		Dtl_stk_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd,
				columnDtl_base_cur_amt_dec_place);
		Dtl_bd_p_PPanel.setRelateBeans(columnDtl_bd_lot_mng_typ,
				columnDtl_bd_sublot_mng_typ, columnDtl_bd_sno1_mng_typ,
				columnDtl_bd_sno2_mng_typ, columnDtl_bd_sno3_mng_typ,
				columnDtl_bd_sno4_mng_typ);
	}

	protected void setupPartsForLot() {
		if (isGr()) {
			Dtl_lot_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
					columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_lot_mng_typ,
					columnDtl_lot_no_typ, columnDtl_sublot_mng_typ, columnDtl_sublot_no_typ,
					true, columnDtl_not_new_lot_flg);
		}
		else {
			Dtl_lot_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
					columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_lot_mng_typ, columnDtl_sublot_mng_typ);
		}
	}

	@Override
	protected void listInit() {
		super.listInit();

		getBulkSet_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_ac_dt);
		Dtl_bd_p_PPanel.columnBdItem_bd_dpt_cd.getListConfig().getPutter()
				.putBind(DptCols.$i_dt, Hdr_ac_dt_p_PPanel.AcDt_ac_dt);
	}

	protected void setRsnCdListBind() {
		getBulkSet_rsn_cd_ListPutter()
				.putBind(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg, isGi());
		getBulkSet_rsn_cd_ListPutter()
				.putBind(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg, isGr());
		getBulkSet_rsn_cd_ListPutter()
				.putBind(AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg, isDp());

		getDtl_rsn_cd_ListPutter()
				.putBind(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg, isGi());
		getDtl_rsn_cd_ListPutter()
				.putBind(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg, isGr());
		getDtl_rsn_cd_ListPutter()
				.putBind(AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg, isDp());
	}

	protected boolean isGr() {
		return MAC_TRD_PTN_TYP.isSTK_OTH_GR(getHdrR().trd_ptn_typ());
	}

	protected boolean isGi() {
		return MAC_TRD_PTN_TYP.isSTK_OTH_GI(getHdrR().trd_ptn_typ());
	}

	protected boolean isDp() {
		return MAC_TRD_PTN_TYP.isSCRP(getHdrR().trd_ptn_typ());
	}

	@Override
	public MCList getDtl_stk_id_typ(MCRow row, MCEventInfo info) {
		MCList<MCRow> list = MCList.create(MCRow.class);

		for (MCRow r : (MCList<MCRow>) super.getDtl_stk_id_typ(row, info)) {
			if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(getHdrR().trd_ptn_typ())) {
				if (!isNull(getHdrR().sppl_cd())) {
					if (MSC_STK_ID_TYP.isCOSTK(r.getStringNE(DtlR.$stk_id_typ))
							|| MSC_STK_ID_TYP.isACCPT_DFCT(r.getStringNE(DtlR.$stk_id_typ))
							|| MSC_STK_ID_TYP.isNCV_RCV(r.getStringNE(DtlR.$stk_id_typ))
							|| MSC_STK_ID_TYP.isONR_PROV(r.getStringNE(DtlR.$stk_id_typ))) {
						list.add(r);
					}
				}
				else {
					if (MSC_STK_ID_TYP.isCOSTK(r.getStringNE(DtlR.$stk_id_typ))
							|| MSC_STK_ID_TYP.isRTN_PRE_ACCPT(r.getStringNE(DtlR.$stk_id_typ))
							|| MSC_STK_ID_TYP.isCSTSTK(r.getStringNE(DtlR.$stk_id_typ))
							|| MSC_STK_ID_TYP.isRNT_RCV(r.getStringNE(DtlR.$stk_id_typ))
							|| MSC_STK_ID_TYP.isACCPT_DFCT(r.getStringNE(DtlR.$stk_id_typ))
							|| MSC_STK_ID_TYP.isNCV_RCV(r.getStringNE(DtlR.$stk_id_typ))) {
						list.add(r);
					}
				}
			}
			else if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(getHdrR().trd_ptn_typ())) {
				if (MSC_STK_ID_TYP.is_act_gi(r.getStringNE(DtlR.$stk_id_typ))) {
					list.add(r);
				}
			}
			else if (MAC_TRD_PTN_TYP.isSCRP(getHdrR().trd_ptn_typ())) {
				if (MSC_STK_ID_TYP.is_act_scrp(r.getStringNE(DtlR.$stk_id_typ))) {
					list.add(r);
				}
			}
		}

		return list;
	}

	@Override
	public MCList getDtl_fix_no_typ(MCRow row, MCEventInfo info) {
		if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(getHdrR().trd_ptn_typ())) {
			MCList<MCRow> list = MCList.create(MCRow.class);

			for (MCRow r : (MCList<MCRow>) super.getDtl_fix_no_typ(row, info)) {
				if (MSC_FIX_NO_TYP.is_stk_oth_gi(r.getStringNE(DtlR.$fix_no_typ))) {
					list.add(r);
				}
			}
			return list;
		}
		else {
			return super.getDtl_fix_no_typ(row, info);
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();

		setSrchTgtTyp();
		setDate();
	}

	protected void setDate() {
		setValueEx(Hdr_acxfr_act_dt, getToday());
		setValueEx(Hdr_ac_dt, getToday());
	}

	protected void setCanAcDt() {
		getHdrR().can_ac_dt(getHdrR().ac_dt());
	}

	protected void setSrchTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {
			getCndR().srch_tgt_typ(MSC_STK_SRCH_TGT_TYP.ACXFR_INST_NO.value());
			getCndR().srch_tgt_typ_nm(MSC_STK_SRCH_TGT_TYP.ACXFR_INST_NO.name());
		}
		else {
			getCndR().srch_tgt_typ(MSC_STK_SRCH_TGT_TYP.ACXFR_ACT_NO.value());
			getCndR().srch_tgt_typ_nm(MSC_STK_SRCH_TGT_TYP.ACXFR_ACT_NO.name());
		}
	}

// -----------------------------------------------
// フォーカス設定、入力制御
	@Override
	public void setINSStatus() {
		super.setINSStatus();

		HdrPanel.focusFirstComponent();
		setBtnMode();
		setDate();
	}

	@Override
	public void setINS_INSTStatus() {
		super.setINS_INSTStatus();

		HdrPanel.focusFirstComponent();
		setBtnMode();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setRevNoMode();
		CndPanel.focusFirstComponent();
		setBtnMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();

		CndPanel.focusFirstComponent();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();

		HdrPanel.focusFirstComponent();
		setBtnMode();
		setCanAcDt();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();

		CndPanel.focusFirstComponent();
		setBtnMode();
		setCanAcDt();
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

// -----------------------------------------------
// Event
	@Override
	protected void listenerInit() {
		super.listenerInit();

		getDtlL().addListListener(createListListener(createDtlRowListener()));
		columnDtl_crt_lot_flg.addNCListener(this);
		columnDtl_trd_unit_qty.addLCListener(this);
		columnDtl_itm_cd.addLCListener(this);
		columnDtl_itm_sub1.addLCListener(this);
		columnDtl_itm_sub2.addLCListener(this);
		columnDtl_itm_sub3.addLCListener(this);
		Hdr_ac_dt.addLCListener(this);
	}

	// ROW ステータス変更時のイベント取得処理
	protected MCRowStatusListener createDtlRowListener() {
		return new DtlRowListener();
	}

	public class DtlRowListener implements MCRowStatusListener {
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			if (isSame(event.getNewStatus(), Status.CREATE)
					&& isSame(event.getOldStatus(), Status.NONE)) {
				DtlR dtl = (DtlR) event.getSourceRow();

				setDefBulkSet(dtl);
			}
		}
	}

	protected void setDefBulkSet(DtlR dtl) {
		if (isNull(dtl.bd_dpt_cd())) {
			setValueEx(Dtl_bd_p_PPanel.columnBdItem_bd_dpt_cd, dtl.getGUIIndex(),
					getBulkSetR().bd_dpt_cd());
		}

		if (isNull(dtl.rsn_cd())) {
			setValueEx(columnDtl_rsn_cd, dtl.getGUIIndex(), getBulkSetR().rsn_cd());
		}
	}

	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe,
			String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);

		setSrchTgtTyp();
		if (isINSOpe(afOpe) && isREFOpe(bfOpe) && isREFStatus(bfSt)) {
			// 参照登録時に再設定
			setupPartsForLot();
		}
	}

	@Override
	public void doHdr_trd_cd_NC(MCEventInfo info) {
		super.doHdr_trd_cd_NC(info);

		getDtlL().clear();
		DtlTable.fillSpace();
	}

	@Override
	public void doHdr_trd_cd_NX(MCEventInfo info) {
		super.doHdr_trd_cd_NX(info);

		setRsnCdListBind();
	}

	@Override
	public boolean doHdr_trd_cd_VC(MCEventInfo info) {
		if (isChanged(DtlTable) && !confirmRegDataClear()) {
			return false;
		}

		return super.doHdr_trd_cd_VC(info);
	}

	@Override
	public void doHdr_trd_ptn_typ_LC(MCEventInfo info) {
		super.doHdr_trd_ptn_typ_LC(info);

		setupPartsForLot();
		setBtnMode();

		setValueEx(BulkSet_rsn_cd, null);
	}

	@Override
	public void doHdr_wg_cd_LC(MCEventInfo info) {
		super.doHdr_wg_cd_LC(info);
		
		setStkAmt();
	}

	@Override
	public void doHdr_loc_cd_LC(MCEventInfo info) {
		super.doHdr_loc_cd_LC(info);
		if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(getHdrR().trd_ptn_typ())) {
			setDefStrLnCd();
		}
	}

	@Override
	public void doBulkSet_rsn_cd_LC(MCEventInfo info) {
		super.doBulkSet_rsn_cd_LC(info);

		if (!isNull(getBulkSetR().rsn_cd())) {
			for (DtlR r : DtlTable.getViewRows()) {
				if (isNull(r.rsn_cd())
						&& isNullAnd(r.acxfr_inst_d_no(), r.acxfr_schd_no())) {
					if (!r.isEmpty() && !r.isStatusDelete() && !r.abort_flg()) {
						setValueEx(columnDtl_rsn_cd, r.getGUIIndex(),
								getBulkSetR().rsn_cd());
					}
				}
			}
		}
	}

	@Override
	public void doBulkSet_bd_dpt_cd_LC(MCEventInfo info) {
		super.doBulkSet_bd_dpt_cd_LC(info);

		if (!isNull(getBulkSetR().bd_dpt_cd())) {
			for (DtlR r : DtlTable.getViewRows()) {
				if (isNull(r.bd_dpt_cd())) {
					if (!r.isEmpty() && !r.isStatusDelete()) {
						setValueEx(columnDtl_bd_dpt_cd, r.getGUIIndex(),
								getBulkSetR().bd_dpt_cd());
					}
				}
			}
		}
	}

	protected void setBtnMode() {
		if (isSame(getStatus(), INS) || isSame(getStatus(), INS_INST)) {
			Btn_ins_gr.setMode(getGrMode());
			Btn_ins_gi.setMode(getGiMode());
			Btn_ins_dp.setMode(getDpMode());
		}
		else if (isSame(getStatus(), UPD)) {
			Btn_upd_gr.setMode(getGrMode());
			Btn_upd_gi.setMode(getGiMode());
			Btn_upd_dp.setMode(getDpMode());
		}
		else if (isSame(getStatus(), DEL)) {
			Btn_del_gr.setMode(getGrMode());
			Btn_del_gi.setMode(getGiMode());
			Btn_del_dp.setMode(getDpMode());
		}
		setBtn_open_MSBEP0500Mode();
	}

	protected MCMode getGrMode() {
		if (isNull(getHdrR().trd_ptn_typ())) {
			return MCMode.DISABLE;
		}
		if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(getHdrR().trd_ptn_typ())) {
			return MCMode.ENABLE;
		}
		return MCMode.INVISIBLE;
	}

	protected MCMode getGiMode() {
		if (isNull(getHdrR().trd_ptn_typ())) {
			return MCMode.DISABLE;
		}
		if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(getHdrR().trd_ptn_typ())) {
			return MCMode.ENABLE;
		}
		return MCMode.INVISIBLE;
	}

	protected MCMode getDpMode() {
		if (isNull(getHdrR().trd_ptn_typ())) {
			return MCMode.DISABLE;
		}
		if (MAC_TRD_PTN_TYP.isSCRP(getHdrR().trd_ptn_typ())) {
			return MCMode.ENABLE;
		}
		return MCMode.INVISIBLE;
	}

	protected void setBtn_open_MSBEP0500Mode() {
		DtlR r = DtlTable.getSelectedMCRow();
		MCButton openStkInfo = Btn_open_MSBEP0500_p_PPanel.StkInfo_open_MSBEP0500;
		if (isEnableBtn_open_MSBEP0500(r)) {
			setDefaultMode(openStkInfo);
		}
		else {
			openStkInfo.setMode(MCMode.DISABLE);
		}
	}

	/**
	 * 在庫情報選択画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP0500(DtlR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);

		setBtn_open_MSBEP0500Mode();
	}

	@Override
	public void doDtl_abort_flg_NC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		// 打切、打切解除は指図明細ＮＯの単位で行う
		String key = getAcXfrTgtKey();
		getDtlL().subList(key, r.getString(key)).setBoolean(DtlR.$abort_flg, r.abort_flg());
	}

	/**
	 * 他勘定振替対象のまとまりを特定するキーを取得する
	 */
	protected String getAcXfrTgtKey() {
		return DtlR.$acxfr_inst_d_no;
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		DtlR r = DtlTable.getRow(info.getEventIndex());
		if (lc == columnDtl_trd_unit_qty || lc == columnDtl_itm_cd
				|| lc == columnDtl_itm_sub1 || lc == columnDtl_itm_sub2
				|| lc == columnDtl_itm_sub3) {
			setStkAmt(r);
		}
		if (lc == columnDtl_itm_cd) {
			doDtl_itm_cd_LC(info);
		}
		if (lc == Hdr_ac_dt) {
			setStkAmt();
		}
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (nc == columnDtl_crt_lot_flg) {
			doDtl_crt_lot_flg_NC(nc, info);
		}
	}

	protected void doDtl_crt_lot_flg_NC(MCNCBeans nc, MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		if (r.crt_lot_flg()) {
			if (MAC_LOT_NO_TYP.isAUTO(r.lot_no_typ())) {
				r.lot_no(null);
			}
			if (MAC_LOT_NO_TYP.isAUTO(r.sublot_no_typ())) {
				r.sublot_no(null);
			}
		}
	}

	@Override
	public void doDtl_fix_no_typ_LC(MCEventInfo info) {
		super.doDtl_fix_no_typ_LC(info);

		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		if (isNull(r.fix_no_typ()) || MSC_FIX_NO_TYP.isNON(r.fix_no_typ())) {
			setValueEx(columnDtl_fix_no, index, null);
		}
	}

	@Override
	public void doDtl_stk_id_typ_LC(MCEventInfo info) {
		super.doDtl_stk_id_typ_LC(info);

		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(r.stk_id_typ())
				|| MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())
				|| MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ())) {
			setValueEx(columnDtl_stk_arrv_bp_cd, index, null);
		}
	}

	public void doDtl_itm_cd_LC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		if (!isNull(r.itm_cd()) && MAC_TRD_PTN_TYP.isSTK_OTH_GR(getHdrR().trd_ptn_typ())) {
			setDefStrLnCd(r);
		}
	}

	protected void setStkAmt() {
		MCList<DtlR> dtlL = MCList.create(DtlR.class);
		dtlL.setAll(exceptEmpty(getDtlL()));
		dtlL.addDateColumn("ac_dt", getHdrR().ac_dt());
		dtlL.addStringColumn("wg_cd", getHdrR().wg_cd());
		dtlL.addStringColumn("stk_std_upri_typ", getCo().stk_std_upri_typ());
		dtlL.addNumberColumn("std_upri");
		getStdCostL("std_upri", dtlL, DtlR.$itm_cd, DtlR.$itm_sub1, DtlR.$itm_sub2, DtlR.$itm_sub3, "ac_dt", "wg_cd", "stk_std_upri_typ");
		for (DtlR r : dtlL) {
			setValueEx(columnDtl_base_cur_cd, r.getGUIIndex(), getCo().base_cur_cd());
			setValueEx(columnDtl_base_cur_nm, r.getGUIIndex(), getBaseCur().cur_nm());
			setValueEx(columnDtl_base_cur_amt_dec_place, r.getGUIIndex(), getCo().stk_amt_dec_place());
			setValueEx(columnDtl_stk_amt, r.getGUIIndex(),
					getAmt(r.getNumberNE("std_upri"), r.base_unit_qty(), getCo().stk_amt_dec_place(), getCo().stk_amt_rnd_typ()));
		}
	}

	protected void setStkAmt(DtlR r) {
		setValueEx(columnDtl_base_cur_cd, r.getGUIIndex(), getCo().base_cur_cd());
		setValueEx(columnDtl_base_cur_nm, r.getGUIIndex(), getBaseCur().cur_nm());
		setValueEx(columnDtl_base_cur_amt_dec_place, r.getGUIIndex(), getCo().stk_amt_dec_place());
		MCNumber upri = getStdCost(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
				getHdrR().ac_dt(), getHdrR().wg_cd(), getCo().stk_std_upri_typ());
		setValueEx(columnDtl_stk_amt, r.getGUIIndex(),
				getAmt(upri, r.base_unit_qty(), getCo().stk_amt_dec_place(), getCo().stk_amt_rnd_typ()));
	}

	/**
	 * 標準の棚・ラインCDを設定します。
	 */
	protected void setDefStrLnCd() {
		getDtlL().forEach(r -> {
			if (!isNull(r.itm_cd())) {
				setDefStrLnCd(r);
			}
		});
	}

	/**
	 * 標準の棚・ラインCDを設定します。
	 */
	protected void setDefStrLnCd(DtlR dtlR) {
		if (isNull(getHdrR().loc_cd()) || !getHdrR().str_ln_tgt_flg()) {
			return;
		}
		String StrLnCd = MSUCP_StrLnUtil.getDefStrLnCd(
				dtlR.itm_cd(),
				dtlR.itm_sub1(),
				dtlR.itm_sub2(),
				dtlR.itm_sub3(),
				getHdrR().loc_cd(),
				this);
		if (isNull(StrLnCd)) {
			setValueEx(columnDtl_str_ln_cd_none_flg, dtlR.getGUIIndex(), true);
		}
		else {
			setValueEx(columnDtl_str_ln_cd, dtlR.getGUIIndex(), StrLnCd);
		}
	}

	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);

		if (cont == getHdrR()) {
			list.add(HdrR.$acxfr_inst_no);
			list.add(HdrR.$acxfr_act_no);
			list.add(HdrR.$acxfr_act_rev);
			list.add(HdrR.$acxfr_act_dt);
			list.add(HdrR.$acxfr_act_hm);
			list.add(HdrR.$ac_dt);
			list.add(HdrR.$can_ac_dt_for_input);
			list.add(HdrR.$can_ac_dt);
			list.add(HdrR.$ac_dt_after_srch);
		}
		else if (cont == getDtlL()) {
			list.add(DtlR.$acxfr_act_d_no);
			list.add(DtlR.$pr_sts_typ);
			list.add(DtlR.$pr_sts_typ_nm);
			list.add(DtlR.$base_unit_act_qty);
			list.add(DtlR.$disp_seq);
			if (isSame(type, NOT_INHERIT_TYPE_REF_UPD)) {
				list.add(DtlR.$acxfr_schd_no);
				list.add(DtlR.$acxfr_inst_d_no);
				list.add(DtlR.$dspsl_no);
				list.add(DtlR.$abort_flg);
			}
			list.add(DtlR.$wms_flg);
			list.add(DtlR.$ext_sys_cd);
			list.add(DtlR.$ext_sys_nm);
			list.add(DtlR.$ext_acxfr_act_no);
		}
		list.remove(DtlR.$schd_upd_cntr);

		return list;
	}

// -----------------------------------------------
// セルコンフィグ
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
			if (!headerFills()) {
				return MCMode.READ_ONLY;
			}

			DtlR dtl = (DtlR) table.getBaseTable().getRow(index);

			if (isSame(getStatus(), INS) || isSame(getStatus(), INS_INST)
					|| isSame(getStatus(), UPD)) {
				if (column == columnDtl_abort_flg) {
					// 予定・指図なし新規の場合は打切は入力不可
					if (isNullAnd(dtl.acxfr_inst_d_no(), dtl.acxfr_schd_no())) {
						return MCMode.READ_ONLY;
					}
					if (dtl.isEmpty()) {
						return MCMode.READ_ONLY;
					}
				}

				if (column == columnDtl_crt_lot_flg) {
					// 版管理対象は不可
					if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(getHdrR().trd_ptn_typ())) {
						if (dtl.ver_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					// 入庫以外は不可
					else {
						return MCMode.READ_ONLY;
					}
				}
				// 予定なし
				if (isNullAnd(dtl.acxfr_inst_d_no(), dtl.acxfr_schd_no())) {
					// 入庫以外で理由がロスFLGオンなら負担品目必須
					if (column == columnDtl_bd_itm_cd) {
						if (!MAC_TRD_PTN_TYP.isSTK_OTH_GR(getHdrR().trd_ptn_typ())
								&& dtl.loss_flg()) {
							return MCMode.REQUIRED;
						}
					}
				}
				else {
					if (column == columnDtl_itm_cd
							|| column == columnDtl_itm_sub1
							|| column == columnDtl_itm_sub2
							|| column == columnDtl_itm_sub3
							|| column == columnDtl_itm_nm
							|| column == columnDtl_quality_typ
							|| column == columnDtl_gd_cd
							|| column == columnDtl_sno1
							|| column == columnDtl_sno2
							|| column == columnDtl_sno3
							|| column == columnDtl_sno4
							|| column == columnDtl_stk_id_typ
							|| column == columnDtl_stk_bp_cd
							|| column == columnDtl_fix_no_typ
							|| column == columnDtl_fix_no
							|| column == columnDtl_stk_arrv_bp_cd
							|| column == columnDtl_rsn_cd
							|| column == columnDtl_bd_itm_cd
							|| column == columnDtl_bd_itm_sub1
							|| column == columnDtl_bd_itm_sub2
							|| column == columnDtl_bd_itm_sub3
							|| column == columnDtl_bd_lot_no
							|| column == columnDtl_bd_sublot_no
							|| column == columnDtl_bd_sno1
							|| column == columnDtl_bd_sno2
							|| column == columnDtl_bd_sno3
							|| column == columnDtl_bd_sno4
							|| column == columnDtl_bd_bp_cd
							|| column == columnDtl_bd_loc_cd
							|| column == columnDtl_bd_ctg_cd
							|| column == columnDtl_bd_oper_cd) {
						return MCMode.READ_ONLY;
					}
				}

				// 入庫なら確定ＮＯ区分入力不可
				if (column == columnDtl_fix_no_typ) {
					if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(getHdrR().trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 確定ＮＯ区分がなしもしくは空なら入力不可
				else if (column == columnDtl_fix_no) {
					if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(getHdrR().trd_ptn_typ())
							|| MSC_FIX_NO_TYP.isNON(dtl.fix_no_typ())
							|| isNull(dtl.fix_no_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 返品検収前、預り、VMIなら着荷先は入力不可
				else if (column == columnDtl_stk_arrv_bp_cd) {
					if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(dtl.stk_id_typ())
							|| MSC_STK_ID_TYP.isCSTSTK(dtl.stk_id_typ())
							|| MSC_STK_ID_TYP.isRNT_RCV(dtl.stk_id_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 出庫では入力不可
				else if (column == columnDtl_itm_nm) {
					if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(getHdrR().trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isSCRP(getHdrR().trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}

			return super.getPriorMode(index, column, table);
		}

		/**
		 * ヘッダの取引ＣＤと場所ＣＤが埋まっているかどうか。
		 * @return 
		 */
		protected boolean headerFills() {
			HdrR hdrR = getHdrR();
			return !isNullOr(hdrR.trd_cd(), hdrR.loc_cd());
		}
	}

// -----------------------------------------------
// 種別用 IF 画面の実装
	@Override
	public MCCheckBox getCndLatestFlg() {
		return Cnd_latest_flg;
	}

	@Override
	public MCRowBeans getCndRevNo() {
		return Cnd_acxfr_act_rev;
	}

	@Override
	public MCCheckBox getRegLatestFlg() {
		return Cnd_latest_flg;
	}

	@Override
	public void doCnd_acxfr_act_rev_NC(MCEventInfo info) {
		setValueEx(Cnd_latest_flg, isNull(getCndR().acxfr_act_rev()));
	}

	@Override
	public void doCnd_latest_flg_NC(MCEventInfo info) {
		CndR cndR = getCndR();
		if (cndR.latest_flg()) {
			setValueEx(Cnd_acxfr_act_rev, null);
		}
	}

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
	public MCTable<?> getRowMoveTable() {
		return DtlTable;
	}

	@Override
	public boolean isStatusChange() {
		return false;
	}

	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe,
			String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);

		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {

			getCndR().srch_tgt_no(getHdrR().acxfr_act_no());
		}
	}

// ---------------------------------------- 在庫情報選択連携 START ----------------------------------------

	protected boolean isItmSet() {
		DtlR dr = DtlTable.getSelectedMCRow();

		if (dr != null && !isNull(dr.itm_cd())) {
			return true;
		}
		else {
			return false;
		}
	}

	protected boolean isItmEditable() {
		DtlR dr = DtlTable.getSelectedMCRow();
		return isEditable(columnDtl_itm_cd, dr.getGUIIndex());
	}

	// 在庫選択画面と連結するテーブル
	@Override
	public MCTable<?> getStkTable(MCRootPanel panel) {
		if (Btn_open_MSBEP0500_p_PPanel == panel) {
			return DtlTable;
		}
		return null;
	}

	@Override
	public boolean isOpeTypEnable(MCRootPanel panel, int index, String ope) {
		// 空行または選択なしの場合は固定（行追加）とする
		return isItmSet();
	}

	@Override
	public String getStkInspOpeType(MCTable<?> table, int index) {
		// 選択行が品目ありの場合は「フォーカス行のみを更新する」で開く
		if (isItmSet()) {
			return IfStkInspBase.OPE_UPD;
		}
		else {
			return IfStkInspBase.OPE_INS;
		}
	}

	@Override
	public boolean isSrch(String openTyp, MCRow bind, Object... args) {
		// 空行の場合は検索しない
		return isItmSet();
	}

	@Override
	public boolean isCndEnable(String ope, String name) {
		// 場所は常に不可
		if (isSame(name, IfStkInspBase.CND_LOC_CD)
				|| isSame(name, IfStkInspBase.CND_LOC_NM)) {
			return false;
		}

		// 品目などは編集不可なら不可
		if (!isItmEditable()) {
			if (isSame(name, IfStkInspBase.CND_ITM_CD)
					|| isSame(name, IfStkInspBase.CND_ITM_SUB1)
					|| isSame(name, IfStkInspBase.CND_ITM_SUB2)
					|| isSame(name, IfStkInspBase.CND_ITM_SUB3)
					|| isSame(name, IfStkInspBase.CND_ITM_NM)
					|| isSame(name, IfStkInspBase.CND_QUALITY_TYP)
					|| isSame(name, IfStkInspBase.CND_GD_CD)
					|| isSame(name, IfStkInspBase.CND_GD_NM)
					|| isSame(name, IfStkInspBase.CND_SNO1)
					|| isSame(name, IfStkInspBase.CND_SNO2)
					|| isSame(name, IfStkInspBase.CND_SNO3)
					|| isSame(name, IfStkInspBase.CND_SNO4)
					|| isSame(name, IfStkInspBase.CND_STK_ID_TYP)
					|| isSame(name, IfStkInspBase.CND_STK_BP_CD)
					|| isSame(name, IfStkInspBase.CND_STK_BP_NM)
					|| isSame(name, IfStkInspBase.CND_FIX_NO_TYP)
					|| isSame(name, IfStkInspBase.CND_FIX_NO)
					|| isSame(name, IfStkInspBase.CND_STK_ARRV_BP_CD)
					|| isSame(name, IfStkInspBase.CND_STK_ARRV_BP_NM)) {
				return false;
			}
		}
		return true;
	}

	// 在庫選択画面に渡す検索条件を設定する
	@Override
	public MCRow get_open_MSBEP0500_bind_Row(MCTable<?> table) {
		if (table == null) {
			return null;
		}

		DtlR selDtlR = (DtlR) table.getSelectedMCRow();
		MCRow bind = MCRow.create();

		bind.addStringColumn(IfStkInspBase.CND_STK_INFO_SRCH_TYP,
				MSC_STK_INFO_SRCH_TYP.STK_ADJST.value());

		bind.addStringColumn(IfStkInspBase.CND_LOC_CD, getHdrR().loc_cd());
		bind.addStringColumn(IfStkInspBase.CND_LOC_NM, getHdrR().loc_nm());

		if (selDtlR != null) {
			bind.addStringColumn(IfStkInspBase.CND_STR_LN_CD, selDtlR.str_ln_cd()); // 棚・ラインＣＤ
			bind.addStringColumn(IfStkInspBase.CND_STR_LN_NM, selDtlR.str_ln_nm()); // 棚・ライン名
			bind.addStringColumn(IfStkInspBase.CND_ITM_CD, selDtlR.itm_cd());
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB1, selDtlR.itm_sub1());
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB2, selDtlR.itm_sub2());
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB3, selDtlR.itm_sub3());
			bind.addStringColumn(IfStkInspBase.CND_ITM_NM, selDtlR.itm_nm());
			bind.addStringColumn(IfStkInspBase.CND_FIX_NO_TYP, selDtlR.fix_no_typ());
			bind.addStringColumn(IfStkInspBase.CND_FIX_NO, selDtlR.fix_no());
			bind.addStringColumn(IfStkInspBase.CND_VER_NO, selDtlR.ver_no()); // 版ＮＯ
			bind.addStringColumn(IfStkInspBase.CND_SNO1, selDtlR.sno1()); // 手配ＮＯ１
			bind.addStringColumn(IfStkInspBase.CND_SNO2, selDtlR.sno2()); // 手配ＮＯ２
			bind.addStringColumn(IfStkInspBase.CND_SNO3, selDtlR.sno3()); // 手配ＮＯ３
			bind.addStringColumn(IfStkInspBase.CND_SNO4, selDtlR.sno4()); // 手配ＮＯ４
			bind.addStringColumn(IfStkInspBase.CND_GD_CD, selDtlR.gd_cd()); // 格付ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_GD_NM, selDtlR.gd_nm()); // 格付名

			bind.addStringColumn(IfStkInspBase.CND_STK_ARRV_BP_CD, selDtlR.stk_arrv_bp_cd()); // 在庫着荷先ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_STK_ARRV_BP_NM, selDtlR.stk_arrv_bp_nm()); // 在庫着荷先名
			bind.addStringColumn(IfStkInspBase.CND_STK_BP_CD, selDtlR.stk_bp_cd()); // 在庫取引先ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_STK_BP_NM, selDtlR.stk_bp_nm()); // 在庫取引先名
		}

		if (selDtlR != null && !isNull(selDtlR.stk_id_typ())) {
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_COSTK_FLG,
					MSC_STK_ID_TYP.isCOSTK(selDtlR.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_RTN_PRE_ACCPT_FLG,
					MSC_STK_ID_TYP.isRTN_PRE_ACCPT(selDtlR.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_CSTSTK_FLG,
					MSC_STK_ID_TYP.isCSTSTK(selDtlR.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_PURC_PRE_ACCPT_FLG,
					MSC_STK_ID_TYP.isPURC_PRE_ACCPT(selDtlR.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_RNT_RCV_FLG,
					MSC_STK_ID_TYP.isRNT_RCV(selDtlR.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ACCPT_DFCT_FLG,
					MSC_STK_ID_TYP.isACCPT_DFCT(selDtlR.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_NCV_RCV_FLG,
					MSC_STK_ID_TYP.isNCV_RCV(selDtlR.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ONR_PROV_FLG,
					MSC_STK_ID_TYP.isONR_PROV(selDtlR.stk_id_typ()));
		}
		else {
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_COSTK_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_RTN_PRE_ACCPT_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_CSTSTK_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_PURC_PRE_ACCPT_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_RNT_RCV_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ACCPT_DFCT_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_NCV_RCV_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ONR_PROV_FLG, true);
		}

		if (selDtlR != null && !isNull(selDtlR.quality_typ())) {
			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_GOOD_FLG,
					MAC_QUALITY_TYP.isGOOD(selDtlR.quality_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_DFCT_OPER_FLG,
					MAC_QUALITY_TYP.isDFCT_OPER(selDtlR.quality_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_DFCT_INSP_FLG,
					MAC_QUALITY_TYP.isDFCT_INSP(selDtlR.quality_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_SSPND_FLG,
					MAC_QUALITY_TYP.isSSPND(selDtlR.quality_typ()));
		}
		else {
			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_GOOD_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_DFCT_OPER_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_DFCT_INSP_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_SSPND_FLG, true);
		}

		return bind;
	}

	@Override
	public boolean isValueLink(MCRootPanel panel, int index, String ope, String name) {
		//
		if (isItmEditable()) {
			return true;
		}
		if (IfStkInspBase.INPT_VER_NO.equals(name)
				|| IfStkInspBase.INPT_LOT_NO.equals(name)
				|| IfStkInspBase.INPT_SUBLOT_NO.equals(name)
				|| IfStkInspBase.INPT_STR_LN_CD.equals(name)
				|| IfStkInspBase.INPT_STR_LN_CD_NONE_FLG.equals(name)
				|| IfStkInspBase.INPT_PACK_UNIT_CD.equals(name)
				|| IfStkInspBase.INPT_PACK_STK_QTY.equals(name)) {
			return true;
		}
		return false;
	}

// ---------------------------------------- 在庫情報選択連携 END ----------------------------------------
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