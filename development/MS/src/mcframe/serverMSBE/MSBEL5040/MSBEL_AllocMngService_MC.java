package mcframe.serverMSBE.MSBEL5040;

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
import mcframe.serverMSBE.MSBEL5040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBF.MSBFL5200.*;

import static mcframe.serverMSBE.MSBEL5040.Query.*;
import static mcframe.commonCore.notice.Core_Msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;

import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverCore.requester.MCServerThreadManager;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverMS.dbc.MSFunction.*;
import mcframe.serverCore.sys.MCSys;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_AllocMngService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_AllocMngService_MC extends MSBEL_AllocMngService_MC_A{
	//FMCB CUSTOM START

	/**
	 * 本クラス
	 */
	protected static final Class<MSBEL_AllocMngService> CLAZZ = MSBEL_AllocMngService.class;

	/**
	 * Alloc_Lock_Upd01オペレーション.<p>
	 *
	 * 引当処理の前にロックを取得する<br>
	 */
	public class Alloc_Lock_Upd01 extends MSBEL_AllocMngService_MC_A.Alloc_Lock_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			lock();
		}
		protected void editUp() {
			for (MSW_ALLOC_LOC_MAP_R r: up0()) {
				editUpSub(r);
			}
		}
		/**
		 * ロック
		 */
		protected void lock() {
			// ロック対象の作成
			MSW_ALLOC_LOC_MAP_R S1 = MSW_ALLOC_LOC_MAP_R.create();
			execDbWkDelete("MSBEL5040_MSW_ALLOC_LOC_MAP_D01", S1);
			dbInsert("MSBEL5040_MSW_ALLOC_LOC_MAP_I01", up0(), MCQueryApiBuilder.create(MSW_ALLOC_LOC_MAP_R.create("T")));

			MSW_ALLOC_LOCK_R S2 = MSW_ALLOC_LOCK_R.create();
			execDbWkDelete("MSBEL5040_MSW_ALLOC_LOCK_D01", S2);
			executeUpdate(MSBEL5040_MSW_ALLOC_LOCK_I01());
			int cnt = dbTran().getLastUpdateCnt();

			// ロック処理
			// ロック対象を全件ロックできるまで処理を続ける
			while (!isSame(cnt, getAllocLockCnt())) {
				try {
					executeUpdate(MSBEL5040_MST_ALLOC_LOCK_I01());
				}
				catch (MCException e) {
					// 一意制約エラーは何もしない
					if (!isSame(e.getID(), FCBCC0136)) {
						throw e;
					}
				}
			}
			// ロック用SQL
			MSW_ALLOC_LOCK_R w = MSW_ALLOC_LOCK_R.create("W");
			MST_ALLOC_LOCK_R t = MST_ALLOC_LOCK_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addInnerJoin(w,
					bracket(t.itm_cd.eq(w.itm_cd)
							.and(t.itm_sub1.eq(w.itm_sub1))
							.and(t.itm_sub2.eq(w.itm_sub2))
							.and(t.itm_sub3.eq(w.itm_sub3))
							.and(t.loc_cd.eq(w.loc_cd))));
			dbc_bldr.setOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdateNoFetch("MSBEL5040_MST_ALLOC_LOCK_S01", dbc_bldr);
		}
	}
	
	protected int getAllocLockCnt() {
		MST_ALLOC_LOCK_R t2 = MST_ALLOC_LOCK_R.create("T");
		MCQueryApiBuilder dbc_bldr2 = MCQueryApiBuilder.create(t2);
		MSW_ALLOC_LOCK_R w2 = MSW_ALLOC_LOCK_R.create("W");
		dbc_bldr2.setSelect(count(value(1)).as("cnt"));
		dbc_bldr2.addInnerJoin(w2,
				bracket(t2.itm_cd.eq(w2.itm_cd)
						.and(t2.itm_sub1.eq(w2.itm_sub1))
						.and(t2.itm_sub2.eq(w2.itm_sub2))
						.and(t2.itm_sub3.eq(w2.itm_sub3))
						.and(t2.loc_cd.eq(w2.loc_cd))));

		MCRow result = MCRow.create();
		result.addNumberColumn("cnt");
		dbc_bldr2.buildSelect("MSBEL5040_MST_ALLOC_LOCK_S02").executeQuery(result);
		return result.getNumberNE("cnt").intValue();
	}

	protected void editUpSub(MCRow r) {

		if (isNull(r.getStringNE("inpt_loc_cd"))) {
			r.setStringNE("inpt_str_ln_cd", null);
			if (isNull(r.getStringNE("gi_loc_cd"))) {
				r.setStringNE("gi_str_ln_cd", null);
				r.setStringNE("gi_stk_arrv_bp_cd", null);
			}
			else {
				r.setStringNE("alloc_grp_cd", null);
				r.setStringNE("gi_lg_grp_cd", null);
			}
		}
		else {
			r.setStringNE("dlv_lg_grp_cd", null);
			r.setStringNE("alloc_grp_cd", null);
			r.setStringNE("gi_lg_grp_cd", null);
			r.setStringNE("gi_loc_cd", null);
			r.setStringNE("gi_str_ln_cd", null);
			r.setStringNE("gi_stk_arrv_bp_cd", null);
		}
	}

	/**
	 * 場所引当（ロット有り）<br>
	 * procTypとして使用する
	 */
	protected String _allocLot = "1";
	/**
	 * 場所引当（ロット無し）<br>
	 * procTypとして使用する
	 */
	protected String _allocNoLot = "2";
	/**
	 * 場所引当後の物流Ｇごとの使用可能在庫計算（ロット有り）<br>
	 * procTypとして使用する
	 */
	protected String _allocLgLot = "3";
	/**
	 * 場所引当後の物流Ｇごとの使用可能在庫計算（ロット無し）<br>
	 * procTypとして使用する
	 */
	protected String _allocLgNoLot = "4";
	/**
	 * 総量引当（ロット無し）<br>
	 * procTypとして使用する
	 */
	protected String _allocGrs = "5";
	/**
	 * ロット提案（場所）<br>
	 * procTypとして使用する
	 */
	protected String _propLoc = "6";
	/**
	 * ロット提案（総量）<br>
	 * procTypとして使用する
	 */
	protected String _propGrs = "7";
	/**
	 * 総量引当（ロット有り）<br>
	 * procTypとして使用する
	 */
	protected String _allocGrsLot = "8";
	/**
	 * 使用可能在庫計算の場合true<br>
	 * procTypが1または2または3または4または5または8の場合
	 */
	protected boolean isAvl(String procTyp) {
		if (isSame(procTyp, _allocLot) || isSame(procTyp, _allocNoLot)
				|| isSame(procTyp, _allocLgLot) || isSame(procTyp, _allocLgNoLot)
				|| isSame(procTyp, _allocGrs) || isSame(procTyp, _allocGrsLot)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	protected String _autotest = null;
	
	protected String _lotPropTyp = null;
	
	protected boolean _lot_chk_off_flg = false;
	
	protected String _stkAllocFlg = "stkAllocFlg";

	/**
	 * Alloc_Srch01オペレーション.<p>
	 *
	 * 指定された品目について在庫や入庫予定を提案する<br>
	 */
	public class Alloc_Srch01 extends MSBEL_AllocMngService_MC_A.Alloc_Srch01 {

		public void setLotChkFlg(boolean lot_chk_off_flg) {
			object(CLAZZ)._lot_chk_off_flg = lot_chk_off_flg;
		}

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 引当可能日数チェックの呼び出し
			execAvlChk01Sv();
			if (up1().isEmpty()) {
				return;
			}

			// 上り電文の編集
			editUp();

			// 場所関係リストを取得する
			initLocMapCache(up0(), up1());

			// 品目マスタを取得する
			initMamItmCache(up1());

			getLotBackStopTyp();

			//ワークテーブルを作成する
			crtLocWk();
			crtItmWk();

			// 使用可能在庫検索サービスの呼び出し
			MSBEL_AllocMngService.Alloc_Avl_Srch01 avl01Sv = MSBEL_AllocMngService.crtAlloc_Avl_Srch01();
			execAvl01Sv(avl01Sv);

			editPackAllocFlg(avl01Sv.down0());

			// ロット提案算出サービスの呼び出し
			MSBEL_AllocMngService.Alloc_Srch02 srch02Sv = MSBEL_AllocMngService.crtAlloc_Srch02();
			execSrch02Sv(srch02Sv, avl01Sv);

			// ロット提案算出サービス（総量引当）の呼び出し
			MSBEL_AllocMngService.Alloc_Srch03 srch03Sv = MSBEL_AllocMngService.crtAlloc_Srch03();
			execSrch03Sv(srch03Sv, srch02Sv, avl01Sv);

			// 下り電文の設定
			setDown(srch03Sv, srch02Sv, avl01Sv);

			// 下り電文に名称を設定する
			setNm();
		}

		protected MCList<Srch_TgtR> _priAllocTgtL = MCList.create(Srch_TgtR.class);			// 上り電文のうち優先して引き当てるリスト
		protected MCList<Srch_TgtR> _locTgtL = MCList.create(Srch_TgtR.class);				// 上り電文のうち場所引当対象のリスト
		protected MCList<Srch_TgtR> _grsTgtL = MCList.create(Srch_TgtR.class);				// 上り電文のうち総量引当対象のリスト　※引当対象外の場合は_getQueryで抽出対象外のため、標準ではこのリストにRowが追加されません。

		/**
		 * ロット逆転禁止区分を設定する。
		 */
		protected void getLotBackStopTyp() {
			
			MCList<Srch_TgtR> tgtL = up1().subList(r -> !isNull(r.cst_cd()));
			
			if (!isNull(tgtL)) {
				MCList<MAM_BP_R> dbcL = MCList.create(MAM_BP_R.class);
				
				MAM_BP_R m1 = MAM_BP_R.create("M1");
				
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(m1);
				bldr.setSelect(m1.bp_cd, m1.lot_back_stop_typ);
				bldr.setWhere(m1.bp_cd.eq(bind("cst_cd")));
				dbSelect("MSBEL5040_MAM_BP_S01", dbcL, bldr, tgtL);
				
				MCIndexKey Idx = dbcL.createIndex(MAM_BP_R.$bp_cd);
				for (Srch_TgtR tgtR : tgtL) {
					MAM_BP_R dbcR = dbcL.getFirst(Idx, tgtR.cst_cd());
					if (!isNull(dbcR)) {
						tgtR.lot_back_stop_typ(dbcR.lot_back_stop_typ());
					}
				}
			}
		}

		protected void editUp() {
			if (isNull(up0().short_ope_typ())) up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
			if (isNull(up0().lot_prop_typ())) up0().lot_prop_typ(MSC_LOT_PROP_TYP.LOT.value());
			if (!MSC_LOT_PROP_TYP.isLOT(up0().lot_prop_typ())) {
				up0().stk_flg(false);
				up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
			}

			_lotPropTyp = up0().lot_prop_typ();

			selectItmL(up1());
			selectItmUnitL(up1());

			int i = 1;
			int j = 1;
			int k = 1;
			boolean minusStkChkFlg = up0().getBooleanNE("minus_stk_chk_flg");
			
			if (minusStkChkFlg) {
				selectGiLocL(up1());
			}
			
			boolean mfgAllocNotLotFixFlg = isSame(getSysParm("MFG_ALLOC_NOT_LOT_FIX_FLG"), "1");
			boolean sloAllocNotLotFixFlg = isSame(getSysParm("SLO_ALLOC_NOT_LOT_FIX_FLG"), "1");

			for (Srch_TgtR r: up1()) {
				if (isSame(r.base_unit_qty(), MCNumber.ZERO)) {
					continue;
				}
				// 品目マスタから補完
				MAM_ITM_R itm = _itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (isNull(r.ship_term_cd())) r.ship_term_cd(nvl(itm.ship_term_cd(), MAC_STR.NULL_VAL.value()));
				r.pack_alloc_flg(itm.pack_alloc_flg());
				r.cont_fctr_flg(itm.cont_fctr_flg());
				r.chk_cont_fctr_flg(itm.cont_fctr_flg());
				r.std_cont_fctr(itm.std_cont_fctr());
				r.cont_fctr_rnd_typ(itm.cont_fctr_rnd_typ());
				r.cont_fctr_dec_place(itm.cont_fctr_dec_place());
				if (isNull(r.base_unit_cd())) r.base_unit_cd(itm.unit_cd());
				r.base_unit_dec_place(itm.dec_place());
				r.base_unit_rnd_typ(itm.rnd_typ());
				r.asset_mng_typ(itm.asset_mng_typ());
				r.lot_mng_typ(itm.lot_mng_typ());
				r.sublot_mng_typ(itm.sublot_mng_typ());
				
				if (minusStkChkFlg && (r.stk_alloc_flg() || !itm.minus_stk_flg())) {
					MAM_LOC_R giLocR = _giLocCache.get(r.gi_loc_cd());
					if (!giLocR.gi_pack_xfer_flg()) {
						r.pack_alloc_flg(true);
					}
					else {
						r.pack_alloc_flg(false);
					}
				}
				if (r.pack_alloc_flg()) {
					// 荷姿引当ＦＬＧがオンだが、荷姿単位ＣＤ、荷姿単位数量が設定されていないときは基準単位と見なす
					if (isNull(r.pack_unit_cd()) || MSC_LOT_PROP_TYP.isLOT(up0().lot_prop_typ()) && isNull(r.pack_unit_qty())) {
						r.pack_unit_cd(r.base_unit_cd());
						r.pack_unit_qty(r.base_unit_qty());
						r.conv_base_qty(MCNumber.ONE);
						r.conv_qty(MCNumber.ONE);
						r.pack_unit_dec_place(r.base_unit_dec_place());
						r.pack_unit_rnd_typ(r.base_unit_rnd_typ());
					}
					// 品目単位マスタから補完
					else {
						MAVM_ITM_UNIT_R itmUnit = _itmUnitCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.pack_unit_cd());
						r.conv_base_qty(itmUnit.conv_base_qty());
						r.conv_qty(itmUnit.conv_qty());
						r.pack_unit_dec_place(itmUnit.dec_place());
						r.pack_unit_rnd_typ(itmUnit.rnd_typ());
					}
				}
				// 手配ＮＯ管理区分が「管理する（任意：在庫対象外）」の場合は手配ＮＯをnull文字に変換
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno1_mng_typ())) {
					r.sno1(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno2_mng_typ())) {
					r.sno2(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno3_mng_typ())) {
					r.sno3(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno4_mng_typ())) {
					r.sno4(MAC_STR.NULL_VAL.value());
				}
				// 引当範囲の整理
				editUpSub(r);
				// 投入予定日を優先
				if (!isNull(r.inpt_schd_dt())) {
					// 時分が設定されるかもしれないので日で切り捨てる
					r.inpt_schd_dt(r.inpt_schd_dt().trunc(MCDateFieldType.DAY));
					r.gi_schd_dt(null);
					r.gr_schd_dt(null);
				}
				// 出庫予定日を優先
				if (!isNull(r.gi_schd_dt())) {
					// 時分が設定されるかもしれないので日で切り捨てる
					r.gi_schd_dt(r.gi_schd_dt().trunc(MCDateFieldType.DAY));
				}
				if (!isNull(r.gr_schd_dt())) {
					// 時分が設定されるかもしれないので日で切り捨てる
					r.gr_schd_dt(r.gr_schd_dt().trunc(MCDateFieldType.DAY));
				}
				// 代替関連項目が設定されていない場合は代替ＦＬＧをオフと見なす
				if (r.alt_flg() && isNullOr(r.alt_flg(), r.alt_grp_cd(), r.alt_grp_seq(),
						r.oper_inst_no(),// r.alt_qty(),
						r.alt_itm_typ(), r.alt_alloc_prio())) {
					r.alt_flg(false);
				}
				// 総量引当の場合はロット指定なしとする
				if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(r.alloc_scope_typ())) {
					r.not_lot_fix_flg(true);
					r.stk_alloc_flg(false);

					// 総量引当場所グループが設定されている場合は総量引当指定検索ＦＬＧをオンにする
					if (!isNull(r.alloc_grp_cd())) {
						r.alloc_grp_srch_flg(true);
					}
				}
				else {
					// 引当範囲区分の指定が無い場合は場所引当と見なす
					r.alloc_scope_typ(MAC_ALLOC_SCOPE_TYP.LOC.value());
				}
				// ロット管理しない品目は全ロットを提案対象とする
				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
					r.lot_no(null);
					r.not_lot_mix_flg(false);
				}
				// ロット管理する品目でロットにＮＵＬＬ文字が指定されたら指定なしとする
				else if (MAC_STR.isNULL_VAL(r.lot_no())) {
					r.lot_no(null);
				}
				// サブロット管理しない品目は全サブロットを提案対象とする
				if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
					r.sublot_no(null);
					r.not_sublot_mix_flg(false);
				}
				// ロット管理する品目でロットにＮＵＬＬ文字が指定されたら指定なしとする
				else if (MAC_STR.isNULL_VAL(r.sublot_no())) {
					r.sublot_no(null);
				}
				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())
						&& MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
					r.not_lot_fix_flg(true);
				}
				else if (isLotFix(r, mfgAllocNotLotFixFlg, sloAllocNotLotFixFlg)) {
					r.not_lot_fix_flg(false);
				}
				// ロット指定なしＦＬＧがオンのときはロットＮＯ、サブロットＮＯは指定なし、混在チェックをしない
				if (r.not_lot_fix_flg()) {
					r.lot_no(null);
					r.sublot_no(null);
				}
				if (!minusStkChkFlg) {
					// 棚・ラインにＮＵＬＬ文字が指定されたら指定なしとする
					if (MAC_STR.isNULL_VAL(r.inpt_str_ln_cd())) {
						r.inpt_str_ln_cd(null);
					}
					if (MAC_STR.isNULL_VAL(r.gi_str_ln_cd())) {
						r.gi_str_ln_cd(null);
					}
				}
				// 時分が設定されるかもしれないので日で切り捨てる
				if (!isNull(r.vld_dt_fr())) {
					r.vld_dt_fr(r.vld_dt_fr().trunc(MCDateFieldType.DAY));
				}
				if (!isNull(r.vld_dt_to())) {
					r.vld_dt_to(r.vld_dt_to().trunc(MCDateFieldType.DAY));
				}
				// 引当保留除外ＦＬＧはヘッダがオンなら明細もオンとみなす
				if (r.except_alloc_wait_flg()) {
					j++;
				}
				else if (up0().except_alloc_wait_flg()) {
					r.except_alloc_wait_flg(true);
				}
				// 優先して引き当てる設定はロット提案のときのみ有効
				if (!MSC_LOT_PROP_TYP.isLOT(up0().lot_prop_typ())) {
					r.stk_alloc_flg(false);
					r.except_alloc_wait_flg(false);
				}
				// 在庫提案ＦＬＧはヘッダがオンなら明細もオンとみなす
				if (r.stk_flg()) {
					k++;
				}
				else if (up0().stk_flg()) {
					r.stk_flg(true);
				}
				// 行番号を設定し、引当処理前にソートすることで並び順を担保する
				r.lno(i++);
				// 優先して引き当てるレコードを振り分けておく
				if (r.stk_alloc_flg() || r.except_alloc_wait_flg()) {
					_priAllocTgtL.add(r);
				}
				else {
					if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(r.alloc_scope_typ())) {
						_grsTgtL.add(r);
					}
					else {
						_locTgtL.add(r);
					}
				}
			}

			for (Srch_StkR r : up2()) {
				if (isSame(r.base_unit_qty(), MCNumber.ZERO)) {
					continue;
				}
				// 品目マスタから補完
				MAM_ITM_R itm = _itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				// 手配ＮＯ管理区分が「管理する（任意：在庫対象外）」の場合は手配ＮＯをnull文字に変換
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno1_mng_typ())) {
					r.sno1(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno2_mng_typ())) {
					r.sno2(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno3_mng_typ())) {
					r.sno3(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno4_mng_typ())) {
					r.sno4(MAC_STR.NULL_VAL.value());
				}
			}

			// 引当保留除外ＦＬＧは明細が全てオンならヘッダもオンにする
			if (isSame(i, j)) {
				up0().except_alloc_wait_flg(true);
			}
			// 在庫提案ＦＬＧは明細が全てオンならヘッダもオンにする
			if (isSame(i, k)) {
				up0().stk_flg(true);
			}

			// 投入は他と混在しない想定とする
			if (MSC_IO_SCHD_TYP.isINPT(up1().get(0).io_schd_typ())) {
				up0().cont_fctr_calc_flg(true);
			}
			// 有効成分を計算しないときは有効成分対象ＦＬＧをオフにする
			if (!up0().cont_fctr_calc_flg()) {
				up1().setBoolean(Srch_TgtR.$chk_cont_fctr_flg, false);
			}

			// 削除対象の出庫予定が予備ＮＯで渡された場合、受払予定を取得して受払予定ＮＯを設定する
			setIoSchd();
		}
		
		protected boolean isLotFix(Srch_TgtR r, boolean mfgAllocNotLotFixFlg, boolean sloAllocNotLotFixFlg) {
			if (r.not_lot_mix_flg() || r.not_sublot_mix_flg()) {
				if (!mfgAllocNotLotFixFlg && MSC_IO_SCHD_TYP.isINPT(r.io_schd_typ())) {
					return true;
				}
				else if (!sloAllocNotLotFixFlg && 
						(MSC_IO_SCHD_TYP.isSLS(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isSHIP_OUT(r.io_schd_typ()))) {
					return true;
				}
			}
			return false;
		}

		/**
		 * 削除対象の受払予定予備ＮＯのブロックから、受払予定ＮＯのブロックを作成する。
		 */
		protected void setIoSchd() {
			// 受払予定ＮＯの上り電文が設定されている場合は何もしない
			if (!up3().isEmpty()) {
				return;
			}

			// 受払予定予備ＮＯの上り電文が未設定の場合は何もしない
			if (up4().isEmpty()) {
				return;
			}

			// 受払予定予備ＮＯの上り電文に対し、同じSQLで実行するグループを設定する
			for (MSW_IO_SCHD_DEL_R r : up4()) {
				setSrchGrp(r);
			}

			// 検索グループ単位に受払予定を取得
			for (MCList<MSW_IO_SCHD_DEL_R> delGrpL : up4().groupList("del_grp")) {
				// 削除対象のデータを取得するためワークテーブルを作成する
				MSW_IO_SCHD_DEL_R S0 = MSW_IO_SCHD_DEL_R.create();
				execDbWkDelete("MSBEL5040_MSW_IO_SCHD_DEL_D01", S0);
				dbInsert("MSBEL5040_MSW_IO_SCHD_DEL_I01", up4(), MCQueryApiBuilder.create(MSW_IO_SCHD_DEL_R.create("T")));

				// 検索用SQLを生成して削除対象のデータを取得する
				MSW_IO_SCHD_DEL_R srchR = delGrpL.get(0);
				MCList<Srch_Io_SchdR> rsltL = MCList.create(Srch_Io_SchdR.class);
				getSelectSql(srchR).executeQuery(rsltL);
				up3().addAll(rsltL);
			}
		}

		/**
		 * 受払予定予備ＮＯ１～４、受払進捗ＮＯ、受払予定予備連番１～４に対して、同じ項目に値が設定されているレコード同士を判別できるように検索グループを設定する。
		 * @param r
		 */
		protected void setSrchGrp(MSW_IO_SCHD_DEL_R r) {

			Comparable[] vals = new Comparable[] {
					r.io_schd_sub_no1(), r.io_schd_sub_no2(), r.io_schd_sub_no3(),
					r.io_schd_sub_no4(), r.io_schd_pr_no(), r.io_schd_sub_seq1(),
					r.io_schd_sub_seq2(), r.io_schd_sub_seq3(), r.io_schd_sub_seq4()
			};

			String delGrp = "";

			// 検索グループの文字列に対し、受払予定予備ＮＯ１が文字列の左１桁目、予備ＮＯ２が２桁目、…受払進捗ＮＯが５桁目、
			// 受払予定予備連番１が６桁目、…連番４が９桁目と割り当てる。
			// NULLの場合は0、設定されている場合は1とする。
			// 例えば予備ＮＯ１、受払進捗ＮＯ、予備連番１が設定されている場合、検索グループは"100011000"となる。
			for (Comparable v : vals) {
				if (isNull(v)) {
					delGrp += "0";
				}
				else {
					delGrp += "1";
				}
			}
			r.setStringNE("del_grp", delGrp);
		}

		/**
		 * 受払予定検索用のSQLを生成する
		 * @param r
		 * @return
		 */
		protected MCMainQuery getSelectSql(MSW_IO_SCHD_DEL_R r) {
			MST_IO_SCHD_R t = MST_IO_SCHD_R.create("T");
			MSW_IO_SCHD_DEL_R w = MSW_IO_SCHD_DEL_R.create("W");

			MCPredicate p = value(0).eq(value(0));

			if (!isNull(r.io_schd_sub_no1())) {
				p = p.and(t.io_schd_sub_typ1.eq(w.io_schd_sub_typ1));
				p = p.and(t.io_schd_sub_no1.eq(w.io_schd_sub_no1));
				if (!isNull(r.io_schd_sub_seq1())) {
					p = p.and(t.io_schd_sub_seq1.eq(w.io_schd_sub_seq1));
				} 
			}

			if (!isNull(r.io_schd_sub_no2())) {
				p = p.and(t.io_schd_sub_typ2.eq(w.io_schd_sub_typ2));
				p = p.and(t.io_schd_sub_no2.eq(w.io_schd_sub_no2));
				if (!isNull(r.io_schd_sub_seq2())) {
					p = p.and(t.io_schd_sub_seq2.eq(w.io_schd_sub_seq2));
				} 
			}

			if (!isNull(r.io_schd_sub_no3())) {
				p = p.and(t.io_schd_sub_typ3.eq(w.io_schd_sub_typ3));
				p = p.and(t.io_schd_sub_no3.eq(w.io_schd_sub_no3));
				if (!isNull(r.io_schd_sub_seq3())) {
					p = p.and(t.io_schd_sub_seq3.eq(w.io_schd_sub_seq3));
				} 
			}

			if (!isNull(r.io_schd_sub_no4())) {
				p = p.and(t.io_schd_sub_typ4.eq(w.io_schd_sub_typ4));
				p = p.and(t.io_schd_sub_no4.eq(w.io_schd_sub_no4));
				if (!isNull(r.io_schd_sub_seq4())) {
					p = p.and(t.io_schd_sub_seq4.eq(w.io_schd_sub_seq4));
				} 
			}

			if (!isNull(r.io_schd_pr_no())) {
				p = p.and(t.io_schd_pr_no.eq(w.io_schd_pr_no));
			}

			MCPredicate f = t.alloc_flg.eq(value(true));
			if (!up0().except_alloc_wait_flg()) {
				f = f.or(t.alloc_wait_flg.eq(value(true)));
			}

			return sql("MSBEL5040_MST_IO_SCHD_S01")
				.mainQuery()
				.select(t.io_schd_no, t.io_schd_typ, t.io_schd_sts_typ, t.io_schd_seq)
				.from(t)
				.where(value(0).eq(value(0))
						.and(exists(subQuery().select(value("X")).from(w)
								.where(p)))
										.and(f));
		}

		protected void crtLocWk() {
			MCList<MST_ALLOC_LOCK_R> dbc = MCList.create(MST_ALLOC_LOCK_R.class);
			addAll(dbc, getLocMapCache().getAll(), createMap_MST_ALLOC_LOCK_R_Loc_Map_ListR());
			MSW_ALLOC_LOCK_KEY_R S0 = MSW_ALLOC_LOCK_KEY_R.create();
			execDbWkDelete("MSBEL5040_MSW_ALLOC_LOCK_KEY_D01", S0);
			MCList<MST_ALLOC_LOCK_R> dbc2 = dbc.groupBy(MST_ALLOC_LOCK_R.colnames());
			dbWkInsert("MSBEL5040_MSW_ALLOC_LOCK_I01", dbc2, MCQueryApiBuilder.create(MST_ALLOC_LOCK_R.create("T")).getBaseDbc());
		}

		protected MCList<MSW_ALLOC_ITM_R> _addList = MCList.create(MSW_ALLOC_ITM_R.class);
		protected void crtItmWk() {
			MCList<MSW_ALLOC_ITM_R> dbc = MCList.create(MSW_ALLOC_ITM_R.class);
			addAll(dbc, up1(), createMap_MSW_ALLOC_ITM_R_Srch_TgtR());
			dbc.addAll(_addList);
			MSW_ALLOC_ITM_R S0 = MSW_ALLOC_ITM_R.create();
			execDbWkDelete("MSBEL5040_MSW_ALLOC_ITM_D01", S0);
			MCList<MSW_ALLOC_ITM_R> dbc2 = dbc.groupBy(MSW_ALLOC_ITM_R.colnames());
			dbInsert("MSBEL5040_MSW_ALLOC_ITM_I01", dbc2, MCQueryApiBuilder.create(MSW_ALLOC_ITM_R.create("T")));
		}

		protected void execAvlChk01Sv() {

			if (!MSC_LOT_PROP_TYP.isLOT(up0().lot_prop_typ())) {
				return;
			}

			// 上り電文から対象のレコードを抽出
			MCList<Srch_TgtR> tgtL = up1()
					.subList(r -> MSC_IO_SCHD_TYP.isSLS(r.io_schd_typ())
							|| MSC_IO_SCHD_TYP.isSLS_ACXFR(r.io_schd_typ())
							|| MSC_IO_SCHD_TYP.isSHIP_OUT(r.io_schd_typ())
									&& MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())
							|| MSC_IO_SCHD_TYP.isSHIP_OUT_EX(r.io_schd_typ()));

			if (tgtL.isEmpty()) {
				return;
			}

			// 出庫物流Ｇ、納品先物流Ｇ、出荷条件、出庫予定日から引当可能日数を超過したかどうか判断する
			MSBEL_AllocMngService.Alloc_Avl_Sprt01 avlCk01Sv = MSBEL_AllocMngService
					.crtAlloc_Avl_Sprt01();
			addAll(avlCk01Sv.up0(), tgtL, createMap_Alloc_Avl_Sprt01_CndR_Srch_TgtR());
			avlCk01Sv.exec();

			// 引当可能日数を超過している上り電文は処理対象から除外して未引当扱いにする
			MCIndexKey idx = avlCk01Sv.down0().createIndex(Alloc_Avl_Sprt01_CndR.$peg_no);
			MCList<Srch_TgtR> up1TgtL = MCList.create(Srch_TgtR.class);
			for (Srch_TgtR r :up1()) {
				Alloc_Avl_Sprt01_CndR rsltR = avlCk01Sv.down0().getFirst(idx, r.peg_no());
				if (!isNull(rsltR) && rsltR.exceed_alloc_days_flg()) {
					down2().add(r);
				}
				else {
					up1TgtL.add(r);
				}
			}
			up1().setAll(up1TgtL);
		}

		protected void execAvl01Sv(Alloc_Avl_Srch01 avl01Sv) {

			avl01Sv.up0().short_ope_typ(up0().short_ope_typ());
			avl01Sv.up0().gi_alloc_flg(up0().gi_alloc_flg());
			avl01Sv.up0().all_pri_flg(isSame(up1().size(), _priAllocTgtL.size()));
			avl01Sv.up0().except_alloc_wait_flg(up0().except_alloc_wait_flg());
			avl01Sv.up0().except_zero_flg(true);
			avl01Sv.up0().dt_fr(null);
			avl01Sv.up0().dt_to(null);
			avl01Sv.up0().avl_schd_dt(null);
			avl01Sv.up0().except_invld_lot_flg(false);
			avl01Sv.up0().cont_fctr_calc_flg(up0().cont_fctr_calc_flg());
			avl01Sv.up0().alloc_grp_srch_flg(MSC_LOT_PROP_TYP.isSRCH_GRS(up0().lot_prop_typ()));
			avl01Sv.up0().dtl_calc_flg(false);
			avl01Sv.up0().ignore_margin_days(null);
			avl01Sv.up0().xfr_src_typ(up0().xfr_src_typ());
			avl01Sv.up0().addBooleanColumn("minus_stk_chk_flg", up0().getBooleanNE("minus_stk_chk_flg"));
			avl01Sv.up1().addAll(_priAllocTgtL);
			avl01Sv.up2().addAll(up2());
			avl01Sv.up5().addAll(up3());
			addAll(avl01Sv.up6(), up1(), createMap_Avl_ListR_Srch_TgtR());

			avl01Sv.exec();
		}

		protected void editPackAllocFlg(MCList<Avl_ListR> list) {
			if (up0().getBooleanNE("minus_stk_chk_flg")) {
				selectStkLocLAvlL(list);
	
				for (Avl_ListR r: list) {
					MAM_LOC_R giLocR = _stkLocAvlCacheL.get(r.stk_loc_cd ());
					MAM_ITM_R itm = _itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
					if (!itm.minus_stk_flg()) {
						r.setBooleanNE("chk_pack_unit", true);
	
						if (!giLocR.gi_pack_xfer_flg()) {
							r.pack_alloc_flg(true);
						}
						else {
							r.pack_alloc_flg(false);
						}
					}
				}
			}
		}

		protected void execSrch02Sv(Alloc_Srch02 srch02Sv, Alloc_Avl_Srch01 avl01Sv) {

			if (!MSC_LOT_PROP_TYP.isLOT(up0().lot_prop_typ())) {
				return;
			}

			if (_locTgtL.size() > 0) {
				MCRow.copyall(srch02Sv.up0(), up0());
				srch02Sv.up1().addAll(_locTgtL);
				if (up0().stk_flg()) {
					srch02Sv.up2().addAll(avl01Sv.down0().subList(Avl_ListR.$schd_stk_typ, MSC_SCHD_STK_TYP.STK.value()));
				}
				else {
					srch02Sv.up2().addAll(avl01Sv.down0());
				}
				srch02Sv.exec();
			}
		}

		protected void execSrch03Sv(Alloc_Srch03 srch03Sv, Alloc_Srch02 srch02Sv, Alloc_Avl_Srch01 avl01Sv) {

			if (!MSC_LOT_PROP_TYP.isLOT(up0().lot_prop_typ())) {
				return;
			}

			if (_grsTgtL.size() > 0) {
				MCRow.copyall(srch03Sv.up0(), up0());
				srch03Sv.up1().addAll(_grsTgtL);
				if (srch02Sv.up1().size() > 0) {
					srch03Sv.up2().addAll(srch02Sv.down2());
					srch03Sv.up2().addAll(avl01Sv.down1());
				}
				else {
					srch03Sv.up2().addAll(avl01Sv.down0());
					srch03Sv.up2().addAll(avl01Sv.down1());
				}
				srch03Sv.exec();
			}
		}

		protected void setDown(Alloc_Srch03 srch03Sv, Alloc_Srch02 srch02Sv, Alloc_Avl_Srch01 avl01Sv) {
			if (MSC_LOT_PROP_TYP.isLOT(up0().lot_prop_typ())) {
				if (srch03Sv.up1().size() > 0) {
					down0().addAll(srch03Sv.down0());
					down2().addAll(srch03Sv.down2());
				}
				if (srch02Sv.up1().size() > 0) {
					down0().addAll(srch02Sv.down0());
					down1().addAll(srch02Sv.down1());
					down2().addAll(srch02Sv.down3());
				}
				if (avl01Sv.up1().size() > 0) {
					down0().addAll(avl01Sv.down4());
					down1().addAll(avl01Sv.down5());
					down2().addAll(avl01Sv.down6());
				}
				addAll(down3(), avl01Sv.down2(), createMap_Srch_RsltR_Avl_ListR());
				addAll(down4(), avl01Sv.down3(), createMap_Srch_RsltR_Avl_ListR());
			}
			else {
				addAll(down0(), avl01Sv.down0(), createMap_Srch_RsltR_Avl_ListR());
				addAll(down0(), avl01Sv.down1(), createMap_Srch_RsltR_Avl_ListR());
				addAll(down2(), avl01Sv.down2(), createMap_Srch_TgtR_Avl_ListR());
				addAll(down2(), avl01Sv.down3(), createMap_Srch_TgtR_Avl_ListR());
			}
			sumDown();
		}

		protected void sumDown() {
			if (up0().dtl_flg()) {
				return;
			}

			MCGroupByPolicy gp = new MCGroupByPolicy();
			gp.addKey(getKeyColumns());
			gp.sum(getSumColumns());

			down0().setAll(down0().groupBy(gp));
		}

		protected String[] getKeyColumns() {
			return new String[]{
					Srch_RsltR.$peg_no,
					Srch_RsltR.$itm_cd,
					Srch_RsltR.$itm_sub1,
					Srch_RsltR.$itm_sub2,
					Srch_RsltR.$itm_sub3,
					Srch_RsltR.$ver_no,
					Srch_RsltR.$alt_grp_cd,
					Srch_RsltR.$alt_grp_seq,
					Srch_RsltR.$oper_inst_no,
					Srch_RsltR.$inpt_loc_cd,
					Srch_RsltR.$inpt_str_ln_cd,
					Srch_RsltR.$inpt_sppl_cd,
					Srch_RsltR.$dlv_lg_grp_cd,
					Srch_RsltR.$alloc_grp_cd,
					Srch_RsltR.$gi_lg_grp_cd,
					Srch_RsltR.$gi_loc_cd,
					Srch_RsltR.$gi_str_ln_cd,
					Srch_RsltR.$gi_stk_arrv_bp_cd,
					Srch_RsltR.$gr_loc_cd,
					Srch_RsltR.$gr_str_ln_cd,
					Srch_RsltR.$stk_loc_cd,
					Srch_RsltR.$stk_str_ln_tgt_flg,
					Srch_RsltR.$stk_str_ln_cd,
					Srch_RsltR.$stk_arrv_bp_cd,
					Srch_RsltR.$stk_sppl_cd,
					Srch_RsltR.$stk_alloc_grp_cd,
					Srch_RsltR.$stk_lg_grp_cd,
					Srch_RsltR.$xfr_lt,
					Srch_RsltR.$asst_typ,
					Srch_RsltR.$in_xfr_typ,
					Srch_RsltR.$quality_typ,
					Srch_RsltR.$stk_insp_typ,
					Srch_RsltR.$stk_id_typ,
					Srch_RsltR.$stk_bp_cd,
					Srch_RsltR.$gd_cd,
					Srch_RsltR.$lot_no,
					Srch_RsltR.$sublot_no,
					Srch_RsltR.$sno1,
					Srch_RsltR.$sno2,
					Srch_RsltR.$sno3,
					Srch_RsltR.$sno4,
					Srch_RsltR.$first_gr_dt,
					Srch_RsltR.$vld_dt,
					Srch_RsltR.$lot_seq,
					Srch_RsltR.$pack_unit_cd,
					Srch_RsltR.$pack_unit_dec_place,
					Srch_RsltR.$pack_unit_rnd_typ,
					Srch_RsltR.$base_unit_cd,
					Srch_RsltR.$base_unit_dec_place,
					Srch_RsltR.$base_unit_rnd_typ,
					Srch_RsltR.$cont_fctr_flg,
					Srch_RsltR.$act_cont_fctr,
					Srch_RsltR.$std_cont_fctr,
					Srch_RsltR.$cont_fctr_rnd_typ,
					Srch_RsltR.$cont_fctr_dec_place,
					Srch_RsltR.$rqst_sno1,
					Srch_RsltR.$sno1_null_flg,
					Srch_RsltR.$rqst_sno2,
					Srch_RsltR.$sno2_null_flg,
					Srch_RsltR.$rqst_sno3,
					Srch_RsltR.$sno3_null_flg,
					Srch_RsltR.$rqst_sno4,
					Srch_RsltR.$sno4_null_flg,
					Srch_RsltR.$vld_dt_fr,
					Srch_RsltR.$vld_dt_to
			};
		}

		protected String[] getSumColumns() {
			return new String[]{
					Srch_RsltR.$pack_unit_qty,
					Srch_RsltR.$base_unit_qty,
					Srch_RsltR.$cont_qty
			};
		}

		protected void setNm() {

			if (!up0().nm_srch_flg()) return;

			selectInptLocL(down0());
			selectInptStrLnL(down0());
			selectInptSpplL(down0());
			selectDlvLgGrpL(down0());
			selectGrLocL(down0());
			selectGrStrLnL(down0());
			selectSundryItmL(down0());
			selectStkLocL(down0());
			selectStkStrLnL(down0());
			selectStkArrv(down0());
			selectStkSpplL(down0());
			selectStkAllocGrpL(down0());
			selectStkLgGrpL(down0());
			selectStkBpL(down0());
			selectGdL(down0());
			selectPackUnitL(down0());
			selectBaseUnitL(down0());

			boolean flg = false;
			for (Srch_RsltR r :down0()) {
				r.inpt_loc_nm(_inptLocCache.get(r.inpt_loc_cd()).loc_nm());
				r.inpt_str_ln_nm(_inptStrLnCache.get(r.inpt_loc_cd(), r.inpt_str_ln_cd()).str_ln_nm());
				r.inpt_sppl_nm(_inptSpplCache.get(r.inpt_sppl_cd()).bp_nm());
				r.dlv_lg_grp_nm(_dlvLgGrpCache.get(r.dlv_lg_grp_cd()).lg_grp_nm());
				r.alloc_grp_nm(_stkAllocGrpCache.get(r.alloc_grp_cd()).alloc_grp_nm());
				r.gi_lg_grp_nm(_stkLgGrpCache.get(r.gi_lg_grp_cd()).lg_grp_nm());
				r.gi_loc_nm(_stkLocCache.get(r.gi_loc_cd()).loc_nm());
				r.gi_str_ln_nm(_stkStrLnCache.get(r.gi_loc_cd(), r.gi_str_ln_cd()).str_ln_nm());
				r.gi_stk_arrv_bp_nm(_stkArrvCache.get(r.gi_stk_arrv_bp_cd()).bp_nm());
				r.gr_loc_nm(_grLocCache.get(r.gr_loc_cd()).loc_nm());
				r.gr_str_ln_nm(_grStrLnCache.get(r.gr_loc_cd(), r.gr_str_ln_cd()).str_ln_nm());
				r.itm_nm(nvl(_sundryItmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.sno1(), r.sno2(), r.sno3(), r.sno4()).itm_nm(),
						_itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()).itm_nm()));
				r.stk_loc_nm(_stkLocCache.get(r.stk_loc_cd()).loc_nm());
				r.stk_str_ln_nm(_stkStrLnCache.get(r.stk_loc_cd(), r.stk_str_ln_cd()).str_ln_nm());
				r.stk_arrv_bp_nm(_stkArrvCache.get(r.stk_arrv_bp_cd()).bp_nm());
				r.stk_sppl_nm(_stkSpplCache.get(r.stk_sppl_cd()).bp_nm());
				r.stk_alloc_grp_nm(_stkAllocGrpCache.get(r.stk_alloc_grp_cd()).alloc_grp_nm());
				r.stk_lg_grp_nm(_stkLgGrpCache.get(r.stk_lg_grp_cd()).lg_grp_nm());
				r.stk_bp_nm(_stkBpCache.get(r.stk_bp_cd()).bp_nm());
				r.gd_nm(_gdCache.get(r.gd_cd()).gd_nm());
				r.pack_unit_nm(_packUnitCache.get(r.pack_unit_cd()).unit_nm());
				r.base_unit_nm(_baseUnitCache.get(r.base_unit_cd()).unit_nm());

				if (!isNull(r.alt_grp_cd())) {
					flg = true;
					r.inpt_wg_cd(_inptLocCache.get(r.inpt_loc_cd()).wg_cd());
				}
			}

			if (flg) {
				selectAltGrpL(down0());
				for (Srch_RsltR r :down0()) {
					r.alt_grp_nm(_altGrpCache.get(r.alt_grp_cd(), r.inpt_wg_cd()).alt_grp_nm());
				}
			}
		}

		//- 品目マスタ検索 ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
		protected void selectItmL(MCList<Srch_TgtR> dtlL) {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.ship_term_cd, t.pack_alloc_flg, t.cont_fctr_flg,
					t.std_cont_fctr, t.cont_fctr_rnd_typ, t.cont_fctr_dec_place,
					t.unit_cd, t.dec_place, t.rnd_typ, t.itm_nm, t.asset_mng_typ,
					t.lot_mng_typ, t.sublot_mng_typ, t.sno1_mng_typ, t.sno2_mng_typ,
					t.sno3_mng_typ, t.sno4_mng_typ, t.minus_stk_flg);
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbcL_bldr, dtlL,
					Srch_TgtR.$itm_cd, Srch_TgtR.$itm_sub1, Srch_TgtR.$itm_sub2, Srch_TgtR.$itm_sub3);
		}
		//- 品目単位マスタ検索 ---------------------------------------------
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
		protected void selectItmUnitL(MCList<Srch_TgtR> dtlL) {
			MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.conv_base_qty, t.conv_qty, t.dec_place, t.rnd_typ);
			_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbcL_bldr, dtlL, Srch_TgtR.$itm_cd,
					Srch_TgtR.$itm_sub1, Srch_TgtR.$itm_sub2, Srch_TgtR.$itm_sub3, Srch_TgtR.$pack_unit_cd);
		}
		//- 諸口品マスタ検索 ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_SUNDRY_ITM_R> _sundryItmCache = null;
		protected void selectSundryItmL(MCList<Srch_RsltR> dtlL) {
			MAM_SUNDRY_ITM_R t = MAM_SUNDRY_ITM_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.itm_nm);
			_sundryItmCache = new FXUCL_MCDbcCache<MAM_SUNDRY_ITM_R>(dbcL_bldr, dtlL,
					Srch_RsltR.$itm_cd, Srch_RsltR.$itm_sub1, Srch_RsltR.$itm_sub2, Srch_RsltR.$itm_sub3,
					Srch_RsltR.$sno1, Srch_RsltR.$sno2, Srch_RsltR.$sno3, Srch_RsltR.$sno4);
		}
		//- 代替グループマスタ検索 ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_ALT_GRP_R> _altGrpCache = null;
		protected void selectAltGrpL(MCList<Srch_RsltR> dtlL) {
			MAM_ALT_GRP_R t = MAM_ALT_GRP_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.alt_grp_nm);
			_altGrpCache = new FXUCL_MCDbcCache<MAM_ALT_GRP_R>(dbcL_bldr, dtlL, Srch_RsltR.$alt_grp_cd, Srch_RsltR.$inpt_wg_cd);
		}
		//- 場所マスタ検索（投入場所） ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_LOC_R> _inptLocCache = null;
		protected void selectInptLocL(MCList<Srch_RsltR> dtlL) {
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.loc_nm, t.wg_cd);
			_inptLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, dtlL, Srch_RsltR.$inpt_loc_cd);
		}
		//- 棚・ラインマスタ検索（投入場所） ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_STR_LN_R> _inptStrLnCache = null;
		protected void selectInptStrLnL(MCList<Srch_RsltR> dtlL) {
			MAM_STR_LN_R t = MAM_STR_LN_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.str_ln_nm);
			_inptStrLnCache = new FXUCL_MCDbcCache<MAM_STR_LN_R>(dbcL_bldr, dtlL, Srch_RsltR.$inpt_loc_cd, Srch_RsltR.$inpt_str_ln_cd);
		}
		//- 取引先マスタ検索（投入場所） ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_BP_R> _inptSpplCache = null;
		protected void selectInptSpplL(MCList<Srch_RsltR> dtlL) {
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.bp_nm);
			_inptSpplCache = new FXUCL_MCDbcCache<MAM_BP_R>(dbcL_bldr, dtlL, Srch_RsltR.$inpt_sppl_cd);
		}
		//- 物流グループマスタ検索（納品先） ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_LG_GRP_R> _dlvLgGrpCache = null;
		protected void selectDlvLgGrpL(MCList<Srch_RsltR> dtlL) {
			MAM_LG_GRP_R t = MAM_LG_GRP_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.lg_grp_nm);
			_dlvLgGrpCache = new FXUCL_MCDbcCache<MAM_LG_GRP_R>(dbcL_bldr, dtlL, Srch_RsltR.$dlv_lg_grp_cd);
		}
//		//- 総量引当場所グループマスタ検索 ---------------------------------------------
//		protected FXUCL_DbcCache<MAM_ALLOC_GRP_R> _allocGrpCache = null;
//		protected void selectAllocGrpL(MCList<Srch_RsltR> dtlL) {
//			MAM_ALLOC_GRP_L<MAM_ALLOC_GRP_R> dbcL = MAM_ALLOC_GRP_L.createMAM_ALLOC_GRP();
//			dbcL.setSelect(MAM_ALLOC_GRP_R.$alloc_grp_nm);
//			_allocGrpCache = new FXUCL_DbcCache<MAM_ALLOC_GRP_R>(dbcL, dtlL, Srch_RsltR.$alloc_grp_cd);
//		}
//		//- 物流グループマスタ検索（納品先） ---------------------------------------------
//		protected FXUCL_DbcCache<MAM_LG_GRP_R> _giLgGrpCache = null;
//		protected void selectGiLgGrpL(MCList<Srch_RsltR> dtlL) {
//			MAM_LG_GRP_L<MAM_LG_GRP_R> dbcL = MAM_LG_GRP_L.createMAM_LG_GRP();
//			dbcL.setSelect(MAM_LG_GRP_R.$lg_grp_nm);
//			_giLgGrpCache = new FXUCL_DbcCache<MAM_LG_GRP_R>(dbcL, dtlL, Srch_RsltR.$gi_lg_grp_cd);
//		}
		//- 場所マスタ検索（出庫場所） ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_LOC_R> _giLocCache = null;
		protected void selectGiLocL(MCList<Srch_TgtR> dtlL) {
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.gi_pack_xfer_flg);
			_giLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, dtlL, Srch_TgtR.$gi_loc_cd);
		}
		//- 場所マスタ検索（在庫場所） ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_LOC_R> _stkLocAvlCacheL = null;
		protected void selectStkLocLAvlL(MCList<Avl_ListR> dtlL) {
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.gi_pack_xfer_flg);
			_stkLocAvlCacheL = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, dtlL, Avl_ListR.$stk_loc_cd);
		}
//		//- 棚・ラインマスタ検索（出庫場所） ---------------------------------------------
//		protected FXUCL_DbcCache<MAM_STR_LN_R> _giStrLnCache = null;
//		protected void selectGiStrLnL(MCList<Srch_RsltR> dtlL) {
//			MAM_STR_LN_L<MAM_STR_LN_R> dbcL = MAM_STR_LN_L.createMAM_STR_LN();
//			dbcL.setSelect(MAM_STR_LN_R.$str_ln_nm);
//			_giStrLnCache = new FXUCL_DbcCache<MAM_STR_LN_R>(dbcL, dtlL, Srch_RsltR.$gi_loc_cd, Srch_RsltR.$gi_str_ln_cd);
//		}
		//- 場所マスタ検索（入庫場所） ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_LOC_R> _grLocCache = null;
		protected void selectGrLocL(MCList<Srch_RsltR> dtlL) {
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.loc_nm);
			_grLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, dtlL, Srch_RsltR.$gr_loc_cd);
		}
		//- 棚・ラインマスタ検索（入庫場所） ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_STR_LN_R> _grStrLnCache = null;
		protected void selectGrStrLnL(MCList<Srch_RsltR> dtlL) {
			MAM_STR_LN_R t = MAM_STR_LN_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.str_ln_nm);
			_grStrLnCache = new FXUCL_MCDbcCache<MAM_STR_LN_R>(dbcL_bldr, dtlL, Srch_RsltR.$gr_loc_cd, Srch_RsltR.$gr_str_ln_cd);
		}
		//- 場所マスタ検索（在庫場所） ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_LOC_R> _stkLocCache = null;
		protected void selectStkLocL(MCList<Srch_RsltR> dtlL) {
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.loc_nm);
			_stkLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, dtlL, Srch_RsltR.$stk_loc_cd);
		}
		//- 棚・ラインマスタ検索（在庫場所） ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_STR_LN_R> _stkStrLnCache = null;
		protected void selectStkStrLnL(MCList<Srch_RsltR> dtlL) {
			MAM_STR_LN_R t = MAM_STR_LN_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.str_ln_nm);
			_stkStrLnCache = new FXUCL_MCDbcCache<MAM_STR_LN_R>(dbcL_bldr, dtlL, Srch_RsltR.$stk_loc_cd, Srch_RsltR.$stk_str_ln_cd);
		}
		//- 取引先マスタ検索（在庫着荷先） ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_BP_R> _stkArrvCache = null;
		protected void selectStkArrv(MCList<Srch_RsltR> dtlL) {
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.bp_nm);
			_stkArrvCache = new FXUCL_MCDbcCache<MAM_BP_R>(dbcL_bldr, dtlL, Srch_RsltR.$stk_arrv_bp_cd);
		}
		//- 取引先マスタ検索（在庫場所） ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_BP_R> _stkSpplCache = null;
		protected void selectStkSpplL(MCList<Srch_RsltR> dtlL) {
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.bp_nm);
			_stkSpplCache = new FXUCL_MCDbcCache<MAM_BP_R>(dbcL_bldr, dtlL, Srch_RsltR.$stk_sppl_cd);
		}
		//- 総量引当場所グループマスタ検索（在庫場所）	---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_ALLOC_GRP_R> _stkAllocGrpCache = null;
		protected void selectStkAllocGrpL(MCList<Srch_RsltR> dtlL) {
			MAM_ALLOC_GRP_R t = MAM_ALLOC_GRP_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.alloc_grp_nm);
			_stkAllocGrpCache = new FXUCL_MCDbcCache<MAM_ALLOC_GRP_R>(dbcL_bldr, dtlL, Srch_RsltR.$stk_alloc_grp_cd);
		}
		//- 物流グループマスタ検索（在庫場所） ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_LG_GRP_R> _stkLgGrpCache = null;
		protected void selectStkLgGrpL(MCList<Srch_RsltR> dtlL) {
			MAM_LG_GRP_R t = MAM_LG_GRP_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.lg_grp_nm);
			_stkLgGrpCache = new FXUCL_MCDbcCache<MAM_LG_GRP_R>(dbcL_bldr, dtlL, Srch_RsltR.$stk_lg_grp_cd);
		}
		//- 取引先マスタ検索（在庫取引先） ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_BP_R> _stkBpCache = null;
		protected void selectStkBpL(MCList<Srch_RsltR> dtlL) {
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.bp_nm);
			_stkBpCache = new FXUCL_MCDbcCache<MAM_BP_R>(dbcL_bldr, dtlL, Srch_RsltR.$stk_bp_cd);
		}
		//- 格付マスタ検索 ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_STK_GD_R> _gdCache = null;
		protected void selectGdL(MCList<Srch_RsltR> dtlL) {
			MAM_STK_GD_R t = MAM_STK_GD_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.gd_nm);
			_gdCache = new FXUCL_MCDbcCache<MAM_STK_GD_R>(dbcL_bldr, dtlL, Srch_RsltR.$gd_cd);
		}
		//- 単位マスタ検索（荷姿単位） ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_UNIT_R> _packUnitCache = null;
		protected void selectPackUnitL(MCList<Srch_RsltR> dtlL) {
			MAM_UNIT_R t = MAM_UNIT_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.unit_nm);
			_packUnitCache = new FXUCL_MCDbcCache<MAM_UNIT_R>(dbcL_bldr, dtlL, Srch_RsltR.$pack_unit_cd);
		}
		//- 単位マスタ検索（基準単位） ---------------------------------------------
		protected FXUCL_MCDbcCache<MAM_UNIT_R> _baseUnitCache = null;
		protected void selectBaseUnitL(MCList<Srch_RsltR> dtlL) {
			MAM_UNIT_R t = MAM_UNIT_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.unit_nm);
			_baseUnitCache = new FXUCL_MCDbcCache<MAM_UNIT_R>(dbcL_bldr, dtlL, Srch_RsltR.$base_unit_cd);
		}

		protected Map_MST_ALLOC_LOCK_R_Loc_Map_ListR<MST_ALLOC_LOCK_R,Loc_Map_ListR> createMap_MST_ALLOC_LOCK_R_Loc_Map_ListR() {
			return new Map_MST_ALLOC_LOCK_R_Loc_Map_ListR<MST_ALLOC_LOCK_R, Loc_Map_ListR>();
		}

		public class Map_MST_ALLOC_LOCK_R_Loc_Map_ListR<D extends MST_ALLOC_LOCK_R, S extends Loc_Map_ListR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_ALLOC_LOCK_R.$itm_cd, Loc_Map_ListR.$itm_cd);
				addColumnPathMap(MST_ALLOC_LOCK_R.$itm_sub1, Loc_Map_ListR.$itm_sub1);
				addColumnPathMap(MST_ALLOC_LOCK_R.$itm_sub2, Loc_Map_ListR.$itm_sub2);
				addColumnPathMap(MST_ALLOC_LOCK_R.$itm_sub3, Loc_Map_ListR.$itm_sub3);
				addColumnPathMap(MST_ALLOC_LOCK_R.$loc_cd, Loc_Map_ListR.$stk_loc_cd);
			}
		}

		protected Map_MSW_ALLOC_ITM_R_Srch_TgtR<MSW_ALLOC_ITM_R,Srch_TgtR> createMap_MSW_ALLOC_ITM_R_Srch_TgtR() {
			return new Map_MSW_ALLOC_ITM_R_Srch_TgtR<MSW_ALLOC_ITM_R, Srch_TgtR>();
		}

		public class Map_MSW_ALLOC_ITM_R_Srch_TgtR<D extends MSW_ALLOC_ITM_R, S extends Srch_TgtR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_ALLOC_ITM_R.$itm_cd, Srch_TgtR.$itm_cd);
				addColumnPathMap(MSW_ALLOC_ITM_R.$itm_sub1, Srch_TgtR.$itm_sub1);
				addColumnPathMap(MSW_ALLOC_ITM_R.$itm_sub2, Srch_TgtR.$itm_sub2);
				addColumnPathMap(MSW_ALLOC_ITM_R.$itm_sub3, Srch_TgtR.$itm_sub3);
				addColumnPathMap(MSW_ALLOC_ITM_R.$sno1, Srch_TgtR.$sno1);
				addColumnPathMap(MSW_ALLOC_ITM_R.$sno2, Srch_TgtR.$sno2);
				addColumnPathMap(MSW_ALLOC_ITM_R.$sno3, Srch_TgtR.$sno3);
				addColumnPathMap(MSW_ALLOC_ITM_R.$sno4, Srch_TgtR.$sno4);
				addColumnPathMap(MSW_ALLOC_ITM_R.$gd_cd, Srch_TgtR.$gd_cd);
//				addColumnPathMap(MSW_ALLOC_ITM_R.$in_xfr_typ, );
				addColumnPathMap(MSW_ALLOC_ITM_R.$quality_typ, Srch_TgtR.$quality_typ);
//				addColumnPathMap(MSW_ALLOC_ITM_R.$stk_insp_typ, );
				addColumnPathMap(MSW_ALLOC_ITM_R.$stk_id_typ, Srch_TgtR.$stk_id_typ);
				addColumnPathMap(MSW_ALLOC_ITM_R.$stk_bp_cd, Srch_TgtR.$stk_bp_cd);
				addColumnPathMap(MSW_ALLOC_ITM_R.$stk_alloc_flg, Srch_TgtR.$stk_alloc_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				addSno1(dest, src);
			}

			protected void addSno1(D dest, S src) {
				addSno2(dest, src);
				if (src.sno1_null_flg() && !isNull(src.sno1())) {
					dest.sno1(MAC_STR.NULL_VAL.value());
					dest.sno2(src.sno2());
					dest.sno3(src.sno3());
					dest.sno4(src.sno4());
					addSno2(dest, src);
				}
			}

			protected void addSno2(D dest, S src) {
				addSno3(dest, src);
				if (src.sno2_null_flg() && !isNull(src.sno2())) {
					dest.sno2(MAC_STR.NULL_VAL.value());
					dest.sno3(src.sno3());
					dest.sno4(src.sno4());
					addSno3(dest, src);
				}
			}

			protected void addSno3(D dest, S src) {
				addSno4(dest, src);
				if (src.sno3_null_flg() && !isNull(src.sno3())) {
					dest.sno3(MAC_STR.NULL_VAL.value());
					dest.sno4(src.sno4());
					addSno4(dest, src);
				}
			}

			protected void addSno4(D dest, S src) {
				_addList.add(dest.clone());
				if (src.sno4_null_flg() && !isNull(src.sno4())) {
					dest.sno4(MAC_STR.NULL_VAL.value());
					_addList.add(dest.clone());
				}
			}
		}

		protected Map_Alloc_Avl_Sprt01_CndR_Srch_TgtR<Alloc_Avl_Sprt01_CndR,Srch_TgtR> createMap_Alloc_Avl_Sprt01_CndR_Srch_TgtR() {
			return new Map_Alloc_Avl_Sprt01_CndR_Srch_TgtR<Alloc_Avl_Sprt01_CndR, Srch_TgtR>();
		}

		public class Map_Alloc_Avl_Sprt01_CndR_Srch_TgtR<D extends Alloc_Avl_Sprt01_CndR, S extends Srch_TgtR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Alloc_Avl_Sprt01_CndR.$peg_no, Srch_TgtR.$peg_no);
				addColumnPathMap(Alloc_Avl_Sprt01_CndR.$dlv_lg_grp_cd, Srch_TgtR.$dlv_lg_grp_cd);
				addColumnPathMap(Alloc_Avl_Sprt01_CndR.$ship_term_cd, Srch_TgtR.$ship_term_cd);
				addColumnPathMap(Alloc_Avl_Sprt01_CndR.$gi_schd_dt, Srch_TgtR.$gi_schd_dt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// 出庫物流Ｇが未設定の場合は標準出荷物流Ｇを設定
				dest.gi_lg_grp_cd(nvl(src.gi_lg_grp_cd(), src.def_ship_lg_grp_cd()));
			}
		}
	}

	/**
	 * Alloc_Srch02オペレーション.<p>
	 *
	 * 指定された条件に適する在庫や入庫予定を算出する<br>
	 */
	public class Alloc_Srch02 extends MSBEL_AllocMngService_MC_A.Alloc_Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if (isNull(_autotest)) {
				_autotest = mcframe.serverCore.sys.MCSys.env.getVMEnv("autotest");
			}
			
			// 代替品以外の計算 
			doCalcNotAlt();

			// 代替品の計算
			doCalcAlt();

			// 下り電文の設定
			setDown();
		}

		protected void doCalcNotAlt() {
			MCList<Srch_TgtR> notAltUp1 = up1().subList(Srch_TgtR.$alt_flg, false);
			MCList<Avl_ListR> up1 = MCList.create(Avl_ListR.class);
			addAll(up1, notAltUp1, createMap_Avl_ListR_Srch_TgtR());
			down0().addAll(execAvl04Sv(up2(), up1, false, false, true, up0().short_ope_typ(), _propLoc, up0().getBooleanNE("minus_stk_chk_flg")));
			addAll(down3(), up1, createMap_Srch_TgtR_Avl_ListR());
		}

		protected String[] _altGrp = new String[]{Srch_TgtR.$oper_inst_no, Srch_TgtR.$alt_grp_cd, Srch_TgtR.$alt_grp_seq};
		protected void doCalcAlt() {
			// ロット提案対象から代替品だけ抽出する
			MCList<Srch_TgtR> up1 = up1().subList(Srch_TgtR.$alt_flg, true);
			MCIndexKey altIdx = up1.createIndex(_altGrp);

			MCGroupByPolicy sumGp = new MCGroupByPolicy();
			sumGp.sum(Avl_ListR.$cont_qty, Avl_ListR.$pack_unit_qty, Avl_ListR.$base_unit_qty);

			// 工程指図ＮＯ、代替グループＣＤ、代替グループ連番ごとに処理を行う
			MCGroupByPolicy gp = new MCGroupByPolicy();
			gp.addKey(_altGrp);
			gp.min(Srch_TgtR.$lno);
			MCList<Srch_TgtR> gpUp1L = up1.groupBy(gp);
			gpUp1L.sort(Srch_TgtR.$lno);
			for (Srch_TgtR upR :gpUp1L) {
				MCList<Srch_TgtR> up1SubList = up1.subList(altIdx, upR.toArray(_altGrp));
				MCSortPolicy p = new MCSortPolicy();
				p.add(SortType.ASC, Srch_TgtR.$alt_alloc_prio);
				if ("true".equals(_autotest)) {
					for (String col :Srch_RsltR.colnames()) {
						p.add(SortType.ASC, col);
					}
				}
				up1SubList.sort(p);
				Srch_TgtR firstRow = up1SubList.get(0);

				if (MAC_ALT_ITM_TYP.isMIX(firstRow.alt_itm_typ())) {
					doCalcAltMix(firstRow, up1SubList, sumGp);
				}
				else if (MAC_ALT_ITM_TYP.isMONO_PRIO(firstRow.alt_itm_typ())) {
					doCalcAltPrio(firstRow, up1SubList, sumGp);
				}
				else if (MAC_ALT_ITM_TYP.isMONO_FIFO(firstRow.alt_itm_typ())) {
					doCalcAltFifo(firstRow, up1SubList, sumGp);
				}
				else {
					Srch_TgtR retR = up1SubList.groupBy(sumGp).get(0);
					setDown1(firstRow, retR.base_unit_qty(), retR.cont_qty());
				}
			}
		}

		// 混在可
		protected void doCalcAltMix(Srch_TgtR firstRow, MCList<Srch_TgtR> up1SubList, MCGroupByPolicy sumGp) {
			MCNumber firstQty = getQty(firstRow);
			MCNumber firstContQty = firstRow.cont_qty();
			MCNumber notAllocQty = firstQty;
			MCNumber notAllocContQty = firstContQty;
			boolean allocFlg = false;

			// 代替品目引当優先順位の優先するものからロット提案を行う
			for (Srch_TgtR r :up1SubList) {
				// ロット提案対象を作成
				Avl_ListR giRow = Avl_ListR.create();
				copy(giRow, r, createMap_Avl_ListR_Srch_TgtR());
				if (r.chk_cont_fctr_flg() && (!r.pack_alloc_flg() || r.pack_alloc_flg() && isSame(r.pack_unit_cd(), r.base_unit_cd()))) {
					if (r.pack_alloc_flg()) {
						giRow.cont_qty(notAllocContQty.multiply(r.cont_qty()).divide(firstContQty, r.pack_unit_dec_place().intValue(), MAC_RND_TYP.RNDUP.toMC()));
					}
					else {
						giRow.cont_qty(notAllocContQty.multiply(r.cont_qty()).divide(firstContQty, r.base_unit_dec_place().intValue(), MAC_RND_TYP.RNDUP.toMC()));
					}
				}
				if (r.pack_alloc_flg()) {
					giRow.pack_unit_qty(notAllocQty.multiply(r.pack_unit_qty()).divide(firstQty, r.pack_unit_dec_place().intValue(),MAC_RND_TYP.RNDUP.toMC()));
				}
				else {
					giRow.base_unit_qty(notAllocQty.multiply(r.base_unit_qty()).divide(firstQty, r.base_unit_dec_place().intValue(),MAC_RND_TYP.RNDUP.toMC()));
				}
				MCList<Avl_ListR> giList = MCList.create(Avl_ListR.class);
				giList.add(giRow);

				// ロット提案
				MCList<Srch_RsltR> retL = execAvl04Sv(up2(), giList, false, false, true, up0().short_ope_typ(), _propLoc);
				if (retL.size() > 0) {
					// 下り電文の設定
					down0().addAll(retL);

					// 引当残数の計算
					Srch_RsltR retR = retL.groupBy(sumGp).get(0);
					notAllocQty = notAllocQty.subtract(getQty(retR, r.pack_alloc_flg()).multiply(firstQty)
							.divide(r.base_unit_qty(), r.base_unit_dec_place().intValue(), MAC_RND_TYP.CUTOFF.toMC()));
					if (r.chk_cont_fctr_flg() && (!r.pack_alloc_flg() || r.pack_alloc_flg() && isSame(r.pack_unit_cd(), r.base_unit_cd()))) {
						notAllocContQty = notAllocContQty.subtract(retR.cont_qty().multiply(firstContQty)
								.divide(r.cont_qty(), r.cont_fctr_dec_place().intValue(), MAC_RND_TYP.CUTOFF.toMC()));
						if (!notAllocContQty.isPositive()) {
							allocFlg = true;
							break;
						}
					}
					else if (!notAllocQty.isPositive()) {
						allocFlg = true;
						break;
					}
				}
			}

			if (!allocFlg) {
				setDown1(firstRow, notAllocQty, notAllocContQty);
			}
		}

		protected void setDown1(Srch_TgtR firstRow, MCNumber notAllocQty, MCNumber notAllocContQty) {
			Alt_UnAvlR down1 = Alt_UnAvlR.create();
			copy(down1, firstRow, createMap_Alt_UnAvlR_Srch_TgtR());
			down1.not_alloc_qty(notAllocQty);
			down1.not_alloc_cont_qty(notAllocContQty);
			down1().add(down1);
		}

		// 混在不可・引当優先順
		protected void doCalcAltPrio(Srch_TgtR firstRow, MCList<Srch_TgtR> up1SubList, MCGroupByPolicy sumGp) {
			boolean allocFlg = false;

			// 代替品目引当優先順位の優先するものからロット提案を行う
			for (Srch_TgtR r :up1SubList) {
				// ロット提案対象を作成
				Avl_ListR giRow = Avl_ListR.create();
				copy(giRow, r, createMap_Avl_ListR_Srch_TgtR());
				MCList<Avl_ListR> giList = MCList.create(Avl_ListR.class);
				giList.add(giRow);

				// ロット提案
				MCList<Srch_RsltR> retL = execAvl04Sv(up2(), giList, false, false, true, up0().short_ope_typ(), _propLoc);

				// ロット提案されたら処理を終了する
				if (retL.size() > 0) {

					// 引当残数の計算
					Srch_RsltR retR = retL.groupBy(sumGp).get(0);
					MCNumber notAllocQty;
					if (r.chk_cont_fctr_flg() && (!r.pack_alloc_flg() || r.pack_alloc_flg() && isSame(r.pack_unit_cd(), r.base_unit_cd()))) {
						notAllocQty = r.cont_qty().subtract(retR.cont_qty());
					}
					else {
						notAllocQty = getQty(r)
								.subtract(getQty(retR, r.pack_alloc_flg()));
					}
					if (!notAllocQty.isZero()) {
						continue;
					}
					down0().addAll(retL);
					allocFlg = true;
					break;
				}
			}

			if (!allocFlg) {
				setDown1(firstRow, getQty(firstRow), firstRow.cont_qty());
			}
		}

		protected String[] _subListKey = new String[]{Srch_TgtR.$itm_cd, Srch_TgtR.$itm_sub1, Srch_TgtR.$itm_sub2, Srch_TgtR.$itm_sub3};
		// 混在不可・最古入庫日優先
		protected void doCalcAltFifo(Srch_TgtR firstRow, MCList<Srch_TgtR> up1SubList, MCGroupByPolicy sumGp) {
			// 全ての代替品で一度ロット提案を行う
			// 仮のロット提案なのでup2()の数量が変わらないようクローンを作成する。
			MCList<Avl_ListR> up2Tmp = up2().clone();

			MCList<Srch_TgtR> up1SubListTmp = up1SubList.clone();
			for(Srch_TgtR r : up1SubListTmp) {
				r.not_lot_fix_flg(false);
			}
			// ロット提案対象を作成
			MCList<Avl_ListR> giList = MCList.create(Avl_ListR.class);
			addAll(giList, up1SubListTmp, createMap_Avl_ListR_Srch_TgtR());

			// ロット提案
			MCList<Srch_RsltR> retL = execAvl04Sv(up2Tmp, giList, false, false, true, up0().short_ope_typ(), _propLoc);
			if (retL.isEmpty()) {
				setDown1(firstRow, getQty(firstRow), firstRow.cont_qty());
				return;
			}

			// 「有効期限」「最古入庫日」「ロットシーケンス」「使用可能予定日」でソートし、最も古い引当可能在庫の代替子品目を提案対象とする
			MCSortPolicy p = new MCSortPolicy();
			p.add(SortType.ASC, Avl_ListR.$vld_dt);
			p.add(SortType.ASC, Avl_ListR.$first_gr_dt);
			p.add(SortType.ASC, Avl_ListR.$lot_seq);
			p.add(SortType.ASC, Avl_ListR.$schd_dt);
			if ("true".equals(_autotest)) {
				for (String col :Srch_RsltR.colnames()) {
					p.add(SortType.ASC, col);
				}
			}
			retL.sort(p);

			// 取得された提案対象を対象としてロット提案対象を作成
			Srch_TgtR tgtUp1 = up1SubList.getFirst(_subListKey, retL.get(0).toArray(_subListKey));
			Avl_ListR giRow = Avl_ListR.create();
			copy(giRow, tgtUp1, createMap_Avl_ListR_Srch_TgtR());
			giList.clear();
			giList.add(giRow);

			// ロット提案
			retL.setAll(execAvl04Sv(up2(), giList, false, false, true, up0().short_ope_typ(), _propLoc));
			down0().addAll(retL);

			// 引当残数の計算
			Srch_RsltR retR = retL.groupBy(sumGp).get(0);
			MCNumber notAllocQty = getQty(tgtUp1).subtract(getQty(retR, tgtUp1.pack_alloc_flg()));
			if (tgtUp1.chk_cont_fctr_flg() && (!tgtUp1.pack_alloc_flg() || tgtUp1.pack_alloc_flg() && isSame(tgtUp1.pack_unit_cd(), tgtUp1.base_unit_cd()))) {
				MCNumber notAllocContQty = tgtUp1.cont_qty().subtract(retR.cont_qty());
				if (notAllocContQty.isPositive()) {
					setDown1(giRow, firstRow, notAllocQty, notAllocContQty);
				}
			}
			else if (notAllocQty.isPositive()) {
				setDown1(giRow, firstRow, notAllocQty, null);
			}
		}

		protected void setDown1(Avl_ListR giRow, Srch_TgtR firstRow, MCNumber notAllocQty, MCNumber notAllocContQty) {
			Alt_UnAvlR down1 = Alt_UnAvlR.create();
			copy(down1, giRow, createMap_Alt_UnAvlR_Avl_ListR());
			down1.not_alloc_qty(notAllocQty);
			down1.not_alloc_cont_qty(notAllocContQty);
			down1().add(down1);
		}

		protected MCNumber getQty(MCRow r) {
			return getQty(r, r.getBoolean(Srch_TgtR.$pack_alloc_flg));
		}

		protected MCNumber getQty(MCRow r, boolean pack_alloc_flg) {
			MCNumber qty = null;

			if (pack_alloc_flg) {
				qty = r.getNumber(Srch_TgtR.$pack_unit_qty);
			}
			else {
				qty = r.getNumber(Srch_TgtR.$base_unit_qty);
			}
			return qty;
		}

		protected void setDown() {
			// down0、down1、down3は設定済みなのでdown2を設定する
			down2().addAll(up2());
		}

		protected Map_Alt_UnAvlR_Srch_TgtR<Alt_UnAvlR,Srch_TgtR> createMap_Alt_UnAvlR_Srch_TgtR() {
			return new Map_Alt_UnAvlR_Srch_TgtR<Alt_UnAvlR, Srch_TgtR>();
		}

		public class Map_Alt_UnAvlR_Srch_TgtR<D extends Alt_UnAvlR, S extends Srch_TgtR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Alt_UnAvlR.$peg_no, Srch_TgtR.$peg_no);
				addColumnPathMap(Alt_UnAvlR.$alt_grp_cd, Srch_TgtR.$alt_grp_cd);
				addColumnPathMap(Alt_UnAvlR.$alt_grp_seq, Srch_TgtR.$alt_grp_seq);
				addColumnPathMap(Alt_UnAvlR.$oper_inst_no, Srch_TgtR.$oper_inst_no);
				addColumnPathMap(Alt_UnAvlR.$itm_cd, Srch_TgtR.$itm_cd);
				addColumnPathMap(Alt_UnAvlR.$itm_sub1, Srch_TgtR.$itm_sub1);
				addColumnPathMap(Alt_UnAvlR.$itm_sub2, Srch_TgtR.$itm_sub2);
				addColumnPathMap(Alt_UnAvlR.$itm_sub3, Srch_TgtR.$itm_sub3);
				addColumnPathMap(Alt_UnAvlR.$ver_no, Srch_TgtR.$ver_no);
//				addColumnPathMap(Alt_UnAvlR.$not_alloc_qty, );
//				addColumnPathMap(Alt_UnAvlR.$not_alloc_cont_qty, );
				addColumnPathMap(Alt_UnAvlR.$cont_fctr_flg, Srch_TgtR.$cont_fctr_flg);
//				addColumnPathMap(Alt_UnAvlR.$itm_nm, );
//				addColumnPathMap(Alt_UnAvlR.$alt_grp_nm, );
			}
		}

		protected Map_Alt_UnAvlR_Avl_ListR<Alt_UnAvlR,Avl_ListR> createMap_Alt_UnAvlR_Avl_ListR() {
			return new Map_Alt_UnAvlR_Avl_ListR<Alt_UnAvlR, Avl_ListR>();
		}

		public class Map_Alt_UnAvlR_Avl_ListR<D extends Alt_UnAvlR, S extends Avl_ListR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Alt_UnAvlR.$peg_no, Avl_ListR.$peg_no);
				addColumnPathMap(Alt_UnAvlR.$alt_grp_cd, Avl_ListR.$alt_grp_cd);
				addColumnPathMap(Alt_UnAvlR.$alt_grp_seq, Avl_ListR.$alt_grp_seq);
				addColumnPathMap(Alt_UnAvlR.$oper_inst_no, Avl_ListR.$oper_inst_no);
				addColumnPathMap(Alt_UnAvlR.$itm_cd, Avl_ListR.$itm_cd);
				addColumnPathMap(Alt_UnAvlR.$itm_sub1, Avl_ListR.$itm_sub1);
				addColumnPathMap(Alt_UnAvlR.$itm_sub2, Avl_ListR.$itm_sub2);
				addColumnPathMap(Alt_UnAvlR.$itm_sub3, Avl_ListR.$itm_sub3);
				addColumnPathMap(Alt_UnAvlR.$ver_no, Avl_ListR.$ver_no);
				addColumnPathMap(Alt_UnAvlR.$cont_fctr_flg, Avl_ListR.$cont_fctr_flg);
			}
		}
	}
	/**
	 * Alloc_Srch03オペレーション.<p>
	 *
	 * 指定された条件に適する在庫や入庫予定を算出する（総量引当版）<br>
	 */
	public class Alloc_Srch03 extends MSBEL_AllocMngService_MC_A.Alloc_Srch03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCList<Avl_ListR> up = MCList.create(Avl_ListR.class);
			addAll(up, up1(), createMap_Avl_ListR_Srch_TgtR());
			down0().addAll(execAvl04Sv(up2(), up, false, false, true, up0().short_ope_typ(), _propGrs));
			down1().addAll(up2());
			addAll(down2(), up, createMap_Srch_TgtR_Avl_ListR());
		}
	}
	/**
	 * Alloc_Avl_Srch01オペレーション.<p>
	 *
	 * 在庫や入庫予定から引当済みの出庫予定を減算して使用可能在庫を取得する<br>
	 */
	public class Alloc_Avl_Srch01 extends MSBEL_AllocMngService_MC_A.Alloc_Avl_Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
//			MCLog.developDebug("============ 引当開始 ============" +"\t"+ System.currentTimeMillis());
			editUp();
			MCList<Avl_ListR> avlList = MCList.create(Avl_ListR.class);		// 使用可能在庫（場所引当）
			MCList<Avl_ListR> avlGrsList = MCList.create(Avl_ListR.class);	// 使用可能在庫（総量引当）
			MCList<Avl_ListR> avlLgList = MCList.create(Avl_ListR.class);	// 使用可能在庫（物流Ｇ分）
			MCList<Lno_ListR> lnoList = MCList.create(Lno_ListR.class);	// 出庫と入庫の紐づきを保持するリスト

//			MCLog.developDebug("============ 在庫、受払予定を取得する ============" +"\t"+ System.currentTimeMillis());
			// 在庫、受払予定を取得する
			MCList<Avl_ListR> list = doSrch();
			getLotBackStopTyp(list);
			MCDate ignoreMarginDt = getIgnoreMarginDt();
			chkContFctr(up0().cont_fctr_calc_flg(), list);
			setAllocGrpNonTgtFlg(list);
			getSchdStk(list);
			
			// 品目マスタを取得する
			initMamItmCache(list);
			//場所マスタを取得する（在庫場所）
			initStkLocCache(list);
			
			chkUpMatch(ignoreMarginDt);

			lotTraceCache(_grList);

//			MCLog.developDebug("============ 在庫優先引当ＦＬＧがオンのレコードをロット提案する（場所引当） ============" +"\t"+ System.currentTimeMillis());
			// 在庫優先引当ＦＬＧがオンのレコードをロット提案する（場所引当）
			editPackAllocFlg(up0(), _stkLocList, true);
			execSrch02Sv(avlList, _stkAllocLocTgtL, _stkLocList);

//			MCLog.developDebug("============ 在庫優先引当ＦＬＧがオンのレコードをロット提案する（総量引当） ============" +"\t"+ System.currentTimeMillis());
			// 在庫優先引当ＦＬＧがオンのレコードをロット提案する（総量引当）
			execSrch03Sv(avlList, _stkAllocGrsTgtL, null);
			editPackAllocFlg(up0(), avlList, false);
//			MCLog.developDebug("============ 全レコードが在庫優先引当ＦＬＧ=1の場合 ============" +"\t"+ System.currentTimeMillis());
			// 全レコードが在庫優先引当ＦＬＧ=1の場合
			if (up0().all_pri_flg() && _notSchdSrchFlg) {
				return;
			}

			// 引当保留は無し
			if (_exceptAllocWaitLocTgtL.isEmpty() && _exceptAllocWaitGrsTgtL.isEmpty()) {
//				MCLog.developDebug("============ 引当保留は無し ============" +"\t"+ System.currentTimeMillis());
				// 使用可能在庫算出サービスの呼び出し
				_giFixList.addAll(_giWaitFixList);
				_giNotFixList.addAll(_giNotWaitFixList);
				_grsGiList.addAll(_grsGiWaitList);
				execAvlSv(list, avlList,
						avlLgList, _grList, _giFixList, _giNotFixList,
						avlGrsList, _grsGiList, lnoList, ignoreMarginDt);
			}
			// 引当保留を考慮する
			else {
//				MCLog.developDebug("============ 引当保留を考慮する ============" +"\t"+ System.currentTimeMillis());
				// 使用可能在庫算出サービスの呼び出し（引当保留除く）
				execAvlSv(list, avlList,
						avlLgList, _grList, _giFixList, _giNotFixList,
						avlGrsList, _grsGiList, lnoList, ignoreMarginDt);

				// 引当保留除外ＦＬＧがオンのレコードのロット提案で、取消対象の出庫予定が引き当てた在庫・入庫予定のリストを考慮する
				avlList.addAll(_canGrList);
				_canGrList.clear();

				// 引当保留除外ＦＬＧがオンのレコードをロット提案する（場所引当）
				execSrch02Sv(avlList, _exceptAllocWaitLocTgtL, null);

				// 引当保留除外ＦＬＧがオンのレコードをロット提案する（総量引当）
				execSrch03Sv(avlList, _exceptAllocWaitGrsTgtL, avlGrsList);

				// 全レコードが在庫優先引当ＦＬＧ=1または引当保留除外ＦＬＧ=1の場合
				if (up0().all_pri_flg() || up0().except_alloc_wait_flg()) {
					// 使用可能在庫を場所引当と総量引当に分割する
					splitAvlList(avlList.clone(), avlList, avlGrsList);
					setDown(avlList, avlGrsList, lnoList);
					return;
				}
				else {
					MCList<Avl_ListR> avlListTmp = avlList.clone();
					avlListTmp.addAll(avlLgList);
					splitAvlList(avlListTmp, avlList, avlGrsList);
				}

				// 使用可能在庫算出サービスの呼び出し（引当保留分）
				execAvlSv(list, avlList,
						avlLgList, avlLgList.clone(), _giWaitFixList, _giNotWaitFixList,
						avlGrsList, _grsGiWaitList, lnoList, ignoreMarginDt);
			}

//			MCLog.developDebug("============ 下り電文の設定 ============" +"\t"+ System.currentTimeMillis());
			// 下り電文の設定
			setDown(avlList, avlGrsList, lnoList);
//			MCLog.developDebug("============ 引当終了 ============" +"\t"+ System.currentTimeMillis());
		}

		protected void lotTraceCache(MCList<Avl_ListR> grList) {
			if (up6().isEmpty()) {
				return;
			}
			setPegNo(grList);
			MSBFL_LotTraceService.LotTrace_Chk01 lotTrace = MSBFL_LotTraceService.crtLotTrace_Chk01();
			lotTrace.up1().no_err_msg_flg(true);
			lotTrace.up1().lst_reg_flg(true);
			MCIndexKey giIdxKey = up6().createIndex(Avl_ListR.$itm_cd, Avl_ListR.$itm_sub1, Avl_ListR.$itm_sub2, Avl_ListR.$itm_sub3, Avl_ListR.$chk_ship_flg);
			
			for (Avl_ListR r : grList) {
				if(isNull(up6().getFirst(giIdxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), true)) || isNullOr(r.lot_no(), r.sublot_no())) {
					continue;
				}
				LotTrace_Chk01_RsltR upR = LotTrace_Chk01_RsltR.create();
				copy(upR, r, createMap_LotTrace_Chk01_RsltR_Avl_ListR());
				lotTrace.up0().add(upR);
			}
			
			if (!lotTrace.up0().isEmpty()) {
				lotTrace.exec();
				MCList<LotTrace_Chk01_RsltR> lotTraceRsltL = lotTrace.down0();
				if (!lotTraceRsltL.isEmpty()) {
					String[] srcCols = new String[]{LotTrace_Chk01_RsltR.$err_flg};
					String[] destCols = new String[]{Avl_ListR.$lot_trace_err_flg};
					copyByPegNo(grList, destCols, lotTraceRsltL, srcCols);
				}
			}

		}

		protected Map_LotTrace_Chk01_RsltR_Avl_ListR<LotTrace_Chk01_RsltR,Avl_ListR> createMap_LotTrace_Chk01_RsltR_Avl_ListR() {
			return new Map_LotTrace_Chk01_RsltR_Avl_ListR<LotTrace_Chk01_RsltR, Avl_ListR>();
		}

		public class Map_LotTrace_Chk01_RsltR_Avl_ListR<D extends LotTrace_Chk01_RsltR, S extends Avl_ListR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(LotTrace_Chk01_RsltR.$peg_no, Avl_ListR.$peg_no);
				addColumnPathMap(LotTrace_Chk01_RsltR.$itm_cd, Avl_ListR.$itm_cd);
				addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub1, Avl_ListR.$itm_sub1);
				addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub2, Avl_ListR.$itm_sub2);
				addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub3, Avl_ListR.$itm_sub3);
				addColumnPathMap(LotTrace_Chk01_RsltR.$lot_no, Avl_ListR.$lot_no);
				addColumnPathMap(LotTrace_Chk01_RsltR.$sublot_no, Avl_ListR.$sublot_no);
				addColumnPathMap(LotTrace_Chk01_RsltR.$sno1, Avl_ListR.$sno1);
				addColumnPathMap(LotTrace_Chk01_RsltR.$sno2, Avl_ListR.$sno2);
				addColumnPathMap(LotTrace_Chk01_RsltR.$sno3, Avl_ListR.$sno3);
				addColumnPathMap(LotTrace_Chk01_RsltR.$sno4, Avl_ListR.$sno4);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.skip_chk_ship_flg(false);
				dest.plnt_aprv_flg(false);
				dest.site_cd(getStkLocCache(src).site_cd());
			}
		}

		/**
		 * ロット逆転禁止区分を設定する。
		 * @param listL
		 */
		protected void getLotBackStopTyp(MCList<Avl_ListR> listL) {
			
			MCList<Avl_ListR> tgtL = listL.subList(r -> MSC_IO_SCHD_TYP.isSLS(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isSHIP_OUT(r.io_schd_typ()));
			
			if (!isNull(tgtL)) {
				MCList<MAM_BP_R> dbcL = MCList.create(MAM_BP_R.class);
				
				MST_IO_SCHD_R t1 = MST_IO_SCHD_R.create("T1");
				MST_SLO_R t2 = MST_SLO_R.create("T2");
				MAM_BP_R m1 = MAM_BP_R.create("M1");
				
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
				bldr.setSelect(t1.io_schd_no, m1.bp_cd, m1.lot_back_stop_typ);
				bldr.addInnerJoin(t2, t2.slo_no.eq(t1.io_schd_sub_no1));
				bldr.addInnerJoin(m1, m1.bp_cd.eq(t2.cst_cd));
				bldr.setWhere(t1.io_schd_no.eq(bind(Avl_ListR.$io_schd_no)));
				bldr.addWhereWithAnd(t1.io_schd_sub_typ1.eq(value(MSC_IO_SCHD_SUB_TYP.SLO_NO.value())));
				
				dbSelect("MSBEL5040_MAM_BP_S02", dbcL, bldr, tgtL);
				
				MCIndexKey Idx = dbcL.createIndex(MST_IO_SCHD_R.$io_schd_no);
				for (Avl_ListR tgtR : tgtL) {
					MAM_BP_R dbcR = dbcL.getFirst(Idx, tgtR.io_schd_no());
					if (!isNull(dbcR)) {
						tgtR.cst_cd(dbcR.bp_cd());
						tgtR.lot_back_stop_typ(dbcR.lot_back_stop_typ());
					}
				}
			}
		}

		protected MCList<Srch_TgtR> _stkAllocLocTgtL = MCList.create(Srch_TgtR.class);			// 在庫優先引当ＦＬＧがオンのリスト（場所引当）
		protected MCList<Srch_TgtR> _stkAllocGrsTgtL = MCList.create(Srch_TgtR.class);			// 在庫優先引当ＦＬＧがオンのリスト（総量引当）
		protected MCList<Srch_TgtR> _exceptAllocWaitLocTgtL = MCList.create(Srch_TgtR.class);	// 引当保留除外ＦＬＧがオンのリスト（場所引当）
		protected MCList<Srch_TgtR> _exceptAllocWaitGrsTgtL = MCList.create(Srch_TgtR.class);	// 引当保留除外ＦＬＧがオンのリスト（総量引当）
		protected MCList<Avl_ListR> _canGrList = MCList.create(Avl_ListR.class);				// 取消対象の出庫予定が引き当てた在庫・入庫予定のリスト
		boolean _notSchdSrchFlg = true;
		protected void editUp() {
			for (Srch_TgtR r :up1()) {
				if (r.stk_alloc_flg()) {
					if (MAC_ALLOC_SCOPE_TYP.isLOC(r.alloc_scope_typ())) {
						_stkAllocLocTgtL.add(r);
					}
					else if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(r.alloc_scope_typ())) {
						_stkAllocGrsTgtL.add(r);
					}
				}
				else if (up0().except_alloc_wait_flg() || r.except_alloc_wait_flg()) {
					if (MAC_ALLOC_SCOPE_TYP.isLOC(r.alloc_scope_typ())) {
						_exceptAllocWaitLocTgtL.add(r);
					}
					else if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(r.alloc_scope_typ())) {
						_exceptAllocWaitGrsTgtL.add(r);
					}
					_notSchdSrchFlg = false;
				}
			}

			if (up0().gi_alloc_flg()) {
				if (up6().isEmpty()) {
					up0().gi_alloc_flg(false);
				}
			}
		}

		protected MCList<Avl_ListR> doSrch() {

			if (!up3().isEmpty()) return up3();

			MCList<Avl_ListR> list = MCList.create(Avl_ListR.class);
			executeQuery(list, _getQuery(up0(), up2(), _notSchdSrchFlg, null), up0());
			return list;
		}

		protected MCDate getIgnoreMarginDt() {
			MCDate ignoreMarginDt;
			if (isNull(up0().ignore_margin_days())) {
				ignoreMarginDt = null;
			}
			else {
				ignoreMarginDt = getToday().addDay(up0().ignore_margin_days());
			}
			return ignoreMarginDt;
		}

		protected void chkContFctr(boolean flg, MCList<Avl_ListR> list) {
			if (!flg) list.setBoolean(Avl_ListR.$chk_cont_fctr_flg, false);
		}

		/**
		 * 総量引当時対象外ＦＬＧの設定
		 * 
		 *  移動・移送の入庫予定に対する出庫予定が未引当の場合、入庫予定は引当対象としない。
		 *  ※例えば「在庫」→「移送の出庫予定」→「移送の入庫予定」という受払予定の場合、出庫予定が未引当だと「在庫」と「移送の入庫予定」が両方とも使用可能となってしまう。
		 *  そのため、_getQueryメソッドで移動・移送の入庫予定を抽出する際に出庫予定の引当フラグを参照しているが、以下の条件により使用可能とするかどうかの判断が変わる。
		 *  1.入庫場所と出庫場所のＷＧが同じ場合：入庫予定は使用不可
		 *  2.入庫場所と出庫場所のＷＧが異なる場合
		 *  	2-1.ロット提案対象が総量引当対象の場合
		 *  		2-1-1.入庫場所と出庫場所の総量引当場所グループが同じ場合：入庫予定は使用不可
		 *  		2-1-2.入庫場所と出庫場所の総量引当場所グループが異なる場合：入庫予定は使用可能
		 *  	2-2.ロット提案対象が場所引当対象の場合：入庫予定は使用可能
		 *  ここで2-1.ロット提案対象が総量引当対象かどうかを判断するとき、ロット提案対象の明細ごとに総量引当かどうか指定できるため、一律に制御できない。
		 *  そのため、一律に総量引当かどうか判断できないのでＷＧが異なる入庫予定をすべて取得し、propAvlメソッドで判断する。
		 *  このメソッドでは入庫予定が総量引当時に使用不可（対象外）になるかどうかを判断するためのフラグを設定する。
		 * 
		 * @param list
		 */
		protected void setAllocGrpNonTgtFlg(MCList<Avl_ListR> list) {

			// listから総量引当グループが設定された移動・移送の入庫予定を抽出
			MCList<Avl_ListR> grL = list.subList(r -> MSC_IO_SCHD_TYP.is_xfr_gr_all(r.io_schd_typ()) && !isNull(r.stk_alloc_grp_cd()));

			if (grL.isEmpty()) {
				return;
			}

			// 入庫予定の受払予定区分から抽出対象の出庫予定の受払予定区分を判断し、出庫リストを作成する。（入庫の受払予定と出庫の受払予定区分は１：Ｎとなる。）
			MCList<Avl_ListR> giL = MCList.create(Avl_ListR.class);
			for (Avl_ListR grR : grL.groupBy(Avl_ListR.$io_schd_no,
					Avl_ListR.$io_schd_typ, Avl_ListR.$io_schd_sts_typ, Avl_ListR.$gr_wg_cd,
					Avl_ListR.$stk_alloc_grp_cd)) {

				// ループ内ループだが、ループ回数が最大５回のためパフォーマンスへの影響は極小
				for (String giIoSchdTyp : getGrIoSchdTyp(grR.io_schd_typ())) {
					Avl_ListR giR = grR.clone();
					giR.setStringNE("gi_io_schd_typ", giIoSchdTyp);
					giL.add(giR);
				}
			}

			// 受払予定ＮＯ（一致）、受払予定状況区分（一致）、ＷＧＣＤ（不一致）、総量引当場所グループ（一致）で未引当の移動・移送の受払予定（出庫）を取得
			MCList<MST_IO_SCHD_R> dbcL = MCList.create(MST_IO_SCHD_R.class);
			MST_IO_SCHD_R t = MST_IO_SCHD_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			MAM_LOC_R m = MAM_LOC_R.create("M");
			dbcL_bldr.setSelect(t.io_schd_no, t.io_schd_sts_typ, t.io_schd_typ);
			dbcL_bldr.addInnerJoin(m, bracket( m.loc_cd.eq(t.loc_cd)
					.and(m.del_flg.eq(value(false)))));
			dbcL_bldr.addWhereWithAnd(t.io_schd_no.eq(bind("io_schd_no")));
			dbcL_bldr.addWhereWithAnd(t.io_schd_typ.eq(bind("gi_io_schd_typ")));
			dbcL_bldr.addWhereWithAnd(t.io_schd_sts_typ.eq(bind("io_schd_sts_typ")));
			dbcL_bldr.addWhereWithAnd(t.wg_cd.neq(bind("gr_wg_cd")));
			dbcL_bldr.addWhereWithAnd(m.alloc_grp_cd.eq(bind("stk_alloc_grp_cd")));
			dbcL_bldr.addWhereWithAnd(MSC_IO_SCHD_TYP$IS_XFR_GI_ALL(t.io_schd_typ).eq(value(true)));
			dbcL_bldr.addWhereWithAnd(t.alloc_flg.eq(value(false)));
			if (!up0().except_alloc_wait_flg()) {
				dbcL_bldr.addWhereWithAnd(t.alloc_wait_flg.eq(value(false)));
			}
			dbSelect("MSBEL5040_MST_IO_SCHD_S02", dbcL, dbcL_bldr, giL);

			if (dbcL.isEmpty()) {
				return;
			}

			MCIndexKey giIndex = dbcL.createIndex(MST_IO_SCHD_R.$io_schd_no,
					MST_IO_SCHD_R.$io_schd_sts_typ, MST_IO_SCHD_R.$io_schd_typ);

			MCIndexKey grIndex = grL.createIndex(Avl_ListR.$io_schd_no,
					Avl_ListR.$io_schd_sts_typ, Avl_ListR.$io_schd_typ);

			// 出庫リストの受払予定ＮＯ、受払予定状況区分、出庫の受払予定区分で抽出した受払予定（出庫）を参照し、
			// 存在する場合は出庫リストの受払予定ＮＯ、受払予定状況区分、入庫の受払予定区分で入庫予定を抽出し、総量引当時対象外ＦＬＧをオンにする
			for (Avl_ListR giR : giL) {
				MST_IO_SCHD_R dbcR = dbcL.getFirst(giIndex, giR.io_schd_no(), giR.io_schd_sts_typ(), giR.getStringNE("gi_io_schd_typ"));
				if (!isNull(dbcR)) {
					MCList<Avl_ListR> grSubL = grL.subList(grIndex, giR.io_schd_no(), giR.io_schd_sts_typ(), giR.io_schd_typ());
					if (!grSubL.isEmpty()) {
						grSubL.setBooleanNE(Avl_ListR.$alloc_grp_non_tgt_flg, true);
					}
				}
			}
		}

		/**
		 * 入庫予定の受払予定区分に対する出庫予定の受払予定区分を返します。
		 * @param grIoSchdTyp 入庫の受払予定区分
		 * @return 出庫の受払予定区分のセット
		 */
		protected HashSet<String> getGrIoSchdTyp(String giIoSchdTyp) {

			// 移送入庫、移送入庫（支給）、移送返品入庫、移送返品入庫（支給）
			if (MSC_IO_SCHD_TYP.isXFR_GR(giIoSchdTyp)
					|| MSC_IO_SCHD_TYP.isXFR_GR_PROV(giIoSchdTyp)
					|| MSC_IO_SCHD_TYP.isXFR_RTN_GR(giIoSchdTyp)
					|| MSC_IO_SCHD_TYP.isXFR_RTN_GR_PROV(giIoSchdTyp)) {
				// 出荷（輸出）、移送出庫、移送出庫（支給）、移送返品出庫、移送返品出庫（支給）
				return new HashSet<String>(
						Arrays.asList(MSC_IO_SCHD_TYP.SHIP_OUT_EX.value(),
								MSC_IO_SCHD_TYP.XFR_GI.value(),
								MSC_IO_SCHD_TYP.XFR_GI_PROV.value(),
								MSC_IO_SCHD_TYP.XFR_RTN_GI.value(),
								MSC_IO_SCHD_TYP.XFR_RTN_GI_PROV.value()));
			}
			// 移動入庫、移動入庫（支給）、移動返品入庫、移動返品入庫（支給）
			else if (MSC_IO_SCHD_TYP.isMOVE_GR(giIoSchdTyp)
					|| MSC_IO_SCHD_TYP.isMOVE_GR_PROV(giIoSchdTyp)
					|| MSC_IO_SCHD_TYP.isMOVE_RTN_GR(giIoSchdTyp)
					|| MSC_IO_SCHD_TYP.isMOVE_RTN_GR_PROV(giIoSchdTyp)) {
				// 移動出庫、移動出庫（支給）、移動返品出庫、移動返品出庫（支給）
				return new HashSet<String>(Arrays.asList(MSC_IO_SCHD_TYP.MOVE_GI.value(),
						MSC_IO_SCHD_TYP.MOVE_GI_PROV.value(),
						MSC_IO_SCHD_TYP.MOVE_RTN_GI.value(),
						MSC_IO_SCHD_TYP.MOVE_RTN_GI_PROV.value()));
			}
			return new HashSet<String>();
		}

		protected MCList<Avl_ListR> _stkLocList = MCList.create(Avl_ListR.class);		// 提案対象と一致する在庫（プラス数量）
		protected MCList<Avl_ListR> _grList = MCList.create(Avl_ListR.class);			// 在庫（プラス数量）＋引当対象ＦＬＧがオンの入庫予定
		protected MCList<Avl_ListR> _giFixList = MCList.create(Avl_ListR.class);		// 在庫（マイナス数量）＋場所引当ＦＬＧがオン、ロット指定なしＦＬＧがオフの出庫予定
		protected MCList<Avl_ListR> _giNotFixList = MCList.create(Avl_ListR.class);		// 場所引当ＦＬＧがオン、ロット指定なしＦＬＧがオンの出庫予定
		protected MCList<Avl_ListR> _grsGiList = MCList.create(Avl_ListR.class);		// 総量引当ＦＬＧがオンの出庫予定
		protected MCList<Avl_ListR> _giWaitFixList = MCList.create(Avl_ListR.class);	// 在庫（マイナス数量）＋場所引当ＦＬＧがオン、ロット指定なしＦＬＧがオフの出庫予定
		protected MCList<Avl_ListR> _giNotWaitFixList = MCList.create(Avl_ListR.class);	// 引当保留ＦＬＧがオンの出庫予定
		protected MCList<Avl_ListR> _grsGiWaitList = MCList.create(Avl_ListR.class);	// 引当保留ＦＬＧがオンの出庫予定（総量引当）

		protected void getSchdStk(MCList<Avl_ListR> list) {

			MCList<Loc_ListR> locList = MCList.create(Loc_ListR.class);
			MSW_ALLOC_LOCK_KEY_R key = MSW_ALLOC_LOCK_KEY_R.create("W");
			MCQueryApiBuilder keyBldr = MCQueryApiBuilder.create(key);
			keyBldr.setSelect(key.itm_cd);
			keyBldr.addSelect(key.itm_sub1);
			keyBldr.addSelect(key.itm_sub2);
			keyBldr.addSelect(key.itm_sub3);
			keyBldr.addSelect(key.loc_cd.as("STK_LOC_CD"));
			dbSelect("MSBEL5040_MSW_ALLOC_LOCK_KEY_S01", locList, keyBldr);

			String[] idxKey = Loc_ListR.colnames();
			MCIndexKey idx = locList.createIndex(idxKey);

			boolean up1Size = _stkAllocLocTgtL.size() > 0 || _stkAllocGrsTgtL.size() > 0;
			boolean flg = up6().isEmpty();

			// 取消対象の出庫予定のリストに対してインデックスを設定
			MCList<Srch_Io_SchdR> up5L = MCList.create(Srch_Io_SchdR.class);
			for (Srch_Io_SchdR r :up5()) {
				if (MSC_IO_SCHD_TYP.isSLS(r.io_schd_typ())) {
					Srch_Io_SchdR up5R = up5L.add();
					up5R.io_schd_typ(MSC_IO_SCHD_TYP.SLS_ACXFR.value());
					up5R.io_schd_sts_typ(r.io_schd_sts_typ());
					up5R.io_schd_no(r.io_schd_no());
				}
			}
			up5().addAll(up5L);
			if (!up5().isEmpty()) {
				MCIndexKey rmGiIdx = list.createIndex(Avl_ListR.$io_schd_typ, Avl_ListR.$io_schd_sts_typ, Avl_ListR.$io_schd_no);
				MCList<Avl_ListR> tgtL = MCList.create(Avl_ListR.class);
				up5().forEach(r -> {
					tgtL.addAll(list.subList(rmGiIdx, r.io_schd_typ(), r.io_schd_sts_typ(), r.io_schd_no()));
				});
				if (!tgtL.isEmpty()) {
					list.removeAll(tgtL);
				}
			}

			// 総量・場所引当制御マスタから引当優先順を取得する
			boolean flg2 = false;
			for (Avl_ListR r :list) {
				if (MSC_SCHD_STK_TYP.isGRS_GI_SCHD(r.schd_stk_typ())
						|| MSC_SCHD_STK_TYP.isGRS_WAIT_GI_SCHD(r.schd_stk_typ())) {
					flg2 = true;
					break;
				}
			}
			MCList<Prio_ListR> prioList = MCList.create(Prio_ListR.class);
			MCIndexKey prioIdx = null;
			if (flg2) {
				MCList<Prio_ListR> prioListTmp = MCList.create(Prio_ListR.class);
				executeQuery(prioListTmp, MSBEL5040_MSW_ALLOC_LOCK_KEY_S01());
				int i = 0;
				for (MCList<Prio_ListR> l :prioListTmp.groupList(Prio_ListR.$itm_cd,
						Prio_ListR.$itm_sub1, Prio_ListR.$itm_sub2, Prio_ListR.$itm_sub3, Prio_ListR.$stk_loc_cd)) {
					Prio_ListR addR = prioList.add();
					i = 0;
					for (Prio_ListR r: l) {
						if (i == 0) {
							MCRow.copyvalue(addR, r);
						}
						if (isSame(r.prio_typ(), "1")) {
							addR.prio(r.tmp_prio());
						}
						else if (isSame(r.prio_typ(), "2")) {
							addR.prio2(r.tmp_prio());
						}
						i++;
					}
				}
				prioIdx = prioList.createIndex(idxKey);
			}

			int i = 0;
			for (Avl_ListR r :list) {
				r.lno(i++);

				if (MSC_SCHD_STK_TYP.isSTK(r.schd_stk_typ())
						|| MSC_SCHD_STK_TYP.isTGT_GR_SCHD(r.schd_stk_typ())
						|| MSC_SCHD_STK_TYP.isNOTGT_GR_SCHD(r.schd_stk_typ())) {
					if (!isSame(r.lot_quality_typ(), r.quality_typ())) {
						if (!isNull(r.lot_quality_typ()) && !MAC_QUALITY_TYP.isGOOD(r.lot_quality_typ())
							&& !up0().getBooleanNE("minus_stk_chk_flg")) {
							continue;
						}
					}
				}

				if (up1Size && MSC_SCHD_STK_TYP.isSTK(r.schd_stk_typ())) {
					containsLocList(r, locList, idx, idxKey);
					if (flg2) {
						containsPrioList(r, prioList, prioIdx, idxKey);
					}
					if (r.tgt_flg()) {
						_stkLocList.add(r);
					}
					else {
						_grList.add(r);
					}
				}
				else {
					if (flg) {
						containsLocList(r, locList, idx, idxKey);
					}

					if (MSC_SCHD_STK_TYP.isTGT_GR_SCHD(r.schd_stk_typ())
							|| MSC_SCHD_STK_TYP.isSTK(r.schd_stk_typ())) {
						if (flg2) {
							containsPrioList(r, prioList, prioIdx, idxKey);
						}
						_grList.add(r);
					}
					else if (MSC_SCHD_STK_TYP.isLOC_GI_SCHD(r.schd_stk_typ())) {
						if (r.not_lot_fix_flg()) {
							_giNotFixList.add(r);
						}
						else {
							_giFixList.add(r);
						}
					}
					else if (MSC_SCHD_STK_TYP.isMINUS_STK(r.schd_stk_typ())) {
						_giFixList.add(r);
					}
					else if (MSC_SCHD_STK_TYP.isGRS_GI_SCHD(r.schd_stk_typ())) {
						_grsGiList.add(r);
					}
					else if (MSC_SCHD_STK_TYP.isLOC_WAIT_GI_SCHD(r.schd_stk_typ())) {
						if (r.not_lot_fix_flg()) {
							_giNotWaitFixList.add(r);
						}
						else {
							_giWaitFixList.add(r);
						}
					}
					else if (MSC_SCHD_STK_TYP.isGRS_WAIT_GI_SCHD(r.schd_stk_typ())) {
						_grsGiWaitList.add(r);
					}
				}
			}
		}

		protected void containsLocList(Avl_ListR r, MCList<Loc_ListR> locList, MCIndexKey idx, String[] idxKey) {
			if (locList.contains(idx, r.toArray(idxKey))) {
				r.tgt_flg(true);
			}
		}

		protected void containsPrioList(Avl_ListR r, MCList<Prio_ListR> prioList, MCIndexKey prioIdx, String[] idxKey) {
			Prio_ListR prioR = prioList.getFirst(prioIdx, r.toArray(idxKey));
			if (!isNull(prioR)) {
				r.prio(prioR.prio());
				r.prio2(prioR.prio2());
			}
		}

		protected void chkUpMatch(MCDate ignoreMarginDt) {
			if (!up6().isEmpty()) {
				Alloc_Avl_Srch02_CndR up0 = Alloc_Avl_Srch02_CndR.create();
				up0.ignore_margin_dt(ignoreMarginDt);
				giSort(up6(), _propLoc);
				
				up0.addBooleanColumn("minus_stk_chk_flg", up0().getBooleanNE("minus_stk_chk_flg"));

				doMatch(up0, _stkLocList, up6(), _propLoc, true);
				doMatch(up0, _grList, up6(), _propLoc, true);
				doMatch(up0, _giFixList, up6(), _propLoc, false);
				doMatch(up0, _giNotFixList, up6(), _propLoc, false);
				doMatch(up0, _grsGiList, up6(), _propGrs, false);
				doMatch(up0, _giWaitFixList, up6(), _propLoc, false);
				doMatch(up0, _giNotWaitFixList, up6(), _propLoc, false);
				doMatch(up0, _grsGiWaitList, up6(), _propGrs, false);
			}
		}

		protected void execSrch02Sv(MCList<Avl_ListR> avlList, MCList<Srch_TgtR> giList, MCList<Avl_ListR> grList) {
			if (giList.size() > 0) {
				MSBEL_AllocMngService.Alloc_Srch02 srch02Sv = MSBEL_AllocMngService.crtAlloc_Srch02();
				srch02Sv.up0().short_ope_typ(up0().short_ope_typ());
				srch02Sv.up0().setBooleanNE("minus_stk_chk_flg", up0().getBooleanNE("minus_stk_chk_flg"));
				srch02Sv.up1().addAll(giList);
				srch02Sv.up2().addAll(avlList);
				srch02Sv.up2().addAll(grList);
				srch02Sv.exec();

				avlList.setAll(srch02Sv.down2());
				down4().addAll(srch02Sv.down0());
				down5().addAll(srch02Sv.down1());
				down6().addAll(srch02Sv.down3());

				if (up0().all_pri_flg() && _notSchdSrchFlg) {
					down0().addAll(srch02Sv.down2());
				}
			}
			else {
				avlList.addAll(grList);
			}
		}

		protected void execSrch03Sv(MCList<Avl_ListR> avlList, MCList<Srch_TgtR> giList, MCList<Avl_ListR> grList) {
			if (giList.size() > 0) {
				MSBEL_AllocMngService.Alloc_Srch03 srch03Sv = MSBEL_AllocMngService.crtAlloc_Srch03();
				srch03Sv.up0().short_ope_typ(up0().short_ope_typ());
				srch03Sv.up1().addAll(giList);
				srch03Sv.up2().addAll(avlList);
				srch03Sv.up2().addAll(grList);
				srch03Sv.exec();

				avlList.setAll(srch03Sv.down1());
				down4().addAll(srch03Sv.down0());
				down6().addAll(srch03Sv.down2());

				if (up0().all_pri_flg() && _notSchdSrchFlg) {
					down1().addAll(srch03Sv.down1());
				}
			}
			else {
				avlList.addAll(grList);
			}
		}

		protected void execAvlSv(MCList<Avl_ListR> list, MCList<Avl_ListR> avlList,
				MCList<Avl_ListR> avlLgList, MCList<Avl_ListR> grList, MCList<Avl_ListR> giFixList, MCList<Avl_ListR> giNotFixList,
				MCList<Avl_ListR> avlGrsList, MCList<Avl_ListR> grsGiList, MCList<Lno_ListR> lnoList, MCDate ignoreMarginDt) {

			MCIndexKey idx = null;
			String[] idxKey = new String[]{
					Avl_ListR.$itm_cd, Avl_ListR.$stk_loc_cd, Avl_ListR.$stk_arrv_bp_cd,
					Avl_ListR.$itm_sub1, Avl_ListR.$itm_sub2, Avl_ListR.$itm_sub3};
			if (up0().gi_alloc_flg()) {
				idx = up6().createIndex(idxKey);
			}

			// シングルスレッドで実行する
			if (MCServerThreadManager.isChildThread() || MCServerThreadManager.getLimitThreadSize() == 1) {
				// 場所引当の減算処理ここから
				// 場所ごとの減算処理ここから
				MSBEL_AllocMngService.Alloc_Avl_Srch02 Avl_Srch02_Loc = MSBEL_AllocMngService.crtAlloc_Avl_Srch02();
				Avl_Srch02_Loc.up0().lg_flg(false);
				Avl_Srch02_Loc.up0().except_zero_flg(up0().except_zero_flg());
				Avl_Srch02_Loc.up0().dtl_calc_flg(up0().dtl_calc_flg());
				Avl_Srch02_Loc.up0().ignore_margin_dt(ignoreMarginDt);
				Avl_Srch02_Loc.up1().addAll(avlList);
				Avl_Srch02_Loc.up1().addAll(grList);
				Avl_Srch02_Loc.up2().addAll(giFixList);
				Avl_Srch02_Loc.up3().addAll(giNotFixList);
				Avl_Srch02_Loc.up4().addAll(lnoList);
				Avl_Srch02_Loc.exec();
				_canGrList.addAll(Avl_Srch02_Loc.down3());
				lnoList.addAll(Avl_Srch02_Loc.down4());
				// 場所ごとの減算処理ここまで

				// 物流グループごとの減算処理ここから
				MSBEL_AllocMngService.Alloc_Avl_Srch02 Avl_Srch02_Lg = MSBEL_AllocMngService.crtAlloc_Avl_Srch02();
				MSBEL_AllocMngService.Alloc_Avl_Srch03 Avl_Srch03 = MSBEL_AllocMngService.crtAlloc_Avl_Srch03();
				if (up0().gi_alloc_flg()) {
					Avl_Srch02_Lg.up0().lg_flg(true);
					Avl_Srch02_Lg.up0().except_zero_flg(up0().except_zero_flg());
					Avl_Srch02_Lg.up0().dtl_calc_flg(up0().dtl_calc_flg());
					Avl_Srch02_Lg.up0().ignore_margin_dt(ignoreMarginDt);
					for (Avl_ListR r :Avl_Srch02_Loc.down0()) {
						if (up6().contains(idx, r.toArray(idxKey))) {
							Avl_Srch03.up1().add(r);
						}
						else {
							Avl_Srch02_Lg.up1().add(r);
						}
					}
					for (Avl_ListR r :Avl_Srch02_Loc.down1()) {
						if (up6().contains(idx, r.toArray(idxKey))) {
							if (r.tgt_flg()) {
								// 実行結果を設定する
								down2().add(r);
							}
						}
						else {
							Avl_Srch02_Lg.up2().add(r);
						}
					}
					for (Avl_ListR r :Avl_Srch02_Loc.down2()) {
						if (up6().contains(idx, r.toArray(idxKey))) {
							if (r.tgt_flg()) {
								// 実行結果を設定する
								down2().add(r);
							}
						}
						else {
							Avl_Srch02_Lg.up3().add(r);
						}
					}
					Avl_Srch02_Lg.up4().addAll(lnoList);
					Avl_Srch02_Lg.exec();

					// 実行結果を設定する
					down2().addAll(Avl_Srch02_Lg.down1().subList(r -> r.tgt_flg()));
					down2().addAll(Avl_Srch02_Lg.down2().subList(r -> r.tgt_flg()));
					_canGrList.addAll(Avl_Srch02_Lg.down3());
					lnoList.addAll(Avl_Srch02_Lg.down4());
				}
				else {
					Avl_Srch02_Lg.up0().lg_flg(true);
					Avl_Srch02_Lg.up0().except_zero_flg(up0().except_zero_flg());
					Avl_Srch02_Lg.up0().dtl_calc_flg(up0().dtl_calc_flg());
					Avl_Srch02_Lg.up0().ignore_margin_dt(ignoreMarginDt);
					Avl_Srch02_Lg.up1().addAll(Avl_Srch02_Loc.down0());
					Avl_Srch02_Lg.up2().addAll(Avl_Srch02_Loc.down1());
					Avl_Srch02_Lg.up3().addAll(Avl_Srch02_Loc.down2());
					Avl_Srch02_Lg.up4().addAll(lnoList);
					Avl_Srch02_Lg.exec();

					// 実行結果を設定する
					down2().addAll(Avl_Srch02_Lg.down1().subList(r -> r.tgt_flg()));
					down2().addAll(Avl_Srch02_Lg.down2().subList(r -> r.tgt_flg()));
					_canGrList.addAll(Avl_Srch02_Lg.down3());
					lnoList.addAll(Avl_Srch02_Lg.down4());
				}
				// 物流グループごとの減算処理ここまで
				// 場所引当の減算処理ここまで

				// 総量引当の減算処理ここから
				Avl_Srch03.up0().lg_flg(false);
				Avl_Srch03.up0().except_zero_flg(up0().except_zero_flg());
				Avl_Srch03.up0().dtl_calc_flg(up0().dtl_calc_flg());
				Avl_Srch03.up0().ignore_margin_dt(ignoreMarginDt);
				Avl_Srch03.up1().addAll(Avl_Srch02_Lg.down0());
				Avl_Srch03.up2().addAll(grsGiList);
				Avl_Srch03.up3().addAll(lnoList);
				Avl_Srch03.exec();

				// 実行結果を設定する
				splitAvlList(Avl_Srch03.down0(), avlList, avlGrsList, avlLgList);
				down3().addAll(Avl_Srch03.down1().subList(r -> r.tgt_flg()));
				_canGrList.addAll(Avl_Srch03.down2());
				lnoList.addAll(Avl_Srch03.down3());
				// 総量引当の減算処理ここまで
			}
			// マルチスレッドで実行する
			else {
				// 場所引当の減算処理ここから
				// 場所ごとの減算処理ここから
				String[] key = new String[]{
						Avl_ListR.$itm_cd, Avl_ListR.$stk_loc_cd, Avl_ListR.$stk_str_ln_cd,
						Avl_ListR.$itm_sub1, Avl_ListR.$itm_sub2, Avl_ListR.$itm_sub3};

				MCIndexKey avlListIdx = avlList.createIndex(key);
				MCIndexKey grListIdx = grList.createIndex(key);
				MCIndexKey giFixListIdx = giFixList.createIndex(key);
				MCIndexKey giNotFixListIdx = giNotFixList.createIndex(key);

				ArrayList<Alloc_Avl_Srch02> opL = new ArrayList<Alloc_Avl_Srch02>();
				for (Avl_ListR r :list.groupBy(key)) {
					MSBEL_AllocMngService.Alloc_Avl_Srch02 Avl_Srch02 = MSBEL_AllocMngService.crtAlloc_Avl_Srch02();
					Avl_Srch02.up0().lg_flg(false);
					Avl_Srch02.up0().except_zero_flg(up0().except_zero_flg());
					Avl_Srch02.up0().dtl_calc_flg(up0().dtl_calc_flg());
					Avl_Srch02.up0().ignore_margin_dt(ignoreMarginDt);
					Avl_Srch02.up1().addAll(avlList.subList(avlListIdx, r.toArray(key)));
					Avl_Srch02.up1().addAll(grList.subList(grListIdx, r.toArray(key)));
					Avl_Srch02.up2().addAll(giFixList.subList(giFixListIdx, r.toArray(key)));
					Avl_Srch02.up3().addAll(giNotFixList.subList(giNotFixListIdx, r.toArray(key)));
					Avl_Srch02.up4().addAll(lnoList);
					opL.add(Avl_Srch02);
				}
				MCServerThreadManager.invokeAndWait(opL, CLAZZ);

				// 実行結果を設定する
				MCList<Avl_ListR> grListTmp = MCList.create(Avl_ListR.class);
				MCList<Avl_ListR> giFixListTmp = MCList.create(Avl_ListR.class);
				MCList<Avl_ListR> giNotFixListTmp = MCList.create(Avl_ListR.class);
				for (Alloc_Avl_Srch02 op :opL) {
					grListTmp.addAll(op.down0());
					giFixListTmp.addAll(op.down1());
					giNotFixListTmp.addAll(op.down2());
					_canGrList.addAll(op.down3());
					lnoList.addAll(op.down4());
				}
				// 場所ごとの減算処理ここまで

				// 物流グループごとの減算処理ここから
				String[] key2 = new String[]{
						Avl_ListR.$itm_cd, Avl_ListR.$stk_lg_grp_cd,
						Avl_ListR.$itm_sub1, Avl_ListR.$itm_sub2, Avl_ListR.$itm_sub3};

				MCList<Avl_ListR> grLgListTmp = MCList.create(Avl_ListR.class);
				MCIndexKey grListIdx2 = grListTmp.createIndex(key2);
				MCIndexKey giFixListIdx2 = giFixListTmp.createIndex(key2);
				MCIndexKey giNotFixListIdx2 = giNotFixListTmp.createIndex(key2);

				ArrayList<Alloc_Avl_Srch02> opL2 = new ArrayList<Alloc_Avl_Srch02>();
				if (up0().gi_alloc_flg()) {
					for (Avl_ListR r2 :list.groupBy(key2)) {
						MSBEL_AllocMngService.Alloc_Avl_Srch02 Avl_Srch02 = MSBEL_AllocMngService.crtAlloc_Avl_Srch02();
						Avl_Srch02.up0().lg_flg(true);
						Avl_Srch02.up0().except_zero_flg(up0().except_zero_flg());
						Avl_Srch02.up0().dtl_calc_flg(up0().dtl_calc_flg());
						Avl_Srch02.up0().ignore_margin_dt(ignoreMarginDt);
						for (Avl_ListR r :grListTmp.subList(grListIdx2, r2.toArray(key2))) {
							if (up6().contains(idx, r.toArray(idxKey))) {
								grLgListTmp.add(r);
							}
							else {
								Avl_Srch02.up1().add(r);
							}
						}
						for (Avl_ListR r :giFixListTmp.subList(giFixListIdx2, r2.toArray(key2))) {
							if (up6().contains(idx, r.toArray(idxKey))) {
								if (r.tgt_flg()) {
									// 実行結果を設定する
									down2().add(r);
								}
							}
							else {
								Avl_Srch02.up2().add(r);
							}
						}
						for (Avl_ListR r :giNotFixListTmp.subList(giNotFixListIdx2, r2.toArray(key2))) {
							if (up6().contains(idx, r.toArray(idxKey))) {
								if (r.tgt_flg()) {
									// 実行結果を設定する
									down2().add(r);
								}
							}
							else {
								Avl_Srch02.up3().add(r);
							}
						}
						Avl_Srch02.up1().addAll(grListTmp.subList(grListIdx2, r2.toArray(key2)));
						Avl_Srch02.up2().addAll(giFixListTmp.subList(giFixListIdx2, r2.toArray(key2)));
						Avl_Srch02.up3().addAll(giNotFixListTmp.subList(giNotFixListIdx2, r2.toArray(key2)));
						Avl_Srch02.up4().addAll(lnoList);
						opL2.add(Avl_Srch02);
					}
					MCServerThreadManager.invokeAndWait(opL2, CLAZZ);
				}
				else {
					for (Avl_ListR r :list.groupBy(key2)) {
						MSBEL_AllocMngService.Alloc_Avl_Srch02 Avl_Srch02 = MSBEL_AllocMngService.crtAlloc_Avl_Srch02();
						Avl_Srch02.up0().lg_flg(true);
						Avl_Srch02.up0().except_zero_flg(up0().except_zero_flg());
						Avl_Srch02.up0().dtl_calc_flg(up0().dtl_calc_flg());
						Avl_Srch02.up0().ignore_margin_dt(ignoreMarginDt);
						Avl_Srch02.up1().addAll(grListTmp.subList(grListIdx2, r.toArray(key2)));
						Avl_Srch02.up2().addAll(giFixListTmp.subList(giFixListIdx2, r.toArray(key2)));
						Avl_Srch02.up3().addAll(giNotFixListTmp.subList(giNotFixListIdx2, r.toArray(key2)));
						Avl_Srch02.up4().addAll(lnoList);
						opL2.add(Avl_Srch02);
					}
					MCServerThreadManager.invokeAndWait(opL2, CLAZZ);
				}
				
				// 実行結果を設定する
				MCList<Avl_ListR> down0Tmp = MCList.create(Avl_ListR.class);
				for (Alloc_Avl_Srch02 op :opL2) {	
					down2().addAll(op.down1().subList(r -> r.tgt_flg()));
					down2().addAll(op.down2().subList(r -> r.tgt_flg()));
					_canGrList.addAll(op.down3());
					lnoList.addAll(op.down4());
					down0Tmp.addAll(op.down0());
				}
				// 物流グループごとの減算処理ここまで
				// 場所引当の減算処理ここまで

				// 総量引当の減算処理ここから
				MCIndexKey down0TmpIdx = down0Tmp.createIndex(key2);
				MCIndexKey grLgListIdx = grLgListTmp.createIndex(key2);
				MCIndexKey grsGiListIdx = grsGiList.createIndex(key2);

				ArrayList<Alloc_Avl_Srch03> opL3 = new ArrayList<Alloc_Avl_Srch03>();
				for (Avl_ListR r :list.groupBy(key2)) {
					MSBEL_AllocMngService.Alloc_Avl_Srch03 Avl_Srch03 = MSBEL_AllocMngService.crtAlloc_Avl_Srch03();
					Avl_Srch03.up0().lg_flg(false);
					Avl_Srch03.up0().except_zero_flg(up0().except_zero_flg());
					Avl_Srch03.up0().dtl_calc_flg(up0().dtl_calc_flg());
					Avl_Srch03.up0().ignore_margin_dt(ignoreMarginDt);
					Avl_Srch03.up1().addAll(down0Tmp.subList(down0TmpIdx, r.toArray(key2)));
					Avl_Srch03.up1().addAll(grLgListTmp.subList(grLgListIdx, r.toArray(key2)));
					Avl_Srch03.up2().addAll(grsGiList.subList(grsGiListIdx, r.toArray(key2)));
					Avl_Srch03.up3().addAll(lnoList);
					opL3.add(Avl_Srch03);
				}
				MCServerThreadManager.invokeAndWait(opL3, CLAZZ);

				// 実行結果を設定する
				avlList.clear();
				avlGrsList.clear();
				avlLgList.clear();
				MCList<Avl_ListR> avlListTmp = MCList.create(Avl_ListR.class);
				MCList<Avl_ListR> avlGrsListTmp = MCList.create(Avl_ListR.class);
				MCList<Avl_ListR> avlLgListTmp = MCList.create(Avl_ListR.class);
				for (Alloc_Avl_Srch03 op :opL3) {
					splitAvlList(op.down0(), avlListTmp, avlGrsListTmp, avlLgListTmp);
					avlList.addAll(avlListTmp);
					avlGrsList.addAll(avlGrsListTmp);
					avlLgList.addAll(avlLgListTmp);
					down3().addAll(op.down1().subList(r -> r.tgt_flg()));
					_canGrList.addAll(op.down2());
					lnoList.addAll(op.down3());
				}
				// 総量引当の減算処理ここまで
			}
		}

		protected void splitAvlList(MCList<Avl_ListR> down0, MCList<Avl_ListR> avlList, MCList<Avl_ListR> avlGrsList) {
			avlList.clear();
			avlGrsList.clear();

			for (Avl_ListR r: down0) {
				if (MSC_SCHD_STK_TYP.isTGT_GR_SCHD(r.schd_stk_typ())
						|| MSC_SCHD_STK_TYP.isSTK(r.schd_stk_typ())) {
					avlList.add(r);
				}
				else if (MSC_SCHD_STK_TYP.isNOTGT_GR_SCHD(r.schd_stk_typ())) {
					avlGrsList.add(r);
				}
			}
		}

		protected void splitAvlList(MCList<Avl_ListR> down0, MCList<Avl_ListR> avlList, MCList<Avl_ListR> avlGrsList, MCList<Avl_ListR> avlLgList) {

			avlList.clear();
			avlGrsList.clear();
			avlLgList.clear();

			for (Avl_ListR r: down0) {
				// 使用可能在庫としては物流グループごとの結果は不要なので必要な場所の結果だけ抽出する
				if (r.tgt_flg()) {
					if (MSC_SCHD_STK_TYP.isTGT_GR_SCHD(r.schd_stk_typ())
							|| MSC_SCHD_STK_TYP.isSTK(r.schd_stk_typ())) {
						avlList.add(r);
					}
					else if (MSC_SCHD_STK_TYP.isNOTGT_GR_SCHD(r.schd_stk_typ())) {
						avlGrsList.add(r);
					}
				}
				else {
					avlLgList.add(r);
				}
			}
		}

		protected void setDown(MCList<Avl_ListR> avlList, MCList<Avl_ListR> avlGrsList, MCList<Lno_ListR> lnoList) {
			// 取消対象の出庫予定が引き当てた在庫・入庫予定をdown0()に追加
			down0().addAll(_canGrList);

			down0().addAll(avlList);
			down1().addAll(avlGrsList);

			extAllocGrpSrchFlg(down0());
			extAllocGrpSrchFlg(down2());

			if (!up4().isEmpty()) {
				extSrchCnd(down0());
				extSrchCnd(down2());
			}
			setAbnAllocFlg(down0());
			setAbnAllocFlg(down1());
			setAbnAllocFlg(down2());
			setAbnAllocFlg(down3());

			down8().addAll(lnoList);
		}

		protected void extAllocGrpSrchFlg(MCList<Avl_ListR> down) {
			if (up0().alloc_grp_srch_flg()) {
				down.setAll(down.subList(Avl_ListR.$alloc_grp_non_tgt_flg, false));
			}
		}

		// 使用可能在庫は棚・ライン、ロットＮＯ、サブロットＮＯで絞込みされていないので別途処理する
		protected void extSrchCnd(MCList<Avl_ListR> down) {
			if (!down.isEmpty()) {
				String[] key = new String[]{
						Avl_ListR.$itm_cd, Avl_ListR.$stk_loc_cd, Avl_ListR.$lot_no, Avl_ListR.$sublot_no,
						Avl_ListR.$stk_str_ln_cd, Avl_ListR.$stk_arrv_bp_cd, Avl_ListR.$ver_no,
						Avl_ListR.$pack_unit_cd, Avl_ListR.$itm_sub1, Avl_ListR.$itm_sub2, Avl_ListR.$itm_sub3};
				MCList<MSW_ALLOC_EXT_R> dbcL = MCList.create(MSW_ALLOC_EXT_R.class);

				for (Avl_ListR r :down.groupBy(key)) {
					MSW_ALLOC_EXT_R dbcR = dbcL.add();
					for (String col :key) {
						dbcR.setValue(col, r.getValue(col));
					}
				}
				MSW_ALLOC_EXT_R S0 = MSW_ALLOC_EXT_R.create();
				execDbWkDelete("MSBEL5040_MSW_ALLOC_EXT_D01", S0);
				MSW_ALLOC_EXT_R t = MSW_ALLOC_EXT_R.create("T");
				MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
				dbInsert("MSBEL5040_MSW_ALLOC_EXT_I01", dbcL, dbcL_bldr);

				dbcL.clear();
				MSVT_LOT_LIST_R t2 = MSVT_LOT_LIST_R.create("T2");
				MAM_STR_LN_R m = MAM_STR_LN_R.create("M");
				MAM_BP_R m2 = MAM_BP_R.create("M2");
				MAM_UNIT_R m3 = MAM_UNIT_R.create("M3");
				dbcL_bldr.addLeftOuterJoin(t2, bracket(value(0).eq(value(0))
						.and(t2.itm_cd.eq(t.itm_cd))
						.and(t2.itm_sub1.eq(t.itm_sub1))
						.and(t2.itm_sub2.eq(t.itm_sub2))
						.and(t2.itm_sub3.eq(t.itm_sub3))
						.and(t2.lot_no.eq(t.lot_no))
						.and(t2.sublot_no.eq(t.sublot_no))));
				dbcL_bldr.addWhereWithCutOffAnd(t.lot_no.like(bind("lot_no")));
				dbcL_bldr.addWhereWithCutOffAnd(t.sublot_no.like(bind("sublot_no")));
				dbcL_bldr.addWhereWithCutOffAnd(t.ver_no.like(bind("ver_no")));
				dbcL_bldr.addWhereWithCutOffAnd(t2.bp_lot_no.like(bind("bp_lot_no")));
				dbcL_bldr.addWhereWithCutOffAnd(t.stk_str_ln_cd.like(bind("str_ln_cd")));
				if (!isNull(up4().str_ln_nm())) {
					dbcL_bldr.addLeftOuterJoin(m, bracket(t.stk_loc_cd.eq(m.loc_cd)
							.and(t.stk_str_ln_cd.eq(m.str_ln_cd))));
					dbcL_bldr.addWhereWithAnd(m.str_ln_nm.like(bind("str_ln_nm")));
				}
				dbcL_bldr.addWhereWithCutOffAnd(t.stk_arrv_bp_cd.like(bind("stk_arrv_bp_cd")));
				if (!isNull(up4().stk_arrv_bp_nm())) {
					dbcL_bldr.addLeftOuterJoin(m2, bracket( t.stk_arrv_bp_cd.eq(m2.bp_cd)));
					dbcL_bldr.addWhereWithAnd(m2.bp_nm.like(bind("stk_arrv_bp_nm")));
				}
				dbcL_bldr.addWhereWithCutOffAnd(t.pack_unit_cd.like(bind("pack_unit_cd")));
				if (!isNull(up4().pack_unit_nm())) {
					dbcL_bldr.addLeftOuterJoin(m3, bracket( t.pack_unit_cd.eq(m3.unit_cd)));
					dbcL_bldr.addWhereWithAnd(m3.unit_nm.like(bind("pack_unit_nm")));
				}
				dbSelect("MSBEL5040_MSW_ALLOC_EXT_S01", dbcL, dbcL_bldr, up4());

				MCList<Avl_ListR> downTmp = down.clone();
				MCIndexKey idx = downTmp.createIndex(key);
				down.clear();
				for (MSW_ALLOC_EXT_R r :dbcL) {
					down.addAll(downTmp.subList(idx, r.toArray(key)));
				}
			}
		}

		/**
		 * 引当異状フラグの設定
		 * @param down
		 */
		protected void setAbnAllocFlg(MCList<Avl_ListR> down){
			for (Avl_ListR r : down) {
				if (isAbnormalAlloc(r)) {
					r.abnormal_alloc_flg(true);
				}
			}
		}

		/**
		 * 下り電文のレコードが引当異状かどうかを判断する
		 * @param r
		 * @return
		 */
		protected boolean isAbnormalAlloc(Avl_ListR r) {
			if (r.overdue_alloc_flg()) return true; //入庫遅れ引当フラグ
			if (r.another_loc_alloc_flg()) return true; //場所違い引当フラグ
			// チェック対象が出庫予定の場合、不足数量（未引当数量）＞０
			if (MSC_SCHD_STK_TYP.isLOC_GI_SCHD(r.schd_stk_typ())
					|| MSC_SCHD_STK_TYP.isGRS_GI_SCHD(r.schd_stk_typ())) {
				if (r.pack_alloc_flg()) {
					if (r.pack_unit_qty().isPositive()) return true; //荷姿単位数量（総量減算後未引当）
				}
				else {
					if (r.base_unit_qty().isPositive()) return true; //基準単位数量（総量減算後未引当）
				}
			}
			return false;
		}
	}
	/**
	 * Alloc_Avl_Srch02オペレーション.<p>
	 *
	 * 在庫や入庫予定から引当済みの出庫予定を減算する<br>
	 */
	public class Alloc_Avl_Srch02 extends MSBEL_AllocMngService_MC_A.Alloc_Avl_Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			MCList<Avl_ListR> giFixStrLnList = up2().subList(r -> !MAC_STR.isNULL_VAL(r.stk_str_ln_cd()));
			MCList<Avl_ListR> giNotFixStrLnList = up3().subList(r -> !MAC_STR.isNULL_VAL(r.stk_str_ln_cd()));
			MCList<Avl_ListR> giFixList = up2().subList(r -> MAC_STR.isNULL_VAL(r.stk_str_ln_cd()));
			MCList<Avl_ListR> giNotFixList = up3().subList(r -> MAC_STR.isNULL_VAL(r.stk_str_ln_cd()));
			up2().clear();
			up3().clear();

			// 棚指定ありかつロット指定品について減算処理を呼び出し
			strLnLotFix(giFixStrLnList);

			// 棚指定ありかつロット未指定品について減算処理を呼び出し
			strLnNotFix(giNotFixStrLnList);

			// 棚指定なしかつロット指定品について減算処理を呼び出し
			lotFix(giFixList);

			// 棚指定なしかつロット未指定品について減算処理を呼び出し
			notFix(giNotFixList);

			// 下り電文の設定
			setDown();
		}

		protected void strLnLotFix(MCList<Avl_ListR> giList) {
			String procTyp = null;
			if (up0().lg_flg()) {
				procTyp = _allocLgLot;
			}
			else {
				procTyp = _allocLot;
			}

			doCalc(up0(), up1(), giList, false, false, MSC_SHORT_OPE_TYP.PROCEED.value(), procTyp, down3(), up4());
			up2().addAll(giList);
		}

		protected void strLnNotFix(MCList<Avl_ListR> giList) {
			String procTyp = null;
			if (up0().lg_flg()) {
				procTyp = _allocLgNoLot;
			}
			else {
				procTyp = _allocNoLot;
			}

			doCalc(up0(), up1(), giList, false, false, MSC_SHORT_OPE_TYP.PROCEED.value(), procTyp, down3(), up4());
			up3().addAll(giList);
		}

		protected void lotFix(MCList<Avl_ListR> giList) {
			String procTyp = null;
			if (up0().lg_flg()) {
				procTyp = _allocLgLot;
			}
			else {
				procTyp = _allocLot;
			}

			doCalc(up0(), up1(), giList, false, false, MSC_SHORT_OPE_TYP.PROCEED.value(), procTyp, down3(), up4());
			up2().addAll(giList);
		}

		protected void notFix(MCList<Avl_ListR> giList) {
			String procTyp = null;
			if (up0().lg_flg()) {
				procTyp = _allocLgNoLot;
			}
			else {
				procTyp = _allocNoLot;
			}

			doCalc(up0(), up1(), giList, false, false, MSC_SHORT_OPE_TYP.PROCEED.value(), procTyp, down3(), up4());
			up3().addAll(giList);
		}

		protected void setDown() {
			down0().addAll(up1());
			down1().addAll(up2());
			down2().addAll(up3());
			down4().addAll(up4());
		}
	}
	/**
	 * Alloc_Avl_Srch03オペレーション.<p>
	 *
	 * 在庫や入庫予定から引当済みの出庫予定を減算する（総量引当版）<br>
	 */
	public class Alloc_Avl_Srch03 extends MSBEL_AllocMngService_MC_A.Alloc_Avl_Srch03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCList<Avl_ListR> giLotList = up2().subList(r -> !r.not_lot_fix_flg());
			MCList<Avl_ListR> giNotLotList = up2().subList(r -> r.not_lot_fix_flg());
			up2().clear();

			// ロット指定品について減算処理を呼び出し
			calc(giLotList, _allocGrsLot);

			// ロット未指定品について減算処理を呼び出し
			calc(giNotLotList, _allocGrs);

			down0().addAll(up1());
			down1().addAll(up2());
			down3().addAll(up3());
		}
		
		protected void calc(MCList<Avl_ListR> giList, String procTyp) {
			doCalc(up0(), up1(), giList, false, false, MSC_SHORT_OPE_TYP.PROCEED.value(), procTyp, down2(), up3());
			up2().addAll(giList);
		}
	}
	/**
	 * Alloc_Avl_Srch04オペレーション.<p>
	 *
	 * 在庫、入庫予定から出庫予定を減算する<br>
	 */
	public class Alloc_Avl_Srch04 extends MSBEL_AllocMngService_MC_A.Alloc_Avl_Srch04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			down2().addAll(doCalc(setCnd(), up1(), up2(),
					up0().one_flg(), up0().gr_no_sort_flg(),
					up0().short_ope_typ(), up0().proc_typ(), MCList.create(Avl_ListR.class), MCList.create(Lno_ListR.class)));
			down0().addAll(up1());
			down1().addAll(up2());
		}

		protected Alloc_Avl_Srch02_CndR setCnd() {
			Alloc_Avl_Srch02_CndR cnd = Alloc_Avl_Srch02_CndR.create();
			cnd.lg_flg(false);
			cnd.except_zero_flg(up0().except_zero_flg());
			cnd.dtl_calc_flg(false);
			cnd.ignore_margin_dt(null);
			cnd.setBooleanNE("minus_stk_chk_flg", up0().getBooleanNE("minus_stk_chk_flg"));

			return cnd;
		}
	}

	// 品目マスタを取得する
	protected FXUCL_MCDbcCache<MAM_ITM_R> _mamItmCache = null;
	protected static void initMamItmCache(MCList<?> list) {
		if (object(CLAZZ)._mamItmCache == null) {
			object(CLAZZ)._initMamItmCache(list);
		}
	}
	protected void _initMamItmCache(MCList<?> list) {
		MAM_ITM_R itmR = MAM_ITM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(itmR);
		_mamItmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(builder, list,
				"itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
	}
	protected static MAM_ITM_R getMamItmCache(Avl_ListR r) {
		return object(CLAZZ)._getMamItmCache(r);
	}
	protected MAM_ITM_R _getMamItmCache(Avl_ListR r) {
		return _mamItmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
	}
	
	// 場所マスタを取得する（在庫場所）
	protected FXUCL_MCDbcCache<MAM_LOC_R> _stkLocCache = null;
	protected static void initStkLocCache(MCList<?> list) {
		if (object(CLAZZ)._stkLocCache == null) {
			object(CLAZZ)._initStkLocCache(list);
		}
	}
	protected void _initStkLocCache(MCList<?> list) {
		MAM_LOC_R locR = MAM_LOC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(locR);
		_stkLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(builder, list, "stk_loc_cd");
	}
	protected static MAM_LOC_R getStkLocCache(Avl_ListR r) {
		return object(CLAZZ)._getStkLocCache(r);
	}
	protected MAM_LOC_R _getStkLocCache(Avl_ListR r) {
		return _stkLocCache.get(r.stk_loc_cd());
	}

	// 場所関係リストを作成する
	protected LocMapCache _locMapCache = null;
	protected static void initLocMapCache(CndR up0, MCList<Srch_TgtR> up1) {
		object(CLAZZ)._initLocMapCache(up0, up1);
	}
	protected void _initLocMapCache(CndR up0, MCList<Srch_TgtR> up1) {
		_locMapCache = new LocMapCache(up0, up1);
	}

	protected static LocMapCache getLocMapCache() {
		return object(CLAZZ)._locMapCache;
	}

	public class LocMapCache {
		protected MCIndexKey _locMapIdx = null;
		protected MCList<Loc_Map_ListR> _locMapCache = MCList.create(Loc_Map_ListR.class);

		protected LocMapCache(CndR up0, MCList<Srch_TgtR> up1) {
			// 場所関係リストをキャッシュする
			addCache(up1);
			// 場所関係リストのインデックスをキャッシュする
			addIdxCache();
		}

		protected void addCache(MCList<Srch_TgtR> up1) {
			// 引当対象の場所をワークテーブルに格納する
			MCList<MSW_ALLOC_LOC_MAP_R> dbc = MCList.create(MSW_ALLOC_LOC_MAP_R.class);
			addAll(dbc, up1, createMap_MSW_ALLOC_LOC_MAP_R_Srch_TgtR());
			MSW_ALLOC_LOC_MAP_R S0 = MSW_ALLOC_LOC_MAP_R.create();
			execDbWkDelete("MSBEL5040_MSW_ALLOC_LOC_MAP_D02", S0);
			MCList<MSW_ALLOC_LOC_MAP_R> dbc2 = dbc.groupBy(MSW_ALLOC_LOC_MAP_R.colnames());
			dbInsert("MSBEL5040_MSW_ALLOC_LOC_MAP_I02", dbc2, MCQueryApiBuilder.create(MSW_ALLOC_LOC_MAP_R.create("T")));
			
			// ワークテーブルを使用して場所関係リストを作成する
			MCList<Loc_Map_ListR> locMapTmp = MCList.create(Loc_Map_ListR.class);
			executeQuery(_locMapCache, MSBEL5040_MSW_ALLOC_LOC_MAP_S01());
			executeQuery(locMapTmp, MSBEL5040_MSW_ALLOC_LOC_MAP_S02());
			MCList<Loc_Map_ListR> locMapTmp2 = MCList.create(Loc_Map_ListR.class);
			executeQuery(locMapTmp2, MSBEL5040_MSW_ALLOC_LOC_MAP_S03());
			locMapTmp.addAll(locMapTmp2);
			executeQuery(locMapTmp2, MSBEL5040_MSW_ALLOC_LOC_MAP_S04());
			locMapTmp.addAll(locMapTmp2);

			int i = 0;
			for (MCList<Loc_Map_ListR> l :locMapTmp.groupList(Loc_Map_ListR.$itm_cd,
					Loc_Map_ListR.$itm_sub1, Loc_Map_ListR.$itm_sub2, Loc_Map_ListR.$itm_sub3, Loc_Map_ListR.$stk_loc_cd,
					Loc_Map_ListR.$gi_str_ln_cd, Loc_Map_ListR.$ship_term_cd, Loc_Map_ListR.$gi_stk_arrv_bp_cd,
					Loc_Map_ListR.$alloc_grp_cd, Loc_Map_ListR.$gi_lg_grp_cd)) {
				Loc_Map_ListR addR = _locMapCache.add();
				i = 0;
				for (Loc_Map_ListR r: l) {
					if (i == 0) {
						MCRow.copyvalue(addR, r);
					}
					if (MAC_ALLOC_SCOPE_TYP.isLOC(r.alloc_scope_typ())) {
						addR.prio(r.tmp_prio());
					}
					else if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(r.alloc_scope_typ())) {
						addR.prio2(r.tmp_prio());
					}
					i++;
				}
			}

			// 物流制御マスタは出荷条件ＣＤが一致するレコードが無かったらNULL文字で再度検索する
			MCList<MAM_LG_CTL_R> lgCtlL = MCList.create(MAM_LG_CTL_R.class);
			MAM_LG_CTL_R t = MAM_LG_CTL_R.create("T");
			MCQueryApiBuilder lgCtlL_bldr = MCQueryApiBuilder.create(t);
			lgCtlL_bldr.addWhereWithAnd(t.fr_lg_grp_cd.eq(bind("fr_lg_grp_cd"))
					.and(t.to_lg_grp_cd.eq(bind("to_lg_grp_cd")))
					.and(t.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
					.and(t.del_flg.eq(value(false))));
			MCList<Loc_Map_ListR> locLTmp = _locMapCache.subList(r -> isNull(r.xfr_lt()));
			dbSelect("MSBEL5040_MAM_LG_CTL_S01", lgCtlL, lgCtlL_bldr, locLTmp
					.groupBy(Loc_Map_ListR.$fr_lg_grp_cd, Loc_Map_ListR.$to_lg_grp_cd));
			MCIndexKey idx = lgCtlL.createIndex(Loc_Map_ListR.$fr_lg_grp_cd, Loc_Map_ListR.$to_lg_grp_cd);

			for (Loc_Map_ListR r :locLTmp) {
				MAM_LG_CTL_R lgCtlR = lgCtlL.getFirst(idx, r.fr_lg_grp_cd(), r.to_lg_grp_cd());
				if (isNull(lgCtlR)) {
					r.xfr_lt(MCNumber.ZERO);
				}
				else {
					r.xfr_lt(lgCtlR.xfr_lt());
					r.alloc_days(lgCtlR.alloc_days());
				}
			}
		}

		protected void addIdxCache() {
			_locMapIdx = _locMapCache.createIndex(
					Loc_Map_ListR.$itm_cd, Loc_Map_ListR.$inpt_loc_cd, Loc_Map_ListR.$inpt_str_ln_cd,
					Loc_Map_ListR.$alloc_grp_cd, Loc_Map_ListR.$gi_lg_grp_cd,
					Loc_Map_ListR.$gi_loc_cd, Loc_Map_ListR.$gi_str_ln_cd, Loc_Map_ListR.$gi_stk_arrv_bp_cd,
					Loc_Map_ListR.$ship_term_cd, Loc_Map_ListR.$itm_sub1, Loc_Map_ListR.$itm_sub2, Loc_Map_ListR.$itm_sub3
					);
		}

		protected MCList<Loc_Map_ListR> get(Avl_ListR giRow) {
			return _locMapCache.subList(_locMapIdx, giRow.toArray(_locMapIdx.getKeys()));
		}

		protected MCList<Loc_Map_ListR> getAll() {
			return _locMapCache;
		}

		protected Map_MSW_ALLOC_LOC_MAP_R_Srch_TgtR<MSW_ALLOC_LOC_MAP_R,Srch_TgtR> createMap_MSW_ALLOC_LOC_MAP_R_Srch_TgtR() {
			return new Map_MSW_ALLOC_LOC_MAP_R_Srch_TgtR<MSW_ALLOC_LOC_MAP_R, Srch_TgtR>();
		}

		public class Map_MSW_ALLOC_LOC_MAP_R_Srch_TgtR<D extends MSW_ALLOC_LOC_MAP_R, S extends Srch_TgtR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_cd, Srch_TgtR.$itm_cd);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub1, Srch_TgtR.$itm_sub1);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub2, Srch_TgtR.$itm_sub2);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub3, Srch_TgtR.$itm_sub3);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$ship_term_cd, Srch_TgtR.$ship_term_cd);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$inpt_loc_cd, Srch_TgtR.$inpt_loc_cd);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$inpt_str_ln_cd, Srch_TgtR.$inpt_str_ln_cd);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$dlv_lg_grp_cd, Srch_TgtR.$dlv_lg_grp_cd);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$alloc_grp_cd, Srch_TgtR.$alloc_grp_cd);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$gi_lg_grp_cd, Srch_TgtR.$gi_lg_grp_cd);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$gi_loc_cd, Srch_TgtR.$gi_loc_cd);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$gi_str_ln_cd, Srch_TgtR.$gi_str_ln_cd);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$gi_stk_arrv_bp_cd, Srch_TgtR.$gi_stk_arrv_bp_cd);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$gr_loc_cd, Srch_TgtR.$gr_loc_cd);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$gr_str_ln_cd, Srch_TgtR.$gr_str_ln_cd);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$alloc_scope_typ, Srch_TgtR.$alloc_scope_typ);
			}
		}
	}

	/**
	 * @param up0
	 * @param notSchdSrchFlg
	 * @param orderByCols : MST_STK_R.$xxx を引数に含める想定
	 */
	public static MCQueryPlan getQuery(Alloc_Avl_Srch01_CndR up0, boolean notSchdSrchFlg, String[] orderByCols) {
		return object(CLAZZ)._getQuery(up0, null, notSchdSrchFlg, orderByCols);
	}
	
	protected MCQueryPlan _getQuery(Alloc_Avl_Srch01_CndR up0, MCList<Srch_StkR> up2, boolean notSchdSrchFlg, String[] orderByCols) {
		// 在庫の検索
		MCQueryPlan sql = MSBEL5040_MST_STK_S01(true, orderByCols, up0);

		// 受払予定の検索
		if (!(up0.all_pri_flg() && notSchdSrchFlg)) {
			MCQueryPlan schdSql = MSBEL5040_MST_IO_SCHD_S01(up0);
			MCMainQuery main = sql.getQuery();
			sql.setQuery(main.unionAll(schdSql.toSubQuery())).addDynamicSQLInfo(schdSql.getDynamicSQLInfo());
		}
		// 予定在庫の検索
		if (!isNull(up2)) {
			MCGroupByPolicy gp = new MCGroupByPolicy();
			gp.addKey(getStkKey());
			gp.sum(Srch_StkR.$pack_unit_qty, Srch_StkR.$base_unit_qty);

			MCList<MSW_STK_LST_R> dbc = MCList.create(MSW_STK_LST_R.class);
			addAll(dbc, up2.groupBy(gp), createMap_MSW_STK_LST_R_Srch_StkR());

			MSW_STK_LST_R S0 = MSW_STK_LST_R.create();
			execDbWkDelete("MSBEL5040_MSW_STK_LST_D01", S0);
			dbInsert("MSBEL5040_MSW_STK_LST_I01", dbc, MCQueryApiBuilder.create(MSW_STK_LST_R.create("T")));
			
			MCQueryPlan tempSql = MSBEL5040_MST_STK_S01(false, null, null);
			MCMainQuery main = sql.getQuery();
			sql.setQuery(main.unionAll(tempSql.toSubQuery()));
		}
		return sql;
	}

	protected String[] getStkKey() {
		return new String[]{
				Srch_StkR.$itm_cd,
				Srch_StkR.$itm_sub1,
				Srch_StkR.$itm_sub2,
				Srch_StkR.$itm_sub3,
				Srch_StkR.$loc_cd,
				Srch_StkR.$str_ln_cd,
				Srch_StkR.$stk_arrv_bp_cd,
				Srch_StkR.$lot_no,
				Srch_StkR.$sublot_no,
				Srch_StkR.$sno1,
				Srch_StkR.$sno2,
				Srch_StkR.$sno3,
				Srch_StkR.$sno4,
//				Srch_StkR.$fix_no_typ,
//				Srch_StkR.$fix_no,
				Srch_StkR.$pack_unit_cd,
				Srch_StkR.$gd_cd,
				Srch_StkR.$in_xfr_typ,
				Srch_StkR.$quality_typ,
				Srch_StkR.$asst_typ,
				Srch_StkR.$stk_insp_typ,
				Srch_StkR.$stk_id_typ,
				Srch_StkR.$stk_bp_cd};
	}

	protected MCList<Srch_RsltR> execAvl04Sv(
			MCList<Avl_ListR> grList,
			MCList<Avl_ListR> giList,
			boolean oneFlg,			// 標準では未使用
			boolean grNoSortFlg,	// 標準では未使用
			boolean exceptZeroFlg,
			String shortOpeTyp,
			String procTyp) {
		return execAvl04Sv(grList, giList, oneFlg, grNoSortFlg, exceptZeroFlg, shortOpeTyp, procTyp, false);
	}
	/**	execAvl04Sv.<p>
	 * 在庫＋入庫予定から出庫予定を除いて引当可能在庫を取得する<br>
	 * 品目ごとに分割してマルチスレッドで実行する<br>
	 * @param grList		在庫＋入庫予定
	 * @param giList		出庫予定
	 * @param oneFlg		適合した最初のレコードだけを返す場合true
	 * @param grNoSortFlg	grListをソートしないで引当処理をする場合true
	 * @param exceptZeroFlg	数量が0のレコードを除外する場合true
	 * @param shortOpeTyp	不足時処理区分
	 * @param procTyp		処理タイプ
	 * @param minusStkChkFlg	出庫時マイナス在庫確認
	 * @return allocList	ロット提案結果
	 */
	protected MCList<Srch_RsltR> execAvl04Sv(
			MCList<Avl_ListR> grList,
			MCList<Avl_ListR> giList,
			boolean oneFlg,			// 標準では未使用
			boolean grNoSortFlg,	// 標準では未使用
			boolean exceptZeroFlg,
			String shortOpeTyp,
			String procTyp,
			boolean minusStkChkFlg) {

		MCList<Srch_RsltR> retL = MCList.create(Srch_RsltR.class);

		if (MCServerThreadManager.isChildThread() || MCServerThreadManager.getLimitThreadSize() == 1) {
			// シングルスレッドで実行する
			MSBEL_AllocMngService.Alloc_Avl_Srch04 Avl_Srch04 = MSBEL_AllocMngService.crtAlloc_Avl_Srch04();
			Avl_Srch04.up0().one_flg(oneFlg);
			Avl_Srch04.up0().gr_no_sort_flg(grNoSortFlg);
			Avl_Srch04.up0().except_zero_flg(exceptZeroFlg);
			Avl_Srch04.up0().short_ope_typ(shortOpeTyp);
			Avl_Srch04.up0().proc_typ(procTyp);
			Avl_Srch04.up0().setBooleanNE("minus_stk_chk_flg", minusStkChkFlg);
			Avl_Srch04.up1().addAll(grList);
			Avl_Srch04.up2().addAll(giList);
			Avl_Srch04.exec();

			grList.setAll(Avl_Srch04.down0());
			giList.setAll(Avl_Srch04.down1());
			retL.setAll(Avl_Srch04.down2());
		}
		else {
			// マルチスレッドで実行する
			String[] keys = new String[]{Avl_ListR.$itm_cd, Avl_ListR.$itm_sub1, Avl_ListR.$itm_sub2, Avl_ListR.$itm_sub3};

			MCGroupByPolicy gp = new MCGroupByPolicy();
			gp.addKey(keys);
			MCList<Avl_ListR> grGpL = grList.groupBy(gp);
			MCList<Avl_ListR> giGpL = giList.groupBy(gp);
			grGpL.merge(giGpL, keys);

			MCIndexKey grIdx = grList.createIndex(keys);
			MCIndexKey giIdx = giList.createIndex(keys);
			ArrayList<Alloc_Avl_Srch04> opL = new ArrayList<Alloc_Avl_Srch04>();
			for (Avl_ListR r :grGpL) {
				MSBEL_AllocMngService.Alloc_Avl_Srch04 Avl_Srch04 = MSBEL_AllocMngService.crtAlloc_Avl_Srch04();
				Avl_Srch04.up0().one_flg(oneFlg);
				Avl_Srch04.up0().gr_no_sort_flg(grNoSortFlg);
				Avl_Srch04.up0().except_zero_flg(exceptZeroFlg);
				Avl_Srch04.up0().short_ope_typ(shortOpeTyp);
				Avl_Srch04.up0().proc_typ(procTyp);
				Avl_Srch04.up0().setBooleanNE("minus_stk_chk_flg", minusStkChkFlg);
				Avl_Srch04.up1().addAll(grList.subList(grIdx, r.toArray(keys)));
				Avl_Srch04.up2().addAll(giList.subList(giIdx, r.toArray(keys)));
				opL.add(Avl_Srch04);
			}

			if (opL.size() > 0) {
				try {
					MCServerThreadManager.invokeAndWait(opL, CLAZZ);
				}
				catch (MCException e) {
					MCMessageList msgList = new MCMessageList();
					MCAppException ex = null;
					for (MCOperation o :opL) {
						MCException opLex = MCServerThreadManager.getException(o);
						if (opLex != null) {
							if (opLex instanceof MCAppException) {
								if (ex == null) {
									ex = (MCAppException) opLex;
								}
								else {
									msgList.add(opLex.getMCMessage());
								}
							}
							else {
								throw opLex;
							}
						}
					}
					if (ex == null) {
						throw e;
					}
					else {
						ex.setCauseMessageList(msgList);
						throw ex;
					}
				}

				// 実行結果を設定する
				grList.clear();
				giList.clear();
				for (Alloc_Avl_Srch04 op :opL) {
					grList.addAll(op.down0());
					giList.addAll(op.down1());
					retL.addAll(op.down2());
				}
			}
		}

		return retL;
	}

	// doCalcからマッチングのみを抜き出した処理
	// doCalcを変更する場合は本処理も修正すること
	protected void doMatch(
			Alloc_Avl_Srch02_CndR cnd,
			MCList<Avl_ListR> list,
			MCList<Avl_ListR> tgtList,
			String procTyp,
			boolean isGr) {

		if (list.isEmpty()) {
			return;
		}

		if (isGr) {
			getIdx(list, procTyp);
			
			// 有効期限を引き継ぐためのMap
			Map<MCNumber, MCList<Vld_ListR>> vldMap = new java.util.HashMap<MCNumber, MCList<Vld_ListR>>();
			cnd.addBooleanColumn("doMatchFlg", true);

			MCIndexKey Idx = tgtList.createIndex(_stkAllocFlg);
			
			for (Avl_ListR tgtR :tgtList.subList(Idx, true)) {
				doMatchSub(tgtR, vldMap, list, cnd, procTyp);
			}
			
			MCList <Avl_ListR> stkAllocTgtL = tgtList.subList(Idx, false);
			Alloc_Avl_Srch01_CndR up0 = Alloc_Avl_Srch01_CndR.create();
			if (!stkAllocTgtL.isEmpty()) {
				up0.addBooleanColumn("minus_stk_chk_flg", cnd.getBooleanNE("minus_stk_chk_flg"));
				up0.addBooleanColumn("doMatchFlg", true);
				editPackAllocFlg(up0, list, true);
				
				for (Avl_ListR stkAllocTgtR :stkAllocTgtL) {
					doMatchSub(stkAllocTgtR, vldMap, list, cnd, procTyp);
				}
				
				editPackAllocFlg(up0, list, false);
			}
		}
		else {
			getIdx_gi(list, procTyp);

			FXUCL_MCDbcCache<MAM_LOC_R> locCache = null;
			if (isSame(procTyp, _propGrs)) {
				MAM_LOC_R t = MAM_LOC_R.create("T");
				MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
				dbcL_bldr.setSelect(t.lg_grp_cd, t.alloc_grp_cd);
				locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, tgtList, Srch_RsltR.$stk_loc_cd);
			}
			
			for (Avl_ListR tgtR :tgtList) {

				// 上り電文の不足項目を補完する
				Avl_ListR tgtCloneR = tgtR.clone();
				if (isSame(procTyp, _propGrs)) {
					MAM_LOC_R loc = locCache.get(tgtCloneR.gi_loc_cd());
					tgtCloneR.stk_lg_grp_cd(loc.lg_grp_cd());
					tgtCloneR.stk_alloc_grp_cd(loc.alloc_grp_cd());
				}

				// マッチした出庫予定に目印を付ける
				for (Avl_ListR giRow :propAvl_gi(cnd, list, tgtCloneR, procTyp)) {
					giRow.peg_no(tgtR.peg_no());
					giRow.tgt_flg(true);
				}
			}
		}
	}

	protected void doMatchSub(Avl_ListR tgtR, Map<MCNumber, MCList<Vld_ListR>> vldMap,
			MCList<Avl_ListR> list, Alloc_Avl_Srch02_CndR cnd, String procTyp) {
		// 有効期限ＦＲＯＭ継承Ｇが指定されている場合は有効期限を引き継ぐ（ロット逆転禁止のための考慮）
		setVldDtFrGrp(tgtR, vldMap);

		// マッチングを行い在庫・入庫予定を抽出する
		MCList<Avl_ListR> extGrList = propAvl(cnd, list, tgtR, procTyp);

		// マッチした在庫・入庫予定に目印を付ける
		for (Avl_ListR grRow :extGrList) {
			if (MAC_ALLOC_SCOPE_TYP.isLOC(tgtR.alloc_scope_typ())) {
				if (tgtR.not_lot_fix_flg()) {
					grRow.loc_flg(true);
				}
				else {
					grRow.loc_lot_flg(true);
				}
			}
			grRow.tgt_flg(true);
			// 有効期限ＦＲＯＭ継承Ｇごとに有効期限、納品予定日をキャッシュする
			cacheVldDtFrGrp(tgtR, grRow, vldMap);
		}
	}

	protected void editPackAllocFlg(Alloc_Avl_Srch01_CndR up0, MCList<Avl_ListR> list, boolean flg) {
		if (up0.getBooleanNE("minus_stk_chk_flg")) {
			for (Avl_ListR r: list) {
				MAM_ITM_R itm = getMamItmCache(r);
				if(itm.minus_stk_flg()) {
					continue;
				}
				
				if (flg) {
					r.setBooleanNE("old_pack_alloc_flg", r.pack_alloc_flg());
					r.setBooleanNE("chk_pack_unit", true);
					
					MAM_LOC_R giLocR = getStkLocCache(r);
					if (!giLocR.gi_pack_xfer_flg()) {
						r.pack_alloc_flg(true);
					}
					else {
						r.pack_alloc_flg(false);
					}
				}
				else {
					r.pack_alloc_flg(r.getBooleanNE("old_pack_alloc_flg"));
					r.setBooleanNE("chk_pack_unit", false);
					if (!up0.getBooleanNE("doMatchFlg")) {
						convBaseInptPackQty(r);
					}
				}
			}
		}
	}

	// giListとgrListのマッチングと同じ処理をdoMatchで実行している
	//　本処理を修正する場合はdoMatchも修正すること
	protected MCList<Srch_RsltR> doCalc(
			Alloc_Avl_Srch02_CndR cnd,
			MCList<Avl_ListR> grList,
			MCList<Avl_ListR> giList,
			boolean oneFlg,			// 標準では未使用
			boolean grNoSortFlg,	// 標準では未使用
			String shortOpeTyp,
			String procTyp,
			MCList<Avl_ListR> canGrList,
			MCList<Lno_ListR> lnoList) {

		if (isNull(_autotest)) {
			_autotest = mcframe.serverCore.sys.MCSys.env.getVMEnv("autotest");
		}

		// 計算途中の数量を格納する変数を定義
		MCNumber grQty;			// 在庫数量＋入庫予定数量(有効成分対象の場合は有効成分をセットする)
		MCNumber giQty;			// 出庫予定数量(有効成分対象の場合は有効成分をセットする)
		MCNumber alloc_qty;		// 引当済数量（有効成分対象の場合は有効成分から換算した後の値）
		MCNumber not_alloc_qty;	// 未引当数量（有効成分対象の場合は有効成分から換算した後の値）
		MCNumber grQtyLastTime = MCNumber.ZERO;
		MCNumber giQtyLastTime = MCNumber.ZERO;
		MCNumber giContQtySrc;	// 引当対象の有効成分
		MCNumber allocQtyTotal;	// 引当済数量の合計
		Avl_ListR grRowLastTime;
		boolean adjustContQtyFlg;

		// 引当済の出庫予定のときはtrue
		boolean allocGiFlg;

		// 使用可能数の計算のときはtrue
		boolean procTypAllocFlg = isAvl(procTyp);

		// ロット提案結果を格納するリスト
		MCList<Srch_RsltR> allocList = MCList.create(Srch_RsltR.class);

		// 有効期限を引き継ぐためのMap
		Map<MCNumber, MCList<Vld_ListR>> vldMap = new java.util.HashMap<MCNumber, MCList<Vld_ListR>>();

		// 取消対象の出庫予定が引き当てた在庫または入庫予定を格納するリスト
		MCList<Avl_ListR> allocGrList = MCList.create(Avl_ListR.class);

		getIdx(grList, procTyp);

		giSort(giList, procTyp);

		for (Avl_ListR giRow :giList) {
			giQty = getBfCalcQty(giRow);
			if (procTypAllocFlg) {
				if (giQty.lte(MCNumber.ZERO)) {
					continue;
				}
			}
			giContQtySrc = giRow.cont_qty();
			allocQtyTotal = MCNumber.ZERO;
			grRowLastTime = null;
			if (!giRow.chk_cont_fctr_flg() || isNull(giContQtySrc)) {
				adjustContQtyFlg = false;
			}
			else {
				adjustContQtyFlg = true;
			}

			// 有効期限ＦＲＯＭ継承Ｇが指定されている場合は有効期限を引き継ぐ（ロット逆転禁止のための考慮）
			setVldDtFrGrp(giRow, vldMap);

			// マッチングを行い在庫、入庫予定を抽出する
			MCList<Avl_ListR> extGrList = getExtGrList(cnd, grList, giRow, procTyp);

			if (isNull(extGrList) || extGrList.isEmpty()) {
				if (MSC_SHORT_OPE_TYP.isFIN(shortOpeTyp)) {
					throw new MCAppException(MSBEL0039);
				}
				continue;
			}

			if (!grNoSortFlg) {
				grSort(giRow, extGrList, procTyp);
			}

			if (MSC_SCHD_STK_TYP.isLOC_GI_SCHD(giRow.schd_stk_typ()) || MSC_SCHD_STK_TYP.isGRS_GI_SCHD(giRow.schd_stk_typ())) {
				allocGiFlg = true;
			}
			else {
				allocGiFlg = false;
			}

			boolean firstGrCalcFlg = true;
			// マッチした在庫数量＋入庫予定数量から出庫予定数量を引き算する
			for (Avl_ListR grRow :extGrList) {
				grQty = getGrBfCalcQty(grRow, giRow);
				if (grQty.lte(MCNumber.ZERO)) {
					continue;
				}

				if (cnd.dtl_calc_flg()
						&& !isSame(MCSys.request.reqSrcId(), "MSBEP0500")) {
					// 出庫と入庫の紐づきを保持する
					Lno_ListR lnoRow = Lno_ListR.create();
					lnoRow.gi_lno(giRow.lno());
					lnoRow.gr_lno(grRow.lno());
					lnoList.add(lnoRow);
				}

				// 取消対象の出庫予定が引き当てた在庫・入庫予定を格納するためのRow
				Avl_ListR allocGrRow = grRow.clone();

				// 有効期限ＦＲＯＭ継承Ｇごとに有効期限、納品予定日をキャッシュする
				cacheVldDtFrGrp(giRow, grRow, vldMap);

				// 入庫遅れ引当フラグ、場所違い引当フラグを設定する
				// 前処理ですでに全数引当済（出庫予定数が０）の場合はオンにしない
				if (allocGiFlg && giQty.isPositive()) {
					// 物流グループ毎引当フラグがオンの場合は場所違い引当フラグをオンにする
					// ※場所引当ができず物流グループ引当ができた場合
					if (cnd.lg_flg()) {
						giRow.another_loc_alloc_flg(true);
						grRow.another_loc_alloc_flg(true);
					}
					// 引き当てた入庫予定が出庫予定に対して遅れている（入庫予定の入庫遅れ引当フラグ（一時使用）がオン）の場合、入庫遅れ引当フラグをオンにする
					// 〇注意事項
					// 出庫予定の予定日に対して、引き当てた入庫予定の予定日が遅れている（出庫予定日＋引当余裕日数＜入庫予定日）の場合、
					// 出庫予定と入庫予定の入庫遅れ引当フラグをtrueにします。
					// 遅れているかどうかの判断はgetExtGrListメソッドから呼ばれる（直接呼んでいません）chkGiGrDtメソッドにて行い、
					// getExtGrListの戻り値（引当候補の入庫予定）に対して入庫遅れ引当フラグをセットしますが、
					// この入庫予定リストはあくまで候補であり、実際に引当られるかどうかはこのメソッドのマッチング処理次第です。
					// 例えばgetExeGrListで２件取得されても、最初の１件で出庫予定数が満たされれば、残りの１件は使用されません。
					// このとき、残りの１件については入庫遅れ引当フラグをオフにしなければなりません。
					// （別の出庫予定に対しては入庫遅れではない可能性があるため。）
					// そのため、chkGiGrDtメソッドでは「入庫遅れ引当フラグ（一時使用）」を設定しておき、
					// このメソッドのマッチングでマッチした場合にはじめて入庫予定と出庫予定の入庫遅れ引当フラグをtrueにします。
					if (grRow.overdue_alloc_tmp_flg()) {
						giRow.overdue_alloc_flg(true);
						grRow.overdue_alloc_flg(true);
					}
				}

				if (adjustContQtyFlg) {
					if (isNull(grRowLastTime)) {
						grRowLastTime = grRow;
					}
					else {
						// 有効成分係数が同じであるかチェックする
						if (!isSame(nvl(grRowLastTime.act_cont_fctr(), grRowLastTime.std_cont_fctr()), nvl(grRow.act_cont_fctr(), grRow.std_cont_fctr()))) {
							adjustContQtyFlg = false;
						}
						else {
							// 複数のロットが引き当たる場合は調整しない
							if (!giRow.not_lot_fix_flg() && (!isSame(grRowLastTime.lot_no(), grRow.lot_no()) || !isSame(grRowLastTime.sublot_no(), grRow.sublot_no()))) {
								adjustContQtyFlg = false;
							}
						}
						grRowLastTime = grRow;
					}
				}

				// 有効成分対象のときに、有効成分では足りているが換算すると足りなくなる場合のチェック
				MCNumber giQtyTmp = giQty;
				if (firstGrCalcFlg) {
					alloc_qty = getAfCalcQty(grRow, giQty);
				}
				else {
					alloc_qty = getAfCalcQty(grRow, giQtyLastTime).subtract(getAfCalcQty(grRow, grQtyLastTime));
				}
				if (grRow.getBooleanNE("useContQtyFlg")) {
					if (grQty.gte(giQty)) {
						MCNumber stkQty;
						if (grRow.pack_alloc_flg()) {
							stkQty = grRow.pack_unit_qty();
						}
						else {
							stkQty = grRow.base_unit_qty();
						}
						Avl_ListR r = grRow.clone(); 
						r.setBooleanNE("unUseContQtyFlg", true);
						if (alloc_qty.gt(stkQty)) {
							alloc_qty = stkQty;
							giQty = convContQty(r, alloc_qty);
						}
					}
				}

				// 出庫予定数量 <= 在庫数量＋入庫予定数量
				if (grQty.gte(giQty) && giQty.gte(giQtyTmp)) {
					// 有効成分係数が同じ場合に引当済数量を調整する
					if (adjustContQtyFlg && !firstGrCalcFlg) {
						allocQtyTotal = allocQtyTotal.add(alloc_qty);
						MCNumber contQty = allocQtyTotal.multiply(nvl(grRow.act_cont_fctr(), grRow.std_cont_fctr()));
						
						// 有効成分を超えている場合は、引当対象の有効成分を換算した値に置き換える
						if (contQty.gt(giContQtySrc)) {
							MCNumber diffQty = allocQtyTotal.subtract(getAfCalcQty(grRow, giContQtySrc));
							alloc_qty = alloc_qty.subtract(diffQty);
							allocQtyTotal = allocQtyTotal.subtract(diffQty);
							contQty = allocQtyTotal.multiply(nvl(grRow.act_cont_fctr(), grRow.std_cont_fctr()));
						}
						
						// 有効成分が足りない場合
						if (contQty.lt(giContQtySrc)) {
							// 小数部有効桁数の許容する最小値
							double minQty;
							MCNumber stkQty;
							if (grRow.pack_alloc_flg()) {
								minQty = Math.pow(10, grRow.pack_unit_dec_place().negate().intValue());
								stkQty = grRow.pack_unit_qty();
							}
							else {
								minQty = Math.pow(10, grRow.base_unit_dec_place().negate().intValue());
								stkQty = grRow.base_unit_qty();
							}

							// 最小値を加算して有効成分に換算する。引当対象の有効成分を充足していたら終了する
							do {
								// 在庫数量を超えてしまうなら加算しないで終了する
								if (alloc_qty.add(minQty).gt(stkQty)) {
									break;
								}
								alloc_qty = alloc_qty.add(minQty);
								allocQtyTotal = allocQtyTotal.add(minQty);
								contQty = allocQtyTotal.multiply(nvl(grRow.act_cont_fctr(), grRow.std_cont_fctr()));
							} while (contQty.lt(giContQtySrc));

							// 有効成分を調整の結果に合わせる。要求した数量が変更されるかもしれないが端数処理の結果なので許容する
							Avl_ListR r = grRow.clone(); 
							r.setBooleanNE("unUseContQtyFlg", true);
							giQty = giQty.add(convContQty(r, allocQtyTotal).subtract(giContQtySrc));
						}
					}

					giRow.cont_qty(MCNumber.ZERO);
					grRow.cont_qty(convContQty(grRow, grQty.subtract(giQty)));
					allocGrRow.cont_qty(convContQty(grRow, giQty));

					// 引き当てたロット情報・数量をセットする 
					Srch_RsltR allocR;
					if (procTypAllocFlg) {
						// allocListは不要なので計算に必要な値のみ設定する
						allocR = Srch_RsltR.create();
						allocR.pack_unit_qty(grRow.pack_unit_qty());
						allocR.base_unit_qty(grRow.base_unit_qty());
					}
					else {
						allocR = setAllocRslt(giRow, grRow, convContQty(grRow, giQty), procTyp);
					}

					if (grRow.pack_alloc_flg()) {
						allocR.pack_unit_qty(alloc_qty);
						allocR.base_unit_qty(convBaseQty(allocR.pack_unit_qty(), grRow));
						not_alloc_qty = grRow.pack_unit_qty().subtract(alloc_qty);

						if (cnd.dtl_calc_flg()) {
							if (allocGiFlg) {
								// 引当済数量の設定
								if (isSame(procTyp, _allocLot)) {
									grRow.pack_unit_lot_alloc_qty(grRow.pack_unit_lot_alloc_qty().add(allocR.pack_unit_qty()));
									giRow.pack_unit_lot_alloc_qty(giRow.pack_unit_lot_alloc_qty().add(giRow.pack_unit_qty()));
								}
								else if (isSame(procTyp, _allocNoLot)) {
									grRow.pack_unit_not_lot_alloc_qty(grRow.pack_unit_not_lot_alloc_qty().add(allocR.pack_unit_qty()));
									giRow.pack_unit_not_lot_alloc_qty(giRow.pack_unit_not_lot_alloc_qty().add(giRow.pack_unit_qty()));
								}
								else if (isSame(procTyp, _allocLgLot)) {
									grRow.pack_unit_lg_lot_alloc_qty(grRow.pack_unit_lg_lot_alloc_qty().add(allocR.pack_unit_qty()));
									giRow.pack_unit_lg_lot_alloc_qty(giRow.pack_unit_lg_lot_alloc_qty().add(giRow.pack_unit_qty()));
								}
								else if (isSame(procTyp, _allocLgNoLot)) {
									grRow.pack_unit_lg_not_lot_alloc_qty(grRow.pack_unit_lg_not_lot_alloc_qty().add(allocR.pack_unit_qty()));
									giRow.pack_unit_lg_not_lot_alloc_qty(giRow.pack_unit_lg_not_lot_alloc_qty().add(giRow.pack_unit_qty()));
								}
								else if (isSame(procTyp, _allocGrs) || isSame(procTyp, _allocGrsLot)) {
									grRow.pack_unit_grs_alloc_qty(grRow.pack_unit_grs_alloc_qty().add(allocR.pack_unit_qty()));
									giRow.pack_unit_grs_alloc_qty(giRow.pack_unit_grs_alloc_qty().add(giRow.pack_unit_qty()));
								}
							}
							else {
								// 保留数量の設定
								if (isSame(procTyp, _allocLot)) {
									grRow.pack_unit_lot_wait_qty(grRow.pack_unit_lot_wait_qty().add(allocR.pack_unit_qty()));
									giRow.pack_unit_lot_wait_qty(giRow.pack_unit_lot_wait_qty().add(giRow.pack_unit_qty()));
								}
								else if (isSame(procTyp, _allocNoLot)) {
									grRow.pack_unit_not_lot_wait_qty(grRow.pack_unit_not_lot_wait_qty().add(allocR.pack_unit_qty()));
									giRow.pack_unit_not_lot_wait_qty(giRow.pack_unit_not_lot_wait_qty().add(giRow.pack_unit_qty()));
								}
								else if (isSame(procTyp, _allocLgLot)) {
									grRow.pack_unit_lg_lot_wait_qty(grRow.pack_unit_lg_lot_wait_qty().add(allocR.pack_unit_qty()));
									giRow.pack_unit_lg_lot_wait_qty(giRow.pack_unit_lg_lot_wait_qty().add(giRow.pack_unit_qty()));
								}
								else if (isSame(procTyp, _allocLgNoLot)) {
									grRow.pack_unit_lg_not_lot_wait_qty(grRow.pack_unit_lg_not_lot_wait_qty().add(allocR.pack_unit_qty()));
									giRow.pack_unit_lg_not_lot_wait_qty(giRow.pack_unit_lg_not_lot_wait_qty().add(giRow.pack_unit_qty()));
								}
								else if (isSame(procTyp, _allocGrs) || isSame(procTyp, _allocGrsLot)) {
									grRow.pack_unit_grs_wait_qty(grRow.pack_unit_grs_wait_qty().add(allocR.pack_unit_qty()));
									giRow.pack_unit_grs_wait_qty(giRow.pack_unit_grs_wait_qty().add(giRow.pack_unit_qty()));
								}
							}

							// 未引当数量の設定
							if (isSame(procTyp, _allocLot)) {
								grRow.pack_unit_lot_qty(not_alloc_qty);
								giRow.pack_unit_lot_qty(MCNumber.ZERO);
							}
							if (isSame(procTyp, _allocLot) || isSame(procTyp, _allocNoLot)) {
								grRow.pack_unit_not_lot_qty(not_alloc_qty);
								giRow.pack_unit_not_lot_qty(MCNumber.ZERO);
							}
							if (isSame(procTyp, _allocLot) || isSame(procTyp, _allocNoLot) || isSame(procTyp, _allocLgLot)) {
								grRow.pack_unit_lg_lot_qty(not_alloc_qty);
								giRow.pack_unit_lg_lot_qty(MCNumber.ZERO);
							}
							if (isSame(procTyp, _allocLot) || isSame(procTyp, _allocNoLot)
									|| isSame(procTyp, _allocLgLot) || isSame(procTyp, _allocLgNoLot)) {
								grRow.pack_unit_lg_not_lot_qty(not_alloc_qty);
								giRow.pack_unit_lg_not_lot_qty(MCNumber.ZERO);
							}
						}
						if (procTypAllocFlg) {
							if (allocGiFlg) {
								grRow.pack_unit_alloc_qty(grRow.pack_unit_alloc_qty().add(allocR.pack_unit_qty()));
								giRow.pack_unit_alloc_qty(giRow.pack_unit_alloc_qty().add(giRow.pack_unit_qty()));
							}
							else {
								grRow.pack_unit_wait_qty(grRow.pack_unit_wait_qty().add(allocR.pack_unit_qty()));
								giRow.pack_unit_wait_qty(giRow.pack_unit_wait_qty().add(giRow.pack_unit_qty()));
							}
						}
						grRow.pack_unit_qty(not_alloc_qty);
						giRow.pack_unit_qty(MCNumber.ZERO);
					}
					else {
						allocR.base_unit_qty(alloc_qty);
						allocR.pack_unit_cd(allocR.base_unit_cd());
						allocR.pack_unit_qty(allocR.base_unit_qty());
						allocR.pack_unit_dec_place(allocR.base_unit_dec_place());
						allocR.pack_unit_rnd_typ(allocR.base_unit_rnd_typ());
						not_alloc_qty = grRow.base_unit_qty().subtract(alloc_qty);

						if (cnd.dtl_calc_flg()) {
							if (allocGiFlg) {
								// 引当済数量の設定
								if (isSame(procTyp, _allocLot)) {
									grRow.base_unit_lot_alloc_qty(grRow.base_unit_lot_alloc_qty().add(allocR.base_unit_qty()));
									giRow.base_unit_lot_alloc_qty(giRow.base_unit_lot_alloc_qty().add(giRow.base_unit_qty()));
								}
								else if (isSame(procTyp, _allocNoLot)) {
									grRow.base_unit_not_lot_alloc_qty(grRow.base_unit_not_lot_alloc_qty().add(allocR.base_unit_qty()));
									giRow.base_unit_not_lot_alloc_qty(giRow.base_unit_not_lot_alloc_qty().add(giRow.base_unit_qty()));
								}
								else if (isSame(procTyp, _allocLgLot)) {
									grRow.base_unit_lg_lot_alloc_qty(grRow.base_unit_lg_lot_alloc_qty().add(allocR.base_unit_qty()));
									giRow.base_unit_lg_lot_alloc_qty(giRow.base_unit_lg_lot_alloc_qty().add(giRow.base_unit_qty()));
								}
								else if (isSame(procTyp, _allocLgNoLot)) {
									grRow.base_unit_lg_not_lot_alloc_qty(grRow.base_unit_lg_not_lot_alloc_qty().add(allocR.base_unit_qty()));
									giRow.base_unit_lg_not_lot_alloc_qty(giRow.base_unit_lg_not_lot_alloc_qty().add(giRow.base_unit_qty()));
								}
								else if (isSame(procTyp, _allocGrs) || isSame(procTyp, _allocGrsLot)) {
									grRow.base_unit_grs_alloc_qty(grRow.base_unit_grs_alloc_qty().add(allocR.base_unit_qty()));
									giRow.base_unit_grs_alloc_qty(giRow.base_unit_grs_alloc_qty().add(giRow.base_unit_qty()));
								}
							}
							else {
								// 保留数量の設定
								if (isSame(procTyp, _allocLot)) {
									grRow.base_unit_lot_wait_qty(grRow.base_unit_lot_wait_qty().add(allocR.base_unit_qty()));
									giRow.base_unit_lot_wait_qty(giRow.base_unit_lot_wait_qty().add(giRow.base_unit_qty()));
								}
								else if (isSame(procTyp, _allocNoLot)) {
									grRow.base_unit_not_lot_wait_qty(grRow.base_unit_not_lot_wait_qty().add(allocR.base_unit_qty()));
									giRow.base_unit_not_lot_wait_qty(giRow.base_unit_not_lot_wait_qty().add(giRow.base_unit_qty()));
								}
								else if (isSame(procTyp, _allocLgLot)) {
									grRow.base_unit_lg_lot_wait_qty(grRow.base_unit_lg_lot_wait_qty().add(allocR.base_unit_qty()));
									giRow.base_unit_lg_lot_wait_qty(giRow.base_unit_lg_lot_wait_qty().add(giRow.base_unit_qty()));
								}
								else if (isSame(procTyp, _allocLgNoLot)) {
									grRow.base_unit_lg_not_lot_wait_qty(grRow.base_unit_lg_not_lot_wait_qty().add(allocR.base_unit_qty()));
									giRow.base_unit_lg_not_lot_wait_qty(giRow.base_unit_lg_not_lot_wait_qty().add(giRow.base_unit_qty()));
								}
								else if (isSame(procTyp, _allocGrs) || isSame(procTyp, _allocGrsLot)) {
									grRow.base_unit_grs_wait_qty(grRow.base_unit_grs_wait_qty().add(allocR.base_unit_qty()));
									giRow.base_unit_grs_wait_qty(giRow.base_unit_grs_wait_qty().add(giRow.base_unit_qty()));
								}
							}

							// 未引当数量の設定
							if (isSame(procTyp, _allocLot)) {
								grRow.base_unit_lot_qty(not_alloc_qty);
								giRow.base_unit_lot_qty(MCNumber.ZERO);
							}
							if (isSame(procTyp, _allocLot) || isSame(procTyp, _allocNoLot)) {
								grRow.base_unit_not_lot_qty(not_alloc_qty);
								giRow.base_unit_not_lot_qty(MCNumber.ZERO);
							}
							if (isSame(procTyp, _allocLot) || isSame(procTyp, _allocNoLot) || isSame(procTyp, _allocLgLot)) {
								grRow.base_unit_lg_lot_qty(not_alloc_qty);
								giRow.base_unit_lg_lot_qty(MCNumber.ZERO);
							}
							if (isSame(procTyp, _allocLot) || isSame(procTyp, _allocNoLot)
									|| isSame(procTyp, _allocLgLot) || isSame(procTyp, _allocLgNoLot)) {
								grRow.base_unit_lg_not_lot_qty(not_alloc_qty);
								giRow.base_unit_lg_not_lot_qty(MCNumber.ZERO);
							}
						}
						if (procTypAllocFlg) {
							if (allocGiFlg) {
								grRow.base_unit_alloc_qty(grRow.base_unit_alloc_qty().add(allocR.base_unit_qty()));
								giRow.base_unit_alloc_qty(giRow.base_unit_alloc_qty().add(giRow.base_unit_qty()));
							}
							else {
								grRow.base_unit_wait_qty(grRow.base_unit_wait_qty().add(allocR.base_unit_qty()));
								giRow.base_unit_wait_qty(giRow.base_unit_wait_qty().add(giRow.base_unit_qty()));
							}
						}
						grRow.base_unit_qty(not_alloc_qty);
						giRow.base_unit_qty(MCNumber.ZERO);
					}

					allocList.add(allocR);
					allocGrRow.base_unit_qty(allocR.base_unit_qty());
					allocGrRow.pack_unit_qty(allocR.pack_unit_qty());

					// 出庫予定が取消対象の場合、取消対象の在庫・入庫予定リストに追加
					if (giRow.can_gi_flg()) {
						allocGrList.add(allocGrRow);
					}

					// 数量が足りていれば次の出庫予定の処理に移る
					giQty = MCNumber.ZERO;
					if (isSame(procTyp, _propLoc) || isSame(procTyp, _propGrs)) {
						convBaseInptPackQty(giRow);
					}
					else {
						convBasePackQty(giRow);
					}
					break;
				}
				// 在庫数量＋入庫予定数量 < 出庫予定数量
				else if (!oneFlg) {
					giRow.cont_qty(convContQty(grRow, giQty.subtract(grQty)));
					grRow.cont_qty(MCNumber.ZERO);
					if (grRow.pack_alloc_flg()) {
						alloc_qty = grRow.pack_unit_qty();
					} else {
						alloc_qty = grRow.base_unit_qty();
					}
					allocGrRow.cont_qty(convContQty(grRow, grQty));
					giQtyLastTime = giQty;
					grQtyLastTime = grQty;
					allocQtyTotal = allocQtyTotal.add(alloc_qty);

					// 引き当てたロット情報・数量をセットする 
					Srch_RsltR allocR;
					if (procTypAllocFlg) {
						// allocListは不要なので計算に必要な値のみ設定する
						allocR = Srch_RsltR.create();
						allocR.pack_unit_qty(grRow.pack_unit_qty());
						allocR.base_unit_qty(grRow.base_unit_qty());
					}
					else {
						allocR = setAllocRslt(giRow, grRow, convContQty(grRow, grQty), procTyp);
					}

					if (grRow.pack_alloc_flg()) {
						allocR.pack_unit_qty(alloc_qty);
						allocR.base_unit_qty(convBaseQty(allocR.pack_unit_qty(), grRow));
						not_alloc_qty = giRow.pack_unit_qty().subtract(alloc_qty);

						if (cnd.dtl_calc_flg()) {
							if (allocGiFlg) {
								// 引当済数量の設定
								if (isSame(procTyp, _allocLot)) {
									grRow.pack_unit_lot_alloc_qty(grRow.pack_unit_lot_alloc_qty().add(grRow.pack_unit_qty()));
									giRow.pack_unit_lot_alloc_qty(giRow.pack_unit_lot_alloc_qty().add(allocR.pack_unit_qty()));
								}
								else if (isSame(procTyp, _allocNoLot)) {
									grRow.pack_unit_not_lot_alloc_qty(grRow.pack_unit_not_lot_alloc_qty().add(grRow.pack_unit_qty()));
									giRow.pack_unit_not_lot_alloc_qty(giRow.pack_unit_not_lot_alloc_qty().add(allocR.pack_unit_qty()));
								}
								else if (isSame(procTyp, _allocLgLot)) {
									grRow.pack_unit_lg_lot_alloc_qty(grRow.pack_unit_lg_lot_alloc_qty().add(grRow.pack_unit_qty()));
									giRow.pack_unit_lg_lot_alloc_qty(giRow.pack_unit_lg_lot_alloc_qty().add(allocR.pack_unit_qty()));
								}
								else if (isSame(procTyp, _allocLgNoLot)) {
									grRow.pack_unit_lg_not_lot_alloc_qty(grRow.pack_unit_lg_not_lot_alloc_qty().add(grRow.pack_unit_qty()));
									giRow.pack_unit_lg_not_lot_alloc_qty(giRow.pack_unit_lg_not_lot_alloc_qty().add(allocR.pack_unit_qty()));
								}
								else if (isSame(procTyp, _allocGrs) || isSame(procTyp, _allocGrsLot)) {
									grRow.pack_unit_grs_alloc_qty(grRow.pack_unit_grs_alloc_qty().add(grRow.pack_unit_qty()));
									giRow.pack_unit_grs_alloc_qty(giRow.pack_unit_grs_alloc_qty().add(allocR.pack_unit_qty()));
								}
							}
							else {
								// 保留数量の設定
								if (isSame(procTyp, _allocLot)) {
									grRow.pack_unit_lot_wait_qty(grRow.pack_unit_lot_wait_qty().add(grRow.pack_unit_qty()));
									giRow.pack_unit_lot_wait_qty(giRow.pack_unit_lot_wait_qty().add(allocR.pack_unit_qty()));
								}
								else if (isSame(procTyp, _allocNoLot)) {
									grRow.pack_unit_not_lot_wait_qty(grRow.pack_unit_not_lot_wait_qty().add(grRow.pack_unit_qty()));
									giRow.pack_unit_not_lot_wait_qty(giRow.pack_unit_not_lot_wait_qty().add(allocR.pack_unit_qty()));
								}
								else if (isSame(procTyp, _allocLgLot)) {
									grRow.pack_unit_lg_lot_wait_qty(grRow.pack_unit_lg_lot_wait_qty().add(grRow.pack_unit_qty()));
									giRow.pack_unit_lg_lot_wait_qty(giRow.pack_unit_lg_lot_wait_qty().add(allocR.pack_unit_qty()));
								}
								else if (isSame(procTyp, _allocLgNoLot)) {
									grRow.pack_unit_lg_not_lot_wait_qty(grRow.pack_unit_lg_not_lot_wait_qty().add(grRow.pack_unit_qty()));
									giRow.pack_unit_lg_not_lot_wait_qty(giRow.pack_unit_lg_not_lot_wait_qty().add(allocR.pack_unit_qty()));
								}
								else if (isSame(procTyp, _allocGrs) || isSame(procTyp, _allocGrsLot)) {
									grRow.pack_unit_grs_wait_qty(grRow.pack_unit_grs_wait_qty().add(grRow.pack_unit_qty()));
									giRow.pack_unit_grs_wait_qty(giRow.pack_unit_grs_wait_qty().add(allocR.pack_unit_qty()));
								}
							}

							// 未引当数量の設定
							if (isSame(procTyp, _allocLot)) {
								grRow.pack_unit_lot_qty(MCNumber.ZERO);
								giRow.pack_unit_lot_qty(not_alloc_qty);
							}
							if (isSame(procTyp, _allocLot) || isSame(procTyp, _allocNoLot)) {
								grRow.pack_unit_not_lot_qty(MCNumber.ZERO);
								giRow.pack_unit_not_lot_qty(not_alloc_qty);
							}
							if (isSame(procTyp, _allocLot) || isSame(procTyp, _allocNoLot) || isSame(procTyp, _allocLgLot)) {
								grRow.pack_unit_lg_lot_qty(MCNumber.ZERO);
								giRow.pack_unit_lg_lot_qty(not_alloc_qty);
							}
							if (isSame(procTyp, _allocLot) || isSame(procTyp, _allocNoLot)
									|| isSame(procTyp, _allocLgLot) || isSame(procTyp, _allocLgNoLot)) {
								grRow.pack_unit_lg_not_lot_qty(MCNumber.ZERO);
								giRow.pack_unit_lg_not_lot_qty(not_alloc_qty);
							}
						}
						if (procTypAllocFlg) {
							if (allocGiFlg) {
								grRow.pack_unit_alloc_qty(grRow.pack_unit_alloc_qty().add(grRow.pack_unit_qty()));
								giRow.pack_unit_alloc_qty(giRow.pack_unit_alloc_qty().add(allocR.pack_unit_qty()));
							}
							else {
								grRow.pack_unit_wait_qty(grRow.pack_unit_wait_qty().add(grRow.pack_unit_qty()));
								giRow.pack_unit_wait_qty(giRow.pack_unit_wait_qty().add(allocR.pack_unit_qty()));
							}
						}
						grRow.pack_unit_qty(MCNumber.ZERO);
						giRow.pack_unit_qty(not_alloc_qty);
					}
					else {
						allocR.base_unit_qty(alloc_qty);
						allocR.pack_unit_cd(allocR.base_unit_cd());
						allocR.pack_unit_qty(allocR.base_unit_qty());
						allocR.pack_unit_dec_place(allocR.base_unit_dec_place());
						allocR.pack_unit_rnd_typ(allocR.base_unit_rnd_typ());
						not_alloc_qty = giRow.base_unit_qty().subtract(alloc_qty);

						if (cnd.dtl_calc_flg()) {
							if (allocGiFlg) {
								// 引当済数量の設定
								if (isSame(procTyp, _allocLot)) {
									grRow.base_unit_lot_alloc_qty(grRow.base_unit_lot_alloc_qty().add(grRow.base_unit_qty()));
									giRow.base_unit_lot_alloc_qty(giRow.base_unit_lot_alloc_qty().add(allocR.base_unit_qty()));
								}
								else if (isSame(procTyp, _allocNoLot)) {
									grRow.base_unit_not_lot_alloc_qty(grRow.base_unit_not_lot_alloc_qty().add(grRow.base_unit_qty()));
									giRow.base_unit_not_lot_alloc_qty(giRow.base_unit_not_lot_alloc_qty().add(allocR.base_unit_qty()));
								}
								else if (isSame(procTyp, _allocLgLot)) {
									grRow.base_unit_lg_lot_alloc_qty(grRow.base_unit_lg_lot_alloc_qty().add(grRow.base_unit_qty()));
									giRow.base_unit_lg_lot_alloc_qty(giRow.base_unit_lg_lot_alloc_qty().add(allocR.base_unit_qty()));
								}
								else if (isSame(procTyp, _allocLgNoLot)) {
									grRow.base_unit_lg_not_lot_alloc_qty(grRow.base_unit_lg_not_lot_alloc_qty().add(grRow.base_unit_qty()));
									giRow.base_unit_lg_not_lot_alloc_qty(giRow.base_unit_lg_not_lot_alloc_qty().add(allocR.base_unit_qty()));
								}
								else if (isSame(procTyp, _allocGrs) || isSame(procTyp, _allocGrsLot)) {
									grRow.base_unit_grs_alloc_qty(grRow.base_unit_grs_alloc_qty().add(grRow.base_unit_qty()));
									giRow.base_unit_grs_alloc_qty(giRow.base_unit_grs_alloc_qty().add(allocR.base_unit_qty()));
								}
							}
							else {
								// 保留数量の設定
								if (isSame(procTyp, _allocLot)) {
									grRow.base_unit_lot_wait_qty(grRow.base_unit_lot_wait_qty().add(grRow.base_unit_qty()));
									giRow.base_unit_lot_wait_qty(giRow.base_unit_lot_wait_qty().add(allocR.base_unit_qty()));
								}
								else if (isSame(procTyp, _allocNoLot)) {
									grRow.base_unit_not_lot_wait_qty(grRow.base_unit_not_lot_wait_qty().add(grRow.base_unit_qty()));
									giRow.base_unit_not_lot_wait_qty(giRow.base_unit_not_lot_wait_qty().add(allocR.base_unit_qty()));
								}
								else if (isSame(procTyp, _allocLgLot)) {
									grRow.base_unit_lg_lot_wait_qty(grRow.base_unit_lg_lot_wait_qty().add(grRow.base_unit_qty()));
									giRow.base_unit_lg_lot_wait_qty(giRow.base_unit_lg_lot_wait_qty().add(allocR.base_unit_qty()));
								}
								else if (isSame(procTyp, _allocLgNoLot)) {
									grRow.base_unit_lg_not_lot_wait_qty(grRow.base_unit_lg_not_lot_wait_qty().add(grRow.base_unit_qty()));
									giRow.base_unit_lg_not_lot_wait_qty(giRow.base_unit_lg_not_lot_wait_qty().add(allocR.base_unit_qty()));
								}
								else if (isSame(procTyp, _allocGrs) || isSame(procTyp, _allocGrsLot)) {
									grRow.base_unit_grs_wait_qty(grRow.base_unit_grs_wait_qty().add(grRow.base_unit_qty()));
									giRow.base_unit_grs_wait_qty(giRow.base_unit_grs_wait_qty().add(allocR.base_unit_qty()));
								}
							}

							// 未引当数量の設定
							if (isSame(procTyp, _allocLot)) {
								grRow.base_unit_lot_qty(MCNumber.ZERO);
								giRow.base_unit_lot_qty(not_alloc_qty);
							}
							if (isSame(procTyp, _allocLot) || isSame(procTyp, _allocNoLot)) {
								grRow.base_unit_not_lot_qty(MCNumber.ZERO);
								giRow.base_unit_not_lot_qty(not_alloc_qty);
							}
							if (isSame(procTyp, _allocLot) || isSame(procTyp, _allocNoLot) || isSame(procTyp, _allocLgLot)) {
								grRow.base_unit_lg_lot_qty(MCNumber.ZERO);
								giRow.base_unit_lg_lot_qty(not_alloc_qty);
							}
							if (isSame(procTyp, _allocLot) || isSame(procTyp, _allocNoLot)
									|| isSame(procTyp, _allocLgLot) || isSame(procTyp, _allocLgNoLot)) {
								grRow.base_unit_lg_not_lot_qty(MCNumber.ZERO);
								giRow.base_unit_lg_not_lot_qty(not_alloc_qty);
							}
						}
						if (procTypAllocFlg) {
							if (allocGiFlg) {
								grRow.base_unit_alloc_qty(grRow.base_unit_alloc_qty().add(grRow.base_unit_qty()));
								giRow.base_unit_alloc_qty(giRow.base_unit_alloc_qty().add(allocR.base_unit_qty()));
							}
							else {
								grRow.base_unit_wait_qty(grRow.base_unit_wait_qty().add(grRow.base_unit_qty()));
								giRow.base_unit_wait_qty(giRow.base_unit_wait_qty().add(allocR.base_unit_qty()));
							}
						}
						grRow.base_unit_qty(MCNumber.ZERO);
						giRow.base_unit_qty(not_alloc_qty);
					}

					allocList.add(allocR);
					allocGrRow.base_unit_qty(allocR.base_unit_qty());
					allocGrRow.pack_unit_qty(allocR.pack_unit_qty());

					// 出庫予定が取消対象の場合、取消対象の在庫・入庫予定リストに追加
					if (giRow.can_gi_flg()) {
						// 入庫遅れ引当ＦＬＧをクリア
						allocGrRow.overdue_alloc_flg(false);
						allocGrList.add(allocGrRow);
					}
					// 引当対象の数量を減らす
					giQty = giQty.subtract(grQty);
				}
				firstGrCalcFlg = false;
			}

			if (giQty.isPositive() && MSC_SHORT_OPE_TYP.isFIN(shortOpeTyp)) {
				throw new MCAppException(MSBEL0039);
			}

			if (isSame(procTyp, _propLoc) || isSame(procTyp, _propGrs)) {
				convBaseInptPackQty(giRow);
			}
			else {
				convBasePackQty(giRow);
			}
		}

		for (Avl_ListR grRow :grList) {
			convBasePackQty(grRow);
		}

		if (cnd.except_zero_flg()) {
			// 未引当リスト、未引当の数量が0の出庫予定は除く
			giList.setAll(giList.subList(crtExceptZeroMatcher()));

			// 使用可能在庫、未引当の数量が0の在庫、入庫予定は除く
			grList.setAll(grList.subList(crtExceptZeroMatcher()));
		}

		// 引数の取消対象在庫・入庫予定リストに引当対象の在庫・入庫予定リストを追加
		if (!allocGrList.isEmpty()) {
			canGrList.addAll(allocGrList);
		}

		return allocList;
	}

	protected void setVldDtFrGrp(Avl_ListR giRow, Map<MCNumber, MCList<Vld_ListR>> vldMap) {
		if (!isNull(giRow.vld_dt_fr_grp())) {
			MCList<Vld_ListR> vldList = vldMap.get(giRow.vld_dt_fr_grp());
			if (!isNull(vldList)) {
				// 同一有効期限ＦＲＯＭ継承Ｇを保持する行が存在し、かつgiRowよりも過去の納品予定日の行を既に引当済みの場合、
				// その有効期限の最大値を有効期限ＦＲＯＭとして引き継ぐ
				MCDate tmp_vld_dt_fr = (MCDate) vldList
						.subList(vldR -> (!isNull(vldR.gr_schd_dt())
								&& vldR.gr_schd_dt().lt(giRow.gr_schd_dt())))
						.max(Vld_ListR.$vld_dt);

				if (!isNull(tmp_vld_dt_fr) && (isNull(giRow.vld_dt_fr()) || tmp_vld_dt_fr.gt(giRow.vld_dt_fr()))) {
					giRow.vld_dt_fr(tmp_vld_dt_fr);
				}

				// 同一有効期限ＦＲＯＭ継承Ｇを保持する行が存在し、かつgiRowよりも未来の納品予定日の行を既に引当済みの場合、
				// その有効期限の最小値を有効期限ＴＯとして引き継ぐ
				MCDate tmp_vld_dt_to = (MCDate) vldList
						.subList(vldR -> (!isNull(vldR.gr_schd_dt())
								&& vldR.gr_schd_dt().gt(giRow.gr_schd_dt())))
						.min(Vld_ListR.$vld_dt);

				if (!isNull(tmp_vld_dt_to) && (isNull(giRow.vld_dt_to()) || tmp_vld_dt_to.lt(giRow.vld_dt_to()))) {
					giRow.vld_dt_to(tmp_vld_dt_to);
				}
			}
		}
	}

	protected void cacheVldDtFrGrp(Avl_ListR giRow, Avl_ListR grRow, Map<MCNumber, MCList<Vld_ListR>> vldMap) {
		if (!isNull(giRow.vld_dt_fr_grp()) && !isNull(giRow.gr_schd_dt())
				&& !isNull(grRow.vld_dt())) {
			Vld_ListR addR = Vld_ListR.create();
			addR.vld_dt(grRow.vld_dt());
			addR.gr_schd_dt(giRow.gr_schd_dt());

			MCList<Vld_ListR> vldList = vldMap.get(giRow.vld_dt_fr_grp());
			if (!isNull(vldList)) {
				vldList.add(addR);
			}
			else {
				MCList<Vld_ListR> tmpList = MCList.create(Vld_ListR.class);
				tmpList.add(addR);
				vldMap.put(giRow.vld_dt_fr_grp(), tmpList);
			}
		}
	}

	protected MCNumber convBaseQty(MCNumber qty, Avl_ListR r) {
		if (isNull(r.conv_qty()) || isSame(r.conv_qty(), 0)) {
			return null;
		}
		return qty.multiply(r.conv_qty())
				.divide(r.conv_base_qty(), r.base_unit_dec_place().intValue(), MAC_RND_TYP.get(r.base_unit_rnd_typ()).toMC());
	}

	protected void convBasePackQty(Avl_ListR r) {
		if (r.pack_alloc_flg()) {
			r.base_unit_src_qty(convBaseQty(r.pack_unit_src_qty(), r));
			r.base_unit_lot_alloc_qty(convBaseQty(r.pack_unit_lot_alloc_qty(), r));
			r.base_unit_not_lot_alloc_qty(convBaseQty(r.pack_unit_not_lot_alloc_qty(), r));
			r.base_unit_lg_lot_alloc_qty(convBaseQty(r.pack_unit_lg_lot_alloc_qty(), r));
			r.base_unit_lg_not_lot_alloc_qty(convBaseQty(r.pack_unit_lg_not_lot_alloc_qty(), r));
			r.base_unit_grs_alloc_qty(convBaseQty(r.pack_unit_grs_alloc_qty(), r));
			r.base_unit_lot_wait_qty(convBaseQty(r.pack_unit_lot_wait_qty(), r));
			r.base_unit_not_lot_wait_qty(convBaseQty(r.pack_unit_not_lot_wait_qty(), r));
			r.base_unit_lg_lot_wait_qty(convBaseQty(r.pack_unit_lg_lot_wait_qty(), r));
			r.base_unit_lg_not_lot_wait_qty(convBaseQty(r.pack_unit_lg_not_lot_wait_qty(), r));
			r.base_unit_grs_wait_qty(convBaseQty(r.pack_unit_grs_wait_qty(), r));
			r.base_unit_lot_qty(convBaseQty(r.pack_unit_lot_qty(), r));
			r.base_unit_not_lot_qty(convBaseQty(r.pack_unit_not_lot_qty(), r));
			r.base_unit_lg_lot_qty(convBaseQty(r.pack_unit_lg_lot_qty(), r));
			r.base_unit_lg_not_lot_qty(convBaseQty(r.pack_unit_lg_not_lot_qty(), r));
		}
		else {
			r.pack_unit_src_qty(r.base_unit_src_qty());
			r.pack_unit_lot_alloc_qty(r.base_unit_lot_alloc_qty());
			r.pack_unit_not_lot_alloc_qty(r.base_unit_not_lot_alloc_qty());
			r.pack_unit_lg_lot_alloc_qty(r.base_unit_lg_lot_alloc_qty());
			r.pack_unit_lg_not_lot_alloc_qty(r.base_unit_lg_not_lot_alloc_qty());
			r.pack_unit_grs_alloc_qty(r.base_unit_grs_alloc_qty());
			r.pack_unit_lot_wait_qty(r.base_unit_lot_wait_qty());
			r.pack_unit_not_lot_wait_qty(r.base_unit_not_lot_wait_qty());
			r.pack_unit_lg_lot_wait_qty(r.base_unit_lg_lot_wait_qty());
			r.pack_unit_lg_not_lot_wait_qty(r.base_unit_lg_not_lot_wait_qty());
			r.pack_unit_grs_wait_qty(r.base_unit_grs_wait_qty());
			r.pack_unit_lot_qty(r.base_unit_lot_qty());
			r.pack_unit_not_lot_qty(r.base_unit_not_lot_qty());
			r.pack_unit_lg_lot_qty(r.base_unit_lg_lot_qty());
			r.pack_unit_lg_not_lot_qty(r.base_unit_lg_not_lot_qty());
		}
		convBaseInptPackQty(r);
	}

	protected void convBaseInptPackQty(Avl_ListR r) {
		if (r.pack_alloc_flg()) {
			r.base_unit_alloc_qty(convBaseQty(r.pack_unit_alloc_qty(), r));
			r.base_unit_wait_qty(convBaseQty(r.pack_unit_wait_qty(), r));
			r.base_unit_qty(convBaseQty(r.pack_unit_qty(), r));
		}
		else {
			r.pack_unit_cd(r.base_unit_cd());
			r.pack_unit_dec_place(r.base_unit_dec_place());
			r.pack_unit_rnd_typ(r.base_unit_rnd_typ());
			r.conv_base_qty(MCNumber.ONE);
			r.conv_qty(MCNumber.ONE);

			r.pack_unit_alloc_qty(r.base_unit_alloc_qty());
			r.pack_unit_wait_qty(r.base_unit_wait_qty());
			r.pack_unit_qty(r.base_unit_qty());
		}
	}

	protected MCIndexKey _idx = null;
	protected void getIdx(MCList<Avl_ListR> grList, String procTyp) {

		// 使用可能在庫計算
		if (isAvl(procTyp)) {
			// 比較カラムの取得
			ArrayList<String> l = new ArrayList<String>();
			l.add(Avl_ListR.$itm_cd);
			// 総量引当
			if (isSame(procTyp, _allocGrs)) {
				l.add(Avl_ListR.$stk_lg_grp_cd);
				l.add(Avl_ListR.$stk_alloc_grp_cd);
			}
			// 総量引当（ロット有り）
			else if (isSame(procTyp, _allocGrsLot)) {
				l.add(Avl_ListR.$stk_lg_grp_cd);
				l.add(Avl_ListR.$stk_alloc_grp_cd);
				l.add(Avl_ListR.$lot_no);
				l.add(Avl_ListR.$sublot_no);
			}
			// 物流Ｇ
			else if (isSame(procTyp, _allocLgLot) || isSame(procTyp, _allocLgNoLot)) {
				l.add(Avl_ListR.$stk_lg_grp_cd);
				l.add(Avl_ListR.$stk_alloc_grp_cd);
			}
			// 場所引当
			else {
				l.add(Avl_ListR.$stk_loc_cd);
				l.add(Avl_ListR.$stk_arrv_bp_cd);
				l.add(Avl_ListR.$asst_typ);
			}
			// 場所引当（ロットあり）
			if (isSame(procTyp, _allocLot) || isSame(procTyp, _allocLgLot)) {
				l.add(Avl_ListR.$lot_no);
				l.add(Avl_ListR.$sublot_no);
			}
			l.add(Avl_ListR.$in_xfr_typ);
			l.add(Avl_ListR.$quality_typ);
			l.add(Avl_ListR.$stk_insp_typ);
			l.add(Avl_ListR.$stk_id_typ);
			l.add(Avl_ListR.$stk_bp_cd);
			l.add(Avl_ListR.$gd_cd);
			l.add(Avl_ListR.$sno1);
			l.add(Avl_ListR.$sno2);
			l.add(Avl_ListR.$sno3);
			l.add(Avl_ListR.$sno4);
			l.add(Avl_ListR.$itm_sub1);
			l.add(Avl_ListR.$itm_sub2);
			l.add(Avl_ListR.$itm_sub3);

			_idx = grList.createIndex(l.toArray(new String[0]));
		}
		// ロット提案
		else {
			_idx = grList.createIndex(
					new String[]{Avl_ListR.$itm_cd, Avl_ListR.$stk_loc_cd,
							Avl_ListR.$itm_sub1, Avl_ListR.$itm_sub2, Avl_ListR.$itm_sub3});
		}
	}

	protected void getIdx_gi(MCList<Avl_ListR> giList, String procTyp) {

		// 出庫予定と上り電文のマッチング用
		// ロット提案（総量）
		if (isSame(procTyp, _propGrs)) {
			_idx = giList.createIndex(
					new String[]{Avl_ListR.$itm_cd, Avl_ListR.$stk_lg_grp_cd, Avl_ListR.$stk_alloc_grp_cd,
							Avl_ListR.$itm_sub1, Avl_ListR.$itm_sub2, Avl_ListR.$itm_sub3});
		}
		// ロット提案（場所）
		else {
			_idx = giList.createIndex(
					new String[]{Avl_ListR.$itm_cd, Avl_ListR.$stk_loc_cd,
							Avl_ListR.$itm_sub1, Avl_ListR.$itm_sub2, Avl_ListR.$itm_sub3});
		}
	}

	/**
	 * giSort.<p>
	 *
	 * 出庫予定をソートする<br>
	 * @param giList	出庫予定
	 * @param procTyp	処理タイプ
	 */
	protected void giSort(MCList<Avl_ListR> giList, String procTyp) {
		if (isAvl(procTyp)) {
			MCSortPolicy p = new MCSortPolicy();
			p.add(SortType.ASC, Avl_ListR.$schd_stk_prio);
			p.add(SortType.ASC, Avl_ListR.$schd_dt);
			if ("true".equals(_autotest)) {
				for (String col :Avl_ListR.colnames()) {
					p.add(SortType.ASC, col);
				}
			}
			giList.sort(p);
		}
		else {
			giList.sort(Avl_ListR.$lno);
		}
	}

	protected MCList<Avl_ListR> getExtGrList(Alloc_Avl_Srch02_CndR cnd, MCList<Avl_ListR> grList, Avl_ListR giRow, String procTyp) {

		MCList<Avl_ListR> extGrList = MCList.create(Avl_ListR.class);
		if (isAvl(procTyp)) {
			extGrList = extAvl(cnd, grList, giRow, procTyp);
		}
		else {
			extGrList = propAvl(cnd, grList, giRow, procTyp);
		}
		return extGrList;
	}

	/**
	 * grSort.<p>
	 *
	 * 在庫、入庫予定をソートする<br>
	 * @param giRow		引当対象
	 * @param grList	在庫、入庫予定
	 * @param procTyp	処理タイプ
	 */
	protected void grSort(Avl_ListR giRow, MCList<Avl_ListR> grList, String procTyp) {
		grList.sort(crtSortComparator(procTyp, giRow));
	}

	protected sortComparator<Avl_ListR> crtSortComparator(String procTyp, Avl_ListR giRow) {
		return new sortComparator<Avl_ListR>(procTyp, giRow);
	}

	public class sortComparator<T extends Avl_ListR> extends MCRowComparator<T> {

		String		_procTyp;
		Avl_ListR	_giRow;

		public sortComparator(String procTyp, Avl_ListR giRow, String... keys) {
			super(keys);
			_procTyp = procTyp;
			_giRow = giRow;
		}

		@Override
		public int compare(T row1, T row2) {
			int ret = EQUAL;

			if (isSame(_procTyp, _propLoc)) {
				// 提案対象の投入場所と一致する場所
				ret = compareInptloc(row1, row2);	if (!isSame(ret, EQUAL)) return ret;
				// 提案対象の投入棚ラインと一致する棚ライン
				ret = compareInptStrLn(row1, row2);	if (!isSame(ret, EQUAL)) return ret;
				if (!isNull(_giRow.gi_loc_cd())) {
					ret = compareNullValStrLn(_giRow, row1, row2);	if (!isSame(ret, EQUAL)) return ret;
				}
				// 手配ＮＯが一致（ＮＵＬＬ文字の手配ＮＯは優先順位を低く扱う）
				ret = compareSno1(row1, row2);		if (!isSame(ret, EQUAL)) return ret;
				ret = compareSno2(row1, row2);		if (!isSame(ret, EQUAL)) return ret;
				ret = compareSno3(row1, row2);		if (!isSame(ret, EQUAL)) return ret;
				ret = compareSno4(row1, row2);		if (!isSame(ret, EQUAL)) return ret;
				// 引当優先順
				ret = comparePrio(row1, row2);		if (!isSame(ret, EQUAL)) return ret;
				// 提案対象の投入場所の発注先ＣＤと等しい発注先ＣＤの在庫場所
				ret = compareSpplCd(row1, row2);	if (!isSame(ret, EQUAL)) return ret;
				// 自社場所の在庫を優先
				ret = compareCoStk(row1, row2);		if (!isSame(ret, EQUAL)) return ret;
				// 在庫が入庫予定より優先
				ret = compareStkSchd(row1, row2);	if (!isSame(ret, EQUAL)) return ret;
				// 自社資産が優先
				ret = compareAsstCo(row1, row2);	if (!isSame(ret, EQUAL)) return ret;
				// 有効期限が古いものを優先
				ret = compareOldVldDt(row1, row2);		if (!isSame(ret, EQUAL)) return ret;
				// 最古入庫日が古いものを優先
				ret = compareOldFirstGrDt(row1, row2);	if (!isSame(ret, EQUAL)) return ret;
				// ロットシーケンスの値が小さいものを優先
				ret = compareSmallLotSeq(row1, row2);	if (!isSame(ret, EQUAL)) return ret;
			}
			else if (isSame(_procTyp, _propGrs)) {
				// 手配ＮＯが一致（ＮＵＬＬ文字の手配ＮＯは優先順位を低く扱う）
				ret = compareSno1(row1, row2);		if (!isSame(ret, EQUAL)) return ret;
				ret = compareSno2(row1, row2);		if (!isSame(ret, EQUAL)) return ret;
				ret = compareSno3(row1, row2);		if (!isSame(ret, EQUAL)) return ret;
				ret = compareSno4(row1, row2);		if (!isSame(ret, EQUAL)) return ret;
				// 引当優先順
				ret = comparePrio2(row1, row2);		if (!isSame(ret, EQUAL)) return ret;
				// 在庫が入庫予定より優先
				ret = compareStkSchd(row1, row2);	if (!isSame(ret, EQUAL)) return ret;
				// 自社資産が優先
				ret = compareAsstCo(row1, row2);	if (!isSame(ret, EQUAL)) return ret;
				// 有効期限が古いものを優先
				ret = compareOldVldDt(row1, row2);		if (!isSame(ret, EQUAL)) return ret;
				// 最古入庫日が古いものを優先
				ret = compareOldFirstGrDt(row1, row2);	if (!isSame(ret, EQUAL)) return ret;
				// ロットシーケンスの値が小さいものを優先
				ret = compareSmallLotSeq(row1, row2);	if (!isSame(ret, EQUAL)) return ret;
				// 入庫予定日が古いものを優先
				ret = compareOldSchdDt(row1, row2);	if (!isSame(ret, EQUAL)) return ret;
			}
			else {
				// 引当の上り電文と一致するレコードは優先度を下げる
				ret = compareUpMatch(_giRow, row1, row2, _procTyp);	if (!isSame(ret, EQUAL)) return ret;
				// 出庫予定と一致する棚ライン
				if (isSame(_procTyp, _allocLot) || isSame(_procTyp, _allocNoLot)) {
					ret = compareStrLn(_giRow, row1, row2);	if (!isSame(ret, EQUAL)) return ret;
				}
				// 出庫予定日に基づいてソートを行う
				ret = compareSchdDtByGiRow(_giRow, row1, row2);	if (!isSame(ret, EQUAL)) return ret;
				// 予定在庫優先順
				ret = compareSchdStkPrio(row1, row2);	if (!isSame(ret, EQUAL)) return ret;
				if (isSame(_procTyp, _allocGrs) || isSame(_procTyp, _allocGrsLot)) {
					// 引当優先順（総量引当場所グループに対する場所の優先順）
					ret = comparePrio(row1, row2);
					if (isSame(ret, SMALL)) {
						return LARGE;
					}
					else if (isSame(ret, LARGE)) {
						return SMALL;
					}
					// 引当優先順（物流グループに対する場所の優先順）
					ret = comparePrio2(row1, row2);
					if (isSame(ret, SMALL)) {
						return LARGE;
					}
					else if (isSame(ret, LARGE)) {
						return SMALL;
					}
				}
				// 有効期限が新しいものを優先
				ret = compareNewVldDt(row1, row2);		if (!isSame(ret, EQUAL)) return ret;
				// 最古入庫日が新しいものを優先
				ret = compareNewFirstGrDt(row1, row2);	if (!isSame(ret, EQUAL)) return ret;
				// ロットシーケンスの値が大きいものを優先
				ret = compareLargeLotSeq(row1, row2);	if (!isSame(ret, EQUAL)) return ret;
			}

			if ("true".equals(_autotest)) {
				ret = compareAllCols(row1, row2);	if (!isSame(ret, EQUAL)) return ret;
			}
			return EQUAL;
		}
		protected int compareInptloc(T row1, T row2) {
			if (isSame(row1.inpt_loc_cd(), row1.stk_loc_cd()) && !isSame(row2.inpt_loc_cd(), row2.stk_loc_cd())) {
				return SMALL;
			}
			else if (!isSame(row1.inpt_loc_cd(), row1.stk_loc_cd()) && isSame(row2.inpt_loc_cd(), row2.stk_loc_cd())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int compareInptStrLn(T row1, T row2) {
			if (isSame(row1.inpt_loc_cd(), row1.stk_loc_cd())
					&& (isSame(row1.inpt_str_ln_cd(), row1.stk_str_ln_cd()) || (isNullOrNullVal(row1.inpt_str_ln_cd()) && isNullOrNullVal(row1.stk_str_ln_cd())))
					&& isSame(row2.inpt_loc_cd(), row2.stk_loc_cd())
					&& (!isSame(row2.inpt_str_ln_cd(), row2.stk_str_ln_cd()) && (!isNullOrNullVal(row2.inpt_str_ln_cd()) || !isNullOrNullVal(row2.stk_str_ln_cd())))) {
				return SMALL;
			}
			else if (isSame(row1.inpt_loc_cd(), row1.stk_loc_cd())
					&& (!isSame(row1.inpt_str_ln_cd(), row1.stk_str_ln_cd()) && (!isNullOrNullVal(row1.inpt_str_ln_cd()) || !isNullOrNullVal(row1.stk_str_ln_cd())))
					&& isSame(row2.inpt_loc_cd(), row2.stk_loc_cd())
					&& (isSame(row2.inpt_str_ln_cd(), row2.stk_str_ln_cd()) || (isNullOrNullVal(row2.inpt_str_ln_cd()) && isNullOrNullVal(row2.stk_str_ln_cd())))) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int compareNullValStrLn(Avl_ListR giRow, T row1, T row2) {
			if (isNullOrNullVal(giRow.stk_str_ln_cd()) && isNullOrNullVal(row1.stk_str_ln_cd()) && !isNullOrNullVal(row2.stk_str_ln_cd())) {
				return SMALL;
			}
			else if (isNullOrNullVal(giRow.stk_str_ln_cd()) && isNullOrNullVal(row2.stk_str_ln_cd()) && !isNullOrNullVal(row1.stk_str_ln_cd())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int compareSno1(T row1, T row2) {
			if (!MAC_STR.isNULL_VAL(row1.sno1()) && MAC_STR.isNULL_VAL(row2.sno1())) {
				return SMALL;
			}
			else if (MAC_STR.isNULL_VAL(row1.sno1()) && !MAC_STR.isNULL_VAL(row2.sno1())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int compareSno2(T row1, T row2) {
			if (!MAC_STR.isNULL_VAL(row1.sno2()) && MAC_STR.isNULL_VAL(row2.sno2())) {
				return SMALL;
			}
			else if (MAC_STR.isNULL_VAL(row1.sno2()) && !MAC_STR.isNULL_VAL(row2.sno2())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int compareSno3(T row1, T row2) {
			if (!MAC_STR.isNULL_VAL(row1.sno3()) && MAC_STR.isNULL_VAL(row2.sno3())) {
				return SMALL;
			}
			else if (MAC_STR.isNULL_VAL(row1.sno3()) && !MAC_STR.isNULL_VAL(row2.sno3())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int compareSno4(T row1, T row2) {
			if (!MAC_STR.isNULL_VAL(row1.sno4()) && MAC_STR.isNULL_VAL(row2.sno4())) {
				return SMALL;
			}
			else if (MAC_STR.isNULL_VAL(row1.sno4()) && !MAC_STR.isNULL_VAL(row2.sno4())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int comparePrio(T row1, T row2) {
			if (isNull(row1.prio()) && isNull(row2.prio())) {
				return EQUAL;
			}
			else if (!isNull(row1.prio()) && isNull(row2.prio())) {
				return SMALL;
			}
			else if (isNull(row1.prio()) && !isNull(row2.prio())) {
				return LARGE;
			}
			if (row1.prio().lt(row2.prio())) {
				return SMALL;
			}
			else if (row1.prio().gt(row2.prio())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int comparePrio2(T row1, T row2) {
			if (isNull(row1.prio2()) && isNull(row2.prio2())) {
				return EQUAL;
			}
			else if (!isNull(row1.prio2()) && isNull(row2.prio2())) {
				return SMALL;
			}
			else if (isNull(row1.prio2()) && !isNull(row2.prio2())) {
				return LARGE;
			}
			if (row1.prio2().lt(row2.prio2())) {
				return SMALL;
			}
			else if (row1.prio2().gt(row2.prio2())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int compareSpplCd(T row1, T row2) {
			if (isSame(row1.inpt_sppl_cd(), row1.stk_sppl_cd()) && !isSame(row2.inpt_sppl_cd(), row2.stk_sppl_cd())) {
				return SMALL;
			}
			else if (!isSame(row1.inpt_sppl_cd(), row1.stk_sppl_cd()) && isSame(row2.inpt_sppl_cd(), row2.stk_sppl_cd())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int compareCoStk(T row1, T row2) {
			if (isNull(row1.stk_sppl_cd()) && !isNull(row2.stk_sppl_cd())) {
				return SMALL;
			}
			else if (!isNull(row1.stk_sppl_cd()) && isNull(row2.stk_sppl_cd())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int compareAsstCo(T row1, T row2) {
			if (!MAC_ASST_TYP.isOTH(row1.asst_typ()) && MAC_ASST_TYP.isOTH(row2.asst_typ())) {
				return SMALL;
			}
			else if (MAC_ASST_TYP.isOTH(row1.asst_typ()) && !MAC_ASST_TYP.isOTH(row2.asst_typ())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int compareNewVldDt(T row1, T row2) {
			if (isNull(row1.vld_dt()) && isNull(row2.vld_dt())) {
				return EQUAL;
			}
			else if (isNull(row1.vld_dt()) && !isNull(row2.vld_dt())) {
				return SMALL;
			}
			else if (!isNull(row1.vld_dt()) && isNull(row2.vld_dt())) {
				return LARGE;
			}
			else if (row1.vld_dt().gt(row2.vld_dt())) {
				return SMALL;
			}
			else if (row1.vld_dt().lt(row2.vld_dt())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int compareNewFirstGrDt(T row1, T row2) {
			if (isNull(row1.first_gr_dt()) && isNull(row2.first_gr_dt())) {
				return EQUAL;
			}
			else if (isNull(row1.first_gr_dt()) && !isNull(row2.first_gr_dt())) {
				return SMALL;
			}
			else if (!isNull(row1.first_gr_dt()) && isNull(row2.first_gr_dt())) {
				return LARGE;
			}
			else if (row1.first_gr_dt().gt(row2.first_gr_dt())) {
				return SMALL;
			}
			else if (row1.first_gr_dt().lt(row2.first_gr_dt())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int compareOldVldDt(T row1, T row2) {
			if (isNull(row1.vld_dt()) && isNull(row2.vld_dt())) {
				return EQUAL;
			}
			else if (!isNull(row1.vld_dt()) && isNull(row2.vld_dt())) {
				return SMALL;
			}
			else if (isNull(row1.vld_dt()) && !isNull(row2.vld_dt())) {
				return LARGE;
			}
			else if (row1.vld_dt().lt(row2.vld_dt())) {
				return SMALL;
			}
			else if (row1.vld_dt().gt(row2.vld_dt())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int compareOldFirstGrDt(T row1, T row2) {
			if (isNull(row1.first_gr_dt()) && isNull(row2.first_gr_dt())) {
				return EQUAL;
			}
			else if (!isNull(row1.first_gr_dt()) && isNull(row2.first_gr_dt())) {
				return SMALL;
			}
			else if (isNull(row1.first_gr_dt()) && !isNull(row2.first_gr_dt())) {
				return LARGE;
			}
			else if (row1.first_gr_dt().lt(row2.first_gr_dt())) {
				return SMALL;
			}
			else if (row1.first_gr_dt().gt(row2.first_gr_dt())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int compareSmallLotSeq(T row1, T row2) {
			if (isNull(row1.lot_seq()) && isNull(row2.lot_seq())) {
				return EQUAL;
			}
			else if (!isNull(row1.lot_seq()) && isNull(row2.lot_seq())) {
				return SMALL;
			}
			else if (isNull(row1.lot_seq()) && !isNull(row2.lot_seq())) {
				return LARGE;
			}
			else {
				return row1.lot_seq().compareTo(row2.lot_seq());
			}
		}
		protected int compareLargeLotSeq(T row1, T row2) {
			if (isNull(row2.lot_seq()) && isNull(row1.lot_seq())) {
				return EQUAL;
			}
			else if (!isNull(row2.lot_seq()) && isNull(row1.lot_seq())) {
				return SMALL;
			}
			else if (isNull(row2.lot_seq()) && !isNull(row1.lot_seq())) {
				return LARGE;
			}
			else {
				return row2.lot_seq().compareTo(row1.lot_seq());
			}
		}
		protected int compareStkSchd(T row1, T row2) {
			if (MSC_SCHD_STK_TYP.isSTK(row1.schd_stk_typ()) && !MSC_SCHD_STK_TYP.isSTK(row2.schd_stk_typ())) {
				return SMALL;
			}
			else if (!MSC_SCHD_STK_TYP.isSTK(row1.schd_stk_typ()) && MSC_SCHD_STK_TYP.isSTK(row2.schd_stk_typ())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int compareSchdStk(T row1, T row2) {
			if (!MSC_SCHD_STK_TYP.isSTK(row1.schd_stk_typ()) && MSC_SCHD_STK_TYP.isSTK(row2.schd_stk_typ())) {
				return SMALL;
			}
			else if (MSC_SCHD_STK_TYP.isSTK(row1.schd_stk_typ()) && !MSC_SCHD_STK_TYP.isSTK(row2.schd_stk_typ())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int compareNewSchdDt(T row1, T row2) {
			if (MSC_SCHD_STK_TYP.isSTK(row1.schd_stk_typ()) && MSC_SCHD_STK_TYP.isSTK(row2.schd_stk_typ())) {
				return EQUAL;
			}
			else if (row1.schd_dt().gt(row2.schd_dt())) {
				return SMALL;
			}
			else if (row1.schd_dt().lt(row2.schd_dt())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int compareOldSchdDt(T row1, T row2) {
			if (MSC_SCHD_STK_TYP.isSTK(row1.schd_stk_typ()) && MSC_SCHD_STK_TYP.isSTK(row2.schd_stk_typ())) {
				return EQUAL;
			}
			else if (row1.schd_dt().lt(row2.schd_dt())) {
				return SMALL;
			}
			else if (row1.schd_dt().gt(row2.schd_dt())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		protected int compareSchdStkPrio(T row1, T row2) {
			if (isNull(row1.schd_stk_prio()) && isNull(row2.schd_stk_prio())) {
				return EQUAL;
			}
			else if (!isNull(row1.schd_stk_prio()) && isNull(row2.schd_stk_prio())) {
				return SMALL;
			}
			else if (isNull(row1.schd_stk_prio()) && !isNull(row2.schd_stk_prio())) {
				return LARGE;
			}
			else {
				return row1.schd_stk_prio().compareTo(row2.schd_stk_prio());
			}
		}
		protected int compareUpMatch(Avl_ListR giRow, T row1, T row2, String procTyp) {
			if (!isSame(procTyp, _allocLot)) {
				if (isSame(procTyp, _allocNoLot)) {
					if (row1.loc_lot_flg() && !row2.loc_lot_flg()) {
						if (giRow.can_gi_flg()) {
							return SMALL;
						}
						else {
							return LARGE;
						}
					}
					else if (!row1.loc_lot_flg() && row2.loc_lot_flg()) {
						if (giRow.can_gi_flg()) {
							return LARGE;
						}
						else {
							return SMALL;
						}
					}
				}
				else {
					if ((row1.loc_flg() || row1.loc_lot_flg()) && (!row2.loc_flg() && !row2.loc_lot_flg())) {
						if (giRow.can_gi_flg()) {
							return SMALL;
						}
						else {
							return LARGE;
						}
					}
					else if ((!row1.loc_flg() && !row1.loc_lot_flg()) && (row2.loc_flg() || row2.loc_lot_flg())) {
						if (giRow.can_gi_flg()) {
							return LARGE;
						}
						else {
							return SMALL;
						}
					}
				}
			}
			return EQUAL;
		}
		protected int compareSchdDtByGiRow(Avl_ListR giRow, T row1, T row2) {
			// 引当可能な在庫、入庫予定を取得する目的で実行された場合は、入庫予定日でソートを行う。
			// grListに入庫予定日が1/5, 1/15, 1/20, 1/25の入庫予定及び、現状在庫が存在し、
			// giRowの出庫予定日が1/16の場合、
			// 「入庫予定(1/15)→入庫予定(1/5)→現状在庫→入庫予定(1/20)→入庫予定(1/25)」
			// の順番で、giRowの出庫予定数を満たしていくことによって、
			// giRowの出庫予定以前の日付の出庫予定（例えば1/5の出庫予定）が、
			// 引当可能な在庫、入庫予定をなるべく多く、呼び出し元に返すことが目的。

			if (MSC_SCHD_STK_TYP.isMINUS_STK(giRow.schd_stk_typ())) {
				if (MSC_SCHD_STK_TYP.isSTK(row1.schd_stk_typ()) && MSC_SCHD_STK_TYP.isSTK(row2.schd_stk_typ())) {
					return EQUAL;
				}
				else if (MSC_SCHD_STK_TYP.isSTK(row1.schd_stk_typ()) && !MSC_SCHD_STK_TYP.isSTK(row2.schd_stk_typ())) {
					return LARGE;
				}
				else if (!MSC_SCHD_STK_TYP.isSTK(row1.schd_stk_typ()) && MSC_SCHD_STK_TYP.isSTK(row2.schd_stk_typ())) {
					return SMALL;
				}
				else {
					return compareOldSchdDt(row1, row2);
				}
			}
			else {
				if (MSC_SCHD_STK_TYP.isSTK(row1.schd_stk_typ()) && MSC_SCHD_STK_TYP.isSTK(row2.schd_stk_typ())) {
					return EQUAL;
				}
				else if (MSC_SCHD_STK_TYP.isSTK(row1.schd_stk_typ()) && !MSC_SCHD_STK_TYP.isSTK(row2.schd_stk_typ())) {
					if (giRow.schd_dt().lt(row2.schd_dt())) {
						return SMALL;
					}
					else {
						return LARGE;
					}
				}
				else if (!MSC_SCHD_STK_TYP.isSTK(row1.schd_stk_typ()) && MSC_SCHD_STK_TYP.isSTK(row2.schd_stk_typ())) {
					if (giRow.schd_dt().lt(row1.schd_dt())) {
						return LARGE;
					}
					else {
						return SMALL;
					}
				}
				else {
					if (giRow.schd_dt().lt(row1.schd_dt()) || giRow.schd_dt().lt(row2.schd_dt())) {
						return compareOldSchdDt(row1, row2);
					}
					else {
						return compareNewSchdDt(row1, row2);
					}
				}
			}
		}
		protected int compareStrLn(Avl_ListR giRow, T row1, T row2) {
			if (isSame(giRow.stk_str_ln_cd(), row1.stk_str_ln_cd()) && !isSame(giRow.stk_str_ln_cd(), row2.stk_str_ln_cd())) {
				return SMALL;
			}
			else if (!isSame(giRow.stk_str_ln_cd(), row1.stk_str_ln_cd()) && isSame(giRow.stk_str_ln_cd(), row2.stk_str_ln_cd())) {
				return LARGE;
			}
			else {
				return EQUAL;
			}
		}
		
		protected int compareAllCols(T row1, T row2) {
			int ret = EQUAL;
			Comparable<?> val1, val2;
			String str1, str2;

			for (String col :Avl_ListR.colnames()) {
				val1 = row1.getValue(col);
				val2 = row2.getValue(col);
				if (isSame(MCDataType.STRING, row1.getConstMeta(col).type())) {
					str1 = (String) val1;
					str2 = (String) val2;
					if (isNullOrNullVal(str1) && isNullOrNullVal(str2)) {
						continue;
					}
					else if (!isNullOrNullVal(str1) && isNullOrNullVal(str2)) {
						return SMALL;
					}
					else if (isNullOrNullVal(str1) && !isNullOrNullVal(str2)) {
						return LARGE;
					}
				}
				else {
					if (isNullAnd(val1, val2)) {
						continue;
					}
					else if (!isNull(val1) && isNull(val2)) {
						return SMALL;
					}
					else if (isNull(val1) && !isNull(val2)) {
						return LARGE;
					}
				}
				ret = val1.compareTo(compareHelper(val2));
				if (!isSame(ret, EQUAL)) return ret;
			}
			return EQUAL;
		}
	}
	
	protected <T extends Comparable<?>> T compareHelper(Comparable<?> val) {
		return (T) val;
	}

	protected MCNumber getBfCalcQty(Avl_ListR r) {
		MCNumber qty = null;

		// r.cont_qty()
		// 在庫、受払予定の減算処理時はNULLを想定
		// 投入の上り電文引当処理時はNOT NULLを想定
		if (r.pack_alloc_flg()) {
			if (r.chk_cont_fctr_flg() && isSame(r.pack_unit_cd(), r.base_unit_cd())) {
				if (isNull(r.cont_qty())) {
					qty = r.pack_unit_qty();
					r.setBooleanNE("unUseContQtyFlg", true);
				}
				else {
					qty = r.cont_qty();
					r.setBooleanNE("useContQtyFlg", true);
				}
			}
			else {
				qty = r.pack_unit_qty();
			}
		}
		else {
			if (r.chk_cont_fctr_flg()) {
				if (isNull(r.cont_qty())) {
					qty = r.base_unit_qty();
					r.setBooleanNE("unUseContQtyFlg", true);
				}
				else {
					qty = r.cont_qty();
					r.setBooleanNE("useContQtyFlg", true);
				}
			}
			else {
				qty = r.base_unit_qty();
			}
		}
		return qty;
	}

	protected MCNumber getGrBfCalcQty(Avl_ListR r, Avl_ListR giRow) {
		MCNumber qty = null;

		if (giRow.getBooleanNE("useContQtyFlg")) {
			if (r.pack_alloc_flg() && isSame(r.pack_unit_cd(), r.base_unit_cd())) {
				if (isNull(r.cont_qty())) {
					qty = r.pack_unit_qty().multiply(nvl(r.act_cont_fctr(), r.std_cont_fctr()),
							r.cont_fctr_dec_place().intValue(), MAC_RND_TYP.get(r.cont_fctr_rnd_typ()).toMC());
				}
				else {
					qty = r.cont_qty();
				}
			}
			else {
				if (isNull(r.cont_qty())) {
					qty = r.base_unit_qty().multiply(nvl(r.act_cont_fctr(), r.std_cont_fctr()),
							r.cont_fctr_dec_place().intValue(), MAC_RND_TYP.get(r.cont_fctr_rnd_typ()).toMC());
				}
				else {
					qty = r.cont_qty();
				}
			}
			r.setBooleanNE("useContQtyFlg", true);
		}
		else if (r.pack_alloc_flg()) {
			qty = r.pack_unit_qty();
		}
		else {
			qty = r.base_unit_qty();
		}
		return qty;
	}

	protected MCNumber getAfCalcQty(Avl_ListR r, MCNumber qty) {

		// 有効成分換算対象の場合は換算を元に戻して引当可能数を計算する
		if (r.getBooleanNE("useContQtyFlg")) {
			if (r.pack_alloc_flg() && isSame(r.pack_unit_cd(), r.base_unit_cd())) {
				qty = qty.divide(nvl(r.act_cont_fctr(), r.std_cont_fctr()),
						r.pack_unit_dec_place().intValue(),
						MAC_RND_TYP.get(r.pack_unit_rnd_typ()).toMC());
			}
			else {
				qty = qty.divide(nvl(r.act_cont_fctr(), r.std_cont_fctr()),
						r.base_unit_dec_place().intValue(),
						MAC_RND_TYP.get(r.base_unit_rnd_typ()).toMC());
			}
		}
		return qty;
	}

	protected MCNumber convContQty(Avl_ListR r, MCNumber qty) {
		if (r.getBooleanNE("unUseContQtyFlg")) {
			return qty.multiply(nvl(r.act_cont_fctr(), r.std_cont_fctr()),
					r.cont_fctr_dec_place().intValue(), MAC_RND_TYP.get(r.cont_fctr_rnd_typ()).toMC());
		}
		else if (r.getBooleanNE("useContQtyFlg")) {
			return qty;
		}
		return null;
	}

	protected Srch_RsltR setAllocRslt(Avl_ListR giRow, Avl_ListR grRow, MCNumber qty, String procTyp) {

		Srch_RsltR allocR = Srch_RsltR.create();
		copy(allocR, grRow, createMap_Srch_RsltR_Avl_ListR());

		// 引当対象の情報をセットする
		allocR.peg_no(giRow.peg_no());
		allocR.alt_grp_cd(giRow.alt_grp_cd());
		allocR.alt_grp_seq(giRow.alt_grp_seq());
		allocR.oper_inst_no(giRow.oper_inst_no());
		allocR.rqst_sno1(giRow.rqst_sno1());
		allocR.sno1_null_flg(giRow.sno1_null_flg());
		allocR.rqst_sno2(giRow.rqst_sno2());
		allocR.sno2_null_flg(giRow.sno2_null_flg());
		allocR.rqst_sno3(giRow.rqst_sno3());
		allocR.sno3_null_flg(giRow.sno3_null_flg());
		allocR.rqst_sno4(giRow.rqst_sno4());
		allocR.sno4_null_flg(giRow.sno4_null_flg());
		allocR.vld_dt_fr(giRow.vld_dt_fr());
		allocR.vld_dt_to(giRow.vld_dt_to());

		// 総量引当のときは在庫場所関連の項目はクリアする
		if (isSame(procTyp, _propGrs)) {
			allocR.stk_loc_cd(null);
			allocR.stk_str_ln_tgt_flg(false);
			allocR.stk_str_ln_cd(null);
			allocR.stk_arrv_bp_cd(null);
			allocR.stk_sppl_cd(null);
		}

		// ロット指定なしＦＬＧがオンのときはロット関連の項目はクリアする
		if (giRow.not_lot_fix_flg()) {
			// ロット管理しない品目はＮＵＬＬ文字を指定する
			if (MAC_LOT_MNG_TYP.isNOT_MNG(giRow.lot_mng_typ())) {
				allocR.lot_no(MAC_STR.NULL_VAL.value());
			}
			else {
				allocR.lot_no(null);
			}
			// サブロット管理しない品目はＮＵＬＬ文字を指定する
			if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(giRow.sublot_mng_typ())) {
				allocR.sublot_no(MAC_STR.NULL_VAL.value());
			}
			else {
				allocR.sublot_no(null);
			}
			allocR.first_gr_dt(null);
			allocR.vld_dt(null);
			allocR.lot_seq(null);
			allocR.act_cont_fctr(null);
		}

		if (giRow.chk_cont_fctr_flg()) {
			allocR.cont_qty(qty);
		}
		else {
			allocR.cont_qty(null);
		}

		return allocR;
	}

	protected exceptZeroMatcher crtExceptZeroMatcher() {
		return new exceptZeroMatcher();
	}

	public class exceptZeroMatcher implements MCRowMatcher<Avl_ListR> {
		@Override
		public boolean match(Avl_ListR r) {

			if (r.pack_alloc_flg()) {
				if (isSame(r.pack_unit_qty(), MCNumber.ZERO)) {
					return false;
				}
			}
			else {
				if (isSame(r.base_unit_qty(), MCNumber.ZERO)) {
					return false;
				}
			}
			return true;
		}
	}

	/**
	 * extAvl.<p>
	 *
	 * 使用可能在庫を算出する<br>
	 */
	protected MCList<Avl_ListR> extAvl(Alloc_Avl_Srch02_CndR cnd, MCList<Avl_ListR> grList, Avl_ListR giRow, String procTyp) {

		// 使用可能在庫のリスト
		MCList<Avl_ListR> retL = MCList.create(Avl_ListR.class);
		// 出庫予定日
		MCDate dt = getGiSchdDt(cnd, giRow, MCNumber.ZERO, procTyp);
		for (Avl_ListR grRow :grList.subList(_idx, giRow.toArray(_idx.getKeys()))) {
			if (!object(CLAZZ)._lot_chk_off_flg) {
				if (!chkVldDt(cnd, dt, giRow, grRow, procTyp)) continue;
			}
			if (!chkAllocStop(cnd, dt, giRow, grRow, procTyp)) continue;
			if (!chkPlntAprv(cnd, dt, giRow, grRow, procTyp)) continue;
			if (!chkMrktJudg(cnd, dt, giRow, grRow, procTyp)) continue;
			if (!chkSppl(cnd, dt, giRow, grRow, procTyp)) continue;
			if (!chkSameGiGr(cnd, dt, giRow, grRow, procTyp)) continue;
			if (!matchVer(cnd, dt, giRow, grRow, procTyp)) continue;
			if (!matchUnit(cnd, dt, giRow, grRow, procTyp)) continue;
			if (!matchStkLn(cnd, dt, giRow, grRow, procTyp)) continue;
			if (!chkStkAllocLimit(cnd, dt, giRow, grRow, procTyp)) continue;

			// 出庫予定日に対して入庫予定日が間に合わない場合も、使用可能在庫算出対象とする。
			// ここで間に合わない入庫予定に対して入庫遅れ引当フラグを設定しておき、呼出元（doCalc）で出庫予定が入庫予定を引き当てた場合、出庫予定の入庫遅れ引当フラグをオンにする
			if (!chkGiGrDt(cnd, dt, giRow, grRow, procTyp)) {
				grRow.overdue_alloc_tmp_flg(true);
			}
			else {
				grRow.overdue_alloc_tmp_flg(false);
			}

			retL.add(grRow);
		}

		return retL;
	}

	/**
	 * propAvl.<p>
	 *
	 * ロット提案の対象となる在庫、入庫予定を取得する<br>
	 */
	protected MCList<Avl_ListR> propAvl(Alloc_Avl_Srch02_CndR cnd, MCList<Avl_ListR> grList, Avl_ListR giRow, String procTyp) {

		// 使用可能在庫のリスト
		MCList<Avl_ListR> retL = MCList.create(Avl_ListR.class);
		for (Loc_Map_ListR locR :getLocMapCache().get(giRow)) {
			// 出庫予定日
			MCDate dt = getGiSchdDt(cnd, giRow, locR.xfr_lt(), procTyp);
			setGiRow(cnd, dt, giRow, procTyp, locR);
			for (Avl_ListR grRow :grList.subList(_idx, locR.toArray(_idx.getKeys()))) {
				setGrRow(cnd, dt, giRow, grRow, procTyp, locR);

				if (!chkStkFlg(cnd, dt, giRow, grRow, procTyp)) continue;
				if (!chkGiGrDt(cnd, dt, giRow, grRow, procTyp)) continue;
				if (!object(CLAZZ)._lot_chk_off_flg) {	
					if (!chkVldDt(cnd, dt, giRow, grRow, procTyp)) continue;
				}
				if (!chkAllocStop(cnd, dt, giRow, grRow, procTyp)) continue;
				if (!chkPlntAprv(cnd, dt, giRow, grRow, procTyp)) continue;
				if (!chkMrktJudg(cnd, dt, giRow, grRow, procTyp)) continue;
				if (!chkSppl(cnd, dt, giRow, grRow, procTyp)) continue;
				if (!matchStkCol(cnd, dt, giRow, grRow, procTyp, true)) continue;
				if (!matchVer(cnd, dt, giRow, grRow, procTyp)) continue;
				if (!matchUnit(cnd, dt, giRow, grRow, procTyp)) continue;
				if (!matchSno(cnd, dt, giRow, grRow, procTyp)) continue;
				if (!matchAllocGrp(cnd, dt, giRow, grRow, procTyp)) continue;
				if (chkLotTrace(giRow, grRow)) continue;

				retL.add(grRow);
			}
		}

		if (!cnd.getBooleanNE("doMatchFlg")) {
			extNotMix(giRow, retL, procTyp);
		}

		return retL;
	}

	protected boolean chkLotTrace(Avl_ListR giRow, Avl_ListR grRow) {
		if (isChkLotTraceTgt(giRow, grRow)) {
			return grRow.lot_trace_err_flg();
		}
		return false;
	}

	protected boolean isChkLotTraceTgt(Avl_ListR giRow, Avl_ListR grRow) {
		if (giRow.chk_ship_flg()) {
			if (MSC_IO_SCHD_TYP.isSLS(giRow.io_schd_typ()) || MSC_IO_SCHD_TYP.isSHIP_OUT(giRow.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isSLS_ACXFR(giRow.io_schd_typ())){
				return true;
			}
			else if ((MSC_IO_SCHD_TYP.isSHIP_OUT_EX(giRow.io_schd_typ()) || MSC_IO_SCHD_TYP.isXFR_GI(giRow.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isXFR_RTN_GI(giRow.io_schd_typ()) || MSC_IO_SCHD_TYP.isMOVE_GI(giRow.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isMOVE_RTN_GI(giRow.io_schd_typ()))
					&& MSC_IO_SCHD_STS_TYP.isORD(giRow.io_schd_sts_typ())) {
				if (isNull(giRow.gr_loc_cd()) || !isSame(getStkLocCache(grRow).site_cd(), giRow.gr_site_cd())) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * propAvl_gi.<p>
	 *
	 * ロット提案の対象と一致する出庫予定を取得する<br>
	 */
	protected MCList<Avl_ListR> propAvl_gi(Alloc_Avl_Srch02_CndR cnd, MCList<Avl_ListR> giList, Avl_ListR tgtR, String procTyp) {

		// 出庫予定のリスト
		MCList<Avl_ListR> retL = MCList.create(Avl_ListR.class);
		MCDate dt = null;
		for (Avl_ListR giRow : giList.subList(_idx, tgtR.toArray(_idx.getKeys()))) {
			if (!matchStkCol(cnd, dt, tgtR, giRow, procTyp, false)) continue;
			if (!matchVer(cnd, dt, tgtR, giRow, procTyp)) continue;
			if (!matchUnit(cnd, dt, tgtR, giRow, procTyp)) continue;
			if (!matchSno(cnd, dt, tgtR, giRow, procTyp)) continue;

			retL.add(giRow);
		}

		return retL;
	}

	protected MCDate getGiSchdDt(Alloc_Avl_Srch02_CndR cnd, Avl_ListR giRow, MCNumber xfrLt, String procTyp) {

		if (MSC_SCHD_STK_TYP.isMINUS_STK(giRow.schd_stk_typ())) {
			return null;
		}

		MCDate dt = null;
		if (isSame(procTyp, _propGrs)) {
			// 総量引当かつ出庫物流Ｇが指定されなかった場合（＝受注系の総量引当で、標準出荷場所の物流Ｇ以外の場所の在庫を探しにいく場合）、その日付を元に計算した値を返す
			// ※出荷予定日は仮の日付（標準出荷場所から出荷すると仮定して求めた日付）であるため
			if (isNull(giRow.gi_lg_grp_cd()) && !isNull(giRow.gr_schd_dt())) {
				return giRow.gr_schd_dt().addDay(xfrLt.negate());
			}
		}
		if (isSame(procTyp, _propLoc)) {
			// 場所引当かつ出庫物流Ｇ、出庫場所、投入予定日が指定されなかった場合（＝受注系の場所引当で、標準出荷場所の物流Ｇ以外の場所の在庫を探しにいく場合）、
			// その日付を元に計算した値を返す
			// ※出荷予定日は仮の日付（標準出荷場所から出荷すると仮定して求めた日付）であるため
			if (isNull(giRow.gi_lg_grp_cd()) && isNull(giRow.gi_loc_cd())
					&& isNull(giRow.inpt_schd_dt()) && !isNull(giRow.gr_schd_dt())) {
				return giRow.gr_schd_dt().addDay(xfrLt.negate());
			}
		}

		if (!isNull(giRow.schd_dt())) {
			dt = giRow.schd_dt();
		}
		else {
			if (!isNull(giRow.inpt_schd_dt())) {
				dt = giRow.inpt_schd_dt();
			}
			if (!isNull(giRow.gr_schd_dt())) {
				dt = giRow.gr_schd_dt();
			}
			if (!isNull(dt)) {
				dt = dt.addDay(xfrLt.negate());
			}
		}
		return dt;
	}

	protected void setGiRow(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, String procTyp, Loc_Map_ListR locR) {
		// chkPlntAprvで使用する
		giRow.gi_loc_mng_typ(locR.fr_loc_mng_typ());
		giRow.gr_loc_mng_typ(locR.to_loc_mng_typ());
		giRow.gi_site_cd(locR.fr_site_cd());
		giRow.gr_site_cd(locR.to_site_cd());
	}

	protected void setGrRow(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp, Loc_Map_ListR locR) {
		grRow.inpt_loc_cd(locR.inpt_loc_cd());
		grRow.inpt_str_ln_cd(locR.inpt_str_ln_cd());
		grRow.inpt_sppl_cd(locR.inpt_sppl_cd());
		grRow.dlv_lg_grp_cd(locR.dlv_lg_grp_cd());
		grRow.alloc_grp_cd(locR.alloc_grp_cd());
		grRow.gi_lg_grp_cd(locR.gi_lg_grp_cd());
		grRow.gi_loc_cd(locR.gi_loc_cd());
		grRow.gi_str_ln_cd(locR.gi_str_ln_cd());
		grRow.gi_stk_arrv_bp_cd(locR.gi_stk_arrv_bp_cd());
		grRow.gr_loc_cd(locR.gr_loc_cd());
		grRow.gr_str_ln_cd(locR.gr_str_ln_cd());
		grRow.gr_sppl_cd(locR.gr_sppl_cd());
		grRow.xfr_lt(locR.xfr_lt());
		grRow.alloc_days(locR.alloc_days());
		grRow.prio(locR.prio());
		grRow.prio2(locR.prio2());
	}

	protected boolean chkStkFlg(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp) {
		if (giRow.stk_flg() && !MSC_SCHD_STK_TYP.isSTK(grRow.schd_stk_typ())) {
			return false;
		}
		return true;
	}

	protected boolean chkGiGrDt(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp) {

		if (isNull(dt)) {
			return true;
		}

		MCDate marginDt;
		if (dt.lte(cnd.ignore_margin_dt())) {
			marginDt = dt;
		}
		else if (grRow.alloc_margin_days().gt(MCNumber.ZERO)) {
			marginDt = dt.addDay(grRow.alloc_margin_days());
		}
		else {
			marginDt = dt;
		}
		if (marginDt.lt(grRow.schd_dt())) {
			return false;
		}
		return true;
	}

	protected boolean chkVldDt(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp) {

		// 有効期限なしは無期限とみなす
		if (isNull(grRow.vld_dt())) {
			MAM_ITM_R itmR = getMamItmCache(grRow);
			// 期限管理対象の場合、かつ受払予定区分が売上、出荷、の場合、有効期限なしはfalseを返す
			if (itmR.lmt_ctl_flg() && itmR.ship_lot_back_stop_flg() && !isNull(giRow.lot_back_stop_typ()) && !MAC_LOT_BACK_STOP_TYP.isNO(giRow.lot_back_stop_typ())
					&& (MSC_IO_SCHD_TYP.isSLS(giRow.io_schd_typ()) || MSC_IO_SCHD_TYP.isSHIP_OUT(giRow.io_schd_typ()))
					&& !MSC_IO_SCHD_TYP.isPURC_GR(grRow.io_schd_typ()) && !MSC_IO_SCHD_TYP.isARR(grRow.io_schd_typ())) {
				return false;
			}
			return true;
		}
		if (!isNull(giRow.vld_dt_fr()) && giRow.vld_dt_fr().gt(grRow.vld_dt())) {
			return false;
		}
		if (!isNull(giRow.vld_dt_to()) && giRow.vld_dt_to().lt(grRow.vld_dt())) {
			return false;
		}
		return true;
	}

	protected boolean chkAllocStop(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp) {

		if (MSC_IO_SCHD_TYP.is_alloc_stop_lot(giRow.io_schd_typ())
				&& MSC_IO_SCHD_STS_TYP.is_alloc_stop_lot(giRow.io_schd_sts_typ())) {
			if (isNull(grRow.stop_dt())) {
				return true;
			}
			if (isNull(dt)) {
				return true;
			}
			if (dt.gte(grRow.stop_dt())) {
				if (!isNull(grRow.rel_dt()) && dt.gte(grRow.rel_dt())) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		return true;
	}

	protected boolean chkPlntAprv(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp) {

		if (MSC_IO_SCHD_STS_TYP.isORD(giRow.io_schd_sts_typ())) {
			if (MAC_LOC_MNG_TYP.isPRD(giRow.gi_loc_mng_typ())) {
				if (MSC_IO_SCHD_TYP.isSLS(giRow.io_schd_typ()) || MSC_IO_SCHD_TYP.isSLS_ACXFR(giRow.io_schd_typ())
						|| MSC_IO_SCHD_TYP.isSHIP_OUT(giRow.io_schd_typ())) {
					return (!MSC_PLNT_APRV_STS_TYP.isOPN(grRow.plnt_aprv_sts_typ()) && !MSC_PLNT_APRV_STS_TYP.isRJCT(grRow.plnt_aprv_sts_typ()));
				}
				else if (MSC_IO_SCHD_TYP.isXFR_GI(giRow.io_schd_typ()) || MSC_IO_SCHD_TYP.isXFR_GI_PROV(giRow.io_schd_typ())
//							|| MSC_IO_SCHD_TYP.isXFR_RTN_GI(giRow.io_schd_typ()) || MSC_IO_SCHD_TYP.isXFR_RTN_GI_PROV(giRow.io_schd_typ())
							|| MSC_IO_SCHD_TYP.isMOVE_GI(giRow.io_schd_typ()) || MSC_IO_SCHD_TYP.isMOVE_GI_PROV(giRow.io_schd_typ())
//							|| MSC_IO_SCHD_TYP.isMOVE_RTN_GI(giRow.io_schd_typ()) || MSC_IO_SCHD_TYP.isMOVE_RTN_GI_PROV(giRow.io_schd_typ())
							|| MSC_IO_SCHD_TYP.isSHIP_OUT_EX(giRow.io_schd_typ())) {

					if (!isSame(giRow.gi_site_cd(), giRow.gr_site_cd()) || MAC_LOC_MNG_TYP.isSLS(giRow.gr_loc_mng_typ())) {
						return (!MSC_PLNT_APRV_STS_TYP.isOPN(grRow.plnt_aprv_sts_typ()) && !MSC_PLNT_APRV_STS_TYP.isRJCT(grRow.plnt_aprv_sts_typ()));
					}
				}
			}
		}
		else if (MSC_IO_SCHD_STS_TYP.isSLO(giRow.io_schd_sts_typ()) || MSC_IO_SCHD_STS_TYP.isPRMS(giRow.io_schd_sts_typ())) {
			if (MAC_LOC_MNG_TYP.isPRD(giRow.gi_loc_mng_typ()) 
					&& (MSC_IO_SCHD_TYP.isSLS(giRow.io_schd_typ()) || MSC_IO_SCHD_TYP.isSLS_ACXFR(giRow.io_schd_typ())
							|| MSC_IO_SCHD_TYP.isSHIP_OUT(giRow.io_schd_typ()))) {
				return !MSC_PLNT_APRV_STS_TYP.isRJCT(grRow.plnt_aprv_sts_typ());
			}
		}
		return true;
	}

	protected boolean chkMrktJudg(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp) {

		if (MSC_IO_SCHD_TYP.is_mrkt_judg(giRow.io_schd_typ())
				&& MSC_IO_SCHD_STS_TYP.is_mrkt_judg(giRow.io_schd_sts_typ())) {
			if (MSC_IO_SCHD_STS_TYP.isORD(giRow.io_schd_sts_typ())) {
				return (!MSC_MRKT_JUDG_STS_TYP.isOPN(grRow.mrkt_judg_sts_typ()) && !MSC_MRKT_JUDG_STS_TYP.isNOT_ACPT(grRow.mrkt_judg_sts_typ()));
			}
			else {
				return !MSC_MRKT_JUDG_STS_TYP.isNOT_ACPT(grRow.mrkt_judg_sts_typ());
			}
		}
		return true;
	}

	protected boolean chkSppl(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp) {

		if (isSame(procTyp, _propLoc)) {
			if (!isNull(giRow.stk_info_loc_typ())) {
				if (MSC_STK_INFO_LOC_TYP.isHOUSE(giRow.stk_info_loc_typ()) && !isNull(grRow.stk_sppl_cd())) {
					return false;
				}
				if (MSC_STK_INFO_LOC_TYP.isOUTSIDE(giRow.stk_info_loc_typ()) && isNull(grRow.stk_sppl_cd())) {
					return false;
				}
			}
		}
		else if (isSame(procTyp, _propGrs)) {
			if (!isNull(grRow.stk_sppl_cd())) {
				return false;
			}
		}
		else {
			if ((MSC_SCHD_STK_TYP.isGRS_GI_SCHD(giRow.schd_stk_typ()) || MSC_SCHD_STK_TYP.isGRS_WAIT_GI_SCHD(giRow.schd_stk_typ()))
					&& !isNull(grRow.stk_sppl_cd())) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 出庫予定に対して入庫予定をマッチングする際、自分自身の出庫予定に対する入庫予定は引当可能としない
	 * ※引当可能にしてしまうと、出庫場所と入庫場所の物流Ｇが同一の場合に自身の入庫予定を引き当ててしまう
	 * @param dt
	 * @param giRow
	 * @param grRow
	 * @param procTyp
	 * @return
	 */
	protected boolean chkSameGiGr(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp) {

		// 出庫予定に対する入庫予定が自分自身のものかどうかは以下の条件となる
		// ・出庫予定の入庫場所と入庫予定の入庫場所が一致する
		// ・出庫予定と入庫予定の受払予定ＮＯが一致する
		// ・出庫予定と入庫予定の受払状況区分が一致する
		// ・出庫予定の受払予定区分が移動出庫、移動出庫（支給）、移動返品出庫、移動返品出庫（支給）のいずれか
		// ・入庫予定の受払予定区分が移動入庫、移動入庫（支給）、移動返品入庫、移動返品入庫（支給）のいずれか

		if (isSame(giRow.gr_loc_cd(), grRow.stk_loc_cd())
				&& (MSC_SCHD_STK_TYP.isTGT_GR_SCHD(grRow.schd_stk_typ())
						|| MSC_SCHD_STK_TYP.isNOTGT_GR_SCHD(grRow.schd_stk_typ()))) {
			return false;
		}

		// 受払予定ＮＯチェック
		if (!isSame(giRow.io_schd_no(), grRow.io_schd_no())) {
			return true;
		}

		// 受払状況区分チェック
		if (!isSame(giRow.io_schd_sts_typ(), grRow.io_schd_sts_typ())) {
			return true;
		}

		// 出庫の受払予定区分チェック
		if (!MSC_IO_SCHD_TYP.isMOVE_GI(giRow.io_schd_typ())
				&& !MSC_IO_SCHD_TYP.isMOVE_GI_PROV(giRow.io_schd_typ())
				&& !MSC_IO_SCHD_TYP.isMOVE_RTN_GI(giRow.io_schd_typ())
				&& !MSC_IO_SCHD_TYP.isMOVE_RTN_GI_PROV(giRow.io_schd_typ())) {
			return true;
		}

		// 入庫の受払予定区分チェック
		if (!MSC_IO_SCHD_TYP.isMOVE_GR(grRow.io_schd_typ())
				&& !MSC_IO_SCHD_TYP.isMOVE_GR_PROV(grRow.io_schd_typ())
				&& !MSC_IO_SCHD_TYP.isMOVE_RTN_GR(grRow.io_schd_typ())
				&& !MSC_IO_SCHD_TYP.isMOVE_RTN_GR_PROV(grRow.io_schd_typ())) {
			return true;
		}

		return false;
	}

	protected boolean matchVer(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp) {
		if (!isNull(giRow.ver_no()) && !isSame(grRow.ver_no(), giRow.ver_no())) {
			return false;
		}
		return true;
	}

	protected boolean matchUnit(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp) {
		// 荷姿引当の場合は荷姿単位ＣＤをチェックする
		if (grRow.pack_alloc_flg()) {
			if (isSame(giRow.pack_unit_cd(), grRow.pack_unit_cd())) {
				return true;
			}
		}
		// 荷姿引当でない場合は基準単位ＣＤをチェックする
		else {
			if (grRow.getBooleanNE("chk_pack_unit")) {
				if (!isSame(giRow.pack_unit_cd(), giRow.base_unit_cd())) {
					if(isSame(giRow.pack_unit_cd(), grRow.pack_unit_cd())) {
						return true;
					}
				}
				else {
					if (isSame(giRow.base_unit_cd(), grRow.base_unit_cd())) {
						return true;
					}
				}
			}
			else {
				if (isSame(giRow.base_unit_cd(), grRow.base_unit_cd())) {
					return true;
				}
			}
		}
		return false;
	}

	protected boolean matchStkLn(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp) {
		if (isSame(procTyp, _allocGrs) || isSame(procTyp, _allocGrsLot) || isSame(procTyp, _allocLgLot) || isSame(procTyp, _allocLgNoLot)) {
			if (grRow.stk_ln_flg() && !MAC_STR.isNULL_VAL(grRow.stk_str_ln_cd())) {
				return false;
			}
		}
		else {
			if (grRow.stk_ln_flg()) {
				if (!(isSame(giRow.stk_loc_cd(), grRow.stk_loc_cd()) && isSame(giRow.stk_str_ln_cd(), grRow.stk_str_ln_cd()))) {
					return false;
				}
			}
			else {
				if (isSame(giRow.stk_loc_cd(), grRow.stk_loc_cd()) && !MAC_STR.isNULL_VAL(giRow.stk_str_ln_cd())) {
					if (!MAC_STR.isNULL_VAL(grRow.stk_str_ln_cd()) && !isSame(giRow.stk_str_ln_cd(), grRow.stk_str_ln_cd())) {
						return false;
					}
					if (MSC_SCHD_STK_TYP.isSTK(grRow.schd_stk_typ()) && MAC_STR.isNULL_VAL(grRow.stk_str_ln_cd())) {
						return false;
					}
				}
			}
		}
		return true;
	}

	protected boolean chkStkAllocLimit(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp) {
		if (grRow.stk_alloc_lmt_flg()) {
			if (!isSame(giRow.stk_loc_cd(), grRow.stk_loc_cd())) {
				return false;
			}
		}
		return true;
	}

	protected boolean matchSno(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp) {
		giRow.sno1(giRow.rqst_sno1());
		giRow.sno2(giRow.rqst_sno2());
		giRow.sno3(giRow.rqst_sno3());
		giRow.sno4(giRow.rqst_sno4());
		return matchSno1(cnd, dt, giRow, grRow, procTyp);
	}

	protected boolean matchSno1(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp) {
		if (matchSno2(cnd, dt, giRow, grRow, procTyp)) {
			return true;
		}
		else {
			if (!giRow.sno1_null_flg() || MAC_STR.isNULL_VAL(giRow.sno1())) {
				return false;
			}
			else {
				if (giRow.sno1_null_flg() && !isNull(giRow.sno1())) {
					giRow.sno1(MAC_STR.NULL_VAL.value());
				}
				giRow.sno2(giRow.rqst_sno2());
				giRow.sno3(giRow.rqst_sno3());
				giRow.sno4(giRow.rqst_sno4());
				return matchSno2(cnd, dt, giRow, grRow, procTyp);
			}
		}
	}

	protected boolean matchSno2(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp) {
		if (matchSno3(cnd, dt, giRow, grRow, procTyp)) {
			return true;
		}
		else {
			if ((!giRow.sno1_null_flg() || MAC_STR.isNULL_VAL(giRow.sno1()))
				&& (!giRow.sno2_null_flg() || MAC_STR.isNULL_VAL(giRow.sno2()))) {
				return false;
			}
			else {
				if (giRow.sno2_null_flg() && !isNull(giRow.sno2())) {
					giRow.sno2(MAC_STR.NULL_VAL.value());
				}
				giRow.sno3(giRow.rqst_sno3());
				giRow.sno4(giRow.rqst_sno4());
				return matchSno3(cnd, dt, giRow, grRow, procTyp);
			}
		}
	}

	protected boolean matchSno3(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp) {
		if (matchSno4(cnd, dt, giRow, grRow, procTyp)) {
			return true;
		}
		else {
			if ((!giRow.sno1_null_flg() || MAC_STR.isNULL_VAL(giRow.sno1()))
					&& (!giRow.sno2_null_flg() || MAC_STR.isNULL_VAL(giRow.sno2()))
					&& (!giRow.sno3_null_flg() || MAC_STR.isNULL_VAL(giRow.sno3()))) {
				return false;
			}
			else {
				if (giRow.sno3_null_flg() && !isNull(giRow.sno3())) {
					giRow.sno3(MAC_STR.NULL_VAL.value());
				}
				giRow.sno4(giRow.rqst_sno4());
				return matchSno4(cnd, dt, giRow, grRow, procTyp);
			}
		}
	}

	protected boolean matchSno4(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp) {
		if (matchSnoMain(cnd, dt, giRow, grRow, procTyp)) {
			return true;
		}
		else {
			if ((!giRow.sno1_null_flg() || MAC_STR.isNULL_VAL(giRow.sno1()))
					&& (!giRow.sno2_null_flg() || MAC_STR.isNULL_VAL(giRow.sno2()))
					&& (!giRow.sno3_null_flg() || MAC_STR.isNULL_VAL(giRow.sno3()))
					&& (!giRow.sno4_null_flg() || MAC_STR.isNULL_VAL(giRow.sno4()))) {
				return false;
			}
			else {
				if (giRow.sno4_null_flg() && !isNull(giRow.sno4())) {
					giRow.sno4(MAC_STR.NULL_VAL.value());
				}
				return matchSnoMain(cnd, dt, giRow, grRow, procTyp);
			}
		}
	}

	protected boolean matchSnoMain(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp) {
		if ((isNull(giRow.sno1()) || isSame(giRow.sno1(), grRow.sno1()))
				&& (isNull(giRow.sno2()) || isSame(giRow.sno2(), grRow.sno2()))
				&& (isNull(giRow.sno3()) || isSame(giRow.sno3(), grRow.sno3()))
				&& (isNull(giRow.sno4()) || isSame(giRow.sno4(), grRow.sno4()))) {
			return true;
		}
		else {
			return false;
		}
	}

	protected boolean matchStkCol(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp, boolean isGr) {

		ArrayList<String> l = new ArrayList<String>();
		if (isSame(procTyp, _propLoc)) {
			l.add(Avl_ListR.$asst_typ);
		}
		l.add(Avl_ListR.$quality_typ);
		l.add(Avl_ListR.$stk_id_typ);
		l.add(Avl_ListR.$stk_bp_cd);
		l.add(Avl_ListR.$gd_cd);
		for (String row :l) {
			// リストの項目をチェックする
			if (!isNull(giRow.getString(row)) && !isSame(grRow.getString(row), giRow.getString(row))) {
				return false;
			}
		}
		// 在庫識別区分が未指定のときは預り、検収不良の在庫は対象外とする
		if (isNull(giRow.stk_id_typ()) &&
				(MSC_STK_ID_TYP.isCSTSTK(grRow.stk_id_typ()) || MSC_STK_ID_TYP.isACCPT_DFCT(grRow.stk_id_typ()))) {
			return false;
		}
		// 場所引当の場合はロットＮＯ、サブロットＮＯをチェックする
		if (isSame(procTyp, _propLoc)) {
			if (isGr) {
				// ロットを指定する引当の場合は、ＮＵＬＬのロット、サブロットは提案しない
				if (!giRow.not_lot_fix_flg()) {
					if (isNull(grRow.lot_no()) || isNull(grRow.sublot_no())) {
						return false;
					}
				}

				// ロット管理対象ではＮＵＬＬ文字のロット、サブロットは提案しない
				if (!MAC_LOT_MNG_TYP.isNOT_MNG(giRow.lot_mng_typ()) && MAC_STR.isNULL_VAL(grRow.lot_no())) {
					return false;
				}
				if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(giRow.sublot_mng_typ()) && MAC_STR.isNULL_VAL(grRow.sublot_no())) {
					return false;
				}
			}

			if (!isNull(giRow.lot_no()) && !isSame(grRow.lot_no(), giRow.lot_no())) {
				return false;
			}
			if (!isNull(giRow.sublot_no()) && !isSame(grRow.sublot_no(), giRow.sublot_no())) {
				return false;
			}
		}
		// 在庫ラインＦＬＧがオンのときは該当の場所、棚・ラインを直接指定している場合のみ対象とする
		if (grRow.stk_ln_flg()) {
			if (!(isSame(giRow.inpt_loc_cd(), grRow.stk_loc_cd()) && isSame(giRow.inpt_str_ln_cd(), grRow.stk_str_ln_cd()))) {
				if (!(isSame(giRow.gi_loc_cd(), grRow.stk_loc_cd()) && isSame(giRow.gi_str_ln_cd(), grRow.stk_str_ln_cd()))) {
					return false;
				}
			}
		}
		// 在庫ラインＦＬＧがオフのときは棚・ラインを指定している場合のみ一致のチェックをする
		else {
			if (isGr) {
				if (isSame(giRow.gi_loc_cd(), grRow.stk_loc_cd())) {
					if (MAC_STR.isNULL_VAL(giRow.gi_str_ln_cd())) {
						if (!isSame(giRow.gi_str_ln_cd(), grRow.stk_str_ln_cd())) {
							return false;
						}
					}
					else if (!isNull(giRow.gi_str_ln_cd())) {
						if (!MAC_STR.isNULL_VAL(grRow.stk_str_ln_cd()) && !isSame(giRow.gi_str_ln_cd(), grRow.stk_str_ln_cd())) {
							return false;
						}
						if (MSC_SCHD_STK_TYP.isSTK(grRow.schd_stk_typ()) && MAC_STR.isNULL_VAL(grRow.stk_str_ln_cd())) {
							return false;
						}
					}
				}
			}
			else {
				if (isSame(giRow.gi_loc_cd(), grRow.stk_loc_cd()) && !isNull(giRow.gi_str_ln_cd())
						&& !isSame(giRow.gi_str_ln_cd(), grRow.stk_str_ln_cd())) {
					return false;
				}
			}
		}
		// 出庫在庫着荷先が指定されているときは一致する在庫を提案する
		if (!isNull(giRow.gi_stk_arrv_bp_cd()) && !isSame(giRow.gi_stk_arrv_bp_cd(), grRow.stk_arrv_bp_cd())) {
			return false;
		}
		// 入庫場所と一致する在庫は提案しない
		if (isSame(giRow.gr_loc_cd(), grRow.stk_loc_cd())
				&& (isNull(giRow.gr_str_ln_cd()) || isSame(giRow.gr_str_ln_cd(), grRow.stk_str_ln_cd()))) {
			return false;
		}
		// 良品が指定されている場合はロット管理情報の良品区分もチェックする
		if (MAC_QUALITY_TYP.isGOOD(giRow.quality_typ())) {
			if (!isNull(grRow.lot_quality_typ()) && !MAC_QUALITY_TYP.isGOOD(grRow.lot_quality_typ())
					&& !cnd.getBooleanNE("minus_stk_chk_flg")) {
				return false;
			}
		}
		return true;
	}

	protected boolean matchAllocGrp(Alloc_Avl_Srch02_CndR cnd, MCDate dt, Avl_ListR giRow, Avl_ListR grRow, String procTyp) {
		// 入庫予定の総量引当時対象外ＦＬＧがオンかつロット提案対象の総量引当指定検索ＦＬＧがオンの場合は対象外
		if (grRow.alloc_grp_non_tgt_flg() && giRow.alloc_grp_srch_flg()) {
			return false;
		}
		return true;
	}

	protected void extNotMix(Avl_ListR giRow, MCList<Avl_ListR> retL, String procTyp) {

		if (((giRow.not_lot_fix_flg() || !giRow.not_lot_mix_flg() && !giRow.not_sublot_mix_flg()) && !giRow.not_lg_mix_flg())
				|| isNull(retL) || retL.isEmpty()) {
			return;
		}

		// 処理用のデータを作成
		MCList<Avl_ListR> grListTmp = retL.clone();
		Lot_MixR cndR = Lot_MixR.create();

		// 有効成分対象なら換算する
		if (giRow.pack_alloc_flg()) {
			if (giRow.chk_cont_fctr_flg() && isSame(giRow.pack_unit_cd(), giRow.base_unit_cd())) {
				for (Avl_ListR grRowTmp : grListTmp) {
					grRowTmp.pack_unit_qty(grRowTmp.pack_unit_qty().multiply(nvl(grRowTmp.act_cont_fctr(), grRowTmp.std_cont_fctr()),
							grRowTmp.cont_fctr_dec_place().intValue(), MAC_RND_TYP.get(grRowTmp.cont_fctr_rnd_typ()).toMC()));
				}
				if (isNull(giRow.cont_qty())) {
					cndR.pack_unit_qty(giRow.pack_unit_qty().multiply(giRow.std_cont_fctr()));
				}
				else {
					cndR.pack_unit_qty(giRow.cont_qty());
				}
			}
			else {
				cndR.pack_unit_qty(giRow.pack_unit_qty());
			}
		}
		else {
			if (giRow.chk_cont_fctr_flg()) {
				for (Avl_ListR grRowTmp : grListTmp) {
					grRowTmp.base_unit_qty(grRowTmp.base_unit_qty().multiply(nvl(grRowTmp.act_cont_fctr(), grRowTmp.std_cont_fctr()),
							grRowTmp.cont_fctr_dec_place().intValue(), MAC_RND_TYP.get(grRowTmp.cont_fctr_rnd_typ()).toMC()));
				}
				if (isNull(giRow.cont_qty())) {
					cndR.base_unit_qty(giRow.base_unit_qty().multiply(giRow.std_cont_fctr()));
				}
				else {
					cndR.base_unit_qty(giRow.cont_qty());
				}
			}
			else {
				cndR.base_unit_qty(giRow.base_unit_qty());
			}
		}

		extNotMixSub(retL, grListTmp, cndR, procTyp, giRow);
	}

	/**
	 * extNotMixSub.<p>
	 *
	 * ロット混在不可ＦＬＧ、サブロット混在不可ＦＬＧ、物流Ｇ混在不可ＦＬＧによりデータを限定する<br>
	 * @param retL       使用可能在庫
	 * @param grListTmp  使用可能在庫（有効成分を換算済）
	 * @param cndR       引当する条件のRow（（有効成分を換算済））
	 * @param giRow
	 */
	protected void extNotMixSub(MCList<Avl_ListR> retL, MCList<Avl_ListR> grListTmp, Lot_MixR cndR, String procTyp, Avl_ListR giRow) {

		MCGroupByPolicy gp = new MCGroupByPolicy(Avl_ListR.$pack_alloc_flg);
		if (giRow.not_lot_mix_flg()) {
			gp.addKey(Avl_ListR.$lot_no);
		}
		if (giRow.not_sublot_mix_flg()) {
			gp.addKey(Avl_ListR.$sublot_no);
		}
		if(giRow.not_lg_mix_flg()) {
			gp.addKey(Avl_ListR.$stk_lg_grp_cd);
		}
		gp.sum(Avl_ListR.$pack_unit_qty, Avl_ListR.$base_unit_qty);

		// ロット、サブロット、物流Ｇごとに集計
		MCList<Avl_ListR> grListGp = grListTmp.groupBy(gp);

		// 数量のチェック
		qtyChktMatcher aUM = crtQtyChktMatcher(cndR);
		MCList<Avl_ListR> grListChk = grListGp.subList(aUM);

		// 数量のチェックに通ったロット、サブロット、物流Ｇだけ抽出する
		extNotMixMatcher aUMl = crtextNotMixMatcher(grListChk, giRow);
		MCList<Avl_ListR> grListExt = retL.subList(aUMl);

		// 最初の行のロット、サブロット、物流Ｇを保持する行のみ抽出する
		if (grListExt.isEmpty()) {
			retL.clear();
		}
		else {
			grListExt.sort(crtSortComparator(procTyp, giRow));

			ArrayList<String> key = new ArrayList<String>();
			ArrayList<String> val = new ArrayList<String>();
			Avl_ListR r = grListExt.get(0);

			if (giRow.not_lot_mix_flg()) {
				key.add(Avl_ListR.$lot_no);
				val.add(r.lot_no());
			}
			if (giRow.not_sublot_mix_flg()) {
				key.add(Avl_ListR.$sublot_no);
				val.add(r.sublot_no());
			}
			if (giRow.not_lg_mix_flg()) {
				key.add(Avl_ListR.$stk_lg_grp_cd);
				val.add(r.stk_lg_grp_cd());
			}

			retL.setAll(grListExt.subList(key.toArray(new String[0]), val.toArray(new String[0])));
		}
	}

	protected qtyChktMatcher crtQtyChktMatcher(Lot_MixR upTmp) {
		return new qtyChktMatcher(upTmp);
	}

	public class qtyChktMatcher implements MCRowMatcher<Avl_ListR> {

		Lot_MixR _cndR = Lot_MixR.create();

		public qtyChktMatcher(Lot_MixR cndR) {
			_cndR = cndR;
		}

		public boolean match(Avl_ListR grRowGp) {

			if (grRowGp.pack_alloc_flg()) {
				if (grRowGp.pack_unit_qty().gte(_cndR.pack_unit_qty())) {
					return true;
				}
			}
			else {
				if (grRowGp.base_unit_qty().gte(_cndR.base_unit_qty())) {
					return true;
				}
			}
			return false;
		}
	}

	protected extNotMixMatcher crtextNotMixMatcher(MCList<Avl_ListR> grListChk, Avl_ListR giRow) {
		return new extNotMixMatcher(grListChk, giRow);
	}

	public class extNotMixMatcher implements MCRowMatcher<Avl_ListR> {

		MCList<Avl_ListR> _grListChk = MCList.create(Avl_ListR.class);
		Avl_ListR _giRow;

		public extNotMixMatcher(MCList<Avl_ListR> grListChk, Avl_ListR giRow) {
			_grListChk = grListChk;
			_giRow = giRow;
		}

		public boolean match(Avl_ListR grRow) {

			boolean isRetTrue = false;
			for (Avl_ListR grRowChk : _grListChk) {
				if (_giRow.not_lot_mix_flg() && _giRow.not_sublot_mix_flg()) {
					if (isSame(grRow.lot_no(), grRowChk.lot_no())
							&& isSame(grRow.sublot_no(), grRowChk.sublot_no())) {
						isRetTrue = true;
					}
				}
				else if (_giRow.not_lot_mix_flg() && !_giRow.not_sublot_mix_flg()) {
					if (isSame(grRow.lot_no(), grRowChk.lot_no())) {
						isRetTrue = true;
					}
				}
				else if (!_giRow.not_lot_mix_flg() && _giRow.not_sublot_mix_flg()) {
					if (isSame(grRow.sublot_no(), grRowChk.sublot_no())) {
						isRetTrue = true;
					}
				}
				else {
					isRetTrue = true;
				}

				if (isRetTrue && _giRow.not_lg_mix_flg()) {
					if (isSame(grRow.stk_lg_grp_cd(), grRowChk.stk_lg_grp_cd())) {
						isRetTrue = true;
					}
					else {
						isRetTrue = false;
					}
				}

				if (isRetTrue) {
					return isRetTrue;
				}
			}
			return false;
		}
	}

	protected Map_Avl_ListR_Srch_TgtR<Avl_ListR,Srch_TgtR> createMap_Avl_ListR_Srch_TgtR() {
		return new Map_Avl_ListR_Srch_TgtR<Avl_ListR, Srch_TgtR>();
	}

	public class Map_Avl_ListR_Srch_TgtR<D extends Avl_ListR, S extends Srch_TgtR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Avl_ListR.$peg_no, Srch_TgtR.$peg_no);
			addColumnPathMap(Avl_ListR.$io_schd_typ, Srch_TgtR.$io_schd_typ);
			addColumnPathMap(Avl_ListR.$io_schd_sts_typ, Srch_TgtR.$io_schd_sts_typ);
			addColumnPathMap(Avl_ListR.$schd_dt, Srch_TgtR.$gi_schd_dt);
			addColumnPathMap(Avl_ListR.$inpt_schd_dt, Srch_TgtR.$inpt_schd_dt);
			addColumnPathMap(Avl_ListR.$gi_schd_dt, Srch_TgtR.$gi_schd_dt);
			addColumnPathMap(Avl_ListR.$gr_schd_dt, Srch_TgtR.$gr_schd_dt);
			addColumnPathMap(Avl_ListR.$itm_cd, Srch_TgtR.$itm_cd);
			addColumnPathMap(Avl_ListR.$itm_sub1, Srch_TgtR.$itm_sub1);
			addColumnPathMap(Avl_ListR.$itm_sub2, Srch_TgtR.$itm_sub2);
			addColumnPathMap(Avl_ListR.$itm_sub3, Srch_TgtR.$itm_sub3);
			addColumnPathMap(Avl_ListR.$pack_alloc_flg, Srch_TgtR.$pack_alloc_flg);
			addColumnPathMap(Avl_ListR.$ship_term_cd, Srch_TgtR.$ship_term_cd);
			addColumnPathMap(Avl_ListR.$ver_no, Srch_TgtR.$ver_no);
			addColumnPathMap(Avl_ListR.$alt_flg, Srch_TgtR.$alt_flg);
			addColumnPathMap(Avl_ListR.$alt_grp_cd, Srch_TgtR.$alt_grp_cd);
			addColumnPathMap(Avl_ListR.$alt_grp_seq, Srch_TgtR.$alt_grp_seq);
			addColumnPathMap(Avl_ListR.$oper_inst_no, Srch_TgtR.$oper_inst_no);
			addColumnPathMap(Avl_ListR.$alt_itm_typ, Srch_TgtR.$alt_itm_typ);
			addColumnPathMap(Avl_ListR.$alt_alloc_prio, Srch_TgtR.$alt_alloc_prio);
			addColumnPathMap(Avl_ListR.$inpt_loc_cd, Srch_TgtR.$inpt_loc_cd);
			addColumnPathMap(Avl_ListR.$inpt_str_ln_cd, Srch_TgtR.$inpt_str_ln_cd);
			addColumnPathMap(Avl_ListR.$dlv_lg_grp_cd, Srch_TgtR.$dlv_lg_grp_cd);
			addColumnPathMap(Avl_ListR.$alloc_grp_cd, Srch_TgtR.$alloc_grp_cd);
			addColumnPathMap(Avl_ListR.$gi_lg_grp_cd, Srch_TgtR.$gi_lg_grp_cd);
			addColumnPathMap(Avl_ListR.$gi_loc_cd, Srch_TgtR.$gi_loc_cd);
			addColumnPathMap(Avl_ListR.$gi_str_ln_cd, Srch_TgtR.$gi_str_ln_cd);
			addColumnPathMap(Avl_ListR.$gi_stk_arrv_bp_cd, Srch_TgtR.$gi_stk_arrv_bp_cd);
			addColumnPathMap(Avl_ListR.$gr_loc_cd, Srch_TgtR.$gr_loc_cd);
			addColumnPathMap(Avl_ListR.$gr_str_ln_cd, Srch_TgtR.$gr_str_ln_cd);
			addColumnPathMap(Avl_ListR.$stk_loc_cd, Srch_TgtR.$gi_loc_cd);
			addColumnPathMap(Avl_ListR.$stk_str_ln_cd, Srch_TgtR.$gi_str_ln_cd);
			addColumnPathMap(Avl_ListR.$stk_arrv_bp_cd, Srch_TgtR.$gi_stk_arrv_bp_cd);
			addColumnPathMap(Avl_ListR.$quality_typ, Srch_TgtR.$quality_typ);
			addColumnPathMap(Avl_ListR.$stk_id_typ, Srch_TgtR.$stk_id_typ);
			addColumnPathMap(Avl_ListR.$stk_bp_cd, Srch_TgtR.$stk_bp_cd);
			addColumnPathMap(Avl_ListR.$gd_cd, Srch_TgtR.$gd_cd);
			addColumnPathMap(Avl_ListR.$lot_no, Srch_TgtR.$lot_no);
			addColumnPathMap(Avl_ListR.$sublot_no, Srch_TgtR.$sublot_no);
			addColumnPathMap(Avl_ListR.$rqst_sno1, Srch_TgtR.$sno1);
			addColumnPathMap(Avl_ListR.$sno1_null_flg, Srch_TgtR.$sno1_null_flg);
			addColumnPathMap(Avl_ListR.$rqst_sno2, Srch_TgtR.$sno2);
			addColumnPathMap(Avl_ListR.$sno2_null_flg, Srch_TgtR.$sno2_null_flg);
			addColumnPathMap(Avl_ListR.$rqst_sno3, Srch_TgtR.$sno3);
			addColumnPathMap(Avl_ListR.$sno3_null_flg, Srch_TgtR.$sno3_null_flg);
			addColumnPathMap(Avl_ListR.$rqst_sno4, Srch_TgtR.$sno4);
			addColumnPathMap(Avl_ListR.$sno4_null_flg, Srch_TgtR.$sno4_null_flg);
			addColumnPathMap(Avl_ListR.$sno1, Srch_TgtR.$sno1);
			addColumnPathMap(Avl_ListR.$sno2, Srch_TgtR.$sno2);
			addColumnPathMap(Avl_ListR.$sno3, Srch_TgtR.$sno3);
			addColumnPathMap(Avl_ListR.$sno4, Srch_TgtR.$sno4);
			addColumnPathMap(Avl_ListR.$pack_unit_cd, Srch_TgtR.$pack_unit_cd);
			addColumnPathMap(Avl_ListR.$pack_unit_qty, Srch_TgtR.$pack_unit_qty);
			addColumnPathMap(Avl_ListR.$pack_unit_dec_place, Srch_TgtR.$pack_unit_dec_place);
			addColumnPathMap(Avl_ListR.$pack_unit_rnd_typ, Srch_TgtR.$pack_unit_rnd_typ);
			addColumnPathMap(Avl_ListR.$conv_base_qty, Srch_TgtR.$conv_base_qty);
			addColumnPathMap(Avl_ListR.$conv_qty, Srch_TgtR.$conv_qty);
			addColumnPathMap(Avl_ListR.$base_unit_cd, Srch_TgtR.$base_unit_cd);
			addColumnPathMap(Avl_ListR.$base_unit_qty, Srch_TgtR.$base_unit_qty);
			addColumnPathMap(Avl_ListR.$base_unit_dec_place, Srch_TgtR.$base_unit_dec_place);
			addColumnPathMap(Avl_ListR.$base_unit_rnd_typ, Srch_TgtR.$base_unit_rnd_typ);
			addColumnPathMap(Avl_ListR.$cont_fctr_flg, Srch_TgtR.$cont_fctr_flg);
			addColumnPathMap(Avl_ListR.$chk_cont_fctr_flg, Srch_TgtR.$chk_cont_fctr_flg);
			addColumnPathMap(Avl_ListR.$std_cont_fctr, Srch_TgtR.$std_cont_fctr);
			addColumnPathMap(Avl_ListR.$cont_qty, Srch_TgtR.$cont_qty);
			addColumnPathMap(Avl_ListR.$cont_fctr_rnd_typ, Srch_TgtR.$cont_fctr_rnd_typ);
			addColumnPathMap(Avl_ListR.$cont_fctr_dec_place, Srch_TgtR.$cont_fctr_dec_place);
			addColumnPathMap(Avl_ListR.$not_lot_fix_flg, Srch_TgtR.$not_lot_fix_flg);
			addColumnPathMap(Avl_ListR.$not_lot_mix_flg, Srch_TgtR.$not_lot_mix_flg);
			addColumnPathMap(Avl_ListR.$not_sublot_mix_flg, Srch_TgtR.$not_sublot_mix_flg);
			addColumnPathMap(Avl_ListR.$vld_dt_fr, Srch_TgtR.$vld_dt_fr);
			addColumnPathMap(Avl_ListR.$vld_dt_fr_grp, Srch_TgtR.$vld_dt_fr_grp);
			addColumnPathMap(Avl_ListR.$vld_dt_to, Srch_TgtR.$vld_dt_to);
			addColumnPathMap(Avl_ListR.$asset_mng_typ, Srch_TgtR.$asset_mng_typ);
			addColumnPathMap(Avl_ListR.$lot_mng_typ, Srch_TgtR.$lot_mng_typ);
			addColumnPathMap(Avl_ListR.$sublot_mng_typ, Srch_TgtR.$sublot_mng_typ);
			addColumnPathMap(Avl_ListR.$stk_flg, Srch_TgtR.$stk_flg);
			addColumnPathMap(Avl_ListR.$stk_info_loc_typ, Srch_TgtR.$stk_info_loc_typ);
			addColumnPathMap(Avl_ListR.$lno, Srch_TgtR.$lno);
			addColumnPathMap(Avl_ListR.$alloc_grp_srch_flg, Srch_TgtR.$alloc_grp_srch_flg);
			addColumnPathMap(Avl_ListR.$alloc_scope_typ, Srch_TgtR.$alloc_scope_typ);
			addColumnPathMap(Avl_ListR.$cst_cd, Srch_TgtR.$cst_cd);
			addColumnPathMap(Avl_ListR.$lot_back_stop_typ, Srch_TgtR.$lot_back_stop_typ);
			addColumnPathMap(Avl_ListR.$not_lg_mix_flg, Srch_TgtR.$not_lg_mix_flg);
			addColumnPathMap(Avl_ListR.$chk_ship_flg, Srch_TgtR.$chk_ship_flg);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.pack_unit_alloc_qty(MCNumber.ZERO);
			dest.pack_unit_wait_qty(MCNumber.ZERO);
			dest.base_unit_alloc_qty(MCNumber.ZERO);
			dest.base_unit_wait_qty(MCNumber.ZERO);
			dest.addBooleanColumn(_stkAllocFlg, src.stk_alloc_flg());
		}
	}

	protected Map_Srch_RsltR_Avl_ListR<Srch_RsltR,Avl_ListR> createMap_Srch_RsltR_Avl_ListR() {
		return new Map_Srch_RsltR_Avl_ListR<Srch_RsltR, Avl_ListR>();
	}

	public class Map_Srch_RsltR_Avl_ListR<D extends Srch_RsltR, S extends Avl_ListR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
//			addColumnPathMap(Srch_RsltR.$peg_no, Avl_ListR.$peg_no);				setAllocRsltで設定する
			addColumnPathMap(Srch_RsltR.$schd_stk_typ, Avl_ListR.$schd_stk_typ);
			addColumnPathMap(Srch_RsltR.$io_schd_typ, Avl_ListR.$io_schd_typ);
			addColumnPathMap(Srch_RsltR.$io_schd_sts_typ, Avl_ListR.$io_schd_sts_typ);
			addColumnPathMap(Srch_RsltR.$io_schd_no, Avl_ListR.$io_schd_no);
			addColumnPathMap(Srch_RsltR.$io_schd_seq, Avl_ListR.$io_schd_seq);
			addColumnPathMap(Srch_RsltR.$schd_dt, Avl_ListR.$schd_dt);
			addColumnPathMap(Srch_RsltR.$io_schd_pr_no, Avl_ListR.$io_schd_pr_no);
			addColumnPathMap(Srch_RsltR.$itm_cd, Avl_ListR.$itm_cd);
			addColumnPathMap(Srch_RsltR.$itm_sub1, Avl_ListR.$itm_sub1);
			addColumnPathMap(Srch_RsltR.$itm_sub2, Avl_ListR.$itm_sub2);
			addColumnPathMap(Srch_RsltR.$itm_sub3, Avl_ListR.$itm_sub3);
			addColumnPathMap(Srch_RsltR.$ver_no, Avl_ListR.$ver_no);
//			addColumnPathMap(Srch_RsltR.$alt_grp_cd, Avl_ListR.$alt_grp_cd);		setAllocRsltで設定する
//			addColumnPathMap(Srch_RsltR.$alt_grp_seq, Avl_ListR.$alt_grp_seq);		setAllocRsltで設定する
//			addColumnPathMap(Srch_RsltR.$oper_inst_no, Avl_ListR.$oper_inst_no);	setAllocRsltで設定する
			addColumnPathMap(Srch_RsltR.$inpt_loc_cd, Avl_ListR.$inpt_loc_cd);
			addColumnPathMap(Srch_RsltR.$inpt_str_ln_cd, Avl_ListR.$inpt_str_ln_cd);
			addColumnPathMap(Srch_RsltR.$inpt_sppl_cd, Avl_ListR.$inpt_sppl_cd);
			addColumnPathMap(Srch_RsltR.$dlv_lg_grp_cd, Avl_ListR.$dlv_lg_grp_cd);
			addColumnPathMap(Srch_RsltR.$alloc_grp_cd, Avl_ListR.$alloc_grp_cd);
			addColumnPathMap(Srch_RsltR.$gi_lg_grp_cd, Avl_ListR.$gi_lg_grp_cd);
			addColumnPathMap(Srch_RsltR.$gi_loc_cd, Avl_ListR.$gi_loc_cd);
			addColumnPathMap(Srch_RsltR.$gi_str_ln_cd, Avl_ListR.$gi_str_ln_cd);
			addColumnPathMap(Srch_RsltR.$gi_stk_arrv_bp_cd, Avl_ListR.$gi_stk_arrv_bp_cd);
			addColumnPathMap(Srch_RsltR.$gr_loc_cd, Avl_ListR.$gr_loc_cd);
			addColumnPathMap(Srch_RsltR.$gr_str_ln_cd, Avl_ListR.$gr_str_ln_cd);
			addColumnPathMap(Srch_RsltR.$stk_loc_cd, Avl_ListR.$stk_loc_cd);
			addColumnPathMap(Srch_RsltR.$stk_str_ln_tgt_flg, Avl_ListR.$stk_str_ln_tgt_flg);
			addColumnPathMap(Srch_RsltR.$stk_str_ln_cd, Avl_ListR.$stk_str_ln_cd);
			addColumnPathMap(Srch_RsltR.$stk_arrv_bp_cd, Avl_ListR.$stk_arrv_bp_cd);
			addColumnPathMap(Srch_RsltR.$stk_sppl_cd, Avl_ListR.$stk_sppl_cd);
			addColumnPathMap(Srch_RsltR.$stk_alloc_grp_cd, Avl_ListR.$stk_alloc_grp_cd);
			addColumnPathMap(Srch_RsltR.$stk_lg_grp_cd, Avl_ListR.$stk_lg_grp_cd);
			addColumnPathMap(Srch_RsltR.$xfr_lt, Avl_ListR.$xfr_lt);
			addColumnPathMap(Srch_RsltR.$asst_typ, Avl_ListR.$asst_typ);
			addColumnPathMap(Srch_RsltR.$in_xfr_typ, Avl_ListR.$in_xfr_typ);
			addColumnPathMap(Srch_RsltR.$quality_typ, Avl_ListR.$quality_typ);
			addColumnPathMap(Srch_RsltR.$stk_insp_typ, Avl_ListR.$stk_insp_typ);
			addColumnPathMap(Srch_RsltR.$stk_id_typ, Avl_ListR.$stk_id_typ);
			addColumnPathMap(Srch_RsltR.$stk_bp_cd, Avl_ListR.$stk_bp_cd);
			addColumnPathMap(Srch_RsltR.$gd_cd, Avl_ListR.$gd_cd);
			addColumnPathMap(Srch_RsltR.$lot_no, Avl_ListR.$lot_no);
			addColumnPathMap(Srch_RsltR.$sublot_no, Avl_ListR.$sublot_no);
			addColumnPathMap(Srch_RsltR.$sno1, Avl_ListR.$sno1);
			addColumnPathMap(Srch_RsltR.$sno2, Avl_ListR.$sno2);
			addColumnPathMap(Srch_RsltR.$sno3, Avl_ListR.$sno3);
			addColumnPathMap(Srch_RsltR.$sno4, Avl_ListR.$sno4);
			addColumnPathMap(Srch_RsltR.$first_gr_dt, Avl_ListR.$first_gr_dt);
			addColumnPathMap(Srch_RsltR.$vld_dt, Avl_ListR.$vld_dt);
			addColumnPathMap(Srch_RsltR.$lot_seq, Avl_ListR.$lot_seq);
			addColumnPathMap(Srch_RsltR.$pack_unit_cd, Avl_ListR.$pack_unit_cd);
			addColumnPathMap(Srch_RsltR.$pack_unit_qty, Avl_ListR.$pack_unit_qty);
			addColumnPathMap(Srch_RsltR.$pack_unit_dec_place, Avl_ListR.$pack_unit_dec_place);
			addColumnPathMap(Srch_RsltR.$pack_unit_rnd_typ, Avl_ListR.$pack_unit_rnd_typ);
			addColumnPathMap(Srch_RsltR.$base_unit_cd, Avl_ListR.$base_unit_cd);
			addColumnPathMap(Srch_RsltR.$base_unit_qty, Avl_ListR.$base_unit_qty);
			addColumnPathMap(Srch_RsltR.$base_unit_dec_place, Avl_ListR.$base_unit_dec_place);
			addColumnPathMap(Srch_RsltR.$base_unit_rnd_typ, Avl_ListR.$base_unit_rnd_typ);
			addColumnPathMap(Srch_RsltR.$cont_fctr_flg, Avl_ListR.$cont_fctr_flg);
			addColumnPathMap(Srch_RsltR.$act_cont_fctr, Avl_ListR.$act_cont_fctr);
			addColumnPathMap(Srch_RsltR.$std_cont_fctr, Avl_ListR.$std_cont_fctr);
			addColumnPathMap(Srch_RsltR.$cont_qty, Avl_ListR.$cont_qty);
//			addColumnPathMap(Srch_RsltR.$rqst_sno1, Avl_ListR.$rqst_sno1);			setAllocRsltで設定する
//			addColumnPathMap(Srch_RsltR.$sno1_null_flg, Avl_ListR.$sno1_null_flg);	setAllocRsltで設定する
//			addColumnPathMap(Srch_RsltR.$rqst_sno2, Avl_ListR.$rqst_sno2);			setAllocRsltで設定する
//			addColumnPathMap(Srch_RsltR.$sno2_null_flg, Avl_ListR.$sno2_null_flg);	setAllocRsltで設定する
//			addColumnPathMap(Srch_RsltR.$rqst_sno3, Avl_ListR.$rqst_sno3);			setAllocRsltで設定する
//			addColumnPathMap(Srch_RsltR.$sno3_null_flg, Avl_ListR.$sno3_null_flg);	setAllocRsltで設定する
//			addColumnPathMap(Srch_RsltR.$rqst_sno4, Avl_ListR.$rqst_sno4);			setAllocRsltで設定する
//			addColumnPathMap(Srch_RsltR.$sno4_null_flg, Avl_ListR.$sno4_null_flg);	setAllocRsltで設定する
//			addColumnPathMap(Srch_RsltR.$vld_dt_fr, Avl_ListR.$vld_dt_fr);			setAllocRsltで設定する
//			addColumnPathMap(Srch_RsltR.$vld_dt_to, Avl_ListR.$vld_dt_to);			setAllocRsltで設定する
		}
	}

	protected Map_Srch_TgtR_Avl_ListR<Srch_TgtR,Avl_ListR> createMap_Srch_TgtR_Avl_ListR() {
		return new Map_Srch_TgtR_Avl_ListR<Srch_TgtR, Avl_ListR>();
	}

	public class Map_Srch_TgtR_Avl_ListR<D extends Srch_TgtR, S extends Avl_ListR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch_TgtR.$peg_no, Avl_ListR.$peg_no);
			addColumnPathMap(Srch_TgtR.$inpt_schd_dt, Avl_ListR.$inpt_schd_dt);
			addColumnPathMap(Srch_TgtR.$gi_schd_dt, Avl_ListR.$gi_schd_dt);
			addColumnPathMap(Srch_TgtR.$gr_schd_dt, Avl_ListR.$gr_schd_dt);
			addColumnPathMap(Srch_TgtR.$itm_cd, Avl_ListR.$itm_cd);
			addColumnPathMap(Srch_TgtR.$itm_sub1, Avl_ListR.$itm_sub1);
			addColumnPathMap(Srch_TgtR.$itm_sub2, Avl_ListR.$itm_sub2);
			addColumnPathMap(Srch_TgtR.$itm_sub3, Avl_ListR.$itm_sub3);
			addColumnPathMap(Srch_TgtR.$ver_no, Avl_ListR.$ver_no);
			addColumnPathMap(Srch_TgtR.$alt_flg, Avl_ListR.$alt_flg);
			addColumnPathMap(Srch_TgtR.$alt_grp_cd, Avl_ListR.$alt_grp_cd);
			addColumnPathMap(Srch_TgtR.$alt_grp_seq, Avl_ListR.$alt_grp_seq);
			addColumnPathMap(Srch_TgtR.$oper_inst_no, Avl_ListR.$oper_inst_no);
			addColumnPathMap(Srch_TgtR.$alt_itm_typ, Avl_ListR.$alt_itm_typ);
			addColumnPathMap(Srch_TgtR.$alt_alloc_prio, Avl_ListR.$alt_alloc_prio);
			addColumnPathMap(Srch_TgtR.$inpt_loc_cd, Avl_ListR.$inpt_loc_cd);
			addColumnPathMap(Srch_TgtR.$inpt_str_ln_cd, Avl_ListR.$inpt_str_ln_cd);
			addColumnPathMap(Srch_TgtR.$dlv_lg_grp_cd, Avl_ListR.$dlv_lg_grp_cd);
			addColumnPathMap(Srch_TgtR.$alloc_grp_cd, Avl_ListR.$alloc_grp_cd);
			addColumnPathMap(Srch_TgtR.$gi_lg_grp_cd, Avl_ListR.$gi_lg_grp_cd);
			if (MSC_LOT_PROP_TYP.isLOT(_lotPropTyp)) {
				addColumnPathMap(Srch_TgtR.$gi_loc_cd, Avl_ListR.$gi_loc_cd);
				addColumnPathMap(Srch_TgtR.$gi_str_ln_cd, Avl_ListR.$gi_str_ln_cd);
				addColumnPathMap(Srch_TgtR.$gi_stk_arrv_bp_cd, Avl_ListR.$gi_stk_arrv_bp_cd);
			}
			else {
				addColumnPathMap(Srch_TgtR.$gi_loc_cd, Avl_ListR.$stk_loc_cd);
				addColumnPathMap(Srch_TgtR.$gi_str_ln_cd, Avl_ListR.$stk_str_ln_cd);
				addColumnPathMap(Srch_TgtR.$gi_stk_arrv_bp_cd, Avl_ListR.$stk_arrv_bp_cd);
			}
			addColumnPathMap(Srch_TgtR.$gr_loc_cd, Avl_ListR.$gr_loc_cd);
			addColumnPathMap(Srch_TgtR.$gr_str_ln_cd, Avl_ListR.$gr_str_ln_cd);
			addColumnPathMap(Srch_TgtR.$quality_typ, Avl_ListR.$quality_typ);
			addColumnPathMap(Srch_TgtR.$stk_id_typ, Avl_ListR.$stk_id_typ);
			addColumnPathMap(Srch_TgtR.$stk_bp_cd, Avl_ListR.$stk_bp_cd);
			addColumnPathMap(Srch_TgtR.$gd_cd, Avl_ListR.$gd_cd);
			addColumnPathMap(Srch_TgtR.$lot_no, Avl_ListR.$lot_no);
			addColumnPathMap(Srch_TgtR.$sublot_no, Avl_ListR.$sublot_no);
			addColumnPathMap(Srch_TgtR.$sno1_null_flg, Avl_ListR.$sno1_null_flg);
			addColumnPathMap(Srch_TgtR.$sno2_null_flg, Avl_ListR.$sno2_null_flg);
			addColumnPathMap(Srch_TgtR.$sno3_null_flg, Avl_ListR.$sno3_null_flg);
			addColumnPathMap(Srch_TgtR.$sno4_null_flg, Avl_ListR.$sno4_null_flg);
			addColumnPathMap(Srch_TgtR.$pack_unit_cd, Avl_ListR.$pack_unit_cd);
			addColumnPathMap(Srch_TgtR.$pack_unit_qty, Avl_ListR.$pack_unit_qty);
			addColumnPathMap(Srch_TgtR.$base_unit_cd, Avl_ListR.$base_unit_cd);
			addColumnPathMap(Srch_TgtR.$base_unit_qty, Avl_ListR.$base_unit_qty);
			addColumnPathMap(Srch_TgtR.$cont_qty, Avl_ListR.$cont_qty);
			addColumnPathMap(Srch_TgtR.$not_lot_fix_flg, Avl_ListR.$not_lot_fix_flg);
			addColumnPathMap(Srch_TgtR.$not_lot_mix_flg, Avl_ListR.$not_lot_mix_flg);
			addColumnPathMap(Srch_TgtR.$not_sublot_mix_flg, Avl_ListR.$not_sublot_mix_flg);
			addColumnPathMap(Srch_TgtR.$vld_dt_fr, Avl_ListR.$vld_dt_fr);
			addColumnPathMap(Srch_TgtR.$vld_dt_fr_grp, Avl_ListR.$vld_dt_fr_grp);
			addColumnPathMap(Srch_TgtR.$vld_dt_to, Avl_ListR.$vld_dt_to);
			addColumnPathMap(Srch_TgtR.$alloc_scope_typ, Avl_ListR.$alloc_scope_typ);
			addColumnPathMap(Srch_TgtR.$ship_term_cd, Avl_ListR.$ship_term_cd);
			addColumnPathMap(Srch_TgtR.$io_schd_typ, Avl_ListR.$io_schd_typ);
			addColumnPathMap(Srch_TgtR.$io_schd_sts_typ, Avl_ListR.$io_schd_sts_typ);
			addColumnPathMap(Srch_TgtR.$pack_alloc_flg, Avl_ListR.$pack_alloc_flg);
			addColumnPathMap(Srch_TgtR.$cont_fctr_flg, Avl_ListR.$cont_fctr_flg);
			addColumnPathMap(Srch_TgtR.$chk_cont_fctr_flg, Avl_ListR.$chk_cont_fctr_flg);
			addColumnPathMap(Srch_TgtR.$std_cont_fctr, Avl_ListR.$std_cont_fctr);
			addColumnPathMap(Srch_TgtR.$cont_fctr_rnd_typ, Avl_ListR.$cont_fctr_rnd_typ);
			addColumnPathMap(Srch_TgtR.$cont_fctr_dec_place, Avl_ListR.$cont_fctr_dec_place);
			addColumnPathMap(Srch_TgtR.$base_unit_dec_place, Avl_ListR.$base_unit_dec_place);
			addColumnPathMap(Srch_TgtR.$base_unit_rnd_typ, Avl_ListR.$base_unit_rnd_typ);
			addColumnPathMap(Srch_TgtR.$conv_base_qty, Avl_ListR.$conv_base_qty);
			addColumnPathMap(Srch_TgtR.$conv_qty, Avl_ListR.$conv_qty);
			addColumnPathMap(Srch_TgtR.$pack_unit_dec_place, Avl_ListR.$pack_unit_dec_place);
			addColumnPathMap(Srch_TgtR.$pack_unit_rnd_typ, Avl_ListR.$pack_unit_rnd_typ);
			addColumnPathMap(Srch_TgtR.$lot_mng_typ, Avl_ListR.$lot_mng_typ);
			addColumnPathMap(Srch_TgtR.$sublot_mng_typ, Avl_ListR.$sublot_mng_typ);
			addColumnPathMap(Srch_TgtR.$stk_info_loc_typ, Avl_ListR.$stk_info_loc_typ);
			addColumnPathMap(Srch_TgtR.$lno, Avl_ListR.$lno);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			// Alloc_Srch01のsetDownから呼ばれた場合はrqst_snoが設定されていないため、nvlでsnoを設定
			dest.sno1(nvl(src.rqst_sno1(), src.sno1()));
			dest.sno2(nvl(src.rqst_sno2(), src.sno2()));
			dest.sno3(nvl(src.rqst_sno3(), src.sno3()));
			dest.sno4(nvl(src.rqst_sno4(), src.sno4()));
		}
	}

	protected Map_MSW_STK_LST_R_Srch_StkR<MSW_STK_LST_R,Srch_StkR> createMap_MSW_STK_LST_R_Srch_StkR() {
		return new Map_MSW_STK_LST_R_Srch_StkR<MSW_STK_LST_R, Srch_StkR>();
	}

	public class Map_MSW_STK_LST_R_Srch_StkR<D extends MSW_STK_LST_R, S extends Srch_StkR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_STK_LST_R.$itm_cd, Srch_StkR.$itm_cd);
			addColumnPathMap(MSW_STK_LST_R.$itm_sub1, Srch_StkR.$itm_sub1);
			addColumnPathMap(MSW_STK_LST_R.$itm_sub2, Srch_StkR.$itm_sub2);
			addColumnPathMap(MSW_STK_LST_R.$itm_sub3, Srch_StkR.$itm_sub3);
			addColumnPathMap(MSW_STK_LST_R.$loc_cd, Srch_StkR.$loc_cd);
			addColumnPathMap(MSW_STK_LST_R.$str_ln_cd, Srch_StkR.$str_ln_cd);
			addColumnPathMap(MSW_STK_LST_R.$stk_arrv_bp_cd, Srch_StkR.$stk_arrv_bp_cd);
			addColumnPathMap(MSW_STK_LST_R.$lot_no, Srch_StkR.$lot_no);
			addColumnPathMap(MSW_STK_LST_R.$sublot_no, Srch_StkR.$sublot_no);
			addColumnPathMap(MSW_STK_LST_R.$sno1, Srch_StkR.$sno1);
			addColumnPathMap(MSW_STK_LST_R.$sno2, Srch_StkR.$sno2);
			addColumnPathMap(MSW_STK_LST_R.$sno3, Srch_StkR.$sno3);
			addColumnPathMap(MSW_STK_LST_R.$sno4, Srch_StkR.$sno4);
			addColumnPathMap(MSW_STK_LST_R.$pack_unit_cd, Srch_StkR.$pack_unit_cd);
			addColumnPathMap(MSW_STK_LST_R.$gd_cd, Srch_StkR.$gd_cd);
			addColumnPathMap(MSW_STK_LST_R.$in_xfr_typ, Srch_StkR.$in_xfr_typ);
			addColumnPathMap(MSW_STK_LST_R.$quality_typ, Srch_StkR.$quality_typ);
			addColumnPathMap(MSW_STK_LST_R.$asst_typ, Srch_StkR.$asst_typ);
			addColumnPathMap(MSW_STK_LST_R.$stk_insp_typ, Srch_StkR.$stk_insp_typ);
			addColumnPathMap(MSW_STK_LST_R.$stk_id_typ, Srch_StkR.$stk_id_typ);
			addColumnPathMap(MSW_STK_LST_R.$stk_bp_cd, Srch_StkR.$stk_bp_cd);
			addColumnPathMap(MSW_STK_LST_R.$pack_unit_qty, Srch_StkR.$pack_unit_qty);
			addColumnPathMap(MSW_STK_LST_R.$base_unit_qty, Srch_StkR.$base_unit_qty);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
			dest.fix_no(MAC_STR.NULL_VAL.value());
		}
	}

	/**
	 * Alloc_Avl_Sprt01オペレーション.<p>
	 *
	 * 出庫先・納品先物流Ｇと出庫予定日から引当可能日数の範囲内かどうかをチェックする。<br>
	 */
	public class Alloc_Avl_Sprt01 extends MSBEL_AllocMngService_MC_A.Alloc_Avl_Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			doCalc();
			setDown();
		}

		protected void editUp() {
			// 物流Ｇマスタのキャッシュ取得
			setLgGrpCache();

			for (Alloc_Avl_Sprt01_CndR r : up0()) {
				// 運用日付を設定
				r.today(getToday());

				// 物流ＧマスタのキャッシュからカレンダＣＤを設定
				MAM_LG_GRP_R lgGrpR = _lgGrpCache.getCache(r.gi_lg_grp_cd());
				if (!isNull(lgGrpR)) {
					r.cal_cd(lgGrpR.cal_cd());
				}
				if(isNull(r.cal_cd())) {
					r.cal_cd(getCo().std_cal_cd());
				}
			}

			// 物流制御マスタのキャッシュ取得
			setLgCtlCache();

			for (Alloc_Avl_Sprt01_CndR r : up0()) {
				// 物流制御マスタのキャッシュから引当可能日数を設定
				MAM_LG_CTL_R lgCtrR = _lgCtlCache.getCache(r.gi_lg_grp_cd(),
						r.dlv_lg_grp_cd(), r.ship_term_cd());
				if (isNull(lgCtrR)) {
					// 取得できない場合は出荷条件をNULL文字にして取得
					lgCtrR = _lgCtlCache.getCache(r.gi_lg_grp_cd(), r.dlv_lg_grp_cd(),
							MAC_STR.NULL_VAL.value());
				}
				if (!isNull(lgCtrR)) {
					r.alloc_days(lgCtrR.alloc_days());
				}
			}
		}

		protected void doCalc() {
			// 計算に必要な項目がすべて設定されているレコードのみを抽出
			MCList<Alloc_Avl_Sprt01_CndR> tgtL = up0()
					.subList(r -> !isNullOr(r.gi_schd_dt(), r.cal_cd(), r.alloc_days()));

			// 運用日付から出庫予定日までのカレンダの稼働日数を計算する
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_DT$F_CAL_DAYS", "01"),
					MABCFunction.getFunctionExecuter("MAPA_DT$F_CAL_DAYS"),
					Alloc_Avl_Sprt01_CndR.$ship_days, tgtL, Alloc_Avl_Sprt01_CndR.$today,
					Alloc_Avl_Sprt01_CndR.$gi_schd_dt, Alloc_Avl_Sprt01_CndR.$cal_cd);

			// 稼働日数が計算されたレコードについて稼働日数＞引当可能日数の場合、引当可能日数超過フラグをオンにする
			// 運用日付に対して翌営業日の出庫予定日を引当可能としたい場合、引当可能日数には１を設定する
			// それに対し、運用日付と翌営業日を指定して稼働日数を計算すると、結果は２となる
			// そのため、稼働日数＞引当可能日数＋１かどうかでフラグを設定する
			for (Alloc_Avl_Sprt01_CndR r : up0()) {
				if (!isNull(r.ship_days()) && r.ship_days().gt(r.alloc_days().add(1))) {
					r.exceed_alloc_days_flg(true);
				}
				else {
					r.exceed_alloc_days_flg(false);
				}
			}
		}

		protected void setDown() {
			down0().addAll(up0());
		}

		/**
		 * 物流グループマスタのキャッシュ
		 */
		protected FXUCL_Cache<MAM_LG_GRP_R> _lgGrpCache;

		/**
		 * 物流グループマスタからカレンダを取得
		 */
		protected void setLgGrpCache() {
			MCList<MAM_LG_GRP_R> cndL = MCList.create(MAM_LG_GRP_R.class);
			for (Alloc_Avl_Sprt01_CndR r : up0()) {
				MAM_LG_GRP_R cndR = MAM_LG_GRP_R.create();
				cndR.lg_grp_cd(r.gi_lg_grp_cd()); // 物流Ｇには出庫物流Ｇ
				cndL.add(cndR);
			}
			cndL = cndL.groupBy(MAM_LG_GRP_R.$lg_grp_cd);
			MCList<MAM_LG_GRP_R> dbcL = MCList.create(MAM_LG_GRP_R.class);
			MAM_LG_GRP_R t = MAM_LG_GRP_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.lg_grp_cd, t.cal_cd);
			dbSelectKey("MSBEL5040_MAM_LG_GRP_S01", dbcL, dbcL_bldr, cndL);

			_lgGrpCache = new FXUCL_Cache<MAM_LG_GRP_R>();
			_lgGrpCache.setFixMaxCacheSize(-1);
			for (MAM_LG_GRP_R r : dbcL) {
				_lgGrpCache.putCache(new String[] {
						r.lg_grp_cd()
				}, r);
			}
		}

		/**
		 * 物流制御マスタのキャッシュ
		 */
		protected FXUCL_Cache<MAM_LG_CTL_R> _lgCtlCache;

		/**
		 * 物流制御マスタから引当可能日数を取得
		 */
		protected void setLgCtlCache() {
			// 出荷元物流Ｇ＋出荷先物流Ｇ＋出荷条件で検索した結果と、出荷元物流Ｇ＋出荷先物流Ｇ＋NULL文字で検索した結果をあわせる
			MCList<MAM_LG_CTL_R> cndL = MCList.create(MAM_LG_CTL_R.class);
			for (Alloc_Avl_Sprt01_CndR r : up0()) {
				MAM_LG_CTL_R cndR = MAM_LG_CTL_R.create();
				cndR.fr_lg_grp_cd(r.gi_lg_grp_cd()); // 出荷元物流Ｇには出庫物流Ｇ
				cndR.to_lg_grp_cd(r.dlv_lg_grp_cd()); // 出荷先物流Ｇには納品先物流Ｇ
				cndR.ship_term_cd(r.ship_term_cd()); // 出荷条件ＣＤ
				cndL.add(cndR);
				// 出荷条件ＣＤがNULL文字以外の場合、NULL文字の条件も追加
				if (!isSame(r.ship_term_cd(), MAC_STR.NULL_VAL.value())) {
					MAM_LG_CTL_R newR = cndR.clone();
					newR.ship_term_cd(MAC_STR.NULL_VAL.value());
					cndL.add(newR);
				}
			}
			cndL = cndL.groupBy(MAM_LG_CTL_R.$fr_lg_grp_cd, MAM_LG_CTL_R.$to_lg_grp_cd,
					MAM_LG_CTL_R.$ship_term_cd);
			MCList<MAM_LG_CTL_R> dbcL = MCList.create(MAM_LG_CTL_R.class);
			MAM_LG_CTL_R t = MAM_LG_CTL_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.fr_lg_grp_cd, t.to_lg_grp_cd, t.ship_term_cd, t.alloc_days);
			dbSelectKey("MSBEL5040_MAM_LG_CTL_S02", dbcL, dbcL_bldr, cndL);

			_lgCtlCache = new FXUCL_Cache<MAM_LG_CTL_R>();
			_lgCtlCache.setFixMaxCacheSize(-1);
			for (MAM_LG_CTL_R r : dbcL) {
				_lgCtlCache.putCache(new String[] {
						r.fr_lg_grp_cd(), r.to_lg_grp_cd(), r.ship_term_cd()
				}, r);
			}
		}
	}

	//FMCB CUSTOM END
}