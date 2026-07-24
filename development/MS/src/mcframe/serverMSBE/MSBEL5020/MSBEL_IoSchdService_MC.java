package mcframe.serverMSBE.MSBEL5020;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBF.MSBFL5200.*;
import mcframe.serverMSUC.MSUCL0010.*;
import static mcframe.serverMSBE.MSBEL5020.Query.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.serverMS.dbc.MSFunction.*;
import java.util.ArrayList;
import java.util.List;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_IoSchdService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_IoSchdService_MC extends MSBEL_IoSchdService_MC_A{
	//FMCB CUSTOM START

	/**
	 * IoSchd_Ins01オペレーション.<p>
	 *
	 * 受払予定にデータを追加する<br>
	 */
	public class IoSchd_Ins01 extends MSBEL_IoSchdService_MC_A.IoSchd_Ins01 {

		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
		protected FXUCL_MCDbcCache<MAM_BIZ_RSN_R> _bizRsnCache = null;
		protected MCList<MAM_LOC_R> _locCache = MCList.create(MAM_LOC_R.class);
		protected MCIndexKey _idxCache;
		protected FXUCL_Cache<MAM_BP_R> _grSpplCache = null;
		protected FXUCL_Cache<MAM_BP_R> _giSpplCache = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// マスタと入庫側の情報を取得する
			MCList<GiGr_LocR> giGrL = MCList.create(GiGr_LocR.class);
			getInfo(up0(), giGrL);
			MCIndexKey idx = giGrL.createIndex(GiGr_LocR.$peg_no);

			MCList<MST_IO_SCHD_R> dbc = MCList.create(MST_IO_SCHD_R.class);

			crtDbc(dbc, giGrL, idx);
			editDbc(dbc);

			MSBFL_LotTraceService.LotTrace_Upd01 o = MSBFL_LotTraceService.crtLotTrace_Upd01();

			setNoAndLotSv(o, dbc);

			insAndExec(o, dbc);
		}

		protected void getInfo(MCList<IoSchd_Ins01_DtlR> up, MCList<GiGr_LocR> giGrL) {

			setPegNo(GiGr_LocR.$peg_no, up);
			setAll(giGrL, up, createMap_GiGr_LocR_IoSchd_Ins01_DtlR());
			MSUCL_GiGrLocUtil.setLocInfo(giGrL);

			selectItmL(up);
			selectItmUnitL(up);
			selectBizRsnL(up);
			selectLocL(giGrL);
			selectSpplL(giGrL);
		}

		protected void crtDbc(MCList<MST_IO_SCHD_R> dbc, MCList<GiGr_LocR> giGrL, MCIndexKey idx) {
			for (IoSchd_Ins01_DtlR r: up0()) {
				crtDbcMain(dbc, r, giGrL, idx);
			}
		}

		protected void crtDbcMain(MCList<MST_IO_SCHD_R> dbc, IoSchd_Ins01_DtlR r, MCList<GiGr_LocR> giGrL, MCIndexKey idx) {

			MAM_ITM_R itm = _itmCache.getEx(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			// 在庫管理する品目以外は受払予定は作らない
			if (!MAC_STK_MNG_TYP.isMNG(itm.stk_mng_typ())) {
				return;
			}
			// 在庫を動かさない取引では受払予定は作らない
			MAM_BIZ_RSN_R bizRsn = _bizRsnCache.get(r.rsn_cd());
			if (MAC_ASSET_MNG_TYP.isMNG(itm.asset_mng_typ()) && (bizRsn.xpns_purc_flg() || bizRsn.slo_xpns_purc_flg())) {
				return;
			}
			MAVM_ITM_UNIT_R itmUnit = _itmUnitCache.getEx(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd());
			GiGr_LocR giGrR = giGrL.getFirst(idx, r.peg_no());
			boolean repurcObliFlg = false;
			MAM_BP_R sppl = null;
			
			if (MSC_IO_TYP.isGI(MSC_IO_SCHD_TYP.io_typ(r.io_schd_typ()))) {
				if (!isNull(giGrR.gi_sppl_cd())) {
					sppl = _giSpplCache.getCache(giGrR.gi_sppl_cd());
				}
			}
			else if (MSC_IO_TYP.isGR(MSC_IO_SCHD_TYP.io_typ(r.io_schd_typ()))) {
				if (!isNull(giGrR.gr_sppl_cd())) {
					sppl = _grSpplCache.getCache(giGrR.gr_sppl_cd());
				}
			}
			if (!isNull(sppl)) {
				repurcObliFlg = sppl.repurc_obli_flg();
			}

			truncDate(r);

			MST_IO_SCHD_R ioSchdR = MST_IO_SCHD_R.create();

//			ioSchdR.slip_schd_no();	⇒　件数が分からないので後で設定する
			ioSchdR.io_schd_typ(getIoSchdTyp(r.io_schd_typ(), bizRsn));
			ioSchdR.io_typ(MSC_IO_SCHD_TYP.io_typ(r.io_schd_typ()));
			ioSchdR.io_schd_sts_typ(r.io_schd_sts_typ());
			ioSchdR.io_schd_no(r.io_schd_no());
			ioSchdR.io_schd_seq(r.io_schd_seq());
			ioSchdR.io_schd_sub_typ1(r.io_schd_sub_typ1());
			ioSchdR.io_schd_sub_no1(r.io_schd_sub_no1());
			ioSchdR.io_schd_sub_seq1(r.io_schd_sub_seq1());
			ioSchdR.io_schd_sub_typ2(r.io_schd_sub_typ2());
			ioSchdR.io_schd_sub_no2(r.io_schd_sub_no2());
			ioSchdR.io_schd_sub_seq2(r.io_schd_sub_seq2());
			ioSchdR.io_schd_sub_typ3(r.io_schd_sub_typ3());
			ioSchdR.io_schd_sub_no3(r.io_schd_sub_no3());
			ioSchdR.io_schd_sub_seq3(r.io_schd_sub_seq3());
			ioSchdR.io_schd_sub_typ4(r.io_schd_sub_typ4());
			ioSchdR.io_schd_sub_no4(r.io_schd_sub_no4());
			ioSchdR.io_schd_sub_seq4(r.io_schd_sub_seq4());
			ioSchdR.io_schd_pr_no(r.io_schd_pr_no());
			ioSchdR.schd_dt(r.schd_dt());
			ioSchdR.accpt_schd_dt(r.accpt_schd_dt());
			if (MSC_IO_TYP.isGR(ioSchdR.io_typ())) {
				ioSchdR.avl_schd_dt(getMaxDt(r.schd_dt(), r.accpt_schd_dt(), r.insp_cmpl_schd_dt()));
			}
			ioSchdR.itm_cd(r.itm_cd());
			ioSchdR.itm_sub1(r.itm_sub1());
			ioSchdR.itm_sub2(r.itm_sub2());
			ioSchdR.itm_sub3(r.itm_sub3());
			ioSchdR.ver_no(r.ver_no());
			ioSchdR.alt_grp_cd(r.alt_grp_cd());
			ioSchdR.alt_grp_seq(r.alt_grp_seq());
			ioSchdR.oper_inst_no(r.oper_inst_no());
			ioSchdR.oper_ord_no(r.oper_ord_no());
			ioSchdR.alt_qty(r.alt_qty());
			ioSchdR.alt_itm_typ(r.alt_itm_typ());
			ioSchdR.alt_itm_ratio(r.alt_itm_ratio());
			ioSchdR.alt_alloc_prio(r.alt_alloc_prio());
			ioSchdR.loc_cd(r.loc_cd());
			ioSchdR.str_ln_cd(nvl(r.str_ln_cd(), MAC_STR.NULL_VAL.value()));
			ioSchdR.stk_arrv_bp_cd(nvl(r.stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
			ioSchdR.lot_no(r.lot_no());
			ioSchdR.sublot_no(r.sublot_no());
			ioSchdR.sno1(nvl(r.sno1(), MAC_STR.NULL_VAL.value()));
			ioSchdR.sno1_null_flg(r.sno1_null_flg());
			ioSchdR.sno2(nvl(r.sno2(), MAC_STR.NULL_VAL.value()));
			ioSchdR.sno2_null_flg(r.sno2_null_flg());
			ioSchdR.sno3(nvl(r.sno3(), MAC_STR.NULL_VAL.value()));
			ioSchdR.sno3_null_flg(r.sno3_null_flg());
			ioSchdR.sno4(nvl(r.sno4(), MAC_STR.NULL_VAL.value()));
			ioSchdR.sno4_null_flg(r.sno4_null_flg());
			ioSchdR.pack_unit_cd(getPackUnitCd(r, itmUnit));
			ioSchdR.pack_unit_qty(getPackUnitQty(r, itmUnit));
			ioSchdR.base_unit_cd(r.base_unit_cd());
			ioSchdR.base_unit_qty(r.base_unit_qty());
			ioSchdR.gd_cd(r.gd_cd());
			ioSchdR.in_xfr_typ(getXfrTyp(r));
			ioSchdR.quality_typ(r.quality_typ());
			ioSchdR.asst_typ(getAsstTyp(r.stk_id_typ(), r.dlv_cd(), r.stk_arrv_bp_cd(), giGrR.gi_loc_mng_typ(), repurcObliFlg));
			ioSchdR.stk_insp_typ(r.stk_insp_typ());
			ioSchdR.stk_id_typ(r.stk_id_typ());
			ioSchdR.stk_bp_cd(nvl(r.stk_bp_cd(), MAC_STR.NULL_VAL.value()));
			ioSchdR.alloc_tgt_flg(MSC_IO_SCHD_TYP.is_alloc_tgt(r.io_schd_typ())
					&& MSC_IO_SCHD_STS_TYP.is_alloc_tgt(r.io_schd_sts_typ()));
			if (r.alloc_flg() || r.alloc_wait_flg()) {
				ioSchdR.alloc_scope_typ(nvl(r.alloc_scope_typ(), MAC_ALLOC_SCOPE_TYP.LOC.value()));
			}
			ioSchdR.alloc_flg(r.alloc_flg());
			ioSchdR.alloc_wait_flg(r.alloc_wait_flg());
			ioSchdR.wg_cd(giGrR.gi_wg_cd());
			ioSchdR.sppl_cd(r.sppl_cd());
			ioSchdR.vld_dt_fr(r.vld_dt_fr());
			ioSchdR.vld_dt_to(r.vld_dt_to());
			ioSchdR.inpt_ctl_typ(r.inpt_ctl_typ());
			if (!isNullOr(r.loc_cd(), r.gr_loc_cd())) {
				ioSchdR.gi_loc_cd(r.loc_cd());
				ioSchdR.gr_loc_cd(r.gr_loc_cd());
			}
			ioSchdR.sub_char1(r.sub_char1());
			ioSchdR.sub_char2(r.sub_char2());
			ioSchdR.sub_char3(r.sub_char3());
			ioSchdR.sub_char4(r.sub_char4());
			ioSchdR.sub_char5(r.sub_char5());
			ioSchdR.sub_num1(r.sub_num1());
			ioSchdR.sub_num2(r.sub_num2());
			ioSchdR.sub_num3(r.sub_num3());
			ioSchdR.sub_dt1(r.sub_dt1());
			ioSchdR.sub_dt2(r.sub_dt2());
			ioSchdR.sub_dt3(r.sub_dt3());

			setEx(ioSchdR, r);
			setDdlvProv(ioSchdR, r, giGrR);
			setLot(ioSchdR, r, itm);
			setSno(ioSchdR, r, itm);

			// ロットトレース情報サービスに必要な情報を設定しておく
			if (MSC_IO_SCHD_TYP.is_upd_lot_trace(r.io_schd_typ())) {
				ioSchdR.setStringNE(IoSchd_Ins01_DtlR.$mfg_inst_unit_typ, r.mfg_inst_unit_typ());
				ioSchdR.setStringNE(IoSchd_Ins01_DtlR.$itm_mfg_inst_no, r.itm_mfg_inst_no());
				ioSchdR.setStringNE(IoSchd_Ins01_DtlR.$mfg_loc_cd, r.mfg_loc_cd());
			}

			addDbc(dbc, ioSchdR, r, giGrR, itm, itmUnit, bizRsn);
		}

		protected void truncDate(IoSchd_Ins01_DtlR r) {

			if (!isNull(r.schd_dt())) r.schd_dt(r.schd_dt().trunc(MCDateFieldType.DAY));
			if (!isNull(r.accpt_schd_dt())) r.accpt_schd_dt(r.accpt_schd_dt().trunc(MCDateFieldType.DAY));
			if (!isNull(r.insp_cmpl_schd_dt())) r.insp_cmpl_schd_dt(r.insp_cmpl_schd_dt().trunc(MCDateFieldType.DAY));
			if (!isNull(r.vld_dt_fr())) r.vld_dt_fr(r.vld_dt_fr().trunc(MCDateFieldType.DAY));
			if (!isNull(r.vld_dt_to())) r.vld_dt_to(r.vld_dt_to().trunc(MCDateFieldType.DAY));
			if (!isNull(r.gr_schd_dt())) r.gr_schd_dt(r.gr_schd_dt().trunc(MCDateFieldType.DAY));
			if (!isNull(r.ex_cmpl_schd_dt())) r.ex_cmpl_schd_dt(r.ex_cmpl_schd_dt().trunc(MCDateFieldType.DAY));
		}

		protected String getIoSchdTyp(String ioSchdTyp, MAM_BIZ_RSN_R bizRsn) {

			if (MSC_IO_SCHD_TYP.isSLS(ioSchdTyp) || MSC_IO_SCHD_TYP.isSLS_RTN_GI(ioSchdTyp) || MSC_IO_SCHD_TYP.isSLS_RTN_GR(ioSchdTyp)) {
				if (bizRsn.sls_acxfr_flg()) {
					if (MSC_IO_SCHD_TYP.isSLS(ioSchdTyp)) {
						return MSC_IO_SCHD_TYP.SLS_ACXFR.value();
					}
					else if (MSC_IO_SCHD_TYP.isSLS_RTN_GI(ioSchdTyp)) {
						return MSC_IO_SCHD_TYP.SLS_RTN_GI_ACXFR.value();
					}
					else {
						return MSC_IO_SCHD_TYP.SLS_RTN_GR_ACXFR.value();
					}
				}
			}
			return ioSchdTyp;
		}

		protected String getPackUnitCd(IoSchd_Ins01_DtlR r, MAVM_ITM_UNIT_R itmUnit) {

			if (itmUnit.pack_flg() && !itmUnit.base_unit_flg()) {
				return r.trd_unit_cd();
			}
			else {
				return r.base_unit_cd();
			}
		}

		protected MCNumber getPackUnitQty(IoSchd_Ins01_DtlR r, MAVM_ITM_UNIT_R itmUnit) {

			if (itmUnit.pack_flg() && !itmUnit.base_unit_flg()) {
				return r.trd_unit_qty();
			}
			else {
				return r.base_unit_qty();
			}
		}

		protected String getXfrTyp(IoSchd_Ins01_DtlR r) {

			if (MSC_IO_SCHD_TYP.isPURC_XFR_OUT(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isPURC_XFR_OUT_PROV(r.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isXFR_IN(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isXFR_OUT(r.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isXFR_IN_PROV(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isXFR_OUT_PROV(r.io_schd_typ())) {
				return MSC_IN_XFR_TYP.IN_XFR.value();
			}
			else {
				return MSC_IN_XFR_TYP.IN_LOC.value();
			}
		}

		protected String getAsstTyp(String stkIdTyp, String dlvCd, String stkArrvBpCd, String locMngTyp, Boolean repurcObliFlg) {

			if (MSC_STK_ID_TYP.isCOSTK(stkIdTyp)) {
				if (!isNull(dlvCd) && !MAC_STR.isNULL_VAL(nvl(stkArrvBpCd, MAC_STR.NULL_VAL.value()))) {
					return MAC_ASST_TYP.CO_SLS.value();
				}
				else {
					return MAC_LOC_MNG_TYP.asst_typ(locMngTyp);
				}
			}
			else {
				// 有償支給かつ買戻義務FLGがオンの場合
				if (MSC_STK_ID_TYP.isONR_PROV(stkIdTyp) && repurcObliFlg) {
					return MAC_ASST_TYP.CO_PROD.value();
				}
				else {
					return MAC_ASST_TYP.OTH.value();
				}
			}
		}

		protected void setEx(MST_IO_SCHD_R ioSchdR, IoSchd_Ins01_DtlR r) {

			if (MSC_IO_SCHD_TYP.isXFR_GI(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isXFR_GI_PROV(r.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isXFR_RTN_GI(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isXFR_RTN_GI_PROV(r.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isXFR_OUT(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isXFR_OUT_PROV(r.io_schd_typ())) {

				// 輸出の場合は輸出完了予定日と配送先が指定される
				ioSchdR.schd_dt(nvl(r.ex_cmpl_schd_dt(), r.schd_dt()));
				ioSchdR.stk_arrv_bp_cd(nvl(r.tdlv_cd(), nvl(r.stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value())));
			}
		}

		protected void setDdlvProv(MST_IO_SCHD_R ioSchdR, IoSchd_Ins01_DtlR r, GiGr_LocR giGrR) {
			// setLocInfo を gi_loc_cd = null としてよんでいるので、gr_loc_cd の値を設定する
			if (isDdlvProvGi(r)) {
				setDdlvProvSub(ioSchdR, giGrR);
			}
			else if (isDdlvProvGr(r)) {
				setStkIdTyp(ioSchdR, giGrR);
				setDdlvProvSub(ioSchdR, giGrR);
			}
		}

		protected void setDdlvProvSub(MST_IO_SCHD_R ioSchdR, GiGr_LocR giGrR) {
			boolean repurcObliFlg = false;
			MAM_BP_R sppl = null;
			
			if (MSC_IO_TYP.isGI(MSC_IO_SCHD_TYP.io_typ(ioSchdR.io_schd_typ()))) {
				if (!isNull(giGrR.gi_sppl_cd())) {
					sppl = _giSpplCache.getCache(giGrR.gi_sppl_cd());
				}
			}
			else if (MSC_IO_TYP.isGR(MSC_IO_SCHD_TYP.io_typ(ioSchdR.io_schd_typ()))) {
				if (!isNull(giGrR.gr_sppl_cd())) {
					sppl = _grSpplCache.getCache(giGrR.gr_sppl_cd());
				}
			}
			if (!isNull(sppl)) {
				repurcObliFlg = sppl.repurc_obli_flg();
			}
			
			ioSchdR.asst_typ(getAsstTyp(ioSchdR.stk_id_typ(), null, ioSchdR.stk_arrv_bp_cd(), giGrR.gr_loc_mng_typ(), repurcObliFlg));
			ioSchdR.wg_cd(giGrR.gr_wg_cd());
		}

		protected void setLot(MST_IO_SCHD_R ioSchdR, IoSchd_Ins01_DtlR r, MAM_ITM_R itm) {

			if (MAC_LOT_MNG_TYP.isNOT_MNG(itm.lot_mng_typ())) {
				ioSchdR.lot_no(MAC_STR.NULL_VAL.value());
			}
			else if (MAC_STR.isNULL_VAL(r.lot_no())) {
				ioSchdR.lot_no(null);
			}
			if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(itm.sublot_mng_typ())) {
				ioSchdR.sublot_no(MAC_STR.NULL_VAL.value());
			}
			else if (MAC_STR.isNULL_VAL(r.sublot_no())) {
				ioSchdR.sublot_no(null);
			}
		}
		
		protected void setLotForNotMng(MST_IO_SCHD_R ioSchdR, MAM_ITM_R itm) {

			if (MAC_LOT_MNG_TYP.isNOT_MNG(itm.lot_mng_typ())) {
				ioSchdR.lot_no(MAC_STR.NULL_VAL.value());
			}
			if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(itm.sublot_mng_typ())) {
				ioSchdR.sublot_no(MAC_STR.NULL_VAL.value());
			}
		}

		protected void setSno(MST_IO_SCHD_R ioSchdR, IoSchd_Ins01_DtlR r, MAM_ITM_R itm) {

			if(MSC_IO_TYP.isGI(ioSchdR.io_typ())) {
				//ＭＲＰ用項目
				ioSchdR.ex_sno1(ioSchdR.sno1());
				ioSchdR.ex_sno2(ioSchdR.sno2());
				ioSchdR.ex_sno3(ioSchdR.sno3());
				ioSchdR.ex_sno4(ioSchdR.sno4());
			}

			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno1_mng_typ())) {
				ioSchdR.sno1(MAC_STR.NULL_VAL.value());
			}
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno2_mng_typ())) {
				ioSchdR.sno2(MAC_STR.NULL_VAL.value());
			}
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno3_mng_typ())) {
				ioSchdR.sno3(MAC_STR.NULL_VAL.value());
			}
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno4_mng_typ())) {
				ioSchdR.sno4(MAC_STR.NULL_VAL.value());
			}
		}

		protected void addDbc(MCList<MST_IO_SCHD_R> dbc, MST_IO_SCHD_R ioSchdR, IoSchd_Ins01_DtlR r,
				GiGr_LocR giGrR, MAM_ITM_R itm, MAVM_ITM_UNIT_R itmUnit, MAM_BIZ_RSN_R bizRsn) {

			if (itmUnit.pack_flg() && !itmUnit.base_unit_flg()) {
				MCNumber packUnitQty = r.base_unit_qty().multiply(itmUnit.conv_base_qty())
						.divide(itmUnit.conv_qty(), itmUnit.dec_place().intValue(), MAC_RND_TYP.toMC(MAC_RND_TYP.CUTOFF.value()));
				MCNumber baseUnitQty = packUnitQty.multiply(itmUnit.conv_qty())
						.divide(itmUnit.conv_base_qty(), itm.dec_place().intValue(), MAC_RND_TYP.toMC(itm.rnd_typ()));

				// 荷姿に換算できた数量
				ioSchdR.pack_unit_cd(r.trd_unit_cd());
				ioSchdR.pack_unit_qty(packUnitQty);
				ioSchdR.base_unit_qty(baseUnitQty);
				addDbcSub(dbc, ioSchdR, r, giGrR, itm, bizRsn);

				if (!isSame(r.base_unit_qty(), baseUnitQty)) {
					MST_IO_SCHD_R ioSchdCloneR = ioSchdR.clone();
					// 荷姿に換算できなかった端数
					ioSchdCloneR.pack_unit_cd(ioSchdCloneR .base_unit_cd());
					ioSchdCloneR.pack_unit_qty(r.base_unit_qty().subtract(baseUnitQty));
					ioSchdCloneR.base_unit_qty(ioSchdCloneR.pack_unit_qty());
					addDbcSub(dbc, ioSchdCloneR, r, giGrR, itm, bizRsn);
				}
			}
			else {
				addDbcSub(dbc, ioSchdR, r, giGrR, itm, bizRsn);
			}
		}

		protected void addDbcSub(MCList<MST_IO_SCHD_R> dbc, MST_IO_SCHD_R ioSchdR, IoSchd_Ins01_DtlR r, GiGr_LocR giGrR, MAM_ITM_R itm, MAM_BIZ_RSN_R bizRsn) {
			dbc.add(ioSchdR);

			// 子伝を追加
			addChd(dbc, ioSchdR, r, giGrR, itm, bizRsn);
		}

		protected void addChd(MCList<MST_IO_SCHD_R> dbc, MST_IO_SCHD_R ioSchdR, IoSchd_Ins01_DtlR r, GiGr_LocR giGrR, MAM_ITM_R itm, MAM_BIZ_RSN_R bizRsn) {

			if (!isAddChdTgt(r)) return;

			// 入庫場所が外注場所の場合は発注先ＣＤを設定する
			if (!isNull(giGrR.gr_sppl_cd()) && isNull(ioSchdR.sppl_cd())) {
				ioSchdR.sppl_cd(giGrR.gr_sppl_cd());
			}

			MST_IO_SCHD_R chdIoSchdR = ioSchdR.clone();
			clearGrInfo(chdIoSchdR);

			// 売上返品出庫
			if (MSC_IO_SCHD_TYP.isSLS_RTN_GI(r.io_schd_typ())) {
				chdIoSchdR.io_schd_typ(getIoSchdTyp(MSC_IO_SCHD_TYP.SLS_RTN_GR.value(), bizRsn));
				chdIoSchdR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				chdIoSchdR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				chdIoSchdR.stk_bp_cd(MAC_STR.NULL_VAL.value());
				chdIoSchdR.asst_typ(MAC_LOC_MNG_TYP.asst_typ(giGrR.gi_loc_mng_typ()));
				ioSchdR.accpt_schd_dt(null);
			}
			// 仕入出庫・仕入出庫（支給）
			else if (MSC_IO_SCHD_TYP.isPURC_GI(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isPURC_GI_PROV(r.io_schd_typ())) {
				if (MSC_IO_SCHD_TYP.isPURC_GI(r.io_schd_typ())) {
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR.value());
					chdIoSchdR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					chdIoSchdR.stk_bp_cd(MAC_STR.NULL_VAL.value());
					chdIoSchdR.asst_typ(MAC_LOC_MNG_TYP.asst_typ(giGrR.gi_loc_mng_typ()));
				}
				else {
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_PROV.value());
					setStkIdTyp(chdIoSchdR, giGrR);
					setDdlvProvSub(chdIoSchdR, giGrR);
				}
				chdIoSchdR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				ioSchdR.accpt_schd_dt(null);
			}
			// 仕入転出・仕入転出（支給）
			else if (MSC_IO_SCHD_TYP.isPURC_XFR_OUT(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isPURC_XFR_OUT_PROV(r.io_schd_typ())) {
				if (MSC_IO_SCHD_TYP.isPURC_XFR_OUT(r.io_schd_typ())) {
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.ARR.value());
				}
				else {
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.ARR_PROV.value());
					setStkIdTyp(chdIoSchdR, giGrR);
					setDdlvProvSub(chdIoSchdR, giGrR);
				}
				ioSchdR.lot_no(MSC_PURC_UNFIX_STR.UNFIXED.value());
				ioSchdR.sublot_no(MSC_PURC_UNFIX_STR.UNFIXED.value());
				setLotForNotMng(ioSchdR, itm);
				
				chdIoSchdR.gd_cd(r.gr_gd_cd());
				chdIoSchdR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			}
			// 出荷：在庫識別区分が預りの出荷も発生するが子伝は必要ない
			else if (MSC_IO_SCHD_TYP.isSHIP_OUT(r.io_schd_typ()) && MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
				chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.SHIP_IN.value());
				chdIoSchdR.stk_arrv_bp_cd(r.dlv_cd());
				chdIoSchdR.asst_typ(MAC_ASST_TYP.CO_SLS.value());
			}
			// 出荷返品出庫
			else if (MSC_IO_SCHD_TYP.isSHIP_RTN_GI(r.io_schd_typ())) {
				chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.SHIP_RTN_GR.value());
				chdIoSchdR.loc_cd(r.gr_loc_cd());
				chdIoSchdR.str_ln_cd(r.gr_str_ln_cd());
				chdIoSchdR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				chdIoSchdR.asst_typ(MAC_LOC_MNG_TYP.asst_typ(giGrR.gi_loc_mng_typ()));
				chdIoSchdR.gd_cd(r.gr_gd_cd());

				ioSchdR.gi_loc_cd(null);
				ioSchdR.gr_loc_cd(null);
				chdIoSchdR.gi_loc_cd(null);
				chdIoSchdR.gr_loc_cd(null);
			}
			// 移動出庫・移動出庫（支給）・移動返品出庫・移動返品出庫（支給）
			else if (MSC_IO_SCHD_TYP.isMOVE_GI(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isMOVE_GI_PROV(r.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isMOVE_RTN_GI(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isMOVE_RTN_GI_PROV(r.io_schd_typ())) {
				if (MSC_IO_SCHD_TYP.isMOVE_GI(r.io_schd_typ())) {
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.MOVE_GR.value());
				}
				else if (MSC_IO_SCHD_TYP.isMOVE_GI_PROV(r.io_schd_typ())) {
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.MOVE_GR_PROV.value());
				}
				else if (MSC_IO_SCHD_TYP.isMOVE_RTN_GI(r.io_schd_typ())) {
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.MOVE_RTN_GR.value());
				}
				else if (MSC_IO_SCHD_TYP.isMOVE_RTN_GI_PROV(r.io_schd_typ())) {
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.MOVE_RTN_GR_PROV.value());
				}
				setGr(chdIoSchdR, r, giGrR);
			}
			// 移送出庫・移送出庫（支給）・移送返品出庫・移送返品出庫（支給）
			else if (MSC_IO_SCHD_TYP.isXFR_GI(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isXFR_GI_PROV(r.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isXFR_RTN_GI(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isXFR_RTN_GI_PROV(r.io_schd_typ())) {
				if (MSC_IO_SCHD_TYP.isXFR_GI(r.io_schd_typ())) {
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GR.value());
				}
				else if (MSC_IO_SCHD_TYP.isXFR_GI_PROV(r.io_schd_typ())) {
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GR_PROV.value());
				}
				else if (MSC_IO_SCHD_TYP.isXFR_RTN_GI(r.io_schd_typ())) {
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_RTN_GR.value());
				}
				else if (MSC_IO_SCHD_TYP.isXFR_RTN_GI_PROV(r.io_schd_typ())) {
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_RTN_GR_PROV.value());
				}
				setGr(chdIoSchdR, r, giGrR);
				dbc.add(getXfrIn(ioSchdR, chdIoSchdR, giGrR));
				dbc.add(getXfrOut(ioSchdR, chdIoSchdR, giGrR));
			}
			// 出荷（輸出）
			else if (MSC_IO_SCHD_TYP.isSHIP_OUT_EX(r.io_schd_typ())) {
				// 着荷（輸出）を作成
				MST_IO_SCHD_R shipInExR = chdIoSchdR.clone();
				shipInExR.io_schd_typ(MSC_IO_SCHD_TYP.SHIP_IN_EX.value());
				shipInExR.io_typ(MSC_IO_SCHD_TYP.io_typ(shipInExR.io_schd_typ()));
				shipInExR.schd_dt(nvl(r.ex_cmpl_schd_dt(), r.schd_dt()));
				shipInExR.stk_arrv_bp_cd(r.tdlv_cd());
				dbc.add(shipInExR);

				// 移送出庫を作成
				MST_IO_SCHD_R xfrGiR = shipInExR.clone();
				if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())) {
					xfrGiR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI.value());
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GR.value());
				}
				else if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
					xfrGiR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI_PROV.value());
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GR_PROV.value());
				}
				else if (MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())) {
					xfrGiR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_RTN_GI.value());
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_RTN_GR.value());
				}
				else if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					xfrGiR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_RTN_GI_PROV.value());
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_RTN_GR_PROV.value());
				}
				xfrGiR.io_typ(MSC_IO_SCHD_TYP.io_typ(xfrGiR.io_schd_typ()));
				dbc.add(xfrGiR);

				setGr(chdIoSchdR, r, giGrR);
				dbc.add(getXfrIn(xfrGiR, chdIoSchdR, giGrR));
				dbc.add(getXfrOut(xfrGiR, chdIoSchdR, giGrR));
			}
			// 転出・転出（支給）
			else if (MSC_IO_SCHD_TYP.isXFR_OUT(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isXFR_OUT_PROV(r.io_schd_typ())) {
				setGr(chdIoSchdR, r, giGrR);
				MCRow.copyvalue(ioSchdR, getXfrOut(ioSchdR, chdIoSchdR, giGrR));

				if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())) {
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GR.value());
				}
				else if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GR_PROV.value());
				}
				else if (MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())) {
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_RTN_GR.value());
				}
				else if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_RTN_GR_PROV.value());
				}
				chdIoSchdR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			}
			// 検査完了出庫
			else if (MSC_IO_SCHD_TYP.isINSP_CMPL_GI(r.io_schd_typ())) {
				chdIoSchdR.io_schd_typ(MSC_IO_SCHD_TYP.INSP_CMPL_GR.value());
				chdIoSchdR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			}

			chdIoSchdR.io_typ(MSC_IO_SCHD_TYP.io_typ(chdIoSchdR.io_schd_typ()));
			chdIoSchdR.avl_schd_dt(getMaxDt(chdIoSchdR.schd_dt(), chdIoSchdR.accpt_schd_dt(), r.insp_cmpl_schd_dt()));
			setSno(chdIoSchdR, r, itm);
			chdIoSchdR.alloc_tgt_flg(MSC_IO_SCHD_TYP.is_alloc_tgt(chdIoSchdR.io_schd_typ())
					&& MSC_IO_SCHD_STS_TYP.is_alloc_tgt(chdIoSchdR.io_schd_sts_typ()));
			dbc.add(chdIoSchdR);

			// 他勘定出庫ＦＬＧ=1の理由の場合は他勘定振替出庫を追加する
			if (!isNull(r.rsn_cd()) && bizRsn.acxfr_gi_flg()) {
				MST_IO_SCHD_R chdacxfrR = chdIoSchdR.clone();

				// 社内の移動・移送のみ対象、支給・支給返品では追加しない
				if (MSC_IO_SCHD_TYP.isXFR_GR(chdIoSchdR.io_schd_typ())
						|| MSC_IO_SCHD_TYP.isXFR_RTN_GR(chdIoSchdR.io_schd_typ())) {
					chdacxfrR.io_schd_typ(MSC_IO_SCHD_TYP.ACXFR_GI_XFR.value());
				}
				else if (MSC_IO_SCHD_TYP.isMOVE_GR(chdIoSchdR.io_schd_typ())
						|| MSC_IO_SCHD_TYP.isMOVE_RTN_GR(chdIoSchdR.io_schd_typ())){
					chdacxfrR.io_schd_typ(MSC_IO_SCHD_TYP.ACXFR_GI_MOVE.value());
				}
				else {
					return;
				}
				chdIoSchdR.alloc_tgt_flg(false);
				chdacxfrR.alloc_tgt_flg(false);
				chdacxfrR.io_typ(MSC_IO_SCHD_TYP.io_typ(chdacxfrR.io_schd_typ()));
				chdacxfrR.accpt_schd_dt(null);
				chdacxfrR.avl_schd_dt(null);
				chdacxfrR.gr_loc_cd(null);
				dbc.add(chdacxfrR);
			}
		}

		protected void clearGrInfo(MST_IO_SCHD_R ioSchdR) {

			ioSchdR.alt_grp_cd(null);
			ioSchdR.alt_grp_seq(null);
			ioSchdR.oper_inst_no(null);
			ioSchdR.oper_ord_no(null);
			ioSchdR.alt_qty(null);
			ioSchdR.alt_itm_typ(null);
			ioSchdR.alt_itm_ratio(null);
			ioSchdR.alt_alloc_prio(null);
			ioSchdR.sno1_null_flg(false);
			ioSchdR.sno2_null_flg(false);
			ioSchdR.sno3_null_flg(false);
			ioSchdR.sno4_null_flg(false);
			ioSchdR.ex_sno1(null);
			ioSchdR.ex_sno2(null);
			ioSchdR.ex_sno3(null);
			ioSchdR.ex_sno4(null);
			ioSchdR.alloc_scope_typ(null);
			ioSchdR.alloc_flg(false);
			ioSchdR.alloc_wait_flg(false);
			ioSchdR.inpt_ctl_typ(null);
		}

		protected void setGr(MST_IO_SCHD_R chdIoSchdR, IoSchd_Ins01_DtlR r, GiGr_LocR giGrR) {

			chdIoSchdR.schd_dt(nvl(r.gr_schd_dt(), nvl(r.ex_cmpl_schd_dt(), r.schd_dt())));
			chdIoSchdR.loc_cd(r.gr_loc_cd());
			chdIoSchdR.str_ln_cd(nvl(r.gr_str_ln_cd(), MAC_STR.NULL_VAL.value()));
			chdIoSchdR.wg_cd(giGrR.gr_wg_cd());
			setStkIdTyp(chdIoSchdR, giGrR);
		}

		protected void setStkIdTyp(MST_IO_SCHD_R chdIoSchdR, GiGr_LocR giGrR) {

			chdIoSchdR.stk_arrv_bp_cd(giGrR.gr_stk_arrv_bp_cd());
			chdIoSchdR.stk_id_typ(giGrR.gr_stk_id_typ());
			chdIoSchdR.stk_bp_cd(giGrR.gr_stk_bp_cd());
			chdIoSchdR.asst_typ(giGrR.gr_asst_typ());
		}

		protected MST_IO_SCHD_R getXfrIn(MST_IO_SCHD_R ioSchdR, MST_IO_SCHD_R chdIoSchdR, GiGr_LocR giGrR) {

			MST_IO_SCHD_R xfrInR = MST_IO_SCHD_R.create();

			if (MSC_IO_SCHD_TYP.isXFR_GI(ioSchdR.io_schd_typ()) || MSC_IO_SCHD_TYP.isXFR_RTN_GI(ioSchdR.io_schd_typ())) {
				setXfrIn(xfrInR, ioSchdR, chdIoSchdR, giGrR);
				xfrInR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_IN.value());
			}
			else if (MSC_IO_SCHD_TYP.isXFR_GI_PROV(ioSchdR.io_schd_typ()) || MSC_IO_SCHD_TYP.isXFR_RTN_GI_PROV(ioSchdR.io_schd_typ())) {
				setXfrIn(xfrInR, ioSchdR, chdIoSchdR, giGrR);
				xfrInR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_IN_PROV.value());
			}

			xfrInR.io_typ(MSC_IO_SCHD_TYP.io_typ(xfrInR.io_schd_typ()));
			xfrInR.in_xfr_typ(MSC_IN_XFR_TYP.IN_XFR.value());
			return xfrInR;
		}

		protected void setXfrIn(MST_IO_SCHD_R xfrInR, MST_IO_SCHD_R ioSchdR, MST_IO_SCHD_R chdIoSchdR, GiGr_LocR giGrR) {
			if (isNull(giGrR.gr_sppl_cd())) {
				if (MAC_XFR_STK_MNG_TYP.isGI(getCo().xfr_stk_mng_typ())) {
					MCRow.copyall(xfrInR, ioSchdR);
					clearGrInfo(xfrInR);
				}
				else {
					MCRow.copyall(xfrInR, chdIoSchdR);
					xfrInR.accpt_schd_dt(ioSchdR.schd_dt());
					ioSchdR.accpt_schd_dt(ioSchdR.schd_dt());
				}
			}
			else {
				if (MAC_PROV_RCV_TYP.isARR_GI(giGrR.gr_prov_rcv_typ())) {
					MCRow.copyall(xfrInR, ioSchdR);
					clearGrInfo(xfrInR);
				}
				else {
					MCRow.copyall(xfrInR, chdIoSchdR);
					xfrInR.accpt_schd_dt(ioSchdR.schd_dt());
					ioSchdR.accpt_schd_dt(ioSchdR.schd_dt());
				}
			}
		}

		protected MST_IO_SCHD_R getXfrOut(MST_IO_SCHD_R ioSchdR, MST_IO_SCHD_R chdIoSchdR, GiGr_LocR giGrR) {

			MST_IO_SCHD_R xfrOutR = MST_IO_SCHD_R.create();

			if (MSC_IO_SCHD_TYP.isXFR_GI(ioSchdR.io_schd_typ()) || MSC_IO_SCHD_TYP.isXFR_RTN_GI(ioSchdR.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isXFR_OUT(ioSchdR.io_schd_typ())) {
				setXfrOut(xfrOutR, ioSchdR, chdIoSchdR, giGrR);
				xfrOutR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_OUT.value());
			}
			else if (MSC_IO_SCHD_TYP.isXFR_GI_PROV(ioSchdR.io_schd_typ()) || MSC_IO_SCHD_TYP.isXFR_RTN_GI_PROV(ioSchdR.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isXFR_OUT_PROV(ioSchdR.io_schd_typ())) {
				setXfrOut(xfrOutR, ioSchdR, chdIoSchdR, giGrR);
				xfrOutR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_OUT_PROV.value());
			}

			xfrOutR.io_typ(MSC_IO_SCHD_TYP.io_typ(xfrOutR.io_schd_typ()));
			xfrOutR.in_xfr_typ(MSC_IN_XFR_TYP.IN_XFR.value());
			return xfrOutR;
		}

		protected void setXfrOut(MST_IO_SCHD_R xfrOutR, MST_IO_SCHD_R ioSchdR, MST_IO_SCHD_R chdIoSchdR, GiGr_LocR giGrR) {
			if (isNull(giGrR.gr_sppl_cd())) {
				if (MAC_XFR_STK_MNG_TYP.isGI(getCo().xfr_stk_mng_typ())) {
					MCRow.copyall(xfrOutR, ioSchdR);
					clearGrInfo(xfrOutR);
					xfrOutR.accpt_schd_dt(chdIoSchdR.schd_dt());
					chdIoSchdR.accpt_schd_dt(chdIoSchdR.schd_dt());
				}
				else {
					MCRow.copyall(xfrOutR, chdIoSchdR);
				}
			}
			else {
				if (MAC_PROV_RCV_TYP.isARR_GI(giGrR.gr_prov_rcv_typ())) {
					MCRow.copyall(xfrOutR, ioSchdR);
					clearGrInfo(xfrOutR);
					xfrOutR.accpt_schd_dt(chdIoSchdR.schd_dt());
					chdIoSchdR.accpt_schd_dt(chdIoSchdR.schd_dt());
				}
				else {
					MCRow.copyall(xfrOutR, chdIoSchdR);
				}
			}
		}

		// 子伝を作成する対象となる受払予定区分
		protected Boolean isAddChdTgt(IoSchd_Ins01_DtlR r) {

			return MSC_IO_SCHD_TYP.isSLS_RTN_GI(r.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isPURC_GI(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isPURC_GI_PROV(r.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isPURC_XFR_OUT(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isPURC_XFR_OUT_PROV(r.io_schd_typ())
					|| (MSC_IO_SCHD_TYP.isSHIP_OUT(r.io_schd_typ()) && MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ()))
					|| MSC_IO_SCHD_TYP.isSHIP_RTN_GI(r.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isMOVE_GI(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isMOVE_GI_PROV(r.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isMOVE_RTN_GI(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isMOVE_RTN_GI_PROV(r.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isXFR_GI(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isXFR_GI_PROV(r.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isXFR_RTN_GI(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isXFR_RTN_GI_PROV(r.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isSHIP_OUT_EX(r.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isXFR_OUT(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isXFR_OUT_PROV(r.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isINSP_CMPL_GI(r.io_schd_typ());
		}

		protected void editDbc(MCList<MST_IO_SCHD_R> dbc) {
			for (MST_IO_SCHD_R r: dbc) {
				setInvTransFlg(r);
			}
		}

		protected void setInvTransFlg(MST_IO_SCHD_R r) {
			// 在庫発生基準
			setInvTransFlgAccrual(r);
			// 資産発生基準
			setInvTransFlgAccpt(r);
			// 使用可能日基準
			setInvTransFlgAvl(r);
		}

		protected void setInvTransFlgAccrual(MST_IO_SCHD_R r) {
			// 在庫発生基準
			if (MSC_IN_XFR_TYP.isIN_LOC(r.in_xfr_typ())
					&& (MSC_IO_TYP.isGR(r.io_typ())
							&& !((MSC_IO_SCHD_TYP.isPURC_GR(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isPURC_GR_PROV(r.io_schd_typ()))
								&& (MSC_IO_SCHD_STS_TYP.isARR(r.io_schd_sts_typ()) || MSC_IO_SCHD_STS_TYP.isINSP(r.io_schd_sts_typ()))
							|| (MSC_IO_SCHD_TYP.isSLS_RTN_GR(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isSLS_RTN_GR_ACXFR(r.io_schd_typ()))
								&& MSC_IO_SCHD_STS_TYP.isARR(r.io_schd_sts_typ())
							|| MSC_IO_SCHD_TYP.isINSP_CMPL_GR(r.io_schd_typ()))
						|| MSC_IO_TYP.isGI(r.io_typ())
							&& !((MSC_IO_SCHD_TYP.isPURC_GI(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isPURC_GI_PROV(r.io_schd_typ()))
								&& (MSC_IO_SCHD_STS_TYP.isARR(r.io_schd_sts_typ()) || MSC_IO_SCHD_STS_TYP.isINSP(r.io_schd_sts_typ()))
							|| (MSC_IO_SCHD_TYP.isSLS_RTN_GI(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isSLS_RTN_GI_ACXFR(r.io_schd_typ()))
								&& MSC_IO_SCHD_STS_TYP.isARR(r.io_schd_sts_typ())
							|| MSC_IO_SCHD_TYP.isINSP_CMPL_GI(r.io_schd_typ()))
					)
					&& (MAC_STR.isNULL_VAL(r.stk_arrv_bp_cd()) || !isNull(_locCache.getFirst(_idxCache, r.loc_cd()).sppl_cd()))) {
				r.accrual_flg(true);
			}
		}

		protected void setInvTransFlgAccpt(MST_IO_SCHD_R r) {
			// 資産発生基準
			if ((MAC_ASST_TYP.isCO_SLS(r.asst_typ()) || MAC_ASST_TYP.isCO_PROD(r.asst_typ()))
					&& !MSC_IO_SCHD_STS_TYP.isPURC(r.io_schd_sts_typ())
					&& (MSC_IO_TYP.isGR(r.io_typ())
							&& !(MSC_IO_SCHD_TYP.isINSP_CMPL_GR(r.io_schd_typ())
								|| MSC_IO_SCHD_TYP.isSHIP_IN(r.io_schd_typ())
								|| MSC_IO_SCHD_TYP.isSHIP_IN_EX(r.io_schd_typ())
								|| MSC_IO_SCHD_TYP.isSHIP_RTN_GR(r.io_schd_typ())
								|| (MSC_IO_SCHD_TYP.isXFR_GR(r.io_schd_typ())
									|| MSC_IO_SCHD_TYP.isXFR_RTN_GR(r.io_schd_typ())
									|| MSC_IO_SCHD_TYP.isXFR_IN(r.io_schd_typ())
									|| MSC_IO_SCHD_TYP.isXFR_GR_PROV(r.io_schd_typ())
									|| MSC_IO_SCHD_TYP.isXFR_RTN_GR_PROV(r.io_schd_typ())
									|| MSC_IO_SCHD_TYP.isXFR_IN_PROV(r.io_schd_typ()))
								&& isNull(r.accpt_schd_dt()))
						|| MSC_IO_TYP.isGI(r.io_typ())
							&& !(MSC_IO_SCHD_TYP.isINSP_CMPL_GI(r.io_schd_typ())
								|| MSC_IO_SCHD_TYP.isSHIP_OUT(r.io_schd_typ())
								|| MSC_IO_SCHD_TYP.isSHIP_OUT_EX(r.io_schd_typ())
								|| MSC_IO_SCHD_TYP.isSHIP_RTN_GI(r.io_schd_typ())
								|| (MSC_IO_SCHD_TYP.isXFR_GI(r.io_schd_typ())
									|| MSC_IO_SCHD_TYP.isXFR_RTN_GI(r.io_schd_typ())
									|| MSC_IO_SCHD_TYP.isXFR_OUT(r.io_schd_typ())
									|| MSC_IO_SCHD_TYP.isXFR_GI_PROV(r.io_schd_typ())
									|| MSC_IO_SCHD_TYP.isXFR_RTN_GI_PROV(r.io_schd_typ())
									|| MSC_IO_SCHD_TYP.isXFR_OUT_PROV(r.io_schd_typ()))
								&& isNull(r.accpt_schd_dt())))
					) {
				r.accpt_flg(true);

				if (isNull(r.accpt_schd_dt())) {
					r.accpt_schd_dt(r.schd_dt());
				}
			}
			else {
				r.accpt_schd_dt(null);
			}
		}

		protected void setInvTransFlgAvl(MST_IO_SCHD_R r) {
			// 使用可能日基準
			if (MSC_IN_XFR_TYP.isIN_LOC(r.in_xfr_typ())
					&& MSC_STK_INSP_TYP.isFIN(r.stk_insp_typ())
					&& (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())
//							|| MSC_STK_ID_TYP.isRTN_PRE_ACCPT(r.stk_id_typ())
							|| MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())
							|| MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ())
//							|| MSC_STK_ID_TYP.isPURC_PRE_ACCPT(r.stk_id_typ())
							|| MSC_STK_ID_TYP.isACCPT_DFCT(r.stk_id_typ())	// 引当で使用するので対象とする。在庫推移では不要だが、在庫推移検索サービスで省く
							|| MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ())
							|| MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ()))
					&& (MAC_STR.isNULL_VAL(r.stk_arrv_bp_cd()) || !isNull(_locCache.getFirst(_idxCache, r.loc_cd()).sppl_cd()))) {
				r.avl_flg(true);

				if (MSC_IO_TYP.isGR(r.io_typ())) {
					if (isNull(r.avl_schd_dt())) {
						r.avl_schd_dt(r.schd_dt());
					}
				}
				else {
					r.avl_schd_dt(null);
				}
			}
			else {
				r.avl_schd_dt(null);
			}
		}

		protected void setNoAndLotSv(MSBFL_LotTraceService.LotTrace_Upd01 o, MCList<MST_IO_SCHD_R> dbc) {

			doSeqCache(MSC_NUM_SYS_TYP.SLIPSCHD, dbc.size());

			for (MST_IO_SCHD_R r: dbc) {
				r.slip_schd_no(getStrSeq(MSC_NUM_SYS_TYP.SLIPSCHD));

				// ロットトレース情報サービスを実行するための情報を取得する
				setLotSv(o, r);
			}
		}

		protected void setLotSv(MSBFL_LotTraceService.LotTrace_Upd01 o, MST_IO_SCHD_R r) {

			// is_upd_lot_traceの移送出庫、移送入庫、移送返品出庫、移送返品入庫の仕様について
			// 標準機能では、移送出庫：T、移送入庫：F、移送返品出庫：F、移送返品入庫：Fとしている
			// 予定でのロットトレースは、不測の事態で出庫を止めるための目印とするために作成している
			// そのため、移送出庫：Tだが移送入庫：Fとしてる
			// また、返品時には不測の事態も起きないので目印をつける必要が無い
			// そのため、移送返品出庫：F、移送返品入庫：Fとしている
			if (MSC_IO_SCHD_TYP.is_upd_lot_trace(r.io_schd_typ())) {
				if (MSC_IO_TYP.isGR(r.io_typ())) {
					LotTrace_Upd01_DtlGrR up = LotTrace_Upd01_DtlGrR.create();
					copy(up, r, createMap_LotTrace_Upd01_DtlGrR_MST_IO_SCHD_R());
					o.up0().add(up);
				}
				else {
					LotTrace_Upd01_DtlGiR up = LotTrace_Upd01_DtlGiR.create();
					copy(up, r, createMap_LotTrace_Upd01_DtlGiR_MST_IO_SCHD_R());
					o.up1().add(up);
				}
			}
		}

		protected void insAndExec(MSBFL_LotTraceService.LotTrace_Upd01 o, MCList<MST_IO_SCHD_R> dbc) {
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_IO_SCHD_R.create("T"));
			dbInsertEx("MSBEL5020_MST_IO_SCHD_I01", dbc, dbc_bldr);

			if (o.up0().size() > 0 || o.up1().size() > 0) {
				o.exec();
			}
		}

		//- 品目マスタ検索 ---------------------------------------------
		protected void selectItmL(MCList<IoSchd_Ins01_DtlR> up) {

			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.stk_mng_typ,
							t.asset_mng_typ,
							t.lot_mng_typ,
							t.sublot_mng_typ,
							t.sno1_mng_typ,
							t.sno2_mng_typ,
							t.sno3_mng_typ,
							t.sno4_mng_typ,
							t.unit_cd,
							t.dec_place,
							t.rnd_typ);

			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, up,
					IoSchd_Ins01_DtlR.$itm_cd,
					IoSchd_Ins01_DtlR.$itm_sub1,
					IoSchd_Ins01_DtlR.$itm_sub2,
					IoSchd_Ins01_DtlR.$itm_sub3);
		}
		//- 品目単位マスタ検索 ---------------------------------------------
		protected void selectItmUnitL(MCList<IoSchd_Ins01_DtlR> up) {
			
			MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.conv_base_qty,
							t.conv_qty,
							t.dec_place,
							t.rnd_typ,
							t.pack_flg,
							t.base_unit_flg);

			_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbc_bldr, up,
					IoSchd_Ins01_DtlR.$itm_cd,
					IoSchd_Ins01_DtlR.$itm_sub1,
					IoSchd_Ins01_DtlR.$itm_sub2,
					IoSchd_Ins01_DtlR.$itm_sub3,
					IoSchd_Ins01_DtlR.$trd_unit_cd);
		}
		//- 業務理由マスタ検索 ---------------------------------------------
		protected void selectBizRsnL(MCList<IoSchd_Ins01_DtlR> up) {

			MAM_BIZ_RSN_R t = MAM_BIZ_RSN_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.sls_acxfr_flg, t.acxfr_gi_flg);

			_bizRsnCache = new FXUCL_MCDbcCache<MAM_BIZ_RSN_R>(dbc_bldr, up, IoSchd_Ins01_DtlR.$rsn_cd);
		}
		//- 場所マスタ検索 ---------------------------------------------
		protected void selectLocL(MCList<GiGr_LocR> giGrL) {

			MCList<MAM_LOC_R> dbc = MCList.create(MAM_LOC_R.class);
			addAll(dbc, giGrL, createMap_MAM_LOC_R_Gi_LocR());
			addAll(dbc, giGrL, createMap_MAM_LOC_R_Gr_LocR());
			_locCache.addAll(dbc.groupBy(MAM_LOC_R.$loc_cd, MAM_LOC_R.$sppl_cd).subList(r -> !isNull(r.loc_cd())));
			_idxCache = _locCache.createIndex(MAM_LOC_R.$loc_cd);
		}
		//- 取引先マスタ検索 ---------------------------------------------
		protected void selectSpplL(MCList<GiGr_LocR> giGrL) {

			MCList<MAM_BP_R> grBindL = MCList.create(MAM_BP_R.class);
			for (GiGr_LocR r : giGrL.groupBy(GiGr_LocR.$gr_sppl_cd)) {
				if (isNull(r.gr_sppl_cd())) {
					continue;
				}
				MAM_BP_R grBindR = MAM_BP_R.create();
				grBindR.bp_cd(r.gr_sppl_cd());
				grBindL.add(grBindR);
			}
			
			MCList<MAM_BP_R> giBindL = MCList.create(MAM_BP_R.class);
			for (GiGr_LocR r : giGrL.groupBy(GiGr_LocR.$gi_sppl_cd)) {
				if (isNull(r.gi_sppl_cd())) {
					continue;
				}
				MAM_BP_R giBindR = MAM_BP_R.create();
				giBindR.bp_cd(r.gi_sppl_cd());
				giBindL.add(giBindR);
			}
			
			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.repurc_obli_flg);
			dbc_bldr.addSelect(t.bp_cd);

			_grSpplCache = new FXUCL_Cache<MAM_BP_R>();
			_grSpplCache.setFixMaxCacheSize(-1);
			
			if (!grBindL.isEmpty()) {
				dbSelectKey("MSBEL5020_MAM_BP_S01", bpL, dbc_bldr, grBindL);
			}
			for (MAM_BP_R r : bpL) {
				_grSpplCache.putCache(new String[] {
						r.getStringNE(MAM_BP_R.$bp_cd)
				}, r);
			}
			
			_giSpplCache = new FXUCL_Cache<MAM_BP_R>();
			_giSpplCache.setFixMaxCacheSize(-1);
			bpL = MCList.create(MAM_BP_R.class);
			
			if (!giBindL.isEmpty()) {
				dbSelectKey("MSBEL5020_MAM_BP_S02", bpL, dbc_bldr, giBindL);
			}
			for (MAM_BP_R r : bpL) {
				_giSpplCache.putCache(new String[] {
						r.getStringNE(MAM_BP_R.$bp_cd)
				}, r);
			}
		}
	}
	/**
	 * IoSchd_Del01オペレーション.<p>
	 *
	 * 受払予定のデータを削除する<br>
	 */
	public class IoSchd_Del01 extends MSBEL_IoSchdService_MC_A.IoSchd_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			execLotSv();
			execDel();
		}

		protected void execLotSv() {
			// 削除対象のデータを取得するためワークテーブルを作成する
			MSW_IO_SCHD_DEL_R S0T = MSW_IO_SCHD_DEL_R.create("T");
			execDbWkDelete("MSBEL5020_MSW_IO_SCHD_DEL_D01", S0T);

			MCInsert q1 = sql("MSBEL5020_MSW_IO_SCHD_DEL_I01")
				.insert(S0T)
				.columns(
					S0T.io_schd_typ,
					S0T.io_schd_sts_typ,
					S0T.io_schd_no,
					S0T.io_schd_seq,
					S0T.io_schd_sub_typ1,
					S0T.io_schd_sub_no1,
					S0T.io_schd_sub_seq1,
					S0T.io_schd_sub_typ2,
					S0T.io_schd_sub_no2,
					S0T.io_schd_sub_seq2,
					S0T.io_schd_sub_typ3,
					S0T.io_schd_sub_no3,
					S0T.io_schd_sub_seq3,
					S0T.io_schd_sub_typ4,
					S0T.io_schd_sub_no4,
					S0T.io_schd_sub_seq4,
					S0T.io_schd_pr_no
				)
				.values(
					bind("io_schd_typ"),
					bind("io_schd_sts_typ"),
					bind("io_schd_no"),
					bind("io_schd_seq"),
					bind("io_schd_sub_typ1"),
					bind("io_schd_sub_no1"),
					bind("io_schd_sub_seq1"),
					bind("io_schd_sub_typ2"),
					bind("io_schd_sub_no2"),
					bind("io_schd_sub_seq2"),
					bind("io_schd_sub_typ3"),
					bind("io_schd_sub_no3"),
					bind("io_schd_sub_seq3"),
					bind("io_schd_sub_typ4"),
					bind("io_schd_sub_no4"),
					bind("io_schd_sub_seq4"),
					bind("io_schd_pr_no")
				);
			q1.executeBatchUpdate(up0());

			// 削除対象のデータを取得する
			MCList<MST_IO_SCHD_R> dbc = MCList.create(MST_IO_SCHD_R.class);
			executeQuery(dbc, MSBEL5020_MST_IO_SCHD_S01());

			// ロットトレース情報サービスを実行する
			if (dbc.size() > 0) {
				MSBFL_LotTraceService.LotTrace_Upd01 o = MSBFL_LotTraceService.crtLotTrace_Upd01();
				for (MST_IO_SCHD_R r: dbc) {
					if (MSC_IO_TYP.isGR(r.io_typ())) {
						LotTrace_Upd01_DtlGrR up = LotTrace_Upd01_DtlGrR.create();
						up.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						up.slip_schd_no(r.slip_schd_no());
						o.up0().add(up);
					}
					else {
						LotTrace_Upd01_DtlGiR up = LotTrace_Upd01_DtlGiR.create();
						up.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						up.slip_schd_no(r.slip_schd_no());
						o.up1().add(up);
					}
				}
				o.exec();
			}
		}

		protected void execDel() {
			// 削除
			executeUpdate(MSBEL5020_MST_IO_SCHD_D01());
		}
	}
	/**
	 * IoSchd_Del02オペレーション.<p>
	 *
	 * 受払予定のデータを予備区分、予備ＮＯを使用して削除する<br>
	 */
	public class IoSchd_Del02 extends MSBEL_IoSchdService_MC_A.IoSchd_Del02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			chkUp0();
			if (up0().isEmpty()) return;
			execLotSv();
			execDel();
		}

		protected void chkUp0() {
			// 受払予定予備ＮＯ１～４、受払進捗管理ＮＯが未設定の上り電文は削除処理で使用しない
			MCList<MSW_IO_SCHD_DEL_R> up0 = MCList.create(MSW_IO_SCHD_DEL_R.class);
			for (MSW_IO_SCHD_DEL_R r :up0()) {
				if (!(isNullAnd(r.io_schd_sub_no1(), r.io_schd_sub_no2(), r.io_schd_sub_no3(), r.io_schd_sub_no4(), r.io_schd_pr_no()))) {
					setDelGrp(r); // Del02パフォーマンス改善
					up0.add(r);
				}
			}
			if (up0.size() != up0().size()) {
				up0().setAll(up0);
			}
		}

		/**
		 * 受払予定予備ＮＯ１～４、受払進捗ＮＯ、受払予定予備連番１～４に対して、同じ項目に値が設定されているレコード同士を判別できるように削除グループを設定する。
		 * @param r
		 */
		protected void setDelGrp(MSW_IO_SCHD_DEL_R r) {
			
			Comparable<?>[] vals = new Comparable[] {
					r.io_schd_sub_no1(), r.io_schd_sub_no2(), r.io_schd_sub_no3(),
					r.io_schd_sub_no4(), r.io_schd_pr_no(), r.io_schd_sub_seq1(),
					r.io_schd_sub_seq2(), r.io_schd_sub_seq3(), r.io_schd_sub_seq4()
			};
			
			String delGrp = "";

			// 削除グループの文字列に対し、受払予定予備ＮＯ１が文字列の左１桁目、予備ＮＯ２が２桁目、…受払進捗ＮＯが５桁目、
			// 受払予定予備連番１が６桁目、…連番４が９桁目と割り当てる。
			// NULLの場合は0、設定されている場合は1とする。
			// 例えば予備ＮＯ１、受払進捗ＮＯ、予備連番１が設定されている場合、削除グループは"100011000"となる。
			for (Comparable<?> v : vals) {
				if (isNull(v)) {
					delGrp += "0";
				}
				else {
					delGrp += "1";
				}
			}

			r.setStringNE("del_grp", delGrp);
		}

		protected void execLotSv() {
			MSBFL_LotTraceService.LotTrace_Upd01 o = MSBFL_LotTraceService.crtLotTrace_Upd01();

			// 削除グループ単位に削除を実行
			for (MCList<MSW_IO_SCHD_DEL_R> delGrpL : up0().groupList("del_grp")) {
				// 削除対象のデータを取得するためワークテーブルを作成する
				MSW_IO_SCHD_DEL_R S0T = MSW_IO_SCHD_DEL_R.create("T");
				MCDelete q = sql("MSBEL5020_MSW_IO_SCHD_DEL_D02").delete(S0T);
				q.executeUpdate();

				MCInsert q1 = sql("MSBEL5020_MSW_IO_SCHD_DEL_I02")
					.insert(S0T)
					.columns(
						S0T.io_schd_typ,
						S0T.io_schd_sts_typ,
						S0T.io_schd_no,
						S0T.io_schd_seq,
						S0T.io_schd_sub_typ1,
						S0T.io_schd_sub_no1,
						S0T.io_schd_sub_seq1,
						S0T.io_schd_sub_typ2,
						S0T.io_schd_sub_no2,
						S0T.io_schd_sub_seq2,
						S0T.io_schd_sub_typ3,
						S0T.io_schd_sub_no3,
						S0T.io_schd_sub_seq3,
						S0T.io_schd_sub_typ4,
						S0T.io_schd_sub_no4,
						S0T.io_schd_sub_seq4,
						S0T.io_schd_pr_no
					)
					.values(
						bind("io_schd_typ"),
						bind("io_schd_sts_typ"),
						bind("io_schd_no"),
						bind("io_schd_seq"),
						bind("io_schd_sub_typ1"),
						bind("io_schd_sub_no1"),
						bind("io_schd_sub_seq1"),
						bind("io_schd_sub_typ2"),
						bind("io_schd_sub_no2"),
						bind("io_schd_sub_seq2"),
						bind("io_schd_sub_typ3"),
						bind("io_schd_sub_no3"),
						bind("io_schd_sub_seq3"),
						bind("io_schd_sub_typ4"),
						bind("io_schd_sub_no4"),
						bind("io_schd_sub_seq4"),
						bind("io_schd_pr_no")
					);
				q1.executeBatchUpdate(up0());

				// 検索用SQLを生成して削除対象のデータを取得する
				MCList<MST_IO_SCHD_R> dbc = MCList.create(MST_IO_SCHD_R.class);
				MSW_IO_SCHD_DEL_R delR = delGrpL.get(0);
				getSelectSql(delR).executeQuery(delR, dbc);

				for (MST_IO_SCHD_R r : dbc) {
					if (MSC_IO_TYP.isGR(r.io_typ())) {
						LotTrace_Upd01_DtlGrR up = LotTrace_Upd01_DtlGrR.create();
						up.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						up.slip_schd_no(r.slip_schd_no());
						o.up0().add(up);
					}
					else {
						LotTrace_Upd01_DtlGiR up = LotTrace_Upd01_DtlGiR.create();
						up.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						up.slip_schd_no(r.slip_schd_no());
						o.up1().add(up);
					}
				}
			}

			// ロットトレース情報サービスを実行する
			if (!o.up0().isEmpty() || !o.up1().isEmpty()) {
				o.exec();
			}
		}

		protected void execDel() {
			// 削除グループ単位に削除を実行
			for (MCList<MSW_IO_SCHD_DEL_R> delGrpL : up0().groupList("del_grp")) {
				// 削除対象のデータを取得するためワークテーブルを作成する
				MSW_IO_SCHD_DEL_R S0T = MSW_IO_SCHD_DEL_R.create("T");
				MCDelete q = sql("MSBEL5020_MSW_IO_SCHD_DEL_D03").delete(S0T);
				q.executeUpdate();

				MCInsert q1 = sql("MSBEL5020_MSW_IO_SCHD_DEL_I03")
					.insert(S0T)
					.columns(
						S0T.io_schd_typ,
						S0T.io_schd_sts_typ,
						S0T.io_schd_no,
						S0T.io_schd_seq,
						S0T.io_schd_sub_typ1,
						S0T.io_schd_sub_no1,
						S0T.io_schd_sub_seq1,
						S0T.io_schd_sub_typ2,
						S0T.io_schd_sub_no2,
						S0T.io_schd_sub_seq2,
						S0T.io_schd_sub_typ3,
						S0T.io_schd_sub_no3,
						S0T.io_schd_sub_seq3,
						S0T.io_schd_sub_typ4,
						S0T.io_schd_sub_no4,
						S0T.io_schd_sub_seq4,
						S0T.io_schd_pr_no
					)
					.values(
						bind("io_schd_typ"),
						bind("io_schd_sts_typ"),
						bind("io_schd_no"),
						bind("io_schd_seq"),
						bind("io_schd_sub_typ1"),
						bind("io_schd_sub_no1"),
						bind("io_schd_sub_seq1"),
						bind("io_schd_sub_typ2"),
						bind("io_schd_sub_no2"),
						bind("io_schd_sub_seq2"),
						bind("io_schd_sub_typ3"),
						bind("io_schd_sub_no3"),
						bind("io_schd_sub_seq3"),
						bind("io_schd_sub_typ4"),
						bind("io_schd_sub_no4"),
						bind("io_schd_sub_seq4"),
						bind("io_schd_pr_no")
					);
				q1.executeBatchUpdate(up0());

				// 削除用SQLを生成して実行する
				MSW_IO_SCHD_DEL_R delR = delGrpL.get(0);
				getDeleteSql(delR).executeUpdate(delR);
			}
		}

		/**
		 * 受払予定検索用のSQLを生成する
		 * @param delR
		 * @return
		 */
		protected MCMainQuery getSelectSql(MSW_IO_SCHD_DEL_R delR) {
			MST_IO_SCHD_R t = MST_IO_SCHD_R.create("T");
			return sql("MSBEL5020_MST_IO_SCHD_S02")
				.mainQuery()
				.select(t.slip_schd_no, t.io_typ)
				.from(t)
				.where(getWhere(delR).and(MSC_IO_SCHD_TYP$IS_UPD_LOT_TRACE(t.io_schd_typ).eq(value(true))));
		}

		/**
		 * 削除用のSQLを生成する
		 * @param delR
		 * @return
		 */
		protected MCDelete getDeleteSql(MSW_IO_SCHD_DEL_R delR) {
			MST_IO_SCHD_R t = MST_IO_SCHD_R.create("T");
			return sql("MSBEL5020_MST_IO_SCHD_D02")
				.delete(t)
				.where(getWhere(delR));
		}

		/**
		 * 検索、削除のSQLに共通するWHERE句を生成する
		 * @param delR
		 * @return
		 */
		protected MCPredicate getWhere(MSW_IO_SCHD_DEL_R delR) {
			MST_IO_SCHD_R t = MST_IO_SCHD_R.create("T");
			MSW_IO_SCHD_DEL_R w = MSW_IO_SCHD_DEL_R.create("W");

			MCPredicate p = value(0).eq(value(0));

			if (!isNull(delR.io_schd_sub_no1())) {
				p = p.and(t.io_schd_sub_typ1.eq(w.io_schd_sub_typ1));
				p = p.and(t.io_schd_sub_no1.eq(w.io_schd_sub_no1));
				if (!isNull(delR.io_schd_sub_seq1())) {
					p = p.and(t.io_schd_sub_seq1.eq(w.io_schd_sub_seq1));
				} 
			}

			if (!isNull(delR.io_schd_sub_no2())) {
				p = p.and(t.io_schd_sub_typ2.eq(w.io_schd_sub_typ2));
				p = p.and(t.io_schd_sub_no2.eq(w.io_schd_sub_no2));
				if (!isNull(delR.io_schd_sub_seq2())) {
					p = p.and(t.io_schd_sub_seq2.eq(w.io_schd_sub_seq2));
				} 
			}

			if (!isNull(delR.io_schd_sub_no3())) {
				p = p.and(t.io_schd_sub_typ3.eq(w.io_schd_sub_typ3));
				p = p.and(t.io_schd_sub_no3.eq(w.io_schd_sub_no3));
				if (!isNull(delR.io_schd_sub_seq3())) {
					p = p.and(t.io_schd_sub_seq3.eq(w.io_schd_sub_seq3));
				} 
			}

			if (!isNull(delR.io_schd_sub_no4())) {
				p = p.and(t.io_schd_sub_typ4.eq(w.io_schd_sub_typ4));
				p = p.and(t.io_schd_sub_no4.eq(w.io_schd_sub_no4));
				if (!isNull(delR.io_schd_sub_seq4())) {
					p = p.and(t.io_schd_sub_seq4.eq(w.io_schd_sub_seq4));
				} 
			}

			if (!isNull(delR.io_schd_pr_no())) {
				p = p.and(t.io_schd_pr_no.eq(w.io_schd_pr_no));
			}

			List<MCGeneralValue> bindList = new ArrayList<>();
			for (int i = 0; i < up1().size(); i++) {
				IoSchd_Del02_Cnd2R cnd2R = up1().get(i);
				String s = "IO_SCHD_STS_TYP" + String.valueOf(i);
				bindList.add(bind(s));
				delR.setStringNE(s , cnd2R.io_schd_sts_typ());
			}

			MCPredicate ret = value(0).eq(value(0)).and(exists(subQuery().select(value("X")).from(w).where(p)));
			if (!bindList.isEmpty()) {
				ret = ret.and(t.io_schd_sts_typ.in(bindList.toArray(new MCGeneralValue[bindList.size()])));
			}

			return ret;
		}
	}

	/**
	 * IoSchd_Upd01オペレーション.<p>
	 *
	 * 受払予定データの状況や日付を更新する<br>
	 */
	public class IoSchd_Upd01 extends MSBEL_IoSchdService_MC_A.IoSchd_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCList<IoSchd_Upd01_DtlR> list = MCList.create(IoSchd_Upd01_DtlR.class);
			editUp(list);
			execUpd(list);
		}
		protected void editUp(MCList<IoSchd_Upd01_DtlR> list) {

			for (IoSchd_Upd01_DtlR r :up0()) {
				if (MSC_IO_SCHD_TYP.isPURC_GI(r.io_schd_typ())) {
					IoSchd_Upd01_DtlR r2 = r.clone();
					r2.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR.value());
					list.add(r2);
				}
				else if (MSC_IO_SCHD_TYP.isPURC_GI_PROV(r.io_schd_typ())) {
					IoSchd_Upd01_DtlR r2 = r.clone();
					r2.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_PROV.value());
					list.add(r2);
				}
				else if (MSC_IO_SCHD_TYP.isINSP_CMPL_GI(r.io_schd_typ())) {
					IoSchd_Upd01_DtlR r2 = r.clone();
					r2.io_schd_typ(MSC_IO_SCHD_TYP.INSP_CMPL_GR.value());
					list.add(r2);
				}
				list.add(r);
			}
		}
		protected void execUpd(MCList<IoSchd_Upd01_DtlR> list) {
			// 更新
			executeBatchUpdate(MSBEL5020_MST_IO_SCHD_U01(), null, list);
		}
	}

	protected MCDate getMaxDt(MCDate schd_dt, MCDate accpt_schd_dt, MCDate insp_cmpl_schd_dt) {

		MCDate[] dtL = new MCDate[]{accpt_schd_dt, insp_cmpl_schd_dt};
		MCDate dt = schd_dt;

		for (MCDate dtR: dtL) {
			if (isNull(dt) || dt.lt(dtR)) {
				dt = dtR;
			}
		}

		return dt;
	}

	protected boolean isDdlvProvGi(IoSchd_Ins01_DtlR r) {
		if (MSC_IO_SCHD_TYP.isPURC_GI_PROV(r.io_schd_typ())
				|| MSC_IO_SCHD_TYP.isPURC_XFR_OUT_PROV(r.io_schd_typ())) {
			return true;
		}
		else {
			return false;
		}
	}

	protected boolean isDdlvProvGr(IoSchd_Ins01_DtlR r) {
		// 入庫の受払予定で直送支給の発生する受払予定区分、受払予定状況区分の組み合わせ
		if (MSC_IO_SCHD_TYP.isPURC_GR_PROV(r.io_schd_typ())
				&& (MSC_IO_SCHD_STS_TYP.isFIX(r.io_schd_sts_typ())
						|| MSC_IO_SCHD_STS_TYP.isSCHD(r.io_schd_sts_typ())
						|| MSC_IO_SCHD_STS_TYP.isPO(r.io_schd_sts_typ())
						|| MSC_IO_SCHD_STS_TYP.isPRMS(r.io_schd_sts_typ())
						|| MSC_IO_SCHD_STS_TYP.isDLV_INST(r.io_schd_sts_typ())
					)
		|| MSC_IO_SCHD_TYP.isARR_PROV(r.io_schd_typ())
				&& (MSC_IO_SCHD_STS_TYP.isPO(r.io_schd_sts_typ())
						|| MSC_IO_SCHD_STS_TYP.isPRMS(r.io_schd_sts_typ())
						|| MSC_IO_SCHD_STS_TYP.isDLV_INST(r.io_schd_sts_typ())
					)
			) {
			return true;
		}
		else {
			return false;
		}
	}

	protected Map_GiGr_LocR_IoSchd_Ins01_DtlR<GiGr_LocR,IoSchd_Ins01_DtlR> createMap_GiGr_LocR_IoSchd_Ins01_DtlR() {
		return new Map_GiGr_LocR_IoSchd_Ins01_DtlR<GiGr_LocR, IoSchd_Ins01_DtlR>();
	}

	public class Map_GiGr_LocR_IoSchd_Ins01_DtlR<D extends GiGr_LocR, S extends IoSchd_Ins01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(GiGr_LocR.$peg_no, IoSchd_Ins01_DtlR.$peg_no);
			addColumnPathMap(GiGr_LocR.$itm_cd, IoSchd_Ins01_DtlR.$itm_cd);
			addColumnPathMap(GiGr_LocR.$itm_sub1, IoSchd_Ins01_DtlR.$itm_sub1);
			addColumnPathMap(GiGr_LocR.$itm_sub2, IoSchd_Ins01_DtlR.$itm_sub2);
			addColumnPathMap(GiGr_LocR.$itm_sub3, IoSchd_Ins01_DtlR.$itm_sub3);
			addColumnPathMap(GiGr_LocR.$gi_loc_cd, IoSchd_Ins01_DtlR.$loc_cd);
			addColumnPathMap(GiGr_LocR.$gi_str_ln_cd, IoSchd_Ins01_DtlR.$str_ln_cd);
			addColumnPathMap(GiGr_LocR.$gi_schd_dt, IoSchd_Ins01_DtlR.$schd_dt);
			addColumnPathMap(GiGr_LocR.$gi_stk_arrv_bp_cd, IoSchd_Ins01_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(GiGr_LocR.$gi_stk_id_typ, IoSchd_Ins01_DtlR.$stk_id_typ);
			addColumnPathMap(GiGr_LocR.$gi_stk_bp_cd, IoSchd_Ins01_DtlR.$stk_bp_cd);
//			addColumnPathMap(GiGr_LocR.$gi_sppl_cd, );
//			addColumnPathMap(GiGr_LocR.$gi_wg_cd, );
//			addColumnPathMap(GiGr_LocR.$gi_lg_grp_cd, );
//			addColumnPathMap(GiGr_LocR.$gi_vmi_flg, );
			addColumnPathMap(GiGr_LocR.$gr_loc_cd, IoSchd_Ins01_DtlR.$gr_loc_cd);
			addColumnPathMap(GiGr_LocR.$gr_str_ln_cd, IoSchd_Ins01_DtlR.$gr_str_ln_cd);
//			addColumnPathMap(GiGr_LocR.$gr_schd_dt, );
//			addColumnPathMap(GiGr_LocR.$gr_stk_arrv_bp_cd, );
//			addColumnPathMap(GiGr_LocR.$gr_stk_id_typ, );
//			addColumnPathMap(GiGr_LocR.$gr_stk_bp_cd, );
//			addColumnPathMap(GiGr_LocR.$gr_asst_typ, );
//			addColumnPathMap(GiGr_LocR.$gr_sppl_cd, );
//			addColumnPathMap(GiGr_LocR.$gr_wg_cd, );
//			addColumnPathMap(GiGr_LocR.$gr_lg_grp_cd, );
//			addColumnPathMap(GiGr_LocR.$gr_loc_mng_typ, );
//			addColumnPathMap(GiGr_LocR.$gr_prov_rcv_typ, );
			addColumnPathMap(GiGr_LocR.$gr_prov_basis_typ, IoSchd_Ins01_DtlR.$prov_basis_typ);
			addColumnPathMap(GiGr_LocR.$gr_prov_typ, IoSchd_Ins01_DtlR.$prov_typ);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			// 支給関連の項目を取得するための設定
			if (isDdlvProvGi(src) || isDdlvProvGr(src)) {
				dest.gr_loc_cd(src.loc_cd());
				dest.gi_loc_cd(null);
				dest.gr_schd_dt(getMaxDt(src.schd_dt(), src.accpt_schd_dt(), null));
				dest.gr_stk_arrv_bp_cd(nvl(src.stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
				dest.gr_stk_id_typ(src.stk_id_typ());
				dest.gr_stk_bp_cd(nvl(src.stk_bp_cd(), MAC_STR.NULL_VAL.value()));
			}
			else if (!isNull(src.gr_loc_cd())) {
				dest.gr_schd_dt(nvl(src.gr_schd_dt(), nvl(src.ex_cmpl_schd_dt(), src.schd_dt())));
			}
		}
	}

	protected Map_LotTrace_Upd01_DtlGrR_MST_IO_SCHD_R<LotTrace_Upd01_DtlGrR,MST_IO_SCHD_R> createMap_LotTrace_Upd01_DtlGrR_MST_IO_SCHD_R() {
		return new Map_LotTrace_Upd01_DtlGrR_MST_IO_SCHD_R<LotTrace_Upd01_DtlGrR, MST_IO_SCHD_R>();
	}

	public class Map_LotTrace_Upd01_DtlGrR_MST_IO_SCHD_R<D extends LotTrace_Upd01_DtlGrR, S extends MST_IO_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
//			addColumnPathMap(LotTrace_Upd01_DtlGrR.$data_crud_typ, );
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$itm_cd, MST_IO_SCHD_R.$itm_cd);
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$itm_sub1, MST_IO_SCHD_R.$itm_sub1);
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$itm_sub2, MST_IO_SCHD_R.$itm_sub2);
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$itm_sub3, MST_IO_SCHD_R.$itm_sub3);
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$lot_no, MST_IO_SCHD_R.$lot_no);
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$sublot_no, MST_IO_SCHD_R.$sublot_no);
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$sno1, MST_IO_SCHD_R.$sno1);
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$sno2, MST_IO_SCHD_R.$sno2);
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$sno3, MST_IO_SCHD_R.$sno3);
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$sno4, MST_IO_SCHD_R.$sno4);
//			addColumnPathMap(LotTrace_Upd01_DtlGrR.$slip_no, );
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$slip_schd_no, MST_IO_SCHD_R.$slip_schd_no);
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$itm_mfg_inst_no, IoSchd_Ins01_DtlR.$itm_mfg_inst_no);
//			addColumnPathMap(LotTrace_Upd01_DtlGrR.$mfg_act_no, );
//			addColumnPathMap(LotTrace_Upd01_DtlGrR.$stk_xfr_act_no, );
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$base_gr_qty, MST_IO_SCHD_R.$base_unit_qty);
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$base_unit_cd, MST_IO_SCHD_R.$base_unit_cd);
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$sppl_cd, MST_IO_SCHD_R.$sppl_cd);
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$mfg_loc_cd, IoSchd_Ins01_DtlR.$mfg_loc_cd);
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$strg_loc_cd, MST_IO_SCHD_R.$loc_cd);
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$schd_dt, MST_IO_SCHD_R.$schd_dt);
//			addColumnPathMap(LotTrace_Upd01_DtlGrR.$act_dt, );
//			addColumnPathMap(LotTrace_Upd01_DtlGrR.$trd_ptn_typ, );
//			addColumnPathMap(LotTrace_Upd01_DtlGrR.$io_act_typ, );
//			addColumnPathMap(LotTrace_Upd01_DtlGrR.$schd_act_typ, );
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$mfg_inst_unit_typ, IoSchd_Ins01_DtlR.$mfg_inst_unit_typ);
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$io_schd_typ, MST_IO_SCHD_R.$io_schd_typ);
			addColumnPathMap(LotTrace_Upd01_DtlGrR.$io_schd_sts_typ, MST_IO_SCHD_R.$io_schd_sts_typ);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dest.schd_act_typ(MSC_SCHD_ACT_TYP.SCHD.value());
		}
	}

	protected Map_LotTrace_Upd01_DtlGiR_MST_IO_SCHD_R<LotTrace_Upd01_DtlGiR,MST_IO_SCHD_R> createMap_LotTrace_Upd01_DtlGiR_MST_IO_SCHD_R() {
		return new Map_LotTrace_Upd01_DtlGiR_MST_IO_SCHD_R<LotTrace_Upd01_DtlGiR, MST_IO_SCHD_R>();
	}

	public class Map_LotTrace_Upd01_DtlGiR_MST_IO_SCHD_R<D extends LotTrace_Upd01_DtlGiR, S extends MST_IO_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
