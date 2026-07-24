package mcframe.clientMSBE.MSBEP1400;

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
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0410.*;
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
import java.util.Arrays;
import java.util.Comparator;

import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
import mcframe.clientMSUD.MSUDP0020.IfStkInspBase;
import mcframe.clientMSUC.MSUCP0090.MSUCP_SCMLinkUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_ShipInstReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_ShipInstReg_MC extends MSBEP_ShipInstReg_MC_A implements IfOpePanel, IfRowMoveBase, IfStkInspBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected int _tmpInstDNo = 0;

	protected boolean _nonPlnFlg = false;

	protected boolean _dlv_prnt_btn_flg = false;

	protected boolean _inst_prnt_btn_flg = false;

	protected boolean _pick_prnt_btn_flg = false;

	protected boolean _adv_prnt_btn_flg = false;

	protected String ROW_COPY_FLG = "row_copy_flg";

	protected boolean _rowCopyFlgExist = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_ShipInstReg_MC() {
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
	public MSBEP_ShipInstReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL1400_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1400_Sprt02Caller<P extends MSBEP_ShipInstReg, B extends MS_MSBEL1400_Sprt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBEL1400_Sprt02Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Btn]のボタン[sprt_ac_dt]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_ac_dt(MCEventInfo info) {
		callMS_MSBEL1400_Sprt02();
	}
	
	/**
	 * [MS_MSBEL1400_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1400_Prnt01Caller<P extends MSBEP_ShipInstReg, B extends MS_MSBEL1400_Prnt01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBEL1400_Prnt01Caller(P p, B b) {
			super(p, b);
		}

		protected void setupParam() {
			super.setupParam();

			setupParamSub();
		}

		protected void setupParamSub() {
			bridge.up0().pick_prnt_btn_flg(_pick_prnt_btn_flg);
			bridge.up0().inst_prnt_btn_flg(_inst_prnt_btn_flg);
			bridge.up0().dlv_prnt_btn_flg(_dlv_prnt_btn_flg);
			bridge.up0().adv_prnt_btn_flg(_adv_prnt_btn_flg);

			_pick_prnt_btn_flg = false;
			_inst_prnt_btn_flg = false;
			_dlv_prnt_btn_flg = false;
			_adv_prnt_btn_flg = false;
		}
		@Override
		protected void setMode() {
			super.setMode();
			// 印刷ボタンを押下不可にする
			setFIX_UStatus();
		}
		@Override
		protected boolean execConfirm() {
			boolean flg = super.execConfirm();
			if (!flg) {
				_pick_prnt_btn_flg = false;
				_inst_prnt_btn_flg = false;
				_dlv_prnt_btn_flg = false;
				_adv_prnt_btn_flg = false;
			}
			return flg;
		}
	}

	/**
	 * [MS_MSBEL1400_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1400_Del01Caller<P extends MSBEP_ShipInstReg, B extends MS_MSBEL1400_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBEL1400_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();

			setPrint(true);
		}
	}

	/**
	 * [MS_MSBEL1400_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1400_Upd01Caller<P extends MSBEP_ShipInstReg, B extends MS_MSBEL1400_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1400_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			setPrint(true);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			checkForCallStackCustom(msgList,
					getDtlL().subList(Status.CREATE, Status.MODIFY));
		}
	}

	/**
	 * [MS_MSBEL1400_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1400_Ins01Caller<P extends MSBEP_ShipInstReg, B extends MS_MSBEL1400_Ins01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1400_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			setPrint(true);
		}

		@Override
		protected void setupParam() {
			// 表示順に合わせて仮指図明細NOを再設定
			setTmpInstDNo(true);
			super.setupParam();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			checkForCallStackCustom(msgList, getDtlL().subList(Status.CREATE));
		}
	}

	/**
	 * [MS_MSBEL1400_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1400_Sprt01Caller<P extends MSBEP_ShipInstReg, B extends MS_MSBEL1400_Sprt01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBEL1400_Sprt01Caller(P p, B b) {
			super(p, b);
		}
		
		MCList<DtlR> _dtlForCheck;
		
		@Override
		protected void initCaller() {
			super.initCaller();
			_dtlForCheck = getDtlL().subList(DtlR.$check, true);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBEP0037);
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().clear();
			bridge.up1().clear();

			HdrR hdrR = getHdrR();
			MCIndexKey
				idx1 = getShipSchd_DtlL().createIndex(ShipSchd_DtlR.$ship_alloc_sts_no),
				idx2 = getShipSchd_DtlL().createIndex(ShipSchd_DtlR.$tmp_inst_d_no);
			for (DtlR r : _dtlForCheck) {
				// 値が絶対重複しない、GUIIndex を利用
				r.lot_peg_no(r.getGUIIndex());

				r.ship_schd_tm(hdrR.ship_schd_dt());
				r.dlv_schd_tm(hdrR.dlv_schd_dt());
				r.ship_term_cd(hdrR.ship_term_cd());
				bridge.up0().add(r);

				ShipSchd_DtlR up1R = getShipSchd_DtlL().getFirst(idx1, r.ship_alloc_sts_no());
				if (r.inst_bndl_flg() || isNull(up1R)) {
					// 引当状況が特定できないケース＝指図まとめ
					// この場合は仮指図明細NOの単位で受払予定を削除する
					MCList<ShipSchd_DtlR> up1L = getShipSchd_DtlL().subList(idx2, r.tmp_inst_d_no());
					bridge.up1().addAll(up1L);
				}
				else {
					bridge.up1().add(up1R);
				}
			}
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(Hdr_ship_schd_dt));
			msgList.addAll(panel.checkReq(Hdr_dlv_schd_dt));
			for (DtlR r : _dtlForCheck) {
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_ent_unit_cd));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_ent_unit_qty));
			}
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			bridge.down0().setStatus(Status.CREATE);
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (isSame(getStatus(), INS)) {
				setINSStatus();
			}
			else if (isSame(getStatus(), UPD)) {
				setUPDStatus();
			}
		}

		@Override
		protected void showMerge() {
			MCIndexKey downIdx = bridge.down0().createIndex(DtlR.$lot_peg_no);
			MCList<DtlR> newL = MCList.create(DtlR.class);

			for (DtlR dtlR1 : getDtlL()) {
				MCList<DtlR> lotPegL = bridge.down0().subList(downIdx,
						MCNumber.valueOf(dtlR1.getGUIIndex()));

				if (lotPegL.isEmpty()) {
					newL.add(dtlR1);
				}
				else {
					for (DtlR dtlR2 : lotPegL) {
						DtlR	newR = dtlR1.clone();
						copyLotRslt(newR, dtlR2);
						newL.add(newR);
						if (!dtlR2.no_alloc_flg()) {
							newR.setStatus(MCRow.CREATE);
						}
					}
				}
			}

			getDtlL().setAll(newL);
		}

		protected void copyLotRslt(DtlR dest, DtlR src) {
			dest.ship_loc_cd(src.ship_loc_cd());
			dest.ship_loc_nm(src.ship_loc_nm());
			dest.ship_str_ln_tgt_flg(src.ship_str_ln_tgt_flg());
			dest.ship_str_ln_cd(src.ship_str_ln_cd());
			dest.ship_str_ln_nm(src.ship_str_ln_nm());
			dest.alloc_ver_no(src.alloc_ver_no());
			dest.ent_unit_cd(src.ent_unit_cd());
			dest.ent_unit_nm(src.ent_unit_nm());
			dest.ent_unit_conv_base_qty(src.ent_unit_conv_base_qty());
			dest.ent_unit_conv_qty(src.ent_unit_conv_qty());
			dest.ent_unit_dec_place(src.ent_unit_dec_place());
			dest.ent_unit_qty(src.ent_unit_qty());
			dest.base_unit_qty(src.base_unit_qty());
			dest.pckg_unit_qty(src.pckg_unit_qty());
			dest.pckg_unit_rnd_typ(MAC_RND_TYP.RNDUP.value());
			dest.alloc_sno1(src.alloc_sno1());
			dest.alloc_sno2(src.alloc_sno2());
			dest.alloc_sno3(src.alloc_sno3());
			dest.alloc_sno4(src.alloc_sno4());
			dest.act_cont_qty(src.act_cont_qty());
			dest.act_cont_fctr(src.act_cont_fctr());
			dest.std_cont_qty(src.std_cont_qty());
			dest.std_cont_fctr(src.std_cont_fctr());
			if (src.no_alloc_flg()) {
				dest.lot_no(null);
				dest.sublot_no(null);
				dest.alloc_flg(false);
			}
			else {
				dest.lot_no(src.lot_no());
				dest.sublot_no(src.sublot_no());
				dest.alloc_flg(true);
			}
			dest.wms_flg(src.wms_flg());
			dest.wms_tgt_flg(src.wms_tgt_flg());
		}
	}

	/**
	 * [MS_MSBEL1400_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1400_Srch02Caller<P extends MSBEP_ShipInstReg, B extends MS_MSBEL1400_Srch02Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1400_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkReq(MCMessageList msgList, MCContainer cont) {
			if (cont == getCndR() && _nonPlnFlg) {
				// 指図対象外の場合はチェックしない
				return;
			}
			super.checkReq(msgList, cont);
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			bridge.down0().ship_inst_dt(getToday());
		}

		@Override
		protected void show() {
			super.show();
			setTmpInstDNo();

			// 行削除のため
			getDtlL().forEach(r -> r.setStatus(MCRow.CREATE));
		}

		@Override
		protected void setMode() {
			super.setMode();

			setINSStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			setINSStatus();
		}
	}

	/**
	 * [MS_MSBEL1400_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1400_Srch01Caller<P extends MSBEP_ShipInstReg, B extends MS_MSBEL1400_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
		protected MS_MSBEL1400_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void show() {
			super.show();
			setTmpInstDNo();
		}		
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBEL1400_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		DtlR r = deleteRow(DtlTable);
		if (isNull(r)) {
			return;
		}
		if (Cnd_ope_INS.isSelected()) {
			DtlR dtlR = getDtlL().getFirst(DtlR.$tmp_inst_d_no, r.tmp_inst_d_no());
			if (isNull(dtlR)) {	// 同一仮指図明細が存在しない
				getShipSchd_DtlL().removeAll(
					getShipSchd_DtlL().subList(DtlR.$tmp_inst_d_no, r.tmp_inst_d_no()));
			}
		}
		sumDim();
		sumWt();
	}

	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		DtlR dtlR = copyRow(DtlTable);

		if (isNull(dtlR)) {
			return;
		}

		clearNotCopyCol(dtlR.getGUIIndex());
		setTtlFlgDisable(dtlR.getGUIIndex() - 1, dtlR.getGUIIndex());
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
	 * Panel[Cnd]のボタン[srch2]の押下時の処理
	 */
	@Override
	public void doCnd_srch2(MCEventInfo info) {
		Hdr_ship_inst_dt.setMode(MCMode.READ_ONLY);

		callMS_MSBEL1400_Srch02();

		Hdr_ship_inst_dt.setMode(MCMode.REQUIRED);
	}

	/**
	 * Panel[Btn]のボタン[prnt_adv]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_adv(MCEventInfo info) {
		_adv_prnt_btn_flg = true;

		callMS_MSBEL1400_Prnt01();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0110(MCEventInfo info) {
		openPanel("MS", "MSBEP0110", T3, getHdrR());
	}

	/**
	 * Panel[Btn]のボタン[prnt_pick]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_pick(MCEventInfo info) {
		_pick_prnt_btn_flg = true;

		callMS_MSBEL1400_Prnt01();
	}

	/**
	 * Panel[Btn]のボタン[prnt_inst]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_inst(MCEventInfo info) {
		_inst_prnt_btn_flg = true;

		callMS_MSBEL1400_Prnt01();
	}

	/**
	 * Panel[Btn]のボタン[prnt_dlv]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_dlv(MCEventInfo info) {
		_dlv_prnt_btn_flg = true;

		callMS_MSBEL1400_Prnt01();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBEL1400_Del01();
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBEL1400_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[sprt_lot_prop]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_lot_prop(MCEventInfo info) {
		if (isNull(getDtlL().subList(DtlR.$check, true))) {
			return;
		}

		if (isNull(getHdrR().ship_inst_dt())) {
			Hdr_ship_inst_dt.setMode(MCMode.ENABLE);
		}

		callMS_MSBEL1400_Sprt01();

		if (isNull(getHdrR().ship_inst_dt())) {
			Hdr_ship_inst_dt.setMode(MCMode.REQUIRED);
		}
	}

	/**
	 * Panel[Btn]のボタン[sprt_pckg_prop]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_pckg_prop(MCEventInfo info) {
		if (isNull(getDtlL().subList(DtlR.$ttl_flg, true))) {
			return;
		}

		execPckgProp();
		setPckgPropBtnMode();
		setLotPropBtnMode();
	}

	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBEL1400_Ins01();
	}

	protected mcframe.clientMSBE.MSBEP0010.CndR crtOpenMSBEP0010CndR(
			MAUCP_AppScreenOpener aso, HdrR hdrR, DtlR dtlR) {
		mcframe.clientMSBE.MSBEP0010.MSBEP_StkSrch panel = (mcframe.clientMSBE.MSBEP0010.MSBEP_StkSrch) aso
				.getPanel();
		mcframe.clientMSBE.MSBEP0010.CndR to = mcframe.clientMSBE.MSBEP0010.CndR.create();

		to.ope(panel.Cnd_ope_STK.getActionCommand());
		to.itm_cd(dtlR.itm_cd());
		to.itm_sub1(dtlR.itm_sub1());
		to.itm_sub2(dtlR.itm_sub2());
		to.itm_sub3(dtlR.itm_sub3());
		to.pack_unit_cd(dtlR.ent_unit_cd());
		to.loc_cd(dtlR.ship_loc_cd());
		to.lot_no(dtlR.lot_no());
		to.sublot_no(dtlR.sublot_no());
		to.gd_cd(dtlR.gd_cd());
		to.ver_no(dtlR.ver_no());
		to.sno1(dtlR.sno1());
		to.sno2(dtlR.sno2());
		to.sno3(dtlR.sno3());
		to.sno4(dtlR.sno4());
		to.wrk_no(dtlR.wrk_no());
		to.wrk_nm(dtlR.wrk_nm());

		to.loc_flg(!isNull(dtlR.ship_loc_cd()));
		to.str_ln_flg(!isNull(dtlR.ship_str_ln_cd()));
		to.stk_arrv_bp_flg(!isNull(dtlR.stk_arrv_bp_cd()));
		to.lg_grp_flg(!isNull(hdrR.ship_fr_lg_grp_cd()));
		to.alloc_grp_flg(!isNull(dtlR.alloc_grp_cd()));
		to.lot_flg(!isNull(dtlR.lot_no()));
		to.sublot_flg(!isNull(dtlR.sublot_no()));
		to.sno1_flg(!isNull(dtlR.sno1()));
		to.sno2_flg(!isNull(dtlR.sno2()));
		to.sno3_flg(!isNull(dtlR.sno3()));
		to.sno4_flg(!isNull(dtlR.sno4()));
		to.gd_flg(!isNull(dtlR.gd_cd()));

		return to;
	}

	protected void setTtlFlgDisable(int eventIdx, int guiIdx) {
		setValueEx(columnDtl_ttl_flg, eventIdx, false);
		setValueEx(columnDtl_ttl_flg, guiIdx, false);

		if (!_rowCopyFlgExist) {
			getDtlL().addBooleanColumn(ROW_COPY_FLG);
		}

		_rowCopyFlgExist = true;

		getDtlL().get(eventIdx).setBooleanNE(ROW_COPY_FLG, true);
		getDtlL().get(guiIdx).setBooleanNE(ROW_COPY_FLG, true);
	}

	protected void clearNotCopyCol(int index) {
		setValueEx(columnDtl_ent_unit_qty, index, null);

		setValueEx(columnDtl_ship_alloc_sts_no, index, null);
		setValueEx(columnDtl_dlv_slip_no, index, null);
		setValueEx(columnDtl_dlv_slip_d_no, index, null);
		setValueEx(columnDtl_disp_seq, index, null);
		setValueEx(columnDtl_last_wms_flg, index, false);
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Hdr_ship_to_addr_p_PPanel.setRelateBeans(Hdr_ship_to_id_cd, Hdr_ship_to_id_nm,
				Hdr_ship_to_sundry_flg);
		Hdr_inst_usr_dpt_p_PPanel.setRelateBeans(Hdr_ship_inst_dt);

		Dtl_lot_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_lot_mng_typ,
				columnDtl_sublot_mng_typ);
		Dtl_ver_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, null,
				columnDtl_ver_flg);
		Dtl_alloc_ver_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, null,
				columnDtl_ver_flg);
		Dtl_itm_p_PPanel.setRelateBeans(columnDtl_sundry_itm_flg);
		Dtl_ent_unit_qty_p_PPanel.setRelateBeans(
			columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3,
			columnDtl_ent_unit_cd, columnDtl_ent_unit_dec_place, columnDtl_ent_unit_rnd_typ,
			columnDtl_ent_unit_conv_base_qty, columnDtl_ent_unit_conv_qty, columnDtl_base_unit_cd);
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
				columnDtl_ent_unit_qty, columnDtl_ent_unit_conv_base_qty,
				columnDtl_ent_unit_conv_qty);
		Dtl_pckg_unit_qty_p_PPanel.setRelateBeans(columnDtl_pckg_unit_cd, columnDtl_pckg_unit_dec_place);
		// 予定時単位数量は取引単位数量の変更に連動させない
		Dtl_schd_unit_qty_p_PPanel.setRelateBeans(columnDtl_schd_unit_cd, columnDtl_schd_unit_dec_place);
		Dtl_ship_act_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);

		Dtl_act_cont_qty_p_PPanel.setRelateBeans(columnDtl_cont_fctr_flg,
				columnDtl_ent_unit_qty, null, columnDtl_act_cont_fctr,
				columnDtl_cont_unit_dec_place, columnDtl_cont_unit_rnd_typ);
		Dtl_std_cont_qty_p_PPanel.setRelateBeans(columnDtl_cont_fctr_flg,
				columnDtl_ent_unit_qty, columnDtl_std_cont_fctr, null,
				columnDtl_cont_unit_dec_place, columnDtl_cont_unit_rnd_typ);
		Dtl_ship_str_ln_p_PPanel.setRelateBeans(columnDtl_ship_loc_cd,
				columnDtl_ship_str_ln_tgt_flg);
		Dtl_dlv_str_ln_p_PPanel.setRelateBeans(Hdr_ship_to_id_cd,
				columnDtl_dlv_str_ln_tgt_flg);
		Dtl_sno_wrk_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_sno1_mng_typ,
				columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		columnDtl_lot_no.addNCListener(this);
		columnDtl_sublot_no.addNCListener(this);
		columnDtl_ent_unit_qty.addNCListener(this);
		columnDtl_base_unit_qty.addNCListener(this);
		columnDtl_ship_str_ln_cd.addNCListener(this);
		
		columnDtl_alloc_sno1.addVCListener(this);
		columnDtl_alloc_sno2.addVCListener(this);
		columnDtl_alloc_sno3.addVCListener(this);
		columnDtl_alloc_sno4.addVCListener(this);
		columnDtl_ship_loc_cd.addLCListener(this);
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (nc == columnDtl_ent_unit_qty) {
			doDtl_ent_unit_qty_NC(info);
		}
		else if (nc == columnDtl_base_unit_qty) {
			doDtl_base_unit_qty_NC(info);
		}
		else if (nc == columnDtl_trd_rmrks
					|| nc == columnDtl_trd_d_rmrks
					|| nc == columnDtl_inst_d_rmrks
					|| nc == columnDtl_intr_d_rmrks
					|| nc == columnDtl_sub_char1
					|| nc == columnDtl_sub_char2
					|| nc == columnDtl_sub_char3) {
			syncRmrks(nc, info);
		}
	}
	
	@Override
	public void doDtl_alloc_flg_NC(MCEventInfo info){
		super.doDtl_alloc_flg_NC(info);
		int index = info.getEventIndex();	
		DtlR r = getDtlL().get(index);
		if (!r.alloc_flg()) {
			setValueEx(columnDtl_lot_none_flg, index, false);
		}
		if (r.ship_loc_prio_flg() && MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(r.alloc_scope_typ())) {
			if (r.alloc_flg()) {
				setValueEx(columnDtl_ship_loc_cd, index, r.def_loc_cd());
			}
			else {
				setValueEx(columnDtl_ship_loc_cd, index, null);
			}
		}
	}

	@Override
	public void doDtl_lot_none_flg_NC(MCEventInfo info){
		super.doDtl_lot_none_flg_NC(info);
		int index = info.getEventIndex();	
		DtlR r = getDtlL().get(index);

		if(r.lot_none_flg()) {
			setValueEx(columnDtl_lot_no, index, null);
			setValueEx(columnDtl_sublot_no, index, null);
		}
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
	
	protected boolean doDtl_alloc_sno1_VC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		if(!isSame(info.getNewValue(), r.sno1())
				&& !isNull(info.getNewValue())
				&& !isNull(r.sno1())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}

	protected boolean doDtl_alloc_sno2_VC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		if(!isSame(info.getNewValue(), r.sno2())
				&& !isNull(info.getNewValue())
				&& !isNull(r.sno2())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}

	protected boolean doDtl_alloc_sno3_VC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		if(!isSame(info.getNewValue(), r.sno3())
				&& !isNull(info.getNewValue())
				&& !isNull(r.sno3())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}

	protected boolean doDtl_alloc_sno4_VC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		if(!isSame(info.getNewValue(), r.sno4())
				&& !isNull(info.getNewValue())
				&& !isNull(r.sno4())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}
	@Override
	public void doDtl_ship_loc_cd_LC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		// 外部システムCDを取得
		boolean wmsFlg = MSUCP_SCMLinkUtil.getWmsFlg(
			MAC_IF_PROC_TYP.WMS_SHIP_INST_SEND.value(), r.ship_loc_cd(), getHdrR().ship_fr_lg_grp_cd(),
			MSC_DLV_ID_TYP.isDLV(r.dlv_id_typ()) ? r.dlv_id_cd() : null,
			MSC_DLV_ID_TYP.isLOC(r.dlv_id_typ()) ? r.dlv_id_cd() : null, getToday(), this);

		// 外部システムCDの有無でWMS対象を判断する
		setValueEx(columnDtl_wms_flg, info.getEventIndex(), wmsFlg);
		setValueEx(columnDtl_wms_tgt_flg, info.getEventIndex(), wmsFlg);
	}

	protected void syncRmrks(MCNCBeans nc, MCEventInfo info) {
		// 同一の仮指図明細NOを持つ明細は同じ備考を設定する
		DtlR r = getDtlL().get(info.getEventIndex());
		MCList<DtlR> dtlL = getDtlL().subList(DtlR.$tmp_inst_d_no, r.tmp_inst_d_no());
		for (DtlR tmpR : dtlL) {
			if (tmpR.getGUIIndex() != r.getGUIIndex()) {
				setValueEx((MCColumnConfig)nc, tmpR.getGUIIndex(), info.getNewValue());
			}
		}
	}

	protected void setSortColumn() {
		super.setSortColumn();

		DtlTable.addSortColumn(columnDtl_disp_seq, SortType.ASC);
	}

	protected void checkForCallStackCustom(MCMessageList msgList, MCList<DtlR> dtlL) {
		for (DtlR dtlR : dtlL) {
			checkRow(msgList, dtlR);
		}
	}

	protected void checkRow(MCMessageList msgList, DtlR dtlR) {
		msgList.addAll(checkPositive(dtlR, columnDtl_ent_unit_qty));
	}

	// Override Status
	@Override
	public void statusClear() {
		if (_nonPlnFlg) {
			// 何もしない
			_nonPlnFlg = false;
		}
		else {
			super.statusClear();
		}
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();

		HdrPanel.focusFirstComponent();
		setLotPropBtnMode();
		setPckgPropBtnMode();
		setBtnMode();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();

		setRevNoMode();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();

		setPrntButtonMode();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();

		HdrPanel.focusFirstComponent();
		setLotPropBtnMode();
		setPckgPropBtnMode();
		setBtnMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();

		CndPanel.focusFirstComponent();
		setTmpInstDNo();
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

	protected void setTmpInstDNo() {
		setTmpInstDNo(false);
	}
	protected void setTmpInstDNo(boolean tmpInstDNo) {

		MCList<ShipSchd_DtlR> cntrL = getShipSchd_DtlL();

		MCIndexKey idx;
		String key;
		if (tmpInstDNo) {
			idx = cntrL.createIndex(ShipSchd_DtlR.$tmp_inst_d_no);
			key = DtlR.$tmp_inst_d_no;
		}
		else if (isNull(getHdrR().ship_inst_no())) {
			idx = cntrL.createIndex(ShipSchd_DtlR.$ship_schd_no);
			key = DtlR.$ship_schd_no;
		}
		else {
			idx = cntrL.createIndex(ShipSchd_DtlR.$ship_inst_d_no);
			key = DtlR.$ship_inst_d_no;
		}

		// 現状の並び順のまま仮指図明細NOを設定
		final String seq = "_seq";
		MCList<DtlR> lst = MCList.create(DtlR.class);
		for (int i=0; i<getDtlL().size(); i++) {
			DtlR r = getDtlL().get(i);
			if (Dtl_itm_p_PPanel.isItmFixLight(i)) {
				r.setNumberNE(seq, i);
				lst.add(r);
			}
			// 打切指図ＦＬＧ、場所引当ＦＬＧの初期値を設定
			r.bef_abort_flg(r.inst_abort_flg());
			r.bef_alloc_flg(r.alloc_flg());
		}
		MCList<DtlR>[] arr = lst.groupList(key);
		for (int i=0; i<arr.length; i++) {
			arr[i].sort(seq);
		}
		Arrays.sort(arr, new Comparator<MCList<DtlR>>() {
			public int compare(MCList<DtlR> o1, MCList<DtlR> o2) {
				return o1.get(0).getNumber(seq).compareTo(o2.get(0).getNumber(seq));
			}
		});
		for (MCList<DtlR> grpL : arr) {
			DtlR r = grpL.get(0);
			MCList<ShipSchd_DtlR> l = cntrL.subList(idx, r.toArray(idx.getKeys()));
			if (!l.isEmpty()) {
				grpL.setNumber(DtlR.$tmp_inst_d_no, ++_tmpInstDNo);
				l.setNumber(ShipSchd_DtlR.$tmp_inst_d_no, _tmpInstDNo);
				if (tmpInstDNo) {
					idx = cntrL.createIndex(ShipSchd_DtlR.$tmp_inst_d_no);
				}
			}
		}
	}

	/**
	 * 梱包数提案処理
	 */
	protected void execPckgProp() {
		MCList<DtlR> selectOnL = getDtlL().subList(DtlR.$ttl_flg, true);
		MCList<DtlR> selectOffL = getDtlL().subList(DtlR.$ttl_flg, false);
		if (selectOnL.isEmpty()) {
			return;
		}

		MCGroupByPolicy pckgPolicy = new MCGroupByPolicy(getPckgGroupColumn());
		pckgPolicy.sum(DtlR.$base_unit_qty);
		selectOnL.setBoolean(DtlR.$check, false);

		// まとめ先
		MCList<DtlR> bndlDestL = selectOnL.groupBy(pckgPolicy);

		// 提案の結果、新規作成されたレコードに値をセットする
		for (DtlR destR : bndlDestL) {
			MCNumber pckgQty = rvrsBaseUnitConv(
					destR.base_unit_qty(),
					destR.pckg_unit_conv_base_qty(),
					destR.pckg_unit_conv_qty(),
					destR.pckg_unit_dec_place(),
					MAC_RND_TYP.RNDUP.value());

			destR.ent_unit_cd(destR.pckg_unit_cd());
			destR.ent_unit_nm(destR.pckg_unit_nm());
			destR.ent_unit_qty(pckgQty);
			destR.ent_unit_dec_place(destR.pckg_unit_dec_place());
			destR.base_unit_cd(destR.base_unit_cd());
			destR.base_unit_qty(
				convToBaseUnit(
					destR.ent_unit_qty(), destR.pckg_unit_conv_base_qty(), destR.pckg_unit_conv_qty(),
					destR.base_unit_dec_place(), destR.base_unit_rnd_typ())
			);
			destR.pckg_unit_qty(pckgQty);
			destR.inst_bndl_flg(true);
			destR.setStatus(Status.CREATE);

			// まとめ元
			MCList<DtlR> bndlSrcL = selectOnL.subList(createPckgRowMatcher(destR));
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
			destR.tmp_inst_d_no(++_tmpInstDNo);

			MCList<ShipSchd_DtlR> cntrL = getShipSchd_DtlL();
			for (DtlR srcR : bndlSrcL) {
				MCIndexKey idx = cntrL.createIndex(ShipSchd_DtlR.$tmp_inst_d_no);
				cntrL
					.subList(idx, srcR.tmp_inst_d_no())
					.setNumber(ShipSchd_DtlR.$tmp_inst_d_no, destR.tmp_inst_d_no());
			}
		}

		getDtlL().setAll(bndlDestL);
		getDtlL().addAll(selectOffL);
		
		// 仮指図明細NOを再設定
		setTmpInstDNo(true);
	}

	/**
	 * 集計の基準となる項目
	 * @return
	 */
	protected String[] getPckgGroupColumn() {
		return new String[] {
				DtlR.$itm_cd, DtlR.$itm_sub1, DtlR.$itm_sub2, DtlR.$itm_sub3,
				DtlR.$itm_nm, DtlR.$iv_itm_nm, DtlR.$lot_no, DtlR.$sublot_no, DtlR.$ver_no, DtlR.$alloc_ver_no,
				DtlR.$ship_loc_cd, DtlR.$ship_loc_nm, DtlR.$ship_schd_loc_sppl_cd, DtlR.$ship_str_ln_cd,
				DtlR.$ship_str_ln_nm, DtlR.$ship_str_ln_cd_none_flg, DtlR.$stk_arrv_bp_cd,
				DtlR.$stk_arrv_bp_nm, DtlR.$dlv_id_cd, DtlR.$dlv_id_nm, DtlR.$dlv_id_typ,
				DtlR.$dlv_id_typ_nm, DtlR.$dlv_str_ln_cd, DtlR.$dlv_str_ln_nm,
				DtlR.$quality_typ, DtlR.$quality_typ_nm, DtlR.$gd_cd, DtlR.$gd_nm,
				DtlR.$sno1_null_flg, DtlR.$sno2_null_flg, DtlR.$sno3_null_flg,
				DtlR.$sno4_null_flg, DtlR.$sno1, DtlR.$sno2, DtlR.$sno3, DtlR.$sno4,
				DtlR.$alloc_sno1, DtlR.$alloc_sno2, DtlR.$alloc_sno3, DtlR.$alloc_sno4,
				DtlR.$stk_insp_typ, DtlR.$stk_insp_typ_nm, DtlR.$trd_cd, DtlR.$trd_nm,
				DtlR.$stk_id_typ, DtlR.$stk_id_typ_nm, DtlR.$stk_bp_cd, DtlR.$stk_bp_nm,
				DtlR.$rsn_cd, DtlR.$rsn_nm, DtlR.$bd_dpt_cd, DtlR.$bd_dpt_nm,
				DtlR.$prov_typ, DtlR.$prov_typ_nm, DtlR.$prov_basis_typ,
				DtlR.$prov_basis_typ_nm, DtlR.$ret_prov_typ, DtlR.$ret_prov_typ_nm,
				DtlR.$ret_prov_basis_typ, DtlR.$ret_prov_basis_typ_nm,
				DtlR.$base_unit_cd, DtlR.$base_unit_nm, DtlR.$base_unit_dec_place, DtlR.$base_unit_rnd_typ,
				DtlR.$pckg_unit_cd, DtlR.$pckg_unit_nm, DtlR.$pckg_unit_dec_place, DtlR.$pckg_unit_conv_base_qty,
				DtlR.$pckg_unit_conv_qty, DtlR.$pckg_unit_rnd_typ, DtlR.$slo_no,
				DtlR.$act_cont_fctr, DtlR.$std_cont_fctr, DtlR.$cont_fctr_unit_cd, DtlR.$cont_fctr_unit_nm,
				DtlR.$cont_unit_dec_place, DtlR.$cont_unit_rnd_typ, DtlR.$ship_inst_typ
		};
	}

	// Event
	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe,
			String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);

		// 参照登録は禁止
		if (isSame(bfOpe, Cnd_ope_REF.getActionCommand())
				&& isSame(afOpe, Cnd_ope_INS.getActionCommand())) {
			getCndR().clear();
			getHdrR().clear();
			getDtlL().clear();
			getShipSchd_DtlL().clear();
		}

		// 種別変更時、登録種別からの完全新規登録は不可とする
		if (isSame(afOpe, Cnd_ope_INS.getActionCommand())) {
			setINS_NONStatus();
		}
	}

	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe,
			String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);

		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			this.getCndR().ship_inst_no(this.getHdrR().ship_inst_no());
		}
	}

	@Override
	protected void opePanelFillSpace() {
		// fillSpaceしない
		//super.opePanelFillSpace();
	}

	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);

		setBtnMode();
	}

	@Override
	public void doDtl_check_NC(MCEventInfo info) {
		super.doDtl_check_NC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		if (r.check() && !r.alloc_flg()) {
			setValueEx(columnDtl_alloc_flg, r.getGUIIndex(), true);
		}

		// ロット提案ボタンの挙動を設定する
		setLotPropBtnMode();
	}

	@Override
	public void doDtl_ttl_flg_NC(MCEventInfo info) {
		super.doDtl_ttl_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR dtlR = getDtlL().get(idx);

		if (getBtnR().select_pckg()) {
			getSelectPckg(dtlR).setValue(DtlR.$ttl_flg, dtlR.ttl_flg());
		}

		// 同一出荷予定ＮＯのレコードを同期する
		setTtlFlgSameSchdNo(dtlR);

		// 梱包数量ボタンの挙動を設定する
		setPckgPropBtnMode();
	}

	protected MCList<DtlR> getSelectPckg(DtlR dtl) {
		// 同一明細まとめ選択では補完は考慮しない
		return getDtlL().subList(createPckgRowMatcher(dtl));
	}

	@Override
	public void doDtl_schd_abort_flg_NC(MCEventInfo info) {
		super.doDtl_schd_abort_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR dtlR = getDtlL().get(idx);

		// 同一TmpInstDNoのレコードを同期する
		setAbortInstFlgSameTmpInstDNo(dtlR);
	}

	@Override
	public void doDtl_inst_abort_flg_NC(MCEventInfo info) {
		super.doDtl_inst_abort_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR dtlR = getDtlL().get(idx);

		// 指図打切の場合、場所引当を解除する
		if (dtlR.inst_abort_flg()) {
			dtlR.alloc_flg(false);
		}
		else {
			dtlR.alloc_flg(dtlR.bef_alloc_flg());
		}

		// 同一TmpInstDNoのレコードを同期する
		setAbortActFlgSameTmpInstDNo(dtlR);
	}

	protected void doDtl_ent_unit_qty_NC(MCEventInfo info) {
		setWtDim(info);
	}

	protected void setWtDim(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR dtlR = getDtlL().get(idx);

		dtlR.ship_wt(nvl(dtlR.unit_wt(), MCNumber.ZERO).multiply(dtlR.ent_unit_qty()));
		dtlR.ship_dim(nvl(dtlR.unit_dim(), MCNumber.ZERO).multiply(dtlR.ent_unit_qty()));

		sumWt();
		sumDim();
	}

	protected void sumWt() {
		MCNumber shipWt = MCNumber.ZERO;

		for (DtlR dtlR : getDtlL().subList(r -> !r.isStatusDelete())) {
			shipWt = shipWt.add(nvl(dtlR.ship_wt(), MCNumber.ZERO));
		}

		setValueEx(Hdr_ship_wt, shipWt);
	}

	protected void sumDim() {
		MCNumber shipDim = MCNumber.ZERO;

		for (DtlR dtlR : getDtlL().subList(r -> !r.isStatusDelete())) {
			shipDim = shipDim.add(nvl(dtlR.ship_dim(), MCNumber.ZERO));
		}

		setValueEx(Hdr_ship_dim, shipDim);
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

	protected void setAbortInstFlgSameTmpInstDNo(DtlR dtlR) {
		MCList<DtlR> dtlL = getDtlL().subList(DtlR.$tmp_inst_d_no, dtlR.tmp_inst_d_no());
		dtlL.forEach(r -> {
			setValueEx(columnDtl_schd_abort_flg, r.getGUIIndex(), dtlR.schd_abort_flg()); 
		});
	}

	protected void setAbortActFlgSameTmpInstDNo(DtlR dtlR) {
		MCList<DtlR> dtlL = getDtlL().subList(DtlR.$tmp_inst_d_no, dtlR.tmp_inst_d_no());
		dtlL.forEach(r -> {
			setValueEx(columnDtl_inst_abort_flg, r.getGUIIndex(), dtlR.inst_abort_flg()); 
		});
	}

	protected void setTtlFlgSameSchdNo(DtlR dtlR) {
		if (isNull(dtlR.ship_schd_no())) {
			return;
		}

		MCList<DtlR> dtlL = getDtlL().subList(DtlR.$ship_schd_no, dtlR.ship_schd_no());

		dtlL.setValue(DtlR.$ttl_flg, dtlR.ttl_flg());

		for (DtlR row : dtlL) {
			if (isSame(row.getStatus(), Status.NONE)) {
				row.setStatus(Status.MODIFY);
			}
		}
	}

	protected void setSameInstDNo(DtlR dtlR) {
		if (isNull(dtlR.ship_inst_d_no())) {
			return;
		}

		MCList<DtlR> dtlL = getDtlL().subList(DtlR.$ship_inst_d_no,
				dtlR.ship_inst_d_no());

		dtlL.setValue(DtlR.$schd_abort_flg, dtlR.schd_abort_flg());
		dtlL.setValue(DtlR.$inst_abort_flg, dtlR.inst_abort_flg());
	}

	protected void setLotPropBtnMode() {
		if (!getDtlL().subList(DtlR.$check, true).isEmpty()) {
			Btn_sprt_lot_prop.setMode(MCMode.ENABLE);
		}
		else {
			Btn_sprt_lot_prop.setMode(MCMode.DISABLE);
		}
	}

	protected void setPckgPropBtnMode() {
		if (!getDtlL().subList(DtlR.$ttl_flg, true).isEmpty()) {
			Btn_sprt_pckg_prop.setMode(MCMode.ENABLE);
		}
		else {
			Btn_sprt_pckg_prop.setMode(MCMode.DISABLE);
		}
	}

	protected void setBtnMode() {
		MCButton openStkInfo = Btn_Btn_open_MSBEP0500_PPanel.StkInfo_open_MSBEP0500;
		DtlR dtlR = DtlTable.getSelectedMCRow();

		if (isNull(dtlR) || isNull(dtlR.itm_cd())) {
			setDefaultMode(openStkInfo);
			return;
		}
		if ((Cnd_ope_INS.isSelected() || Cnd_ope_UPD.isSelected())) {
			openStkInfo.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(openStkInfo);
		}

		if (dtlR.inst_bndl_flg() || dtlR.dscnt_itm_flg()) {
			Btn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_rcopy);
		}
	}

	protected void setPrntButtonMode() {
		if (isSame(getStatus(), REF) && getHdrR().non_dlv_prnt_flg()) {
			Btn_prnt_dlv.setMode(MCMode.DISABLE);
		}
		if (isSame(getStatus(), REF) && getHdrR().non_adv_prnt_flg()) {
			Btn_prnt_adv.setMode(MCMode.DISABLE);
		}
		else if (isSame(getStatus(), REF) && getHdrR().can_flg()) {
			Btn_open_MSBEP0110.setMode(MCMode.DISABLE);
			Btn_prnt_pick.setMode(MCMode.DISABLE);
			Btn_prnt_inst.setMode(MCMode.DISABLE);
			Btn_prnt_adv.setMode(MCMode.DISABLE);
		}
		if (isNull(getDtlL().getFirst(DtlR.$inst_abort_flg, false))) {
			Btn_open_MSBEP0110.setMode(MCMode.DISABLE);
			Btn_prnt_pick.setMode(MCMode.DISABLE);
			Btn_prnt_inst.setMode(MCMode.DISABLE);
		}
	}

	@Override
	public MCList getDtl_ship_loc_cd(MCRow row, MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
			// 外注・社内とも
			row.addStringColumn(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.LG_GRP.value());
		}
		else if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
			// 外注場所のみ
			row.addStringColumn(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.LG_GRP_OUTSIDE.value());
		}
		else {
			// 社内場所のみ
			row.addStringColumn(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.LG_GRP_HOUSE.value());
		}
		row.addStringColumn(LocCols.$i_lg_grp_cd, getHdrR().ship_fr_lg_grp_cd());
		return super.getDtl_ship_loc_cd(row, info);
	}

	// Override Interface
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

	public MCCheckBox getCndLatestFlg() {
		return Cnd_latest_flg;
	}

	public MCRowBeans getCndRevNo() {
		return Cnd_ship_inst_rev;
	}

	public MCCheckBox getRegLatestFlg() {
		return Hdr_latest_flg;
	}
	
	@Override
	public MCCheckBox getRegCanFlg() {
		return Hdr_can_flg;
	}

	// Override Interface
	@Override
	public MCTable<?> getRowMoveTable() {
		return DtlTable;
	}

	@Override
	public boolean isStatusChange() {
		return false;
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);

		setRevNoMode();
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
	
	// MSBEP0500
	@Override
	public MCTable<?> getStkTable(MCRootPanel panel) {
		return DtlTable;
	}

	@Override
	public boolean isCndEnable(String ope, String name) {
		if (IfStkInspBase.CND_LG_GRP_CD.equals(name)
				|| IfStkInspBase.CND_LG_GRP_NM.equals(name)
				|| IfStkInspBase.CND_ITM_CD.equals(name)
				|| IfStkInspBase.CND_ITM_SUB1.equals(name)
				|| IfStkInspBase.CND_ITM_SUB2.equals(name)
				|| IfStkInspBase.CND_ITM_SUB3.equals(name)
				|| IfStkInspBase.CND_ITM_NM.equals(name)
				|| IfStkInspBase.CND_SNO1.equals(name)
				|| IfStkInspBase.CND_SNO2.equals(name)
				|| IfStkInspBase.CND_SNO3.equals(name)
				|| IfStkInspBase.CND_SNO4.equals(name)
				|| IfStkInspBase.CND_SNO1_NULL_FLG.equals(name)
				|| IfStkInspBase.CND_SNO2_NULL_FLG.equals(name)
				|| IfStkInspBase.CND_SNO3_NULL_FLG.equals(name)
				|| IfStkInspBase.CND_SNO4_NULL_FLG.equals(name)
				|| IfStkInspBase.CND_GD_CD.equals(name)
				|| IfStkInspBase.CND_GD_NM.equals(name)
				|| IfStkInspBase.CND_STK_BP_CD.equals(name)
				|| IfStkInspBase.CND_STK_BP_NM.equals(name)
				|| IfStkInspBase.CND_STK_ARRV_BP_CD.equals(name)
				|| IfStkInspBase.CND_STK_ARRV_BP_NM.equals(name)
		) {
			return false;
		}
		else if (IfStkInspBase.CND_LOC_CD.equals(name)
					|| IfStkInspBase.CND_LOC_NM.equals(name)
					|| IfStkInspBase.CND_STR_LN_CD.equals(name)
					|| IfStkInspBase.CND_STR_LN_NM.equals(name)) {
			DtlR dr  = DtlTable.getSelectedMCRow();
			// 外注間の支給(予定あり)、支給返品の場合は出荷進捗の持つ場所固定
			if (!isNull(dr.ship_schd_loc_sppl_cd())) {
				return false;
			}
		}

		return true;
	}

	@Override
	public MCRow get_open_MSBEP0500_bind_Row(MCTable<?> table) {
		if (table == null) {
			return null;
		}

		MCRow bindR = MCRow.create();
		HdrR hdrR = getHdrR();
		DtlR dtlR = DtlTable.getSelectedMCRow();

		if (dtlR != null) {
			bindR.addStringColumn(IfStkInspBase.CND_LG_GRP_CD, hdrR.ship_fr_lg_grp_cd());
			bindR.addStringColumn(IfStkInspBase.CND_LG_GRP_NM, hdrR.ship_fr_lg_grp_nm());
			bindR.addStringColumn(IfStkInspBase.CND_LOC_CD, dtlR.ship_loc_cd());
			bindR.addStringColumn(IfStkInspBase.CND_LOC_NM, dtlR.ship_loc_nm());
			bindR.addStringColumn(IfStkInspBase.CND_STR_LN_CD, dtlR.ship_str_ln_cd());
			bindR.addStringColumn(IfStkInspBase.CND_STR_LN_NM, dtlR.ship_str_ln_nm());
			bindR.addStringColumn(IfStkInspBase.CND_ITM_CD, dtlR.itm_cd());
			bindR.addStringColumn(IfStkInspBase.CND_ITM_SUB1, dtlR.itm_sub1());
			bindR.addStringColumn(IfStkInspBase.CND_ITM_SUB2, dtlR.itm_sub2());
			bindR.addStringColumn(IfStkInspBase.CND_ITM_SUB3, dtlR.itm_sub3());
			bindR.addStringColumn(IfStkInspBase.CND_ITM_NM, dtlR.itm_nm());
			bindR.addStringColumn(IfStkInspBase.CND_VER_NO, dtlR.ver_no());
			bindR.addStringColumn(IfStkInspBase.CND_SNO1, dtlR.sno1());
			bindR.addBooleanColumn(IfStkInspBase.CND_SNO1_NULL_FLG, dtlR.sno1_null_flg());
			bindR.addStringColumn(IfStkInspBase.CND_SNO2, dtlR.sno2());
			bindR.addBooleanColumn(IfStkInspBase.CND_SNO2_NULL_FLG, dtlR.sno2_null_flg());
			bindR.addStringColumn(IfStkInspBase.CND_SNO3, dtlR.sno3());
			bindR.addBooleanColumn(IfStkInspBase.CND_SNO3_NULL_FLG, dtlR.sno3_null_flg());
			bindR.addStringColumn(IfStkInspBase.CND_SNO4, dtlR.sno4());
			bindR.addBooleanColumn(IfStkInspBase.CND_SNO4_NULL_FLG, dtlR.sno4_null_flg());
			bindR.addStringColumn(IfStkInspBase.CND_GD_CD, dtlR.gd_cd());
			bindR.addStringColumn(IfStkInspBase.CND_GD_NM, dtlR.gd_nm());

			bindR.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_COSTK_FLG,
					MSC_STK_ID_TYP.isCOSTK(dtlR.stk_id_typ()));
			bindR.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_RTN_PRE_ACCPT_FLG,
					MSC_STK_ID_TYP.isRTN_PRE_ACCPT(dtlR.stk_id_typ()));
			bindR.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_CSTSTK_FLG,
					MSC_STK_ID_TYP.isCSTSTK(dtlR.stk_id_typ()));
			bindR.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_PURC_PRE_ACCPT_FLG,
					MSC_STK_ID_TYP.isPURC_PRE_ACCPT(dtlR.stk_id_typ()));
			bindR.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_RNT_RCV_FLG,
					MSC_STK_ID_TYP.isRNT_RCV(dtlR.stk_id_typ()));
			bindR.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ACCPT_DFCT_FLG,
					MSC_STK_ID_TYP.isACCPT_DFCT(dtlR.stk_id_typ()));
			bindR.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_NCV_RCV_FLG,
					MSC_STK_ID_TYP.isNCV_RCV(dtlR.stk_id_typ()));
			bindR.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ONR_PROV_FLG,
					MSC_STK_ID_TYP.isONR_PROV(dtlR.stk_id_typ()));

			bindR.addStringColumn(IfStkInspBase.CND_STK_ARRV_BP_CD, dtlR.stk_arrv_bp_cd());
			bindR.addStringColumn(IfStkInspBase.CND_STK_ARRV_BP_NM, dtlR.stk_arrv_bp_nm());
			bindR.addStringColumn(IfStkInspBase.CND_STK_BP_CD, dtlR.stk_bp_cd());
			bindR.addStringColumn(IfStkInspBase.CND_STK_BP_NM, dtlR.stk_bp_nm());

			bindR.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_GOOD_FLG,
					MAC_QUALITY_TYP.isGOOD(dtlR.quality_typ()));
			bindR.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_DFCT_OPER_FLG,
					MAC_QUALITY_TYP.isDFCT_OPER(dtlR.quality_typ()));
			bindR.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_DFCT_INSP_FLG,
					MAC_QUALITY_TYP.isDFCT_INSP(dtlR.quality_typ()));
			bindR.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_SSPND_FLG,
					MAC_QUALITY_TYP.isSSPND(dtlR.quality_typ()));

			bindR.addBooleanColumn(IfStkInspBase.CND_STK_INSP_TYP_YET_FLG,
					MSC_STK_INSP_TYP.isYET(dtlR.stk_insp_typ()));
			bindR.addBooleanColumn(IfStkInspBase.CND_STK_INSP_TYP_ING_FLG,
					MSC_STK_INSP_TYP.isING(dtlR.stk_insp_typ()));
			bindR.addBooleanColumn(IfStkInspBase.CND_STK_INSP_TYP_WAIT_JUDG_FLG,
					MSC_STK_INSP_TYP.isWAIT_JUDG(dtlR.stk_insp_typ()));
			bindR.addBooleanColumn(IfStkInspBase.CND_STK_INSP_TYP_FIN_FLG,
					MSC_STK_INSP_TYP.isFIN(dtlR.stk_insp_typ()));

			bindR.addStringColumn(IfStkInspBase.CND_ALLOC_GRP_CD, dtlR.alloc_grp_cd());
			bindR.addStringColumn(IfStkInspBase.CND_ALLOC_GRP_NM, dtlR.alloc_grp_nm());

			if (!isNull(dtlR.ship_schd_loc_sppl_cd())) {
				bindR.addStringColumn(IfStkInspBase.CND_STK_INFO_LOC_TYP,
						MSC_STK_INFO_LOC_TYP.OUTSIDE.value());
			}
			else {
				bindR.addStringColumn(IfStkInspBase.CND_STK_INFO_LOC_TYP,
						MSC_STK_INFO_LOC_TYP.HOUSE.value());
			}
		}

		return bindR;
	}

	@Override
	public String getStkInspOpeType(MCTable<?> table, int index) {
		//在庫情報選択ではフォーカス行のみを更新する
		return IfStkInspBase.OPE_UPD;
	}

	@Override
	public boolean isValueLink(MCRootPanel panel, int index, String ope, String name) {
		if (IfStkInspBase.INPT_VER_NO.equals(name)
				|| IfStkInspBase.INPT_LOT_NO.equals(name)
				|| IfStkInspBase.INPT_SUBLOT_NO.equals(name)
				|| IfStkInspBase.INPT_LOC_CD.equals(name)
				|| IfStkInspBase.INPT_STR_LN_CD.equals(name)
				|| IfStkInspBase.INPT_STR_LN_CD_NONE_FLG.equals(name)
				|| IfStkInspBase.INPT_PACK_UNIT_CD.equals(name)
				|| IfStkInspBase.INPT_PACK_STK_QTY.equals(name)
				|| IfStkInspBase.INPT_SNO1.equals(name)
				|| IfStkInspBase.INPT_SNO2.equals(name)
				|| IfStkInspBase.INPT_SNO3.equals(name)
				|| IfStkInspBase.INPT_SNO4.equals(name)) {
			return true;
		}

		return false;
	}

	@Override
	public String getInptLocCdCol() {
		return DtlR.$ship_loc_cd;
	}

	@Override
	public String getInptStrLnCdCol() {
		return DtlR.$ship_str_ln_cd;
	}

	@Override
	public String getInptStrLnCdNoneFlgCol() {
		return DtlR.$ship_str_ln_cd_none_flg;
	}

	@Override
	public String getInptPackUnitCdCol() {
		return DtlR.$ent_unit_cd;
	}

	@Override
	public String getInptPackStkQtyCol() {
		return DtlR.$ent_unit_qty;
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
		@SuppressWarnings("unchecked")
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR dtlR = (DtlR) table.getBaseTable().getRow(index);

			if (isSame(getStatus(), INS) || isSame(getStatus(), UPD)) {
				// 打切ＦＬＧ ： 出荷予定.インボイス出荷予定数量 ≠ 0の場合は不可
				// 指図分納 ： 出荷予定.インボイス出荷予定数量 ≠ 0の場合は不可(数量変更が不可、併せて単位も変更不可)
				if (column == columnDtl_schd_abort_flg || column == columnDtl_inst_abort_flg) {
					if (!isNull(dtlR.iv_schd_qty())
							&& !isSame(dtlR.iv_schd_qty(), dtlR.ship_act_qty())
							&& !isSame(dtlR.iv_schd_qty(), MCNumber.ZERO)) {
						return MCMode.READ_ONLY;
					}
				}

				// 在庫管理しない品目の場合は、選択、引当ＦＬＧ、場所、構成チェックＦＬＧは変更不可
				if (column == columnDtl_alloc_flg || column == columnDtl_ship_loc_cd
						|| column == columnDtl_skip_chk_ship_flg || column == columnDtl_check) {
					if (MAC_STK_MNG_TYP.isNOT_MNG(dtlR.stk_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				// 指図まとめ、値引品目は単位、数量、打切は変更不可
				if (column == columnDtl_ent_unit_cd
					|| column == columnDtl_ent_unit_qty
					|| column == columnDtl_schd_abort_flg
					|| column == columnDtl_inst_abort_flg) {
					if (dtlR.inst_bndl_flg()
						|| dtlR.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				// ＷＧ間依頼の場合は、単位の変更及び梱包数量提案は不可
				if (column == columnDtl_ent_unit_cd || column == columnDtl_ttl_flg) {
					if (MSC_XFR_SRC_TYP.isWG_RQST(dtlR.xfr_src_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 受注の場合は梱包数量提案は不可
				if (column == columnDtl_ttl_flg) {
					if (MSC_XFR_SRC_TYP.isSLO(dtlR.xfr_src_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				if (column == columnDtl_ship_loc_cd
					|| column == columnDtl_ship_str_ln_cd
					|| column == columnDtl_ship_str_ln_cd_none_flg) {
					// ピッキングなし、外注間の支給(予定あり)、支給返品(予定あり、または訂正)の場合は、場所は変更不可
					if (MAC_SHIP_INST_TYP.isNO_PICK(dtlR.ship_inst_typ())
						|| !isNull(dtlR.ship_schd_loc_sppl_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl_trd_rmrks
					|| column == columnDtl_trd_d_rmrks) {
					if (!dtlR.inst_bndl_flg()) {
						return MCMode.READ_ONLY; 
					}
				}
				
				if (column == columnDtl_alloc_sno1) {
					if (!dtlR.sno1_null_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_alloc_sno2) {
					if (!dtlR.sno2_null_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_alloc_sno3) {
					if (!dtlR.sno3_null_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_alloc_sno4) {
					if (!dtlR.sno4_null_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 場所引当をしない場合
				if(!dtlR.alloc_flg()) {
					if(column == columnDtl_lot_none_flg) {
						return MCMode.READ_ONLY;
					}
				}

				// ロット指定無の場合
				if(dtlR.lot_none_flg()) {
					if(column == columnDtl_lot_no
							|| column == columnDtl_sublot_no) {
						return MCMode.READ_ONLY;
					}
				}
				if (!MAC_TRD_PTN_TYP.isPROV_RTN(dtlR.trd_ptn_typ())) {
					if (column == columnDtl_base_dlv_slip_no
							|| column == columnDtl_base_prov_act_no
							|| column == columnDtl_base_ac_dt) {
						return MCMode.READ_ONLY;
					}
				}
			}

			if (isSame(getStatus(), INS)) {
				// 梱包数量提案処理を行った場合は、数量、基準単位、まとめＦＬＧの変更は不可とする
				if (column == columnDtl_ent_unit_qty) {
					if (dtlR.inst_bndl_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_ent_unit_cd) {
					if (dtlR.inst_bndl_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_inst_bndl_flg) {
					if (dtlR.inst_bndl_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 受注から作成された出荷予定は、梱包数量提案対象外とする
				// 併せて、インボイス取引の場合も対象外とする
				else if (column == columnDtl_ttl_flg) {
					if (!isNull(dtlR.slo_no()) || dtlR.iv_trd_flg()
							|| dtlR.cst_iv_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				// 行コピー元、行コピー先のレコードは、まとめＦＬＧを押せないようにする
				if (column == columnDtl_ttl_flg) {
					if (dtlR.getBooleanNE(ROW_COPY_FLG)) {
						return MCMode.READ_ONLY;
					}
				}
			}

			if (isSame(getStatus(), UPD)) {
				// 打切ＦＬＧがオンの場合は、数量の変更は不可
				if (column == columnDtl_ent_unit_qty) {
					if (dtlR.inst_abort_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 打切ＦＬＧがオンの場合は、引当ＦＬＧの入力は不可
				if (column == columnDtl_alloc_flg) {
					if (dtlR.inst_abort_flg() || dtlR.bef_abort_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			if (column == columnDtl_wms_flg) {
				if (!dtlR.wms_tgt_flg()) {
					return MCMode.READ_ONLY;
				}
			}

			return super.getPriorMode(index, column, table);
		}
		@Override
		public MCMode getPriorDeleteMode(int index, MCColumnConfig column, MCTable table) {
			DtlR dtlR = (DtlR) table.getBaseTable().getRow(index);

			if (isSame(getStatus(),FIX_U)) {
				return MCMode.READ_ONLY;
			}
			if (column == columnDtl_wms_flg) {
				if (dtlR.wms_tgt_flg()) {
					return MCMode.REQUIRED;
				}
			}

			return super.getPriorDeleteMode(index, column, table);
		}
	}

	// RowMatcher
	protected MCRowMatcher<DtlR> createPckgRowMatcher(DtlR r) {
		return new PckgRowMatcher<DtlR>(r);
	}

	public class PckgRowMatcher<R extends DtlR> implements MCRowMatcher<R> {

		protected DtlR _dtlR;

		public PckgRowMatcher(DtlR r) {
			this._dtlR = r;
		}

		@Override
		public boolean match(R row) {
			// 梱包数量提案時における、キー項目を指定する
			if (!isSame(_dtlR.itm_cd(), row.itm_cd())
					|| !isSame(_dtlR.itm_sub1(), row.itm_sub1())
					|| !isSame(_dtlR.itm_sub2(), row.itm_sub2())
					|| !isSame(_dtlR.itm_sub3(), row.itm_sub3())
					|| !isSame(_dtlR.itm_nm(), row.itm_nm())
					|| !isSame(_dtlR.lot_no(), row.lot_no())
					|| !isSame(_dtlR.sublot_no(), row.sublot_no())
					|| !isSame(_dtlR.ver_no(), row.ver_no())
					|| !isSame(_dtlR.alloc_ver_no(), row.alloc_ver_no())
					|| !isSame(_dtlR.ship_loc_cd(), row.ship_loc_cd())
					|| !isSame(_dtlR.ship_str_ln_cd(), row.ship_str_ln_cd())
					|| !isSame(_dtlR.ship_str_ln_cd_none_flg(), row.ship_str_ln_cd_none_flg())
					|| !isSame(_dtlR.stk_arrv_bp_cd(), row.stk_arrv_bp_cd())
					|| !isSame(_dtlR.dlv_id_cd(), row.dlv_id_cd())
					|| !isSame(_dtlR.dlv_id_typ(), row.dlv_id_typ())
					|| !isSame(_dtlR.dlv_str_ln_cd(), row.dlv_str_ln_cd())
					|| !isSame(_dtlR.quality_typ(), row.quality_typ())
					|| !isSame(_dtlR.gd_cd(), row.gd_cd())
					|| !isSame(_dtlR.sno1_null_flg(), row.sno1_null_flg())
					|| !isSame(_dtlR.sno2_null_flg(), row.sno2_null_flg())
					|| !isSame(_dtlR.sno3_null_flg(), row.sno3_null_flg())
					|| !isSame(_dtlR.sno4_null_flg(), row.sno4_null_flg())
					|| !isSame(_dtlR.sno1(), row.sno1())
					|| !isSame(_dtlR.sno2(), row.sno2())
					|| !isSame(_dtlR.sno3(), row.sno3())
					|| !isSame(_dtlR.sno4(), row.sno4())
					|| !isSame(_dtlR.alloc_sno1(), row.alloc_sno1())
					|| !isSame(_dtlR.alloc_sno2(), row.alloc_sno2())
					|| !isSame(_dtlR.alloc_sno3(), row.alloc_sno3())
					|| !isSame(_dtlR.alloc_sno4(), row.alloc_sno4())
					|| !isSame(_dtlR.stk_insp_typ(), row.stk_insp_typ())
					|| !isSame(_dtlR.trd_cd(), row.trd_cd())
					|| !isSame(_dtlR.stk_id_typ(), row.stk_id_typ())
					|| !isSame(_dtlR.stk_bp_cd(), row.stk_bp_cd())
					|| !isSame(_dtlR.rsn_cd(), row.rsn_cd())
					|| !isSame(_dtlR.bd_dpt_cd(), row.bd_dpt_cd())
					|| !isSame(_dtlR.prov_typ(), row.prov_typ())
					|| !isSame(_dtlR.prov_basis_typ(), row.prov_basis_typ())
					|| !isSame(_dtlR.ret_prov_typ(), row.ret_prov_typ())
					|| !isSame(_dtlR.ret_prov_basis_typ(), row.ret_prov_basis_typ())
					|| !isSame(_dtlR.base_unit_cd(), row.base_unit_cd())
					|| !isSame(_dtlR.pckg_unit_cd(), row.pckg_unit_cd())
					|| !isSame(_dtlR.pckg_unit_dec_place(), row.pckg_unit_dec_place())
					|| !isSame(_dtlR.pckg_unit_conv_base_qty(), row.pckg_unit_conv_base_qty())
					|| !isSame(_dtlR.pckg_unit_conv_qty(), row.pckg_unit_conv_qty())
					|| !isSame(_dtlR.pckg_unit_rnd_typ(), row.pckg_unit_rnd_typ())
					|| !isSame(_dtlR.slo_no(), row.slo_no())) {
				return false;
			}

			return true;
		}
	}

	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... param) {
		super.initByScreenParam(openTyp, bind, param);

		if (T1.equals(openTyp)) {
			MCList<DtlR> dtlL = (MCList<DtlR>) param[0];

			if (!dtlL.isEmpty()) {
				MCList<DtlR> schdNoL = dtlL.groupBy(DtlR.$ship_schd_no);
				String[] schdNos = schdNoL.getString(DtlR.$ship_schd_no)
						.toArray(new String[schdNoL.size()]);

				getHdrR().linked_ship_schd_no(MCStringUtil.arrayValueJoin(schdNos));
				addDoBehind(Cnd_srch2);
			}

			for (DtlR row : dtlL) {
				row.setStatus(Status.CREATE);
				row.ship_fr_lg_grp_cd(bind.getStringNE("ship_fr_lg_grp_cd"));

			}

			setTmpInstDNo();
			sort(DtlTable);
			DtlTable.adjustWidth();

			_nonPlnFlg = true;
		}
		else if (isSame("APP_SCREEN_OPENER", openTyp)) {
			// ScreenOpenerで呼ばれたときは何もしない
		}
		else {
			throw new MCAppException(msgUnknownOpenParam());
		}
	}

}