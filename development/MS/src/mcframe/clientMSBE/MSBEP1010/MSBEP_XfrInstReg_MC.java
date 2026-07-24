package mcframe.clientMSBE.MSBEP1010;

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
import static mcframe.commonFX.notice.FX_Msg.*;
import static mcframe.clientMSUC.MSUCP0070.MSUCP_StkUtil.*;
import mcframe.clientMSUC.MSUCP0090.MSUCP_SCMLinkUtil;
import mcframe.clientMSUC.MSUCP0110.MSUCP_StrLnUtil;
import mcframe.clientCore.beans.list.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_XfrInstReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_XfrInstReg_MC extends MSBEP_XfrInstReg_MC_A implements IfOpePanel, IfRowMoveBase, IfStkInspBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected boolean _fromOtherScreenFlg = false;
	protected boolean _dataClearedFlg = false;
	protected int _inst_bndl_peg_no = 0;
	protected MCList<DtlR> _instBndlL = MCList.create(DtlR.class);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_XfrInstReg_MC() {
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
	public MSBEP_XfrInstReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL1010_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1010_Sprt02Caller<P extends MSBEP_XfrInstReg, B extends MS_MSBEL1010_Sprt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBEL1010_Sprt02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Btn]のボタン[sprt_ac_dt]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_ac_dt(MCEventInfo info) {
		callMS_MSBEL1010_Sprt02();
	}
	
	/**
	 * [MS_MSBEL1010_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1010_Prnt01Caller<P extends MSBEP_XfrInstReg, B extends MS_MSBEL1010_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBEL1010_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBEL1010_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1010_Sprt01Caller<P extends MSBEP_XfrInstReg, B extends MS_MSBEL1010_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBEL1010_Sprt01Caller(P p, B b) {
			super(p, b);
		}

		MCList<DtlR> _dtlForCheck;

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			for (DtlR r : bridge.up1()) {
				// クライアント側の行と紐付けるためにGUIIndexを利用する
				r.peg_no(r.getGUIIndex());
				if (!isNewRow(r) && (isXfr(r) || isProv(r))) {
					r.stk_info_loc_typ(MSC_STK_INFO_LOC_TYP.HOUSE.value());
				}
			}
			MCIndexKey idx = bridge.up1().createIndex(DtlR.$inst_bndl_peg_no);
			for(DtlR dtlR : _instBndlL) {
				dtlR.check(bridge.up1().getFirst(idx, dtlR.inst_bndl_to_peg_no()).check());
				dtlR.peg_no(null);
			}
			bridge.up1().addAll(_instBndlL);
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
				msgList.addAll(panel.checkReq(Hdr_gr_loc_cd));
				msgList.addAll(panel.checkReq(Hdr_xfr_schd_dt));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_cd));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_sub1));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_sub2));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_sub3));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_trd_unit_cd));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_trd_unit_qty));
			}
		}

		@Override
		protected void showMerge() {
			MCIndexKey idx = bridge.down0().createIndex(DtlR.$peg_no);
			MCList<DtlR> newL = MCList.create(DtlR.class);

			for (DtlR r : getDtlL()) {
				MCList<DtlR> l = bridge.down0().subList(idx, MCNumber.valueOf(r.getGUIIndex()));

				// ロット提案対象外の行
				if (l.isEmpty()) {
					newL.add(r);
				}
				// ロット提案された行
				else {
					// 未引当行があれば先頭にもってくる
					l.sort(SortType.DESC, DtlR.$no_alloc_flg);
					MCNumber inst_bndl_peg_no = null;

					for (int i = 0; i < l.size() ; i++) {
						DtlR rsltR = l.get(i);
						DtlR newR = r.clone();
						newL.add(newR);
						copyLotRslt(newR, rsltR);
						newR.alloc_flg(!rsltR.no_alloc_flg());
						newR.wms_flg(rsltR.wms_flg());
						newR.wms_tgt_flg(rsltR.wms_tgt_flg());

						// ロット提案の結果、分割される場合のみ
						if (l.size() > 1) {
							if (i == 0) {
								// ロット提案による分割元行
								if (isNull(newR.inst_bndl_peg_no())) {
									newR.inst_bndl_peg_no(_inst_bndl_peg_no++);
								}
								inst_bndl_peg_no = newR.inst_bndl_peg_no();
							}
							else {
								// ロット提案による分割先行
								newR.setStatus(MCRow.CREATE);
								newR.old_xfr_alloc_sts_no(nvl(newR.old_xfr_alloc_sts_no(), newR.xfr_alloc_sts_no()));
								newR.xfr_alloc_sts_no(null);
								newR.inst_bndl_to_peg_no(inst_bndl_peg_no);
							}
						}
					}
				}
			}
			getDtlL().setAll(newL);
			setCopyFlg();
		}

		protected void copyLotRslt(DtlR dest, DtlR src) {
			// 単位と数量は引当結果にかかわらずコピーする
			if (!isSame(dest.trd_unit_cd(), src.trd_unit_cd())) {
				dest.trd_unit_cd(src.trd_unit_cd());
				dest.trd_unit_conv_base_qty(src.trd_unit_conv_base_qty());
				dest.trd_unit_conv_qty(src.trd_unit_conv_qty());
				dest.trd_unit_dec_place(src.trd_unit_dec_place());
				dest.trd_unit_rnd_typ(src.trd_unit_rnd_typ());
				dest.trd_unit_nm(src.trd_unit_nm());
			}
			dest.trd_unit_qty(src.trd_unit_qty());
			dest.base_unit_qty(src.base_unit_qty());

			// 引当できた場合のみ引当結果をコピーする
			if (!src.no_alloc_flg()) {
				dest.lot_no(src.lot_no());
				dest.sublot_no(src.sublot_no());
				dest.ver_no(src.ver_no());
				dest.gi_loc_cd(src.gi_loc_cd());
				dest.gi_loc_nm(src.gi_loc_nm());
				dest.gi_str_ln_cd(src.gi_str_ln_cd());
				dest.gi_str_ln_nm(src.gi_str_ln_nm());
				dest.gi_str_ln_tgt_flg(src.gi_str_ln_tgt_flg());
				dest.gi_str_ln_cd_none_flg(src.gi_str_ln_cd_none_flg());
				dest.gi_stk_arrv_bp_cd(src.gi_stk_arrv_bp_cd());
				dest.gi_stk_arrv_bp_nm(src.gi_stk_arrv_bp_nm());
				dest.gd_cd(src.gd_cd());
				dest.gd_nm(src.gd_nm());
				dest.quality_typ(src.quality_typ());
				dest.quality_typ_nm(src.quality_typ_nm());
				dest.alloc_sno1(src.alloc_sno1());
				dest.alloc_sno2(src.alloc_sno2());
				dest.alloc_sno3(src.alloc_sno3());
				dest.alloc_sno4(src.alloc_sno4());
				dest.stk_id_typ(src.stk_id_typ());
				dest.stk_id_typ_nm(src.stk_id_typ_nm());
				dest.stk_bp_cd(src.stk_bp_cd());
				dest.stk_bp_nm(src.stk_bp_nm());
				if (!isNullOrNullVal(src.alloc_sno1())) {
					dest.sno1(src.alloc_sno1());
				}
				if (!isNullOrNullVal(src.alloc_sno2())) {
					dest.sno2(src.alloc_sno2());
				}
				if (!isNullOrNullVal(src.alloc_sno3())) {
					dest.sno3(src.alloc_sno3());
				}
				if (!isNullOrNullVal(src.alloc_sno4())) {
					dest.sno4(src.alloc_sno4());
				}
				dest.sno1_null_flg(false);
				dest.sno2_null_flg(false);
				dest.sno3_null_flg(false);
				dest.sno4_null_flg(false);
			}
		}
	}

	/**
	 * [MS_MSBEL1010_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1010_Upd01Caller<P extends MSBEP_XfrInstReg, B extends MS_MSBEL1010_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1010_Upd01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(getHdrR().dlv_print()
					|| getHdrR().inst_print()
					|| getHdrR().pick_print());
		}
	}

	/**
	 * [MS_MSBEL1010_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1010_Del01Caller<P extends MSBEP_XfrInstReg, B extends MS_MSBEL1010_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBEL1010_Del01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();

			setPrint(true);
		}
	}

	/**
	 * [MS_MSBEL1010_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1010_Ins01Caller<P extends MSBEP_XfrInstReg, B extends MS_MSBEL1010_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1010_Ins01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(getHdrR().dlv_print()
					|| getHdrR().inst_print()
					|| getHdrR().pick_print());
		}
		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up1().addAll(_instBndlL);
		}
		@Override
		protected void afterCall() {
			super.afterCall();
			_instBndlL.clear();
		}
	}

	/**
	 * [MS_MSBEL1010_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1010_Srch01Caller<P extends MSBEP_XfrInstReg, B extends MS_MSBEL1010_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1010_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setMode() {
			super.setMode();
			setINSStatus();
			Hdr_trd_cd.setMode(MCMode.READ_ONLY);
			Hdr_gr_loc_cd.setMode(MCMode.READ_ONLY);
		}
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setINSStatus();
		}
		@Override	
		protected void afterCall() {
			super.afterCall();
			bridge.down1().setStatus(Status.CREATE);
		}
	}

	/**
	 * [MS_MSBEL1010_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1010_Srch02Caller<P extends MSBEP_XfrInstReg, B extends MS_MSBEL1010_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1010_Srch02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		CndR cndR = getCndR();
		if (MSC_STK_SRCH_TGT_TYP.isXFR_SCHD_NO(cndR.srch_tgt_typ())) {
			callMS_MSBEL1010_Srch01();
		}
		else if (MSC_STK_SRCH_TGT_TYP.isXFR_INST_NO(cndR.srch_tgt_typ())) {
			callMS_MSBEL1010_Srch02();
		}
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP1020]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1020(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1020");
		mcframe.clientMSBE.MSBEP1020.MSBEP_XfrActReg msbep1020 = 
				(mcframe.clientMSBE.MSBEP1020.MSBEP_XfrActReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1020.CndR bind = mcframe.clientMSBE.MSBEP1020.CndR.create();
		bind.ope(msbep1020.Cnd_ope_INS.getActionCommand());
		bind.srch_tgt_typ_nm(MSC_STK_SRCH_TGT_TYP.XFR_INST_NO.name());
		bind.srch_tgt_no(getHdrR().xfr_inst_no());
		aso.putCnd(bind);
		aso.putSearchAction();
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[prnt_pick]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_pick(MCEventInfo info) {
		HdrR hdrR = getHdrR();
		hdrR.do_dlv_print(false);
		hdrR.do_inst_print(false);
		hdrR.do_pick_print(true);
		callMS_MSBEL1010_Prnt01();
		setFIX_UStatus();
	}
	/**
	 * Panel[Btn]のボタン[prnt_inst]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_inst(MCEventInfo info) {
		HdrR hdrR = getHdrR();
		hdrR.do_dlv_print(false);
		hdrR.do_inst_print(true);
		hdrR.do_pick_print(false);
		callMS_MSBEL1010_Prnt01();
		setFIX_UStatus();
	}
	/**
	 * Panel[Btn]のボタン[prnt_dlv]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_dlv(MCEventInfo info) {
		HdrR hdrR = getHdrR();
		hdrR.do_dlv_print(true);
		hdrR.do_inst_print(false);
		hdrR.do_pick_print(false);
		callMS_MSBEL1010_Prnt01();
		setFIX_UStatus();
	}
	/**
	 * Panel[Btn]のボタン[sprt_lot_prop]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_lot_prop(MCEventInfo info) {
		callMS_MSBEL1010_Sprt01();
	}

	/**
	 * Panel[Btn]のボタン[sprt_pckg_prop]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_pckg_prop(MCEventInfo info) {
		execPckgProp();
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
		DtlR r = DtlTable.getSelectedMCRow();
		if (!isNull(r) && !isNull(r.inst_bndl_to_peg_no())) {
			if(isNull(r.inst_bndl_peg_no())) {
				MCList<DtlR> src = getDtlL().subList(DtlR.$inst_bndl_peg_no, r.inst_bndl_to_peg_no());
				MCList<DtlR> dtlR = getDtlL().subList(DtlR.$inst_bndl_to_peg_no, r.inst_bndl_to_peg_no());
				if(!src.isEmpty() && !dtlR.isEmpty()) {
					if (dtlR.size() == 1) {
						src.setNumber(DtlR.$inst_bndl_peg_no, null);
					}
				}
			} 
			else {
				MCList<DtlR> dtlR = getDtlL().subList(DtlR.$inst_bndl_to_peg_no, r.inst_bndl_peg_no());
				if (!dtlR.isEmpty()) {
					dtlR.setNumber(DtlR.$inst_bndl_to_peg_no, r.inst_bndl_to_peg_no());
				}
			}
		}
		
		//分割元を行削除する場合、
		if (!isNull(r) && r.getStatus().equals(Status.CREATE) && !isNull(r.inst_bndl_peg_no())) {
			MCList<DtlR> dtlL = getDtlL().subList(DtlR.$inst_bndl_to_peg_no, r.inst_bndl_peg_no());
			if (!dtlL.isEmpty()) {
				DtlR firstR = dtlL.get(0);
				firstR.setValue(DtlR.$xfr_alloc_sts_no, r.xfr_alloc_sts_no());
				firstR.setValue(DtlR.$old_xfr_alloc_sts_no, null);
				firstR.setNumber(DtlR.$inst_bndl_to_peg_no, null);
				
				if (dtlL.size() > 1){//分割先は複数の場合、
					MCNumber firstPegNo = r.inst_bndl_peg_no();
					MCNumber secondPegNo = firstR.getNumber(DtlR.$inst_bndl_peg_no);
					
					firstR.setNumber(DtlR.$inst_bndl_peg_no, firstPegNo);
					
					if (!isNull(secondPegNo)) {
						MCList<DtlR> secDtlL = getDtlL().subList(DtlR.$inst_bndl_to_peg_no, secondPegNo);
						if (!secDtlL.isEmpty()) {
							secDtlL.setNumber(DtlR.$inst_bndl_to_peg_no, firstPegNo);
						}
					}
				}
			}
		}
		deleteRow(DtlTable);
		setCopyFlg();
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		DtlR r = DtlTable.getSelectedMCRow();
		if (isNull(r.inst_bndl_peg_no())) {
			if (!isNull(nvl(r.old_xfr_alloc_sts_no(), r.xfr_alloc_sts_no()))) {
				r.inst_bndl_peg_no(_inst_bndl_peg_no++);
			}
		}
		copyRow(DtlTable);
		setBtnMode();
		setCopyFlg();
	}

	/**
	 * 行コピー後に値を変更する項目
	 */
	@Override
	public <E extends MCConstRow> E copyRowSub(MCTable<E> table, E row) {
		super.copyRowSub(table, row);
		if (table == DtlTable) {
			DtlR dtlR = (DtlR)row;
			dtlR.old_xfr_alloc_sts_no(nvl(dtlR.old_xfr_alloc_sts_no(), dtlR.xfr_alloc_sts_no()));
			dtlR.xfr_alloc_sts_no(null);
			dtlR.inst_bndl_to_peg_no(dtlR.inst_bndl_peg_no());
			dtlR.inst_bndl_peg_no(null);
		}
		return row;
	}

	/**
	 * 行コピーの引き継ぎ設定
	 */
	@Override
	protected List<java.lang.String> getNotInheritCols(String type, MCContainer cont) {
		List<String> colL = super.getNotInheritCols(type, cont);
		if (isSame(type, NOT_INHERIT_TYPE_COPY_ROW)) {
			if (cont == getDtlL()) {
				colL.add(DtlR.$peg_no);
				colL.add(DtlR.$pr_sts_typ);
				colL.add(DtlR.$pr_sts_typ_nm);
				colL.add(DtlR.$prov_schd_no);
				colL.add(DtlR.$ret_prov_schd_no);
				colL.add(DtlR.$dlv_slip_no);
				colL.add(DtlR.$dlv_slip_d_no);
				colL.add(DtlR.$disp_seq);
				colL.add(DtlR.$no_alloc_flg);
				colL.add(DtlR.$last_wms_flg);
			}
		}
		else if (isSame(type, NOT_INHERIT_TYPE_REF_UPD)) {
			if (cont == getHdrR()) {
				colL.add(HdrR.$xfr_inst_no);
				colL.add(HdrR.$xfr_schd_dt);
				colL.add(HdrR.$xfr_inst_dt);
				colL.add(HdrR.$inst_print);
				colL.add(HdrR.$dlv_print);
				colL.add(HdrR.$pick_print);
				colL.add(HdrR.$inst_prnt_flg);
				colL.add(HdrR.$dlv_prnt_flg);
				colL.add(HdrR.$pick_prnt_flg);
				colL.add(HdrR.$do_dlv_print);
				colL.add(HdrR.$do_inst_print);
				colL.add(HdrR.$do_pick_print);
			}
			else if (cont == getDtlL()) {
				colL.add(DtlR.$pr_sts_typ);
				colL.add(DtlR.$pr_sts_typ_nm);
				colL.add(DtlR.$base_unit_act_qty);
				colL.add(DtlR.$schd_unit_cd);
				colL.add(DtlR.$schd_unit_nm);
				colL.add(DtlR.$schd_unit_dec_place);
				colL.add(DtlR.$schd_qty);
				colL.add(DtlR.$xfr_alloc_sts_no);
				colL.add(DtlR.$old_xfr_alloc_sts_no);
				colL.add(DtlR.$xfr_inst_d_no);
				colL.add(DtlR.$prov_schd_no);
				colL.add(DtlR.$ret_prov_schd_no);
				colL.add(DtlR.$xfr_schd_no);
				colL.add(DtlR.$xfr_src_typ);
				colL.add(DtlR.$xfr_src_typ_nm);
				colL.add(DtlR.$xfr_src_no);
				colL.add(DtlR.$dlv_slip_no);
				colL.add(DtlR.$dlv_slip_d_no);
				colL.add(DtlR.$io_schd_pr_no);
				colL.add(DtlR.$disp_seq);
				colL.add(DtlR.$inst_bndl_peg_no);
				colL.add(DtlR.$inst_bndl_to_peg_no);
				colL.add(DtlR.$no_alloc_flg);
				colL.add(DtlR.$last_wms_flg);
			}
		}
		colL.remove(DtlR.$alloc_sts_upd_cntr);
		return colL;
	}

	protected void setCopyFlg() {
		final MCList<DtlR> dtlL = exceptEmpty(getDtlL());
		// 初期化
		dtlL.forEach(r -> r.copy_flg(false));

		MCIndexKey idx = dtlL.createIndex(DtlR.$old_xfr_alloc_sts_no);
		for (DtlR r : dtlL) {
			if (Dtl_itm_p_PPanel.isItmFixLight(r.getGUIIndex()) && !r.copy_flg()) {
				MCList<DtlR> l = dtlL.subList(idx, r.xfr_alloc_sts_no());
				if (!l.isEmpty()) {
					// コピー元、コピー先のフラグを立てる
					// フラグがオンの行は打切不可
					r.copy_flg(true);
					l.forEach(rr -> rr.copy_flg(true));
				}
			}
		}
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			callMS_MSBEL1010_Ins01();
		}
		else {
			callMS_MSBEL1010_Upd01();
		}
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBEL1010_Del01();
	}

	protected MCList<DtlR> getSelectPckg(DtlR dtl) {
		// 同一明細まとめ選択では補完は考慮しない
		return getDtlL().subList(createDtlRowMatcher(dtl));
	}

	/**
	 * 梱包数量提案処理
	 */
	protected void execPckgProp() {
		MCList<DtlR> selectOnL = getDtlL().subList(DtlR.$ttl_flg, true);

		if (!checkPckgL(selectOnL)) {
			return;
		}

		MCList<DtlR> selectOffL = getDtlL().subList(DtlR.$ttl_flg, false);

		// 対象行を補完する
		editPckgL(selectOnL);

		// 選択チェック行をまとめ条件に従ってまとめた行を作成する
		MCGroupByPolicy pckgPolicy = new MCGroupByPolicy(getPckgGroupColumn());
		pckgPolicy.sum(DtlR.$base_unit_qty);
		MCList<DtlR> bndlDestL = selectOnL.groupBy(pckgPolicy); // まとめた先の行の一覧

		for (DtlR destR : bndlDestL) {
			// まとめた先の行の設定
			// 梱包数量の計算
			MCNumber pckgQty = rvrsBaseUnitConv(
					destR.base_unit_qty(),
					destR.pckg_unit_conv_base_qty(),
					destR.pckg_unit_conv_qty(),
					destR.pckg_unit_dec_place(),
					MAC_RND_TYP.RNDUP.value());

			// 基準単位数量の計算
			MCNumber baseQty = convToBaseUnit(
					pckgQty,
					destR.pckg_unit_conv_base_qty(),
					destR.pckg_unit_conv_qty(),
					destR.base_unit_dec_place(),
					destR.base_unit_rnd_typ());

			destR.lot_none_flg(false);
			destR.trd_unit_cd(destR.pckg_unit_cd());
			destR.trd_unit_nm(destR.pckg_unit_nm());
			destR.trd_unit_conv_base_qty(destR.pckg_unit_conv_base_qty());
			destR.trd_unit_conv_qty(destR.pckg_unit_conv_qty());
			destR.trd_unit_dec_place(destR.pckg_unit_dec_place());
			destR.trd_unit_qty(pckgQty);
			destR.alloc_flg(false);
			destR.schd_abort_flg(false);
			destR.inst_abort_flg(false);
			destR.inst_bndl_flg(true);
			destR.base_unit_qty(baseQty);
			destR.base_unit_act_qty(MCNumber.ZERO);
			destR.pckg_unit_qty(pckgQty);
			destR.schd_qty(MCNumber.ZERO);

			destR.setStatus(Status.CREATE);
			if (isNull(destR.inst_bndl_peg_no())) {
				destR.inst_bndl_peg_no(_inst_bndl_peg_no++);
			}

			// まとめた先の行からまとめ元の行の一覧を取得する
			MCList<DtlR> bndlSrcL = selectOnL.subList(createDtlRowMatcher(destR));
			// まとめ元の行にひとつでも引当オンの行があればまとめ先もオンにする
			boolean alloc_flg = false;
			boolean wms_flg = false, wms_tgt_flg = false;
			for (DtlR srcR : bndlSrcL) {
				alloc_flg |= srcR.alloc_flg();
				wms_flg |= srcR.wms_flg();
				wms_tgt_flg |= srcR.wms_tgt_flg();
			}
			destR.alloc_flg(alloc_flg);
			destR.wms_flg(wms_flg);
			destR.wms_tgt_flg(wms_tgt_flg);

			// まとめられた元の行の設定
			for (DtlR srcR : bndlSrcL) {
				if (isNull(srcR.xfr_alloc_sts_no())) {
					// 行追加された行や行コピー先の行はまとめられたら削除する
					MCList<DtlR> instBndlL = _instBndlL.subList(DtlR.$inst_bndl_to_peg_no, srcR.inst_bndl_peg_no());
					if (!instBndlL.isEmpty()) {
						instBndlL.setNumber(DtlR.$inst_bndl_to_peg_no, destR.inst_bndl_peg_no());
					}
					selectOnL.remove(srcR);
				}
				else {
					srcR.setStatus(Status.DELETE);
					srcR.ttl_flg(false);
					srcR.inst_bndl_src_flg(true);
					srcR.inst_bndl_to_peg_no(destR.inst_bndl_peg_no());
				}
			}
		}
		_instBndlL.addAll(selectOnL);
		getDtlL().setAll(bndlDestL);
		getDtlL().addAll(selectOffL);
	}

	/**
	 * GroupBy条件となる在庫関連項目でNullのものがあれば補完する
	 * @param selectOnL
	 */
	protected void editPckgL(MCList<DtlR> selectOnL) {
		for (DtlR r : selectOnL) {
			if (isNull(r.gd_cd())) {
				setValueEx(columnDtl_gd_cd, r.getGUIIndex(), getDefaultFeedStkGd().gd_cd());
			}
			if (isNull(r.quality_typ())) {
				setValueEx(columnDtl_quality_typ, r.getGUIIndex(), MAC_QUALITY_TYP.GOOD.value());
			}
			if (isNull(r.stk_id_typ())) {
				setValueEx(columnDtl_stk_id_typ, r.getGUIIndex(), MSC_STK_ID_TYP.COSTK.value());
			}
			if (isNull(r.stk_bp_cd())) {
				r.stk_bp_cd(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.gi_str_ln_cd())) {
				r.gi_str_ln_cd(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.gr_str_ln_cd())) {
				r.gr_str_ln_cd(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.sno1())) {
				r.sno1(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.sno2())) {
				r.sno2(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.sno3())) {
				r.sno3(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.sno4())) {
				r.sno4(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.alloc_sno1())) {
				r.alloc_sno1(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.alloc_sno2())) {
				r.alloc_sno2(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.alloc_sno3())) {
				r.alloc_sno3(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.alloc_sno4())) {
				r.alloc_sno4(MAC_STR.NULL_VAL.value());
			}
		}
	}

	protected String[] getPckgGroupColumn() {
		// 梱包数量提案のGroupBy条件
		// 実装を簡単にするため名称項目等まで含める
		return new String[] {
				DtlR.$itm_cd,
				DtlR.$itm_sub1,
				DtlR.$itm_sub2,
				DtlR.$itm_sub3,
				DtlR.$itm_nm,
				DtlR.$lot_mng_typ,
				DtlR.$sublot_mng_typ,
				DtlR.$sno1_mng_typ,
				DtlR.$sno2_mng_typ,
				DtlR.$sno3_mng_typ,
				DtlR.$sno4_mng_typ,
				DtlR.$crt_lot_flg,
				DtlR.$lot_no,
				DtlR.$sublot_no,
				DtlR.$def_ver_flg,
				DtlR.$ver_no,
				DtlR.$base_unit_cd,
				DtlR.$base_unit_nm,
				DtlR.$base_unit_dec_place,
				DtlR.$base_unit_rnd_typ,
				DtlR.$pckg_unit_cd,
				DtlR.$pckg_unit_nm,
				DtlR.$pckg_unit_conv_base_qty,
				DtlR.$pckg_unit_conv_qty,
				DtlR.$pckg_unit_dec_place,
				DtlR.$cont_fctr_flg,
				DtlR.$cont_fctr_unit_cd,
				DtlR.$cont_fctr_unit_nm,
				DtlR.$cont_fctr_dec_place,
				DtlR.$cont_fctr_rnd_typ,
				DtlR.$act_cont_fctr,
				DtlR.$std_cont_fctr,
				DtlR.$gi_loc_cd,
				DtlR.$gi_loc_nm,
				DtlR.$gi_site_cd,
				DtlR.$gi_sppl_cd,
				DtlR.$gi_stk_arrv_bp_cd,
				DtlR.$gi_stk_arrv_bp_nm,
				DtlR.$gi_str_ln_tgt_flg,
				DtlR.$gi_str_ln_cd,
				DtlR.$gi_str_ln_nm,
				DtlR.$gi_str_ln_cd_none_flg,
				DtlR.$gr_str_ln_cd,
				DtlR.$gr_str_ln_nm,
				DtlR.$gr_str_ln_cd_none_flg,
				DtlR.$gd_cd,
				DtlR.$gd_nm,
				DtlR.$quality_typ,
				DtlR.$quality_typ_nm,
				DtlR.$sno1_null_flg,
				DtlR.$sno1,
				DtlR.$sno2_null_flg,
				DtlR.$sno2,
				DtlR.$sno3_null_flg,
				DtlR.$sno3,
				DtlR.$sno4_null_flg,
				DtlR.$sno4,
				DtlR.$alloc_sno1,
				DtlR.$alloc_sno2,
				DtlR.$alloc_sno3,
				DtlR.$alloc_sno4,
				DtlR.$stk_id_typ,
				DtlR.$stk_id_typ_nm,
				DtlR.$stk_bp_cd,
				DtlR.$stk_bp_nm,
				DtlR.$rsn_cd,
				DtlR.$rsn_nm,
				DtlR.$acxfr_gi_flg,
				DtlR.$bd_dpt_cd,
				DtlR.$bd_dpt_nm,
				DtlR.$prov_typ,
				DtlR.$prov_typ_nm,
				DtlR.$prov_basis_typ,
				DtlR.$prov_basis_typ_nm,
				DtlR.$ret_prov_typ,
				DtlR.$ret_prov_typ_nm,
				DtlR.$ret_prov_basis_typ,
				DtlR.$ret_prov_basis_typ_nm
		};
	}

	protected boolean checkPckgL(MCList<DtlR> pckgL) {
		if (pckgL.isEmpty()) {
			dialog(new MCMessage(FXBAP0038));
			return false;
		}

		MCMessageList msgList = checkPckgReq(pckgL);
		if (!msgList.isEmpty()) {
			message(msgList);
			return false;
		}
		return true;
	}

	protected MCMessageList checkPckgReq(MCList<DtlR> pckgL) {
		MCMessageList msgList = new MCMessageList();
		for (DtlR r : pckgL) {
			msgList.addAll(checkReq(r.getGUIIndex(), columnDtl_itm_cd));
			msgList.addAll(checkReq(r.getGUIIndex(), columnDtl_itm_sub1));
			msgList.addAll(checkReq(r.getGUIIndex(), columnDtl_itm_sub2));
			msgList.addAll(checkReq(r.getGUIIndex(), columnDtl_itm_sub3));
			msgList.addAll(checkReq(r.getGUIIndex(), columnDtl_trd_unit_cd));
			msgList.addAll(checkReq(r.getGUIIndex(), columnDtl_trd_unit_qty));
		}
		return msgList;
	}

	// -- RowMatcher----------------------------------------------------------//
	protected MCRowMatcher<DtlR> createDtlRowMatcher(DtlR r) {
		return new DtlRowMatcher<DtlR>(r);
	}

	public class DtlRowMatcher<R extends DtlR> implements MCRowMatcher<R> {
		protected DtlR _dtlR;

		public DtlRowMatcher(DtlR r) {
			this._dtlR = r;
		}

		@Override
		public boolean match(R row) {
			// 梱包数量提案のまとめ条件
			if (row.isStatusDelete() && !row.inst_bndl_src_flg()
					|| isNullOrNullVal(row.itm_cd())
					|| !isSame(_dtlR.itm_cd(), row.itm_cd())
					|| !isSame(_dtlR.itm_sub1(), row.itm_sub1())
					|| !isSame(_dtlR.itm_sub2(), row.itm_sub2())
					|| !isSame(_dtlR.itm_sub3(), row.itm_sub3())
					|| !isSame(_dtlR.lot_no(), row.lot_no())
					|| !isSame(_dtlR.sublot_no(), row.sublot_no())
					|| !isSame(_dtlR.ver_no(), row.ver_no())
					|| !isSame(_dtlR.gi_loc_cd(), row.gi_loc_cd())
					|| !isSame(_dtlR.gi_stk_arrv_bp_cd(), row.gi_stk_arrv_bp_cd())
					|| !isSame(_dtlR.gi_str_ln_cd(), row.gi_str_ln_cd())
					|| !isSame(_dtlR.gi_str_ln_cd_none_flg(), row.gi_str_ln_cd_none_flg())
					|| !isSame(_dtlR.gr_str_ln_cd(), row.gr_str_ln_cd())
					|| !isSame(_dtlR.gr_str_ln_cd_none_flg(), row.gr_str_ln_cd_none_flg())
					|| !isSame(_dtlR.gd_cd(), row.gd_cd())
					|| !isSame(_dtlR.quality_typ(), row.quality_typ())
					|| !isSame(_dtlR.sno1_null_flg(), row.sno1_null_flg())
					|| !isSame(_dtlR.sno1(), row.sno1())
					|| !isSame(_dtlR.sno2_null_flg(), row.sno2_null_flg())
					|| !isSame(_dtlR.sno2(), row.sno2())
					|| !isSame(_dtlR.sno3_null_flg(), row.sno3_null_flg())
					|| !isSame(_dtlR.sno3(), row.sno3())
					|| !isSame(_dtlR.sno4_null_flg(), row.sno4_null_flg())
					|| !isSame(_dtlR.sno4(), row.sno4())
					|| !isSame(_dtlR.alloc_sno1(), row.alloc_sno1())
					|| !isSame(_dtlR.alloc_sno2(), row.alloc_sno2())
					|| !isSame(_dtlR.alloc_sno3(), row.alloc_sno3())
					|| !isSame(_dtlR.alloc_sno4(), row.alloc_sno4())
					|| !isSame(_dtlR.stk_id_typ(), row.stk_id_typ())
					|| !isSame(_dtlR.stk_bp_cd(), row.stk_bp_cd())
					|| !isSame(_dtlR.rsn_cd(), row.rsn_cd())
					|| !isSame(_dtlR.bd_dpt_cd(), row.bd_dpt_cd())
					|| !isSame(_dtlR.prov_typ(), row.prov_typ())
					|| !isSame(_dtlR.prov_basis_typ(), row.prov_basis_typ())
					|| !isSame(_dtlR.ret_prov_typ(), row.ret_prov_typ())
					|| !isSame(_dtlR.ret_prov_basis_typ(), row.ret_prov_basis_typ())) {
				return false;
			}
			return true;
		}
	}

	//********************** 画面部品の初期設定 **************************
	@Override
	protected void setupParts() {
		super.setupParts();

		Hdr_inst_usr_dpt_p_PPanel.setRelateBeans(Hdr_xfr_inst_dt);

		Dtl_lot_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_lot_mng_typ,
				columnDtl_sublot_mng_typ);
		Dtl_sno_wrk_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_sno1_mng_typ,
				columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ);
		Dtl_alloc_sno_wrk_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_sno1_mng_typ,
				columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ);
		Dtl_ver_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, null,
				columnDtl_def_ver_flg);
		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(
			columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3,
			columnDtl_trd_unit_cd, columnDtl_trd_unit_dec_place, columnDtl_trd_unit_rnd_typ,
			columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty, columnDtl_base_unit_cd);
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
				columnDtl_trd_unit_qty, columnDtl_trd_unit_conv_base_qty,
				columnDtl_trd_unit_conv_qty);
		Dtl_base_unit_act_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place);
		Dtl_pckg_unit_qty_p_PPanel.setRelateBeans(columnDtl_pckg_unit_cd,
				columnDtl_pckg_unit_dec_place);
		Dtl_schd_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place);
		Dtl_act_cont_qty_p_PPanel.setRelateBeans(columnDtl_cont_fctr_flg,
				columnDtl_base_unit_qty, columnDtl_std_cont_fctr, columnDtl_act_cont_fctr,
				columnDtl_cont_fctr_dec_place, columnDtl_cont_fctr_rnd_typ);
		Dtl_std_cont_qty_p_PPanel.setRelateBeans(columnDtl_cont_fctr_flg,
				columnDtl_base_unit_qty, columnDtl_std_cont_fctr, null,
				columnDtl_cont_fctr_dec_place, columnDtl_cont_fctr_rnd_typ);
		Dtl_gi_str_ln_p_PPanel.setRelateBeans(columnDtl_gi_loc_cd,
				columnDtl_gi_str_ln_tgt_flg);
		Dtl_gr_str_ln_p_PPanel.setRelateBeans(Hdr_gr_loc_cd, Hdr_gr_str_ln_tgt_flg);
		Dtl_stk_bp_p_PPanel.setRelateBeans(columnDtl_stk_id_typ);
	}

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		
		linkBeansToISPanelCustom(Hdr_gr_loc_cd);
	}

	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		
		if (beans == Hdr_gr_loc_cd) {
			setGrLocBind(row);
		}
		
		return row;
	}

	//********************** 共通処理(common) **************************
	// ステータス(status)
	protected boolean isInsStatus() {
		return isSame(getStatus(), INS);
	}
	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}
	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setInitHdrR();
		setBtnMode();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		ScreenOpePanel.focusFirstComponent();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setInitHdrR();
		setBtnMode();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		CndPanel.focusFirstComponent();
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setBtnMode();
		CndPanel.focusFirstComponent();
	}

	/**
	 * 行追加ボタンで追加された行(新規追加行)かどうか
	 * @param r
	 * @return 
	 */
	protected boolean isNewRow(DtlR r) {
		return isNull(r.xfr_alloc_sts_no())
				&& isNull(r.old_xfr_alloc_sts_no());
	}
	/**
	 * 予定なしの行かどうか
	 * @param r
	 * @return 
	 */
	protected boolean isNonSchdRow(DtlR r) {
		return isNullOrNullVal(r.xfr_schd_no());
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
				&& isNullOrNullVal(hdrR.gr_sppl_cd()))
				|| isSame(dtlR.gi_sppl_cd(), hdrR.gr_sppl_cd());
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
				&& !isNullOrNullVal(hdrR.gr_sppl_cd());
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
				&& isNullOrNullVal(hdrR.gr_sppl_cd());
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
				&& !isNullOrNullVal(hdrR.gr_sppl_cd())
				&& !isSame(dtlR.gi_sppl_cd(), hdrR.gr_sppl_cd());
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
						hdrR.gr_sppl_cd(),
						hdrR.gr_cur_cd(),
						hdrR.wg_cd(),
						hdrR.xfr_schd_dt(),
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
	// 
	//********************** コンボボックスの絞込(combo) **************************
	// 初期設定
	@Override
	protected void listInit() {
		super.listInit();
		getDtl_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_xfr_inst_dt);
		getDtl_stk_id_typ_ListPutter().putBind(mcframe.commonMSUA.MSUAC0060.MSUAC_List.StkIdTypCols.$i_gr_sppl_cd, Hdr_gr_sppl_cd);
		getDtl_prov_typ_ListPutter().putBind(mcframe.commonMSUA.MSUAC0060.MSUAC_List.ProvTypCols.$i_onr_prsppl_flg, Hdr_gr_onr_prsppl_flg);
	}

	// 検索対象区分
	@Override
	public MCList<?> getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			addListLogicCnd(row, new MSC_STK_SRCH_TGT_TYP[]{MSC_STK_SRCH_TGT_TYP.XFR_SCHD_NO});
		}
		else {
			addListLogicCnd(row, new MSC_STK_SRCH_TGT_TYP[]{MSC_STK_SRCH_TGT_TYP.XFR_INST_NO});
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

	//********************** 項目の初期値(init) **************************
	@Override
	protected void valueInit() {
		super.valueInit();
		setSrchTgtTyp();
		setInitHdrR();
	}

	protected void setInitHdrR() {
		if (Cnd_ope_INS.isSelected()) {
			setValueEx(Hdr_xfr_inst_dt, getToday());
		}
		setValueEx(Btn_select_pckg, false);
	}

	@Override
	public void screenClearBody() {
		super.screenClearBody();
		_instBndlL.clear();
	}
	//********************** イベント(event) **************************
	// ------------ ヘッダ
	protected void setSrchTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {
			setValueEx(Cnd_srch_tgt_typ_nm, MSC_STK_SRCH_TGT_TYP.XFR_SCHD_NO.name());
		}
		else {
			setValueEx(Cnd_srch_tgt_typ_nm, MSC_STK_SRCH_TGT_TYP.XFR_INST_NO.name());
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		_instBndlL.clear();
		setIndivPrnt();
	}
	
	/**
	 * 個別発行を設定する。
	 */
	protected void setIndivPrnt(){
		setValueEx(Btn_indiv_prnt_flg, false);
	}

	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		if (!Cnd_ope_INS.isSelected() && !isNull(getHdrR().xfr_inst_no())) {
			setValueEx(Cnd_srch_tgt_no, getHdrR().xfr_inst_no());
		}
	}

	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		setSrchTgtTyp();
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
				_instBndlL.clear();
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
			if (confirmRegDataClear()) {
				_instBndlL.clear();
				return true;
			}
			else {
				return false;
			}
		}

		return true;
	}

	@Override
	public void doHdr_trd_cd_NC(MCEventInfo info) {
		super.doHdr_trd_cd_NC(info);

		setValueEx(Hdr_gr_loc_cd, null);
	}

	@Override
	public void doHdr_gr_loc_cd_NC(MCEventInfo info) {
		super.doHdr_gr_loc_cd_NC(info);

		getDtlL().clear();
		DtlTable.fillSpace();
	}

	// ------------ 明細
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Dtl_itm_p_PPanel.addItmLCListner(this);
		columnDtl_sno1.addLCListener(this);
		columnDtl_sno2.addLCListener(this);
		columnDtl_sno3.addLCListener(this);
		columnDtl_sno4.addLCListener(this);
		columnDtl_sno1_null_flg.addNCListener(this);
		columnDtl_sno2_null_flg.addNCListener(this);
		columnDtl_sno3_null_flg.addNCListener(this);
		columnDtl_sno4_null_flg.addNCListener(this);
		columnDtl_base_unit_qty.addNCListener(this);
		columnDtl_alloc_sno1.addVCListener(this);
		columnDtl_alloc_sno2.addVCListener(this);
		columnDtl_alloc_sno3.addVCListener(this);
		columnDtl_alloc_sno4.addVCListener(this);
		columnDtl_alloc_sno1.addLCListener(this);
		columnDtl_alloc_sno2.addLCListener(this);
		columnDtl_alloc_sno3.addLCListener(this);
		columnDtl_alloc_sno4.addLCListener(this);
	}

	@Override
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (vc == columnDtl_alloc_sno1) {
			return doDtl_alloc_sno1_VC(info);
		}
		if (vc == columnDtl_alloc_sno2) {
			return doDtl_alloc_sno2_VC(info);
		}
		if (vc == columnDtl_alloc_sno3) {
			return doDtl_alloc_sno3_VC(info);
		}
		if (vc == columnDtl_alloc_sno4) {
			return doDtl_alloc_sno4_VC(info);
		}
		return super.doVCEvent(vc, info);
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == columnDtl_sno1_null_flg) {
			doDtl_sno1_null_flg_NC(info);
		}
		else if (nc == columnDtl_sno2_null_flg) {
			doDtl_sno2_null_flg_NC(info);
		}
		else if (nc == columnDtl_sno3_null_flg) {
			doDtl_sno3_null_flg_NC(info);
		}
		else if (nc == columnDtl_sno4_null_flg) {
			doDtl_sno4_null_flg_NC(info);
		}
		else if (nc == columnDtl_base_unit_qty) {
			doDtl_base_unit_qty_NC(info);
		}
	}

	protected boolean doDtl_alloc_sno1_VC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		if (!isSame(info.getNewValue(), r.sno1())
				&& !isNull(r.sno1())
				&& !isNull(info.getNewValue())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}

	protected boolean doDtl_alloc_sno2_VC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		if (!isSame(info.getNewValue(), r.sno2())
				&& !isNull(r.sno2())
				&& !isNull(info.getNewValue())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}

	protected boolean doDtl_alloc_sno3_VC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		if (!isSame(info.getNewValue(), r.sno3())
				&& !isNull(r.sno3())
				&& !isNull(info.getNewValue())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}

	protected boolean doDtl_alloc_sno4_VC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		if (!isSame(info.getNewValue(), r.sno4())
				&& !isNull(r.sno4())
				&& !isNull(info.getNewValue())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);

		setBtnMode();
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (Dtl_itm_p_PPanel.isItm(lc)
				&& Dtl_itm_p_PPanel.isItmFix(info.getEventIndex())) {
			doDtl_itm_cd(info);
		}
		else if (lc == columnDtl_sno1) {
			doDtl_sno1_LC(info);
		}
		else if (lc == columnDtl_sno2) {
			doDtl_sno2_LC(info);
		}
		else if (lc == columnDtl_sno3) {
			doDtl_sno3_LC(info);
		}
		else if (lc == columnDtl_sno4) {
			doDtl_sno4_LC(info);
		}
		else if (lc == columnDtl_alloc_sno1) {
			doDtl_alloc_sno1_LC(info);
		}
		else if (lc == columnDtl_alloc_sno2) {
			doDtl_alloc_sno2_LC(info);
		}
		else if (lc == columnDtl_alloc_sno3) {
			doDtl_alloc_sno3_LC(info);
		}
		else if (lc == columnDtl_alloc_sno4) {
			doDtl_alloc_sno4_LC(info);
		}

	}

	@Override
	public void doDtl_ttl_flg_NC(MCEventInfo info){
		super.doDtl_ttl_flg_NC(info);
		DtlR dtl = getDtlL().get(info.getEventIndex());

		if (getBtnR().select_pckg()) {
			getSelectPckg(dtl).setValue(DtlR.$ttl_flg, dtl.ttl_flg());
		}
	}

	protected void doDtl_itm_cd(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR dtlR = getDtlL().get(idx);
		HdrR hdrR = getHdrR();

		if (!isNull(dtlR.itm_cd())) {
			if (MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())) {
				setValueEx(columnDtl_quality_typ, idx, MAC_QUALITY_TYP.GOOD.value());
			}
			// 場所を未入力でも指図が登録できるため、品目入力のタイミングでも判断する
			boolean wmsFlg = false;
			if (isNull(dtlR.gi_loc_cd())) {
			// 場所未定でも物流グループ単位でWMS対象なら、WMS対象にする
				wmsFlg = MSUCP_SCMLinkUtil.getWmsFlg(MAC_IF_PROC_TYP.WMS_XFR_INST_SEND.value(), null, getHdrR().lg_grp_cd(), null, null, getToday(), this);
			}
			else {
				wmsFlg = MSUCP_SCMLinkUtil.getWmsFlg(MAC_IF_PROC_TYP.WMS_XFR_INST_SEND.value(), dtlR.gi_loc_cd(), null, null, null, getToday(), this);
			}
			setValueEx(columnDtl_wms_flg, idx, wmsFlg);
			setValueEx(columnDtl_wms_tgt_flg, idx, wmsFlg);
			setDefStrLnCd(dtlR);
		}
		else {
			setValueEx(columnDtl_quality_typ, idx, null);
		}

		setProvInfo(idx, dtlR);
		setRetProvInfo(idx, dtlR);
	}

	@Override
	public void doDtl_lot_none_flg_NC(MCEventInfo info){
		super.doDtl_lot_none_flg_NC(info);
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);

		if (r.lot_none_flg()) {
			setValueEx(columnDtl_lot_no, index, null);
			setValueEx(columnDtl_sublot_no, index, null);
		}
	}

	@Override
	public void doDtl_schd_abort_flg_NC(MCEventInfo info) {
		super.doDtl_schd_abort_flg_NC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (Cnd_ope_UPD.isSelected() && r.schd_abort_flg()) {
			setValueEx(columnDtl_check, idx, false);
			setValueEx(columnDtl_ttl_flg, idx, false);
		}
	}

	@Override
	public void doDtl_inst_abort_flg_NC(MCEventInfo info) {
		super.doDtl_inst_abort_flg_NC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (Cnd_ope_UPD.isSelected() && r.inst_abort_flg()) {
			setValueEx(columnDtl_check, idx, false);
			setValueEx(columnDtl_ttl_flg, idx, false);
		}
	}

	@Override
	public void doDtl_gi_loc_cd_LC(MCEventInfo info) {
		super.doDtl_gi_loc_cd_LC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.gi_loc_cd())) {
			setValueEx(columnDtl_alloc_flg, idx, false);
			setValueEx(columnDtl_gi_stk_arrv_bp_cd, idx, null);
			// 場所未定でも物流グループ単位でWMS対象なら、WMS対象にする
			boolean wmsFlg = MSUCP_SCMLinkUtil.getWmsFlg(MAC_IF_PROC_TYP.WMS_XFR_INST_SEND.value(), null, getHdrR().lg_grp_cd(), null, null, getToday(), this);
			setValueEx(columnDtl_wms_flg, idx, wmsFlg);
			setValueEx(columnDtl_wms_tgt_flg, idx, wmsFlg);
		}
		else {
			if (isNull(r.gi_sppl_cd())) {
				setValueEx(columnDtl_gi_stk_arrv_bp_cd, idx, MAC_STR.NULL_VAL.value());
			}
			else {
				setValueEx(columnDtl_gi_stk_arrv_bp_cd, idx, null);
			}
			boolean wmsFlg = MSUCP_SCMLinkUtil.getWmsFlg(MAC_IF_PROC_TYP.WMS_XFR_INST_SEND.value(), r.gi_loc_cd(), null, null, null, getToday(), this);
			setValueEx(columnDtl_wms_flg, idx, wmsFlg);
			setValueEx(columnDtl_wms_tgt_flg, idx, wmsFlg);
		}
		if (isNewRow(r)) {
			setValueEx(columnDtl_stk_id_typ, idx, null);
		}
	}

	@Override
	public void doDtl_gi_sppl_cd_LC(MCEventInfo info) {
		super.doDtl_gi_sppl_cd_LC(info);
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);

		setProvInfo(index, r);
	}

	protected void doDtl_sno1_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		setValueEx(columnDtl_alloc_sno1, idx, r.sno1());
	}

	protected void doDtl_sno2_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		setValueEx(columnDtl_alloc_sno2, idx, r.sno2());
	}

	protected void doDtl_sno3_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		setValueEx(columnDtl_alloc_sno3, idx, r.sno3());
	}

	protected void doDtl_sno4_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		setValueEx(columnDtl_alloc_sno4, idx, r.sno4());
	}

	protected void doDtl_sno1_null_flg_NC(MCEventInfo info){
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.sno1_null_flg()) {
			setValueEx(columnDtl_alloc_sno1, idx, r.sno1());
		}
	}

	protected void doDtl_sno2_null_flg_NC(MCEventInfo info){
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.sno2_null_flg()) {
			setValueEx(columnDtl_alloc_sno2, idx, r.sno2());
		}
	}

	protected void doDtl_sno3_null_flg_NC(MCEventInfo info){
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.sno3_null_flg()) {
			setValueEx(columnDtl_alloc_sno3, idx, r.sno3());
		}
	}

	protected void doDtl_sno4_null_flg_NC(MCEventInfo info){
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.sno4_null_flg()) {
			setValueEx(columnDtl_alloc_sno4, idx, r.sno4());
		}
	}

	protected void doDtl_base_unit_qty_NC(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		// 梱包数量
		setValueEx(columnDtl_pckg_unit_qty, idx,
			rvrsBaseUnitConv(
				r.base_unit_qty(), r.pckg_unit_conv_base_qty(), r.pckg_unit_conv_qty(),
				r.pckg_unit_dec_place(), MAC_RND_TYP.RNDUP.value())
		);
	}

	protected void doDtl_alloc_sno1_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (isNull(r.sno1())) {
			setValueEx(columnDtl_sno1, idx, r.alloc_sno1());
		}
	}

	protected void doDtl_alloc_sno2_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (isNull(r.sno2())) {
			setValueEx(columnDtl_sno2, idx, r.alloc_sno2());
		}
	}

	protected void doDtl_alloc_sno3_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (isNull(r.sno3())) {
			setValueEx(columnDtl_sno3, idx, r.alloc_sno3());
		}
	}

	protected void doDtl_alloc_sno4_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (isNull(r.sno4())) {
			setValueEx(columnDtl_sno4, idx, r.alloc_sno4());
		}
	}

	@Override
	public void doDtl_stk_id_typ_LC(MCEventInfo info) {
		super.doDtl_stk_id_typ_LC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
			setValueEx(columnDtl_stk_bp_cd, idx, MAC_STR.NULL_VAL.value());
		}
		else if (MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
			setValueEx(columnDtl_stk_bp_cd, idx, r.gi_sppl_cd());
		}
		else {
			setValueEx(columnDtl_stk_bp_cd, idx, null);
		}

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
	public void doDtl_gi_stk_arrv_bp_cd_LC(MCEventInfo info) {
		super.doDtl_gi_stk_arrv_bp_cd_LC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		setProvInfo(idx, r);
		setRetProvInfo(idx, r);
	}

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
			setValueEx(columnDtl_prov_basis_typ, idx, getHdrR().gr_prov_basis_typ());
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
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(crtDtlCellConfig());
	}

	protected DtlCellConfig crtDtlCellConfig() {
		return new DtlCellConfig();
	}

	protected class DtlCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			// ヘッダの必須項目が埋まってなければ一覧は入力不可
			if (!headerFills()) {
				return MCMode.READ_ONLY;
			}

			DtlR r = (DtlR) table.getBaseTable().getRow(index);
			HdrR hdrR = getHdrR();
			if (isInsStatus() || isUpdStatus()) {
				//----- 入力を不可にする制御
				// 新規追加行の場合
				if (isNewRow(r)) {
					if (column == columnDtl_schd_abort_flg || column == columnDtl_inst_abort_flg) {
						return MCMode.READ_ONLY;
					}
					if (r.inst_bndl_flg()) {
						if (isProvRtn(r) || isProvDD(r)) {
							if (column == columnDtl_gi_loc_cd
									|| column == columnDtl_gi_stk_arrv_bp_cd
									|| column == columnDtl_stk_id_typ) {
								return MCMode.READ_ONLY;
							}
						}
					}
				}
				// 新規追加行でない場合
				else {
					if (isSchdROCol(column)) {
						return MCMode.READ_ONLY;
					}
					if (isProvRtn(r) || isProvDD(r)) {
						if (column == columnDtl_gi_loc_cd
								|| column == columnDtl_gi_stk_arrv_bp_cd
								|| column == columnDtl_stk_id_typ) {
							return MCMode.READ_ONLY;
						}
					}
				}
				if (!isNonSchdRow(r)) {
					if (column == columnDtl_rsn_cd) {
						return MCMode.READ_ONLY;
					}
				}
				// ＷＧ間依頼、受注の場合は、単位の変更及び梱包数量提案は不可
				if (column == columnDtl_trd_unit_cd || column == columnDtl_ttl_flg) {
					if (MSC_XFR_SRC_TYP.isWG_RQST(r.xfr_src_typ()) || MSC_XFR_SRC_TYP.isSLO(r.xfr_src_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				// 分割された行の場合、打切フラグは入力できない
				if (!isNull(r.inst_bndl_to_peg_no())
						|| !isNull(r.old_xfr_alloc_sts_no()) || r.copy_flg()) {
					if (column == columnDtl_schd_abort_flg || column == columnDtl_inst_abort_flg) {
						return MCMode.READ_ONLY;
					}
				}

				// 移動または支給返品の場合、支給区分は入力できない
				if (isXfr(r) || isProvRtn(r)) {
					if (column == columnDtl_prov_typ) {
						return MCMode.READ_ONLY;
					}
				}

				// 完了行の場合
				if (MSC_PR_STS_TYP.isCOMP(r.pr_sts_typ())) {
					return MCMode.READ_ONLY;
				}

				// 一部完了行の場合
				if (MSC_PR_STS_TYP.isPART_COMP(r.pr_sts_typ())) {
					if (!(column == columnDtl_inst_abort_flg)) {
						return MCMode.READ_ONLY;
					}
				}

				// 引当をしない場合
				if (!r.alloc_flg()) {
					if (column == columnDtl_lot_none_flg) {
						return MCMode.READ_ONLY;
					}
				}

				// ロット指定無の場合
				if (r.lot_none_flg()) {
					if (column == columnDtl_lot_no
							|| column == columnDtl_sublot_no) {
						return MCMode.READ_ONLY;
					}
				}

				// 訂正時の打切は指図の全数打切扱いなので打切ＦＬＧ以外はRO
				if (Cnd_ope_UPD.isSelected() && r.inst_abort_flg()) {
					if (column != columnDtl_inst_abort_flg
						&& column != columnDtl_wms_flg) {
						return MCMode.READ_ONLY;
					}
				}

				// 梱包数量提案は登録するのみ可能
				if (!isEnableBtn_sprt_pckg_prop()) {
					if (column == columnDtl_ttl_flg) {
						return MCMode.READ_ONLY;
					}
				}

				// 梱包数量提案済の行は予定ありの行+単位と数量が入力不可の扱い
				if (r.inst_bndl_flg()) {
					if (isSchdROCol(column)
							|| column == columnDtl_rsn_cd
							|| column == columnDtl_trd_unit_qty
							|| column == columnDtl_trd_unit_cd) {
						return MCMode.READ_ONLY;
					}
				}

				// 梱包数量提案元の行は入力不可
				if (r.inst_bndl_src_flg()) {
					return MCMode.READ_ONLY;
				}

				// 社外かつ自社在庫の場合のみ入力可能
				if (isNull(r.gi_loc_cd()) || isNull(r.gi_sppl_cd()) || !MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
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

				if (!isNull(r.sno1()) && !r.sno1_null_flg()
						|| MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ())) {
					if (column == columnDtl_alloc_sno1) {
						return MCMode.READ_ONLY;
					}
				}

				if (!isNull(r.sno2()) && !r.sno2_null_flg()
						|| MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())) {
					if (column == columnDtl_alloc_sno2) {
						return MCMode.READ_ONLY;
					}
				}

				if (!isNull(r.sno3()) && !r.sno3_null_flg()
						|| MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())) {
					if (column == columnDtl_alloc_sno3) {
						return MCMode.READ_ONLY;
					}
				}

				if (!isNull(r.sno4()) && !r.sno4_null_flg()
						|| MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())) {
					if (column == columnDtl_alloc_sno4) {
						return MCMode.READ_ONLY;
					}
				}

				// 在庫識別区分がNULLまたは自社在庫または有償支給の場合
				if (isNull(r.stk_id_typ())
						|| MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())
						|| MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
					if (column == columnDtl_stk_bp_cd) {
						return MCMode.READ_ONLY;
					}
				}

				// 他勘定出庫の理由でない場合
				if (!r.acxfr_gi_flg()) {
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
				// 支給または直送支給の場合
				if (isProv(r) || isProvDD(r)) {
					if (column == columnDtl_prov_typ) {
						return MCMode.REQUIRED;
					}
				}
				// 取引パタン区分が支給返品の場合
				if (MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ())) {
					if (column == columnDtl_gi_loc_cd
							||column == columnDtl_gi_stk_arrv_bp_cd
							|| column == columnDtl_stk_id_typ) {
						return MCMode.REQUIRED;
					}
				}
				if (isNewRow(r) && (isProvDD(r) || isProvRtn(r))) {
					if (column == columnDtl_gi_stk_arrv_bp_cd
							|| column == columnDtl_stk_id_typ) {
						return MCMode.REQUIRED;
					}
				}
				// 引当をする場合
				if (r.alloc_flg()) {
					if (isAllocRQCol(r, column)) {
						return MCMode.REQUIRED;
					}
				}

				// 在庫識別区分がNULLでも自社在庫でもない場合
				if (!isNull(r.stk_id_typ())
						&& !MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
					if (column == columnDtl_stk_bp_cd) {
						return MCMode.REQUIRED;
					}
				}

				// 他勘定出庫の理由の場合
				if (r.acxfr_gi_flg()) {
					if (column == columnDtl_bd_dpt_cd) {
						return MCMode.REQUIRED;
					}
				}
				// WMS対象外の場合、今回WMSは入力不可とする
				if (!r.wms_tgt_flg()) {
					if (column == columnDtl_wms_flg) {
						return MCMode.READ_ONLY;
					}
				}
				if (r.copy_flg()) {
					if (column == columnDtl_ttl_flg) {
						return MCMode.READ_ONLY;
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
					|| column == columnDtl_sno1
					|| column == columnDtl_sno1_null_flg
					|| column == columnDtl_sno2
					|| column == columnDtl_sno2_null_flg
					|| column == columnDtl_sno3
					|| column == columnDtl_sno3_null_flg
					|| column == columnDtl_sno4
					|| column == columnDtl_sno4_null_flg
					|| column == columnDtl_prov_typ
					|| column == columnDtl_ret_prov_typ) {
				return true;
			}
			return false;
		}

		/**
		 * 引当する時に必須になる項目
		 */
		private boolean isAllocRQCol(DtlR r, MCColumnConfig column) {
			if (column == columnDtl_itm_cd
					|| column == columnDtl_itm_sub1
					|| column == columnDtl_itm_sub2
					|| column == columnDtl_itm_sub3
					|| column == columnDtl_gi_loc_cd
					|| (column == columnDtl_gi_str_ln_cd && r.gi_str_ln_tgt_flg() && !r.gi_str_ln_cd_none_flg())
					|| column == columnDtl_gi_stk_arrv_bp_cd
					|| column == columnDtl_trd_unit_cd
					|| column == columnDtl_gd_cd
					|| column == columnDtl_quality_typ
					|| column == columnDtl_stk_id_typ
					|| column == columnDtl_stk_bp_cd) {
				return true;
			}
			return false;
		}
	}

	// ボタンの入力制御
	protected void setBtnMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		if (isInsStatus() || isUpdStatus()) {
			// 行削除、行コピーボタン
			if (r == null || r.inst_bndl_flg() || r.inst_bndl_src_flg()) {
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				// 梱包数量提案以外の行が選択されている
				setDefaultMode(Btn_rcopy);
				setDefaultMode(Btn_rdel);
			}
			// 画面遷移ボタン(選択行の状態による)
			if (isEnableBtn_open_MSBEP0500(r)) {
				setDefaultMode(Btn_Btn_open_MSBEP0500_PPanel.StkInfo_open_MSBEP0500);
			}
			else {
				Btn_Btn_open_MSBEP0500_PPanel.StkInfo_open_MSBEP0500.setMode(MCMode.DISABLE);
			}
		}
		else if (isDelStatus()) {
			if (isEnableBtn_del()) {
				setDefaultMode(Btn_del);
			}
			else {
				Btn_del.setMode(MCMode.DISABLE);
			}
		}

		// 画面遷移ボタン
		if (isEnableBtn_open_MSBEP1020()) {
			setDefaultMode(Btn_open_MSBEP1020);
		}
		else {
			Btn_open_MSBEP1020.setMode(MCMode.DISABLE);
		}
		// アクションボタン
		if (isEnableBtn_sprt_pckg_prop()) {
			setDefaultMode(Btn_sprt_pckg_prop);
			setDefaultMode(Btn_select_pckg);
		}
		else {
			Btn_sprt_pckg_prop.setMode(MCMode.DISABLE);
			Btn_select_pckg.setMode(MCMode.READ_ONLY);
		}
		if (isEnableBtn_prnt_dlv()) {
			setDefaultMode(Btn_prnt_dlv);
		}
		else {
			Btn_prnt_dlv.setMode(MCMode.DISABLE);
		}
		if (isNull(getDtlL().getFirst(DtlR.$inst_abort_flg, false))) {
			Btn_prnt_pick.setMode(MCMode.DISABLE);
			Btn_prnt_inst.setMode(MCMode.DISABLE);
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
		if (!headerFills()) {
			return false;
		}
		return true;
	}
	/**
	 * 移動実績画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP1020() {
		if (isNull(getHdrR().xfr_inst_no())) {
			return false;
		}
		if (Cnd_ope_INS.isSelected()) {
			return false;
		}
		return true;
	}
	/**
	 * 梱包数量提案できるか
	 * @return
	 */
	protected boolean isEnableBtn_sprt_pckg_prop() {
		if (!Cnd_ope_INS.isSelected()) {
			return false;
		}
		return true;
	}
	/**
	 * 納品書発行できるか
	 * @return
	 */
	protected boolean isEnableBtn_prnt_dlv() {
		if (getHdrR().non_dlv_prnt_flg()) {
			return false;
		}
		if (getDtlL().subList(r->!isSame(r.dlv_slip_no(),MAC_STR.NULL_VAL.value())).isEmpty()) {
			return false;
		}
		return true;
	}
	/**
	 * 取消できるか
	 * @return
	 */
	protected boolean isEnableBtn_del() {
		for (DtlR r : getDtlL()) {
			if (r.inst_abort_flg()) {
				return false;
			}
		}
		return true;
	}

	//********************** インターフェースに対する実装 **************************
	// IfOpePanelの実装
	@Override
	public MCButtonGroup getOpeButtonGroup () {
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
			bind.addStringColumn(IfStkInspBase.CND_SNO1, r.sno1());
			bind.addStringColumn(IfStkInspBase.CND_SNO2, r.sno2());
			bind.addStringColumn(IfStkInspBase.CND_SNO3, r.sno3());
			bind.addStringColumn(IfStkInspBase.CND_SNO4, r.sno4());
			bind.addBooleanColumn(IfStkInspBase.CND_SNO1_NULL_FLG, r.sno1_null_flg());
			bind.addBooleanColumn(IfStkInspBase.CND_SNO2_NULL_FLG, r.sno2_null_flg());
			bind.addBooleanColumn(IfStkInspBase.CND_SNO3_NULL_FLG, r.sno3_null_flg());
			bind.addBooleanColumn(IfStkInspBase.CND_SNO4_NULL_FLG, r.sno4_null_flg());
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

			bind.addStringColumn(IfStkInspBase.CND_STK_INSP_TYP, MSC_STK_INSP_TYP.FIN.value());
			if (!isNull(r.stk_id_typ())) {
				bind.addStringColumn(IfStkInspBase.CND_STK_ID_TYP, r.stk_id_typ());
			}
			else {
				bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_COSTK_FLG, true);
				bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_RNT_RCV_FLG, true);
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
				l.add(IfStkInspBase.CND_SNO1);
				l.add(IfStkInspBase.CND_SNO2);
				l.add(IfStkInspBase.CND_SNO3);
				l.add(IfStkInspBase.CND_SNO4);
				l.add(IfStkInspBase.CND_SNO1_NULL_FLG);
				l.add(IfStkInspBase.CND_SNO2_NULL_FLG);
				l.add(IfStkInspBase.CND_SNO3_NULL_FLG);
				l.add(IfStkInspBase.CND_SNO4_NULL_FLG);
				if (isProvRtn(r) || isProvDD(r)) {
					l.add(IfStkInspBase.CND_LOC_CD);
					l.add(IfStkInspBase.CND_LOC_NM);
					l.add(IfStkInspBase.CND_STK_ARRV_BP_CD);
					l.add(IfStkInspBase.CND_STK_ARRV_BP_NM);
					l.add(IfStkInspBase.CND_STK_ID_TYP);
				}
			}
			return !l.contains(name);
		}
		else {
			return false;
		}
	}

	@Override
	public String getInptLocCdCol() {
		return DtlR.$gi_loc_cd;
	}

	@Override
	public String getInptStrLnCdCol() {
		return DtlR.$gi_str_ln_cd;
	}

	@Override
	public String getInptStrLnCdNoneFlgCol() {
		return DtlR.$gi_str_ln_cd_none_flg;
	}

	@Override
	public String getInptSno1Col() {
		return DtlR.$alloc_sno1;
	}

	@Override
	public String getInptSno2Col() {
		return DtlR.$alloc_sno2;
	}

	@Override
	public String getInptSno3Col() {
		return DtlR.$alloc_sno3;
	}

	@Override
	public String getInptSno4Col() {
		return DtlR.$alloc_sno4;
	}

	@Override
	public String getInptStkArrvBpCdCol() {
		return DtlR.$gi_stk_arrv_bp_cd;
	}

	@Override
	public String getInptPackStkQtyCol() {
		return DtlR.$trd_unit_qty;
	}

	@Override
	public String getInptPackUnitCdCol() {
		return DtlR.$trd_unit_cd;
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
			setINSStatus();
			Hdr_trd_cd.setMode(MCMode.READ_ONLY);
			Hdr_gr_loc_cd.setMode(MCMode.READ_ONLY);


			setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
			setValueEx(Hdr_trd_cd, bind.getStringNE("trd_cd"));
			setValueEx(Hdr_gr_loc_cd, bind.getStringNE("gr_loc_cd"));
			setValueEx(Hdr_xfr_schd_dt, bind.getDateNE("xfr_schd_dt"));
			setValueEx(Hdr_pick_print, bind.getBooleanNE("pick_print"));
			setValueEx(Hdr_inst_print, bind.getBooleanNE("inst_print"));
			setValueEx(Hdr_dlv_print, bind.getBooleanNE("dlv_print"));

			MCList<DtlR> dtlL = (MCList<DtlR>) param[0];
			for (DtlR dtlR : dtlL) {
				if(dtlR.alloc_flg() && isNullOr(dtlR.lot_no(), dtlR.sublot_no())) {
					dtlR.lot_none_flg(true);
				}
			}
			getDtlL().setAll(dtlL);
			sort(DtlTable);

			DtlTable.fillSpace();
			DtlTable.adjustWidth();
		}
	}

}