//			addColumnPathMap(LotTrace_Upd01_DtlGiR.$data_crud_typ, );
			addColumnPathMap(LotTrace_Upd01_DtlGiR.$itm_cd, MST_IO_SCHD_R.$itm_cd);
			addColumnPathMap(LotTrace_Upd01_DtlGiR.$itm_sub1, MST_IO_SCHD_R.$itm_sub1);
			addColumnPathMap(LotTrace_Upd01_DtlGiR.$itm_sub2, MST_IO_SCHD_R.$itm_sub2);
			addColumnPathMap(LotTrace_Upd01_DtlGiR.$itm_sub3, MST_IO_SCHD_R.$itm_sub3);
			addColumnPathMap(LotTrace_Upd01_DtlGiR.$lot_no, MST_IO_SCHD_R.$lot_no);
			addColumnPathMap(LotTrace_Upd01_DtlGiR.$sublot_no, MST_IO_SCHD_R.$sublot_no);
			addColumnPathMap(LotTrace_Upd01_DtlGiR.$sno1, MST_IO_SCHD_R.$sno1);
			addColumnPathMap(LotTrace_Upd01_DtlGiR.$sno2, MST_IO_SCHD_R.$sno2);
			addColumnPathMap(LotTrace_Upd01_DtlGiR.$sno3, MST_IO_SCHD_R.$sno3);
			addColumnPathMap(LotTrace_Upd01_DtlGiR.$sno4, MST_IO_SCHD_R.$sno4);
