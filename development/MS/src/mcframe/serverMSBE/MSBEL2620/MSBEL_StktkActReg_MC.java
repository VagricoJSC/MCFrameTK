package mcframe.serverMSBE.MSBEL2620;

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
import mcframe.serverMSBE.MSBEL2620.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL6600.*;
import mcframe.commonCore.param.MCParam;
import static mcframe.serverMAUC.MAUCL0080.MAUCL_StdUpriUtil.*;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;

import java.util.*;

import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_StktkActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_StktkActReg_MC extends MSBEL_StktkActReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 実棚情報を検索します。<br>
	 */
	public class Srch01 extends MSBEL_StktkActReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			// サブオペレーション実行
			mapUpContainers(SAR);
			so01.exec();
			mapDownContainers(SAR);
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 更新前に事前チェックを行います。<br>
	 */
	public class Chk01 extends MSBEL_StktkActReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void initUpSub() {
			super.initUpSub();

			MCList<MAM_ITM_R> itmL = getItmList();
			if (isNull(itmL)) {
				return;
			}

			MCIndexKey itmKey = itmL.createIndex(
					MAM_ITM_R.$itm_cd,
					MAM_ITM_R.$itm_sub1,
					MAM_ITM_R.$itm_sub2,
					MAM_ITM_R.$itm_sub3);

			for (Chk01_DtlR r : up0()) {
				if (!r.isStatusCreate() ||
					MAC_STR.isNULL_VAL(r.lot_no()) && 
					MAC_STR.isNULL_VAL(r.sublot_no()) &&
					MAC_STR.isNULL_VAL(r.sno1()) &&
					MAC_STR.isNULL_VAL(r.sno2()) &&
					MAC_STR.isNULL_VAL(r.sno3()) &&
					MAC_STR.isNULL_VAL(r.sno4())) {
					continue;
				}

				MAM_ITM_R itmR = itmL.getFirst(itmKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (itmR == null) {
					continue;
				}

				if (MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())) {
					r.lot_no(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
					r.sublot_no(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(itmR.sno1_mng_typ()) || MAC_SNO_MNG_TYP.isMNG_NOT_STK(itmR.sno1_mng_typ())) {
					r.sno1(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(itmR.sno2_mng_typ()) || MAC_SNO_MNG_TYP.isMNG_NOT_STK(itmR.sno2_mng_typ())) {
					r.sno2(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(itmR.sno3_mng_typ()) || MAC_SNO_MNG_TYP.isMNG_NOT_STK(itmR.sno3_mng_typ())) {
					r.sno3(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(itmR.sno4_mng_typ()) || MAC_SNO_MNG_TYP.isMNG_NOT_STK(itmR.sno4_mng_typ())) {
					r.sno4(MAC_STR.NULL_VAL.value());
				}
			}
		}

		/**
		 * 処理対象品目マスタリスト取得
		 */
		protected MCList<MAM_ITM_R> getItmList() {
			MCList<MAM_ITM_R> bindL = MCList.create(MAM_ITM_R.class);

			for (Chk01_DtlR r : up0()) {
				if (!r.isStatusCreate() ||
					MAC_STR.isNULL_VAL(r.lot_no()) && 
					MAC_STR.isNULL_VAL(r.sublot_no()) &&
					MAC_STR.isNULL_VAL(r.sno1()) &&
					MAC_STR.isNULL_VAL(r.sno2()) &&
					MAC_STR.isNULL_VAL(r.sno3()) &&
					MAC_STR.isNULL_VAL(r.sno4())) {
					continue;
				}

				MAM_ITM_R bindRow = MAM_ITM_R.create();
				bindRow.itm_cd(r.itm_cd());
				bindRow.itm_sub1(r.itm_sub1());
				bindRow.itm_sub2(r.itm_sub2());
				bindRow.itm_sub3(r.itm_sub3());
				bindL.add(bindRow);
			}
			if (isNull(bindL)) {
				return bindL;
			}

			MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
			itmL_bldr.setSelect(t.itm_cd);
			itmL_bldr.addSelect(t.itm_sub1);
			itmL_bldr.addSelect(t.itm_sub2);
			itmL_bldr.addSelect(t.itm_sub3);
			itmL_bldr.addSelect(t.lot_mng_typ);
			itmL_bldr.addSelect(t.sublot_mng_typ);
			itmL_bldr.addSelect(t.sno1_mng_typ);
			itmL_bldr.addSelect(t.sno2_mng_typ);
			itmL_bldr.addSelect(t.sno3_mng_typ);
			itmL_bldr.addSelect(t.sno4_mng_typ);
			dbSelectKey("MSBEL2620_MAM_ITM_S01", itmL, itmL_bldr, bindL.distinctNE(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3));

			return itmL;
		}
		@Override
		protected void doIt() {
			super.doIt();
			
			// 実棚更新サービスのチェック処理
			callStktkAct_Chk01();

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// ・ロック
			// ・更新カウンタチェック

			// 棚卸制御管理
			msgL.addAll(chkStktk());
			setErrFlg(msgL);

			// 実棚情報
			msgL.addAll(chkStktkAct());
			setErrFlg(msgL);

			return msgL;
		}
		
		/**
		 * 棚卸制御管理のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkStktk() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			
			return chkStktkCmn(notErrL, up1().file_imp_flg());
		}

		/**
		 * 実棚情報のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkStktkAct() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			return chkStktkActCmn(notErrL, up1().file_imp_flg());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			for (Chk01_DtlR r : notErrL) {
				// DACチェック
				msgL.addAll(checkWritableLocCdDac(r, Chk01_DtlR.$loc_cd));
			}
			return msgL;
		}

		/**
		 * 実棚更新サービスのチェック処理を実行する
		 */
		protected void callStktkAct_Chk01() {
			addAll(so02_up0, up0(), createMap_StktkAct_Chk01_DtlR_Chk01_DtlR());
			so02.exec();

			copyErrFlg(up0(), so02_down0);
			
			String[] Cols = new String[] {
					Chk01_DtlR.$loc_nm,
					Chk01_DtlR.$stktk_amt_flg,
					Chk01_DtlR.$stktk_tor_disp_flg,
					Chk01_DtlR.$site_cd,
					Chk01_DtlR.$site_nm,
					Chk01_DtlR.$wg_cd,
					Chk01_DtlR.$wg_nm,
					Chk01_DtlR.$lg_grp_cd,
					Chk01_DtlR.$lg_grp_nm,
					Chk01_DtlR.$loc_grp_cd,
					Chk01_DtlR.$loc_grp_nm,
					Chk01_DtlR.$alloc_grp_cd,
					Chk01_DtlR.$alloc_grp_nm,
					Chk01_DtlR.$sppl_cd,
					Chk01_DtlR.$str_ln_tgt_flg,
					Chk01_DtlR.$str_ln_nm,
					Chk01_DtlR.$str_ln_cd_none_flg,
					Chk01_DtlR.$stk_arrv_bp_nm,
					Chk01_DtlR.$cnsgn_stktk_flg,
					Chk01_DtlR.$itm_nm,
					Chk01_DtlR.$sundry_itm_flg,
					Chk01_DtlR.$lot_mng_typ,
					Chk01_DtlR.$sublot_mng_typ,
					Chk01_DtlR.$sno1_mng_typ,
					Chk01_DtlR.$sno2_mng_typ,
					Chk01_DtlR.$sno3_mng_typ,
					Chk01_DtlR.$sno4_mng_typ,
					Chk01_DtlR.$lot_no_typ,
					Chk01_DtlR.$sublot_no_typ,
					Chk01_DtlR.$lot_no,
					Chk01_DtlR.$sublot_no,
					Chk01_DtlR.$ver_no,
					Chk01_DtlR.$sno1,
					Chk01_DtlR.$sno2,
					Chk01_DtlR.$sno3,
					Chk01_DtlR.$sno4,
					Chk01_DtlR.$gd_cd,
					Chk01_DtlR.$gd_nm,
					Chk01_DtlR.$in_xfr_typ_nm,
					Chk01_DtlR.$quality_typ_nm,
					Chk01_DtlR.$stk_insp_typ_nm,
					Chk01_DtlR.$stk_id_typ_nm,
					Chk01_DtlR.$stk_bp_nm,
					Chk01_DtlR.$trd_unit_nm,
					Chk01_DtlR.$trd_unit_dec_place,
					Chk01_DtlR.$trd_unit_rnd_typ,
					Chk01_DtlR.$trd_unit_base_qty,
					Chk01_DtlR.$trd_unit_conv_qty,
//					Chk01_DtlR.$tor_qty,
					Chk01_DtlR.$base_unit_cd,
					Chk01_DtlR.$base_unit_nm,
					Chk01_DtlR.$base_unit_dec_place,
					Chk01_DtlR.$base_unit_rnd_typ,
					Chk01_DtlR.$base_unit_qty,
					Chk01_DtlR.$std_upri,
					Chk01_DtlR.$std_cost,
					Chk01_DtlR.$act_diff_cost,
					Chk01_DtlR.$stktk_itm_spc_flg,
					Chk01_DtlR.$stktk_sts_typ,
					Chk01_DtlR.$stktk_sts_typ_nm,
					Chk01_DtlR.$stktkact_upd_cntr,
					Chk01_DtlR.$stktk_upd_cntr,
					Chk01_DtlR.$rtn_sts_typ
					,Chk01_DtlR.$not_new_lot_flg
					,Chk01_DtlR.$itm_typ
					,Chk01_DtlR.$itm_typ_nm
					,Chk01_DtlR.$itm_typ_d_cd
					,Chk01_DtlR.$itm_typ_d_nm
			};

			copyByPegNo(up0(), Cols, so02_down0, Cols);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 取消前に事前チェックを行います。<br>
	 */
	public class Chk02 extends MSBEL_StktkActReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			
			// 実棚更新サービスのチェック処理
			callStktkAct_Chk02();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// ・ロック
			// ・更新カウンタチェック

			// 棚卸制御管理
			msgL.addAll(chkStktk());
			setErrFlg(msgL);
			
			// 実棚情報
			msgL.addAll(chkStktkAct());
			setErrFlg(msgL);

			return msgL;
		}
		
		/**
		 * 棚卸制御管理のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkStktk() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			
			return chkStktkCmn(notErrL, false);
		}

		/**
		 * 実棚情報のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkStktkAct() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			return chkStktkActCmn(notErrL, false);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			// DACチェック
			for (Chk01_DtlR r : notErrL) {
				msgL.addAll(checkWritableLocCdDac(r, Chk01_DtlR.$loc_cd));
			}
			return msgL;
		}

		/**
		 * 実棚更新サービスのチェック処理を実行する
		 */
		protected void callStktkAct_Chk02() {
			addAll(so03_up0, up0(), createMap_StktkAct_Chk01_DtlR_Chk01_DtlR());
			so03.exec();

			copyErrFlg(up0(), so03_down0);
			setDown();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * 棚卸制御管理のロック、更新カウンタチェック、値の補完（Chk01、Chk02共通）
	 */
	protected MCMessageList chkStktkCmn(MCList<Chk01_DtlR> notErrL, boolean file_imp_flg) {
		MCMessageList msgL = new MCMessageList();

		if (notErrL.isEmpty()) {
			return msgL;
		}
		
		// ロック
		final String[] stktk_key = new String[]{
				MST_STKTK_R.$loc_cd,
				MST_STKTK_R.$ctrl_tgt_dt,
				MST_STKTK_R.$itm_cd,
				MST_STKTK_R.$itm_sub1,
				MST_STKTK_R.$itm_sub2,
				MST_STKTK_R.$itm_sub3
				};

		MCList<MST_STKTK_R> stktkL = MCList.create(MST_STKTK_R.class);
		MCList<MST_STKTK_R> bindL = MCList.create(MST_STKTK_R.class);

		// 品目指定なしのバインド
		MCList<Chk01_DtlR> bind1L = notErrL.groupBy(Chk01_DtlR.$stktk_base_dt, Chk01_DtlR.$loc_cd);
		bind1L.setStringNE(Chk01_DtlR.$itm_cd, MAC_STR.NULL_VAL.value());
		bind1L.setStringNE(Chk01_DtlR.$itm_sub1, MAC_STR.NULL_VAL.value());
		bind1L.setStringNE(Chk01_DtlR.$itm_sub2, MAC_STR.NULL_VAL.value());
		bind1L.setStringNE(Chk01_DtlR.$itm_sub3, MAC_STR.NULL_VAL.value());

		// 品目指定ありのバインド
		MCList<Chk01_DtlR> bind2L = notErrL.groupBy(Chk01_DtlR.$stktk_base_dt, Chk01_DtlR.$loc_cd,
				Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub3);

		addAll(bindL, bind1L, createMap_MST_STKTK_R_Chk01_DtlR());	// どっちかが当たる
		addAll(bindL, bind2L, createMap_MST_STKTK_R_Chk01_DtlR());	// どっちかが当たる
		bindL.sort(stktk_key);

		MCQueryApiBuilder stktkL_bldr = MCQueryApiBuilder.create(MST_STKTK_R.create("T"));
		if (file_imp_flg) {
			dbSelectColumn("MSBEL2620_MST_STKTK_S01", stktkL, stktkL_bldr, bindL, stktk_key);
		}
		else {
			dbSelectColumnForUpdateNoWait("MSBEL2620_MST_STKTK_S02", stktkL, stktkL_bldr, bindL, stktk_key);
		}

		// 対応するレコードを取得
		MCIndexKey idxkey = stktkL.createIndex(
				MST_STKTK_R.$loc_cd,
				MST_STKTK_R.$ctrl_tgt_dt,
				MST_STKTK_R.$itm_cd,
				MST_STKTK_R.$itm_sub1,
				MST_STKTK_R.$itm_sub2,
				MST_STKTK_R.$itm_sub3,
				MST_STKTK_R.$stktk_sts_typ);
		
		for (Chk01_DtlR r : notErrL) {
			// 品目指定なし
			MST_STKTK_R selectR = stktkL.getFirst(idxkey, r.loc_cd(), r.stktk_base_dt(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MSC_STKTK_STS_TYP.STKTK_ST.value());
			r.stktk_itm_spc_flg(false);
			if (isNull(selectR)) {
				// 品目指定あり
				selectR = stktkL.getFirst(idxkey, r.loc_cd(), r.stktk_base_dt(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), MSC_STKTK_STS_TYP.STKTK_ST.value());
				r.stktk_itm_spc_flg(true);
			}
			// 更新カウンタチェック
			if (!file_imp_flg) {
				
				// DBに存在しない場合はカウンタチェックをしない（妥当かどうかはサービスでチェックされる）
				if (!isNull(selectR)) {
					msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$stktk_upd_cntr, selectR));
				}
			
			}
			
			// 棚卸状況区分、更新カウンタをセットしておく
			if (!isNull(selectR)) {
				r.stktk_sts_typ(selectR.stktk_sts_typ());
				if (file_imp_flg) {
					r.stktk_upd_cntr(selectR.upd_cntr());
				}
			}
		}

		return msgL;
	}

	/**
	 * 実棚情報のロック、更新カウンタチェック、値の補完（Chk01、Chk02共通）
	 */
	protected MCMessageList chkStktkActCmn(MCList<Chk01_DtlR> notErrL, boolean file_imp_flg) {
		MCMessageList msgL = new MCMessageList();

		if (notErrL.isEmpty()) {
			return msgL;
		}

		// ロック
		final String[] stktkact_key = new String[]{
				MST_STKTK_ACT_R.$itm_cd,
				MST_STKTK_ACT_R.$itm_sub1,
				MST_STKTK_ACT_R.$itm_sub2,
				MST_STKTK_ACT_R.$itm_sub3,
				MST_STKTK_ACT_R.$loc_cd,
				MST_STKTK_ACT_R.$str_ln_cd,
				MST_STKTK_ACT_R.$stk_arrv_bp_cd,
				MST_STKTK_ACT_R.$lot_no,
				MST_STKTK_ACT_R.$sublot_no,
				MST_STKTK_ACT_R.$sno1,
				MST_STKTK_ACT_R.$sno2,
				MST_STKTK_ACT_R.$sno3,
				MST_STKTK_ACT_R.$sno4,
				MST_STKTK_ACT_R.$fix_no_flg,
				MST_STKTK_ACT_R.$trd_unit_cd,
				MST_STKTK_ACT_R.$gd_cd,
				MST_STKTK_ACT_R.$in_xfr_typ,
				MST_STKTK_ACT_R.$quality_typ,
				MST_STKTK_ACT_R.$stk_insp_typ,
				MST_STKTK_ACT_R.$stk_id_typ,
				MST_STKTK_ACT_R.$stk_bp_cd,
				MST_STKTK_ACT_R.$stktk_base_dt
				};

		MCList<MST_STKTK_ACT_R> stktkActL = MCList.create(MST_STKTK_ACT_R.class);

		notErrL.sort(stktkact_key);
		notErrL.addBooleanColumn(MST_STKTK_ACT_R.$keep_data_flg, false);	// dbSelectKeyを使用するため

		String defGdCd = getSysParm("DEF_STK_GD_CD");
		if (!isNull(defGdCd)) {
			notErrL.setString("gd_cd", defGdCd);
		}

		MCQueryApiBuilder stktkActL_bldr = MCQueryApiBuilder.create(MST_STKTK_ACT_R.create("T"));
		if (file_imp_flg) {
			dbSelectKey("MSBEL2620_MST_STKTK_ACT_S01", stktkActL, stktkActL_bldr, notErrL);
		}
		else {
			dbSelectKeyForUpdateNoWait("MSBEL2620_MST_STKTK_ACT_S02", stktkActL, stktkActL_bldr, notErrL);
		}

		// 対応するレコードを取得
		MCIndexKey idxkey = stktkActL.createIndex(stktkact_key);
		for (Chk01_DtlR r : notErrL) {
			MST_STKTK_ACT_R selectR = stktkActL.getFirst(idxkey, getVals(r, stktkact_key));

			// ファイル入力の場合
			if (file_imp_flg) {
				// 対応するレコードが見つかった
				if (!isNull(selectR)) {
					// 理論在庫数、更新カウンタをセットしておく
					r.tor_qty(selectR.tor_qty());
					r.stktkact_upd_cntr(selectR.upd_cntr());
					// ステータスセット
					r.setStatus(MCRow.MODIFY);
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else {
					// レコードがない場合は理論在庫数をnullにする
					r.tor_qty(null);
					// ステータスセット
					r.setStatus(MCRow.CREATE);
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				
				// 数量計算
				calcQty(r);
			}
			// ファイル入力でない場合
			else {
				// 画面で追加した行だがレコードが存在する
				if (!isNull(selectR) && r.isStatusCreate()) {
					msgL.add(new MCMessage(r, null, MSBEL0102, toDispGUIIndex(r)));
				}
				// 更新行は更新カウンタチェック
				if (!r.isStatusCreate()) {
					msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$stktkact_upd_cntr, selectR));
				}
			}
		}

		return msgL;
	}

	/**
	 * 数量計算
	 */
	protected void calcQty(Chk01_DtlR r) {
		MCNumber tor_qty = nvl(r.tor_qty(), MCNumber.ZERO);

		if (r.use_diff_flg()) {
			// 差異数量活かし
			if (isNull(r.act_diff_qty())) {
				r.trd_unit_qty(null);
			}
			else {
				r.trd_unit_qty(r.act_diff_qty().add(tor_qty));
			}
		}
		else {
			// 実棚数量活かし
			if (isNull(r.trd_unit_qty())) {
				r.act_diff_qty(null);
			}
			else {
				r.act_diff_qty(r.trd_unit_qty().subtract(tor_qty));
			}
		}
		r.act_input_flg(!isNull(r.trd_unit_qty()));
		r.base_cur_cd(getCo().base_cur_cd());
		r.upri_dec_place(getBaseCur().upri_dec_place());
		r.amt_dec_place(getCo().stk_amt_dec_place());
	}

	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ実棚情報をチェックします。<br>
	 */
	public class Imp01 extends MSBEL_StktkActReg_MC_A.Imp01 {
		protected static final String _diff = "1";
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			
			callThisChk01();

			afterProc();

			setDown();
		}
		
		protected void editUp() {
			setPegNo(Chk01_DtlR.$peg_no, up0());
			up0().setBooleanNE(Chk01_DtlR.$use_diff_flg, isSame(up1().input_mtd(), _diff));
			for (Chk01_DtlR r : up0()) {
				if (isNull(r.in_xfr_typ())) {
					r.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				}
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBEL_StktkActReg.Chk01 ope = MSBEL_StktkActReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(true);
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		/**
		 * 補完、ステータス設定などの後処理
		 */
		protected void afterProc() {
			
			MCList<Chk01_DtlR> updL = up0().subList("stktk_amt_flg", true);
			updL.addStringColumn("stk_std_upri_typ", getCo().stk_std_upri_typ());
			getStdCostL(Chk01_DtlR.$std_upri, updL, Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub3, Chk01_DtlR.$stktk_base_dt, Chk01_DtlR.$wg_cd, "stk_std_upri_typ");
			
			for (Chk01_DtlR r : up0()) {
				// 実棚基準単位数量を求める
				r.base_unit_qty(convToBaseUnit(r.trd_unit_qty(), r.trd_unit_base_qty(), r.trd_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ()));
	
				// 棚卸金額出力がオンの場合、標準単価、標準原価、棚差金額を表示する
				if (r.stktk_amt_flg()) {
					r.std_cost(getAmt(r.std_upri(), r.base_unit_qty(), getCo().stk_amt_dec_place(), getCo().stk_amt_rnd_typ()));
					r.act_diff_cost(getAmt(r.std_upri(), convToBaseUnit(r.act_diff_qty(), r.trd_unit_base_qty(), r.trd_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ()), getCo().stk_amt_dec_place(), getCo().stk_amt_rnd_typ()));
					r.base_cur_cd(getCo().base_cur_cd());
					r.upri_dec_place(getBaseCur().upri_dec_place());
					r.amt_dec_place(getCo().stk_amt_dec_place());
				}
			}
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));
				up0L.setAll(l);
				Imp01_CtrlR up1R = (Imp01_CtrlR)ope.up(1);
				up1R.setValuesByName(up1());
				opeL.add(ope);
			}
			return opeL;
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 入力された実棚数量を元に、実棚情報を更新します。<br>
	 */
	public class Upd01 extends MSBEL_StktkActReg_MC_A.Upd01 {
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
			
			callThisChk01();
			MCList<Chk01_DtlR> notErrL = up0().subList(Chk01_DtlR.$err_flg, false);
			if (notErrL.size() != 0) { 
				// オペレーション実行
				callStktkAct_Upd01(notErrL);
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_DtlR.$peg_no, up0());

			for (Chk01_DtlR r : up0()) {
				if (r.isStatusCreate()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBEL_StktkActReg.Chk01 ope = MSBEL_StktkActReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 実棚更新サービスの更新処理を実行する
		 */
		protected void callStktkAct_Upd01(MCList<Chk01_DtlR> notErrL) {
			addAll(so04_up0, notErrL, createMap_StktkAct_Chk01_DtlR_Chk01_DtlR());
			so04.exec();
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
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 選択した実棚情報を取り消します。<br>
	 */
	public class Del01 extends MSBEL_StktkActReg_MC_A.Del01 {
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
			MCList<Chk01_DtlR> notErrL = up0().subList(Chk01_DtlR.$err_flg, false);
			if (notErrL.size() != 0) { 
				// オペレーション実行
				callStktkAct_Del01(notErrL);
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_DtlR.$peg_no, up0());

			for (Chk01_DtlR r : up0()) {
				r.setStatus(MCRow.Status.DELETE);
				r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBEL_StktkActReg.Chk02 ope = MSBEL_StktkActReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 実棚更新サービスの取消処理を実行する
		 */
		protected void callStktkAct_Del01(MCList<Chk01_DtlR> notErrL) {
			addAll(so05_up0, notErrL, createMap_StktkAct_Chk01_DtlR_Chk01_DtlR());
			so05.exec();
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
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
	}

    /**
     * 場所が同一の上り電文行が、同じMCListに格納されるように分割する
     * @param list クライアントから渡された上り電文
     * @param max １スレッドあたりの最大件数
     * @return
     */
	protected List<MCList<Chk01_DtlR>> splitUp(MCList<Chk01_DtlR> list, int max) {
        List<MCList<Chk01_DtlR>> ret = new ArrayList<>();
        // groupList
        MCList<Chk01_DtlR>[] grpL = list.groupList(Chk01_DtlR.$loc_cd);
        MCList<Chk01_DtlR> tmp = MCList.create(Chk01_DtlR.class);
        for (MCList<Chk01_DtlR> grp : grpL) {
            if (tmp.size() >= max) {
                ret.add(tmp);
                tmp = MCList.create(Chk01_DtlR.class);
            }
            tmp.addAll(grp);
        }
        if (!tmp.isEmpty()) {
            ret.add(tmp);
        }
        return ret;
    }
	
	protected void handleSuccess(MCList<Chk01_DtlR> l) {
		dbTran().commit();
		for (Chk01_DtlR r : l) {
			if (!r.err_flg()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}
	}

	protected void handleEx(Exception e,
			MCList<Chk01_DtlR> l) {
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
		for (Chk01_DtlR r : l) {
			r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
		}
	}

	/**
	 * ロウの値を配列に変換する
	 * <p>
	 */
	@SuppressWarnings("rawtypes")
	protected Comparable[] getVals(MCRow row, String[] keys) {
		Comparable[] vals = new Comparable[keys.length];
		int i = 0;
		for (String col : keys) {
			vals[i] = row.getValueNE(col);
			i++;
		}
		return vals;
	}

	protected Map_MST_STKTK_R_Chk01_DtlR<MST_STKTK_R,Chk01_DtlR> createMap_MST_STKTK_R_Chk01_DtlR() {
		return new Map_MST_STKTK_R_Chk01_DtlR<MST_STKTK_R, Chk01_DtlR>();
	}

	public class Map_MST_STKTK_R_Chk01_DtlR<D extends MST_STKTK_R, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_STKTK_R.$loc_cd, Chk01_DtlR.$loc_cd);
			addColumnPathMap(MST_STKTK_R.$ctrl_tgt_dt, Chk01_DtlR.$stktk_base_dt);
			addColumnPathMap(MST_STKTK_R.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(MST_STKTK_R.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(MST_STKTK_R.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(MST_STKTK_R.$itm_sub3, Chk01_DtlR.$itm_sub3);

		}
	}

	protected Map_StktkAct_Chk01_DtlR_Chk01_DtlR<StktkAct_Chk01_DtlR,Chk01_DtlR> createMap_StktkAct_Chk01_DtlR_Chk01_DtlR() {
		return new Map_StktkAct_Chk01_DtlR_Chk01_DtlR<StktkAct_Chk01_DtlR, Chk01_DtlR>();
	}

	public class Map_StktkAct_Chk01_DtlR_Chk01_DtlR<D extends StktkAct_Chk01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StktkAct_Chk01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(StktkAct_Chk01_DtlR.$err_flg, Chk01_DtlR.$err_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(StktkAct_Chk01_DtlR.$act_input_flg, Chk01_DtlR.$act_input_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stktk_base_dt, Chk01_DtlR.$stktk_base_dt);
			addColumnPathMap(StktkAct_Chk01_DtlR.$loc_cd, Chk01_DtlR.$loc_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$loc_nm, Chk01_DtlR.$loc_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stktk_amt_flg, Chk01_DtlR.$stktk_amt_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stktk_tor_disp_flg, Chk01_DtlR.$stktk_tor_disp_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$site_cd, Chk01_DtlR.$site_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$site_nm, Chk01_DtlR.$site_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$wg_cd, Chk01_DtlR.$wg_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$wg_nm, Chk01_DtlR.$wg_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$lg_grp_cd, Chk01_DtlR.$lg_grp_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$lg_grp_nm, Chk01_DtlR.$lg_grp_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$loc_grp_cd, Chk01_DtlR.$loc_grp_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$loc_grp_nm, Chk01_DtlR.$loc_grp_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$alloc_grp_cd, Chk01_DtlR.$alloc_grp_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$alloc_grp_nm, Chk01_DtlR.$alloc_grp_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$str_ln_tgt_flg, Chk01_DtlR.$str_ln_tgt_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$str_ln_cd, Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$str_ln_nm, Chk01_DtlR.$str_ln_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$str_ln_cd_none_flg, Chk01_DtlR.$str_ln_cd_none_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stk_arrv_bp_cd, Chk01_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stk_arrv_bp_nm, Chk01_DtlR.$stk_arrv_bp_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(StktkAct_Chk01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(StktkAct_Chk01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(StktkAct_Chk01_DtlR.$itm_nm, Chk01_DtlR.$itm_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$sundry_itm_flg, Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$lot_make_flg, Chk01_DtlR.$lot_make_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$lot_no, Chk01_DtlR.$lot_no);
			addColumnPathMap(StktkAct_Chk01_DtlR.$sublot_no, Chk01_DtlR.$sublot_no);
			addColumnPathMap(StktkAct_Chk01_DtlR.$ver_no, Chk01_DtlR.$ver_no);
			addColumnPathMap(StktkAct_Chk01_DtlR.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(StktkAct_Chk01_DtlR.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(StktkAct_Chk01_DtlR.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(StktkAct_Chk01_DtlR.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(StktkAct_Chk01_DtlR.$fix_no_flg, Chk01_DtlR.$fix_no_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$gd_cd, Chk01_DtlR.$gd_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$gd_nm, Chk01_DtlR.$gd_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$in_xfr_typ, Chk01_DtlR.$in_xfr_typ);
			addColumnPathMap(StktkAct_Chk01_DtlR.$in_xfr_typ_nm, Chk01_DtlR.$in_xfr_typ_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$quality_typ, Chk01_DtlR.$quality_typ);
			addColumnPathMap(StktkAct_Chk01_DtlR.$quality_typ_nm, Chk01_DtlR.$quality_typ_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stk_insp_typ, Chk01_DtlR.$stk_insp_typ);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stk_insp_typ_nm, Chk01_DtlR.$stk_insp_typ_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stk_id_typ, Chk01_DtlR.$stk_id_typ);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stk_id_typ_nm, Chk01_DtlR.$stk_id_typ_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stk_bp_cd, Chk01_DtlR.$stk_bp_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stk_bp_nm, Chk01_DtlR.$stk_bp_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$trd_unit_nm, Chk01_DtlR.$trd_unit_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$trd_unit_dec_place, Chk01_DtlR.$trd_unit_dec_place);
			addColumnPathMap(StktkAct_Chk01_DtlR.$trd_unit_rnd_typ, Chk01_DtlR.$trd_unit_rnd_typ);
			addColumnPathMap(StktkAct_Chk01_DtlR.$trd_unit_base_qty, Chk01_DtlR.$trd_unit_base_qty);
			addColumnPathMap(StktkAct_Chk01_DtlR.$trd_unit_conv_qty, Chk01_DtlR.$trd_unit_conv_qty);
			addColumnPathMap(StktkAct_Chk01_DtlR.$tor_qty, Chk01_DtlR.$tor_qty);
			addColumnPathMap(StktkAct_Chk01_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(StktkAct_Chk01_DtlR.$act_diff_qty, Chk01_DtlR.$act_diff_qty);
			addColumnPathMap(StktkAct_Chk01_DtlR.$use_diff_flg, Chk01_DtlR.$use_diff_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$base_unit_nm, Chk01_DtlR.$base_unit_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$base_unit_dec_place, Chk01_DtlR.$base_unit_dec_place);
			addColumnPathMap(StktkAct_Chk01_DtlR.$base_unit_rnd_typ, Chk01_DtlR.$base_unit_rnd_typ);
			addColumnPathMap(StktkAct_Chk01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(StktkAct_Chk01_DtlR.$std_upri, Chk01_DtlR.$std_upri);
			addColumnPathMap(StktkAct_Chk01_DtlR.$std_cost, Chk01_DtlR.$std_cost);
			addColumnPathMap(StktkAct_Chk01_DtlR.$act_diff_cost, Chk01_DtlR.$act_diff_cost);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stktk_act_rmrks, Chk01_DtlR.$stktk_act_rmrks);
			addColumnPathMap(StktkAct_Chk01_DtlR.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(StktkAct_Chk01_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(StktkAct_Chk01_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(StktkAct_Chk01_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stktk_itm_spc_flg, Chk01_DtlR.$stktk_itm_spc_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stktk_sts_typ, Chk01_DtlR.$stktk_sts_typ);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stktk_sts_typ_nm, Chk01_DtlR.$stktk_sts_typ_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$ins_usr_id, Chk01_DtlR.$ins_usr_id);
			addColumnPathMap(StktkAct_Chk01_DtlR.$ins_usr_nm, Chk01_DtlR.$ins_usr_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$ins_func_id, Chk01_DtlR.$ins_func_id);
			addColumnPathMap(StktkAct_Chk01_DtlR.$ins_func_nm, Chk01_DtlR.$ins_func_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$ins_ts, Chk01_DtlR.$ins_ts);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stktkact_upd_cntr, Chk01_DtlR.$stktkact_upd_cntr);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stktk_upd_cntr, Chk01_DtlR.$stktk_upd_cntr);
			addColumnPathMap(StktkAct_Chk01_DtlR.$upd_usr_id, Chk01_DtlR.$upd_usr_id);
			addColumnPathMap(StktkAct_Chk01_DtlR.$upd_usr_nm, Chk01_DtlR.$upd_usr_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$upd_func_id, Chk01_DtlR.$upd_func_id);
			addColumnPathMap(StktkAct_Chk01_DtlR.$upd_func_nm, Chk01_DtlR.$upd_func_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$upd_ts, Chk01_DtlR.$upd_ts);
			addColumnPathMap(StktkAct_Chk01_DtlR.$upd_srv_req_no, Chk01_DtlR.$upd_srv_req_no);
			addColumnPathMap(StktkAct_Chk01_DtlR.$rtn_sts_typ, Chk01_DtlR.$rtn_sts_typ);

		}
	}

	//FMCB CUSTOM END
}