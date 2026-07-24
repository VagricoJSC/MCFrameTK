package mcframe.serverMSBE.MSBEL0020;

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
import static mcframe.serverMSBE.MSBEL0020.Query.*;
import mcframe.commonCore.util.MCCollectionUtil;
import static mcframe.serverMSUC.MSUCL0050.MSUCL_ClUtil.*;

import java.util.List;
import java.util.ArrayList;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_MlyIoStkSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_MlyIoStkSrch_MC extends MSBEL_MlyIoStkSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 指定された締月度、締日の月次受払在庫情報を照会する<br>
	 */
	public class Srch01 extends MSBEL_MlyIoStkSrch_MC_A.Srch01 {
		/** チェック項目（基本品目項目＋画面設定） */
		private String[] _chkCols = null;
		/** グループ化項目（チェック項目＋締月度） */
		private String[] _grpCols = null;
		/** 非表示項目（画面設定の不要項目） */
		private String[] _removeCols = null;
		/** 数量相殺計算結果<br>（「移動・移送入庫」＋「移動・移送返品入庫」＋「転入」ー「移動・移送出庫」ー「移動・移送返品出庫」ー「転出」） */
		private MCNumber _rbValue = null;
		private MCNumber _rbValueAmt = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
			beforeSearchForBizDatDLCmn();
		}

		protected void beforeSearchForBizDatDLCmn() {
			// 品目分類
			up0().itm_grp_flg1(true);
			up0().itm_grp_flg2(true);
			up0().itm_grp_flg3(true);
			up0().itm_grp_flg4(true);
			up0().itm_grp_flg5(true);
			up0().itm_grp_flg6(true);
			up0().itm_grp_flg7(true);
			up0().itm_grp_flg8(true);
			up0().itm_grp_flg9(true);
			up0().itm_grp_flg10(true);
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 検索条件編集
			editUpCond();

			// データを検索する。
			MCQueryPlan mlyStkSql = MSBEL0020_MST_MLY_STK_DTL_S01();
			searchForDL(mlyStkSql, up0(), down0(),
					Srch01_RsltR.$itm_cd,
					Srch01_RsltR.$itm_sub1,
					Srch01_RsltR.$itm_sub2,
					Srch01_RsltR.$itm_sub3);
		}

		public void editUpCond() {
			// 締月度の設定チェック。（念のための処理）
			if (isNull(up0().mly_io_cl_ym_fr())) {
				up0().mly_io_cl_ym_fr(getToday().startOfMonth());
			}
			else {
				up0().mly_io_cl_ym_fr(up0().mly_io_cl_ym_fr().startOfMonth());
			}
			if (isNull(up0().mly_io_cl_ym_to())) {
				up0().mly_io_cl_ym_to(getToday().endOfMonth());
			}
			else {
				up0().mly_io_cl_ym_to(up0().mly_io_cl_ym_to().endOfMonth());
			}

			// 指定締月度ＦＲＯＭより前の計上年月（最新）を取得する。（最初の月初在庫を取得するため）
			MCDate clYm = getStkClYm();
			if (!isNull(clYm) && clYm.lt(up0().mly_io_cl_ym_fr())) {
				up0().last_ac_ym(clYm);
			}
			else {
				up0().last_ac_ym(up0().mly_io_cl_ym_fr().addMonth(-1));
			}

			// 実棚入力可能のみ
			up0().addStringColumn("only_enable_true", toTrueStr(up0().only_enable_flg()));
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			if (down0().isEmpty()) {
				return;
			}
			
			//会社マスタ関連情報をセット
			setBase(down0());

			//標準単価をセット
			setStdUnitCost(down0());

			down0().sort(getGroupByCols());

			// 下り電文の作成（グループ化、数値項目設定）受払区分により、数量項目の分類や出庫計と入庫計の算出
			Srch01_RsltR rsltR = null;
			MCList<Srch01_RsltR> rsltL = MCList.create(Srch01_RsltR.class);
			java.math.RoundingMode baseCurRndTypMode = toRoundingMode(getCo().stk_amt_rnd_typ());
			for (Srch01_RsltR sR : down0()) {
				//在庫金額計算
				sR.stk_amt(sR.std_unit_cost().multiply(sR.base_unit_qty(), sR.base_cur_dec_place().intValue(), baseCurRndTypMode));

				// グループ化キー項目は同じ値の場合、数値項目に値を加算する
				if (isColSame(rsltR, sR, getGroupByCols())) {
					sumToAddedLine(rsltR, sR);
				}
				else {
					// 検索結果のリストに追加
					addRow(rsltR, rsltL);
					// 年月のみ変わった場合、前月の月末在庫を月初在庫に設定する
					if (!isColSame(rsltR, sR, Srch01_RsltR.$mly_io_cl_ym) && isColSame(rsltR, sR, getCngChkCols())) {
						if (isSame(up0().disp_unit(), "AMT")) {
							if (!isSame(rsltR.std_unit_cost(), sR.std_unit_cost())) {
								sR.ini_stk_amt(sR.std_unit_cost().multiply(rsltR.end_stk_qty(), sR.base_cur_dec_place().intValue(), baseCurRndTypMode));
							}
							else {
								sR.ini_stk_amt(rsltR.end_stk_amt());
							}
						}
						sR.ini_stk_qty(rsltR.end_stk_qty());
					}
					// グループ化キー項目が変わった場合、月初在庫は0としておく
					else {
						if (isSame(up0().disp_unit(), "AMT")) {
							sR.ini_stk_amt(MCNumber.ZERO);
						}
						sR.ini_stk_qty(MCNumber.ZERO);
					}
					// 新規行を作成する
					rsltR = createNewLine(sR, getRemoveCols());
				}
			}

			// 検索結果のリストに追加
			addRow(rsltR, rsltL);

			// 下り電文の設定
			down0().setAll(rsltL);
		}

		protected void setBase(MCList<Srch01_RsltR> list){
			list.setString(Srch01_RsltR.$base_cur_cd, getBaseCur().cur_cd());
			list.setString(Srch01_RsltR.$base_cur_nm, getBaseCur().cur_nm());
			list.setNumber(Srch01_RsltR.$base_cur_dec_place, getCo().stk_amt_dec_place());
			list.setString(Srch01_RsltR.$base_cur_rnd_typ, getCo().stk_amt_rnd_typ());
		}
		
		protected void setStdUnitCost(MCList<Srch01_RsltR> list){
			list.setStringNE("stk_std_upri_typ", getCo().stk_std_upri_typ());
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_STD_COST$F_GET_STD_UPRI", "01"), MABCFunction.getFunctionExecuter("MAPA_STD_COST$F_GET_STD_UPRI"), "STD_UNIT_COST", list, "ITM_CD", "ITM_SUB1", "ITM_SUB2", "ITM_SUB3", "MLY_IO_CL_YM", "WG_CD", "STK_STD_UPRI_TYP");
		}
		
		protected java.math.RoundingMode toRoundingMode(String rndTyp) {
			MAC_RND_TYP typ = MAC_RND_TYP.getNE(rndTyp);
			if (typ == null) {
				return null;
			}
			else {
				return typ.toMC();
			}
		}

		/**
		 * 結果レコードに対して、数量の相殺処理を行う。<br>
		 * 「移動・移送入庫」＋「移動・移送返品入庫」＋「転入」ー「移動・移送出庫」ー「移動・移送返品出庫」ー「転出」の数量相殺計算結果が<br>
		 * ・正の場合、数量相殺計算結果を移動・移送入庫とみなす。<br>
		 * ・負の場合、数量相殺計算結果を移動・移送出庫とみなす。<br>
		 * @param dstR 結果レコード
		 */
		protected void doCounterBalance(Srch01_RsltR dstR) {
			if (dstR == null) {
				return;
			}

			// 金額（在庫金額）
			if (isSame(up0().disp_unit(), "AMT") && !isNull(_rbValueAmt)) {
				if (_rbValueAmt.isPositive()) {
					dstR.gr_xfr_amt(MCNumber.sum(dstR.gr_xfr_amt(), _rbValueAmt));
					dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), _rbValueAmt));
				}
				else if (_rbValueAmt.isNegative()) {
					_rbValueAmt = _rbValueAmt.negate();
					dstR.gi_xfr_amt(MCNumber.sum(dstR.gi_xfr_amt(), _rbValueAmt));
					dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), _rbValueAmt));
				}
				_rbValueAmt = null;
			}
			// 在庫数（基準単位）
			if (!isNull(_rbValue)) {
				if (_rbValue.isPositive()) {
					dstR.gr_xfr_qty(MCNumber.sum(dstR.gr_xfr_qty(), _rbValue));
					dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), _rbValue));
				}
				else if (_rbValue.isNegative()) {
					_rbValue = _rbValue.negate();
					dstR.gi_xfr_qty(MCNumber.sum(dstR.gi_xfr_qty(), _rbValue));
					dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), _rbValue));
				}
				_rbValue = null;
			}
		}

		protected Srch01_RsltR createNewLine(Srch01_RsltR sR, String[] removeCols) {
			Srch01_RsltR newR = sR.clone();

			// 数量項目の分類
			if (isSame(up0().disp_unit(), "AMT")) {
				setAmtCtgValue(newR, sR);
			}
			setQtyCtgValue(newR, sR);

			// 非表示項目のクリア
			newR.clear(removeCols);

			return newR;
		}

		protected void sumToAddedLine(Srch01_RsltR dstR, Srch01_RsltR orgR) {
			// 合計項目の加算
			for ( String colName : getSumCols()) {
				dstR.setNumber(colName, MCNumber.sum(dstR.getNumber(colName), orgR.getNumber(colName)));
			}

			// 数量項目の分類
			if (isSame(up0().disp_unit(), "AMT")) {
				setAmtCtgValue(dstR, orgR);
			}
			setQtyCtgValue(dstR, orgR);
		}

		protected void setAmtCtgValue(Srch01_RsltR dstR, Srch01_RsltR orgR) {
			if (dstR == null || orgR == null) {
				return;
			}

			MCNumber addAmtVal = orgR.stk_amt();
			if (isNull(addAmtVal) || addAmtVal.isZero()) {
				return;
			}

			// ---------------------------------- 入庫額 ----------------------------------
			// 入荷額.  （受払区分で判断） 
			if (MSC_IO_ACT_TYP.isARR(orgR.io_act_typ())) {
				if (MSC_STK_ID_TYP.isNCV_RCV(orgR.stk_id_typ())) {                             // 在庫識別区分: 無償受給
					dstR.gr_rcv_amt(MCNumber.sum(dstR.gr_rcv_amt(), addAmtVal));               //           ==> 受給入庫
				}
				else if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(orgR.stk_id_typ())) {                 // 在庫識別区分: 検収不良
					dstR.purc_bf_accpt_amt(MCNumber.sum(dstR.purc_bf_accpt_amt(), addAmtVal)); //           ==> 検収前入荷
				}
				else if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(orgR.stk_id_typ())) {                  // 在庫識別区分: 返品検収前
					dstR.purc_bf_accpt_amt(MCNumber.sum(dstR.purc_bf_accpt_amt(), addAmtVal)); //           ==> 検収前入荷
				}
				else {
					dstR.gr_xfr_amt(MCNumber.sum(dstR.gr_xfr_amt(), addAmtVal));               // 上記以外: 移動・移送入庫
				}

				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 移動・移送入庫額
			if (MSC_IO_ACT_TYP.isXFR_GR(orgR.io_act_typ())) {
				// dstR.gr_xfr_amt(MCNumber.sum(dstR.gr_xfr_amt(), addAmtVal));
				// dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				_rbValueAmt = MCNumber.sum(_rbValueAmt, addAmtVal);
				return;
			}
			// 仕入入庫額
			if (MSC_IO_ACT_TYP.isPURC_GR(orgR.io_act_typ())) {
				dstR.gr_purc_amt(MCNumber.sum(dstR.gr_purc_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 有償受給入庫額
			if (MSC_IO_ACT_TYP.isONR_RCV_GR(orgR.io_act_typ())) {
				dstR.gr_rcv_amt(MCNumber.sum(dstR.gr_rcv_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 仕入返品入庫額
			if (MSC_IO_ACT_TYP.isPURC_RTN_GR(orgR.io_act_typ())) {
				dstR.purc_bf_accpt_amt(MCNumber.sum(dstR.purc_bf_accpt_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 有償受給返品入庫額
			if (MSC_IO_ACT_TYP.isONR_RCV_RET_GR(orgR.io_act_typ())) {
				dstR.purc_bf_accpt_amt(MCNumber.sum(dstR.purc_bf_accpt_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 経費購買入庫額
			if (MSC_IO_ACT_TYP.isXPNS_PURC_GR(orgR.io_act_typ())) {
				dstR.gr_purc_amt(MCNumber.sum(dstR.gr_purc_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 経費購買返品入庫額
			if (MSC_IO_ACT_TYP.isXPNS_PURC_RTN_GR(orgR.io_act_typ())) {
				dstR.purc_bf_accpt_amt(MCNumber.sum(dstR.purc_bf_accpt_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 検収不良入庫額
			if (MSC_IO_ACT_TYP.isACCPT_DFCT_GR(orgR.io_act_typ())) {
				dstR.accpt_dfct_amt(MCNumber.sum(dstR.accpt_dfct_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 製造額
			if (MSC_IO_ACT_TYP.isMFG(orgR.io_act_typ())) {
				dstR.gr_prod_amt(MCNumber.sum(dstR.gr_prod_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 副産品製造額
			if (MSC_IO_ACT_TYP.isBYMFG(orgR.io_act_typ())) {
				dstR.gr_prod_amt(MCNumber.sum(dstR.gr_prod_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 無償支給入庫額
			if (MSC_IO_ACT_TYP.isFFR_PROV_GR(orgR.io_act_typ())) {
				dstR.gr_xfr_amt(MCNumber.sum(dstR.gr_xfr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 有償支給入庫額
			if (MSC_IO_ACT_TYP.isONR_PROV_GR(orgR.io_act_typ())) {
				dstR.gr_xfr_amt(MCNumber.sum(dstR.gr_xfr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 無償支給返品入庫額
			if (MSC_IO_ACT_TYP.isFFR_PROV_RTN_GR(orgR.io_act_typ())) {
				dstR.gr_xfr_amt(MCNumber.sum(dstR.gr_xfr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 有償支給返品入庫額
			if (MSC_IO_ACT_TYP.isONR_PROV_RTN_GR(orgR.io_act_typ())) {
				dstR.gr_xfr_amt(MCNumber.sum(dstR.gr_xfr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
//			// 検査入庫額
//			if (MSC_IO_ACT_TYP.isINSP_GR(orgR.io_act_typ())) {
//				dstR.insp_gr_amt(MCNumber.sum(dstR.insp_gr_amt(), addAmtVal));
//				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
//				return;
//			}
//			// 検査完了入庫額
//			if (MSC_IO_ACT_TYP.isINSP_CMPL_GR(orgR.io_act_typ())) {
//				dstR.insp_cmpl_gr_amt(MCNumber.sum(dstR.insp_cmpl_gr_amt(), addAmtVal));
//				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
//				return;
//			}
//			// 検査判定入庫額
//			if (MSC_IO_ACT_TYP.isINSP_JUDG_GR(orgR.io_act_typ())) {
//				dstR.insp_judg_gr_amt(MCNumber.sum(dstR.insp_judg_gr_amt(), addAmtVal));
//				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
//				return;
//			}
//			// 再検査入庫額
//			if (MSC_IO_ACT_TYP.isREINSP_GR(orgR.io_act_typ())) {
//				dstR.reinsp_gr_amt(MCNumber.sum(dstR.reinsp_gr_amt(), addAmtVal));
//				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
//				return;
//			}
			// 棚卸差異増耗額.
			if (MSC_IO_ACT_TYP.isSTK_ADJST_GR(orgR.io_act_typ())) {
				dstR.stktk_minus_amt(MCNumber.sum(dstR.stktk_minus_amt(), addAmtVal.negate()));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal.negate()));
				return;
			}
			// 倉入入庫額
			if (MSC_IO_ACT_TYP.isPRDCT_WH_GR(orgR.io_act_typ())) {
				dstR.gr_xfr_amt(MCNumber.sum(dstR.gr_xfr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 戻入入庫額
			if (MSC_IO_ACT_TYP.isPRDCT_WH_RTN_GR(orgR.io_act_typ())) {
				dstR.gr_xfr_amt(MCNumber.sum(dstR.gr_xfr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 転入額
			if (MSC_IO_ACT_TYP.isXFR_IN(orgR.io_act_typ())) {
				// dstR.gr_xfr_amt(MCNumber.sum(dstR.gr_xfr_amt(), addAmtVal));
				// dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				_rbValueAmt = MCNumber.sum(_rbValueAmt, addAmtVal);
				return;
			}
			// 仕入転入額
			if (MSC_IO_ACT_TYP.isPURC_XFR_IN(orgR.io_act_typ())) {
				dstR.gr_xfr_amt(MCNumber.sum(dstR.gr_xfr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 移動・移送返品入庫額
			if (MSC_IO_ACT_TYP.isXFR_RTN_GR(orgR.io_act_typ())) {
				// dstR.gr_xfr_amt(MCNumber.sum(dstR.gr_xfr_amt(), addAmtVal));
				// dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				_rbValueAmt = MCNumber.sum(_rbValueAmt, addAmtVal);
				return;
			}
			// 他勘定振替入庫額
			if (MSC_IO_ACT_TYP.isACXFR_GR(orgR.io_act_typ())) {
				dstR.gr_ac_xfr_amt(MCNumber.sum(dstR.gr_ac_xfr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 預り入庫額
			if (MSC_IO_ACT_TYP.isARR_CSTSTK(orgR.io_act_typ())) {
				dstR.gr_xfr_amt(MCNumber.sum(dstR.gr_xfr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 品目振替入庫額
			if (MSC_IO_ACT_TYP.isXFR_ITM_GR(orgR.io_act_typ())) {
				dstR.gr_stk_xfr_amt(MCNumber.sum(dstR.gr_stk_xfr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
//			// ロット・手配ＮＯ振替入庫額
//			if (MSC_IO_ACT_TYP.isXFR_LOT_SNO_GR(orgR.io_act_typ())) {
//				dstR.xfr_lot_sno_gr_amt(MCNumber.sum(dstR.xfr_lot_sno_gr_amt(), addAmtVal));
//				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
//				return;
//			}
//			// 格付・良品区分振替入庫額
//			if (MSC_IO_ACT_TYP.isXFR_GRD_GR(orgR.io_act_typ())) {
//				dstR.xfr_grd_gr_amt(MCNumber.sum(dstR.xfr_grd_gr_amt(), addAmtVal));
//				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
//				return;
//			}
//			// 荷姿振替入庫額
//			if (MSC_IO_ACT_TYP.isXFR_PACK_GR(orgR.io_act_typ())) {
//				dstR.xfr_pack_gr_amt(MCNumber.sum(dstR.xfr_pack_gr_amt(), addAmtVal));
//				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
//				return;
//			}
			// 着荷額
			if (MSC_IO_ACT_TYP.isSHIP_IN(orgR.io_act_typ())) {
				dstR.gr_xfr_amt(MCNumber.sum(dstR.gr_xfr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 輸出着荷額
			if (MSC_IO_ACT_TYP.isEX_SHIP_IN(orgR.io_act_typ())) {
				dstR.gr_xfr_amt(MCNumber.sum(dstR.gr_xfr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 出荷返品入庫額
			if (MSC_IO_ACT_TYP.isSHIP_RTN_GR(orgR.io_act_typ())) {
				dstR.gr_xfr_amt(MCNumber.sum(dstR.gr_xfr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 売上返品入庫額
			if (MSC_IO_ACT_TYP.isSLS_RTN_GR(orgR.io_act_typ())) {
				dstR.sls_amt(MCNumber.sum(dstR.sls_amt(), addAmtVal.negate()));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal.negate()));
				return;
			}

			// ---------------------------------- 出庫額 ----------------------------------
			// 入荷返品額
			if (MSC_IO_ACT_TYP.isARR_RTN(orgR.io_act_typ())) {
				if (MSC_STK_ID_TYP.isNCV_RCV(orgR.stk_id_typ())) {                                      // 在庫識別区分: 無償受給
					dstR.rcv_ret_amt(MCNumber.sum(dstR.rcv_ret_amt(), addAmtVal));                      //           ==> 受給戻し
					dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				}
				else if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(orgR.stk_id_typ())) {                          // 在庫識別区分: 仕入検収前
					dstR.purc_bf_accpt_amt(MCNumber.sum(dstR.purc_bf_accpt_amt(), addAmtVal.negate())); //           ==> 検収前入荷
					dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal.negate()));
				}
				else if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(orgR.stk_id_typ())) {                           // 在庫識別区分: 返品検収前
					dstR.purc_bf_accpt_amt(MCNumber.sum(dstR.purc_bf_accpt_amt(), addAmtVal.negate())); //           ==> 検収前入荷
					dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal.negate()));
				}
				else {
					dstR.gi_xfr_amt(MCNumber.sum(dstR.gi_xfr_amt(), addAmtVal));                        // 上記以外: 移動・移送出庫
					dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				}

				return;
			}
			// 移動・移送出庫額
			if (MSC_IO_ACT_TYP.isXFR_GI(orgR.io_act_typ())) {
				// dstR.gi_xfr_amt(MCNumber.sum(dstR.gi_xfr_amt(), addAmtVal));
				// dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				_rbValueAmt = MCNumber.sum(_rbValueAmt, addAmtVal.negate());
				return;
			}
			// 仕入出庫額
			if (MSC_IO_ACT_TYP.isPURC_GI(orgR.io_act_typ())) {
				addAmtVal = addAmtVal.negate();
				if (MSC_STK_ID_TYP.isCOSTK(orgR.stk_id_typ())) {                        // 在庫識別区分: 自社在庫
					dstR.gr_xfr_amt(MCNumber.sum(dstR.gr_xfr_amt(), addAmtVal));
				}
				else {
					dstR.purc_bf_accpt_amt(MCNumber.sum(dstR.purc_bf_accpt_amt(), addAmtVal));
				}
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 有償受給出庫額
			if (MSC_IO_ACT_TYP.isONR_RCV_GI(orgR.io_act_typ())) {
				addAmtVal = addAmtVal.negate();
				if (MSC_STK_ID_TYP.isCOSTK(orgR.stk_id_typ())) {                        // 在庫識別区分: 自社在庫
					dstR.gr_xfr_amt(MCNumber.sum(dstR.gr_xfr_amt(), addAmtVal));
				}
				else {
					dstR.purc_bf_accpt_amt(MCNumber.sum(dstR.purc_bf_accpt_amt(), addAmtVal));
				}
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 仕入返品出庫額
			if (MSC_IO_ACT_TYP.isPURC_RTN_GI(orgR.io_act_typ())) {
				addAmtVal = addAmtVal.negate();
				dstR.gr_purc_amt(MCNumber.sum(dstR.gr_purc_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 有償受給返品出庫額
			if (MSC_IO_ACT_TYP.isONR_RCV_RET_GI(orgR.io_act_typ())) {
				dstR.rcv_ret_amt(MCNumber.sum(dstR.rcv_ret_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 経費購買出庫額
			if (MSC_IO_ACT_TYP.isXPNS_PURC_GI(orgR.io_act_typ())) {
				addAmtVal = addAmtVal.negate();
				dstR.purc_bf_accpt_amt(MCNumber.sum(dstR.purc_bf_accpt_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 経費購買返品出庫額
			if (MSC_IO_ACT_TYP.isXPNS_PURC_RTN_GI(orgR.io_act_typ())) {
				addAmtVal = addAmtVal.negate();
				dstR.gr_purc_amt(MCNumber.sum(dstR.gr_purc_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 検収不良出庫額
			if (MSC_IO_ACT_TYP.isACCPT_DFCT_GI(orgR.io_act_typ())) {
				addAmtVal = addAmtVal.negate();
				dstR.purc_bf_accpt_amt(MCNumber.sum(dstR.purc_bf_accpt_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 投入額
			if (MSC_IO_ACT_TYP.isINPT(orgR.io_act_typ())) {
				dstR.gi_input_amt(MCNumber.sum(dstR.gi_input_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// ロス額
			if (MSC_IO_ACT_TYP.isLOSS(orgR.io_act_typ())) {
				dstR.gi_input_amt(MCNumber.sum(dstR.gi_input_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 無償支給出庫額
			if (MSC_IO_ACT_TYP.isFFR_PROV_GI(orgR.io_act_typ())) {
				dstR.gi_xfr_amt(MCNumber.sum(dstR.gi_xfr_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 有償支給出庫額
			if (MSC_IO_ACT_TYP.isONR_PROV_GI(orgR.io_act_typ())) {
				dstR.gi_xfr_amt(MCNumber.sum(dstR.gi_xfr_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 無償支給返品出庫額
			if (MSC_IO_ACT_TYP.isFFR_PROV_RTN_GI(orgR.io_act_typ())) {
				dstR.gi_xfr_amt(MCNumber.sum(dstR.gi_xfr_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 有償支給返品出庫額
			if (MSC_IO_ACT_TYP.isONR_PROV_RTN_GI(orgR.io_act_typ())) {
				dstR.gi_xfr_amt(MCNumber.sum(dstR.gi_xfr_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
//			// 検査出庫額
//			if (MSC_IO_ACT_TYP.isINSP_GI(orgR.io_act_typ())) {
//				dstR.insp_gi_amt(MCNumber.sum(dstR.insp_gi_amt(), addAmtVal));
//				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
//				return;
//			}
//			// 検査完了出庫額
//			if (MSC_IO_ACT_TYP.isINSP_CMPL_GI(orgR.io_act_typ())) {
//				dstR.insp_cmpl_gi_amt(MCNumber.sum(dstR.insp_cmpl_gi_amt(), addAmtVal));
//				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
//				return;
//			}
//			// 検査判定出庫額
//			if (MSC_IO_ACT_TYP.isINSP_JUDG_GI(orgR.io_act_typ())) {
//				dstR.insp_judg_gi_amt(MCNumber.sum(dstR.insp_judg_gi_amt(), addAmtVal));
//				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
//				return;
//			}
//			// 再検査出庫額
//			if (MSC_IO_ACT_TYP.isREINSP_GI(orgR.io_act_typ())) {
//				dstR.reinsp_gi_amt(MCNumber.sum(dstR.reinsp_gi_amt(), addAmtVal));
//				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
//				return;
//			}
			// 検査抜取額
			if (MSC_IO_ACT_TYP.isINSP_SMPL_GI(orgR.io_act_typ())) {
				dstR.gi_insp_amt(MCNumber.sum(dstR.gi_insp_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 棚卸差異減耗額
			if (MSC_IO_ACT_TYP.isSTK_ADJST_GI(orgR.io_act_typ())) {
				dstR.stktk_minus_amt(MCNumber.sum(dstR.stktk_minus_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 倉入出庫額
			if (MSC_IO_ACT_TYP.isPRDCT_WH_GI(orgR.io_act_typ())) {
				dstR.gi_xfr_amt(MCNumber.sum(dstR.gi_xfr_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 戻入出庫額
			if (MSC_IO_ACT_TYP.isPRDCT_WH_RTN_GI(orgR.io_act_typ())) {
				dstR.gi_xfr_amt(MCNumber.sum(dstR.gi_xfr_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 転出額
			if (MSC_IO_ACT_TYP.isXFR_OUT(orgR.io_act_typ())) {
				// dstR.gi_xfr_amt(MCNumber.sum(dstR.gi_xfr_amt(), addAmtVal));
				// dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				_rbValueAmt = MCNumber.sum(_rbValueAmt, addAmtVal.negate());
				return;
			}
			// 仕入転出額
			if (MSC_IO_ACT_TYP.isPURC_XFR_OUT(orgR.io_act_typ())) {
				dstR.gi_xfr_amt(MCNumber.sum(dstR.gi_xfr_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 移動・移送返品出庫額
			if (MSC_IO_ACT_TYP.isXFR_RTN_GI(orgR.io_act_typ())) {
				// dstR.gi_xfr_amt(MCNumber.sum(dstR.gi_xfr_amt(), addAmtVal));
				// dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				_rbValueAmt = MCNumber.sum(_rbValueAmt, addAmtVal.negate());
				return;
			}
			// 他勘定振替出庫額
			if (MSC_IO_ACT_TYP.isACXFR_GI(orgR.io_act_typ())) {
				dstR.gi_ac_xfr_amt(MCNumber.sum(dstR.gi_ac_xfr_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 廃棄額
			if (MSC_IO_ACT_TYP.isSCRP(orgR.io_act_typ())) {
				dstR.gi_ac_xfr_amt(MCNumber.sum(dstR.gi_ac_xfr_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 品目振替出庫額
			if (MSC_IO_ACT_TYP.isXFR_ITM_GI(orgR.io_act_typ())) {
				dstR.gi_stk_xfr_amt(MCNumber.sum(dstR.gi_stk_xfr_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
//			// ロット・手配ＮＯ振替出庫額
//			if (MSC_IO_ACT_TYP.isXFR_LOT_SNO_GI(orgR.io_act_typ())) {
//				dstR.xfr_lot_sno_gi_amt(MCNumber.sum(dstR.xfr_lot_sno_gi_amt(), addAmtVal));
//				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
//				return;
//			}
//			// 格付・良品区分振替出庫額
//			if (MSC_IO_ACT_TYP.isXFR_GRD_GI(orgR.io_act_typ())) {
//				dstR.xfr_grd_gi_amt(MCNumber.sum(dstR.xfr_grd_gi_amt(), addAmtVal));
//				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
//				return;
//			}
//			// 荷姿振替出庫額
//			if (MSC_IO_ACT_TYP.isXFR_PACK_GI(orgR.io_act_typ())) {
//				dstR.xfr_pack_gi_amt(MCNumber.sum(dstR.xfr_pack_gi_amt(), addAmtVal));
//				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
//				return;
//			}
			// 出荷額
			if (MSC_IO_ACT_TYP.isSHIP_OUT(orgR.io_act_typ())) {
				dstR.gi_xfr_amt(MCNumber.sum(dstR.gi_xfr_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 輸出出荷額
			if (MSC_IO_ACT_TYP.isEX_SHIP_OUT(orgR.io_act_typ())) {
				dstR.gi_xfr_amt(MCNumber.sum(dstR.gi_xfr_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 出荷返品出庫額
			if (MSC_IO_ACT_TYP.isSHIP_RTN_GI(orgR.io_act_typ())) {
				dstR.gi_xfr_amt(MCNumber.sum(dstR.gi_xfr_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 売上返品出庫額
			if (MSC_IO_ACT_TYP.isSLS_RTN_GI(orgR.io_act_typ())) {
				dstR.gi_xfr_amt(MCNumber.sum(dstR.gi_xfr_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 売上額
			if (MSC_IO_ACT_TYP.isSLS(orgR.io_act_typ())) {
				dstR.sls_amt(MCNumber.sum(dstR.sls_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}

			// ---------------------------------- 月初月末在庫 ----------------------------------
			// 月初在庫額
			if (MSC_IO_ACT_TYP.isINI_STK(orgR.io_act_typ())) {
				dstR.ini_stk_amt(MCNumber.sum(dstR.ini_stk_amt(), addAmtVal));
				return;
			}
			// 月末在庫額
			if (MSC_IO_ACT_TYP.isEND_STK(orgR.io_act_typ())) {
				dstR.end_stk_amt(MCNumber.sum(dstR.end_stk_amt(), addAmtVal));
				return;
			}
		}


		protected void setQtyCtgValue(Srch01_RsltR dstR, Srch01_RsltR orgR) {
			if (dstR == null || orgR == null) {
				return;
			}

			MCNumber addQtyVal = orgR.base_unit_qty();
			if (isNull(addQtyVal) || addQtyVal.isZero()) {
				return;
			}

			// ---------------------------------- 入庫額 ----------------------------------
			// 入荷額.  （受払区分で判断） 
			if (MSC_IO_ACT_TYP.isARR(orgR.io_act_typ())) {
				if (MSC_STK_ID_TYP.isNCV_RCV(orgR.stk_id_typ())) {                             // 在庫識別区分: 無償受給
					dstR.gr_rcv_qty(MCNumber.sum(dstR.gr_rcv_qty(), addQtyVal));               //           ==> 受給入庫
				}
				else if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(orgR.stk_id_typ())) {                 // 在庫識別区分: 検収不良
					dstR.purc_bf_accpt_qty(MCNumber.sum(dstR.purc_bf_accpt_qty(), addQtyVal)); //           ==> 検収前入荷
				}
				else if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(orgR.stk_id_typ())) {                  // 在庫識別区分: 返品検収前
					dstR.purc_bf_accpt_qty(MCNumber.sum(dstR.purc_bf_accpt_qty(), addQtyVal)); //           ==> 検収前入荷
				}
				else {
					dstR.gr_xfr_qty(MCNumber.sum(dstR.gr_xfr_qty(), addQtyVal));               // 上記以外: 移動・移送入庫
				}

				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 移動・移送入庫額
			if (MSC_IO_ACT_TYP.isXFR_GR(orgR.io_act_typ())) {
				// dstR.gr_xfr_qty(MCNumber.sum(dstR.gr_xfr_qty(), addQtyVal));
				// dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				_rbValue = MCNumber.sum(_rbValue, addQtyVal);
				return;
			}
			// 仕入入庫額
			if (MSC_IO_ACT_TYP.isPURC_GR(orgR.io_act_typ())) {
				dstR.gr_purc_qty(MCNumber.sum(dstR.gr_purc_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 有償受給入庫額
			if (MSC_IO_ACT_TYP.isONR_RCV_GR(orgR.io_act_typ())) {
				dstR.gr_rcv_qty(MCNumber.sum(dstR.gr_rcv_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 仕入返品入庫額
			if (MSC_IO_ACT_TYP.isPURC_RTN_GR(orgR.io_act_typ())) {
				dstR.purc_bf_accpt_qty(MCNumber.sum(dstR.purc_bf_accpt_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 有償受給返品入庫額
			if (MSC_IO_ACT_TYP.isONR_RCV_RET_GR(orgR.io_act_typ())) {
				dstR.purc_bf_accpt_qty(MCNumber.sum(dstR.purc_bf_accpt_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 経費購買入庫額
			if (MSC_IO_ACT_TYP.isXPNS_PURC_GR(orgR.io_act_typ())) {
				dstR.gr_purc_qty(MCNumber.sum(dstR.gr_purc_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 経費購買返品入庫額
			if (MSC_IO_ACT_TYP.isXPNS_PURC_RTN_GR(orgR.io_act_typ())) {
				dstR.purc_bf_accpt_qty(MCNumber.sum(dstR.purc_bf_accpt_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 検収不良入庫額
			if (MSC_IO_ACT_TYP.isACCPT_DFCT_GR(orgR.io_act_typ())) {
				dstR.accpt_dfct_qty(MCNumber.sum(dstR.accpt_dfct_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 製造額
			if (MSC_IO_ACT_TYP.isMFG(orgR.io_act_typ())) {
				dstR.gr_prod_qty(MCNumber.sum(dstR.gr_prod_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 副産品製造額
			if (MSC_IO_ACT_TYP.isBYMFG(orgR.io_act_typ())) {
				dstR.gr_prod_qty(MCNumber.sum(dstR.gr_prod_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 無償支給入庫額
			if (MSC_IO_ACT_TYP.isFFR_PROV_GR(orgR.io_act_typ())) {
				dstR.gr_xfr_qty(MCNumber.sum(dstR.gr_xfr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 有償支給入庫額
			if (MSC_IO_ACT_TYP.isONR_PROV_GR(orgR.io_act_typ())) {
				dstR.gr_xfr_qty(MCNumber.sum(dstR.gr_xfr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 無償支給返品入庫額
			if (MSC_IO_ACT_TYP.isFFR_PROV_RTN_GR(orgR.io_act_typ())) {
				dstR.gr_xfr_qty(MCNumber.sum(dstR.gr_xfr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 有償支給返品入庫額
			if (MSC_IO_ACT_TYP.isONR_PROV_RTN_GR(orgR.io_act_typ())) {
				dstR.gr_xfr_qty(MCNumber.sum(dstR.gr_xfr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
//			// 検査入庫額
//			if (MSC_IO_ACT_TYP.isINSP_GR(orgR.io_act_typ())) {
//				dstR.insp_gr_qty(MCNumber.sum(dstR.insp_gr_qty(), addQtyVal));
//				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
//				return;
//			}
//			// 検査完了入庫額
//			if (MSC_IO_ACT_TYP.isINSP_CMPL_GR(orgR.io_act_typ())) {
//				dstR.insp_cmpl_gr_qty(MCNumber.sum(dstR.insp_cmpl_gr_qty(), addQtyVal));
//				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
//				return;
//			}
//			// 検査判定入庫額
//			if (MSC_IO_ACT_TYP.isINSP_JUDG_GR(orgR.io_act_typ())) {
//				dstR.insp_judg_gr_qty(MCNumber.sum(dstR.insp_judg_gr_qty(), addQtyVal));
//				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
//				return;
//			}
//			// 再検査入庫額
//			if (MSC_IO_ACT_TYP.isREINSP_GR(orgR.io_act_typ())) {
//				dstR.reinsp_gr_qty(MCNumber.sum(dstR.reinsp_gr_qty(), addQtyVal));
//				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
//				return;
//			}
			// 棚卸差異増耗額.
			if (MSC_IO_ACT_TYP.isSTK_ADJST_GR(orgR.io_act_typ())) {
				dstR.stktk_minus_qty(MCNumber.sum(dstR.stktk_minus_qty(), addQtyVal.negate()));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal.negate()));
				return;
			}
			// 倉入入庫額
			if (MSC_IO_ACT_TYP.isPRDCT_WH_GR(orgR.io_act_typ())) {
				dstR.gr_xfr_qty(MCNumber.sum(dstR.gr_xfr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 戻入入庫額
			if (MSC_IO_ACT_TYP.isPRDCT_WH_RTN_GR(orgR.io_act_typ())) {
				dstR.gr_xfr_qty(MCNumber.sum(dstR.gr_xfr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 転入額
			if (MSC_IO_ACT_TYP.isXFR_IN(orgR.io_act_typ())) {
				// dstR.gr_xfr_qty(MCNumber.sum(dstR.gr_xfr_qty(), addQtyVal));
				// dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				_rbValue = MCNumber.sum(_rbValue, addQtyVal);
				return;
			}
			// 仕入転入額
			if (MSC_IO_ACT_TYP.isPURC_XFR_IN(orgR.io_act_typ())) {
				dstR.gr_xfr_qty(MCNumber.sum(dstR.gr_xfr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 移動・移送返品入庫額
			if (MSC_IO_ACT_TYP.isXFR_RTN_GR(orgR.io_act_typ())) {
				// dstR.gr_xfr_qty(MCNumber.sum(dstR.gr_xfr_qty(), addQtyVal));
				// dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				_rbValue = MCNumber.sum(_rbValue, addQtyVal);
				return;
			}
			// 他勘定振替入庫額
			if (MSC_IO_ACT_TYP.isACXFR_GR(orgR.io_act_typ())) {
				dstR.gr_ac_xfr_qty(MCNumber.sum(dstR.gr_ac_xfr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 預り入庫額
			if (MSC_IO_ACT_TYP.isARR_CSTSTK(orgR.io_act_typ())) {
				dstR.gr_xfr_qty(MCNumber.sum(dstR.gr_xfr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 品目振替入庫額
			if (MSC_IO_ACT_TYP.isXFR_ITM_GR(orgR.io_act_typ())) {
				dstR.gr_stk_xfr_qty(MCNumber.sum(dstR.gr_stk_xfr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
//			// ロット・手配ＮＯ振替入庫額
//			if (MSC_IO_ACT_TYP.isXFR_LOT_SNO_GR(orgR.io_act_typ())) {
//				dstR.xfr_lot_sno_gr_qty(MCNumber.sum(dstR.xfr_lot_sno_gr_qty(), addQtyVal));
//				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
//				return;
//			}
//			// 格付・良品区分振替入庫額
//			if (MSC_IO_ACT_TYP.isXFR_GRD_GR(orgR.io_act_typ())) {
//				dstR.xfr_grd_gr_qty(MCNumber.sum(dstR.xfr_grd_gr_qty(), addQtyVal));
//				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
//				return;
//			}
//			// 荷姿振替入庫額
//			if (MSC_IO_ACT_TYP.isXFR_PACK_GR(orgR.io_act_typ())) {
//				dstR.xfr_pack_gr_qty(MCNumber.sum(dstR.xfr_pack_gr_qty(), addQtyVal));
//				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
//				return;
//			}
			// 着荷額
			if (MSC_IO_ACT_TYP.isSHIP_IN(orgR.io_act_typ())) {
				dstR.gr_xfr_qty(MCNumber.sum(dstR.gr_xfr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 輸出着荷額
			if (MSC_IO_ACT_TYP.isEX_SHIP_IN(orgR.io_act_typ())) {
				dstR.gr_xfr_qty(MCNumber.sum(dstR.gr_xfr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 出荷返品入庫額
			if (MSC_IO_ACT_TYP.isSHIP_RTN_GR(orgR.io_act_typ())) {
				dstR.gr_xfr_qty(MCNumber.sum(dstR.gr_xfr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 売上返品入庫額
			if (MSC_IO_ACT_TYP.isSLS_RTN_GR(orgR.io_act_typ())) {
				dstR.sls_qty(MCNumber.sum(dstR.sls_qty(), addQtyVal.negate()));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal.negate()));
				return;
			}

			// ---------------------------------- 出庫額 ----------------------------------
			// 入荷返品額
			if (MSC_IO_ACT_TYP.isARR_RTN(orgR.io_act_typ())) {
				if (MSC_STK_ID_TYP.isNCV_RCV(orgR.stk_id_typ())) {                                      // 在庫識別区分: 無償受給
					dstR.rcv_ret_qty(MCNumber.sum(dstR.rcv_ret_qty(), addQtyVal));                      //           ==> 受給戻し
					dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				}
				else if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(orgR.stk_id_typ())) {                          // 在庫識別区分: 仕入検収前
					dstR.purc_bf_accpt_qty(MCNumber.sum(dstR.purc_bf_accpt_qty(), addQtyVal.negate())); //           ==> 検収前入荷
					dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal.negate()));
				}
				else if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(orgR.stk_id_typ())) {                           // 在庫識別区分: 返品検収前
					dstR.purc_bf_accpt_qty(MCNumber.sum(dstR.purc_bf_accpt_qty(), addQtyVal.negate())); //           ==> 検収前入荷
					dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal.negate()));
				}
				else {
					dstR.gi_xfr_qty(MCNumber.sum(dstR.gi_xfr_qty(), addQtyVal));                        // 上記以外: 移動・移送出庫
					dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				}

				return;
			}
			// 移動・移送出庫額
			if (MSC_IO_ACT_TYP.isXFR_GI(orgR.io_act_typ())) {
				// dstR.gi_xfr_qty(MCNumber.sum(dstR.gi_xfr_qty(), addQtyVal));
				// dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				_rbValue = MCNumber.sum(_rbValue, addQtyVal.negate());
				return;
			}
			// 仕入出庫額
			if (MSC_IO_ACT_TYP.isPURC_GI(orgR.io_act_typ())) {
				addQtyVal = addQtyVal.negate();
				if (MSC_STK_ID_TYP.isCOSTK(orgR.stk_id_typ())) {                        // 在庫識別区分: 自社在庫
					dstR.gr_xfr_qty(MCNumber.sum(dstR.gr_xfr_qty(), addQtyVal));
				}
				else {
					dstR.purc_bf_accpt_qty(MCNumber.sum(dstR.purc_bf_accpt_qty(), addQtyVal));
				}
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 有償受給出庫額
			if (MSC_IO_ACT_TYP.isONR_RCV_GI(orgR.io_act_typ())) {
				addQtyVal = addQtyVal.negate();
				if (MSC_STK_ID_TYP.isCOSTK(orgR.stk_id_typ())) {                        // 在庫識別区分: 自社在庫
					dstR.gr_xfr_qty(MCNumber.sum(dstR.gr_xfr_qty(), addQtyVal));
				}
				else {
					dstR.purc_bf_accpt_qty(MCNumber.sum(dstR.purc_bf_accpt_qty(), addQtyVal));
				}
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 仕入返品出庫額
			if (MSC_IO_ACT_TYP.isPURC_RTN_GI(orgR.io_act_typ())) {
				addQtyVal = addQtyVal.negate();
				dstR.gr_purc_qty(MCNumber.sum(dstR.gr_purc_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 有償受給返品出庫額
			if (MSC_IO_ACT_TYP.isONR_RCV_RET_GI(orgR.io_act_typ())) {
				dstR.rcv_ret_qty(MCNumber.sum(dstR.rcv_ret_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 経費購買出庫額
			if (MSC_IO_ACT_TYP.isXPNS_PURC_GI(orgR.io_act_typ())) {
				addQtyVal = addQtyVal.negate();
				dstR.purc_bf_accpt_qty(MCNumber.sum(dstR.purc_bf_accpt_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 経費購買返品出庫額
			if (MSC_IO_ACT_TYP.isXPNS_PURC_RTN_GI(orgR.io_act_typ())) {
				addQtyVal = addQtyVal.negate();
				dstR.gr_purc_qty(MCNumber.sum(dstR.gr_purc_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 検収不良出庫額
			if (MSC_IO_ACT_TYP.isACCPT_DFCT_GI(orgR.io_act_typ())) {
				addQtyVal = addQtyVal.negate();
				dstR.purc_bf_accpt_qty(MCNumber.sum(dstR.purc_bf_accpt_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 投入額
			if (MSC_IO_ACT_TYP.isINPT(orgR.io_act_typ())) {
				dstR.gi_input_qty(MCNumber.sum(dstR.gi_input_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// ロス額
			if (MSC_IO_ACT_TYP.isLOSS(orgR.io_act_typ())) {
				dstR.gi_input_qty(MCNumber.sum(dstR.gi_input_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 無償支給出庫額
			if (MSC_IO_ACT_TYP.isFFR_PROV_GI(orgR.io_act_typ())) {
				dstR.gi_xfr_qty(MCNumber.sum(dstR.gi_xfr_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 有償支給出庫額
			if (MSC_IO_ACT_TYP.isONR_PROV_GI(orgR.io_act_typ())) {
				dstR.gi_xfr_qty(MCNumber.sum(dstR.gi_xfr_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 無償支給返品出庫額
			if (MSC_IO_ACT_TYP.isFFR_PROV_RTN_GI(orgR.io_act_typ())) {
				dstR.gi_xfr_qty(MCNumber.sum(dstR.gi_xfr_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 有償支給返品出庫額
			if (MSC_IO_ACT_TYP.isONR_PROV_RTN_GI(orgR.io_act_typ())) {
				dstR.gi_xfr_qty(MCNumber.sum(dstR.gi_xfr_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
//			// 検査出庫額
//			if (MSC_IO_ACT_TYP.isINSP_GI(orgR.io_act_typ())) {
//				dstR.insp_gi_qty(MCNumber.sum(dstR.insp_gi_qty(), addQtyVal));
//				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
//				return;
//			}
//			// 検査完了出庫額
//			if (MSC_IO_ACT_TYP.isINSP_CMPL_GI(orgR.io_act_typ())) {
//				dstR.insp_cmpl_gi_qty(MCNumber.sum(dstR.insp_cmpl_gi_qty(), addQtyVal));
//				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
//				return;
//			}
//			// 検査判定出庫額
//			if (MSC_IO_ACT_TYP.isINSP_JUDG_GI(orgR.io_act_typ())) {
//				dstR.insp_judg_gi_qty(MCNumber.sum(dstR.insp_judg_gi_qty(), addQtyVal));
//				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
//				return;
//			}
//			// 再検査出庫額
//			if (MSC_IO_ACT_TYP.isREINSP_GI(orgR.io_act_typ())) {
//				dstR.reinsp_gi_qty(MCNumber.sum(dstR.reinsp_gi_qty(), addQtyVal));
//				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
//				return;
//			}
			// 検査抜取額
			if (MSC_IO_ACT_TYP.isINSP_SMPL_GI(orgR.io_act_typ())) {
				dstR.gi_insp_qty(MCNumber.sum(dstR.gi_insp_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 棚卸差異減耗額
			if (MSC_IO_ACT_TYP.isSTK_ADJST_GI(orgR.io_act_typ())) {
				dstR.stktk_minus_qty(MCNumber.sum(dstR.stktk_minus_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 倉入出庫額
			if (MSC_IO_ACT_TYP.isPRDCT_WH_GI(orgR.io_act_typ())) {
				dstR.gi_xfr_qty(MCNumber.sum(dstR.gi_xfr_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 戻入出庫額
			if (MSC_IO_ACT_TYP.isPRDCT_WH_RTN_GI(orgR.io_act_typ())) {
				dstR.gi_xfr_qty(MCNumber.sum(dstR.gi_xfr_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 転出額
			if (MSC_IO_ACT_TYP.isXFR_OUT(orgR.io_act_typ())) {
				// dstR.gi_xfr_qty(MCNumber.sum(dstR.gi_xfr_qty(), addQtyVal));
				// dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				_rbValue = MCNumber.sum(_rbValue, addQtyVal.negate());
				return;
			}
			// 仕入転出額
			if (MSC_IO_ACT_TYP.isPURC_XFR_OUT(orgR.io_act_typ())) {
				dstR.gi_xfr_qty(MCNumber.sum(dstR.gi_xfr_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 移動・移送返品出庫額
			if (MSC_IO_ACT_TYP.isXFR_RTN_GI(orgR.io_act_typ())) {
				// dstR.gi_xfr_qty(MCNumber.sum(dstR.gi_xfr_qty(), addQtyVal));
				// dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				_rbValue = MCNumber.sum(_rbValue, addQtyVal.negate());
				return;
			}
			// 他勘定振替出庫額
			if (MSC_IO_ACT_TYP.isACXFR_GI(orgR.io_act_typ())) {
				dstR.gi_ac_xfr_qty(MCNumber.sum(dstR.gi_ac_xfr_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 廃棄額
			if (MSC_IO_ACT_TYP.isSCRP(orgR.io_act_typ())) {
				dstR.gi_ac_xfr_qty(MCNumber.sum(dstR.gi_ac_xfr_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 品目振替出庫額
			if (MSC_IO_ACT_TYP.isXFR_ITM_GI(orgR.io_act_typ())) {
				dstR.gi_stk_xfr_qty(MCNumber.sum(dstR.gi_stk_xfr_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
//			// ロット・手配ＮＯ振替出庫額
//			if (MSC_IO_ACT_TYP.isXFR_LOT_SNO_GI(orgR.io_act_typ())) {
//				dstR.xfr_lot_sno_gi_qty(MCNumber.sum(dstR.xfr_lot_sno_gi_qty(), addQtyVal));
//				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
//				return;
//			}
//			// 格付・良品区分振替出庫額
//			if (MSC_IO_ACT_TYP.isXFR_GRD_GI(orgR.io_act_typ())) {
//				dstR.xfr_grd_gi_qty(MCNumber.sum(dstR.xfr_grd_gi_qty(), addQtyVal));
//				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
//				return;
//			}
//			// 荷姿振替出庫額
//			if (MSC_IO_ACT_TYP.isXFR_PACK_GI(orgR.io_act_typ())) {
//				dstR.xfr_pack_gi_qty(MCNumber.sum(dstR.xfr_pack_gi_qty(), addQtyVal));
//				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
//				return;
//			}
			// 出荷額
			if (MSC_IO_ACT_TYP.isSHIP_OUT(orgR.io_act_typ())) {
				dstR.gi_xfr_qty(MCNumber.sum(dstR.gi_xfr_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 輸出出荷額
			if (MSC_IO_ACT_TYP.isEX_SHIP_OUT(orgR.io_act_typ())) {
				dstR.gi_xfr_qty(MCNumber.sum(dstR.gi_xfr_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 出荷返品出庫額
			if (MSC_IO_ACT_TYP.isSHIP_RTN_GI(orgR.io_act_typ())) {
				dstR.gi_xfr_qty(MCNumber.sum(dstR.gi_xfr_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 売上返品出庫額
			if (MSC_IO_ACT_TYP.isSLS_RTN_GI(orgR.io_act_typ())) {
				dstR.gi_xfr_qty(MCNumber.sum(dstR.gi_xfr_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 売上額
			if (MSC_IO_ACT_TYP.isSLS(orgR.io_act_typ())) {
				dstR.sls_qty(MCNumber.sum(dstR.sls_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}

			// ---------------------------------- 月初月末在庫 ----------------------------------
			// 月初在庫額
			if (MSC_IO_ACT_TYP.isINI_STK(orgR.io_act_typ())) {
				dstR.ini_stk_qty(MCNumber.sum(dstR.ini_stk_qty(), addQtyVal));
				return;
			}
			// 月末在庫額
			if (MSC_IO_ACT_TYP.isEND_STK(orgR.io_act_typ())) {
				dstR.end_stk_qty(MCNumber.sum(dstR.end_stk_qty(), addQtyVal));
				return;
			}
		}

		protected void addRow(Srch01_RsltR rsltR, MCList<Srch01_RsltR> rsltL) {
			if (isNull(rsltR)) {
				return;
			}
			boolean isZeroAmt = false;
			
			// 値が設定されなかった行は追加しない
			if (isSame(up0().disp_unit(), "AMT") && chkZero(rsltR, true)) {
				rsltR.end_stk_amt(MCNumber.ZERO);
				isZeroAmt = true;
			}
			if (chkZero(rsltR, false)) {
				rsltR.end_stk_qty(MCNumber.ZERO);
				return;
			}
			// 数量を相殺する。
			doCounterBalance(rsltR);
			// 合計項目は常に値を表示する
			if (isSame(up0().disp_unit(), "AMT") && !isZeroAmt) {
				if (isNull(rsltR.gr_total_amt())) {
					rsltR.gr_total_amt(MCNumber.ZERO);
				}
				if (isNull(rsltR.gi_total_amt())) {
					rsltR.gi_total_amt(MCNumber.ZERO);
				}
				// 月末在庫は再計算する。
				rsltR.end_stk_amt(rsltR.ini_stk_amt().add(rsltR.gr_total_amt()).subtract(rsltR.gi_total_amt()));
			}
			if (isNull(rsltR.gr_total_qty())) {
				rsltR.gr_total_qty(MCNumber.ZERO);
			}
			if (isNull(rsltR.gi_total_qty())) {
				rsltR.gi_total_qty(MCNumber.ZERO);
			}
			// 月末在庫は再計算する。
			rsltR.end_stk_qty(rsltR.ini_stk_qty().add(rsltR.gr_total_qty()).subtract(rsltR.gi_total_qty()));
			
			if (!isZeroAmt) {
				rsltL.add(rsltR);
			}
		}

		protected boolean chkZero(Srch01_RsltR rsltR, boolean chkAmt) {
			if (chkAmt) {
				return
						isSame(nvl(rsltR.ini_stk_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gr_total_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.purc_bf_accpt_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gr_purc_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.accpt_dfct_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gr_prod_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gr_xfr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gr_rcv_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gr_stk_xfr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gr_ac_xfr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gi_total_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gi_input_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gi_insp_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gi_xfr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.rcv_ret_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gi_stk_xfr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gi_ac_xfr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.stktk_minus_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.sls_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.end_stk_amt(), MCNumber.ZERO), MCNumber.ZERO)
						;
			}
			else {
				return
						isSame(nvl(rsltR.ini_stk_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gr_total_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.purc_bf_accpt_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gr_purc_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.accpt_dfct_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gr_prod_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gr_xfr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gr_rcv_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gr_stk_xfr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gr_ac_xfr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gi_total_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gi_input_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gi_insp_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gi_xfr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.rcv_ret_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gi_stk_xfr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gi_ac_xfr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.stktk_minus_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.sls_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.end_stk_qty(), MCNumber.ZERO), MCNumber.ZERO)
						;
			}
		}

		/**
		 * グループ化項目の配列を取得する。
		 * @return 項目配列
		 */
		protected String[] getGroupByCols() {
			// 全グループ化対象項目から、画面上で外した項目を除外する
			if (_grpCols == null ) {
				_grpCols = MCCollectionUtil.remove(getGroupCols(), new String[0], getRemoveCols());
			}

			return _grpCols;
		}

		/**
		 * チェック項目の配列を取得する。
		 * @return 項目配列
		 */
		protected String[] getCngChkCols() {
			// 全グループ化対象項目から、画面上で外した項目を除外する
			if (_chkCols == null ) {
				_chkCols = MCCollectionUtil.remove(getChkCols(), new String[0], getRemoveCols());
			}

			return _chkCols;
		}

		/**
		 * 非表示項目（画面で指定したグループ化対象外項目）
		 * @return 項目配列
		 */
		protected String[] getRemoveCols() {
			if (_removeCols == null) {
				List<String> removeArray = getRemoveArray();
				_removeCols = removeArray.toArray(new String[0]);
			}

			return _removeCols;
		}


		protected List<String> getRemoveArray() {
			List<String> removeArray = new ArrayList<String>();

			setRemoveArrayWg(removeArray);
			setRemoveArrayAsstTyp(removeArray);
			setRemoveArrayStkIdTyp(removeArray);
			setRemoveArrayStkBp(removeArray);
			setRemoveArrayStkArrvBp(removeArray);

			return removeArray;
		}

		protected void setRemoveArrayWg(List<String> removeArray) {
			if (!up0().wg_flg()) {
				removeArray.add(Srch01_RsltR.$wg_cd);
				removeArray.add(Srch01_RsltR.$wg_nm);
			}
		}

		protected void setRemoveArrayAsstTyp(List<String> removeArray) {
			if (!up0().asst_typ_flg()) {
				removeArray.add(Srch01_RsltR.$asst_typ);
				removeArray.add(Srch01_RsltR.$asst_typ_nm);
			}
		}

		protected void setRemoveArrayStkIdTyp(List<String> removeArray) {
			if (!up0().stk_id_typ_flg()) {
				removeArray.add(Srch01_RsltR.$stk_id_typ);
				removeArray.add(Srch01_RsltR.$stk_id_typ_nm);
			}
		}

		protected void setRemoveArrayStkBp(List<String> removeArray) {
			if (!up0().stk_bp_flg()) {
				removeArray.add(Srch01_RsltR.$stk_bp_cd);
				removeArray.add(Srch01_RsltR.$stk_bp_nm);
			}
		}

		protected void setRemoveArrayStkArrvBp(List<String> removeArray) {
			if (!up0().stk_arrv_bp_flg()) {
				removeArray.add(Srch01_RsltR.$stk_arrv_bp_cd);
				removeArray.add(Srch01_RsltR.$stk_arrv_bp_nm);
			}
		}

		protected String[] getGroupCols() {
			return new String[] {
				Srch01_RsltR.$itm_cd,
				Srch01_RsltR.$itm_sub1,
				Srch01_RsltR.$itm_sub2,
				Srch01_RsltR.$itm_sub3,
				Srch01_RsltR.$itm_nm,
				Srch01_RsltR.$wg_cd,
				Srch01_RsltR.$asst_typ,
				Srch01_RsltR.$stk_id_typ,
				Srch01_RsltR.$stk_bp_cd,
				Srch01_RsltR.$stk_arrv_bp_cd,
				Srch01_RsltR.$mly_io_cl_ym
			};
		}

		protected String[] getChkCols() {
			return new String[] {
					Srch01_RsltR.$wg_cd,
					Srch01_RsltR.$itm_cd,
					Srch01_RsltR.$itm_sub1,
					Srch01_RsltR.$itm_sub2,
					Srch01_RsltR.$itm_sub3,
					Srch01_RsltR.$itm_nm,
					Srch01_RsltR.$asst_typ,
					Srch01_RsltR.$stk_id_typ,
					Srch01_RsltR.$stk_bp_cd,
					Srch01_RsltR.$stk_arrv_bp_cd
			};
		}

		protected String[] getSumCols() {
			return new String[] {
					Srch01_RsltR.$base_unit_qty, 
					Srch01_RsltR.$stk_amt
			};
		}
	}

	//FMCB CUSTOM END
}