package mcframe.serverMSBE.MSBEL6620;

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
import mcframe.serverMSBE.MSBEL6620.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL6600.*;
import mcframe.commonCore.param.*;
import java.util.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_StktkActRcptIFService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_StktkActRcptIFService_MC extends MSBEL_StktkActRcptIFService_MC_A{
	//FMCB CUSTOM START

	/**
	 * StktkActRcptIF_Chk01オペレーション.<p>
	 *
	 */
	public class StktkActRcptIF_Chk01 extends MSBEL_StktkActRcptIFService_MC_A.StktkActRcptIF_Chk01 {
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

			for (StktkActRcptIF_Chk01_DtlR r : up1()) {
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

			for (StktkActRcptIF_Chk01_DtlR r : up1()) {
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
			dbSelectKey("MSBEL6620_MAM_ITM_S01", itmL, itmL_bldr, bindL.distinctNE(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3));

			return itmL;
		}
		@Override
		protected void doIt() {
			super.doIt();
			//この時点でエラーがある場合は、以降の処理を中断する
			if(!up0().err_flg()) {
				callStktkAct_Chk01();
				callStktkAct_Chk02();
			}
			
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			// ・ロック
			// ・更新カウンタチェック

			// 棚卸制御管理
			msgL.addAll(chkStktk());
			
			// 実棚情報
			msgL.addAll(chkStktkAct());

			return msgL;
		}
		
		/**
		 * 棚卸制御管理のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkStktk() {
			MCList<StktkActRcptIF_Chk01_DtlR> notErrL = getChkList(up1());
			
			//更新カウンタチェックフラグで処理を分けたいので引数で渡してあげる
			return chkStktkCmn(notErrL, up0().upd_cntr_chk_flg());
		}
		
		/**
		 * 実棚情報のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkStktkAct() {
			MCList<StktkActRcptIF_Chk01_DtlR> notErrL = getChkList(up1());

			//更新カウンタチェックフラグで処理を分けたいので引数で渡してあげる
			return chkStktkActCmn(notErrL, up0().upd_cntr_chk_flg());
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			
			MCList<StktkActRcptIF_Chk01_DtlR> notErrL = getChkList(up1());
			for(StktkActRcptIF_Chk01_DtlR r : notErrL) {
				//差異計算　理論在庫があれば取引単位数量と理論在庫の差
				r.act_diff_qty(isNull(r.trd_unit_qty()) ? r.trd_unit_qty() : r.trd_unit_qty().subtract(nvl(r.tor_qty(), MCNumber.ZERO)));
			}
			
			MCMessageList msgL = super.doServerCheckSub();

			for (StktkActRcptIF_Chk01_DtlR r : notErrL) {
				// DACチェック
				msgL.addAll(checkWritableLocCdDac(r, StktkActRcptIF_Chk01_DtlR.$loc_cd));
			}
			return msgL;
		}
		
		/*
		 * 実棚更新サービスの取り消し前チェックを実行する
		 */
		protected void callStktkAct_Chk02() {
			MCList<StktkActRcptIF_Chk01_DtlR> up = up1().subList(r -> MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			if (up.isEmpty()) {
				return;
			}
			addAll(so03_up0, up, createMap_StktkAct_Chk01_DtlR_StktkActRcptIF_Chk01_DtlR());
			so03.exec();
			
			copyErrFlg(up1(), so03_down0);
		}
		/*
		 * 実棚更新サービスの更新前チェック処理を実行する
		 */
		protected void callStktkAct_Chk01() {
			MCList<StktkActRcptIF_Chk01_DtlR> up = up1().subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			if (up.isEmpty()) {
				return;
			}
			addAll(so02_up0, up, createMap_StktkAct_Chk01_DtlR_StktkActRcptIF_Chk01_DtlR());
			so02.exec();
			
			copyErrFlg(up1(), so02_down0);
			
			
			String[] Cols = new String[] {
					StktkActRcptIF_Chk01_DtlR.$loc_nm,
					StktkActRcptIF_Chk01_DtlR.$stktk_amt_flg,
					StktkActRcptIF_Chk01_DtlR.$stktk_tor_disp_flg,
					StktkActRcptIF_Chk01_DtlR.$site_cd,
					StktkActRcptIF_Chk01_DtlR.$site_nm,
					StktkActRcptIF_Chk01_DtlR.$wg_cd,
					StktkActRcptIF_Chk01_DtlR.$wg_nm,
					StktkActRcptIF_Chk01_DtlR.$lg_grp_cd,
					StktkActRcptIF_Chk01_DtlR.$lg_grp_nm,
					StktkActRcptIF_Chk01_DtlR.$loc_grp_cd,
					StktkActRcptIF_Chk01_DtlR.$loc_grp_nm,
					StktkActRcptIF_Chk01_DtlR.$alloc_grp_cd,
					StktkActRcptIF_Chk01_DtlR.$alloc_grp_nm,
					StktkActRcptIF_Chk01_DtlR.$str_ln_tgt_flg,
					StktkActRcptIF_Chk01_DtlR.$str_ln_nm,
					StktkActRcptIF_Chk01_DtlR.$str_ln_cd_none_flg,
					StktkActRcptIF_Chk01_DtlR.$stk_arrv_bp_nm,
					StktkActRcptIF_Chk01_DtlR.$itm_nm,
					StktkActRcptIF_Chk01_DtlR.$sundry_itm_flg,
					StktkActRcptIF_Chk01_DtlR.$lot_no,
					StktkActRcptIF_Chk01_DtlR.$sublot_no,
					StktkActRcptIF_Chk01_DtlR.$ver_no,
					StktkActRcptIF_Chk01_DtlR.$sno1,
					StktkActRcptIF_Chk01_DtlR.$sno2,
					StktkActRcptIF_Chk01_DtlR.$sno3,
					StktkActRcptIF_Chk01_DtlR.$sno4,
					StktkActRcptIF_Chk01_DtlR.$gd_nm,
					StktkActRcptIF_Chk01_DtlR.$in_xfr_typ_nm,
					StktkActRcptIF_Chk01_DtlR.$quality_typ_nm,
					StktkActRcptIF_Chk01_DtlR.$stk_insp_typ_nm,
					StktkActRcptIF_Chk01_DtlR.$stk_id_typ_nm,
					StktkActRcptIF_Chk01_DtlR.$stk_bp_nm,
					StktkActRcptIF_Chk01_DtlR.$trd_unit_nm,
					StktkActRcptIF_Chk01_DtlR.$trd_unit_dec_place,
					StktkActRcptIF_Chk01_DtlR.$trd_unit_rnd_typ,
					StktkActRcptIF_Chk01_DtlR.$trd_unit_base_qty,
					StktkActRcptIF_Chk01_DtlR.$trd_unit_conv_qty,
//					StktkActRcptIF_Chk01_DtlR.$tor_qty,
					StktkActRcptIF_Chk01_DtlR.$base_unit_cd,
					StktkActRcptIF_Chk01_DtlR.$base_unit_nm,
					StktkActRcptIF_Chk01_DtlR.$base_unit_dec_place,
					StktkActRcptIF_Chk01_DtlR.$base_unit_rnd_typ,
					StktkActRcptIF_Chk01_DtlR.$base_unit_qty,
					StktkActRcptIF_Chk01_DtlR.$std_upri,
					StktkActRcptIF_Chk01_DtlR.$std_cost,
					StktkActRcptIF_Chk01_DtlR.$act_diff_cost,
					StktkActRcptIF_Chk01_DtlR.$stktk_itm_spc_flg,
					StktkActRcptIF_Chk01_DtlR.$stktk_sts_typ,
					StktkActRcptIF_Chk01_DtlR.$stktk_sts_typ_nm,
					StktkActRcptIF_Chk01_DtlR.$stktkact_upd_cntr,
					StktkActRcptIF_Chk01_DtlR.$stktk_upd_cntr,
					StktkActRcptIF_Chk01_DtlR.$rtn_sts_typ	
			};
			
			copyByPegNo(up1(), Cols, so02_down0, Cols);
		}
		/*
		 * 下り電文設定
		 */
		protected void setDown() {
			down1().setAll(up1());
		}
	}
	/**
	 * 棚卸制御管理のロック、更新カウンタチェック、値の補完（Chk01、Chk02共通）
	 */
	protected MCMessageList chkStktkCmn(MCList<StktkActRcptIF_Chk01_DtlR> notErrL, boolean upd_cntr_chk_flg) {
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
		MCList<StktkActRcptIF_Chk01_DtlR> bind1L = notErrL.groupBy(StktkActRcptIF_Chk01_DtlR.$stktk_base_dt, StktkActRcptIF_Chk01_DtlR.$loc_cd);
		bind1L.setStringNE(StktkActRcptIF_Chk01_DtlR.$itm_cd, MAC_STR.NULL_VAL.value());
		bind1L.setStringNE(StktkActRcptIF_Chk01_DtlR.$itm_sub1, MAC_STR.NULL_VAL.value());
		bind1L.setStringNE(StktkActRcptIF_Chk01_DtlR.$itm_sub2, MAC_STR.NULL_VAL.value());
		bind1L.setStringNE(StktkActRcptIF_Chk01_DtlR.$itm_sub3, MAC_STR.NULL_VAL.value());

		// 品目指定ありのバインド
		MCList<StktkActRcptIF_Chk01_DtlR> bind2L = notErrL.groupBy(StktkActRcptIF_Chk01_DtlR.$stktk_base_dt, StktkActRcptIF_Chk01_DtlR.$loc_cd,
				StktkActRcptIF_Chk01_DtlR.$itm_cd, StktkActRcptIF_Chk01_DtlR.$itm_sub1, StktkActRcptIF_Chk01_DtlR.$itm_sub2, StktkActRcptIF_Chk01_DtlR.$itm_sub3);

		addAll(bindL, bind1L, createMap_MST_STKTK_R_StktkActRcptIF_Chk01_DtlR());	// どっちかが当たる
		addAll(bindL, bind2L, createMap_MST_STKTK_R_StktkActRcptIF_Chk01_DtlR());	// どっちかが当たる
		bindL.sort(stktk_key);

		MCQueryApiBuilder stktkL_bldr = MCQueryApiBuilder.create(MST_STKTK_R.create("T"));
		if(upd_cntr_chk_flg) {
			
			//更新カウンタチェックフラグがオンの場合はNoWait -> 設計書参照
			dbSelectColumnForUpdateNoWait("MSBEL6620_MST_STKTK_S01", stktkL, stktkL_bldr, bindL, stktk_key);
			
		} else {

			//更新カウンタチェックフラグがオフの場合はWait -> 設計書参照
			dbSelectColumnForUpdate("MSBEL6620_MST_STKTK_S02", stktkL, stktkL_bldr, bindL, stktk_key);			

		}		
		
		// 対応するレコードを取得
		MCIndexKey idxkey = stktkL.createIndex(stktk_key);
		for (StktkActRcptIF_Chk01_DtlR r : notErrL) {
			// 品目指定なし
			MST_STKTK_R selectR = stktkL.getFirst(idxkey, r.loc_cd(), r.stktk_base_dt(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value());
			r.stktk_itm_spc_flg(false);
			if (isNull(selectR)) {
				// 品目指定あり
				selectR = stktkL.getFirst(idxkey, r.loc_cd(), r.stktk_base_dt(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				r.stktk_itm_spc_flg(true);
			}
			// 更新カウンタチェック
			//DB存在しない場合はカウンタチェックをしたくない(妥当かどうかはサービスでチェックされる)
			if(!isNull(selectR)) {
				msgL.addAll(checkUpdCntrNE(r, StktkActRcptIF_Chk01_DtlR.$stktk_upd_cntr, selectR));				
			}
			
			// 棚卸状況区分、更新カウンタをセットしておく
			if (!isNull(selectR)) {
				r.stktk_sts_typ(selectR.stktk_sts_typ());
				r.stktk_upd_cntr(selectR.upd_cntr());
			}	
		}
		return msgL;
	}
	
	/**
	 * 実棚情報のロック、更新カウンタチェック、値の補完（Chk01、Chk02共通）
	 * @return 
	 * @return 
	 */
	protected MCMessageList chkStktkActCmn(MCList<StktkActRcptIF_Chk01_DtlR> notErrL,
			boolean upd_cntr_chk_flg) {
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

		MCQueryApiBuilder stktkActL_bldr = MCQueryApiBuilder.create(MST_STKTK_ACT_R.create("T"));
		if(upd_cntr_chk_flg) {

			//更新カウンタチェックフラグがオンの時はNoWait -> 設計書参照
			dbSelectKeyForUpdateNoWait("MSBEL6620_MST_STKTK_ACT_S01", stktkActL, stktkActL_bldr, notErrL);
			
		} else {

			//更新カウンタチェックフラグがオフの時はWait	-> 設計書参照
			dbSelectKeyForUpdate("MSBEL6620_MST_STKTK_ACT_S02", stktkActL, stktkActL_bldr, notErrL);
			
		}

		// 対応するレコードを取得
		MCIndexKey idxkey = stktkActL.createIndex(stktkact_key);
		for (StktkActRcptIF_Chk01_DtlR r : notErrL) {
			MST_STKTK_ACT_R selectR = stktkActL.getFirst(idxkey, getVals(r, stktkact_key));

			// 画面で追加した行だがレコードが存在する
			if (!isNull(selectR) && r.isStatusCreate()) {
				msgL.add(new MCMessage(r, null, MSBEL0102, toDispGUIIndex(r)));
			}
			
			// 更新行は更新カウンタチェック
			if (!r.isStatusCreate()) {
				msgL.addAll(checkUpdCntrNE(r, StktkActRcptIF_Chk01_DtlR.$stktkact_upd_cntr, selectR));

				//理論在庫数の補完
				r.tor_qty(selectR.tor_qty());

			}

			if(!isNull(selectR) && r.isStatusModify()) {
				
				//flgによるデータ補完
//					r.intr_rmrks(compVal(r.intr_rmrks_upd_flg(), r.intr_rmrks(), selectR.intr_rmrks(), null));
//					r.stktk_act_rmrks(compVal(r.stktk_act_rmrks_upd_flg(), r.stktk_act_rmrks(), selectR.stktk_act_rmrks(), null));
//					r.sub_char1(compVal(r.sub_char1_upd_flg(), r.sub_char1(), selectR.sub_char1(), null));
//					r.sub_char2(compVal(r.sub_char2_upd_flg(), r.sub_char2(), selectR.sub_char2(), null));
//					r.sub_char3(compVal(r.sub_char3_upd_flg(), r.sub_char3(), selectR.sub_char3(), null));				
			}
		}
		return msgL;
	}
	/**
	 * 更新ＦＬＧに従い、上り電文の値、または、更新前の値を更新結果に決めます。
	 */
	private String compVal(boolean updFlg, String upVal, String dbVal, String defVal) {
		if (updFlg){
			return nvl(upVal, defVal);
		}
		return dbVal;
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
	/**
	 * StktkActRcptIF_Upd01オペレーション.<p>
	 *
	 * 外部システムから実棚実績の登録、更新、取消を行います。<br>
	 */
	public class StktkActRcptIF_Upd01 extends MSBEL_StktkActRcptIFService_MC_A.StktkActRcptIF_Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up1());
			} catch (Exception e) {
				handleEx(e, up1());
			} finally {
				setDown();
			}
		}
		/*
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up1());
		}
		
		@Override
		protected void doIt() {
			
			editUp();
			callThisCheck();
			callStktkAct();
			
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(StktkActRcptIF_Chk01_DtlR.$peg_no, up1());
			
			for (StktkActRcptIF_Chk01_DtlR r : up1()) {
				
				//行ステータスの設定
				setLineStatus(r);
				//固定値の設定
				setFixedValue(r);
				//値の補完
				setKeyNull(r);

			}
		}
		
		protected void setKeyNull(StktkActRcptIF_Chk01_DtlR r) {

			//良品区分がない場合
			if(isNull(r.quality_typ())) {
				r.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			}
			//検査区分がない場合
			if(isNull(r.stk_insp_typ())) {
				r.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			}
			//格付けは格付マスタからソート順が最も若い（昇順）ＣＤ
			if(isNull(r.gd_cd())) {
				r.gd_cd(getDefaultFeedStkGd().gd_cd());
			}
		}
		
		/**
		 * デフォルト格付ＣＤキャッシュ
		 */

		protected String _defGdCd = null;
		protected String getDefGdCd() {
			if (isNull(_defGdCd)) {
				MAM_STK_GD_R S1W = MAM_STK_GD_R.create("W");
				MAM_STK_GD_R dbc = MAM_STK_GD_R.create();
				MAM_STK_GD_R t = MAM_STK_GD_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setSelect(t.gd_cd);
				dbc_bldr.setWhere(t.sort_seq.eq(subQuery() .select(min(S1W.sort_seq)) .from(S1W)));
				dbSelect("MSBEL6620_MAM_STK_GD_S01", dbc, dbc_bldr);
				_defGdCd = dbc.gd_cd();
			}
			return _defGdCd;
		}
		protected void setFixedValue(StktkActRcptIF_Chk01_DtlR r) {
			//実棚入力FLG
			r.act_input_flg(true);
			//積送品区分
			r.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			//差異数量使用FLG
			r.use_diff_flg(false);
			
		}
		protected void setLineStatus(StktkActRcptIF_Chk01_DtlR r) {
			//データ更新区分に従って行ステータスを設定する
			if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {

				r.setStatus(MCRow.CREATE);
				
			} else if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				
				r.setStatus(MCRow.MODIFY);
				
			} else if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				
				r.setStatus(MCRow.DELETE);
				
			} else {
				
				r.setStatus(MCRow.NONE);
				
			}			
		}
		/**
		 * チェック処理の呼び出し
		 */
		protected void callThisCheck() {
			MSBEL_StktkActRcptIFService.StktkActRcptIF_Chk01 ope = MSBEL_StktkActRcptIFService.crtStktkActRcptIF_Chk01();
			ope.up1().setAll(up1());
			ope.exec();
			up1().setAll(ope.down1());
		}
		/**
		 * 実棚サービスを実行する前処理をする
		 */
		protected void callStktkAct() {
			//IF更新区分
			MCList<StktkActRcptIF_Chk01_DtlR> notErrL = getUpdTgtL();
			MCIndexKey actIdx = notErrL.createIndex(StktkActRcptIF_Chk01_DtlR.$peg_no);

			for(StktkActRcptIF_Chk01_DtlR r : up1()) {
				if(isNull(notErrL.getFirst(actIdx, r.peg_no()))) {
					r.rtn_sts_typ(r.err_flg() ? MAC_RTN_STS_TYP.ERR.value() : MAC_RTN_STS_TYP.NOT_EXE.value());
				}
			}
			
			//更新リストと取消リストの仕分け
			MCList<StktkActRcptIF_Chk01_DtlR> notErrUpdL = notErrL.subList(StktkActRcptIF_Chk01_DtlR.MODIFY, StktkActRcptIF_Chk01_DtlR.CREATE);
			MCList<StktkActRcptIF_Chk01_DtlR> notErrDelL = notErrL.subList(StktkActRcptIF_Chk01_DtlR.DELETE);

			// オペレーション実行
			if (notErrUpdL.size() != 0) { 
				callStktkAct_Upd01(notErrUpdL);				
				for(StktkActRcptIF_Chk01_DtlR r : notErrUpdL) {
					//実行が終われば処理区分OK
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
			if(notErrDelL.size() != 0) {
				callStktkAct_Del01(notErrDelL);
				for(StktkActRcptIF_Chk01_DtlR r : notErrDelL) {
					//実行が終われば処理区分OK
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}			
		}
		/**
		 * IF更新区分
		 */
		protected MCList<StktkActRcptIF_Chk01_DtlR> getUpdTgtL() {
			MCList<StktkActRcptIF_Chk01_DtlR> tgtL = MCList.create(StktkActRcptIF_Chk01_DtlR.class);

			// 1：すべて登録しない
			// 2：エラーを無視して登録
			// 3：エラー行まで登録
			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())
				&& !isNull(up1().getFirst(StktkActRcptIF_Chk01_DtlR.$err_flg, true))) {
				// エラーあり、かつ「1：すべて登録しない」の場合、空のリストを返す
				return tgtL;
			}
			for (StktkActRcptIF_Chk01_DtlR r : up1()) {
				if (!r.err_flg()) {
					tgtL.add(r);
				}
				else 	if (MAC_IF_UPD_TYP.isSTOP_ERROR(up0().if_upd_typ())) {
					// 「3：エラー行まで登録」の場合、ここまでで蓄積したリストを更新対象とする
					break;
				}
			}
			
			return tgtL;
		}
		/**
		 * 実棚更新サービスの更新処理を実行する
		 */
		protected void callStktkAct_Upd01(MCList<StktkActRcptIF_Chk01_DtlR> notErrL) {
			addAll(so04_up0, notErrL, createMap_StktkAct_Chk01_DtlR_StktkActRcptIF_Chk01_DtlR());
			so04.exec();
		}
		
		/**
		 * 実棚更新サービスの取消処理を実行する
		 */
		protected void callStktkAct_Del01(MCList<StktkActRcptIF_Chk01_DtlR> notErrL) {
			addAll(so05_up0, notErrL, createMap_StktkAct_Chk01_DtlR_StktkActRcptIF_Chk01_DtlR());
			so05.exec();
		}
	}
	/*
	 * 左辺: mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR
	 * 右辺: mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR
	 */
	protected Map_StktkAct_Chk01_DtlR_StktkActRcptIF_Chk01_DtlR<StktkAct_Chk01_DtlR,StktkActRcptIF_Chk01_DtlR> createMap_StktkAct_Chk01_DtlR_StktkActRcptIF_Chk01_DtlR() {
		return new Map_StktkAct_Chk01_DtlR_StktkActRcptIF_Chk01_DtlR<StktkAct_Chk01_DtlR, StktkActRcptIF_Chk01_DtlR>();
	}

	public class Map_StktkAct_Chk01_DtlR_StktkActRcptIF_Chk01_DtlR<D extends StktkAct_Chk01_DtlR, S extends StktkActRcptIF_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StktkAct_Chk01_DtlR.$peg_no, StktkActRcptIF_Chk01_DtlR.$peg_no);
			addColumnPathMap(StktkAct_Chk01_DtlR.$err_flg, StktkActRcptIF_Chk01_DtlR.$err_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$data_crud_typ, StktkActRcptIF_Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(StktkAct_Chk01_DtlR.$act_input_flg, StktkActRcptIF_Chk01_DtlR.$act_input_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stktk_base_dt, StktkActRcptIF_Chk01_DtlR.$stktk_base_dt);
			addColumnPathMap(StktkAct_Chk01_DtlR.$loc_cd, StktkActRcptIF_Chk01_DtlR.$loc_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$loc_nm, StktkActRcptIF_Chk01_DtlR.$loc_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stktk_amt_flg, StktkActRcptIF_Chk01_DtlR.$stktk_amt_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stktk_tor_disp_flg, StktkActRcptIF_Chk01_DtlR.$stktk_tor_disp_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$site_cd, StktkActRcptIF_Chk01_DtlR.$site_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$site_nm, StktkActRcptIF_Chk01_DtlR.$site_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$wg_cd, StktkActRcptIF_Chk01_DtlR.$wg_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$wg_nm, StktkActRcptIF_Chk01_DtlR.$wg_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$lg_grp_cd, StktkActRcptIF_Chk01_DtlR.$lg_grp_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$lg_grp_nm, StktkActRcptIF_Chk01_DtlR.$lg_grp_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$loc_grp_cd, StktkActRcptIF_Chk01_DtlR.$loc_grp_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$loc_grp_nm, StktkActRcptIF_Chk01_DtlR.$loc_grp_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$alloc_grp_cd, StktkActRcptIF_Chk01_DtlR.$alloc_grp_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$alloc_grp_nm, StktkActRcptIF_Chk01_DtlR.$alloc_grp_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$sppl_cd, StktkActRcptIF_Chk01_DtlR.$sppl_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$str_ln_tgt_flg, StktkActRcptIF_Chk01_DtlR.$str_ln_tgt_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$str_ln_cd, StktkActRcptIF_Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$str_ln_nm, StktkActRcptIF_Chk01_DtlR.$str_ln_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$str_ln_cd_none_flg, StktkActRcptIF_Chk01_DtlR.$str_ln_cd_none_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stk_arrv_bp_cd, StktkActRcptIF_Chk01_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stk_arrv_bp_nm, StktkActRcptIF_Chk01_DtlR.$stk_arrv_bp_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$cnsgn_stktk_flg, StktkActRcptIF_Chk01_DtlR.$cnsgn_stktk_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$itm_cd, StktkActRcptIF_Chk01_DtlR.$itm_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$itm_sub1, StktkActRcptIF_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(StktkAct_Chk01_DtlR.$itm_sub2, StktkActRcptIF_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(StktkAct_Chk01_DtlR.$itm_sub3, StktkActRcptIF_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(StktkAct_Chk01_DtlR.$itm_nm, StktkActRcptIF_Chk01_DtlR.$itm_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$sundry_itm_flg, StktkActRcptIF_Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$not_new_lot_flg, StktkActRcptIF_Chk01_DtlR.$not_new_lot_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$lot_make_flg, StktkActRcptIF_Chk01_DtlR.$lot_make_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$lot_no, StktkActRcptIF_Chk01_DtlR.$lot_no);
			addColumnPathMap(StktkAct_Chk01_DtlR.$sublot_no, StktkActRcptIF_Chk01_DtlR.$sublot_no);
			addColumnPathMap(StktkAct_Chk01_DtlR.$ver_no, StktkActRcptIF_Chk01_DtlR.$ver_no);
			addColumnPathMap(StktkAct_Chk01_DtlR.$sno1, StktkActRcptIF_Chk01_DtlR.$sno1);
			addColumnPathMap(StktkAct_Chk01_DtlR.$sno2, StktkActRcptIF_Chk01_DtlR.$sno2);
			addColumnPathMap(StktkAct_Chk01_DtlR.$sno3, StktkActRcptIF_Chk01_DtlR.$sno3);
			addColumnPathMap(StktkAct_Chk01_DtlR.$sno4, StktkActRcptIF_Chk01_DtlR.$sno4);
			addColumnPathMap(StktkAct_Chk01_DtlR.$fix_no_flg, StktkActRcptIF_Chk01_DtlR.$fix_no_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$gd_cd, StktkActRcptIF_Chk01_DtlR.$gd_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$gd_nm, StktkActRcptIF_Chk01_DtlR.$gd_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$in_xfr_typ, StktkActRcptIF_Chk01_DtlR.$in_xfr_typ);
			addColumnPathMap(StktkAct_Chk01_DtlR.$in_xfr_typ_nm, StktkActRcptIF_Chk01_DtlR.$in_xfr_typ_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$quality_typ, StktkActRcptIF_Chk01_DtlR.$quality_typ);
			addColumnPathMap(StktkAct_Chk01_DtlR.$quality_typ_nm, StktkActRcptIF_Chk01_DtlR.$quality_typ_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stk_insp_typ, StktkActRcptIF_Chk01_DtlR.$stk_insp_typ);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stk_insp_typ_nm, StktkActRcptIF_Chk01_DtlR.$stk_insp_typ_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stk_id_typ, StktkActRcptIF_Chk01_DtlR.$stk_id_typ);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stk_id_typ_nm, StktkActRcptIF_Chk01_DtlR.$stk_id_typ_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stk_bp_cd, StktkActRcptIF_Chk01_DtlR.$stk_bp_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stk_bp_nm, StktkActRcptIF_Chk01_DtlR.$stk_bp_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$trd_unit_cd, StktkActRcptIF_Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$trd_unit_nm, StktkActRcptIF_Chk01_DtlR.$trd_unit_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$trd_unit_dec_place, StktkActRcptIF_Chk01_DtlR.$trd_unit_dec_place);
			addColumnPathMap(StktkAct_Chk01_DtlR.$trd_unit_rnd_typ, StktkActRcptIF_Chk01_DtlR.$trd_unit_rnd_typ);
			addColumnPathMap(StktkAct_Chk01_DtlR.$trd_unit_base_qty, StktkActRcptIF_Chk01_DtlR.$trd_unit_base_qty);
			addColumnPathMap(StktkAct_Chk01_DtlR.$trd_unit_conv_qty, StktkActRcptIF_Chk01_DtlR.$trd_unit_conv_qty);
			addColumnPathMap(StktkAct_Chk01_DtlR.$tor_qty, StktkActRcptIF_Chk01_DtlR.$tor_qty);
			addColumnPathMap(StktkAct_Chk01_DtlR.$trd_unit_qty, StktkActRcptIF_Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(StktkAct_Chk01_DtlR.$act_diff_qty, StktkActRcptIF_Chk01_DtlR.$act_diff_qty);
			addColumnPathMap(StktkAct_Chk01_DtlR.$use_diff_flg, StktkActRcptIF_Chk01_DtlR.$use_diff_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$base_unit_cd, StktkActRcptIF_Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$base_unit_nm, StktkActRcptIF_Chk01_DtlR.$base_unit_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$base_unit_dec_place, StktkActRcptIF_Chk01_DtlR.$base_unit_dec_place);
			addColumnPathMap(StktkAct_Chk01_DtlR.$base_unit_rnd_typ, StktkActRcptIF_Chk01_DtlR.$base_unit_rnd_typ);
			addColumnPathMap(StktkAct_Chk01_DtlR.$base_unit_qty, StktkActRcptIF_Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(StktkAct_Chk01_DtlR.$std_upri, StktkActRcptIF_Chk01_DtlR.$std_upri);
			addColumnPathMap(StktkAct_Chk01_DtlR.$std_cost, StktkActRcptIF_Chk01_DtlR.$std_cost);
			addColumnPathMap(StktkAct_Chk01_DtlR.$act_diff_cost, StktkActRcptIF_Chk01_DtlR.$act_diff_cost);
			addColumnPathMap(StktkAct_Chk01_DtlR.$base_cur_cd, StktkActRcptIF_Chk01_DtlR.$base_cur_cd);
			addColumnPathMap(StktkAct_Chk01_DtlR.$upri_dec_place, StktkActRcptIF_Chk01_DtlR.$upri_dec_place);
			addColumnPathMap(StktkAct_Chk01_DtlR.$amt_dec_place, StktkActRcptIF_Chk01_DtlR.$amt_dec_place);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stktk_act_rmrks, StktkActRcptIF_Chk01_DtlR.$stktk_act_rmrks);
			addColumnPathMap(StktkAct_Chk01_DtlR.$intr_rmrks, StktkActRcptIF_Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(StktkAct_Chk01_DtlR.$sub_char1, StktkActRcptIF_Chk01_DtlR.$sub_char1);
			addColumnPathMap(StktkAct_Chk01_DtlR.$sub_char2, StktkActRcptIF_Chk01_DtlR.$sub_char2);
			addColumnPathMap(StktkAct_Chk01_DtlR.$sub_char3, StktkActRcptIF_Chk01_DtlR.$sub_char3);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stktk_itm_spc_flg, StktkActRcptIF_Chk01_DtlR.$stktk_itm_spc_flg);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stktk_sts_typ, StktkActRcptIF_Chk01_DtlR.$stktk_sts_typ);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stktk_sts_typ_nm, StktkActRcptIF_Chk01_DtlR.$stktk_sts_typ_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$ins_usr_id, StktkActRcptIF_Chk01_DtlR.$ins_usr_id);
			addColumnPathMap(StktkAct_Chk01_DtlR.$ins_usr_nm, StktkActRcptIF_Chk01_DtlR.$ins_usr_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$ins_func_id, StktkActRcptIF_Chk01_DtlR.$ins_func_id);
			addColumnPathMap(StktkAct_Chk01_DtlR.$ins_func_nm, StktkActRcptIF_Chk01_DtlR.$ins_func_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$ins_ts, StktkActRcptIF_Chk01_DtlR.$ins_ts);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stktkact_upd_cntr, StktkActRcptIF_Chk01_DtlR.$stktkact_upd_cntr);
			addColumnPathMap(StktkAct_Chk01_DtlR.$stktk_upd_cntr, StktkActRcptIF_Chk01_DtlR.$stktk_upd_cntr);
			addColumnPathMap(StktkAct_Chk01_DtlR.$upd_usr_id, StktkActRcptIF_Chk01_DtlR.$upd_usr_id);
			addColumnPathMap(StktkAct_Chk01_DtlR.$upd_usr_nm, StktkActRcptIF_Chk01_DtlR.$upd_usr_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$upd_func_id, StktkActRcptIF_Chk01_DtlR.$upd_func_id);
			addColumnPathMap(StktkAct_Chk01_DtlR.$upd_func_nm, StktkActRcptIF_Chk01_DtlR.$upd_func_nm);
			addColumnPathMap(StktkAct_Chk01_DtlR.$upd_ts, StktkActRcptIF_Chk01_DtlR.$upd_ts);
			addColumnPathMap(StktkAct_Chk01_DtlR.$upd_srv_req_no, StktkActRcptIF_Chk01_DtlR.$upd_srv_req_no);
			addColumnPathMap(StktkAct_Chk01_DtlR.$rtn_sts_typ, StktkActRcptIF_Chk01_DtlR.$rtn_sts_typ);

		}
	}


	protected Map_MST_STKTK_R_StktkActRcptIF_Chk01_DtlR<MST_STKTK_R,StktkActRcptIF_Chk01_DtlR> createMap_MST_STKTK_R_StktkActRcptIF_Chk01_DtlR() {
		return new Map_MST_STKTK_R_StktkActRcptIF_Chk01_DtlR<MST_STKTK_R, StktkActRcptIF_Chk01_DtlR>();
	}

	public class Map_MST_STKTK_R_StktkActRcptIF_Chk01_DtlR<D extends MST_STKTK_R, S extends StktkActRcptIF_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			//$ctrl_tgt_dt　-> $stktk_base_dt
			addColumnPathMap(MST_STKTK_R.$ctrl_tgt_dt, StktkActRcptIF_Chk01_DtlR.$stktk_base_dt);
			
			addColumnPathMap(MST_STKTK_R.$loc_cd, StktkActRcptIF_Chk01_DtlR.$loc_cd);
			addColumnPathMap(MST_STKTK_R.$itm_cd, StktkActRcptIF_Chk01_DtlR.$itm_cd);
			addColumnPathMap(MST_STKTK_R.$itm_sub1, StktkActRcptIF_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(MST_STKTK_R.$itm_sub2, StktkActRcptIF_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(MST_STKTK_R.$itm_sub3, StktkActRcptIF_Chk01_DtlR.$itm_sub3);
//			addColumnPathMap(MST_STKTK_R.$wg_cd, StktkActRcptIF_Chk01_DtlR.$wg_cd);
//			addColumnPathMap(MST_STKTK_R.$stktk_sts_typ, StktkActRcptIF_Chk01_DtlR.$stktk_sts_typ);
//			addColumnPathMap(MST_STKTK_R.$intr_rmrks, StktkActRcptIF_Chk01_DtlR.$intr_rmrks);
//			addColumnPathMap(MST_STKTK_R.$sub_char1, StktkActRcptIF_Chk01_DtlR.$sub_char1);
//			addColumnPathMap(MST_STKTK_R.$sub_char2, StktkActRcptIF_Chk01_DtlR.$sub_char2);
//			addColumnPathMap(MST_STKTK_R.$sub_char3, StktkActRcptIF_Chk01_DtlR.$sub_char3);
//			addColumnPathMap(MST_STKTK_R.$ins_usr_id, StktkActRcptIF_Chk01_DtlR.$ins_usr_id);
//			addColumnPathMap(MST_STKTK_R.$ins_usr_nm, StktkActRcptIF_Chk01_DtlR.$ins_usr_nm);
//			addColumnPathMap(MST_STKTK_R.$ins_ts, StktkActRcptIF_Chk01_DtlR.$ins_ts);
//			addColumnPathMap(MST_STKTK_R.$ins_func_id, StktkActRcptIF_Chk01_DtlR.$ins_func_id);
//			addColumnPathMap(MST_STKTK_R.$upd_usr_id, StktkActRcptIF_Chk01_DtlR.$upd_usr_id);
//			addColumnPathMap(MST_STKTK_R.$upd_usr_nm, StktkActRcptIF_Chk01_DtlR.$upd_usr_nm);
//			addColumnPathMap(MST_STKTK_R.$upd_ts, StktkActRcptIF_Chk01_DtlR.$upd_ts);
//			addColumnPathMap(MST_STKTK_R.$upd_func_id, StktkActRcptIF_Chk01_DtlR.$upd_func_id);
//			addColumnPathMap(MST_STKTK_R.$upd_srv_req_no, StktkActRcptIF_Chk01_DtlR.$upd_srv_req_no);

		}
	}
	
	protected void handleSuccess(MCList<StktkActRcptIF_Chk01_DtlR> l) {
		dbTran().commit();
		for(StktkActRcptIF_Chk01_DtlR r : l) {
			if(!r.err_flg()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}
	}
	
	protected void handleEx(Exception e, MCList<StktkActRcptIF_Chk01_DtlR> l) {
		dbTran().rollback();
		
		MCException mcex;
		if(e instanceof MCException) {
			mcex = (MCException)e;
		} else {
			mcex = new MCException(e);
		}
		MCLog.write(mcex);
		
		MCMessage msg = mcex.getMCMessage();
		MCMessagePool.add(msg);
		for (StktkActRcptIF_Chk01_DtlR r : l) {
			r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
		}	
	}

	//FMCB CUSTOM END
}