package mcframe.serverMSBD.MSBDL0020;

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
import mcframe.serverMSBD.MSBDL0020.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import static mcframe.commonMA.meta.MA_META.*;
import mcframe.serverFXUC.FXUCL0020.*;
import mcframe.serverFXUC.FXUCL0030.*;
import static mcframe.serverMSBD.MSBDL0020.Query.*;
import mcframe.serverMSBD.MSBDL5280.*;
import mcframe.commonCore.param.MCParam;
import java.util.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcFrcstBalReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcFrcstBalReg_MC extends MSBDL_PurcFrcstBalReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 購買内示情報を検索し、内示残を計算する。<br>
	 */
	public class Srch01 extends MSBDL_PurcFrcstBalReg_MC_A.Srch01 {
		protected int _backToMaxYm = 3;
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			srch();
		}

		/**
		 * 前処理
		 */
		protected void editUp() {
			// 会計締日、会計月度基準を設定
			up0().addNumberColumn("ac_cl_day", getCo().ac_cl_day());
			up0().addNumberColumn("ac_cl_mon_base", getCo().ac_cl_mon_base());
			// 下請け対象・下請け対象外
			editUpOnOffStr(up0(), "subcon_flg_str", up0().subcon_t_flg(), up0().subcon_f_flg());
		}

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

		/** 品目単位マスタ・キャッシュ */
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _cacheItmUnit;
		/** 購買内示残（ダウロードデータ） */
		protected MCList<Srch01_RsltR> _pfBalL;
		/** 購買内示データ */
		protected MCList<PurcFrcst_Srch01_RsltR> _pfDtlL;
		/** 発注済データ */
		protected MCList<PurcFrcst_Srch02_RsltR> _poDtlL;

		/**
		 * 検索
		 */
		protected void srch() {
			srchPfBal();
			srchPfDtl();
			srchPoDtl();
			setDown();
		}

		/**
		 * 購買内示残データ検索
		 */
		protected void srchPfBal() {
			_pfBalL = MCList.create(Srch01_RsltR.class);
			executeQuery(_pfBalL, MSBDL0020_MST_PURC_FRCST_BAL_S01(), up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			_pfBalL.setAll(editDown());
			_pfBalL.sort(Srch01_RsltR.$sppl_cd,
					Srch01_RsltR.$itm_cd,
					Srch01_RsltR.$itm_sub1,
					Srch01_RsltR.$itm_sub2,
					Srch01_RsltR.$itm_sub3,
					Srch01_RsltR.$wg_cd,
					Srch01_RsltR.$ym);
			down0().setAll(_pfBalL);
		}

		/**
		 * 最新内示情報検索
		 */
		protected void srchPfDtl() {
			MSBDL_PurcFrcstService.PurcFrcst_Srch01 svc = MSBDL_PurcFrcstService.crtPurcFrcst_Srch01();
			copy(svc.up0(), up0(), createMap_PurcFrcst_Srch01_Cnd01R_Srch01_CndR());
			if (hasCndSubRmrks()) {
				addAll(svc.up1(), _pfBalL.distinctNE(getPfKyeCol()), createMap_PurcFrcst_Srch01_Cnd02R_Srch01_RsltR());
			}
			svc.exec();
			_pfDtlL = svc.down0();
		}

		protected String[] getPfKyeCol(){
			return new String[]{Srch01_RsltR.$wg_cd,
					Srch01_RsltR.$sppl_cd,
					Srch01_RsltR.$itm_cd,
					Srch01_RsltR.$itm_sub1,
					Srch01_RsltR.$itm_sub2,
					Srch01_RsltR.$itm_sub3};
		}
		
		protected String[] getBpItmCacheCol(){
			return new String[]{
					Srch01_RsltR.$sppl_cd,
					Srch01_RsltR.$itm_cd,
					Srch01_RsltR.$itm_sub1,
					Srch01_RsltR.$itm_sub2,
					Srch01_RsltR.$itm_sub3};
		}
		
		/**
		 * 検索条件に内部備考、予備１－３を指定したか。
		 * この条件に一致なかった年月のデータを補完しないようにする。
		 * 補完した場合に内示残データがDBに存在した場合に一意制約違反になることを回避する目的。
		 */
		protected boolean hasCndSubRmrks(){
			return !isNull(up0().intr_rmrks()) ||
					!isNull(up0().sub_char1()) ||
					!isNull(up0().sub_char2()) ||
					!isNull(up0().sub_char3());
		}
		
		/**
		 * 発注済データ検索
		 */
		protected void srchPoDtl() {
			MSBDL_PurcFrcstService.PurcFrcst_Srch02 svc = MSBDL_PurcFrcstService.crtPurcFrcst_Srch02();
			addAll(svc.up0(), _pfDtlL.distinctNE(getPfKyeCol()), createMap_PurcFrcst_Srch02_CndR_PurcFrcst_Srch01_RsltR());
			copy(svc.up1(), up0(), createMap_PurcFrcst_Srch02_Cnd2R_Srch01_CndR());
			svc.exec();
			_poDtlL = svc.down0();
		}

		protected Map_PurcFrcst_Srch02_Cnd2R_Srch01_CndR<PurcFrcst_Srch02_Cnd2R,Srch01_CndR> createMap_PurcFrcst_Srch02_Cnd2R_Srch01_CndR() {
			return new Map_PurcFrcst_Srch02_Cnd2R_Srch01_CndR<PurcFrcst_Srch02_Cnd2R, Srch01_CndR>();
		}
		public class Map_PurcFrcst_Srch02_Cnd2R_Srch01_CndR<D extends PurcFrcst_Srch02_Cnd2R, S extends Srch01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcFrcst_Srch02_Cnd2R.$ym_fr, Srch01_CndR.$ym_fr);
				addColumnPathMap(PurcFrcst_Srch02_Cnd2R.$ym_to, Srch01_CndR.$ym_to);
			}
		}
		
		/**
		 * 検索結果により下り電文を編集する。
		 */
		protected MCList<Srch01_RsltR> editDown() {
			MCList<Srch01_RsltR> downL = MCList.create(Srch01_RsltR.class);
			createDownMain(downL);
			removeNotTgt(downL);
			return downL;
		}

		protected void createDownMain(MCList<Srch01_RsltR> downL) {

			MCList<PurcFrcst_Srch01_RsltR> keyL = _pfDtlL.groupBy(getPfKyeCol());
			MCIndexKey pfBalKey = _pfBalL.createIndex(getPfKyeCol());
			MCIndexKey pfDtlKey = _pfDtlL.createIndex(getPfKyeCol());
			MCIndexKey poDtlKey = _poDtlL.createIndex(getPfKyeCol());
			crtItmCache();
			crtWeekYmStEndCache();
			for (PurcFrcst_Srch01_RsltR keyR : keyL) {
				MCList<Srch01_RsltR> pfBalL = _pfBalL.subList(pfBalKey, getVals(getPfKyeCol(), keyR));
				MCList<PurcFrcst_Srch01_RsltR> pfDtlL = _pfDtlL.subList(pfDtlKey, getVals(getPfKyeCol(), keyR));
				MCList<PurcFrcst_Srch02_RsltR> poDtlL = _poDtlL.subList(poDtlKey, getVals(getPfKyeCol(), keyR));
				if (isNull(pfDtlL)) {
					continue;
				}
				pfDtlL.sort(PurcFrcst_Srch01_RsltR.$pf_period_st_dt);
				PurcFrcst_Srch01_RsltR baseR = pfDtlL.get(0);
				MCDate stYm = up0().ym_fr();
				if (stYm.lt(baseR.pf_period_st_dt().startOfMonth())) {
					stYm = baseR.pf_period_st_dt().startOfMonth();
				}
				MCIndexKey pfBalYmKey = pfBalL.createIndex(Srch01_RsltR.$ym);
				for (MCDate ym = stYm; ym.lte(up0().ym_to()); ym = ym.addMonth(MCNumber.ONE)) {
					// 内示残の検索条件に一致しなかった年月は補完しない
					Srch01_RsltR pfBalR = pfBalL.getFirst(pfBalYmKey, ym);
					if(hasCndSubRmrks() && pfBalR == null){
						continue;
					}
						
					Srch01_RsltR downR = Srch01_RsltR.create();
					setBaseData(downR, baseR, ym, pfDtlL);
					setPfDtlData(downR, pfDtlL);
					setPfBalData(downR, pfBalR);
					setPoData(downR, poDtlL);
					setBasePeriodTyp(downR, pfDtlL);
					editData(downR);

					downL.add(downR);
				}
			}
			setPurcCommitFlg(downL);
		}
		
		/**
		 * 引取責任ＦＬＧを取得する。<BR>
		 * 取引先品目マスタは年月で検索する。<BR>
		 * 引取責任ＦＬＧを設定した後、検索条件の引取責任ＦＬＧに従って、下り電文を絞り込む。
		 */
		protected void setPurcCommitFlg(MCList<Srch01_RsltR> downL){
			createBpItmCache(downL.groupBy(getBpItmCacheCol()));
			MCList<Srch01_RsltR> matchedL = MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR downR : downL) {
				MAM_BP_ITM_R r = getCacheBpItm(downR);
				downR.purc_commit_flg(r.purc_commit_flg());
				// 検索条件の引取責任FLGに従って、下り電文から削除する行を判定
				if (!up0().purc_commit_t_flg() && downR.purc_commit_flg()) {
					continue;
				}
				if (!up0().purc_commit_f_flg() && !downR.purc_commit_flg()) {
					continue;
				}
				matchedL.add(downR);
			}
			downL.setAll(matchedL);
		}
		
		protected FXUCL_MCDbcCacheStEnd<MAM_BP_ITM_R> _cacheBpItm = null;

		protected void createBpItmCache(MCList<Srch01_RsltR> downL) {
			_cacheBpItm = new FXUCL_MCDbcCacheStEnd<MAM_BP_ITM_R>(
					MCQueryApiBuilder.create(MAM_BP_ITM_R.create("T")),
					downL, getBpItmCacheCol());
		}

		protected MAM_BP_ITM_R getCacheBpItm(Srch01_RsltR r) {
			if (_cacheBpItm == null) {
				return MAM_BP_ITM_R.create();
			}
			MAM_BP_ITM_R bpItmR = _cacheBpItm.get(r.ym(), r.sppl_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			if (bpItmR == null) {
				return MAM_BP_ITM_R.create();
			}
			else {
				return bpItmR;
			}
		}
		
		protected void setBaseData(Srch01_RsltR downR, PurcFrcst_Srch01_RsltR baseR, MCDate ym, MCList<PurcFrcst_Srch01_RsltR> pfDtlL) {
			downR.ym(ym);
			downR.sppl_cd(baseR.sppl_cd());
			downR.sppl_nm(baseR.sppl_nm());
			downR.subcon_flg(baseR.subcon_flg());
			downR.itm_cd(baseR.itm_cd());
			downR.itm_sub1(baseR.itm_sub1());
			downR.itm_sub2(baseR.itm_sub2());
			downR.itm_sub3(baseR.itm_sub3());
			downR.itm_nm(baseR.itm_nm());
			downR.wg_cd(baseR.wg_cd());
			downR.wg_nm(baseR.wg_nm());
			downR.sppl_grp_cd1(baseR.sppl_grp_cd1());
			downR.sppl_grp_nm1(baseR.sppl_grp_nm1());
			downR.sppl_grp_cd2(baseR.sppl_grp_cd2());
			downR.sppl_grp_nm2(baseR.sppl_grp_nm2());
			downR.sppl_grp_cd3(baseR.sppl_grp_cd3());
			downR.sppl_grp_nm3(baseR.sppl_grp_nm3());
			downR.sppl_grp_cd4(baseR.sppl_grp_cd4());
			downR.sppl_grp_nm4(baseR.sppl_grp_nm4());
			downR.sppl_grp_cd5(baseR.sppl_grp_cd5());
			downR.sppl_grp_nm5(baseR.sppl_grp_nm5());
			downR.sppl_grp_cd6(baseR.sppl_grp_cd6());
			downR.sppl_grp_nm6(baseR.sppl_grp_nm6());
			downR.sppl_grp_cd7(baseR.sppl_grp_cd7());
			downR.sppl_grp_nm7(baseR.sppl_grp_nm7());
			downR.sppl_grp_cd8(baseR.sppl_grp_cd8());
			downR.sppl_grp_nm8(baseR.sppl_grp_nm8());
			downR.sppl_grp_cd9(baseR.sppl_grp_cd9());
			downR.sppl_grp_nm9(baseR.sppl_grp_nm9());
			downR.sppl_grp_cd10(baseR.sppl_grp_cd10());
			downR.sppl_grp_nm10(baseR.sppl_grp_nm10());
			downR.itm_typ(baseR.itm_typ());
			downR.itm_typ_nm(baseR.itm_typ_nm());
			downR.itm_typ_d_cd(baseR.itm_typ_d_cd());
			downR.itm_typ_d_nm(baseR.itm_typ_d_nm());
			downR.itm_grp_cd1(baseR.itm_grp_cd1());
			downR.itm_grp_nm1(baseR.itm_grp_nm1());
			downR.itm_grp_cd2(baseR.itm_grp_cd2());
			downR.itm_grp_nm2(baseR.itm_grp_nm2());
			downR.itm_grp_cd3(baseR.itm_grp_cd3());
			downR.itm_grp_nm3(baseR.itm_grp_nm3());
			downR.itm_grp_cd4(baseR.itm_grp_cd4());
			downR.itm_grp_nm4(baseR.itm_grp_nm4());
			downR.itm_grp_cd5(baseR.itm_grp_cd5());
			downR.itm_grp_nm5(baseR.itm_grp_nm5());
			downR.itm_grp_cd6(baseR.itm_grp_cd6());
			downR.itm_grp_nm6(baseR.itm_grp_nm6());
			downR.itm_grp_cd7(baseR.itm_grp_cd7());
			downR.itm_grp_nm7(baseR.itm_grp_nm7());
			downR.itm_grp_cd8(baseR.itm_grp_cd8());
			downR.itm_grp_nm8(baseR.itm_grp_nm8());
			downR.itm_grp_cd9(baseR.itm_grp_cd9());
			downR.itm_grp_nm9(baseR.itm_grp_nm9());
			downR.itm_grp_cd10(baseR.itm_grp_cd10());
			downR.itm_grp_nm10(baseR.itm_grp_nm10());

			downR.base_unit_cd(baseR.base_unit_cd());
			downR.base_unit_nm(baseR.base_unit_nm());
			downR.base_unit_rnd_typ(baseR.base_unit_rnd_typ());
			downR.base_unit_dec_place(baseR.base_unit_dec_place());
			// 発注数を設定する際の日付の範囲を保持
			downR.monthly_ym_st_dt(getPeriodStDt(ym, MAC_PERIOD_TYP.MONTHLY.value()));
			downR.monthly_ym_end_dt(getPeriodEndDt(ym, MAC_PERIOD_TYP.MONTHLY.value()));
			downR.week_ym_st_dt(getWeekYmStDt(ym));
			downR.week_ym_end_dt(getWeekYmEndDt(ym));

			// 該当年月の最新取引単位を取得
			for (PurcFrcst_Srch01_RsltR r: pfDtlL) {
				if (!isSame(ym, r.pf_period_st_dt().startOfMonth())) {
					continue;
				}
				baseR = r;
			}
			downR.trd_unit_cd(baseR.trd_unit_cd());
			downR.trd_unit_nm(baseR.trd_unit_nm());
			downR.trd_unit_conv_base_qty(baseR.trd_unit_conv_base_qty());
			downR.trd_unit_conv_qty(baseR.trd_unit_conv_qty());
			downR.trd_unit_dec_place(baseR.trd_unit_dec_place());
		}
		
		protected void setPfDtlData(Srch01_RsltR downR, MCList<PurcFrcst_Srch01_RsltR> pfDtlL) {
			for (PurcFrcst_Srch01_RsltR r : pfDtlL) {
				if (MAC_PERIOD_TYP.isMONTHLY(r.pf_period_typ())) {
					if (isMonTgtTerm(downR, r.pf_period_st_dt())) {
						downR.base_unit_monthly_pf_qty(MCNumber.sum(downR.base_unit_monthly_pf_qty(), r.base_unit_pf_qty()));
						downR.trd_unit_monthly_pf_qty(sumTrdUnitPfQty(downR, downR.trd_unit_monthly_pf_qty(), r));
					}
				}
				else if (MAC_PERIOD_TYP.isTENDAYS(r.pf_period_typ())) {
					if (isMonTgtTerm(downR, r.pf_period_st_dt())) {
						downR.base_unit_tendays_pf_qty(MCNumber.sum(downR.base_unit_tendays_pf_qty(), r.base_unit_pf_qty()));
						downR.trd_unit_tendays_pf_qty(sumTrdUnitPfQty(downR, downR.trd_unit_tendays_pf_qty(), r));
					}
				}
				else if (MAC_PERIOD_TYP.isWEEKLY(r.pf_period_typ())) {
					if (isWeekTgtTerm(downR, r.pf_period_st_dt())) {
						downR.base_unit_weekly_pf_qty(MCNumber.sum(downR.base_unit_weekly_pf_qty(), r.base_unit_pf_qty()));
						downR.trd_unit_weekly_pf_qty(sumTrdUnitPfQty(downR, downR.trd_unit_weekly_pf_qty(), r));
					}
				}
			}
		}
		
		protected MCNumber sumTrdUnitPfQty(Srch01_RsltR downR, MCNumber trdUnitPfQty, PurcFrcst_Srch01_RsltR addPfQtyR) {
			MCNumber ret = null;
			if (isSame(downR.trd_unit_cd(), addPfQtyR.trd_unit_cd())) {
				ret = MCNumber.sum(trdUnitPfQty, addPfQtyR.trd_unit_pf_qty());
			}
			else {
				ret = MCNumber.sum(trdUnitPfQty, convToTrdQty(addPfQtyR.base_unit_pf_qty(), downR));
			}
			return ret;
		}

		protected void setPfBalData(Srch01_RsltR downR, Srch01_RsltR r) {
			if (r == null) {
				return ;
			}
			if (isSame(r.trd_unit_cd(), downR.trd_unit_cd())) {
				downR.trd_unit_bf_qty(r.trd_unit_bf_qty());
			}
			else {
				downR.trd_unit_bf_qty(convToTrdQty(r.base_unit_bf_qty(), downR));
			}
			downR.base_unit_bf_qty(r.base_unit_bf_qty());
			downR.cmpl_flg(r.cmpl_flg());
			downR.intr_rmrks(r.intr_rmrks());
			downR.sub_char1(r.sub_char1());
			downR.sub_char2(r.sub_char2());
			downR.sub_char3(r.sub_char3());
			downR.ins_usr_id(r.ins_usr_id());
			downR.ins_usr_nm(r.ins_usr_nm());
			downR.ins_func_id(r.ins_func_id());
			downR.ins_ts(r.ins_ts());
			downR.upd_cntr(r.upd_cntr());
			downR.upd_usr_id(r.upd_usr_id());
			downR.upd_usr_nm(r.upd_usr_nm());
			downR.upd_func_id(r.upd_func_id());
			downR.upd_ts(r.upd_ts());
			downR.upd_srv_req_no(r.upd_srv_req_no());
		}

		protected void setPoData(Srch01_RsltR downR, MCList<PurcFrcst_Srch02_RsltR> poDtlL) {
			for (PurcFrcst_Srch02_RsltR r : poDtlL) {
				if (isMonTgtTerm(downR, r.dlv_rqst_dt())) {
					downR.base_unit_monthly_po_qty(MCNumber.sum(downR.base_unit_monthly_po_qty(), r.base_unit_qty()));
					downR.trd_unit_monthly_po_qty(MCNumber.sum(downR.trd_unit_monthly_po_qty(), convToTrdQty(r.base_unit_qty(), downR)));
				}
				if (isWeekTgtTerm(downR, r.dlv_rqst_dt())) {
					downR.base_unit_weekly_po_qty(MCNumber.sum(downR.base_unit_weekly_po_qty(), r.base_unit_qty()));
					downR.trd_unit_weekly_po_qty(MCNumber.sum(downR.trd_unit_weekly_po_qty(), convToTrdQty(r.base_unit_qty(), downR)));
				}
			}
		}
		
		/**
		 * 内示残を管理する期間区分を決定する
		 */
		protected void setBasePeriodTyp(Srch01_RsltR downR, MCList<PurcFrcst_Srch01_RsltR> pfDtlL) {
			// １．内示データがある月の場合
			if (!isNull(downR.trd_unit_weekly_pf_qty())) {
				downR.weekly_flg(true);
				return ;
			}
			else if (!isNull(downR.trd_unit_tendays_pf_qty())) {
				downR.tendays_flg(true);
				return ;
			}
			else if (!isNull(downR.trd_unit_monthly_pf_qty())) {
				downR.monthly_flg(true);
				return ;
			}
			
			// ２．内示データがない月の場合
			PurcFrcst_Srch01_RsltR baseR = null;
			MCDate maxYm = null;
			for (PurcFrcst_Srch01_RsltR pfDtlR : pfDtlL) {
				MCDate ym = getYm(pfDtlR);
				if (isNull(ym) || ym.gt(downR.ym())) {
					continue;
				}
				else if (isNullOr(maxYm) || ym.gt(maxYm)) {
					maxYm = ym;
					baseR = pfDtlR;
				}
				else if (maxYm.eq(ym)) {
					if (pfDtlR.pf_period_typ().compareTo(baseR.pf_period_typ()) < 0) {
						baseR = pfDtlR;
					}
				}
			}
			if (baseR != null) {
				downR.weekly_flg(MAC_PERIOD_TYP.isWEEKLY(baseR.pf_period_typ()));
				downR.tendays_flg(MAC_PERIOD_TYP.isTENDAYS(baseR.pf_period_typ()));
				downR.monthly_flg(MAC_PERIOD_TYP.isMONTHLY(baseR.pf_period_typ()));
			}
			else {
				downR.monthly_flg(true);
			}
		}
		
		/**
		 * 期間区分と日付に対応する年月を取得する
		 */
		protected MCDate getYm(PurcFrcst_Srch01_RsltR r) {
			// 月・旬の場合
			if (!MAC_PERIOD_TYP.isWEEKLY(r.pf_period_typ())) {
				return getAcYm(r.pf_period_st_dt());
			}
			
			// 週の場合
			MCDate dt = r.pf_period_st_dt();
			for (MCDate ym = up0().ym_fr().addMonth(-_backToMaxYm); ym.lte(up0().ym_to()); ym =ym.addMonth(1)) {
				MCDate stDt = getWeekYmStDt(ym);
				MCDate endDt = getWeekYmEndDt(ym);
				if (stDt.lte(dt) && endDt.gte(dt)) {
					return ym;
				}
			}
			return null;
		}
		protected void editData(Srch01_RsltR downR) {
			if (downR.weekly_flg()) {
				downR.trd_unit_pf_qty(downR.trd_unit_weekly_pf_qty());
				downR.trd_unit_po_qty(downR.trd_unit_weekly_po_qty());
				downR.base_unit_pf_qty(downR.base_unit_weekly_pf_qty());
				downR.base_unit_po_qty(downR.base_unit_weekly_po_qty());
			}
			else if (downR.tendays_flg()) {
				downR.trd_unit_pf_qty(downR.trd_unit_tendays_pf_qty());
				downR.trd_unit_po_qty(downR.trd_unit_monthly_po_qty());
				downR.base_unit_pf_qty(downR.base_unit_tendays_pf_qty());
				downR.base_unit_po_qty(downR.base_unit_monthly_po_qty());
			}
			else if (downR.monthly_flg()) {
				downR.trd_unit_pf_qty(downR.trd_unit_monthly_pf_qty());
				downR.trd_unit_po_qty(downR.trd_unit_monthly_po_qty());
				downR.base_unit_pf_qty(downR.base_unit_monthly_pf_qty());
				downR.base_unit_po_qty(downR.base_unit_monthly_po_qty());
			}
			if (downR.weekly_flg()) {
				downR.ym_st_dt(downR.week_ym_st_dt());
				downR.ym_end_dt(downR.week_ym_end_dt());
			}
			else {
				downR.ym_st_dt(downR.monthly_ym_st_dt());
				downR.ym_end_dt(downR.monthly_ym_end_dt());
			}
			if (!downR.cmpl_flg()) {
				downR.trd_unit_diff_qty(calcDiffQty(downR.trd_unit_pf_qty(), downR.trd_unit_bf_qty(), downR.trd_unit_po_qty()));
				downR.base_unit_diff_qty(calcDiffQty(downR.base_unit_pf_qty(), downR.base_unit_bf_qty(), downR.base_unit_po_qty()));
			}
			downR.trd_rate(calcTrdRate(downR.trd_unit_pf_qty(), downR.trd_unit_bf_qty(), downR.trd_unit_po_qty()));
		}
		
		protected MCNumber calcDiffQty(MCNumber pfQty, MCNumber bfQty, MCNumber poQty) {
			if (isNullAnd(pfQty, bfQty, poQty)) {
				return null;
			}
			pfQty = nvl(pfQty, MCNumber.ZERO);
			bfQty = nvl(bfQty, MCNumber.ZERO);
			poQty = nvl(poQty, MCNumber.ZERO);
			return poQty.subtract(pfQty).subtract(bfQty);
		}
		
		protected void removeNotTgt(MCList<Srch01_RsltR> downL){
			//引き取り率ＦＲＯＭ～ＴＯ、年月残あり条件の適用
			MCList<Srch01_RsltR> removeL = MCList.create(Srch01_RsltR.class);
			for (MCList<Srch01_RsltR> subL : downL.groupList(getPfKyeCol())) {
				// 検索期間内のデータ存在条件
				if (!dataExists(subL)) {
					removeL.addAll(subL);
					continue;
				}
				// 年月残ありの条件
				if (!applyPfBalCnd(subL, up0().bal_ym())) {
					removeL.addAll(subL);
					continue;
				}
				// 引き取り率の条件
				for (Srch01_RsltR downR : subL) {
					if (!applyTrdRateCnd(downR, up0().trd_rate_fr(), up0().trd_rate_to())) {
						removeL.add(downR);
					}
				}
			}
			downL.removeAll(removeL);
		}

		protected boolean isMonTgtTerm(Srch01_RsltR downR, MCDate dt) {
			return dt.gte(downR.monthly_ym_st_dt()) && dt.lte(downR.monthly_ym_end_dt());
		}
		protected boolean isWeekTgtTerm(Srch01_RsltR downR, MCDate dt) {
			return dt.gte(downR.week_ym_st_dt()) && dt.lte(downR.week_ym_end_dt());
		}
		
		/**
		 * 検索期間内に内示データか繰越データかが存在するか否か
		 * @return true:検索期間内に内示データまたは繰越データが存在する場合
		 */
		protected boolean dataExists(MCList<Srch01_RsltR> rsltL) {
			for (Srch01_RsltR rsltR : rsltL) {
				if (!isNullAnd(rsltR.upd_cntr(), rsltR.base_unit_monthly_pf_qty(), rsltR.base_unit_tendays_pf_qty(), rsltR.base_unit_weekly_pf_qty())) {
					return true;
				}
			}
			return false;
		}
		/**
		 * 引き取り率の判断
		 * @return true:検索条件に一致する場合
		 */
		protected boolean applyTrdRateCnd(Srch01_RsltR rsltR, MCNumber trdRateFr, MCNumber trdRateTo) {
			if (isNullAnd(trdRateFr, trdRateTo)) {
				return true;
			}
			MCNumber trdRate = rsltR.trd_rate();
			if (isNull(trdRate)) {
				return false;
			}
			if (!isNull(trdRateFr)) {
				if (trdRate.lt(trdRateFr)) {
					return false;
				}
			}
			if (!isNull(trdRateTo)) {
				if (trdRate.gt(trdRateTo)) {
					return false;
				}
			}
			return true;
		}

		/**
		 * 残有無の判断
		 * @return true:検索条件に一致する場合
		 */
		protected boolean applyPfBalCnd(MCList<Srch01_RsltR> rsltL, MCDate ym) {
			if (isNull(ym)) {
				return true;
			}
			for (Srch01_RsltR r : rsltL) {
				if (!ym.eq(r.ym())) {
					continue;
				}
				if (r.cmpl_flg()) {
					return false;
				}
				if (!isNull(r.trd_unit_diff_qty()) && r.trd_unit_diff_qty().isNegative()) {
					return true;
				}
			}
			return false;
		}

		/**
		 * 引き取り率計算
		 */
		protected MCNumber calcTrdRate(MCNumber pfQty, MCNumber bfQty, MCNumber poQty) {
			MCNumber commitQty = nvl(pfQty, MCNumber.ZERO).add(nvl(bfQty, MCNumber.ZERO));
			MCNumber poQty1 = nvl(poQty, MCNumber.ZERO);
			if (MCNumber.ZERO.lt(commitQty)) {
				return poQty1.multiply(100).divide(commitQty, RATE.scale(), MAC_RND_TYP.CUTOFF.toMC());
			}
			return null;
		}

		/**
		 * 取引単位数量へ換算する
		 */
		protected MCNumber convToTrdQty(MCNumber baseQty, Srch01_RsltR rsltR) {
			MCNumber rsltQty = baseQty;
			if (isNull(baseQty)) {
				rsltQty = MCNumber.ZERO;
			}
			if (isSame(rsltR.base_unit_cd(), rsltR.trd_unit_cd())) {
				return rsltQty;
			}
			MAVM_ITM_UNIT_R unitR = getItmUnit(rsltR);
			if (isNull(unitR)) {
				return rsltQty;
			}
			rsltQty = rvrsBaseUnitConv(baseQty,
					unitR.conv_base_qty(),
					unitR.conv_qty(),
					unitR.dec_place(),
					unitR.rnd_typ());
			if (isNull(rsltQty)) {
				return MCNumber.ZERO;
			}
			return rsltQty;
		}

		protected MAVM_ITM_UNIT_R getItmUnit(Srch01_RsltR r) {
			MAVM_ITM_UNIT_R unitR = _cacheItmUnit.get(
					r.itm_cd(),
					r.itm_sub1(),
					r.itm_sub2(),
					r.itm_sub3(),
					r.trd_unit_cd());
			if (isNull(unitR.itm_cd())) {
				return null;
			}
			return unitR;
		}

		protected void crtItmCache() {
			MCList<MAVM_ITM_UNIT_R> bindL = MCList.create(MAVM_ITM_UNIT_R.class);
			addAll(bindL, _pfBalL, createMap_MAVM_ITM_UNIT_R_Srch01_RsltR());
			addAll(bindL, _pfDtlL, createMap_MAVM_ITM_UNIT_R_PurcFrcst_Srch01_RsltR());
			MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder dbcItemUnitL_bldr = MCQueryApiBuilder.create(t);
			dbcItemUnitL_bldr.setSelect(t.itm_cd);
			dbcItemUnitL_bldr.addSelect(t.itm_sub1);
			dbcItemUnitL_bldr.addSelect(t.itm_sub2);
			dbcItemUnitL_bldr.addSelect(t.itm_sub3);
			dbcItemUnitL_bldr.addSelect(t.unit_cd);
			dbcItemUnitL_bldr.addSelect(t.conv_base_qty);
			dbcItemUnitL_bldr.addSelect(t.conv_qty);
			dbcItemUnitL_bldr.addSelect(t.dec_place);
			dbcItemUnitL_bldr.addSelect(t.rnd_typ);
			_cacheItmUnit = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbcItemUnitL_bldr, bindL,
					new String[] {
						MAVM_ITM_UNIT_R.$itm_cd,
						MAVM_ITM_UNIT_R.$itm_sub1,
						MAVM_ITM_UNIT_R.$itm_sub2,
						MAVM_ITM_UNIT_R.$itm_sub3,
						MAVM_ITM_UNIT_R.$unit_cd
					});
		}
		
		protected MCList<MCRow> _weekYmStEndDtL = null;
		
		protected void crtWeekYmStEndCache() {
			final String ymCol = "ym";
			final String periodTypCol = "period_typ";
			final String acClDayCol = "ac_cl_day";
			final String acClMonBaseCol = "ac_cl_mon_base";
			final String ymStDtCol = "ym_st_dt";
			final String ymEndDtCol = "ym_end_dt";
			MCList<MCRow> bindL = MCList.create(MCRow.class);
			bindL.addDateColumn(ymCol);
			bindL.addStringColumn(periodTypCol);
			bindL.addNumberColumn(acClDayCol);
			bindL.addNumberColumn(acClMonBaseCol);
			bindL.addDateColumn(ymStDtCol);
			bindL.addDateColumn(ymEndDtCol);
			for (MCDate ym = up0().ym_fr().addMonth(-_backToMaxYm); ym.lte(up0().ym_to()); ym =ym.addMonth(1)) {
				MCRow bind = bindL.createRow();
				bind.setDate(ymCol, ym);
				bind.setString(periodTypCol, MAC_PERIOD_TYP.WEEKLY.value());
				bind.setNumber(acClDayCol, getCo().ac_cl_day());
				bind.setNumber(acClMonBaseCol, getCo().ac_cl_mon_base());
				bindL.add(bind);
			}
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_DT$F_GET_YM_ST_DT_NE1", "01"),
					MABCFunction.getFunctionExecuter("MAPA_DT$F_GET_YM_ST_DT_NE1"),
					ymStDtCol, bindL,ymCol, periodTypCol, acClDayCol, acClMonBaseCol);
			
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_DT$F_GET_YM_END_DT_NE1", "01"),
					MABCFunction.getFunctionExecuter("MAPA_DT$F_GET_YM_END_DT_NE1"),
					ymEndDtCol, bindL,
					ymCol, periodTypCol, acClDayCol, acClMonBaseCol);
			
			_weekYmStEndDtL = bindL;
		}

		protected MCDate getWeekYmStDt(MCDate ym) {
			return getWeekYm(ym, "ym_st_dt");
		}

		protected MCDate getWeekYmEndDt(MCDate ym) {
			return getWeekYm(ym, "ym_end_dt");
		}
		
		protected MCDate getWeekYm(MCDate ym, String dtCol) {
			final String ymCol = "ym";
			MCRow row = _weekYmStEndDtL.getFirst(ymCol, ym);
			if (row != null) {
				return row.getDate(dtCol);
			}
			return null;
		}
		protected Map_PurcFrcst_Srch01_Cnd01R_Srch01_CndR<PurcFrcst_Srch01_Cnd01R,Srch01_CndR> createMap_PurcFrcst_Srch01_Cnd01R_Srch01_CndR() {
			return new Map_PurcFrcst_Srch01_Cnd01R_Srch01_CndR<PurcFrcst_Srch01_Cnd01R, Srch01_CndR>();
		}
		public class Map_PurcFrcst_Srch01_Cnd01R_Srch01_CndR<D extends PurcFrcst_Srch01_Cnd01R, S extends Srch01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$wg_cd, Srch01_CndR.$wg_cd);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$wg_nm, Srch01_CndR.$wg_nm);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_cd, Srch01_CndR.$sppl_cd);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_nm, Srch01_CndR.$sppl_nm);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$fix_period_flg, Srch01_CndR.$fix_period_flg);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_cd, Srch01_CndR.$itm_cd);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_sub1, Srch01_CndR.$itm_sub1);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_sub2, Srch01_CndR.$itm_sub2);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_sub3, Srch01_CndR.$itm_sub3);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_nm, Srch01_CndR.$itm_nm);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_typ, Srch01_CndR.$itm_typ);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_typ_d_cd, Srch01_CndR.$itm_typ_d_cd);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_typ_d_nm, Srch01_CndR.$itm_typ_d_nm);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_flg1, Srch01_CndR.$sppl_grp_flg1);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_cd1, Srch01_CndR.$sppl_grp_cd1);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_nm1, Srch01_CndR.$sppl_grp_nm1);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_flg2, Srch01_CndR.$sppl_grp_flg2);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_cd2, Srch01_CndR.$sppl_grp_cd2);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_nm2, Srch01_CndR.$sppl_grp_nm2);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_flg3, Srch01_CndR.$sppl_grp_flg3);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_cd3, Srch01_CndR.$sppl_grp_cd3);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_nm3, Srch01_CndR.$sppl_grp_nm3);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_flg4, Srch01_CndR.$sppl_grp_flg4);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_cd4, Srch01_CndR.$sppl_grp_cd4);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_nm4, Srch01_CndR.$sppl_grp_nm4);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_flg5, Srch01_CndR.$sppl_grp_flg5);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_cd5, Srch01_CndR.$sppl_grp_cd5);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_nm5, Srch01_CndR.$sppl_grp_nm5);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_flg6, Srch01_CndR.$sppl_grp_flg6);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_cd6, Srch01_CndR.$sppl_grp_cd6);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_nm6, Srch01_CndR.$sppl_grp_nm6);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_flg7, Srch01_CndR.$sppl_grp_flg7);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_cd7, Srch01_CndR.$sppl_grp_cd7);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_nm7, Srch01_CndR.$sppl_grp_nm7);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_flg8, Srch01_CndR.$sppl_grp_flg8);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_cd8, Srch01_CndR.$sppl_grp_cd8);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_nm8, Srch01_CndR.$sppl_grp_nm8);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_flg9, Srch01_CndR.$sppl_grp_flg9);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_cd9, Srch01_CndR.$sppl_grp_cd9);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_nm9, Srch01_CndR.$sppl_grp_nm9);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_flg10, Srch01_CndR.$sppl_grp_flg10);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_cd10, Srch01_CndR.$sppl_grp_cd10);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$sppl_grp_nm10, Srch01_CndR.$sppl_grp_nm10);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_flg1, Srch01_CndR.$itm_grp_flg1);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_cd1, Srch01_CndR.$itm_grp_cd1);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_nm1, Srch01_CndR.$itm_grp_nm1);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_flg2, Srch01_CndR.$itm_grp_flg2);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_cd2, Srch01_CndR.$itm_grp_cd2);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_nm2, Srch01_CndR.$itm_grp_nm2);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_flg3, Srch01_CndR.$itm_grp_flg3);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_cd3, Srch01_CndR.$itm_grp_cd3);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_nm3, Srch01_CndR.$itm_grp_nm3);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_flg4, Srch01_CndR.$itm_grp_flg4);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_cd4, Srch01_CndR.$itm_grp_cd4);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_nm4, Srch01_CndR.$itm_grp_nm4);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_flg5, Srch01_CndR.$itm_grp_flg5);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_cd5, Srch01_CndR.$itm_grp_cd5);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_nm5, Srch01_CndR.$itm_grp_nm5);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_flg6, Srch01_CndR.$itm_grp_flg6);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_cd6, Srch01_CndR.$itm_grp_cd6);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_nm6, Srch01_CndR.$itm_grp_nm6);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_flg7, Srch01_CndR.$itm_grp_flg7);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_cd7, Srch01_CndR.$itm_grp_cd7);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_nm7, Srch01_CndR.$itm_grp_nm7);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_flg8, Srch01_CndR.$itm_grp_flg8);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_cd8, Srch01_CndR.$itm_grp_cd8);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_nm8, Srch01_CndR.$itm_grp_nm8);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_flg9, Srch01_CndR.$itm_grp_flg9);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_cd9, Srch01_CndR.$itm_grp_cd9);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_nm9, Srch01_CndR.$itm_grp_nm9);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_flg10, Srch01_CndR.$itm_grp_flg10);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_cd10, Srch01_CndR.$itm_grp_cd10);
				addColumnPathMap(PurcFrcst_Srch01_Cnd01R.$itm_grp_nm10, Srch01_CndR.$itm_grp_nm10);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				if (!isNull(src.ym_fr())) {
					dest.ymd_fr(getYmStDt(src.ym_fr().addMonth(-_backToMaxYm)));
				}
				dest.ymd_to(getYmEndDt(src.ym_to()));
				dest.dac_flg(true);
				dest.subcon_flg_str(up0().getStringNE("subcon_flg_str"));
			}
		}

		protected Map_PurcFrcst_Srch02_CndR_PurcFrcst_Srch01_RsltR<PurcFrcst_Srch02_CndR,PurcFrcst_Srch01_RsltR> createMap_PurcFrcst_Srch02_CndR_PurcFrcst_Srch01_RsltR() {
			return new Map_PurcFrcst_Srch02_CndR_PurcFrcst_Srch01_RsltR<PurcFrcst_Srch02_CndR, PurcFrcst_Srch01_RsltR>();
		}
		public class Map_PurcFrcst_Srch02_CndR_PurcFrcst_Srch01_RsltR<D extends PurcFrcst_Srch02_CndR, S extends PurcFrcst_Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcFrcst_Srch02_CndR.$wg_cd, PurcFrcst_Srch01_RsltR.$wg_cd);
				addColumnPathMap(PurcFrcst_Srch02_CndR.$sppl_cd, PurcFrcst_Srch01_RsltR.$sppl_cd);
				addColumnPathMap(PurcFrcst_Srch02_CndR.$itm_cd, PurcFrcst_Srch01_RsltR.$itm_cd);
				addColumnPathMap(PurcFrcst_Srch02_CndR.$itm_sub1, PurcFrcst_Srch01_RsltR.$itm_sub1);
				addColumnPathMap(PurcFrcst_Srch02_CndR.$itm_sub2, PurcFrcst_Srch01_RsltR.$itm_sub2);
				addColumnPathMap(PurcFrcst_Srch02_CndR.$itm_sub3, PurcFrcst_Srch01_RsltR.$itm_sub3);
			}
		}
		protected Map_PurcFrcst_Srch01_Cnd02R_Srch01_RsltR<PurcFrcst_Srch01_Cnd02R,Srch01_RsltR> createMap_PurcFrcst_Srch01_Cnd02R_Srch01_RsltR() {
			return new Map_PurcFrcst_Srch01_Cnd02R_Srch01_RsltR<PurcFrcst_Srch01_Cnd02R, Srch01_RsltR>();
		}
		public class Map_PurcFrcst_Srch01_Cnd02R_Srch01_RsltR<D extends PurcFrcst_Srch01_Cnd02R, S extends Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcFrcst_Srch01_Cnd02R.$wg_cd, Srch01_RsltR.$wg_cd);
				addColumnPathMap(PurcFrcst_Srch01_Cnd02R.$sppl_cd, Srch01_RsltR.$sppl_cd);
				addColumnPathMap(PurcFrcst_Srch01_Cnd02R.$itm_cd, Srch01_RsltR.$itm_cd);
				addColumnPathMap(PurcFrcst_Srch01_Cnd02R.$itm_sub1, Srch01_RsltR.$itm_sub1);
				addColumnPathMap(PurcFrcst_Srch01_Cnd02R.$itm_sub2, Srch01_RsltR.$itm_sub2);
				addColumnPathMap(PurcFrcst_Srch01_Cnd02R.$itm_sub3, Srch01_RsltR.$itm_sub3);
			}
		}

		protected Map_MAVM_ITM_UNIT_R_Srch01_RsltR<MAVM_ITM_UNIT_R,Srch01_RsltR> createMap_MAVM_ITM_UNIT_R_Srch01_RsltR() {
			return new Map_MAVM_ITM_UNIT_R_Srch01_RsltR<MAVM_ITM_UNIT_R, Srch01_RsltR>();
		}
		public class Map_MAVM_ITM_UNIT_R_Srch01_RsltR<D extends MAVM_ITM_UNIT_R, S extends Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MAVM_ITM_UNIT_R.$itm_cd, Srch01_RsltR.$itm_cd);
				addColumnPathMap(MAVM_ITM_UNIT_R.$itm_sub1, Srch01_RsltR.$itm_sub1);
				addColumnPathMap(MAVM_ITM_UNIT_R.$itm_sub2, Srch01_RsltR.$itm_sub2);
				addColumnPathMap(MAVM_ITM_UNIT_R.$itm_sub3, Srch01_RsltR.$itm_sub3);
				addColumnPathMap(MAVM_ITM_UNIT_R.$unit_cd, Srch01_RsltR.$trd_unit_cd);
			}
		}

		protected Map_MAVM_ITM_UNIT_R_PurcFrcst_Srch01_RsltR<MAVM_ITM_UNIT_R,PurcFrcst_Srch01_RsltR> createMap_MAVM_ITM_UNIT_R_PurcFrcst_Srch01_RsltR() {
			return new Map_MAVM_ITM_UNIT_R_PurcFrcst_Srch01_RsltR<MAVM_ITM_UNIT_R, PurcFrcst_Srch01_RsltR>();
		}
		public class Map_MAVM_ITM_UNIT_R_PurcFrcst_Srch01_RsltR<D extends MAVM_ITM_UNIT_R, S extends PurcFrcst_Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MAVM_ITM_UNIT_R.$itm_cd, PurcFrcst_Srch01_RsltR.$itm_cd);
				addColumnPathMap(MAVM_ITM_UNIT_R.$itm_sub1, PurcFrcst_Srch01_RsltR.$itm_sub1);
				addColumnPathMap(MAVM_ITM_UNIT_R.$itm_sub2, PurcFrcst_Srch01_RsltR.$itm_sub2);
				addColumnPathMap(MAVM_ITM_UNIT_R.$itm_sub3, PurcFrcst_Srch01_RsltR.$itm_sub3);
				addColumnPathMap(MAVM_ITM_UNIT_R.$unit_cd, PurcFrcst_Srch01_RsltR.$trd_unit_cd);
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 更新前チェック<br>
	 */
	public class Chk01 extends MSBDL_PurcFrcstBalReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setGrpErrFlg(); 
			setErrToRtnStsTyp();
			setDown();
		}

		
		/**
		 * 処理単位内に1つでもerr_flgがオンの行があれば、その処理単位全体のerr_flgをオンにする
		 */
		protected void setGrpErrFlg() {
			String[] grpKeys = { Chk01_RsltR.$sppl_cd, Chk01_RsltR.$wg_cd, Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2,
					Chk01_RsltR.$itm_sub3 };
			setGrpErrFlgByKey(up0(), grpKeys, Chk01_RsltR.$err_flg);
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(checkWgDAC());
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (!hasErrFlgOn(up0())) {
				msgL.addAll(checkUpdCntr());
				msgL.addAll(chkDecPlace());
			}
			return msgL;
		}

		/**
		 * DACチェック
		 */
		protected MCMessageList checkWgDAC() {
			MCMessageList msgL = new MCMessageList();
			for (Chk01_RsltR chkR: up0()) {
				msgL.addAll(checkWritableWgCdDac(chkR, Chk01_RsltR.$wg_cd));
			}
			return msgL;
		}

		/**
		 * 更新カウンタチェック
		 */
		protected MCMessageList checkUpdCntr() {
			MCMessageList msgL = new MCMessageList();
			if (isNull(up0())) {
				return msgL;
			}
			insWk();
			MCList<MST_PURC_FRCST_BAL_R> dbcL = srch();
			String[] pkeys = new String[] {MST_PURC_FRCST_BAL_R.$ym,
					MST_PURC_FRCST_BAL_R.$sppl_cd,
					MST_PURC_FRCST_BAL_R.$wg_cd,
					MST_PURC_FRCST_BAL_R.$itm_cd,
					MST_PURC_FRCST_BAL_R.$itm_sub1,
					MST_PURC_FRCST_BAL_R.$itm_sub2,
					MST_PURC_FRCST_BAL_R.$itm_sub3};
			MCIndexKey idxKey = dbcL.createIndex(pkeys);
			for (Chk01_RsltR upR: up0()) {
				MST_PURC_FRCST_BAL_R dbcR = dbcL.getFirst(idxKey, getVals(pkeys, upR));
				if (!isNull(dbcR)) {
					upR.setStatus(MCRow.Status.MODIFY);
					msgL.addAll(checkUpdCntrNE(upR, PurcFrcst_Chk01_HdrR.$upd_cntr, dbcR));
				}
				else {
					upR.setStatus(MCRow.Status.CREATE);
				}
			}
			return msgL;
		}

		/**
		 * 小数有効桁数チェック
		 */
		protected MCMessageList chkDecPlace() {
			MCMessageList msgL = new MCMessageList();
			if (isNull(up0())) {
				return msgL;
			}
			for (Chk01_RsltR r: up0()) {
				if (!isNull(r.trd_unit_bf_qty())) {
					if (isSame(r.trd_unit_cd(), r.base_unit_cd())) {
						r.base_unit_bf_qty(r.trd_unit_bf_qty());
						r.trd_unit_dec_place(r.base_unit_dec_place());
					}
					else {
						r.base_unit_bf_qty(convToBaseUnit(r.trd_unit_bf_qty(),
							r.trd_unit_conv_base_qty(),
							r.trd_unit_conv_qty(),
							r.base_unit_dec_place(),
							r.base_unit_rnd_typ()));
					}
					msgL.addAll(checkDecPlace(r, Chk01_RsltR.$trd_unit_dec_place, Chk01_RsltR.$trd_unit_bf_qty));
				}
			}
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * ワークテーブル登録
		 */
		protected void insWk() {
			MCList<MST_PURC_FRCST_BAL_R> dbcL = MCList.create(MST_PURC_FRCST_BAL_R.class);
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_PURC_FRCST_BAL_R.create("T"));
			addAll(dbcL, up0(), createMap_MST_PURC_FRCST_BAL_R_Chk01_RsltR());
			dbWkDelete("MSBDL0020_MSW_PURC_FRCST_BAL_D01", dbcL_bldr.getBaseDbc());
			dbWkInsert("MSBDL0020_MSW_PURC_FRCST_BAL_I01", dbcL, dbcL_bldr.getBaseDbc());
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 取消前チェック<br>
	 */
	public class Chk02 extends MSBDL_PurcFrcstBalReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			setGrpErrFlg();
			setErrToRtnStsTyp();
			setDown();
		}

		/**
		 * 処理単位内に1つでもerr_flgがオンの行があれば、その処理単位全体のerr_flgをオンにする
		 */
		protected void setGrpErrFlg() {
			String[] grpKeys = { Chk02_RsltR.$sppl_cd, Chk02_RsltR.$wg_cd, Chk02_RsltR.$itm_cd, Chk02_RsltR.$itm_sub1, Chk02_RsltR.$itm_sub2,
					Chk02_RsltR.$itm_sub3 };
			setGrpErrFlgByKey(up0(), grpKeys, Chk01_RsltR.$err_flg);
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(checkWgDAC());
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (!hasErrFlgOn(up0())) {
				msgL.addAll(checkUpdCntr());
			}
			return msgL;
		}

		/**
		 * DACチェック
		 */
		protected MCMessageList checkWgDAC() {
			MCMessageList msgL = new MCMessageList();
			for (Chk02_RsltR chkR: up0()) {
				msgL.addAll(checkWritableWgCdDac(chkR, Chk02_RsltR.$wg_cd));
			}
			return msgL;
		}

		/**
		 * 更新カウンタチェック
		 */
		protected MCMessageList checkUpdCntr() {
			MCMessageList msgL = new MCMessageList();
			if (isNull(up0())) {
				return msgL;
			}
			insWk();
			MCList<MST_PURC_FRCST_BAL_R> dbcL = srch();
			String[] pkeys = new String[] {MST_PURC_FRCST_BAL_R.$ym,
					MST_PURC_FRCST_BAL_R.$sppl_cd,
					MST_PURC_FRCST_BAL_R.$wg_cd,
					MST_PURC_FRCST_BAL_R.$itm_cd,
					MST_PURC_FRCST_BAL_R.$itm_sub1,
					MST_PURC_FRCST_BAL_R.$itm_sub2,
					MST_PURC_FRCST_BAL_R.$itm_sub3};
			MCIndexKey idxKey = dbcL.createIndex(pkeys);
			for (Chk02_RsltR upR: up0()) {
				MST_PURC_FRCST_BAL_R dbcR = dbcL.getFirst(idxKey, getVals(pkeys, upR));
				if (!isNull(dbcR)) {
					msgL.addAll(checkUpdCntrNE(upR, PurcFrcst_Chk01_HdrR.$upd_cntr, dbcR));
				}
			}
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * ワークテーブル登録
		 */
		protected void insWk() {
			MCList<MST_PURC_FRCST_BAL_R> dbcL = MCList.create(MST_PURC_FRCST_BAL_R.class);
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_PURC_FRCST_BAL_R.create("T"));
			addAll(dbcL, up0(), createMap_MST_PURC_FRCST_BAL_R_Chk02_RsltR());
			dbWkDelete("MSBDL0020_MSW_PURC_FRCST_BAL_D02", dbcL_bldr.getBaseDbc());
			dbWkInsert("MSBDL0020_MSW_PURC_FRCST_BAL_I02", dbcL, dbcL_bldr.getBaseDbc());
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 購買内示残情報を登録＆更新する<br>
	 */
	public class Upd01 extends MSBDL_PurcFrcstBalReg_MC_A.Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0(), Chk01_RsltR.$err_flg, Chk01_RsltR.$rtn_sts_typ);
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
			callThisChk01();
			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				updPfBal(notErrL);
			}
		}

		/**
		 * 前処理
		 */
		protected void editUp(){
			setPegNo(up0());
		}

		/**
		 * 更新前チェック
		 */
		protected void callThisChk01() {
			MSBDL_PurcFrcstBalReg.Chk01 ope = MSBDL_PurcFrcstBalReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 購買内示残更新
		 */
		protected void updPfBal(MCList<Chk01_RsltR> notErrL) {
			MCList<MST_PURC_FRCST_BAL_R> insL = MCList.create(MST_PURC_FRCST_BAL_R.class);
			addAll(insL, notErrL.subList(MCRow.Status.CREATE), createMap_MST_PURC_FRCST_BAL_R_Chk01_RsltR());
			MCList<MST_PURC_FRCST_BAL_R> updL = MCList.create(MST_PURC_FRCST_BAL_R.class);
			addAll(updL, notErrL.subList(MCRow.Status.MODIFY), createMap_MST_PURC_FRCST_BAL_R_Chk01_RsltR());
			if (!isNull(insL)) {
				dbInsertEx("MSBDL0020_MST_PURC_FRCST_BAL_I01", insL,
						MCQueryApiBuilder.create(MST_PURC_FRCST_BAL_R.create("T")));
			}
			if (!isNull(updL)) {
				dbUpdateKey("MSBDL0020_MST_PURC_FRCST_BAL_U01", updL,
						MCQueryApiBuilder.create(MST_PURC_FRCST_BAL_R.create("T")));
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@SuppressWarnings("unchecked")
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();

			List<MCList<Chk01_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = ((MCList<Chk01_RsltR>)ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 発注先、ワーキンググループ、品目単位で電文を分割する
		 */
		protected List<MCList<Chk01_RsltR>> splitUp(MCList<Chk01_RsltR> list, int max) {
			List<MCList<Chk01_RsltR>> ret = new ArrayList<>();

			MCList<Chk01_RsltR>[] grpL = list.groupList(
					Chk01_RsltR.$sppl_cd,
					Chk01_RsltR.$wg_cd, 
					Chk01_RsltR.$itm_cd, 
					Chk01_RsltR.$itm_sub1,
					Chk01_RsltR.$itm_sub2, 
					Chk01_RsltR.$itm_sub3);
			MCList<Chk01_RsltR> tmp = MCList.create(Chk01_RsltR.class);
			for (MCList<Chk01_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk01_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 購買内示残情報を取消する。<br>
	 */
	public class Del01 extends MSBDL_PurcFrcstBalReg_MC_A.Del01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0(), Chk02_RsltR.$err_flg, Chk02_RsltR.$rtn_sts_typ);
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
			if (notErrL.size() != 0) {
				delPfBal(notErrL);
			}
		}

		/**
		 * 前処理
		 */
		protected void editUp(){
			setPegNo(up0());
		}

		/**
		 * 更新前チェック
		 */
		protected void callThisChk02() {
			MSBDL_PurcFrcstBalReg.Chk02 ope = MSBDL_PurcFrcstBalReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 購買内示残削除
		 */
		protected void delPfBal(MCList<Chk02_RsltR> notErrL) {
			MCList<MST_PURC_FRCST_BAL_R> delL = MCList.create(MST_PURC_FRCST_BAL_R.class);
			addAll(delL, notErrL, createMap_MST_PURC_FRCST_BAL_R_Chk02_RsltR());
			dbDeleteKey("MSBDL0020_MST_PURC_FRCST_BAL_D01", delL,
					MCQueryApiBuilder.create(MST_PURC_FRCST_BAL_R.create("T")));
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@SuppressWarnings("unchecked")
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();

			List<MCList<Chk02_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk02_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk02_RsltR> up0L = ((MCList<Chk02_RsltR>)ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 発注先、ワーキンググループ、品目単位で電文を分割する
		 */
		protected List<MCList<Chk02_RsltR>> splitUp(MCList<Chk02_RsltR> list, int max) {
			List<MCList<Chk02_RsltR>> ret = new ArrayList<>();

			MCList<Chk02_RsltR>[] grpL = list.groupList(Chk02_RsltR.$sppl_cd,
					Chk02_RsltR.$wg_cd,
					Chk02_RsltR.$itm_cd,
					Chk02_RsltR.$itm_sub1,
					Chk02_RsltR.$itm_sub2,
					Chk02_RsltR.$itm_sub3);
			MCList<Chk02_RsltR> tmp = MCList.create(Chk02_RsltR.class);
			for (MCList<Chk02_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk02_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}
	}

	/**
	 * 更新（削除）データ検索
	 */
	protected MCList<MST_PURC_FRCST_BAL_R> srch() {
		MCList<MST_PURC_FRCST_BAL_R> dbcL = MCList.create(MST_PURC_FRCST_BAL_R.class);
		MST_PURC_FRCST_BAL_R t = MST_PURC_FRCST_BAL_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		MSW_PURC_FRCST_BAL_KEY_R wk = MSW_PURC_FRCST_BAL_KEY_R.create("WK");
		dbcL_bldr.setSelect(t.ym);
		dbcL_bldr.addSelect(t.sppl_cd);
		dbcL_bldr.addSelect(t.wg_cd);
		dbcL_bldr.addSelect(t.itm_cd);
		dbcL_bldr.addSelect(t.itm_sub1);
		dbcL_bldr.addSelect(t.itm_sub2);
		dbcL_bldr.addSelect(t.itm_sub3);
		dbcL_bldr.addSelect(t.upd_cntr);
		dbcL_bldr.addInnerJoin(wk,
				bracket(wk.ym.eq(t.ym)
						.and(wk.sppl_cd.eq(t.sppl_cd))
						.and(wk.wg_cd.eq(t.wg_cd))
						.and(wk.itm_cd.eq(t.itm_cd))
						.and(wk.itm_sub1.eq(t.itm_sub1))
						.and(wk.itm_sub2.eq(t.itm_sub2))
						.and(wk.itm_sub3.eq(t.itm_sub3))));
		dbcL_bldr.setOrderByAsc(dbcL_bldr.getBaseDbc().getKeyColumn$());
		dbSelectForUpdateNoWait("MSBDL0020_MST_PURC_FRCST_BAL_S01", dbcL, dbcL_bldr);
		return dbcL;
	}

	protected Map_MST_PURC_FRCST_BAL_R_Chk01_RsltR<MST_PURC_FRCST_BAL_R,Chk01_RsltR> createMap_MST_PURC_FRCST_BAL_R_Chk01_RsltR() {
		return new Map_MST_PURC_FRCST_BAL_R_Chk01_RsltR<MST_PURC_FRCST_BAL_R, Chk01_RsltR>();
	}
	public class Map_MST_PURC_FRCST_BAL_R_Chk01_RsltR<D extends MST_PURC_FRCST_BAL_R, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$ym, Chk01_RsltR.$ym);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$sppl_cd, Chk01_RsltR.$sppl_cd);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$wg_cd, Chk01_RsltR.$wg_cd);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$itm_cd, Chk01_RsltR.$itm_cd);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$itm_sub1, Chk01_RsltR.$itm_sub1);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$itm_sub2, Chk01_RsltR.$itm_sub2);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$itm_sub3, Chk01_RsltR.$itm_sub3);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$trd_unit_cd, Chk01_RsltR.$trd_unit_cd);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$trd_unit_qty, Chk01_RsltR.$trd_unit_bf_qty);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$base_unit_cd, Chk01_RsltR.$base_unit_cd);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$base_unit_qty, Chk01_RsltR.$base_unit_bf_qty);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$cmpl_flg, Chk01_RsltR.$cmpl_flg);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$intr_rmrks, Chk01_RsltR.$intr_rmrks);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$sub_char1, Chk01_RsltR.$sub_char1);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$sub_char2, Chk01_RsltR.$sub_char2);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$sub_char3, Chk01_RsltR.$sub_char3);
		}
	}

	protected Map_MST_PURC_FRCST_BAL_R_Chk02_RsltR<MST_PURC_FRCST_BAL_R,Chk02_RsltR> createMap_MST_PURC_FRCST_BAL_R_Chk02_RsltR() {
		return new Map_MST_PURC_FRCST_BAL_R_Chk02_RsltR<MST_PURC_FRCST_BAL_R, Chk02_RsltR>();
	}
	public class Map_MST_PURC_FRCST_BAL_R_Chk02_RsltR<D extends MST_PURC_FRCST_BAL_R, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$ym, Chk02_RsltR.$ym);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$sppl_cd, Chk02_RsltR.$sppl_cd);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$wg_cd, Chk02_RsltR.$wg_cd);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$itm_cd, Chk02_RsltR.$itm_cd);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$itm_sub1, Chk02_RsltR.$itm_sub1);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$itm_sub2, Chk02_RsltR.$itm_sub2);
			addColumnPathMap(MST_PURC_FRCST_BAL_R.$itm_sub3, Chk02_RsltR.$itm_sub3);
		}
	}

	protected Comparable[] getVals(String[] keys, MCRow cndR) {
		Comparable[] vals = new Comparable[keys.length];
		for (int i = 0; i < vals.length; i++) {
			vals[i] = cndR.getValueNE(keys[i]);
		}
		return vals;
	}

	protected boolean isNullOrZero(MCNumber num) {
		if (isNull(num)) {
			return true;
		}
		if (MCNumber.ZERO.eq(num)) {
			return true;
		}
		return false;
	}

	protected <R extends MCRow> void handleSuccess(MCList<R> l, String errFlgCol, String rtnStsTypCol) {
		dbTran().commit();
		for (MCRow r : l) {
			if (!r.getBooleanNE(errFlgCol)) {
				r.setString(rtnStsTypCol, MAC_RTN_STS_TYP.OK.value());
			}
		}
	}

	protected <R extends MCRow> void handleEx(Exception e, MCList<R> l) {
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
			r.setString(Chk01_RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value());
		}
	}

	//FMCB CUSTOM END
}