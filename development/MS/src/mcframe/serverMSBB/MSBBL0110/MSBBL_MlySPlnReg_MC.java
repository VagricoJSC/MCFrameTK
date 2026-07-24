package mcframe.serverMSBB.MSBBL0110;

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
import mcframe.serverMSBB.MSBBL0110.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBB.MSBBL0110.Query.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMSBB.MSBBL5010.*;
import java.util.HashSet;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_MlySPlnReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_MlySPlnReg_MC extends MSBBL_MlySPlnReg_MC_A{
	//FMCB CUSTOM START
	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBBL_MlySPlnReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			if(!chkParam()) {
				return;
			}
			editUp();
			srchHdr();
			if (isNull(down0().ym())) {
				return;
			}
			srchSpln();
			setDown();
		}

		/**
		 * 上り電文チェック
		 */
		protected boolean chkParam() {
			if (isNullOr(up0().usr_cd(), up0().ym(), up0().spln_ym_fr(), up0().spln_ym_to())) {
				return false;
			}
			return true;
		}

		/**
		 * 前処理
		 */
		protected void editUp() {
			// 会計締日、会計月度基準を設定
			up0().addNumberColumn("ac_cl_day", getCo().ac_cl_day());
			up0().addNumberColumn("ac_cl_mon_base", getCo().ac_cl_mon_base());
			// 登録済・未登録
			editUpOnOffStr(up0(), "reg_flg_str", up0().reg_t_flg(), up0().reg_f_flg());
			// 確定済・未確定
			editUpOnOffStr(up0(), "fix_flg_str", up0().fix_t_flg(), up0().fix_f_flg());
		}

		/**
		 * 入力別販売計画バージョン検索
		 */
		protected void srchHdr(){
			executeQuery(down0(), MSBBL0110_MST_SPLN_USR_VERS_S01(), up0());
			if (isNull(down0().usr_cd())) {
				MAM_USR_R usrR = MAM_USR_R.create();
				MAM_USR_R t = MAM_USR_R.create("T");
				MCQueryApiBuilder usrR_bldr = MCQueryApiBuilder.create(t);
				usrR_bldr.setSelect(t.usr_nm);
				usrR_bldr.addSelect(t.del_flg);
				dbSelectKey("MSBBL0110_MAM_USR_S01", usrR, usrR_bldr, up0());
				if (usrR.del_flg() || isNull(usrR.usr_nm())) {
					return;
				}
				down0().ym(up0().ym());
				down0().usr_cd(up0().usr_cd());
				down0().usr_nm(usrR.usr_nm());
				down0().setStatus(MCRow.CREATE);
			}
		}

		/**
		 * 入力別販売計画検索
		 */
		protected void srchSpln(){
			srchSplnFix();
			srchSplnDtl();
		}

		// ---------------------販売計画情報検索---------------------
		// 下り電文雛形 販売計画確定データ
		protected MCList<Srch01_FixDtlR> _fixDtlL = MCList.create(Srch01_FixDtlR.class);
		protected MCIndexKey _fixDtlIdx = null;
		// 下り電文雛形 販売計画明細データ
		protected MCList<Srch01_DtlR> _dtlL = MCList.create(Srch01_DtlR.class);
		protected MCIndexKey _dtlIdx = null;

		/**
		 * 入力別販売計画確定検索
		 */
		protected void srchSplnFix(){
			MCList<Srch01_FixDtlR> splnFmtL = MCList.create(Srch01_FixDtlR.class);
			MCQueryPlan sql = MSBBL0110_MST_SPLN_FMT_S01();
			executeQuery(splnFmtL, sql, up0());

			insMSW_SPLN_USR_FIX(splnFmtL);
			MCList<Srch01_FixDtlR> fixDtlL = MCList.create(Srch01_FixDtlR.class);
			MCList<Srch01_DtlR> dtlL = MCList.create(Srch01_DtlR.class);
			crtInptForm(splnFmtL, up0().spln_ym_fr(), up0().spln_ym_to(), fixDtlL, dtlL);

			_fixDtlL.setAll(fixDtlL);
			_fixDtlIdx = _fixDtlL.createIndex(_srchFixDtlKeys);
			_dtlL.setAll(dtlL);
			_dtlIdx = _dtlL.createIndex(_srchDtlKeys);
		}

		/**
		 * 検索ワーク登録
		 */
		protected void insMSW_SPLN_USR_FIX(MCList<Srch01_FixDtlR> fixDtlL){
			MCList<MST_SPLN_USR_FIX_R> wkL = MCList.create(MST_SPLN_USR_FIX_R.class);
			for (Srch01_FixDtlR r : fixDtlL.distinctNE(_srchFixDtlKeys)) {
				MST_SPLN_USR_FIX_R tmpR = MST_SPLN_USR_FIX_R.create();
				tmpR.usr_cd(up0().usr_cd());
				tmpR.ym(up0().ym());
				tmpR.dpt_cd(r.dpt_cd());
				tmpR.cst_cd(r.cst_cd());
				tmpR.wrk_no(r.wrk_no());
				tmpR.spln_itm_cd(r.spln_itm_cd());
				tmpR.itm_cd(r.itm_cd());
				tmpR.itm_sub1(r.itm_sub1());
				tmpR.itm_sub2(r.itm_sub2());
				tmpR.itm_sub3(r.itm_sub3());
				tmpR.cur_cd(r.cur_cd());
				wkL.add(tmpR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SPLN_USR_FIX_R.create("T"));
			dbWkDelete("MSBBL0110_MSW_SPLN_USR_FIX_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBBL0110_MSW_SPLN_USR_FIX_I01", wkL, wkL_bldr.getBaseDbc());
		}

		/**
		 * 入力別販売計画明細検索
		 */
		protected void srchSplnDtl(){
			// 今回計画年月データ検索
			srchCurrentYmSpln();
			// 前回計画年月データ検索
			srchPreYmSpln();
			// 実績データ検索
			srchFrcstSloSum();
		}

		/**
		 * 入力別・今回計画年月販売計画検索
		 */
		protected void srchCurrentYmSpln() {
			MCList<MST_SPLN_USR_DTL_R> dbcL = MCList.create(MST_SPLN_USR_DTL_R.class);
			executeQuery(dbcL, MSBBL0110_MST_SPLN_USR_DTL_S01(), up0());
			mergeDtl(dbcL, Srch01_DtlR.$spln_qty, Srch01_DtlR.$spln_amt, true);
		}

		/**
		 * 入力別・前回計画年月販売計画検索
		 */
		protected void srchPreYmSpln() {
			if (!up0().pre_flg()) {
				return;
			}
			MCList<MST_SPLN_USR_DTL_R> tmpL = MCList.create(MST_SPLN_USR_DTL_R.class);
			executeQuery(tmpL, MSBBL0110_MST_SPLN_USR_DTL_S02(), up0());
			// 最新計画年月のレコードを取得
			MCList<MST_SPLN_USR_DTL_R> retL = crtLatestData(tmpL);
			mergeDtl(retL, Srch01_DtlR.$pre_spln_qty, Srch01_DtlR.$pre_spln_amt, false);
		}

		/**
		 * 入力別・顧客期間内示・受注集計情報検索
		 */
		protected void srchFrcstSloSum() {
			if (!up0().act_flg()) {
				return;
			}
			MCList<MST_FRCST_SLO_SUM_R> rsltL = MCList.create(MST_FRCST_SLO_SUM_R.class);
			executeQuery(rsltL, MSBBL0110_MST_FRCST_SLO_SUM_S01(), up0());
			mergeFrcstSloSum(rsltL, _fixDtlL, _fixDtlIdx, _dtlL, _dtlIdx);
		}

		/**
		 * 下り電文編集
		 */
		protected void setDown() {
			if (!isNull(_fixDtlL)) {
				down1().setAll(_fixDtlL);
				down2().setAll(_dtlL);
			}
			else {
				if (down0().isStatusCreate() || !up0().hdr_del_flg()) {
					down0().clear();
				}
			}
		}

		/**
		 * 数量金額を入力フォームにマージする
		 */
		protected void mergeDtl(MCList<MST_SPLN_USR_DTL_R> dbcL, String qtyCol, String amtCol, boolean addFlg) {
			for (MST_SPLN_USR_DTL_R dbcR : dbcL){
				Srch01_FixDtlR fixR = _fixDtlL.getFirst(_fixDtlIdx, getVals(_srchFixDtlKeys, dbcR));
				if (!isNull(fixR)) {
					Comparable[] vals = new Comparable[]{fixR.grp_peg_no(), dbcR.spln_ym()};
					Srch01_DtlR dtlR = _dtlL.getFirst(_dtlIdx, vals);
					if (dtlR == null) {
						if (!addFlg) {
							continue;
						}
						dtlR = Srch01_DtlR.create();
						dtlR.grp_peg_no(fixR.grp_peg_no());
						dtlR.spln_ym(dbcR.spln_ym());
						_dtlL.add(dtlR);
						_dtlIdx = _dtlL.createIndex(_srchDtlKeys);
					}
					dtlR.setNumber(qtyCol, dbcR.spln_qty());
					dtlR.setNumber(amtCol, dbcR.spln_amt());
				}
			}
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 */
	public class Srch02 extends MSBBL_MlySPlnReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			if(!chkParam()){
				return;
			}
			editUp();
			srchHdr();
			if (isNull(down0().ym())) {
				return;
			}
			srchSpln();
			srchUsrDtl();
			setDown();
		}

		/**
		 * 上り電文チェック
		 */
		protected boolean chkParam() {
			if(isNullOr(up0().dpt_cd(), up0().ym(), up0().spln_ym_fr(), up0().spln_ym_to())){
				return false;
			}
			return true;
		}

		/**
		 * 前処理
		 */
		protected void editUp() {
			// 得意先ＣＤ
			if (isNull(up0().cst_cd())) {
				up0().cst_cd(MAC_STR.NULL_VAL.value());
			}
			// 案件ＮＯ
			if (isNull(up0().wrk_no())) {
				up0().wrk_no(MAC_STR.NULL_VAL.value());
			}
			
			// 会計締日、会計月度基準を設定
			up0().addNumberColumn("ac_cl_day", getCo().ac_cl_day());
			up0().addNumberColumn("ac_cl_mon_base", getCo().ac_cl_mon_base());
			// 登録済・未登録
			editUpOnOffStr(up0(), "reg_flg_str", up0().reg_t_flg(), up0().reg_f_flg());
			// 確定済・未確定
			editUpOnOffStr(up0(), "fix_flg_str", up0().fix_t_flg(), up0().fix_f_flg());
		}

		/**
		 * 集計別販売計画バージョン検索
		 */
		protected void srchHdr(){
			// 訂正・取消時
			if (!isNull(up0().spln_vers())) {
				executeQuery(down0(), MSBBL0110_MST_SPLN_SUM_VERS_S01(), up0());
			}
			// 新規登録時
			else {
				MAM_DPT_R dptR = MAM_DPT_R.create();
				MAM_DPT_R t = MAM_DPT_R.create("T");
				MCQueryApiBuilder dptR_bldr = MCQueryApiBuilder.create(t);
				dptR_bldr.setSelect(t.dpt_cd);
				dptR_bldr.addSelect(t.dpt_nm);
				dptR_bldr.addSelect(t.dpt_lvl_cd);
				dptR_bldr.addSelect(t.del_flg);
				dptR_bldr.setWhere(t.dpt_cd.eq(bind("1")), up0().dpt_cd());
				dptR_bldr.addWhereWithAnd(t.sls_dpt_flg.eq(bind("1")), toTrueStr(true));
				dptR_bldr.addWhereWithAnd(
						MAPA_DT$F_GET_YM_ST_DT_NE2(bind("1"), bind("2"), bind("3"))
								.between(t.st_dt, t.end_dt),
						up0().ym(), getCo().ac_cl_day(), getCo().ac_cl_mon_base());
				dbSelect("MSBBL0110_MAM_DPT_S01", dptR, dptR_bldr);
				if (dptR.del_flg() || isNull(dptR.dpt_nm())) {
					return;
				}
				Srch02_HdrR hdrR = crtHdr(dptR);
				MCRow.copyall(down0(), hdrR);
			}
		}

		/**
		 * ヘッダ情報（集計別バージョン）作成
		 */
		protected Srch02_HdrR crtHdr(MAM_DPT_R dptR) {
			Srch02_HdrR retR = Srch02_HdrR.create();
			if (!isNullOrNullVal(up0().wrk_no())) {
				MST_WRK_R wrkR = MST_WRK_R.create();
				MST_WRK_R t = MST_WRK_R.create("T");
				MCQueryApiBuilder wrkR_bldr = MCQueryApiBuilder.create(t);
				wrkR_bldr.setSelect(t.wrk_nm);
				wrkR_bldr.setWhere(t.wrk_no.eq(bind("1")), up0().wrk_no());
				wrkR_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
				if (dbSelect("MSBBL0110_MST_WRK_S01", wrkR, wrkR_bldr) > 0) {
					retR.wrk_nm(wrkR.wrk_nm());
				}
				else {
					return retR;
				}
			}
			if (!isNullOrNullVal(up0().cst_cd())) {
				MAM_BP_R cstR = MAM_BP_R.create();
				MAM_BP_R t = MAM_BP_R.create("T");
				MCQueryApiBuilder cstR_bldr = MCQueryApiBuilder.create(t);
				cstR_bldr.setSelect(t.bp_nm);
				cstR_bldr.setWhere(t.bp_cd.eq(bind("1")), up0().cst_cd());
				cstR_bldr.addWhereWithAnd(t.del_flg.eq(value(false)));
				if (dbSelect("MSBBL0110_MAM_BP_S01", cstR, cstR_bldr) > 0) {
					retR.cst_nm(cstR.bp_nm());
				}
				else {
					return retR;
				}
			}
			retR.ym(up0().ym());
			retR.dpt_cd(up0().dpt_cd());
			retR.dpt_nm(dptR.dpt_nm());
			retR.dpt_lvl_cd(dptR.dpt_lvl_cd());
			retR.cst_cd(up0().cst_cd());
			retR.wrk_no(up0().wrk_no());
			retR.setStatus(MCRow.Status.CREATE);
			return retR;
		}

		/**
		 * 集計別販売計画検索
		 */
		protected void srchSpln(){
			srchSplnFix();
			srchSplnDtl();
		}

		// 下り電文雛形 販売計画確定データ
		protected MCList<Srch01_FixDtlR> _fixDtlL = MCList.create(Srch01_FixDtlR.class);
		protected MCIndexKey _fixDtlIdx = null;
		// 下り電文雛形 販売計画明細データ
		protected MCList<Srch01_DtlR> _dtlL = MCList.create(Srch01_DtlR.class);
		protected MCIndexKey _dtlIdx = null;

		/**
		 * 集計別販売計画確定検索
		 */
		protected void srchSplnFix() {
			MCList<Srch01_FixDtlR> splnFmtL = MCList.create(Srch01_FixDtlR.class);
			MCQueryPlan sql = MSBBL0110_MST_SPLN_FMT_S02();
			executeQuery(splnFmtL, sql, up0());

			insMSW_SPLN_SUM_FIX(splnFmtL);
			MCList<Srch01_FixDtlR> fixDtlL = MCList.create(Srch01_FixDtlR.class);
			MCList<Srch01_DtlR> dtlL = MCList.create(Srch01_DtlR.class);
			crtInptForm(splnFmtL, up0().spln_ym_fr(), up0().spln_ym_to(), fixDtlL, dtlL);

			_fixDtlL.setAll(fixDtlL);
			_fixDtlIdx = _fixDtlL.createIndex(_srchFixDtlKeys);
			_dtlL.setAll(dtlL);
			_dtlIdx = _dtlL.createIndex(_srchDtlKeys);
		}

		/**
		 * 検索ワーク登録
		 */
		protected void insMSW_SPLN_SUM_FIX(MCList<Srch01_FixDtlR> fixDtlL){
			MCList<MST_SPLN_SUM_FIX_R> wkL = MCList.create(MST_SPLN_SUM_FIX_R.class);
			for (Srch01_FixDtlR r : fixDtlL.distinctNE(_srchFixDtlKeys)) {
				MST_SPLN_SUM_FIX_R tmpR = MST_SPLN_SUM_FIX_R.create();
				tmpR.spln_vers(up0().spln_vers());
				tmpR.ym(up0().ym());
				tmpR.dpt_cd(r.dpt_cd());
				tmpR.cst_cd(r.cst_cd());
				tmpR.wrk_no(r.wrk_no());
				tmpR.spln_itm_cd(r.spln_itm_cd());
				tmpR.itm_cd(r.itm_cd());
				tmpR.itm_sub1(r.itm_sub1());
				tmpR.itm_sub2(r.itm_sub2());
				tmpR.itm_sub3(r.itm_sub3());
				tmpR.cur_cd(r.cur_cd());
				wkL.add(tmpR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SPLN_SUM_FIX_R.create("T"));
			dbWkDelete("MSBBL0110_MSW_SPLN_SUM_FIX_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBBL0110_MSW_SPLN_SUM_FIX_I01", wkL, wkL_bldr.getBaseDbc());
		}

		/**
		 * 集計別販売計画明細検索
		 */
		protected void srchSplnDtl(){
			// 今回計画年月データ検索
			srchCurrentYmSpln();
			// 前回計画年月データ検索
			srchPreYmSpln();
			// 比較バージョンデータ検索
			srchRefVer();
			// 顧客期間内示・受注集計情報検索
			srchFrcstSloSum();
		}

		/**
		 * 下り電文編集
		 */
		protected void setDown() {
			if (!isNull(_fixDtlL)) {
				down1().setAll(_fixDtlL);
				down2().setAll(_dtlL);
			}
			else {
				if (down0().isStatusCreate() || !up0().hdr_del_flg()) {
					down0().clear();
					down3().clear();
				}
			}
		}

		/**
		 * 集計別・今回計画年月販売計画検索
		 */
		protected void srchCurrentYmSpln() {
			MCList<MST_SPLN_USR_DTL_R> dbcL= MCList.create(MST_SPLN_USR_DTL_R.class);
			MCQueryPlan sql = MSBBL0110_MST_SPLN_SUM_DTL_S01();
			executeQuery(dbcL, sql, up0());
			mergeDtl(dbcL, Srch01_DtlR.$spln_qty, Srch01_DtlR.$spln_amt, true);
		}

		/**
		 * 集計別・前回計画年月販売計画検索
		 */
		protected void srchPreYmSpln() {
			if (!up0().pre_flg()) {
				return;
			}
			MCList<MST_SPLN_USR_DTL_R> tmpL = MCList.create(MST_SPLN_USR_DTL_R.class);
			executeQuery(tmpL, MSBBL0110_MST_SPLN_SUM_DTL_S02(), up0());
			// 最新計画年月のレコードを取得
			MCList<MST_SPLN_USR_DTL_R> retL = crtLatestData(tmpL);
			mergeDtl(retL, Srch01_DtlR.$pre_spln_qty, Srch01_DtlR.$pre_spln_amt, false);
		}

		/**
		 * 集計別・比較バージョン販売計画検索
		 */
		protected void srchRefVer() {
			if (!up0().ref_flg()) {
				return;
			}
			// 比較バージョンの判断
			if (isNull(up0().ref_vers())) {
				if (isNull(down0().ref_vers())){
					return;
				}
				up0().ref_vers(down0().ref_vers());
			}
			MCList<MST_SPLN_USR_DTL_R> tmpL = MCList.create(MST_SPLN_USR_DTL_R.class);
			executeQuery(tmpL, MSBBL0110_MST_SPLN_SUM_DTL_S03(), up0());
			mergeDtl(tmpL, Srch01_DtlR.$ref_spln_qty, Srch01_DtlR.$ref_spln_amt, false);
		}

		/**
		 * 集計別・顧客期間内示・受注集計情報検索
		 */
		protected void srchFrcstSloSum() {
			if (!up0().act_flg()) {
				return;
			}
			MCList<MST_FRCST_SLO_SUM_R> rsltL = MCList.create(MST_FRCST_SLO_SUM_R.class);
			executeQuery(rsltL, MSBBL0110_MST_FRCST_SLO_SUM_S02(), up0());
			mergeFrcstSloSum(rsltL, _fixDtlL, _fixDtlIdx, _dtlL, _dtlIdx);
		}

		/**
		 * 集計別・入力別最新データ検索
		 */
		protected void srchUsrDtl() {
			MCList<MST_SPLN_USR_DTL_R> tmpL = MCList.create(MST_SPLN_USR_DTL_R.class);
			executeQuery(tmpL, MSBBL0110_MST_SPLN_USR_DTL_S04(), up0());
			String[] keys = {
					MST_SPLN_USR_DTL_R.$usr_cd,
					MST_SPLN_USR_DTL_R.$dpt_cd,
					MST_SPLN_USR_DTL_R.$spln_itm_cd,
					MST_SPLN_USR_DTL_R.$itm_cd,
					MST_SPLN_USR_DTL_R.$itm_sub1,
					MST_SPLN_USR_DTL_R.$itm_sub2,
					MST_SPLN_USR_DTL_R.$itm_sub3,
					MST_SPLN_USR_DTL_R.$cur_cd,
					MST_SPLN_USR_DTL_R.$spln_ym};
			String[] subKeys = {
					MST_SPLN_USR_DTL_R.$cst_cd,
					MST_SPLN_USR_DTL_R.$wrk_no
			};
			for (MCList<MST_SPLN_USR_DTL_R> grpL : tmpL.groupList(keys)) {
				MST_SPLN_USR_DTL_R baseR = grpL.get(0).clone();
				baseR.cst_cd(up0().cst_cd());
				baseR.wrk_no(up0().wrk_no());
				baseR.spln_qty(0);
				baseR.spln_amt(0);
				for (MCList<MST_SPLN_USR_DTL_R> subL : grpL.groupList(subKeys)) {
					subL.sort(SortType.DESC, MST_SPLN_USR_DTL_R.$ym);
					MST_SPLN_USR_DTL_R subR = subL.get(0);
					baseR.spln_qty(MCNumber.sum(baseR.spln_qty(), subR.spln_qty()));
					baseR.spln_amt(MCNumber.sum(baseR.spln_amt(), subR.spln_amt()));
					baseR.setStringNE("intr_rmrks", subR.getStringNE("intr_rmrks"));
				}
				
				Srch01_FixDtlR fixR = _fixDtlL.getFirst(_fixDtlIdx, getVals(_srchFixDtlKeys, baseR));
				if (!isNull(fixR)) {
					Srch02_UsrDtlR r = Srch02_UsrDtlR.create();
					r.grp_peg_no(fixR.grp_peg_no());
					r.usr_cd(baseR.usr_cd());
					r.usr_nm(baseR.getStringNE("usr_nm"));
					r.spln_ym(baseR.spln_ym());
					r.spln_qty(baseR.spln_qty());
					r.spln_amt(baseR.spln_amt());
					r.intr_rmrks(baseR.getStringNE("intr_rmrks"));
					down3().add(r);
				}
			}
		}

		/**
		 * 数量金額を入力フォームにマージする
		 */
		protected void mergeDtl(MCList<MST_SPLN_USR_DTL_R> dbcL, String qtyCol, String amtCol, boolean addFlg) {
			for (MST_SPLN_USR_DTL_R dbcR : dbcL){
				Srch01_FixDtlR fixR = _fixDtlL.getFirst(_fixDtlIdx, getVals(_srchFixDtlKeys, dbcR));
				if (!isNull(fixR)) {
					Comparable[] vals = new Comparable[]{fixR.grp_peg_no(), dbcR.spln_ym()};
					Srch01_DtlR dtlR = _dtlL.getFirst(_dtlIdx, vals);
					if (dtlR == null) {
						if (!addFlg) {
							continue;
						}
						dtlR = Srch01_DtlR.create();
						dtlR.grp_peg_no(fixR.grp_peg_no());
						dtlR.spln_ym(dbcR.spln_ym());
						_dtlL.add(dtlR);
						_dtlIdx = _dtlL.createIndex(_srchDtlKeys);
					}
					dtlR.setNumber(qtyCol, dbcR.spln_qty());
					dtlR.setNumber(amtCol, dbcR.spln_amt());
				}
			}
		}
	}

	/**
	 * Srch03オペレーション.<p>
	 *
	 */
	public class Srch03 extends MSBBL_MlySPlnReg_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			// 上り電文チェック
			if(!chkParam()){
				return;
			}
			// 前処理
			editUp();
			// 入力別販売計画検索
			srchSpln();
		}

		/**
		 * 上り電文チェック
		 */
		protected boolean chkParam() {
			if(isNullOr(up0().spln_ym_fr(), up0().spln_ym_to())){
				return false;
			}
			return true;
		}

		/**
		 * 前処理
		 */
		protected void editUp() {
			// 会計締日、会計月度基準を設定
			up0().addNumberColumn("ac_cl_day", getCo().ac_cl_day());
			up0().addNumberColumn("ac_cl_mon_base", getCo().ac_cl_mon_base());
			// 検索条件を設定
			if (!up0().fix_f_flg()) {
				up0().addStringColumn("fix_t_flg_str", toTrueStr(true));
			}
			if (!up0().del_flg()) {
				up0().addStringColumn("del_flg_str", toFalseStr(false));
			}
		}

		/**
		 * 入力別販売計画明細参照検索、計画年月別データ作成
		 */
		protected void srchSpln() {
			// 明細データ取得
			MCList<Srch03_FixDtlR> dtlL = MCList.create(Srch03_FixDtlR.class);
			executeQuery(dtlL, MSBBL0110_MST_SPLN_USR_DTL_S03(), up0());
			
			String[] fixAllYmKeys = new String[]{
					Srch03_FixDtlR.$usr_cd,
					Srch03_FixDtlR.$dpt_cd,
					Srch03_FixDtlR.$cst_cd,
					Srch03_FixDtlR.$wrk_no,
					Srch03_FixDtlR.$spln_itm_cd,
					Srch03_FixDtlR.$itm_cd,
					Srch03_FixDtlR.$itm_sub1,
					Srch03_FixDtlR.$itm_sub2,
					Srch03_FixDtlR.$itm_sub3,
					Srch03_FixDtlR.$cur_cd};
			
			// 確定データ作成＋明細データ作成
			MCNumber grpPegNo = MCNumber.ZERO;
			MCList<Srch03_FixDtlR> tmpFixL = MCList.create(Srch03_FixDtlR.class);
			MCList<Srch01_DtlR> tmpDtlL = MCList.create(Srch01_DtlR.class);
			for (MCList<Srch03_FixDtlR> fixAllYmL : dtlL.groupList(fixAllYmKeys)) {
				// 確定データ作成
				// 最新の計画年月のデータのみ表示する
				if (isNullAnd(up0().ym_fr(), up0().ym_to())) {
					MCDate maxYm = (MCDate)fixAllYmL.max(Srch03_FixDtlR.$ym);
					Srch03_FixDtlR fixR = fixAllYmL.getFirst(Srch03_FixDtlR.$ym, maxYm);
					fixR.grp_peg_no(grpPegNo);
					tmpFixL.add(fixR);
					grpPegNo = grpPegNo.add(1);
				}
				// 過去の計画年月のデータも表示する
				else {
					for (MCList<Srch03_FixDtlR> fixL : fixAllYmL.groupList(Srch03_FixDtlR.$ym)) {
						Srch03_FixDtlR fixR = fixL.get(0);
						// 検索条件の考慮：　「計画年月ＦＲＯＭ＞計画年月」となるデータを除外する
						if (!isNull(up0().ym_fr()) && up0().ym_fr().gt(fixR.ym())) {
							continue;
						}
						fixR.grp_peg_no(grpPegNo);
						tmpFixL.add(fixR);
						grpPegNo = grpPegNo.add(1);
					}
				}
				
				// 明細データ作成
				editDtl(tmpFixL, fixAllYmL, tmpDtlL);
				
				// 下り電文設定
				down0().addAll(tmpFixL);
				down1().addAll(tmpDtlL);
				tmpFixL.clear();
				tmpDtlL.clear();
			}
		}

		/**
		 * 計画年月ごと最新の販売計画データを編集(Srch03)
		 */
		protected void editDtl(MCList<Srch03_FixDtlR> fixL, MCList<Srch03_FixDtlR> dtlL, MCList<Srch01_DtlR> rsltL){
			// 確定データごとに明細データを作成する
			for (Srch03_FixDtlR fixR : fixL) {
				// 今回と前回以前の明細データに絞る
				MCList<Srch03_FixDtlR> tmpDtlL = dtlL.subList(r->r.ym().lte(fixR.ym()));
				
				// 販売年月ごとに最新の明細データを作成する
				for (MCList<Srch03_FixDtlR> splnYmL : tmpDtlL.groupList(Srch03_FixDtlR.$spln_ym)) {
					// 確定データに対応する明細データの探索
					Srch03_FixDtlR dtlR = null;
					splnYmL.sort(SortType.DESC, Srch03_FixDtlR.$ym);
					for (Srch03_FixDtlR r : splnYmL) {
						if (r.fix_flg()) {
							dtlR = r;
							break;
						}
						// 未確定含む場合、確定データの年月の未確定データを表示する
						if (up0().fix_f_flg() && isSame(fixR.ym(), r.ym())) {
							dtlR = r;
							break;
						}
					}
					
					// 明細データが見つかった場合、下り電文に追加するMCRowを作成する
					if (dtlR != null) {
						Srch01_DtlR tmpR = Srch01_DtlR.create();
						tmpR.grp_peg_no(fixR.grp_peg_no());
						tmpR.spln_ym(dtlR.spln_ym());
						tmpR.spln_qty(dtlR.spln_qty());
						tmpR.spln_amt(dtlR.spln_amt());
						rsltL.add(tmpR);
					}
				}
			}
		}
	}

	/**
	 * Srch04オペレーション.<p>
	 *
	 */
	public class Srch04 extends MSBBL_MlySPlnReg_MC_A.Srch04 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			// 上り電文チェック
			if(!chkParam()) {
				return;
			}
			// 前処理
			editUp();
			// 集計別販売計画検索
			srchSpln();
		}

		/**
		 * 上り電文チェック
		 */
		protected boolean chkParam() {
			if(isNullOr(up0().spln_ym_fr(), up0().spln_ym_to())){
				return false;
			}
			return true;
		}

		/**
		 * 前処理
		 */
		protected void editUp() {
			// 会計締日、会計月度基準を設定
			up0().addNumberColumn("ac_cl_day", getCo().ac_cl_day());
			up0().addNumberColumn("ac_cl_mon_base", getCo().ac_cl_mon_base());
			// 検索条件を設定
			if (!up0().fix_f_flg()) {
				up0().addStringColumn("fix_t_flg_str", toTrueStr(true));
			}
			if (!up0().del_flg()) {
				up0().addStringColumn("del_flg_str", toFalseStr(false));
			}
			if (isNull(up0().spln_vers())) {
				up0().addStringColumn("adopted_flg_str", toTrueStr(true));
			}
		}

		/**
		 * 集計別販売計画明細参照検索、計画年月別データ作成
		 */
		protected void srchSpln() {
			// 明細データ取得
			MCList<Srch03_FixDtlR> dtlL = MCList.create(Srch03_FixDtlR.class);
			executeQuery(dtlL, MSBBL0110_MST_SPLN_SUM_DTL_S04(), up0());
			
			String[] fixAllYmKeys = new String[]{
					Srch03_FixDtlR.$dpt_cd,
					Srch03_FixDtlR.$cst_cd,
					Srch03_FixDtlR.$wrk_no,
					Srch03_FixDtlR.$spln_itm_cd,
					Srch03_FixDtlR.$itm_cd,
					Srch03_FixDtlR.$itm_sub1,
					Srch03_FixDtlR.$itm_sub2,
					Srch03_FixDtlR.$itm_sub3,
					Srch03_FixDtlR.$cur_cd};
			
			// 確定データ作成＋明細データ作成
			MCNumber grpPegNo = MCNumber.ZERO;
			MCList<Srch03_FixDtlR> tmpFixL = MCList.create(Srch03_FixDtlR.class);
			MCList<Srch01_DtlR> tmpDtlL = MCList.create(Srch01_DtlR.class);
			for (MCList<Srch03_FixDtlR> fixAllYmL : dtlL.groupList(fixAllYmKeys)) {
				// 確定データ作成
				// 最新の計画年月のデータのみ表示する
				if (isNullAnd(up0().ym_fr(), up0().ym_to())) {
					MCDate maxYm = (MCDate)fixAllYmL.max(Srch03_FixDtlR.$ym);
					HashSet<String> map = new HashSet<>();
					for (Srch03_FixDtlR fixR : fixAllYmL) {
						if (!isSame(maxYm, fixR.ym()) || map.contains(fixR.spln_vers())) {
							continue;
						}
						if (!isNull(up0().spln_vers()) && !isLike(fixR.spln_vers(), up0().spln_vers())) {
							continue;
						}
						map.add(fixR.spln_vers());
						fixR.grp_peg_no(grpPegNo);
						tmpFixL.add(fixR);
						grpPegNo = grpPegNo.add(1);
					}
				}
				// 過去の計画年月のデータも表示する
				else {
					for (MCList<Srch03_FixDtlR> fixL : fixAllYmL
							.groupList(Srch03_FixDtlR.$ym, Srch03_FixDtlR.$spln_vers)) {
						Srch03_FixDtlR fixR = fixL.get(0);
						// 検索条件の考慮：　「計画年月ＦＲＯＭ＞計画年月」となるデータを除外する
						if (!isNull(up0().ym_fr()) && up0().ym_fr().gt(fixR.ym())) {
							continue;
						}
						if (!isNull(up0().spln_vers()) && !isLike(fixR.spln_vers(), up0().spln_vers())) {
							continue;
						}
						fixR.grp_peg_no(grpPegNo);
						tmpFixL.add(fixR);
						grpPegNo = grpPegNo.add(1);
					}
				}
				
				// 明細データ作成
				editDtl(tmpFixL, fixAllYmL, tmpDtlL);
				
				// 下り電文設定
				down0().addAll(tmpFixL);
				down1().addAll(tmpDtlL);
				tmpFixL.clear();
				tmpDtlL.clear();
			}
		}

		/**
		 * 計画年月ごと最新の販売計画データを編集(Srch04)
		 */
		protected void editDtl(MCList<Srch03_FixDtlR> fixL, MCList<Srch03_FixDtlR> dtlL, MCList<Srch01_DtlR> rsltL){
			// 確定データごとに明細データを作成する
			for (Srch03_FixDtlR fixR : fixL) {
				// 今回（同一バージョン）と前回以前（採用バージョン／確定済データ）の明細データに絞る
				MCList<Srch03_FixDtlR> tmpDtlL = dtlL.subList(r -> 
								isSame(r.ym(), fixR.ym()) && isSame(r.spln_vers(), fixR.spln_vers())
								|| r.ym().lt(fixR.ym()) && r.adopted_flg() && r.fix_flg());
				
				// 販売年月ごとに最新の明細データを作成する
				for (MCList<Srch03_FixDtlR> splnYmL : tmpDtlL.groupList(Srch03_FixDtlR.$spln_ym)) {
					// 確定データに対応する明細データの探索
					Srch03_FixDtlR dtlR = null;
					splnYmL.sort(SortType.DESC, Srch03_FixDtlR.$ym);
					for (Srch03_FixDtlR r : splnYmL) {
						if (r.fix_flg()) {
							dtlR = r;
							break;
						}
						// 未確定含む場合、確定データの年月の未確定データを表示する
						if (up0().fix_f_flg() && isSame(fixR.ym(), r.ym())) {
							dtlR = r;
							break;
						}
					}
					
					// 明細データが見つかった場合、下り電文に追加するMCRowを作成する
					if (dtlR != null) {
						Srch01_DtlR tmpR = Srch01_DtlR.create();
						tmpR.grp_peg_no(fixR.grp_peg_no());
						tmpR.spln_ym(dtlR.spln_ym());
						tmpR.spln_qty(dtlR.spln_qty());
						tmpR.spln_amt(dtlR.spln_amt());
						rsltL.add(tmpR);
					}
				}
			}
		}
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 */
	public class Sprt01 extends MSBBL_MlySPlnReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			calc();
		}

		/**
		 * 上り電文編集
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * 数量金額計算
		 */
		protected void calc() {
			down0().setAll(up0());

			up0().addNumberColumn("peg_no");
			setPegNo(up0());
			MCList<Calc01_DtlR> calcL = MCList.create(Calc01_DtlR.class);
			for (Sprt01_DtlR upR: up0()) {
				if (!isNull(upR.spln_qty()) || !isNull(upR.spln_amt())) {
					Calc01_DtlR calcR = Calc01_DtlR.create();
					copy(calcR, upR, createMap_Calc01_DtlR_Sprt01_DtlR());
					calcL.add(calcR);
				}
			}
			if (isNull(calcL)) {
				return;
			}
			MSBBL_MlySPlnService.Calc01 calcSvc = MSBBL_MlySPlnService.crtCalc01();
			calcSvc.up0().setAll(calcL);
			calcSvc.exec();
			String[] destCol = new String[]{Sprt01_DtlR.$spln_qty, Sprt01_DtlR.$spln_amt};
			String[] srcCol = new String[]{Calc01_DtlR.$spln_qty, Calc01_DtlR.$spln_amt};
			copyByPegNo(down0(), destCol, calcSvc.down0(), srcCol);
			
			MCMessagePool.getMessageList().clear();
		}

		protected Map_Calc01_DtlR_Sprt01_DtlR<Calc01_DtlR,Sprt01_DtlR> createMap_Calc01_DtlR_Sprt01_DtlR() {
			return new Map_Calc01_DtlR_Sprt01_DtlR<Calc01_DtlR, Sprt01_DtlR>();
		}
		public class Map_Calc01_DtlR_Sprt01_DtlR<D extends Calc01_DtlR, S extends Sprt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Calc01_DtlR.$peg_no, "peg_no");
				addColumnPathMap(Calc01_DtlR.$spln_itm_cd, Sprt01_DtlR.$spln_itm_cd);
				addColumnPathMap(Calc01_DtlR.$itm_cd, Sprt01_DtlR.$itm_cd);
				addColumnPathMap(Calc01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub1);
				addColumnPathMap(Calc01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub2);
				addColumnPathMap(Calc01_DtlR.$itm_sub3, Sprt01_DtlR.$itm_sub3);
				addColumnPathMap(Calc01_DtlR.$cst_cd, Sprt01_DtlR.$cst_cd);
				addColumnPathMap(Calc01_DtlR.$dpt_cd, Sprt01_DtlR.$dpt_cd);
				addColumnPathMap(Calc01_DtlR.$spln_ym, Sprt01_DtlR.$spln_ym);
				addColumnPathMap(Calc01_DtlR.$cur_cd, Sprt01_DtlR.$cur_cd);
				addColumnPathMap(Calc01_DtlR.$spln_qty, Sprt01_DtlR.$spln_qty);
				addColumnPathMap(Calc01_DtlR.$spln_amt, Sprt01_DtlR.$spln_amt);
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 */
	public class Chk01 extends MSBBL_MlySPlnReg_MC_A.Chk01 {
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
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			if (!hasErrFlgOn(up0(), up1())) {
				// 部門DACチェック
				msgL.addAll(checkDptDAC());
				// 計画品目、品目の入力チェック
				msgL.addAll(checkAtLastOneInput());
				setErrFlg(msgL);
			}
			
			if (!hasErrFlgOn(up0(), up1())) {
				// 部門ロック
				lockDpt();
				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrLock());
				setErrFlg(msgL);
				if (hasErrFlgOn(up0(), up1())) {
					return msgL;
				}
				// 販売計画構成存在チェック
				msgL.addAll(checkSplnFmtExists());
				// 小数部有効桁数チェック
				msgL.addAll(checkInptDecPlace());
			}
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().addAll(up1());
		}

		/**
		 * 部門DACチェック
		 */
		protected MCMessageList checkDptDAC() {
			MCMessageList msgL = new MCMessageList();
			for (Chk01_DtlR r : up1().distinctNE(Chk01_DtlR.$dpt_cd)) {
				msgL.addAll(checkWritableDptCdDac(r, Chk01_DtlR.$dpt_cd));
			}
			return msgL;
		}

		/**
		 * 部門ロック
		 */
		protected void lockDpt(){
			lockSplnByDpts(getDpt());
		}

		/**
		 * ロック対象部門取得
		 */
		protected MCList<MST_SPLN_LOCK_R> getDpt(){
			MCList<MST_SPLN_LOCK_R> dptL = MCList.create(MST_SPLN_LOCK_R.class);
			for (Chk01_DtlR r : up1().distinctNE(Chk01_DtlR.$dpt_cd)) {
				MST_SPLN_LOCK_R dptR = MST_SPLN_LOCK_R.create();
				dptR.dpt_cd(r.dpt_cd());
				dptL.add(dptR);
			}
			return dptL;
		}

		/**
		 * 入力別販売計画バージョン更新カウンタチェック
		 */
		protected MCMessageList checkUpdCntrLock() {
			MCMessageList msgL = new MCMessageList();

			MST_SPLN_USR_VERS_R lockedR = MST_SPLN_USR_VERS_R.create();
			MST_SPLN_USR_VERS_R t = MST_SPLN_USR_VERS_R.create("T");
			MCQueryApiBuilder lockedR_bldr = MCQueryApiBuilder.create(t);
			lockedR_bldr.setSelect(t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBBL0110_MST_SPLN_USR_VERS_S01", lockedR, lockedR_bldr, up0());
			if (up0().isStatusCreate()) {
				if (!isNull(lockedR.upd_cntr())) {
					msgL.addAll(getRecordFoundMsg("MS", MST_SPLN_USR_VERS_R.create() , up0()));
				}
			}
			else {
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$upd_cntr, lockedR));
			}
			return msgL;
		}

		/**
		 * 計画品目、品目の入力チェック
		 */
		protected MCMessageList checkAtLastOneInput() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up1());
			for (Chk01_DtlR r: notErrL) {
				if (isNullOrNullVal(r.spln_itm_cd()) && isNullOrNullVal(r.itm_cd())) {
					msgL.add(msgAtLeastOneInput(r, Chk01_DtlR.$spln_itm_cd, Chk01_DtlR.$itm_cd));
				}
				else if (!isNullOrNullVal(r.spln_itm_cd()) && !isNullOrNullVal(r.itm_cd())) {
					msgL.add(msgTooManyInputs(r, Chk01_DtlR.$spln_itm_cd, Chk01_DtlR.$itm_cd));
				}
			}
			return msgL;
		}

		/**
		 * 販売計画構成存在チェック
		 */
		protected MCMessageList checkSplnFmtExists() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = up1().subList(r->!r.isStatusDelete());
			if (isNull(notErrL)) {
				return msgL;
			}
			
			MCList<MST_SPLN_USR_DTL_R> dtlWkL = MCList.create(MST_SPLN_USR_DTL_R.class);
			addAll(dtlWkL, notErrL, createMap_MST_SPLN_USR_DTL_R_Chk01_DtlR());
			dtlWkL.setString(MST_SPLN_USR_DTL_R.$usr_cd, up0().usr_cd());
			dtlWkL.setDate(MST_SPLN_USR_DTL_R.$ym, up0().ym());
			MCQueryApiBuilder dtlWkL_bldr = MCQueryApiBuilder.create(MST_SPLN_USR_DTL_R.create("T"));
			dbWkDelete("MSBBL0110_MSW_SPLN_USR_DTL_D01", dtlWkL_bldr.getBaseDbc());
			dbWkInsert("MSBBL0110_MSW_SPLN_USR_DTL_I01", dtlWkL, dtlWkL_bldr.getBaseDbc());

			MCRow con = MCRow.create();
			con.addNumberColumn("ac_cl_day", getCo().ac_cl_day());
			con.addNumberColumn("ac_cl_mon_base", getCo().ac_cl_mon_base());
			MCList<MST_SPLN_FMT_R> fmtL = MCList.create(MST_SPLN_FMT_R.class);
			executeQuery(fmtL, MSBBL0110_MSW_SPLN_USR_DTL_KEY_S02(), con);
			
			String[] keys = new String[] {
					MST_SPLN_FMT_R.$dpt_cd,
					MST_SPLN_FMT_R.$cst_cd,
					MST_SPLN_FMT_R.$wrk_no,
					MST_SPLN_FMT_R.$spln_itm_cd,
					MST_SPLN_FMT_R.$itm_cd,
					MST_SPLN_FMT_R.$itm_sub1,
					MST_SPLN_FMT_R.$itm_sub2,
					MST_SPLN_FMT_R.$itm_sub3,
					MST_SPLN_FMT_R.$cur_cd,
					MST_SPLN_USR_DTL_R.$spln_ym};
			MCIndexKey idxKey = fmtL.createIndex(keys);
			for (Chk01_DtlR upR : notErrL){
				MST_SPLN_FMT_R r = fmtL.getFirst(idxKey, getVals(keys, upR));
				if (isNull(r)){
					msgL.add(new MCMessage(upR, null,
							MSBBL0032,
							upR.dpt_cd(),
							upR.cst_cd(),
							upR.wrk_no(),
							upR.spln_itm_cd(),
							toDispItm(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3()),
							upR.cur_cd(),
							toYMString(upR.spln_ym()),
							toDispGUIIndex(upR)));
				}
				else {
					upR.spln_set_typ(r.spln_set_typ());
				}
			}
			return msgL;
		}

		/**
		 * 計画数量、計画金額の小数有効桁数チェック
		 */
		protected MCMessageList checkInptDecPlace() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up1());
			MCList<Chk01_DtlR> splnItmL = notErrL.subList(Chk01_DtlR.$itm_cd, MAC_STR.NULL_VAL.value());
			splnItmL.setNumber(Chk01_DtlR.$qty_dec_place, MCNumber.ZERO);
			for (Chk01_DtlR upR: notErrL){
				if (!isNull(upR.spln_qty())) {
					msgL.addAll(checkDecPlace(upR, Chk01_DtlR.$qty_dec_place, Chk01_DtlR.$spln_qty));
				}
				if (!isNull(upR.spln_amt())) {
					msgL.addAll(checkDecPlace(upR, Chk01_DtlR.$amt_dec_place, Chk01_DtlR.$spln_amt));
				}
			}
			return msgL;
		}

		protected Map_MST_SPLN_USR_DTL_R_Chk01_DtlR<MST_SPLN_USR_DTL_R,Chk01_DtlR> createMap_MST_SPLN_USR_DTL_R_Chk01_DtlR() {
			return new Map_MST_SPLN_USR_DTL_R_Chk01_DtlR<MST_SPLN_USR_DTL_R, Chk01_DtlR>();
		}
		public class Map_MST_SPLN_USR_DTL_R_Chk01_DtlR<D extends MST_SPLN_USR_DTL_R, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SPLN_USR_DTL_R.$dpt_cd, Chk01_DtlR.$dpt_cd);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$cst_cd, Chk01_DtlR.$cst_cd);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$wrk_no, Chk01_DtlR.$wrk_no);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$spln_itm_cd, Chk01_DtlR.$spln_itm_cd);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$cur_cd, Chk01_DtlR.$cur_cd);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$spln_ym, Chk01_DtlR.$spln_ym);
			}
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 */
	public class Chk02 extends MSBBL_MlySPlnReg_MC_A.Chk02 {
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
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			if (!hasErrFlgOn(up0(), up1())) {
				// 部門DACチェック
				msgL.addAll(checkDptDAC());
				// 計画品目、品目の入力チェック
				msgL.addAll(checkAtLastOneInput());
				setErrFlg(msgL);
			}
			
			if (!hasErrFlgOn(up0(), up1())) {
				// 部門ロック
				lockDpt();
				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrLock());
				setErrFlg(msgL);
				if (hasErrFlgOn(up0(), up1())) {
					return msgL;
				}
				// 販売計画構成存在チェック
				msgL.addAll(checkSplnFmtExists());
				// 小数部有効桁数チェック
				msgL.addAll(checkInptDecPlace());
				// 訂正可否チェック
				msgL.addAll(checkUpdatable());
				// 集計行の数量金額チェック
				msgL.addAll(checkUsrQtyAmt());
			}
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().addAll(up1());
		}

		/**
		 * 部門DACチェック
		 */
		protected MCMessageList checkDptDAC() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(checkWritableDptCdDac(up0(), Chk02_HdrR.$dpt_cd));
			return msgL;
		}

		/**
		 * 部門ロック
		 */
		protected void lockDpt(){
			lockSplnByDpt(up0().dpt_cd());
		}

		/**
		 * 集計別販売計画バージョン更新カウンタチェック
		 */
		protected MCMessageList checkUpdCntrLock() {
			MCMessageList msgL = new MCMessageList();

			MST_SPLN_SUM_VERS_R lockedR = MST_SPLN_SUM_VERS_R.create();
			MST_SPLN_SUM_VERS_R t = MST_SPLN_SUM_VERS_R.create("T");
			MCQueryApiBuilder lockedR_bldr = MCQueryApiBuilder.create(t);
			lockedR_bldr.setSelect(t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBBL0110_MST_SPLN_SUM_VERS_S01", lockedR, lockedR_bldr, up0());
			if (up0().isStatusCreate()) {
				if (!isNull(lockedR.upd_cntr())) {
					msgL.addAll(getRecordFoundMsg("MS", MST_SPLN_SUM_VERS_R.create() , up0()));
				}
			}
			else {
				msgL.addAll(checkUpdCntrNE(up0(), Chk04_HdrR.$upd_cntr, lockedR));
			}
			return msgL;
		}

		/**
		 * 計画品目、品目の入力チェック
		 */
		protected MCMessageList checkAtLastOneInput() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk02_DtlR> notErrL = getChkList(up1());
			for (Chk02_DtlR r: notErrL) {
				if (isNullOrNullVal(r.spln_itm_cd()) && isNullOrNullVal(r.itm_cd())) {
					msgL.add(msgAtLeastOneInput(r, Chk02_DtlR.$spln_itm_cd, Chk02_DtlR.$itm_cd));
				}
				else if (!isNullOrNullVal(r.spln_itm_cd()) && !isNullOrNullVal(r.itm_cd())) {
					msgL.add(msgTooManyInputs(r, Chk02_DtlR.$spln_itm_cd, Chk02_DtlR.$itm_cd));
				}
			}
			return msgL;
		}

		/**
		 * 販売計画構成存在チェック
		 */
		protected MCMessageList checkSplnFmtExists() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk02_DtlR> notErrL = up1().subList(r->!r.isStatusDelete());
			if (isNull(notErrL)) {
				return msgL;
			}
			
			MCList<MST_SPLN_SUM_DTL_R> dtlWkL = MCList.create(MST_SPLN_SUM_DTL_R.class);
			addAll(dtlWkL, notErrL, createMap_MST_SPLN_SUM_DTL_R_Chk02_DtlR());
			dtlWkL.setString(Chk02_HdrR.$dpt_cd, up0().dpt_cd());
			dtlWkL.setString(Chk02_HdrR.$cst_cd, up0().cst_cd());
			dtlWkL.setString(Chk02_HdrR.$wrk_no, up0().wrk_no());
			dtlWkL.setDate(Chk02_HdrR.$ym, up0().ym());
			dtlWkL.setString(Chk02_HdrR.$spln_vers, up0().spln_vers());
			MCQueryApiBuilder dtlWkL_bldr = MCQueryApiBuilder.create(MST_SPLN_SUM_DTL_R.create("T"));
			dbWkDelete("MSBBL0110_MSW_SPLN_SUM_DTL_D01", dtlWkL_bldr.getBaseDbc());
			dbWkInsert("MSBBL0110_MSW_SPLN_SUM_DTL_I01", dtlWkL, dtlWkL_bldr.getBaseDbc());
			
			MCRow con = MCRow.create();
			con.addNumberColumn("ac_cl_day", getCo().ac_cl_day());
			con.addNumberColumn("ac_cl_mon_base", getCo().ac_cl_mon_base());
			MCList<MST_SPLN_FMT_R> fmtL = MCList.create(MST_SPLN_FMT_R.class);
			executeQuery(fmtL, MSBBL0110_MSW_SPLN_SUM_DTL_KEY_S02(), con);
			
			String[] keys = new String[] {
					MST_SPLN_FMT_R.$spln_itm_cd,
					MST_SPLN_FMT_R.$itm_cd,
					MST_SPLN_FMT_R.$itm_sub1,
					MST_SPLN_FMT_R.$itm_sub2,
					MST_SPLN_FMT_R.$itm_sub3,
					MST_SPLN_FMT_R.$cur_cd,
					MST_SPLN_SUM_DTL_R.$spln_ym
				};
			MCIndexKey idxKey = fmtL.createIndex(keys);
			for (Chk02_DtlR upR : notErrL){
				MST_SPLN_FMT_R r = fmtL.getFirst(idxKey, getVals(keys, upR));
				if (isNull(r)){
					msgL.add(new MCMessage(upR, null,
							MSBBL0032,
							up0().dpt_cd(),
							up0().cst_cd(),
							up0().wrk_no(),
							upR.spln_itm_cd(),
							toDispItm(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3()),
							upR.cur_cd(),
							toYMString(upR.spln_ym()),
							toDispGUIIndex(upR)));
				}
				else {
					upR.spln_set_typ(r.spln_set_typ());
				}
			}
			return msgL;
		}

		/**
		 * 計画数量、計画金額の小数有効桁数チェック
		 */
		protected MCMessageList checkInptDecPlace() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk02_DtlR> notErrL = getChkList(up1());
			MCList<Chk02_DtlR> splnItmL = notErrL.subList(Chk02_DtlR.$itm_cd, MAC_STR.NULL_VAL.value());
			splnItmL.setNumber(Chk02_DtlR.$qty_dec_place, MCNumber.ZERO);
			for (Chk02_DtlR upR: notErrL){
				if (!isNull(upR.spln_qty())) {
					msgL.addAll(checkDecPlace(upR, Chk02_DtlR.$qty_dec_place, Chk02_DtlR.$spln_qty));
				}
				if (!isNull(upR.spln_amt())) {
					msgL.addAll(checkDecPlace(upR, Chk02_DtlR.$amt_dec_place, Chk02_DtlR.$spln_amt));
				}
			}
			return msgL;
		}

		/**
		 * 訂正可否チェック
		 */
		protected MCMessageList checkUpdatable(){
			MCMessageList msgL = new MCMessageList();
			MCList<MST_SPLN_SUM_VERS_R> dbcL = MCList.create(MST_SPLN_SUM_VERS_R.class);
			MST_SPLN_SUM_VERS_R t = MST_SPLN_SUM_VERS_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.spln_vers);
			dbcL_bldr.addSelect(t.locked_flg);
			dbcL_bldr.addSelect(t.adopted_flg);
			dbcL_bldr.setWhere(t.ym.eq(bind("1")), up0().ym());
			dbcL_bldr.addWhereWithAnd(t.dpt_cd.eq(bind("1")), up0().dpt_cd());
			dbcL_bldr.addWhereWithAnd(t.cst_cd.eq(bind("1")), up0().cst_cd());
			dbcL_bldr.addWhereWithAnd(t.wrk_no.eq(bind("1")), up0().wrk_no());
			dbSelect("MSBBL0110_MST_SPLN_SUM_VERS_S01", dbcL, dbcL_bldr);
			MST_SPLN_SUM_VERS_R selfVer = dbcL.getFirst(MST_SPLN_SUM_VERS_R.$spln_vers, up0().spln_vers());
			MST_SPLN_SUM_VERS_R adoptedVer  = dbcL.getFirst(MST_SPLN_SUM_VERS_R.$adopted_flg, true);
			if (selfVer != null) {
				if (selfVer.locked_flg() && !isNull(up1())) {
					msgL.add(new MCMessage(up0(), null,
							MSBBL0051,
							up0().dpt_cd(),
							up0().cst_cd(),
							up0().wrk_no(),
							toYMString(up0().ym()),
							up0().spln_vers()));
				}
				if (adoptedVer != null && !selfVer.adopted_flg() && up0().adopted_flg()) {
					msgL.add(new MCMessage(up0(), null,
							MSBBL0052,
							toYMString(up0().ym()),
							adoptedVer.spln_vers()));
				}
			}
			else {
				if (adoptedVer != null && up0().adopted_flg()) {
					msgL.add(new MCMessage(up0(), null,
							MSBBL0052,
							toYMString(up0().ym()),
							adoptedVer.spln_vers()));
				}
			}

			return msgL;
		}

		/**
		 * 集計行の数量金額チェック
		 */
		protected MCMessageList checkUsrQtyAmt(){
			MCMessageList msgL = new MCMessageList();
			MCList<Chk02_DtlR> chkL = up1().subList(r->r.sum_flg());
			if (isNull(chkL)) {
				return msgL;
			}

			MCList<MST_SPLN_USR_DTL_R> usrDtlL = srchUsrDtl(chkL);
			String[] submkeys = new String[] {
					MST_SPLN_USR_DTL_R.$spln_itm_cd,
					MST_SPLN_USR_DTL_R.$itm_cd,
					MST_SPLN_USR_DTL_R.$itm_sub1,
					MST_SPLN_USR_DTL_R.$itm_sub2,
					MST_SPLN_USR_DTL_R.$itm_sub3,
					MST_SPLN_USR_DTL_R.$cur_cd,
					MST_SPLN_USR_DTL_R.$spln_ym};
			for (Chk02_DtlR chkR : chkL) {
				MCList<MST_SPLN_USR_DTL_R> subL = usrDtlL.subList(submkeys, chkR.toArray(submkeys));
				MCNumber qty = subL.sum(MST_SPLN_USR_DTL_R.$spln_qty);
				MCNumber amt = subL.sum(MST_SPLN_USR_DTL_R.$spln_amt);
				if (!isSame(chkR.spln_qty(), qty) || !isSame(chkR.spln_amt(), amt)) {
					msgL.add(new MCMessage(chkR, null,
							MSBBL0244,
							chkR.spln_itm_cd(),
							toDispItm(chkR.itm_cd(), chkR.itm_sub1(), chkR.itm_sub2(), chkR.itm_sub3()),
							toYMString(chkR.spln_ym()),
							toDispGUIIndex(chkR)));
				}
			}
			return msgL;
		}

		/**
		 * 入力別販売計画明細検索＆集計
		 */
		protected MCList<MST_SPLN_USR_DTL_R> srchUsrDtl(MCList<Chk02_DtlR> chkL) {
			MCList<MST_SPLN_SUM_DTL_R> wkL = MCList.create(MST_SPLN_SUM_DTL_R.class);
			addAll(wkL, chkL, createMap_MST_SPLN_SUM_DTL_R_Chk02_DtlR());
			wkL.setString(MST_SPLN_SUM_DTL_R.$dpt_cd, up0().dpt_cd());
			wkL.setString(MST_SPLN_SUM_DTL_R.$cst_cd, up0().cst_cd());
			wkL.setString(MST_SPLN_SUM_DTL_R.$wrk_no, up0().wrk_no());
			wkL.setDate(MST_SPLN_SUM_DTL_R.$ym, up0().ym());
			wkL.setString(MST_SPLN_SUM_DTL_R.$spln_vers, up0().spln_vers());
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SPLN_SUM_DTL_R.create("T"));
			dbWkDelete("MSBBL0110_MSW_SPLN_SUM_DTL_D02", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBBL0110_MSW_SPLN_SUM_DTL_I02", wkL, wkL_bldr.getBaseDbc());

			MCList<MST_SPLN_USR_DTL_R> dtlL = MCList.create(MST_SPLN_USR_DTL_R.class);
			executeQuery(dtlL, MSBBL0110_MST_SPLN_USR_DTL_S05(), up0());
			String[] subLkeys = new String[] {
					MST_SPLN_USR_DTL_R.$usr_cd,
					MST_SPLN_USR_DTL_R.$dpt_cd,
					MST_SPLN_USR_DTL_R.$spln_itm_cd,
					MST_SPLN_USR_DTL_R.$itm_cd,
					MST_SPLN_USR_DTL_R.$itm_sub1,
					MST_SPLN_USR_DTL_R.$itm_sub2,
					MST_SPLN_USR_DTL_R.$itm_sub3,
					MST_SPLN_USR_DTL_R.$cur_cd,
					MST_SPLN_USR_DTL_R.$spln_ym};
			String[] subKeys = {
					MST_SPLN_USR_DTL_R.$cst_cd,
					MST_SPLN_USR_DTL_R.$wrk_no
			};
			MCList<MST_SPLN_USR_DTL_R> usrDtlL = MCList.create(MST_SPLN_USR_DTL_R.class);
			for (MCList<MST_SPLN_USR_DTL_R> grpL : dtlL.groupList(subLkeys)) {
				MST_SPLN_USR_DTL_R baseR = grpL.get(0).clone();
				baseR.spln_qty(0);
				baseR.spln_amt(0);
				for (MCList<MST_SPLN_USR_DTL_R> subL : grpL.groupList(subKeys)) {
					subL.sort(SortType.DESC, MST_SPLN_USR_DTL_R.$ym);
					MST_SPLN_USR_DTL_R subR = subL.get(0);
					baseR.spln_qty(MCNumber.sum(baseR.spln_qty(), subR.spln_qty()));
					baseR.spln_amt(MCNumber.sum(baseR.spln_amt(), subR.spln_amt()));
				}
				usrDtlL.add(baseR);
			}
			return usrDtlL;
		}

		protected Map_MST_SPLN_SUM_DTL_R_Chk02_DtlR<MST_SPLN_SUM_DTL_R,Chk02_DtlR> createMap_MST_SPLN_SUM_DTL_R_Chk02_DtlR() {
			return new Map_MST_SPLN_SUM_DTL_R_Chk02_DtlR<MST_SPLN_SUM_DTL_R, Chk02_DtlR>();
		}
		public class Map_MST_SPLN_SUM_DTL_R_Chk02_DtlR<D extends MST_SPLN_SUM_DTL_R, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$spln_itm_cd, Chk02_DtlR.$spln_itm_cd);
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$itm_cd, Chk02_DtlR.$itm_cd);
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$itm_sub1, Chk02_DtlR.$itm_sub1);
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$itm_sub2, Chk02_DtlR.$itm_sub2);
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$itm_sub3, Chk02_DtlR.$itm_sub3);
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$cur_cd, Chk02_DtlR.$cur_cd);
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$spln_ym, Chk02_DtlR.$spln_ym);
			}
		}
	}

	/**
	 * Chk03オペレーション.<p>
	 *
	 */
	public class Chk03 extends MSBBL_MlySPlnReg_MC_A.Chk03 {
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
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			if (!hasErrFlgOn(up0(), up1())) {
				// 部門DACチェック
				msgL.addAll(checkDptDAC());
				setErrFlg(msgL);
			}
			
			if (!hasErrFlgOn(up0(), up1())) {
				// 部門ロック
				lockDpt();
				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrLock());
			}
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().addAll(up1());
		}

		/**
		 * 部門DACチェック
		 */
		protected MCMessageList checkDptDAC() {
			MCMessageList msgL = new MCMessageList();
			for (Chk03_DtlR r : up1().distinctNE(Chk03_DtlR.$dpt_cd)) {
				msgL.addAll(checkWritableDptCdDac(r, Chk03_DtlR.$dpt_cd));
			}
			return msgL;
		}

		/**
		 * 部門ロック
		 */
		protected void lockDpt(){
			lockSplnByDpts(getDpt());
		}

		/**
		 * ロック対象部門取得
		 */
		protected MCList<MST_SPLN_LOCK_R> getDpt(){
			MCList<MST_SPLN_LOCK_R> dptL = MCList.create(MST_SPLN_LOCK_R.class);
			for (Chk03_DtlR r : up1().distinctNE(Chk03_DtlR.$dpt_cd)) {
				MST_SPLN_LOCK_R dptR = MST_SPLN_LOCK_R.create();
				dptR.dpt_cd(r.dpt_cd());
				dptL.add(dptR);
			}
			return dptL;
		}

		/**
		 * 入力別販売計画バージョン更新カウンタチェック
		 */
		protected MCMessageList checkUpdCntrLock() {
			MCMessageList msgL = new MCMessageList();

			MST_SPLN_USR_VERS_R lockedR = MST_SPLN_USR_VERS_R.create();
			MST_SPLN_USR_VERS_R t = MST_SPLN_USR_VERS_R.create("T");
			MCQueryApiBuilder lockedR_bldr = MCQueryApiBuilder.create(t);
			lockedR_bldr.setSelect(t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBBL0110_MST_SPLN_USR_VERS_S02", lockedR, lockedR_bldr, up0());
			msgL.addAll(checkUpdCntrNE(up0(), Chk03_HdrR.$upd_cntr, lockedR));
			return msgL;
		}
	}

	/**
	 * Chk04オペレーション.<p>
	 *
	 */
	public class Chk04 extends MSBBL_MlySPlnReg_MC_A.Chk04 {
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
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			if (!hasErrFlgOn(up0(), up1())) {
				// 部門DACチェック
				msgL.addAll(checkDptDAC());
				setErrFlg(msgL);
			}
			
			if (!hasErrFlgOn(up0(), up1())) {
				// 部門ロック
				lockDpt();
				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrLock());
			}
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().addAll(up1());
		}

		/**
		 * 部門DACチェック
		 */
		protected MCMessageList checkDptDAC() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(checkWritableDptCdDac(up0(), Chk04_HdrR.$dpt_cd));
			return msgL;
		}

		/**
		 * 部門ロック
		 */
		protected void lockDpt(){
			lockSplnByDpt(up0().dpt_cd());
		}

		/**
		 * 集計別販売計画バージョン更新カウンタチェック
		 */
		protected MCMessageList checkUpdCntrLock() {
			MCMessageList msgL = new MCMessageList();

			MST_SPLN_SUM_VERS_R lockedR = MST_SPLN_SUM_VERS_R.create();
			MST_SPLN_SUM_VERS_R t = MST_SPLN_SUM_VERS_R.create("T");
			MCQueryApiBuilder lockedR_bldr = MCQueryApiBuilder.create(t);
			lockedR_bldr.setSelect(t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBBL0110_MST_SPLN_SUM_VERS_S02", lockedR, lockedR_bldr, up0());
			msgL.addAll(checkUpdCntrNE(up0(), Chk04_HdrR.$upd_cntr, lockedR));
			return msgL;
		}
	}

	/**
	 * Chk05オペレーション.<p>
	 *
	 */
	public class Chk05 extends MSBBL_MlySPlnReg_MC_A.Chk05 {
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
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			MCList<MST_SPLN_LOCK_R> dptL = getDpt();
			if (!hasErrFlgOn(up0())) {
				// 部門DACチェック
				msgL.addAll(checkDptDAC(dptL));
				setErrFlg(msgL);
			}
			
			if (!hasErrFlgOn(up0())) {
				// 部門ロック
				lockSplnByDpts(dptL);
				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrLock());
			}
			return msgL;
		}
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		/**
		 * 部門DACチェック
		 */
		protected MCMessageList checkDptDAC(MCList<MST_SPLN_LOCK_R> dptL) {
			MCMessageList msgL = new MCMessageList();
			for (MST_SPLN_LOCK_R r : dptL) {
				msgL.addAll(checkWritableDptCdDac(r, MST_SPLN_LOCK_R.$dpt_cd));
			}
			return msgL;
		}

		/**
		 * ロック対象部門取得
		 */
		protected MCList<MST_SPLN_LOCK_R> getDpt(){
			MCList<MST_SPLN_LOCK_R> dptL = MCList.create(MST_SPLN_LOCK_R.class);
			MST_SPLN_USR_FIX_R S0T = MST_SPLN_USR_FIX_R.create("T");
			MCMainQuery q = sql("MSBBL0110_MST_SPLN_USR_FIX_S01").mainQuery()
					.selectDistinct(S0T.dpt_cd)
					.from(S0T)
					.where(S0T.usr_cd.eq(bind("usr_cd")).and(S0T.ym.eq(bind("ym"))));
			q.executeQuery(up0(), dptL);
			return dptL;
		}

		/**
		 * 入力別販売計画バージョン更新カウンタチェック
		 */
		protected MCMessageList checkUpdCntrLock() {
			MCMessageList msgL = new MCMessageList();

			MST_SPLN_USR_VERS_R lockedR = MST_SPLN_USR_VERS_R.create();
			MST_SPLN_USR_VERS_R t = MST_SPLN_USR_VERS_R.create("T");
			MCQueryApiBuilder lockedR_bldr = MCQueryApiBuilder.create(t);
			lockedR_bldr.setSelect(t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBBL0110_MST_SPLN_USR_VERS_S03", lockedR, lockedR_bldr, up0());
			msgL.addAll(checkUpdCntrNE(up0(), Chk05_HdrR.$upd_cntr, lockedR));
			return msgL;
		}
	}

	/**
	 * Chk06オペレーション.<p>
	 *
	 */
	public class Chk06 extends MSBBL_MlySPlnReg_MC_A.Chk06 {
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
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			if (!hasErrFlgOn(up0())) {
				// 部門DACチェック
				msgL.addAll(checkDptDAC());
				setErrFlg(msgL);
			}
			
			if (!hasErrFlgOn(up0())) {
				// 部門ロック
				lockDpt();
				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrLock());
			}
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		/**
		 * 部門DACチェック
		 */
		protected MCMessageList checkDptDAC() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(checkWritableDptCdDac(up0(), Chk06_HdrR.$dpt_cd));
			return msgL;
		}

		/**
		 * 部門ロック
		 */
		protected void lockDpt(){
			lockSplnByDpt(up0().dpt_cd());
		}

		/**
		 * 集計別販売計画バージョン更新カウンタチェック
		 */
		protected MCMessageList checkUpdCntrLock() {
			MCMessageList msgL = new MCMessageList();

			MST_SPLN_SUM_VERS_R lockedR = MST_SPLN_SUM_VERS_R.create();
			MST_SPLN_SUM_VERS_R t = MST_SPLN_SUM_VERS_R.create("T");
			MCQueryApiBuilder lockedR_bldr = MCQueryApiBuilder.create(t);
			lockedR_bldr.setSelect(t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBBL0110_MST_SPLN_SUM_VERS_S03", lockedR, lockedR_bldr, up0());
			msgL.addAll(checkUpdCntrNE(up0(), Chk04_HdrR.$upd_cntr, lockedR));
			return msgL;
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 */
	public class Upd01 extends MSBBL_MlySPlnReg_MC_A.Upd01 {

		/**
		 * 品目内訳リスト（数量金額計算結果）
		 */
		protected MCList<MST_SPLN_USR_ITM_R> _itmDtlL = MCList.create(MST_SPLN_USR_ITM_R.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 前処理
			editUp();
			// 更新前チェック
			callThisChk01();
			throwUpdErr();
			// 数量金額計算
			calcQtyAmt();
			throwUpdErr();
			// 入力別販売計画登録
			regUsrSpln();
			// 下り電文編集
			setDown();
		}

		/**
		 * 前処理
		 */
		protected void editUp(){
			MCList<Chk01_DtlR> up1L = MCList.create(Chk01_DtlR.class);
			MCIndexKey idxKey = up2().createIndex(Chk01_DtlR.$grp_peg_no);
			for (Chk01_DtlR up1R : up1()){
				for (Upd01_DtlR up2R : up2().subList(idxKey, up1R.grp_peg_no())){
					Chk01_DtlR addR = up1R.clone();
					addR.spln_ym(up2R.spln_ym());
					addR.spln_qty(up2R.spln_qty());
					addR.spln_amt(up2R.spln_amt());
					// 削除候補をDELETEステータスにする
					if (isNullAnd(addR.spln_qty(), addR.spln_amt())) {
						addR.setStatus(MCRow.DELETE);
					}
					up1L.add(addR);
				}
			}
			up1().setAll(up1L);
			setPegNo(up1());
		}

		/**
		 * 更新前チェック
		 */
		protected void callThisChk01() {
			MSBBL_MlySPlnReg.Chk01 ope = MSBBL_MlySPlnReg.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		/**
		 * 数量金額計算
		 */
		protected void calcQtyAmt() {
			// 数量金額計算対象の抽出
			MCList<Chk01_DtlR> tgtL = up1().subList(r->isCalcTgt(r));
			
			// 月次販売計画サービスを呼出し
			MSBBL_MlySPlnService.Calc01 calcSvc = MSBBL_MlySPlnService.crtCalc01();
			calcSvc.up0().setAll(getCalcSvcUp(tgtL));
			calcSvc.exec();

			// 数量金額計算結果格納
			MCMessageList msgL = new MCMessageList();
			MCList<Calc01_DtlR> calcDtlL = calcSvc.down0();
			MCIndexKey idxKeyDtl = calcDtlL.createIndex(Calc01_DtlR.$peg_no);
			for (Chk01_DtlR r : tgtL) {
				Calc01_DtlR calcDtlR = calcDtlL.getFirst(idxKeyDtl, r.peg_no());
				if (!isNull(calcDtlR)) {
					r.calc_spln_qty(calcDtlR.spln_qty());
					r.calc_spln_amt(calcDtlR.spln_amt());

					if (isNullOrNullVal(r.itm_cd())) {
						MCList<Calc01_ItmDtlR> subL = calcSvc.down1().subList(Calc01_DtlR.$peg_no, r.peg_no());
						if (isNull(subL)) {
							msgL.add(new MCMessage(r, null, MSBBL0273, r.dpt_cd(), r.spln_itm_cd(), toYMString(r.spln_ym()), toDispGUIIndex(r)));
						}
						else {
							MCList<MST_SPLN_USR_ITM_R> itmTmpL = MCList.create(MST_SPLN_USR_ITM_R.class);
							addAll(itmTmpL, subL, createMap_MST_SPLN_USR_ITM_R_Calc01_ItmDtlR());
							itmTmpL.setString(MST_SPLN_USR_ITM_R.$wrk_no, r.wrk_no());
							itmTmpL.setDate(MST_SPLN_USR_ITM_R.$ym, up0().ym());
							itmTmpL.setString(MST_SPLN_USR_ITM_R.$usr_cd, up0().usr_cd());
							_itmDtlL.addAll(itmTmpL);
						}
					}
				}
			}
			MCMessagePool.addAll(msgL);
		}

		/**
		 * 数量金額計算の対象か否か
		 */
		protected boolean isCalcTgt(Chk01_DtlR r) {
			return !r.isStatusDelete();
		}

		/**
		 * データ登録処理
		 */
		protected void regUsrSpln() {
			regUsrSplnVers();
			insWkSplnFmt();
			regUsrSplnFix();
			updWkSplnFmt();
			regUsrSplnDtl();
			regUsrSplnItm();
			delUsrSplnFix();
			regUsrSplnItmNew(up0());
		}

		/**
		 * 下り電文編集
		 */
		protected void setDown() {
			down0().setAll(up2());
			String[] jKeys = new String[]{Upd01_DtlR.$grp_peg_no, Upd01_DtlR.$spln_ym};
			MCJoinKey<MCList<Chk01_DtlR>> jk = down0().join(jKeys, up1(), jKeys);
			join(down0(),jk, createMap_Upd01_DtlR_Chk01_DtlR());
		}

		/**
		 * 月次販売計画サービス上り電文編集
		 */
		protected MCList<Calc01_DtlR> getCalcSvcUp(MCList<Chk01_DtlR> tgtL) {
			MCList<Calc01_DtlR> upL = MCList.create(Calc01_DtlR.class);
			addAll(upL, tgtL, createMap_Calc01_DtlR_Chk01_DtlR());
			return upL;
		}
		
		/**
		 * 入力別販売計画バージョン登録
		 */
		protected void regUsrSplnVers() {
			MST_SPLN_USR_VERS_R upR = MST_SPLN_USR_VERS_R.create();
			upR.ym(up0().ym());
			upR.usr_cd(up0().usr_cd());
			upR.edited_flg(up0().edited_flg());
			upR.intr_rmrks(up0().intr_rmrks());
			upR.sub_char1(up0().sub_char1());
			upR.sub_char2(up0().sub_char2());
			upR.sub_char3(up0().sub_char3());
			MST_SPLN_USR_VERS_R dbR = MST_SPLN_USR_VERS_R.create();
			dbSelectKey("MSBBL0110_MST_SPLN_USR_VERS_S04", dbR,
					MCQueryApiBuilder.create(MST_SPLN_USR_VERS_R.create("T")), upR);
			MCQueryApiBuilder upR_bldr = MCQueryApiBuilder.create(MST_SPLN_USR_VERS_R.create("T"));
			if (isNull(dbR.usr_cd())) {
				dbInsertEx("MSBBL0110_MST_SPLN_USR_VERS_I01", upR, upR_bldr);
			}
			else {
				dbUpdateKey("MSBBL0110_MST_SPLN_USR_VERS_U01", upR, upR_bldr);
			}
		}
		
		/**
		 * 更新削除処理用構成ワークデータを登録
		 */
		protected void insWkSplnFmt() {
			MCDate ymFr = (MCDate)up2().min(Upd01_DtlR.$spln_ym);
			MCDate ymTo = (MCDate)up2().max(Upd01_DtlR.$spln_ym);
			insMSW_SPLN_FMT(up1(), ymFr, ymTo);
		}
		
		/**
		 * 入力別販売計画確定トラン登録
		 */
		protected void regUsrSplnFix() {
			MCList<MSW_SPLN_FMT_R> regL = MCList.create(MSW_SPLN_FMT_R.class);
			regL.addBooleanColumn("upd_flg", false);
			dbSelect("MSBBL0110_MSW_SPLN_FMT_S01", regL,
					MCQueryApiBuilder.create(MSW_SPLN_FMT_R.create("T")));
			
			MCIndexKey idxRegL = regL.createIndex(
					 MSW_SPLN_FMT_R.$dpt_cd
					,MSW_SPLN_FMT_R.$cst_cd
					,MSW_SPLN_FMT_R.$wrk_no
					,MSW_SPLN_FMT_R.$spln_itm_cd
					,MSW_SPLN_FMT_R.$itm_cd
					,MSW_SPLN_FMT_R.$itm_sub1
					,MSW_SPLN_FMT_R.$itm_sub2
					,MSW_SPLN_FMT_R.$itm_sub3
					,MSW_SPLN_FMT_R.$cur_cd);
			
			MCList<MST_SPLN_USR_FIX_R> updL = MCList.create(MST_SPLN_USR_FIX_R.class);
			executeQuery(updL, MSBBL0110_MSW_SPLN_FMT_S01(), up0());
			
			for(MST_SPLN_USR_FIX_R updR : updL) {
				MSW_SPLN_FMT_R regR = regL.getFirst(idxRegL,
						 updR.dpt_cd()
						,updR.cst_cd()
						,updR.wrk_no()
						,updR.spln_itm_cd()
						,updR.itm_cd()
						,updR.itm_sub1()
						,updR.itm_sub2()
						,updR.itm_sub3()
						,updR.cur_cd());
				regR.setBooleanNE("upd_flg", true);
				updR.fix_flg(regR.fix_flg());
			}
			if (!updL.isEmpty()) {
				MST_SPLN_USR_FIX_R splnUsrFixUpdR = MST_SPLN_USR_FIX_R.create("T");
				MCQueryApiBuilder updLBldr = MCQueryApiBuilder.create(splnUsrFixUpdR);
				updLBldr.setSet(splnUsrFixUpdR.fix_flg);
				dbUpdateKey("MSBBL0110_MST_SPLN_USR_FIX_U01", updL, updLBldr);
			}
			
			MCList<MST_SPLN_USR_FIX_R> insL = MCList.create(MST_SPLN_USR_FIX_R.class);
			for (MSW_SPLN_FMT_R regR : regL.subList("upd_flg", false)) {
				MST_SPLN_USR_FIX_R insR = MST_SPLN_USR_FIX_R.create();
				insR.usr_cd(up0().usr_cd());
				insR.ym(up0().ym());
				insR.dpt_cd(regR.dpt_cd());
				insR.cst_cd(regR.cst_cd());
				insR.wrk_no(regR.wrk_no());
				insR.spln_itm_cd(regR.spln_itm_cd());
				insR.itm_cd(regR.itm_cd());
				insR.itm_sub1(regR.itm_sub1());
				insR.itm_sub2(regR.itm_sub2());
				insR.itm_sub3(regR.itm_sub3());
				insR.cur_cd(regR.cur_cd());
				insR.fix_flg(regR.fix_flg());
				insL.add(insR);
			}
			
			if (!insL.isEmpty()) {
				dbInsert("MSBBL0110_MST_SPLN_USR_FIX_I01", insL,
						MCQueryApiBuilder.create(MST_SPLN_USR_FIX_R.create("T")));
			}
		}

		/**
		 * 更新削除処理用構成ワークデータを更新
		 */
		protected void updWkSplnFmt() {
			if (!up0().isStatusCreate()) {
				// 上り電文以外の明細トランの考慮
				MCList<MST_SPLN_USR_DTL_R> regL = MCList.create(MST_SPLN_USR_DTL_R.class);
				regL.addDateColumn("st_ym");
				regL.addDateColumn("end_ym");
				executeQuery(regL, MSBBL0110_MST_SPLN_USR_DTL_S06(), up0());

				if (!regL.isEmpty()) {
					MSW_SPLN_FMT_R t1 = MSW_SPLN_FMT_R.create("T");
					execDbUpdate(
							"MSBBL0110_MSW_SPLN_FMT_U01"
							, t1
							, regL
							, t1.dpt_cd.eq(bindEx("dpt_cd"))
							.and(t1.cst_cd.eq(bindEx("cst_cd")))
							.and(t1.wrk_no.eq(bindEx("wrk_no")))
							.and(t1.spln_itm_cd.eq(bindEx("spln_itm_cd")))
							.and(t1.itm_cd.eq(bindEx("itm_cd")))
							.and(t1.itm_sub1.eq(bindEx("itm_sub1")))
							.and(t1.itm_sub2.eq(bindEx("itm_sub2")))
							.and(t1.itm_sub3.eq(bindEx("itm_sub3")))
							.and(t1.cur_cd.eq(bindEx("cur_cd")))
							, t1.st_ym
							, t1.end_ym);
				}
			}
		}
		/**
		 * 入力別販売計画明細トラン登録
		 */
		protected void regUsrSplnDtl(){
			// 入力別販売計画明細トランワーク登録
			MCList<MST_SPLN_USR_DTL_R> upDtlL = MCList.create(MST_SPLN_USR_DTL_R.class);
			addAll(upDtlL, up1(), createMap_MST_SPLN_USR_DTL_R_Chk01_DtlR());
			upDtlL.setString(MST_SPLN_USR_DTL_R.$usr_cd, up0().usr_cd());
			upDtlL.setDate(MST_SPLN_USR_DTL_R.$ym, up0().ym());
			MCQueryApiBuilder upDtlL_bldr = MCQueryApiBuilder.create(MST_SPLN_USR_DTL_R.create("T"));
			dbWkDelete("MSBBL0110_MSW_SPLN_USR_DTL_D02", upDtlL_bldr.getBaseDbc());
			dbWkInsert("MSBBL0110_MSW_SPLN_USR_DTL_I02", upDtlL, upDtlL_bldr.getBaseDbc());

			// 登録・更新対象のＤＢデータを検索
			MCList<MST_SPLN_USR_DTL_R> dbDtlL = MCList.create(MST_SPLN_USR_DTL_R.class);
			executeQuery(dbDtlL, MSBBL0110_MSW_SPLN_USR_DTL_KEY_S01());

			// 入力別販売計画明細トランを登録
			MCList<MST_SPLN_USR_DTL_R> insDtlL = MCList.create(MST_SPLN_USR_DTL_R.class);
			MCList<MST_SPLN_USR_DTL_R> updDtlL = MCList.create(MST_SPLN_USR_DTL_R.class);
			MCList<MST_SPLN_USR_DTL_R> delDtlL = MCList.create(MST_SPLN_USR_DTL_R.class);
			String[] dtlKeys = new String[] {
					MST_SPLN_USR_DTL_R.$dpt_cd,
					MST_SPLN_USR_DTL_R.$cst_cd,
					MST_SPLN_USR_DTL_R.$wrk_no,
					MST_SPLN_USR_DTL_R.$spln_itm_cd,
					MST_SPLN_USR_DTL_R.$itm_cd,
					MST_SPLN_USR_DTL_R.$itm_sub1,
					MST_SPLN_USR_DTL_R.$itm_sub2,
					MST_SPLN_USR_DTL_R.$itm_sub3,
					MST_SPLN_USR_DTL_R.$cur_cd,
					MST_SPLN_USR_DTL_R.$spln_ym};
			MCIndexKey dtlIdxKey = dbDtlL.createIndex(dtlKeys);
			for (MST_SPLN_USR_DTL_R upDtlR : upDtlL) {
				if (isNull(upDtlR.spln_ym())) {
					continue;
				}
				MST_SPLN_USR_DTL_R dbR = dbDtlL.getFirst(dtlIdxKey, getVals(dtlKeys, upDtlR));
				if (upDtlR.isStatusDelete()) {
					delDtlL.add(upDtlR);
				}
				else {
					if (dbR != null) {
						updDtlL.add(upDtlR);
					}
					else {
						insDtlL.add(upDtlR);
					}
				}
			}
			if(!isNull(delDtlL)) {
				dbDeleteKey("MSBBL0110_MST_SPLN_USR_DTL_D01", delDtlL,
						MCQueryApiBuilder.create(MST_SPLN_USR_DTL_R.create("T")));
			}
			if(!isNull(updDtlL)) {
				dbUpdateKey("MSBBL0110_MST_SPLN_USR_DTL_U01", updDtlL,
						MCQueryApiBuilder.create(MST_SPLN_USR_DTL_R.create("T")));
			}
			if(!isNull(insDtlL)) {
				dbInsertEx("MSBBL0110_MST_SPLN_USR_DTL_I01", insDtlL,
						MCQueryApiBuilder.create(MST_SPLN_USR_DTL_R.create("T")));
			}
		}

		/**
		 * 入力別明細内訳データ登録（洗い替え）
		 */
		protected void regUsrSplnItm(){
			executeUpdate(MSBBL0110_MST_SPLN_USR_ITM_D02());
			if (!isNull(_itmDtlL)) {
				dbInsertEx("MSBBL0110_MST_SPLN_USR_ITM_I01", _itmDtlL,
						MCQueryApiBuilder.create(MST_SPLN_USR_ITM_R.create("T")));
			}
		}
		/**
		 * 入力別販売計画確定トラン削除
		 */
		protected void delUsrSplnFix(){
			executeUpdate(MSBBL0110_MST_SPLM_USR_FIX_D01(), up0());
		}

		protected Map_Calc01_DtlR_Chk01_DtlR<Calc01_DtlR,Chk01_DtlR> createMap_Calc01_DtlR_Chk01_DtlR() {
			return new Map_Calc01_DtlR_Chk01_DtlR<Calc01_DtlR, Chk01_DtlR>();
		}
		public class Map_Calc01_DtlR_Chk01_DtlR<D extends Calc01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Calc01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(Calc01_DtlR.$spln_itm_cd, Chk01_DtlR.$spln_itm_cd);
				addColumnPathMap(Calc01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(Calc01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(Calc01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(Calc01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(Calc01_DtlR.$cst_cd, Chk01_DtlR.$cst_cd);
				addColumnPathMap(Calc01_DtlR.$dpt_cd, Chk01_DtlR.$dpt_cd);
				addColumnPathMap(Calc01_DtlR.$spln_ym, Chk01_DtlR.$spln_ym);
				addColumnPathMap(Calc01_DtlR.$cur_cd, Chk01_DtlR.$cur_cd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				if (MAC_SPLN_SET_TYP.isQTY(src.spln_set_typ())) {
					dest.spln_qty(src.spln_qty());
				}
				else {
					dest.spln_amt(src.spln_amt());
				}
			}
		}

		protected Map_MST_SPLN_USR_DTL_R_Chk01_DtlR<MST_SPLN_USR_DTL_R,Chk01_DtlR> createMap_MST_SPLN_USR_DTL_R_Chk01_DtlR() {
			return new Map_MST_SPLN_USR_DTL_R_Chk01_DtlR<MST_SPLN_USR_DTL_R, Chk01_DtlR>();
		}
		public class Map_MST_SPLN_USR_DTL_R_Chk01_DtlR<D extends MST_SPLN_USR_DTL_R, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SPLN_USR_DTL_R.$dpt_cd, Chk01_DtlR.$dpt_cd);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$cst_cd, Chk01_DtlR.$cst_cd);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$wrk_no, Chk01_DtlR.$wrk_no);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$spln_itm_cd, Chk01_DtlR.$spln_itm_cd);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$cur_cd, Chk01_DtlR.$cur_cd);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$spln_ym, Chk01_DtlR.$spln_ym);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$spln_qty, Chk01_DtlR.$calc_spln_qty);
				addColumnPathMap(MST_SPLN_USR_DTL_R.$spln_amt, Chk01_DtlR.$calc_spln_amt);
			}
		}

		protected Map_MST_SPLN_USR_ITM_R_Calc01_ItmDtlR<MST_SPLN_USR_ITM_R,Calc01_ItmDtlR> createMap_MST_SPLN_USR_ITM_R_Calc01_ItmDtlR() {
			return new Map_MST_SPLN_USR_ITM_R_Calc01_ItmDtlR<MST_SPLN_USR_ITM_R, Calc01_ItmDtlR>();
		}
		public class Map_MST_SPLN_USR_ITM_R_Calc01_ItmDtlR<D extends MST_SPLN_USR_ITM_R, S extends Calc01_ItmDtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SPLN_USR_ITM_R.$dpt_cd, Calc01_ItmDtlR.$dpt_cd);
				addColumnPathMap(MST_SPLN_USR_ITM_R.$cst_cd, Calc01_ItmDtlR.$cst_cd);
				addColumnPathMap(MST_SPLN_USR_ITM_R.$spln_itm_cd, Calc01_ItmDtlR.$spln_itm_cd);
				addColumnPathMap(MST_SPLN_USR_ITM_R.$itm_cd, Calc01_ItmDtlR.$itm_cd);
				addColumnPathMap(MST_SPLN_USR_ITM_R.$itm_sub1, Calc01_ItmDtlR.$itm_sub1);
				addColumnPathMap(MST_SPLN_USR_ITM_R.$itm_sub2, Calc01_ItmDtlR.$itm_sub2);
				addColumnPathMap(MST_SPLN_USR_ITM_R.$itm_sub3, Calc01_ItmDtlR.$itm_sub3);
				addColumnPathMap(MST_SPLN_USR_ITM_R.$cur_cd, Calc01_ItmDtlR.$cur_cd);
				addColumnPathMap(MST_SPLN_USR_ITM_R.$spln_ym, Calc01_ItmDtlR.$spln_ym);
				addColumnPathMap(MST_SPLN_USR_ITM_R.$spln_qty, Calc01_ItmDtlR.$spln_qty);
				addColumnPathMap(MST_SPLN_USR_ITM_R.$spln_amt, Calc01_ItmDtlR.$spln_amt);
			}
		}

		protected Map_Upd01_DtlR_Chk01_DtlR<Upd01_DtlR,Chk01_DtlR> createMap_Upd01_DtlR_Chk01_DtlR() {
			return new Map_Upd01_DtlR_Chk01_DtlR<Upd01_DtlR, Chk01_DtlR>();
		}
		public class Map_Upd01_DtlR_Chk01_DtlR<D extends Upd01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Upd01_DtlR.$spln_qty, Chk01_DtlR.$calc_spln_qty);
				addColumnPathMap(Upd01_DtlR.$spln_amt, Chk01_DtlR.$calc_spln_amt);
			}
		}
	}

	/**
	 * Upd02オペレーション.<p>
	 *
	 */
	public class Upd02 extends MSBBL_MlySPlnReg_MC_A.Upd02 {
		
		/**
		 * 品目内訳
		 */
		protected MCList<MST_SPLN_SUM_ITM_R> _itmDtlL = MCList.create(MST_SPLN_SUM_ITM_R.class);

		/**
		 * 最新品目別集計判断ＦＬＧ
		 */
		protected boolean _newItmSumFlg = false;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 前処理
			editUp();
			// 更新前チェック
			callThisChk02();
			throwUpdErr();
			// 更新前数量金額補完
			cmplSumSplnDtl();
			// 数量金額計算
			calcQtyAmt();
			throwUpdErr();
			// 集計別販売計画登録
			regSumSpln();
			// 下り電文編集
			setDown();
		}

		/**
		 * 前処理
		 */
		protected void editUp(){
			MCList<Chk02_DtlR> up1L = MCList.create(Chk02_DtlR.class);
			MCIndexKey idxKey = up2().createIndex(Chk02_DtlR.$grp_peg_no);
			for (Chk02_DtlR up1R : up1()){
				for (Upd01_DtlR up2R : up2().subList(idxKey, up1R.grp_peg_no())){
					Chk02_DtlR addR = up1R.clone();
					addR.dpt_cd(up0().dpt_cd());
					addR.cst_cd(up0().cst_cd());
					addR.wrk_no(up0().wrk_no());
					addR.spln_ym(up2R.spln_ym());
					addR.spln_qty(up2R.spln_qty());
					addR.spln_amt(up2R.spln_amt());
					if (isNullOr(addR.spln_qty(), addR.spln_amt())) {
						addR.sum_flg(false);
					}
					else {
						addR.sum_flg(up2R.sum_flg());
					}
					// 削除候補をDELETEステータスにする
					if (isNullAnd(addR.spln_qty(), addR.spln_amt())) {
						addR.setStatus(MCRow.DELETE);
					}
					up1L.add(addR);
				}
			}
			up1().setAll(up1L);
			setPegNo(up1());
		}

		/**
		 * 更新前チェック
		 */
		protected void callThisChk02() {
			MSBBL_MlySPlnReg.Chk02 ope = MSBBL_MlySPlnReg.crtChk02();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		/**
		 * 更新前数量金額補完 <br>
		 * 内訳洗い替え判断、明細更新判断、などのための前処理
		 */
		protected void cmplSumSplnDtl() {
			insDtlWk(up1());
			MCList<MST_SPLN_SUM_DTL_R> dbDtlL = MCList.create(MST_SPLN_SUM_DTL_R.class);
			executeQuery(dbDtlL, MSBBL0110_MSW_SPLN_SUM_DTL_KEY_S01());
			dbWkDelete("MSBBL0110_MSW_SPLN_SUM_DTL_D03",
					MCQueryApiBuilder.create(MST_SPLN_SUM_DTL_R.create("T")).getBaseDbc());
			
			String[] itmKeys = new String[]{
					MST_SPLN_SUM_DTL_R.$spln_itm_cd,
					MST_SPLN_SUM_DTL_R.$itm_cd,
					MST_SPLN_SUM_DTL_R.$itm_sub1,
					MST_SPLN_SUM_DTL_R.$itm_sub2,
					MST_SPLN_SUM_DTL_R.$itm_sub2,
					MST_SPLN_SUM_DTL_R.$cur_cd,
					MST_SPLN_SUM_DTL_R.$spln_ym};
			MCIndexKey idxKey = dbDtlL.createIndex(itmKeys);
			for (Chk02_DtlR r : up1()) {
				MST_SPLN_SUM_DTL_R dbR = dbDtlL.getFirst(idxKey, getVals(itmKeys, r));
				if (dbR != null) {
					r.old_spln_amt(dbR.spln_amt());
					r.old_spln_qty(dbR.spln_qty());
				}
			}
		}
		
		/**
		 * 集計別販売計画品目明細の存在チェック
		 */
		protected boolean existsDtl(Chk02_DtlR r) {
			return !isNull(r.old_spln_qty());
		}

		/**
		 * 数量金額計算
		 */
		protected void calcQtyAmt() {
			// 数量金額計算対象の抽出
			MCList<Chk02_DtlR> tgtL = up1().subList(r->isCalcTgt(r));

			// 月次販売計画サービスを呼出し
			MSBBL_MlySPlnService.Calc01 calcSvc = MSBBL_MlySPlnService.crtCalc01();
			calcSvc.up0().setAll(getCalcSvcUp(tgtL));
			calcSvc.exec();

			// 数量金額計算結果格納
			MCMessageList msgL = new MCMessageList();
			MCList<Calc01_DtlR> calcDtlL = calcSvc.down0();
			MCIndexKey idxKeyDtl = calcDtlL.createIndex(Calc01_DtlR.$peg_no);
			for (Chk02_DtlR r : tgtL) {
				Calc01_DtlR calcDtlR = calcDtlL.getFirst(idxKeyDtl, r.peg_no());
				if (!isNull(calcDtlR)) {
					r.calc_spln_qty(calcDtlR.spln_qty());
					r.calc_spln_amt(calcDtlR.spln_amt());

					if (isNullOrNullVal(r.itm_cd())) {
						MCList<Calc01_ItmDtlR> subL = calcSvc.down1().subList(Calc01_DtlR.$peg_no, r.peg_no());
						if (isNull(subL)) {
							msgL.add(new MCMessage(r, null, MSBBL0273, r.dpt_cd(), r.spln_itm_cd(), toYMString(r.spln_ym()), toDispGUIIndex(r)));
						}
						else {
							MCList<MST_SPLN_SUM_ITM_R> itmTmpL = MCList.create(MST_SPLN_SUM_ITM_R.class);
							addAll(itmTmpL, subL, createMap_MST_SPLN_SUM_ITM_R_Calc01_ItmDtlR());
							itmTmpL.setString(MST_SPLN_SUM_ITM_R.$wrk_no, r.wrk_no());
							itmTmpL.setDate(MST_SPLN_SUM_ITM_R.$ym, up0().ym());
							itmTmpL.setString(MST_SPLN_SUM_ITM_R.$spln_vers, up0().spln_vers());
							_itmDtlL.addAll(itmTmpL);
						}
					}
				}
			}
			MCMessagePool.addAll(msgL);
		}

		/**
		 * 数量金額計算の対象か否か
		 */
		protected boolean isCalcTgt(Chk02_DtlR r) {
			if (r.isStatusDelete()) {
				return false;
			}
			if (r.sum_flg()) {
				return false;
			}
			if (isSame(r.spln_qty(), r.old_spln_qty()) && isSame(r.spln_amt(), r.old_spln_amt())) {
				return false;
			}
			return true;
		}


		/**
		 * データ登録処理
		 */
		protected void regSumSpln() {
			regSumSplnVers();
			insWkSplnFmt();
			regSumSplnFix();
			updWkSplnFmt();
			regSumSplnDtl();
			regSumSplnItm();
			delSumSplnFix();
			if (_newItmSumFlg) {
				regSumSplnItmNew();
			}
		}

		/**
		 * 下り電文編集
		 */
		protected void setDown() {
			down0().setAll(up2());
			String[] jKeys = new String[]{Upd01_DtlR.$grp_peg_no, Upd01_DtlR.$spln_ym};
			MCJoinKey<MCList<Chk02_DtlR>> jk = down0().join(jKeys, up1(), jKeys);
			join(down0(),jk, createMap_Upd01_DtlR_Chk02_DtlR());
		}

		/**
		 * 月次販売計画サービス上り電文編集
		 */
		protected MCList<Calc01_DtlR> getCalcSvcUp(MCList<Chk02_DtlR> tgtL) {
			MCList<Calc01_DtlR> upL = MCList.create(Calc01_DtlR.class);
			addAll(upL, tgtL, createMap_Calc01_DtlR_Chk02_DtlR());
			return upL;
		}

		/**
		 * 集計別販売計画バージョン登録
		 */
		protected void regSumSplnVers(){
			// 更新前の集計別販売計画バージョンを取得
			MST_SPLN_SUM_VERS_R dbR = MST_SPLN_SUM_VERS_R.create();
			MST_SPLN_SUM_VERS_R t = MST_SPLN_SUM_VERS_R.create("T");
			dbSelectKey("MSBBL0110_MST_SPLN_SUM_VERS_S04",
					dbR, MCQueryApiBuilder.create(t), up0());
			
			// 訂正不可に変更した場合、新規登録時も含む
			if (!dbR.locked_flg() && up0().locked_flg()) {
				MST_SPLN_SUM_VERS_R dbc = MST_SPLN_SUM_VERS_R.create();
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setWhere(t.ym.lt(bind("1")), up0().ym());
				dbc_bldr.addWhereWithAnd(t.dpt_cd.eq(bind("1")), up0().dpt_cd());
				dbc_bldr.addWhereWithAnd(t.cst_cd.eq(bind("1")), up0().cst_cd());
				dbc_bldr.addWhereWithAnd(t.wrk_no.eq(bind("1")), up0().wrk_no());
				dbc_bldr.addWhereWithAnd(t.adopted_flg.eq(bind("1")), toTrueStr(true));
				dbc_bldr.addWhereWithAnd(t.locked_flg.eq(bind("1")), toFalseStr(false));
				dbc_bldr.setSetVL(t.locked_flg, value(true));
				dbUpdate("MSBBL0110_MST_SPLN_SUM_VERS_U01", dbc, dbc_bldr);
			}
			// 訂正可能に変更した場合、かつ、変更前が採用済である場合
			else if (dbR.locked_flg() && !up0().locked_flg() && dbR.adopted_flg()) {
				MST_SPLN_SUM_VERS_R dbc = MST_SPLN_SUM_VERS_R.create();
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setWhere(t.ym.gt(bind("1")), up0().ym());
				dbc_bldr.addWhereWithAnd(t.dpt_cd.eq(bind("1")), up0().dpt_cd());
				dbc_bldr.addWhereWithAnd(t.cst_cd.eq(bind("1")), up0().cst_cd());
				dbc_bldr.addWhereWithAnd(t.wrk_no.eq(bind("1")), up0().wrk_no());
				dbc_bldr.addWhereWithAnd(t.locked_flg.eq(bind("1")), toTrueStr(true));
				dbc_bldr.setSetVL(t.locked_flg, value(false));
				dbUpdate("MSBBL0110_MST_SPLN_SUM_VERS_U02", dbc, dbc_bldr);
			}
			
			// 集計別販売計画バージョン登録
			MST_SPLN_SUM_VERS_R upR = MST_SPLN_SUM_VERS_R.create();
			upR.ym(up0().ym());
			upR.dpt_cd(up0().dpt_cd());
			upR.cst_cd(up0().cst_cd());
			upR.wrk_no(up0().wrk_no());
			upR.spln_vers(up0().spln_vers());
			upR.edited_flg(up0().edited_flg());
			upR.adopted_flg(up0().adopted_flg());
			upR.locked_flg(up0().locked_flg());
			upR.usr_cd(up0().usr_cd());
			upR.ref_vers(up0().ref_vers());
			upR.intr_rmrks(up0().intr_rmrks());
			upR.sub_char1(up0().sub_char1());
			upR.sub_char2(up0().sub_char2());
			upR.sub_char3(up0().sub_char3());
			MCQueryApiBuilder upR_bldr = MCQueryApiBuilder.create(t);
			if (isNull(dbR.dpt_cd())) {
				dbInsertEx("MSBBL0110_MST_SPLN_SUM_VERS_I01", upR, upR_bldr);
			}
			else {
				dbUpdateKey("MSBBL0110_MST_SPLN_SUM_VERS_U03", upR, upR_bldr);
			}
			
			// 最新品目別集計判断
			_newItmSumFlg = dbR.adopted_flg() || up0().adopted_flg();
		}

		/**
		 * 更新削除処理用構成ワークデータを登録
		 */
		protected void insWkSplnFmt() {
			MCDate ymFr = (MCDate)up2().min(Upd01_DtlR.$spln_ym);
			MCDate ymTo = (MCDate)up2().max(Upd01_DtlR.$spln_ym);
			insMSW_SPLN_FMT(up1(), ymFr, ymTo);
		}

		/**
		 * 集計別販売計画確定登録
		 */
		protected void regSumSplnFix(){
			MCList<MSW_SPLN_FMT_R> regL = MCList.create(MSW_SPLN_FMT_R.class);
			regL.addBooleanColumn("upd_flg", false);
			dbSelect("MSBBL0110_MSW_SPLN_FMT_S02", regL,
					MCQueryApiBuilder.create(MSW_SPLN_FMT_R.create("T")));
			MCIndexKey idxRegL = regL.createIndex(
					 MSW_SPLN_FMT_R.$dpt_cd
					,MSW_SPLN_FMT_R.$cst_cd
					,MSW_SPLN_FMT_R.$wrk_no
					,MSW_SPLN_FMT_R.$spln_itm_cd
					,MSW_SPLN_FMT_R.$itm_cd
					,MSW_SPLN_FMT_R.$itm_sub1
					,MSW_SPLN_FMT_R.$itm_sub2
					,MSW_SPLN_FMT_R.$itm_sub3
					,MSW_SPLN_FMT_R.$cur_cd);
			
			MCList<MST_SPLN_SUM_FIX_R> updL = MCList.create(MST_SPLN_SUM_FIX_R.class);
			executeQuery(updL, MSBBL0110_MSW_SPLN_FMT_S02(), up0());
			
			for(MST_SPLN_SUM_FIX_R updR : updL) {
				MSW_SPLN_FMT_R regR = regL.getFirst(idxRegL,
						 updR.dpt_cd()
						,updR.cst_cd()
						,updR.wrk_no()
						,updR.spln_itm_cd()
						,updR.itm_cd()
						,updR.itm_sub1()
						,updR.itm_sub2()
						,updR.itm_sub3()
						,updR.cur_cd());
				regR.setBooleanNE("upd_flg", true);
				updR.fix_flg(regR.fix_flg());
			}
			if (!updL.isEmpty()) {
				MST_SPLN_SUM_FIX_R splnSumFixR = MST_SPLN_SUM_FIX_R.create("T");
				MCQueryApiBuilder updLBldr = MCQueryApiBuilder.create(splnSumFixR);
				updLBldr.setSet(splnSumFixR.fix_flg);
				dbUpdateKey("MSBBL0110_MST_SPLN_SUM_FIX_U01", updL, updLBldr);
			}
			
			MCList<MST_SPLN_SUM_FIX_R> insL = MCList.create(MST_SPLN_SUM_FIX_R.class);
			for (MSW_SPLN_FMT_R regR : regL.subList("upd_flg", false)) {
				MST_SPLN_SUM_FIX_R insR = MST_SPLN_SUM_FIX_R.create();
				insR.spln_vers(up0().spln_vers());
				insR.ym(up0().ym());
				insR.dpt_cd(regR.dpt_cd());
				insR.cst_cd(regR.cst_cd());
				insR.wrk_no(regR.wrk_no());
				insR.spln_itm_cd(regR.spln_itm_cd());
				insR.itm_cd(regR.itm_cd());
				insR.itm_sub1(regR.itm_sub1());
				insR.itm_sub2(regR.itm_sub2());
				insR.itm_sub3(regR.itm_sub3());
				insR.cur_cd(regR.cur_cd());
				insR.fix_flg(regR.fix_flg());
				insL.add(insR);
			}
			
			if (!insL.isEmpty()) {
				dbInsert("MSBBL0110_MST_SPLN_SUM_FIX_I01", insL,
						MCQueryApiBuilder.create(MST_SPLN_SUM_FIX_R.create("T")));
			}
		}

		/**
		 * 更新削除処理用構成ワークデータを更新
		 */
		protected void updWkSplnFmt() {
			if (!up0().isStatusCreate() && _newItmSumFlg) {
				// 上り電文以外の明細トランの考慮
				MCList<MST_SPLN_SUM_DTL_R> regL = MCList.create(MST_SPLN_SUM_DTL_R.class);
				regL.addDateColumn("st_ym");
				regL.addDateColumn("end_ym");
				regL.addBooleanColumn("upd_flg");
				executeQuery(regL, MSBBL0110_MST_SPLN_SUM_DTL_S05(), up0());
				
				MCList<MST_SPLN_SUM_DTL_R> updL = regL.subList("upd_flg", true);
				if (!updL.isEmpty()) {
					MSW_SPLN_FMT_R splnFmtUpdR = MSW_SPLN_FMT_R.create("T");
					execDbUpdate(
							"MSBBL0110_MSW_SPLN_FMT_U02"
							, splnFmtUpdR
							, updL
							, splnFmtUpdR.dpt_cd.eq(bindEx("dpt_cd"))
							.and(splnFmtUpdR.cst_cd.eq(bindEx("cst_cd")))
							.and(splnFmtUpdR.wrk_no.eq(bindEx("wrk_no")))
							.and(splnFmtUpdR.spln_itm_cd.eq(bindEx("spln_itm_cd")))
							.and(splnFmtUpdR.itm_cd.eq(bindEx("itm_cd")))
							.and(splnFmtUpdR.itm_sub1.eq(bindEx("itm_sub1")))
							.and(splnFmtUpdR.itm_sub2.eq(bindEx("itm_sub2")))
							.and(splnFmtUpdR.itm_sub3.eq(bindEx("itm_sub3")))
							.and(splnFmtUpdR.cur_cd.eq(bindEx("cur_cd")))
							, splnFmtUpdR.st_ym
							, splnFmtUpdR.end_ym);
				}
				
				MCList<MSW_SPLN_FMT_R> insL = MCList.create(MSW_SPLN_FMT_R.class);
				for (MST_SPLN_SUM_DTL_R r : regL.subList("upd_flg", false)) {
					MSW_SPLN_FMT_R insR = MSW_SPLN_FMT_R.create();
					insR.dpt_cd(r.dpt_cd());
					insR.cst_cd(r.cst_cd());
					insR.wrk_no(r.wrk_no());
					insR.spln_itm_cd(r.spln_itm_cd());
					insR.itm_cd(r.itm_cd());
					insR.itm_sub1(r.itm_sub1());
					insR.itm_sub2(r.itm_sub2());
					insR.itm_sub3(r.itm_sub3());
					insR.cur_cd(r.cur_cd());
					insR.st_ym(r.getDateNE("st_ym"));
					insR.end_ym(r.getDateNE("end_ym"));
					insR.fix_flg(false);
					insL.add(insR);
				}
				
				if (!insL.isEmpty()) {
					dbInsert("MSBBL0110_MSW_SPLN_FMT_I01", insL,
							MCQueryApiBuilder.create(MSW_SPLN_FMT_R.create("T")));
				}
			}
		}

		/**
		 * 集計別販売計画明細登録
		 */
		protected void regSumSplnDtl(){
			MCList<MST_SPLN_SUM_DTL_R> insDtlL = MCList.create(MST_SPLN_SUM_DTL_R.class);
			MCList<MST_SPLN_SUM_DTL_R> updDtlL = MCList.create(MST_SPLN_SUM_DTL_R.class);
			MCList<MST_SPLN_SUM_DTL_R> delDtlL = MCList.create(MST_SPLN_SUM_DTL_R.class);
			MCList<MST_SPLN_SUM_DTL_R> itmDtlWkL = MCList.create(MST_SPLN_SUM_DTL_R.class);
			for (Chk02_DtlR r : up1()) {
				if (r.isStatusDelete()) {
					// 削除
					if (existsDtl(r)) {
						MST_SPLN_SUM_DTL_R tmpR = MST_SPLN_SUM_DTL_R.create();
						copy(tmpR, r, createMap_MST_SPLN_SUM_DTL_R_Chk02_DtlR());
						tmpR.ym(up0().ym());
						tmpR.spln_vers(up0().spln_vers());
						delDtlL.add(tmpR);
						itmDtlWkL.add(tmpR);
					}
				}
				else {
					MST_SPLN_SUM_DTL_R tmpR = MST_SPLN_SUM_DTL_R.create();
					copy(tmpR, r, createMap_MST_SPLN_SUM_DTL_R_Chk02_DtlR());
					tmpR.ym(up0().ym());
					tmpR.spln_vers(up0().spln_vers());
					// 更新
					if (existsDtl(r)) {
						if (isSame(r.spln_qty(), r.old_spln_qty()) && isSame(r.spln_amt(), r.old_spln_amt())) {
							if (r.sum_flg()) {
								itmDtlWkL.add(tmpR);
							}
						}
						else {
							updDtlL.add(tmpR);
							itmDtlWkL.add(tmpR);
						}
					}
					// 追加
					else {
						insDtlL.add(tmpR);
					}
				}
			}
			if(!isNull(delDtlL)) {
				dbDeleteKey("MSBBL0110_MST_SPLN_SUM_DTL_D01", delDtlL,
						MCQueryApiBuilder.create(MST_SPLN_SUM_DTL_R.create("T")));
			}
			if(!isNull(updDtlL)) {
				dbUpdateKey("MSBBL0110_MST_SPLN_SUM_DTL_U01", updDtlL,
						MCQueryApiBuilder.create(MST_SPLN_SUM_DTL_R.create("T")));
			}
			if (!isNull(insDtlL)) {
				dbInsertEx("MSBBL0110_MST_SPLN_SUM_DTL_I01", insDtlL,
						MCQueryApiBuilder.create(MST_SPLN_SUM_DTL_R.create("T")));
			}
			
			// 内訳洗い替え削除対象の登録
			MCQueryApiBuilder itmDtlWkL_bldr = MCQueryApiBuilder.create(MST_SPLN_SUM_DTL_R.create("T"));
			dbWkDelete("MSBBL0110_MSW_SPLN_SUM_DTL_D04", itmDtlWkL_bldr.getBaseDbc());
			itmDtlWkL.setAll(itmDtlWkL.subList(r->!isNullOrNullVal(r.spln_itm_cd())));
			if(!isNull(itmDtlWkL)) {
				dbWkInsert("MSBBL0110_MSW_SPLN_SUM_DTL_I03", itmDtlWkL, itmDtlWkL_bldr.getBaseDbc());
			}
		}

		/**
		 * 集計別販売計画品目内訳登録（洗い替え）
		 */
		protected void regSumSplnItm(){
			executeUpdate(MSBBL0110_MST_SPLN_SUM_ITM_D02());
			insSumItmUsingUsrItm();
			if (!isNull(_itmDtlL)) {
				dbInsertEx("MSBBL0110_MST_SPLN_SUM_ITM_I01", _itmDtlL,
						MCQueryApiBuilder.create(MST_SPLN_SUM_ITM_R.create("T")));
			}
		}

		/**
		 * 集計別販売計画確定削除
		 */
		protected void delSumSplnFix(){
			executeUpdate(MSBBL0110_MST_SPLM_SUM_FIX_D01(), up0());
		}

		/**
		 * 入力別販売計画品目内訳を集計し、集計販売計画品目内訳を登録
		 */
		protected void insSumItmUsingUsrItm() {
			MCList<Chk02_DtlR> tgtL = up1().subList(r->r.sum_flg() && !isNullOrNullVal(r.spln_itm_cd()));
			if (isNull(tgtL)) {
				return ;
			}
			insUsrDtlWk(tgtL);
			executeUpdate(MSBBL0110_MST_SPLN_USR_ITM_I01(), up0());
		}

		/**
		 * 入力別販売計画明細検索＆集計
		 */
		protected void insUsrDtlWk(MCList<Chk02_DtlR> tgtL) {
			insDtlWk(tgtL);
			MCList<MST_SPLN_USR_DTL_R> tmpL = MCList.create(MST_SPLN_USR_DTL_R.class);
			executeQuery(tmpL, MSBBL0110_MST_SPLN_USR_DTL_S05(), up0());
			String[] keys = {
					MST_SPLN_USR_DTL_R.$usr_cd,
					MST_SPLN_USR_DTL_R.$dpt_cd,
					MST_SPLN_USR_DTL_R.$spln_itm_cd,
					MST_SPLN_USR_DTL_R.$itm_cd,
					MST_SPLN_USR_DTL_R.$itm_sub1,
					MST_SPLN_USR_DTL_R.$itm_sub2,
					MST_SPLN_USR_DTL_R.$itm_sub3,
					MST_SPLN_USR_DTL_R.$cur_cd,
					MST_SPLN_USR_DTL_R.$spln_ym};
			String[] subKeys = {
				MST_SPLN_USR_DTL_R.$cst_cd,
				MST_SPLN_USR_DTL_R.$wrk_no
			};
			MCList<MST_SPLN_USR_DTL_R> usrDtlL = MCList.create(MST_SPLN_USR_DTL_R.class);
			for (MCList<MST_SPLN_USR_DTL_R> grpL : tmpL.groupList(keys)) {
				for (MCList<MST_SPLN_USR_DTL_R> subL : grpL.groupList(subKeys)) {
					subL.sort(SortType.DESC, MST_SPLN_USR_DTL_R.$ym);
					usrDtlL.add(subL.get(0));
				}
			}
			// 品目内訳検索用ワーク
			MCQueryApiBuilder usrDtlL_bldr = MCQueryApiBuilder.create(MST_SPLN_USR_DTL_R.create("T"));
			dbWkDelete("MSBBL0110_MSW_SPLN_USR_DTL_D03", usrDtlL_bldr.getBaseDbc());
			dbWkInsert("MSBBL0110_MSW_SPLN_USR_DTL_I03", usrDtlL, usrDtlL_bldr.getBaseDbc());
		}

		protected MCList<MST_SPLN_SUM_DTL_R> insDtlWk(MCList<Chk02_DtlR> tgtL) {
			MCList<MST_SPLN_SUM_DTL_R> upDtlL = MCList.create(MST_SPLN_SUM_DTL_R.class);
			addAll(upDtlL, tgtL, createMap_MST_SPLN_SUM_DTL_R_Chk02_DtlR());
			upDtlL.setDate(MST_SPLN_SUM_DTL_R.$ym, up0().ym());
			upDtlL.setString(MST_SPLN_SUM_DTL_R.$spln_vers, up0().spln_vers());
			MCQueryApiBuilder upDtlL_bldr = MCQueryApiBuilder.create(MST_SPLN_SUM_DTL_R.create("T"));
			dbWkDelete("MSBBL0110_MSW_SPLN_SUM_DTL_D05", upDtlL_bldr.getBaseDbc());
			dbWkInsert("MSBBL0110_MSW_SPLN_SUM_DTL_I04", upDtlL, upDtlL_bldr.getBaseDbc());
			return upDtlL;
		}

		protected Map_Calc01_DtlR_Chk02_DtlR<Calc01_DtlR,Chk02_DtlR> createMap_Calc01_DtlR_Chk02_DtlR() {
			return new Map_Calc01_DtlR_Chk02_DtlR<Calc01_DtlR, Chk02_DtlR>();
		}
		public class Map_Calc01_DtlR_Chk02_DtlR<D extends Calc01_DtlR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Calc01_DtlR.$peg_no, Chk02_DtlR.$peg_no);
				addColumnPathMap(Calc01_DtlR.$dpt_cd, Chk02_DtlR.$dpt_cd);
				addColumnPathMap(Calc01_DtlR.$cst_cd, Chk02_DtlR.$cst_cd);
				addColumnPathMap(Calc01_DtlR.$spln_itm_cd, Chk02_DtlR.$spln_itm_cd);
				addColumnPathMap(Calc01_DtlR.$itm_cd, Chk02_DtlR.$itm_cd);
				addColumnPathMap(Calc01_DtlR.$itm_sub1, Chk02_DtlR.$itm_sub1);
				addColumnPathMap(Calc01_DtlR.$itm_sub2, Chk02_DtlR.$itm_sub2);
				addColumnPathMap(Calc01_DtlR.$itm_sub3, Chk02_DtlR.$itm_sub3);
				addColumnPathMap(Calc01_DtlR.$spln_ym, Chk02_DtlR.$spln_ym);
				addColumnPathMap(Calc01_DtlR.$cur_cd, Chk02_DtlR.$cur_cd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				if (MAC_SPLN_SET_TYP.isQTY(src.spln_set_typ())) {
					dest.spln_qty(src.spln_qty());
				}
				else {
					dest.spln_amt(src.spln_amt());
				}
			}
		}

		protected Map_MST_SPLN_SUM_ITM_R_Calc01_ItmDtlR<MST_SPLN_SUM_ITM_R,Calc01_ItmDtlR> createMap_MST_SPLN_SUM_ITM_R_Calc01_ItmDtlR() {
			return new Map_MST_SPLN_SUM_ITM_R_Calc01_ItmDtlR<MST_SPLN_SUM_ITM_R, Calc01_ItmDtlR>();
		}
		public class Map_MST_SPLN_SUM_ITM_R_Calc01_ItmDtlR<D extends MST_SPLN_SUM_ITM_R, S extends Calc01_ItmDtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$dpt_cd, Calc01_ItmDtlR.$dpt_cd);
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$cst_cd, Calc01_ItmDtlR.$cst_cd);
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$spln_itm_cd, Calc01_ItmDtlR.$spln_itm_cd);
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$itm_cd, Calc01_ItmDtlR.$itm_cd);
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$itm_sub1, Calc01_ItmDtlR.$itm_sub1);
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$itm_sub2, Calc01_ItmDtlR.$itm_sub2);
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$itm_sub3, Calc01_ItmDtlR.$itm_sub3);
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$cur_cd, Calc01_ItmDtlR.$cur_cd);
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$spln_ym, Calc01_ItmDtlR.$spln_ym);
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$spln_qty, Calc01_ItmDtlR.$spln_qty);
				addColumnPathMap(MST_SPLN_SUM_ITM_R.$spln_amt, Calc01_ItmDtlR.$spln_amt);
			}
		}
		
		protected Map_MST_SPLN_SUM_DTL_R_Chk02_DtlR<MST_SPLN_SUM_DTL_R,Chk02_DtlR> createMap_MST_SPLN_SUM_DTL_R_Chk02_DtlR() {
			return new Map_MST_SPLN_SUM_DTL_R_Chk02_DtlR<MST_SPLN_SUM_DTL_R, Chk02_DtlR>();
		}
		public class Map_MST_SPLN_SUM_DTL_R_Chk02_DtlR<D extends MST_SPLN_SUM_DTL_R, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$dpt_cd, Chk02_DtlR.$dpt_cd);
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$cst_cd, Chk02_DtlR.$cst_cd);
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$wrk_no, Chk02_DtlR.$wrk_no);
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$spln_itm_cd, Chk02_DtlR.$spln_itm_cd);
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$itm_cd, Chk02_DtlR.$itm_cd);
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$itm_sub1, Chk02_DtlR.$itm_sub1);
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$itm_sub2, Chk02_DtlR.$itm_sub2);
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$itm_sub3, Chk02_DtlR.$itm_sub3);
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$cur_cd, Chk02_DtlR.$cur_cd);
				addColumnPathMap(MST_SPLN_SUM_DTL_R.$spln_ym, Chk02_DtlR.$spln_ym);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				if (!isNullOr(src.calc_spln_qty(), src.calc_spln_amt())) {
					dest.spln_qty(src.calc_spln_qty());
					dest.spln_amt(src.calc_spln_amt());
				}
				else {
					dest.spln_qty(src.spln_qty());
					dest.spln_amt(src.spln_amt());
				}
			}
		}

		protected Map_Upd01_DtlR_Chk02_DtlR<Upd01_DtlR,Chk02_DtlR> createMap_Upd01_DtlR_Chk02_DtlR() {
			return new Map_Upd01_DtlR_Chk02_DtlR<Upd01_DtlR, Chk02_DtlR>();
		}
		public class Map_Upd01_DtlR_Chk02_DtlR<D extends Upd01_DtlR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				if (!isNullOr(src.calc_spln_qty(), src.calc_spln_amt())) {
					dest.spln_qty(src.calc_spln_qty());
					dest.spln_amt(src.calc_spln_amt());
				}
				else {
					dest.spln_qty(src.spln_qty());
					dest.spln_amt(src.spln_amt());
				}
			}
		}
	}

	/**
	 * Upd03オペレーション.<p>
	 *
	 */
	public class Upd03 extends MSBBL_MlySPlnReg_MC_A.Upd03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			chk();
			cpySumSpln();
		}
		
		protected void editUp() {
			if (isNull(up0().cst_cd())){
				up0().cst_cd(MAC_STR.NULL_VAL.value());
			}
			if (isNull(up0().wrk_no())){
				up0().wrk_no(MAC_STR.NULL_VAL.value());
			}
		}

		protected void chk() {
			// 電文チェック
			MCMessagePool.addAll(checkUp());
			throwUpdErr();
			
			// 部門DACチェック
			MCMessagePool.addAll(checkWritableDptCdDac(up0(), Upd03_HdrR.$dpt_cd));
			throwUpdErr();
			
			// コピー元/先データの存在チェック
			MCMessagePool.addAll(checkData());
			throwUpdErr();
		}
		
		/**
		 * 電文チェック
		 */
		protected MCMessageList checkUp() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(check(up0(), Upd03_HdrR.$ym, new FXUCL_RequiredValidater()));
			msgL.addAll(check(up0(), Upd03_HdrR.$dpt_cd, new FXUCL_RequiredValidater()));
			msgL.addAll(check(up0(), Upd03_HdrR.$copy_spln_vers, new FXUCL_RequiredValidater()));
			msgL.addAll(check(up0(), Upd03_HdrR.$new_spln_vers, new FXUCL_RequiredValidater()));
			return msgL;
		}
		
		/**
		 * コピー元/先データの存在チェック
		 */
		protected MCMessageList checkData() {
			MCMessageList msgL = new MCMessageList();
			// コピー元バージョンが存在しないとエラー
			if(!existsSumVers(up0().copy_spln_vers(), true) || !existsSumFix()) {
				msgL.add(new MCMessage(up0(), Upd03_HdrR.$copy_spln_vers,
							MSBBL0125,
							up0().dpt_cd(),
							up0().cst_cd(),
							up0().wrk_no(),
							toYMString(up0().ym()),
							up0().copy_spln_vers()));
			}
			// コピー先バージョンが存在するとエラー
			if (existsSumVers(up0().new_spln_vers(), false)) {
				msgL.add(new MCMessage(up0(), Upd03_HdrR.$new_spln_vers,
						MSBBL0054,
						up0().dpt_cd(),
						up0().cst_cd(),
						up0().wrk_no(),
						toYMString(up0().ym()),
						up0().new_spln_vers()));
			}
			return msgL;
		}

		protected boolean existsSumVers(String splnVers, boolean lockFlg) {
			MCList<MST_SPLN_SUM_VERS_R> cpySrcL = MCList.create(MST_SPLN_SUM_VERS_R.class);
			MST_SPLN_SUM_VERS_R t = MST_SPLN_SUM_VERS_R.create("T");
			MCQueryApiBuilder cpySrcL_bldr = MCQueryApiBuilder.create(t);
			cpySrcL_bldr.setSelect(t.dpt_cd);
			cpySrcL_bldr.addWhereWithAnd(t.dpt_cd.eq(bind("1")), up0().dpt_cd());
			cpySrcL_bldr.addWhereWithAnd(t.cst_cd.eq(bind("1")), up0().cst_cd());
			cpySrcL_bldr.addWhereWithAnd(t.wrk_no.eq(bind("1")), up0().wrk_no());
			cpySrcL_bldr.addWhereWithAnd(t.ym.eq(bind("1")), up0().ym());
			cpySrcL_bldr.addWhereWithAnd(t.spln_vers.eq(bind("1")), splnVers);
			if (lockFlg) {
				dbSelectForUpdate("MSBBL0110_MST_SPLN_SUM_VERS_S05", cpySrcL, cpySrcL_bldr);
			}
			else {
				dbSelect("MSBBL0110_MST_SPLN_SUM_VERS_S06", cpySrcL, cpySrcL_bldr);
			}
			if(isNull(cpySrcL)) {
				return false;
			}
			return true;
		}

		protected boolean existsSumFix() {
			MST_SPLN_SUM_FIX_R t = MST_SPLN_SUM_FIX_R.create("T");
			return execDbCount("MSBBL0110_MST_SPLN_SUM_FIX_S01", t,
					t.dpt_cd.eq(bind("1"))
							.and(t.cst_cd.eq(bind("2")))
							.and(t.wrk_no.eq(bind("3")))
							.and(t.ym.eq(bind("4")))
							.and(t.spln_vers.eq(bind("5")))
							.and(t.fix_flg.eq(bind("6"))),
					up0().dpt_cd(), up0().cst_cd(), up0().wrk_no(), up0().ym(),
					up0().copy_spln_vers(), toTrueStr(true)) > 0;
		}

		/**
		 * 集計別販売計画コピー登録
		 */
		protected void cpySumSpln() {
			regSumVers();
			cpySumFix();
			cpySumDtl();
			cpySumItm();
		}
		/**
		 * 集計別販売計画バージョン登録
		 */
		protected void regSumVers() {
			MST_SPLN_SUM_VERS_R insR = MST_SPLN_SUM_VERS_R.create();
			insR.dpt_cd(up0().dpt_cd());
			insR.cst_cd(up0().cst_cd());
			insR.wrk_no(up0().wrk_no());
			insR.ym(up0().ym());
			insR.spln_vers(up0().new_spln_vers());
			insR.adopted_flg(false);
			insR.locked_flg(false);
			insR.ref_vers(up0().copy_spln_vers());
			insR.usr_cd(up0().usr_cd());
			insR.intr_rmrks(up0().intr_rmrks());
			insR.sub_char1(up0().sub_char1());
			insR.sub_char2(up0().sub_char2());
			insR.sub_char3(up0().sub_char3());
			dbInsertEx("MSBBL0110_MST_SPLN_SUM_VERS_I02", insR,
					MCQueryApiBuilder.create(MST_SPLN_SUM_VERS_R.create("T")));
		}
		/**
		 * 集計別販売計画確定コピー
		 */
		protected void cpySumFix() {
			executeUpdate(MSBBL0110_MST_SPLN_SUM_FIX_I01(), up0());
		}
		/**
		 * 集計別販売計画明細コピー
		 */
		protected void cpySumDtl() {
			executeUpdate(MSBBL0110_MST_SPLN_SUM_DTL_I01(), up0());
		}
		/**
		 * 集計別販売計画品目内訳コピー
		 */
		protected void cpySumItm() {
			executeUpdate(MSBBL0110_MST_SPLN_SUM_ITM_I01(), up0());
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 */
	public class Del01 extends MSBBL_MlySPlnReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 前処理
			editUp();
			// 更新前チェック
			callThisChk03();
			throwCanErr();
			// 明細取消
			delDtl();
		}

		/**
		 * 前処理
		 */
		protected void editUp(){
			setPegNo(Chk03_DtlR.$peg_no, up1());
		}

		/**
		 * 更新前チェック
		 */
		protected void callThisChk03() {
			MSBBL_MlySPlnReg.Chk03 ope = MSBBL_MlySPlnReg.crtChk03();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		/**
		 * 販売計画明細取消処理
		 */
		protected void delDtl(){
			// 更新カウンタを更新
			MST_SPLN_USR_VERS_R versR = MST_SPLN_USR_VERS_R.create();
			versR.usr_cd(up0().usr_cd());
			versR.ym(up0().ym());
			dbTsUpdateKey("MSBBL0110_MST_SPLN_USR_VERS_U02", versR,
					MCQueryApiBuilder.create(MST_SPLN_USR_VERS_R.create("T")).getBaseDbc());
			
			// 削除処理用ワークデータを登録
			insMSW_SPLN_FMT(up1(), up0().spln_ym_fr(), up0().spln_ym_to());

			// 入力別販売計画明細を取消
			executeUpdate(MSBBL0110_MST_SPLN_USR_DTL_D01(), up0());
			// 入力別販売計画品目内訳を取消
			executeUpdate(MSBBL0110_MST_SPLN_USR_ITM_D01(), up0());
			// 入力別販売計画確定を取消
			executeUpdate(MSBBL0110_MST_SPLM_USR_FIX_D01(), up0());
			
			// 最新入力別品目別販売計画データ登録
			regUsrSplnItmNew(up0());
		}
		
	}

	/**
	 * Del02オペレーション.<p>
	 *
	 */
	public class Del02 extends MSBBL_MlySPlnReg_MC_A.Del02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 前処理
			editUp();
			// 更新前チェック
			callThisChk04();
			throwCanErr();
			// 明細取消
			delDtl();
		}

		/**
		 * 前処理
		 */
		protected void editUp(){
			setPegNo(Chk04_DtlR.$peg_no, up1());
		}

		/**
		 * 更新前チェック
		 */
		protected void callThisChk04() {
			MSBBL_MlySPlnReg.Chk04 ope = MSBBL_MlySPlnReg.crtChk04();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}
		/**
		 * 販売計画明細取消処理
		 */
		protected void delDtl(){
			// 集計別販売計画バージョンを取得、更新カウンタを更新
			MST_SPLN_SUM_VERS_R versR = MST_SPLN_SUM_VERS_R.create();
			MCQueryApiBuilder versR_bldr = MCQueryApiBuilder.create(MST_SPLN_SUM_VERS_R.create("T"));
			dbSelectKey("MSBBL0110_MST_SPLN_SUM_VERS_S07", versR, versR_bldr, up0());
			dbTsUpdateKey("MSBBL0110_MST_SPLN_SUM_VERS_U04", versR, versR_bldr.getBaseDbc());
			
			// 削除処理用ワークデータを登録
			up1().setString(Chk04_DtlR.$dpt_cd, up0().dpt_cd());
			up1().setString(Chk04_DtlR.$cst_cd, up0().cst_cd());
			up1().setString(Chk04_DtlR.$wrk_no, up0().wrk_no());
			insMSW_SPLN_FMT(up1(), up0().spln_ym_fr(), up0().spln_ym_to());
			
			// 集計別販売計画明細を取消
			executeUpdate(MSBBL0110_MST_SPLN_SUM_DTL_D01(), up0());
			// 集計別販売計画品目内訳を取消
			executeUpdate(MSBBL0110_MST_SPLN_SUM_ITM_D01(), up0());
			// 集計別販売計画確定を取消
			executeUpdate(MSBBL0110_MST_SPLM_SUM_FIX_D01());
			
			// 最新集計別品目別販売計画データ作成
			if (versR.adopted_flg()) {
				regSumSplnItmNew();
			}
		}
	}
	
	/**
	 * Del03オペレーション.<p>
	 *
	 */
	public class Del03 extends MSBBL_MlySPlnReg_MC_A.Del03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 更新前チェック
			callThisChk05();
			throwCanErr();
			// 入力別販売計画取消
			delUsrSpln();
		}

		/**
		 * 更新前チェック
		 */
		protected void callThisChk05() {
			MSBBL_MlySPlnReg.Chk05 ope = MSBBL_MlySPlnReg.crtChk05();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
		}

		/**
		 * ヘッダ取消
		 */
		protected void delUsrSpln(){
			// 入力別販売計画バージョン取消
			MST_SPLN_USR_VERS_R verR = MST_SPLN_USR_VERS_R.create();
			verR.usr_cd(up0().usr_cd());
			verR.ym(up0().ym());
			dbDeleteKey("MSBBL0110_MST_SPLN_USR_VERS_D01", verR,
					MCQueryApiBuilder.create(MST_SPLN_USR_VERS_R.create("T")));
			
			// 入力別販売計画明細を取得し、ワークテーブルに追加
			MSW_SPLN_FMT_R S0 = MSW_SPLN_FMT_R.create();
			execDbWkDelete("MSBBL0110_MSW_SPLN_FMT_D01", S0);
			executeUpdate(MSBBL0110_MSW_SPLN_FMT_I01(), up0());
			
			// 入力別販売計画明細を取消
			MST_SPLN_USR_DTL_R S1 = MST_SPLN_USR_DTL_R.create();
			MCDelete q1 = sql("MSBBL0110_MST_SPLN_USR_DTL_D02").delete(S1)
					.where(S1.usr_cd.eq(bind("usr_cd")).and(S1.ym.eq(bind("ym"))));
			q1.executeUpdate(verR);
			// 入力別販売計画内訳取消
			MST_SPLN_USR_ITM_R S2 = MST_SPLN_USR_ITM_R.create();
			MCDelete q2 = sql("MSBBL0110_MST_SPLN_USR_ITM_D01").delete(S2)
					.where(S2.usr_cd.eq(bind("usr_cd")).and(S2.ym.eq(bind("ym"))));
			q2.executeUpdate(verR);
			// 入力別販売計画確定を取消
			MST_SPLN_USR_FIX_R S3 = MST_SPLN_USR_FIX_R.create();
			MCDelete q3 = sql("MSBBL0110_MST_SPLN_USR_FIX_D01").delete(S3)
					.where(S3.usr_cd.eq(bind("usr_cd")).and(S3.ym.eq(bind("ym"))));
			q3.executeUpdate(verR);
			
			// 最新入力別品目別販売計画データ登録
			regUsrSplnItmNew(verR);
		}
	}
	/**
	 * Del04オペレーション.<p>
	 *
	 */
	public class Del04 extends MSBBL_MlySPlnReg_MC_A.Del04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 更新前チェック
			callThisChk06();
			throwCanErr();
			// 集計別販売計画取消
			delSumSpln();
		}

		/**
		 * 更新前チェック
		 */
		protected void callThisChk06() {
			MSBBL_MlySPlnReg.Chk06 ope = MSBBL_MlySPlnReg.crtChk06();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
		}
		
		/**
		 * ヘッダ取消
		 */
		protected void delSumSpln(){
			// 集計別販売計画バージョンを取得
			MST_SPLN_SUM_VERS_R verR = MST_SPLN_SUM_VERS_R.create();
			MCQueryApiBuilder verR_bldr = MCQueryApiBuilder.create(MST_SPLN_SUM_VERS_R.create("T"));
			dbSelectKey("MSBBL0110_MST_SPLN_SUM_VERS_S08", verR, verR_bldr, up0());
			
			// 集計別販売計画バージョン取消
			dbDeleteKey("MSBBL0110_MST_SPLN_SUM_VERS_D01", verR, verR_bldr);
			
			// 集計別販売計画明細を取得し、ワークテーブルに追加
			if (verR.adopted_flg()) {
				MSW_SPLN_FMT_R S0 = MSW_SPLN_FMT_R.create();
				execDbWkDelete("MSBBL0110_MSW_SPLN_FMT_D02", S0);
				executeUpdate(MSBBL0110_MSW_SPLN_FMT_I02(), up0());
			}

			// 集計別販売計画明細取消
			MST_SPLN_SUM_DTL_R S1 = MST_SPLN_SUM_DTL_R.create();
			MCDelete q1 = sql("MSBBL0110_MST_SPLN_SUM_DTL_D02")
				.delete(S1)
				.where(S1.dpt_cd.eq(bind("dpt_cd"))
					.and(S1.cst_cd.eq(bind("cst_cd")))
					.and(S1.wrk_no.eq(bind("wrk_no")))
					.and(S1.ym.eq(bind("ym")))
					.and(S1.spln_vers.eq(bind("spln_vers")))
				);
			q1.executeUpdate(verR);
			// 集計別販売計画内訳取消
			MST_SPLN_SUM_ITM_R S2 = MST_SPLN_SUM_ITM_R.create();
			MCDelete q2 = sql("MSBBL0110_MST_SPLN_SUM_ITM_D01")
				.delete(S2)
				.where(S2.dpt_cd.eq(bind("dpt_cd"))
					.and(S2.cst_cd.eq(bind("cst_cd")))
					.and(S2.wrk_no.eq(bind("wrk_no")))
					.and(S2.ym.eq(bind("ym")))
					.and(S2.spln_vers.eq(bind("spln_vers")))
				);
			q2.executeUpdate(verR);
			// 集計別販売計画確定取消
			MST_SPLN_SUM_FIX_R S3 = MST_SPLN_SUM_FIX_R.create();
			MCDelete q3 = sql("MSBBL0110_MST_SPLN_SUM_FIX_D01")
				.delete(S3)
				.where(S3.dpt_cd.eq(bind("dpt_cd"))
					.and(S3.cst_cd.eq(bind("cst_cd")))
					.and(S3.wrk_no.eq(bind("wrk_no")))
					.and(S3.ym.eq(bind("ym")))
					.and(S3.spln_vers.eq(bind("spln_vers")))
				);
			q3.executeUpdate(verR);
			
			// 最新集計別品目別販売計画データ作成
			if (verR.adopted_flg()) {
				regSumSplnItmNew();
			}
		}
	}

	// ---- 共通処理：Srch01/Srch02 -------------------------------------------
	protected String[] _srchFixDtlKeys = {
			Srch01_FixDtlR.$dpt_cd,
			Srch01_FixDtlR.$cst_cd,
			Srch01_FixDtlR.$wrk_no,
			Srch01_FixDtlR.$spln_itm_cd,
			Srch01_FixDtlR.$itm_cd,
			Srch01_FixDtlR.$itm_sub1,
			Srch01_FixDtlR.$itm_sub2,
			Srch01_FixDtlR.$itm_sub3,
			Srch01_FixDtlR.$cur_cd};
	
	protected String[] _srchDtlKeys = {
			Srch01_DtlR.$grp_peg_no,
			Srch01_DtlR.$spln_ym};
	
	/**
	 * 入力フォーム作成(Srch01_DtlR)
	 */
	protected void crtInptForm(MCList<Srch01_FixDtlR> splnFmtL, MCDate splnYmFr, MCDate splnYmTo,
			MCList<Srch01_FixDtlR> fixDtlL, MCList<Srch01_DtlR> dtlL){
		if (isNull(splnFmtL)) {
			return ;
		}
		
		// 表示順の設定
		setFixDtlDispSeq(splnFmtL);

		// 確定データと明細データの作成
		int grpPegNo = 0;
		for (MCList<Srch01_FixDtlR> grpL : splnFmtL.groupList(_srchFixDtlKeys)) {
			grpL.setNumber(Srch01_FixDtlR.$grp_peg_no, grpPegNo++);
			
			Srch01_FixDtlR fixR = grpL.get(0);
			fixR.disp_seq((MCNumber)grpL.min(Srch01_FixDtlR.$disp_seq));
			fixDtlL.add(fixR);
			
			MCList<Srch01_DtlR> tmpL = crtInptFmtRow(splnYmFr, splnYmTo, grpL);
			dtlL.addAll(tmpL);
		}
	}
	
	/**
	 * 表示順の設定
	 */
	protected void setFixDtlDispSeq(MCList<Srch01_FixDtlR> splnFmtL) {
		String[] sortKeys = {
				Srch01_FixDtlR.$dpt_cd,
				Srch01_FixDtlR.$disp_seq,
				Srch01_FixDtlR.$spln_itm_cd,
				Srch01_FixDtlR.$itm_cd,
				Srch01_FixDtlR.$itm_sub1,
				Srch01_FixDtlR.$itm_sub2,
				Srch01_FixDtlR.$itm_sub3,
				Srch01_FixDtlR.$cst_cd,
				Srch01_FixDtlR.$wrk_no,
				Srch01_FixDtlR.$cur_cd,
				Srch01_FixDtlR.$st_ym};
		
		splnFmtL.sort(sortKeys);
		for (int i = 0; i < splnFmtL.size(); i++) {
			Srch01_FixDtlR r = splnFmtL.get(i);
			r.disp_seq(i);
		}
	}
	
	/**
	 * 入力フォームROW作成(Srch01_FixDtlR)
	 */
	protected MCList<Srch01_DtlR> crtInptFmtRow(MCDate splnYmFr, MCDate splnYmTo, MCList<Srch01_FixDtlR> splnFmtL){
		MCList<Srch01_DtlR> retL = MCList.create(Srch01_DtlR.class);
		for (MCDate ym = splnYmFr; ym.lte(splnYmTo); ym = ym.addMonth(MCNumber.ONE)){
			for (Srch01_FixDtlR r : splnFmtL){
				if (ym.gte(r.st_ym()) && ym.lte(r.end_ym())) {
					Srch01_DtlR retR = Srch01_DtlR.create();
					retR.spln_ym(ym);
					retR.grp_peg_no(splnFmtL.get(0).grp_peg_no());
					retL.add(retR);
					break;
				}
			}
		}
		return retL;
	}

	/**
	 * 販売年月ごとに最新の計画年月のデータを抽出したリストを作成する
	 */
	protected MCList<MST_SPLN_USR_DTL_R> crtLatestData(MCList<MST_SPLN_USR_DTL_R> allL) {
		MCList<MST_SPLN_USR_DTL_R> retL = MCList.create(MST_SPLN_USR_DTL_R.class);
		String[] keys = new String[] {
				MST_SPLN_USR_DTL_R.$dpt_cd,
				MST_SPLN_USR_DTL_R.$cst_cd,
				MST_SPLN_USR_DTL_R.$wrk_no,
				MST_SPLN_USR_DTL_R.$spln_itm_cd,
				MST_SPLN_USR_DTL_R.$itm_cd,
				MST_SPLN_USR_DTL_R.$itm_sub1,
				MST_SPLN_USR_DTL_R.$itm_sub2,
				MST_SPLN_USR_DTL_R.$itm_sub3,
				MST_SPLN_USR_DTL_R.$cur_cd,
				MST_SPLN_USR_DTL_R.$spln_ym};
		for (MCList<MST_SPLN_USR_DTL_R> subL : allL.groupList(keys)){
			subL.sort(MCList.SortType.DESC, MST_SPLN_USR_DTL_R.$ym);
			retL.add(subL.get(0));
		}
		return retL;
	}
	
	/**
	 * 実績データを入力フォームにマージする
	 */
	protected void mergeFrcstSloSum(MCList<MST_FRCST_SLO_SUM_R> dbcL,
			MCList<Srch01_FixDtlR> fixDtlL, MCIndexKey fixDtlIdx,
			MCList<Srch01_DtlR> dtlL, MCIndexKey dtlIdx){
		for (MST_FRCST_SLO_SUM_R dbcR : dbcL){
			Comparable[] fixVals = {
					dbcR.sls_dpt_cd(),
					dbcR.cst_cd(),
					dbcR.wrk_no(),
					dbcR.spln_itm_cd(),
					dbcR.itm_cd(),
					dbcR.itm_sub1(),
					dbcR.itm_sub2(),
					dbcR.itm_sub3(),
					dbcR.trd_cur_cd()};

			Srch01_FixDtlR fixR = fixDtlL.getFirst(fixDtlIdx, fixVals);
			if (!isNull(fixR)) {
				Comparable[] vals = new Comparable[]{fixR.grp_peg_no(), dbcR.ym()};
				Srch01_DtlR dtlR = dtlL.getFirst(dtlIdx, vals);
				if (dtlR != null) {
					dtlR.frcst_qty(dbcR.cst_frcst_qty());
					dtlR.frcst_amt(dbcR.trd_cur_cst_frcst_amt());
					dtlR.pre_slo_qty(dbcR.base_unit_pre_slo_qty());
					dtlR.pre_slo_amt(dbcR.trd_cur_pre_slo_amt());
					dtlR.slo_qty(dbcR.base_unit_slo_qty());
					dtlR.slo_amt(dbcR.trd_cur_slo_amt());
				}
			}
		}
	}
	
	// ---- 共通処理：更新 ---------------------------------------------------
	/**
	 * 部門ロック
	 */
	protected void lockSplnByDpt(String dptCd){
		MCList<MST_SPLN_LOCK_R> lockL = MCList.create(MST_SPLN_LOCK_R.class);
		MST_SPLN_LOCK_R r = MST_SPLN_LOCK_R.create();
		r.dpt_cd(dptCd);
		lockL.add(r);
		lockSplnByDpts(lockL);
	}

	/**
	 * 部門ロック
	 */
	protected void lockSplnByDpts(MCList<MST_SPLN_LOCK_R> dptL){
		MCList<MST_SPLN_LOCK_R> lockL = dptL.shallowClone();
		MCQueryApiBuilder lockL_bldr = MCQueryApiBuilder.create(MST_SPLN_LOCK_R.create("T"));
		lockL.sort(MST_SPLN_LOCK_R.$dpt_cd);
		lockL_bldr.setOrderByAsc(lockL_bldr.getBaseDbc().getKeyColumn$());
		dbSelectKeyForUpdate("MSBBL0110_MST_SPLN_LOCK_S01", lockL, lockL_bldr, lockL);
		if (lockL.size() != dptL.size()) {
			throw new MCAppException("FCBCC0110");
		}
	}

	/**
	 * 更新削除処理用ワークデータを登録
	 * @param ymFr 最新データ洗い替え対象の開始年月
	 * @param ymTo 最新データ洗い替え対象の終了年月
	 */
	protected void insMSW_SPLN_FMT(MCList<?> fixDtlL, MCDate ymFr, MCDate ymTo) {
		String[] fmtKeys = {
				 MSW_SPLN_FMT_R.$dpt_cd
				,MSW_SPLN_FMT_R.$cst_cd
				,MSW_SPLN_FMT_R.$wrk_no
				,MSW_SPLN_FMT_R.$spln_itm_cd
				,MSW_SPLN_FMT_R.$itm_cd
				,MSW_SPLN_FMT_R.$itm_sub1
				,MSW_SPLN_FMT_R.$itm_sub2
				,MSW_SPLN_FMT_R.$itm_sub3
				,MSW_SPLN_FMT_R.$cur_cd
				};
		
		MCList<MSW_SPLN_FMT_R> wkL = MCList.create(MSW_SPLN_FMT_R.class);
		for (MCRow r : fixDtlL.distinctNE(fmtKeys)) {
			MSW_SPLN_FMT_R tmpR = MSW_SPLN_FMT_R.create();
			for (String key : fmtKeys) {
				tmpR.setString(key, r.getString(key));
			}
			tmpR.st_ym(ymFr);
			tmpR.end_ym(ymTo);
			tmpR.fix_flg(r.getBooleanNE(MSW_SPLN_FMT_R.$fix_flg));
			wkL.add(tmpR);
		}
		MSW_SPLN_FMT_R S0 = MSW_SPLN_FMT_R.create();
		execDbWkDelete("MSBBL0110_MSW_SPLN_FMT_D03", S0);
		dbInsertEx("MSBBL0110_MSW_SPLN_FMT_I02", wkL,
				MCQueryApiBuilder.create(MSW_SPLN_FMT_R.create("T")));
	}
	
	// ---- 共通処理：入力別更新 ---------------------------------------------------
	/**
	 * 最新入力別品目別販売計画データ登録  <br>
	 * 前提：処理対象データがMSW_SPLN_FMTに挿入されていること
	 * @param bind バインド値：usr_cd
	 */
	protected void regUsrSplnItmNew(MCRow bind) {
		// 品目別データ取得
		MCList<MST_SPLN_USR_ITM_NEW_R> itmTmpL = MCList.create(MST_SPLN_USR_ITM_NEW_R.class);
		executeQuery(itmTmpL, MSBBL0110_MST_SPLN_USR_ITM_S01(), bind);
		
		// 最新品目別データ作成
		MCList<MST_SPLN_USR_ITM_NEW_R> splnItmL = MCList.create(MST_SPLN_USR_ITM_NEW_R.class);
		MCList<MST_SPLN_USR_ITM_NEW_R> nrmlItmL = MCList.create(MST_SPLN_USR_ITM_NEW_R.class);
		for (MST_SPLN_USR_ITM_NEW_R itmTmpR : itmTmpL) {
			if (MAC_STR.isNULL_VAL(itmTmpR.spln_itm_cd())) {
				nrmlItmL.add(itmTmpR);
			}
			else {
				splnItmL.add(itmTmpR);
			}
		}
		MCList<MST_SPLN_USR_ITM_NEW_R> itmNewL = MCList.create(MST_SPLN_USR_ITM_NEW_R.class);

		String[] nrmlItmKeys = new String[] {
				MST_SPLN_USR_ITM_NEW_R.$dpt_cd,
				MST_SPLN_USR_ITM_NEW_R.$cst_cd,
				MST_SPLN_USR_ITM_NEW_R.$wrk_no,
				MST_SPLN_USR_ITM_NEW_R.$itm_cd,
				MST_SPLN_USR_ITM_NEW_R.$itm_sub1,
				MST_SPLN_USR_ITM_NEW_R.$itm_sub2,
				MST_SPLN_USR_ITM_NEW_R.$itm_sub3,
				MST_SPLN_USR_ITM_NEW_R.$cur_cd,
				MST_SPLN_USR_ITM_NEW_R.$spln_ym};
		for (MCList<MST_SPLN_USR_ITM_NEW_R> grpL : nrmlItmL.groupList(nrmlItmKeys)) {
			grpL.sort(SortType.DESC, MST_SPLN_USR_ITM_NEW_R.$ym);
			itmNewL.add(grpL.get(0));
		}
		
		String[] itmSplnKeys = new String[] {
				MST_SPLN_USR_ITM_NEW_R.$dpt_cd,
				MST_SPLN_USR_ITM_NEW_R.$cst_cd,
				MST_SPLN_USR_ITM_NEW_R.$wrk_no,
				MST_SPLN_USR_ITM_NEW_R.$spln_itm_cd,
				MST_SPLN_USR_ITM_NEW_R.$cur_cd,
				MST_SPLN_USR_ITM_NEW_R.$spln_ym};
		for (MCList<MST_SPLN_USR_ITM_NEW_R> grpL : splnItmL.groupList(itmSplnKeys)) {
			grpL.sort(SortType.DESC, MST_SPLN_USR_ITM_NEW_R.$ym);
			MCDate ym = grpL.get(0).ym();
			MCList<MST_SPLN_USR_ITM_NEW_R> subL = grpL.subList(r->isSame(r.ym(), ym));
			itmNewL.addAll(subL);
		}
		
		// 洗い替え
		executeUpdate(MSBBL0110_MST_SPLN_USR_ITM_NEW_D01(), bind);
		dbInsertEx("MSBBL0110_MST_SPLN_USR_ITM_NEW_I01", itmNewL,
				MCQueryApiBuilder.create(MST_SPLN_USR_ITM_NEW_R.create("T")));
	}

	// ---- 共通処理：集計別更新 ---------------------------------------------------
	/**
	 * 最新集計別品目別販売計画データ登録  <br>
	 * 前提：処理対象データがMSW_SPLN_FMTに挿入されていること
	 */
	protected void regSumSplnItmNew() {
		// 品目別データ取得
		MCList<MST_SPLN_SUM_ITM_NEW_R> itmTmpL = MCList.create(MST_SPLN_SUM_ITM_NEW_R.class);
		executeQuery(itmTmpL, MSBBL0110_MST_SPLN_SUM_ITM_S01());
		
		// 最新品目別データ作成
		MCList<MST_SPLN_SUM_ITM_NEW_R> splnItmL = MCList.create(MST_SPLN_SUM_ITM_NEW_R.class);
		MCList<MST_SPLN_SUM_ITM_NEW_R> nrmlItmL = MCList.create(MST_SPLN_SUM_ITM_NEW_R.class);
		for (MST_SPLN_SUM_ITM_NEW_R itmTmpR : itmTmpL) {
			if (MAC_STR.isNULL_VAL(itmTmpR.spln_itm_cd())) {
				nrmlItmL.add(itmTmpR);
			}
			else {
				splnItmL.add(itmTmpR);
			}
		}
		MCList<MST_SPLN_SUM_ITM_NEW_R> itmNewL = MCList.create(MST_SPLN_SUM_ITM_NEW_R.class);

		String[] nrmlItmKeys = new String[] {
				MST_SPLN_SUM_ITM_NEW_R.$dpt_cd,
				MST_SPLN_SUM_ITM_NEW_R.$cst_cd,
				MST_SPLN_SUM_ITM_NEW_R.$wrk_no,
				MST_SPLN_SUM_ITM_NEW_R.$itm_cd,
				MST_SPLN_SUM_ITM_NEW_R.$itm_sub1,
				MST_SPLN_SUM_ITM_NEW_R.$itm_sub2,
				MST_SPLN_SUM_ITM_NEW_R.$itm_sub3,
				MST_SPLN_SUM_ITM_NEW_R.$cur_cd,
				MST_SPLN_SUM_ITM_NEW_R.$spln_ym};
		for (MCList<MST_SPLN_SUM_ITM_NEW_R> grpL : nrmlItmL.groupList(nrmlItmKeys)) {
			grpL.sort(SortType.DESC, MST_SPLN_USR_ITM_NEW_R.$ym);
			itmNewL.add(grpL.get(0));
		}
		
		String[] itmSplnKeys = new String[] {
				MST_SPLN_SUM_ITM_NEW_R.$dpt_cd,
				MST_SPLN_SUM_ITM_NEW_R.$cst_cd,
				MST_SPLN_SUM_ITM_NEW_R.$wrk_no,
				MST_SPLN_SUM_ITM_NEW_R.$spln_itm_cd,
				MST_SPLN_SUM_ITM_NEW_R.$cur_cd,
				MST_SPLN_SUM_ITM_NEW_R.$spln_ym};
		for (MCList<MST_SPLN_SUM_ITM_NEW_R> grpL : splnItmL.groupList(itmSplnKeys)) {
			grpL.sort(SortType.DESC, MST_SPLN_USR_ITM_NEW_R.$ym);
			MCDate ym = grpL.get(0).ym();
			MCList<MST_SPLN_SUM_ITM_NEW_R> subL = grpL.subList(r->isSame(r.ym(), ym));
			itmNewL.addAll(subL);
		}
		
		// 洗い替え
		executeUpdate(MSBBL0110_MST_SPLN_SUM_ITM_NEW_D01());
		executeUpdate(MSBBL0110_MST_SPLN_SUM_ITM_NEW_D02());
		dbInsertEx("MSBBL0110_MST_SPLN_SUM_ITM_NEW_I01", itmNewL,
				MCQueryApiBuilder.create(MST_SPLN_SUM_ITM_NEW_R.create("T")));
	}

	// ---- 共通処理 ---------------------------------------------------------
	protected void editUpOnOffStr(MCRow up, String col, boolean t_flg, boolean f_flg) {
		if (!(t_flg && f_flg)) {
			if (t_flg) {
				up.addStringColumn(col, toTrueStr(true));
			}
			if (f_flg) {
				up.addStringColumn(col, toFalseStr(false));
			}
		}
	}

	protected Comparable[] getVals(String[] keys, MCRow cndR) {
		Comparable[] vals = new Comparable[keys.length];
		for (int i = 0; i < vals.length; i++) {
			vals[i] = cndR.getValueNE(keys[i]);
		}
		return vals;
	}

	//FMCB CUSTOM END
}