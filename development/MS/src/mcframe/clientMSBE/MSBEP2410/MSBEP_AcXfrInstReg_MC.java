package mcframe.clientMSBE.MSBEP2410;

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
import mcframe.clientMAUB.MAUBP0320.*;
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
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
import mcframe.clientMSUD.MSUDP0020.IfStkInspBase;
import mcframe.clientCore.container.*;
import static mcframe.commonFX.notice.FX_Msg.*;
import static mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil.*;
import static mcframe.clientMAUC.MAUCP0080.MAUCP_StdUpriUtil.*;
import mcframe.clientMSUC.MSUCP0110.MSUCP_StrLnUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_AcXfrInstReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_AcXfrInstReg_MC extends MSBEP_AcXfrInstReg_MC_A implements IfOpePanel, IfRowMoveBase, IfStkInspBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_AcXfrInstReg_MC() {
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
	public MSBEP_AcXfrInstReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL2410_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2410_Srch01Caller<P extends MSBEP_AcXfrInstReg, B extends MS_MSBEL2410_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2410_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			addDownContainer(getBulkSetR());
		}

		@Override
		protected void setupParam() {
			super.setupParam();

			setScreenOpe(bridge.up0());
		}

		protected void setScreenOpe(CndR up0) {
			if (Cnd_ope_INS.isSelected()) {
				up0.screen_ope(Cnd_ope_INS.getActionCommand());
			}
			else if (Cnd_ope_UPD.isSelected()) {
				up0.screen_ope(Cnd_ope_UPD.getActionCommand());
			}
			else if (Cnd_ope_DEL.isSelected()) {
				up0.screen_ope(Cnd_ope_DEL.getActionCommand());
			}
			else if (Cnd_ope_REF.isSelected()) {
				up0.screen_ope(Cnd_ope_REF.getActionCommand());
			}
		}

		@Override
		protected void show() {
			super.show();
			setRsnCdListBind();
		}
	}

	/**
	 * [MS_MSBEL2410_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2410_Ins01Caller<P extends MSBEP_AcXfrInstReg, B extends MS_MSBEL2410_Ins01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL2410_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			for (DtlR r : bridge.up1()) {
				if (!r.isStatusNone()) {
					// クライアント側の行と紐付けるためにGUIIndexを利用する
					r.peg_no(r.getGUIIndex());
				}
			}
		}

		@Override
		protected void show() {
			super.show();

			getCndR().acxfr_inst_no(bridge.down0().acxfr_inst_no());
			MSC_PR_STS_TYP.putNameNE(getDtlL(), DtlR.$pr_sts_typ, DtlR.$pr_sts_typ_nm);
		}
	}

	/**
	 * [MS_MSBEL2410_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2410_Upd01Caller<P extends MSBEP_AcXfrInstReg, B extends MS_MSBEL2410_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL2410_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			for (DtlR r : bridge.up1()) {
				if (!r.isStatusNone()) {
					// クライアント側の行と紐付けるためにGUIIndexを利用する
					r.peg_no(r.getGUIIndex());
				}
			}
		}
	}

	/**
	 * [MS_MSBEL2410_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2410_Del01Caller<P extends MSBEP_AcXfrInstReg, B extends MS_MSBEL2410_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBEL2410_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBEL2410_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2410_Sprt01Caller<P extends MSBEP_AcXfrInstReg, B extends MS_MSBEL2410_Sprt01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBEL2410_Sprt01Caller(P p, B b) {
			super(p, b);
		}

		MCList<DtlR> _dtlForCheck;

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			for (DtlR r : bridge.up1()) {
				// クライアント側の行と紐付けるためにGUIIndexを利用する
				r.peg_no(r.getGUIIndex());
			}
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			_dtlForCheck = getDtlL().subList(DtlR.$check, true);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBEP0026);
		}

		@Override
		protected boolean checkForCall() {
			if (_dtlForCheck.isEmpty()) {
				panel.dialog(new MCMessage(FXBAP0038));
				return false;
			}
			return super.checkForCall();
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			for (DtlR r : _dtlForCheck) {
				msgList.addAll(panel.checkReq(Hdr_loc_cd));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_cd));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_sub1));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_sub2));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_sub3));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_trd_unit_cd));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_trd_unit_qty));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_acxfr_schd_dt));
			}
		}

		@Override
		protected void showMerge() {
			MCIndexKey idx = bridge.down0().createIndex(DtlR.$peg_no);
			MCList<DtlR> newL = MCList.create(DtlR.class);

			for (DtlR r : getDtlL()) {
				MCList<DtlR> l = bridge.down0().subList(idx,
						MCNumber.valueOf(r.getGUIIndex()));

				// ロット提案対象外の行
				if (l.isEmpty()) {
					newL.add(r);
				}
				// ロット提案された行
				else {
					// 未引当行があれば先頭にもってくる
					l.sort(SortType.DESC, DtlR.$no_alloc_flg);

					for (int i = 0; i < l.size(); i++) {
						DtlR rsltR = l.get(i);
						DtlR newR = r.clone();
						newL.add(newR);
						copyLotRslt(newR, rsltR);
						newR.alloc_flg(!rsltR.no_alloc_flg());

						if (i == 0) {
							// ロット提案による分割元行
							// なにもしない
						}
						else {
							// ロット提案による分割先行
							newR.setStatus(MCRow.CREATE);
						}
					}
				}
			}
			getDtlL().setAll(newL);
		}

		protected void copyLotRslt(DtlR dest, DtlR src) {
			// 単位と数量は引当結果にかかわらずコピーする
			if (!isSame(dest.trd_unit_cd(), src.trd_unit_cd())) {
				dest.trd_unit_cd(src.trd_unit_cd());
				dest.trd_unit_conv_base_qty(src.trd_unit_conv_base_qty());
				dest.trd_unit_conv_qty(src.trd_unit_conv_qty());
				dest.trd_unit_dec_place(src.trd_unit_dec_place());
				dest.trd_unit_nm(src.trd_unit_nm());
			}
			dest.trd_unit_qty(src.trd_unit_qty());
			dest.base_unit_qty(src.base_unit_qty());

			// 引当できた場合のみ引当結果をコピーする
			if (!src.no_alloc_flg()) {
				dest.lot_no(src.lot_no());
				dest.sublot_no(src.sublot_no());
				dest.ver_no(src.ver_no());
				dest.str_ln_cd(src.str_ln_cd());
				dest.str_ln_nm(src.str_ln_nm());
//				dest.stk_arrv_bp_cd(src.stk_arrv_bp_cd());
//				dest.stk_arrv_bp_nm(src.stk_arrv_bp_nm());
				dest.gd_cd(src.gd_cd());
				dest.gd_nm(src.gd_nm());
				dest.quality_typ(src.quality_typ());
				dest.quality_typ_nm(src.quality_typ_nm());
				dest.stk_id_typ(src.stk_id_typ());
				dest.stk_id_typ_nm(src.stk_id_typ_nm());
				dest.stk_bp_cd(src.stk_bp_cd());
				dest.stk_bp_nm(src.stk_bp_nm());
			}
			else {
				dest.lot_no(null);
				dest.sublot_no(null);
			}
		}

	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBEL2410_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
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
	 * Panel[Btn]のボタン[sprt_lot_prop]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_lot_prop(MCEventInfo info) {
		callMS_MSBEL2410_Sprt01();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP2420]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP2420(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP2420");

		mcframe.clientMSBE.MSBEP2420.CndR bind = mcframe.clientMSBE.MSBEP2420.CndR
				.create();

		bind.srch_tgt_no(getHdrR().acxfr_inst_no());
		aso.putCnd(bind);
		aso.putSearchAction();
		aso.runValueInit();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[ins_gr]の押下時の処理
	 */
	@Override
	public void doBtn_ins_gr(MCEventInfo info) {
		callMS_MSBEL2410_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[ins_gi]の押下時の処理
	 */
	@Override
	public void doBtn_ins_gi(MCEventInfo info) {
		callMS_MSBEL2410_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[ins_dp]の押下時の処理
	 */
	@Override
	public void doBtn_ins_dp(MCEventInfo info) {
		callMS_MSBEL2410_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[upd_gr]の押下時の処理
	 */
	@Override
	public void doBtn_upd_gr(MCEventInfo info) {
		callMS_MSBEL2410_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[upd_gi]の押下時の処理
	 */
	@Override
	public void doBtn_upd_gi(MCEventInfo info) {
		callMS_MSBEL2410_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[upd_dp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_dp(MCEventInfo info) {
		callMS_MSBEL2410_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del_gr]の押下時の処理
	 */
	@Override
	public void doBtn_del_gr(MCEventInfo info) {
		callMS_MSBEL2410_Del01();
	}

	/**
	 * Panel[Btn]のボタン[del_gi]の押下時の処理
	 */
	@Override
	public void doBtn_del_gi(MCEventInfo info) {
		callMS_MSBEL2410_Del01();
	}

	/**
	 * Panel[Btn]のボタン[del_dp]の押下時の処理
	 */
	@Override
	public void doBtn_del_dp(MCEventInfo info) {
		callMS_MSBEL2410_Del01();
	}

// -----------------------------------------------
// 初期設定
	@Override
	protected void setupParts() {
		super.setupParts();

		Hdr_usr_dpt_p_PPanel.setRelateBeans(Hdr_acxfr_inst_dt);

		Dtl_itm_p_PPanel.setRelateBeans(columnDtl_sundry_itm_flg);
		Dtl_lot_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_lot_mng_typ,
				columnDtl_sublot_mng_typ);
		Dtl_ver_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, null, columnDtl_ver_flg);
		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_trd_unit_cd,
				columnDtl_trd_unit_dec_place, columnDtl_trd_unit_rnd_typ,
				columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty,
				columnDtl_base_unit_cd);
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
				columnDtl_trd_unit_qty, columnDtl_trd_unit_conv_base_qty,
				columnDtl_trd_unit_conv_qty);
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

	@Override
	protected void listInit() {
		super.listInit();

		getBulkSet_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_acxfr_inst_dt);
		Dtl_bd_p_PPanel.columnBdItem_bd_dpt_cd.getListConfig().getPutter()
				.putBind(DptCols.$i_dt, Hdr_acxfr_inst_dt);
	}

	protected void setRsnCdListBind() {
		getBulkSet_rsn_cd_ListPutter().putBind(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg, isGi());
		getBulkSet_rsn_cd_ListPutter().putBind(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg, isGr());
		getBulkSet_rsn_cd_ListPutter().putBind(AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg, isDp());

		getDtl_rsn_cd_ListPutter().putBind(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg, isGi());
		getDtl_rsn_cd_ListPutter().putBind(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg, isGr());
		getDtl_rsn_cd_ListPutter().putBind(AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg, isDp());
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
							|| MSC_STK_ID_TYP.isRNT_RCV(r.getStringNE(DtlR.$stk_id_typ))
							|| MSC_STK_ID_TYP.isACCPT_DFCT(r.getStringNE(DtlR.$stk_id_typ))
							|| MSC_STK_ID_TYP.isNCV_RCV(r.getStringNE(DtlR.$stk_id_typ))) {
						list.add(r);
					}
				}
			}
			else if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(getHdrR().trd_ptn_typ())) {
				if (MSC_STK_ID_TYP.is_inst_gi(r.getStringNE(DtlR.$stk_id_typ))) {
					list.add(r);
				}
			}
			else if (MAC_TRD_PTN_TYP.isSCRP(getHdrR().trd_ptn_typ())) {
				if (MSC_STK_ID_TYP.is_inst_scrp(r.getStringNE(DtlR.$stk_id_typ))) {
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

		setDate();
	}

	protected void setDate() {
		setValueEx(Hdr_acxfr_inst_dt, getToday());
	}

// -----------------------------------------------
// フォーカス設定、入力制御
	@Override
	public void setINSStatus() {
		super.setINSStatus();

		HdrPanel.focusFirstComponent();
		setBtnMode();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();

		CndPanel.focusFirstComponent();
		setBtnMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();

		CndPanel.focusFirstComponent();
		setBtnMode();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();

		HdrPanel.focusFirstComponent();
		setBtnMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();

		CndPanel.focusFirstComponent();
		setBtnMode();
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

		columnDtl_itm_cd.addLCListener(this);
		columnDtl_itm_sub1.addLCListener(this);
		columnDtl_itm_sub2.addLCListener(this);
		columnDtl_itm_sub3.addLCListener(this);
		Hdr_acxfr_inst_dt.addLCListener(this);
		columnDtl_trd_unit_qty.addLCListener(this);
	}

	// ROW ステータス変更時のイベント取得処理
	protected MCRowStatusListener createDtlRowListener() {
		return new DtlRowListener();
	}

	public class DtlRowListener implements MCRowStatusListener {
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			if (event.getNewStatus() == Status.CREATE
					&& event.getOldStatus() == Status.NONE) {
				DtlR dtl = (DtlR) event.getSourceRow();

				setDefBulkSet(dtl);
			}
		}
	}

	protected void setDefBulkSet(DtlR dtl) {
		if (isNull(dtl.bd_p().bd_dpt_cd())) {
			setValueEx(Dtl_bd_p_PPanel.columnBdItem_bd_dpt_cd, dtl.getGUIIndex(),
					getBulkSetR().bd_dpt_cd());
		}

		if (isNull(dtl.rsn_cd())) {
			setValueEx(columnDtl_rsn_cd, dtl.getGUIIndex(), getBulkSetR().rsn_cd());
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		DtlR r = DtlTable.getRow(info.getEventIndex());

		if (lc == columnDtl_itm_cd || lc == columnDtl_itm_sub1
				|| lc == columnDtl_itm_sub2 || lc == columnDtl_itm_sub3) {
			setNoLotFixFlg(r);
			setStkAmt(r);
		}
		if (lc == columnDtl_itm_cd) {
			doDtl_itm_cd_LC(info);
		}
		if (lc == columnDtl_trd_unit_qty) {
			setStkAmt(r);
		}
		if (lc == Hdr_acxfr_inst_dt) {
			setStkAmt();
		}
		setButtonMode(info);
	}
	
	protected void setNoLotFixFlg(DtlR r) {
		if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
			setValueEx(columnDtl_no_lot_fix_flg, r.getGUIIndex(), false);
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
				if (isNull(r.rsn_cd()) && isNull(r.acxfr_schd_no())) {
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
				if (isNull(r.bd_dpt_cd()) && isNull(r.acxfr_schd_no())) {
					if (!r.isEmpty() && !r.isStatusDelete() && !r.abort_flg()) {
						setValueEx(columnDtl_bd_dpt_cd, r.getGUIIndex(),
								getBulkSetR().bd_dpt_cd());
					}
				}
			}
		}
	}

	protected void setBtnMode() {
		// 取引ＣＤ変更と同時にテーブルをクリアするため、本処理での項目クリアは行わない
		if (isSame(getStatus(), INS)) {
			Btn_ins_gr.setMode(getGrMode());
			Btn_ins_gi.setMode(getGiMode());
			Btn_ins_dp.setMode(getDpMode());
		}
		else if (isSame(getStatus(), UPD)) {
			Btn_upd_gr.setMode(getGrMode());
			Btn_upd_gi.setMode(getGiMode());
			Btn_upd_dp.setMode(getDpMode());

			DtlR dtlR = DtlTable.getSelectedMCRow();
			setBtnRdelMode(dtlR);
		}
		else if (isSame(getStatus(), DEL)) {
			Btn_del_gr.setMode(getGrMode());
			Btn_del_gi.setMode(getGiMode());
			Btn_del_dp.setMode(getDpMode());
		}

		setBtn_open_MSBEP2420Mode();
		setBtn_open_MSBEP0500Mode();
		setBtn_sprt_lot_propMode();
	}
	protected void setBtnRdelMode(DtlR dtlR) {
		if (!isNull(dtlR)) {
			if (MSC_PR_STS_TYP.isPART_COMP(dtlR.pr_sts_typ()) || MSC_PR_STS_TYP.isCOMP(dtlR.pr_sts_typ())) {
				Btn_rdel.setMode(MCMode.DISABLE);
			}
			else {
				Btn_rdel.setMode(getDefaultMode(Btn_rdel));
			}
		}
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

	protected void setBtn_open_MSBEP2420Mode() {
		if (isSame(getStatus(), UPD) || isSame(getStatus(), REF)) {
			MCList<DtlR> subL = getDtlL()
					.subList(r -> (MSC_PR_STS_TYP.isINST(r.pr_sts_typ()) || MSC_PR_STS_TYP.isPART_COMP(r.pr_sts_typ())));
			if (subL.isEmpty()) {
				Btn_open_MSBEP2420.setMode(MCMode.DISABLE);
			}
			else {
				Btn_open_MSBEP2420.setMode(MCMode.ENABLE);
			}
		}
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
		else if (MSC_PR_STS_TYP.isPART_COMP(r.pr_sts_typ()) || MSC_PR_STS_TYP.isCOMP(r.pr_sts_typ())) {
			return false;
		}
		return true;
	}

	protected void setBtn_sprt_lot_propMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		if (isEnableBtn_sprt_lot_prop(r)) {
			setDefaultMode(Btn_sprt_lot_prop);
		}
		else {
			Btn_sprt_lot_prop.setMode(MCMode.DISABLE);
		}
	}
	/**
	 * ロット提案できるかどうか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_sprt_lot_prop(DtlR r) {
		MCList<DtlR> l = getDtlL().subList("check", true);
		if (l.isEmpty()) {
			return false;
		}
		return true;
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);

		setButtonMode(info);
	}

	protected void setButtonMode(MCEventInfo info) {
		if (info.getEventIndex() < 0) {
			return;
		}
		if (isSame(getStatus(), INS) || isSame(getStatus(), UPD)) {
			DtlR r = getDtlL().get(info.getEventIndex());
			setBtnRdelMode(r);
		}
		setBtn_open_MSBEP0500Mode();
		setBtn_sprt_lot_propMode();
	}
	
	@Override
	public void doDtl_check_NC(MCEventInfo info) {
		super.doDtl_check_NC(info);

		setBtnMode();
	}

	@Override
	public void doDtl_no_lot_fix_flg_NC(MCEventInfo info) {
		super.doDtl_no_lot_fix_flg_NC(info);

		int index = info.getEventIndex();

		setValueEx(columnDtl_lot_no, index, null);
		setValueEx(columnDtl_sublot_no, index, null);
		setValueEx(columnDtl_check, index, false);
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
		dtlL.addDateColumn("acxfr_inst_dt", getHdrR().acxfr_inst_dt());
		dtlL.addStringColumn("wg_cd", getHdrR().wg_cd());
		dtlL.addStringColumn("stk_std_upri_typ", getCo().stk_std_upri_typ());
		dtlL.addNumberColumn("std_upri");
		getStdCostL("std_upri", dtlL, DtlR.$itm_cd, DtlR.$itm_sub1, DtlR.$itm_sub2, DtlR.$itm_sub3, "acxfr_inst_dt", "wg_cd", "stk_std_upri_typ");
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
				getHdrR().acxfr_inst_dt(), getHdrR().wg_cd(), getCo().stk_std_upri_typ());
		setValueEx(columnDtl_stk_amt, r.getGUIIndex(), getAmt(upri, r.base_unit_qty(),
				getCo().stk_amt_dec_place(), getCo().stk_amt_rnd_typ()));
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
		super.getNotInheritCols(type, cont);

		List<String> list = new ArrayList<String>();

		if (cont == getCndR()) {
			list.add(CndR.$acxfr_inst_no);
		}
		else if (cont == getHdrR()) {
			list.add(HdrR.$acxfr_inst_no);
			list.add(HdrR.$acxfr_inst_dt);
		}
		else if (cont == getDtlL()) {
			list.add(DtlR.$acxfr_inst_no);
			list.add(DtlR.$acxfr_inst_d_no);
			list.add(DtlR.$acxfr_schd_no);
			list.add(DtlR.$pr_sts_typ);
			list.add(DtlR.$pr_sts_typ_nm);
			list.add(DtlR.$abort_flg);
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

			if (isSame(getStatus(), INS) || isSame(getStatus(), UPD)) {
				// 打切りせず完了の場合は打切は入力不可
				if (column == columnDtl_abort_flg) {
					if (MSC_PR_STS_TYP.isCOMP(dtl.pr_sts_typ()) && !dtl.abort_flg()) {
						return MCMode.READ_ONLY;
					}
					// 予定なし新規の場合は打切は入力不可
					if (isNull(dtl.acxfr_schd_no())) {
						if (dtl.isStatusCreate()) {
							return MCMode.READ_ONLY;
						}
					}
					if (dtl.isEmpty()) {
						return MCMode.READ_ONLY;
					}
				}
				else {
					// 実績登録されている場合は打切り以外不可
					if (MSC_PR_STS_TYP.isPART_COMP(dtl.pr_sts_typ())
							|| MSC_PR_STS_TYP.isCOMP(dtl.pr_sts_typ())) {
						return MCMode.READ_ONLY;
					}
					// 打切り済みの場合は打切り以外入力不可
					if (dtl.abort_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				// 予定なし
				if (isNull(dtl.acxfr_schd_no())) {
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
							|| column == columnDtl_bd_dpt_cd
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
							|| column == columnDtl_bd_oper_cd
							) {
						return MCMode.READ_ONLY;
					}
				}

				// 入庫あるいはロット管理対象外品目なら入力不可
				if (column == columnDtl_no_lot_fix_flg) {
					if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(getHdrR().trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
					if (MAC_LOT_MNG_TYP.isNOT_MNG(dtl.lot_mng_typ())
							&& MAC_SUBLOT_MNG_TYP.isNOT_MNG(dtl.sublot_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// ロット指定なしなら入力不可
				else if (column == columnDtl_lot_no || column == columnDtl_sublot_no) {
					if (dtl.no_lot_fix_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 入庫なら確定ＮＯ区分入力不可
				else if (column == columnDtl_fix_no_typ) {
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
				// ロット指定なしはロット提案できない
				else if (column == columnDtl_check) {
					if (dtl.no_lot_fix_flg()) {
						return MCMode.READ_ONLY;
					}
					// 入庫では入力不可
					if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(getHdrR().trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 入庫では入力不可
				else if (column == columnDtl_alloc_flg) {
					if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(getHdrR().trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 出庫では入力不可
				else if (column == columnDtl_itm_nm) {
					if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(getHdrR().trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSCRP(getHdrR().trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 引当対象の場合は入力必須
				if (column == columnDtl_str_ln_cd) {
					if (getHdrR().str_ln_tgt_flg()
						&& dtl.alloc_flg()
						&& !dtl.str_ln_cd_none_flg()) {
						return MCMode.REQUIRED;
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

			getCndR().acxfr_inst_no(getHdrR().acxfr_inst_no());
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
					|| isSame(name, IfStkInspBase.CND_STK_ARRV_BP_NM)
					) {
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
		if (IfStkInspBase.INPT_VER_NO.equals(name) ||
				IfStkInspBase.INPT_LOT_NO.equals(name) ||
				IfStkInspBase.INPT_SUBLOT_NO.equals(name) ||
				IfStkInspBase.INPT_STR_LN_CD.equals(name) ||
				IfStkInspBase.INPT_STR_LN_CD_NONE_FLG.equals(name) ||
				IfStkInspBase.INPT_PACK_UNIT_CD.equals(name) ||
				IfStkInspBase.INPT_PACK_STK_QTY.equals(name)) {
			return true;
		}
		return false;
	}

// ---------------------------------------- 在庫情報選択連携 END ----------------------------------------

}