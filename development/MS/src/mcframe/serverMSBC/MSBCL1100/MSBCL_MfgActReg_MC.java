package mcframe.serverMSBC.MSBCL1100;

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
import mcframe.serverMSBC.MSBCL1100.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBC.MSBCL1100.Query.*;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
import mcframe.serverMSBC.MSBCL6040.*;
import mcframe.serverMSBC.MSBCL6050.*;
import mcframe.serverMSBC.MSBCL6070.*;
import mcframe.serverMSBC.MSBCL6090.*;
import mcframe.serverMSBC.MSBCL6110.*;
import java.util.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_MfgActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_MfgActReg_MC extends MSBCL_MfgActReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索対象区分に応じて、未着手の製造指図または登録済みの製造実績を検索する。<br>
	 */
	public class Srch01 extends MSBCL_MfgActReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editUp();
			// オペレーションの実装
			if (up0().inst_srch_flg()) {
				up0().div_seq(0);
				srchMfgInst();
			}
			else {
				srchMfgAct();
				if (!down0().isEmpty()) {
					delWrkTbl();
					insWrkTbl();
					srchMfgInst();
				}
			}

			editDown();
			sortDtl();

		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			up0().addStringColumn("tmp_aprv_usr", mcframe.serverCore.sys.MCSys.user.ID());
			up0().addDateColumn("tmp_today", getToday());
			// 承認種別
			if (isSame(up0().ope(), "4")) {
				up0().addStringColumn("OPE_VAL", "2");
			}
			// 取消種別
			else if (isSame(up0().ope(), "2")) {
				up0().addStringColumn("OPE_VAL", "3");
			}
			else {
				up0().addStringColumn("OPE_VAL", "1");
			}
		}

		/**
		 * 製造実績を主な取得先とした検索処理
		 */
		protected void srchMfgAct() {

			if (MSC_PROD_SRCH_TGT_TYP.isMFG_ACT_NO(up0().srch_tgt_typ())) {
				MST_MFG_ACT_R mfgActR = MST_MFG_ACT_R.create();
				MST_MFG_ACT_R mfgActR_t = MST_MFG_ACT_R.create("T");
				MCQueryApiBuilder mfgActR_bldr = MCQueryApiBuilder.create(mfgActR_t);
				mfgActR_bldr.setWhere(mfgActR_t.mfg_act_no.eq(bind("1")), up0().srch_tgt_no());
				dbSelect("MSBCL1100_MST_MFG_ACT_S01", mfgActR, mfgActR_bldr);
				up0().srch_tgt_no(mfgActR.mfg_inst_no());
				up0().div_seq(mfgActR.div_seq());

			}
			// 製造実績の検索
			selectMfgAct();
			if (down0().isEmpty()) {
				return;
			}

			// 工程実績の検索
			selectOperAct();
			if (down1().isEmpty()) {
				down0().clear();
				return;
			}

			// 投入実績の検索
			selectInptAct();

			// 工数実績の検索
			selectWkAct();

			// 出来高実績の検索
			selectYieldAct();

			// 副産品出来高実績の検索
			selectByProdAct();

			// ロス実績の検索
			selectLossAct();

		}
		protected void selectMfgAct() {
			executeQuery(down0(), MSBCL1100_MST_MFG_ACT_S01(), up0());

		}
		protected void selectOperAct() {
			executeQuery(down1(), MSBCL1100_MST_OPER_ACT_S01(), up0());
		}

		protected void selectInptAct() {
			executeQuery(down2(), MSBCL1100_MST_INPT_ACT_S01(), up0());
		}

		protected void selectWkAct() {
			executeQuery(down3(), MSBCL1100_MST_WK_ACT_S01(), up0());
		}

		protected void selectYieldAct() {
			executeQuery(down4(), MSBCL1100_MST_YIELD_ACT_S01(), up0());

		}
		protected void selectByProdAct() {
			executeQuery(down5(), MSBCL1100_MST_YIELD_ACT_S02(), up0());
		}

		protected void selectLossAct() {
			executeQuery(down7(), MSBCL1100_MST_LOSS_ACT_S01(), down2());
		}
		/**
		 * 実績残のワークテーブルに検索結果を登録する
		 */
		protected void insWrkTbl() {
			// 工程実績残のワークテーブル
			MCList<MST_OPER_ACT_REM_R> operActRemWrkL = MCList.create(MST_OPER_ACT_REM_R.class);			
			for (Srch01_DtlOperR operR :down1()) {
				MST_OPER_ACT_REM_R operActRemWrkR = MST_OPER_ACT_REM_R.create();
				operActRemWrkR.oper_inst_no(operR.oper_inst_no());
				operActRemWrkR.div_seq(down0().div_seq());
				operActRemWrkL.add(operActRemWrkR);
			}
			if (!operActRemWrkL.isEmpty()) {
				dbWkInsert("MSBCL1100_MSW_OPER_ACT_REM_I01", operActRemWrkL,
						MCQueryApiBuilder.create(MST_OPER_ACT_REM_R.create("T")).getBaseDbc());
			}

			// 投入実績残のワークテーブル
			MCList<MST_INPT_ACT_REM_R> inptActRemWrkL = MCList.create(MST_INPT_ACT_REM_R.class);
			for (Srch01_DtlInptR inptR :down2()) {
				MST_INPT_ACT_REM_R inptActRemWrkR = MST_INPT_ACT_REM_R.create();
				inptActRemWrkR.inpt_schd_no(inptR.inpt_schd_no());
				inptActRemWrkR.div_seq(down0().div_seq());
				inptActRemWrkL.add(inptActRemWrkR);
			}
			if (!inptActRemWrkL.isEmpty()) {
				dbWkInsert("MSBCL1100_MSW_INPT_ACT_REM_I01", inptActRemWrkL,
						MCQueryApiBuilder.create(MST_INPT_ACT_REM_R.create("T")).getBaseDbc());
			}

			// 工数実績残のワークテーブル
			MCList<MST_WK_ACT_REM_R> wkActRemWrkL = MCList.create(MST_WK_ACT_REM_R.class);
			for (Srch01_DtlWkR wkR :down3()) {
				MST_WK_ACT_REM_R wkActRemWrkR = MST_WK_ACT_REM_R.create();
				wkActRemWrkR.wk_schd_no(wkR.wk_schd_no());
				wkActRemWrkR.div_seq(down0().div_seq());
				wkActRemWrkL.add(wkActRemWrkR);
			}
			if (!wkActRemWrkL.isEmpty()) {
				dbWkInsert("MSBCL1100_MSW_WK_ACT_REM_I01", wkActRemWrkL,
						MCQueryApiBuilder.create(MST_WK_ACT_REM_R.create("T")).getBaseDbc());
			}

			// 出来高実績残のワークテーブル
			MCList<MST_YIELD_ACT_REM_R> yieldActRemWrkL = MCList.create(MST_YIELD_ACT_REM_R.class);
			for (Srch01_DtlYieldR yieldR :down4()) {
				MST_YIELD_ACT_REM_R yieldActRemWrkR = MST_YIELD_ACT_REM_R.create();
				yieldActRemWrkR.yield_schd_no(yieldR.yield_schd_no());
				yieldActRemWrkR.div_seq(down0().div_seq());
				yieldActRemWrkL.add(yieldActRemWrkR);
			}
			for (Srch01_DtlByProdR byProdR :down5()) {
				MST_YIELD_ACT_REM_R yieldActRemWrkR = MST_YIELD_ACT_REM_R.create();
				yieldActRemWrkR.yield_schd_no(byProdR.yield_schd_no());
				yieldActRemWrkR.div_seq(down0().div_seq());
				yieldActRemWrkL.add(yieldActRemWrkR);
			}
			if (!yieldActRemWrkL.isEmpty()) {
				dbWkInsert("MSBCL1100_MSW_YIELD_ACT_REM_I01", yieldActRemWrkL,
						MCQueryApiBuilder.create(MST_YIELD_ACT_REM_R.create("T")).getBaseDbc());
			}
		}
		/**
		 * 製造指図を主な取得先とした検索処理
		 */
		protected void srchMfgInst() {

			// 製造指図の検索
			if (up0().inst_srch_flg()) {
				selectMfgInst();
				if (down0().isEmpty()) {
					return;
				}
			}

			// 工程指図の検索
			selectOperInst();
			if (down1().isEmpty()) {
				down0().clear();
				return;
			}

			// 投入予定の検索
			selectInptSchd();

			// 工数予定の検索
			selectWkSchd();

			// 出来高予定の検索
			selectYieldSchd();

			// 副産品出来高予定の検索
			selectByProdSchd();

			// 入荷実績の検索
			selectArrAct();

			// ロス理由マスタの検索
			selectLossRsn();

			// ソート
			sortDtl();
		}

		protected void selectMfgInst() {
			executeQuery(down0(), MSBCL1100_MST_MFG_ACT_REM_S01(), up0());
			if (!down0().isEmpty()) {
				down0().st_act_dt(getToday());
				down0().st_ac_dt(getToday());
			}
		}

		protected void selectOperInst() {
			MCList<Srch01_DtlOperR> operL = MCList.create(Srch01_DtlOperR.class);
			executeQuery(operL, MSBCL1100_MST_OPER_ACT_REM_S01(), up0());
			down1().addAll(operL);
		}

		protected void selectInptSchd() {
			MCList<Srch01_DtlInptR> inptL = MCList.create(Srch01_DtlInptR.class);

			if (!isNull(up0().ope()) && up0().inst_srch_flg()
					&& !isSame(down0().base_unit_mfg_inst_qty(), down0().base_unit_st_act_qty())) {
				// opeがnullではない＝Srch01として実行された場合、かつ指図検索ＦＬＧがtrueの場合、
				// かつ製造指図数量と着手数量が等しくない＝着手時分割されている場合、Sprt04を呼ぶ
				MSBCL_MfgActReg.Sprt04 o = MSBCL_MfgActReg.crtSprt04();
				o.up0().mfg_inst_no(up0().srch_tgt_no());
				o.up0().base_unit_st_qty(down0().base_unit_st_act_qty());
				o.exec();
				
				inptL.setAll(o.down1());
			}
			else {
				// 上記以外の場合、従来の検索処理
				executeQuery(inptL, MSBCL1100_MST_INPT_ACT_REM_S01(), up0());
			}

			boolean excludeFlg = true;
			// 製造指図数量と着手数量が等しくない＝着手時分割されている場合はfalse
			if (!isSame(down0().base_unit_mfg_inst_qty(), down0().base_unit_st_act_qty())) {
				excludeFlg = false;
			}
			for (Srch01_DtlInptR inptR : inptL) {
				if (!isNullOrZero(inptR.base_unit_schd_inpt_qty())
						|| !isNullOrZero(inptR.base_unit_schd_fxd_rqmt_qty())) {
					excludeFlg = false;
					break;
				}
			}
			for (Srch01_DtlInptR inptR : inptL) {
				// 数量がnullもしくはマイナスの場合はゼロを設定する
				if (isNull(inptR.base_unit_schd_inpt_qty())
						|| inptR.base_unit_schd_inpt_qty().isNegative()) {
					inptR.base_unit_schd_inpt_qty(MCNumber.ZERO);
				}
				if (isNull(inptR.base_unit_schd_fxd_rqmt_qty())
						|| inptR.base_unit_schd_fxd_rqmt_qty().isNegative()) {
					inptR.base_unit_schd_fxd_rqmt_qty(MCNumber.ZERO);
				}
				if (isNull(inptR.base_unit_inpt_rem_qty())
						|| inptR.base_unit_inpt_rem_qty().isNegative()) {
					inptR.base_unit_inpt_rem_qty(MCNumber.ZERO);
				}
				if (inptR.cont_fctr_flg()) {
					if (!isNull(inptR.cont_schd_inpt_qty())
							&& inptR.cont_schd_inpt_qty().isNegative()) {
						inptR.cont_schd_inpt_qty(MCNumber.ZERO);
					}
					if (!isNull(inptR.cont_schd_fxd_rqmt_qty())
							&& inptR.cont_schd_fxd_rqmt_qty().isNegative()) {
						inptR.cont_schd_fxd_rqmt_qty(MCNumber.ZERO);
					}
				}
				
				inptR.base_unit_inpt_qty_bef(nvl(inptR.base_unit_inpt_qty(), MCNumber.ZERO));
				inptR.base_unit_fxd_loss_qty_bef(nvl(inptR.base_unit_fxd_loss_qty(), MCNumber.ZERO));
				
				if (!isNull(up0().ope()) || excludeFlg) {
					if (!isAllQtyNullOrZero(inptR)) {
						// 以下は、実績登録対象外とするため検索しない
						// ・同一再計算グループで前の分割連番で既に消化済みの投入予定
						// ・代替品目指定がオンの品目が存在する代替グループで、オフとなった投入予定
						down2().add(inptR);
					}
				}
				else {
					down2().add(inptR);
				}
			}
		}
		
		protected boolean isAllQtyNullOrZero(Srch01_DtlInptR inptR) {
			// 必要数量は投入しない数量なので考慮しない
			// 残数があるかどうかは有効成分で判断していない（基準単位投入数で判断している）ため、投入数、固定必要数でチェックする
			if (isNullOrZero(inptR.base_unit_schd_inpt_qty())
					&& isNullOrZero(inptR.base_unit_schd_fxd_rqmt_qty())) {
				return true;
			}
			return false;
		}
		
		protected boolean isNullOrZero(MCNumber num) {
			return isNull(num) || num.isZero();
		}

		protected void selectWkSchd() {
			MCList<Srch01_DtlWkR> retWkL = MCList.create(Srch01_DtlWkR.class);
			executeQuery(retWkL, MSBCL1100_MST_WK_ACT_REM_S01(), up0());
			for (Srch01_DtlWkR r : retWkL) {
				// 数量がマイナスの場合はゼロを設定する
				if (r.schd_wk_cost().isNegative()) {
					r.schd_wk_cost(MCNumber.ZERO);
				}
				if (r.rem_wk_cost().isNegative()) {
					r.rem_wk_cost(MCNumber.ZERO);
				}
			}
			down3().addAll(retWkL);
		}

		protected void selectYieldSchd() {
			MCList<Srch01_DtlYieldR> yieldL = MCList.create(Srch01_DtlYieldR.class);
			executeQuery(yieldL, MSBCL1100_MST_YIELD_ACT_REM_S01(), up0());
			for (Srch01_DtlYieldR r : yieldL) {
				// 数量がマイナスの場合はゼロを設定する
				if (r.base_unit_yield_schd_qty().isNegative()) {
					r.base_unit_yield_schd_qty(MCNumber.ZERO);
				}
				if (r.base_unit_yield_rem_qty().isNegative()) {
					r.base_unit_yield_rem_qty(MCNumber.ZERO);
				}
				r.base_unit_yield_act_qty_bef(nvl(r.base_unit_yield_act_qty(), MCNumber.ZERO));
			}
			down4().addAll(yieldL);
		}
		protected void selectByProdSchd() {
			MCList<Srch01_DtlByProdR> byProdL = MCList.create(Srch01_DtlByProdR.class);
			executeQuery(byProdL, MSBCL1100_MST_YIELD_ACT_REM_S02(), up0());
			for (Srch01_DtlByProdR r : byProdL) {
				// 数量がマイナスの場合はゼロを設定する
				if (r.base_unit_yield_schd_qty().isNegative()) {
					r.base_unit_yield_schd_qty(MCNumber.ZERO);
				}
				if (r.base_unit_yield_rem_qty().isNegative()) {
					r.base_unit_yield_rem_qty(MCNumber.ZERO);
				}
				r.base_unit_yield_act_qty_bef(nvl(r.base_unit_yield_act_qty(), MCNumber.ZERO));
			}
			down5().addAll(byProdL);
		}

		protected void selectArrAct() {
			if (MSC_MFG_MTD_TYP.isEXTNL(down0().mfg_mtd_typ())) {
				executeQuery(down6(), MSBCL1100_MST_ARR_ACT_S01(), up0());
			}
		}

		protected void selectLossRsn() {
			MCList<MST_INPT_ACT_REM_R> inptActRemL = MCList.create(MST_INPT_ACT_REM_R.class);
			for (Srch01_DtlInptR inptR : down2().groupBy(Srch01_DtlInptR.$inpt_schd_no)) {
				MST_INPT_ACT_REM_R inptActRemR = MST_INPT_ACT_REM_R.create();
				inptActRemR.inpt_schd_no(inptR.inpt_schd_no());
				inptActRemR.div_seq(nvl(down0().div_seq(), MCNumber.ZERO));
				inptActRemL.add(inptActRemR);
			}
			if (!inptActRemL.isEmpty()) {
				MCQueryApiBuilder inptActRemL_bldr = MCQueryApiBuilder.create(MST_INPT_ACT_REM_R.create("T"));
				dbWkDelete("MSBCL1100_MSW_INPT_ACT_REM_D01", inptActRemL_bldr.getBaseDbc());
				dbWkInsert("MSBCL1100_MSW_INPT_ACT_REM_I02", inptActRemL, inptActRemL_bldr.getBaseDbc());
				MCList<Srch01_DtlLossR> lossL = MCList.create(Srch01_DtlLossR.class);
				executeQuery(lossL, MSBCL1100_MAM_LOSS_RSN_S01());
				down7().addAll(lossL);
			}
			
			// 製造実績ＮＯから、計画外の投入実績に紐付くロス理由マスタ（ロス実績登録済を除く）を取得
			if (!isNull(down0().mfg_act_no())) {
				MCRow bindR = MCRow.create();
				bindR.setStringNE("mfg_act_no", down0().mfg_act_no());
				MCList<Srch01_DtlLossR> lossL = MCList.create(Srch01_DtlLossR.class);
				executeQuery(lossL, MSBCL1100_MAM_LOSS_RSN_S02(), bindR);
				down7().addAll(lossL);
			}
		}

		/**
		 * 実績残のワークテーブルを削除する
		 */
		protected void delWrkTbl() {
			// 工程実績残のワークテーブル
			dbWkDelete("MSBCL1100_MSW_OPER_ACT_REM_D01",
					MCQueryApiBuilder.create(MST_OPER_ACT_REM_R.create("T")).getBaseDbc());

			// 投入実績残のワークテーブル
			dbWkDelete("MSBCL1100_MSW_INPT_ACT_REM_D02",
					MCQueryApiBuilder.create(MST_INPT_ACT_REM_R.create("T")).getBaseDbc());

			// 工数実績残のワークテーブル
			dbWkDelete("MSBCL1100_MSW_WK_ACT_REM_D01",
					MCQueryApiBuilder.create(MST_WK_ACT_REM_R.create("T")).getBaseDbc());
			
			// 出来高実績残のワークテーブル
			dbWkDelete("MSBCL1100_MSW_YIELD_ACT_REM_D01",
					MCQueryApiBuilder.create(MST_YIELD_ACT_REM_R.create("T")).getBaseDbc());

			// ロス実績のワークテーブル
			dbWkDelete("MSBCL1100_MSW_LOSS_ACT_D01",
					MCQueryApiBuilder.create(MST_LOSS_ACT_R.create("T")).getBaseDbc());

		}

		protected void editDown() {
			editOper();
			editInptAndLoss();
			editWk();
			editYield();
			editByProd();
		}

		protected void editOper() {
			setPegNo(down1());
			for (Srch01_DtlOperR r : down1()) {
				calcOperQty(r);
				calcBaseUnitActQty(r);
			}
		}

		/**
		 * 工程単位指図数の計算
		 * @param down1L
		 */
		protected void calcOperQty(Srch01_DtlOperR r) {
			MCNumber operUnitRemQty = null;
			MCNumber operUnitSchdQty = convQtyBaseToOper(r.base_unit_schd_qty(),
					r.oper_conv_qty(), r.oper_std_qty(), r.oper_unit_dec_place(),
					r.oper_unit_conv_rnd_typ());

			if (!isNull(r.oper_act_no())) {
				operUnitRemQty = convQtyBaseToOper(r.base_unit_rem_qty(),
						r.oper_conv_qty(), r.oper_std_qty(), r.oper_unit_dec_place(),
						r.oper_unit_conv_rnd_typ());
			}
			else {
				operUnitRemQty = operUnitSchdQty;
			}
			r.oper_unit_schd_qty(operUnitSchdQty);
			r.oper_unit_rem_qty(operUnitRemQty);
		}
		
		protected void calcBaseUnitActQty(Srch01_DtlOperR r) {
			if (!isNull(r.oper_act_no())) {
				r.base_unit_act_qty(convQtyOperToBase(r.oper_unit_act_qty(),
						r.oper_conv_qty(), r.oper_std_qty(), r.base_unit_dec_place(),
						r.base_unit_conv_rnd_typ(), r.base_unit_cd(), r.oper_unit_cd()));
			}
		}

		protected void editInptAndLoss() {
			// 投入紐付けＮＯの設定
			setPegNo(down2());
			MCIndexKey actkey = down2().createIndex(Srch01_DtlInptR.$inpt_act_no);
			MCIndexKey schdkey = down2().createIndex(Srch01_DtlInptR.$inpt_schd_no);
			// ロスコンテナに設定
			for (Srch01_DtlLossR r :down7()) {
				Srch01_DtlInptR inptR = null;
				if (!isNull(r.inpt_act_no())) {
					inptR = down2().getFirst(actkey, r.inpt_act_no());
				}
				else {
					inptR = down2().getFirst(schdkey, r.inpt_schd_no());
				}

				if (isNull(inptR)) {
					continue;
				}
				r.inpt_peg_no(inptR.peg_no());
			}

			MCIndexKey losskey = down7().createIndex(Srch01_DtlLossR.$inpt_peg_no);
			for (Srch01_DtlInptR r : down2()) {
				Srch01_DtlOperR operR = null;
				if (!isNull(r.oper_act_no())) {
					operR = down1().getFirst(Srch01_DtlOperR.$oper_act_no, r.oper_act_no());
				}
				else {
					operR = down1().getFirst(Srch01_DtlOperR.$oper_inst_no, r.oper_inst_no());
				}
				if (!isNull(operR)) {
					r.oper_peg_no(operR.peg_no());
					r.oper_cd(operR.oper_cd());
					r.oper_nm(operR.oper_nm());
					r.oper_seq(operR.oper_seq());
					r.oper_disp_seq(operR.disp_seq());
				}
				
				if (isNull(r.inpt_act_no())) {
					if (MAC_PROV_TYP.isSS(r.prov_typ())) {
						r.stk_id_typ(MSC_STK_ID_TYP.SLF_SUPPRT.value());
					}
				}
				else {
					r.cont_acxfr_act_qty(
							convToContFctrUnit(r.acxfr_act_qty(),
									nvl(r.act_cont_fctr(),r.std_cont_fctr()), r.cont_fctr_dec_place(),
									r.cont_fctr_rnd_typ()));
				}
				
				// 投入一覧でのロス数量を入力可能とするための制御項目を設定
				MCList<Srch01_DtlLossR> subLossL = down7().subList(losskey, r.peg_no());
				if (isFxdLossQtyEnable(subLossL)) {
					r.fxd_loss_qty_enable_flg(true);
				}
				if (isLossQtyEnable(subLossL)) {
					r.loss_qty_enable_flg(true);
				}
				// ロット・サブロット混在可フラグの設定
				if (isNull(r.inpt_schd_no())) {
					if (!MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
						r.lot_mix_flg(true);
					}
					if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
						r.sublot_mix_flg(true);
					}
				}
			}
		}

		protected boolean isFxdLossQtyEnable(MCList<Srch01_DtlLossR> subLossL) {
			// クライアントにも同様の仕様のソースが存在するため、本メソッド修正時は注意が必要
			if (subLossL.subList(Srch01_DtlLossR.$fxd_loss_flg, true).size() == 1) {
				return true;
			}
			return false;
		}

		protected boolean isLossQtyEnable(MCList<Srch01_DtlLossR> subLossL) {
			// クライアントにも同様の仕様のソースが存在するため、本メソッド修正時は注意が必要
			MCList<Srch01_DtlLossR> defDispL = subLossL.subList(Srch01_DtlLossR.$def_disp_flg, true);
			if (defDispL.isEmpty()) {
				return false;
			}
			if (subLossL.subList(r -> (!r.fxd_loss_flg() && !isNull(r.loss_act_no()))).size() <= 1) {
				// sizeが0＝ロス実績が登録されていない
				// sizeが1＝ロス実績が登録されている
				return true;
			}
			return false;
		}

		protected void editWk() {
			for (Srch01_DtlWkR r : down3()) {
				Srch01_DtlOperR operR = null;
				if (!isNull(r.oper_act_no())) {
					operR = down1().getFirst(Srch01_DtlOperR.$oper_act_no, r.oper_act_no());
				}
				else {
					operR = down1().getFirst(Srch01_DtlOperR.$oper_inst_no, r.oper_inst_no());
				}
				if (!isNull(operR)) {
					r.oper_peg_no(operR.peg_no());
					r.oper_cd(operR.oper_cd());
					r.oper_nm(operR.oper_nm());
					r.oper_seq(operR.oper_seq());
					r.oper_disp_seq(operR.disp_seq());
				}
			}
		}

		protected void editYield() {
			String gdCd = getDefaultFeedStkGd().gd_cd();
			String gdNm = getDefaultFeedStkGd().gd_nm();
			for (Srch01_DtlYieldR r : down4()) {
				if (isNull(r.yield_act_no())) {
					r.gd_cd(gdCd);
					r.gd_nm(gdNm);
				}
				Srch01_DtlOperR operR = null;
				if (!isNull(r.oper_act_no())) {
					operR = down1().getFirst(Srch01_DtlOperR.$oper_act_no, r.oper_act_no());
				}
				else {
					operR = down1().getFirst(Srch01_DtlOperR.$oper_inst_no, r.oper_inst_no());
				}
				if (!isNull(operR)) {
					r.oper_peg_no(operR.peg_no());
					r.oper_cd(operR.oper_cd());
					r.oper_nm(operR.oper_nm());
					r.oper_seq(operR.oper_seq());
					r.oper_disp_seq(operR.disp_seq());
				}
				setYieldTrdUnit(r);
			}
		}

		protected void editByProd() {
			String gdCd = getDefaultFeedStkGd().gd_cd();
			String gdNm = getDefaultFeedStkGd().gd_nm();
			for (Srch01_DtlByProdR r : down5()) {
				if (isNull(r.yield_act_no())) {
					r.gd_cd(gdCd);
					r.gd_nm(gdNm);
				}
				Srch01_DtlOperR operR = null;
				if (!isNull(r.oper_act_no())) {
					operR = down1().getFirst(Srch01_DtlOperR.$oper_act_no, r.oper_act_no());
				}
				else {
					operR = down1().getFirst(Srch01_DtlOperR.$oper_inst_no, r.oper_inst_no());
				}
				if (!isNull(operR)) {
					r.oper_peg_no(operR.peg_no());
					r.oper_cd(operR.oper_cd());
					r.oper_nm(operR.oper_nm());
					r.oper_seq(operR.oper_seq());
					r.oper_disp_seq(operR.disp_seq());
				}
				setByProdTrdUnit(r);
			}
		}

		/**
		 * 検索結果をソートする
		 */
		protected void sortDtl() {
			down1().sort(Srch01_DtlOperR.$oper_inst_no , Srch01_DtlOperR.$st_act_dt ,Srch01_DtlOperR.$end_act_dt,Srch01_DtlOperR.$oper_act_no);
			down2().sort(Srch01_DtlInptR.$oper_peg_no, Srch01_DtlInptR.$disp_seq, Srch01_DtlInptR.$ac_dt);
			down3().sort(Srch01_DtlWkR.$oper_peg_no, Srch01_DtlWkR.$disp_seq, Srch01_DtlWkR.$ac_dt);
			down4().sort(Srch01_DtlYieldR.$oper_peg_no, Srch01_DtlYieldR.$yield_typ, Srch01_DtlYieldR.$disp_seq, Srch01_DtlYieldR.$ac_dt);
			down5().sort(Srch01_DtlByProdR.$oper_peg_no , Srch01_DtlByProdR.$disp_seq, Srch01_DtlByProdR.$ac_dt);
		}
	}

	/**
	 * 出来高の取引単位を設定する。Srch01の検索とSprt04の着手時再計算から呼ばれる
	 * @param r
	 */
	protected void setYieldTrdUnit(Srch01_DtlYieldR r) {

		// すでに出来高実績が登録されている場合は何もしない
		if (!isNull(r.yield_act_no())) {
			return;
		}
		
		// 基準単位数を取引単位数に変換し、また基準単位数に戻したとき、元の基準単位数に戻らない場合は基準単位を取引単位に設定
		MCNumber trdQty = rvrsBaseUnitConv(r.base_unit_yield_schd_qty(),
				r.conv_base_qty(), r.conv_qty(), r.trd_unit_dec_place(),
				r.trd_unit_conv_rnd_typ());
		MCNumber baseQty = convToBaseUnit(trdQty, r.conv_base_qty(), r.conv_qty(),
				r.base_unit_dec_place(), r.base_unit_conv_rnd_typ());

		if (!isSame(baseQty, r.base_unit_yield_schd_qty())) {
			r.trd_unit_cd(r.base_unit_cd());
			r.trd_unit_nm(r.base_unit_nm());
			r.trd_unit_conv_rnd_typ(r.base_unit_conv_rnd_typ());
			r.trd_unit_dec_place(r.base_unit_dec_place());
			r.conv_base_qty(1);
			r.conv_qty(1);
		}
	}
	
	/**
	 * 副産品の取引単位を設定する。Srch01の検索とSprt04の着手時再計算から呼ばれる
	 * @param r
	 */
	protected void setByProdTrdUnit(Srch01_DtlByProdR r) {

		// すでに出来高実績が登録されている場合は何もしない
		if (!isNull(r.yield_act_no())) {
			return;
		}
		
		// 基準単位数を取引単位数に変換し、また基準単位数に戻したとき、元の基準単位数に戻らない場合は基準単位を取引単位に設定
		MCNumber trdQty = rvrsBaseUnitConv(r.base_unit_yield_schd_qty(),
				r.conv_base_qty(), r.conv_qty(), r.trd_unit_dec_place(),
				r.trd_unit_conv_rnd_typ());
		MCNumber baseQty = convToBaseUnit(trdQty, r.conv_base_qty(), r.conv_qty(),
				r.base_unit_dec_place(), r.base_unit_conv_rnd_typ());

		if (!isSame(baseQty, r.base_unit_yield_schd_qty())) {
			r.trd_unit_cd(r.base_unit_cd());
			r.trd_unit_nm(r.base_unit_nm());
			r.trd_unit_conv_rnd_typ(r.base_unit_conv_rnd_typ());
			r.trd_unit_dec_place(r.base_unit_dec_place());
			r.conv_base_qty(1);
			r.conv_qty(1);
		}
	}
	
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 製造実績を登録・訂正する。<br>
	 */
	public class Upd01 extends MSBCL_MfgActReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callMfgActRegSrvChk();
			throwUpdErr();
			callMfgActRegSrv();
		}

		protected void editUp() {
			MCNumber hdrPegNo = MCNumber.ZERO;
			up0().peg_no(hdrPegNo);
			up0().upd_cntr_chk_flg(true);
			if (MSC_MFG_STS_TYP.isORD(up0().mfg_sts_typ())) {
				up0().mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
			}
			
			for (MfgActReg_Chk01_DtlOperR r : up1()) {
				r.hdr_peg_no(hdrPegNo);
			}
			for (MfgActReg_Chk01_DtlInptR r : up2()) {
				r.hdr_peg_no(hdrPegNo);
			}
			for (MfgActReg_Chk01_DtlWkR r : up4()) {
				r.hdr_peg_no(hdrPegNo);
			}
			for (MfgActReg_Chk01_DtlYieldR r : up5()) {
				r.hdr_peg_no(hdrPegNo);
			}
			for (MfgActReg_Chk01_DtlByProdR r : up6()) {
				r.hdr_peg_no(hdrPegNo);
			}
			// 投入・工程は画面から紐付けNOを受け取り、ロスは紐付けNOを持たないため、setPegNoしていない
			setPegNo(up4(), up5(), up6());
		}
		
		protected void callMfgActRegSrvChk() {
			MSBCL_MfgActRegService.MfgActReg_Chk01 chk = MSBCL_MfgActRegService.crtMfgActReg_Chk01();

			chk.up0().add(up0());
			chk.up1().setAll(up1());
			chk.up2().setAll(up2());
			chk.up3().setAll(up3());
			chk.up4().setAll(up4());
			chk.up5().setAll(up5());
			chk.up6().setAll(up6());
			chk.exec();

			MCRow.copyall(up0(), chk.down0().get(0));
			up1().setAll(chk.down1());
			up2().setAll(chk.down2());
			up3().setAll(chk.down3());
			up4().setAll(chk.down4());
			up5().setAll(chk.down5());
			up6().setAll(chk.down6());
		}
		protected void callMfgActRegSrv() {
			MfgActReg_Upd01_HdrR srvUp0 = MfgActReg_Upd01_HdrR.create();
			copy(srvUp0, up0(), createMap_MfgActReg_Upd01_HdrR_MfgActReg_Chk01_HdrR());
			maUpd01.up0().add(srvUp0);
			mapUpContainers(MA);

			maUpd01.exec();

			mapDownContainers(MA);
			setDown0();
		}

		protected void setDown0() {
			MfgActReg_Upd01_HdrR srvDown0 = maUpd01.down0().get(0);

			up0().mfg_act_no(srvDown0.mfg_act_no());
			up0().mfg_sts_typ(srvDown0.mfg_sts_typ());
			up0().mfg_sts_typ_nm(srvDown0.mfg_sts_typ_nm());
			up0().div_seq(srvDown0.div_seq());

			MCRow.copyall(down0(), up0());
		}
		protected Map_MfgActReg_Upd01_HdrR_MfgActReg_Chk01_HdrR<MfgActReg_Upd01_HdrR,MfgActReg_Chk01_HdrR> createMap_MfgActReg_Upd01_HdrR_MfgActReg_Chk01_HdrR() {
			return new Map_MfgActReg_Upd01_HdrR_MfgActReg_Chk01_HdrR<MfgActReg_Upd01_HdrR, MfgActReg_Chk01_HdrR>();
		}

		public class Map_MfgActReg_Upd01_HdrR_MfgActReg_Chk01_HdrR<D extends MfgActReg_Upd01_HdrR, S extends MfgActReg_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Upd01_HdrR.$data_crud_typ, MfgActReg_Chk01_HdrR.$data_crud_typ);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$peg_no, MfgActReg_Chk01_HdrR.$peg_no);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$err_flg, MfgActReg_Chk01_HdrR.$err_flg);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$mfg_sts_typ, MfgActReg_Chk01_HdrR.$mfg_sts_typ);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$itm_cd, MfgActReg_Chk01_HdrR.$itm_cd);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$itm_sub1, MfgActReg_Chk01_HdrR.$itm_sub1);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$itm_sub2, MfgActReg_Chk01_HdrR.$itm_sub2);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$itm_sub3, MfgActReg_Chk01_HdrR.$itm_sub3);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$inst_lot_no, MfgActReg_Chk01_HdrR.$inst_lot_no);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$inst_sublot_no, MfgActReg_Chk01_HdrR.$inst_sublot_no);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$sno1, MfgActReg_Chk01_HdrR.$sno1);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$sno2, MfgActReg_Chk01_HdrR.$sno2);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$sno3, MfgActReg_Chk01_HdrR.$sno3);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$sno4, MfgActReg_Chk01_HdrR.$sno4);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$sno1_mng_typ, MfgActReg_Chk01_HdrR.$sno1_mng_typ);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$sno2_mng_typ, MfgActReg_Chk01_HdrR.$sno2_mng_typ);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$sno3_mng_typ, MfgActReg_Chk01_HdrR.$sno3_mng_typ);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$sno4_mng_typ, MfgActReg_Chk01_HdrR.$sno4_mng_typ);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$st_act_tm, MfgActReg_Chk01_HdrR.$st_act_tm);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$st_ac_dt, MfgActReg_Chk01_HdrR.$st_ac_dt);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$end_act_tm, MfgActReg_Chk01_HdrR.$end_act_tm);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$end_ac_dt, MfgActReg_Chk01_HdrR.$end_ac_dt);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$itm_mfg_inst_qty, MfgActReg_Chk01_HdrR.$itm_mfg_inst_qty);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$base_unit_st_act_qty, MfgActReg_Chk01_HdrR.$base_unit_st_act_qty);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$base_unit_yield_qty, MfgActReg_Chk01_HdrR.$base_unit_yield_qty);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$base_unit_dfct_qty, MfgActReg_Chk01_HdrR.$base_unit_dfct_qty);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$rem_abort_flg, MfgActReg_Chk01_HdrR.$rem_abort_flg);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$base_unit_cd, MfgActReg_Chk01_HdrR.$base_unit_cd);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$base_unit_dec_place, MfgActReg_Chk01_HdrR.$base_unit_dec_place);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$base_unit_conv_rnd_typ, MfgActReg_Chk01_HdrR.$base_unit_conv_rnd_typ);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$act_usr_cd, MfgActReg_Chk01_HdrR.$act_usr_cd);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$act_dpt_cd, MfgActReg_Chk01_HdrR.$act_dpt_cd);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$act_rpt_rmrks, MfgActReg_Chk01_HdrR.$act_rpt_rmrks);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$intr_rmrks, MfgActReg_Chk01_HdrR.$intr_rmrks);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$mfg_act_sub_char1, MfgActReg_Chk01_HdrR.$mfg_act_sub_char1);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$mfg_act_sub_char2, MfgActReg_Chk01_HdrR.$mfg_act_sub_char2);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$mfg_act_sub_char3, MfgActReg_Chk01_HdrR.$mfg_act_sub_char3);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$act_prnt_flg, MfgActReg_Chk01_HdrR.$act_prnt_flg);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$act_prnt_tm, MfgActReg_Chk01_HdrR.$act_prnt_tm);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$prnt_seq, MfgActReg_Chk01_HdrR.$prnt_seq);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$itm_yield, MfgActReg_Chk01_HdrR.$itm_yield);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$mfg_mtd_typ, MfgActReg_Chk01_HdrR.$mfg_mtd_typ);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$mfg_inst_unit_typ, MfgActReg_Chk01_HdrR.$mfg_inst_unit_typ);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$sppl_cd, MfgActReg_Chk01_HdrR.$sppl_cd);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$mfg_loc_cd, MfgActReg_Chk01_HdrR.$mfg_loc_cd);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$mfg_str_ln_cd, MfgActReg_Chk01_HdrR.$mfg_str_ln_cd);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$bom_ptn, MfgActReg_Chk01_HdrR.$bom_ptn);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$site_cd, MfgActReg_Chk01_HdrR.$site_cd);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$wg_cd, MfgActReg_Chk01_HdrR.$wg_cd);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$mfg_inst_no, MfgActReg_Chk01_HdrR.$mfg_inst_no);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$mfg_inst_upd_cntr, MfgActReg_Chk01_HdrR.$mfg_inst_upd_cntr);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$mfg_inst_pr_upd_cntr, MfgActReg_Chk01_HdrR.$mfg_inst_pr_upd_cntr);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$mfg_act_upd_cntr, MfgActReg_Chk01_HdrR.$mfg_act_upd_cntr);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$div_seq, MfgActReg_Chk01_HdrR.$div_seq);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$mfg_act_no, MfgActReg_Chk01_HdrR.$mfg_act_no);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$itm_ord_no, MfgActReg_Chk01_HdrR.$itm_ord_no);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$aprv_flg, MfgActReg_Chk01_HdrR.$aprv_flg);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$mfg_aprv_role_cd, MfgActReg_Chk01_HdrR.$mfg_aprv_role_cd);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$old_mfg_aprv_sts_typ, MfgActReg_Chk01_HdrR.$old_mfg_aprv_sts_typ);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$old_end_act_tm, MfgActReg_Chk01_HdrR.$old_end_act_tm);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$itm_mfg_inst_no, MfgActReg_Chk01_HdrR.$itm_mfg_inst_no);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$trd_cd, MfgActReg_Chk01_HdrR.$trd_cd);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$lot_mng_typ, MfgActReg_Chk01_HdrR.$lot_mng_typ);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$lot_no_typ, MfgActReg_Chk01_HdrR.$lot_no_typ);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$lot_no_ptn_cd, MfgActReg_Chk01_HdrR.$lot_no_ptn_cd);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$sublot_mng_typ, MfgActReg_Chk01_HdrR.$sublot_mng_typ);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$sublot_no_typ, MfgActReg_Chk01_HdrR.$sublot_no_typ);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$sublot_no_ptn_cd, MfgActReg_Chk01_HdrR.$sublot_no_ptn_cd);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$arr_purc_auto_reg_flg, MfgActReg_Chk01_HdrR.$arr_purc_auto_reg_flg);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$act_immed_prnt_flg, MfgActReg_Chk01_HdrR.$act_immed_prnt_flg);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$not_pd_chk_flg, MfgActReg_Chk01_HdrR.$not_pd_chk_flg);

			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 製造実績を削除する。<br>
	 */
	public class Del01 extends MSBCL_MfgActReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callMfgActReg_Del01();
		}

		protected void editUp() {
			up0().peg_no(MCNumber.ZERO);
		}

		protected void callMfgActReg_Del01() {
			MSBCL_MfgActRegService.MfgActReg_Del01 ope = MSBCL_MfgActRegService.crtMfgActReg_Del01();
			MfgActReg_Del01_HdrR opeUp1 = ope.up1().createRow();

			MCList<MfgActReg_Del01_DtlInptR> opeUp2 = MCList.create(MfgActReg_Del01_DtlInptR.class);
			MCList<Del01_DtlInptR> up1 = MCList.create(Del01_DtlInptR.class);
			up1 = up1().subList(r -> (!isNull(r.inpt_act_no())));

			MCList<MfgActReg_Del01_DtlYieldR> opeUp3 = MCList.create(MfgActReg_Del01_DtlYieldR.class);
			MCList<Del01_DtlYieldR> up2 = MCList.create(Del01_DtlYieldR.class);
			up2 = up2().subList(r -> (!isNull(r.yield_act_no())));

			MCList<MfgActReg_Del01_DtlByProdR> opeUp4 = MCList.create(MfgActReg_Del01_DtlByProdR.class);
			MCList<Del01_DtlByProdR> up3 = MCList.create(Del01_DtlByProdR.class);
			up3 = up3().subList(r -> (!isNull(r.yield_act_no())));

			copy(opeUp1, up0(), createMap_MfgActReg_Del01_HdrR_Del01_HdrR());
			addAll(opeUp2, up1, createMap_MfgActReg_Del01_DtlInptR_Del01_DtlInptR());
			addAll(opeUp3, up2, createMap_MfgActReg_Del01_DtlYieldR_Del01_DtlYieldR());
			addAll(opeUp4, up3, createMap_MfgActReg_Del01_DtlByProdR_Del01_DtlByProdR());
			ope.up0().lst_del_flg(false);
			ope.up0().not_commit_flg(true);
			ope.up0().upd_cntr_chk_flg(true);
			ope.up1().add(opeUp1);
			ope.up2().addAll(opeUp2);
			ope.up3().addAll(opeUp3);
			ope.up4().addAll(opeUp4);
			ope.exec();
		}

		protected Map_MfgActReg_Del01_HdrR_Del01_HdrR<MfgActReg_Del01_HdrR,Del01_HdrR> createMap_MfgActReg_Del01_HdrR_Del01_HdrR() {
			return new Map_MfgActReg_Del01_HdrR_Del01_HdrR<MfgActReg_Del01_HdrR, Del01_HdrR>();
		}

		public class Map_MfgActReg_Del01_HdrR_Del01_HdrR<D extends MfgActReg_Del01_HdrR, S extends Del01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Del01_HdrR.$peg_no, Del01_HdrR.$peg_no);
				addColumnPathMap(MfgActReg_Del01_HdrR.$mfg_act_no, Del01_HdrR.$mfg_act_no);
				addColumnPathMap(MfgActReg_Del01_HdrR.$mfg_inst_upd_cntr, Del01_HdrR.$mfg_inst_upd_cntr);
				addColumnPathMap(MfgActReg_Del01_HdrR.$mfg_inst_pr_upd_cntr, Del01_HdrR.$mfg_inst_pr_upd_cntr);
				addColumnPathMap(MfgActReg_Del01_HdrR.$mfg_act_upd_cntr, Del01_HdrR.$mfg_act_upd_cntr);

			}
		}

		protected Map_MfgActReg_Del01_DtlInptR_Del01_DtlInptR<MfgActReg_Del01_DtlInptR,Del01_DtlInptR> createMap_MfgActReg_Del01_DtlInptR_Del01_DtlInptR() {
			return new Map_MfgActReg_Del01_DtlInptR_Del01_DtlInptR<MfgActReg_Del01_DtlInptR, Del01_DtlInptR>();
		}

		public class Map_MfgActReg_Del01_DtlInptR_Del01_DtlInptR<D extends MfgActReg_Del01_DtlInptR, S extends Del01_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Del01_DtlInptR.$inpt_act_no, Del01_DtlInptR.$inpt_act_no);
				addColumnPathMap(MfgActReg_Del01_DtlInptR.$can_ac_dt, Del01_DtlInptR.$can_ac_dt);

			}
		}

		protected Map_MfgActReg_Del01_DtlYieldR_Del01_DtlYieldR<MfgActReg_Del01_DtlYieldR,Del01_DtlYieldR> createMap_MfgActReg_Del01_DtlYieldR_Del01_DtlYieldR() {
			return new Map_MfgActReg_Del01_DtlYieldR_Del01_DtlYieldR<MfgActReg_Del01_DtlYieldR, Del01_DtlYieldR>();
		}

		public class Map_MfgActReg_Del01_DtlYieldR_Del01_DtlYieldR<D extends MfgActReg_Del01_DtlYieldR, S extends Del01_DtlYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Del01_DtlYieldR.$yield_act_no, Del01_DtlYieldR.$yield_act_no);
				addColumnPathMap(MfgActReg_Del01_DtlYieldR.$can_ac_dt, Del01_DtlYieldR.$can_ac_dt);

			}
		}

		protected Map_MfgActReg_Del01_DtlByProdR_Del01_DtlByProdR<MfgActReg_Del01_DtlByProdR,Del01_DtlByProdR> createMap_MfgActReg_Del01_DtlByProdR_Del01_DtlByProdR() {
			return new Map_MfgActReg_Del01_DtlByProdR_Del01_DtlByProdR<MfgActReg_Del01_DtlByProdR, Del01_DtlByProdR>();
		}

		public class Map_MfgActReg_Del01_DtlByProdR_Del01_DtlByProdR<D extends MfgActReg_Del01_DtlByProdR, S extends Del01_DtlByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Del01_DtlByProdR.$yield_act_no, Del01_DtlByProdR.$yield_act_no);
				addColumnPathMap(MfgActReg_Del01_DtlByProdR.$can_ac_dt, Del01_DtlByProdR.$can_ac_dt);

			}
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 製造実績を承認する。<br>
	 */
	public class Upd02 extends MSBCL_MfgActReg_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();

			callMfgInstActComUpd01();
			
			MCRow.copyall(down0(), up0());
		}
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			up0().peg_no(MCNumber.ZERO);
			up0().aprv_tm(MCDate.now());
		}

		/**
		 * 製造指図・実績共通処理サービスの呼出
		 */
		protected void callMfgInstActComUpd01() {
			MSBCL_MfgInstActComService.MfgInstActCom_Upd01 ope = MSBCL_MfgInstActComService.crtMfgInstActCom_Upd01();
			MfgInstActCom_Chk01_DtlR r = MfgInstActCom_Chk01_DtlR.create();

			ope.up0().lst_reg_flg(false);
			ope.up0().mfg_aprv_sts_typ(MSC_MFG_APRV_STS_TYP.ACT_ACPT.value());
			copy(r, up0(), createMap_MfgInstActCom_Chk01_DtlR_Upd02_DtlR());
			ope.up1().add(r);
			ope.exec();

			up0().mfg_aprv_sts_typ(ope.down0().get(0).mfg_aprv_sts_typ());
			up0().mfg_aprv_sts_typ_nm(ope.down0().get(0).mfg_aprv_sts_typ_nm());
		}
	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 製造実績の承認を取り消す。<br>
	 */
	public class Del02 extends MSBCL_MfgActReg_MC_A.Del02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();

			callMfgInstActComUpd01();
			
			MCRow.copyall(down0(), up0());
		}
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			up0().peg_no(MCNumber.ZERO);
		}

		/**
		 * 製造指図・実績共通処理サービスの呼出
		 */
		protected void callMfgInstActComUpd01() {
			MSBCL_MfgInstActComService.MfgInstActCom_Upd01 ope = MSBCL_MfgInstActComService.crtMfgInstActCom_Upd01();
			MfgInstActCom_Chk01_DtlR r = MfgInstActCom_Chk01_DtlR.create();

			ope.up0().lst_reg_flg(false);
			ope.up0().mfg_aprv_sts_typ(MSC_MFG_APRV_STS_TYP.ACT_OPN.value());
			copy(r, up0(), createMap_MfgInstActCom_Chk01_DtlR_Upd02_DtlR());
			ope.up1().add(r);
			ope.exec();

			up0().mfg_aprv_sts_typ(ope.down0().get(0).mfg_aprv_sts_typ());
			up0().mfg_aprv_sts_typ_nm(ope.down0().get(0).mfg_aprv_sts_typ_nm());
		}
	}

	protected Map_MfgInstActCom_Chk01_DtlR_Upd02_DtlR<MfgInstActCom_Chk01_DtlR,Upd02_DtlR> createMap_MfgInstActCom_Chk01_DtlR_Upd02_DtlR() {
		return new Map_MfgInstActCom_Chk01_DtlR_Upd02_DtlR<MfgInstActCom_Chk01_DtlR, Upd02_DtlR>();
	}

	public class Map_MfgInstActCom_Chk01_DtlR_Upd02_DtlR<D extends MfgInstActCom_Chk01_DtlR, S extends Upd02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$peg_no, Upd02_DtlR.$peg_no);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$mfg_inst_no, Upd02_DtlR.$mfg_inst_no);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$itm_mfg_inst_no, Upd02_DtlR.$itm_mfg_inst_no);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$div_seq, Upd02_DtlR.$div_seq);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$mfg_act_no, Upd02_DtlR.$mfg_act_no);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_dt, Upd02_DtlR.$aprv_dt);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_tm, Upd02_DtlR.$aprv_tm);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_dpt_cd, Upd02_DtlR.$aprv_dpt_cd);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_usr_cd, Upd02_DtlR.$aprv_usr_cd);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_rsn, Upd02_DtlR.$aprv_rsn);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$mfg_inst_upd_cntr, Upd02_DtlR.$mfg_inst_upd_cntr);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$mfg_act_upd_cntr, Upd02_DtlR.$mfg_act_upd_cntr);

		}
	}

	/**
	 * Sprt04オペレーション.<p>
	 *
	 * 入力された着手数量で指図、出来高、投入、工数、副産品の数量を再計算する。<br>
	 */
	public class Sprt04 extends MSBCL_MfgActReg_MC_A.Sprt04 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 検索処理の実行
			callSrch01();
			callMfgReCalcSrv();
			setDown();
		}
		
		protected void callSrch01() {
			// 着手数量を一旦減らしてから再度増やした場合に、画面にない投入品を下らせる必要がある
			// また、画面上で各種明細テーブルに行コピーをした場合に、その行を着手時再計算後に残してはいけないため、
			// 画面から各種明細を上らせるのではなく、本サービス内で検索処理を実行し、着手数量を設定する作りとなっている
			MSBCL_MfgActReg.Srch01 o = MSBCL_MfgActReg.crtSrch01();
			o.up0().srch_tgt_typ(MSC_PROD_SRCH_TGT_TYP.MFG_INST_NO.value());
			o.up0().srch_tgt_no(up0().mfg_inst_no());
			o.up0().div_seq(up0().div_seq());
			o.up0().inst_srch_flg(true);
			o.exec();
			
			// ヘッダ
			up0().peg_no(MCNumber.ZERO);
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			up0().div_seq(MCNumber.ZERO);
			
			// 工程
			Sprt04_DtlOper().addAll(o.down1());
			for (Srch01_DtlOperR r : Sprt04_DtlOper()) {
				r.hdr_peg_no(up0().peg_no());
			}
			
			// 投入
			Sprt04_DtlInpt().addAll(o.down2());
			for (Srch01_DtlInptR r : Sprt04_DtlInpt()) {
				r.hdr_peg_no(up0().peg_no());
			}
			
			// ロス
			down2().addAll(o.down7());
			
			// 工数
			Sprt04_DtlWk().addAll(o.down3());
			setPegNo(Sprt04_DtlWk());
			for (Srch01_DtlWkR r : Sprt04_DtlWk()) {
				r.hdr_peg_no(up0().peg_no());
			}
			
			// 出来高
			Sprt04_DtlYield().addAll(o.down4());
			setPegNo(Sprt04_DtlYield());
			for (Srch01_DtlYieldR r : Sprt04_DtlYield()) {
				r.hdr_peg_no(up0().peg_no());
			}
			
			// 副産品
			Sprt04_DtlByProd().addAll(o.down5());
			setPegNo(Sprt04_DtlByProd());
			for (Srch01_DtlByProdR r : Sprt04_DtlByProd()) {
				r.hdr_peg_no(up0().peg_no());
			}
		}

		/**
		 * 製造再計算サービスを実行する。
		 */
		protected void callMfgReCalcSrv() {
			mapUpContainers(RC);
			reCalcSprt03.up0().add(up0());

			reCalcSprt03.exec();
			
			// 工程
			copyByPegNo(Sprt04_DtlOper(), new String[] {
					Srch01_DtlOperR.$oper_unit_schd_qty,
					Srch01_DtlOperR.$base_unit_schd_qty
			}, reCalcSprt03.down0(), new String[] {
					MfgReCalc_Sprt03_DtlOperR.$oper_unit_st_qty,
					MfgReCalc_Sprt03_DtlOperR.$base_unit_st_qty
			});
			// 投入
			copyByPegNo(Sprt04_DtlInpt(), new String[] {
					Srch01_DtlInptR.$base_unit_schd_inpt_qty,
					Srch01_DtlInptR.$base_unit_schd_fxd_rqmt_qty,
					Srch01_DtlInptR.$cont_schd_inpt_qty,
					Srch01_DtlInptR.$cont_schd_fxd_rqmt_qty
			}, reCalcSprt03.down3(), new String[] {
					MfgReCalc_Sprt03_DtlInptR.$base_unit_inpt_st_qty,
					MfgReCalc_Sprt03_DtlInptR.$base_unit_fxd_rqmt_st_qty,
					MfgReCalc_Sprt03_DtlInptR.$cont_inpt_st_qty,
					MfgReCalc_Sprt03_DtlInptR.$cont_fxd_rqmt_st_qty
			});

			// 工数
			copyByPegNo(Sprt04_DtlWk(), new String[] {
					Srch01_DtlWkR.$schd_wk_cost,
					Srch01_DtlWkR.$wk_cost,
					Srch01_DtlWkR.$fxd_wk_cost
			}, reCalcSprt03.down4(), new String[] {
					MfgReCalc_Sprt03_DtlWkR.$st_sum_wk_cost,
					MfgReCalc_Sprt03_DtlWkR.$st_wk_cost,
					MfgReCalc_Sprt03_DtlWkR.$st_fxd_wk_cost
			});

			// 出来高
			copyByPegNo(Sprt04_DtlYield(), new String[] {
					Srch01_DtlYieldR.$base_unit_yield_schd_qty
			}, reCalcSprt03.down1(), new String[] {
					MfgReCalc_Sprt03_DtlYieldR.$base_unit_yield_st_qty
			});

			// 副産品
			copyByPegNo(Sprt04_DtlByProd(), new String[] {
					Srch01_DtlByProdR.$base_unit_yield_schd_qty
			}, reCalcSprt03.down2(), new String[] {
					MfgReCalc_Sprt03_DtlYieldR.$base_unit_yield_st_qty
			});
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			setDownOper();
			setDownInptAndLoss();
			setDownWk();
			setDownYield();
			setDownByProd();
		}
		
		/**
		 * 工程の下り電文を編集する。
		 */
		protected void setDownOper() {
			down0().addAll(Sprt04_DtlOper());
			for (Srch01_DtlOperR r : down0()) {
				// 残数量には予定数量を設定
				r.base_unit_rem_qty(r.base_unit_schd_qty());
				r.oper_unit_rem_qty(r.oper_unit_schd_qty());
			}
		}

		/**
		 * 投入の下り電文を編集する。
		 */
		protected void setDownInptAndLoss() {
			// 投入の場合、再計算グループ単位で、順番に割り当てしていくため、投入数量が0の行が下ってくる場合がある。
			// その行は、下り電文コンテナから除く
			MCList<Srch01_DtlInptR> exceptZeroInptL = MCList.create(Srch01_DtlInptR.class);
			for (Srch01_DtlInptR r : Sprt04_DtlInpt()) {
				if (isIgnoreInptDown(r)) {
					continue;
				}
				// 残数量には予定投入数量+予定固定ロス数量を設定
				r.base_unit_inpt_rem_qty(r.base_unit_schd_inpt_qty().add(nvl(r.base_unit_schd_fxd_rqmt_qty(), MCNumber.ZERO)));
				exceptZeroInptL.add(r);
			}
			down1().setAll(exceptZeroInptL);
			
			MCList<Srch01_DtlLossR> exceptZeroLossL = MCList.create(Srch01_DtlLossR.class);
			MCIndexKey idxkey = down1().createIndex(Srch01_DtlInptR.$peg_no);
			for (Srch01_DtlLossR r : down2()) {
				if (!isNull(down1().getFirst(idxkey, r.inpt_peg_no()))) {
					exceptZeroLossL.add(r);
				}
			}
			down2().setAll(exceptZeroLossL);
		}
		
		protected boolean isIgnoreInptDown(Srch01_DtlInptR r) {
			MCNumber qty1 = nvl(r.base_unit_schd_inpt_qty(), MCNumber.ZERO);
			MCNumber qty2 = nvl(r.base_unit_schd_fxd_rqmt_qty(), MCNumber.ZERO);
			MCNumber qty3 = nvl(r.cont_schd_inpt_qty(), MCNumber.ZERO);
			MCNumber qty4 = nvl(r.cont_schd_fxd_rqmt_qty(), MCNumber.ZERO);
			if (qty1.isZero() && qty2.isZero() && qty3.isZero() && qty4.isZero()) {
				return true;
			}
			return false;
		}

		/**
		 * 工数の下り電文を編集する。
		 */
		protected void setDownWk() {
			down3().addAll(Sprt04_DtlWk());
			for (Srch01_DtlWkR r : down3()) {
				r.schd_wk_cost(sum(r.wk_cost(), r.fxd_wk_cost()));
				// 残工数には予定工数を設定
				r.rem_wk_cost(sum(r.wk_cost(), r.fxd_wk_cost()));
			}
		}

		/**
		 * 出来高の下り電文を編集する。
		 */
		protected void setDownYield() {
			down4().addAll(Sprt04_DtlYield());
			for (Srch01_DtlYieldR r : down4()) {
				// 残数量には予定数量を設定
				r.base_unit_yield_rem_qty(r.base_unit_yield_schd_qty());
				setYieldTrdUnit(r);
			}
		}

		/**
		 * 副産品の下り電文を編集する。
		 */
		protected void setDownByProd() {
			down5().addAll(Sprt04_DtlByProd());
			for (Srch01_DtlByProdR r : down5()) {
				// 残数量には予定数量を設定
				r.base_unit_yield_rem_qty(r.base_unit_yield_schd_qty());
				setByProdTrdUnit(r);
			}
		}
	}

	/**
	 * Sprt06オペレーション.<p>
	 *
	 * 投入再計算ボタン押下時、工程実績または出来高実績の予定数量・実績数量から投入の数量を再計算する。<br>
	 */
	public class Sprt06 extends MSBCL_MfgActReg_MC_A.Sprt06 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			if (up1().isEmpty()) {
				return;
			}
			callMfgReCalcSrv();
			setDown();
		}

		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			// ヘッダ
			up0().peg_no(MCNumber.ZERO);
			if (isNull(up0().div_seq())) {
				up0().div_seq(MCNumber.ZERO);
			}
			// 工程
			MCList<Sprt06_DtlOperR> exceptDelOperL = MCList.create(Sprt06_DtlOperR.class);
			for (Sprt06_DtlOperR r : up1()) {
				if (!r.isStatusDelete()) {
					r.hdr_peg_no(up0().peg_no());
					exceptDelOperL.add(r);
				}
			}
			up1().setAll(exceptDelOperL);
			// 出来高
			for (Sprt06_DtlYieldR r : up2()) {
				r.hdr_peg_no(up0().peg_no());
				if (r.isStatusDelete()) {
					r.base_unit_yield_act_qty(MCNumber.ZERO);
				}
			}

			// 製造実績簡易登録(MD)から呼び出される時に処理を行う
			// 製造実績登録からはbase_unit_st_act_qty値は設定されない
			if (!isNull(up0().base_unit_st_act_qty())) {
				if (isSame(getSysParm("PROP_BK_INST_QTY_FLG"), "1")) {
					convYieldStQty(up0(), up2());
				}
			}

			// 投入
			for (Sprt06_DtlInptR r : up3()) {
				r.peg_no(r.up_peg_no());
			}
			setSrvUpInptL();
		}

		protected static final int DEC_PLACE = 8;
		protected void convYieldStQty(MfgReCalc_Sprt02_HdrR hdrR, MCList<Sprt06_DtlYieldR> dtlYieldL) {
			MCList<MST_YIELD_SCHD_R> ysL = selectYieldSchd(dtlYieldL);

			MCIndexKey ysKey = ysL.createIndex(MST_YIELD_SCHD_R.$yield_schd_no);

			for (Sprt06_DtlYieldR dtlYieldR : dtlYieldL) {
				MST_YIELD_SCHD_R ysR = ysL.getFirst(ysKey, dtlYieldR.yield_schd_no());

				if (isNull(ysR)) {
					continue;
				}

				if (ysR.getNumberNE("hdr_inst_qty").eq(ysR.getNumberNE("hdr_yield_qty"))) {
					continue;
				}

				if (dtlYieldR.base_unit_yield_st_qty().eq(ysR.getNumberNE("hdr_yield_qty"))) {
					dtlYieldR.base_unit_yield_st_qty(ysR.getNumberNE("hdr_inst_qty"));
					continue;
				}

				if (ysR.getNumberNE("hdr_yield_qty").eq(ysR.base_unit_yield_qty())) {
					dtlYieldR.base_unit_yield_st_qty(hdrR.base_unit_st_act_qty());
					continue;
				}

				dtlYieldR.base_unit_yield_st_qty(ysR.getNumberNE("hdr_inst_qty")
						.multiply(dtlYieldR.base_unit_yield_st_qty())
						.divide(ysR.getNumberNE("hdr_yield_qty"), DEC_PLACE,
								MAC_RND_TYP.RNDUP.toMC()));
			}
		}

		protected MCList<MST_YIELD_SCHD_R> selectYieldSchd(
				MCList<Sprt06_DtlYieldR> dtlYieldL) {
			MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R yieldSchd = MST_YIELD_SCHD_R.create("YIELD_SCHD");
			MCQueryApiBuilder ysL_bldr = MCQueryApiBuilder.create(yieldSchd);
			MAM_ITM_R itm = MAM_ITM_R.create("ITM");
			MST_MFG_INST_R mfgInst = MST_MFG_INST_R.create("MFG_INST");
			ysL_bldr.setSelect(yieldSchd.yield_schd_no);
			ysL_bldr.addSelect(yieldSchd.base_unit_yield_qty);
			ysL_bldr.addSelect(mfgInst.base_unit_inst_qty.as("hdr_inst_qty"));
			ysL_bldr.addSelect(mfgInst.base_unit_yield_qty.as("hdr_yield_qty"));
			ysL_bldr.addInnerJoin(itm,
					bracket(yieldSchd.itm_cd.eq(itm.itm_cd)
							.and(yieldSchd.itm_sub1.eq(itm.itm_sub1))
							.and(yieldSchd.itm_sub2.eq(itm.itm_sub2))
							.and(yieldSchd.itm_sub3.eq(itm.itm_sub3))));
			ysL_bldr.addInnerJoin(mfgInst, bracket(yieldSchd.mfg_inst_no.eq(mfgInst.mfg_inst_no)));
			dbSelectKey("MSBCL1100_MST_YIELD_SCHD_S01",
					ysL, ysL_bldr, dtlYieldL.groupBy(MST_YIELD_SCHD_R.$yield_schd_no));
			return ysL;
		}
		
		/**
		 * 再計算サービスに渡す投入コンテナを設定する
		 */
		protected void setSrvUpInptL() {
			MCList<Sprt06_DtlInptR> srvL = MCList.create(Sprt06_DtlInptR.class);
			
			MCIndexKey operPegIdxkey = up3().createIndex(Sprt06_DtlInptR.$oper_peg_no);
			MCIndexKey operInstIdxkey = up3().createIndex(Sprt06_DtlInptR.$oper_inst_no);
			
			// 上り電文には、処理後の画面でのソートのため再計算対象外の工程に紐付く投入も設定されている
			// そのため、上り電文の工程に紐付かない投入はここで排除する
			up1().sort(Sprt06_DtlOperR.$peg_no);
			
			MCNumber inptPegNo = (MCNumber)up3().max(Sprt06_DtlInptR.$up_peg_no);
			
			for (Sprt06_DtlOperR operR : up1()) {
				// 工程紐付けＮＯで投入予定を取得
				Set<String> pegSet = new HashSet<String>();
				
				MCList<Sprt06_DtlInptR> pegL = up3().subList(operPegIdxkey, operR.peg_no());
				if (!pegL.isEmpty()) {
					for (Sprt06_DtlInptR r : pegL) {
						if (!r.isStatusDelete()) {
							r.hdr_peg_no(up0().peg_no());
							if (isRecalc(operR, r)) {
								pegSet.add(r.inpt_schd_no());
								srvL.add(r);
							}
						}
					}
				}
				
				MCList<Sprt06_DtlInptR> operInstL = up3().subList(operInstIdxkey, operR.oper_inst_no());
				for (Sprt06_DtlInptR r : operInstL) {
					if (!pegSet.contains(r.inpt_schd_no())) {
						// 紐付ＮＯで投入コンテナが取得できなかった場合は、同一工程指図ＮＯのほかの工程紐付けＮＯに紐付く投入予定をcloneする
						// ※外注の分納など、工程実績が行コピーで登録されている場合に、それぞれの工程に紐付く形で投入実績を登録したいので
						Sprt06_DtlInptR addR = r.clone();
						inptPegNo = inptPegNo.add(MCNumber.ONE);
						addR.peg_no(inptPegNo);
						addR.add_flg(true);
						addR.up_peg_no(null);
						addR.hdr_peg_no(up0().peg_no());
						addR.oper_peg_no(operR.peg_no());
						addR.oper_act_no(operR.oper_act_no());
						addR.inpt_act_no(null);
						addR.base_unit_inpt_act_qty(null);
						addR.cont_inpt_act_qty(null);
						addR.ac_dt(null);
						if (!isNull(r.inpt_act_no())) {
							pegSet.add(r.inpt_schd_no());
						}
						if (isRecalc(operR, r)) {
							srvL.add(addR);
						}
					}
				}
			}
						
			setQty(srvL);
			
			Sprt06_DtlInptForSrv().addAll(srvL);
		}
		
		protected boolean isRecalc(Sprt06_DtlOperR operR, Sprt06_DtlInptR r) {
			if (MAC_BKF_TYP.isOPER_QTY_ED(r.bkf_typ())
				||  MAC_BKF_TYP.isSCHD_QTY_ED(r.bkf_typ())) {
				
				if (isNull(operR.end_act_tm())
						|| (!isNull(operR.end_act_tm())
							&& operR.not_cmpl_flg())) {
					return false;
				}
				return true;
			}
			return true;
		}
		
		protected void setQty(MCList<Sprt06_DtlInptR> srvL) {
			for (Sprt06_DtlInptR r : srvL) {
				if (r.cont_fctr_flg()) {
					r.inpt_st_qty(r.cont_inpt_st_qty());
					r.inpt_act_qty(r.cont_inpt_act_qty());
					r.dec_place(r.cont_fctr_dec_place());
				}
				else {
					r.inpt_st_qty(r.base_unit_inpt_st_qty());
					r.inpt_act_qty(r.base_unit_inpt_act_qty());
					r.dec_place(r.base_unit_dec_place());
				}
			}
		}
		
		/**
		 * 製造再計算サービスを実行する。
		 */
		protected void callMfgReCalcSrv() {
			mapUpContainers(RC);
			reCalcSprt02.up0().add(up0());
			reCalcSprt02.exec();
			copyByPegNo(Sprt06_DtlInptForSrv(), new String[] {
					Sprt06_DtlInptR.$inpt_act_qty
			}, reCalcSprt02.down0(), new String[] {
					MfgReCalc_Sprt02_DtlInptR.$inpt_act_qty
			});
		}
		
		protected void setDown() {
			// 再計算対象外のデータを下り電文に設定
			up3().removeAll(Sprt06_DtlInptForSrv());
			down0().addAll(up3());

			for (Sprt06_DtlInptR r : Sprt06_DtlInptForSrv()) {
				if (r.cont_fctr_flg()) {
					r.cont_inpt_act_qty(r.inpt_act_qty());
					r.base_unit_inpt_act_qty(convToBaseUnitFromContFctrUnit(r.cont_inpt_act_qty(),
							nvl(r.act_cont_fctr(), r.std_cont_fctr()),
							r.base_unit_dec_place(), r.base_unit_conv_rnd_typ()));
				}
				else {
					r.base_unit_inpt_act_qty(r.inpt_act_qty());
				}
				
				if (isAddDown(r)) {
					down0().add(r);
				}
			}
			
			addLossDown(down0().subList(Sprt06_DtlInptR.$add_flg, true));
		}
		
		protected void addLossDown(MCList<Sprt06_DtlInptR> addInptL) {
			MCList<MST_INPT_ACT_REM_R> inptActRemL = MCList.create(MST_INPT_ACT_REM_R.class);
			for (Sprt06_DtlInptR inptR : addInptL) {
				MST_INPT_ACT_REM_R inptActRemR = MST_INPT_ACT_REM_R.create();
				inptActRemR.inpt_schd_no(inptR.inpt_schd_no());
				inptActRemR.div_seq(MCNumber.ZERO);
				inptActRemL.add(inptActRemR);
			}
			MCQueryApiBuilder inptActRemL_bldr = MCQueryApiBuilder.create(MST_INPT_ACT_REM_R.create("T"));
			dbWkDelete("MSBCL1100_MSW_INPT_ACT_REM_D03", inptActRemL_bldr.getBaseDbc());
			dbWkInsert("MSBCL1100_MSW_INPT_ACT_REM_I03", inptActRemL, inptActRemL_bldr.getBaseDbc());
			executeQuery(down1(), MSBCL1100_MAM_LOSS_RSN_S01());
			MCIndexKey idxkey = down1().createIndex(Srch01_DtlLossR.$inpt_schd_no);
			MCList<Srch01_DtlLossR> tmpL = MCList.create(Srch01_DtlLossR.class);
			for (Sprt06_DtlInptR r : addInptL) {
				MCList<Srch01_DtlLossR> lossSubL = down1().subList(idxkey, r.inpt_schd_no());
				for (Srch01_DtlLossR lossR : lossSubL) {
					lossR.inpt_peg_no(r.peg_no());
					tmpL.add(lossR.clone());
				}
			}
			down1().setAll(tmpL);
		}
		
		protected boolean isAddDown(Sprt06_DtlInptR r) {
			// 本サービス内で追加したが再計算結果がnullまたは0の場合は、画面に下らせる意味がないため下り電文に含めない
			if (isNull(r.base_unit_inpt_act_qty()) && isNull(r.cont_inpt_act_qty())) {
				// 本サービスで追加していない行の場合でも、行コピーやロット提案によって追加された行（行ステータスが「Create」）は下り電文に含めない
				if (r.add_flg() || r.isStatusCreate()) {
					return false;
				}
			}
			return true;
		}
	}
	
	/**
	 * Sprt07オペレーション.<p>
	 *
	 * 工数再計算ボタン押下時、工程実績または出来高実績の予定数量・実績数量から工数を再計算する。<br>
	 */
	public class Sprt07 extends MSBCL_MfgActReg_MC_A.Sprt07 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			if (up1().isEmpty()) {
				return;
			}
			callMfgReCalcSrv();
			setDown();
		}

		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			// ヘッダ
			up0().peg_no(MCNumber.ZERO);
			if (isNull(up0().div_seq())) {
				up0().div_seq(MCNumber.ZERO);
			}
			// 工程
			MCList<Sprt06_DtlOperR> exceptDelOperL = MCList.create(Sprt06_DtlOperR.class);
			for (Sprt06_DtlOperR r : up1()) {
				if (!r.isStatusDelete()) {
					r.hdr_peg_no(up0().peg_no());
					exceptDelOperL.add(r);
				}
			}
			up1().setAll(exceptDelOperL);
			// 出来高
			for (Sprt06_DtlYieldR r : up2()) {
				r.hdr_peg_no(up0().peg_no());
				if (r.isStatusDelete()) {
					r.base_unit_yield_act_qty(MCNumber.ZERO);
				}
			}
			// 工数
			setSrvUpWkL();
		}
		
		/**
		 * 再計算サービスに渡す工数コンテナを設定する
		 */
		protected void setSrvUpWkL() {
			MCList<Sprt07_DtlWkR> srvL = MCList.create(Sprt07_DtlWkR.class);
			
			MCIndexKey operPegIdxkey = up3().createIndex(Sprt07_DtlWkR.$oper_peg_no);
			MCIndexKey operInstIdxkey = up3().createIndex(Sprt07_DtlWkR.$oper_inst_no);
			
			// 上り電文には、処理後の画面でのソートのため再計算対象外の工程に紐付く工数も設定されている
			// そのため、上り電文の工程に紐付かない工数はここで排除する
			up1().sort(Sprt06_DtlOperR.$peg_no);
			for (Sprt06_DtlOperR operR : up1()) {
				// 工程紐付けＮＯで工数予定を取得
				Set<String> pegSet = new HashSet<String>();
				
				MCList<Sprt07_DtlWkR> pegL = up3().subList(operPegIdxkey, operR.peg_no());
				if (!pegL.isEmpty()) {
					for (Sprt07_DtlWkR r : pegL) {
						if (!r.isStatusDelete()) {
							r.hdr_peg_no(up0().peg_no());
							pegSet.add(r.wk_schd_no());
							srvL.add(r);
						}
					}
				}
				
				MCList<Sprt07_DtlWkR> operInstL = up3().subList(operInstIdxkey, operR.oper_inst_no());
				for (Sprt07_DtlWkR r : operInstL) {
					if (!pegSet.contains(r.wk_schd_no())) {
						// 紐付ＮＯで工数コンテナが取得できなかった場合は、同一工程指図ＮＯのほかの工程紐付けＮＯに紐付く工数予定をcloneする
						// ※工程実績が行コピーで登録されている場合に、それぞれの工程に紐付く形で工数実績を登録したいので
						Sprt07_DtlWkR addR = r.clone();
						addR.add_flg(true);
						addR.hdr_peg_no(up0().peg_no());
						addR.oper_peg_no(operR.peg_no());
						addR.oper_act_no(operR.oper_act_no());
						addR.wk_act_no(null);
						addR.act_cost(null);
						if (!isNull(r.wk_act_no())) {
							pegSet.add(r.wk_schd_no());
						}
						srvL.add(addR);
					}
				}
			}
			
			setPegNo(srvL);
			Sprt07_DtlWkForSrv().addAll(srvL);
		}
		
		/**
		 * 製造再計算サービスを実行する。
		 */
		protected void callMfgReCalcSrv() {
			mapUpContainers(RC);
			reCalcSprt02.up0().add(up0());
			reCalcSprt02.exec();
			copyByPegNo(Sprt07_DtlWkForSrv(), new String[] {
					Sprt07_DtlWkR.$act_cost
			}, reCalcSprt02.down1(), new String[] {
					MfgReCalc_Sprt02_DtlWkR.$act_cost
			});
		}
		
		protected void setDown() {
			// 再計算対象外のデータを下り電文に設定
			up3().removeAll(Sprt07_DtlWkForSrv());
			down0().addAll(up3());
			for (Sprt07_DtlWkR r : Sprt07_DtlWkForSrv()) {
				if (isAddDown(r)) {
					down0().add(r);
				}
			}
		}
		
		protected boolean isAddDown(Sprt07_DtlWkR r) {
			// 本サービス内で追加したが再計算結果がnullまたは0の場合は、画面に下らせる意味がないため下り電文に含めない
			if (!r.add_flg()) {
				return true;
			}
			if (isNull(r.act_cost())) {
				return false;
			}
			return true;
		}
	}
	
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 在庫から投入品のロットを提案する。<br>
	 */
	public class Sprt01 extends MSBCL_MfgActReg_MC_A.Sprt01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			lotProp();
			setDown();
		}
		
		protected void editUp() {
			// 工程指図ＮＯの設定
			setOperInstNo();
			
			// ロット提案対象の抽出
			MCList<Srch01_DtlInptR> inptL = getLotPropExeList();
			
			// 実際有効成分のクリア
			clearActContFctr(inptL);

			// ロット・サブロットＮＯの設定
			setLotAndSubLotMntTyp(inptL);

			// 投入予定の内容をロット提案サービスの上り電文に設定
			setLotPropSrvUp(inptL);
		}
		
		protected void setOperInstNo() {
			for (Srch01_DtlInptR r : up0()) {
				// 工程実績を行コピーしたときに行コピーした工程ごとにロット提案させるため工程紐つけＮＯを渡す
				r.oper_inst_no(r.oper_peg_no().toString());
			}
		}
		
		/**
		 * ロット提案対象の抽出
		 * @return ロット提案対象リスト
		 */
		protected MCList<Srch01_DtlInptR> getLotPropExeList() {

			MCList<Srch01_DtlInptR> retL = MCList.create(Srch01_DtlInptR.class);

			
			MCList<Srch01_DtlInptR> upL = up0().clone();

			for (Srch01_DtlInptR r : upL) {

				//下記を満たすレコードは処理対象外とする
				//・削除行
				//・投入数が０ or ＮＵＬＬ
				//・自給（在庫識別区分または支給区分）
				//・非在庫品
				if (r.isStatusDelete()
						|| sum(nvl(r.base_unit_inpt_qty(), 0), nvl(r.base_unit_loss_qty(), 0),
								nvl(r.base_unit_fxd_loss_qty(), 0)).isZero()
						|| MSC_STK_ID_TYP.isSLF_SUPPRT(r.stk_id_typ())
						|| MAC_PROV_TYP.isSS(r.prov_typ())
						|| !MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())
				) {
					continue;
				}
				
				//上記に該当しないレコードでロット提案対象フラグがオンのレコードを対象とする
				if (r.lot_prop_tgt_flg()) {
					retL.add(r);
				}
			}
			return retL;
		}
		
		/**
		 * 有効成分対象で実際有効成分係数が設定されている場合はクリア
		 * @param ロット提案対象リスト
		 */
		protected void clearActContFctr(MCList<Srch01_DtlInptR> inptL) {
			for (Srch01_DtlInptR r : inptL) {
				if(r.cont_fctr_flg() && !isNull(r.act_cont_fctr())){
					r.act_cont_fctr(null);
				}
			}
		}

		/**
		 * ロットＮＯ管理区分・サブロット管理区分をチェックし、<br>
		 * ロット提案サービスを呼ぶ際の上り電文にセットするロットＮＯ・サブロットＮＯを調整
		 * 
		 * @param ロット提案対象リスト
		 */
		protected void setLotAndSubLotMntTyp(MCList<Srch01_DtlInptR> inptL) {

			//ロット提案対象でループ
			for (Srch01_DtlInptR r : inptL) {

				//ロットＮＯ管理しない場合はＮＵＬＬ文字をセットする
				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
					r.lot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					r.lot_no(null);
				}

				//サブロットＮＯ管理しない場合はＮＵＬＬ文字をセットする
				if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
					r.sublot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					r.sublot_no(null);
				}
			}
		}
		
		/**
		 * ロット提案対象のリストからロット提案サービスの上り電文を設定
		 * 
		 * @param ロット提案対象リスト
		 */
		protected void setLotPropSrvUp(MCList<Srch01_DtlInptR> inptL) {
			lotPropSprt01.up0().act_flg(true); //実績時フラグはオン
			lotPropSprt01.up0().exec_prop_btn_flg(true); //ロット提案ボタンから実行フラグはオン
			
			addAll(lotPropSprt01.up1(), inptL, createMap_LotProp_Sprt01_Dtl1R_Srch01_DtlInptR());

			MCIndexKey idxKey = inptL.createIndex(Srch01_DtlInptR.$peg_no);
			for (Srch01_DtlLossR r : up1()) {
				Srch01_DtlInptR inptR = inptL.getFirst(idxKey, r.inpt_peg_no());
				if (!isNull(inptR)) {
					LotProp_Sprt01_Dtl4R up2R = LotProp_Sprt01_Dtl4R.create();
					copy(up2R, r, createMap_LotProp_Sprt01_Dtl4R_Srch01_DtlLossR());
					lotPropSprt01.up3().add(up2R);
				}
			}
		}

		/**
		 * ロット提案サービスの実行
		 */
		protected void lotProp() {
			lotPropSprt01.exec();
		}

		/**
		 * 下り電文のセット
		 */
		protected void setDown() {

			//通常ロット提案
			MCList<Srch01_DtlInptR> nrmlL = MCList.create(Srch01_DtlInptR.class);
			//代替Ｇでのロット提案
			MCList<Srch01_DtlInptR> altGL = MCList.create(Srch01_DtlInptR.class);

			for (Srch01_DtlInptR upR : up0()) {
				if (isNull(upR.alt_grp_cd()) || upR.alt_itm_fix_flg()) {
					// 指図時に代替品目指定している場合は、通常品としてロット提案する
					nrmlL.add(upR);
				}
				else {
					altGL.add(upR);
				}
			}

			if (!nrmlL.isEmpty()) {
				setNrmlLotPropRslt(nrmlL);
			}
			if (!altGL.isEmpty()) {
				setAltGLotPropRslt(altGL);
			}
		}

		/**
		 * 通常ロット提案結果を下り電文にセットする
		 * @param nrmlL
		 */
		protected void setNrmlLotPropRslt(MCList<Srch01_DtlInptR> nrmlL) {
			MCIndexKey srvUpIdxKey = lotPropSprt01.up1().createIndex(LotProp_Sprt01_Dtl1R.$peg_no);
			MCIndexKey srvDown0IdxKey = lotPropSprt01.down0().createIndex(LotProp_Sprt01_Dtl1R.$peg_no);
			MCIndexKey thisUp0IdxKey = up0().createIndex(Srch01_DtlInptR.$peg_no);
			MCIndexKey srvDown1IdxKey = lotPropSprt01.down2().createIndex(LotProp_Sprt01_Dtl4R.$loss_peg_no);
			MCIndexKey thisUp1IdxKey = up1().createIndex(Srch01_DtlLossR.$inpt_peg_no);

			MCNumber maxPegNoNum = (MCNumber) up0().max(Srch01_DtlInptR.$peg_no);
			int maxPegNo = maxPegNoNum.intValue();

			//上り電文でループ
			for (Srch01_DtlInptR r : nrmlL) {

				//ロット提案対象のRowかどうかのチェック
				LotProp_Sprt01_Dtl1R lotPropR = lotPropSprt01.up1().getFirst(srvUpIdxKey, r.peg_no());
				if (isNull(lotPropR)) {
					down0().add(r);
					continue;
				}

				//処理結果から紐付けＮＯが同じものを抽出
				MCList<LotProp_Sprt01_Dtl1R> lotPropRsltL = lotPropSprt01.down0()
						.subList(srvDown0IdxKey, r.peg_no());

				//ロット提案対象で提案結果が無かった場合は
				//上り電文のロットＮＯ・サブロットＮＯをクリアし下り電文にセットする
				if (lotPropRsltL.size() == 0) {
					Srch01_DtlInptR lotPropExeR = up0().getFirst(thisUp0IdxKey, r.peg_no());
					if (!isNull(lotPropExeR)) {
						r.lot_no(null);
						r.sublot_no(null);
						r.ver_no(null);
					}
					down0().add(r);
					continue;
				}

				// ロス実績を取得
				MCList<Srch01_DtlLossR> lossL = up1().subList(thisUp1IdxKey, r.peg_no());

				//ロット提案結果を下り電文に反映
				for (LotProp_Sprt01_Dtl1R rsltR : lotPropRsltL) {

					Srch01_DtlInptR addR = Srch01_DtlInptR.create();

					// １件目の場合
					if (lotPropRsltL.indexOf(rsltR) == 0) {
						if (isSame(r.getStatus(), MCRow.NONE)) {
							r.setStatus(MCRow.MODIFY);
						}
						addR = r;
					}
					// ２件目以降の場合
					else {
						addR = r.clone();
						addR.peg_no(++maxPegNo);
					}
					setExeRsult(addR, rsltR);
					down0().add(addR);
					
					// ロス実績にロット提案結果を反映
					MCList<LotProp_Sprt01_Dtl4R> lossRsltL = lotPropSprt01.down2().subList(srvDown1IdxKey, rsltR.loss_peg_no());
					down1().addAll(setExeLossRsult(addR.peg_no(), lossL, lossRsltL));
				}
			}
		}

		/**
		 * 代替Ｇロット提案結果を下り電文にセットする
		 * @param altGL
		 */
		protected void setAltGLotPropRslt(MCList<Srch01_DtlInptR> altGL) {
			String[] gbkeys = new String[] {
					Srch01_DtlInptR.$oper_inst_no, Srch01_DtlInptR.$alt_grp_cd,
					Srch01_DtlInptR.$alt_grp_seq
			};

			MCIndexKey srvUpIdxKey = lotPropSprt01.up1().createIndex(LotProp_Sprt01_Dtl1R.$peg_no);
			MCIndexKey srvDown0IdxKey = lotPropSprt01.down0().createIndex(LotProp_Sprt01_Dtl1R.$peg_no);
			
			MCIndexKey altIdxKey = lotPropSprt01.down0().createIndex(
					LotProp_Sprt01_Dtl1R.$oper_inst_no, LotProp_Sprt01_Dtl1R.$alt_grp_cd,
					LotProp_Sprt01_Dtl1R.$alt_grp_seq, LotProp_Sprt01_Dtl1R.$alt_itm_fix_flg);

			MCIndexKey srvDown1IdxKey = lotPropSprt01.down2().createIndex(LotProp_Sprt01_Dtl4R.$loss_peg_no);
			MCIndexKey thisUp1IdxKey = up1().createIndex(Srch01_DtlLossR.$inpt_peg_no);

			MCList<Srch01_DtlInptR> listForMaxPegNoNum = MCList.create(Srch01_DtlInptR.class);
			listForMaxPegNoNum.addAll(up0());
			listForMaxPegNoNum.addAll(down0());
			MCNumber maxPegNoNum = (MCNumber) listForMaxPegNoNum.max(Srch01_DtlInptR.$peg_no);
			int maxPegNo = maxPegNoNum.intValue();

			for (Srch01_DtlInptR gbR : altGL.groupBy(gbkeys)) {

				Comparable[] vals = new Comparable[]{
					gbR.oper_inst_no(), gbR.alt_grp_cd(), gbR.alt_grp_seq()
				};

				MCList<Srch01_DtlInptR> altGsubL
				= altGL.subList(gbkeys, vals);
				
				// ロット提案によって代替グループが決定したかどうか
				boolean hasAltItmFix = !isNull(lotPropSprt01.down0().getFirst(altIdxKey,
						gbR.oper_inst_no(), gbR.alt_grp_cd(), gbR.alt_grp_seq(), true));

				//ロット提案結果を下り電文に追加する
				for (Srch01_DtlInptR subR : altGsubL) {

					//ロット提案対象のRowかどうかのチェック
					LotProp_Sprt01_Dtl1R lotPropR = lotPropSprt01.up1().getFirst(srvUpIdxKey, subR.peg_no());
					if (isNull(lotPropR)) {
						down0().add(subR);
						continue;
					}

					//ロット提案結果から紐付けＮＯが同じものを抽出
					MCList<LotProp_Sprt01_Dtl1R> lotPropRsltL = lotPropSprt01.down0()
							.subList(srvDown0IdxKey, subR.peg_no());

					// ロス実績を取得
					MCList<Srch01_DtlLossR> lossL = up1().subList(thisUp1IdxKey, subR.peg_no());

					//ロット提案結果を下り電文に追加
					for (LotProp_Sprt01_Dtl1R rsltR : lotPropRsltL) {

						Srch01_DtlInptR addR;

						// １件目の場合
						if (lotPropRsltL.indexOf(rsltR) == 0) {
							if (isSame(subR.getStatus(), MCRow.NONE)) {
								subR.setStatus(MCRow.MODIFY);
							}
							addR = subR;
						}
						// ２件目以降の場合
						else {
							addR = subR.clone();
							addR.peg_no(++maxPegNo);
						}
						setExeRsult(addR, rsltR);
						
						// 代替品が決定した場合、代替品目指定がfalseの行の選択チェックをオフにする
						if (hasAltItmFix) {
							addR.check(rsltR.alt_itm_fix_flg());
						}
						
						down0().add(addR);
						
						// ロス実績にロット提案結果を反映
						MCList<LotProp_Sprt01_Dtl4R> lossRsltL = lotPropSprt01.down2().subList(srvDown1IdxKey, rsltR.loss_peg_no());
						down1().addAll(setExeLossRsult(addR.peg_no(), lossL, lossRsltL));
					}
				}
			}
		}

		/**
		 * 他勘定振替関連項目のクリア
		 */
		protected void clearAcXfr(Srch01_DtlInptR r) {
			r.acxfr_act_qty(null);
			r.acxfr_act_bd_dpt_cd(null);;
			r.acxfr_act_bd_dpt_nm(null);
			r.acxfr_act_rsn_cd(null);
			r.acxfr_act_rsn_nm(null);
		}

		/**
		 * ロット提案結果を下り電文のRowにコピーする
		 * @param dest コピー先
		 * @param src コピー元
		 */
		protected void setExeRsult(Srch01_DtlInptR dest,
				LotProp_Sprt01_Dtl1R src) {

			dest.inpt_loc_cd(src.inpt_loc_cd());
			dest.inpt_str_ln_cd(src.inpt_str_ln_cd());
			dest.lot_no(src.lot_no());
			dest.sublot_no(src.sublot_no());
			dest.inst_sno1(src.rqst_sno1());
			dest.sno1_null_flg(src.sno1_null_flg());
			dest.inst_sno2(src.rqst_sno2());
			dest.sno2_null_flg(src.sno2_null_flg());
			dest.inst_sno3(src.rqst_sno3());
			dest.sno3_null_flg(src.sno3_null_flg());
			dest.inst_sno4(src.rqst_sno4());
			dest.sno4_null_flg(src.sno4_null_flg());
			dest.sno1(src.sno1());
			dest.sno2(src.sno2());
			dest.sno3(src.sno3());
			dest.sno4(src.sno4());
			dest.gd_cd(src.gd_cd());
			dest.gd_nm(src.gd_nm());
			dest.ver_no(src.ver_no());
			dest.act_cont_fctr(src.act_cont_fctr());
			dest.base_unit_inpt_qty(src.inpt_qty());
			dest.base_unit_loss_qty(src.loss_qty());
			dest.base_unit_fxd_loss_qty(src.fxd_loss_qty());
			dest.cont_inpt_qty(src.cont_inpt_qty());
			dest.cont_loss_qty(src.cont_loss_qty());
			dest.cont_fxd_loss_qty(src.cont_fxd_loss_qty());

			// 実績時のみ設定する項目
			dest.stk_id_typ(src.stk_id_typ());
			dest.stk_bp_cd(src.stk_bp_cd());
			dest.stk_bp_nm(src.stk_bp_nm());
			dest.stk_arrv_bp_cd(src.stk_arrv_bp_cd());
			dest.stk_arrv_bp_nm(src.stk_arrv_bp_nm());
		}

		/**
		 * ロス実績のロット提案結果を下り電文に格納する
		 */
		protected MCList<Srch01_DtlLossR> setExeLossRsult(MCNumber inptPegNo, MCList<Srch01_DtlLossR> lossL,
				MCList<LotProp_Sprt01_Dtl4R> rsltL) {

			MCList<Srch01_DtlLossR> addL = MCList.create(Srch01_DtlLossR.class);
			
			// ロット提案結果が存在しない場合、lossLをクローンし、数量をクリアして下り電文に追加する。
			if (rsltL.isEmpty()) {
				for (Srch01_DtlLossR r : lossL) {
					Srch01_DtlLossR lossR = r.clone();
					lossR.inpt_peg_no(inptPegNo);
					lossR.loss_qty(null);
					lossR.cont_loss_qty(null);
					addL.add(lossR);
				}
			}
			else {
				// lossL、rsltL共に同一投入紐付けＮＯ単位のリストのため、ロス理由ＣＤで一意となる。
				// 同一投入紐付けＮＯに対するロス実績の件数は多くないため、IndexKeyは設定しない。
				for (Srch01_DtlLossR r : lossL) {
					LotProp_Sprt01_Dtl4R rsltR = rsltL.getFirst(LotProp_Sprt01_Dtl4R.$loss_rsn_cd, r.loss_rsn_cd());
					// 同一ロス理由のロット提案結果が存在しない場合、lossLをクローンし、数量をクリアして下り電文に追加する。
					if (isNull(rsltR)) {
						Srch01_DtlLossR lossR = r.clone();
						lossR.inpt_peg_no(inptPegNo);
						lossR.loss_qty(null);
						lossR.cont_loss_qty(null);
						addL.add(lossR);
					}
					else {
						// 同一ロス理由のロット提案結果が存在する場合、ロット提案結果をlossLに反映する。
						// ロット提案結果が追加行の場合はクローンで取得する。
						Srch01_DtlLossR lossR = Srch01_DtlLossR.create();
						if (rsltR.add_flg()) {
							lossR = lossL.getFirst(Srch01_DtlLossR.$loss_rsn_cd, rsltR.loss_rsn_cd()).clone();
							lossR.inpt_peg_no(inptPegNo);
						}
						else {
							lossR = lossL.getFirst(Srch01_DtlLossR.$loss_rsn_cd, rsltR.loss_rsn_cd());
						}
						lossR.loss_qty(rsltR.loss_qty());
						lossR.cont_loss_qty(rsltR.cont_loss_qty());
						addL.add(lossR);
					}
				}
				
			}
			return addL;
		}
		
		/**
		 * 上り電文（投入実績）の内容をロット提案サービス（ロット提案）に設定
		 * @return
		 */
		protected Map_LotProp_Sprt01_Dtl1R_Srch01_DtlInptR<LotProp_Sprt01_Dtl1R,Srch01_DtlInptR> createMap_LotProp_Sprt01_Dtl1R_Srch01_DtlInptR() {
			return new Map_LotProp_Sprt01_Dtl1R_Srch01_DtlInptR<LotProp_Sprt01_Dtl1R, Srch01_DtlInptR>();
		}

		public class Map_LotProp_Sprt01_Dtl1R_Srch01_DtlInptR<D extends LotProp_Sprt01_Dtl1R, S extends Srch01_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$oper_peg_no, Srch01_DtlInptR.$oper_peg_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$peg_no, Srch01_DtlInptR.$peg_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$oper_inst_no, Srch01_DtlInptR.$oper_inst_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_schd_no, Srch01_DtlInptR.$inpt_schd_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_act_no, Srch01_DtlInptR.$inpt_act_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_dt, Srch01_DtlInptR.$act_dt);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_cd, Srch01_DtlInptR.$itm_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_sub1, Srch01_DtlInptR.$itm_sub1);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_sub2, Srch01_DtlInptR.$itm_sub2);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_sub3, Srch01_DtlInptR.$itm_sub3);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$ver_no, Srch01_DtlInptR.$ver_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_grp_cd, Srch01_DtlInptR.$alt_grp_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_grp_seq, Srch01_DtlInptR.$alt_grp_seq);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_itm_fix_flg, Srch01_DtlInptR.$alt_itm_fix_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_qty, Srch01_DtlInptR.$base_unit_alt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_itm_typ, Srch01_DtlInptR.$alt_itm_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_alloc_prio, Srch01_DtlInptR.$alt_alloc_prio);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_loc_cd, Srch01_DtlInptR.$inpt_loc_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_str_ln_cd, Srch01_DtlInptR.$inpt_str_ln_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$gd_cd, Srch01_DtlInptR.$gd_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$gd_nm, Srch01_DtlInptR.$gd_nm);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$lot_no, Srch01_DtlInptR.$lot_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sublot_no, Srch01_DtlInptR.$sublot_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$rqst_sno1, Srch01_DtlInptR.$sno1);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$rqst_sno2, Srch01_DtlInptR.$sno2);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$rqst_sno3, Srch01_DtlInptR.$sno3);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$rqst_sno4, Srch01_DtlInptR.$sno4);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno1_null_flg, Srch01_DtlInptR.$sno1_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno2_null_flg, Srch01_DtlInptR.$sno2_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno3_null_flg, Srch01_DtlInptR.$sno3_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno4_null_flg, Srch01_DtlInptR.$sno4_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_qty, Srch01_DtlInptR.$base_unit_inpt_qty);
				// 実績のためrqmt_qty,fxd_rqmt_qtyは設定不要
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$loss_qty, Srch01_DtlInptR.$base_unit_loss_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$fxd_loss_qty, Srch01_DtlInptR.$base_unit_fxd_loss_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$base_unit_cd, Srch01_DtlInptR.$base_unit_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$base_unit_dec_place, Srch01_DtlInptR.$base_unit_dec_place);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$base_unit_rnd_typ, Srch01_DtlInptR.$base_unit_conv_rnd_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_inpt_qty, Srch01_DtlInptR.$cont_inpt_qty);
				// 実績のためcont_rqmt_qty,cont_fxd_rqmt_qtyは設定不要
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_loss_qty, Srch01_DtlInptR.$cont_loss_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fxd_loss_qty, Srch01_DtlInptR.$cont_fxd_loss_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fctr_unit_cd, Srch01_DtlInptR.$cont_fctr_unit_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fctr_flg, Srch01_DtlInptR.$cont_fctr_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fctr_rnd_typ, Srch01_DtlInptR.$cont_fctr_rnd_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fctr_dec_place, Srch01_DtlInptR.$cont_fctr_dec_place);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$std_cont_fctr, Srch01_DtlInptR.$std_cont_fctr);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$stk_bp_cd, Srch01_DtlInptR.$stk_bp_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$stk_bp_nm, Srch01_DtlInptR.$stk_bp_nm);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$stk_arrv_bp_cd, Srch01_DtlInptR.$stk_arrv_bp_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$stk_arrv_bp_nm, Srch01_DtlInptR.$stk_arrv_bp_nm);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$lot_mix_flg, Srch01_DtlInptR.$lot_mix_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sublot_mix_flg, Srch01_DtlInptR.$sublot_mix_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alloc_ctl_typ, Srch01_DtlInptR.$alloc_ctl_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.hdr_peg_no(MCNumber.ONE); //製造指図は１件のため、１固定
				dest.not_lot_fix_flg(false); //実績のためロット指定あり
				// 基準単位数量は投入数量＋ロス数量＋固定ロス数量
				dest.base_unit_qty(sum(src.base_unit_inpt_qty(), src.base_unit_loss_qty(), src.base_unit_fxd_loss_qty()));
				if (src.cont_fctr_flg()) {
					// 有効成分対象の場合、有効成分は投入数量＋ロス数量＋固定ロス数量
					dest.cont_qty(sum(src.cont_inpt_qty(), src.cont_loss_qty(), src.cont_fxd_loss_qty()));
				}
			}
		}
	
		/**
		 * 上り電文（ロス実績）の内容をロット提案サービス（ロット提案）に設定
		 * @return
		 */
		protected Map_LotProp_Sprt01_Dtl4R_Srch01_DtlLossR<LotProp_Sprt01_Dtl4R,Srch01_DtlLossR> createMap_LotProp_Sprt01_Dtl4R_Srch01_DtlLossR() {
			return new Map_LotProp_Sprt01_Dtl4R_Srch01_DtlLossR<LotProp_Sprt01_Dtl4R, Srch01_DtlLossR>();
		}

		public class Map_LotProp_Sprt01_Dtl4R_Srch01_DtlLossR<D extends LotProp_Sprt01_Dtl4R, S extends Srch01_DtlLossR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(LotProp_Sprt01_Dtl4R.$inpt_peg_no, Srch01_DtlLossR.$inpt_peg_no);
				addColumnPathMap(LotProp_Sprt01_Dtl4R.$fxd_loss_flg, Srch01_DtlLossR.$fxd_loss_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl4R.$loss_rsn_cd, Srch01_DtlLossR.$loss_rsn_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl4R.$loss_qty, Srch01_DtlLossR.$loss_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl4R.$cont_loss_qty, Srch01_DtlLossR.$cont_loss_qty);
			}
		}

	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 製造記録書を発行する。<br>
	 */
	public class Prnt01 extends MSBCL_MfgActReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {

			editUp();

			// 製造帳票発行サービスの製造記録書発行
			callMfgRptServicePrnt02();

			// 下り電文設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Prnt01_DtlR.$peg_no, up0());
		}
		
		/**
		 * 製造記録書を発行する。
		 */
		protected void callMfgRptServicePrnt02() {
			MSBCL_MfgRptService.MfgRpt_Prnt02 prnt = MSBCL_MfgRptService.crtMfgRpt_Prnt02();

			MfgRpt_Prnt02_DtlR prnt02UpR = MfgRpt_Prnt02_DtlR.create();
			copy(prnt02UpR, up0(), createMap_MfgRpt_Prnt02_DtlR_Prnt01_DtlR());
			prnt.up0().add(prnt02UpR);
			
			prnt.exec();

			for(MfgRpt_Prnt02_DtlR r : prnt.down0()) {
				up0().act_prnt_flg(r.act_prnt_flg());
				up0().act_prnt_tm(r.act_prnt_tm());
				up0().err_flg(r.err_flg());
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
		
		protected Map_MfgRpt_Prnt02_DtlR_Prnt01_DtlR<MfgRpt_Prnt02_DtlR,Prnt01_DtlR> createMap_MfgRpt_Prnt02_DtlR_Prnt01_DtlR() {
			return new Map_MfgRpt_Prnt02_DtlR_Prnt01_DtlR<MfgRpt_Prnt02_DtlR, Prnt01_DtlR>();
		}

		public class Map_MfgRpt_Prnt02_DtlR_Prnt01_DtlR<D extends MfgRpt_Prnt02_DtlR, S extends Prnt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgRpt_Prnt02_DtlR.$peg_no, Prnt01_DtlR.$peg_no);
				addColumnPathMap(MfgRpt_Prnt02_DtlR.$mfg_act_no, Prnt01_DtlR.$mfg_act_no);
				addColumnPathMap(MfgRpt_Prnt02_DtlR.$mfg_inst_no, Prnt01_DtlR.$mfg_inst_no);
				addColumnPathMap(MfgRpt_Prnt02_DtlR.$div_seq, Prnt01_DtlR.$div_seq);
			}
		}
	}

	/**
	 * Sprt02オペレーション.<p>
	 *
	 * 製造品のロットＮＯ、サブロットＮＯを発番する<br>
	 */
	public class Sprt02 extends MSBCL_MfgActReg_MC_A.Sprt02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callLotIssueSrv();
			setDown();
		}
		
		protected void editUp() {
			int cnt = 0;
			for (MfgInstActCom_Sprt01_HdrR yieldR : up1()) {
				yieldR.peg_no(cnt++);
				yieldR.hdr_peg_no(MCNumber.ONE);
				yieldR.lot_issue_flg(up0().lot_issue_flg());
				yieldR.sublot_issue_flg(up0().sublot_issue_flg());
				yieldR.itm_cd(up0().itm_cd());
				yieldR.itm_sub1(up0().itm_sub1());
				yieldR.itm_sub2(up0().itm_sub2());
				yieldR.itm_sub3(up0().itm_sub3());
				yieldR.sno1(up0().sno1());
				yieldR.sno2(up0().sno2());
				yieldR.sno3(up0().sno3());
				yieldR.sno4(up0().sno4());
				yieldR.sppl_cd(up0().sppl_cd());
				yieldR.mfg_loc_cd(up0().mfg_loc_cd());
				yieldR.mfg_loc_wg_cd(up0().mfg_loc_wg_cd());
				yieldR.mfg_loc_site_cd(up0().mfg_loc_site_cd());
				yieldR.yield_dt_label_nm(getLabel(yieldR, MfgInstActCom_Sprt01_HdrR.$yield_dt));
			}
			
			for (MfgInstActCom_Sprt01_DtlR inptR : up2()) {
				inptR.hdr_peg_no(MCNumber.ONE);
			}
		}
		
		protected void callLotIssueSrv() {
			MSBCL_MfgInstActComService.MfgInstActCom_Sprt01 o = MSBCL_MfgInstActComService.crtMfgInstActCom_Sprt01();
			o.up0().addAll(up1());
			o.up1().addAll(up2());
			o.exec();
			copyByPegNo(up1(), new String[] {
					MfgInstActCom_Sprt01_HdrR.$lot_no, MfgInstActCom_Sprt01_HdrR.$sublot_no,
			}, o.down0(), new String[] {
					MfgInstActCom_Sprt01_HdrR.$lot_no, MfgInstActCom_Sprt01_HdrR.$sublot_no,
			});
		}
		
		protected void setDown() {
			down0().addAll(up1());
		}
		
	}
	
	/**
	 * Sprt03オペレーション.<p>
	 *
	 * 副産品のロットＮＯ、サブロットＮＯを発番する<br>
	 */
	public class Sprt03 extends MSBCL_MfgActReg_MC_A.Sprt03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callLotIssueSrv();
			setDown();
		}
		
		protected void editUp() {
			int cnt = 0;
			for (MfgInstActCom_Sprt01_HdrR byProdR : up1()) {
				byProdR.peg_no(cnt++);
				byProdR.hdr_peg_no(MCNumber.ONE);
				byProdR.lot_issue_flg(up0().lot_issue_flg());
				byProdR.sublot_issue_flg(up0().sublot_issue_flg());
				byProdR.sppl_cd(up0().sppl_cd());
				byProdR.mfg_loc_cd(up0().mfg_loc_cd());
				byProdR.mfg_loc_wg_cd(up0().mfg_loc_wg_cd());
				byProdR.mfg_loc_site_cd(up0().mfg_loc_site_cd());
				byProdR.yield_dt_label_nm(getLabel(byProdR, MfgInstActCom_Sprt01_HdrR.$yield_dt));
			}
			
			for (MfgInstActCom_Sprt01_DtlR inptR : up2()) {
				inptR.hdr_peg_no(MCNumber.ONE);
			}
		}
		
		protected void callLotIssueSrv() {
			MSBCL_MfgInstActComService.MfgInstActCom_Sprt01 o = MSBCL_MfgInstActComService.crtMfgInstActCom_Sprt01();
			o.up0().addAll(up1());
			o.up1().addAll(up2());
			o.exec();
			copyByPegNo(up1(), new String[] {
					MfgInstActCom_Sprt01_HdrR.$lot_no, MfgInstActCom_Sprt01_HdrR.$sublot_no,
			}, o.down0(), new String[] {
					MfgInstActCom_Sprt01_HdrR.$lot_no, MfgInstActCom_Sprt01_HdrR.$sublot_no,
			});
		}
		
		protected void setDown() {
			down0().addAll(up1());
		}
		
	}

	//FMCB CUSTOM END
}