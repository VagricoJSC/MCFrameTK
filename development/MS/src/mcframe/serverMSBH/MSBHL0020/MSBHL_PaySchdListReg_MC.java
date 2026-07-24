package mcframe.serverMSBH.MSBHL0020;

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
import mcframe.serverMSBH.MSBHL0020.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBH.MSBHL0020.Query.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;

import mcframe.serverMSBH.MSBHL5010.MSBHL_ApUtil;
import mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService;
import mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_CndR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_RsltR;
import mcframe.serverMSBH.MSBHL5090.*;

import mcframe.commonCore.param.MCParam;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_PaySchdListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_PaySchdListReg_MC extends MSBHL_PaySchdListReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 未照合の買掛明細情報を検索し、支払照合ヘッダ単位にまとめます。<br>
	 */
	public class Srch01 extends MSBHL_PaySchdListReg_MC_A.Srch01 {
		
		protected MCNumber _nextHdrPegNo = MCNumber.ZERO;
		
		protected FXUCL_Cache<MCList<Srch01_RsltR>> _apdCache;
		
		protected FXUCL_Cache<MCList<Srch01_PayActR>> _payActCache;
		
		protected FXUCL_Cache<MCList<Srch01_AdvPayActR>> _advPayActCache;
		
		protected FXUCL_Cache<PaySchd_Srch02_RsltR> _paySchdSrch02Cache;
		
		protected void putApdCache(MCList<Srch01_RsltR> apdL) {
			if (_apdCache == null) {
				_apdCache = new FXUCL_Cache<>();
				_apdCache.setFixMaxCacheSize(-1);
			}
			for (MCList<Srch01_RsltR> grpL : apdL.groupList(Srch01_RsltR.$hdr_peg_no)) {
				Comparable<?>[] key = {grpL.get(0).hdr_peg_no()};
				_apdCache.putCache(key, grpL);
			}
		}
		
		protected MCList<Srch01_RsltR> getApdL(MCNumber hdrPegNo) {
			if (_apdCache == null) {
				_apdCache = new FXUCL_Cache<>();
				_apdCache.setFixMaxCacheSize(-1);
			}
			return _apdCache.getCache(hdrPegNo);
		}
		
		protected void putPayActCache(MCList<Srch01_PayActR> payActL) {
			if (_payActCache == null) {
				_payActCache = new FXUCL_Cache<>();
				_payActCache.setFixMaxCacheSize(-1);
			}
			for (MCList<Srch01_PayActR> grpL : payActL.groupList(Srch01_PayActR.$hdr_peg_no)) {
				Comparable<?>[] key = {grpL.get(0).hdr_peg_no()};
				_payActCache.putCache(key, grpL);
			}
		}
		
		protected MCList<Srch01_PayActR> getPayActL(MCNumber hdrPegNo) {
			if (_payActCache == null) {
				_payActCache = new FXUCL_Cache<>();
				_payActCache.setFixMaxCacheSize(-1);
			}
			return _payActCache.getCache(hdrPegNo);
		}
		protected void putAdvPayActCache(MCList<Srch01_AdvPayActR> advPayActL) {
			if (_advPayActCache == null) {
				_advPayActCache = new FXUCL_Cache<>();
				_advPayActCache.setFixMaxCacheSize(-1);
			}
			for (MCList<Srch01_AdvPayActR> grpL : advPayActL.groupList(Srch01_PayActR.$hdr_peg_no)) {
				Comparable<?>[] key = {grpL.get(0).hdr_peg_no()};
				_advPayActCache.putCache(key, grpL);
			}
		}
		
		protected MCList<Srch01_AdvPayActR> getAdvPayActL(MCNumber hdrPegNo) {
			if (_advPayActCache == null) {
				_advPayActCache = new FXUCL_Cache<>();
				_advPayActCache.setFixMaxCacheSize(-1);
			}
			return _advPayActCache.getCache(hdrPegNo);
		}
		
		protected void putPaySchdSrch02Cache(MCList<PaySchd_Srch02_RsltR> paySchdSrch02L) {
			if (_paySchdSrch02Cache == null) {
				_paySchdSrch02Cache = new FXUCL_Cache<>();
				_paySchdSrch02Cache.setFixMaxCacheSize(-1);
			}
			for (PaySchd_Srch02_RsltR r : paySchdSrch02L) {
				Comparable<?>[] key = {r.hdr_peg_no()};
				_paySchdSrch02Cache.putCache(key, r);
			}
		}
		
		protected PaySchd_Srch02_RsltR getPaySchdSrch02R(MCNumber hdrPegNo) {
			if (_paySchdSrch02Cache == null) {
				_paySchdSrch02Cache = new FXUCL_Cache<>();
				_paySchdSrch02Cache.setFixMaxCacheSize(-1);
			}
			return _paySchdSrch02Cache.getCache(hdrPegNo);
		}
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			editUp();
			
			MCQueryPlan sql = MSBHL0020_MST_AP_D_S01();
			searchForDL(sql, up0(), down0(), getGrpColsForSrch());
		}
		
		protected void editUp() {
			if (isNull(up0().reg_dt())) {
				up0().reg_dt(getToday());
			}
			if (up0().manual_flg()) {
				up0().addStringColumn("manual_flg_str", toFalseStr(false));
			}
			up0().addStringColumn("pay_spot_flg_str", toTrueStr(up0().pay_spot_flg()));
			up0().addStringColumn("batch_pay_schd_cl_flg_str", toTrueStr(up0().batch_pay_schd_cl_flg()));
			
			if (!isNull(up0().pay_chk_no())
					|| !isNullAnd(up0().reg_dt_fr(), up0().reg_dt_to())
					|| !up0().aprv_none_flg()
					|| !isNull(up0().pay_schd_d_print_rmrks())
					|| !isNullAnd(up0().intr_rmrks(), up0().sub_char1(), up0().sub_char2(), up0().sub_char3())) {
				up0().unchk_flg(false);
			}
			
			if (isIns()) {
				if (up0().inc_no_pay_flg()) {
					up0().addStringColumn("ins_flg_str", "1");
				}
			}
			else {
				up0().addStringColumn("not_ins_flg_str", "1");
				if (!up0().schd_flg() && !up0().act_flg()) {
					up0().addStringColumn("no_chked_flg_str", "1");
				}
			}
			
			if (!up0().inc_no_pay_flg()) {
				up0().addStringColumn("inc_no_pay_flg_str", "1");
			}
			
			if (up0().new_flg()) {
				up0().addStringColumn("new_flg_str", "1");
			}
			
			if (up0().not_prnt_flg()) {
				up0().addStringColumn("not_prnt_flg_str", "0");
			}
			
			if (up0().prnt_flg()) {
				up0().addStringColumn("prnt_flg_str", "1");
			}
		}
		
		protected String[] getGrpColsForSrch() {
			ArrayList<String> grpColsForSrch = new ArrayList<>();
			grpColsForSrch.add(Srch01_RsltR.$psppl_cd);
			grpColsForSrch.add(Srch01_RsltR.$bsppl_cd);
			grpColsForSrch.add(Srch01_RsltR.$bsppl_dpt_cd);
			return grpColsForSrch.toArray(new String[0]);
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			// 未照合と照合済に分離する
			MCList<Srch01_RsltR> unchkL = MCList.create(Srch01_RsltR.class);
			MCList<Srch01_RsltR> chkedL = MCList.create(Srch01_RsltR.class);
			
			for (Srch01_RsltR r : down0()) {
				if (!isNull(r.ap_d_no())) {
					unchkL.add(r);
				}
				else if (!isNull(r.pay_chk_mng_no())) {
					chkedL.add(r);
				}
			}
			
			down0().clear();
			
			// 未照合をまとめる
			MCList<Srch01_RsltR> hdrL = MCList.create(Srch01_RsltR.class);
			callPaySchdRegServiceSrch02(unchkL, hdrL);
			
			// 買掛明細なし期間を作成する
			mergePaySchdHdr(hdrL, chkedL);
			
			// 支払実績を取得する
			callPaySchdRegServiceSrch07(hdrL);
			// 今回支払金額を設定する
			callPaySchdRegServiceSrch06(hdrL);
			// 前渡金実績を設定する
			callPaySchdRegServiceSrch08(hdrL);
			
			// まとめた未照合と照合済をデータを編集する
			down0().addAll(chkedL);
			down0().addAll(hdrL);
			setValuesDbc(up0(), down0());
			editDown();
			removeDown();
			setDown();
			sortDown();
		}

		/**
		 * 支払予定登録サービスの買掛明細まとめを実行し、支払予定鑑を作成する。
		 * @param apDL 支払予定作成対象の買掛明細
		 */
		protected void callPaySchdRegServiceSrch02(MCList<Srch01_RsltR> apDL, MCList<Srch01_RsltR> rsltL) {
			if (isNull(apDL)) {
				return ;
			}

			MSBHL_PaySchdRegService.PaySchd_Srch02 ope = MSBHL_PaySchdRegService.crtPaySchd_Srch02();
			
			for (Srch01_RsltR apDR : apDL) {
				
				PaySchd_Srch02_CndR cndR = PaySchd_Srch02_CndR.create();
				
				cndR.ap_d_no(apDR.ap_d_no());
				cndR.sppl_cd(apDR.sppl_cd());
				cndR.bsppl_cd(apDR.bsppl_cd());
				cndR.bsppl_dpt_cd(apDR.bsppl_dpt_cd());
				cndR.purc_act_no(apDR.purc_act_no());
				cndR.rcpt_iv_mng_no(apDR.rcpt_iv_mng_no());
				cndR.rcpt_iv_no(apDR.rcpt_iv_no());
				cndR.trd_cur_cd(apDR.trd_cur_cd());
				cndR.pay_schd_dt(apDR.pay_schd_dt());
				cndR.bsppl_cl_dt(apDR.bsppl_cl_dt());
				cndR.bsppl_cl_day(apDR.bsppl_cl_day());
				cndR.wrk_no(apDR.wrk_no());
				cndR.trd_ptn_typ(apDR.trd_ptn_typ());
				cndR.itm_cd(apDR.itm_cd());
				cndR.itm_sub1(apDR.itm_sub1());
				cndR.itm_sub2(apDR.itm_sub2());
				cndR.itm_sub3(apDR.itm_sub3());
				cndR.trd_cur_amt(apDR.trd_cur_amt());
				cndR.trd_cur_tax_amt(apDR.trd_cur_tax_amt());
				cndR.reg_dt(up0().reg_dt());
				
				ope.up0().add(cndR);
			}
			
			setPegNo(ope.up0());
			ope.exec();
			
			MCList<Srch01_RsltR> apdL = MCList.create(Srch01_RsltR.class);
			MCIndexKey apDNoSrch02Idxkey = ope.down0().createIndex(PaySchd_Srch02_CndR.$ap_d_no);
			
			for (Srch01_RsltR apDR : apDL) {
				
				PaySchd_Srch02_CndR srch02CndR = ope.down0().getFirst(apDNoSrch02Idxkey, apDR.ap_d_no());
				
				if (!srch02CndR.err_flg()) {
					apDR.hdr_peg_no(srch02CndR.hdr_peg_no());
					apdL.add(apDR);
				}
			}
			
			MCIndexKey down01Idxkey = apdL.createIndex(Srch01_RsltR.$hdr_peg_no);
			
			for (PaySchd_Srch02_RsltR srch02RsltR : ope.down1()) {
				
				MCList<Srch01_RsltR> grpL = apdL.subList(down01Idxkey, srch02RsltR.hdr_peg_no());

				Srch01_RsltR hdrR = grpL.get(0).clone();

				grpL.sort(Srch01_RsltR.$ap_d_no);
				hdrR.hdr_peg_no(srch02RsltR.hdr_peg_no());
				if (isIns()) {
					hdrR.reg_dt(up0().reg_dt());
				}
				hdrR.bsppl_cd(srch02RsltR.bsppl_cd());
				hdrR.bsppl_dpt_cd(srch02RsltR.bsppl_dpt_cd());
				hdrR.purc_act_no(srch02RsltR.purc_act_no());
				hdrR.rcpt_iv_mng_no(srch02RsltR.rcpt_iv_mng_no());
				hdrR.rcpt_iv_no(srch02RsltR.rcpt_iv_no());
				hdrR.wrk_no(srch02RsltR.wrk_no());
				hdrR.trd_cur_cd(srch02RsltR.trd_cur_cd());
				hdrR.bsppl_cl_day(srch02RsltR.bsppl_cl_day());
				hdrR.bsppl_cl_dt(srch02RsltR.bsppl_cl_dt());
				hdrR.amt(srch02RsltR.amt());
				hdrR.purc_amt(srch02RsltR.purc_amt());
				hdrR.purc_ret_amt(srch02RsltR.purc_ret_amt());
				hdrR.purc_dscnt_amt(srch02RsltR.purc_dscnt_amt());
				hdrR.tax_amt(srch02RsltR.tax_amt());
				hdrR.sw_to_amt(srch02RsltR.sw_to_amt());
				hdrR.min_ac_dt((MCDate) grpL.min(Srch01_RsltR.$ac_dt));
				hdrR.max_ac_dt((MCDate) grpL.max(Srch01_RsltR.$ac_dt));
				hdrR.inc_interim_flg(grpL.getFirst(Srch01_RsltR.$interim_flg, true) != null);
				hdrR.pay_xrate(srch02RsltR.pay_xrate());
				
				srch02RsltR.not_lock_flg(true);
				
				rsltL.add(hdrR);
			}
			
			if (MCNumber.ZERO.neq(_nextHdrPegNo)) {
				for (Srch01_RsltR r : rsltL) {
					r.hdr_peg_no(MCNumber.sum(r.hdr_peg_no(), _nextHdrPegNo));
				}
				for (Srch01_RsltR r : apdL) {
					r.hdr_peg_no(MCNumber.sum(r.hdr_peg_no(), _nextHdrPegNo));
				}
				for (PaySchd_Srch02_RsltR r : ope.down1()) {
					r.hdr_peg_no(MCNumber.sum(r.hdr_peg_no(), _nextHdrPegNo));
				}
			}
			_nextHdrPegNo = nvl((MCNumber)rsltL.max(Srch01_RsltR.$hdr_peg_no), MCNumber.ZERO).add(1);
			
			putPaySchdSrch02Cache(ope.down1());
			
			if (isIns()) {
				putApdCache(apdL);
			}
			
		}
		
		/**
		 * 操作種別「登録する」、かつ、支払対象外含むがオンの場合、買掛明細なし期間を作成する
		 */
		protected void mergePaySchdHdr(MCList<Srch01_RsltR> hdrL, MCList<Srch01_RsltR> chkedL) {
			if (!isIns() || !up0().inc_no_pay_flg()) {
				return ;
			}
			
			MCList<Srch01_RsltR> allL = MCList.create(Srch01_RsltR.class);
			allL.addAll(hdrL.subList(r -> !r.pay_spot_flg() && !isNull(r.bsppl_cl_dt())));
			allL.addAll(chkedL.subList(r -> !r.pay_spot_flg() && !isNull(r.bsppl_cl_dt())));
			
			String[] hdrGrpKeys = {
					Srch01_RsltR.$bsppl_cd,
					Srch01_RsltR.$bsppl_dpt_cd,
					Srch01_RsltR.$purc_act_no,
					Srch01_RsltR.$rcpt_iv_mng_no,
					Srch01_RsltR.$rcpt_iv_no,
					Srch01_RsltR.$wrk_no,
					Srch01_RsltR.$trd_cur_cd
			};
			
			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t);
			bpL_bldr.setWhere(t.bp_cd.eq(bind("bsppl_cd")));
			dbSelect("MSBHL0020_MAM_BP_S01", bpL, bpL_bldr, allL.distinctNE(Srch01_RsltR.$bsppl_cd));
			FXUCL_Cache<MAM_BP_R> bpCache = new FXUCL_Cache<>();
			for (MAM_BP_R bpR : bpL) {
				Comparable<?>[] key = {bpR.bp_cd()};
				bpCache.putCache(key, bpR);
			}
			
			MCList<Srch01_RsltR> mergeL = MCList.create(Srch01_RsltR.class);
			MST_AP_D_R cndR = MST_AP_D_R.create();
			for (MCList<Srch01_RsltR> grpL : allL.groupList(hdrGrpKeys)) {
				sortDown(grpL, false);
				
				// 照合済最新締年月日の翌月は補完する
				Srch01_RsltR latestR = grpL.get(0);
				MAM_BP_R bspplR = bpCache.getCache(latestR.bsppl_cd());
				cndR.clear();
				cndR.bsppl_cd(latestR.bsppl_cd());
				cndR.pay_crryovr_times(1);
				if (!isNull(latestR.pay_chk_mng_no())) {
					cndR.pay_basis_dt(latestR.bsppl_cl_dt());
					Comparable<?>[] bspplClDts = MSBHL_ApUtil.getBspplClDt(
							cndR, MST_AP_D_R.$pay_basis_dt, MST_AP_D_R.$pay_crryovr_times, bspplR,
							MAM_BP_R.$psppl_cl_day1, MAM_BP_R.$psppl_cl_day2,
							MAM_BP_R.$psppl_cl_day3, MAM_BP_R.$psppl_cl_day4,
							MAM_BP_R.$psppl_cl_day5);
					if (bspplClDts == null) {
						continue;
					}
					MCDate nextClDt = (MCDate)bspplClDts[0];
					MCNumber nextClDay = (MCNumber)bspplClDts[1];
					if (isNull(up0().bsppl_cl_dt_to()) || nextClDt.lte(up0().bsppl_cl_dt_to())) {
						Srch01_RsltR tmpR = crtMergeHdrR(latestR, nextClDt, nextClDay);
						mergeL.add(tmpR);
					}
				}
				
				// 歯抜け期間を補完する
				if (grpL.size() > 1) {
					MCList<Srch01_RsltR> tgtL = MCList.create(Srch01_RsltR.class);
					for (Srch01_RsltR r : grpL) {
						if (isNull(r.pay_chk_mng_no())) {
							tgtL.add(r);
						}
						else {
							tgtL.add(r);
							break;
						}
					}
					if (tgtL.size() > 1) {
						for (int i = tgtL.size()-1 ; i > 0  ; i--) {
							MCDate curClDt = tgtL.get(i).bsppl_cl_dt();
							MCDate toClDt = tgtL.get(i-1).bsppl_cl_dt();
							if (curClDt.gte(toClDt)) {
								continue;
							}
							
							while (true) {
								cndR.pay_basis_dt(curClDt);
								Comparable<?>[] bspplClDts = MSBHL_ApUtil.getBspplClDt(
										cndR, MST_AP_D_R.$pay_basis_dt, MST_AP_D_R.$pay_crryovr_times, bspplR,
										MAM_BP_R.$psppl_cl_day1, MAM_BP_R.$psppl_cl_day2,
										MAM_BP_R.$psppl_cl_day3, MAM_BP_R.$psppl_cl_day4,
										MAM_BP_R.$psppl_cl_day5);
								if (bspplClDts == null) {
									break;
								}
								MCDate nextClDt = (MCDate)bspplClDts[0];
								MCNumber nextClDay = (MCNumber)bspplClDts[1];
								if (isNull(nextClDt) || nextClDt.gte(toClDt)) {
									break;
								}
								Srch01_RsltR tmpR = crtMergeHdrR(latestR, nextClDt, nextClDay);
								mergeL.add(tmpR);
								curClDt = nextClDt;
							}
						}
					}
				}
			}
			
			hdrL.addAll(mergeL);
			
			// 支払実績取得のため、補完したヘッダに対するPaySchd_Srch02_RsltRを作成する
			MCList<PaySchd_Srch02_RsltR> paySchdSrch02L = MCList.create(PaySchd_Srch02_RsltR.class);
			for (Srch01_RsltR r : mergeL) {
				PaySchd_Srch02_RsltR tmpR = PaySchd_Srch02_RsltR.create();
				
				tmpR.hdr_peg_no(r.hdr_peg_no());
				tmpR.bsppl_cd(r.bsppl_cd());
				tmpR.bsppl_dpt_cd(r.bsppl_dpt_cd());
				tmpR.purc_act_no(r.purc_act_no());
				tmpR.rcpt_iv_no(r.rcpt_iv_no());
				tmpR.rcpt_iv_mng_no(r.rcpt_iv_mng_no());
				tmpR.trd_cur_cd(r.trd_cur_cd());
				tmpR.wrk_no(r.wrk_no());
				tmpR.bsppl_cl_day(r.bsppl_cl_day());
				tmpR.bsppl_cl_dt(r.bsppl_cl_dt());
				tmpR.pay_spot_flg(r.pay_spot_flg());
				tmpR.amt(r.amt());
				tmpR.purc_amt(r.purc_amt());
				tmpR.purc_ret_amt(r.purc_ret_amt());
				tmpR.purc_dscnt_amt(r.purc_dscnt_amt());
				tmpR.tax_amt(r.tax_amt());
				
				tmpR.not_lock_flg(false);
				
				paySchdSrch02L.add(tmpR);
			}
			
			putPaySchdSrch02Cache(paySchdSrch02L);
		}
		
		protected Srch01_RsltR crtMergeHdrR(Srch01_RsltR srcR, MCDate bspplClDt, MCNumber bspplClDay) {
			Srch01_RsltR hdrR = srcR.clone();
			
			// 補完項目
			hdrR.hdr_peg_no(_nextHdrPegNo);
			if (isIns()) {
				hdrR.reg_dt(up0().reg_dt());
			}
			hdrR.bsppl_cl_dt(bspplClDt);
			hdrR.bsppl_cl_day(bspplClDay);
			_nextHdrPegNo = _nextHdrPegNo.add(1);
			
			// 買掛金額項目
			hdrR.amt(0);
			hdrR.purc_amt(0);
			hdrR.purc_ret_amt(0);
			hdrR.purc_dscnt_amt(0);
			hdrR.tax_amt(0);
			hdrR.min_ac_dt(null);
			hdrR.max_ac_dt(null);
			hdrR.inc_interim_flg(false);

			// 支払照合ヘッダのみ項目
			hdrR.pay_chk_mng_no(null);
			hdrR.pay_chk_no(null);
			hdrR.pay_sts_typ(null);
			hdrR.aprv_no(null);
			hdrR.aprv_sts_typ(null);
			hdrR.aprv_flg(false);
			hdrR.aprv_upd_flg(false);
			hdrR.aprv_can_flg(false);
			hdrR.pay_schd_d_print_rmrks(null);
			hdrR.intr_rmrks(null);
			hdrR.sub_char1(null);
			hdrR.sub_char2(null);
			hdrR.sub_char3(null);
			hdrR.ins_usr_id(null);
			hdrR.ins_usr_nm(null);
			hdrR.ins_func_id(null);
			hdrR.ins_ts(null);
			hdrR.upd_usr_id(null);
			hdrR.upd_usr_nm(null);
			hdrR.upd_func_id(null);
			hdrR.upd_ts(null);
			hdrR.upd_srv_req_no(null);
			
			return hdrR;
		}
		
		/**
		 * 支払実績を取得する。
		 */
		protected void callPaySchdRegServiceSrch07(MCList<Srch01_RsltR> hdrL) {
			if (isNull(hdrL)) {
				return ;
			}
			
			MSBHL_PaySchdRegService.PaySchd_Srch07 ope = MSBHL_PaySchdRegService.crtPaySchd_Srch07();
			for (Srch01_RsltR r : hdrL) {
				PaySchd_Srch07_CndR cndR = PaySchd_Srch07_CndR.create();
				cndR.hdr_peg_no(r.hdr_peg_no());
				cndR.pay_chk_mng_no(r.pay_chk_mng_no());
				cndR.bsppl_cd(r.bsppl_cd());
				cndR.bsppl_dpt_cd(r.bsppl_dpt_cd());
				cndR.trd_cur_cd(r.trd_cur_cd());
				cndR.bsppl_cl_dt(r.bsppl_cl_dt());
				cndR.pay_spot_flg(r.pay_spot_flg());
				cndR.reg_only_flg(!isIns());
				ope.up0().add(cndR);
			}
			ope.exec();
			
			if (isIns()) {
				MCList<Srch01_PayActR> payActL = MCList.create(Srch01_PayActR.class);
				for (mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_RsltR r : ope.down0()) {
					Srch01_PayActR tmpR = Srch01_PayActR.create();
					tmpR.hdr_peg_no(r.hdr_peg_no());
					tmpR.pay_act_d_no(r.pay_act_d_no());
					tmpR.pay_act_d_seq(r.pay_act_d_seq());
					tmpR.pay_chk_mng_no(r.pay_chk_mng_no());
					tmpR.upd_cntr(r.upd_cntr());
					tmpR.pay_act_upd_cntr(r.pay_act_upd_cntr());
					payActL.add(tmpR);
				}
				putPayActCache(payActL);
			}
		}
		/**
		 * 支払金額を設定する。
		 */
		protected void callPaySchdRegServiceSrch06(MCList<Srch01_RsltR> hdrL) {
			if (isNull(hdrL)) {
				return ;
			}
			
			MSBHL_PaySchdRegService.PaySchd_Srch06 ope = MSBHL_PaySchdRegService.crtPaySchd_Srch06();
			for (Srch01_RsltR r : hdrL) {
				ope.up0().add(getPaySchdSrch02R(r.hdr_peg_no()));
				addAll(ope.up1(), getPayActL(r.hdr_peg_no()), createMap_PaySchd_Srch02_PayActR_Srch01_PayActR());
			}
			ope.exec();
			
			String[] destCols = {
					Srch01_RsltR.$last_pay_schd_amt, 
					Srch01_RsltR.$bfw_amt,
					Srch01_RsltR.$account_amt,
					Srch01_RsltR.$cash_amt,
					Srch01_RsltR.$note_amt,
					Srch01_RsltR.$setoff_amt,
					Srch01_RsltR.$sw_amt,
					Srch01_RsltR.$schd_pay_amt,
					Srch01_RsltR.$setoff_tax_amt,
					Srch01_RsltR.$adv_pay_bal
			};
			String[] srcCols = {
					PaySchd_Srch02_RsltR.$last_pay_schd_amt, 
					PaySchd_Srch02_RsltR.$bfw_amt,
					PaySchd_Srch02_RsltR.$account_amt,
					PaySchd_Srch02_RsltR.$cash_amt,
					PaySchd_Srch02_RsltR.$note_amt,
					PaySchd_Srch02_RsltR.$setoff_amt,
					PaySchd_Srch02_RsltR.$sw_amt,
					PaySchd_Srch02_RsltR.$schd_pay_amt,
					PaySchd_Srch02_RsltR.$setoff_tax_amt,
					PaySchd_Srch02_RsltR.$adv_pay_bal
			};
			
			copyByPegNo(hdrL, ope.down0(), Srch01_RsltR.$hdr_peg_no, destCols, PaySchd_Srch02_RsltR.$hdr_peg_no, srcCols);
		}
		protected void callPaySchdRegServiceSrch08(MCList<Srch01_RsltR> hdrL) {
			if (isNull(hdrL)) {
				return ;
			}
			MSBHL_PaySchdRegService.PaySchd_Srch08 ope = MSBHL_PaySchdRegService.crtPaySchd_Srch08();
			for (Srch01_RsltR r : hdrL) {
				PaySchd_Srch07_CndR cndR = PaySchd_Srch07_CndR.create();
				cndR.hdr_peg_no(r.hdr_peg_no());
				cndR.pay_chk_mng_no(r.pay_chk_mng_no());
				cndR.bsppl_cd(r.bsppl_cd());
				cndR.bsppl_dpt_cd(r.bsppl_dpt_cd());
				cndR.trd_cur_cd(r.trd_cur_cd());
				cndR.bsppl_cl_dt(r.bsppl_cl_dt());
				cndR.pay_spot_flg(r.pay_spot_flg());
				cndR.reg_only_flg(!isIns());
				ope.up0().add(cndR);
			}
			ope.exec();
			
			if (isIns()) {
				MCList<Srch01_AdvPayActR> advPayActL = MCList.create(Srch01_AdvPayActR.class);
				for (mcframe.serverMSBH.MSBHL5030.PaySchd_Srch08_RsltR r : ope.down0()) {
					Srch01_AdvPayActR tmpR = Srch01_AdvPayActR.create();
					tmpR.hdr_peg_no(r.hdr_peg_no());
					tmpR.adv_pay_act_no(r.adv_pay_act_no());
					tmpR.adv_pay_act_seq(r.adv_pay_act_seq());
					tmpR.pay_chk_mng_no(r.pay_chk_mng_no());
					tmpR.adv_pay_upd_cntr(r.adv_pay_upd_cntr());
					advPayActL.add(tmpR);
				}
				putAdvPayActCache(advPayActL);
			}
		}
		
		protected void editDown() {
			for (Srch01_RsltR rsltR : down0()) {
				rsltR.base_cur_cd(getCo().base_cur_cd());
				rsltR.xrate_cd(getCo().purc_xrate_cd());
				rsltR.pay_xrate_cd(!isSame(rsltR.base_cur_cd(), rsltR.trd_cur_cd()) ? getCo().pay_xrate_cd() : null);
				rsltR.setDateNE("xrate_base_dt", nvl(rsltR.bsppl_cl_dt(), rsltR.reg_dt()));
				
				if (!isNull(rsltR.bsppl_cl_dt())) {
					rsltR.bsppl_cl_ym(rsltR.bsppl_cl_dt().startOfMonth());
				}
				
				if (isNull(rsltR.pay_chk_mng_no())) {
					rsltR.unchk_flg(true);
				}
				else if(MSC_PAY_STS_TYP.isPAY(rsltR.pay_sts_typ())) {
					rsltR.act_flg(true);
				}
				else {
					rsltR.schd_flg(true);
				}
				
				rsltR.manual_flg(!rsltR.pay_spot_flg() && !rsltR.batch_pay_schd_cl_flg());
				if (!isNull(rsltR.setoff_amt())) {
					rsltR.setoff_amt(rsltR.setoff_amt().multiply(-1));
				}
			}
			
			if (isIns()) {
				execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_PURC_XRATE_NE", "01"), MABCFunction.getFunctionExecuter("MAPA_XCHNG$F_GET_PURC_XRATE_NE"), Srch01_RsltR.$xrate, down0(),
						Srch01_RsltR.$trd_cur_cd, Srch01_RsltR.$reg_dt);
				execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_XRATE_NE", "01"), MABCFunction.getFunctionExecuter("MAPA_XCHNG$F_GET_XRATE_NE"), Srch01_RsltR.$pay_xrate, down0().subList(r -> !isNull(r.pay_xrate_cd())),
						Srch01_RsltR.$trd_cur_cd, Srch01_RsltR.$base_cur_cd, Srch01_RsltR.$pay_xrate_cd, "xrate_base_dt");
			}
		}
		
		protected void removeDown() {
			if (!isNullAnd(up0().purc_act_no(), up0().rcpt_iv_mng_no(), up0().rcpt_iv_no())) {
				MCList<Srch01_RsltR> l = MCList.create(Srch01_RsltR.class);
				
				for (Srch01_RsltR r : down0()) {
					if (isNull(up0().purc_act_no()) || isLike(r.purc_act_no(), up0().purc_act_no())) {
						if (isNull(up0().rcpt_iv_mng_no()) || isLike(r.rcpt_iv_mng_no(), up0().rcpt_iv_mng_no())) {
							if (isNull(up0().rcpt_iv_no()) || isLike(r.rcpt_iv_no(), up0().rcpt_iv_no())) {
								l.add(r);
							}
						}
					}
				}
				
				down0().setAll(l);
			}
			
			if (!isNullAnd(up0().bsppl_cl_dt_fr(), up0().bsppl_cl_dt_to())) {
				MCList<Srch01_RsltR> l = MCList.create(Srch01_RsltR.class);
				
				for (Srch01_RsltR r : down0()) {
					if (isNull(up0().bsppl_cl_dt_fr()) || up0().bsppl_cl_dt_fr().lte(r.bsppl_cl_dt())) {
						if (isNull(up0().bsppl_cl_dt_to()) || up0().bsppl_cl_dt_to().gte(r.bsppl_cl_dt())) {
							l.add(r);
						}
					}
				}
				
				down0().setAll(l);
			}
			
			{
				MCList<Srch01_RsltR> l = MCList.create(Srch01_RsltR.class);
				
				for (Srch01_RsltR r : down0()) {
					if (up0().unchk_flg() && r.unchk_flg()) {
						l.add(r);
					}
					else if (up0().schd_flg() && r.schd_flg()) {
						l.add(r);
					}
					else if (up0().act_flg() && r.act_flg()) {
						l.add(r);
					}
				}
				
				down0().setAll(l);
			}
			
			if (up0().inc_interim_flg()) {
				MCList<Srch01_RsltR> l = MCList.create(Srch01_RsltR.class);
						
				for (Srch01_RsltR r : down0()) {
					if (r.inc_interim_flg()) {
						l.add(r);
					}
				}
				
				down0().setAll(l);
			}
			
			if ((up0().aprv_opn_flg() && up0().aprv_fix_flg() && up0().aprv_acpt_flg()
					&& up0().aprv_rjct_flg() && up0().aprv_last_rjct_flg()
					&& up0().aprv_none_flg()) == false) {
				MCList<Srch01_RsltR> l = MCList.create(Srch01_RsltR.class);
						
				for (Srch01_RsltR r : down0()) {
					if (r.unchk_flg()) {
						l.add(r);
					}
					else {
						if (r.aprv_flg()) {
							if (MAC_APRV_STS_TYP.isOPN(r.aprv_sts_typ())) {
								if (up0().aprv_opn_flg()) {
									l.add(r);
								}
							}
							else if (MAC_APRV_STS_TYP.isFIX(r.aprv_sts_typ())) {
								if (up0().aprv_fix_flg()) {
									l.add(r);
								}
							}
							else if (MAC_APRV_STS_TYP.isACPT(r.aprv_sts_typ())) {
								if (up0().aprv_acpt_flg()) {
									l.add(r);
								}
							}
							else if (MAC_APRV_STS_TYP.isRJCT(r.aprv_sts_typ())) {
								if (up0().aprv_rjct_flg()) {
									l.add(r);
								}
							}
							else if (MAC_APRV_STS_TYP.isLAST_RJCT(r.aprv_sts_typ())) {
								if (up0().aprv_last_rjct_flg()) {
									l.add(r);
								}
							}
						}
						else {
							if (up0().aprv_none_flg()) {
								l.add(r);
							}
						}
					}
				}
				
				down0().setAll(l);
			}
		}
		
		protected void setDown() {
			if (isIns()) {
				for (Srch01_RsltR r : down0()) {
					down1().addAll(getApdL(r.hdr_peg_no()));
					down2().addAll(getPayActL(r.hdr_peg_no()));
					down3().addAll(getAdvPayActL(r.hdr_peg_no()));
				}
			}
		}
		
		protected void sortDown(MCList<Srch01_RsltR> l, boolean ascFlg) {
			MCSortPolicy sp = new MCSortPolicy();
			sp.add(SortType.ASC, Srch01_RsltR.$psppl_cd);
			sp.add(SortType.ASC, Srch01_RsltR.$bsppl_cd);
			sp.add(SortType.ASC, Srch01_RsltR.$bsppl_dpt_cd);
			sp.add(SortType.ASC, Srch01_RsltR.$purc_act_no);
			sp.add(SortType.ASC, Srch01_RsltR.$rcpt_iv_no);
			sp.add(SortType.ASC, Srch01_RsltR.$rcpt_iv_mng_no);
			sp.add(SortType.ASC, Srch01_RsltR.$trd_cur_cd);
			sp.add(SortType.ASC, Srch01_RsltR.$wrk_no);
			
			if (ascFlg) {
				sp.add(SortType.ASC, Srch01_RsltR.$bsppl_cl_dt);
				sp.add(SortType.ASC, Srch01_RsltR.$pay_chk_mng_no);
			}
			else {
				sp.add(SortType.DESC, Srch01_RsltR.$bsppl_cl_dt);
				sp.add(SortType.DESC, Srch01_RsltR.$pay_chk_mng_no);
			}
			
			l.sort(sp);
		}
		
		protected void sortDown() {
			sortDown(down0(), !isDel());
		}
		
		protected boolean isIns() {
			return isSame(up0().ope(), "0");
		}
		
		protected boolean isDel() {
			return isSame(up0().ope(), "1");
		}
		
		protected boolean isPrnt() {
			return isSame(up0().ope(), "2");
		}
		protected boolean isRef() {
			return isSame(up0().ope(), "3");
		}
		protected Map_PaySchd_Srch02_PayActR_Srch01_PayActR<PaySchd_Srch02_PayActR,Srch01_PayActR> createMap_PaySchd_Srch02_PayActR_Srch01_PayActR() {
			return new Map_PaySchd_Srch02_PayActR_Srch01_PayActR<PaySchd_Srch02_PayActR, Srch01_PayActR>();
		}
		public class Map_PaySchd_Srch02_PayActR_Srch01_PayActR<D extends PaySchd_Srch02_PayActR, S extends Srch01_PayActR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PaySchd_Srch02_PayActR.$hdr_peg_no, Srch01_PayActR.$hdr_peg_no);
				addColumnPathMap(PaySchd_Srch02_PayActR.$pay_act_d_no, Srch01_PayActR.$pay_act_d_no);
				addColumnPathMap(PaySchd_Srch02_PayActR.$pay_act_d_seq, Srch01_PayActR.$pay_act_d_seq);
			}
		}
	}
	
	
	/**
	 * Chk01オペレーション.<p>
	 *
	 */
	public class Chk01 extends MSBHL_PaySchdListReg_MC_A.Chk01 {
		
		protected FXUCL_Cache<Chk01_RsltR> _up0Cache;
		
		protected Chk01_RsltR getUp0R(MCNumber hdrPegNo) {
			if (_up0Cache == null) {
				_up0Cache = new FXUCL_Cache<>();
				_up0Cache.setFixMaxCacheSize(-1);
				for (Chk01_RsltR r : up0()) {
					Comparable<?>[] key = {r.hdr_peg_no()};
					_up0Cache.putCache(key, r);
				}
			}
			return _up0Cache.getCache(hdrPegNo);
		}
		
		protected FXUCL_Cache<MCList<Chk01_PayActR>> _up2Cache;
		
		protected MCList<Chk01_PayActR> getUp2L(MCNumber hdrPegNo) {
			if (_up2Cache == null) {
				_up2Cache = new FXUCL_Cache<>();
				_up2Cache.setFixMaxCacheSize(-1);
				for (MCList<Chk01_PayActR> l : up2().groupList(Chk01_PayActR.$hdr_peg_no)) {
					Comparable<?>[] key = {l.get(0).hdr_peg_no()};
					_up2Cache.putCache(key, l);
				}
			}
			return _up2Cache.getCache(hdrPegNo);
		}
		
		protected FXUCL_Cache<MCList<MST_AP_D_R>> _apdCache;
		
		protected void setApdCache(MCNumber hdrPegNo, MST_AP_D_R apdR) {
			if (_apdCache == null) {
				_apdCache = new FXUCL_Cache<>();
				_apdCache.setFixMaxCacheSize(-1);
			}
			MCList<MST_AP_D_R> l = _apdCache.getCache(hdrPegNo);
			if (isNull(l)) {
				l = MCList.create(MST_AP_D_R.class);
				Comparable<?>[] key = {hdrPegNo};
				_apdCache.putCache(key, l);
			}
			l.add(apdR);
		}
		
		protected MCList<MST_AP_D_R> getApdL(MCNumber hdrPegNo) {
			if (_apdCache == null) {
				_apdCache = new FXUCL_Cache<>();
				_apdCache.setFixMaxCacheSize(-1);
			}
			return _apdCache.getCache(hdrPegNo);
		}
		
		protected FXUCL_Cache<PaySchd_HdrR> _paySchdHdrCache;
		
		protected void setPaySchdHdrCache(Chk01_RsltR hdrR, PaySchd_HdrR paySchdHdrR) {
			MCNumber hdrPegNo = hdrR.hdr_peg_no();
			if (_paySchdHdrCache == null) {
				_paySchdHdrCache = new FXUCL_Cache<>();
				_paySchdHdrCache.setFixMaxCacheSize(-1);
			}
			paySchdHdrR.setAttributes(hdrR);
			Comparable<?>[] key = {hdrPegNo};
			_paySchdHdrCache.putCache(key, paySchdHdrR);
		}
		
		protected PaySchd_HdrR getPaySchdHdrR(MCNumber hdrPegNo) {
			return _paySchdHdrCache.getCache(hdrPegNo);
		}
		
		protected FXUCL_Cache<MCList<PaySchd_DtlSchdR>> _paySchdDtlCache;
		
		protected void setPaySchdDtlCache(MCNumber hdrPegNo, PaySchd_DtlSchdR dtlR) {
			if (_paySchdDtlCache == null) {
				_paySchdDtlCache = new FXUCL_Cache<>();
				_paySchdDtlCache.setFixMaxCacheSize(-1);
			}
			MCList<PaySchd_DtlSchdR> l = _paySchdDtlCache.getCache(hdrPegNo);
			if (isNull(l)) {
				l = MCList.create(PaySchd_DtlSchdR.class);
				Comparable<?>[] key = {hdrPegNo};
				_paySchdDtlCache.putCache(key, l);
			}
			l.add(dtlR);
		}
		
		protected MCList<PaySchd_DtlSchdR> getPaySchdDtlL(MCNumber hdrPegNo) {
			if (_paySchdDtlCache == null) {
				_paySchdDtlCache = new FXUCL_Cache<>();
				_paySchdDtlCache.setFixMaxCacheSize(-1);
			}
			return _paySchdDtlCache.getCache(hdrPegNo);
		}
		
		protected FXUCL_Cache<MCList<PaySchd_DtlApdR>> _paySchdApdCache;
		
		protected void setPaySchdApdCache(MCNumber hdrPegNo, PaySchd_DtlApdR dtlR) {
			if (_paySchdApdCache == null) {
				_paySchdApdCache = new FXUCL_Cache<>();
				_paySchdApdCache.setFixMaxCacheSize(-1);
			}
			MCList<PaySchd_DtlApdR> l = _paySchdApdCache.getCache(hdrPegNo);
			if (isNull(l)) {
				l = MCList.create(PaySchd_DtlApdR.class);
				Comparable<?>[] key = {hdrPegNo};
				_paySchdApdCache.putCache(key, l);
			}
			l.add(dtlR);
		}
		
		protected MCList<PaySchd_DtlApdR> getPaySchdApdL(MCNumber hdrPegNo) {
			if (_paySchdApdCache == null) {
				_paySchdApdCache = new FXUCL_Cache<>();
				_paySchdApdCache.setFixMaxCacheSize(-1);
			}
			return _paySchdApdCache.getCache(hdrPegNo);
		}
		
		protected FXUCL_Cache<MCList<PaySchd_DtlActR>> _paySchdDtlActCache;
		
		protected void setPaySchdDtlActCache(MCNumber hdrPegNo, PaySchd_DtlActR dtlR) {
			if (_paySchdDtlActCache == null) {
				_paySchdDtlActCache = new FXUCL_Cache<>();
				_paySchdDtlActCache.setFixMaxCacheSize(-1);
			}
			MCList<PaySchd_DtlActR> l = _paySchdDtlActCache.getCache(hdrPegNo);
			if (isNull(l)) {
				l = MCList.create(PaySchd_DtlActR.class);
				Comparable<?>[] key = {hdrPegNo};
				_paySchdDtlActCache.putCache(key, l);
			}
			l.add(dtlR);
		}
		
		protected MCList<PaySchd_DtlActR> getPaySchdPayActL(MCNumber hdrPegNo) {
			if (_paySchdDtlActCache == null) {
				_paySchdDtlActCache = new FXUCL_Cache<>();
				_paySchdDtlActCache.setFixMaxCacheSize(-1);
			}
			return _paySchdDtlActCache.getCache(hdrPegNo);
		}
		protected FXUCL_Cache<MCList<PaySchd_AdvPayActR>> _paySchdAdvPayActCache;
		protected void setAdvPayActCache(MCNumber hdrPegNo, PaySchd_AdvPayActR dtlR) {
			if (_paySchdAdvPayActCache == null) {
				_paySchdAdvPayActCache = new FXUCL_Cache<>();
				_paySchdAdvPayActCache.setFixMaxCacheSize(-1);
			}
			MCList<PaySchd_AdvPayActR> l = _paySchdAdvPayActCache.getCache(hdrPegNo);
			if (isNull(l)) {
				l = MCList.create(PaySchd_AdvPayActR.class);
				Comparable<?>[] key = {hdrPegNo};
				_paySchdAdvPayActCache.putCache(key, l);
			}
			l.add(dtlR);
		}
		protected MCList<PaySchd_AdvPayActR> getPaySchdAdvPayActL(MCNumber hdrPegNo) {
			if (_paySchdAdvPayActCache == null) {
				_paySchdAdvPayActCache = new FXUCL_Cache<>();
				_paySchdAdvPayActCache.setFixMaxCacheSize(-1);
			}
			return _paySchdAdvPayActCache.getCache(hdrPegNo);
		}
		
		@Override
		protected void call() {
			super.call();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if (!isNull(notErrL)) {
				callPaySchdChkSrv(notErrL);
			}
			setErrToRtnStsTyp();
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			msgL.addAll(chkApd());
			
			return msgL;
		}
		
		protected MCMessageList chkApd() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<Chk01_ApdR> notErrL = getChkList(up1());
			if (!isNull(notErrL)) {
				MCList<MST_AP_D_R> selectL = MCList.create(MST_AP_D_R.class);
				for (Chk01_ApdR r : notErrL) {
					selectL.add(r.ap_d());
				}
				
				selectL.sort(selectL.createRow().getKeyColumn());
				MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MST_AP_D_R.create("T"));
				selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());
				dbSelectKeyForUpdateNoWait("MSBHL0020_MST_AP_D_S01", selectL, selectL_bldr, selectL);
				
				MCMessageList tmpL = new MCMessageList();
				MCIndexKey idx = selectL.createIndex(MST_AP_D_R.$ap_d_no);
				for (MCList<Chk01_ApdR> grpL : notErrL.groupList(Chk01_ApdR.$hdr_peg_no)) {
					Chk01_RsltR hdrR = getUp0R(grpL.get(0).hdr_peg_no());
					if (hdrR == null) {
						continue;
					}
					grpL.setAttributes(hdrR);
					
					for (Chk01_ApdR r : grpL) {
						MST_AP_D_R selectR = selectL.getFirst(idx, r.ap_d_no());
						if (selectR != null) {
							selectR.setAttributes(hdrR);
						}
						tmpL.addAll(checkUpdCntrNE(r, Chk01_ApdR.$upd_cntr, selectR));
						setApdCache(hdrR.hdr_peg_no(), selectR);
						
						// 非表示ブロックのエラーメッセージは重複表示しない
						if (hasErrMsgL(tmpL)) {
							break;
						}
					}
					msgL.addAll(tmpL);
					tmpL.clear();
				}
			}
			
			return msgL;
		}
		
		protected boolean hasErrMsgL(MCMessageList msgL) {
			for (MCMessage msgR : msgL) {
				if (isErrMsg(msgR)) {
					return true;
				}
			}
			return false;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			
			for (Chk01_RsltR r : notErrL) {
				msgL.addAll(checkWritableDptCdDac(r, Chk01_RsltR.$bsppl_dpt_cd));
				
				if (r.pay_spot_flg()) {
					r.bsppl_cl_day(null);
					r.bsppl_cl_dt(null);
				}
				else {
					msgL.addAll(check(r, Chk01_RsltR.$bsppl_cl_ym, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk01_RsltR.$bsppl_cl_day, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk01_RsltR.$bsppl_cl_dt, new FXUCL_RequiredValidater()));
				}
				if (isSame(r.trd_cur_cd(), getCo().base_cur_cd())) {
					r.xrate(1);
				}
				else {
					msgL.addAll(check(r, Chk01_RsltR.$xrate, new FXUCL_RequiredValidater()));
				}
			}
			
			return msgL;
		}
		
		protected void callPaySchdChkSrv(MCList<Chk01_RsltR> notErrL) {
			if (isNull(notErrL)) {
				return ;
			}
			
			MCList<PaySchd_HdrR> hdrL = getPaySchdHdrL(notErrL);
			
			callPaySchdRegServiceLock(hdrL);
			
			callPaySchdRegServiceSrch05(notErrL);
			
			callPaySchdRegServiceSrch01(notErrL);
			
			callPaySchdRegServiceChk01(notErrL);
			
		}
		
		protected MCList<PaySchd_HdrR> getPaySchdHdrL(MCList<Chk01_RsltR> notErrL) {
			MCList<PaySchd_HdrR> hdrL = MCList.create(PaySchd_HdrR.class);
			
			for (Chk01_RsltR dtlR : notErrL) {
				
				PaySchd_HdrR hdrR = PaySchd_HdrR.create();
				
				hdrR.hdr_peg_no(dtlR.hdr_peg_no());
				hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				hdrR.reg_dt(dtlR.reg_dt());
				hdrR.bsppl_cd(dtlR.bsppl_cd());
				hdrR.bsppl_usr_cd(dtlR.bsppl_usr_cd());
				hdrR.bsppl_dpt_cd(dtlR.bsppl_dpt_cd());
				hdrR.purc_act_no(dtlR.purc_act_no());
				hdrR.rcpt_iv_mng_no(dtlR.rcpt_iv_mng_no());
				hdrR.rcpt_iv_no(dtlR.rcpt_iv_no());
				hdrR.wrk_no(dtlR.wrk_no());
				hdrR.bsppl_cl_day(dtlR.bsppl_cl_day());
				hdrR.bsppl_cl_dt(dtlR.bsppl_cl_dt());
				hdrR.trd_cur_cd(dtlR.trd_cur_cd());
				hdrR.pay_xrate(dtlR.pay_xrate());
				hdrR.pay_spot_flg(dtlR.pay_spot_flg());
				hdrR.pay_schd_d_print_rmrks(dtlR.pay_schd_d_print_rmrks());
				hdrR.intr_rmrks(dtlR.intr_rmrks());
				hdrR.sub_char1(dtlR.sub_char1());
				hdrR.sub_char2(dtlR.sub_char2());
				hdrR.sub_char3(dtlR.sub_char3());
				hdrR.upd_cntr_chk_flg(true);
				hdrR.man_reg_flg(true);
				hdrR.setAttributes(dtlR);
				
				MCList<Chk01_PayActR> payActL = getUp2L(dtlR.hdr_peg_no());
				hdrR.pay_act_not_ref_flg(dtlR.pay_act_not_ref_flg() && isNull(payActL));
				
				hdrL.add(hdrR);
				setPaySchdHdrCache(dtlR, hdrR);
			}
			
			return hdrL;
		}
		
		protected void callPaySchdRegServiceSrch05(MCList<Chk01_RsltR> notErrL) {
			if (isNull(notErrL)) {
				return ;
			}
			
			MCList<PaySchd_Srch05_CndR> cndL = MCList.create(PaySchd_Srch05_CndR.class);
			MCList<PaySchd_Srch03_CndPayActR> cndPayActL = MCList.create(PaySchd_Srch03_CndPayActR.class);
			MCList<PaySchd_Srch03_CndAdvPayActR> cndAdvPayActL = MCList.create(PaySchd_Srch03_CndAdvPayActR.class);

			MCIndexKey up2Idx = up2().createIndex(Chk01_PayActR.$hdr_peg_no);
			MCIndexKey up3Idx = up3().createIndex(Chk01_AdvPayActR.$hdr_peg_no);
			
			for (Chk01_RsltR hdrR : notErrL) {
				MCList<MST_AP_D_R> apDL = getApdL(hdrR.hdr_peg_no());
				MCList<Chk01_PayActR> actL = up2().subList(up2Idx, hdrR.hdr_peg_no());
				MCList<Chk01_AdvPayActR> advPayActL = up3().subList(up3Idx, hdrR.hdr_peg_no());
				if (isNull(apDL) && isNull(actL)) {
					continue;
				}
				
				MCDate xrateBaseDt = nvl(hdrR.bsppl_cl_dt(), hdrR.reg_dt());
				if (!isNull(apDL) && !apDL.isEmpty()) {
					for (MST_AP_D_R apDR : apDL) {
						PaySchd_DtlApdR upApDR = PaySchd_DtlApdR.create();
						upApDR.hdr_peg_no(hdrR.hdr_peg_no());
						copyPaySchd_DtlApdR_MST_AP_D_R(upApDR, apDR);
						setPaySchdApdCache(hdrR.hdr_peg_no(), upApDR);
					}
					for (MST_AP_D_R apDR : apDL) {
						PaySchd_Srch05_CndR cndR = PaySchd_Srch05_CndR.create();
						cndR.hdr_peg_no(hdrR.hdr_peg_no());
						cndR.ap_d_no(apDR.ap_d_no());
						if (apDR.repurc_obli_flg()) {
							cndR.trd_cur_amt(apDR.trd_cur_proc_amt());
						}
						else {
							cndR.trd_cur_amt(apDR.trd_cur_amt());
						}
						cndR.trd_cur_tax_amt(apDR.trd_cur_tax_amt());
						cndR.pay_xrate(hdrR.pay_xrate());
						cndR.xrate_base_dt(xrateBaseDt);
						cndR.setAttributes(apDR);
						cndL.add(cndR);
					}
				}
				
				if (!isNull(actL) && !actL.isEmpty()) {
					actL.forEach(r -> {
						PaySchd_Srch03_CndPayActR cndR = cndPayActL.add();
						cndR.hdr_peg_no(r.hdr_peg_no());
						cndR.pay_act_d_no(r.pay_act_d_no());
						cndR.pay_act_d_seq(r.pay_act_d_seq());
						cndR.pay_xrate(hdrR.pay_xrate());
						cndR.xrate_base_dt(xrateBaseDt);
					});
				}
				if (!isNull(advPayActL) && !advPayActL.isEmpty()) {
					advPayActL.forEach(r -> {
						PaySchd_Srch03_CndAdvPayActR cndR = cndAdvPayActL.add();
						cndR.hdr_peg_no(r.hdr_peg_no());
						cndR.adv_pay_act_no(r.adv_pay_act_no());
						cndR.adv_pay_act_seq(r.adv_pay_act_seq());
						cndR.pay_xrate(hdrR.pay_xrate());
						cndR.xrate_base_dt(xrateBaseDt);
					});
				}
			}
			
			if (isNull(cndL) && isNull(cndPayActL)) {
				return ;
			}
			
			MSBHL_PaySchdRegService.PaySchd_Srch05 ope = MSBHL_PaySchdRegService.crtPaySchd_Srch05();
			ope.up0().addAll(cndL);
			ope.up1().addAll(cndPayActL);
			ope.up2().addAll(cndAdvPayActL);
			ope.exec();
			
			for (PaySchd_Srch05_RsltR r : ope.down0()) {
				PaySchd_DtlApdR upApDR = PaySchd_DtlApdR.create();
				
				upApDR.hdr_peg_no(r.hdr_peg_no());
				MST_AP_D_R apDR = r.ap_d();
				copyPaySchd_DtlApdR_MST_AP_D_R(upApDR, apDR);
				upApDR.ref_ap_d_no(r.ref_ap_d_no());
				PaySchd_HdrR hdrR = getPaySchdHdrR(r.hdr_peg_no());
				apDR.setAttributes(hdrR);
				
				setApdCache(r.hdr_peg_no(), apDR);
				setPaySchdApdCache(hdrR.hdr_peg_no(), upApDR);
			}
		}
		
		protected void copyPaySchd_DtlApdR_MST_AP_D_R(PaySchd_DtlApdR dest, MST_AP_D_R src) {
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dest.pay_mtd_typ(MSC_PAY_MTD_TYP.ALL_PAY.value());
			dest.ap_d_no(src.ap_d_no());
			dest.trd_ptn_typ(src.trd_ptn_typ());
			dest.slip_sts_typ(src.slip_sts_typ());
			dest.asppl_cd(src.asppl_cd());
			dest.ap_dpt_cd(src.ap_dpt_cd());
			dest.ap_typ(src.ap_typ());
			dest.interim_flg(src.interim_flg());
			dest.pay_amt(src.trd_cur_amt());
			dest.pay_tax_amt(src.trd_cur_tax_amt());
			dest.pay_wtax_amt(src.wtax_amt());
			dest.repurc_obli_flg(src.repurc_obli_flg());
			dest.pay_proc_amt(src.trd_cur_proc_amt());
			dest.pay_onr_prov_amt(src.trd_cur_onr_prov_amt());
		}
		
		protected void callPaySchdRegServiceSrch01(MCList<Chk01_RsltR> notErrL) {
			
			MSBHL_PaySchdRegService.PaySchd_Srch01 ope = MSBHL_PaySchdRegService.crtPaySchd_Srch01();
			
			for (Chk01_RsltR r : notErrL) {
				if (r.err_flg()) {
					continue;
				}
				
				MCList<MST_AP_D_R> tmpApDL = getApdL(r.hdr_peg_no());
				if (isNull(tmpApDL)) {
					continue;
				}
				
				for (MST_AP_D_R apDR : tmpApDL) {
					
					PaySchd_Srch01_CndR cndR = PaySchd_Srch01_CndR.create();
					
					cndR.hdr_peg_no(r.hdr_peg_no());
					cndR.ap_d_no(apDR.ap_d_no());
					cndR.sppl_cd(apDR.sppl_cd());
					cndR.asppl_cd(apDR.asppl_cd());
					cndR.bsppl_cd(apDR.bsppl_cd());
					cndR.bsppl_dpt_cd(r.bsppl_dpt_cd());
					cndR.ap_dpt_cd(apDR.ap_dpt_cd());
					cndR.trd_ptn_typ(apDR.trd_ptn_typ());
					cndR.itm_cd(apDR.itm_cd());
					cndR.itm_sub1(apDR.itm_sub1());
					cndR.itm_sub2(apDR.itm_sub2());
					cndR.itm_sub3(apDR.itm_sub3());
					cndR.trd_cur_cd(apDR.trd_cur_cd());
					cndR.ac_dt(apDR.ac_dt());
					cndR.pay_basis_dt(apDR.pay_basis_dt());
					cndR.pay_schd_dt(apDR.pay_schd_dt());
					cndR.bsppl_cl_dt(r.bsppl_cl_dt());
					cndR.ap_typ(apDR.ap_typ());
					cndR.trd_cur_amt(apDR.trd_cur_amt());
					cndR.trd_cur_tax_amt(apDR.trd_cur_tax_amt());
					cndR.wtax_amt(apDR.wtax_amt());
					cndR.zero_flg(true);
					cndR.setAttributes(apDR);
					
					ope.up0().add(cndR);
				}
				
			}
			
			ope.exec();
			
			HashSet<MCNumber> errSet = new HashSet<>();
			MCList<PaySchd_Srch01_RsltR> errPayDptL = MCList.create(PaySchd_Srch01_RsltR.class);
			
			for(PaySchd_Srch01_RsltR srch01RsltR : ope.down1()) {
				
				if (isNull(srch01RsltR.pay_schd_dt()) || isNull(srch01RsltR.pay_dpt_cd())) {
					errSet.add(srch01RsltR.hdr_peg_no());
					errPayDptL.add(srch01RsltR);
					continue;
				}
				
				PaySchd_DtlSchdR upPaySchdR = PaySchd_DtlSchdR.create();
				
				upPaySchdR.hdr_peg_no(srch01RsltR.hdr_peg_no());
				upPaySchdR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				upPaySchdR.asppl_cd(srch01RsltR.asppl_cd());
				upPaySchdR.ap_dpt_cd(srch01RsltR.ap_dpt_cd());
				upPaySchdR.pay_dpt_cd(srch01RsltR.pay_dpt_cd());
				upPaySchdR.ap_typ(srch01RsltR.ap_typ());
				upPaySchdR.ap_sttl_cd(srch01RsltR.ap_sttl_cd());
				upPaySchdR.ap_sttl_typ(srch01RsltR.ap_sttl_typ());
				upPaySchdR.pay_schd_dt(srch01RsltR.pay_schd_dt());
				upPaySchdR.pay_bank_ac_cd(srch01RsltR.pay_bank_ac_cd());
				upPaySchdR.bank_ac_cd(srch01RsltR.bank_ac_cd());
				upPaySchdR.ap_setoff_typ(srch01RsltR.ap_setoff_typ());
				upPaySchdR.setoff_cd(srch01RsltR.setoff_cd());
				upPaySchdR.setoff_nm(srch01RsltR.setoff_nm());
				upPaySchdR.so_dpt_cd(srch01RsltR.so_dpt_cd());
				upPaySchdR.trd_cur_amt(srch01RsltR.trd_cur_amt());
				upPaySchdR.trd_cur_com_paid_tax_cd(srch01RsltR.trd_cur_com_paid_tax_cd());
				Chk01_RsltR up0R = getUp0R(srch01RsltR.hdr_peg_no());
				upPaySchdR.xrate(up0R.xrate());
				upPaySchdR.setAttributes(up0R);
				
				setPaySchdDtlCache(srch01RsltR.hdr_peg_no(), upPaySchdR);
			}
			
			for (PaySchd_Srch01_CndR down0R : ope.down0()) {
				if (down0R.err_flg()) {
					errSet.add(down0R.hdr_peg_no());
				}
			}
			
			if (!errSet.isEmpty()) {
				MCIndexKey payDptKey = errPayDptL.createIndex(PaySchd_Srch01_RsltR.$hdr_peg_no, PaySchd_Srch01_RsltR.$pay_dpt_cd);
				
				for (MCNumber hdrPegNo : errSet) {
					Chk01_RsltR  hdrR = getUp0R(hdrPegNo);
					hdrR.err_flg(true);
					MCList<PaySchd_Srch01_RsltR> errPayDptSubL = errPayDptL.subList(payDptKey, hdrPegNo, null);
					if (!isNull(errPayDptSubL)) {
						for (PaySchd_Srch01_RsltR errR : errPayDptSubL.distinctNE(PaySchd_Srch01_RsltR.$pay_schd_dt)) {
							MCMessagePool.add(new MCMessage(hdrR, null, MSBHL0034, hdrR.psppl_cd(), toYMDString(errR.pay_schd_dt()), toDispGUIIndex(hdrR)));
						}
					}
				}
			}
		}
		
		protected void callPaySchdRegServiceChk01(MCList<Chk01_RsltR> notErrL) {
			if (isNull(notErrL)) {
				return ;
			}
			
			MCList<Chk01_RsltR> tmpErrL = notErrL.subList(r -> !r.err_flg());
			if (isNull(tmpErrL)) {
				return ;
			}
			
			for (Chk01_PayActR r : up2()) {
				PaySchd_HdrR hdrR = getPaySchdHdrR(r.hdr_peg_no());
				if (hdrR == null) {
					continue;
				}
				PaySchd_DtlActR tmpR = PaySchd_DtlActR.create();
				tmpR.hdr_peg_no(r.hdr_peg_no());
				tmpR.pay_act_d_no(r.pay_act_d_no());
				tmpR.pay_act_d_seq(r.pay_act_d_seq());
				tmpR.pay_chk_mng_no(r.pay_chk_mng_no());
				tmpR.upd_cntr(r.upd_cntr());
				tmpR.pay_act_upd_cntr(r.pay_act_upd_cntr());
				tmpR.setAttributes(hdrR);
				setPaySchdDtlActCache(r.hdr_peg_no(), tmpR);
			}
			for (Chk01_AdvPayActR r : up3()) {
				PaySchd_HdrR hdrR = getPaySchdHdrR(r.hdr_peg_no());
				if (hdrR == null) {
					continue;
				}
				PaySchd_AdvPayActR tmpR = PaySchd_AdvPayActR.create();
				tmpR.hdr_peg_no(r.hdr_peg_no());
				tmpR.adv_pay_act_no(r.adv_pay_act_no());
				tmpR.adv_pay_act_seq(r.adv_pay_act_seq());
				tmpR.pay_chk_mng_no(hdrR.pay_chk_mng_no());
				tmpR.adv_pay_upd_cntr(r.adv_pay_upd_cntr());
				tmpR.setAttributes(hdrR);
				setAdvPayActCache(r.hdr_peg_no(), tmpR);
			}
			
			MSBHL_PaySchdRegService.PaySchd_Chk01 chkOpe = MSBHL_PaySchdRegService.crtPaySchd_Chk01();
			
			for (Chk01_RsltR r : tmpErrL) {
				chkOpe.up0().add(getPaySchdHdrR(r.hdr_peg_no()));
				chkOpe.up1().addAll(getPaySchdApdL(r.hdr_peg_no()));
				chkOpe.up2().addAll(getPaySchdDtlL(r.hdr_peg_no()));
				chkOpe.up3().addAll(getPaySchdPayActL(r.hdr_peg_no()));
				chkOpe.up4().addAll(getPaySchdAdvPayActL(r.hdr_peg_no()));
			}
			
			setPegNo(chkOpe.up1());
			setPegNo(chkOpe.up2());
			chkOpe.exec();
			
			copyErrFlg(tmpErrL, chkOpe.down0(), Chk01_RsltR.$hdr_peg_no, PaySchd_HdrR.$hdr_peg_no);
		}
		
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
			down2().setAll(up2());
			down3().setAll(up3());
		}
		
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 */
	public class Ins01 extends MSBHL_PaySchdListReg_MC_A.Ins01 {
		
		protected MSBHL_PaySchdListReg.Chk01 _opeChk01;
		
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		
		@Override
		protected void doIt() {
			
			callThisChk01();

			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (!isNull(notErrL)) {
				insPaySchd(notErrL);
				execPayNtcPrnt(notErrL);
			}
			
			setDown();
		}
		
		protected void callThisChk01() {
			MSBHL_PaySchdListReg.Chk01 ope = MSBHL_PaySchdListReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.up3().setAll(up3());
			ope.exec();
			up0().setAll(ope.down0());
			up1().setAll(ope.down1());
			up2().setAll(ope.down2());
			ope.up3().setAll(ope.down3());
			_opeChk01 = ope;
		}
		
		protected void insPaySchd(MCList<Chk01_RsltR> notErrL) {
			MSBHL_PaySchdRegService.PaySchd_Ins01 opeIns01 = MSBHL_PaySchdRegService.crtPaySchd_Ins01();
			
			for (Chk01_RsltR r : notErrL) {
				opeIns01.up0().add(_opeChk01.getPaySchdHdrR(r.hdr_peg_no()));
				opeIns01.up1().addAll(_opeChk01.getPaySchdApdL(r.hdr_peg_no()));
				opeIns01.up2().addAll(_opeChk01.getPaySchdDtlL(r.hdr_peg_no()));
				opeIns01.up3().addAll(_opeChk01.getPaySchdPayActL(r.hdr_peg_no()));
				opeIns01.up4().addAll(_opeChk01.getPaySchdAdvPayActL(r.hdr_peg_no()));
			}
			
			opeIns01.exec();
			String[] destCols = {Chk01_RsltR.$pay_chk_mng_no, Chk01_RsltR.$pay_chk_no,
					Chk01_RsltR.$aprv_flg, Chk01_RsltR.$aprv_no,
					Chk01_RsltR.$aprv_sts_typ, Chk01_RsltR.$pay_sts_typ
					};
			String[] srcCols = {PaySchd_HdrR.$pay_chk_mng_no, PaySchd_HdrR.$pay_chk_no,
					PaySchd_HdrR.$aprv_flg, PaySchd_HdrR.$aprv_no,
					PaySchd_HdrR.$aprv_sts_typ, PaySchd_HdrR.$pay_sts_typ
					};
			
			copyByPegNo(notErrL, opeIns01.down0(), Chk01_RsltR.$hdr_peg_no, destCols, PaySchd_HdrR.$hdr_peg_no, srcCols);
			
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
		
		/**
		 * 支払通知書発行
		 * @param prtL 支払通知書発行リスト
		 */
		protected void execPayNtcPrnt(MCList<Chk01_RsltR> prtL) {
			if (!up4().prnt_out_flg()) {
				return;
			}
			
			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t);
			bpL_bldr.setSelect(t.bp_cd);
			bpL_bldr.addSelect(t.pay_ntc_prnt_flg);
			bpL_bldr.setWhere(t.bp_cd.eq(bind("bsppl_cd")));
			dbSelect("MSBHL0020_MAM_BP_S02", bpL, bpL_bldr, prtL);

			MCIndexKey idxkey = bpL.createIndex(MAM_BP_R.$bp_cd);
			
			MSBHL_ApPrntService.ApPrnt_Prnt03 ope = MSBHL_ApPrntService.crtApPrnt_Prnt03();
			for (Chk01_RsltR prtR : prtL) {
				MAM_BP_R bpR = MAM_BP_R.create();
				bpR = bpL.getFirst(idxkey, prtR.bsppl_cd());

				if (!isNull(bpR) && bpR.pay_ntc_prnt_flg()) {
					ApPrnt_Prnt03_HdrR hdrR = ApPrnt_Prnt03_HdrR.create();
					hdrR.pay_chk_no(prtR.pay_chk_no());
					ope.up0().add(hdrR);
				}
			}
			ope.up1().indiv_prnt_flg(up4().indiv_prnt_flg());
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@SuppressWarnings("unchecked")
		@Override
		protected <T extends MCRow> MCList<T> getSplitList(MCParam p) {
			return (MCList<T>)up0();
		}
		
		@SuppressWarnings("unchecked")
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			String[] grpCols = {Chk01_RsltR.$bsppl_cd, Chk01_RsltR.$bsppl_dpt_cd, 
					Chk01_RsltR.$purc_act_no, Chk01_RsltR.$rcpt_iv_mng_no, Chk01_RsltR.$rcpt_iv_no,
					Chk01_RsltR.$trd_cur_cd, Chk01_RsltR.$wrk_no};
			List<MCList<Chk01_RsltR>> list = splitUp(up0(), grpCols, getSplitRowCount());
			MCIndexKey idxOfApd = up1().createIndex(Chk01_ApdR.$hdr_peg_no);
			MCIndexKey idxOfPayAct = up2().createIndex(Chk01_PayActR.$hdr_peg_no);
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = (MCList<Chk01_RsltR>)ope.up(0);  
				up0L.setAll(l);
				MCList<Chk01_ApdR> up1L =  (MCList<Chk01_ApdR>)ope.up(1);
				MCList<Chk01_PayActR> up2L =  (MCList<Chk01_PayActR>)ope.up(2);
				for (Chk01_RsltR up0R : up0L.distinctNE(Chk01_RsltR.$hdr_peg_no)) {
					up1L.addAll(up1().subList(idxOfApd, up0R.hdr_peg_no()));
					up2L.addAll(up2().subList(idxOfPayAct, up0R.hdr_peg_no()));
				}
				opeL.add(ope);
			}
			return opeL;
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 */
	public class Chk02 extends MSBHL_PaySchdListReg_MC_A.Chk02 {
		
		protected FXUCL_Cache<MST_PAY_CHK_R> _payChkCache;
		
		protected void setPayChkCache(MCList<MST_PAY_CHK_R> payChkL) {
			if (_payChkCache == null) {
				_payChkCache = new FXUCL_Cache<>();
				_payChkCache.setFixMaxCacheSize(-1);
			}
			for (MST_PAY_CHK_R payChkR : payChkL) {
				_payChkCache.putCache(payChkR.toArray(MST_PAY_CHK_R.$pay_chk_mng_no), payChkR);
			}
		}
		
		protected MST_PAY_CHK_R getPayChkR(String payChkMngNo) {
			return _payChkCache.getCache(payChkMngNo);
		}
		
		protected FXUCL_Cache<Chk02_RsltR> _up0Cache;
		
		protected Chk02_RsltR getUp0R(String payChkMngNo) {
			if (_up0Cache == null) {
				_up0Cache = new FXUCL_Cache<>();
				_up0Cache.setFixMaxCacheSize(-1);
				for (Chk02_RsltR upR : up0()) {
					Comparable<?>[] key = {upR.pay_chk_mng_no()};
					_up0Cache.putCache(key, upR);
				}
			}
			return _up0Cache.getCache(payChkMngNo);
		}
		
		@Override
		protected void call() {
			super.call();
			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			if (!isNull(notErrL)) {
				callPaySchdChkSrv(notErrL);
				afterPaySchdChk();
			}
			setErrToRtnStsTyp();
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			msgL.addAll(chkPayChk(true));
			
			return msgL;
		}
		
		protected MCMessageList chkPayChk(boolean noLockFlg) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			if (!isNull(notErrL)) {
				MCList<MST_PAY_CHK_R> selectL = MCList.create(MST_PAY_CHK_R.class);
				notErrL.sort(MST_PAY_CHK_R.$pay_chk_mng_no);
				MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MST_PAY_CHK_R.create("T"));
				selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());
				if (noLockFlg) {
					dbSelectKey("MSBHL0020_MST_PAY_CHK_S01", selectL, selectL_bldr, notErrL);
				}
				else {
					dbSelectKeyForUpdateNoWait("MSBHL0020_MST_PAY_CHK_S02", selectL, selectL_bldr, notErrL);
				}
				
				MCIndexKey idx = selectL.createIndex(MST_PAY_CHK_R.$pay_chk_mng_no);
				for (Chk02_RsltR r : notErrL) {
					MST_PAY_CHK_R selectR = selectL.getFirst(idx, r.pay_chk_mng_no());
					msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));
					if (selectR != null) {
						selectR.setAttributes(r);
						msgL.addAll(checkWritableDptCdDac(selectR, MST_PAY_CHK_R.$bsppl_dpt_cd));
					}
				}
				setPayChkCache(selectL);
			}
			
			return msgL;
		}
		
		protected void callPaySchdChkSrv(MCList<Chk02_RsltR> notErrL) {
			if (isNull(notErrL)) {
				return ;
			}
			
			MCList<PaySchd_HdrR> hdrL = MCList.create(PaySchd_HdrR.class);

			for (Chk02_RsltR dtlR : notErrL) {
				MST_PAY_CHK_R payChkR = getPayChkR(dtlR.pay_chk_mng_no());
				
				PaySchd_HdrR hdrR = PaySchd_HdrR.create();
				
				hdrR.hdr_peg_no(dtlR.hdr_peg_no());
				hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				hdrR.pay_chk_mng_no(payChkR.pay_chk_mng_no());
				hdrR.bsppl_cd(payChkR.bsppl_cd());
				hdrR.bsppl_dpt_cd(payChkR.bsppl_dpt_cd());
				hdrR.rcpt_iv_mng_no(payChkR.rcpt_iv_mng_no());
				hdrR.rcpt_iv_no(payChkR.rcpt_iv_no());
				hdrR.trd_cur_cd(payChkR.trd_cur_cd());
				hdrR.wrk_no(payChkR.wrk_no());
				hdrR.aprv_rvrs_flg(dtlR.aprv_rvrs_flg());
				hdrR.setAttributes(dtlR);
				
				hdrL.add(hdrR);
			}
			
			callPaySchdRegServiceLock(hdrL);
			
			MCList<MST_PAY_SCHD_R> paySchdDbcL = MCList.create(MST_PAY_SCHD_R.class);
			MST_PAY_SCHD_R t = MST_PAY_SCHD_R.create("T");
			MCQueryApiBuilder paySchdDbcL_bldr = MCQueryApiBuilder.create(t);
			paySchdDbcL_bldr.setOrderByAsc(paySchdDbcL_bldr.getBaseDbc().getKeyColumn$());
			paySchdDbcL_bldr.setWhere(t.pay_chk_mng_no.eq(bind("pay_chk_mng_no")));
			dbSelect("MSBHL0020_MST_PAY_SCHD_S01", paySchdDbcL, paySchdDbcL_bldr, hdrL);
			
			MCList<PaySchd_DtlSchdR> paySchdL = MCList.create(PaySchd_DtlSchdR.class);
			
			for (MST_PAY_SCHD_R paySchdDbcR : paySchdDbcL) {
				Chk02_RsltR up0R = getUp0R(paySchdDbcR.pay_chk_mng_no());
				
				PaySchd_DtlSchdR tmpR = PaySchd_DtlSchdR.create();
				
				tmpR.hdr_peg_no(up0R.hdr_peg_no());
				tmpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				tmpR.pay_schd_no(paySchdDbcR.pay_schd_no());
				tmpR.setAttributes(up0R);
				
				paySchdL.add(tmpR);
			}
			
			setPegNo(paySchdL);
			
			MSBHL_PaySchdRegService.PaySchd_Chk02 ope = MSBHL_PaySchdRegService.crtPaySchd_Chk02();
			ope.up0().addAll(hdrL);
			ope.up1().addAll(paySchdL);
			ope.exec();
			
			copyErrFlg(notErrL, ope.down0(), Chk02_RsltR.$hdr_peg_no, PaySchd_HdrR.$hdr_peg_no);
			
		}
		
		protected void afterPaySchdChk() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(chkPayChk(false));
			setErrFlg(msgL);
			MCMessagePool.addAll(msgL);
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
		
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 */
	public class Del01 extends MSBHL_PaySchdListReg_MC_A.Del01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		
		@Override
		protected void doIt() {
			editUp();
			
			callThisChk02();

			MCList<Chk02_RsltR> notErrL = up0().subList(Chk02_RsltR.$err_flg, false);
			if (!isNull(notErrL)) {
				delPaySchd(notErrL);
			}
		}
		
		protected void editUp() {
			setPegNo(Chk02_RsltR.$hdr_peg_no, up0());
		}
		
		protected void callThisChk02() {
			MSBHL_PaySchdListReg.Chk02 ope = MSBHL_PaySchdListReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		protected void delPaySchd(MCList<Chk02_RsltR> notErrL) {
			if (isNull(notErrL)) {
				return ;
			}
			
			MSBHL_PaySchdRegService.PaySchd_Del01 delOpe = MSBHL_PaySchdRegService.crtPaySchd_Del01();
			for (Chk02_RsltR dtlR : notErrL) {
				PaySchd_HdrR hdrR = PaySchd_HdrR.create();
				
				hdrR.hdr_peg_no(dtlR.hdr_peg_no());
				hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				hdrR.pay_chk_mng_no(dtlR.pay_chk_mng_no());
				hdrR.aprv_rvrs_flg(dtlR.aprv_rvrs_flg());
				hdrR.setAttributes(dtlR);
				
				delOpe.up0().add(hdrR);
			}
			
			insPayChkWk(delOpe.up0());
			
			MCIndexKey idxkey = delOpe.up0().createIndex(PaySchd_HdrR.$pay_chk_mng_no);
			
			MCList<MST_AP_D_R> apDL = getApDL(delOpe.up0());
			for (MST_AP_D_R apDR : apDL) {
				PaySchd_DtlApdR upApdR = PaySchd_DtlApdR.create();
				
				PaySchd_HdrR upHdrR = delOpe.up0().getFirst(idxkey, apDR.pay_chk_mng_no());
				
				upApdR.hdr_peg_no(upHdrR.hdr_peg_no());
				upApdR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				upApdR.ap_d_no(apDR.ap_d_no());
				upApdR.co_ap_d_no(apDR.crryovr_ap_d_no());
				upApdR.co_src_ap_d_no(apDR.crryovr_src_ap_d_no());
				
				delOpe.up1().add(upApdR);
			}
			
			MCList<MST_PAY_SCHD_R> paySchdL = getPaySchdL(delOpe.up0());
			for (MST_PAY_SCHD_R paySchdR : paySchdL) {
				PaySchd_DtlSchdR upPaySchdR = PaySchd_DtlSchdR.create();
				
				PaySchd_HdrR upHdrR = delOpe.up0().getFirst(idxkey, paySchdR.pay_chk_mng_no());
				
				upPaySchdR.hdr_peg_no(upHdrR.hdr_peg_no());
				upPaySchdR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				upPaySchdR.pay_schd_no(paySchdR.pay_schd_no());
				
				delOpe.up2().add(upPaySchdR);
			}
			
			delPayChkWk(delOpe.up0());
			
			delOpe.exec();
		}
		
		protected void insPayChkWk(MCList<PaySchd_HdrR> hdrL) {
			if (isNull(hdrL)) {
				return ;
			}
			
			MCList<MST_PAY_CHK_R> wkL = MCList.create(MST_PAY_CHK_R.class);
			for (PaySchd_HdrR hdrR : hdrL) {
				wkL.add(hdrR.pay_chk());
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_PAY_CHK_R.create("T"));
			dbWkDelete("MSBHL0020_MSW_PAY_CHK_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBHL0020_MSW_PAY_CHK_I01", wkL, wkL_bldr.getBaseDbc());
		}
		
		protected void delPayChkWk(MCList<PaySchd_HdrR> hdrL) {
			if (isNull(hdrL)) {
				return ;
			}
			
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_PAY_CHK_R.create("T"));
			dbWkDelete("MSBHL0020_MSW_PAY_CHK_D02", wkL_bldr.getBaseDbc());
		}
		
		protected MCList<MST_AP_D_R> getApDL(MCList<PaySchd_HdrR> hdrL) {
			MCList<MST_AP_D_R> apDL = MCList.create(MST_AP_D_R.class);
			if (isNull(hdrL)) {
				return apDL;
			}

			MST_AP_D_R t = MST_AP_D_R.create("T");
			MCQueryApiBuilder apDL_bldr = MCQueryApiBuilder.create(t);
			MSW_PAY_CHK_KEY_R w1 = MSW_PAY_CHK_KEY_R.create("W1");
			apDL_bldr.setOrderByAsc(apDL_bldr.getBaseDbc().getKeyColumn$());
			apDL_bldr.addInnerJoin(w1, bracket(w1.pay_chk_mng_no.eq(t.pay_chk_mng_no)));
			dbSelectForUpdate("MSBHL0020_MST_AP_D_S02", apDL, apDL_bldr);
			
			return apDL;
		}
		
		protected MCList<MST_PAY_SCHD_R> getPaySchdL(MCList<PaySchd_HdrR> hdrL) {
			MCList<MST_PAY_SCHD_R> paySchdL = MCList.create(MST_PAY_SCHD_R.class);
			if (isNull(hdrL)) {
				return paySchdL;
			}

			MST_PAY_SCHD_R t = MST_PAY_SCHD_R.create("T");
			MCQueryApiBuilder paySchdL_bldr = MCQueryApiBuilder.create(t);
			MSW_PAY_CHK_KEY_R w1 = MSW_PAY_CHK_KEY_R.create("W1");
			paySchdL_bldr.setOrderByAsc(paySchdL_bldr.getBaseDbc().getKeyColumn$());
			paySchdL_bldr.addInnerJoin(w1, bracket(w1.pay_chk_mng_no.eq(t.pay_chk_mng_no)));
			dbSelectForUpdate("MSBHL0020_MST_PAY_SCHD_S02", paySchdL, paySchdL_bldr);
			
			return paySchdL;
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
	 * Prnt01オペレーション.<p>
	 *
	 */
	public class Prnt01 extends MSBHL_PaySchdListReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		
		@Override
		protected void doIt() {
			callApPrntPrnt03();
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			List<MCList<Prnt01_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Prnt01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Prnt01_RsltR> up0L = ((MCList<Prnt01_RsltR>)ope.up(0));  
				up0L.setAll(l);
				setUpRowParam(1, (MCRow)ope.up(1), up1());
				opeL.add(ope);
			}
			return opeL;
		}
		
		protected List<MCList<Prnt01_RsltR>> splitUp(MCList<Prnt01_RsltR> list, int max) {
			List<MCList<Prnt01_RsltR>> ret = new ArrayList<>();
			MCList<Prnt01_RsltR>[] grpL = list.groupList(Prnt01_RsltR.$bsppl_cd);
			MCList<Prnt01_RsltR> tmp = MCList.create(Prnt01_RsltR.class);
			for (MCList<Prnt01_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Prnt01_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}
		
		/**
		 * 債務帳票発行サービスの支払通知書発行処理を実行する
		 */
		protected void callApPrntPrnt03() {
			MSBHL_ApPrntService.ApPrnt_Prnt03 ope = MSBHL_ApPrntService.crtApPrnt_Prnt03();
			addAll(ope.up0(), up0(), createMap_ApPrnt_Prnt03_HdrR_Prnt01_RsltR());
			ope.up1().indiv_prnt_flg(up1().indiv_prnt_flg());
			ope.exec();
			
			MCIndexKey ik = ope.down0().createIndex(ApPrnt_Prnt03_HdrR.$pay_chk_no);
			for (Prnt01_RsltR r : up0()) {
				ApPrnt_Prnt03_HdrR down = ope.down0().getFirst(ik, r.pay_chk_no());
				if (down == null) {
					continue;
				}
				else if (down.err_flg()) {
					r.err_flg(true);
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
			}
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected Map_ApPrnt_Prnt03_HdrR_Prnt01_RsltR<ApPrnt_Prnt03_HdrR,Prnt01_RsltR> createMap_ApPrnt_Prnt03_HdrR_Prnt01_RsltR() {
			return new Map_ApPrnt_Prnt03_HdrR_Prnt01_RsltR<ApPrnt_Prnt03_HdrR, Prnt01_RsltR>();
		}
		public class Map_ApPrnt_Prnt03_HdrR_Prnt01_RsltR<D extends ApPrnt_Prnt03_HdrR, S extends Prnt01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ApPrnt_Prnt03_HdrR.$pay_chk_no, Prnt01_RsltR.$pay_chk_no);

			}
		}
	}
	
	////////////////////////////////////////////////////
	
	protected <T extends MCRow> void handleSuccess(MCList<T> l) {
		dbTran().commit();
		for (T r : l) {
			if (!r.getBooleanNE(ERR_FLG_COL)) {
				r.setStringNE("rtn_sts_typ", MAC_RTN_STS_TYP.OK.value());
			}
		}
	}
	
	protected <T extends MCRow> void handleEx(Exception e, MCList<T> l) {
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
		for (T r : l) {
			r.setStringNE("rtn_sts_typ", MAC_RTN_STS_TYP.ERR.value());
		}
	}
	
	protected <T extends MCRow> List<MCList<T>> splitUp(MCList<T> list, String[] grpCols, int max) {
		List<MCList<T>> ret = new ArrayList<>();
		MCList<T>[] grpL = list.groupList(grpCols);
		MCList<T> tmp = list.shallowClone();
		tmp.clear();
		for (MCList<T> grp : grpL) {
			if (tmp.size() >= max) {
				ret.add(tmp);
				tmp = list.shallowClone();
				tmp.clear();
			}
			tmp.addAll(grp);
		}
		if (!isNull(tmp)) {
			ret.add(tmp);
		}
		return ret;
	}

	protected void callPaySchdRegServiceLock(MCList<PaySchd_HdrR> upHdrL) {
		if (isNull(upHdrL)) {
			return ;
		}
		
		MSBHL_PaySchdRegService.PaySchd_Lock_Upd01 ope = MSBHL_PaySchdRegService.crtPaySchd_Lock_Upd01();
		
		for (PaySchd_HdrR upHdrR : upHdrL) {
			
			MST_PAY_SCHD_LOCK_R cndR = MST_PAY_SCHD_LOCK_R.create();
			
			cndR.bsppl_cd(upHdrR.bsppl_cd());
			cndR.bsppl_dpt_cd(upHdrR.bsppl_dpt_cd());
			cndR.purc_act_no(upHdrR.purc_act_no());
			cndR.rcpt_iv_mng_no(upHdrR.rcpt_iv_mng_no());
			cndR.rcpt_iv_no(upHdrR.rcpt_iv_no());
			cndR.wrk_no(upHdrR.wrk_no());
			cndR.trd_cur_cd(upHdrR.trd_cur_cd());
			
			ope.up0().add(cndR);
		}
		
		ope.exec();
	}
	
	protected void setValuesDbc(MCRow upR, MCList<? extends MCConstRow> down) {
		setValuesDbc(MSBHL0020_Srch01_RsltR_J01(), upR, down);
	}

	//FMCB CUSTOM END
}