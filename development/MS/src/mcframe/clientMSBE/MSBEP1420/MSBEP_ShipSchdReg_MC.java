package mcframe.clientMSBE.MSBEP1420;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0110.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5290.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5360.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP0070.*;
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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientMSUD.MSUDP0020.IfStkInspBase;
import java.util.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_ShipSchdReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_ShipSchdReg_MC extends MSBEP_ShipSchdReg_MC_A implements IfListRegPanel, IfStkInspBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected HashMap<String, Boolean> _shipWkList = null;
	protected boolean _selectOnOffFlg = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_ShipSchdReg_MC() {
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
	public MSBEP_ShipSchdReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL1420_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1420_Sprt01Caller<P extends MSBEP_ShipSchdReg, B extends MS_MSBEL1420_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBEL1420_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Btn]のボタン[sprt_ac_dt]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_ac_dt(MCEventInfo info) {
		callMS_MSBEL1420_Sprt01();
	}
	
	/**
	 * [MS_MSBEL1420_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1420_Srch01Caller<P extends MSBEP_ShipSchdReg, B extends MS_MSBEL1420_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1420_Srch01Caller(P p, B b) {
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
			msgList.addAll(checkAtLeastOne(PrStsPanel));
			msgList.addAll(checkAtLeastOne(AllocStsPanel));
			msgList.addAll(checkAtLeastOne(ShipBlkPanel));
		}
		
		@Override
		protected void setMode() {
			super.setMode();

			bridge.down0().setBoolean(RsltR.$no_calc_flg, true);
			setRefStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			setSrchStatus();
		}
	}

	/**
	 * [MS_MSBEL1420_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1420_Srch02Caller<P extends MSBEP_ShipSchdReg, B extends MS_MSBEL1420_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBEL1420_Srch02Caller(P p, B b) {
			super(p, b);
		}
		
		MCList<RsltR> _dtlForCheck;
		
		@Override
		protected void initCaller() {
			super.initCaller();
			_dtlForCheck = getRsltL().subList(RsltR.$check, true);
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			
			bridge.up0().removeAll(bridge.up0().subList(r -> (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ()))));
			
			for (RsltR r : bridge.up0()) {
				// 値が絶対重複しない、GUIIndex を利用
				r.lot_peg_no(r.getGUIIndex());
			}
		}
		
		@Override
		protected void setMode() {
			super.setMode();

			RsltTable.selectLeftmostColumn(0);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBEP0037);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			for (RsltR r : _dtlForCheck) {
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnRslt_alloc_ent_unit_cd));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnRslt_alloc_ent_unit_qty));
			}
		}
		
		@Override
		protected void showMerge() {
			MCIndexKey idx = bridge.down0().createIndex(RsltR.$lot_peg_no);
			MCList<RsltR> newL = MCList.create(RsltR.class);

			for (RsltR r : getRsltL()) {
				MCList<RsltR> l = bridge.down0().subList(idx, MCNumber.valueOf(r.getGUIIndex()));
				if (l.isEmpty()) {
					newL.add(r);
				}
				else {
					boolean hasUpdRFlg = false;
					for (RsltR r2 : l) {
						RsltR newR = r.clone();
						copyLotRslt(newR, r2);
						newL.add(newR);
						if (hasUpdRFlg) {
							newR.setStatus(MCRow.CREATE);
						}
						hasUpdRFlg = true;
					}
				}
			}
			getRsltL().setAll(newL);
		}
		protected void copyLotRslt(RsltR dest, RsltR src) {
			dest.loc_cd(src.loc_cd());
			dest.loc_nm(src.loc_nm());
			dest.str_ln_cd(src.str_ln_cd());
			dest.str_ln_nm(src.str_ln_nm());
			dest.str_ln_cd_none_flg(src.str_ln_cd_none_flg());
			dest.str_ln_tgt_flg(src.str_ln_tgt_flg());
			dest.ver_no(src.ver_no());
			dest.alloc_ent_unit_cd(src.alloc_ent_unit_cd());
			dest.alloc_ent_unit_nm(src.alloc_ent_unit_nm());
			dest.alloc_ent_unit_conv_base_qty(src.alloc_ent_unit_conv_base_qty());
			dest.alloc_ent_unit_conv_qty(src.alloc_ent_unit_conv_qty());
			dest.alloc_ent_unit_dec_place(src.alloc_ent_unit_dec_place());
			dest.alloc_ent_unit_qty(src.alloc_ent_unit_qty());
			dest.alloc_base_unit_qty(src.alloc_base_unit_qty());
			dest.alloc_sno1(src.alloc_sno1());
			dest.alloc_sno2(src.alloc_sno2());
			dest.alloc_sno3(src.alloc_sno3());
			dest.alloc_sno4(src.alloc_sno4());
			dest.act_cont_qty(src.act_cont_qty());
			dest.act_cont_fctr(src.act_cont_fctr());
			dest.std_cont_qty(src.std_cont_qty());
			if (src.no_alloc_flg()) {
				dest.alloc_flg(false);
				dest.lot_no(null);
				dest.sublot_no(null);
			}
			else {
				dest.alloc_flg(true);
				dest.lot_no(src.lot_no());
				dest.sublot_no(src.sublot_no());
			}
		}
	}

	/**
	 * [MS_MSBEL1420_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1420_Upd01Caller<P extends MSBEP_ShipSchdReg, B extends MS_MSBEL1420_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1420_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBEL1420_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBEL1420_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP1400]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1400(MCEventInfo info) {
		if (Cnd_ope_UPD.isSelected()) {
			MCList<RsltR> l = getRsltL().subList("check", true);
			if (l.size() <= 0) {
				dialog(msgNoSelectedRow());
				return;
			}

			MCList<mcframe.clientMSBE.MSBEP1400.DtlR> bL = MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class);
			for (RsltR r : getRsltL().subList("check", true)) {
				mcframe.clientMSBE.MSBEP1400.DtlR b = mcframe.clientMSBE.MSBEP1400.DtlR.create();
				b.ship_schd_no(r.ship_schd_no());
				bL.add(b);
			}
			openPanel("MS", "MSBEP1400", T1, bL.get(0), bL);
		}
		else {
			RsltR r = RsltTable.getSelectedMCRow();
			if (r == null) {
				dialog(msgNoSelectedRow());
				return;
			}
			if (isNull(r.ship_inst_no())) {
				dialog(msgNoSelectedRow());
				return;
			}
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1400");
			aso.putCnd(crtOpenMSBEP1400CndR(aso, r));
			aso.putSearchAction();
			aso.show();
		}
	}
	protected mcframe.clientMSBE.MSBEP1400.CndR crtOpenMSBEP1400CndR(
			MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1400.MSBEP_ShipInstReg p = (mcframe.clientMSBE.MSBEP1400.MSBEP_ShipInstReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1400.CndR to = mcframe.clientMSBE.MSBEP1400.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.ship_inst_no(r.ship_inst_no());
		to.ship_inst_rev(null);
		to.latest_flg(true);
		return to;	
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP1440]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1440(MCEventInfo info) {
		MCList<RsltR> l = getRsltL().subList("check", true);
		if (l.size() <= 0) {
			dialog(msgNoSelectedRow());
			return;
		}
		openPanel("MS", "MSBEP1440", T1, l.get(0), l);
	}

	/**
	 * Panel[Btn]のボタン[srch02]の押下時の処理
	 */
	@Override
	public void doBtn_srch02(MCEventInfo info) {
		callMS_MSBEL1420_Srch02();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP1430]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1430(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBEP1430(r);
	}
	protected void doBtn_open_MSBEP1430(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1430");
		aso.putCnd(crtOpenMSBEP1430CndR(aso, r));
		aso.putSearchAction();
		aso.runValueInit();
		aso.show();
	}
	protected mcframe.clientMSBE.MSBEP1430.CndR crtOpenMSBEP1430CndR(
			MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1430.CndR to = mcframe.clientMSBE.MSBEP1430.CndR.create();
		to.lg_grp_cd(r.ship_fr_lg_grp_cd());
		to.ship_wk_grp_cd(r.ship_wk_grp_cd());

		to.ship_schd_dt_fr(r.ship_schd_dt());
		to.ship_schd_hm_fr(r.ship_schd_hm());
		to.ship_schd_dt_to(r.ship_schd_dt());
		to.ship_schd_hm_to(r.ship_schd_hm());

		return to;
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		_selectOnOffFlg = true;
		if (!isNull(getBulkSetR().ship_wk_cd())) {
			_shipWkList = new HashMap<String, Boolean>();
			String[] shipWkListKey = null;
			if (useBulkShipSchdTime()) {
				shipWkListKey = new String[]{RsltR.$ship_wk_grp_cd, RsltR.$pd_inst_dlv_hm};
			}
			else {
				shipWkListKey = new String[]{RsltR.$ship_wk_grp_cd, RsltR.$pd_inst_dlv_hm, RsltR.$ship_schd_time};
			}
			for (RsltR rsltR : RsltTable.getViewRows().groupBy(shipWkListKey)) {
				MCRow row = MCRow.create();
				row.addStringColumn("ship_wk_grp_cd", rsltR.ship_wk_grp_cd());
				row.addDateColumn("dlv_rqst_tm", rsltR.pd_inst_dlv_hm());
				row.addStringColumn("ship_schd_time", getShipSchdTime(rsltR));
				row.addStringColumn("ship_wk_cd", getBulkSetR().ship_wk_cd());
				String key = rsltR.ship_wk_grp_cd()
						+ ";" + String.valueOf(rsltR.pd_inst_dlv_hm()) 
						+ ";" + getShipSchdTime(rsltR)
						+ ";" + getBulkSetR().ship_wk_cd();
				if (!_shipWkList.containsKey(key)) {
					_shipWkList.put(key, false);
					MCList<MCRow> shipWkL = getShipWkCdList(row, info);
					if (!isNull(shipWkL)) {
						for (MCRow wkR : shipWkL) {
							if (isSame(getBulkSetR().ship_wk_cd(), wkR.getStringNE("ship_wk_cd"))) {
								_shipWkList.put(key, true);
								break;
							}
						}
					}
				}
			}
		}
		doSelectAll(RsltTable);
		setBtnMode();
		_shipWkList = null;
		_selectOnOffFlg = false;
	}

	protected boolean hasShipWkCd(RsltR r, String shipWkCd) {
		String key = r.ship_wk_grp_cd()
				+ ";" + String.valueOf(r.pd_inst_dlv_hm())
				+ ";" + getShipSchdTime(r)
				+ ";" + shipWkCd;
		return _shipWkList.get(key);
	}

	protected boolean useBulkShipSchdTime() {
		// 一括設定の出荷予定時刻がnullでない場合は明細に反映されるため、一括設定の出荷予定時刻で出荷作業の設定可否をチェック
		// 上記以外は明細に反映されないため、明細の出荷予定時刻を使用する
		return !isNull(getBulkSetR().ship_schd_hm());
	}

	protected String getShipSchdTime(RsltR r) {
		return useBulkShipSchdTime() ? getShipSchdTimeChar(getBulkSetR()) : r.ship_schd_time();
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		_selectOnOffFlg = true;
		doDeselectAll(RsltTable);
		setBtnMode();
		_selectOnOffFlg  = false;
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		RsltR r = deleteRow(RsltTable);
		MCList<RsltR> tmpL = RsltTable.getViewRows().subList(RsltR.$ship_schd_no, r.ship_schd_no());
		for(RsltR data : tmpL) {
			if(tmpL.size() == 1) {
				data.div_flg(false);
			}
		}
		if (r.isStatusDelete() && isNull(r.trd_unit_qty())) {
			setValueEx(columnRslt_trd_unit_qty, r.getGUIIndex(), MCNumber.ZERO);
		}
		if (r.isStatusNone()) {
			r.check(false);
		}
		setFixFlg_del(r);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		RsltR r = copyRow(RsltTable);
		clearNotCopyCol(r.getGUIIndex());
		selectSameShipSchdNo(r);
		setFixFlg_add(r);
	}
	
	protected void clearNotCopyCol(int index) {
		if (Cnd_md_ALLOC.isSelected()) {
			RsltR r = getRsltL().get(index);
			if (!isNull(r.ship_alloc_sts_no())) {
				setValueEx(columnRslt_org_ship_alloc_sts_no, index, r.ship_alloc_sts_no());
			}
		}
		setValueEx(columnRslt_ship_alloc_sts_no, index, null);
		if (Cnd_md_SHIP.isSelected()) {
			setValueEx(columnRslt_alloc_sts_typ, index, null);
			setValueEx(columnRslt_alloc_sts_typ_nm, index, null);
			setValueEx(columnRslt_trd_unit_qty, index, null);
			setValueEx(columnRslt_schd_alloc_qty, index, null);
			setValueEx(columnRslt_schd_wait_qty, index, null);
		}
		if (Cnd_md_ALLOC.isSelected()) {
			setValueEx(columnRslt_alloc_ent_unit_qty, index, null);
			setValueEx(columnRslt_abort_flg, index, null);
			RsltR r = getRsltL().get(index);
			if (r.alloc_flg() && r.ship_loc_prio_flg() && MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(r.alloc_scope_typ())) {
				setValueEx(columnRslt_loc_cd, index, r.def_loc_cd());
			}
			else {
				setValueEx(columnRslt_loc_cd, index, null);
				setValueEx(columnRslt_str_ln_cd, index, null);
				setValueEx(columnRslt_str_ln_cd_none_flg, index, false);
			}
			setValueEx(columnRslt_lot_no, index, null);
			setValueEx(columnRslt_sublot_no, index, null);
			setValueEx(columnRslt_ver_no, index, null);
		}
	}

	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> cols = super.getNotInheritCols(type, cont);
		cols.remove(RsltR.$ship_pr_upd_cntr);
		return cols;
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBEL1420_Upd01();
	}

	@Override
	protected void listInit() {
		super.listInit();

		columnRslt_ship_term_cd.addIgnoreListBeans(columnRslt_ship_wk_cd);
	}
	// -----------------------------------------------
	// init-parts

	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_alloc_qty_p_PPanel.setRelateBeans(
			columnRslt_itm_cd, columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3,
			columnRslt_alloc_ent_unit_cd, columnRslt_alloc_ent_unit_dec_place, columnRslt_alloc_ent_unit_rnd_typ,
			columnRslt_alloc_ent_unit_conv_base_qty, columnRslt_alloc_ent_unit_conv_qty, columnRslt_base_unit_cd);
		Rslt_base_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place, columnRslt_base_unit_rnd_typ,
				columnRslt_trd_unit_qty, columnRslt_trd_unit_conv_base_qty,
				columnRslt_trd_unit_conv_qty);
		Rslt_alloc_base_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place, columnRslt_base_unit_rnd_typ,
				columnRslt_alloc_ent_unit_qty, columnRslt_alloc_ent_unit_conv_base_qty,
				columnRslt_alloc_ent_unit_conv_qty);
		Rslt_schd_alloc_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_schd_wait_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_inst_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_act_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_iv_schd_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_iv_act_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_act_cont_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg,
				columnRslt_base_unit_qty, null,
				columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ);
		Rslt_std_cont_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg,
				columnRslt_base_unit_qty, columnRslt_std_cont_fctr,
				null, columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ);
		Rslt_str_ln_p_PPanel.setRelateBeans(columnRslt_loc_cd, columnRslt_str_ln_tgt_flg);
		Rslt_lot_no_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2, columnRslt_itm_sub3, columnRslt_lot_mng_typ, columnRslt_sublot_mng_typ);
		Rslt_ver_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3, null, columnRslt_ver_flg);
		Rslt_ship_to_addr_p_PPanel.setRelateBeans(columnRslt_ship_to_id_cd, columnRslt_ship_to_id_nm, columnRslt_ship_to_sundry_flg);

		// 取引先分類、品目分類
		Rslt_dlv_grp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
		Rslt_cst_grp_p_PPanel.setRelateBeans(Cnd_cst_grp_p_PPanel);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		// 版ＮＯ
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);
	}

	// -----------------------------------------------
	// init-screen

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
		setValueEx(Cnd_md_Group, Cnd_md_SHIP.getActionCommand());

		setValueEx(Cnd_not_inst_flg, true);
		setValueEx(Cnd_not_alloc_flg, true);
		setValueEx(Cnd_part_alloc_flg, true);
		setValueEx(Cnd_all_alloc_flg, true);
		setValueEx(Cnd_alloc_invalid_flg, true);
		setValueEx(Cnd_ship_block_flg, true);
		setValueEx(Cnd_not_ship_block_flg, true);
	}

	@Override
	protected void fillSpaceForOpen() {
	}

	protected void fillSpace() {
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();

		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public MCList getRslt_ship_wk_cd(MCRow row, MCEventInfo info) {
		MCList<MCRow> list = MCList.create(MCRow.class);
		list.addStringColumn("ship_wk_cd");
		list.addStringColumn("ship_wk_nm");
		list.addStringColumn("_view");
		list.addAll((MCList<MCRow>) super.getRslt_ship_wk_cd(row, info));
		list = list.groupBy("ship_wk_cd", "ship_wk_nm", "_view");
		return list;
	}

	protected MCList<MCRow> getShipWkCdList(MCRow row, MCEventInfo info) {
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipWk(row, info);
	}
	// -----------------------------------------------
	// status
	
	@Override
	public void setUPD_SHIPStatus() {
		super.setUPD_SHIPStatus();
		setBtnMode();
		setCndMode();
	}
	@Override
	public void setUPD_ALLOCStatus() {
		super.setUPD_ALLOCStatus();
		setBtnMode();
		setCndMode();
	}

	@Override
	public void setFIX_SHIPStatus() {
		super.setFIX_SHIPStatus();
		setBtnMode();
		setCndMode();
	}
	
	@Override
	public void setFIX_ALLOCStatus() {
		super.setFIX_ALLOCStatus();
		setBtnMode();
		setCndMode();
	}

	@Override
	public void setSRCH_UPDStatus() {
		super.setSRCH_UPDStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		setCndMode();
	}

	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		setCndMode();
	}

	@Override
	public void setREF_SHIPStatus() {
		super.setREF_SHIPStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
		setCndMode();
	}

	@Override
	public void setREF_ALLOCStatus() {
		super.setREF_ALLOCStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
		setCndMode();
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		MCButton openStkInfo = Btn_Btn_open_MSBEP0500_PPanel.StkInfo_open_MSBEP0500;

		// 行削除、行コピーボタン
		if (r == null) {
			Btn_rdel.setMode(MCMode.DISABLE);
			Btn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			// 行コピーした行のみ行削除できる
			if (r.isStatusCreate()) {
				setDefaultMode(Btn_rdel);
			}
			// 予定分割された行、かつインボイス未登録または未確定の行は行削除できる
			else if (Cnd_md_SHIP.isSelected() && ( !(r.iv_reg_flg() || r.org_fix_flg()) )) {
				if (getRsltL().subList(RsltR.$ship_pr_no, r.ship_pr_no()).size() > 1) {
					setDefaultMode(Btn_rdel);
				}
				else {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
			}
			else {
				Btn_rdel.setMode(MCMode.DISABLE);
			}

			// 打切り行はコピー不可
			if (r.abort_flg()) {
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else if (r.dscnt_itm_flg()) {
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else if (MSC_PR_STS_TYP.isPART_SHIP(r.pr_sts_typ())) {
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				// 出荷予定モード、かつインボイスまたは確定行はコピー不可
				if (Cnd_md_SHIP.isSelected() && (r.iv_reg_flg() || r.org_fix_flg())) {
					Btn_rcopy.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(Btn_rcopy);
				}
			}
		}
		
		// 画面遷移ボタン
		if (isEnableBtn_open_MSBEP1400()) {
			setDefaultMode(Btn_open_MSBEP1400);
		}
		else {
			Btn_open_MSBEP1400.setMode(MCMode.DISABLE);
		}
		if (isEnableBtn_open_MSBEP1440()) {
			setDefaultMode(Btn_open_MSBEP1440);
		}
		else {
			Btn_open_MSBEP1440.setMode(MCMode.DISABLE);
		}
		if (isEnableBtn_open_MSBEP0500(r)) {
			setDefaultMode(openStkInfo);
		}
		else {
			openStkInfo.setMode(MCMode.DISABLE);
		}
		if (isEnableBtn_open_MSBEP1430(r)) {
			setDefaultMode(Btn_open_MSBEP1430);
		}
		else {
			Btn_open_MSBEP1430.setMode(MCMode.DISABLE);
		}

		// ロット提案ボタン
		if (isEnableBtn_srch02()) {
			setDefaultMode(Btn_srch02);
		}
		else {
			Btn_srch02.setMode(MCMode.DISABLE);
		}
	}
	/**
	 * 出荷指図登録画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP1400() {
		if (Cnd_ope_UPD.isSelected()) {
			MCList<RsltR> l = getRsltL().subList("check", true);
			if (l.isEmpty()) {
				return false;
			}
			for (RsltR r : l) {
				if (MAC_SHIP_INST_TYP.isNON(r.ship_inst_typ())
						|| !MSC_PR_STS_TYP.isNOT_INST(r.pr_sts_typ())
						|| !r.ship_abl_flg()
						|| r.abort_flg()
						|| r.ship_block_flg()) {
					return false;
				}
			}
			if (!chkSameHeader(l)) {
				return false;
			}
			return true;
		}
		else {
			RsltR r = RsltTable.getSelectedMCRow();
			if (r == null) {
				return false;
			}
			return !isNull(r.ship_inst_no());
		}
	}
	protected boolean chkSameHeader(MCList<RsltR> l) {
		return l.groupList(
				RsltR.$ship_fr_lg_grp_cd,
				RsltR.$ship_to_id_typ,
				RsltR.$ship_to_id_cd,
				RsltR.$ship_to_lg_grp_cd,
				RsltR.$ship_to_id_nm,
				RsltR.$ship_to_zip_cd,
				RsltR.$ship_to_addr1,
				RsltR.$ship_to_addr2,
				RsltR.$ship_to_addr3,
				RsltR.$ship_to_addr4,
				RsltR.$ship_to_cntct_dpt,
				RsltR.$ship_to_cntct_psn,
				RsltR.$ship_to_tel,
				RsltR.$ship_to_fax,
				RsltR.$ship_term_cd,
				RsltR.$src_ship_schd_dt,
				RsltR.$src_ship_schd_hm,
				RsltR.$dlv_schd_dt,
				RsltR.$dlv_schd_hm,
				RsltR.$ship_wk_grp_cd,
				RsltR.$ship_wk_cd,
				RsltR.$dlv_id_typ,
				RsltR.$iv_no,
				RsltR.$via_dlv_typ).length == 1;
	}
	/**
	 * 出荷実績登録画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP1440() {
		MCList<RsltR> l = getRsltL().subList("check", true);
		if (l.isEmpty()) {
			return false;
		}
		for (RsltR r : l) {
			if (!MAC_SHIP_INST_TYP.isNON(r.ship_inst_typ())
					|| !r.ship_abl_flg()
					|| r.abort_flg()
					|| r.ship_block_flg()) {
				return false;
			}
		}
		if (!chkSameHeader(l)) {
			return false;
		}
		return true;
	}
	/**
	 * 在庫情報選択画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP0500(RsltR r) {
		if (r == null) {
			return false;
		}
		return Cnd_ope_UPD.isSelected() && Cnd_md_ALLOC.isSelected();
	}
	/**
	 * 出荷計画一覧照会画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP1430(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}
	/**
	 * ロット提案ボタンが押下できるか
	 * @return
	 */
	protected boolean isEnableBtn_srch02() {
		MCList<RsltR> l = getRsltL().subList("check", true);
		if (l.isEmpty()) {
			return false;
		}
		return Cnd_ope_UPD.isSelected() && Cnd_md_ALLOC.isSelected();
	}

	protected boolean isUpdShipStatus() {
		return isSame(getStatus(), UPD_SHIP);
	}

	protected boolean isUpdAllocStatus() {
		return isSame(getStatus(), UPD_ALLOC);
	}

	protected boolean isRegStatus() {
		return isUpdShipStatus() || isUpdAllocStatus();
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setSRCH_UPDStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCH_REFStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			if (Cnd_md_SHIP.isSelected()) {
				setUPD_SHIPStatus();
			}
			else if (Cnd_md_ALLOC.isSelected()) {
				setUPD_ALLOCStatus();
			}
			RsltTable.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_md_SHIP.isSelected()) {
				setREF_SHIPStatus();
			}
			else if (Cnd_md_ALLOC.isSelected()) {
				setREF_ALLOCStatus();
			}
		}
		Ctrl_ctrl_PPanel.expand(false);
	}
	

	// -----------------------------------------------
	// Event

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			if (!isRegStatus() || isStatusNone(getRsltL())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		clearContainers(getRsltL());
		clearCnd();
		fillSpace();
		setSrchStatus();
		setStatusColumn();
	}

	protected void clearCnd() {
		if (Cnd_ope_UPD.isSelected()) {
			setValueEx(Cnd_inst_flg, false);
			setValueEx(Cnd_part_ship_flg, false);
			setValueEx(Cnd_ship_flg, false);
			setValueEx(Cnd_ship_inst_no, null);
			setValueEx(Cnd_ship_inst_d_no, null);
		}
		else if (Cnd_ope_REF.isSelected()) {
		}
	}

	protected void setStatusColumn() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}

	@Override
	public boolean doCnd_md_VC(MCEventInfo info) {
		if (!super.doCnd_md_VC(info)) {
			return false;
		}
		else {
			if (!isRegStatus() || isStatusNone(getRsltL())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}

	@Override
	public void doCnd_md_NC(MCEventInfo info) {
		super.doCnd_md_NC(info);

		clearContainers(getRsltL());
		if (Cnd_md_SHIP.isSelected()) {
			setValueEx(Cnd_site_cd, null);
			setValueEx(Cnd_loc_cd, null);
			setValueEx(Cnd_str_ln_cd, null);
			CndR cndR = getCndR();
			if (cndR.not_alloc_flg() && cndR.all_alloc_flg()) {
				// 未引当と引当済の両方を検索⇒一部引当を検索とみなす
				setValueEx(Cnd_part_alloc_flg, true);
			}
		}
		else {
			setValueEx(Cnd_part_ship_flg, false);
			setValueEx(Cnd_part_alloc_flg, false);
		}
		setCndMode();
		Ctrl_ctrl_PPanel.expand(true);
	}
	protected void setCndMode() {
		Btn_rdel.setMode(MCMode.DISABLE);
		Btn_rcopy.setMode(MCMode.DISABLE);
		if (Cnd_md_SHIP.isSelected()) {
			setDefaultMode(Cnd_part_ship_flg);
			setDefaultMode(Cnd_part_alloc_flg);
			Cnd_site_cd.setMode(MCMode.READ_ONLY);
			Cnd_site_nm.setMode(MCMode.READ_ONLY);
			Cnd_loc_cd.setMode(MCMode.READ_ONLY);
			Cnd_loc_nm.setMode(MCMode.READ_ONLY);
			Cnd_str_ln_cd.setMode(MCMode.READ_ONLY);
			Cnd_str_ln_nm.setMode(MCMode.READ_ONLY);
		}
		else {
			if (Cnd_ope_UPD.isSelected()) {
				Cnd_part_ship_flg.setMode(MCMode.READ_ONLY);
			}
			Cnd_part_alloc_flg.setMode(MCMode.READ_ONLY);
			setDefaultMode(Cnd_site_cd);
			setDefaultMode(Cnd_site_nm);
			setDefaultMode(Cnd_loc_cd);
			setDefaultMode(Cnd_loc_nm);
			setDefaultMode(Cnd_str_ln_cd);
			setDefaultMode(Cnd_str_ln_nm);
		}
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}
	
	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);

		if (!_selectOnOffFlg) {
			setBtnMode();
		}

		RsltR r = getRsltL().get(info.getEventIndex());
		if (Cnd_md_SHIP.isSelected()) {
			if (r.check()) {
				// 一括設定枠の項目の値を設定する
				// 時刻が異なる場合は時刻でイベントを発生させる
				if (isSame(r.ent_ship_schd_hm(), getBulkSetR().ship_schd_hm())) {
					bulkSet(BulkSet_ship_schd_dt, r);
				}
				else if (isEditable(columnRslt_ent_ship_schd_dt, r.getGUIIndex())) {
					r.ent_ship_schd_dt(getBulkSetR().ship_schd_hm());
				}
				bulkSet(BulkSet_ship_schd_hm, r);
				bulkSet(BulkSet_dlv_schd_dt, r);
				bulkSet(BulkSet_dlv_schd_hm, r);
				bulkSet(BulkSet_ship_wk_cd, r);
			}
			if (!_selectOnOffFlg) {
				selectSameShipSchdNo(r);
			}
		}
		else if (Cnd_md_ALLOC.isSelected()) {
			if (r.check() && !r.alloc_flg()) {
				if (isEditable(columnRslt_alloc_flg, r.getGUIIndex())) {
					setValueEx(columnRslt_alloc_flg, r.getGUIIndex(), true);
				}
			}
		}
	}
	
	/**
	 * 指定された行と同じ出荷予定ＮＯのレコードを選択する。
	 */
	protected void selectSameShipSchdNo(RsltR r) {
		if (Cnd_md_ALLOC.isSelected()) return;
		
		MCList<RsltR> l = createRsltL();
		for (RsltR data : RsltTable.getViewRows()) {
			if (isSame(r.ship_schd_no(), data.ship_schd_no())) {
				data.check(r.check());
				l.add(data);
			}
		}
		if (l.size() > 1) {
			l.forEach(rr -> rr.div_flg(true));
		}
	}
	
	/**
	 * 分割行の確定フラグを設定する。
	 */
	protected void setFixFlg_add(RsltR r) {
		if (Cnd_md_ALLOC.isSelected()) return;
		
		MCList<RsltR> l = getRsltL().subList(RsltR.$ship_schd_no, r.ship_schd_no());

		for (RsltR rr : l) {
			if (rr == r) {
				setValueEx(columnRslt_fix_flg, rr.getGUIIndex(), rr.org_fix_flg());
			}
			else {
				setValueEx(columnRslt_fix_flg, rr.getGUIIndex(), true);
			}
		}
	}
	
	/**
	 * 分割行の確定フラグを設定する。
	 */
	protected void setFixFlg_del(RsltR r) {
		if (Cnd_md_ALLOC.isSelected()) return;
		
		MCList<RsltR> l = getRsltL().subList(RsltR.$ship_schd_no, r.ship_schd_no());

		int size = l.size();
		
		if (size == 1) {
			l.get(0).fix_flg(l.get(0).org_fix_flg());
			setValueEx(columnRslt_fix_flg, l.get(0).getGUIIndex(), l.get(0).org_fix_flg());
		}
		else if (size > 1) {
			RsltR tgt = null;
			for (RsltR rr : l) {
				if (!rr.fix_flg()) {
					tgt = null;
					break;
				}
				if (rr.isStatusCreate()) {
					tgt = rr;
				}
			}
			if (!isNull(tgt)) {
				setValueEx(columnRslt_fix_flg, tgt.getGUIIndex(), tgt.org_fix_flg());
			}
		}
	}

	@Override
	public void doRslt_alloc_flg_NC(MCEventInfo info){
		super.doRslt_alloc_flg_NC(info);
		int index = info.getEventIndex();	
		RsltR r = getRsltL().get(index);
		if (!r.alloc_flg()) {
			setValueEx(columnRslt_lot_none_flg, index, false);
		}
		if (r.ship_loc_prio_flg() && MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(r.alloc_scope_typ())) {
			if (r.alloc_flg()) {
				setValueEx(columnRslt_loc_cd, index, r.def_loc_cd());
			}
			else {
				// 場所変更による doLCEvent で場所引当フラグが変更されることを防ぐため、イベント中は一時的にオンにしておく
				r.alloc_flg(true);
				setValueEx(columnRslt_loc_cd, index, null);
				r.alloc_flg(false);
			}
		}
	}

	@Override
	public void doRslt_lot_none_flg_NC(MCEventInfo info){
		super.doRslt_lot_none_flg_NC(info);
		int index = info.getEventIndex();	
		RsltR r = getRsltL().get(index);

		if(r.lot_none_flg()) {
			setValueEx(columnRslt_lot_no, index, null);
			setValueEx(columnRslt_sublot_no, index, null);
		}
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		BulkSet_ship_schd_dt.addLCListener(this);
		BulkSet_ship_schd_hm.addLCListener(this);
		BulkSet_dlv_schd_dt.addLCListener(this);
		BulkSet_dlv_schd_hm.addLCListener(this);

		columnRslt_ent_ship_schd_dt.addLCListener(this);
		columnRslt_ent_ship_schd_hm.addLCListener(this);
		columnRslt_alloc_base_unit_qty.addLCListener(this);

		columnRslt_loc_cd.addLCListener(this);
		columnRslt_str_ln_cd.addLCListener(this);
		columnRslt_lot_no.addLCListener(this);
		columnRslt_sublot_no.addLCListener(this);
		columnRslt_ver_no.addLCListener(this);
		columnRslt_alloc_sno1.addLCListener(this);
		columnRslt_alloc_sno2.addLCListener(this);
		columnRslt_alloc_sno3.addLCListener(this);
		columnRslt_alloc_sno4.addLCListener(this);
		
		columnRslt_alloc_sno1.addVCListener(this);
		columnRslt_alloc_sno2.addVCListener(this);
		columnRslt_alloc_sno3.addVCListener(this);
		columnRslt_alloc_sno4.addVCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (lc == BulkSet_ship_schd_dt) {
			bulkSet(BulkSet_ship_schd_dt);
		}
		else if (lc == BulkSet_ship_schd_hm) {
			bulkSet(BulkSet_ship_schd_hm);
		}
		else if (lc == BulkSet_dlv_schd_dt) {
			bulkSet(BulkSet_dlv_schd_dt);
		}
		else if (lc == BulkSet_dlv_schd_hm) {
			bulkSet(BulkSet_dlv_schd_hm);
		}
		else if (lc == BulkSet_ship_wk_cd) {
			bulkSet(BulkSet_ship_wk_cd);
		}
		else if (lc == columnRslt_ent_ship_schd_dt) {
			doRslt_ent_ship_schd_tm_LC(info);
		}
		else if (lc == columnRslt_ent_ship_schd_hm) {
			doRslt_ent_ship_schd_tm_LC(info);
		}
		else if (lc == columnRslt_alloc_base_unit_qty) {
			doRslt_alloc_base_unit_qty_LC(info);
		}

		if (lc == columnRslt_loc_cd
			|| lc == columnRslt_str_ln_cd
			|| lc == columnRslt_lot_no
			|| lc == columnRslt_sublot_no
			|| lc == columnRslt_ver_no
			|| lc == columnRslt_alloc_base_unit_qty
			|| lc == columnRslt_alloc_sno1
			|| lc == columnRslt_alloc_sno2
			|| lc == columnRslt_alloc_sno3
			|| lc == columnRslt_alloc_sno4) {

			if (Cnd_md_ALLOC.isSelected()) {
				RsltR r = getRsltL().get(info.getEventIndex());
				if (r.check() && !r.alloc_flg()) {
					if (isEditable(columnRslt_alloc_flg, r.getGUIIndex())) {
						setValueEx(columnRslt_alloc_flg, r.getGUIIndex(), true);
					}
				}
			}
		}
		setBtnMode();
	}

	@Override
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (vc == columnRslt_alloc_sno1) {
			return doRslt_alloc_sno1_VC(info);
		}
		if (vc == columnRslt_alloc_sno2) {
			return doRslt_alloc_sno2_VC(info);
		}
		if (vc == columnRslt_alloc_sno3) {
			return doRslt_alloc_sno3_VC(info);
		}
		if (vc == columnRslt_alloc_sno4) {
			return doRslt_alloc_sno4_VC(info);
		}
		return super.doVCEvent(vc, info);
	}
	
	protected boolean doRslt_alloc_sno1_VC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());

		if(!isSame(info.getNewValue(), r.sno1())
				&& !isNull(info.getNewValue())
				&& !isNull(r.sno1())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}

	protected boolean doRslt_alloc_sno2_VC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());

		if(!isSame(info.getNewValue(), r.sno2())
				&& !isNull(info.getNewValue())
				&& !isNull(r.sno2())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}
	
	protected boolean doRslt_alloc_sno3_VC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());

		if(!isSame(info.getNewValue(), r.sno3())
				&& !isNull(info.getNewValue())
				&& !isNull(r.sno3())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}
	
	protected boolean doRslt_alloc_sno4_VC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());

		if(!isSame(info.getNewValue(), r.sno4())
				&& !isNull(info.getNewValue())
				&& !isNull(r.sno4())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}

	public void doRslt_ent_ship_schd_tm_LC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());

		if (isNull(r.ent_ship_schd_dt())) {
			setValueEx(columnRslt_ship_schd_dt, r.getGUIIndex(), r.src_ship_schd_dt());
			setValueEx(columnRslt_ship_schd_hm, r.getGUIIndex(), r.src_ship_schd_hm());
		}
		else {
			setValueEx(columnRslt_ship_schd_dt, r.getGUIIndex(), r.ent_ship_schd_dt());
			setValueEx(columnRslt_ship_schd_hm, r.getGUIIndex(), r.ent_ship_schd_hm());
		}
		
		setShipSchdTimeChar(r);
	}

	protected void setShipSchdTimeChar(RsltR r) {
		if (!isNull(r.ship_schd_hm())) {
			r.ship_schd_time(lpad(r.ship_schd_hm().getHour(), 2, "0")
					+ lpad(r.ship_schd_hm().getMinute(), 2, "0"));
		}
		else {
			r.ship_schd_time("0000");
		}
	}

	protected String getShipSchdTimeChar(BulkSetR r) {
		if (!isNull(r.ship_schd_hm())) {
			return (lpad(r.ship_schd_hm().getHour(), 2, "0")
					+ lpad(r.ship_schd_hm().getMinute(), 2, "0"));
		}
		else {
			return "0000";
		}
	}
	
	// 選択チェックオン時の一括項目設定
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
		RsltR r = (RsltR)srcRow;

		if (isNull(r.ent_ship_schd_dt())) {
			bulkSet(BulkSet_ship_schd_dt, r);
		}
		if (isNull(r.ent_ship_schd_hm())) {
			bulkSet(BulkSet_ship_schd_hm, r);
		}
		if (isNull(r.ent_dlv_schd_dt())) {
			bulkSet(BulkSet_dlv_schd_dt, r);
		}
		if (isNull(r.ent_dlv_schd_hm())) {
			bulkSet(BulkSet_dlv_schd_hm, r);
		}
		if (isNull(r.ship_wk_cd())) {
			bulkSet(BulkSet_ship_wk_cd, r);
		}
		setBtnMode();
	}

	protected void bulkSet(MCBeans b) {
		for (RsltR r : RsltTable.getViewRows()) {
			if (r.check()) {
				bulkSet(b, r);
			}
		}
	}

	protected void bulkSet(MCBeans b, RsltR r) {
		if (b == BulkSet_ship_schd_dt && isEditable(columnRslt_ent_ship_schd_dt, r.getGUIIndex())) {
			setValueEx(columnRslt_ent_ship_schd_dt, r.getGUIIndex(), getBulkSetR().ship_schd_dt());
		}
		else if (b == BulkSet_ship_schd_hm && isEditable(columnRslt_ent_ship_schd_hm, r.getGUIIndex())) {
			setValueEx(columnRslt_ent_ship_schd_hm, r.getGUIIndex(), getBulkSetR().ship_schd_hm());
		}
		else if (b == BulkSet_dlv_schd_dt && isEditable(columnRslt_ent_dlv_schd_dt, r.getGUIIndex())) {
			setValueEx(columnRslt_ent_dlv_schd_dt, r.getGUIIndex(), getBulkSetR().dlv_schd_dt());
		}
		else if (b == BulkSet_dlv_schd_hm && isEditable(columnRslt_ent_dlv_schd_hm, r.getGUIIndex())) {
			setValueEx(columnRslt_ent_dlv_schd_hm, r.getGUIIndex(), getBulkSetR().dlv_schd_hm());
		}
		else if (b == BulkSet_ship_wk_cd
				&& !isNull(getBulkSetR().ship_wk_cd())
				&& isEditable(columnRslt_ship_wk_cd, r.getGUIIndex())) {
			if (_shipWkList != null) {
				if (hasShipWkCd(r, getBulkSetR().ship_wk_cd())) {
					r.ship_wk_cd(getBulkSetR().ship_wk_cd());
					r.ship_wk_nm(getBulkSetR().ship_wk_nm());
				}
			}
			else {
				if (columnRslt_ship_wk_cd.checkValue(getBulkSetR().ship_wk_cd(), r.getGUIIndex())) {
					r.ship_wk_cd(getBulkSetR().ship_wk_cd());
					r.ship_wk_nm(getBulkSetR().ship_wk_nm());
				}
			}
		}
	}

	@Override
	public void doRslt_ship_term_cd_LC(MCEventInfo info) {
		super.doRslt_ship_term_cd_LC(info);
		
		RsltR r = getRsltL().get(info.getEventIndex());
		if (isNull(r.ship_term_cd())) {
			setValueEx(columnRslt_ship_wk_cd, r.getGUIIndex(), null);
		}
		else {
			// addIgnoreListBeansを指定したので代わりにリストロジックを実行する。
			MCRow row = MCRow.create();
			row.addStringColumn("ship_wk_grp_cd", r.ship_wk_grp_cd());
			row.addDateColumn("dlv_rqst_tm", r.pd_inst_dlv_hm());
			row.addStringColumn("ship_schd_time", r.ship_schd_time());
			row.addStringColumn("ship_wk_cd", r.ship_wk_cd());
			MCList<MCRow> shipWkL = getShipWkCdList(row, info);
			
			// 値を設定できないときはクリアする
			if (shipWkL.isEmpty()) {
				setValueEx(columnRslt_ship_wk_cd, r.getGUIIndex(), null);
			}
			else {
				// 納品依頼時刻が指定されているときは出荷作業判定マスタを考慮する
				if (!isNull(r.pd_inst_dlv_hm()) && !isSame(r.pd_inst_dlv_hm().toString("HHmm"), "0000")) {
					shipWkL.sort(SortType.DESC, "chk_dlv_ded_time");
					MCRow wkR = shipWkL.get(0);
					
					// 納入締切時刻がNULLになるのは出荷作業判定マスタから取得できなかったとき
					if (isNull(wkR.getStringNE("chk_dlv_ded_time"))) {
						// 出荷グループマスタの出荷作業ＣＤを採用するが、出荷作業マスタに存在しなければ設定しない
						if (isNull(shipWkL.getFirst("ship_wk_cd", r.ship_wk_cd()))) {
							setValueEx(columnRslt_ship_wk_cd, r.getGUIIndex(), null);
						}
					}
					// 出荷作業判定マスタの値を設定する
					else {
						r.ship_wk_cd(wkR.getStringNE("ship_wk_cd"));
						r.ship_wk_nm(wkR.getStringNE("ship_wk_nm"));
					}
				}
			}
		}
	}

	public void doRslt_alloc_base_unit_qty_LC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (!isNull(r) && r.cont_fctr_flg()) {
			// 実際有効成分
			setValueEx(columnRslt_act_cont_qty, info.getEventIndex(),
				convToContFctrUnit(
					r.alloc_base_unit_qty(), r.act_cont_fctr(), r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));

			// 標準有効成分
			setValueEx(columnRslt_std_cont_qty, info.getEventIndex(),
				convToContFctrUnit(
					r.alloc_base_unit_qty(), r.std_cont_fctr(), r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
		}
	}
	
	@Override
	public void doRslt_no_calc_flg_NC(MCEventInfo info) {
		super.doRslt_no_calc_flg_NC(info);
		
		RsltR r = getRsltL().get(info.getEventIndex());
		if (r.no_calc_flg()) {
			// 自動計算しない場合はオフ
			setValueEx(columnRslt_cl_time_chk_flg, r.getGUIIndex(), false);
			setValueEx(columnRslt_ship_dt_chk_flg, r.getGUIIndex(), false);
		}
		else {
			// 自動計算する場合はクリア
			setValueEx(columnRslt_ship_wk_cd, r.getGUIIndex(), null);
			setValueEx(columnRslt_ent_ship_schd_dt, r.getGUIIndex(), null);
			setValueEx(columnRslt_ent_ship_schd_hm, r.getGUIIndex(), null);
			setValueEx(columnRslt_ent_dlv_schd_dt, r.getGUIIndex(), null);
			setValueEx(columnRslt_ent_dlv_schd_hm, r.getGUIIndex(), null);
			// 自動計算しない場合はオン
			setValueEx(columnRslt_cl_time_chk_flg, r.getGUIIndex(), true);
			setValueEx(columnRslt_ship_dt_chk_flg, r.getGUIIndex(), true);
		}
	}
	
	@Override
	public void doRslt_abort_flg_NC(MCEventInfo info) {
		super.doRslt_abort_flg_NC(info);

		setBtnMode();
	}

	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(crtRsltCellConfig());
	}

	protected RsltCellConfig crtRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			RsltR r = (RsltR) table.getBaseTable().getRow(index);

			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			else if (MSC_PR_STS_TYP.isPART_SHIP(r.pr_sts_typ())) {
				if (MAC_SHIP_INST_TYP.isPICK(r.ship_inst_typ())) {
					// 一部出荷（ピッキングあり）
					if (!(column == columnRslt_ship_to_show_dtl)) {
						return MCMode.READ_ONLY;
					}
				}
				else if (MAC_SHIP_INST_TYP.isNON(r.ship_inst_typ())) {
					// 一部出荷（指図対象外）
					if ( !(column == columnRslt_check
							|| column == columnRslt_abort_flg
							|| column == columnRslt_ship_to_show_dtl) ) {
						// 選択、打切以外入力不可
						return MCMode.READ_ONLY;
					}
				}
			}
			else if (r.abort_flg()) {
				if (Cnd_md_ALLOC.isSelected()) {
					if (!(column == columnRslt_ship_to_show_dtl)) {
						return MCMode.READ_ONLY;
					}
				}
				if ( !(column == columnRslt_check
						|| column == columnRslt_abort_flg
						|| column == columnRslt_ship_to_show_dtl) ) {
					// 選択、打切以外入力不可
					return MCMode.READ_ONLY;
				}
			}

			if (column == columnRslt_cl_time_chk_flg ||
					column == columnRslt_ship_dt_chk_flg) {
				// 自動計算しないなら入力不可
				if (r.no_calc_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnRslt_ent_ship_schd_dt ||
					column == columnRslt_ship_wk_cd ||
					column == columnRslt_ent_dlv_schd_dt) {
				// 自動計算するなら入力不可
				if (!r.no_calc_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnRslt_abort_flg) {
				// 分割していたら不可
				if (r.div_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnRslt_trd_unit_cd
				|| column == columnRslt_trd_unit_qty
				|| column == columnRslt_alloc_ent_unit_cd
				|| column == columnRslt_alloc_ent_unit_qty
				|| column == columnRslt_abort_flg) {
				// 値引品目は入力不可
				if (r.dscnt_itm_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			
			// 出荷予定モードでの制御
			if (Cnd_md_SHIP.isSelected()) {
				// インボイス行は更新しない
				if (!(column == columnRslt_check || column == columnRslt_ship_to_show_dtl)) {
					if (!isNull(r.iv_no())) {
						return MCMode.READ_ONLY;
					}
				}
				if (!(column == columnRslt_check || column == columnRslt_ship_block_flg || column == columnRslt_fix_flg || column == columnRslt_ship_to_show_dtl)) {
					if (r.org_fix_flg()) {
						if ( !(r.iv_reg_flg() && isSame(r.ship_act_qty(), r.iv_schd_qty())) ) {
							return MCMode.READ_ONLY;
						}
					}
				}
				if (column == columnRslt_fix_flg) {
					if (r.iv_reg_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (!MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					if (column == columnRslt_base_dlv_slip_no
							|| column == columnRslt_base_prov_act_no
							|| column == columnRslt_base_ac_dt) {
						return MCMode.READ_ONLY;
					}
				}
			}
			// 引当状況モードでの制御
			else if (Cnd_md_ALLOC.isSelected()) {
				if (column == columnRslt_alloc_sno1) {
					if (!r.sno1_null_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_alloc_sno2) {
					if (!r.sno2_null_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_alloc_sno3) {
					if (!r.sno3_null_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_alloc_sno4) {
					if (!r.sno4_null_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_alloc_flg
					|| column == columnRslt_lot_none_flg) {
					if (!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 場所引当をしない場合
				if(!r.alloc_flg()) {
					if(column == columnRslt_lot_none_flg) {
						return MCMode.READ_ONLY;
					}
				}
				// ロット指定無の場合
				if(r.lot_none_flg()) {
					if(column == columnRslt_lot_no
							|| column == columnRslt_sublot_no) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	// -----------------------------------------------
	// MSBEP0500
	@Override
	public MCTable<?> getStkTable(MCRootPanel panel) {
		return RsltTable;
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
				) {
				return false;
		}
		return true;
	}

	@Override
	public MCRow get_open_MSBEP0500_bind_Row(MCTable<?> table) {
		if (table == null) {
			return null;
		}

		MCRow bind = MCRow.create();
		RsltR dr  = RsltTable.getSelectedMCRow();

		if (dr != null) {
			bind.addStringColumn(IfStkInspBase.CND_LG_GRP_CD, dr.ship_fr_lg_grp_cd()); // 物流ＧＣＤ
			bind.addStringColumn(IfStkInspBase.CND_LG_GRP_NM, dr.ship_fr_lg_grp_nm()); // 物流Ｇ名
			bind.addStringColumn(IfStkInspBase.CND_LOC_CD, dr.loc_cd()); // 場所ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_LOC_NM, dr.loc_nm()); // 場所名
			bind.addStringColumn(IfStkInspBase.CND_STR_LN_CD, dr.str_ln_cd()); // 棚・ラインＣＤ
			bind.addStringColumn(IfStkInspBase.CND_STR_LN_NM, dr.str_ln_nm()); // 棚・ライン名
			bind.addStringColumn(IfStkInspBase.CND_ITM_CD, dr.itm_cd()); // 品目ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB1, dr.itm_sub1()); // 枝番１
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB2, dr.itm_sub2()); // 枝番２
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB3, dr.itm_sub3()); // 枝番３
			bind.addStringColumn(IfStkInspBase.CND_ITM_NM, dr.itm_nm()); // 品名
			bind.addStringColumn(IfStkInspBase.CND_VER_NO, dr.ver_no()); // 版ＮＯ
			bind.addStringColumn(IfStkInspBase.CND_SNO1, dr.sno1()); // 手配ＮＯ１
			bind.addBooleanColumn(IfStkInspBase.CND_SNO1_NULL_FLG, dr.sno1_null_flg()); // 手配ＮＯ１無し可
			bind.addStringColumn(IfStkInspBase.CND_SNO2, dr.sno2()); // 手配ＮＯ２
			bind.addBooleanColumn(IfStkInspBase.CND_SNO2_NULL_FLG, dr.sno2_null_flg()); // 手配ＮＯ１無し可
			bind.addStringColumn(IfStkInspBase.CND_SNO3, dr.sno3()); // 手配ＮＯ３
			bind.addBooleanColumn(IfStkInspBase.CND_SNO3_NULL_FLG, dr.sno3_null_flg()); // 手配ＮＯ１無し可
			bind.addStringColumn(IfStkInspBase.CND_SNO4, dr.sno4()); // 手配ＮＯ４
			bind.addBooleanColumn(IfStkInspBase.CND_SNO4_NULL_FLG, dr.sno4_null_flg()); // 手配ＮＯ１無し可
			bind.addStringColumn(IfStkInspBase.CND_GD_CD, dr.gd_cd()); // 格付ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_GD_NM, dr.gd_nm()); // 格付名

			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_COSTK_FLG, MSC_STK_ID_TYP.isCOSTK(dr.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_RTN_PRE_ACCPT_FLG, MSC_STK_ID_TYP.isRTN_PRE_ACCPT(dr.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_CSTSTK_FLG, MSC_STK_ID_TYP.isCSTSTK(dr.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_PURC_PRE_ACCPT_FLG, MSC_STK_ID_TYP.isPURC_PRE_ACCPT(dr.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_RNT_RCV_FLG, MSC_STK_ID_TYP.isRNT_RCV(dr.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ACCPT_DFCT_FLG, MSC_STK_ID_TYP.isACCPT_DFCT(dr.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_NCV_RCV_FLG, MSC_STK_ID_TYP.isNCV_RCV(dr.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ONR_PROV_FLG, MSC_STK_ID_TYP.isONR_PROV(dr.stk_id_typ()));

			bind.addStringColumn(IfStkInspBase.CND_STK_BP_CD, dr.stk_bp_cd()); // 在庫取引先ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_STK_BP_NM, dr.stk_bp_nm()); // 在庫取引先名

			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_GOOD_FLG, MAC_QUALITY_TYP.isGOOD(dr.quality_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_DFCT_OPER_FLG, MAC_QUALITY_TYP.isDFCT_OPER(dr.quality_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_DFCT_INSP_FLG, MAC_QUALITY_TYP.isDFCT_INSP(dr.quality_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_SSPND_FLG, MAC_QUALITY_TYP.isSSPND(dr.quality_typ()));

			bind.addBooleanColumn(IfStkInspBase.CND_STK_INSP_TYP_YET_FLG, MSC_STK_INSP_TYP.isYET(dr.stk_insp_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_INSP_TYP_ING_FLG, MSC_STK_INSP_TYP.isING(dr.stk_insp_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_INSP_TYP_WAIT_JUDG_FLG, MSC_STK_INSP_TYP.isWAIT_JUDG(dr.stk_insp_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_INSP_TYP_FIN_FLG, MSC_STK_INSP_TYP.isFIN(dr.stk_insp_typ()));

			bind.addStringColumn(IfStkInspBase.CND_ALLOC_GRP_CD, dr.alloc_grp_cd()); // 総量引当場所グループＣＤ
			bind.addStringColumn(IfStkInspBase.CND_ALLOC_GRP_NM, dr.alloc_grp_nm()); // 総量引当場所グループ名
			
			if (MAC_TRD_PTN_TYP.isPROV(dr.trd_ptn_typ()) && isNull(dr.loc_cd())) {
				bind.addStringColumn(IfStkInspBase.CND_STK_INFO_LOC_TYP, MSC_STK_INFO_LOC_TYP.HOUSE.value());
			}
			else if (MAC_TRD_PTN_TYP.isPROV_RTN(dr.trd_ptn_typ())) {
				bind.addStringColumn(IfStkInspBase.CND_STK_INFO_LOC_TYP, MSC_STK_INFO_LOC_TYP.OUTSIDE.value());
			}
		}
		return bind;
	}

	@Override
	public String getStkInspOpeType(MCTable<?> table, int index) {
		//在庫情報選択ではフォーカス行のみを更新する
		return IfStkInspBase.OPE_UPD;
	}
	@Override
	 public boolean isValueLink(MCRootPanel panel, int index, String ope, String name) {
		//
		if (IfStkInspBase.INPT_VER_NO.equals(name) ||
				IfStkInspBase.INPT_LOT_NO.equals(name) ||
				IfStkInspBase.INPT_SUBLOT_NO.equals(name) ||
				IfStkInspBase.INPT_LOC_CD.equals(name) ||
				IfStkInspBase.INPT_STR_LN_CD.equals(name) ||
				IfStkInspBase.INPT_STR_LN_CD_NONE_FLG.equals(name) ||
				IfStkInspBase.INPT_PACK_UNIT_CD.equals(name) ||
				IfStkInspBase.INPT_PACK_STK_QTY.equals(name) ||
				IfStkInspBase.INPT_SNO1.equals(name) ||
				IfStkInspBase.INPT_SNO2.equals(name) ||
				IfStkInspBase.INPT_SNO3.equals(name) ||
				IfStkInspBase.INPT_SNO4.equals(name)) {
			return true;
		}
		return false;
	}
	@Override
	public String getInptPackUnitCdCol() {
		return RsltR.$alloc_ent_unit_cd;
	}
	@Override
	public String getInptPackStkQtyCol() {
		return RsltR.$alloc_ent_unit_qty;
	}
	@Override
	public String getInptSno1Col() {
		return RsltR.$alloc_sno1;
	}
	@Override
	public String getInptSno2Col() {
		return RsltR.$alloc_sno2;
	}
	@Override
	public String getInptSno3Col() {
		return RsltR.$alloc_sno3;
	}
	@Override
	public String getInptSno4Col() {
		return RsltR.$alloc_sno4;
	}

}