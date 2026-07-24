package mcframe.clientMSBE.MSBEP2520;

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

import mcframe.clientFSBA.FSBAP0020.*;
import mcframe.clientMAUB.MAUBP0110.*;
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
import mcframe.clientFSBA.FSBAP0000.IfSyncTableBase;
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientMSUD.MSUDP0020.IfStkInspBase;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMSUA.MSUAC0040.MSUAC_List.*;

import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_StkXfrActReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_StkXfrActReg_MC extends MSBEP_StkXfrActReg_MC_A implements IfOpePanel, IfSyncTableBase, IfStkInspBase, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_StkXfrActReg_MC() {
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
	public MSBEP_StkXfrActReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL2520_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2520_Srch01Caller<P extends MSBEP_StkXfrActReg, B extends MS_MSBEL2520_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
	
		protected MS_MSBEL2520_Srch01Caller(P p, B b) {
			super(p, b);
		}
	
		@Override
		protected void show() {
			super.show();
			setRedAcDt();
		}
	
		/**
		 * ヘッダの旧計上日を設定する。<br>
		 */
		protected void setRedAcDt() {
			getHdrR().can_ac_dt(getHdrR().ac_dt());
		}
	}

	/**
	 * [MS_MSBEL2520_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2520_Ins01Caller<P extends MSBEP_StkXfrActReg, B extends MS_MSBEL2520_Ins01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
	
		protected MS_MSBEL2520_Ins01Caller(P p, B b) {
			super(p, b);
		}
	
		@Override
		protected void initCaller() {
			super.initCaller();
			deleteEditableColEmptyDtlGiRows();
			setPrint(true);
		}
	
		/**
		 * 空行を削除する。
		 */
		protected void deleteEditableColEmptyDtlGiRows() {
			int maxLoop = getDtlGiL().size();
			int cur = 0;
			for (int i = 0; i < maxLoop; i++) {
				int size = getDtlGiL().size();
				if (size > 1) {
					for (int j = cur; j < size; j++) {
						DtlGiR row = getDtlGiL().get(j);
						if (row.isEmpty(getNotCopyColumn(getHdrR().trd_ptn_typ()))) {
							DtlGiTable.deleteRow(j);
							break;
						}
						else {
							cur = j;
						}
					}
				}
			}
		}
	
		@Override
		protected boolean checkUpListParamEmpty() {
			boolean flg1 = false;
			for (DtlGiR dtl : bridge.up1()) {
				if (!dtl.isStatusDelete()) {
					flg1 = true;
				}
			}
	
			boolean flg2 = false;
			for (DtlGiR dtl : bridge.up2()) {
				if (!dtl.isStatusDelete()) {
					flg2 = true;
				}
			}
			if (flg1 && flg2) {
				return super.checkUpListParamEmpty();
			}
			else {
				showNoUpListDataMsg();
				return false;
			}
		}
	}

	/**
	 * [MS_MSBEL2520_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2520_Upd01Caller<P extends MSBEP_StkXfrActReg, B extends MS_MSBEL2520_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
	
		protected MS_MSBEL2520_Upd01Caller(P p, B b) {
			super(p, b);
		}
	
		@Override
		protected void initCaller() {
			super.initCaller();
			deleteEditableColEmptyDtlGiRows();
			setPrint(true);
		}
	
		/**
		 * 空行を削除する。
		 */
		protected void deleteEditableColEmptyDtlGiRows() {
			int maxLoop = getDtlGiL().size();
			int cur = 0;
			for (int i = 0; i < maxLoop; i++) {
				int size = getDtlGiL().size();
				if (size > 1) {
					for (int j = cur; j < size; j++) {
						DtlGiR row = getDtlGiL().get(j);
						if (row.isEmpty(getNotCopyColumn(getHdrR().trd_ptn_typ()))) {
							DtlGiTable.deleteRow(j);
							break;
						}
						else {
							cur = j;
						}
					}
				}
			}
		}
	
		@Override
		protected boolean checkUpListParamEmpty() {
			boolean flg1 = false;
			for (DtlGiR dtl : bridge.up1()) {
				if (!dtl.isStatusDelete()) {
					flg1 = true;
				}
			}
	
			boolean flg2 = false;
			for (DtlGiR dtl : bridge.up2()) {
				if (!dtl.isStatusDelete()) {
					flg2 = true;
				}
			}
			if (flg1 && flg2) {
				return super.checkUpListParamEmpty();
			}
			else {
				showNoUpListDataMsg();
				return false;
			}
		}
	}

	/**
	 * [MS_MSBEL2520_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2520_Del01Caller<P extends MSBEP_StkXfrActReg, B extends MS_MSBEL2520_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {
	
		protected MS_MSBEL2520_Del01Caller(P p, B b) {
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
	 * [MS_MSBEL2520_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2520_Prnt01Caller<P extends MSBEP_StkXfrActReg, B extends MS_MSBEL2520_Prnt01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {
	
		protected MS_MSBEL2520_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Btn]のボタン[top_gi]の押下時の処理
	 */
	@Override
	public void doBtn_top_gi(MCEventInfo info) {
		moveToTopRows(DtlGiTable);
	}

	/**
	 * Panel[Btn]のボタン[up_gi]の押下時の処理
	 */
	@Override
	public void doBtn_up_gi(MCEventInfo info) {
		upwardRows(DtlGiTable);
	}

	/**
	 * Panel[Btn]のボタン[down_gi]の押下時の処理
	 */
	@Override
	public void doBtn_down_gi(MCEventInfo info) {
		downwardRows(DtlGiTable);
	}

	/**
	 * Panel[Btn]のボタン[bottom_gi]の押下時の処理
	 */
	@Override
	public void doBtn_bottom_gi(MCEventInfo info) {
		moveToBottomRows(DtlGiTable);
	}

	/**
	 * Panel[Btn]のボタン[top_gr]の押下時の処理
	 */
	@Override
	public void doBtn_top_gr(MCEventInfo info) {
		moveToTopRows(DtlGrTable);
	}

	/**
	 * Panel[Btn]のボタン[up_gr]の押下時の処理
	 */
	@Override
	public void doBtn_up_gr(MCEventInfo info) {
		upwardRows(DtlGrTable);
	}

	/**
	 * Panel[Btn]のボタン[down_gr]の押下時の処理
	 */
	@Override
	public void doBtn_down_gr(MCEventInfo info) {
		downwardRows(DtlGrTable);
	}

	/**
	 * Panel[Btn]のボタン[bottom_gr]の押下時の処理
	 */
	@Override
	public void doBtn_bottom_gr(MCEventInfo info) {
		moveToBottomRows(DtlGrTable);
	}

	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBEL2520_Prnt01();
	}

	/**
	 * Panel[Btn]のボタン[radd_gi]の押下時の処理
	 */
	@Override
	public void doBtn_radd_gi(MCEventInfo info) {
		DtlGiR row = insertRow(DtlGiTable);
		afterAddDtlGiRow(row);
	}

	/**
	 * Panel[Btn]のボタン[rdel_gi]の押下時の処理
	 */
	@Override
	public void doBtn_rdel_gi(MCEventInfo info) {
		deleteRow(DtlGiTable);
	}

	/**
	 * Panel[Btn]のボタン[rcopy_gi]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy_gi(MCEventInfo info) {
		copyRow(DtlGiTable);
	}

	/**
	 * Panel[Btn]のボタン[radd_gr]の押下時の処理
	 */
	@Override
	public void doBtn_radd_gr(MCEventInfo info) {
		DtlGiR row = insertRow(DtlGrTable);
		afterAddDtlGrRow(row);
	}

	/**
	 * Panel[Btn]のボタン[rdel_gr]の押下時の処理
	 */
	@Override
	public void doBtn_rdel_gr(MCEventInfo info) {
		deleteRow(DtlGrTable);
	}

	/**
	 * Panel[Btn]のボタン[rcopy_gr]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy_gr(MCEventInfo info) {
		copyRow(DtlGrTable);
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBEL2520_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[del_itm]の押下時の処理
	 */
	@Override
	public void doBtn_del_itm(MCEventInfo info) {
		callMS_MSBEL2520_Del01();
	}

	/**
	 * Panel[Btn]のボタン[del_lot_sno]の押下時の処理
	 */
	@Override
	public void doBtn_del_lot_sno(MCEventInfo info) {
		callMS_MSBEL2520_Del01();
	}

	/**
	 * Panel[Btn]のボタン[del_grd]の押下時の処理
	 */
	@Override
	public void doBtn_del_grd(MCEventInfo info) {
		callMS_MSBEL2520_Del01();
	}

	/**
	 * Panel[Btn]のボタン[del_pack]の押下時の処理
	 */
	@Override
	public void doBtn_del_pack(MCEventInfo info) {
		callMS_MSBEL2520_Del01();
	}

	/**
	 * Panel[Btn]のボタン[ins_itm]の押下時の処理
	 */
	@Override
	public void doBtn_ins_itm(MCEventInfo info) {
		callMS_MSBEL2520_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[ins_lot_sno]の押下時の処理
	 */
	@Override
	public void doBtn_ins_lot_sno(MCEventInfo info) {
		callMS_MSBEL2520_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[ins_grd]の押下時の処理
	 */
	@Override
	public void doBtn_ins_grd(MCEventInfo info) {
		callMS_MSBEL2520_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[ins_pack]の押下時の処理
	 */
	@Override
	public void doBtn_ins_pack(MCEventInfo info) {
		callMS_MSBEL2520_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[upd_itm]の押下時の処理
	 */
	@Override
	public void doBtn_upd_itm(MCEventInfo info) {
		callMS_MSBEL2520_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[upd_lot_sno]の押下時の処理
	 */
	@Override
	public void doBtn_upd_lot_sno(MCEventInfo info) {
		callMS_MSBEL2520_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[upd_grd]の押下時の処理
	 */
	@Override
	public void doBtn_upd_grd(MCEventInfo info) {
		callMS_MSBEL2520_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[upd_pack]の押下時の処理
	 */
	@Override
	public void doBtn_upd_pack(MCEventInfo info) {
		callMS_MSBEL2520_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP2540_gi]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP2540_gi(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP2540");
		DtlGiR row = DtlGrTable.getSelectedMCRow();
		aso.putCnd(crtOpenMSBEP2540CndR(aso, row, MSC_IO_TYP.GI));
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP2540_gr]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP2540_gr(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP2540");
		DtlGiR row = DtlGiTable.getSelectedMCRow();
		aso.putCnd(crtOpenMSBEP2540CndR(aso, row, MSC_IO_TYP.GR));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP2540.CndR crtOpenMSBEP2540CndR(
			MAUCP_AppScreenOpener aso, DtlGiR r, MSC_IO_TYP io_typ) {
		mcframe.clientMSBE.MSBEP2540.MSBEP_BomEx p = (mcframe.clientMSBE.MSBEP2540.MSBEP_BomEx) aso
				.getPanel();
		p.set_msbe2520((MSBEP_StkXfrActReg) this);
		mcframe.clientMSBE.MSBEP2540.CndR to = mcframe.clientMSBE.MSBEP2540.CndR.create();
		// 種別の設定
		if (MSC_IO_TYP.isGI(io_typ)) {
			to.ope(p.Cnd_ope_GI.getActionCommand());
		}
		if (MSC_IO_TYP.isGR(io_typ)) {
			to.ope(p.Cnd_ope_GR.getActionCommand());
		}
		to.master_dt(getToday());
		to.loc_cd(getHdrR().loc_cd());
		if (r != null) {
			to.itm_cd(r.itm_cd());
			to.itm_sub1(r.itm_sub1());
			to.itm_sub2(r.itm_sub2());
			to.itm_sub3(r.itm_sub3());
			to.base_qty(r.base_unit_qty());
			to.bom_ptn(getBomPtn(p, r));
		}

		return to;
	}

	protected String getBomPtn(mcframe.clientMSBE.MSBEP2540.MSBEP_BomEx p, DtlGiR r) {
		MCRow row = MCRow.create();
		row.setStringNE(ItmDtlBomPtnCols.$i_itm_cd, r.itm_cd());
		row.setStringNE(ItmDtlBomPtnCols.$i_itm_sub1, r.itm_sub1());
		row.setStringNE(ItmDtlBomPtnCols.$i_itm_sub2, r.itm_sub2());
		row.setStringNE(ItmDtlBomPtnCols.$i_itm_sub3, r.itm_sub3());
		row.setStringNE(ItmDtlBomPtnCols.$i_mfg_loc_cd, getHdrR().loc_cd());
		row.setStringNE(ItmDtlBomPtnCols.$i_wg_cd, getHdrR().wg_cd());
		row.setDateNE(ItmDtlBomPtnCols.$i_dt, getHdrR().stk_xfr_act_dt());
		MCList list = p.getCnd_bom_ptn(row, null);
		if (!isNull(list) && !list.isEmpty()) {
			return list.get(0).getStringNE(ItmDtlBomPtnCols.$o_bom_ptn);
		}
		return null;
	}

	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);

		if (cont == getHdrR()) {
			list.add(HdrR.$stk_xfr_act_no);
			list.add(HdrR.$stk_xfr_act_dt);
			list.add(HdrR.$stk_xfr_act_tm);
			list.add(HdrR.$ac_dt);
			list.add(HdrR.$can_ac_dt_for_input);
			list.add(HdrR.$can_ac_dt);
			list.add(HdrR.$ac_dt_after_srch);
		}
		else if (cont == getDtlGiL() || cont == getDtlGrL()) {
			list.add(DtlGiR.$stk_xfr_act_d_no);
			list.add(DtlGiR.$trd_unit_qty);
			list.add(DtlGiR.$base_unit_qty);
			if (isSame(type, NOT_INHERIT_TYPE_COPY_ROW)) {
				list.add(DtlGiR.$disp_seq);
			}
		}
		return list;
	}

	/**
	 * 行追加実施後の後処理を実施する
	 * @param row　追加行
	 */
	protected void _afterAddDtlRow(DtlGiR row) {
		if (getDtlGiL().size() > 0) {
			DtlGiR src = getDtlGiL().get(0);
			copyValue(row, src);
		}
		row.setStatus(Status.GUICREATE);
	}

	protected void afterAddDtlGiRow(DtlGiR row) {
		_afterAddDtlRow(row);
	}

	protected void afterAddDtlGrRow(DtlGiR row) {
		_afterAddDtlRow(row);
	}

	// ------------オープン時の処理実装------------

	@Override
	protected void setupParts() {
		super.setupParts();
		Hdr_ac_dt_p_PPanel.setRelateBeans(Hdr_stk_xfr_act_dt);
		Hdr_usr_dpt_p_PPanel.setRelateBeans(Hdr_ac_dt);

		DtlGi_lot_no_p_PPanel.setRelateBeans(columnDtlGi_itm_cd, columnDtlGi_itm_sub1,
				columnDtlGi_itm_sub2, columnDtlGi_itm_sub3, columnDtlGi_lot_mng_typ,
				columnDtlGi_sublot_mng_typ);
		DtlGi_str_ln_p_PPanel.setRelateBeans(Hdr_loc_cd, Hdr_str_ln_tgt_flg);
		DtlGi_trd_unit_qty_p_PPanel.setRelateBeans(columnDtlGi_itm_cd,
				columnDtlGi_itm_sub1, columnDtlGi_itm_sub2, columnDtlGi_itm_sub3,
				columnDtlGi_trd_unit_cd, columnDtlGi_trd_unit_dec_place,
				columnDtlGi_trd_unit_rnd_typ, columnDtlGi_trd_unit_conv_base_qty,
				columnDtlGi_trd_unit_conv_qty, columnDtlGi_base_unit_cd);
		DtlGi_base_unit_qty_p_PPanel.setRelateBeans(columnDtlGi_base_unit_cd,
				columnDtlGi_base_unit_dec_place, columnDtlGi_base_unit_conv_rnd_typ,
				columnDtlGi_trd_unit_qty, columnDtlGi_trd_unit_conv_base_qty,
				columnDtlGi_trd_unit_conv_qty);
		DtlGi_std_cont_qty_p_PPanel.setRelateBeans(columnDtlGi_cont_fctr_flg,
				columnDtlGi_base_unit_qty, columnDtlGi_std_cont_fctr, null,
				columnDtlGi_cont_fctr_dec_place, columnDtlGi_cont_fctr_rnd_typ);
		DtlGi_act_cont_qty_p_PPanel.setRelateBeans(columnDtlGi_cont_fctr_flg,
				columnDtlGi_base_unit_qty, columnDtlGi_std_cont_fctr,
				columnDtlGi_act_cont_fctr, columnDtlGi_cont_fctr_dec_place,
				columnDtlGi_cont_fctr_rnd_typ);
		DtlGi_sno_p_PPanel.setRelateBeans(columnDtlGi_itm_cd, columnDtlGi_itm_sub1,
				columnDtlGi_itm_sub2, columnDtlGi_itm_sub3, columnDtlGi_sno1_mng_typ,
				columnDtlGi_sno2_mng_typ, columnDtlGi_sno3_mng_typ,
				columnDtlGi_sno4_mng_typ);
		DtlGi_stk_bp_p_PPanel.setRelateBeans(columnDtlGi_stk_id_typ);
		DtlGi_stk_arrv_bp_p_PPanel.setRelateBeans(Hdr_loc_cd, Hdr_sppl_cd);
		DtlGi_ver_p_PPanel.setRelateBeans(columnDtlGi_itm_cd, columnDtlGi_itm_sub1,
				columnDtlGi_itm_sub2, columnDtlGi_itm_sub3, null, columnDtlGi_ver_flg,
				columnDtlGi_crt_lot_flg);

		DtlGr_itm_p_PPanel.setRelateBeans(columnDtlGr_sundry_itm_flg);
		DtlGr_lot_no_p_PPanel.setRelateBeans(columnDtlGr_itm_cd, columnDtlGr_itm_sub1,
				columnDtlGr_itm_sub2, columnDtlGr_itm_sub3, columnDtlGr_lot_mng_typ,
				columnDtlGr_lot_no_typ, columnDtlGr_sublot_mng_typ,
				columnDtlGr_sublot_no_typ, true, columnDtlGr_not_new_lot_flg);
		DtlGr_str_ln_p_PPanel.setRelateBeans(Hdr_loc_cd, Hdr_str_ln_tgt_flg);
		DtlGr_trd_unit_qty_p_PPanel.setRelateBeans(columnDtlGr_itm_cd,
				columnDtlGr_itm_sub1, columnDtlGr_itm_sub2, columnDtlGr_itm_sub3,
				columnDtlGr_trd_unit_cd, columnDtlGr_trd_unit_dec_place,
				columnDtlGr_trd_unit_rnd_typ, columnDtlGr_trd_unit_conv_base_qty,
				columnDtlGr_trd_unit_conv_qty, columnDtlGr_base_unit_cd);
		DtlGr_base_unit_qty_p_PPanel.setRelateBeans(columnDtlGr_base_unit_cd,
				columnDtlGr_base_unit_dec_place, columnDtlGr_base_unit_conv_rnd_typ,
				columnDtlGr_trd_unit_qty, columnDtlGr_trd_unit_conv_base_qty,
				columnDtlGr_trd_unit_conv_qty);
		DtlGr_std_cont_qty_p_PPanel.setRelateBeans(columnDtlGr_cont_fctr_flg,
				columnDtlGr_base_unit_qty, columnDtlGr_std_cont_fctr, null,
				columnDtlGr_cont_fctr_dec_place, columnDtlGr_cont_fctr_rnd_typ);
		DtlGr_act_cont_qty_p_PPanel.setRelateBeans(columnDtlGr_cont_fctr_flg,
				columnDtlGr_base_unit_qty, null,
				columnDtlGr_act_cont_fctr, columnDtlGr_cont_fctr_dec_place,
				columnDtlGr_cont_fctr_rnd_typ);
		DtlGr_sno_p_PPanel.setRelateBeans(columnDtlGr_itm_cd, columnDtlGr_itm_sub1,
				columnDtlGr_itm_sub2, columnDtlGr_itm_sub3, columnDtlGr_sno1_mng_typ,
				columnDtlGr_sno2_mng_typ, columnDtlGr_sno3_mng_typ,
				columnDtlGr_sno4_mng_typ);
		DtlGr_stk_bp_p_PPanel.setRelateBeans(columnDtlGr_stk_id_typ);
		DtlGr_stk_arrv_bp_p_PPanel.setRelateBeans(Hdr_loc_cd, Hdr_sppl_cd);
		DtlGr_ver_p_PPanel.setRelateBeans(columnDtlGr_itm_cd, columnDtlGr_itm_sub1,
				columnDtlGr_itm_sub2, columnDtlGr_itm_sub3, null, columnDtlGr_ver_flg,
				columnDtlGr_crt_lot_flg);
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		HdrPanel.focusFirstComponent();
	}

	@Override
	protected void opePanelFillSpace() {
		//　フィルスペースしない
	}

	@Override
	protected void valueInit() {
		super.valueInit();

		setDate();
	}

	protected void setDate() {
		setValueEx(Hdr_stk_xfr_act_dt, getToday());
		setValueEx(Hdr_ac_dt, getToday());
	}

	@Override
	public MCList getDtlGi_stk_id_typ(MCRow row, MCEventInfo info) {
		MCList<MCRow> list = MCList.create(MCRow.class);

		for (MCRow r : (MCList<MCRow>) super.getDtlGi_stk_id_typ(row, info)) {
			if (!MSC_STK_ID_TYP.isSLF_SUPPRT(r.getStringNE(DtlGiR.$stk_id_typ))) {
				list.add(r);
			}
		}
		return list;
	}

	// ------------フォーカス設定、入力制御-------------------
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setBtnMode();
		HdrPanel.focusFirstComponent();
		setDate();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setBtnMode();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setBtnMode();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		Cnd_ope_INS.mcRequestFocus();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		CndPanel.focusFirstComponent();
	}

	protected void setBtnMode() {
		String status = getStatus();
		if (isSame(status, INS)) {
			if (isNull(getHdrR().trd_ptn_typ())) {
				Btn_radd_gi.setMode(MCMode.DISABLE);
				Btn_rdel_gi.setMode(MCMode.DISABLE);
				Btn_rcopy_gi.setMode(MCMode.DISABLE);
				Btn_radd_gr.setMode(MCMode.DISABLE);
				Btn_rdel_gr.setMode(MCMode.DISABLE);
				Btn_rcopy_gr.setMode(MCMode.DISABLE);

				Btn_top_gi.setMode(MCMode.DISABLE);
				Btn_up_gi.setMode(MCMode.DISABLE);
				Btn_down_gi.setMode(MCMode.DISABLE);
				Btn_bottom_gi.setMode(MCMode.DISABLE);
				Btn_top_gr.setMode(MCMode.DISABLE);
				Btn_up_gr.setMode(MCMode.DISABLE);
				Btn_down_gr.setMode(MCMode.DISABLE);
				Btn_bottom_gr.setMode(MCMode.DISABLE);
			}
			else {
				Btn_radd_gi.setMode(getDefaultMode(Btn_radd_gi));
				Btn_rdel_gi.setMode(getDefaultMode(Btn_rdel_gi));
				Btn_rcopy_gi.setMode(getDefaultMode(Btn_rcopy_gi));
				Btn_radd_gr.setMode(getDefaultMode(Btn_radd_gr));
				Btn_rdel_gr.setMode(getDefaultMode(Btn_rdel_gr));
				Btn_rcopy_gr.setMode(getDefaultMode(Btn_rcopy_gr));

				Btn_top_gi.setMode(getDefaultMode(Btn_top_gi));
				Btn_up_gi.setMode(getDefaultMode(Btn_up_gi));
				Btn_down_gi.setMode(getDefaultMode(Btn_down_gi));
				Btn_bottom_gi.setMode(getDefaultMode(Btn_bottom_gi));
				Btn_top_gr.setMode(getDefaultMode(Btn_top_gr));
				Btn_up_gr.setMode(getDefaultMode(Btn_up_gr));
				Btn_down_gr.setMode(getDefaultMode(Btn_down_gr));
				Btn_bottom_gr.setMode(getDefaultMode(Btn_bottom_gr));
			}
		}

		// 品目構成の画面遷移ボタン
		if (MAC_TRD_PTN_TYP.isXFR_ITM(getHdrR().trd_ptn_typ())) {
			Btn_open_MSBEP2540_gr.setMode(getDefaultMode(Btn_rdel_gr));
			Btn_open_MSBEP2540_gi.setMode(getDefaultMode(Btn_rdel_gi));
		}
		else {
			Btn_open_MSBEP2540_gr.setMode(MCMode.DISABLE);
			Btn_open_MSBEP2540_gi.setMode(MCMode.DISABLE);
		}

		//　更新・削除ボタンのモード制御
		setInsUpdDelBtnMode();
	}

	protected void setInsUpdDelBtnMode() {
		String status = getStatus();
		if (isSame(status, INS)) {
			Btn_ins_itm.setMode(getItmMode());
			Btn_ins_lot_sno.setMode(getLotSnoMode());
			Btn_ins_grd.setMode(getGdMode());
			Btn_ins_pack.setMode(getPackMode());
		}
		else if (isSame(status, UPD)) {
			Btn_upd_itm.setMode(getItmMode());
			Btn_upd_lot_sno.setMode(getLotSnoMode());
			Btn_upd_grd.setMode(getGdMode());
			Btn_upd_pack.setMode(getPackMode());
		}
		else if (isSame(status, DEL)) {
			Btn_del_itm.setMode(getItmMode());
			Btn_del_lot_sno.setMode(getLotSnoMode());
			Btn_del_grd.setMode(getGdMode());
			Btn_del_pack.setMode(getPackMode());
		}
	}

	protected MCMode getItmMode() {
		if (isNull(getHdrR().trd_ptn_typ())) {
			return MCMode.DISABLE;
		}
		if (MAC_TRD_PTN_TYP.isXFR_ITM(getHdrR().trd_ptn_typ())) {
			return MCMode.ENABLE;
		}
		return MCMode.INVISIBLE;
	}

	protected MCMode getLotSnoMode() {
		if (isNull(getHdrR().trd_ptn_typ())) {
			return MCMode.DISABLE;
		}
		if (MAC_TRD_PTN_TYP.isXFR_LOT_SNO(getHdrR().trd_ptn_typ())) {
			return MCMode.ENABLE;
		}
		return MCMode.INVISIBLE;
	}

	protected MCMode getGdMode() {
		if (isNull(getHdrR().trd_ptn_typ())) {
			return MCMode.DISABLE;
		}
		if (MAC_TRD_PTN_TYP.isXFR_GRD(getHdrR().trd_ptn_typ())) {
			return MCMode.ENABLE;
		}
		return MCMode.INVISIBLE;
	}

	protected MCMode getPackMode() {
		if (isNull(getHdrR().trd_ptn_typ())) {
			return MCMode.DISABLE;
		}
		if (MAC_TRD_PTN_TYP.isXFR_PACK(getHdrR().trd_ptn_typ())) {
			return MCMode.ENABLE;
		}
		return MCMode.INVISIBLE;
	}

	// ------------CellConfig------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlGiTable.setCellConfig(createDtlConf());
		DtlGrTable.setCellConfig(createDtlConf());
	}

	protected MCCellConfig createDtlConf() {
		return new DtlConf();
	}

	public class DtlConf extends MAUDP_CellConfig {
		@Override
		@SuppressWarnings("rawtypes")
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (isSame(getStatus(), INS) || isSame(getStatus(), UPD)) {
				return getPriorModeIns(index, column, table);
			}
			return super.getPriorMode(index, column, table);
		}

		public MCMode getPriorModeIns(int index, MCColumnConfig column, MCTable table) {
			DtlGiR dtl = (DtlGiR) table.getBaseTable().getList().get(index);
			String trdPtnTyp = getHdrR().trd_ptn_typ();

			// 出庫情報
			if (column.getBaseTable() == DtlGiTable) {
				// 1行目
				if (index == 0) {
					if (MAC_TRD_PTN_TYP.isXFR_ITM(trdPtnTyp)) {
						// 品目振替の場合、在庫識別区分が入力不可
						if (column == columnDtlGi_stk_id_typ) {
							return MCMode.READ_ONLY;
						}
					}
					
					if (MAC_TRD_PTN_TYP.isXFR_PACK(trdPtnTyp)) {
						// 確定ＮＯ区分がNULLまたはなしのとき、確定NOは入力不可
						if (column == columnDtlGi_fix_no) {
							if (isNull(dtl.fix_no_typ())
									|| MSC_FIX_NO_TYP.isNON(dtl.fix_no_typ())) {
								return MCMode.READ_ONLY;
							}
							else {
								return MCMode.REQUIRED;
							}
						}				
						if (column == columnDtlGi_fix_no_typ) {
							return MCMode.REQUIRED;
						}
					}
					else {
						// 確定NOは荷姿振替の1行目以外入力不可
						if (column == columnDtlGi_fix_no_typ
								|| column == columnDtlGi_fix_no) {
							return MCMode.READ_ONLY;
						}
					}
					
					if (column == columnDtlGi_stk_arrv_bp_cd) {
						// 自社場所かつ自社在庫かつ確定ＮＯなしの場合は入力不可
						if (isNull(getHdrR().sppl_cd())
								&& MSC_STK_ID_TYP.isCOSTK(dtl.stk_id_typ())
								&& (isNull(dtl.fix_no_typ()) || MSC_FIX_NO_TYP.isNON(dtl.fix_no_typ()))) {
							return MCMode.READ_ONLY;
						}
					}
				}
				// 2行目以降
				else {
					if (isReadOnly(column, _GI)
							&& (!_editable_flg || (column != columnDtlGi_itm_cd
							&& column != columnDtlGi_trd_unit_cd
							&& column != columnDtlGi_itm_sub1
							&& column != columnDtlGi_itm_sub2
							&& column != columnDtlGi_itm_sub3))) {
						return MCMode.READ_ONLY;
					}
				}
			}

			// 入庫情報
			if (column.getBaseTable() == DtlGrTable) {
				if (isReadOnly(column, _GR)) {
					return MCMode.READ_ONLY;
				}

				// 版管理対象はロット作成しない
				if (column == columnDtlGr_crt_lot_flg) {
					if (dtl.ver_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}

			return super.getPriorMode(index, column, table);
		}
	}

	
	protected static final String _GI = "GI";
	protected static final String _GR = "GR";

	protected MCColumnConfig[] getROCols(String mode) {
		String trdPtnTyp = getHdrR().trd_ptn_typ();
		MCColumnConfig[] cols = new MCColumnConfig[]{};

		if (isSame(mode, _GI)) {
			if (MAC_TRD_PTN_TYP.isXFR_ITM(trdPtnTyp)) {
				cols = roCols_itm_gi();
			}
			else if (MAC_TRD_PTN_TYP.isXFR_LOT_SNO(trdPtnTyp)) {
				cols = roCols_lot_gi();
			}
			else if (MAC_TRD_PTN_TYP.isXFR_GRD(trdPtnTyp)) {
				cols = roCols_gd_gi();
			}
			else if (MAC_TRD_PTN_TYP.isXFR_PACK(trdPtnTyp)) {
				cols = roCols_pack_gi();
			}
		}
		else if (isSame(mode, _GR)) {
			if (MAC_TRD_PTN_TYP.isXFR_ITM(trdPtnTyp)) {
				cols = roCols_itm_gr();
			}
			else if (MAC_TRD_PTN_TYP.isXFR_LOT_SNO(trdPtnTyp)) {
				cols = roCols_lot_gr();
			}
			else if (MAC_TRD_PTN_TYP.isXFR_GRD(trdPtnTyp)) {
				cols = roCols_gd_gr();
			}
			else if (MAC_TRD_PTN_TYP.isXFR_PACK(trdPtnTyp)) {
				cols = roCols_pack_gr();
			}
		}
		return cols;
	}
	protected boolean isReadOnly(MCColumnConfig column, String mode) {
		for (MCColumnConfig col : getROCols(mode)) {
			if (col == column) {
				return true;
			}
		}
		return false;
	}
	
	protected MCColumnConfig[] roCols_itm_gi() {
		return new MCColumnConfig[] {
				columnDtlGi_str_ln_cd,
				columnDtlGi_str_ln_cd_none_flg,
				columnDtlGi_quality_typ,
				columnDtlGi_gd_cd,
				columnDtlGi_stk_id_typ,
				columnDtlGi_fix_no_typ,
				columnDtlGi_fix_no,
				columnDtlGi_stk_arrv_bp_cd
		};
	}
	protected MCColumnConfig[] roCols_lot_gi() {
		return new MCColumnConfig[] {
				columnDtlGi_itm_cd,
				columnDtlGi_itm_sub1,
				columnDtlGi_itm_sub2,
				columnDtlGi_itm_sub3,
				columnDtlGi_trd_unit_cd,
				columnDtlGi_str_ln_cd,
				columnDtlGi_str_ln_cd_none_flg,
				columnDtlGi_quality_typ,
				columnDtlGi_gd_cd,
				columnDtlGi_stk_id_typ,
				columnDtlGi_stk_bp_cd,
				columnDtlGi_fix_no_typ,
				columnDtlGi_fix_no,
				columnDtlGi_stk_arrv_bp_cd
		};
	}
	protected MCColumnConfig[] roCols_gd_gi() {
		return new MCColumnConfig[] {
				columnDtlGi_itm_cd,
				columnDtlGi_itm_sub1,
				columnDtlGi_itm_sub2,
				columnDtlGi_itm_sub3,
				columnDtlGi_lot_no,
				columnDtlGi_sublot_no,
				columnDtlGi_trd_unit_cd,
				columnDtlGi_str_ln_cd,
				columnDtlGi_str_ln_cd_none_flg,
				columnDtlGi_sno1,
				columnDtlGi_sno2,
				columnDtlGi_sno3,
				columnDtlGi_sno4,
				columnDtlGi_stk_id_typ,
				columnDtlGi_stk_bp_cd,
				columnDtlGi_fix_no_typ,
				columnDtlGi_fix_no,
				columnDtlGi_stk_arrv_bp_cd
		};
	}
	protected MCColumnConfig[] roCols_pack_gi() {
		return new MCColumnConfig[] {
				columnDtlGi_itm_cd,
				columnDtlGi_itm_sub1,
				columnDtlGi_itm_sub2,
				columnDtlGi_itm_sub3,
				columnDtlGi_lot_no,
				columnDtlGi_sublot_no,
				columnDtlGi_str_ln_cd,
				columnDtlGi_str_ln_cd_none_flg,
				columnDtlGi_quality_typ,
				columnDtlGi_gd_cd,
				columnDtlGi_sno1,
				columnDtlGi_sno2,
				columnDtlGi_sno3,
				columnDtlGi_sno4,
				columnDtlGi_stk_id_typ,
				columnDtlGi_stk_bp_cd,
				columnDtlGi_fix_no_typ,
				columnDtlGi_fix_no,
				columnDtlGi_stk_arrv_bp_cd
		};
	}
	protected MCColumnConfig[] roCols_itm_gr() {
		// 良品区分、格付、手配ＮＯ、在庫識別区分、在庫取引先、在庫着荷先
		return new MCColumnConfig[] {
				columnDtlGr_str_ln_cd,
				columnDtlGr_str_ln_cd_none_flg,
				columnDtlGr_quality_typ,
				columnDtlGr_gd_cd,
				columnDtlGr_stk_id_typ,
				columnDtlGr_stk_bp_cd,
				columnDtlGr_fix_no_typ,
				columnDtlGr_fix_no,
				columnDtlGr_stk_arrv_bp_cd
		};
	}
	protected MCColumnConfig[] roCols_lot_gr() {
		// 品目、単位、良品区分、格付、在庫識別区分、在庫取引先、在庫着荷先
		return new MCColumnConfig[] {
				columnDtlGr_itm_cd,
				columnDtlGr_itm_sub1,
				columnDtlGr_itm_sub2,
				columnDtlGr_itm_sub3,
				columnDtlGr_trd_unit_cd,
				columnDtlGr_str_ln_cd,
				columnDtlGr_str_ln_cd_none_flg,
				columnDtlGr_quality_typ,
				columnDtlGr_gd_cd,
				columnDtlGr_stk_id_typ,
				columnDtlGr_stk_bp_cd,
				columnDtlGr_fix_no_typ,
				columnDtlGr_fix_no,
				columnDtlGr_stk_arrv_bp_cd
		};
	}
	protected MCColumnConfig[] roCols_gd_gr() {
		// 品目、ロット、単位、手配ＮＯ、在庫識別区分、在庫取引先、在庫着荷先
		return new MCColumnConfig[] {
				columnDtlGr_itm_cd,
				columnDtlGr_itm_sub1,
				columnDtlGr_itm_sub2,
				columnDtlGr_itm_sub3,
				columnDtlGr_lot_no,
				columnDtlGr_sublot_no,
				columnDtlGr_crt_lot_flg,
				columnDtlGr_trd_unit_cd,
				columnDtlGr_str_ln_cd,
				columnDtlGr_str_ln_cd_none_flg,
				columnDtlGr_sno1,
				columnDtlGr_sno2,
				columnDtlGr_sno3,
				columnDtlGr_sno4,
				columnDtlGr_stk_id_typ,
				columnDtlGr_stk_bp_cd,
				columnDtlGr_fix_no_typ,
				columnDtlGr_fix_no,
				columnDtlGr_stk_arrv_bp_cd
		};
	}
	protected MCColumnConfig[] roCols_pack_gr() {
		// 品目、ロット、良品区分、格付、手配ＮＯ、在庫識別区分、在庫取引先、在庫着荷先
		return new MCColumnConfig[] {
				columnDtlGr_itm_cd,
				columnDtlGr_itm_sub1,
				columnDtlGr_itm_sub2,
				columnDtlGr_itm_sub3,
				columnDtlGr_lot_no,
				columnDtlGr_sublot_no,
				columnDtlGr_crt_lot_flg,
				columnDtlGr_str_ln_cd,
				columnDtlGr_str_ln_cd_none_flg,
				columnDtlGr_quality_typ,
				columnDtlGr_gd_cd,
				columnDtlGr_sno1,
				columnDtlGr_sno2,
				columnDtlGr_sno3,
				columnDtlGr_sno4,
				columnDtlGr_stk_id_typ,
				columnDtlGr_stk_bp_cd,
				columnDtlGr_fix_no_typ,
				columnDtlGr_fix_no,
				columnDtlGr_stk_arrv_bp_cd
		};
	}

	// ------------イベント処理-----------

	@Override
	protected void listenerInit() {
		super.listenerInit();
		columnDtlGi_itm_cd.addLCListener(this);
		columnDtlGr_itm_cd.addLCListener(this);
		for (MCColumnConfig column : DtlGiTable.getColumnConfigs()) {
			if (column.getColumnType() == MCColumnType.CHECK) {
				column.addNCListener(this);
			}
			else {
				column.addLCListener(this);
			}
		}
		
		_sno1VCListeners =  columnDtlGi_sno1.getVCListeners();
		_sno2VCListeners =  columnDtlGi_sno2.getVCListeners();
		_sno3VCListeners =  columnDtlGi_sno3.getVCListeners();
		_sno4VCListeners =  columnDtlGi_sno4.getVCListeners();
		columnDtlGi_sno1.setVCListener(this);
		columnDtlGi_sno2.setVCListener(this);
		columnDtlGi_sno3.setVCListener(this);
		columnDtlGi_sno4.setVCListener(this);
	}

	MCVCListener[] _sno1VCListeners;
	MCVCListener[] _sno2VCListeners;
	MCVCListener[] _sno3VCListeners;
	MCVCListener[] _sno4VCListeners;

	@Override
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {

		DtlGiR r = DtlGiTable.getRow(info.getEventIndex());
		if (vc == columnDtlGi_sno1) {
			return columnDtlGi_sno_doVCEvent(vc, info, r.sno1_mng_typ(), _sno1VCListeners);
		}
		if (vc == columnDtlGi_sno2) {
			return columnDtlGi_sno_doVCEvent(vc, info, r.sno2_mng_typ(), _sno2VCListeners);
		}
		if (vc == columnDtlGi_sno3) {
			return columnDtlGi_sno_doVCEvent(vc, info, r.sno3_mng_typ(), _sno3VCListeners);
		}
		if (vc == columnDtlGi_sno4) {
			return columnDtlGi_sno_doVCEvent(vc, info, r.sno4_mng_typ(), _sno4VCListeners);
		}
		return super.doVCEvent(vc, info);
	}

	protected boolean columnDtlGi_sno_doVCEvent (MCVCBeans vc, MCEventInfo info, String snoMngTyp, MCVCListener[] snoVCListeners) {
		// 手配ＮＯにNULL文字を入力できるようにする
		if (MAC_TRD_PTN_TYP.isXFR_LOT_SNO(getHdrR().trd_ptn_typ()) && MAC_SNO_MNG_TYP.isMNG_REQ(snoMngTyp)) {
			return true;
		}
		else {
			// 退避していたVCListenersを実行する
			for (MCVCListener snoVCListener :snoVCListeners) {
				if (!snoVCListener.doVCEvent(vc, info)) {
					return false;
				}
			}
			return true;
		}
	}
	
	@Override
	public MCList getDtlGi_lot_no_p_PPanel_columnLotNo_lot_no(MCRow row, MCEventInfo info) {
		MCList<MCRow> l = super.getDtlGi_lot_no_p_PPanel_columnLotNo_lot_no(row, info);
		// ロットＮＯにNULL文字を入力できるようにする
		if (MAC_TRD_PTN_TYP.isXFR_LOT_SNO(getHdrR().trd_ptn_typ())) {
			MCRow r = l.add();
			r.setStringNE("lot_no", MAC_STR.NULL_VAL.value());
		}
		return l;
	}

	@Override
	public MCList getDtlGi_lot_no_p_PPanel_columnLotNo_sublot_no(MCRow row, MCEventInfo info) {
		MCList<MCRow> l = super.getDtlGi_lot_no_p_PPanel_columnLotNo_sublot_no(row, info);
		// サブロットＮＯにNULL文字を入力できるようにする
		if (MAC_TRD_PTN_TYP.isXFR_LOT_SNO(getHdrR().trd_ptn_typ())) {
			if (isNull(l)) {
				MCRow r = l.add();
				r.setStringNE("sublot_no", MAC_STR.NULL_VAL.value());
				r.setStringNE("_view", MAC_STR.NULL_VAL.value());
			}
		}
		return l;
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnDtlGi_itm_cd) doDtlGi_itm_cd_LC(info);
		if (lc == columnDtlGr_itm_cd) doDtlGr_itm_cd_LC(info);
		if (lc == columnDtlGi_itm_sub1
				|| lc == columnDtlGi_itm_sub2
				|| lc == columnDtlGi_itm_sub3) {
			doDtlGi_itm_LC(info);
		}
		if (lc instanceof MCColumnConfig) {
			MCColumnConfig column = (MCColumnConfig) lc;
			if (column.getBaseTable() == DtlGiTable) {
				if (column.getColumnType() != MCColumnType.CHECK) {
					doDtlGi_valueChanged(info);
				}
			}
		}
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc instanceof MCColumnConfig) {
			MCColumnConfig column = (MCColumnConfig) nc;
			if (column.getBaseTable() == DtlGiTable) {
				if (column.getColumnType() == MCColumnType.CHECK) {
					doDtlGi_valueChanged(info);
				}
			}
		}
	}

	public void doDtlGi_valueChanged(MCEventInfo info) {
		int index = info.getEventIndex();
		// 1行目以外は何もしない
		if (index != 0) return;

		DtlGiR src = getDtlGiL().get(0);
		for (int i = 1 ; i < getDtlGiL().size() ; i++) {
			DtlGiR row = getDtlGiL().get(i);
			copyValue(row, src);
		}
		for (DtlGiR row : getDtlGrL()) {
			copyValue(row, src);
		}
	}

	protected void copyValue(DtlGiR dest, DtlGiR src) {
		String trdPtnTyp = getHdrR().trd_ptn_typ();
		for (String colname : dest.getColumnPathArray()) {
			if (!isNotCopyCol(trdPtnTyp, colname, dest)) {
				if (isSame(colname, DtlGiR.$itm_nm) && dest.sundry_itm_flg()) {
					continue;
				}
				dest.setValue(colname, src.getValue(colname));
			}
		}
	}

	protected boolean isNotCopyCol(String trdPtnTyp, String colname, DtlGiR row) {
		boolean flg = false;
		for (String nocopy : getNotCopyColumn(trdPtnTyp)) {
			if (isSame(colname, nocopy)) {
				flg = true;
				break;
			}
		}
		return flg;
	}

	/**
	 * 在庫振替区分ごとの明細のコピー対象外カラム
	 */
	protected String[] getNotCopyColumn(String trdPtnTyp) {
		if (MAC_TRD_PTN_TYP.isXFR_ITM(trdPtnTyp)) {
			return notCopyColItm();
		}
		else if (MAC_TRD_PTN_TYP.isXFR_LOT_SNO(trdPtnTyp)) {
			return notCopyColLotSno();
		}
		else if (MAC_TRD_PTN_TYP.isXFR_GRD(trdPtnTyp)) {
			return notCopyColGrd();
		}
		else if (MAC_TRD_PTN_TYP.isXFR_PACK(trdPtnTyp)) {
			return notCopyColPack();
		}
		return _editableColNull;
	}

	/** 品目振替の時のコピー対象外カラム */
	protected String[] notCopyColItm() {
		List<String> list = new ArrayList<String>();
		list.add(DtlGiR.$itm_cd);
		list.add(DtlGiR.$itm_sub1);
		list.add(DtlGiR.$itm_sub2);
		list.add(DtlGiR.$itm_sub3);
		list.add(DtlGiR.$itm_nm);
		list.add(DtlGiR.$not_new_lot_flg);
		list.add(DtlGiR.$sundry_itm_flg);
		list.add(DtlGiR.$lot_mng_typ);
		list.add(DtlGiR.$lot_no_typ);
		list.add(DtlGiR.$lot_no_ptn_cd);
		list.add(DtlGiR.$sublot_mng_typ);
		list.add(DtlGiR.$sublot_no_typ);
		list.add(DtlGiR.$sublot_no_ptn_cd);
		list.add(DtlGiR.$sno1_mng_typ);
		list.add(DtlGiR.$sno2_mng_typ);
		list.add(DtlGiR.$sno3_mng_typ);
		list.add(DtlGiR.$sno4_mng_typ);
		list.add(DtlGiR.$cont_fctr_flg);
		list.add(DtlGiR.$stk_mng_typ);
		list.add(DtlGiR.$ver_flg);
		list.add(DtlGiR.$ver_no);
		list.add(DtlGiR.$crt_lot_flg);
		list.add(DtlGiR.$lot_no);
		list.add(DtlGiR.$sublot_no);
		list.add(DtlGiR.$sno1);
		list.add(DtlGiR.$sno2);
		list.add(DtlGiR.$sno3);
		list.add(DtlGiR.$sno4);
		list.add(DtlGiR.$wrk_no);
		list.add(DtlGiR.$wrk_nm);
		list.add(DtlGiR.$trd_unit_cd);
		list.add(DtlGiR.$trd_unit_nm);
		list.add(DtlGiR.$trd_unit_dec_place);
		list.add(DtlGiR.$trd_unit_conv_qty);
		list.add(DtlGiR.$trd_unit_conv_base_qty);
		list.add(DtlGiR.$base_unit_cd);
		list.add(DtlGiR.$base_unit_nm);
		list.add(DtlGiR.$base_unit_dec_place);
		list.add(DtlGiR.$base_unit_conv_rnd_typ);
		list.add(DtlGiR.$std_cont_fctr_qty);
		list.add(DtlGiR.$act_cont_fctr_qty);
		list.add(DtlGiR.$std_cont_fctr);
		list.add(DtlGiR.$act_cont_fctr);
		list.add(DtlGiR.$cont_fctr_unit_cd);
		list.add(DtlGiR.$cont_fctr_unit_nm);
		list.add(DtlGiR.$cont_fctr_rnd_typ);
		list.add(DtlGiR.$cont_fctr_dec_place);

		list.addAll(notCopyColCommon());
		return list.toArray(new String[0]);
	}

	/** ロット・手配ＮＯ振替の時の変更可能カラム */
	protected String[] notCopyColLotSno() {
		List<String> list = new ArrayList<String>();
		list.add(DtlGiR.$ver_no);
		list.add(DtlGiR.$crt_lot_flg);
		list.add(DtlGiR.$lot_no);
		list.add(DtlGiR.$sublot_no);
		list.add(DtlGiR.$sno1);
		list.add(DtlGiR.$sno2);
		list.add(DtlGiR.$sno3);
		list.add(DtlGiR.$sno4);
		list.add(DtlGiR.$wrk_no);
		list.add(DtlGiR.$wrk_nm);

		list.addAll(notCopyColCommon());
		return list.toArray(new String[0]);
	}

	/** 格付・良品区分振替の時の変更可能カラム */
	protected String[] notCopyColGrd() {
		List<String> list = new ArrayList<String>();
		list.add(DtlGiR.$quality_typ);
		list.add(DtlGiR.$quality_typ_nm);
		list.add(DtlGiR.$gd_cd);
		list.add(DtlGiR.$gd_nm);

		list.addAll(notCopyColCommon());
		return list.toArray(new String[0]);
	}

	/** 荷姿振替の時の変更可能カラム */
	protected String[] notCopyColPack() {
		List<String> list = new ArrayList<String>();
		list.add(DtlGiR.$trd_unit_cd);
		list.add(DtlGiR.$trd_unit_nm);
		list.add(DtlGiR.$trd_unit_dec_place);
		list.add(DtlGiR.$trd_unit_conv_qty);
		list.add(DtlGiR.$trd_unit_conv_base_qty);

		list.addAll(notCopyColCommon());
		return list.toArray(new String[0]);
	}

	/** 共通のコピー対象外カラム */
	protected List<String> notCopyColCommon() {
		List<String> list = new ArrayList<String>();
		list.add(DtlGiR.$trd_unit_qty);
		list.add(DtlGiR.$base_unit_qty);
		list.add(DtlGiR.$intr_d_rmrks);
		list.add(DtlGiR.$trd_d_rmrks);
		list.add(DtlGiR.$sub_char1);
		list.add(DtlGiR.$sub_char2);
		list.add(DtlGiR.$sub_char3);
		list.add(DtlGiR.$stk_xfr_act_d_no);
		list.add(DtlGiR.$disp_seq);
		return list;
	}

	/** 該当なしの場合 */
	protected String[] _editableColNull = new String[0];

	/**
	 * 出庫情報行追加の後処理（構成展開画面用）
	 * @param list
	 */
	public void doDtlGi_afterAddList(MCList<DtlGiR> list) {
		if (isNull(list)) return;

		DtlGiR src = getDtlGiL().get(0);

		for (DtlGiR row : list) {
			copyValue(row, src);
		}

		// 基準になる行が変更された場合
		if (isSame(src, list.get(0))) {
			if (!isEditable(columnDtlGi_stk_id_typ, 0)) {
				setValueEx(columnDtlGi_stk_id_typ, 0, MSC_STK_ID_TYP.COSTK.value());
			}
			if (!isEditable(columnDtlGi_fix_no_typ, 0)) {
				setValueEx(columnDtlGi_fix_no_typ, 0, MSC_FIX_NO_TYP.NON.value());
			}
			// 入庫側に反映
			for (DtlGiR row : getDtlGrL()) {
				copyValue(row, src);
			}
		}
	}

	/**
	 * 入庫情報行追加の後処理（構成展開画面用）
	 * @param list
	 */
	public void doDtlGr_afterAddList(MCList<DtlGiR> list) {
		if (isNull(list)) return;

		if (getDtlGiL().isEmpty()) {
			return;
		}
		DtlGiR src = getDtlGiL().get(0);
		if (isNull(src)) return;

		for (DtlGiR row : list) {
			copyValue(row, src);
		}
	}

	@Override
	public boolean doHdr_trd_ptn_typ_VC(MCEventInfo info) {
		if (getDtlGiL().isStatusNone() && getDtlGrL().isStatusNone()) {
			return true;
		}
		if (confirmTableClear()) {
			return true;
		}
		else {
			Hdr_trd_ptn_typ.setRowToView();
			return false;
		}
	}

	@Override
	public void doHdr_trd_ptn_typ_LC(MCEventInfo info) {
		getDtlGiL().clear();
		getDtlGrL().clear();
		if (!isNull(getHdrR().trd_ptn_typ())) {
			DtlGiR r = DtlGiR.create();
			r.setStatus(Status.GUICREATE);
			getDtlGiL().add(r.clone());
			getDtlGrL().add(r.clone());
		}
		setBtnMode();

		super.doHdr_trd_ptn_typ_LC(info);
	}

	protected void doDtlGi_itm_cd_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		if (isNull(info.getNewValue())) {
			setValueEx(columnDtlGi_fix_no_typ, index, null);
			setValueEx(columnDtlGi_stk_id_typ, index, null);
		}
		else if (isNull(info.getOldValue())) {
			// 初期値設定
			if (!isEditable(columnDtlGi_fix_no_typ, index)) {
				setValueEx(columnDtlGi_fix_no_typ, index, MSC_FIX_NO_TYP.NON.value());
			}
			
			if (!isEditable(columnDtlGi_stk_id_typ, index)) {
				setValueEx(columnDtlGi_stk_id_typ, index, MSC_STK_ID_TYP.COSTK.value());
			}
		}
		doDtlGi_itm_LC(info);
	}

	protected void doDtlGr_itm_cd_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		if (isNull(info.getNewValue())) {
			setValueEx(columnDtlGr_fix_no_typ, index, null);
			setValueEx(columnDtlGr_stk_id_typ, index, null);
		}
		else if (isNull(info.getOldValue())) {
			// 初期値設定
			if (!isEditable(columnDtlGr_fix_no_typ, index)) {
				setValueEx(columnDtlGr_fix_no_typ, index, MSC_FIX_NO_TYP.NON.value());
			}
			
			if (!isEditable(columnDtlGr_stk_id_typ, index)) {
				setValueEx(columnDtlGr_stk_id_typ, index, MSC_STK_ID_TYP.COSTK.value());
			}
		}
	}

	protected void doDtlGi_itm_LC(MCEventInfo info) {
		String trdPtnTyp = getHdrR().trd_ptn_typ();

		if (MAC_TRD_PTN_TYP.isXFR_ITM(trdPtnTyp)) {
			// デフォルト
		}
		else {
			if (!isNull(info.getOldValue())
					&& !isSame(info.getNewValue(), info.getOldValue())) {
				for (DtlGiR row : getDtlGiL()) {
					row.trd_unit_cd(null);
					row.trd_unit_nm(null);
					row.trd_unit_qty_p().qty(null);
					row.trd_unit_conv_base_qty(null);
					row.trd_unit_conv_qty(null);
					row.trd_unit_dec_place(null);
					row.trd_unit_rnd_typ(null);
					row.base_unit_qty_p().qty(null);
					row.lot_no(null);
					row.sublot_no(null);
					row.ver_no(null);
					row.sno1(null);
					row.sno2(null);
					row.sno3(null);
					row.sno4(null);
				}
				for (DtlGiR row : getDtlGrL()) {
					row.trd_unit_cd(null);
					row.trd_unit_nm(null);
					row.trd_unit_qty_p().qty(null);
					row.trd_unit_conv_base_qty(null);
					row.trd_unit_conv_qty(null);
					row.trd_unit_dec_place(null);
					row.trd_unit_rnd_typ(null);
					row.base_unit_qty_p().qty(null);
					row.lot_no(null);
					row.sublot_no(null);
					row.ver_no(null);
					row.sno1(null);
					row.sno2(null);
					row.sno3(null);
					row.sno4(null);
				}
			}
		}
	}

	@Override
	public void doDtlGi_trd_unit_cd_LC(MCEventInfo info) {
		super.doDtlGi_trd_unit_cd_LC(info);

		String trdPtnTyp = getHdrR().trd_ptn_typ();
		if (MAC_TRD_PTN_TYP.isXFR_ITM(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isXFR_PACK(trdPtnTyp)) {
			// デフォルト
		}
		else {
			int idx = 0;
			for (DtlGiR row : getDtlGiL()) {
				idx++;
				if (idx == 1) continue;
				if (isNull(row.trd_unit_cd())) {
					row.trd_unit_qty_p().qty(null);
					row.base_unit_qty_p().qty(null);
					continue;
				}
				setQty(info, row);
				setBaseUnitQty(info, row);
			}
			for (DtlGiR row : getDtlGrL()) {
				if (isNull(row.trd_unit_cd())) {
					row.trd_unit_qty_p().qty(null);
					row.base_unit_qty_p().qty(null);
					continue;
				}
				setQty(info, row);
				setBaseUnitQty(info, row);
			}
		}
	}

	protected void setQty(MCEventInfo info, DtlGiR row) {
		String preUnit_cd = (String) info.getOldValue();

		if (isNull(row.trd_unit_qty_p().qty())) {
			return;
		}

		MCRow rowPre = getItmUnit(row.itm_cd(), row.itm_sub1(), row.itm_sub2(),
				row.itm_sub3(), preUnit_cd, (MCRootPanel) this);

		if (isNull(rowPre)) {
			return;
		}

		MCNumber ret = null;

		// 基準単位から基準単位以外の単位へ単位変換
		if (rowPre.getBoolean("base_unit_flg")) {
			ret = rvrsBaseUnitConv(
					row.base_unit_qty_p().qty(),
					row.trd_unit_conv_base_qty(),
					row.trd_unit_conv_qty(),
					row.trd_unit_dec_place(),
					row.trd_unit_rnd_typ());
		}
		else {
			// 基準単位以外の単位から基準単位へ単位変換
			if (isSame(row.trd_unit_cd(), row.base_unit_cd())) {
				ret = convToBaseUnit(
						row.trd_unit_qty_p().qty(),
						rowPre.getNumber("conv_base_qty"),
						rowPre.getNumber("conv_qty"),
						row.base_unit_dec_place(),
						row.base_unit_conv_rnd_typ());
			}
			// 基準単位以外の単位から、別の基準単位以外の単位へ変換
			else {
				ret = unitConv(
						row.trd_unit_qty_p().qty(),
						rowPre.getNumber("conv_base_qty"),
						rowPre.getNumber("conv_qty"),
						row.base_unit_dec_place(),
						row.base_unit_conv_rnd_typ(),
						row.trd_unit_conv_base_qty(),
						row.trd_unit_conv_qty(),
						row.trd_unit_dec_place(),
						row.trd_unit_rnd_typ());
			}
		}

		row.trd_unit_qty_p().qty(null);
		row.base_unit_qty_p().qty(null);

		row.trd_unit_qty_p().qty(ret);
	}

	protected void setBaseUnitQty(MCEventInfo info, DtlGiR row) {
		// 基準単位数量として初期化されていない場合は何もしない
		if (isNull(row.trd_unit_qty_p().qty())) {
			return;
		}

		MCNumber ret = null;
		ret = convToBaseUnit(
				row.trd_unit_qty_p().qty(),
				row.trd_unit_conv_base_qty(),
				row.trd_unit_conv_qty(),
				row.base_unit_dec_place(),
				row.base_unit_conv_rnd_typ());

		row.base_unit_qty_p().qty(ret);
	}

	@Override
	public void doDtlGi_fix_no_typ_LC(MCEventInfo info) {
		super.doDtlGi_fix_no_typ_LC(info);
		String newValue = (String) info.getNewValue();
		if (isNull(newValue) || MSC_FIX_NO_TYP.isNON(newValue)) {
			// 確定NOをクリア
			setValueEx(columnDtlGi_fix_no, info.getEventIndex(), null);
		}
		clearStkArrvBpCd(info);
	}

	@Override
	public void doDtlGi_stk_id_typ_LC(MCEventInfo info) {
		super.doDtlGi_stk_id_typ_LC(info);
		
		clearStkArrvBpCd(info);
	}
	
	protected void clearStkArrvBpCd(MCEventInfo info) {
		DtlGiR r = DtlGiTable.getRow(info.getEventIndex());
		if (isNull(getHdrR().sppl_cd())
				&& MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())
				&& (isNull(r.fix_no_typ()) || MSC_FIX_NO_TYP.isNON(r.fix_no_typ()))) {
			// 在庫着荷先をクリア
			setValueEx(columnDtlGi_stk_arrv_bp_cd, r.getGUIIndex(), null);
		}

	}

	// ------------IfOpePanel-------------------
	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getHdrR());
		ret.add(getDtlGiL());
		ret.add(getDtlGrL());
		return ret;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getCndR());
		return ret;
	}

	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe,
			String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);

		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			getCndR().stk_xfr_act_no(getHdrR().stk_xfr_act_no());
		}
	}

	// ------------IfSyncTableBase-------------------

	@Override
	public MCTable<?> getHSyncMainTable(MCRootPanel panel) {
		return DtlGiTable;
	}

	@Override
	protected void tableInit() {
		super.tableInit();

		DtlGiTable.addHSyncTables(DtlGrTable);
	}

	// ---------------------------------------- 在庫情報選択連携 START ----------------------------------------

	protected boolean isItmSet() {
		DtlGiR dr = DtlGiTable.getSelectedMCRow();

		if (dr != null && !isNull(dr.itm_cd())) {
			return true;
		}
		else {
			return false;
		}
	}

	// 在庫選択画面と連結するテーブル
	@Override
	public MCTable<?> getStkTable(MCRootPanel panel) {
		if (Btn_open_MSBEP0500_p_PPanel == panel) {
			// 出庫情報のみ
			return DtlGiTable;
		}
		return null;
	}

	@Override
	public boolean isCommittableStkData(String ope, MCList<MCRow> inptList, MCMessageList msgList) {

		if (inptList.size() > 1) {
			return chkInptListDiff(inptList, msgList);
		}
		return true;
	}

	protected boolean chkInptListDiff(MCList<MCRow> inptList, MCMessageList msgList) {
		MCRow firstRow = inptList.get(0);
		List<String> list = new ArrayList<String>();
		for (MCColumnConfig col : getROCols(_GI)) {
			for (MCRow r :inptList) {
				if (!isSame(firstRow.getValue(col.getRowColumnName()),r.getValue(col.getRowColumnName()))) {
					list.add(col.getLabelByLocale());
					break;
				}
			}
		}

		if (list.size() > 0) {
			msgList.add(new MCMessage(MSBEP0039, list.toString()));
			return false;
		}
		return true;

	}

	@Override
	public boolean isOpeTypEnable(MCRootPanel panel, int index, String ope) {
		// 空行または選択なしの場合は固定（行追加）とする
		return false;
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
		DtlGiR dr = DtlGiTable.getSelectedMCRow();

		if (isSame(name, IfStkInspBase.CND_ITM_CD)
				|| isSame(name, IfStkInspBase.CND_ITM_SUB1)
				|| isSame(name, IfStkInspBase.CND_ITM_SUB2)
				|| isSame(name, IfStkInspBase.CND_ITM_SUB3)
				|| isSame(name, IfStkInspBase.CND_ITM_NM)) {
			return isEditable(columnDtlGi_itm_cd, dr.getGUIIndex());
		}
		if (isSame(name, IfStkInspBase.CND_LOT_NO)) {
			if ((MAC_TRD_PTN_TYP.isXFR_GRD(getHdrR().trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isXFR_PACK(getHdrR().trd_ptn_typ()))
				&& dr.getGUIIndex() != 0 && !isNull(dr.getString(IfStkInspBase.CND_LOT_NO))) {
				return false;
			}
			return true;
		}
		if (isSame(name, IfStkInspBase.CND_SUBLOT_NO)) {
			if ((MAC_TRD_PTN_TYP.isXFR_GRD(getHdrR().trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_PACK(getHdrR().trd_ptn_typ()))
					&& dr.getGUIIndex() != 0 && !isNull(dr.getString(IfStkInspBase.CND_SUBLOT_NO))) {
				return false;
			}
			return true;
		}
		if (isSame(name, IfStkInspBase.CND_STR_LN_CD)
				|| isSame(name, IfStkInspBase.CND_STR_LN_NM)) {
			return isEditable(columnDtlGi_str_ln_cd, dr.getGUIIndex());
		}
		if (isSame(name, IfStkInspBase.CND_QUALITY_TYP)) {
			return isEditable(columnDtlGi_quality_typ, dr.getGUIIndex());
		}
		if (isSame(name, IfStkInspBase.CND_GD_CD)
				|| isSame(name, IfStkInspBase.CND_GD_NM)) {
			if (hasStkGdDefCd(this)) {
				return true;
			}
			return isEditable(columnDtlGi_gd_cd, dr.getGUIIndex());
		}
		if (isSame(name, IfStkInspBase.CND_SNO1)) {
			return isEditable(columnDtlGi_sno1, dr.getGUIIndex());
		}
		if (isSame(name, IfStkInspBase.CND_SNO2)) {
			return isEditable(columnDtlGi_sno2, dr.getGUIIndex());
		}
		if (isSame(name, IfStkInspBase.CND_SNO3)) {
			return isEditable(columnDtlGi_sno3, dr.getGUIIndex());
		}
		if (isSame(name, IfStkInspBase.CND_SNO4)) {
			return isEditable(columnDtlGi_sno4, dr.getGUIIndex());
		}
		if (isSame(name, IfStkInspBase.CND_STK_ID_TYP)) {
			return isEditable(columnDtlGi_stk_id_typ, dr.getGUIIndex());
		}
		if (isSame(name, IfStkInspBase.CND_STK_BP_CD)
				|| isSame(name, IfStkInspBase.CND_STK_BP_NM)) {
			if (isEditable(columnDtlGi_stk_id_typ, dr.getGUIIndex())) {
				return true;
			}
			return isEditable(columnDtlGi_stk_bp_cd, dr.getGUIIndex());
		}
		if (isSame(name, IfStkInspBase.CND_FIX_NO_TYP)) {
			return isEditable(columnDtlGi_fix_no_typ, dr.getGUIIndex());
		}
		if (isSame(name, IfStkInspBase.CND_FIX_NO)) {
			if (isEditable(columnDtlGi_fix_no_typ, dr.getGUIIndex())) {
				return true;
			}
			return isEditable(columnDtlGi_fix_no, dr.getGUIIndex());
		}
		if (isSame(name, IfStkInspBase.CND_STK_ARRV_BP_CD)
				|| isSame(name, IfStkInspBase.CND_STK_ARRV_BP_NM)) {
			return isEditable(columnDtlGi_stk_arrv_bp_cd, dr.getGUIIndex());
		}

		return true;
	}

	// 在庫選択画面に渡す検索条件を設定する
	@Override
	public MCRow get_open_MSBEP0500_bind_Row(MCTable<?> table) {
		if (table == null) {
			return null;
		}

		DtlGiR selDtlR = (DtlGiR) table.getSelectedMCRow();
		MCRow bind = MCRow.create();

		if (MAC_TRD_PTN_TYP.isXFR_PACK(getHdrR().trd_ptn_typ())) {
			bind.addStringColumn(IfStkInspBase.CND_STK_INFO_SRCH_TYP, MSC_STK_INFO_SRCH_TYP.STK_ADJST.value());
		}

		bind.addStringColumn(IfStkInspBase.CND_LOC_CD, getHdrR().loc_cd());
		bind.addStringColumn(IfStkInspBase.CND_LOC_NM, getHdrR().loc_nm());

		if (selDtlR != null) {
			String str_ln_cd = isEditable(columnDtlGi_str_ln_cd, selDtlR.getGUIIndex()) ? null : MAC_STR.NULL_VAL.value();
			bind.addStringColumn(IfStkInspBase.CND_STR_LN_CD, nvl(selDtlR.str_ln_cd(), str_ln_cd)); // 棚・ラインＣＤ
			bind.addStringColumn(IfStkInspBase.CND_STR_LN_NM, selDtlR.str_ln_nm()); // 棚・ライン名
			bind.addStringColumn(IfStkInspBase.CND_ITM_CD, selDtlR.itm_cd());
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB1, selDtlR.itm_sub1());
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB2, selDtlR.itm_sub2());
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB3, selDtlR.itm_sub3());
			bind.addStringColumn(IfStkInspBase.CND_ITM_NM, selDtlR.itm_nm());
			bind.addStringColumn(IfStkInspBase.CND_LOT_NO, selDtlR.lot_no());
			bind.addStringColumn(IfStkInspBase.CND_SUBLOT_NO, selDtlR.sublot_no());
			bind.addStringColumn(IfStkInspBase.CND_VER_NO, selDtlR.ver_no()); // 版ＮＯ
			String sno1 = isEditable(columnDtlGi_sno1, selDtlR.getGUIIndex()) ? null : MAC_STR.NULL_VAL.value();
			String sno2 = isEditable(columnDtlGi_sno2, selDtlR.getGUIIndex()) ? null : MAC_STR.NULL_VAL.value();
			String sno3 = isEditable(columnDtlGi_sno3, selDtlR.getGUIIndex()) ? null : MAC_STR.NULL_VAL.value();
			String sno4 = isEditable(columnDtlGi_sno4, selDtlR.getGUIIndex()) ? null : MAC_STR.NULL_VAL.value();
			bind.addStringColumn(IfStkInspBase.CND_SNO1, nvl(selDtlR.sno1(), sno1)); // 手配ＮＯ１
			bind.addStringColumn(IfStkInspBase.CND_SNO2, nvl(selDtlR.sno2(), sno2)); // 手配ＮＯ２
			bind.addStringColumn(IfStkInspBase.CND_SNO3, nvl(selDtlR.sno3(), sno3)); // 手配ＮＯ３
			bind.addStringColumn(IfStkInspBase.CND_SNO4, nvl(selDtlR.sno4(), sno4)); // 手配ＮＯ４
			bind.addStringColumn(IfStkInspBase.CND_GD_CD, selDtlR.gd_cd()); // 格付ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_GD_NM, selDtlR.gd_nm()); // 格付名

			String stk_bp_cd = null;
			if (isNull(selDtlR.stk_id_typ()) && !isEditable(columnDtlGi_stk_id_typ, selDtlR.getGUIIndex()) || MSC_STK_ID_TYP.isCOSTK(selDtlR.stk_id_typ())) {
				stk_bp_cd = MAC_STR.NULL_VAL.value();
			}
			bind.addStringColumn(IfStkInspBase.CND_STK_BP_CD, nvl(selDtlR.stk_bp_cd(), stk_bp_cd)); // 在庫取引先ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_STK_BP_NM, selDtlR.stk_bp_nm()); // 在庫取引先名
			String fix_no_typ = isEditable(columnDtlGi_fix_no_typ, selDtlR.getGUIIndex()) ? null : MSC_FIX_NO_TYP.NON.value();
			bind.addStringColumn(IfStkInspBase.CND_FIX_NO_TYP, nvl(selDtlR.fix_no_typ(), fix_no_typ));
			String fix_no = null;
			if (MSC_FIX_NO_TYP.isNON(nvl(selDtlR.fix_no_typ(), fix_no_typ))) {
				fix_no = MAC_STR.NULL_VAL.value();
			}
			bind.addStringColumn(IfStkInspBase.CND_FIX_NO, nvl(selDtlR.fix_no(), fix_no));
			String stk_arrv_bp_cd = isEditable(columnDtlGi_stk_arrv_bp_cd, selDtlR.getGUIIndex()) ? null : MAC_STR.NULL_VAL.value();
			bind.addStringColumn(IfStkInspBase.CND_STK_ARRV_BP_CD, nvl(selDtlR.stk_arrv_bp_cd(), stk_arrv_bp_cd)); // 在庫着荷先ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_STK_ARRV_BP_NM, selDtlR.stk_arrv_bp_nm()); // 在庫着荷先名
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

	protected boolean _editable_flg = false;

	@Override
	public MCConstRow insertStkRow(MCTable<?> table) {
		if (table == null) {
			return null;
		}
		_editable_flg = true;
		return getInsertableRow(table);
	}

	@Override
	public void afterInsStkData(MCRootPanel panel, int index) {
		_editable_flg = false;
		DtlGiR src = getDtlGiL().get(0);
		DtlGiR row = getDtlGiL().get(index);

		// 基準になる行が変更された場合
		if (isSame(src, row)) {
			if (!isEditable(columnDtlGi_stk_id_typ, 0)) {
				setValueEx(columnDtlGi_stk_id_typ, 0, MSC_STK_ID_TYP.COSTK.value());
			}
			if (!isEditable(columnDtlGi_fix_no_typ, 0)) {
				setValueEx(columnDtlGi_fix_no_typ, 0, MSC_FIX_NO_TYP.NON.value());
			}
			// 入庫側に反映
			for (DtlGiR r : getDtlGrL()) {
				copyValue(r, src);
			}
		}
		else {
			copyValue(row, src);
		}
	
	}

	// ---------------------------------------- 在庫情報選択連携 END ----------------------------------------

	/**
	 * 他画面から呼び出された場合の初期化を実装します。
	 * <P>
	 * <P>
	 * <li>起動タイプ：T1 （格付・良品区分振替）<br>
	 * バインド値 ＜必須＞<br>
	* <table border = 1>
	* <tr><th>カラム名</th><th>型</th><th>備考</th></tr>
	* <tr><th>loc_cd</th><th>String</th><th>任意</th></tr>
	* <tr><th>itm_cd</th><th>String</th><th>任意</th></tr>
	* <tr><th>itm_sub1</th><th>String</th><th>任意</th></tr>
	* <tr><th>itm_sub2</th><th>String</th><th>任意</th></tr>
	* <tr><th>itm_sub3</th><th>String</th><th>任意</th></tr>
	* <tr><th>lot_no</th><th>String</th><th>任意</th></tr>
	* <tr><th>sublot_no</th><th>String</th><th>任意</th></tr>
	* <tr><th>trd_unit_cd</th><th>String</th><th>任意</th></tr>
	* <tr><th>trd_unit_qty</th><th>Number</th><th>任意</th></tr>
	* <tr><th>quality_typ</th><th>String</th><th>任意</th></tr>
	* <tr><th>gd_cd</th><th>String</th><th>任意</th></tr>
	* <tr><th>sno1</th><th>String</th><th>任意</th></tr>
	* <tr><th>sno2</th><th>String</th><th>任意</th></tr>
	* <tr><th>sno3</th><th>String</th><th>任意</th></tr>
	* <tr><th>sno4</th><th>String</th><th>任意</th></tr>
	* <tr><th>stk_id_typ</th><th>String</th><th>任意</th></tr>
	* <tr><th>stk_bp_cd</th><th>String</th><th>任意</th></tr>
	* <tr><th>stk_arrv_bp_cd</th><th>String</th><th>任意</th></tr>
	* </table><br>
	* その他の引数：なし</li>
	* </P>
	* @param openTyp 起動タイプ
	* @param bind バインド値
	* @param args その他の引数
	*/
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);
		if (T1 == openTyp) {
			try {
				initByScreenParamT1(bind, args);
			}
			catch (MCException ex) {
				// 値の設定に失敗した場合でも画面を起動
				message(ex.getCauseMessageList());
			}
		}
	}

	protected void initByScreenParamT1(MCRow bind, Object... args) {
		valueInit();
		setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
		setValueEx(Hdr_trd_cd, getDefaultTrdCd(MAC_TRD_PTN_TYP.XFR_GRD.value()));

		if (bind.contains("loc_cd") && !isNull(bind.getString("loc_cd"))) {
			setValueEx(Hdr_loc_cd, bind.getString("loc_cd"));
		}
		if (bind.contains("itm_cd") && !isNull(bind.getString("itm_cd"))) {
			setValueEx(columnDtlGi_itm_cd, 0, bind.getString("itm_cd"));
		}
		if (bind.contains("itm_sub1") && !isNull(bind.getString("itm_sub1"))) {
			setValueEx(columnDtlGi_itm_sub1, 0, bind.getString("itm_sub1"));
		}
		if (bind.contains("itm_sub1") && !isNull(bind.getString("itm_sub2"))) {
			setValueEx(columnDtlGi_itm_sub2, 0, bind.getString("itm_sub2"));
		}
		if (bind.contains("itm_sub3") && !isNull(bind.getString("itm_sub3"))) {
			setValueEx(columnDtlGi_itm_sub3, 0, bind.getString("itm_sub3"));
		}
		if (bind.contains("lot_no") && !isNull(nullValToNull(bind.getString("lot_no")))) {
			setValueEx(columnDtlGi_lot_no, 0, bind.getString("lot_no"));
		}
		if (bind.contains("sublot_no")
				&& !isNull(nullValToNull(bind.getString("sublot_no")))) {
			setValueEx(columnDtlGi_sublot_no, 0, bind.getString("sublot_no"));
		}
		if (bind.contains("trd_unit_cd") && !isNull(bind.getString("trd_unit_cd"))) {
			setValueEx(columnDtlGi_trd_unit_cd, 0, bind.getString("trd_unit_cd"));
		}
		if (bind.contains("trd_unit_qty") && !isNull(bind.getNumber("trd_unit_qty"))) {
			setValueEx(columnDtlGi_trd_unit_qty, 0, bind.getNumber("trd_unit_qty"));
		}
		if (bind.contains("quality_typ") && !isNull(bind.getString("quality_typ"))) {
			setValueEx(columnDtlGi_quality_typ, 0, bind.getString("quality_typ"));
		}
		if (bind.contains("gd_cd") && !isNull(bind.getString("gd_cd"))) {
			setValueEx(columnDtlGi_gd_cd, 0, bind.getString("gd_cd"));
		}
		if (bind.contains("sno1") && !isNull(nullValToNull(bind.getString("sno1")))) {
			setValueEx(columnDtlGi_sno1, 0, bind.getString("sno1"));
		}
		if (bind.contains("sno2") && !isNull(nullValToNull(bind.getString("sno2")))) {
			setValueEx(columnDtlGi_sno2, 0, bind.getString("sno2"));
		}
		if (bind.contains("sno3") && !isNull(nullValToNull(bind.getString("sno3")))) {
			setValueEx(columnDtlGi_sno3, 0, bind.getString("sno3"));
		}
		if (bind.contains("sno4") && !isNull(nullValToNull(bind.getString("sno4")))) {
			setValueEx(columnDtlGi_sno4, 0, bind.getString("sno4"));
		}
		if (bind.contains("stk_id_typ") && !isNull(bind.getString("stk_id_typ"))) {
			setValueEx(columnDtlGi_stk_id_typ, 0, bind.getString("stk_id_typ"));
		}
		if (bind.contains("stk_bp_cd")
				&& !isNull(nullValToNull(bind.getString("stk_bp_cd")))) {
			setValueEx(columnDtlGi_stk_bp_cd, 0, bind.getString("stk_bp_cd"));
		}
		if (bind.contains("stk_arrv_bp_cd")
				&& !isNull(nullValToNull(bind.getString("stk_arrv_bp_cd")))) {
			setValueEx(columnDtlGi_stk_arrv_bp_cd, 0, bind.getString("stk_arrv_bp_cd"));
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