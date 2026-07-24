package mcframe.serverMSBC.MSBCL0130;

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
import mcframe.serverMSBC.MSBCL0130.*;	// このimportはFrameManagerの自動生成で追加されました。

import static mcframe.serverMSBC.MSBCL0130.Query.*;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSBF.MSBFL5010.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_PrcdOrdSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_PrcdOrdSrch_MC extends MSBCL_PrcdOrdSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBCL_PrcdOrdSrch_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			//bind用一時カラム追加
			setUpTmpCol();

			//先行手配品目オーダ検索
			srchPrcdItmOrd();
		}

		/**
		 * 検索条件用一時カラムを設定する
		 */
		protected void setUpTmpCol() {
			// 「品目オーダ区分」条件の設定
			if (up0().mfg_flg()) {
				up0().addStringColumn("wk_mfg", MSC_ITM_ORD_TYP.MFG.value());
			}
			if (up0().purc_flg()) {
				up0().addStringColumn("wk_purc", MSC_ITM_ORD_TYP.PURC.value());
			}
			if (up0().outsrc_flg()) {
				up0().addStringColumn("wk_outsrc", MSC_ITM_ORD_TYP.OUTSRC.value());
			}
			if (up0().xfr_flg()) {
				up0().addStringColumn("wk_xfr", MSC_ITM_ORD_TYP.XFR.value());
			}
			if (up0().wg_xfr_flg()) {
				up0().addStringColumn("wk_wg_xfr", MSC_ITM_ORD_TYP.WG_XFR.value());
			}

			// 「オーダ状況区分」条件の設定
			if (up0().opn_flg()) {
				up0().addStringColumn("wk_opn", MSC_ITM_ORD_STS_TYP.OPN.value());
			}
			if (up0().fix_flg()) {
				up0().addStringColumn("wk_fix", MSC_ITM_ORD_STS_TYP.FIX.value());
			}

			//「手配不許可」条件の設定
			if (up0().true_not_fix_flg() && !up0().false_not_fix_flg()) {
				up0().addStringColumn("wk_not_fix_flg", toTrueStr(true));
			}
			else if (!up0().true_not_fix_flg() && up0().false_not_fix_flg()) {
				up0().addStringColumn("wk_not_fix_flg", toFalseStr(false));
			}
		}

		/** 先行手配品目オーダ情報を検索する */
		protected void srchPrcdItmOrd() {
			MCQueryPlan prcdItmOrdSql = MSBCL0130_MST_PRCD_ITM_ORDER_S01();
			searchForDL(prcdItmOrdSql, up0(), down0());
		}

		@Override
		protected void editListMain() {
			// editListMain()は複数回呼ばれる可能性がある
			super.editListMain();

			// 有効成分数量を設定
			setFctrQty();
			//検査対象取得
			callInspSchdSrch01();
		}

		/** 検査対象フラグの取得 */
		protected void callInspSchdSrch01() {
			MCList<Srch01_RsltR> inspL = down0().subList(r->isInspChk(r));
			if(inspL.isEmpty()){
				return;
			}

			setPegNo(inspL);
			MSBFL_InspSchdService.InspSchd_Srch01 ope = MSBFL_InspSchdService.crtInspSchd_Srch01();
			addAll(ope.up0(), inspL, createMap_InspSchd_Srch01_CndR_Srch01_RsltR());
			ope.exec();

			MCIndexKey idx = ope.down0().createIndex(InspSchd_Srch01_CndR.$peg_no);
			for (Srch01_RsltR r : inspL){
				InspSchd_Srch01_CndR chk = ope.down0().getFirst(idx, r.peg_no());
				if (chk != null){
					r.insp_flg(true);
				}
			}
		}

		protected boolean isInspChk(Srch01_RsltR r) {
			return MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())
					|| MSC_ITM_ORD_TYP.isPURC(r.itm_ord_typ())
					|| MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ());
		}

		/** Srch01_HdrR → InspSchd_Srch01_CndR (Srch01 → InspSchd_Srch01) */
		protected Map_InspSchd_Srch01_CndR_Srch01_RsltR<InspSchd_Srch01_CndR, Srch01_RsltR> createMap_InspSchd_Srch01_CndR_Srch01_RsltR() {
			return new Map_InspSchd_Srch01_CndR_Srch01_RsltR<InspSchd_Srch01_CndR, Srch01_RsltR>();
		}

		/** Srch01_HdrR → InspSchd_Srch01_CndR (Srch01 → InspSchd_Srch01) */
		public class Map_InspSchd_Srch01_CndR_Srch01_RsltR<D extends InspSchd_Srch01_CndR, S extends Srch01_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch01_CndR.$peg_no, Srch01_RsltR.$peg_no);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_cd, Srch01_RsltR.$itm_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub1, Srch01_RsltR.$itm_sub1);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub2, Srch01_RsltR.$itm_sub2);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub3, Srch01_RsltR.$itm_sub3);
				addColumnPathMap(InspSchd_Srch01_CndR.$mfg_loc_cd, Srch01_RsltR.$mfg_loc_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$to_loc_cd, Srch01_RsltR.$strg_loc_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$sppl_cd, Srch01_RsltR.$sppl_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$maker_cd, Srch01_RsltR.$maker_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$base_dt, Srch01_RsltR.$strg_schd_dt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				if (MSC_ITM_ORD_TYP.isMFG(src.itm_ord_typ())) {
					dest.insp_typ(MSC_INSP_TYP.PRDCT.value());
				}
				else if (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ())
						|| MSC_ITM_ORD_TYP.isPURC(src.itm_ord_typ())) {
					dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
				}
				else if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ())
						|| MSC_ITM_ORD_TYP.isWG_XFR(src.itm_ord_typ())) {
					dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
				}
			}
		}

		/**
		 * 有効成分(指図予定数量)、有効成分(出来高予定数量)の計算と設定を行う
		 */
		protected void setFctrQty() {
			for(Srch01_RsltR r : down0()) {
				MCNumber stdContInstQty = convToContFctrUnit(r.inst_qty(), r.std_cont_fctr(),
						r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
				r.cont_fctr_inst_qty(stdContInstQty);
				
				MCNumber stdContYieldQty = convToContFctrUnit(r.yield_schd_qty(), r.std_cont_fctr(),
						r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
				r.cont_fctr_schd_yield(stdContYieldQty);
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 */
	public class Chk01 extends MSBCL_PrcdOrdSrch_MC_A.Chk01 {
		protected MST_PRCD_ITM_ORDER_R _prcdOrdR = MST_PRCD_ITM_ORDER_R.create();
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				// オーダ更新前チェック呼び出し
				callOrdUpdChkSrv();
			}
			setErrToRtnStsTyp();
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			// lockAndCheckBaseで更新カウンタチェック対象、補完に必要なトランザクションデータを検索する
			msgL.addAll(lockAndCheckBase());

			return msgL;
		}
		
		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_PRCD_ITM_ORDER_R> selectL = MCList.create(MST_PRCD_ITM_ORDER_R.class);
			MST_PRCD_ITM_ORDER_R t = MST_PRCD_ITM_ORDER_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.itm_ord_no, t.strg_loc_cd, t.upd_cntr);

			selectL_bldr.setOrderByAsc(t.itm_ord_no);

			MCList<Chk01_DtlR> bindL = notErrL.groupBy(Chk01_DtlR.$itm_ord_no);

			dbSelectKeyForUpdateNoWait("MSBCL0130_MST_PRCD_ITM_ORDER_S01", selectL, selectL_bldr, bindL);
			
			MCIndexKey idxkey = selectL.createIndex(MST_PRCD_ITM_ORDER_R.$itm_ord_no);
			for (Chk01_DtlR r : notErrL) {
				MST_PRCD_ITM_ORDER_R selectR = selectL.getFirst(idxkey, r.itm_ord_no());
				
				msgL.addAll(checkUpdCntrNE(r, Chk02_DtlR.$itm_order_upd_cntr, selectR));
				if (!isNull(selectR)) {
					selectR.setAttributes(r);
					msgL.addAll(checkWritableLocCdDac(selectR, MST_PRCD_ITM_ORDER_R.$strg_loc_cd));
				}
			}
			
			return msgL;
		}

	
		/** オーダ更新前チェックサービスを実行する */
		protected void callOrdUpdChkSrv(){
			setItmOrd();

			MSBCL_OrdRegService.Ord_Chk01 ope = MSBCL_OrdRegService.crtOrd_Chk01();
			addAll(ope.up0(), up0(), createMap_Ord_Upd01_Dtl1R_Chk01_DtlR());
			ope.exec();

			copyErrFlg(up0(), ope.down0());
			String[] dest = new String[]{Chk01_DtlR.$strg_sppl_cd, Chk01_DtlR.$unit_cd,
					Chk01_DtlR.$lot_mng_typ, Chk01_DtlR.$sublot_mng_typ};
			String[] src = new String[]{Ord_Upd01_Dtl1R.$strg_sppl_cd, Ord_Upd01_Dtl1R.$unit_cd,
					Ord_Upd01_Dtl1R.$lot_mng_typ, Ord_Upd01_Dtl1R.$sublot_mng_typ};
			copyByPegNo(up0(), dest,  ope.down0(), src);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/** 品目オーダ情報を補完 */
		protected void setItmOrd(){
			MCList<MST_PRCD_ITM_ORDER_R> dbcL = MCList.create(MST_PRCD_ITM_ORDER_R.class);
			dbSelectKey("MSBCL0130_MST_PRCD_ITM_ORDER_S02", dbcL,
					MCQueryApiBuilder.create(MST_PRCD_ITM_ORDER_R.create("T")), up0());
			MCIndexKey idx = dbcL.createIndex(MST_PRCD_ITM_ORDER_R.$itm_ord_no);
			for (Chk01_DtlR row: up0()) {
				MST_PRCD_ITM_ORDER_R dbc = dbcL.getFirst(idx, row.itm_ord_no());
				if(dbc != null){
					row.ord(dbc);
				}
			}
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 */
	public class Chk02 extends MSBCL_PrcdOrdSrch_MC_A.Chk02 {
		protected MST_PRCD_ITM_ORDER_R _prcdOrdR = MST_PRCD_ITM_ORDER_R.create();
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			
			MCList<Chk02_DtlR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				// オーダ更新前チェック呼び出し
				callOrdUpdChkSrv();
			}
			setErrToRtnStsTyp();
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			msgL.addAll(lockAndCheckBase());

			return msgL;
		}
		
		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<Chk02_DtlR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_PRCD_ITM_ORDER_R> selectL = MCList.create(MST_PRCD_ITM_ORDER_R.class);
			MST_PRCD_ITM_ORDER_R t = MST_PRCD_ITM_ORDER_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.itm_ord_no, t.strg_loc_cd, t.upd_cntr);

			selectL_bldr.setOrderByAsc(t.itm_ord_no);

			MCList<Chk02_DtlR> bindL = notErrL.groupBy(Chk02_DtlR.$itm_ord_no);

			dbSelectKeyForUpdateNoWait("MSBCL0130_MST_PRCD_ITM_ORDER_S03", selectL, selectL_bldr, bindL);
			
			MCIndexKey idxkey = selectL.createIndex(MST_PRCD_ITM_ORDER_R.$itm_ord_no);
			for (Chk02_DtlR r : notErrL) {
				MST_PRCD_ITM_ORDER_R selectR = selectL.getFirst(idxkey, r.itm_ord_no());
				
				msgL.addAll(checkUpdCntrNE(r, Chk02_DtlR.$itm_order_upd_cntr, selectR));
				//msgL.addAll(checkWritableLocCdDac(r, Chk02_DtlR.$strg_loc_cd));
				if (!isNull(selectR)) {
					selectR.setAttributes(r);
					msgL.addAll(checkWritableLocCdDac(selectR, MST_PRCD_ITM_ORDER_R.$strg_loc_cd));
				}
				
			}
			
			return msgL;
		}

		protected void compBase() {
			// トランザクションデータからの補完処理はここに実装する
		}

		/** オーダ更新前チェックサービスを実行する */
		protected void callOrdUpdChkSrv(){
			setItmOrd();

			MSBCL_OrdRegService.Ord_Chk01 ope = MSBCL_OrdRegService.crtOrd_Chk01();
			addAll(ope.up0(), up0(), createMap_Ord_Upd01_Dtl1R_Chk02_DtlR());
			ope.exec();

			copyErrFlg(up0(), ope.down0());
			String[] dest = new String[]{Chk02_DtlR.$strg_sppl_cd, Chk02_DtlR.$unit_cd,
					Chk02_DtlR.$lot_mng_typ, Chk02_DtlR.$sublot_mng_typ, Chk02_DtlR.$purc_lt, Chk02_DtlR.$mfg_lt};
			String[] src = new String[]{Ord_Upd01_Dtl1R.$strg_sppl_cd, Ord_Upd01_Dtl1R.$unit_cd,
					Ord_Upd01_Dtl1R.$lot_mng_typ, Ord_Upd01_Dtl1R.$sublot_mng_typ, Ord_Upd01_Dtl1R.$purc_lt, Ord_Upd01_Dtl1R.$mfg_lt};
			copyByPegNo(up0(), dest,  ope.down0(), src);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/** 更新可能項目以外の品目オーダ情報を補完 */
		protected void setItmOrd(){
			MCList<MST_PRCD_ITM_ORDER_R> dbcL = MCList.create(MST_PRCD_ITM_ORDER_R.class);
			dbSelectKey("MSBCL0130_MST_PRCD_ITM_ORDER_S04", dbcL,
					MCQueryApiBuilder.create(MST_PRCD_ITM_ORDER_R.create("T")), up0());
			MCIndexKey idx = dbcL.createIndex(MST_PRCD_ITM_ORDER_R.$itm_ord_no);
			for (Chk02_DtlR row: up0()) {
				MST_PRCD_ITM_ORDER_R dbc = dbcL.getFirst(idx, row.itm_ord_no());
				if(dbc != null){
					dbc.itm_ord_no(row.itm_ord_no());
					dbc.inst_qty(row.inst_qty());
					dbc.yield_schd_qty(row.yield_schd_qty());
					dbc.po_schd_dt(row.po_schd_dt());
					dbc.mfg_st_schd_dt(row.mfg_st_schd_dt());
					dbc.mfg_end_schd_dt(row.mfg_end_schd_dt());
					dbc.gi_schd_dt(row.gi_schd_dt());
					dbc.strg_schd_dt(row.strg_schd_dt());
					dbc.accpt_schd_dt(row.accpt_schd_dt());
					dbc.insp_st_schd_dt(row.insp_st_schd_dt());
					dbc.insp_end_schd_dt(row.insp_end_schd_dt());
					dbc.avl_schd_dt(row.avl_schd_dt());
					dbc.intr_rmrks(row.intr_rmrks());
					dbc.sub_char1(row.sub_char1());
					dbc.sub_char2(row.sub_char2());
					dbc.sub_char3(row.sub_char3());

					row.ord(dbc);
				}
			}
		}

	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 */
	public class Upd01 extends MSBCL_PrcdOrdSrch_MC_A.Upd01 {

		@Override
		protected int getSplitRowCount() {
			// 自動マルチスレッド分割サイズ
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess();
			}
			catch (Exception e) {
				handleEx(e);
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {

			//上り電文編集
			editUp();

			// オーダ更新前チェック処理
			callThisChk01();

			MCList<Chk01_DtlR> notErrL = up0().subList(Chk01_DtlR.$err_flg, false);
			if (notErrL.size() != 0) {
				// オーダ更新サービス実行
				callOrdUpdSrv(notErrL);

				//先行手配オーダ、受払予定の更新・取り消し
				updPrcdOrd(notErrL);
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_DtlR.$peg_no, up0());
			up0().setString(Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			up0().setString(Chk01_DtlR.$mrp_typ, MSC_MRP_TYP.MRP.value());
		}

		/**
		 * オーダ登録時のチェック処理
		 */
		protected void callThisChk01() {
			MSBCL_PrcdOrdSrch.Chk01 ope = MSBCL_PrcdOrdSrch.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();

			up0().setAll(ope.down0());
		}

		/**
		 * オーダ登録サービスを実行する
		 * 
		 * @param notErrL
		 */
		protected void callOrdUpdSrv(MCList<Chk01_DtlR> notErrL) {
			MSBCL_OrdRegService.Ord_Upd01 ope = MSBCL_OrdRegService.crtOrd_Upd01();
			addAll(ope.up0(), notErrL, createMap_Ord_Upd01_Dtl1R_Chk01_DtlR());
			ope.exec();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/** 正常終了したスレッドの後処理 */
		protected void handleSuccess() {
			dbTran().commit();
			for (Chk01_DtlR r : up0()) {
				if (!r.err_flg()){
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/** 例外が発生したスレッドのエラー処理 */
		protected void handleEx(Exception e) {

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
			for (Chk01_DtlR r : up0()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		/**
		 * 確定済み先行手配オーダ・受払予定の更新・取消し
		 * @param l
		 */
		protected void updPrcdOrd(MCList<Chk01_DtlR> fixL){
			MCList<MST_PRCD_ITM_ORDER_R> dbcL = MCList.create(MST_PRCD_ITM_ORDER_R.class);
			for (Chk01_DtlR r : fixL.groupBy(Chk01_DtlR.$itm_ord_no)) {
				MST_PRCD_ITM_ORDER_R dbc = MST_PRCD_ITM_ORDER_R.create();
				dbc.itm_ord_no(r.itm_ord_no());
				dbcL.add(dbc);
			}
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_PRCD_ITM_ORDER_R.create("T"));
			dbWkDelete("MSBCL0130_MSW_PRCD_ITM_ORDER_D01", dbcL_bldr.getBaseDbc());
			dbWkInsert("MSBCL0130_MSW_PRCD_ITM_ORDER_I01", dbcL, dbcL_bldr.getBaseDbc());

			executeUpdate(MSBCL0130_MST_PRCD_ITM_ORDER_U01());
			executeUpdate(MSBCL0130_MST_PRCD_OPER_ORDER_U01());		
			executeUpdate(MSBCL0130_MST_PRCD_IO_SCHD_D01());
		}
	}

	/**
	 * Upd02オペレーション.<p>
	 *
	 */
	public class Upd02 extends MSBCL_PrcdOrdSrch_MC_A.Upd02 {

		@Override
		protected int getSplitRowCount() {
			// 自動マルチスレッド分割サイズ
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess();
			}
			catch (Exception e) {
				handleEx(e);
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {

			// 登り電文編集
			editUp();

			// オーダ更新前チェック処理
			callThisChk02();

			MCList<Chk02_DtlR> notErrL = up0().subList(Chk02_DtlR.$err_flg, false);
			if (notErrL.size() != 0) {
				// オーダ更新サービス実行
				callOrdUpdSrv(notErrL);
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk02_DtlR.$peg_no, up0());
			up0().setString(Chk02_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
			up0().setString(Chk02_DtlR.$mrp_typ, MSC_MRP_TYP.PRCD.value());
		}

		/**
		 * オーダ更新時のチェック処理
		 */
		protected void callThisChk02() {
			MSBCL_PrcdOrdSrch.Chk02 ope = MSBCL_PrcdOrdSrch.crtChk02();
			ope.up0().setAll(up0());	
			ope.exec();

			up0().setAll(ope.down0());
		}

		/**
		 * オーダ更新サービスを実行する
		 * 
		 * @param notErrL
		 */
		protected void callOrdUpdSrv(MCList<Chk02_DtlR> notErrL) {
			MSBCL_OrdRegService.Ord_Upd01 ope = MSBCL_OrdRegService.crtOrd_Upd01();
			addAll(ope.up0(), notErrL, createMap_Ord_Upd01_Dtl1R_Chk02_DtlR());
			ope.exec();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/** 正常終了したスレッドの後処理 */
		protected void handleSuccess() {
			dbTran().commit();
			for (Chk02_DtlR r : up0()) {
				if (!r.err_flg()){
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/** 例外が発生したスレッドのエラー処理 */
		protected void handleEx(Exception e) {

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
			for (Chk02_DtlR r : up0()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
	}

	/** Chk02_DtlR → Ord_Upd01_Dtl1R (Chk02 → Ord_Chk01,Upd02 → Ord_Upd01 ) */
	protected Map_Ord_Upd01_Dtl1R_Chk02_DtlR<Ord_Upd01_Dtl1R,Chk02_DtlR> createMap_Ord_Upd01_Dtl1R_Chk02_DtlR() {
		return new Map_Ord_Upd01_Dtl1R_Chk02_DtlR<Ord_Upd01_Dtl1R, Chk02_DtlR>();
	}

	/** Chk02_DtlR → Ord_Upd01_Dtl1R (Chk02 → Ord_Chk01,Upd02 → Ord_Upd01 ) */
	public class Map_Ord_Upd01_Dtl1R_Chk02_DtlR<D extends Ord_Upd01_Dtl1R, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Chk02_DtlR.$peg_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, Chk02_DtlR.$data_crud_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_typ, Chk02_DtlR.$mrp_typ);

			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, Chk02_DtlR.$itm_ord_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_typ, Chk02_DtlR.$itm_ord_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$ord_gnrt_typ, Chk02_DtlR.$ord_gnrt_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_cd, Chk02_DtlR.$itm_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub1, Chk02_DtlR.$itm_sub1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub2, Chk02_DtlR.$itm_sub2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub3, Chk02_DtlR.$itm_sub3);
			addColumnPathMap(Ord_Upd01_Dtl1R.$ver_no, Chk02_DtlR.$ver_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$strg_loc_cd, Chk02_DtlR.$strg_loc_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_loc_cd, Chk02_DtlR.$mfg_loc_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sppl_cd, Chk02_DtlR.$sppl_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$maker_cd, Chk02_DtlR.$maker_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_loc_cd, Chk02_DtlR.$rqst_loc_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_wg_cd, Chk02_DtlR.$rqst_wg_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$bom_ptn, Chk02_DtlR.$bom_ptn);
			addColumnPathMap(Ord_Upd01_Dtl1R.$oper_ptn, Chk02_DtlR.$oper_ptn);
			addColumnPathMap(Ord_Upd01_Dtl1R.$inst_qty, Chk02_DtlR.$inst_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$yield_schd_qty, Chk02_DtlR.$yield_schd_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$nmr_qty, Chk02_DtlR.$nmr_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$dnm_qty, Chk02_DtlR.$dnm_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$fxd_yield_qty, Chk02_DtlR.$fxd_yield_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_sts_typ, Chk02_DtlR.$itm_ord_sts_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$po_schd_dt, Chk02_DtlR.$po_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_po_schd_dt, Chk02_DtlR.$mrp_po_schd_dt);	
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_purc_lt, Chk02_DtlR.$mrp_purc_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$purc_lt, Chk02_DtlR.$purc_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_st_schd_dt, Chk02_DtlR.$mfg_st_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_mfg_st_schd_dt, Chk02_DtlR.$mrp_mfg_st_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_end_schd_dt, Chk02_DtlR.$mfg_end_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_mfg_end_schd_dt, Chk02_DtlR.$mrp_mfg_end_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_mfg_lt, Chk02_DtlR.$mrp_mfg_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_lt, Chk02_DtlR.$mfg_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$gi_schd_dt, Chk02_DtlR.$gi_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_gi_schd_dt, Chk02_DtlR.$mrp_gi_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$strg_schd_dt, Chk02_DtlR.$strg_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_strg_schd_dt, Chk02_DtlR.$mrp_strg_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$xfr_lt, Chk02_DtlR.$xfr_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$accpt_schd_dt, Chk02_DtlR.$accpt_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_accpt_schd_dt, Chk02_DtlR.$mrp_accpt_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$accpt_insp_lt, Chk02_DtlR.$accpt_insp_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$insp_st_schd_dt, Chk02_DtlR.$insp_st_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_insp_st_schd_dt, Chk02_DtlR.$mrp_insp_st_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$insp_end_schd_dt, Chk02_DtlR.$insp_end_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_insp_end_schd_dt, Chk02_DtlR.$mrp_insp_end_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$insp_lt, Chk02_DtlR.$insp_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$insp_offst, Chk02_DtlR.$insp_offst);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_avl_schd_dt, Chk02_DtlR.$mrp_avl_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$avl_schd_dt, Chk02_DtlR.$avl_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$master_dt, Chk02_DtlR.$master_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno1, Chk02_DtlR.$sno1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ1, Chk02_DtlR.$sno_typ1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno2, Chk02_DtlR.$sno2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ2, Chk02_DtlR.$sno_typ2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno3, Chk02_DtlR.$sno3);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ3, Chk02_DtlR.$sno_typ3);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno4, Chk02_DtlR.$sno4);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ4, Chk02_DtlR.$sno_typ4);
			addColumnPathMap(Ord_Upd01_Dtl1R.$lmt_dt, Chk02_DtlR.$lmt_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$wg_cd, Chk02_DtlR.$wg_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$ord_fix_pd, Chk02_DtlR.$ord_fix_pd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$rqmt_no, Chk02_DtlR.$rqmt_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$inst_po_cnt_rmrks, Chk02_DtlR.$inst_po_cnt_rmrks);
			addColumnPathMap(Ord_Upd01_Dtl1R.$io_schd_pr_no, Chk02_DtlR.$io_schd_pr_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$intr_rmrks, Chk02_DtlR.$intr_rmrks);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sub_char1, Chk02_DtlR.$sub_char1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sub_char2, Chk02_DtlR.$sub_char2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sub_char3, Chk02_DtlR.$sub_char3);

			addColumnPathMap(Ord_Upd01_Dtl1R.$unit_cd, Chk02_DtlR.$unit_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$strg_lg_grp_cd, Chk02_DtlR.$strg_lg_grp_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$strg_sppl_cd, Chk02_DtlR.$strg_sppl_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_to_lg_grp_cd, Chk02_DtlR.$rqst_to_lg_grp_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$lot_mng_typ, Chk02_DtlR.$lot_mng_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sublot_mng_typ, Chk02_DtlR.$sublot_mng_typ);
		}

		@Override
		protected void valueCopy(D dest, S src){
			dest.oper_ord_pr_flg(true);
			dest.io_schd_pr_flg(true);
		}
	}

	/** Chk01_DtlR → Ord_Upd01_Dtl1R (Chk01 → Ord_Chk01,Upd02 → Ord_Upd01 ) */
	protected Map_Ord_Upd01_Dtl1R_Chk01_DtlR<Ord_Upd01_Dtl1R,Chk01_DtlR> createMap_Ord_Upd01_Dtl1R_Chk01_DtlR() {
		return new Map_Ord_Upd01_Dtl1R_Chk01_DtlR<Ord_Upd01_Dtl1R, Chk01_DtlR>();
	}

	/** Chk01_DtlR → Ord_Upd01_Dtl1R (Chk01 → Ord_Chk01,Upd02 → Ord_Upd01 ) */
	public class Map_Ord_Upd01_Dtl1R_Chk01_DtlR<D extends Ord_Upd01_Dtl1R, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_typ, Chk01_DtlR.$mrp_typ);

			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, Chk01_DtlR.$itm_ord_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_typ, Chk01_DtlR.$itm_ord_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$ord_gnrt_typ, Chk01_DtlR.$ord_gnrt_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(Ord_Upd01_Dtl1R.$ver_no, Chk01_DtlR.$ver_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$strg_loc_cd, Chk01_DtlR.$strg_loc_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_loc_cd, Chk01_DtlR.$mfg_loc_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sppl_cd, Chk01_DtlR.$sppl_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$maker_cd, Chk01_DtlR.$maker_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_loc_cd, Chk01_DtlR.$rqst_loc_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_wg_cd, Chk01_DtlR.$rqst_wg_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$bom_ptn, Chk01_DtlR.$bom_ptn);
			addColumnPathMap(Ord_Upd01_Dtl1R.$oper_ptn, Chk01_DtlR.$oper_ptn);
			addColumnPathMap(Ord_Upd01_Dtl1R.$inst_qty, Chk01_DtlR.$inst_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$yield_schd_qty, Chk01_DtlR.$yield_schd_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$nmr_qty, Chk01_DtlR.$nmr_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$dnm_qty, Chk01_DtlR.$dnm_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$fxd_yield_qty, Chk01_DtlR.$fxd_yield_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_sts_typ, Chk01_DtlR.$itm_ord_sts_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$po_schd_dt, Chk01_DtlR.$po_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_po_schd_dt, Chk01_DtlR.$mrp_po_schd_dt);	
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_purc_lt, Chk01_DtlR.$mrp_purc_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$purc_lt, Chk01_DtlR.$purc_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_st_schd_dt, Chk01_DtlR.$mfg_st_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_mfg_st_schd_dt, Chk01_DtlR.$mrp_mfg_st_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_end_schd_dt, Chk01_DtlR.$mfg_end_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_mfg_end_schd_dt, Chk01_DtlR.$mrp_mfg_end_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_mfg_lt, Chk01_DtlR.$mrp_mfg_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_lt, Chk01_DtlR.$mfg_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$gi_schd_dt, Chk01_DtlR.$gi_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_gi_schd_dt, Chk01_DtlR.$mrp_gi_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$strg_schd_dt, Chk01_DtlR.$strg_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_strg_schd_dt, Chk01_DtlR.$mrp_strg_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$xfr_lt, Chk01_DtlR.$xfr_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$accpt_schd_dt, Chk01_DtlR.$accpt_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_accpt_schd_dt, Chk01_DtlR.$mrp_accpt_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$accpt_insp_lt, Chk01_DtlR.$accpt_insp_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$insp_st_schd_dt, Chk01_DtlR.$insp_st_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_insp_st_schd_dt, Chk01_DtlR.$mrp_insp_st_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$insp_end_schd_dt, Chk01_DtlR.$insp_end_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_insp_end_schd_dt, Chk01_DtlR.$mrp_insp_end_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$insp_lt, Chk01_DtlR.$insp_lt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$insp_offst, Chk01_DtlR.$insp_offst);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_avl_schd_dt, Chk01_DtlR.$mrp_avl_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$avl_schd_dt, Chk01_DtlR.$avl_schd_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$master_dt, Chk01_DtlR.$master_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ1, Chk01_DtlR.$sno_typ1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ2, Chk01_DtlR.$sno_typ2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ3, Chk01_DtlR.$sno_typ3);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ4, Chk01_DtlR.$sno_typ4);
			addColumnPathMap(Ord_Upd01_Dtl1R.$lmt_dt, Chk01_DtlR.$lmt_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$wg_cd, Chk01_DtlR.$wg_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$ord_fix_pd, Chk01_DtlR.$ord_fix_pd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$rqmt_no, Chk01_DtlR.$rqmt_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$inst_po_cnt_rmrks, Chk01_DtlR.$inst_po_cnt_rmrks);
			addColumnPathMap(Ord_Upd01_Dtl1R.$io_schd_pr_no, Chk01_DtlR.$io_schd_pr_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sub_char3, Chk01_DtlR.$sub_char3);

			addColumnPathMap(Ord_Upd01_Dtl1R.$unit_cd, Chk01_DtlR.$unit_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$strg_lg_grp_cd, Chk01_DtlR.$strg_lg_grp_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$strg_sppl_cd, Chk01_DtlR.$strg_sppl_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_to_lg_grp_cd, Chk01_DtlR.$rqst_to_lg_grp_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$lot_mng_typ, Chk01_DtlR.$lot_mng_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sublot_mng_typ, Chk01_DtlR.$sublot_mng_typ);
		}

		@Override
		protected void valueCopy(D dest, S src){
			dest.oper_ord_pr_flg(true);
			dest.io_schd_pr_flg(true);
			dest.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.SAV.value());
		}
	}

	//FMCB CUSTOM END
}