//			addColumnPathMap(LotTrace_Upd01_DtlGiR.$slip_no, );
			addColumnPathMap(LotTrace_Upd01_DtlGiR.$slip_schd_no, MST_IO_SCHD_R.$slip_schd_no);
			addColumnPathMap(LotTrace_Upd01_DtlGiR.$itm_mfg_inst_no, IoSchd_Ins01_DtlR.$itm_mfg_inst_no);
//			addColumnPathMap(LotTrace_Upd01_DtlGiR.$mfg_act_no, );
//			addColumnPathMap(LotTrace_Upd01_DtlGiR.$stk_xfr_act_no, );
			addColumnPathMap(LotTrace_Upd01_DtlGiR.$base_gi_qty, MST_IO_SCHD_R.$base_unit_qty);
			addColumnPathMap(LotTrace_Upd01_DtlGiR.$base_unit_cd, MST_IO_SCHD_R.$base_unit_cd);
//			addColumnPathMap(LotTrace_Upd01_DtlGiR.$dlv_cd, );
//			addColumnPathMap(LotTrace_Upd01_DtlGiR.$tdlv_cd, );
			addColumnPathMap(LotTrace_Upd01_DtlGiR.$loc_cd, MST_IO_SCHD_R.$loc_cd);
			addColumnPathMap(LotTrace_Upd01_DtlGiR.$schd_dt, MST_IO_SCHD_R.$schd_dt);
