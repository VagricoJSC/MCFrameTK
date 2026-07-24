package mcframe.serverMSBC.MSBCL5080;

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
import static mcframe.serverMSBC.MSBCL5080.Query.*;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSBC.MSBCL5020.*;
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_RqmtCrtService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_RqmtCrtService_MC extends MSBCL_RqmtCrtService_MC_A{
	//FMCB CUSTOM START

	/**
	 * RqmtCrt_Upd01オペレーション.<p>
	 *
	 */
	public class RqmtCrt_Upd01 extends MSBCL_RqmtCrtService_MC_A.RqmtCrt_Upd01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			editUp(up0());
			delItmOrd(up0());
			delRqmt(up0());

			MCList<RqmtCrt_Calc01_Dtl1R> up1L = MCList.create(RqmtCrt_Calc01_Dtl1R.class);
			//日ばらし区分１の対象データ抽出
			up1L.addAll(getPlnList());

			//日ばらし区分２の対象データ抽出
			up1L.addAll(getProdQtyList());

			//日ばらし区分３の対象データ抽出
			up1L.addAll(getWkDayList());

			//日ばらし計算
			if (up1L.size() > 0) {

				MCList<RqmtCrt_Calc01_Dtl1R> notUp1L = MCList.create(RqmtCrt_Calc01_Dtl1R.class);
				MSBCL_RqmtCrtService.RqmtCrt_Calc01 ocalServe = MSBCL_RqmtCrtService
						.crtRqmtCrt_Calc01();

				ocalServe.up0().ac_cl_day(getCo().ac_cl_day());
				ocalServe.up0().ac_cl_mon_base(getCo().ac_cl_mon_base());

				for (RqmtCrt_Calc01_Dtl1R up1R : up1L) {
					//生産計画立案区分が「2.月次生産依頼機能を使用」である品目を日ばらし処理対象にする。
					if (isSame(up1R.prod_pln_typ(), MAC_PROD_PLN_TYP.MLY_RQMT_USE.value())) {
						ocalServe.up1().add(up1R);
					}
					else {
						notUp1L.add(up1R);
					}
				}

				//生産計画立案区分が「2.月次生産依頼機能を使用」ではない品目をメッセージに出力する。
				for (RqmtCrt_Calc01_Dtl1R notUp1R : notUp1L.groupBy(RqmtCrt_Calc01_Dtl1R.$itm_cd,
						RqmtCrt_Calc01_Dtl1R.$itm_sub1,
						RqmtCrt_Calc01_Dtl1R.$itm_sub2,
						RqmtCrt_Calc01_Dtl1R.$itm_sub3,
						RqmtCrt_Calc01_Dtl1R.$wg_cd
						)) {
					MCMessagePool.add(new MCMessage(notUp1R, null, MSBCL0109,
							toDispItm(notUp1R.itm_cd(), notUp1R.itm_sub1(), notUp1R.itm_sub2(),
									notUp1R.itm_sub3()), notUp1R.wg_cd()));
				}
				notUp1L.clear();

				ocalServe.up2().addAll(getFixRqmt());

				if (ocalServe.up1().size() > 0) {
					ocalServe.exec();
				}

				//日次生産依頼の登録
				if (ocalServe.down0().size() > 0) {

					MCList<Rqmt_Chk01_RsltR> rqmtRegDownL = callRqmtRegSrv(ocalServe.down0());
					
					if (rqmtRegDownL.size() > 0){
						callOrdRegSrv(rqmtRegDownL, ocalServe.down0());
					}
				}
			}
		}

		/**
		 * 上り電文に会計締日・会計月度基準を追加
		 */
		protected void editUp(RqmtCrt_Upd01_CndR up0){
			up0.addNumberColumn(MAM_CO_R.$ac_cl_day);
			up0.addNumberColumn(MAM_CO_R.$ac_cl_mon_base);
			up0.setNumber(MAM_CO_R.$ac_cl_day, getCo().ac_cl_day());
			up0.setNumber(MAM_CO_R.$ac_cl_mon_base, getCo().ac_cl_mon_base());
		}

		/**
		 * 日次生産依頼および先行手配生産依頼を削除
		 */
		protected void delRqmt(RqmtCrt_Upd01_CndR up0) {
			// 削除対象を所要NOでソートしてロック
			executeQuery((MCList<? extends MCRow>) null, MSBCL5080_MST_RQMT_S03(), up0);

			//日次生産依頼を削除
			executeUpdate(MSBCL5080_MST_RQMT_D01(), up0);

			MCList<MST_PRCD_RQMT_R> prRqmt = MCList.create(MST_PRCD_RQMT_R.class);
			executeQuery(prRqmt, MSBCL5080_MST_PRCD_RQMT_S01(), up0());

			//先行手配日次生産依頼については対象のＷＧの全件を削除
			if (!prRqmt.isEmpty()) {
				dbDeleteKey("MSBCL5080_MST_PRCD_RQMT_D01", prRqmt,
						MCQueryApiBuilder.create(MST_PRCD_RQMT_R.create("T")));
			}
		}

		/**
		 * 品目オーダを削除
		 */
		protected void delItmOrd(RqmtCrt_Upd01_CndR up0) {
			//取消対象オーダNOを取得する
			MCList<MST_ITM_ORDER_R> itmOrdL = MCList.create(MST_ITM_ORDER_R.class);

			executeQuery(itmOrdL, MSBCL5080_MST_ITM_ORDER_S01(), up0);

			if (itmOrdL.size() > 0) {
				MSBCL_OrdRegService.Ord_Chk01 oordChk = MSBCL_OrdRegService.crtOrd_Chk01();
				addAll(oordChk.up0(), itmOrdL, createMap_Ord_Upd01_Dtl1R_MST_ITM_ORDER_R());
				setPegNo(oordChk.up0());
				oordChk.exec();

				MSBCL_OrdRegService.Ord_Upd01 oordUpd = MSBCL_OrdRegService.crtOrd_Upd01();
				oordUpd.up0().addAll(oordChk.down0().subList(r -> !r.err_flg()));
				oordUpd.exec();
			}
		}

		/**
		 * 確定済日次生産依頼を抽出
		 */
		protected MCList<RqmtCrt_Calc01_Dtl2R> getFixRqmt() {
			MCList<RqmtCrt_Calc01_Dtl2R> fixL = MCList.create(RqmtCrt_Calc01_Dtl2R.class);
			executeQuery(fixL, MSBCL5080_MST_RQMT_S01(), up0());
			return fixL;
		}

		/**
		 * 日ばらし区分１の対象データ抽出
		 */
		protected MCList<RqmtCrt_Calc01_Dtl1R> getPlnList() {
			MCList<RqmtCrt_Calc01_Dtl1R> plnL = MCList.create(RqmtCrt_Calc01_Dtl1R.class);
			executeQuery(plnL, MSBCL5080_MST_MLY_RQMT_S01(), up0());
			plnL.setString(RqmtCrt_Calc01_Dtl1R.$date_div_typ, MAC_DATE_DIV_TYP.PLN.value());
			return plnL;
		}

		/**
		 * 日ばらし区分２の対象データ抽出
		 */
		protected MCList<RqmtCrt_Calc01_Dtl1R> getProdQtyList() {

			MCList<RqmtCrt_Calc01_Dtl1R> prodQtyL = MCList.create(RqmtCrt_Calc01_Dtl1R.class);
			MCList<RqmtCrt_Calc01_Dtl1R> tmpProdQtyL = MCList.create(RqmtCrt_Calc01_Dtl1R.class);

			executeQuery(tmpProdQtyL, MSBCL5080_MST_MLY_RQMT_S02(), up0());

			for (RqmtCrt_Calc01_Dtl1R mpsGrpR : tmpProdQtyL
					.groupBy(RqmtCrt_Calc01_Dtl1R.$mps_grp_cd)) {

				for (RqmtCrt_Calc01_Dtl1R monsR : tmpProdQtyL.subList(
						RqmtCrt_Calc01_Dtl1R.$mps_grp_cd, mpsGrpR.mps_grp_cd())) {

					MCNumber prodMons = nvl(monsR.rqmt_mons(), MCNumber.ZERO).add(
							nvl(monsR.prcd_mons(), MCNumber.ZERO));
					MCNumber ymCnt = MCNumber.ZERO;
					MCDate tmpYM = monsR.ym();

					while (ymCnt.lte(prodMons)) {
						//年月の稼動日数を取得する
						tmpYM = monsR.ym().addMonth(ymCnt);

						//生産可能数／日
						MCNumber ymdQty = getYmdQty(monsR, tmpYM);
						monsR.prod_qty_by_day(ymdQty);

						RqmtCrt_Calc01_Dtl1R addR = monsR.clone();
						//製造年月
						addR.prod_ym(tmpYM);
						//依頼数に大きい値を設定する。
						// 日ばらし区分が生産可能数ばらしの場合は依頼数を満たせなかった場合でもRqmtCrt_Calc01では警告しない
						addR.qty(getMaxQty());
						addR.date_div_typ(MAC_DATE_DIV_TYP.PROD_QTY.value());

						//リストに追加する
						prodQtyL.add(addR);
						ymCnt = ymCnt.add(MCNumber.ONE);
					}
				}
			}
			return prodQtyL;
		}

		/**
		 * 日ばらし区分３の対象データ抽出
		 */
		protected MCList<RqmtCrt_Calc01_Dtl1R> getWkDayList() {

			MCList<RqmtCrt_Calc01_Dtl1R> wkDayL = MCList.create(RqmtCrt_Calc01_Dtl1R.class);

			executeQuery(wkDayL, MSBCL5080_MST_MLY_RQMT_S03(), up0());
			
			// 日ばらし区分が稼働日ばらしの場合は生産可能数は依頼数/稼働日数とみなす
			// 生産可能数は確定済みの依頼が既にある場合に、その日にさらに按分するかどうかの基準として使う
			for (RqmtCrt_Calc01_Dtl1R r : wkDayL) {
				MCNumber ymWkdays = getWkDaysOfYmFrSt(r.strg_loc_cal_cd(), r.prod_ym(), r.prod_begin_day());
				if (!isNull(ymWkdays) && !(ymWkdays.eq(MCNumber.ZERO))){
					r.prod_qty_by_day(r.qty().divide(ymWkdays, r.dec_place().intValue(), MCNumber.ROUND_UP));
				}
				else {
					r.prod_qty_by_day(MCNumber.ZERO);
				}
				r.date_div_typ(MAC_DATE_DIV_TYP.WK_DAY.value());
			}
			
			return wkDayL;
		}

		/**
		 * 日次生産依頼登録サービスを呼ぶ
		 */
		protected  MCList<Rqmt_Chk01_RsltR> callRqmtRegSrv(MCList<RqmtCrt_Calc01_RsltR> down0) {

			MSBCL_RqmtRegService.Rqmt_Sprt01 opeSpt = MSBCL_RqmtRegService.crtRqmt_Sprt01();
			setPegNo(down0);
			addAll(opeSpt.up0(), down0, createMap_Rqmt_Sprt01_RsltR_RqmtCrt_Calc01_RsltR());
			compSiteCd(opeSpt.up0());
			opeSpt.exec();
			
			down0.addStringColumn("sno1");
			down0.addStringColumn("sno2");
			down0.addStringColumn("sno3");
			down0.addStringColumn("sno4");
			String[] destCols = {"sno1","sno2","sno3","sno4"};
			String[] srcCols = {Rqmt_Sprt01_RsltR.$sno1, Rqmt_Sprt01_RsltR.$sno2, Rqmt_Sprt01_RsltR.$sno3,Rqmt_Sprt01_RsltR.$sno4};
			copyByPegNo(down0, destCols, opeSpt.down0(), srcCols);
			MSBCL_RqmtRegService.Rqmt_Chk01 opeChk = MSBCL_RqmtRegService.crtRqmt_Chk01();
			addAll(opeChk.up0(), down0, createMap_Rqmt_Chk01_RsltR_RqmtCrt_Calc01_RsltR());

			opeChk.up1().file_imp_flg(false);
			opeChk.up1().no_dac_flg(true);
			opeChk.exec();

			if (opeChk.down0().subList(Rqmt_Chk01_RsltR.$err_flg, true).size()>0 ){
				throwUpdErr();
			}

			//日次生産依頼登録サービスの更新を呼び出す
			MSBCL_RqmtRegService.Rqmt_Upd01 opeUpd = MSBCL_RqmtRegService.crtRqmt_Upd01();
			opeUpd.up0().addAll(opeChk.down0());
			opeUpd.exec();
			
			return opeUpd.down0();
		}
		
		protected MCNumber getMaxQty() {
			return new MCNumber(Math.pow(10, (mcframe.commonMA.meta.MA_META.QTY.length() - mcframe.commonMA.meta.MA_META.QTY.scale())) -1);
		}

		/**
		 * オーダ登録サービスを呼ぶ
		 */
		protected void callOrdRegSrv(MCList<Rqmt_Chk01_RsltR> down0, MCList<RqmtCrt_Calc01_RsltR> calDown0) {

			MSBCL_OrdRegService.Ord_Sprt04 oordSprt = MSBCL_OrdRegService
					.crtOrd_Sprt04();
			MCNumber intPegNo = MCNumber.ZERO;
			for (Rqmt_Chk01_RsltR r : down0) {
				if (MAC_RQMT_TYP.isALLOC(r.rqmt_typ()) || !MSC_MRP_TYP.isMRP(r.mrp_typ())) {
					continue;
				}

				else if (!isNullOrNullVal(r.rqst_loc_cd())
						|| !isNullOrNullVal(r.sppl_cd())
						|| !isNullOrNullVal(r.mfg_loc_cd())) {
					Ord_Upd01_Dtl1R sprtR = Ord_Upd01_Dtl1R.create();
					setItmOrdTyp(sprtR, r, calDown0);
					copy(sprtR, r, createMap_Ord_Upd01_Dtl1R_Rqmt_Chk01_RsltR());
					sprtR.peg_no(intPegNo);
					sprtR.setParamRowIndex(intPegNo.intValue());
					oordSprt.up0().add(sprtR);
					intPegNo = intPegNo.add(MCNumber.ONE);
				}
			}
			if (oordSprt.up0().size() > 0) {
				oordSprt.exec();
			}
			if (oordSprt.down0().size() > 0) {
				MSBCL_OrdRegService.Ord_Chk01 oordChk = MSBCL_OrdRegService
						.crtOrd_Chk01();
				addAll(oordChk.up0(), oordSprt.down0(),
						createMap_Ord_Upd01_Dtl1R_Ord_Upd01_Dtl1R());
				if (oordChk.up0().size() > 0) {
					oordChk.exec();
				}
				MSBCL_OrdRegService.Ord_Upd01 oordUpd = MSBCL_OrdRegService
						.crtOrd_Upd01();
				oordUpd.up0().addAll(oordChk.up0().subList(r -> !r.err_flg()));
				oordUpd.exec();
			}
		}


		/**
		 * 工場・物流倉庫ＣＤを補完します。
		 * @param list
		 */
		protected void compSiteCd(MCList<Rqmt_Sprt01_RsltR> list) {
			
			MCList<Rqmt_Sprt01_RsltR> cond
				= list.distinctNE(Rqmt_Sprt01_RsltR.$strg_loc_cd);
			
			MCList<MAM_LOC_R> locL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
			locL_bldr.setSelect(t.loc_cd, t.site_cd);
			locL_bldr.setWhere(t.loc_cd.eq(bind("strg_loc_cd")));
			dbSelect("MSBCL5080_MAM_LOC_S01", locL, locL_bldr, cond);
			MCIndexKey idx = locL.createIndex(MAM_LOC_R.$loc_cd);

			for (Rqmt_Sprt01_RsltR r : list) {
				MAM_LOC_R locR = locL.getFirst(idx, r.strg_loc_cd());
				if (!isNull(locR)) {
					r.site_cd(locR.site_cd());
				}
			}

		}
		protected Map_Rqmt_Sprt01_RsltR_RqmtCrt_Calc01_RsltR<Rqmt_Sprt01_RsltR,RqmtCrt_Calc01_RsltR> createMap_Rqmt_Sprt01_RsltR_RqmtCrt_Calc01_RsltR() {
			return new Map_Rqmt_Sprt01_RsltR_RqmtCrt_Calc01_RsltR<Rqmt_Sprt01_RsltR, RqmtCrt_Calc01_RsltR>();
		}

		public class Map_Rqmt_Sprt01_RsltR_RqmtCrt_Calc01_RsltR<D extends Rqmt_Sprt01_RsltR, S extends RqmtCrt_Calc01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Rqmt_Sprt01_RsltR.$peg_no, RqmtCrt_Calc01_RsltR.$peg_no);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$itm_cd, RqmtCrt_Calc01_RsltR.$itm_cd);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$itm_sub1, RqmtCrt_Calc01_RsltR.$itm_sub1);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$itm_sub2, RqmtCrt_Calc01_RsltR.$itm_sub2);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$itm_sub3, RqmtCrt_Calc01_RsltR.$itm_sub3);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$strg_loc_cd, RqmtCrt_Calc01_RsltR.$strg_loc_cd);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$wg_cd, RqmtCrt_Calc01_RsltR.$wg_cd);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$due_dt, RqmtCrt_Calc01_RsltR.$due_dt);
			}
		}
		//<RqmtCrt_Calc01_RsltRm　→　Rqmt_Chk01_RsltR>
		protected Map_Rqmt_Chk01_RsltR_RqmtCrt_Calc01_RsltR<Rqmt_Chk01_RsltR, RqmtCrt_Calc01_RsltR> createMap_Rqmt_Chk01_RsltR_RqmtCrt_Calc01_RsltR() {
			return new Map_Rqmt_Chk01_RsltR_RqmtCrt_Calc01_RsltR<Rqmt_Chk01_RsltR, RqmtCrt_Calc01_RsltR>();
		}

		//日次生産依頼
		public class Map_Rqmt_Chk01_RsltR_RqmtCrt_Calc01_RsltR<D extends Rqmt_Chk01_RsltR, S extends RqmtCrt_Calc01_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Rqmt_Chk01_RsltR.$peg_no, RqmtCrt_Calc01_RsltR.$peg_no);
				addColumnPathMap(Rqmt_Chk01_RsltR.$mrp_typ, RqmtCrt_Calc01_RsltR.$mrp_typ);
				addColumnPathMap(Rqmt_Chk01_RsltR.$due_dt, RqmtCrt_Calc01_RsltR.$due_dt);
				addColumnPathMap(Rqmt_Chk01_RsltR.$itm_cd, RqmtCrt_Calc01_RsltR.$itm_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$itm_sub1,
						RqmtCrt_Calc01_RsltR.$itm_sub1);
				addColumnPathMap(Rqmt_Chk01_RsltR.$itm_sub2,
						RqmtCrt_Calc01_RsltR.$itm_sub2);
				addColumnPathMap(Rqmt_Chk01_RsltR.$itm_sub3,
						RqmtCrt_Calc01_RsltR.$itm_sub3);
				addColumnPathMap(Rqmt_Chk01_RsltR.$strg_loc_cd,
						RqmtCrt_Calc01_RsltR.$strg_loc_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$wg_cd, RqmtCrt_Calc01_RsltR.$wg_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqmt_qty,
						RqmtCrt_Calc01_RsltR.$rqmt_qty);
				addColumnPathMap(Rqmt_Chk01_RsltR.$mfg_loc_cd,
						RqmtCrt_Calc01_RsltR.$mfg_loc_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sppl_cd, RqmtCrt_Calc01_RsltR.$sppl_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqst_loc_cd,
						RqmtCrt_Calc01_RsltR.$rqst_loc_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqmt_typ,
						RqmtCrt_Calc01_RsltR.$rqmt_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.rqmt_gnrt_typ(MSC_RQMT_GNRT_TYP.DIV.value());
				dest.sno1(src.getString("sno1"));
				dest.sno2(src.getString("sno2"));
				dest.sno3(src.getString("sno3"));
				dest.sno4(src.getString("sno4"));
			}
		}

		//オーダ登録サービス・補完
		protected Map_Ord_Upd01_Dtl1R_Rqmt_Chk01_RsltR<Ord_Upd01_Dtl1R, Rqmt_Chk01_RsltR> createMap_Ord_Upd01_Dtl1R_Rqmt_Chk01_RsltR() {
			return new Map_Ord_Upd01_Dtl1R_Rqmt_Chk01_RsltR<Ord_Upd01_Dtl1R, Rqmt_Chk01_RsltR>();
		}

		public class Map_Ord_Upd01_Dtl1R_Rqmt_Chk01_RsltR<D extends Ord_Upd01_Dtl1R, S extends Rqmt_Chk01_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_cd, Rqmt_Chk01_RsltR.$itm_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub1, Rqmt_Chk01_RsltR.$itm_sub1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub2, Rqmt_Chk01_RsltR.$itm_sub2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub3, Rqmt_Chk01_RsltR.$itm_sub3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_loc_cd,
						Rqmt_Chk01_RsltR.$strg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_loc_cd,
						Rqmt_Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sppl_cd, Rqmt_Chk01_RsltR.$sppl_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_loc_cd,
						Rqmt_Chk01_RsltR.$rqst_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$inst_qty, Rqmt_Chk01_RsltR.$rqmt_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$yield_schd_qty,
						Rqmt_Chk01_RsltR.$rqmt_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$avl_schd_dt, Rqmt_Chk01_RsltR.$due_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$master_dt, Rqmt_Chk01_RsltR.$due_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno1, Rqmt_Chk01_RsltR.$sno1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno2, Rqmt_Chk01_RsltR.$sno2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno3, Rqmt_Chk01_RsltR.$sno3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno4, Rqmt_Chk01_RsltR.$sno4);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqmt_no, Rqmt_Chk01_RsltR.$rqmt_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				dest.ver_no(null);
				dest.po_schd_dt(null);
				dest.mfg_st_schd_dt(null);
				dest.mfg_end_schd_dt(null);
				dest.gi_schd_dt(null);
				dest.strg_schd_dt(null);
				dest.accpt_schd_dt(null);
				dest.insp_st_schd_dt(null);
				dest.insp_end_schd_dt(null);
			}
		}
		protected void setItmOrdTyp(Ord_Upd01_Dtl1R dest, Rqmt_Chk01_RsltR src, MCList<RqmtCrt_Calc01_RsltR> down0) {
			if (!isNullOrNullVal(src.sppl_cd())) {
				dest.itm_ord_typ(MSC_ITM_ORD_TYP.PURC.value());
			}
			else if (!isNullOrNullVal(src.rqst_loc_cd())) {
				dest.itm_ord_typ(MSC_ITM_ORD_TYP.WG_XFR.value());
			}
			else if (!isNullOrNullVal(src.mfg_loc_cd())) {
				RqmtCrt_Calc01_RsltR row = down0.getFirst(RqmtCrt_Calc01_RsltR.$peg_no, src.peg_no()) ;
				if (!isNullOrNullVal(row.mfg_loc_sppl_cd())){
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
				}
				else {
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.MFG.value());
				}
			}
		}

		//オーダ登録サービスのオーダチェック		
		protected Map_Ord_Upd01_Dtl1R_Ord_Upd01_Dtl1R<Ord_Upd01_Dtl1R, Ord_Upd01_Dtl1R> createMap_Ord_Upd01_Dtl1R_Ord_Upd01_Dtl1R() {
			return new Map_Ord_Upd01_Dtl1R_Ord_Upd01_Dtl1R<Ord_Upd01_Dtl1R, Ord_Upd01_Dtl1R>();
		}

		public class Map_Ord_Upd01_Dtl1R_Ord_Upd01_Dtl1R<D extends Ord_Upd01_Dtl1R, S extends Ord_Upd01_Dtl1R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Ord_Upd01_Dtl1R.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ord, Ord_Upd01_Dtl1R.$ord);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_lg_grp_cd,
						Ord_Upd01_Dtl1R.$strg_lg_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_sppl_cd,
						Ord_Upd01_Dtl1R.$strg_sppl_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_sppl_cd,
						Ord_Upd01_Dtl1R.$mfg_sppl_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_maker_cd,
						Ord_Upd01_Dtl1R.$mfg_maker_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_to_lg_grp_cd,
						Ord_Upd01_Dtl1R.$rqst_to_lg_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$unit_cd, Ord_Upd01_Dtl1R.$unit_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$not_fix_flg,
						Ord_Upd01_Dtl1R.$not_fix_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_lg_grp_cd,
						Ord_Upd01_Dtl1R.$rqst_lg_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$dec_place, Ord_Upd01_Dtl1R.$dec_place);
				
			}

			@Override
			protected void valueCopy(D dest, S src) {
				dest.mrp_typ(MSC_MRP_TYP.MRP.value());
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.ord_gnrt_typ(MSC_ORD_GNRT_TYP.MNL.value());
				dest.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.OPN.value());
				dest.lmt_dt(null);
				dest.not_fix_flg(false);
				dest.inst_po_cnt_rmrks(null);
				dest.oper_ord_pr_flg(true);
				dest.io_schd_pr_flg(true);
			}
		}

		//オーダ登録サービスのオーダチェック
		protected Map_Ord_Upd01_Dtl1R_Ord_Upd01_Dtl1R<Ord_Upd01_Dtl1R, Ord_Upd01_Dtl1R> createMap_Ord_Upd01_Dtl1R_Ord_Upd01_Dtl1R2() {
			return new Map_Ord_Upd01_Dtl1R_Ord_Upd01_Dtl1R<Ord_Upd01_Dtl1R, Ord_Upd01_Dtl1R>();
		}

		public class Map_Ord_Upd01_Dtl1R_Ord_Upd01_Dtl1R2<D extends Ord_Upd01_Dtl1R, S extends Ord_Upd01_Dtl1R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Ord_Upd01_Dtl1R.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ord, Ord_Upd01_Dtl1R.$ord);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_lg_grp_cd,
						Ord_Upd01_Dtl1R.$strg_lg_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_sppl_cd,
						Ord_Upd01_Dtl1R.$strg_sppl_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_sppl_cd,
						Ord_Upd01_Dtl1R.$mfg_sppl_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_maker_cd,
						Ord_Upd01_Dtl1R.$mfg_maker_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_to_lg_grp_cd,
						Ord_Upd01_Dtl1R.$rqst_to_lg_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$unit_cd, Ord_Upd01_Dtl1R.$unit_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$not_fix_flg,
						Ord_Upd01_Dtl1R.$not_fix_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$oper_ord_pr_flg,
						Ord_Upd01_Dtl1R.$oper_ord_pr_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$io_schd_pr_flg,
						Ord_Upd01_Dtl1R.$io_schd_pr_flg);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_lg_grp_cd,
						Ord_Upd01_Dtl1R.$rqst_lg_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$dec_place, Ord_Upd01_Dtl1R.$dec_place);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				dest.mrp_typ(MSC_MRP_TYP.MRP.value());
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.itm_ord_no(null);
				dest.ord_gnrt_typ(MSC_ORD_GNRT_TYP.MNL.value());
				dest.lmt_dt(null);
				dest.not_fix_flg(false);
				dest.inst_po_cnt_rmrks(null);
				dest.sim_mrp_no(null);
				dest.oper_ord_pr_flg(true);
				dest.io_schd_pr_flg(true);
			}
		}

		protected Map_Ord_Upd01_Dtl1R_MST_ITM_ORDER_R<Ord_Upd01_Dtl1R, MST_ITM_ORDER_R> createMap_Ord_Upd01_Dtl1R_MST_ITM_ORDER_R() {
			return new Map_Ord_Upd01_Dtl1R_MST_ITM_ORDER_R<Ord_Upd01_Dtl1R, MST_ITM_ORDER_R>();
		}

		public class Map_Ord_Upd01_Dtl1R_MST_ITM_ORDER_R<D extends Ord_Upd01_Dtl1R, S extends MST_ITM_ORDER_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, MST_ITM_ORDER_R.$itm_ord_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				dest.mrp_typ(MSC_MRP_TYP.MRP.value());
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}

		/**
		 * 生産開始日からカレンダと年月より稼動日数を取得
		 */
		protected MCNumber getWkDaysOfYmFrSt(String calCd, MCDate ym, MCNumber stday) {
			
			MCDate start = getYmStDt(ym);
			MCDate end = getYmEndDt(ym);

			if (isNull(stday)) {
				return getCalDays(start, end, calCd);
			}
			//日ばらし開始日が31や99など、月末日の数字よりも大きい場合
			if (stday.gt(start.endOfMonth().getDay())) {
				return getCalDays(start.endOfMonth(), end, calCd);
			} 
			//日ばらし開始日の数字が、対象年月の開始日の数字よりも小さい場合
			else if (stday.lt(start.getDay())) {
				return getCalDays(end.startOfMonth().addDay(stday.subtract(MCNumber.ONE)), end, calCd);
			} 
			//日ばらし開始日の数字が、対象年月の開始日の数字以上である場合
			else {
				return getCalDays(start.startOfMonth().addDay(stday.subtract(MCNumber.ONE)), end, calCd);
			}
		}

		/**
		 * 日毎の生産可能数を取得
		 */
		protected MCNumber getYmdQty(RqmtCrt_Calc01_Dtl1R monData, MCDate ym) {
			MCNumber ymdQty = MCNumber.ZERO;
			switch (ym.getMonth()) {
				case MCDate.JAN:
					ymdQty = monData.mon01_prod_qty();
					break;
				case MCDate.FEB:
					ymdQty = monData.mon02_prod_qty();
					break;
				case MCDate.MAR:
					ymdQty = monData.mon03_prod_qty();
					break;
				case MCDate.APR:
					ymdQty = monData.mon04_prod_qty();
					break;
				case MCDate.MAY:
					ymdQty = monData.mon05_prod_qty();
					break;
				case MCDate.JUN:
					ymdQty = monData.mon06_prod_qty();
					break;
				case MCDate.JUL:
					ymdQty = monData.mon07_prod_qty();
					break;
				case MCDate.AUG:
					ymdQty = monData.mon08_prod_qty();
					break;
				case MCDate.SEP:
					ymdQty = monData.mon09_prod_qty();
					break;
				case MCDate.OCT:
					ymdQty = monData.mon10_prod_qty();
					break;
				case MCDate.NOV:
					ymdQty = monData.mon11_prod_qty();
					break;
				case MCDate.DEC:
					ymdQty = monData.mon12_prod_qty();
					break;
			}
			return ymdQty;
		}
	}

	/**
	 * RqmtCrt_Calc01オペレーション.<p>
	 *
	 */
	public class RqmtCrt_Calc01 extends MSBCL_RqmtCrtService_MC_A.RqmtCrt_Calc01 {
		/** カレンダーリスト */
		protected MCList<MCRow> _calL = MCList.create(MCRow.class);
		/** カレンダーリストインデックス */
		protected MCIndexKey _calIndexKey;
		/** 日次生産依頼作成対象リスト */
		protected MCList<RqmtCrt_Calc01_RsltR> _rqmtRegL = MCList.create(RqmtCrt_Calc01_RsltR.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			//日ばらし・週ばらし・旬ばらし・月ばらしに分割
			MCList<RqmtCrt_Calc01_Dtl1R> dayL = MCList.create(RqmtCrt_Calc01_Dtl1R.class);
			MCList<RqmtCrt_Calc01_Dtl1R> weekL = MCList.create(RqmtCrt_Calc01_Dtl1R.class);
			MCList<RqmtCrt_Calc01_Dtl1R> periodL = MCList.create(RqmtCrt_Calc01_Dtl1R.class);
			MCList<RqmtCrt_Calc01_Dtl1R> monthL = MCList.create(RqmtCrt_Calc01_Dtl1R.class);

			makeCal(up1());
			ajustRqmtQty(up2(), up1());

			getDivList(up1(), dayL, weekL, periodL, monthL);

			if (dayL.size() > 0) {
				getDayDivL(up2(), dayL);
			}
			if (weekL.size() > 0) {
				getWeekDivL(up2(), weekL);
			}
			if (periodL.size() > 0) {
				getPeriodDivL(up2(), periodL);
			}
			if (monthL.size() > 0) {
				getMonthDivL(up2(), monthL);
			}

			down0().setAll(_rqmtRegL);
		}

		/**
		 * 日ばらしリストを取得するL
		 */
		protected void getDayDivL(MCList<RqmtCrt_Calc01_Dtl2R> up2,
				MCList<RqmtCrt_Calc01_Dtl1R> dayL) {
			MCList<RqmtCrt_Calc01_WkR> prodL = MCList.create(RqmtCrt_Calc01_WkR.class);

			getDayDivProdL(dayL, prodL);

			MCIndexKey prodLIndexKey = prodL.createIndex(RqmtCrt_Calc01_WkR.$mps_grp_cd,
					RqmtCrt_Calc01_WkR.$prod_dt);
			MCIndexKey fixedLindexKey = up2.createIndex(RqmtCrt_Calc01_Dtl2R.$mps_grp_cd,
					RqmtCrt_Calc01_Dtl2R.$due_dt);

			//ＭＰＳグループ
			for (RqmtCrt_Calc01_Dtl1R wkR : dayL.groupBy(RqmtCrt_Calc01_Dtl1R.$mps_grp_cd)) {

				MCList<RqmtCrt_Calc01_Dtl1R> wkL = dayL.subList(
						RqmtCrt_Calc01_Dtl1R.$mps_grp_cd, wkR.mps_grp_cd());

				MCIndexKey wkLIndexKey = wkL.createIndex(
						RqmtCrt_Calc01_Dtl1R.$mps_grp_cd, RqmtCrt_Calc01_Dtl1R.$prod_ym);

				MCSortPolicy sortWkL = new MCSortPolicy();
				sortWkL.add(SortType.ASC, RqmtCrt_Calc01_Dtl1R.$prod_ym);
				wkL.sort(sortWkL);

				//依頼リストの年月毎に処理する
				for (RqmtCrt_Calc01_Dtl1R dtR : wkL.groupBy(RqmtCrt_Calc01_Dtl1R.$prod_ym)) {

					MCDate start = getYmStDt(dtR.prod_ym());
					MCDate end = getYmEndDt(dtR.prod_ym());
					MCDate wkdt = start;

					//生産年月の月初から月末まで処理する
					while (wkdt.lte(end)) {//日毎に
						
						//当該日付、ＭＰＳグループの生産可能枠レコードを「生産可能枠」から抽出する
						RqmtCrt_Calc01_WkR prodR = prodL.getFirst(prodLIndexKey,
								wkR.mps_grp_cd(), wkdt);

						if (isNull(prodR)
								|| isSame(prodR.prod_qty_by_day(), MCNumber.ZERO)) {
							wkdt = wkdt.addDay(1);
							continue;
						}

						//「確定済み日次生産依頼」から当該日付と納期が等しく、ＭＰＳグループが等しいレコードを抽出する
						MCNumber fixedQty = MCNumber.ZERO;
						MCList<RqmtCrt_Calc01_Dtl2R> fixedL = up2().subList(
								fixedLindexKey, wkR.mps_grp_cd(), wkdt);
						for (RqmtCrt_Calc01_Dtl2R r : fixedL) {
							fixedQty = fixedQty.add(r.rqmt_qty());
						}

						//日ばらし区分が稼働日ばらしでない場合、かつ生産可能数＜確定した日次生産依頼の合計数量の場合、次の日付に進む
						//日ばらし区分が稼働日ばらしの場合、生産可能数を考慮しないため
						RqmtCrt_Calc01_Dtl1R protoRqstR = wkL.getFirst(wkLIndexKey, wkR.mps_grp_cd(), dtR.prod_ym());
						if (!MAC_DATE_DIV_TYP.isWK_DAY(protoRqstR.date_div_typ()) && prodR.prod_qty_by_day().lt(fixedQty)) {
							wkdt = wkdt.addDay(1);
							continue;
						}

						//【依頼リスト:rqmtWkL】からループ要素の日付で生産依頼作成対象の依頼品目を抽出する（依頼数が０も抽出しない）
						MCList<RqmtCrt_Calc01_Dtl1R> rqmtWkL = MCList.create(RqmtCrt_Calc01_Dtl1R.class);
						MCList<RqmtCrt_Calc01_Dtl1R> tmprqmtWkL = wkL.subList(
								wkLIndexKey, wkR.mps_grp_cd(), dtR.prod_ym());

						for (RqmtCrt_Calc01_Dtl1R tmpR : tmprqmtWkL) {
							//生産開始日付を取得する
							MCDate prodBeginDate = calcProdBeginDate(tmpR, start, end);
							
							if (isSame(tmpR.qty(), MCNumber.ZERO)) {
								//依頼数が０も抽出しない
								continue;
							}
							//生産開始日付より前の日付の場合は対象としない
							else if (!isNull(prodBeginDate) && prodBeginDate.gt(wkdt)) {
								continue;
							}
							rqmtWkL.add(tmpR);
						}

						//抽出結果のリストが無ければ（すべて割当終わったら）、次のＭＰＳグループに進む
						if (!rqmtWkL.isEmpty()) {
							MCList<RqmtCrt_Calc01_WkR> possProdL = MCList
									.create(RqmtCrt_Calc01_WkR.class);

							//生産可能数リストを設定
							setPossProdL(wkdt, prodR, rqmtWkL, possProdL);

							//「確定日次生産依頼リスト」の依頼数より生産可能数リストを更新
							ajustByFixedPossProdL(fixedL, possProdL);

							//抽出した「依頼リスト」依頼数＜「生産可能リスト」生産可能数の場合
							//（生産可能数＞依頼数のみとなるまで）繰り返す
							setRqmtQty(wkdt, rqmtWkL, possProdL);
						}
						wkdt = wkdt.addDay(1);
					}
				}
			}
			setNoDivMsg(dayL);
		}

		/**
		 * 週ばらしリストの取得
		 */
		protected void getWeekDivL(MCList<RqmtCrt_Calc01_Dtl2R> up2,
				MCList<RqmtCrt_Calc01_Dtl1R> weekL) {

			MCList<RqmtCrt_Calc01_WkR> prodWeekL = MCList
					.create(RqmtCrt_Calc01_WkR.class);

			getWeekDivProdL(weekL, prodWeekL);

			MCIndexKey prodWeekLIndexKey = prodWeekL.createIndex(
					RqmtCrt_Calc01_WkR.$mps_grp_cd, RqmtCrt_Calc01_WkR.$prod_dt);

			MCIndexKey fixedLindexKey = up2.createIndex(RqmtCrt_Calc01_Dtl2R.$mps_grp_cd,
					RqmtCrt_Calc01_Dtl2R.$due_dt);

			//ＭＰＳグループ
			for (RqmtCrt_Calc01_Dtl1R wkR : weekL
					.groupBy(RqmtCrt_Calc01_Dtl1R.$mps_grp_cd)) {

				MCList<RqmtCrt_Calc01_Dtl1R> wkL = weekL.subList(
						RqmtCrt_Calc01_Dtl1R.$mps_grp_cd, wkR.mps_grp_cd());

				MCIndexKey wkLIndexKey = wkL.createIndex(
						RqmtCrt_Calc01_Dtl1R.$mps_grp_cd, RqmtCrt_Calc01_Dtl1R.$prod_ym);

				MCSortPolicy sortWkL = new MCSortPolicy();
				sortWkL.add(SortType.ASC, RqmtCrt_Calc01_Dtl1R.$prod_ym);
				wkL.sort(sortWkL);
				//依頼リストの年月毎に処理する
				for (RqmtCrt_Calc01_Dtl1R dtR : wkL
						.groupBy(RqmtCrt_Calc01_Dtl1R.$prod_ym)) {

					MCDate start = getYmStDt(dtR.prod_ym());
					MCDate end = getYmEndDt(dtR.prod_ym());
					MCDate wkdt = start;

					//生産年月の月初から月末まで処理する
					while (wkdt.lte(end)) {
						//当該日付、ＭＰＳグループの生産可能枠レコードを「生産可能枠」から抽出する
						RqmtCrt_Calc01_WkR prodWeekR = prodWeekL.getFirst(
								prodWeekLIndexKey, wkR.mps_grp_cd(), wkdt);

						if (isNull(prodWeekR)
								|| isSame(prodWeekR.prod_qty_by_day(), MCNumber.ZERO)) {
							wkdt = wkdt.addDay(1);
							continue;
						}

						//「確定済み日次生産依頼」から当該日付と納期が等しく、ＭＰＳグループが等しいレコードを抽出する
						MCNumber fixedQty = MCNumber.ZERO;
						MCList<RqmtCrt_Calc01_Dtl2R> fixedWeekL = up2().subList(
								fixedLindexKey, wkR.mps_grp_cd(), wkdt);
						for (RqmtCrt_Calc01_Dtl2R r : fixedWeekL) {
							fixedQty = fixedQty.add(r.rqmt_qty());
						}

						//日ばらし区分が稼働日ばらしでない場合、かつ生産可能数＜確定した日次生産依頼の合計数量の場合、次の日付に進む
						//日ばらし区分が稼働日ばらしの場合、生産可能数を考慮しないため
						RqmtCrt_Calc01_Dtl1R protoRqstR = wkL.getFirst(wkLIndexKey, wkR.mps_grp_cd(), dtR.prod_ym());
						if (!MAC_DATE_DIV_TYP.isWK_DAY(protoRqstR.date_div_typ()) && prodWeekR.prod_qty_by_day().lt(fixedQty)) {
							wkdt = wkdt.addDay(1);
							continue;
						}

						//【依頼リスト:rqmtWkL】からループ要素の日付で生産依頼作成対象の依頼品目を抽出する（依頼数が０も抽出しない）
						MCList<RqmtCrt_Calc01_Dtl1R> rqmtWkL = MCList
								.create(RqmtCrt_Calc01_Dtl1R.class);

						MCList<RqmtCrt_Calc01_Dtl1R> tmpRqmtWkL = wkL.subList(
								wkLIndexKey, wkR.mps_grp_cd(), dtR.prod_ym());

						for (RqmtCrt_Calc01_Dtl1R tmpR : tmpRqmtWkL) {
							//生産開始日付を取得する
							MCDate prodBeginDate = calcProdBeginDate(tmpR, start, end);
							
							if (isSame(tmpR.qty(), MCNumber.ZERO)) {
								continue;
							}
							else if (!isNull(tmpR.prod_begin_day())
									&& prodBeginDate.gte(getPeriodEndDt(wkdt, MAC_PERIOD_TYP.WEEKLY.value(), getCo().ac_cl_day()))) {
								continue;
							}
							rqmtWkL.add(tmpR);
						}

						if (!rqmtWkL.isEmpty()){
							MCList<RqmtCrt_Calc01_WkR> possProdWeekL = MCList
									.create(RqmtCrt_Calc01_WkR.class);

							//生産可能数リストを設定
							setPossProdL(wkdt, prodWeekR, rqmtWkL, possProdWeekL);

							//「確定日次生産依頼リスト」の依頼数より生産可能数リストを更新
							ajustByFixedPossProdL(fixedWeekL, possProdWeekL);
	
							//抽出した「依頼リスト」依頼数＜「生産可能リスト」生産可能数の場合
							//（生産可能数＞依頼数のみとなるまで）繰り返す
							setRqmtQty(wkdt, rqmtWkL, possProdWeekL);
						}
						wkdt = wkdt.addDay(1);
					}
				}
			}
			setNoDivMsg(weekL);
		}

		/**
		 * 旬ばらしリストの取得
		 */
		protected void getPeriodDivL(MCList<RqmtCrt_Calc01_Dtl2R> up2,
				MCList<RqmtCrt_Calc01_Dtl1R> periodL) {

			MCList<RqmtCrt_Calc01_WkR> prodPeriodL = MCList
					.create(RqmtCrt_Calc01_WkR.class);

			getPeriodDivProdL(periodL, prodPeriodL);

			MCIndexKey prodPeriodLIndexKey = prodPeriodL.createIndex(
					RqmtCrt_Calc01_WkR.$mps_grp_cd, RqmtCrt_Calc01_WkR.$prod_dt);

			MCIndexKey fixedLindexKey = up2.createIndex(RqmtCrt_Calc01_Dtl2R.$mps_grp_cd,
					RqmtCrt_Calc01_Dtl2R.$due_dt);

			for (RqmtCrt_Calc01_Dtl1R wkR : periodL
					.groupBy(RqmtCrt_Calc01_Dtl1R.$mps_grp_cd)) {

				MCList<RqmtCrt_Calc01_Dtl1R> wkL = periodL.subList(
						RqmtCrt_Calc01_Dtl1R.$mps_grp_cd, wkR.mps_grp_cd());

				MCIndexKey wkLIndexKey = wkL.createIndex(
						RqmtCrt_Calc01_Dtl1R.$mps_grp_cd, RqmtCrt_Calc01_Dtl1R.$prod_ym);

				MCSortPolicy sortWkL = new MCSortPolicy();
				sortWkL.add(SortType.ASC, RqmtCrt_Calc01_Dtl1R.$prod_ym);
				wkL.sort(sortWkL);
				//依頼リストの年月毎に処理する
				for (RqmtCrt_Calc01_Dtl1R dtR : wkL.groupBy(RqmtCrt_Calc01_Dtl1R.$prod_ym)) {

					MCDate start = getYmStDt(dtR.prod_ym());
					MCDate end = getYmEndDt(dtR.prod_ym());
					MCDate wkdt = start;

					//生産年月の月初から月末まで処理する
					while (wkdt.lte(end)) {

						//当該日付、ＭＰＳグループの生産可能枠レコードを「生産可能枠」から抽出する
						RqmtCrt_Calc01_WkR prodPeriodR = prodPeriodL.getFirst(
								prodPeriodLIndexKey, wkR.mps_grp_cd(), wkdt);

						if (isNull(prodPeriodR)
								|| isSame(prodPeriodR.prod_qty_by_day(), MCNumber.ZERO)) {
							wkdt = wkdt.addDay(1);
							continue;
						}

						//「確定済み日次生産依頼」から当該日付と納期が等しく、ＭＰＳグループが等しいレコードを抽出する
						MCNumber fixedQty = MCNumber.ZERO;
						MCList<RqmtCrt_Calc01_Dtl2R> fixedPeriodL = up2().subList(
								fixedLindexKey, wkR.mps_grp_cd(), wkdt);
						for (RqmtCrt_Calc01_Dtl2R r : fixedPeriodL) {
							fixedQty = fixedQty.add(r.rqmt_qty());
						}

						//日ばらし区分が稼働日ばらしでない場合、かつ生産可能数＜確定した日次生産依頼の合計数量の場合、次の日付に進む
						//日ばらし区分が稼働日ばらしの場合、生産可能数を考慮しないため
						RqmtCrt_Calc01_Dtl1R protoRqstR = wkL.getFirst(wkLIndexKey, wkR.mps_grp_cd(), dtR.prod_ym());
						if (!MAC_DATE_DIV_TYP.isWK_DAY(protoRqstR.date_div_typ()) && prodPeriodR.prod_qty_by_day().lt(fixedQty)) {
							wkdt = wkdt.addDay(1);
							continue;
						}
					
						//【依頼リスト:rqmtWkL】からループ要素の日付で生産依頼作成対象の依頼品目を抽出する（依頼数が０も抽出しない）
						MCList<RqmtCrt_Calc01_Dtl1R> rqmtWkL = MCList
								.create(RqmtCrt_Calc01_Dtl1R.class);

						MCList<RqmtCrt_Calc01_Dtl1R> tmpRqmtWkL = wkL.subList(
								wkLIndexKey, wkR.mps_grp_cd(), dtR.prod_ym());

						for (RqmtCrt_Calc01_Dtl1R tmpR : tmpRqmtWkL) {
							//生産開始日付を取得する
							MCDate prodBeginDate = calcProdBeginDate(tmpR, start, end);
							
							if (isSame(tmpR.qty(), MCNumber.ZERO)) {
								//依頼数が０も抽出しない
								continue;
							}
							else if (!isNull(tmpR.prod_begin_day())
									&& prodBeginDate.gte(getPeriodEndDt(wkdt, MAC_PERIOD_TYP.TENDAYS.value(), getCo().ac_cl_day()))) {
								continue;
							}
							rqmtWkL.add(tmpR);
						}

						if (!rqmtWkL.isEmpty()) {
							MCList<RqmtCrt_Calc01_WkR> possProdPeriodL = MCList
									.create(RqmtCrt_Calc01_WkR.class);

							//生産可能数リストを設定
							setPossProdL(wkdt, prodPeriodR, rqmtWkL, possProdPeriodL);

							//「確定日次生産依頼リスト」の依頼数より生産可能数リストを更新
							ajustByFixedPossProdL(fixedPeriodL, possProdPeriodL);

							//抽出した「依頼リスト」依頼数＜「生産可能リスト」生産可能数の場合
							//（生産可能数＞依頼数のみとなるまで）繰り返す
							setRqmtQty(wkdt, rqmtWkL, possProdPeriodL);
						}
						wkdt = wkdt.addDay(1);
					}
				}
			}
			setNoDivMsg(periodL);
		}

		/**
		 * 月ばらしリストの取得
		 */
		protected void getMonthDivL(MCList<RqmtCrt_Calc01_Dtl2R> up2,
				MCList<RqmtCrt_Calc01_Dtl1R> monthL) {

			MCList<RqmtCrt_Calc01_WkR> prodMonthL = MCList
					.create(RqmtCrt_Calc01_WkR.class);

			getMonthDivProdL(monthL, prodMonthL);

			MCIndexKey prodMonthLIndexKey = prodMonthL.createIndex(
					RqmtCrt_Calc01_WkR.$mps_grp_cd, RqmtCrt_Calc01_WkR.$prod_dt);

			MCIndexKey fixedLindexKey = up2.createIndex(RqmtCrt_Calc01_Dtl2R.$mps_grp_cd,
					RqmtCrt_Calc01_Dtl2R.$due_dt);

			//ＭＰＳグループ
			for (RqmtCrt_Calc01_Dtl1R wkR : monthL
					.groupBy(RqmtCrt_Calc01_Dtl1R.$mps_grp_cd)) {

				MCList<RqmtCrt_Calc01_Dtl1R> wkL = monthL.subList(
						RqmtCrt_Calc01_Dtl1R.$mps_grp_cd, wkR.mps_grp_cd());

				MCIndexKey wkLIndexKey = wkL.createIndex(
						RqmtCrt_Calc01_Dtl1R.$mps_grp_cd, RqmtCrt_Calc01_Dtl1R.$prod_ym);

				MCSortPolicy sortWkL = new MCSortPolicy();
				sortWkL.add(SortType.ASC, RqmtCrt_Calc01_Dtl1R.$prod_ym);
				wkL.sort(sortWkL);
				//依頼リストの年月毎に処理する（依頼リスト
				for (RqmtCrt_Calc01_Dtl1R dtR : wkL
						.groupBy(RqmtCrt_Calc01_Dtl1R.$prod_ym)) {

					MCDate start = getYmStDt(dtR.prod_ym());
					MCDate wkdt = start;

					//当該日付、ＭＰＳグループの生産可能枠レコードを「生産可能枠」から抽出する
					RqmtCrt_Calc01_WkR prodMonthR = prodMonthL.getFirst(
							prodMonthLIndexKey, wkR.mps_grp_cd(), wkdt);

					if (isNull(prodMonthR)
							|| isSame(prodMonthR.prod_qty_by_day(), MCNumber.ZERO)) {
						wkdt = wkdt.addDay(1);
						continue;
					}

					//「確定済み日次生産依頼」から当該日付と納期が等しく、ＭＰＳグループが等しいレコードを抽出する
					MCNumber fixedQty = MCNumber.ZERO;
					MCList<RqmtCrt_Calc01_Dtl2R> fixedMonthL = up2().subList(
							fixedLindexKey, wkR.mps_grp_cd(), wkdt);
					for (RqmtCrt_Calc01_Dtl2R r : fixedMonthL) {
						fixedQty = fixedQty.add(r.rqmt_qty());
					}

					//日ばらし区分が稼働日ばらしでない場合、かつ生産可能数＜確定した日次生産依頼の合計数量の場合、次の日付に進む
					//日ばらし区分が稼働日ばらしの場合、生産可能数を考慮しないため
					RqmtCrt_Calc01_Dtl1R protoRqstR = wkL.getFirst(wkLIndexKey, wkR.mps_grp_cd(), dtR.prod_ym());
					if (!MAC_DATE_DIV_TYP.isWK_DAY(protoRqstR.date_div_typ()) && prodMonthR.prod_qty_by_day().lt(fixedQty)) {
						wkdt = wkdt.addDay(1);
						continue;
					}

					//【依頼リスト:rqmtWkL】からループ要素の日付で生産依頼作成対象の依頼品目を抽出する（依頼数が０も抽出しない）
					MCList<RqmtCrt_Calc01_Dtl1R> rqmtWkL = MCList
							.create(RqmtCrt_Calc01_Dtl1R.class);

					MCList<RqmtCrt_Calc01_Dtl1R> tmpRqmtWkL = wkL.subList(wkLIndexKey,
							wkR.mps_grp_cd(), dtR.prod_ym());

					for (RqmtCrt_Calc01_Dtl1R tmpR : tmpRqmtWkL) {
						if (isSame(tmpR.qty(), MCNumber.ZERO)) {
							//依頼数が０も抽出しない
							continue;
						}
						rqmtWkL.add(tmpR);
					}

					if (!rqmtWkL.isEmpty()) {
						MCList<RqmtCrt_Calc01_WkR> possProdMonthL = MCList
								.create(RqmtCrt_Calc01_WkR.class);

						//生産可能数リストを設定
						setPossProdL(wkdt, prodMonthR, rqmtWkL, possProdMonthL);

						//「確定日次生産依頼リスト」の依頼数より生産可能数リストを更新
						ajustByFixedPossProdL(fixedMonthL, possProdMonthL);

						//抽出した「依頼リスト」依頼数＜「生産可能リスト」生産可能数の場合
						//（生産可能数＞依頼数のみとなるまで）繰り返す
						setRqmtQty(wkdt, rqmtWkL, possProdMonthL);
					}
				}
			}
			setNoDivMsg(monthL);
		}

		/**
		 * 年月日の所属年月
		 */
		protected MCDate getProdYm(MCDate dt) {
			return getAcYm(dt);
		}

		/**
		 * 日ばらし区分別のリストを取得
		 */
		protected void getDivList(MCList<RqmtCrt_Calc01_Dtl1R> up1,
				MCList<RqmtCrt_Calc01_Dtl1R> dayL, MCList<RqmtCrt_Calc01_Dtl1R> weekL,
				MCList<RqmtCrt_Calc01_Dtl1R> periodL, MCList<RqmtCrt_Calc01_Dtl1R> monthL) {
			for (RqmtCrt_Calc01_Dtl1R r : up1) {
				if (r.prod_ym().gte(r.ym())
						&& r.prod_ym().lte(
								r.ym().addMonth(r.rqmt_mons()).addMonth(r.prcd_mons())
										.addMonth(-1))) {
					if (r.prod_ym().lt(r.ym().addMonth(r.date_div_mons()))) {
						dayL.add(r);
					}
					else if ((r.prod_ym().gte(r.ym().addMonth(r.date_div_mons())))
							&& (r.prod_ym().lt(r.ym().addMonth(r.date_div_mons())
									.addMonth(r.week_div_mons())))) {
						weekL.add(r);
					}
					else if ((r.prod_ym().gte(r.ym().addMonth(r.date_div_mons())
							.addMonth(r.week_div_mons())))
							&& (r.prod_ym().lt(r.ym().addMonth(r.date_div_mons())
									.addMonth(r.week_div_mons())
									.addMonth(r.period_div_mons())))) {
						periodL.add(r);
					}
					else {
						monthL.add(r);
					}
				}
			}
		}

		/**
		 * 日次生産可能枠を作成
		 */
		protected void getDayDivProdL(MCList<RqmtCrt_Calc01_Dtl1R> dayL,
				MCList<RqmtCrt_Calc01_WkR> prodL) {

			for (RqmtCrt_Calc01_Dtl1R r : dayL.groupBy(RqmtCrt_Calc01_Dtl1R.$mps_grp_cd,
					RqmtCrt_Calc01_Dtl1R.$prod_qty_by_day,
					RqmtCrt_Calc01_Dtl1R.$strg_loc_cal_cd, RqmtCrt_Calc01_Dtl1R.$prod_ym)) {

				MCDate start = getYmStDt(r.prod_ym());
				MCDate end = getYmEndDt(r.prod_ym());
				MCDate dt = start;
				while (dt.lteDate(end)) {
					RqmtCrt_Calc01_WkR wkR = RqmtCrt_Calc01_WkR.create();
					wkR.prod_dt(dt);
					wkR.mps_grp_cd(r.mps_grp_cd());
					if (isOffDay(r.strg_loc_cal_cd(), dt)) {
						wkR.prod_qty_by_day(MCNumber.ZERO);
					}
					else {
						wkR.prod_qty_by_day(r.prod_qty_by_day());
					}
					wkR.strg_loc_cal_cd(r.strg_loc_cal_cd());
					prodL.add(wkR);
					dt = dt.addDay(1);
				}
			}
		}

		/**
		 * 週次生産可能枠を作成
		 */
		protected void getWeekDivProdL(MCList<RqmtCrt_Calc01_Dtl1R> weekL,
				MCList<RqmtCrt_Calc01_WkR> prodWeekL) {

			for (RqmtCrt_Calc01_Dtl1R r : weekL.groupBy(RqmtCrt_Calc01_Dtl1R.$mps_grp_cd,
					RqmtCrt_Calc01_Dtl1R.$prod_qty_by_day,
					RqmtCrt_Calc01_Dtl1R.$strg_loc_cal_cd, RqmtCrt_Calc01_Dtl1R.$prod_ym)) {

				MCDate start = getYmStDt(r.prod_ym());
				MCDate end = getYmEndDt(r.prod_ym());
				MCDate dt = start;

				MCNumber tmpQty = MCNumber.ZERO;
				MCNumber tmpDays = MCNumber.ZERO;
				MCDate tmpDt = start;
				while (dt.lteDate(end)) {
					if (isSame(dt.getDayOfWeek(), MCDate.SUN) || isSame(dt, start)) {
						tmpQty = MCNumber.ZERO;
						tmpDays = MCNumber.ZERO;
						tmpDt = dt;
					}
					if (!isOffDay(r.strg_loc_cal_cd(), dt)) {
						tmpQty = tmpQty.add(r.prod_qty_by_day());
						tmpDays = tmpDays.add(MCNumber.ONE);
					}
					if (isSame(dt.getDayOfWeek(), MCDate.SAT) || isSame(dt, end)) {
						RqmtCrt_Calc01_WkR wkR = RqmtCrt_Calc01_WkR.create();
						wkR.prod_dt(tmpDt);
						wkR.mps_grp_cd(r.mps_grp_cd());
						wkR.strg_loc_cal_cd(r.strg_loc_cal_cd());
						wkR.prod_qty_by_day(tmpQty);
						wkR.prod_days(tmpDays);
						prodWeekL.add(wkR);
					}
					dt = dt.addDay(1);
				}
			}
		}

		/**
		 * 旬次生産可能枠を作成
		 */
		protected void getPeriodDivProdL(MCList<RqmtCrt_Calc01_Dtl1R> periodL,
				MCList<RqmtCrt_Calc01_WkR> prodPeriodL) {

			for (RqmtCrt_Calc01_Dtl1R r : periodL.groupBy(
					RqmtCrt_Calc01_Dtl1R.$mps_grp_cd,
					RqmtCrt_Calc01_Dtl1R.$prod_qty_by_day,
					RqmtCrt_Calc01_Dtl1R.$strg_loc_cal_cd, RqmtCrt_Calc01_Dtl1R.$prod_ym)) {

				MCDate start = getYmStDt(r.prod_ym());
				MCDate end = getYmEndDt(r.prod_ym());
				MCDate dt = start;

				MCNumber tmpQty = MCNumber.ZERO;
				MCNumber tmpDays = MCNumber.ZERO;
				MCDate tmpDt = start;
				while (dt.lteDate(end)) {
					if (isSame(dt.getDay(), 1) || isSame(dt.getDay(), 11)
							|| isSame(dt.getDay(), 21)) {
						tmpQty = MCNumber.ZERO;
						tmpDays = MCNumber.ZERO;
						tmpDt = dt;
					}
					if (!isOffDay(r.strg_loc_cal_cd(), dt)) {
						tmpQty = tmpQty.add(r.prod_qty_by_day());
						tmpDays = tmpDays.add(MCNumber.ONE);
					}
					if (isSame(dt.getDay(), 10) || isSame(dt.getDay(), 20)
							|| isSame(dt, start.endOfMonth())) {
						RqmtCrt_Calc01_WkR wkR = RqmtCrt_Calc01_WkR.create();
						wkR.prod_dt(tmpDt);
						wkR.mps_grp_cd(r.mps_grp_cd());
						wkR.strg_loc_cal_cd(r.strg_loc_cal_cd());
						wkR.prod_qty_by_day(tmpQty);
						wkR.prod_days(tmpDays);
						prodPeriodL.add(wkR);
					}
					dt = dt.addDay(1);
				}
			}
		}

		/**
		 * 月次生産可能枠を作成
		 */
		protected void getMonthDivProdL(MCList<RqmtCrt_Calc01_Dtl1R> monthL,
				MCList<RqmtCrt_Calc01_WkR> prodMonthL) {

			for (RqmtCrt_Calc01_Dtl1R r : monthL.groupBy(
					RqmtCrt_Calc01_Dtl1R.$mps_grp_cd,
					RqmtCrt_Calc01_Dtl1R.$prod_qty_by_day,
					RqmtCrt_Calc01_Dtl1R.$strg_loc_cal_cd, RqmtCrt_Calc01_Dtl1R.$prod_ym)) {

				MCDate start = getYmStDt(r.prod_ym());
				MCDate end = getYmEndDt(r.prod_ym());
				MCDate dt = start;

				MCNumber tmpQty = MCNumber.ZERO;
				MCNumber tmpDays = MCNumber.ZERO;
				RqmtCrt_Calc01_WkR wkR = RqmtCrt_Calc01_WkR.create();
				while (dt.lteDate(end)) {
					if (!isOffDay(r.strg_loc_cal_cd(), dt)) {
						tmpQty = tmpQty.add(r.prod_qty_by_day());
						tmpDays = tmpDays.add(MCNumber.ONE);
					}
					dt = dt.addDay(1);
				}
				wkR.prod_dt(start);
				wkR.mps_grp_cd(r.mps_grp_cd());
				wkR.strg_loc_cal_cd(r.strg_loc_cal_cd());
				wkR.prod_qty_by_day(tmpQty);
				wkR.prod_days(tmpDays);
				prodMonthL.add(wkR);
			}
		}

		/**
		 * 生産依頼数から確定済依頼数量分を減算する
		 */
		protected void ajustRqmtQty(MCList<RqmtCrt_Calc01_Dtl2R> up2,
				MCList<RqmtCrt_Calc01_Dtl1R> rqmtL) {
			up2.sort(RqmtCrt_Calc01_Dtl2R.$mps_grp_cd, RqmtCrt_Calc01_Dtl2R.$itm_cd,
					RqmtCrt_Calc01_Dtl2R.$itm_sub1, RqmtCrt_Calc01_Dtl2R.$itm_sub2,
					RqmtCrt_Calc01_Dtl2R.$itm_sub3, RqmtCrt_Calc01_Dtl2R.$due_dt);

			MCIndexKey rqmtLindexKey = rqmtL.createIndex(
					RqmtCrt_Calc01_Dtl1R.$mps_grp_cd, RqmtCrt_Calc01_Dtl1R.$itm_cd,
					RqmtCrt_Calc01_Dtl1R.$itm_sub1, RqmtCrt_Calc01_Dtl1R.$itm_sub2,
					RqmtCrt_Calc01_Dtl1R.$itm_sub3, RqmtCrt_Calc01_Dtl1R.$prod_ym);

			for (RqmtCrt_Calc01_Dtl2R fixR : up2()) {
				RqmtCrt_Calc01_Dtl1R ajustR = rqmtL.getFirst(rqmtLindexKey,
						fixR.mps_grp_cd(), fixR.itm_cd(), fixR.itm_sub1(),
						fixR.itm_sub2(), fixR.itm_sub3(), getProdYm(fixR.due_dt()));
				if (!isNull(ajustR)) {
					MCNumber diff = ajustR.qty().subtract(fixR.rqmt_qty());
					if (diff.gte(MCNumber.ZERO)){
						ajustR.qty(diff);
					}
					else {
						ajustR.qty(MCNumber.ZERO);
					}
				}
			}
		}

		/**
		 * 指定日の生産可能数リストをセット
		 */
		protected void setPossProdL(MCDate wkdt, RqmtCrt_Calc01_WkR prodR, MCList<RqmtCrt_Calc01_Dtl1R> rqmtWkL, MCList<RqmtCrt_Calc01_WkR> possProdL) {

			MCNumber sumQty = MCNumber.ZERO;
			for (RqmtCrt_Calc01_Dtl1R r : rqmtWkL) {
				RqmtCrt_Calc01_WkR row = RqmtCrt_Calc01_WkR.create();
				row.prod_dt(wkdt);
				row.mps_grp_cd(r.mps_grp_cd());
				row.itm_cd(r.itm_cd());
				row.itm_sub1(r.itm_sub1());
				row.itm_sub2(r.itm_sub2());
				row.itm_sub3(r.itm_sub3());
				row.prod_rate(r.prod_rate());
				row.dec_place(r.dec_place());
				
				if(MAC_DATE_DIV_TYP.isWK_DAY(r.date_div_typ())) {
					//日次の場合はprod_daysがnullなので日数をかけざんしない
					if (isNull(prodR.prod_days())) {
						row.prod_qty_by_day(r.prod_qty_by_day());
					} else {
						row.prod_qty_by_day(r.prod_qty_by_day().multiply(prodR.prod_days()));
					}
				}
				possProdL.add(row);
				sumQty = sumQty.add(r.prod_qty_by_day());
			}
			if (!MAC_DATE_DIV_TYP.isWK_DAY(
					rqmtWkL.getFirst(RqmtCrt_Calc01_WkR.$mps_grp_cd, prodR.mps_grp_cd()).date_div_typ())) {
				divPossProdL(prodR.prod_qty_by_day(), possProdL);
			}
		}

		/**
		 * 確定済日次依頼リストより生産可能数リストを更新
		 */
		protected void ajustByFixedPossProdL(MCList<RqmtCrt_Calc01_Dtl2R> fixedL,
				MCList<RqmtCrt_Calc01_WkR> possProdL) {

			fixedL.sort(SortType.DESC, RqmtCrt_Calc01_Dtl2R.$rqmt_qty);
			MCIndexKey indexKey = possProdL.createIndex(RqmtCrt_Calc01_WkR.$itm_cd,
					RqmtCrt_Calc01_WkR.$itm_sub1, RqmtCrt_Calc01_WkR.$itm_sub2,
					RqmtCrt_Calc01_WkR.$itm_sub3);

			for (RqmtCrt_Calc01_Dtl2R fixR : fixedL) {
				RqmtCrt_Calc01_WkR possProdR = possProdL.getFirst(indexKey,
						fixR.itm_cd(), fixR.itm_sub1(), fixR.itm_sub2(), fixR.itm_sub3());
				MCNumber befTotalQtyByDay = possProdL
						.sum(RqmtCrt_Calc01_WkR.$prod_qty_by_day);

				if (!isNull(possProdR)
						&& !isSame(possProdR.prod_qty_by_day(), MCNumber.ZERO)) {
					if (fixR.rqmt_qty().gt(possProdR.prod_qty_by_day())) {
						//確定品目を除いて、【依頼数ー確定数】を残る品目で再度案分する
						possProdR.prod_qty_by_day(MCNumber.ZERO);
						MCNumber aftTotalQtyByDay = befTotalQtyByDay.subtract(fixR.rqmt_qty());
						if (aftTotalQtyByDay.gt(MCNumber.ZERO)) {
							//生産可能数リストを再案分
							updPossProdL(aftTotalQtyByDay, possProdL);
						}
					}
					else {
						possProdR.prod_qty_by_day(possProdR.prod_qty_by_day().subtract(
								fixR.rqmt_qty()));
					}
				}
			}
		}

		/**
		 * 生産可能数リストの設定
		 */
		protected void updPossProdL(MCNumber totalQty,
				MCList<RqmtCrt_Calc01_WkR> possProdL){
			MCList<RqmtCrt_Calc01_WkR> divL = possProdL.subList(r -> !isSame(r.prod_qty_by_day(), MCNumber.ZERO));
			if (!divL.isEmpty()){
				divPossProdL(totalQty, divL);
			}
		}

		/**
		 * 日ばらし案分比率で生産可能数を案分する 
		 */
		protected void divPossProdL(MCNumber totalQty, MCList<RqmtCrt_Calc01_WkR> possProdL){

			MCSortPolicy sp = new MCSortPolicy();
			sp.add(SortType.ASC, RqmtCrt_Calc01_WkR.$itm_cd);
			sp.add(SortType.ASC, RqmtCrt_Calc01_WkR.$itm_sub1);
			sp.add(SortType.ASC, RqmtCrt_Calc01_WkR.$itm_sub2);
			sp.add(SortType.ASC, RqmtCrt_Calc01_WkR.$itm_sub3);
			possProdL.sort(sp);
			FXUCC_Divide.prop(possProdL,
					totalQty,
					possProdL.get(0).dec_place().intValue(),
					RqmtCrt_Calc01_Dtl1R.$prod_rate,
					RqmtCrt_Calc01_Dtl1R.$prod_qty_by_day
					);
		}

		/**
		 * 生産依頼数算出・依頼登録
		 */
		protected void setRqmtQty(MCDate dueDt, MCList<RqmtCrt_Calc01_Dtl1R> rqmtWkL,
				MCList<RqmtCrt_Calc01_WkR> possProdL) {

			MCSortPolicy sortL = new MCSortPolicy();
			sortL.add(SortType.DESC, RqmtCrt_Calc01_Dtl1R.$prod_rate);
			sortL.add(SortType.ASC, RqmtCrt_Calc01_Dtl1R.$qty);
			sortL.add(SortType.ASC, RqmtCrt_Calc01_Dtl1R.$itm_cd);
			sortL.add(SortType.ASC, RqmtCrt_Calc01_Dtl1R.$itm_sub1);
			sortL.add(SortType.ASC, RqmtCrt_Calc01_Dtl1R.$itm_sub2);
			sortL.add(SortType.ASC, RqmtCrt_Calc01_Dtl1R.$itm_sub3);
			rqmtWkL.sort(sortL);

			boolean isRqmtLtPossProd = true;
			while (isRqmtLtPossProd) {
				isRqmtLtPossProd = isRqmtLtePossProd(dueDt, rqmtWkL, possProdL);
			}
			setRqmtGtPossProd(dueDt, rqmtWkL, possProdL);
		}

		/**
		 * 依頼リスト数量が生産能力より小さい場合、リストを作成
		 */
		protected void setRqmtGtPossProd(MCDate dueDt,
				MCList<RqmtCrt_Calc01_Dtl1R> rqmtWkL, MCList<RqmtCrt_Calc01_WkR> possProdL) {

			MCIndexKey indexkey = possProdL.createIndex(RqmtCrt_Calc01_WkR.$itm_cd,
					RqmtCrt_Calc01_WkR.$itm_sub1, RqmtCrt_Calc01_WkR.$itm_sub2,
					RqmtCrt_Calc01_WkR.$itm_sub3);

			for (RqmtCrt_Calc01_Dtl1R r : rqmtWkL) {

				RqmtCrt_Calc01_WkR row = possProdL.getFirst(indexkey, r.itm_cd(),
						r.itm_sub1(), r.itm_sub2(), r.itm_sub3());

				if (isSame(row.prod_qty_by_day(), MCNumber.ZERO)) {
					continue;
				}

				RqmtCrt_Calc01_RsltR rqmtR = RqmtCrt_Calc01_RsltR.create();
				MCDate tmpRqmtDt = r.ym().addMonth(r.rqmt_mons().subtract(MCNumber.ONE));
				MCDate tmpPrcdDt = tmpRqmtDt.addMonth(r.prcd_mons());

				rqmtR.itm_cd(r.itm_cd());
				rqmtR.itm_sub1(r.itm_sub1());
				rqmtR.itm_sub2(r.itm_sub2());
				rqmtR.itm_sub3(r.itm_sub3());
				rqmtR.strg_loc_cd(r.strg_loc_cd());
				rqmtR.mfg_loc_cd(r.mfg_loc_cd());
				rqmtR.sppl_cd(r.sppl_cd());
				rqmtR.rqst_loc_cd(r.rqst_loc_cd());
				rqmtR.wg_cd(r.wg_cd());
				rqmtR.due_dt(dueDt);
				rqmtR.rqmt_typ(r.rqmt_typ());
				rqmtR.mfg_loc_sppl_cd(r.mfg_loc_sppl_cd());
				if (r.ym().lte(r.prod_ym()) && (r.prod_ym().lte(tmpRqmtDt))) {
					rqmtR.mrp_typ(MSC_MRP_TYP.MRP.value());
				}
				else if (r.prod_ym().gt(tmpRqmtDt) && r.prod_ym().lte(tmpPrcdDt)) {
					rqmtR.mrp_typ(MSC_MRP_TYP.PRCD.value());
				}
				rqmtR.rqmt_qty(row.prod_qty_by_day());
				//依頼リストの依頼数を減算する
				r.qty(r.qty().subtract(row.prod_qty_by_day()));
				//生産可能数リスト対象行の数量をゼロへ
				row.prod_qty_by_day(MCNumber.ZERO);

				_rqmtRegL.add(rqmtR);
			}
		}

		/**
		 * 依頼リスト数量が生産能力より大きい場合、リストを作成
		 */
		protected boolean isRqmtLtePossProd(MCDate dueDt,
				MCList<RqmtCrt_Calc01_Dtl1R> rqmtWkL, MCList<RqmtCrt_Calc01_WkR> possProdL) {

			MCIndexKey indexkey = possProdL.createIndex(RqmtCrt_Calc01_WkR.$itm_cd,
					RqmtCrt_Calc01_WkR.$itm_sub1, RqmtCrt_Calc01_WkR.$itm_sub2,
					RqmtCrt_Calc01_WkR.$itm_sub3);

			for (RqmtCrt_Calc01_Dtl1R r : rqmtWkL) {
				RqmtCrt_Calc01_WkR row = possProdL.getFirst(indexkey, r.itm_cd(),
						r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (isSame(row.prod_qty_by_day(), MCNumber.ZERO)) {
					continue;
				}
				if (row.prod_qty_by_day().gt(r.qty())) {
					RqmtCrt_Calc01_RsltR rqmtR = RqmtCrt_Calc01_RsltR.create();
					MCDate tmpRqmtDt = r.ym().addMonth(
							r.rqmt_mons().subtract(MCNumber.ONE));
					MCDate tmpPrcdDt = tmpRqmtDt.addMonth(r.prcd_mons());

					rqmtR.itm_cd(r.itm_cd());
					rqmtR.itm_sub1(r.itm_sub1());
					rqmtR.itm_sub2(r.itm_sub2());
					rqmtR.itm_sub3(r.itm_sub3());
					rqmtR.strg_loc_cd(r.strg_loc_cd());
					rqmtR.mfg_loc_cd(r.mfg_loc_cd());
					rqmtR.sppl_cd(r.sppl_cd());
					rqmtR.rqst_loc_cd(r.rqst_loc_cd());
					rqmtR.wg_cd(r.wg_cd());
					rqmtR.due_dt(dueDt);
					rqmtR.rqmt_typ(r.rqmt_typ());
					rqmtR.mfg_loc_sppl_cd(r.mfg_loc_sppl_cd());
					if (r.ym().lte(r.prod_ym()) && (r.prod_ym().lte(tmpRqmtDt))) {
						rqmtR.mrp_typ(MSC_MRP_TYP.MRP.value());
					}
					else if (r.prod_ym().gt(tmpRqmtDt) && r.prod_ym().lte(tmpPrcdDt)) {
						rqmtR.mrp_typ(MSC_MRP_TYP.PRCD.value());
					}
					rqmtR.rqmt_qty(r.qty());
					//生産可能数リストを再度案分する
					row.prod_qty_by_day(row.prod_qty_by_day().subtract(r.qty()));
					//依頼リストの依頼数を減算する(zero)
					r.qty(MCNumber.ZERO);
					MCNumber TotalQtyByDay = possProdL.sum(RqmtCrt_Calc01_WkR.$prod_qty_by_day);
					//対象品目の生産可能数リストの生産可能数をゼロにする
					row.prod_qty_by_day(MCNumber.ZERO);
					updPossProdL(TotalQtyByDay, possProdL);
					_rqmtRegL.add(rqmtR);

					return true;
				}
				else {
					continue;
				}
			}
			return false;
		}

		/**
		 * 未割付け分の処理
		 */
		protected void setNoDivMsg(MCList<RqmtCrt_Calc01_Dtl1R> rqstL) {
			for (RqmtCrt_Calc01_Dtl1R wkR : rqstL) {
				// 計画ばらしの場合は、依頼数と生産可能数を元にばらすので、依頼数を満たさない場合に警告メッセージをだす
				if (!isSame(wkR.qty(), MCNumber.ZERO) && MAC_DATE_DIV_TYP.isPLN(wkR.date_div_typ())) {
					MCMessagePool.add(new MCMessage(wkR, null, MSBCL0085,
							toDispItm(wkR.itm_cd(), wkR.itm_sub1(), wkR.itm_sub2(),
									wkR.itm_sub3()), wkR.mps_grp_cd(), toY2MString(wkR.prod_ym()), wkR.qty()));
				}
			}
		}

		/**
		 * 生産依頼よりカレンダーリストを作成
		 */
		protected void makeCal(MCList<RqmtCrt_Calc01_Dtl1R> plnL) {

			for (RqmtCrt_Calc01_Dtl1R plnR : plnL.groupBy(
					RqmtCrt_Calc01_Dtl1R.$strg_loc_cal_cd, RqmtCrt_Calc01_Dtl1R.$prod_ym)) {
				MCList<MCRow> tmpCal = MCList.create(MCRow.class);
				MCDate start = getYmStDt(plnR.prod_ym());
				MCDate end = getYmEndDt(plnR.prod_ym());
				MCDate dt = start;

				MCList<MAM_CAL_R> mcalL = MCList.create(MAM_CAL_R.class);
				MAM_CAL_R t1 = MAM_CAL_R.create("T");
				MCQueryApiBuilder mcalL_bldr = MCQueryApiBuilder.create(t1);
				mcalL_bldr.addWhereWithAnd(t1.cal_cd.eq(bind("1")),
						plnR.strg_loc_cal_cd());
				mcalL_bldr.addWhereWithAnd(t1.st_dt.lte(bind("1")), end);
				mcalL_bldr.addWhereWithAnd(t1.end_dt.gte(bind("1")), start);
				mcalL_bldr.addOrderByAsc(t1.st_dt);
				dbSelect("MSBCL5080_MAM_CAL_S01", mcalL, mcalL_bldr);

				MCList<MAM_CAL_EXT_R> mcalexL = MCList.create(MAM_CAL_EXT_R.class);
				MAM_CAL_EXT_R t2 = MAM_CAL_EXT_R.create("T");
				MCQueryApiBuilder mcalexL_bldr = MCQueryApiBuilder.create(t2);
				mcalexL_bldr.addWhereWithAnd(t2.cal_cd.eq(bind("1")),
						plnR.strg_loc_cal_cd());
				mcalexL_bldr.addWhereWithAnd(t2.dt.gte(bind("1")), start);
				mcalexL_bldr.addWhereWithAnd(t2.dt.lte(bind("1")), end);
				dbSelect("MSBCL5080_MAM_CAL_EXT_S01", mcalexL, mcalexL_bldr);
				MCIndexKey idx = mcalexL.createIndex(MAM_CAL_EXT_R.$cal_cd, MAM_CAL_EXT_R.$dt);

				for (MAM_CAL_R mcalR : mcalL) {
					while (dt.lte(mcalR.end_dt()) && dt.lte(end)) {
						MCRow calR = MCRow.create();
						calR.addStringColumn("cal_cd", plnR.strg_loc_cal_cd());
						calR.addDateColumn("dt", dt);
						calR.addBooleanColumn("offDay");

						MAM_CAL_EXT_R mcalexR = mcalexL.getFirst(idx, mcalR.cal_cd(), dt);
						if (isNull(mcalexR)) {
							switch (dt.getDayOfWeek()) {
								case MCDate.SUN:
									calR.setBooleanNE("offDay", mcalR.sun_off_flg());
									break;
								case MCDate.MON:
									calR.setBooleanNE("offDay", mcalR.mon_off_flg());
									break;
								case MCDate.TUE:
									calR.setBooleanNE("offDay", mcalR.tue_off_flg());
									break;
								case MCDate.WED:
									calR.setBooleanNE("offDay", mcalR.wed_off_flg());
									break;
								case MCDate.THU:
									calR.setBooleanNE("offDay", mcalR.thu_off_flg());
									break;
								case MCDate.FRI:
									calR.setBooleanNE("offDay", mcalR.fri_off_flg());
									break;
								case MCDate.SAT:
									calR.setBooleanNE("offDay", mcalR.sat_off_flg());
									break;
							}
						}
						else {
							calR.setBooleanNE("offDay", mcalexR.off_flg());
						}
						dt = dt.addDay(1);
						tmpCal.add(calR);
					}
				}
				if (isNull(tmpCal.getFirst("offDay", false))) {
					throw new MCAppException(up0(), null, MSBCL0086, toYMDString(start),
							toYMDString(end), plnR.strg_loc_cal_cd());
				}
				_calL.addAll(tmpCal);
			}

			// インデックス作成
			_calIndexKey = _calL.createIndex("cal_cd", "dt");

		}

		/**
		 * 指定カレンダ・日付の休日判定
		 */
		protected boolean isOffDay(String cal_cd, MCDate dt) {
			MCRow row = _calL.getFirst(_calIndexKey, cal_cd, dt);
			if (!isNull(row)) {
				return row.getBooleanNE("offDay");
			}
			return false;
		}
		
		/**
		 * 日ばらし開始日を考慮し、生産開始日付を計算する
		 */
		protected MCDate calcProdBeginDate(RqmtCrt_Calc01_Dtl1R tmpR, MCDate start, MCDate end) {
			if (tmpR.prod_begin_day().gt(start.endOfMonth().getDay())) {
				return start.endOfMonth();
			} else if (tmpR.prod_begin_day().lt(start.getDay())) {
				return end.startOfMonth().addDay(tmpR.prod_begin_day().subtract(MCNumber.ONE));
			} else {
				return start.startOfMonth().addDay(tmpR.prod_begin_day().subtract(MCNumber.ONE));
			}
		}
	}

	//FMCB CUSTOM END
}