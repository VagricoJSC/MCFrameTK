package mcframe.serverMSBE.MSBEL1000;

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
import mcframe.serverMSBE.MSBEL1000.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5200.MSBEL_XfrSchdService;
import mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR;
import mcframe.serverMSBE.MSBEL5200.XfrSchdMod_DtlR;
import mcframe.serverMSBE.MSBEL5200.XfrSchd_DtlR;
import mcframe.serverMSBF.MSBFL5210.*;
import static mcframe.serverMSBE.MSBEL1000.Query.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil;
import mcframe.serverMSUC.MSUCL0110.MSUCL_StrLnUtil;
import mcframe.serverMSUC.MSUCL0110.StrLnUtil_Srch01_CndR;

import java.util.HashSet;
import java.util.ArrayList;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_XfrSchdReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_XfrSchdReg_MC extends MSBEL_XfrSchdReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 移動・移送予定ＮＯを検索する。<br>
	 */
	public class Srch01 extends MSBEL_XfrSchdReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			MCQueryPlan sql = MSBEL1000_MST_XFR_SCHD_S01();
			searchForDL(sql, up0(), down0());
			down0().setValue(Srch01_RsltR.$prov_xrate_cd, getCo().prov_xrate_cd());
		}

		protected void editUp() {
			if (up0().rqst_mod_t_flg() && !up0().rqst_mod_f_flg()) {
				up0().addStringColumn("rqst_mod_flg_str", toTrueStr(true));
			}
			else if (!up0().rqst_mod_t_flg() && up0().rqst_mod_f_flg()) {
				up0().addStringColumn("rqst_mod_flg_str", toFalseStr(false));
			}
			
			if (up0().rqst_can_t_flg() && !up0().rqst_can_f_flg()) {
				up0().addStringColumn("rqst_can_flg_str", toTrueStr(true));
			}
			else if (!up0().rqst_can_t_flg() && up0().rqst_can_f_flg()) {
				up0().addStringColumn("rqst_can_flg_str", toFalseStr(false));
			}
			up0().addStringColumn("inst_exc_flg_str", toTrueStr(!up0().inst_inc_flg()));
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			for (Srch01_RsltR r : down0()) {
				// 有効成分関連項目
				if (r.cont_fctr_flg()) {
					// 実際有効成分の算出
					MCNumber actContQty = convToContFctrUnit(r.base_unit_qty(), r.act_cont_fctr(), 
							r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
					r.act_cont_qty(actContQty);
					
					// 標準有効成分の算出
					MCNumber stdContQty = convToContFctrUnit(r.base_unit_qty(), r.std_cont_fctr(), 
							r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
					r.std_cont_qty(stdContQty);
				}
				
				// 支給関連項目
				if (!MAC_PROV_BASIS_TYP.isGI(r.prov_basis_typ())
						&& !MAC_PROV_BASIS_TYP.isGR(r.prov_basis_typ())
						&& !MAC_PROV_BASIS_TYP.isGI(r.ret_prov_basis_typ())
						&& !MAC_PROV_BASIS_TYP.isGR(r.ret_prov_basis_typ())) {
					r.base_cur_cd(null);
					r.base_cur_nm(null);
					r.base_cur_amt_dec_place(null);
					r.ptax_cur_cd(null);
					r.ptax_cur_nm(null);
					r.ptax_cur_amt_dec_place(null);
				}
				else {
					r.trd_cur_inc_tax_amt(MCNumber.sum(r.trd_cur_amt(), r.trd_cur_tax_amt()));
					r.base_cur_amt(convToBaseCur(r.trd_cur_amt(), r.xrate(), r.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
					r.base_cur_tax_amt(convToBaseCur(r.trd_cur_tax_amt(), r.xrate(), r.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
					r.ptax_amt(convToBaseCur(r.trd_cur_amt(), r.ptax_xrate(), r.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
					r.ret_trd_cur_inc_tax_amt(MCNumber.sum(r.ret_trd_cur_amt(), r.ret_trd_cur_tax_amt()));
					r.ret_base_cur_amt(convToBaseCur(r.ret_trd_cur_amt(), r.ret_xrate(), r.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
					r.ret_base_cur_tax_amt(convToBaseCur(r.ret_trd_cur_tax_amt(), r.ret_xrate(), r.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
					r.ret_ptax_amt(convToBaseCur(r.ret_trd_cur_amt(), r.ret_ptax_xrate(), r.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				}
			}
			
			setAllocInfo();
		}
		
		protected void setAllocInfo() {
			if (up0().inst_inc_flg()) {
				return ;
			}
			// 引当ＦＬＧの初期値設定
			
			MCList<Srch01_RsltR> xfrL = MCList.create(Srch01_RsltR.class);
			MCList<Srch01_RsltR> shipL = MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : down0()) {
				if (isSame(r.gi_lg_grp_cd(), r.gr_lg_grp_cd())) {
					xfrL.add(r);
				}
				else if (!isNull(r.ship_pr_no())){
					shipL.add(r);
				}
			}
			
			if (!isNull(xfrL)) {
				MCList<MST_XFR_SCHD_R> xfrbindL = MCList.create(MST_XFR_SCHD_R.class);
				for (Srch01_RsltR r : xfrL) {
					MST_XFR_SCHD_R tmpR = MST_XFR_SCHD_R.create();
					tmpR.xfr_schd_no(r.xfr_schd_no());
					xfrbindL.add(tmpR);
				}
				MCQueryApiBuilder xfrbindL_bldr = MCQueryApiBuilder.create(MST_XFR_SCHD_R.create("T"));
				dbWkDelete("MSBEL1000_MSW_XFR_SCHD_D01", xfrbindL_bldr.getBaseDbc());
				dbWkInsert("MSBEL1000_MSW_XFR_SCHD_I01", xfrbindL, xfrbindL_bldr.getBaseDbc());
				
				MCList<MST_XFR_SCHD_R> dbcL = MCList.create(MST_XFR_SCHD_R.class);
				executeQuery(dbcL, MSBEL1000_MST_XFR_ALLOC_STS_S01());
				
				MCIndexKey idxkey = dbcL.createIndex(MST_XFR_SCHD_R.$xfr_schd_no);
				for (Srch01_RsltR r : xfrL) {
					MST_XFR_SCHD_R dbcR = dbcL.getFirst(idxkey, r.xfr_schd_no());
					if (dbcR != null) {
						r.alloc_flg(true);
						if(isNullOr(r.lot_no(), r.sublot_no())) {
							r.lot_none_flg(true);
						}
					}
				}
			}
			
			if (!isNull(shipL)) {
				MCList<MST_SHIP_PR_R> shipbindL = MCList.create(MST_SHIP_PR_R.class);
				for (Srch01_RsltR r : shipL) {
					MST_SHIP_PR_R tmpR = MST_SHIP_PR_R.create();
					tmpR.ship_pr_no(r.ship_pr_no());
					shipbindL.add(tmpR);
				}
				MCQueryApiBuilder shipbindL_bldr = MCQueryApiBuilder.create(MST_SHIP_PR_R.create("T"));
				dbWkDelete("MSBEL1000_MSW_SHIP_PR_D01", shipbindL_bldr.getBaseDbc());
				dbWkInsert("MSBEL1000_MSW_SHIP_PR_I01", shipbindL, shipbindL_bldr.getBaseDbc());
				
				MCList<MST_SHIP_SCHD_R> dbcL = MCList.create(MST_SHIP_SCHD_R.class);
				executeQuery(dbcL, MSBEL1000_MST_SHIP_SCHD_S01());
				
				MCIndexKey idxkey = dbcL.createIndex(MST_SHIP_SCHD_R.$ship_pr_no);
				for (Srch01_RsltR r : shipL) {
					MST_SHIP_SCHD_R dbcR = dbcL.getFirst(idxkey, r.ship_pr_no());
					if (dbcR != null) {
						r.alloc_flg(true);
						if(isNullOr(r.lot_no(), r.sublot_no())) {
							r.lot_none_flg(true);
						}
					}
				}
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 移動・移送予定を更新するためにチェックを行う。<br>
	 */
	public class Chk01 extends MSBEL_XfrSchdReg_MC_A.Chk01 {
		
		protected MCList<XfrSchdChk04_DtlR> _allocedL;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			MCList<Chk01_RsltR> notErrL = up0().subList(r->!r.err_flg());
			callXfrSchdUpdChkSrv(notErrL);
			setErrToRtnStsTyp();
			setDown();
		}

		protected MCList<XfrSchdChk04_DtlR> getAllocedL() {
			if (isNull(_allocedL)) {
				_allocedL = MCList.create(XfrSchdChk04_DtlR.class);
			}
			return _allocedL;
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			//　移動・移送予定のロック、更新カウンタチェック、ＤＡＣチェック
			msgL.addAll(chkXfrSchd());

			return msgL;
		}

		/**
		 * 移動・移送予定のロック、更新カウンタチェック、ＤＡＣチェック
		 */
		protected MCMessageList chkXfrSchd() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if (isNull(notErrL)) {
				return msgL;
			}
			
			MCList<Chk01_RsltR> bindL = notErrL.subList(r->!isNull(r.xfr_schd_no()));
			bindL.sort(Chk01_RsltR.$xfr_schd_no);
			MCList<MST_XFR_SCHD_R> selectL = MCList.create(MST_XFR_SCHD_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MST_XFR_SCHD_R.create("T"));
			selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());
			
			if (up1().file_imp_flg()) {
				dbSelectKeyForUpdate("MSBEL1000_MST_XFR_SCHD_S01", selectL, selectL_bldr, bindL);
			}
			else {
				dbSelectKeyForUpdateNoWait("MSBEL1000_MST_XFR_SCHD_S02", selectL, selectL_bldr, bindL);
			}

			itmLgGrpLocCache(selectL);
			locCache(selectL);
			MCIndexKey idxkey = selectL.createIndex(MST_XFR_SCHD_R.$xfr_schd_no);
			for (Chk01_RsltR r : notErrL) {
				if (!isNull(r.xfr_schd_no())) {
					MST_XFR_SCHD_R selectR = selectL.getFirst(idxkey, r.xfr_schd_no());
					if (up1().file_imp_flg()) {
						if (isNull(selectR)) {
							msgL.addAll(getRecordNotFoundMsg("MS", "MST_XFR_SCHD"
									, new String[]{MST_XFR_SCHD_R.$xfr_schd_no}
									, new Comparable[]{r.xfr_schd_no()}, r));
						}
						else {
							r.upd_cntr(selectR.upd_cntr());
						}
					}
					else {
						msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
					}
					if (!isNull(selectR)) {
						selectR.setAttributes(r);
						MCMessageList msgDacGiL = checkWritableLgGrpCdDac(selectR, MST_XFR_SCHD_R.$gi_lg_grp_cd);
						MCMessageList msgDacGrL = checkWritableLocCdDac(selectR, MST_XFR_SCHD_R.$gr_loc_cd);
						if (!isNull(selectR.gi_loc_cd())) {
							selectR.addStringColumn("chk_gi_loc_cd", selectR.gi_loc_cd());
						}
						else {
							MAM_ITM_LG_GRP_R itmLgGrpR = getItmLgGrpLocCache(selectR.itm_cd(), selectR.itm_sub1(), selectR.itm_sub2(), selectR.itm_sub3(), selectR.gi_lg_grp_cd());
							MAM_LOC_R locR = getLocCache(selectR.gi_lg_grp_cd());
							
							selectR.addStringColumn("chk_gi_loc_cd", !itmLgGrpR.isEmpty() ? itmLgGrpR.lg_def_loc_cd() : !isNull(locR) ? locR.loc_cd() : null);
						}
						MCMessageList msgDacGiLocL = checkWritableLocCdDac(selectR, "chk_gi_loc_cd");
						if (!isSame(selectR.gi_wg_cd(), selectR.gr_wg_cd())
								&& MSC_XFR_SRC_TYP.isMNL(selectR.xfr_src_typ())) {
							if (!msgDacGiL.isEmpty() && !msgDacGiLocL.isEmpty()) {
								msgL.addAll(msgDacGiL);
								msgL.addAll(msgDacGiLocL);
							}
						}
						else {
							if (!msgDacGiL.isEmpty() && !msgDacGrL.isEmpty() && !msgDacGiLocL.isEmpty()) {
							msgL.addAll(msgDacGiL);
							msgL.addAll(msgDacGrL);
							msgL.addAll(msgDacGiLocL);
						}
						}
						
						// 更新対象外項目の補完
						r.trd_cd(selectR.trd_cd());
						r.trd_ptn_typ(selectR.trd_ptn_typ());
						r.itm_cd(selectR.itm_cd());
						r.itm_sub1(selectR.itm_sub1());
						r.itm_sub2(selectR.itm_sub2());
						r.itm_sub3(selectR.itm_sub3());
						r.sno1(selectR.sno1());
						r.sno1_null_flg(selectR.sno1_null_flg());
						r.sno2(selectR.sno2());
						r.sno2_null_flg(selectR.sno2_null_flg());
						r.sno3(selectR.sno3());
						r.sno3_null_flg(selectR.sno3_null_flg());
						r.sno4(selectR.sno4());
						r.sno4_null_flg(selectR.sno4_null_flg());
						r.gr_loc_cd(selectR.gr_loc_cd());
						r.cont_qty(selectR.cont_qty());
						r.xfr_src_typ(selectR.xfr_src_typ());
						r.xfr_src_no(selectR.xfr_src_no());
						r.itm_ord_no(selectR.itm_ord_no());
						r.mfg_inst_no(selectR.mfg_inst_no());
						r.oper_inst_no(selectR.oper_inst_no());
						r.slo_no(selectR.slo_no());
						r.slo_d_no(selectR.slo_d_no());
						r.not_lot_mix_flg(selectR.not_lot_mix_flg());
						r.not_sublot_mix_flg(selectR.not_sublot_mix_flg());
						r.vld_dt_fr(selectR.vld_dt_fr());
						r.vld_dt_to(selectR.vld_dt_to());
						r.io_schd_pr_no(selectR.io_schd_pr_no());
						r.rqst_cnt_rmrks(selectR.rqst_cnt_rmrks());
						if (MSC_XFR_SRC_TYP.isWG_RQST(r.xfr_src_typ()) || MSC_XFR_SRC_TYP.isSLO(r.xfr_src_typ())) {
							if (!isSame(r.trd_unit_cd(), selectR.trd_unit_cd())) {
								r.trd_unit_cd(selectR.trd_unit_cd());
								r.trd_unit_qty(selectR.trd_unit_qty());
							}
						}
					}
				}
			}
			
			return msgL;
		}
		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			ListLogicBind trdBind = getListLogicBind(up0(), Chk01_RsltR.$trd_cd);
			trdBind.putBind(mcframe.commonMAUA.MAUAC0010.MAUAC_List.TrdCols.$i_func_id, (Comparable<?>)"MSBEP1000");
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			for (Chk01_RsltR r : up0()) {
				if (isNullOr(r.gi_lg_grp_cd(), r.gr_lg_grp_cd())) {
					r.err_flg(true);
				}
			}
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if (isNull(notErrL)) {
				return msgL;
			}
			
			itmLgGrpLocCache(notErrL);
			locCache(notErrL);
			for (Chk01_RsltR r : notErrL) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					r.xfr_src_typ(MSC_XFR_SRC_TYP.MNL.value());
				}
				MCMessageList msgDacGiL = checkWritableLgGrpCdDac(r, Chk01_RsltR.$gi_lg_grp_cd);
				MCMessageList msgDacGrL = checkWritableLocCdDac(r, Chk01_RsltR.$gr_loc_cd);
				MCMessageList msgDacGiLocL = new MCMessageList();
				if (!isNull(r.gi_loc_cd())) {
					msgDacGiLocL.addAll(checkWritableLocCdDac(r, Chk01_RsltR.$gi_loc_cd));
				}
				else {
					MAM_ITM_LG_GRP_R itmLgGrpR = getItmLgGrpLocCache(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.gi_lg_grp_cd());
					MAM_LOC_R locR = getLocCache(r.gi_lg_grp_cd());
					
					r.addStringColumn("chk_gi_loc_cd", !itmLgGrpR.isEmpty() ? itmLgGrpR.lg_def_loc_cd() : !isNull(locR) ? locR.loc_cd() : null);
					// 出庫ＷＧＣＤの補完
					// 出庫場所ＣＤが指定されていない場合、出庫物流Ｇから物流標準場所を求めてＷＧＣＤを取得する。
					r.gi_wg_cd(!itmLgGrpR.isEmpty() ? itmLgGrpR.getStringNE("wg_cd") : !isNull(locR) ? locR.wg_cd() : null);
					msgDacGiLocL.addAll(checkWritableLocCdDac(r, "chk_gi_loc_cd"));
				}
				if (!isSame(r.gi_wg_cd(), r.gr_wg_cd())
						&& MSC_XFR_SRC_TYP.isMNL(r.xfr_src_typ())) {
					if (!msgDacGiL.isEmpty() && !msgDacGiLocL.isEmpty()) {
						msgL.addAll(msgDacGiL);
						msgL.addAll(msgDacGiLocL);
					}
				}
				else {
					if (!msgDacGiL.isEmpty() && !msgDacGrL.isEmpty() && !msgDacGiLocL.isEmpty()) {
						msgL.addAll(msgDacGiL);
						msgL.addAll(msgDacGrL);
						msgL.addAll(msgDacGiLocL);
					}
				}
				
				// 画面の補完ロジックと仕様を合わせる必要がある
				// 画面のリストロジック、ＮＣ／ＬＣイベント、セルコンフィグの実装を元に、入力順序に従って、補完やチェックを行う。
				// ただし、チェックエラーとするか、上書き補完するか、どちらとするかが画面と異なる
				msgL.addAll(MSUCL_StkUtil.checkStkUtilTrdPtnTypAndGiGrLoc(r,
						Chk01_RsltR.$trd_cd, Chk01_RsltR.$trd_ptn_typ,
						Chk01_RsltR.$gi_loc_cd, Chk01_RsltR.$gi_sppl_cd,
						Chk01_RsltR.$gr_loc_cd, Chk01_RsltR.$gr_sppl_cd));
				
				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
					r.lot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					r.lot_no(nullValToNull(r.lot_no()));
				}
				if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
					r.sublot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					r.sublot_no(nullValToNull(r.sublot_no()));
				}
				if (!r.ver_flg()) {
					r.ver_no(null);
				}
				else {
					msgL.addAll(check(r, Chk01_RsltR.$ver_no, new FXUCL_RequiredValidater()));
				}
				
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ())) {
					r.sno1(MAC_STR.NULL_VAL.value());
					r.sno1_null_flg(false);
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno1_mng_typ())) {
					r.sno1(nvl(r.sno1(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.sno1(nullValToNull(r.sno1()));
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())) {
					r.sno2(MAC_STR.NULL_VAL.value());
					r.sno2_null_flg(false);
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno2_mng_typ())) {
					r.sno2(nvl(r.sno2(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.sno2(nullValToNull(r.sno2()));
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())) {
					r.sno3(MAC_STR.NULL_VAL.value());
					r.sno3_null_flg(false);
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno3_mng_typ())) {
					r.sno3(nvl(r.sno3(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.sno3(nullValToNull(r.sno3()));
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())) {
					r.sno4(MAC_STR.NULL_VAL.value());
					r.sno4_null_flg(false);
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno4_mng_typ())) {
					r.sno4(nvl(r.sno4(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.sno4(nullValToNull(r.sno4()));
				}
				msgL.addAll(check(r, Chk01_RsltR.$sno1, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, Chk01_RsltR.$sno2, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, Chk01_RsltR.$sno3, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, Chk01_RsltR.$sno4, new FXUCL_RequiredValidater()));
				
				msgL.addAll(checkDecPlace(r, r.trd_unit_dec_place().intValue(), Chk01_RsltR.$trd_unit_qty));
				msgL.addAll(checkDecPlace(r, Chk01_RsltR.$trd_cur_upri_dec_place, Chk01_RsltR.$trd_cur_upri));
				msgL.addAll(checkDecPlace(r, Chk01_RsltR.$ret_trd_cur_upri_dec_place, Chk01_RsltR.$ret_trd_cur_upri));
				
				r.base_unit_qty(convToBaseUnit(r.trd_unit_qty(), r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ()));
				if(!r.alloc_flg()) {
					r.lot_none_flg(false);
					if (!isNull(r.sublot_no()) && isNull(r.lot_no())) {
						r.sublot_no(MAC_STR.NULL_VAL.value());
					}
				}
				if (r.cont_fctr_flg()) {
					// 実際有効成分の算出
					MCNumber actContQty = convToContFctrUnit(r.base_unit_qty(), r.act_cont_fctr(), 
							r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
					r.act_cont_qty(actContQty);
					
					// 標準有効成分の算出
					MCNumber stdContQty = convToContFctrUnit(r.base_unit_qty(), r.std_cont_fctr(), 
							r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
					r.std_cont_qty(stdContQty);
				}
				
				if (isNull(r.quality_typ()) || MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
					r.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				}
				msgL.addAll(MSUCL_StkUtil.checkStkUtilQualityTyp(r, Chk01_RsltR.$trd_cd, Chk01_RsltR.$trd_ptn_typ, Chk01_RsltR.$quality_typ));
				if (isNull(r.gd_cd())) {
					r.gd_cd(getDefaultFeedStkGd().gd_cd());
					r.gd_nm(getDefaultFeedStkGd().gd_nm());
				}
				if (!isNull(r.ship_inst_typ()) && !MAC_SHIP_INST_TYP.isNON(r.ship_inst_typ())) {
					r.ship_inst_typ(MAC_SHIP_INST_TYP.PICK.value());
				}
				if (isNull(r.stk_id_typ())) {
					r.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				}
				if(MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
					r.stk_bp_cd(MAC_STR.NULL_VAL.value());
					r.stk_bp_nm(null);
				}
				else if(MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
					r.stk_bp_cd(r.gi_sppl_cd());
					r.stk_bp_nm(r.gi_sppl_nm());
				}
				else {
					msgL.addAll(check(r, Chk01_RsltR.$stk_bp_cd, new FXUCL_RequiredValidater()));
				}
				
				if (isNull(r.gi_sppl_cd())) {
					r.gi_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
					r.gi_stk_arrv_bp_nm(null);
				}
				else {
					if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
						if (isNullOrNullVal(r.gi_stk_arrv_bp_cd())){
							r.gi_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
						}
						else if (!isSame(r.gi_stk_arrv_bp_cd(), r.gi_sppl_cd())) {
							r.gi_stk_arrv_bp_cd(r.gi_sppl_cd());
						}
					}
					else {
						r.gi_stk_arrv_bp_cd(r.gi_sppl_cd());
						r.gi_stk_arrv_bp_nm(r.gi_sppl_nm());
					}
				}
				
				if (isNull(r.rcpt_dt())) {
					r.rqst_usr_cd(null);
					r.rqst_usr_nm(null);
					r.rqst_dpt_cd(null);
					r.rqst_dpt_nm(null);
					r.bd_dpt_cd(null);
					r.bd_dpt_nm(null);
					r.rcpt_dt(getToday());
				}
				
				if (r.acxfr_gi_flg()) {
					if (!MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())) {
						msgL.add(new MCMessage(r, Chk01_RsltR.$rsn_cd, MSBEL0304, r.trd_cd(), r.rsn_cd(), toDispGUIIndex(r)));
					}
					else {
						msgL.addAll(check(r, Chk01_RsltR.$bd_dpt_cd, new FXUCL_RequiredValidater()));
					}
				}
				else {
					r.bd_dpt_cd(null);
					r.bd_dpt_nm(null);
				}

				// 移動
				if (isSame(r.gi_lg_grp_cd(), r.gr_lg_grp_cd())) {
					if (!isNullOr(r. gi_rqst_tm(), r. gr_rqst_tm())) {
						r. gi_rqst_tm(null);
					}
					r.ship_block_flg(false);
					r.ship_term_cd(null);
					r.ship_term_nm(null);
					r.ship_to_id_typ(null);
					r.ship_to_id_cd(null);
					r.ship_to_id_nm(null);
					r.ship_to_zip_cd(null);
					r.ship_to_addr1(null);
					r.ship_to_addr2(null);
					r.ship_to_addr3(null);
					r.ship_to_addr4(null);
					r.ship_to_cntct_dpt(null);
					r.ship_to_cntct_psn(null);
					r.ship_to_fax(null);
					r.ship_to_tel(null);
					r.ship_to_sundry_flg(false);
					r.via_dlv_typ(null);
				}
				// 移送
				else {
					// インボイス取引に依存する項目の補完は後で行う
				}
				
				// 支給関連項目
				if (isProv(r) || isProvDD(r)) {
				}
				else {
					r.prov_typ(null);
					r.prov_basis_typ(null);
				}
				if (MAC_PROV_TYP.isFFR_PROV(r.prov_typ())) {
					r.prov_basis_typ(null);
				}
				else if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
					if (isNull(r.prov_basis_typ())) {
						r.prov_basis_typ(r.gr_prov_basis_typ());
					}
					if (MAC_PROV_RCV_TYP.isNOT_ARR(r.gr_prov_rcv_typ())) {
						if (!MAC_PROV_BASIS_TYP.isGI(r.prov_basis_typ())) {
							r.prov_basis_typ(MAC_PROV_BASIS_TYP.INPT.value());
						}
					}
					else {
						if (!MAC_PROV_BASIS_TYP.isGR(r.prov_basis_typ())) {
							r.prov_basis_typ(MAC_PROV_BASIS_TYP.INPT.value());
						}
					}
				}
				else {
					r.prov_typ(null);
					r.prov_basis_typ(null);
				}
				
				if(isRetProv(r) || isProvDD(r)) {
					if(MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
						r.ret_prov_typ(MAC_PROV_TYP.ONR_PROV.value());
					}
					else if(MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ()) && isNullOrNullVal(r.gi_stk_arrv_bp_cd())) {
						r.ret_prov_typ(MAC_PROV_TYP.ONR_PROV.value());
					}
					else {
						r.ret_prov_typ(MAC_PROV_TYP.FFR_PROV.value());
					}
				}
				else {
					r.ret_prov_typ(null);
					r.ret_prov_basis_typ(null);
				}
				if (MAC_PROV_TYP.isFFR_PROV(r.ret_prov_typ())) {
					r.ret_prov_basis_typ(null);
				}
				else if(MAC_PROV_TYP.isONR_PROV(r.ret_prov_typ())) {
					if(MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ()) && isNullOrNullVal(r.gi_stk_arrv_bp_cd())) {
						r.ret_prov_basis_typ(MAC_PROV_BASIS_TYP.INPT.value());
					}
					else {
						r.ret_prov_basis_typ(MAC_PROV_BASIS_TYP.GI.value());
					}
				}
				else {
					r.ret_prov_typ(null);
					r.ret_prov_basis_typ(null);
				}
				if (MAC_PROV_BASIS_TYP.isGI(r.prov_basis_typ())
						|| MAC_PROV_BASIS_TYP.isGR(r.prov_basis_typ())
						|| MAC_PROV_BASIS_TYP.isGI(r.ret_prov_basis_typ())
						|| MAC_PROV_BASIS_TYP.isGR(r.ret_prov_basis_typ())) {
					r.base_cur_cd(getBaseCur().cur_cd());
					r.base_cur_nm(getBaseCur().cur_nm());
					r.base_cur_amt_dec_place(getBaseCur().amt_dec_place());
					r.ptax_cur_cd(getPtaxCur().cur_cd());
					r.ptax_cur_nm(getPtaxCur().cur_nm());
					r.ptax_cur_amt_dec_place(getPtaxCur().amt_dec_place());
				}
				else {
					r.base_cur_cd(null);
					r.base_cur_nm(null);
					r.base_cur_amt_dec_place(null);
					r.ptax_cur_cd(null);
					r.ptax_cur_nm(null);
					r.ptax_cur_amt_dec_place(null);
				}
				if (MAC_PROV_BASIS_TYP.isGI(r.prov_basis_typ())
						|| MAC_PROV_BASIS_TYP.isGR(r.prov_basis_typ())) {
					// 有償支給の場合
					msgL.addAll(MSUCL_StkUtil.checkStkUtilProvTyp(r, Chk01_RsltR.$itm_cd,
							Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2,
							Chk01_RsltR.$itm_sub3, Chk01_RsltR.$gr_sppl_cd,
							Chk01_RsltR.$gr_onr_prsppl_flg, Chk01_RsltR.$asset_mng_typ,
							Chk01_RsltR.$prov_typ));
					if (!r.prov_upri_cng_flg() && !r.gr_prov_upri_cng_flg()) {
						r.trd_cur_upri(null); //　マスタの値で補完
					}
				}
				if (MAC_PROV_BASIS_TYP.isGI(r.ret_prov_basis_typ())
						|| MAC_PROV_BASIS_TYP.isGR(r.ret_prov_basis_typ())) {
					// 有償支給の場合
					msgL.addAll(MSUCL_StkUtil.checkStkUtilProvTyp(r, Chk01_RsltR.$itm_cd,
							Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2,
							Chk01_RsltR.$itm_sub3, Chk01_RsltR.$gi_sppl_cd,
							Chk01_RsltR.$gi_onr_prsppl_flg, Chk01_RsltR.$asset_mng_typ,
							Chk01_RsltR.$ret_prov_typ));
					if (!r.prov_upri_cng_flg() && !r.gi_prov_upri_cng_flg()) {
						r.ret_trd_cur_upri(null); //　マスタの値で補完
					}
				}
				else {
					r.ret_trd_cur_cd(null);
					r.ret_trd_cur_nm(null);
					r.ret_trd_cur_amt_dec_place(null);
					r.ret_trd_cur_upri_dec_place(null);
					r.ret_trd_cur_upri(null);
					r.ret_trd_cur_amt(null);
					r.ret_tax_fix_flg(false);
					r.ret_tax_cd(null);
					r.ret_tax_nm(null);
					r.ret_tax_typ(null);
					r.ret_tax_rate(null);
					r.ret_trd_cur_tax_amt(null);
					r.ret_xrate_inpt_flg(false);
					r.ret_xrate(null);
					r.ret_ptax_xrate_inpt_flg(false);
					r.ret_ptax_xrate(null);
					r.ret_ptax_amt(null);
					r.ret_wtax_rate(null);
					r.ret_wtax_amt(null);
				}

			}
			
			MCList<Chk01_RsltR> itmL = notErrL.subList(r->!isNull(r.lot_no()) && isNull(r.sublot_no()));
			setSublotNo(itmL);
			// インボイス取引に依存する項目
			MCList<Chk01_RsltR> shipL = notErrL.subList(r->!isSame(r.gi_lg_grp_cd(), r.gr_lg_grp_cd()));
			setShipTermCd(shipL);
			setIvTrdFlg(shipL);
			setViaDlvTyp(shipL);
			for (Chk01_RsltR r : shipL) {
				if (r.iv_trd_flg()) {
					r.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.TDLV.value());
					msgL.addAll(check(r, Chk01_RsltR.$ship_to_id_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk01_RsltR.$via_dlv_typ, new FXUCL_RequiredValidater()));
				}
				else {
					r.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.LOC.value());
					r.ship_to_id_cd(r.gr_loc_cd());
					r.ship_to_id_nm(r.gr_loc_nm());
					r.ship_to_cntct_dpt(null);
					r.ship_to_cntct_psn(null);
					r.via_dlv_typ(null);
				}
			}
			
			for (Chk01_RsltR r : notErrL) {
				if (r.err_flg()) {
					continue;
				}
				msgL.addAll(MSUCL_StkUtil.checkStkUtilStkIdTyp(r,
						Chk01_RsltR.$gi_loc_cd, Chk01_RsltR.$gi_sppl_cd,
						Chk01_RsltR.$gr_loc_cd, Chk01_RsltR.$gr_sppl_cd,
						Chk01_RsltR.$iv_trd_flg,Chk01_RsltR.$stk_id_typ,
						false, false));
			}
			
			// ロットの存在チェック
			chkLot(notErrL);
			
			return msgL;
		}
		
		protected void setSublotNo(MCList<Chk01_RsltR> itmL) {
			if (isNull(itmL)) {
				return ;
			}
			
			MCList<MSVT_LOT_LIST_R> lotListL = MCList.create(MSVT_LOT_LIST_R.class);
			MCList<Chk01_RsltR> tgtL = itmL.groupBy(Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2,
					Chk01_RsltR.$itm_sub3, Chk01_RsltR.$lot_no);
			
			MSVT_LOT_LIST_R lotListL_t = MSVT_LOT_LIST_R.create("T");
			MCQueryApiBuilder lotListL_bldr = MCQueryApiBuilder.create(lotListL_t);
			lotListL_bldr.setSelect(lotListL_t.itm_cd);
			lotListL_bldr.addSelect(lotListL_t.itm_sub1);
			lotListL_bldr.addSelect(lotListL_t.itm_sub2);
			lotListL_bldr.addSelect(lotListL_t.itm_sub3);
			lotListL_bldr.addSelect(lotListL_t.lot_no);
			lotListL_bldr.addSelect(lotListL_t.sublot_no);
			lotListL_bldr.setWhere(lotListL_t.itm_cd.eq(bind("itm_cd")));
			lotListL_bldr.addWhereWithAnd(lotListL_t.itm_sub1.eq(bind("itm_sub1")));
			lotListL_bldr.addWhereWithAnd(lotListL_t.itm_sub2.eq(bind("itm_sub2")));
			lotListL_bldr.addWhereWithAnd(lotListL_t.itm_sub3.eq(bind("itm_sub3")));
			lotListL_bldr.addWhereWithAnd(lotListL_t.lot_no.eq(bind("lot_no")));
			dbSelect("MSBEL1000_MSVT_LOT_LIST_S01", lotListL, lotListL_bldr, tgtL);
			
			MCIndexKey idxKey = lotListL.createIndex(MSVT_LOT_LIST_R.$itm_cd, MSVT_LOT_LIST_R.$itm_sub1,MSVT_LOT_LIST_R.$itm_sub2,
					MSVT_LOT_LIST_R.$itm_sub3, MSVT_LOT_LIST_R.$lot_no);
			
			for (Chk01_RsltR r : itmL) {
				MSVT_LOT_LIST_R dbcR = lotListL.getFirst(idxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lot_no());
				if (!isNull(dbcR)) {
					r.sublot_no(dbcR.sublot_no());
				}
			}
		}
		protected void setShipTermCd(MCList<Chk01_RsltR> shipL) {
			if (isNull(shipL) || !up1().file_imp_flg() || !doComplInputFileValue("ship_term_cd")) {
				return ;
			}
			
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.itm_cd);
			dbcL_bldr.addSelect(t.ship_term_cd);
			FXUCL_MCDbcCache<MAM_ITM_R> cache = new FXUCL_MCDbcCache<>(dbcL_bldr, shipL,
					MAM_ITM_R.$itm_cd,MAM_ITM_R.$itm_sub1,MAM_ITM_R.$itm_sub2,MAM_ITM_R.$itm_sub3);
			
			for (Chk01_RsltR shipR : shipL) {
				if (isNull(shipR.ship_term_cd()) && !isSame(shipR.gi_lg_grp_cd(), shipR.gr_lg_grp_cd())) {
					MAM_ITM_R dbc = cache.get(shipR.itm_cd(), shipR.itm_sub1(), shipR.itm_sub2(), shipR.itm_sub3());
					shipR.ship_term_cd(dbc.ship_term_cd());
				}
			}
		}
		protected void setIvTrdFlg(MCList<Chk01_RsltR> shipL) {
			if (isNull(shipL)) {
				return ;
			}
			
			HashSet<ArrayList<String>> set = new HashSet<>();
			MCList<MAM_LG_CTL_R> lgCtlL = MCList.create(MAM_LG_CTL_R.class);
			
			MCList<Chk01_RsltR> tgtL = shipL.groupBy(Chk01_RsltR.$gi_lg_grp_cd, Chk01_RsltR.$gr_lg_grp_cd);
			for (Chk01_RsltR r : tgtL) {
				ArrayList<String> x = new ArrayList<>();
				x.add(r.gi_lg_grp_cd());
				x.add(r.gr_lg_grp_cd());
				x.add(MAC_STR.NULL_VAL.value());
				set.add(x);
				MAM_LG_CTL_R tmpR = MAM_LG_CTL_R.create();
				tmpR.fr_lg_grp_cd(r.gi_lg_grp_cd());
				tmpR.to_lg_grp_cd(r.gr_lg_grp_cd());
				tmpR.ship_term_cd(MAC_STR.NULL_VAL.value());
				lgCtlL.add(tmpR);
			}
			
			for (Chk01_RsltR r : shipL) {
				if (!isNull(r.ship_term_cd())) {
					ArrayList<String> x = new ArrayList<>();
					x.add(r.gi_lg_grp_cd());
					x.add(r.gr_lg_grp_cd());
					x.add(r.ship_term_cd());
					if (!set.contains(x)) {
						set.add(x);
						MAM_LG_CTL_R tmpR = MAM_LG_CTL_R.create();
						tmpR.fr_lg_grp_cd(r.gi_lg_grp_cd());
						tmpR.to_lg_grp_cd(r.gr_lg_grp_cd());
						tmpR.ship_term_cd(r.ship_term_cd());
						lgCtlL.add(tmpR);
					}
				}
			}

			MAM_LG_CTL_R lgCtlL_t = MAM_LG_CTL_R.create("T");
			MCQueryApiBuilder lgCtlL_bldr = MCQueryApiBuilder.create(lgCtlL_t);
			lgCtlL_bldr.setSelect(lgCtlL_t.fr_lg_grp_cd);
			lgCtlL_bldr.addSelect(lgCtlL_t.to_lg_grp_cd);
			lgCtlL_bldr.addSelect(lgCtlL_t.ship_term_cd);
			lgCtlL_bldr.addSelect(lgCtlL_t.iv_trd_flg);
			lgCtlL_bldr.addSelect(lgCtlL_t.def_tdlv_cd);
			lgCtlL_bldr.addSelect(lgCtlL_t.getColumn$("def_tdlv_nm"));
			lgCtlL_bldr.activeForeign(MAM_LG_CTL_R.$BP1);
			dbSelectKey("MSBEL1000_MAM_LG_CTL_S01", lgCtlL, lgCtlL_bldr, lgCtlL);
			
			MCIndexKey idxkey = lgCtlL.createIndex(MAM_LG_CTL_R.$fr_lg_grp_cd, MAM_LG_CTL_R.$to_lg_grp_cd, MAM_LG_CTL_R.$ship_term_cd);
			
			for (Chk01_RsltR r : shipL) {
				MAM_LG_CTL_R dbcR = lgCtlL.getFirst(idxkey, r.gi_lg_grp_cd(), r.gr_lg_grp_cd(), nvl(r.ship_term_cd(), MAC_STR.NULL_VAL.value()));
				if (dbcR == null && !isNull(r.ship_term_cd())) {
					dbcR = lgCtlL.getFirst(idxkey, r.gi_lg_grp_cd(), r.gr_lg_grp_cd(), MAC_STR.NULL_VAL.value());
				}
				if (dbcR == null) {
					// 物流制御マスタが設定されていない
					MCMessagePool.add(new MCMessage(
							r, null, MSBEL0180,
							r.gi_lg_grp_cd(),
							r.gr_lg_grp_cd(),
							r.ship_term_cd(),
							toDispGUIIndex(r)));
					r.err_flg(true);
					continue;
				}
				r.iv_trd_flg(!MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ()) && dbcR.iv_trd_flg());
				if (r.iv_trd_flg()) {
					r.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.TDLV.value());
					if (isNull(r.ship_to_id_cd())) {
						r.ship_to_id_cd(dbcR.def_tdlv_cd());
					}
					if (isNull(r.ship_to_id_nm())) {
						r.ship_to_id_nm(dbcR.getStringNE("bp_nm"));
					}
				}
			}
			
		}
		protected void setViaDlvTyp(MCList<Chk01_RsltR> shipL) {
			if (isNull(shipL)) {
				return ;
			}
			MCList<MSVM_SHIP_TO_ID_R> ListL = MCList.create(MSVM_SHIP_TO_ID_R.class);
			MCList<Chk01_RsltR> tgtL = shipL.groupBy(Chk01_RsltR.$ship_to_id_cd,Chk01_RsltR.$ship_to_id_typ);
			MSVM_SHIP_TO_ID_R ListL_t = MSVM_SHIP_TO_ID_R.create("T");
			MCQueryApiBuilder ListL_bldr = MCQueryApiBuilder.create(ListL_t);
			ListL_bldr.setSelect(ListL_t.ship_to_id_cd);
			ListL_bldr.addSelect(ListL_t.ship_to_id_typ);
			ListL_bldr.addSelect(ListL_t.via_dlv_typ);
			ListL_bldr.setWhere(ListL_t.ship_to_id_cd.eq(bind("ship_to_id_cd")));
			ListL_bldr.addConstWhereWithAnd(ListL_t.ship_to_id_typ.eq(value(MSC_SHIP_TO_ID_TYP.TDLV.value())));
			dbSelect("MSBEL1000_MSVM_SHIP_TO_ID_S01", ListL, ListL_bldr, tgtL);
			MCIndexKey idxkey = ListL.createIndex(MSVM_SHIP_TO_ID_R.$ship_to_id_cd,MSVM_SHIP_TO_ID_R.$ship_to_id_typ);
			for (Chk01_RsltR r : shipL) {
				if (isNull(r.via_dlv_typ()) && r.iv_trd_flg()) {
					MSVM_SHIP_TO_ID_R dbcR = ListL.getFirst(idxkey, r.ship_to_id_cd(),r.ship_to_id_typ());
					if (!isNull(dbcR)) {
						r.via_dlv_typ(dbcR.via_dlv_typ());
					}
				}
			}
			
		}

		/**
		 * ロット情報サービスのロット存在チェックを行う
		 */
		protected void chkLot(MCList<Chk01_RsltR> notErrL) {
			MSBFL_LotService.Lot_Chk03 lotChk03 = MSBFL_LotService.crtLot_Chk03();

			for(Chk01_RsltR r : notErrL) {
				if(!isNullOrNullVal(r.lot_no())) {
					copy(lotChk03.up0().add(), r, createMap_Lot_Chk03_CndR_Chk01_RsltR());
				}
			}
			if(!lotChk03.up0().isEmpty()) {
				lotChk03.exec();
				copyErrFlg(notErrL, lotChk03.down0());
			}
		}
		protected Map_Lot_Chk03_CndR_Chk01_RsltR<Lot_Chk03_CndR,Chk01_RsltR> createMap_Lot_Chk03_CndR_Chk01_RsltR() {
			return new Map_Lot_Chk03_CndR_Chk01_RsltR<Lot_Chk03_CndR, Chk01_RsltR>();
		}
		public class Map_Lot_Chk03_CndR_Chk01_RsltR<D extends Lot_Chk03_CndR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk03_CndR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(Lot_Chk03_CndR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(Lot_Chk03_CndR.$lot_no, Chk01_RsltR.$lot_no);
				addColumnPathMap(Lot_Chk03_CndR.$sublot_no, Chk01_RsltR.$sublot_no);
				addColumnPathMap(Lot_Chk03_CndR.$ver_no, Chk01_RsltR.$ver_no);
			}
		}
		
		
		/**
		 * 支給かどうか
		 * 社内場所から社外場所への移動なら支給。
		 */
		protected boolean isProv(Chk01_RsltR dtlR) {
			return isNullOrNullVal(dtlR.gi_sppl_cd())
					&& !isNullOrNullVal(dtlR.gr_sppl_cd());
		}

		/**
		 * 支給返品かどうか
		 * 社外場所から社内場所への移動なら支給返品。
		 */
		protected boolean isRetProv(Chk01_RsltR r) {
			return !isNullOrNullVal(r.gi_sppl_cd())
					&& isNullOrNullVal(r.gr_sppl_cd());
		}

		/**
		 * 直送支給かどうか
		 * 社外場所から社外場所へかつ異なる発注先間での移動なら直送支給。
		 */
		protected boolean isProvDD(Chk01_RsltR r) {
			return !isNullOrNullVal(r.gi_sppl_cd())
					&& !isNullOrNullVal(r.gr_sppl_cd())
					&& !isSame(r.gi_sppl_cd(), r.gr_sppl_cd());
		}
		
		
		protected void callXfrSchdUpdChkSrv(MCList<Chk01_RsltR> notErrL) {
			if (isNull(notErrL)) {
				return ;
			}
			
			MSBEL_XfrSchdService.XfrSchd_Chk04 ope = MSBEL_XfrSchdService.crtXfrSchd_Chk04();
			addAll(ope.up0(), notErrL, createMap_XfrSchdChk04_DtlR_Chk01_RsltR());
			ope.up1().screen_flg(true);
			ope.up1().file_imp_flg(up1().file_imp_flg());
			ope.up1().alloc_check_exec_flg(!up1().file_imp_flg());
			ope.exec();

			copyErrFlg(notErrL, ope.down0());
			
			MCIndexKey idxkey = ope.down0().createIndex(XfrSchdChk04_DtlR.$peg_no);
			MCIndexKey allocidxkey = ope.down1().createIndex(XfrSchdChk04_DtlR.$peg_no);
			notErrL = notErrL.subList(r->!r.err_flg());
			_allocedL = MCList.create(XfrSchdChk04_DtlR.class);
			for (Chk01_RsltR r : notErrL) {
				XfrSchdChk04_DtlR drow = ope.down0().getFirst(idxkey, r.peg_no());
				if (drow != null) {
					// 支給関連項目
					r.prov_typ(drow.prov_typ());
					r.prov_basis_typ(drow.prov_basis_typ());
					r.trd_cur_cd(drow.trd_cur_cd());
					r.trd_cur_upri(drow.trd_cur_upri());
					r.tax_cd(drow.tax_cd());
					r.xrate(drow.xrate());
					r.trd_cur_amt(drow.trd_cur_amt());
					r.trd_cur_tax_amt(drow.trd_cur_tax_amt());
					r.ptax_xrate(drow.ptax_xrate());
					r.wtax_rate(drow.wtax_rate());
					r.wtax_amt(drow.wtax_amt());
					r.ret_trd_cur_cd(drow.ret_trd_cur_cd());
					r.ret_trd_cur_upri(drow.ret_trd_cur_upri());
					r.ret_tax_cd(drow.ret_tax_cd());
					r.ret_xrate(drow.ret_xrate());
					r.ret_trd_cur_amt(drow.ret_trd_cur_amt());
					r.ret_trd_cur_tax_amt(drow.ret_trd_cur_tax_amt());
					r.ret_ptax_xrate(drow.ret_ptax_xrate());
					r.ret_wtax_rate(drow.ret_wtax_rate());
					r.ret_wtax_amt(drow.ret_wtax_amt());
					if (MAC_PROV_BASIS_TYP.isGI(r.prov_basis_typ())
							|| MAC_PROV_BASIS_TYP.isGR(r.prov_basis_typ())
							|| MAC_PROV_BASIS_TYP.isGI(r.ret_prov_basis_typ())
							|| MAC_PROV_BASIS_TYP.isGR(r.ret_prov_basis_typ())) {
						r.base_cur_cd(getBaseCur().cur_cd());
						r.base_cur_nm(getBaseCur().cur_nm());
						r.base_cur_amt_dec_place(getBaseCur().amt_dec_place());
						r.ptax_cur_cd(getPtaxCur().cur_cd());
						r.ptax_cur_nm(getPtaxCur().cur_nm());
						r.ptax_cur_amt_dec_place(getPtaxCur().amt_dec_place());
					}
					else {
						r.base_cur_cd(null);
						r.base_cur_nm(null);
						r.base_cur_amt_dec_place(null);
						r.ptax_cur_cd(null);
						r.ptax_cur_nm(null);
						r.ptax_cur_amt_dec_place(null);
					}
					
					if (MAC_PROV_BASIS_TYP.isGI(r.prov_basis_typ())
							|| MAC_PROV_BASIS_TYP.isGR(r.prov_basis_typ())) {
						if (isSame(r.trd_cur_cd(), r.base_cur_cd()) || isNull(r.trd_cur_cd())) {
							r.xrate_inpt_flg(false);
							r.xrate(null);
						}
						
						if (isSame(r.trd_cur_cd(), r.ptax_cur_cd()) || isNull(r.trd_cur_cd()) || isNull(r.ptax_cur_cd())) {
							r.ptax_xrate_inpt_flg(false);
							r.ptax_xrate(null);
						}
					}
					else {
						r.trd_cur_cd(null);
						r.trd_cur_nm(null);
						r.trd_cur_amt_dec_place(null);
						r.trd_cur_upri_dec_place(null);
						r.trd_cur_upri(null);
						r.trd_cur_amt(null);
						r.tax_fix_flg(false);
						r.tax_cd(null);
						r.tax_nm(null);
						r.tax_typ(null);
						r.tax_rate(null);
						r.trd_cur_tax_amt(null);
						r.xrate_inpt_flg(false);
						r.xrate(null);
						r.ptax_xrate_inpt_flg(false);
						r.ptax_xrate(null);
						r.ptax_amt(null);
						r.wtax_rate(null);
						r.wtax_amt(null);
					}
					
					if (MAC_PROV_BASIS_TYP.isGI(r.ret_prov_basis_typ())
							|| MAC_PROV_BASIS_TYP.isGR(r.ret_prov_basis_typ())) {
						if (isSame(r.ret_trd_cur_cd(), r.base_cur_cd())
								|| isNull(r.ret_trd_cur_cd())) {
							r.ret_xrate_inpt_flg(false);
							r.ret_xrate(null);

						}
						if (isSame(r.ret_trd_cur_cd(), r.ptax_cur_cd())
								|| isNull(r.ret_trd_cur_cd()) || isNull(r.ptax_cur_cd())) {
							r.ret_ptax_xrate_inpt_flg(false);
							r.ret_ptax_xrate(null);
						}
					}
					
					// 算出項目
					r.trd_cur_inc_tax_amt(MCNumber.sum(r.trd_cur_amt(), r.trd_cur_tax_amt()));
					r.base_cur_amt(convToBaseCur(r.trd_cur_amt(), r.xrate(), r.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
					r.base_cur_tax_amt(convToBaseCur(r.trd_cur_tax_amt(), r.xrate(), r.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
					r.ptax_amt(convToBaseCur(r.trd_cur_tax_amt(), r.ptax_xrate(), r.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
					r.ret_trd_cur_inc_tax_amt(MCNumber.sum(r.ret_trd_cur_amt(), r.ret_trd_cur_tax_amt()));
					r.ret_base_cur_amt(convToBaseCur(r.ret_trd_cur_amt(), r.ret_xrate(), r.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
					r.ret_base_cur_tax_amt(convToBaseCur(r.ret_trd_cur_tax_amt(), r.ret_xrate(), r.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
					r.ret_ptax_amt(convToBaseCur(r.ret_trd_cur_tax_amt(), r.ret_ptax_xrate(), r.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
					
					// 移送
					if (!isSame(r.gi_lg_grp_cd(), r.gr_lg_grp_cd())) {
						r.ship_term_cd(drow.ship_term_cd());
						// 住所関連項目
						if (MSC_SHIP_TO_ID_TYP.isTDLV(r.ship_to_id_typ())) {
							r.ship_to_id_nm(drow.ship_to_id_nm());
						}
						r.ship_to_zip_cd(drow.ship_to_zip_cd());
						r.ship_to_addr1(drow.ship_to_addr1());
						r.ship_to_addr2(drow.ship_to_addr2());
						r.ship_to_addr3(drow.ship_to_addr3());
						r.ship_to_addr4(drow.ship_to_addr4());
						r.ship_to_cntct_dpt(drow.ship_to_cntct_dpt());
						r.ship_to_cntct_psn(drow.ship_to_cntct_psn());
						r.ship_to_tel(drow.ship_to_tel());
						r.ship_to_fax(drow.ship_to_fax());
						r.ship_to_sundry_flg(drow.ship_to_sundry_flg());
					}
					if (isNull(r.ship_inst_typ())) {
						r.ship_inst_typ(drow.ship_inst_typ());
					}
					
				}
				
				_allocedL.addAll(ope.down1().subList(allocidxkey, r.peg_no()));
			}
			
			setShipTermInfo(notErrL);
			// 通貨関連項目のマスタ補完
			setCurInfo(notErrL);
			// 税関連項目のマスタ補完
			setTaxInfo(notErrL);
			
		}

		protected Map_XfrSchdChk04_DtlR_Chk01_RsltR<XfrSchdChk04_DtlR,Chk01_RsltR> createMap_XfrSchdChk04_DtlR_Chk01_RsltR() {
			return new Map_XfrSchdChk04_DtlR_Chk01_RsltR<XfrSchdChk04_DtlR, Chk01_RsltR>();
		}

		public class Map_XfrSchdChk04_DtlR_Chk01_RsltR<D extends XfrSchdChk04_DtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdChk04_DtlR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$data_crud_typ, Chk01_RsltR.$data_crud_typ);
				addColumnPathMap(XfrSchdChk04_DtlR.$xfr_schd_no, Chk01_RsltR.$xfr_schd_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$xfr_src_typ, Chk01_RsltR.$xfr_src_typ);
				addColumnPathMap(XfrSchdChk04_DtlR.$xfr_src_no, Chk01_RsltR.$xfr_src_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$trd_cd, Chk01_RsltR.$trd_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$trd_ptn_typ, Chk01_RsltR.$trd_ptn_typ);
				addColumnPathMap(XfrSchdChk04_DtlR.$gi_lg_grp_cd, Chk01_RsltR.$gi_lg_grp_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$gi_loc_cd, Chk01_RsltR.$gi_loc_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$gi_str_ln_cd, Chk01_RsltR.$gi_str_ln_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$gi_stk_arrv_bp_cd, Chk01_RsltR.$gi_stk_arrv_bp_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$gr_loc_cd, Chk01_RsltR.$gr_loc_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$gr_str_ln_cd, Chk01_RsltR.$gr_str_ln_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(XfrSchdChk04_DtlR.$lot_no, Chk01_RsltR.$lot_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$sublot_no, Chk01_RsltR.$sublot_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$ver_no, Chk01_RsltR.$ver_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$sno1, Chk01_RsltR.$sno1);
				addColumnPathMap(XfrSchdChk04_DtlR.$sno1_null_flg, Chk01_RsltR.$sno1_null_flg);
				addColumnPathMap(XfrSchdChk04_DtlR.$sno2, Chk01_RsltR.$sno2);
				addColumnPathMap(XfrSchdChk04_DtlR.$sno2_null_flg, Chk01_RsltR.$sno2_null_flg);
				addColumnPathMap(XfrSchdChk04_DtlR.$sno3, Chk01_RsltR.$sno3);
				addColumnPathMap(XfrSchdChk04_DtlR.$sno3_null_flg, Chk01_RsltR.$sno3_null_flg);
				addColumnPathMap(XfrSchdChk04_DtlR.$sno4, Chk01_RsltR.$sno4);
				addColumnPathMap(XfrSchdChk04_DtlR.$sno4_null_flg, Chk01_RsltR.$sno4_null_flg);
				addColumnPathMap(XfrSchdChk04_DtlR.$quality_typ, Chk01_RsltR.$quality_typ);
				addColumnPathMap(XfrSchdChk04_DtlR.$gd_cd, Chk01_RsltR.$gd_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$stk_id_typ, Chk01_RsltR.$stk_id_typ);
				addColumnPathMap(XfrSchdChk04_DtlR.$stk_bp_cd, Chk01_RsltR.$stk_bp_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$trd_unit_cd, Chk01_RsltR.$trd_unit_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$trd_unit_qty, Chk01_RsltR.$trd_unit_qty);
				addColumnPathMap(XfrSchdChk04_DtlR.$base_unit_cd, Chk01_RsltR.$base_unit_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$base_unit_qty, Chk01_RsltR.$base_unit_qty);
				addColumnPathMap(XfrSchdChk04_DtlR.$gi_rqst_tm, Chk01_RsltR.$gi_rqst_tm);
				addColumnPathMap(XfrSchdChk04_DtlR.$gr_rqst_tm, Chk01_RsltR.$gr_rqst_tm);
				addColumnPathMap(XfrSchdChk04_DtlR.$rcpt_dt, Chk01_RsltR.$rcpt_dt);
				addColumnPathMap(XfrSchdChk04_DtlR.$ship_term_cd, Chk01_RsltR.$ship_term_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$ship_inst_typ, Chk01_RsltR.$ship_inst_typ);
				addColumnPathMap(XfrSchdChk04_DtlR.$ship_to_id_typ, Chk01_RsltR.$ship_to_id_typ);
				addColumnPathMap(XfrSchdChk04_DtlR.$ship_to_id_cd, Chk01_RsltR.$ship_to_id_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$ship_to_id_nm, Chk01_RsltR.$ship_to_id_nm);
				addColumnPathMap(XfrSchdChk04_DtlR.$ship_to_zip_cd, Chk01_RsltR.$ship_to_zip_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$ship_to_addr1, Chk01_RsltR.$ship_to_addr1);
				addColumnPathMap(XfrSchdChk04_DtlR.$ship_to_addr2, Chk01_RsltR.$ship_to_addr2);
				addColumnPathMap(XfrSchdChk04_DtlR.$ship_to_addr3, Chk01_RsltR.$ship_to_addr3);
				addColumnPathMap(XfrSchdChk04_DtlR.$ship_to_addr4, Chk01_RsltR.$ship_to_addr4);
				addColumnPathMap(XfrSchdChk04_DtlR.$ship_to_cntct_dpt, Chk01_RsltR.$ship_to_cntct_dpt);
				addColumnPathMap(XfrSchdChk04_DtlR.$ship_to_cntct_psn, Chk01_RsltR.$ship_to_cntct_psn);
				addColumnPathMap(XfrSchdChk04_DtlR.$ship_to_tel, Chk01_RsltR.$ship_to_tel);
				addColumnPathMap(XfrSchdChk04_DtlR.$ship_to_fax, Chk01_RsltR.$ship_to_fax);
				addColumnPathMap(XfrSchdChk04_DtlR.$via_dlv_typ, Chk01_RsltR.$via_dlv_typ);
				addColumnPathMap(XfrSchdChk04_DtlR.$prov_typ, Chk01_RsltR.$prov_typ);
				addColumnPathMap(XfrSchdChk04_DtlR.$prov_basis_typ, Chk01_RsltR.$prov_basis_typ);
				addColumnPathMap(XfrSchdChk04_DtlR.$xrate, Chk01_RsltR.$xrate);
				addColumnPathMap(XfrSchdChk04_DtlR.$ptax_xrate, Chk01_RsltR.$ptax_xrate);
				addColumnPathMap(XfrSchdChk04_DtlR.$trd_cur_cd, Chk01_RsltR.$trd_cur_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$tax_cd, Chk01_RsltR.$tax_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$trd_cur_upri, Chk01_RsltR.$trd_cur_upri);
				addColumnPathMap(XfrSchdChk04_DtlR.$wtax_rate, Chk01_RsltR.$wtax_rate);
				addColumnPathMap(XfrSchdChk04_DtlR.$ret_prov_typ, Chk01_RsltR.$ret_prov_typ);
				addColumnPathMap(XfrSchdChk04_DtlR.$ret_prov_basis_typ, Chk01_RsltR.$ret_prov_basis_typ);
				addColumnPathMap(XfrSchdChk04_DtlR.$ret_xrate, Chk01_RsltR.$ret_xrate);
				addColumnPathMap(XfrSchdChk04_DtlR.$ret_ptax_xrate, Chk01_RsltR.$ret_ptax_xrate);
				addColumnPathMap(XfrSchdChk04_DtlR.$ret_trd_cur_cd, Chk01_RsltR.$ret_trd_cur_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$ret_tax_cd, Chk01_RsltR.$ret_tax_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$ret_trd_cur_upri, Chk01_RsltR.$ret_trd_cur_upri);
				addColumnPathMap(XfrSchdChk04_DtlR.$ret_wtax_rate, Chk01_RsltR.$ret_wtax_rate);
				addColumnPathMap(XfrSchdChk04_DtlR.$alloc_flg, Chk01_RsltR.$alloc_flg);
				addColumnPathMap(XfrSchdChk04_DtlR.$err_flg, Chk01_RsltR.$err_flg);
			}
		}
		
		protected void setShipTermInfo(MCList<Chk01_RsltR> notErrL) {
			// Checkerのリストロジックと同じ補完処理を行う
			MCList<MAM_SHIP_TERM_R> bindL = MCList.create(MAM_SHIP_TERM_R.class);
			for(Chk01_RsltR r :notErrL){
				if(!isNull(r.ship_term_cd())) {
					MAM_SHIP_TERM_R tmpR = MAM_SHIP_TERM_R.create();
					tmpR.ship_term_cd(r.ship_term_cd());
					bindL.add(tmpR);
				}
			}
			if (isNull(bindL)) {
				return ;
			}

			MAM_SHIP_TERM_R t = MAM_SHIP_TERM_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.ship_term_cd);
			dbcL_bldr.addSelect(t.ship_term_nm);
			FXUCL_MCDbcCache<MAM_SHIP_TERM_R> cache = new FXUCL_MCDbcCache<>(dbcL_bldr, bindL,
					MAM_SHIP_TERM_R.$ship_term_cd);
			
			for (Chk01_RsltR r : notErrL) {
				if(!isNull(r.ship_term_cd())) {
					MAM_SHIP_TERM_R dbc = cache.get(r.ship_term_cd());
					r.ship_term_nm(dbc.ship_term_nm());
				}
			}
			
		}
		protected void setCurInfo(MCList<Chk01_RsltR> notErrL) {
			// Checkerのリストロジックと同じ補完処理を行う
			
			MCList<MAM_CUR_R> bindL = MCList.create(MAM_CUR_R.class);
			for (Chk01_RsltR r : notErrL) {
				if (!isNull(r.trd_cur_cd())) {
					MAM_CUR_R tmpR = MAM_CUR_R.create();
					tmpR.cur_cd(r.trd_cur_cd());
					bindL.add(tmpR);
				}
				if (!isNull(r.ret_trd_cur_cd())) {
					MAM_CUR_R tmpR = MAM_CUR_R.create();
					tmpR.cur_cd(r.ret_trd_cur_cd());
					bindL.add(tmpR);
				}
			}

			if (isNull(bindL)) {
				return ;
			}
			
			MAM_CUR_R t = MAM_CUR_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.cur_cd);
			dbcL_bldr.addSelect(t.cur_nm);
			dbcL_bldr.addSelect(t.amt_dec_place);
			dbcL_bldr.addSelect(t.upri_dec_place);
			FXUCL_MCDbcCache<MAM_CUR_R> cache = new FXUCL_MCDbcCache<>(dbcL_bldr, bindL, MAM_CUR_R.$cur_cd);
			
			for (Chk01_RsltR r : notErrL) {
				if (!isNull(r.trd_cur_cd())) {
					MAM_CUR_R dbc = cache.get(r.trd_cur_cd());
					r.trd_cur_nm(dbc.cur_nm());
					r.trd_cur_amt_dec_place(dbc.amt_dec_place());
					r.trd_cur_upri_dec_place(dbc.upri_dec_place());
				}
				if (!isNull(r.ret_trd_cur_cd())) {
					MAM_CUR_R dbc = cache.get(r.ret_trd_cur_cd());
					r.ret_trd_cur_nm(dbc.cur_nm());
					r.ret_trd_cur_amt_dec_place(dbc.amt_dec_place());
					r.ret_trd_cur_upri_dec_place(dbc.upri_dec_place());
				}
			}
			
		}
		
		protected void setTaxInfo(MCList<Chk01_RsltR> notErrL) {
			// Checkerのリストロジックと同じ補完処理を行う
			
			MCList<MAM_TAX_R> bindL = MCList.create(MAM_TAX_R.class);
			for (Chk01_RsltR r : notErrL) {
				if (!isNull(r.tax_cd())) {
					MAM_TAX_R tmpR = MAM_TAX_R.create();
					tmpR.tax_cd(r.tax_cd());
					bindL.add(tmpR);
				}
				if (!isNull(r.ret_tax_cd())) {
					MAM_TAX_R tmpR = MAM_TAX_R.create();
					tmpR.tax_cd(r.ret_tax_cd());
					bindL.add(tmpR);
				}
			}

			if (isNull(bindL)) {
				return ;
			}
			
			MAM_TAX_R t = MAM_TAX_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.tax_cd);
			dbcL_bldr.addSelect(t.tax_nm);
			dbcL_bldr.addSelect(t.tax_rate);
			dbcL_bldr.addSelect(t.tax_typ);
			dbcL_bldr.addSelect(t.inc_tax_flg);
			FXUCL_MCDbcCache<MAM_TAX_R> cache = new FXUCL_MCDbcCache<>(dbcL_bldr, bindL, MAM_TAX_R.$tax_cd);
			
			for (Chk01_RsltR r : notErrL) {
				if (!isNull(r.tax_cd())) {
					MAM_TAX_R dbc = cache.get(r.tax_cd());
					r.tax_nm(dbc.tax_nm());
					r.tax_rate(dbc.tax_rate());
					r.tax_typ(dbc.tax_typ());
					r.inc_tax_flg(dbc.inc_tax_flg());
				}
				if (!isNull(r.ret_tax_cd())) {
					MAM_TAX_R dbc = cache.get(r.ret_tax_cd());
					r.ret_tax_nm(dbc.tax_nm());
					r.ret_tax_rate(dbc.tax_rate());
					r.ret_tax_typ(dbc.tax_typ());
					r.ret_inc_tax_flg(dbc.inc_tax_flg());
				}
			}
			
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Imp01オペレーション.<p>
	 *
	 * 移動・移送予定を更新する。<br>
	 */
	public class Imp01 extends MSBEL_XfrSchdReg_MC_A.Imp01 {
		//キャッシュ
		/**ロット・サブロットリスト*/
		protected FXUCL_MCDbcCache<MSVT_LOT_LIST_R> _cacheLot = null;
		/** 案件  */
		protected FXUCL_MCDbcCache<MSVT_WRK_SNO_R> _cacheWrk = null;
		/** 場所マスタキャッシュ */
		protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc = null;
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			setDown();
		}
		
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());
			for(Chk01_RsltR upR : up0()) {
				if (upR.isStatusCreate()) {
					upR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					upR.xfr_src_typ(MSC_XFR_SRC_TYP.MNL.value());
				}
				else if (upR.isStatusModify()) {
					upR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				if(!upR.xrate_inpt_flg()) {
					upR.xrate(null);
				}
				if(!upR.ptax_xrate_inpt_flg()) {
					upR.ptax_xrate(null);
				}
				if(!upR.ret_xrate_inpt_flg()) {
					upR.ret_xrate(null);
				}
				if(!upR.ret_ptax_xrate_inpt_flg()) {
					upR.ret_ptax_xrate(null);
				}
			}
			createCache();
			compCache();
			setDefStrLnCd();
		}

		/**
		 * 標準の棚・ラインCDを設定します。
		 */
		protected void setDefStrLnCd() {
			MSUCL_StrLnUtil.StrLnUtil_Srch01 ope = MSUCL_StrLnUtil.crtStrLnUtil_Srch01();
			for (Chk01_RsltR r : up0()) {
				if (!r.gr_str_ln_tgt_flg() || isNull(r.itm_cd()) || isNull(r.gr_loc_cd())) {
					continue;
				}
				StrLnUtil_Srch01_CndR cndR = StrLnUtil_Srch01_CndR.create();
				cndR.peg_no(r.peg_no());
				cndR.itm_cd(r.itm_cd());
				cndR.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
				cndR.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
				cndR.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
				cndR.loc_cd(r.gr_loc_cd());
				ope.up0().add(cndR);
			}
			ope.exec();
			MCIndexKey idxkey = ope.down0().createIndex(StrLnUtil_Srch01_CndR.$peg_no);
			for (Chk01_RsltR r : up0()) {
				StrLnUtil_Srch01_CndR downR = ope.down0().getFirst(idxkey, r.peg_no());
				if (!r.gr_str_ln_tgt_flg()) {
					r.gr_str_ln_cd_none_flg(false);
				}
				else if (!isNull(r.gr_str_ln_cd())) {
					r.gr_str_ln_cd_none_flg(false);
				}
				else if (!isNull(downR) && !isNullOrNullVal(downR.str_ln_cd())) {
					if (!r.gr_str_ln_cd_none_flg()) {
						r.gr_str_ln_cd(downR.str_ln_cd());
					}
				}
				else {
					r.gr_str_ln_cd_none_flg(false);
				}
			}
		}

		protected void callThisChk01() {
			MSBEL_XfrSchdReg.Chk01 ope = MSBEL_XfrSchdReg.crtChk01();
			setPegNo(Chk01_RsltR.$peg_no, up0());
			ope.up0().setAll(up0().clone());
			ope.up1().file_imp_flg(true);
			ope.exec();
			MCList<Chk01_RsltR> downL = ope.down0();
			MCIndexKey chkIdxkey = downL.createIndex(Chk01_RsltR.$peg_no);
			
			for(Chk01_RsltR r : up0()) {
				Chk01_RsltR chkR = downL.getFirst(chkIdxkey, r.peg_no());
				
				for (String col : Chk01_RsltR.colnames()) {
					if (!isNull(chkR.getValueNE(col))) {
						if(isSame(col,Chk01_RsltR.$ver_no) || isSame(col,Chk01_RsltR.$ship_term_cd )|| isSame(col,Chk01_RsltR.$ship_inst_typ )) {
							r.setValueNE(col, complInputFileValue(col, r.getValueNE(col), chkR.getValueNE(col)));
						}
						else {
							r.setValueNE(col, chkR.getValueNE(col));
						}
					}
				}
				if(isNull(r.ship_term_cd())) {
					r.ship_term_nm(null);
				}
				if(isNull(r.ship_inst_typ())) {
					r.ship_inst_typ_nm(null);
				}
			}
		}
		
		protected void setDown() {
			down0().setAll(up0());
			down0().forEach(r -> {
				r.gi_rqst_dt(r.gi_rqst_tm());
				r.gi_rqst_hm(r.gi_rqst_tm());
				r.gr_rqst_dt(r.gr_rqst_tm());
				r.gr_rqst_hm(r.gr_rqst_tm());
			});
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		protected void createCache() {

			createCacheLot();

			createCacheWrk();

			createLocCache();
		}

		protected void compCache() {

			for (Chk01_RsltR r : up0()) {
				//ロット情報の補完
				if(r.lot_none_flg()) {
					r.lot_no(null);
					r.sublot_no(null);
				}
				else if (isNull(r.sublot_no())) {
					r.sublot_no(MAC_STR.NULL_VAL.value());
				}
				MSVT_LOT_LIST_R lotL = getCacheLot(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
						r.itm_sub3(), r.lot_no(), r.sublot_no());
				r.act_cont_fctr(lotL.act_cont_fctr());
				if (isNull(r.ver_no())) {
					r.ver_no(lotL.ver_no());
				}
				
				//案件情報の補完
				MSVT_WRK_SNO_R wrkR = getCacheWrk(r.sno1());
				r.wrk_no(wrkR.wrk_no());
				r.wrk_nm(wrkR.wrk_nm());

				MAM_LOC_R locR = getCacheLoc(r.gr_loc_cd());
				if (!isNull(locR)) {
					r.gr_str_ln_tgt_flg(locR.str_ln_tgt_flg());
				}
			}
		}

		/**
		 * キャッシュ作成（ロット・サブロットリスト）
		 */
		protected void createCacheLot() {
			_cacheLot = new FXUCL_MCDbcCache<MSVT_LOT_LIST_R>(
					MCQueryApiBuilder.create(MSVT_LOT_LIST_R.create("T")), up0(),
					Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2,
					Chk01_RsltR.$itm_sub3, Chk01_RsltR.$lot_no, Chk01_RsltR.$sublot_no);
		}

		protected MSVT_LOT_LIST_R getCacheLot(String itmCd, String itmSub1,
				String itmSub2, String itmSub3, String lotNo, String sublotNo) {
			return _cacheLot.get(itmCd, itmSub1, itmSub2, itmSub3, lotNo, sublotNo);
		}

		/**
		 * キャッシュ作成（案件）
		 */
		protected void createCacheWrk() {
			_cacheWrk = new FXUCL_MCDbcCache<MSVT_WRK_SNO_R>(
					MCQueryApiBuilder.create(MSVT_WRK_SNO_R.create("T")), up0(),
					Chk01_RsltR.$sno1);
		}

		protected MSVT_WRK_SNO_R getCacheWrk(String sno1) {
			return _cacheWrk.get(sno1);
		}

		protected void createLocCache() {
			_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(
					MCQueryApiBuilder.create(MAM_LOC_R.create("T")), up0(),
					Chk01_RsltR.$gr_loc_cd);
		}

		protected MAM_LOC_R getCacheLoc(String locCd) {
			return _cacheLoc.get(locCd);
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 移動・移送予定を更新する。<br>
	 */
	public class Upd01 extends MSBEL_XfrSchdReg_MC_A.Upd01 {
		
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0(), Chk01_RsltR.$err_flg, Chk01_RsltR.$rtn_sts_typ);
			}
			catch (Exception e) {
				handleEx(e, up0(),  Chk01_RsltR.$rtn_sts_typ);
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			MSBEL_XfrSchdReg.Chk01 chkOpe = callThisChk01();
			MCList<Chk01_RsltR> notErrL = up0().subList(r->!r.err_flg());
			callXfrSchdUpdSrv(notErrL, chkOpe);
		}

		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());
			for(Chk01_RsltR upR : up0()) {
				if (upR.isStatusCreate()) {
					upR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					upR.xfr_src_typ(MSC_XFR_SRC_TYP.MNL.value());
				}
				else if (upR.isStatusModify()) {
					upR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}

		protected MSBEL_XfrSchdReg.Chk01 callThisChk01() {
			MSBEL_XfrSchdReg.Chk01 ope = MSBEL_XfrSchdReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
			return ope;
		}

		protected void callXfrSchdUpdSrv(MCList<Chk01_RsltR> notErrL, MSBEL_XfrSchdReg.Chk01 chkOpe) {
			if (isNull(notErrL)) {
				return ;
			}
			
			MSBEL_XfrSchdService.XfrSchd_Upd01 ope = MSBEL_XfrSchdService.crtXfrSchd_Upd01();
			addAll(ope.up0(), notErrL, createMap_XfrSchd_DtlR_Chk01_RsltR());
			ope.up1().screen_flg(true);
			ope.up2().addAll(chkOpe.getAllocedL());
			ope.exec();
			
			String[] destCols = new String[] {Chk01_RsltR.$xfr_schd_no};
			String[] srcCols = new String[] {XfrSchd_DtlR.$xfr_schd_no};
			copyByPegNo(notErrL, destCols, ope.down0(), srcCols);

		}

		protected void setDown() {
			down0().setAll(up0());
		}

		protected Map_XfrSchd_DtlR_Chk01_RsltR<XfrSchd_DtlR,Chk01_RsltR> createMap_XfrSchd_DtlR_Chk01_RsltR() {
			return new Map_XfrSchd_DtlR_Chk01_RsltR<XfrSchd_DtlR, Chk01_RsltR>();
		}

		public class Map_XfrSchd_DtlR_Chk01_RsltR<D extends XfrSchd_DtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchd_DtlR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(XfrSchd_DtlR.$data_crud_typ, Chk01_RsltR.$data_crud_typ);
				addColumnPathMap(XfrSchd_DtlR.$xfr_schd_no, Chk01_RsltR.$xfr_schd_no);
				addColumnPathMap(XfrSchd_DtlR.$xfr_src_typ, Chk01_RsltR.$xfr_src_typ);
				addColumnPathMap(XfrSchd_DtlR.$xfr_src_no, Chk01_RsltR.$xfr_src_no);
				addColumnPathMap(XfrSchd_DtlR.$trd_cd, Chk01_RsltR.$trd_cd);
				addColumnPathMap(XfrSchd_DtlR.$trd_ptn_typ, Chk01_RsltR.$trd_ptn_typ);
				addColumnPathMap(XfrSchd_DtlR.$gi_wg_cd, Chk01_RsltR.$gi_wg_cd);
				addColumnPathMap(XfrSchd_DtlR.$gi_lg_grp_cd, Chk01_RsltR.$gi_lg_grp_cd);
				addColumnPathMap(XfrSchd_DtlR.$gi_loc_cd, Chk01_RsltR.$gi_loc_cd);
				addColumnPathMap(XfrSchd_DtlR.$gi_str_ln_cd, Chk01_RsltR.$gi_str_ln_cd);
				addColumnPathMap(XfrSchd_DtlR.$gi_stk_arrv_bp_cd, Chk01_RsltR.$gi_stk_arrv_bp_cd);
				addColumnPathMap(XfrSchd_DtlR.$gr_wg_cd, Chk01_RsltR.$gr_wg_cd);
				addColumnPathMap(XfrSchd_DtlR.$gr_lg_grp_cd, Chk01_RsltR.$gr_lg_grp_cd);
				addColumnPathMap(XfrSchd_DtlR.$gr_loc_cd, Chk01_RsltR.$gr_loc_cd);
				addColumnPathMap(XfrSchd_DtlR.$gr_str_ln_cd, Chk01_RsltR.$gr_str_ln_cd);
				addColumnPathMap(XfrSchd_DtlR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(XfrSchd_DtlR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(XfrSchd_DtlR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(XfrSchd_DtlR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(XfrSchd_DtlR.$lot_no, Chk01_RsltR.$lot_no);
				addColumnPathMap(XfrSchd_DtlR.$sublot_no, Chk01_RsltR.$sublot_no);
				addColumnPathMap(XfrSchd_DtlR.$sno1, Chk01_RsltR.$sno1);
				addColumnPathMap(XfrSchd_DtlR.$sno1_null_flg, Chk01_RsltR.$sno1_null_flg);
				addColumnPathMap(XfrSchd_DtlR.$sno2, Chk01_RsltR.$sno2);
				addColumnPathMap(XfrSchd_DtlR.$sno2_null_flg, Chk01_RsltR.$sno2_null_flg);
				addColumnPathMap(XfrSchd_DtlR.$sno3, Chk01_RsltR.$sno3);
				addColumnPathMap(XfrSchd_DtlR.$sno3_null_flg, Chk01_RsltR.$sno3_null_flg);
				addColumnPathMap(XfrSchd_DtlR.$sno4, Chk01_RsltR.$sno4);
				addColumnPathMap(XfrSchd_DtlR.$sno4_null_flg, Chk01_RsltR.$sno4_null_flg);
				addColumnPathMap(XfrSchd_DtlR.$ver_no, Chk01_RsltR.$ver_no);
				addColumnPathMap(XfrSchd_DtlR.$gd_cd, Chk01_RsltR.$gd_cd);
				addColumnPathMap(XfrSchd_DtlR.$quality_typ, Chk01_RsltR.$quality_typ);
				addColumnPathMap(XfrSchd_DtlR.$stk_id_typ, Chk01_RsltR.$stk_id_typ);
				addColumnPathMap(XfrSchd_DtlR.$stk_bp_cd, Chk01_RsltR.$stk_bp_cd);
				addColumnPathMap(XfrSchd_DtlR.$trd_unit_cd, Chk01_RsltR.$trd_unit_cd);
				addColumnPathMap(XfrSchd_DtlR.$trd_unit_qty, Chk01_RsltR.$trd_unit_qty);
				addColumnPathMap(XfrSchd_DtlR.$base_unit_cd, Chk01_RsltR.$base_unit_cd);
				addColumnPathMap(XfrSchd_DtlR.$base_unit_qty, Chk01_RsltR.$base_unit_qty);
				addColumnPathMap(XfrSchd_DtlR.$gi_rqst_tm, Chk01_RsltR.$gi_rqst_tm);
				addColumnPathMap(XfrSchd_DtlR.$gr_rqst_tm, Chk01_RsltR.$gr_rqst_tm);
				addColumnPathMap(XfrSchd_DtlR.$rcpt_dt, Chk01_RsltR.$rcpt_dt);
				addColumnPathMap(XfrSchd_DtlR.$rqst_usr_cd, Chk01_RsltR.$rqst_usr_cd);
				addColumnPathMap(XfrSchd_DtlR.$rqst_dpt_cd, Chk01_RsltR.$rqst_dpt_cd);
				addColumnPathMap(XfrSchd_DtlR.$ship_term_cd, Chk01_RsltR.$ship_term_cd);
				addColumnPathMap(XfrSchd_DtlR.$ship_inst_typ, Chk01_RsltR.$ship_inst_typ);
				addColumnPathMap(XfrSchd_DtlR.$rsn_cd, Chk01_RsltR.$rsn_cd);
				addColumnPathMap(XfrSchd_DtlR.$bd_dpt_cd, Chk01_RsltR.$bd_dpt_cd);
				addColumnPathMap(XfrSchd_DtlR.$ship_block_flg, Chk01_RsltR.$ship_block_flg);
				addColumnPathMap(XfrSchd_DtlR.$ship_to_id_typ, Chk01_RsltR.$ship_to_id_typ);
				addColumnPathMap(XfrSchd_DtlR.$ship_to_id_cd, Chk01_RsltR.$ship_to_id_cd);
				addColumnPathMap(XfrSchd_DtlR.$ship_to_id_nm, Chk01_RsltR.$ship_to_id_nm);
				addColumnPathMap(XfrSchd_DtlR.$ship_to_zip_cd, Chk01_RsltR.$ship_to_zip_cd);
				addColumnPathMap(XfrSchd_DtlR.$ship_to_addr1, Chk01_RsltR.$ship_to_addr1);
				addColumnPathMap(XfrSchd_DtlR.$ship_to_addr2, Chk01_RsltR.$ship_to_addr2);
				addColumnPathMap(XfrSchd_DtlR.$ship_to_addr3, Chk01_RsltR.$ship_to_addr3);
				addColumnPathMap(XfrSchd_DtlR.$ship_to_addr4, Chk01_RsltR.$ship_to_addr4);
				addColumnPathMap(XfrSchd_DtlR.$ship_to_cntct_dpt, Chk01_RsltR.$ship_to_cntct_dpt);
				addColumnPathMap(XfrSchd_DtlR.$ship_to_cntct_psn, Chk01_RsltR.$ship_to_cntct_psn);
				addColumnPathMap(XfrSchd_DtlR.$ship_to_tel, Chk01_RsltR.$ship_to_tel);
				addColumnPathMap(XfrSchd_DtlR.$ship_to_fax, Chk01_RsltR.$ship_to_fax);
				addColumnPathMap(XfrSchd_DtlR.$ship_to_sundry_flg, Chk01_RsltR.$ship_to_sundry_flg);
				addColumnPathMap(XfrSchd_DtlR.$via_dlv_typ, Chk01_RsltR.$via_dlv_typ);
				addColumnPathMap(XfrSchd_DtlR.$itm_ord_no, Chk01_RsltR.$itm_ord_no);
				addColumnPathMap(XfrSchd_DtlR.$mfg_inst_no, Chk01_RsltR.$mfg_inst_no);
				addColumnPathMap(XfrSchd_DtlR.$oper_inst_no, Chk01_RsltR.$oper_inst_no);
				addColumnPathMap(XfrSchd_DtlR.$inpt_schd_no, Chk01_RsltR.$inpt_schd_no);
				addColumnPathMap(XfrSchd_DtlR.$slo_no, Chk01_RsltR.$slo_no);
				addColumnPathMap(XfrSchd_DtlR.$slo_d_no, Chk01_RsltR.$slo_d_no);
				addColumnPathMap(XfrSchd_DtlR.$cont_qty, Chk01_RsltR.$cont_qty);
//						addColumnPathMap(XfrSchd_DtlR.$rqst_mod_flg, ); // XfrSchd_Upd03で更新する
//						addColumnPathMap(XfrSchd_DtlR.$rqst_can_flg, ); // XfrSchd_Upd03で更新する
				addColumnPathMap(XfrSchd_DtlR.$not_lot_mix_flg, Chk01_RsltR.$not_lot_mix_flg);
				addColumnPathMap(XfrSchd_DtlR.$not_sublot_mix_flg, Chk01_RsltR.$not_sublot_mix_flg);
				addColumnPathMap(XfrSchd_DtlR.$vld_dt_fr, Chk01_RsltR.$vld_dt_fr);
				addColumnPathMap(XfrSchd_DtlR.$vld_dt_to, Chk01_RsltR.$vld_dt_to);
				addColumnPathMap(XfrSchd_DtlR.$prov_typ, Chk01_RsltR.$prov_typ);
				addColumnPathMap(XfrSchd_DtlR.$prov_basis_typ, Chk01_RsltR.$prov_basis_typ);
				addColumnPathMap(XfrSchd_DtlR.$xrate_inpt_flg, Chk01_RsltR.$xrate_inpt_flg);
				addColumnPathMap(XfrSchd_DtlR.$xrate, Chk01_RsltR.$xrate);
				addColumnPathMap(XfrSchd_DtlR.$ptax_xrate_inpt_flg, Chk01_RsltR.$ptax_xrate_inpt_flg);
				addColumnPathMap(XfrSchd_DtlR.$ptax_xrate, Chk01_RsltR.$ptax_xrate);
				addColumnPathMap(XfrSchd_DtlR.$trd_cur_cd, Chk01_RsltR.$trd_cur_cd);
				addColumnPathMap(XfrSchd_DtlR.$tax_fix_flg, Chk01_RsltR.$tax_fix_flg);
				addColumnPathMap(XfrSchd_DtlR.$tax_cd, Chk01_RsltR.$tax_cd);
				addColumnPathMap(XfrSchd_DtlR.$trd_cur_upri, Chk01_RsltR.$trd_cur_upri);
				addColumnPathMap(XfrSchd_DtlR.$trd_cur_amt, Chk01_RsltR.$trd_cur_amt);
				addColumnPathMap(XfrSchd_DtlR.$trd_cur_tax_amt, Chk01_RsltR.$trd_cur_tax_amt);
				addColumnPathMap(XfrSchd_DtlR.$wtax_rate, Chk01_RsltR.$wtax_rate);
				addColumnPathMap(XfrSchd_DtlR.$wtax_amt, Chk01_RsltR.$wtax_amt);
				addColumnPathMap(XfrSchd_DtlR.$ret_prov_typ, Chk01_RsltR.$ret_prov_typ);
				addColumnPathMap(XfrSchd_DtlR.$ret_prov_basis_typ, Chk01_RsltR.$ret_prov_basis_typ);
				addColumnPathMap(XfrSchd_DtlR.$ret_xrate_inpt_flg, Chk01_RsltR.$ret_xrate_inpt_flg);
				addColumnPathMap(XfrSchd_DtlR.$ret_xrate, Chk01_RsltR.$ret_xrate);
				addColumnPathMap(XfrSchd_DtlR.$ret_ptax_xrate_inpt_flg, Chk01_RsltR.$ret_ptax_xrate_inpt_flg);
				addColumnPathMap(XfrSchd_DtlR.$ret_ptax_xrate, Chk01_RsltR.$ret_ptax_xrate);
				addColumnPathMap(XfrSchd_DtlR.$ret_trd_cur_cd, Chk01_RsltR.$ret_trd_cur_cd);
				addColumnPathMap(XfrSchd_DtlR.$ret_tax_fix_flg, Chk01_RsltR.$ret_tax_fix_flg);
				addColumnPathMap(XfrSchd_DtlR.$ret_tax_cd, Chk01_RsltR.$ret_tax_cd);
				addColumnPathMap(XfrSchd_DtlR.$ret_trd_cur_upri, Chk01_RsltR.$ret_trd_cur_upri);
				addColumnPathMap(XfrSchd_DtlR.$ret_trd_cur_amt, Chk01_RsltR.$ret_trd_cur_amt);
				addColumnPathMap(XfrSchd_DtlR.$ret_trd_cur_tax_amt, Chk01_RsltR.$ret_trd_cur_tax_amt);
				addColumnPathMap(XfrSchd_DtlR.$ret_wtax_rate, Chk01_RsltR.$ret_wtax_rate);
				addColumnPathMap(XfrSchd_DtlR.$ret_wtax_amt, Chk01_RsltR.$ret_wtax_amt);
				addColumnPathMap(XfrSchd_DtlR.$base_dlv_slip_no, Chk01_RsltR.$base_dlv_slip_no);
				addColumnPathMap(XfrSchd_DtlR.$base_prov_act_no, Chk01_RsltR.$base_prov_act_no);
				addColumnPathMap(XfrSchd_DtlR.$base_ac_dt, Chk01_RsltR.$base_ac_dt);
				addColumnPathMap(XfrSchd_DtlR.$rqst_cnt_rmrks, Chk01_RsltR.$rqst_cnt_rmrks);
				addColumnPathMap(XfrSchd_DtlR.$ship_cnt_rmrks, Chk01_RsltR.$ship_cnt_rmrks);
				addColumnPathMap(XfrSchd_DtlR.$trd_d_rmrks, Chk01_RsltR.$trd_d_rmrks);
				addColumnPathMap(XfrSchd_DtlR.$intr_rmrks, Chk01_RsltR.$intr_rmrks);
				addColumnPathMap(XfrSchd_DtlR.$sub_char1, Chk01_RsltR.$sub_char1);
				addColumnPathMap(XfrSchd_DtlR.$sub_char2, Chk01_RsltR.$sub_char2);
				addColumnPathMap(XfrSchd_DtlR.$sub_char3, Chk01_RsltR.$sub_char3);
				addColumnPathMap(XfrSchd_DtlR.$alloc_flg, Chk01_RsltR.$alloc_flg);
			}
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

	}
	
	
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 移動・移送予定を取り消しするためにチェックを行う。<br>
	 */
	public class Chk02 extends MSBEL_XfrSchdReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			MCList<Chk02_RsltR> notErrL = up0().subList(r->!r.err_flg());
			callXfrSchdUpdChkSrv(notErrL);
			setErrToRtnStsTyp();
			setDown();
		}
		

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			//　移動・移送予定のロック、更新カウンタチェック、ＤＡＣチェック
			msgL.addAll(chkXfrSchd());
			
			return msgL;
		}

		/**
		 * 移動・移送予定のロック、更新カウンタチェック、ＤＡＣチェック
		 */
		protected MCMessageList chkXfrSchd() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			if (isNull(notErrL)) {
				return msgL;
			}
			
			MCList<Chk02_RsltR> bindL = notErrL.subList(r->!isNull(r.xfr_schd_no()));
			bindL.sort(Chk02_RsltR.$xfr_schd_no);
			MCList<MST_XFR_SCHD_R> selectL = MCList.create(MST_XFR_SCHD_R.class);
			MST_XFR_SCHD_R t = MST_XFR_SCHD_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.xfr_schd_no);
			selectL_bldr.addSelect(t.upd_cntr);
			selectL_bldr.addSelect(t.gi_lg_grp_cd);
			selectL_bldr.addSelect(t.gr_loc_cd);
			selectL_bldr.addSelect(t.gi_wg_cd);
			selectL_bldr.addSelect(t.gr_wg_cd);
			selectL_bldr.addSelect(t.xfr_src_typ);
			selectL_bldr.addSelect(t.itm_cd);
			selectL_bldr.addSelect(t.itm_sub1);
			selectL_bldr.addSelect(t.itm_sub2);
			selectL_bldr.addSelect(t.itm_sub3);
			selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdateNoWait("MSBEL1000_MST_XFR_SCHD_S03", selectL, selectL_bldr, bindL);

			MCIndexKey idxkey = selectL.createIndex(MST_XFR_SCHD_R.$xfr_schd_no);
			itmLgGrpLocCache(selectL);
			locCache(selectL);
			msgL.addAll(chkItm(selectL, idxkey, notErrL));
			for (Chk02_RsltR r : notErrL) {
				MST_XFR_SCHD_R selectR = selectL.getFirst(idxkey, r.xfr_schd_no());
				msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));
				if (!isNull(selectR)) {
					selectR.setAttributes(r);
					MCMessageList msgDacGiL = checkWritableLgGrpCdDac(selectR, MST_XFR_SCHD_R.$gi_lg_grp_cd);
					MCMessageList msgDacGrL = checkWritableLocCdDac(selectR, MST_XFR_SCHD_R.$gr_loc_cd);
					if (!isNull(selectR.gi_loc_cd())) {
						selectR.addStringColumn("chk_gi_loc_cd", selectR.gi_loc_cd());
					}
					else {
						MAM_ITM_LG_GRP_R itmLgGrpR = getItmLgGrpLocCache(selectR.itm_cd(), selectR.itm_sub1(), selectR.itm_sub2(), selectR.itm_sub3(), selectR.gi_lg_grp_cd());
						MAM_LOC_R locR = getLocCache(selectR.gi_lg_grp_cd());
						
						selectR.addStringColumn("chk_gi_loc_cd", !itmLgGrpR.isEmpty() ? itmLgGrpR.lg_def_loc_cd() : !isNull(locR) ? locR.loc_cd() : null);
					}
					
					MCMessageList msgDacGiLocL = checkWritableLocCdDac(selectR, "chk_gi_loc_cd");
					if (!isSame(selectR.gi_wg_cd(), selectR.gr_wg_cd())
							&& MSC_XFR_SRC_TYP.isMNL(selectR.xfr_src_typ())) {
						if (!msgDacGiL.isEmpty() && !msgDacGiLocL.isEmpty()) {
							msgL.addAll(msgDacGiL);
							msgL.addAll(msgDacGiLocL);
						}
					}
					else {
						if (!msgDacGiL.isEmpty() && !msgDacGrL.isEmpty() && !msgDacGiLocL.isEmpty()) {
							msgL.addAll(msgDacGiL);
							msgL.addAll(msgDacGrL);
							msgL.addAll(msgDacGiLocL);
							}
					}
				}
			}
			
			return msgL;
		}
		
		protected void callXfrSchdUpdChkSrv(MCList<Chk02_RsltR> notErrL) {
			if (isNull(notErrL)) {
				return ;
			}
			
			MSBEL_XfrSchdService.XfrSchd_Chk04 ope = MSBEL_XfrSchdService.crtXfrSchd_Chk04();
			addAll(ope.up0(), notErrL, createMap_XfrSchdChk04_DtlR_Chk02_RsltR());
			ope.up1().screen_flg(true);
			ope.exec();

			copyErrFlg(notErrL, ope.down0());
		}

		protected Map_XfrSchdChk04_DtlR_Chk02_RsltR<XfrSchdChk04_DtlR,Chk02_RsltR> createMap_XfrSchdChk04_DtlR_Chk02_RsltR() {
			return new Map_XfrSchdChk04_DtlR_Chk02_RsltR<XfrSchdChk04_DtlR, Chk02_RsltR>();
		}

		public class Map_XfrSchdChk04_DtlR_Chk02_RsltR<D extends XfrSchdChk04_DtlR, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdChk04_DtlR.$peg_no, Chk02_RsltR.$peg_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$data_crud_typ, Chk02_RsltR.$data_crud_typ);
				addColumnPathMap(XfrSchdChk04_DtlR.$xfr_schd_no, Chk02_RsltR.$xfr_schd_no);
			}
		}

		protected void setDown() {
			down0().setAll(up0());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

	}
	
	
	/**
	 * Del01オペレーション.<p>
	 *
	 * 移動・移送予定を取り消す<br>
	 */
	public class Del01 extends MSBEL_XfrSchdReg_MC_A.Del01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0(), Chk02_RsltR.$err_flg, Chk02_RsltR.$rtn_sts_typ);
			}
			catch (Exception e) {
				handleEx(e, up0(), Chk02_RsltR.$rtn_sts_typ);
			}
			finally {
				setDown();
			}
		}
		
		@Override
		protected void doIt() {
			editUp();
			callThisChk02();
			MCList<Chk02_RsltR> notErrL = up0().subList(r->!r.err_flg());
			callXfrSchdUpdSrv(notErrL);
		}
		
		protected void editUp() {
			setPegNo(Chk02_RsltR.$peg_no, up0());
			for(Chk02_RsltR upR : up0()) {
				upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		
		protected void callThisChk02() {
			MSBEL_XfrSchdReg.Chk02 ope = MSBEL_XfrSchdReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void callXfrSchdUpdSrv(MCList<Chk02_RsltR> notErrL) {
			if (isNull(notErrL)) {
				return ;
			}
			
			MSBEL_XfrSchdService.XfrSchd_Upd01 ope = MSBEL_XfrSchdService.crtXfrSchd_Upd01();
			addAll(ope.up0(), notErrL, createMap_XfrSchd_DtlR_Chk02_RsltR());
			ope.exec();
		}
		
		protected Map_XfrSchd_DtlR_Chk02_RsltR<XfrSchd_DtlR,Chk02_RsltR> createMap_XfrSchd_DtlR_Chk02_RsltR() {
			return new Map_XfrSchd_DtlR_Chk02_RsltR<XfrSchd_DtlR, Chk02_RsltR>();
		}

		public class Map_XfrSchd_DtlR_Chk02_RsltR<D extends XfrSchd_DtlR, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchd_DtlR.$peg_no, Chk02_RsltR.$peg_no);
				addColumnPathMap(XfrSchd_DtlR.$data_crud_typ, Chk02_RsltR.$data_crud_typ);
				addColumnPathMap(XfrSchd_DtlR.$xfr_schd_no, Chk02_RsltR.$xfr_schd_no);
			}
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

	}
	
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 移動・移送予定の依頼元訂正ＦＬＧと紐切れＦＬＧを更新するためにチェックを行う。<br>
	 */
	public class Chk03 extends MSBEL_XfrSchdReg_MC_A.Chk03 {
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// 移動移送予定情報のロック、更新カウンタチェック、ＤＡＣチェック
			msgL.addAll(chkXfrSchd());
			
			return msgL;
		}
		
		
		protected MCMessageList chkXfrSchd() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<Chk03_RsltR> notErrL = getChkList(up0());
			if (isNull(notErrL)) {
				return msgL;
			}
			
			// 移動移送予定情報のロック
			notErrL.sort(Chk03_RsltR.$xfr_schd_no);
			MCList<MST_XFR_SCHD_R> selectL = MCList.create(MST_XFR_SCHD_R.class);
			MST_XFR_SCHD_R t = MST_XFR_SCHD_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.xfr_schd_no);
			selectL_bldr.addSelect(t.upd_cntr);
			selectL_bldr.addSelect(t.rqst_mod_flg);
			selectL_bldr.addSelect(t.rqst_can_flg);
			selectL_bldr.addSelect(t.gi_lg_grp_cd);
			selectL_bldr.addSelect(t.gr_loc_cd);
			selectL_bldr.addSelect(t.gi_wg_cd);
			selectL_bldr.addSelect(t.gr_wg_cd);
			selectL_bldr.addSelect(t.xfr_src_typ);
			selectL_bldr.addSelect(t.gi_loc_cd);
			selectL_bldr.addSelect(t.itm_cd);
			selectL_bldr.addSelect(t.itm_sub1);
			selectL_bldr.addSelect(t.itm_sub2);
			selectL_bldr.addSelect(t.itm_sub3);
			selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdateNoWait("MSBEL1000_MST_XFR_SCHD_S04", selectL, selectL_bldr, notErrL);
			
			MCIndexKey idxkey = selectL.createIndex(MST_XFR_SCHD_R.$xfr_schd_no);
			itmLgGrpLocCache(selectL);
			locCache(selectL);
			msgL.addAll(chkItm(selectL, idxkey, notErrL));
			for (Chk03_RsltR r : notErrL) {
				MST_XFR_SCHD_R selectR = selectL.getFirst(idxkey, r.xfr_schd_no());
				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrNE(r, Chk03_RsltR.$upd_cntr, selectR));
				if (!isNull(selectR)) {
					selectR.setAttributes(r);
					MCMessageList msgDacGiL = checkWritableLgGrpCdDac(selectR, MST_XFR_SCHD_R.$gi_lg_grp_cd);
					MCMessageList msgDacGrL = checkWritableLocCdDac(selectR, MST_XFR_SCHD_R.$gr_loc_cd);
					if (!isNull(selectR.gi_loc_cd())) {
						selectR.addStringColumn("chk_gi_loc_cd", selectR.gi_loc_cd());
					}
					else {
						MAM_ITM_LG_GRP_R itmLgGrpR = getItmLgGrpLocCache(selectR.itm_cd(), selectR.itm_sub1(), selectR.itm_sub2(), selectR.itm_sub3(), selectR.gi_lg_grp_cd());
						MAM_LOC_R locR = getLocCache(selectR.gi_lg_grp_cd());
						
						selectR.addStringColumn("chk_gi_loc_cd", !itmLgGrpR.isEmpty() ? itmLgGrpR.lg_def_loc_cd() : !isNull(locR) ? locR.loc_cd() : null);
					}
					
					MCMessageList msgDacGiLocL = checkWritableLocCdDac(selectR, "chk_gi_loc_cd");
					if (!isSame(selectR.gi_wg_cd(), selectR.gr_wg_cd())
							&& MSC_XFR_SRC_TYP.isMNL(selectR.xfr_src_typ())) {
						if (!msgDacGiL.isEmpty() && !msgDacGiLocL.isEmpty()) {
							msgL.addAll(msgDacGiL);
							msgL.addAll(msgDacGiLocL);
						}
					}
					else {
						if (!msgDacGiL.isEmpty() && !msgDacGrL.isEmpty() && !msgDacGiLocL.isEmpty()) {
							msgL.addAll(msgDacGiL);
							msgL.addAll(msgDacGrL);
							msgL.addAll(msgDacGiLocL);
							}
					}
					r.rqst_can_flg(selectR.rqst_can_flg());
				}
			}
			
			return msgL;
		}

		protected void setDown() {
			down0().setAll(up0());
		}

	}
	/**
	 * Upd03オペレーション.<p>
	 *
	 * 移動・移送予定を更新する。<br>
	 */
	public class Upd03 extends MSBEL_XfrSchdReg_MC_A.Upd03 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0(), Chk03_RsltR.$err_flg, Chk03_RsltR.$rtn_sts_typ);
			}
			catch (Exception e) {
				handleEx(e, up0(), Chk03_RsltR.$rtn_sts_typ);
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk03();
			MCList<Chk03_RsltR> notErrL = up0().subList(r->!r.err_flg());
			callXfrSchdSrvUpd03(notErrL);
		}
		
		protected void editUp() {
			setPegNo(Chk03_RsltR.$peg_no, up0());
		}
		
		protected void callThisChk03() {
			MSBEL_XfrSchdReg.Chk03 ope = MSBEL_XfrSchdReg.crtChk03();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void callXfrSchdSrvUpd03(MCList<Chk03_RsltR> notErrL) {
			MSBEL_XfrSchdService.XfrSchd_Upd03 ope = MSBEL_XfrSchdService.crtXfrSchd_Upd03();
			addAll(ope.up0(), notErrL, createMap_XfrSchdMod_DtlR_Chk03_RsltR());
			ope.exec();
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		protected Map_XfrSchdMod_DtlR_Chk03_RsltR<XfrSchdMod_DtlR,Chk03_RsltR> createMap_XfrSchdMod_DtlR_Chk03_RsltR() {
			return new Map_XfrSchdMod_DtlR_Chk03_RsltR<XfrSchdMod_DtlR, Chk03_RsltR>();
		}

		public class Map_XfrSchdMod_DtlR_Chk03_RsltR<D extends XfrSchdMod_DtlR, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdMod_DtlR.$xfr_schd_no, Chk03_RsltR.$xfr_schd_no);
				addColumnPathMap(XfrSchdMod_DtlR.$rqst_mod_flg, Chk03_RsltR.$rqst_mod_flg);
				addColumnPathMap(XfrSchdMod_DtlR.$rqst_can_flg, Chk03_RsltR.$rqst_can_flg);
			}
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
	}
	
	//////////////////////////////////////////////////////////////
	// 共通処理 //
	////////////
	protected void handleSuccess(MCList<?> l, String errFlgCol, String rtnStsTypCol) {
		dbTran().commit();
		for (MCRow r : l) {
			if (!r.getBoolean(errFlgCol)) {
				r.setString(rtnStsTypCol, MAC_RTN_STS_TYP.OK.value());
			}
		}
	}

	protected void handleEx(Exception e, MCList<?> l, String rtnStsTypCol) {
		dbTran().rollback();
		MCException mcex;
		if (e instanceof MCException) {
			mcex = (MCException)e;
		}
		else {
			mcex = new MCException(e);
		}
		MCLog.write(mcex);

		MCMessage msg = mcex.getMCMessage();
		MCMessagePool.add(msg);
		MCMessagePool.addAll(mcex.getCauseMessageList());
		for (MCRow r : l) {
			r.setString(rtnStsTypCol, MAC_RTN_STS_TYP.ERR.value());
		}
	}
	protected FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R> _itmLgGrpLocCache = null;
	protected MCList<MAM_LOC_R> _locCache = null;

	// 品目、出庫物流場所グループに対するデフォルト場所
	protected void itmLgGrpLocCache(MCList<? extends MCRow> list) {
		MCList<? extends MCRow> grpL = list.subList("gi_loc_cd", null).groupBy("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3", "gi_lg_grp_cd");
		MCRow tmpR = list.createRow();

		MCList<MAM_ITM_LG_GRP_R> dbcL = MCList.create(MAM_ITM_LG_GRP_R.class);
		MAM_ITM_LG_GRP_R t = MAM_ITM_LG_GRP_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");
		dbcL.addStringColumn("wg_cd");
		dbcL_bldr.setSelect(t.lg_def_loc_cd);
		dbcL_bldr.addSelect(m1.wg_cd);
		dbcL_bldr.addLeftOuterJoin(m1, bracket( m1.loc_cd.eq(t.lg_def_loc_cd)));

		if (tmpR instanceof MST_XFR_SCHD_R) {
			_itmLgGrpLocCache = new FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R>(dbcL, dbcL_bldr, grpL,
					MST_XFR_SCHD_R.$itm_cd, MST_XFR_SCHD_R.$itm_sub1,
					MST_XFR_SCHD_R.$itm_sub2, MST_XFR_SCHD_R.$itm_sub3,
					MST_XFR_SCHD_R.$gi_lg_grp_cd);
		}
		else if (tmpR instanceof Chk01_RsltR) {
			_itmLgGrpLocCache = new FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R>(dbcL, dbcL_bldr, grpL,
					Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2,
					Chk01_RsltR.$itm_sub3, Chk01_RsltR.$gi_lg_grp_cd);
		}
	}

	protected MAM_ITM_LG_GRP_R getItmLgGrpLocCache(String itmCd, String itmSub1 , String itmSub2 , String itmSub3, String giLgGrpCd) {
		return _itmLgGrpLocCache.get(itmCd, itmSub1 , itmSub2 , itmSub3, giLgGrpCd);
	}
	

	// 物流Ｇに対する物流標準場所
	protected void locCache(MCList<? extends MCRow> list) {
		MCList<? extends MCRow> grpL = list.subList("gi_loc_cd", null).groupBy("gi_lg_grp_cd");
		
		_locCache = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R locCache_t =MAM_LOC_R.create("T");
		MCQueryApiBuilder locCache_bldr = MCQueryApiBuilder.create(locCache_t);
		locCache_bldr.setSelect(locCache_t.loc_cd);
		locCache_bldr.addSelect(locCache_t.lg_grp_cd);
		locCache_bldr.addSelect(locCache_t.wg_cd);
		locCache_bldr.setWhere(locCache_t.lg_grp_cd.eq(bind("gi_lg_grp_cd")));
		locCache_bldr.addWhereWithAnd(locCache_t.lg_def_flg.eq(value(true)));
		dbSelect("MSBEL1000_MAM_LOC_S01", _locCache, locCache_bldr, grpL);
	}

	protected MAM_LOC_R getLocCache(String giLgGrpCd) {
		if (isNull(_locCache)) {
			return null;
		}
		return _locCache.getFirst(MAM_LOC_R.$lg_grp_cd, giLgGrpCd);
	}

	protected MCMessageList chkItm(MCList<MST_XFR_SCHD_R> xfrSchdL, MCIndexKey idxXfrSchdL, MCList<? extends MCRow> trgtL) {
		MCMessageList msgL = new MCMessageList();
		
		MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder itmR_bldr = MCQueryApiBuilder.create(t);
		itmR_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
		itmR_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
		itmR_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
		itmR_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
		dbSelect("MSBEL1000_MAM_ITM_S01", itmL, itmR_bldr, xfrSchdL);
		MCIndexKey idxItmL = itmL.createIndex(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		
		for (MCRow r : trgtL) {
			MST_XFR_SCHD_R xfrSchdR = xfrSchdL.getFirst(idxXfrSchdL, r.getStringNE("xfr_schd_no"));
			if(isNull(xfrSchdR) || xfrSchdR.isEmpty()) {
				continue;
			}
			MAM_ITM_R itmR = itmL.getFirst(idxItmL, xfrSchdR.itm_cd(), xfrSchdR.itm_sub1(), xfrSchdR.itm_sub2(), xfrSchdR.itm_sub3());
			if (isNull(itmR) || itmR.isEmpty()) {
				msgL.add(new MCMessage(r, null, MAUAL0189
						, toDispItm(xfrSchdR.itm_cd(), xfrSchdR.itm_sub1(), xfrSchdR.itm_sub2(), xfrSchdR.itm_sub3())
						, toDispGUIIndex(r)));
				r.setBooleanNE("err_flg" , true);
			}
		}
		return msgL;
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 返品元の支給計上日の取得を行う。<br>
	 */
	public class Sprt01 extends MSBEL_XfrSchdReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 各データを取得して、設定する。
			MCList<Sprt01_RsltR> chkL = up0().subList(Sprt01_RsltR.$trd_ptn_typ, MAC_TRD_PTN_TYP.PROV_RTN.value());
			MCList<Sprt01_RsltR> dlvSlipNoL = MCList.create(Sprt01_RsltR.class);
			MCList<Sprt01_RsltR> provActNoL = MCList.create(Sprt01_RsltR.class);
			MCList<Sprt01_RsltR> retL = MCList.create(Sprt01_RsltR.class);

			for (Sprt01_RsltR r : chkL) {
				if (isNull(r.base_ac_dt())) {
					if (!isNull(r.base_dlv_slip_no())) {
						dlvSlipNoL.add(r);
					}
					else if (!isNull(r.base_prov_act_no())) {
						provActNoL.add(r);
					}
				}
			}

			retL.addAll(getDlvSlipNo(dlvSlipNoL));
			retL.addAll(getProvActNo(provActNoL));

			for (Sprt01_RsltR chkR : chkL) {
				if (!isNull(chkR.base_ac_dt())) {
					continue;
				}
				Sprt01_RsltR retR = null;
				if (!isNull(chkR.base_dlv_slip_no())) {
					retR = retL.getFirst(Sprt01_RsltR.$base_dlv_slip_no, chkR.base_dlv_slip_no());
				}
				else if (!isNull(chkR.base_prov_act_no())) {
					retR = retL.getFirst(Sprt01_RsltR.$base_prov_act_no, chkR.base_prov_act_no());
				}
				if (!isNull(retR)) {
					chkR.base_ac_dt(retR.base_ac_dt());
				}
				else {
					MCMessagePool.add(new MCMessage(chkR, Sprt01_RsltR.$base_ac_dt, MSBEL1104
							, chkR.base_dlv_slip_no()
							, chkR.base_prov_act_no()
							, toDispGUIIndex(chkR)));
				}
			}

			setDown();
		}

		protected MCList<Sprt01_RsltR> getDlvSlipNo(MCList<Sprt01_RsltR> dlvSlipNoL) {

			MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
			MST_XFR_ACT_D_R t1 = MST_XFR_ACT_D_R.create("T1");
			MST_ARR_ACT_R t2 = MST_ARR_ACT_R.create("T2");
			MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
			MST_SHIP_ACT_D_R t4 = MST_SHIP_ACT_D_R.create("T4");

			MCQueryApiBuilder provActR_bldr = MCQueryApiBuilder.create(t);
			provActR_bldr.setSelect(t.ac_dt.as("base_ac_dt"));
			provActR_bldr.addSelect(
				cases().when(t.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.XFR.value())))
					.then(t1.dlv_slip_no)
					.when(t.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.SHIP.value())))
					.then(t3.dlv_slip_no)
					.when(t.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.RET_SHIP.value())))
					.then(t4.dlv_slip_no)
					.otherwise(t.dlv_slip_no)
					.as("base_dlv_slip_no"));
			provActR_bldr.addLeftOuterJoin(t1, t.prov_src_act_no.eq(t1.xfr_act_d_no));
			provActR_bldr.addLeftOuterJoin(t2, t.prov_src_act_no.eq(t2.arr_act_no));
			provActR_bldr.addLeftOuterJoin(t3, t2.arr_schd_no.eq(t3.arr_schd_no));
			provActR_bldr.addLeftOuterJoin(t4, t.prov_src_act_no.eq(t4.ship_act_d_no));
			provActR_bldr.setWhere(t.slip_sts_typ.eq(bind("slip_sts_typ")));
			provActR_bldr.addWhereWithAnd(bracket(
				t.dlv_slip_no.eq(bind("base_dlv_slip_no"))
				.or(t1.dlv_slip_no.eq(bind("base_dlv_slip_no")))
				.or(t3.dlv_slip_no.eq(bind("base_dlv_slip_no")))
				.or(t4.dlv_slip_no.eq(bind("base_dlv_slip_no")))
			));
			dlvSlipNoL.addStringColumn("slip_sts_typ", MAC_SLIP_STS_TYP.CRT.value());
			dbSelect("MSBEL1000_MST_PROV_ACT_S01", dlvSlipNoL, provActR_bldr, dlvSlipNoL);

			return dlvSlipNoL;

		}

		protected MCList<Sprt01_RsltR> getProvActNo(MCList<Sprt01_RsltR> provActNoL) {

			MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder provActR_bldr = MCQueryApiBuilder.create(t);

			provActR_bldr.setSelect(t.ac_dt.as("base_ac_dt"));
			provActR_bldr.addSelect(t.prov_act_no.as("base_prov_act_no"));
			provActR_bldr.setWhere(t.slip_sts_typ.eq(bind("slip_sts_typ")));
			provActR_bldr.addWhereWithAnd(t.prov_act_no.eq(bind("base_prov_act_no")));
			provActNoL.addStringColumn("slip_sts_typ", MAC_SLIP_STS_TYP.CRT.value());
			dbSelect("MSBEL1000_MST_PROV_ACT_S02", provActNoL, provActR_bldr, provActNoL);

			return provActNoL;

		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}

	//FMCB CUSTOM END
}