//			addColumnPathMap(LotTrace_Upd01_DtlGiR.$act_dt, );
//			addColumnPathMap(LotTrace_Upd01_DtlGiR.$trd_ptn_typ, );
//			addColumnPathMap(LotTrace_Upd01_DtlGiR.$io_act_typ, );
//			addColumnPathMap(LotTrace_Upd01_DtlGiR.$schd_act_typ, );
			addColumnPathMap(LotTrace_Upd01_DtlGiR.$mfg_inst_unit_typ, IoSchd_Ins01_DtlR.$mfg_inst_unit_typ);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dest.schd_act_typ(MSC_SCHD_ACT_TYP.SCHD.value());
		}
	}

	protected Map_MAM_LOC_R_Gi_LocR<MAM_LOC_R,GiGr_LocR> createMap_MAM_LOC_R_Gi_LocR() {
		return new Map_MAM_LOC_R_Gi_LocR<MAM_LOC_R, GiGr_LocR>();
	}
	
	public class Map_MAM_LOC_R_Gi_LocR<D extends MAM_LOC_R, S extends GiGr_LocR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MAM_LOC_R.$loc_cd, GiGr_LocR.$gi_loc_cd);
			addColumnPathMap(MAM_LOC_R.$sppl_cd, GiGr_LocR.$gi_sppl_cd);
		}
	}

	protected Map_MAM_LOC_R_Gr_LocR<MAM_LOC_R,GiGr_LocR> createMap_MAM_LOC_R_Gr_LocR() {
		return new Map_MAM_LOC_R_Gr_LocR<MAM_LOC_R, GiGr_LocR>();
	}
	
	public class Map_MAM_LOC_R_Gr_LocR<D extends MAM_LOC_R, S extends GiGr_LocR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MAM_LOC_R.$loc_cd, GiGr_LocR.$gr_loc_cd);
			addColumnPathMap(MAM_LOC_R.$sppl_cd, GiGr_LocR.$gr_sppl_cd);
		}
	}

	//FMCB CUSTOM END
}